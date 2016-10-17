/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to add a method to an existing <a>Resource</a> resource.
 * </p>
 */
public class PutMethodRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a>RestApi</a> identifier for the new <a>Method</a> resource.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The <a>Resource</a> identifier for the new <a>Method</a> resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Specifies the method request's HTTP method type.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * Specifies the type of authorization used for the method.
     * </p>
     */
    private String authorizationType;
    /**
     * <p>
     * Specifies the identifier of an <a>Authorizer</a> to use on this Method, if the type is CUSTOM.
     * </p>
     */
    private String authorizerId;
    /**
     * <p>
     * Specifies whether the method required a valid <a>ApiKey</a>.
     * </p>
     */
    private Boolean apiKeyRequired;
    /**
     * <p>
     * A key-value map defining required or optional method request parameters that can be accepted by Amazon API
     * Gateway. A key defines a method request parameter name matching the pattern of
     * <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     * <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The value
     * associated with the key is a Boolean flag indicating whether the parameter is required (<code>true</code>) or
     * optional (<code>false</code>). The method request parameter names defined here are available in
     * <a>Integration</a> to be mapped to integration request parameters or body-mapping templates.
     * </p>
     */
    private java.util.Map<String, Boolean> requestParameters;
    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the request's content type. Request models are represented as a
     * key/value map, with a content type as the key and a <a>Model</a> name as the value.
     * </p>
     */
    private java.util.Map<String, String> requestModels;

    /**
     * <p>
     * The <a>RestApi</a> identifier for the new <a>Method</a> resource.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier for the new <a>Method</a> resource.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier for the new <a>Method</a> resource.
     * </p>
     * 
     * @return The <a>RestApi</a> identifier for the new <a>Method</a> resource.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier for the new <a>Method</a> resource.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier for the new <a>Method</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The <a>Resource</a> identifier for the new <a>Method</a> resource.
     * </p>
     * 
     * @param resourceId
     *        The <a>Resource</a> identifier for the new <a>Method</a> resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The <a>Resource</a> identifier for the new <a>Method</a> resource.
     * </p>
     * 
     * @return The <a>Resource</a> identifier for the new <a>Method</a> resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The <a>Resource</a> identifier for the new <a>Method</a> resource.
     * </p>
     * 
     * @param resourceId
     *        The <a>Resource</a> identifier for the new <a>Method</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Specifies the method request's HTTP method type.
     * </p>
     * 
     * @param httpMethod
     *        Specifies the method request's HTTP method type.
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * Specifies the method request's HTTP method type.
     * </p>
     * 
     * @return Specifies the method request's HTTP method type.
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * Specifies the method request's HTTP method type.
     * </p>
     * 
     * @param httpMethod
     *        Specifies the method request's HTTP method type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * Specifies the type of authorization used for the method.
     * </p>
     * 
     * @param authorizationType
     *        Specifies the type of authorization used for the method.
     */

    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    /**
     * <p>
     * Specifies the type of authorization used for the method.
     * </p>
     * 
     * @return Specifies the type of authorization used for the method.
     */

    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * <p>
     * Specifies the type of authorization used for the method.
     * </p>
     * 
     * @param authorizationType
     *        Specifies the type of authorization used for the method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withAuthorizationType(String authorizationType) {
        setAuthorizationType(authorizationType);
        return this;
    }

    /**
     * <p>
     * Specifies the identifier of an <a>Authorizer</a> to use on this Method, if the type is CUSTOM.
     * </p>
     * 
     * @param authorizerId
     *        Specifies the identifier of an <a>Authorizer</a> to use on this Method, if the type is CUSTOM.
     */

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    /**
     * <p>
     * Specifies the identifier of an <a>Authorizer</a> to use on this Method, if the type is CUSTOM.
     * </p>
     * 
     * @return Specifies the identifier of an <a>Authorizer</a> to use on this Method, if the type is CUSTOM.
     */

    public String getAuthorizerId() {
        return this.authorizerId;
    }

    /**
     * <p>
     * Specifies the identifier of an <a>Authorizer</a> to use on this Method, if the type is CUSTOM.
     * </p>
     * 
     * @param authorizerId
     *        Specifies the identifier of an <a>Authorizer</a> to use on this Method, if the type is CUSTOM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withAuthorizerId(String authorizerId) {
        setAuthorizerId(authorizerId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the method required a valid <a>ApiKey</a>.
     * </p>
     * 
     * @param apiKeyRequired
     *        Specifies whether the method required a valid <a>ApiKey</a>.
     */

    public void setApiKeyRequired(Boolean apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
    }

    /**
     * <p>
     * Specifies whether the method required a valid <a>ApiKey</a>.
     * </p>
     * 
     * @return Specifies whether the method required a valid <a>ApiKey</a>.
     */

    public Boolean getApiKeyRequired() {
        return this.apiKeyRequired;
    }

    /**
     * <p>
     * Specifies whether the method required a valid <a>ApiKey</a>.
     * </p>
     * 
     * @param apiKeyRequired
     *        Specifies whether the method required a valid <a>ApiKey</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withApiKeyRequired(Boolean apiKeyRequired) {
        setApiKeyRequired(apiKeyRequired);
        return this;
    }

    /**
     * <p>
     * Specifies whether the method required a valid <a>ApiKey</a>.
     * </p>
     * 
     * @return Specifies whether the method required a valid <a>ApiKey</a>.
     */

    public Boolean isApiKeyRequired() {
        return this.apiKeyRequired;
    }

    /**
     * <p>
     * A key-value map defining required or optional method request parameters that can be accepted by Amazon API
     * Gateway. A key defines a method request parameter name matching the pattern of
     * <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     * <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The value
     * associated with the key is a Boolean flag indicating whether the parameter is required (<code>true</code>) or
     * optional (<code>false</code>). The method request parameter names defined here are available in
     * <a>Integration</a> to be mapped to integration request parameters or body-mapping templates.
     * </p>
     * 
     * @return A key-value map defining required or optional method request parameters that can be accepted by Amazon
     *         API Gateway. A key defines a method request parameter name matching the pattern of
     *         <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     *         <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The
     *         value associated with the key is a Boolean flag indicating whether the parameter is required (
     *         <code>true</code>) or optional (<code>false</code>). The method request parameter names defined here are
     *         available in <a>Integration</a> to be mapped to integration request parameters or body-mapping templates.
     */

    public java.util.Map<String, Boolean> getRequestParameters() {
        return requestParameters;
    }

    /**
     * <p>
     * A key-value map defining required or optional method request parameters that can be accepted by Amazon API
     * Gateway. A key defines a method request parameter name matching the pattern of
     * <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     * <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The value
     * associated with the key is a Boolean flag indicating whether the parameter is required (<code>true</code>) or
     * optional (<code>false</code>). The method request parameter names defined here are available in
     * <a>Integration</a> to be mapped to integration request parameters or body-mapping templates.
     * </p>
     * 
     * @param requestParameters
     *        A key-value map defining required or optional method request parameters that can be accepted by Amazon API
     *        Gateway. A key defines a method request parameter name matching the pattern of
     *        <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     *        <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The
     *        value associated with the key is a Boolean flag indicating whether the parameter is required (
     *        <code>true</code>) or optional (<code>false</code>). The method request parameter names defined here are
     *        available in <a>Integration</a> to be mapped to integration request parameters or body-mapping templates.
     */

    public void setRequestParameters(java.util.Map<String, Boolean> requestParameters) {
        this.requestParameters = requestParameters;
    }

    /**
     * <p>
     * A key-value map defining required or optional method request parameters that can be accepted by Amazon API
     * Gateway. A key defines a method request parameter name matching the pattern of
     * <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     * <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The value
     * associated with the key is a Boolean flag indicating whether the parameter is required (<code>true</code>) or
     * optional (<code>false</code>). The method request parameter names defined here are available in
     * <a>Integration</a> to be mapped to integration request parameters or body-mapping templates.
     * </p>
     * 
     * @param requestParameters
     *        A key-value map defining required or optional method request parameters that can be accepted by Amazon API
     *        Gateway. A key defines a method request parameter name matching the pattern of
     *        <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     *        <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The
     *        value associated with the key is a Boolean flag indicating whether the parameter is required (
     *        <code>true</code>) or optional (<code>false</code>). The method request parameter names defined here are
     *        available in <a>Integration</a> to be mapped to integration request parameters or body-mapping templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withRequestParameters(java.util.Map<String, Boolean> requestParameters) {
        setRequestParameters(requestParameters);
        return this;
    }

    public PutMethodRequest addRequestParametersEntry(String key, Boolean value) {
        if (null == this.requestParameters) {
            this.requestParameters = new java.util.HashMap<String, Boolean>();
        }
        if (this.requestParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest clearRequestParametersEntries() {
        this.requestParameters = null;
        return this;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the request's content type. Request models are represented as a
     * key/value map, with a content type as the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @return Specifies the <a>Model</a> resources used for the request's content type. Request models are represented
     *         as a key/value map, with a content type as the key and a <a>Model</a> name as the value.
     */

    public java.util.Map<String, String> getRequestModels() {
        return requestModels;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the request's content type. Request models are represented as a
     * key/value map, with a content type as the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @param requestModels
     *        Specifies the <a>Model</a> resources used for the request's content type. Request models are represented
     *        as a key/value map, with a content type as the key and a <a>Model</a> name as the value.
     */

    public void setRequestModels(java.util.Map<String, String> requestModels) {
        this.requestModels = requestModels;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the request's content type. Request models are represented as a
     * key/value map, with a content type as the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @param requestModels
     *        Specifies the <a>Model</a> resources used for the request's content type. Request models are represented
     *        as a key/value map, with a content type as the key and a <a>Model</a> name as the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest withRequestModels(java.util.Map<String, String> requestModels) {
        setRequestModels(requestModels);
        return this;
    }

    public PutMethodRequest addRequestModelsEntry(String key, String value) {
        if (null == this.requestModels) {
            this.requestModels = new java.util.HashMap<String, String>();
        }
        if (this.requestModels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestModels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestModels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodRequest clearRequestModelsEntries() {
        this.requestModels = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: " + getHttpMethod() + ",");
        if (getAuthorizationType() != null)
            sb.append("AuthorizationType: " + getAuthorizationType() + ",");
        if (getAuthorizerId() != null)
            sb.append("AuthorizerId: " + getAuthorizerId() + ",");
        if (getApiKeyRequired() != null)
            sb.append("ApiKeyRequired: " + getApiKeyRequired() + ",");
        if (getRequestParameters() != null)
            sb.append("RequestParameters: " + getRequestParameters() + ",");
        if (getRequestModels() != null)
            sb.append("RequestModels: " + getRequestModels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMethodRequest == false)
            return false;
        PutMethodRequest other = (PutMethodRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getAuthorizationType() == null ^ this.getAuthorizationType() == null)
            return false;
        if (other.getAuthorizationType() != null && other.getAuthorizationType().equals(this.getAuthorizationType()) == false)
            return false;
        if (other.getAuthorizerId() == null ^ this.getAuthorizerId() == null)
            return false;
        if (other.getAuthorizerId() != null && other.getAuthorizerId().equals(this.getAuthorizerId()) == false)
            return false;
        if (other.getApiKeyRequired() == null ^ this.getApiKeyRequired() == null)
            return false;
        if (other.getApiKeyRequired() != null && other.getApiKeyRequired().equals(this.getApiKeyRequired()) == false)
            return false;
        if (other.getRequestParameters() == null ^ this.getRequestParameters() == null)
            return false;
        if (other.getRequestParameters() != null && other.getRequestParameters().equals(this.getRequestParameters()) == false)
            return false;
        if (other.getRequestModels() == null ^ this.getRequestModels() == null)
            return false;
        if (other.getRequestModels() != null && other.getRequestModels().equals(this.getRequestModels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationType() == null) ? 0 : getAuthorizationType().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerId() == null) ? 0 : getAuthorizerId().hashCode());
        hashCode = prime * hashCode + ((getApiKeyRequired() == null) ? 0 : getApiKeyRequired().hashCode());
        hashCode = prime * hashCode + ((getRequestParameters() == null) ? 0 : getRequestParameters().hashCode());
        hashCode = prime * hashCode + ((getRequestModels() == null) ? 0 : getRequestModels().hashCode());
        return hashCode;
    }

    @Override
    public PutMethodRequest clone() {
        return (PutMethodRequest) super.clone();
    }
}
