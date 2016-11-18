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
 * Represents a put integration response request.
 * </p>
 */
public class PutIntegrationResponseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a put integration response request's API identifier.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * Specifies a put integration response request's resource identifier.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Specifies a put integration response request's HTTP method.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * Specifies the status code that is used to map the integration response to an existing <a>MethodResponse</a>.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * Specifies the selection pattern of a put integration response.
     * </p>
     */
    private String selectionPattern;
    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the method response from the back end. The key
     * is a method response header parameter name and the mapped value is an integration response header value, a static
     * value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The
     * mapping key must match the pattern of <code>method.response.header.{name}</code>, where <code>name</code> is a
     * valid and unique header name. The mapped non-static value must match the pattern of
     * <code>integration.response.header.{name}</code> or <code>integration.response.body.{JSON-expression}</code>,
     * where <code>name</code> must be a valid and unique response header name and <code>JSON-expression</code> a valid
     * JSON expression without the <code>$</code> prefix.
     * </p>
     */
    private java.util.Map<String, String> responseParameters;
    /**
     * <p>
     * Specifies a put integration response's templates.
     * </p>
     */
    private java.util.Map<String, String> responseTemplates;
    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * method response without modification.
     * </p>
     */
    private String contentHandling;

    /**
     * <p>
     * Specifies a put integration response request's API identifier.
     * </p>
     * 
     * @param restApiId
     *        Specifies a put integration response request's API identifier.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * Specifies a put integration response request's API identifier.
     * </p>
     * 
     * @return Specifies a put integration response request's API identifier.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * Specifies a put integration response request's API identifier.
     * </p>
     * 
     * @param restApiId
     *        Specifies a put integration response request's API identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResponseRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * Specifies a put integration response request's resource identifier.
     * </p>
     * 
     * @param resourceId
     *        Specifies a put integration response request's resource identifier.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Specifies a put integration response request's resource identifier.
     * </p>
     * 
     * @return Specifies a put integration response request's resource identifier.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Specifies a put integration response request's resource identifier.
     * </p>
     * 
     * @param resourceId
     *        Specifies a put integration response request's resource identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResponseRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Specifies a put integration response request's HTTP method.
     * </p>
     * 
     * @param httpMethod
     *        Specifies a put integration response request's HTTP method.
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * Specifies a put integration response request's HTTP method.
     * </p>
     * 
     * @return Specifies a put integration response request's HTTP method.
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * Specifies a put integration response request's HTTP method.
     * </p>
     * 
     * @param httpMethod
     *        Specifies a put integration response request's HTTP method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResponseRequest withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * Specifies the status code that is used to map the integration response to an existing <a>MethodResponse</a>.
     * </p>
     * 
     * @param statusCode
     *        Specifies the status code that is used to map the integration response to an existing
     *        <a>MethodResponse</a>.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * Specifies the status code that is used to map the integration response to an existing <a>MethodResponse</a>.
     * </p>
     * 
     * @return Specifies the status code that is used to map the integration response to an existing
     *         <a>MethodResponse</a>.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * Specifies the status code that is used to map the integration response to an existing <a>MethodResponse</a>.
     * </p>
     * 
     * @param statusCode
     *        Specifies the status code that is used to map the integration response to an existing
     *        <a>MethodResponse</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResponseRequest withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * Specifies the selection pattern of a put integration response.
     * </p>
     * 
     * @param selectionPattern
     *        Specifies the selection pattern of a put integration response.
     */

    public void setSelectionPattern(String selectionPattern) {
        this.selectionPattern = selectionPattern;
    }

    /**
     * <p>
     * Specifies the selection pattern of a put integration response.
     * </p>
     * 
     * @return Specifies the selection pattern of a put integration response.
     */

    public String getSelectionPattern() {
        return this.selectionPattern;
    }

    /**
     * <p>
     * Specifies the selection pattern of a put integration response.
     * </p>
     * 
     * @param selectionPattern
     *        Specifies the selection pattern of a put integration response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResponseRequest withSelectionPattern(String selectionPattern) {
        setSelectionPattern(selectionPattern);
        return this;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the method response from the back end. The key
     * is a method response header parameter name and the mapped value is an integration response header value, a static
     * value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The
     * mapping key must match the pattern of <code>method.response.header.{name}</code>, where <code>name</code> is a
     * valid and unique header name. The mapped non-static value must match the pattern of
     * <code>integration.response.header.{name}</code> or <code>integration.response.body.{JSON-expression}</code>,
     * where <code>name</code> must be a valid and unique response header name and <code>JSON-expression</code> a valid
     * JSON expression without the <code>$</code> prefix.
     * </p>
     * 
     * @return A key-value map specifying response parameters that are passed to the method response from the back end.
     *         The key is a method response header parameter name and the mapped value is an integration response header
     *         value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration
     *         response body. The mapping key must match the pattern of <code>method.response.header.{name}</code>,
     *         where <code>name</code> is a valid and unique header name. The mapped non-static value must match the
     *         pattern of <code>integration.response.header.{name}</code> or
     *         <code>integration.response.body.{JSON-expression}</code>, where <code>name</code> must be a valid and
     *         unique response header name and <code>JSON-expression</code> a valid JSON expression without the
     *         <code>$</code> prefix.
     */

    public java.util.Map<String, String> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the method response from the back end. The key
     * is a method response header parameter name and the mapped value is an integration response header value, a static
     * value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The
     * mapping key must match the pattern of <code>method.response.header.{name}</code>, where <code>name</code> is a
     * valid and unique header name. The mapped non-static value must match the pattern of
     * <code>integration.response.header.{name}</code> or <code>integration.response.body.{JSON-expression}</code>,
     * where <code>name</code> must be a valid and unique response header name and <code>JSON-expression</code> a valid
     * JSON expression without the <code>$</code> prefix.
     * </p>
     * 
     * @param responseParameters
     *        A key-value map specifying response parameters that are passed to the method response from the back end.
     *        The key is a method response header parameter name and the mapped value is an integration response header
     *        value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration
     *        response body. The mapping key must match the pattern of <code>method.response.header.{name}</code>, where
     *        <code>name</code> is a valid and unique header name. The mapped non-static value must match the pattern of
     *        <code>integration.response.header.{name}</code> or
     *        <code>integration.response.body.{JSON-expression}</code>, where <code>name</code> must be a valid and
     *        unique response header name and <code>JSON-expression</code> a valid JSON expression without the
     *        <code>$</code> prefix.
     */

    public void setResponseParameters(java.util.Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the method response from the back end. The key
     * is a method response header parameter name and the mapped value is an integration response header value, a static
     * value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The
     * mapping key must match the pattern of <code>method.response.header.{name}</code>, where <code>name</code> is a
     * valid and unique header name. The mapped non-static value must match the pattern of
     * <code>integration.response.header.{name}</code> or <code>integration.response.body.{JSON-expression}</code>,
     * where <code>name</code> must be a valid and unique response header name and <code>JSON-expression</code> a valid
     * JSON expression without the <code>$</code> prefix.
     * </p>
     * 
     * @param responseParameters
     *        A key-value map specifying response parameters that are passed to the method response from the back end.
     *        The key is a method response header parameter name and the mapped value is an integration response header
     *        value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration
     *        response body. The mapping key must match the pattern of <code>method.response.header.{name}</code>, where
     *        <code>name</code> is a valid and unique header name. The mapped non-static value must match the pattern of
     *        <code>integration.response.header.{name}</code> or
     *        <code>integration.response.body.{JSON-expression}</code>, where <code>name</code> must be a valid and
     *        unique response header name and <code>JSON-expression</code> a valid JSON expression without the
     *        <code>$</code> prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResponseRequest withResponseParameters(java.util.Map<String, String> responseParameters) {
        setResponseParameters(responseParameters);
        return this;
    }

    public PutIntegrationResponseRequest addResponseParametersEntry(String key, String value) {
        if (null == this.responseParameters) {
            this.responseParameters = new java.util.HashMap<String, String>();
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

    public PutIntegrationResponseRequest clearResponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * Specifies a put integration response's templates.
     * </p>
     * 
     * @return Specifies a put integration response's templates.
     */

    public java.util.Map<String, String> getResponseTemplates() {
        return responseTemplates;
    }

    /**
     * <p>
     * Specifies a put integration response's templates.
     * </p>
     * 
     * @param responseTemplates
     *        Specifies a put integration response's templates.
     */

    public void setResponseTemplates(java.util.Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
    }

    /**
     * <p>
     * Specifies a put integration response's templates.
     * </p>
     * 
     * @param responseTemplates
     *        Specifies a put integration response's templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResponseRequest withResponseTemplates(java.util.Map<String, String> responseTemplates) {
        setResponseTemplates(responseTemplates);
        return this;
    }

    public PutIntegrationResponseRequest addResponseTemplatesEntry(String key, String value) {
        if (null == this.responseTemplates) {
            this.responseTemplates = new java.util.HashMap<String, String>();
        }
        if (this.responseTemplates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.responseTemplates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseTemplates.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResponseRequest clearResponseTemplatesEntries() {
        this.responseTemplates = null;
        return this;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * method response without modification.
     * </p>
     * 
     * @param contentHandling
     *        Specifies how to handle response payload content type conversions. Supported values are
     *        <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the
     *        corresponding binary blob.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the method response without modification.
     * @see ContentHandlingStrategy
     */

    public void setContentHandling(String contentHandling) {
        this.contentHandling = contentHandling;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * method response without modification.
     * </p>
     * 
     * @return Specifies how to handle response payload content type conversions. Supported values are
     *         <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the
     *         corresponding binary blob.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If this property is not defined, the response payload will be passed through from the integration
     *         response to the method response without modification.
     * @see ContentHandlingStrategy
     */

    public String getContentHandling() {
        return this.contentHandling;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * method response without modification.
     * </p>
     * 
     * @param contentHandling
     *        Specifies how to handle response payload content type conversions. Supported values are
     *        <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the
     *        corresponding binary blob.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the method response without modification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentHandlingStrategy
     */

    public PutIntegrationResponseRequest withContentHandling(String contentHandling) {
        setContentHandling(contentHandling);
        return this;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * method response without modification.
     * </p>
     * 
     * @param contentHandling
     *        Specifies how to handle response payload content type conversions. Supported values are
     *        <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the
     *        corresponding binary blob.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the method response without modification.
     * @see ContentHandlingStrategy
     */

    public void setContentHandling(ContentHandlingStrategy contentHandling) {
        this.contentHandling = contentHandling.toString();
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * method response without modification.
     * </p>
     * 
     * @param contentHandling
     *        Specifies how to handle response payload content type conversions. Supported values are
     *        <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the
     *        corresponding binary blob.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the method response without modification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentHandlingStrategy
     */

    public PutIntegrationResponseRequest withContentHandling(ContentHandlingStrategy contentHandling) {
        setContentHandling(contentHandling);
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
        if (getSelectionPattern() != null)
            sb.append("SelectionPattern: " + getSelectionPattern() + ",");
        if (getResponseParameters() != null)
            sb.append("ResponseParameters: " + getResponseParameters() + ",");
        if (getResponseTemplates() != null)
            sb.append("ResponseTemplates: " + getResponseTemplates() + ",");
        if (getContentHandling() != null)
            sb.append("ContentHandling: " + getContentHandling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutIntegrationResponseRequest == false)
            return false;
        PutIntegrationResponseRequest other = (PutIntegrationResponseRequest) obj;
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
        if (other.getSelectionPattern() == null ^ this.getSelectionPattern() == null)
            return false;
        if (other.getSelectionPattern() != null && other.getSelectionPattern().equals(this.getSelectionPattern()) == false)
            return false;
        if (other.getResponseParameters() == null ^ this.getResponseParameters() == null)
            return false;
        if (other.getResponseParameters() != null && other.getResponseParameters().equals(this.getResponseParameters()) == false)
            return false;
        if (other.getResponseTemplates() == null ^ this.getResponseTemplates() == null)
            return false;
        if (other.getResponseTemplates() != null && other.getResponseTemplates().equals(this.getResponseTemplates()) == false)
            return false;
        if (other.getContentHandling() == null ^ this.getContentHandling() == null)
            return false;
        if (other.getContentHandling() != null && other.getContentHandling().equals(this.getContentHandling()) == false)
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
        hashCode = prime * hashCode + ((getSelectionPattern() == null) ? 0 : getSelectionPattern().hashCode());
        hashCode = prime * hashCode + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode + ((getResponseTemplates() == null) ? 0 : getResponseTemplates().hashCode());
        hashCode = prime * hashCode + ((getContentHandling() == null) ? 0 : getContentHandling().hashCode());
        return hashCode;
    }

    @Override
    public PutIntegrationResponseRequest clone() {
        return (PutIntegrationResponseRequest) super.clone();
    }
}
