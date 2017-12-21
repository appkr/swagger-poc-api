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


package kr.appkr.swagger_poc_api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import kr.appkr.swagger_poc_api.model.PaginatorLink;

/**
 * Paginator
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-21T18:16:07.108+09:00")
public class Paginator {
  @SerializedName("total")
  private Integer total = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("per_page")
  private Integer perPage = null;

  @SerializedName("current_page")
  private Integer currentPage = null;

  @SerializedName("total_pages")
  private Integer totalPages = null;

  @SerializedName("links")
  private PaginatorLink links = null;

  public Paginator total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * 총 리소스 개수
   * @return total
  **/
  @ApiModelProperty(example = "1000", required = true, value = "총 리소스 개수")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public Paginator count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * 현재 페이지에 표시된 리소스 개수
   * @return count
  **/
  @ApiModelProperty(example = "10", required = true, value = "현재 페이지에 표시된 리소스 개수")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Paginator perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

   /**
   * 페이지당 리소스 표시 개수
   * @return perPage
  **/
  @ApiModelProperty(example = "10", required = true, value = "페이지당 리소스 표시 개수")
  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  public Paginator currentPage(Integer currentPage) {
    this.currentPage = currentPage;
    return this;
  }

   /**
   * 현재 페이지 번호
   * @return currentPage
  **/
  @ApiModelProperty(example = "2", required = true, value = "현재 페이지 번호")
  public Integer getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public Paginator totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * 총 페이지 수
   * @return totalPages
  **/
  @ApiModelProperty(example = "100", required = true, value = "총 페이지 수")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public Paginator links(PaginatorLink links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(required = true, value = "")
  public PaginatorLink getLinks() {
    return links;
  }

  public void setLinks(PaginatorLink links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paginator paginator = (Paginator) o;
    return Objects.equals(this.total, paginator.total) &&
        Objects.equals(this.count, paginator.count) &&
        Objects.equals(this.perPage, paginator.perPage) &&
        Objects.equals(this.currentPage, paginator.currentPage) &&
        Objects.equals(this.totalPages, paginator.totalPages) &&
        Objects.equals(this.links, paginator.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, count, perPage, currentPage, totalPages, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paginator {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

