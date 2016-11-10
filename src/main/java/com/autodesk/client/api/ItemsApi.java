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

import com.autodesk.client.model.Item;
import com.autodesk.client.model.BadInput;
import com.autodesk.client.model.Forbidden;
import com.autodesk.client.model.NotFound;
import com.autodesk.client.model.Folder;
import com.autodesk.client.model.JsonApiCollection;
import com.autodesk.client.model.Refs;
import com.autodesk.client.model.Version;
import com.autodesk.client.model.Versions;
import com.autodesk.client.model.CreateRef;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ItemsApi {
  private ApiClient apiClient;

  public ItemsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemsApi(ApiClient apiClient) {
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
   * Returns a resource item by ID for any item within a given project. Resource items represent word documents, fusion design files, drawings, spreadsheets, etc. 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param itemId the &#x60;item id&#x60; (required)
   * @return Item
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Item> getItem(String projectId, String itemId,  Credentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getItem");
    }
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling getItem");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/items/{item_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "item_id" + "\\}", apiClient.escapeString(itemId.toString()));

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
   * Returns the \&quot;parent\&quot; folder for the given item. 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param itemId the &#x60;item id&#x60; (required)
   * @return Folder
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Folder> getItemParentFolder(String projectId, String itemId,  Credentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getItemParentFolder");
    }
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling getItemParentFolder");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/items/{item_id}/parent".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "item_id" + "\\}", apiClient.escapeString(itemId.toString()));

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

    GenericType<Folder> localVarReturnType = new GenericType<Folder>() {};
    return apiClient.invokeAPI(credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Returns the resources (&#x60;items&#x60;, &#x60;folders&#x60;, and &#x60;versions&#x60;) which have a custom relationship with the given &#x60;item_id&#x60;. Custom relationships can be established between an item and other resources within the &#39;data&#39; domain service (folders, items, and versions). 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param itemId the &#x60;item id&#x60; (required)
   * @param filterType filter by the &#x60;type&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterId filter by the &#x60;id&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterExtensionType filter by the extension type (optional)
   * @return JsonApiCollection
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<JsonApiCollection> getItemRefs(String projectId, String itemId, List<String> filterType, List<String> filterId, List<String> filterExtensionType,  Credentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getItemRefs");
    }
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling getItemRefs");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/items/{item_id}/refs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "item_id" + "\\}", apiClient.escapeString(itemId.toString()));

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
   * Returns the custom relationships that are associated to the given &#x60;item_id&#x60;. Custom relationships can be established between an item and other resources within the &#39;data&#39; domain service (folders, items, and versions). 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param itemId the &#x60;item id&#x60; (required)
   * @param filterType filter by the &#x60;type&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterId filter by the &#x60;id&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterRefType filter by &#x60;refType&#x60; (optional)
   * @param filterDirection filter by the direction of the reference (optional)
   * @param filterExtensionType filter by the extension type (optional)
   * @return Refs
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Refs> getItemRelationshipsRefs(String projectId, String itemId, List<String> filterType, List<String> filterId, List<String> filterRefType, String filterDirection, List<String> filterExtensionType,  Credentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getItemRelationshipsRefs");
    }
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling getItemRelationshipsRefs");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/items/{item_id}/relationships/refs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "item_id" + "\\}", apiClient.escapeString(itemId.toString()));

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
   * Returns the \&quot;tip\&quot; version for the given item. Multiple versions of a resource item can be uploaded in a project. The tip version is the most recent one. 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param itemId the &#x60;item id&#x60; (required)
   * @return Version
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Version> getItemTip(String projectId, String itemId,  Credentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getItemTip");
    }
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling getItemTip");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/items/{item_id}/tip".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "item_id" + "\\}", apiClient.escapeString(itemId.toString()));

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
   * Returns versions for the given item. Multiple versions of a resource item can be uploaded in a project. 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param itemId the &#x60;item id&#x60; (required)
   * @param filterType filter by the &#x60;type&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterId filter by the &#x60;id&#x60; of the &#x60;ref&#x60; target (optional)
   * @param filterExtensionType filter by the extension type (optional)
   * @param filterVersionNumber filter by &#x60;versionNumber&#x60; (optional)
   * @param pageNumber specify the page number (optional)
   * @param pageLimit specify the maximal number of elements per page (optional)
   * @return Versions
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Versions> getItemVersions(String projectId, String itemId, List<String> filterType, List<String> filterId, List<String> filterExtensionType, List<Integer> filterVersionNumber, Integer pageNumber, Integer pageLimit,  Credentials credentials) throws ApiException {

    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling getItemVersions");
    }
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling getItemVersions");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/items/{item_id}/versions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "item_id" + "\\}", apiClient.escapeString(itemId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[type]", filterType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[extension.type]", filterExtensionType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[versionNumber]", filterVersionNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[limit]", pageLimit));

    
    
    final String[] localVarAccepts = {
      "application/vnd.api+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    GenericType<Versions> localVarReturnType = new GenericType<Versions>() {};
    return apiClient.invokeAPI(credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
      }
  /**
   * 
   * Creates a custom relationship between an item and another resource within the &#39;data&#39; domain service (folder, item, or version). 
   * @param projectId the &#x60;project id&#x60; (required)
   * @param itemId the &#x60;item id&#x60; (required)
   * @param body describe the ref to be created (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> postItemRelationshipsRef(String projectId, String itemId, CreateRef body,  Credentials credentials) throws ApiException {

    Object localVarPostBody = body;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling postItemRelationshipsRef");
    }
    
    // verify the required parameter 'itemId' is set
    if (itemId == null) {
      throw new ApiException(400, "Missing the required parameter 'itemId' when calling postItemRelationshipsRef");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling postItemRelationshipsRef");
    }
    
    // create path and map variables
    String localVarPath = "/data/v1/projects/{project_id}/items/{item_id}/relationships/refs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()))
      .replaceAll("\\{" + "item_id" + "\\}", apiClient.escapeString(itemId.toString()));

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
