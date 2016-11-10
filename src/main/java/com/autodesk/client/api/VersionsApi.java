/*
 * Forge SDK
 * The Forge Platform contains an expanding collection of web service components that can be used with Autodesk cloud-based products or your own technologies. Take advantage of Autodesk’s expertise in design and engineering.
 *
 * OpenAPI spec version: 0.1.0
 * Contact: forge.help@autodesk.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.autodesk.client.api;

import com.sun.jersey.api.client.GenericType;

import com.autodesk.client.ApiException;
import com.autodesk.client.ApiClient;
import com.autodesk.client.Configuration;
import com.autodesk.client.model.*;
import com.autodesk.client.Pair;
import com.autodesk.client.auth.Credentials;
import com.autodesk.client.ApiResponse;

import java.io.File;

import com.autodesk.client.model.BadInput;
import com.autodesk.client.model.Version;
import com.autodesk.client.model.Forbidden;
import com.autodesk.client.model.NotFound;
import com.autodesk.client.model.Item;
import com.autodesk.client.model.JsonApiCollection;
import com.autodesk.client.model.Refs;
import com.autodesk.client.model.CreateRef;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VersionsApi {
  private ApiClient apiClient;

  public VersionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VersionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * Returns the version with the given &#x60;version_id&#x60;. 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param versionId the &#x60;version id&#x60; (required)
   * @return Version
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Version> getVersion(String projectId, String versionId,  Credentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getVersion");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling getVersion");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/versions/{version_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "version_id" + "\\}", apiClient.escapeString(versionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<Version> localVarReturnType = new GenericType<Version>() {};
    return apiClient.invokeAPI(credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Returns the item the given version is associated with. 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param versionId the &#x60;version id&#x60; (required)
   * @return Item
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Item> getVersionItem(String projectId, String versionId,  Credentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getVersionItem");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling getVersionItem");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/versions/{version_id}/item".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "version_id" + "\\}", apiClient.escapeString(versionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<Item> localVarReturnType = new GenericType<Item>() {};
    return apiClient.invokeAPI(credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Returns the resources (&#x60;items&#x60;, &#x60;folders&#x60;, and &#x60;versions&#x60;) which have a custom relationship with the given &#x60;version_id&#x60;. Custom relationships can be established between a version of an item and other resources within the &#39;data&#39; domain service (folders, items, and versions). 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param versionId the &#x60;version id&#x60; (required)
   * @param filterType filter by the &#x60;type&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterId filter by the &#x60;id&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterExtensionType filter by the extension type (optional)
   * @return JsonApiCollection
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonApiCollection> getVersionRefs(String projectId, String versionId, List<String> filterType, List<String> filterId, List<String> filterExtensionType,  Credentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getVersionRefs");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling getVersionRefs");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/versions/{version_id}/refs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "version_id" + "\\}", apiClient.escapeString(versionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[extension.type]", filterExtensionType));

    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<JsonApiCollection> localVarReturnType = new GenericType<JsonApiCollection>() {};
    return apiClient.invokeAPI(credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Returns the custom relationships that are associated to the given &#x60;version_id&#x60;. Custom relationships can be established between a version of an item and other resources within the &#39;data&#39; domain service (folders, items, and versions). 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param versionId the &#x60;version id&#x60; (required)
   * @param filterType filter by the &#x60;type&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterId filter by the &#x60;id&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterRefType filter by &#x60;refType&#x60; (optional)
   * @param filterDirection filter by the direction of the reference (optional)
   * @param filterExtensionType filter by the extension type (optional)
   * @return Refs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Refs> getVersionRelationshipsRefs(String projectId, String versionId, List<String> filterType, List<String> filterId, List<String> filterRefType, String filterDirection, List<String> filterExtensionType,  Credentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getVersionRelationshipsRefs");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling getVersionRelationshipsRefs");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/versions/{version_id}/relationships/refs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "version_id" + "\\}", apiClient.escapeString(versionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[refType]", filterRefType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[direction]", filterDirection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[extension.type]", filterExtensionType));

    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<Refs> localVarReturnType = new GenericType<Refs>() {};
    return apiClient.invokeAPI(credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Creates a custom relationship between a version and another resource within the &#39;data&#39; domain service (folder, item, or version). 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param versionId the &#x60;version id&#x60; (required)
   * @param body describe the ref to be created (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postVersionRelationshipsRef(String projectId, String versionId, CreateRef body,  Credentials credentials) throws ApiException {

    Object localVarPostBody = body;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling postVersionRelationshipsRef");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling postVersionRelationshipsRef");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postVersionRelationshipsRef");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/versions/{version_id}/relationships/refs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "version_id" + "\\}", apiClient.escapeString(versionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);


    return apiClient.invokeAPI(credentials, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, null);
  }
}
