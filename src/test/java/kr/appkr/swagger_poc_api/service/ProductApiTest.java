/*
 * DB-LOCK-POC
 * 라라벨에 스웨거 적용 테스트를 위한 프로젝트
 *
 * OpenAPI spec version: 1
 * Contact: juwonkim@me.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package kr.appkr.swagger_poc_api.service;

import kr.appkr.swagger_poc_api.ApiException;
import kr.appkr.swagger_poc_api.model.ErrorDto;
import kr.appkr.swagger_poc_api.model.NewProductRequest;
import kr.appkr.swagger_poc_api.model.ProductDto;
import kr.appkr.swagger_poc_api.model.ProductListResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductApi
 */
@Ignore
public class ProductApiTest {

    private final ProductApi api = new ProductApi();

    
    /**
     * 새 상품을 등록합니다.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProductTest() throws ApiException {
        String authorization = null;
        NewProductRequest body = null;
        ProductDto response = api.createProduct(authorization, body);

        // TODO: test validations
    }
    
    /**
     * 상품을 삭제합니다.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProductTest() throws ApiException {
        String authorization = null;
        Long productId = null;
        api.deleteProduct(authorization, productId);

        // TODO: test validations
    }
    
    /**
     * 상품 목록을 조회합니다.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProductsTest() throws ApiException {
        String authorization = null;
        String q = null;
        Long priceFrom = null;
        Long priceTo = null;
        String sortKey = null;
        String sortDirection = null;
        Integer page = null;
        Integer size = null;
        ProductListResponse response = api.listProducts(authorization, q, priceFrom, priceTo, sortKey, sortDirection, page, size);

        // TODO: test validations
    }
    
    /**
     * 상품을 수정합니다.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProductTest() throws ApiException {
        String authorization = null;
        Long productId = null;
        NewProductRequest body = null;
        ProductDto response = api.updateProduct(authorization, productId, body);

        // TODO: test validations
    }
    
}
