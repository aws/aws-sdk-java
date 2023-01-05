/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Make a request to simulate the invocation of an Authorizer.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestInvokeAuthorizerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The string identifier of the associated RestApi.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * Specifies a test invoke authorizer request's Authorizer ID.
     * </p>
     */
    private String authorizerId;
    /**
     * <p>
     * A key-value map of headers to simulate an incoming invocation request. This is where the incoming authorization
     * token, or identity source, should be specified.
     * </p>
     */
    private java.util.Map<String, String> headers;
    /**
     * <p>
     * The headers as a map from string to list of values to simulate an incoming invocation request. This is where the
     * incoming authorization token, or identity source, may be specified.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> multiValueHeaders;
    /**
     * <p>
     * The URI path, including query string, of the simulated invocation request. Use this to specify path parameters
     * and query string parameters.
     * </p>
     */
    private String pathWithQueryString;
    /**
     * <p>
     * The simulated request body of an incoming invocation request.
     * </p>
     */
    private String body;
    /**
     * <p>
     * A key-value map of stage variables to simulate an invocation on a deployed Stage.
     * </p>
     */
    private java.util.Map<String, String> stageVariables;
    /**
     * <p>
     * A key-value map of additional context variables.
     * </p>
     */
    private java.util.Map<String, String> additionalContext;

    /**
     * <p>
     * The string identifier of the associated RestApi.
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated RestApi.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated RestApi.
     * </p>
     * 
     * @return The string identifier of the associated RestApi.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated RestApi.
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated RestApi.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * Specifies a test invoke authorizer request's Authorizer ID.
     * </p>
     * 
     * @param authorizerId
     *        Specifies a test invoke authorizer request's Authorizer ID.
     */

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    /**
     * <p>
     * Specifies a test invoke authorizer request's Authorizer ID.
     * </p>
     * 
     * @return Specifies a test invoke authorizer request's Authorizer ID.
     */

    public String getAuthorizerId() {
        return this.authorizerId;
    }

    /**
     * <p>
     * Specifies a test invoke authorizer request's Authorizer ID.
     * </p>
     * 
     * @param authorizerId
     *        Specifies a test invoke authorizer request's Authorizer ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest withAuthorizerId(String authorizerId) {
        setAuthorizerId(authorizerId);
        return this;
    }

    /**
     * <p>
     * A key-value map of headers to simulate an incoming invocation request. This is where the incoming authorization
     * token, or identity source, should be specified.
     * </p>
     * 
     * @return A key-value map of headers to simulate an incoming invocation request. This is where the incoming
     *         authorization token, or identity source, should be specified.
     */

    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * A key-value map of headers to simulate an incoming invocation request. This is where the incoming authorization
     * token, or identity source, should be specified.
     * </p>
     * 
     * @param headers
     *        A key-value map of headers to simulate an incoming invocation request. This is where the incoming
     *        authorization token, or identity source, should be specified.
     */

    public void setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * <p>
     * A key-value map of headers to simulate an incoming invocation request. This is where the incoming authorization
     * token, or identity source, should be specified.
     * </p>
     * 
     * @param headers
     *        A key-value map of headers to simulate an incoming invocation request. This is where the incoming
     *        authorization token, or identity source, should be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest withHeaders(java.util.Map<String, String> headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * Add a single Headers entry
     *
     * @see TestInvokeAuthorizerRequest#withHeaders
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest addHeadersEntry(String key, String value) {
        if (null == this.headers) {
            this.headers = new java.util.HashMap<String, String>();
        }
        if (this.headers.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.headers.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Headers.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest clearHeadersEntries() {
        this.headers = null;
        return this;
    }

    /**
     * <p>
     * The headers as a map from string to list of values to simulate an incoming invocation request. This is where the
     * incoming authorization token, or identity source, may be specified.
     * </p>
     * 
     * @return The headers as a map from string to list of values to simulate an incoming invocation request. This is
     *         where the incoming authorization token, or identity source, may be specified.
     */

    public java.util.Map<String, java.util.List<String>> getMultiValueHeaders() {
        return multiValueHeaders;
    }

    /**
     * <p>
     * The headers as a map from string to list of values to simulate an incoming invocation request. This is where the
     * incoming authorization token, or identity source, may be specified.
     * </p>
     * 
     * @param multiValueHeaders
     *        The headers as a map from string to list of values to simulate an incoming invocation request. This is
     *        where the incoming authorization token, or identity source, may be specified.
     */

    public void setMultiValueHeaders(java.util.Map<String, java.util.List<String>> multiValueHeaders) {
        this.multiValueHeaders = multiValueHeaders;
    }

    /**
     * <p>
     * The headers as a map from string to list of values to simulate an incoming invocation request. This is where the
     * incoming authorization token, or identity source, may be specified.
     * </p>
     * 
     * @param multiValueHeaders
     *        The headers as a map from string to list of values to simulate an incoming invocation request. This is
     *        where the incoming authorization token, or identity source, may be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest withMultiValueHeaders(java.util.Map<String, java.util.List<String>> multiValueHeaders) {
        setMultiValueHeaders(multiValueHeaders);
        return this;
    }

    /**
     * Add a single MultiValueHeaders entry
     *
     * @see TestInvokeAuthorizerRequest#withMultiValueHeaders
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest addMultiValueHeadersEntry(String key, java.util.List<String> value) {
        if (null == this.multiValueHeaders) {
            this.multiValueHeaders = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.multiValueHeaders.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.multiValueHeaders.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MultiValueHeaders.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest clearMultiValueHeadersEntries() {
        this.multiValueHeaders = null;
        return this;
    }

    /**
     * <p>
     * The URI path, including query string, of the simulated invocation request. Use this to specify path parameters
     * and query string parameters.
     * </p>
     * 
     * @param pathWithQueryString
     *        The URI path, including query string, of the simulated invocation request. Use this to specify path
     *        parameters and query string parameters.
     */

    public void setPathWithQueryString(String pathWithQueryString) {
        this.pathWithQueryString = pathWithQueryString;
    }

    /**
     * <p>
     * The URI path, including query string, of the simulated invocation request. Use this to specify path parameters
     * and query string parameters.
     * </p>
     * 
     * @return The URI path, including query string, of the simulated invocation request. Use this to specify path
     *         parameters and query string parameters.
     */

    public String getPathWithQueryString() {
        return this.pathWithQueryString;
    }

    /**
     * <p>
     * The URI path, including query string, of the simulated invocation request. Use this to specify path parameters
     * and query string parameters.
     * </p>
     * 
     * @param pathWithQueryString
     *        The URI path, including query string, of the simulated invocation request. Use this to specify path
     *        parameters and query string parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest withPathWithQueryString(String pathWithQueryString) {
        setPathWithQueryString(pathWithQueryString);
        return this;
    }

    /**
     * <p>
     * The simulated request body of an incoming invocation request.
     * </p>
     * 
     * @param body
     *        The simulated request body of an incoming invocation request.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The simulated request body of an incoming invocation request.
     * </p>
     * 
     * @return The simulated request body of an incoming invocation request.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The simulated request body of an incoming invocation request.
     * </p>
     * 
     * @param body
     *        The simulated request body of an incoming invocation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * A key-value map of stage variables to simulate an invocation on a deployed Stage.
     * </p>
     * 
     * @return A key-value map of stage variables to simulate an invocation on a deployed Stage.
     */

    public java.util.Map<String, String> getStageVariables() {
        return stageVariables;
    }

    /**
     * <p>
     * A key-value map of stage variables to simulate an invocation on a deployed Stage.
     * </p>
     * 
     * @param stageVariables
     *        A key-value map of stage variables to simulate an invocation on a deployed Stage.
     */

    public void setStageVariables(java.util.Map<String, String> stageVariables) {
        this.stageVariables = stageVariables;
    }

    /**
     * <p>
     * A key-value map of stage variables to simulate an invocation on a deployed Stage.
     * </p>
     * 
     * @param stageVariables
     *        A key-value map of stage variables to simulate an invocation on a deployed Stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest withStageVariables(java.util.Map<String, String> stageVariables) {
        setStageVariables(stageVariables);
        return this;
    }

    /**
     * Add a single StageVariables entry
     *
     * @see TestInvokeAuthorizerRequest#withStageVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest addStageVariablesEntry(String key, String value) {
        if (null == this.stageVariables) {
            this.stageVariables = new java.util.HashMap<String, String>();
        }
        if (this.stageVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.stageVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StageVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest clearStageVariablesEntries() {
        this.stageVariables = null;
        return this;
    }

    /**
     * <p>
     * A key-value map of additional context variables.
     * </p>
     * 
     * @return A key-value map of additional context variables.
     */

    public java.util.Map<String, String> getAdditionalContext() {
        return additionalContext;
    }

    /**
     * <p>
     * A key-value map of additional context variables.
     * </p>
     * 
     * @param additionalContext
     *        A key-value map of additional context variables.
     */

    public void setAdditionalContext(java.util.Map<String, String> additionalContext) {
        this.additionalContext = additionalContext;
    }

    /**
     * <p>
     * A key-value map of additional context variables.
     * </p>
     * 
     * @param additionalContext
     *        A key-value map of additional context variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest withAdditionalContext(java.util.Map<String, String> additionalContext) {
        setAdditionalContext(additionalContext);
        return this;
    }

    /**
     * Add a single AdditionalContext entry
     *
     * @see TestInvokeAuthorizerRequest#withAdditionalContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest addAdditionalContextEntry(String key, String value) {
        if (null == this.additionalContext) {
            this.additionalContext = new java.util.HashMap<String, String>();
        }
        if (this.additionalContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalContext.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest clearAdditionalContextEntries() {
        this.additionalContext = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
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
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getAuthorizerId() != null)
            sb.append("AuthorizerId: ").append(getAuthorizerId()).append(",");
        if (getHeaders() != null)
            sb.append("Headers: ").append(getHeaders()).append(",");
        if (getMultiValueHeaders() != null)
            sb.append("MultiValueHeaders: ").append(getMultiValueHeaders()).append(",");
        if (getPathWithQueryString() != null)
            sb.append("PathWithQueryString: ").append(getPathWithQueryString()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getStageVariables() != null)
            sb.append("StageVariables: ").append(getStageVariables()).append(",");
        if (getAdditionalContext() != null)
            sb.append("AdditionalContext: ").append(getAdditionalContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestInvokeAuthorizerRequest == false)
            return false;
        TestInvokeAuthorizerRequest other = (TestInvokeAuthorizerRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getAuthorizerId() == null ^ this.getAuthorizerId() == null)
            return false;
        if (other.getAuthorizerId() != null && other.getAuthorizerId().equals(this.getAuthorizerId()) == false)
            return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getMultiValueHeaders() == null ^ this.getMultiValueHeaders() == null)
            return false;
        if (other.getMultiValueHeaders() != null && other.getMultiValueHeaders().equals(this.getMultiValueHeaders()) == false)
            return false;
        if (other.getPathWithQueryString() == null ^ this.getPathWithQueryString() == null)
            return false;
        if (other.getPathWithQueryString() != null && other.getPathWithQueryString().equals(this.getPathWithQueryString()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getStageVariables() == null ^ this.getStageVariables() == null)
            return false;
        if (other.getStageVariables() != null && other.getStageVariables().equals(this.getStageVariables()) == false)
            return false;
        if (other.getAdditionalContext() == null ^ this.getAdditionalContext() == null)
            return false;
        if (other.getAdditionalContext() != null && other.getAdditionalContext().equals(this.getAdditionalContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerId() == null) ? 0 : getAuthorizerId().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode + ((getMultiValueHeaders() == null) ? 0 : getMultiValueHeaders().hashCode());
        hashCode = prime * hashCode + ((getPathWithQueryString() == null) ? 0 : getPathWithQueryString().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getStageVariables() == null) ? 0 : getStageVariables().hashCode());
        hashCode = prime * hashCode + ((getAdditionalContext() == null) ? 0 : getAdditionalContext().hashCode());
        return hashCode;
    }

    @Override
    public TestInvokeAuthorizerRequest clone() {
        return (TestInvokeAuthorizerRequest) super.clone();
    }

}
