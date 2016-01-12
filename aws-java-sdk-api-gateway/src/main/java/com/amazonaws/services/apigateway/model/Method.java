/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a method.
 * </p>
 */
public class Method implements Serializable, Cloneable {

    /**
     * <p>
     * The HTTP method.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * The method's authorization type.
     * </p>
     */
    private String authorizationType;
    /**
     * <p>
     * Specifies whether the method requires a valid <a>ApiKey</a>.
     * </p>
     */
    private Boolean apiKeyRequired;
    /**
     * <p>
     * Represents request parameters that can be accepted by Amazon API Gateway.
     * Request parameters are represented as a key/value map, with a source as
     * the key and a Boolean flag as the value. The Boolean flag is used to
     * specify whether the parameter is required. A source must match the
     * pattern <code>method.request.{location}.{name}</code>, where
     * <code>location</code> is either querystring, path, or header.
     * <code>name</code> is a valid, unique parameter name. Sources specified
     * here are available to the integration for mapping to integration request
     * parameters or templates.
     * </p>
     */
    private java.util.Map<String, Boolean> requestParameters;
    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the request's content type.
     * Request models are represented as a key/value map, with a content type as
     * the key and a <a>Model</a> name as the value.
     * </p>
     */
    private java.util.Map<String, String> requestModels;
    /**
     * <p>
     * Represents available responses that can be sent to the caller. Method
     * responses are represented as a key/value map, with an HTTP status code as
     * the key and a <a>MethodResponse</a> as the value. The status codes are
     * available for the <a>Integration</a> responses to map to.
     * </p>
     */
    private java.util.Map<String, MethodResponse> methodResponses;
    /**
     * <p>
     * The method's integration.
     * </p>
     */
    private Integration methodIntegration;

