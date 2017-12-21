#-------------------------------------------------------------------------------
# Location of "swagger-codegen" executable.
#-------------------------------------------------------------------------------
EXECUTABLE=/usr/local/bin/swagger-codegen

#-------------------------------------------------------------------------------
# Location of Swagger API Spec
#-------------------------------------------------------------------------------
SPEC=http://localhost/docs/swagger.json

#-------------------------------------------------------------------------------
# All
#-------------------------------------------------------------------------------
all: php javascript java
clean: clean-php clean-javascript clean-java
php: clean-php gen-php dist-php
javascript: clean-javascript gen-javascript dist-javascript
java: clean-java gen-java dist-java

#-------------------------------------------------------------------------------
# PHP
#-------------------------------------------------------------------------------
clean-php:
	rm -rf dist-php

gen-php:
	$(EXECUTABLE) generate \
	--lang php \
	--config ./config-php.json \
	--input-spec $(SPEC) \
	--output ./dist-php

dist-php:
	git subtree push --prefix dist-php origin dist-php

#-------------------------------------------------------------------------------
# Javascript
#-------------------------------------------------------------------------------
clean-javascript:
	rm -rf dist-javascript

gen-javascript:
	$(EXECUTABLE) generate \
	--lang javascript \
	--input-spec $(SPEC) \
	--output ./dist-javascript

dist-javascript:
	git subtree push --prefix dist-javascript origin dist-javascript

#-------------------------------------------------------------------------------
# Java
#-------------------------------------------------------------------------------
clean-java:
	rm -rf dist-java

gen-java:
	$(EXECUTABLE) generate \
	--lang java \
	--config ./config-java.json \
	--input-spec $(SPEC) \
	--output ./dist-java

dist-java:
	git subtree push --prefix dist-java origin dist-java
