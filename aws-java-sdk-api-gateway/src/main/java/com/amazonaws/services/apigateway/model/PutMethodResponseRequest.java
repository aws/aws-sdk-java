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
 * Request to add a <a>MethodResponse</a> to an existing <a>Method</a> resource.
 * </p>
 */
public class PutMethodResponseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>Method</a> resource.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The <a>Resource</a> identifier for the <a>Method</a> resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The HTTP verb of the <a>Method</a> resource.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * The method response's status code.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * A key-value map specifying required or optional response parameters that Amazon API Gateway can send back to the
     * caller. A key defines a method response header name and the associated value is a Boolean flag indicating whether
     * the method response parameter is required or not. The method response header names must match the pattern of
     * <code>method.response.header.{name}</code>, where <code>name</code> is a valid and unique header name. The
     * response parameter names defined here are available in the integration response to be mapped from an integration
     * response header expressed in <code>integration.response.header.{name}</code>, a static value enclosed within a
     * pair of single quotes (e.g., <code>'application/json'</code>), or a JSON expression from the back-end response
     * payload in the form of <code>integration.response.body.{JSON-expression}</code>, where
     * <code>JSON-expression</code> is a valid JSON expression without the <code>$</code> prefix.)
     * </p>
     */
    private java.util.Map<String, Boolean> responseParameters;
    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's content type. Response models are represented as a
     * key/value map, with a content type as the key and a <a>Model</a> name as the value.
     * </p>
     */
    private java.util.Map<String, String> responseModels;

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>Method</a> resource.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier for the <a>Method</a> resource.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>Method</a> resource.
     * </p>
     * 
     * @return The <a>RestApi</a> identifier for the <a>Method</a> resource.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier for the <a>Method</a> resource.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier for the <a>Method</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodResponseRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The <a>Resource</a> identifier for the <a>Method</a> resource.
     * </p>
     * 
     * @param resourceId
     *        The <a>Resource</a> identifier for the <a>Method</a> resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The <a>Resource</a> identifier for the <a>Method</a> resource.
     * </p>
     * 
     * @return The <a>Resource</a> identifier for the <a>Method</a> resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The <a>Resource</a> identifier for the <a>Method</a> resource.
     * </p>
     * 
     * @param resourceId
     *        The <a>Resource</a> identifier for the <a>Method</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodResponseRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The HTTP verb of the <a>Method</a> resource.
     * </p>
     * 
     * @param httpMethod
     *        The HTTP verb of the <a>Method</a> resource.
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * The HTTP verb of the <a>Method</a> resource.
     * </p>
     * 
     * @return The HTTP verb of the <a>Method</a> resource.
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * The HTTP verb of the <a>Method</a> resource.
     * </p>
     * 
     * @param httpMethod
     *        The HTTP verb of the <a>Method</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodResponseRequest withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * The method response's status code.
     * </p>
     * 
     * @param statusCode
     *        The method response's status code.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The method response's status code.
     * </p>
     * 
     * @return The method response's status code.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The method response's status code.
     * </p>
     * 
     * @param statusCode
     *        The method response's status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodResponseRequest withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * A key-value map specifying required or optional response parameters that Amazon API Gateway can send back to the
     * caller. A key defines a method response header name and the associated value is a Boolean flag indicating whether
     * the method response parameter is required or not. The method response header names must match the pattern of
     * <code>method.response.header.{name}</code>, where <code>name</code> is a valid and unique header name. The
     * response parameter names defined here are available in the integration response to be mapped from an integration
     * response header expressed in <code>integration.response.header.{name}</code>, a static value enclosed within a
     * pair of single quotes (e.g., <code>'application/json'</code>), or a JSON expression from the back-end response
     * payload in the form of <code>integration.response.body.{JSON-expression}</code>, where
     * <code>JSON-expression</code> is a valid JSON expression without the <code>$</code> prefix.)
     * </p>
     * 
     * @return A key-value map specifying required or optional response parameters that Amazon API Gateway can send back
     *         to the caller. A key defines a method response header name and the associated value is a Boolean flag
     *         indicating whether the method response parameter is required or not. The method response header names
     *         must match the pattern of <code>method.response.header.{name}</code>, where <code>name</code> is a valid
     *         and unique header name. The response parameter names defined here are available in the integration
     *         response to be mapped from an integration response header expressed in
     *         <code>integration.response.header.{name}</code>, a static value enclosed within a pair of single quotes
     *         (e.g., <code>'application/json'</code>), or a JSON expression from the back-end response payload in the
     *         form of <code>integration.response.body.{JSON-expression}</code>, where <code>JSON-expression</code> is a
     *         valid JSON expression without the <code>$</code> prefix.)
     */

    public java.util.Map<String, Boolean> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying required or optional response parameters that Amazon API Gateway can send back to the
     * caller. A key defines a method response header name and the associated value is a Boolean flag indicating whether
     * the method response parameter is required or not. The method response header names must match the pattern of
     * <code>method.response.header.{name}</code>, where <code>name</code> is a valid and unique header name. The
     * response parameter names defined here are available in the integration response to be mapped from an integration
     * response header expressed in <code>integration.response.header.{name}</code>, a static value enclosed within a
     * pair of single quotes (e.g., <code>'application/json'</code>), or a JSON expression from the back-end response
     * payload in the form of <code>integration.response.body.{JSON-expression}</code>, where
     * <code>JSON-expression</code> is a valid JSON expression without the <code>$</code> prefix.)
     * </p>
     * 
     * @param responseParameters
     *        A key-value map specifying required or optional response parameters that Amazon API Gateway can send back
     *        to the caller. A key defines a method response header name and the associated value is a Boolean flag
     *        indicating whether the method response parameter is required or not. The method response header names must
     *        match the pattern of <code>method.response.header.{name}</code>, where <code>name</code> is a valid and
     *        unique header name. The response parameter names defined here are available in the integration response to
     *        be mapped from an integration response header expressed in <code>integration.response.header.{name}</code>
     *        , a static value enclosed within a pair of single quotes (e.g., <code>'application/json'</code>), or a
     *        JSON expression from the back-end response payload in the form of
     *        <code>integration.response.body.{JSON-expression}</code>, where <code>JSON-expression</code> is a valid
     *        JSON expression without the <code>$</code> prefix.)
     */

    public void setResponseParameters(java.util.Map<String, Boolean> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying required or optional response parameters that Amazon API Gateway can send back to the
     * caller. A key defines a method response header name and the associated value is a Boolean flag indicating whether
     * the method response parameter is required or not. The method response header names must match the pattern of
     * <code>method.response.header.{name}</code>, where <code>name</code> is a valid and unique header name. The
     * response parameter names defined here are available in the integration response to be mapped from an integration
     * response header expressed in <code>integration.response.header.{name}</code>, a static value enclosed within a
     * pair of single quotes (e.g., <code>'application/json'</code>), or a JSON expression from the back-end response
     * payload in the form of <code>integration.response.body.{JSON-expression}</code>, where
     * <code>JSON-expression</code> is a valid JSON expression without the <code>$</code> prefix.)
     * </p>
     * 
     * @param responseParameters
     *        A key-value map specifying required or optional response parameters that Amazon API Gateway can send back
     *        to the caller. A key defines a method response header name and the associated value is a Boolean flag
     *        indicating whether the method response parameter is required or not. The method response header names must
     *        match the pattern of <code>method.response.header.{name}</code>, where <code>name</code> is a valid and
     *        unique header name. The response parameter names defined here are available in the integration response to
     *        be mapped from an integration response header expressed in <code>integration.response.header.{name}</code>
     *        , a static value enclosed within a pair of single quotes (e.g., <code>'application/json'</code>), or a
     *        JSON expression from the back-end response payload in the form of
     *        <code>integration.response.body.{JSON-expression}</code>, where <code>JSON-expression</code> is a valid
     *        JSON expression without the <code>$</code> prefix.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodResponseRequest withResponseParameters(java.util.Map<String, Boolean> responseParameters) {
        setResponseParameters(responseParameters);
        return this;
    }

    public PutMethodResponseRequest addResponseParametersEntry(String key, Boolean value) {
        if (null == this.responseParameters) {
            this.responseParameters = new java.util.HashMap<String, Boolean>();
        }
        if (this.responseParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.responseParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodResponseRequest clearResponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's content type. Response models are represented as a
     * key/value map, with a content type as the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @return Specifies the <a>Model</a> resources used for the response's content type. Response models are
     *         represented as a key/value map, with a content type as the key and a <a>Model</a> name as the value.
     */

    public java.util.Map<String, String> getResponseModels() {
        return responseModels;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's content type. Response models are represented as a
     * key/value map, with a content type as the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @param responseModels
     *        Specifies the <a>Model</a> resources used for the response's content type. Response models are represented
     *        as a key/value map, with a content type as the key and a <a>Model</a> name as the value.
     */

    public void setResponseModels(java.util.Map<String, String> responseModels) {
        this.responseModels = responseModels;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's content type. Response models are represented as a
     * key/value map, with a content type as the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @param responseModels
     *        Specifies the <a>Model</a> resources used for the response's content type. Response models are represented
     *        as a key/value map, with a content type as the key and a <a>Model</a> name as the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodResponseRequest withResponseModels(java.util.Map<String, String> responseModels) {
        setResponseModels(responseModels);
        return this;
    }

    public PutMethodResponseRequest addResponseModelsEntry(String key, String value) {
        if (null == this.responseModels) {
            this.responseModels = new java.util.HashMap<String, String>();
        }
        if (this.responseModels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.responseModels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseModels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMethodResponseRequest clearResponseModelsEntries() {
        this.responseModels = null;
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
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode() + ",");
        if (getResponseParameters() != null)
            sb.append("ResponseParameters: " + getResponseParameters() + ",");
        if (getResponseModels() != null)
            sb.append("ResponseModels: " + getResponseModels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMethodResponseRequest == false)
            return false;
        PutMethodResponseRequest other = (PutMethodResponseRequest) obj;
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
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getResponseParameters() == null ^ this.getResponseParameters() == null)
            return false;
        if (other.getResponseParameters() != null && other.getResponseParameters().equals(this.getResponseParameters()) == false)
            return false;
        if (other.getResponseModels() == null ^ this.getResponseModels() == null)
            return false;
        if (other.getResponseModels() != null && other.getResponseModels().equals(this.getResponseModels()) == false)
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
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode + ((getResponseModels() == null) ? 0 : getResponseModels().hashCode());
        return hashCode;
    }

    @Override
    public PutMethodResponseRequest clone() {
        return (PutMethodResponseRequest) super.clone();
    }
}