    /**
     * <p>
     * The HTTP method.
     * </p>
     * 
     * @param httpMethod
     *        The HTTP method.
     */
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * The HTTP method.
     * </p>
     * 
     * @return The HTTP method.
     */
    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * The HTTP method.
     * </p>
     * 
     * @param httpMethod
     *        The HTTP method.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Method withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * The method's authorization type.
     * </p>
     * 
     * @param authorizationType
     *        The method's authorization type.
     */
    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    /**
     * <p>
     * The method's authorization type.
     * </p>
     * 
     * @return The method's authorization type.
     */
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * <p>
     * The method's authorization type.
     * </p>
     * 
     * @param authorizationType
     *        The method's authorization type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Method withAuthorizationType(String authorizationType) {
        setAuthorizationType(authorizationType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the method requires a valid <a>ApiKey</a>.
     * </p>
     * 
     * @param apiKeyRequired
     *        Specifies whether the method requires a valid <a>ApiKey</a>.
     */
    public void setApiKeyRequired(Boolean apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
    }

    /**
     * <p>
     * Specifies whether the method requires a valid <a>ApiKey</a>.
     * </p>
     * 
     * @return Specifies whether the method requires a valid <a>ApiKey</a>.
     */
    public Boolean getApiKeyRequired() {
        return this.apiKeyRequired;
    }

    /**
     * <p>
     * Specifies whether the method requires a valid <a>ApiKey</a>.
     * </p>
     * 
     * @param apiKeyRequired
     *        Specifies whether the method requires a valid <a>ApiKey</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Method withApiKeyRequired(Boolean apiKeyRequired) {
        setApiKeyRequired(apiKeyRequired);
        return this;
    }

    /**
     * <p>
     * Specifies whether the method requires a valid <a>ApiKey</a>.
     * </p>
     * 
     * @return Specifies whether the method requires a valid <a>ApiKey</a>.
     */
    public Boolean isApiKeyRequired() {
        return this.apiKeyRequired;
    }

    /**
     * <p>
     * Represents request parameters that can be accepted by Amazon API Gateway.
     * Request parameters are represented as a key/value map, with a source as
     * the key and a Boolean flag as the value. The Boolean flag is used to
     * specify whether the parameter is required. A source must match the
     * pattern <code>method.request.{location}.{name}</code>, where
     * <code>location</code> is either querystring, path, or header.
     * <code>name</code> is a valid, unique parameter name. Sources specified
     * here are available to the integration for mapping to integration request
     * parameters or templates.
     * </p>
     * 
     * @return Represents request parameters that can be accepted by Amazon API
     *         Gateway. Request parameters are represented as a key/value map,
     *         with a source as the key and a Boolean flag as the value. The
     *         Boolean flag is used to specify whether the parameter is
     *         required. A source must match the pattern
     *         <code>method.request.{location}.{name}</code>, where
     *         <code>location</code> is either querystring, path, or header.
     *         <code>name</code> is a valid, unique parameter name. Sources
     *         specified here are available to the integration for mapping to
     *         integration request parameters or templates.
     */
    public java.util.Map<String, Boolean> getRequestParameters() {
        return requestParameters;
    }

    /**
     * <p>
     * Represents request parameters that can be accepted by Amazon API Gateway.
     * Request parameters are represented as a key/value map, with a source as
     * the key and a Boolean flag as the value. The Boolean flag is used to
     * specify whether the parameter is required. A source must match the
     * pattern <code>method.request.{location}.{name}</code>, where
     * <code>location</code> is either querystring, path, or header.
     * <code>name</code> is a valid, unique parameter name. Sources specified
     * here are available to the integration for mapping to integration request
     * parameters or templates.
     * </p>
     * 
     * @param requestParameters
     *        Represents request parameters that can be accepted by Amazon API
     *        Gateway. Request parameters are represented as a key/value map,
     *        with a source as the key and a Boolean flag as the value. The
     *        Boolean flag is used to specify whether the parameter is required.
     *        A source must match the pattern
     *        <code>method.request.{location}.{name}</code>, where
     *        <code>location</code> is either querystring, path, or header.
     *        <code>name</code> is a valid, unique parameter name. Sources
     *        specified here are available to the integration for mapping to
     *        integration request parameters or templates.
     */
    public void setRequestParameters(
            java.util.Map<String, Boolean> requestParameters) {
        this.requestParameters = requestParameters;
    }

    /**
     * <p>
     * Represents request parameters that can be accepted by Amazon API Gateway.
     * Request parameters are represented as a key/value map, with a source as
     * the key and a Boolean flag as the value. The Boolean flag is used to
     * specify whether the parameter is required. A source must match the
     * pattern <code>method.request.{location}.{name}</code>, where
     * <code>location</code> is either querystring, path, or header.
     * <code>name</code> is a valid, unique parameter name. Sources specified
     * here are available to the integration for mapping to integration request
     * parameters or templates.
     * </p>
     * 
     * @param requestParameters
     *        Represents request parameters that can be accepted by Amazon API
     *        Gateway. Request parameters are represented as a key/value map,
     *        with a source as the key and a Boolean flag as the value. The
     *        Boolean flag is used to specify whether the parameter is required.
     *        A source must match the pattern
     *        <code>method.request.{location}.{name}</code>, where
     *        <code>location</code> is either querystring, path, or header.
     *        <code>name</code> is a valid, unique parameter name. Sources
     *        specified here are available to the integration for mapping to
     *        integration request parameters or templates.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Method withRequestParameters(
            java.util.Map<String, Boolean> requestParameters) {
        setRequestParameters(requestParameters);
        return this;
    }

    public Method addRequestParametersEntry(String key, Boolean value) {
        if (null == this.requestParameters) {
            this.requestParameters = new java.util.HashMap<String, Boolean>();
        }
        if (this.requestParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.requestParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestParameters. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */
    public Method clearRequestParametersEntries() {
        this.requestParameters = null;
        return this;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the request's content type.
     * Request models are represented as a key/value map, with a content type as
     * the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @return Specifies the <a>Model</a> resources used for the request's
     *         content type. Request models are represented as a key/value map,
     *         with a content type as the key and a <a>Model</a> name as the
     *         value.
     */
    public java.util.Map<String, String> getRequestModels() {
        return requestModels;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the request's content type.
     * Request models are represented as a key/value map, with a content type as
     * the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @param requestModels
     *        Specifies the <a>Model</a> resources used for the request's
     *        content type. Request models are represented as a key/value map,
     *        with a content type as the key and a <a>Model</a> name as the
     *        value.
     */
    public void setRequestModels(java.util.Map<String, String> requestModels) {
        this.requestModels = requestModels;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the request's content type.
     * Request models are represented as a key/value map, with a content type as
     * the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @param requestModels
     *        Specifies the <a>Model</a> resources used for the request's
     *        content type. Request models are represented as a key/value map,
     *        with a content type as the key and a <a>Model</a> name as the
     *        value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Method withRequestModels(java.util.Map<String, String> requestModels) {
        setRequestModels(requestModels);
        return this;
    }

    public Method addRequestModelsEntry(String key, String value) {
        if (null == this.requestModels) {
            this.requestModels = new java.util.HashMap<String, String>();
        }
        if (this.requestModels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.requestModels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestModels. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */
    public Method clearRequestModelsEntries() {
        this.requestModels = null;
        return this;
    }

    /**
     * <p>
     * Represents available responses that can be sent to the caller. Method
     * responses are represented as a key/value map, with an HTTP status code as
     * the key and a <a>MethodResponse</a> as the value. The status codes are
     * available for the <a>Integration</a> responses to map to.
     * </p>
     * 
     * @return Represents available responses that can be sent to the caller.
     *         Method responses are represented as a key/value map, with an HTTP
     *         status code as the key and a <a>MethodResponse</a> as the value.
     *         The status codes are available for the <a>Integration</a>
     *         responses to map to.
     */
    public java.util.Map<String, MethodResponse> getMethodResponses() {
        return methodResponses;
    }

    /**
     * <p>
     * Represents available responses that can be sent to the caller. Method
     * responses are represented as a key/value map, with an HTTP status code as
     * the key and a <a>MethodResponse</a> as the value. The status codes are
     * available for the <a>Integration</a> responses to map to.
     * </p>
     * 
     * @param methodResponses
     *        Represents available responses that can be sent to the caller.
     *        Method responses are represented as a key/value map, with an HTTP
     *        status code as the key and a <a>MethodResponse</a> as the value.
     *        The status codes are available for the <a>Integration</a>
     *        responses to map to.
     */
    public void setMethodResponses(
            java.util.Map<String, MethodResponse> methodResponses) {
        this.methodResponses = methodResponses;
    }

    /**
     * <p>
     * Represents available responses that can be sent to the caller. Method
     * responses are represented as a key/value map, with an HTTP status code as
     * the key and a <a>MethodResponse</a> as the value. The status codes are
     * available for the <a>Integration</a> responses to map to.
     * </p>
     * 
     * @param methodResponses
     *        Represents available responses that can be sent to the caller.
     *        Method responses are represented as a key/value map, with an HTTP
     *        status code as the key and a <a>MethodResponse</a> as the value.
     *        The status codes are available for the <a>Integration</a>
     *        responses to map to.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Method withMethodResponses(
            java.util.Map<String, MethodResponse> methodResponses) {
        setMethodResponses(methodResponses);
        return this;
    }

    public Method addMethodResponsesEntry(String key, MethodResponse value) {
        if (null == this.methodResponses) {
            this.methodResponses = new java.util.HashMap<String, MethodResponse>();
        }
        if (this.methodResponses.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.methodResponses.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MethodResponses. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */
    public Method clearMethodResponsesEntries() {
        this.methodResponses = null;
        return this;
    }

    /**
     * <p>
     * The method's integration.
     * </p>
     * 
     * @param methodIntegration
     *        The method's integration.
     */
    public void setMethodIntegration(Integration methodIntegration) {
        this.methodIntegration = methodIntegration;
    }

    /**
     * <p>
     * The method's integration.
     * </p>
     * 
     * @return The method's integration.
     */
    public Integration getMethodIntegration() {
        return this.methodIntegration;
    }

    /**
     * <p>
     * The method's integration.
     * </p>
     * 
     * @param methodIntegration
     *        The method's integration.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Method withMethodIntegration(Integration methodIntegration) {
        setMethodIntegration(methodIntegration);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: " + getHttpMethod() + ",");
        if (getAuthorizationType() != null)
            sb.append("AuthorizationType: " + getAuthorizationType() + ",");
        if (getApiKeyRequired() != null)
            sb.append("ApiKeyRequired: " + getApiKeyRequired() + ",");
        if (getRequestParameters() != null)
            sb.append("RequestParameters: " + getRequestParameters() + ",");
        if (getRequestModels() != null)
            sb.append("RequestModels: " + getRequestModels() + ",");
        if (getMethodResponses() != null)
            sb.append("MethodResponses: " + getMethodResponses() + ",");
        if (getMethodIntegration() != null)
            sb.append("MethodIntegration: " + getMethodIntegration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Method == false)
            return false;
        Method other = (Method) obj;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null
                && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getAuthorizationType() == null
                ^ this.getAuthorizationType() == null)
            return false;
        if (other.getAuthorizationType() != null
                && other.getAuthorizationType().equals(
                        this.getAuthorizationType()) == false)
            return false;
        if (other.getApiKeyRequired() == null
                ^ this.getApiKeyRequired() == null)
            return false;
        if (other.getApiKeyRequired() != null
                && other.getApiKeyRequired().equals(this.getApiKeyRequired()) == false)
            return false;
        if (other.getRequestParameters() == null
                ^ this.getRequestParameters() == null)
            return false;
        if (other.getRequestParameters() != null
                && other.getRequestParameters().equals(
                        this.getRequestParameters()) == false)
            return false;
        if (other.getRequestModels() == null ^ this.getRequestModels() == null)
            return false;
        if (other.getRequestModels() != null
                && other.getRequestModels().equals(this.getRequestModels()) == false)
            return false;
        if (other.getMethodResponses() == null
                ^ this.getMethodResponses() == null)
            return false;
        if (other.getMethodResponses() != null
                && other.getMethodResponses().equals(this.getMethodResponses()) == false)
            return false;
        if (other.getMethodIntegration() == null
                ^ this.getMethodIntegration() == null)
            return false;
        if (other.getMethodIntegration() != null
                && other.getMethodIntegration().equals(
                        this.getMethodIntegration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthorizationType() == null) ? 0
                        : getAuthorizationType().hashCode());
        hashCode = prime
                * hashCode
                + ((getApiKeyRequired() == null) ? 0 : getApiKeyRequired()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestParameters() == null) ? 0
                        : getRequestParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestModels() == null) ? 0 : getRequestModels()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMethodResponses() == null) ? 0 : getMethodResponses()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMethodIntegration() == null) ? 0
                        : getMethodIntegration().hashCode());
        return hashCode;
    }

    @Override
    public Method clone() {
        try {
            return (Method) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}