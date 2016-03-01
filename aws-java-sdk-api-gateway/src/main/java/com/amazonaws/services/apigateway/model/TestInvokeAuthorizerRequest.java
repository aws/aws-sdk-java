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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class TestInvokeAuthorizerRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    private String restApiId;

    private String authorizerId;

    private java.util.Map<String, String> headers;

    private String pathWithQueryString;

    private String body;

    private java.util.Map<String, String> stageVariables;

    private java.util.Map<String, String> additionalContext;

    /**
     * @param restApiId
     */
    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * @return
     */
    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * @param restApiId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * @param authorizerId
     */
    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    /**
     * @return
     */
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    /**
     * @param authorizerId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerRequest withAuthorizerId(String authorizerId) {
        setAuthorizerId(authorizerId);
        return this;
    }

    /**
     * @return
     */
    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * @param headers
     */
    public void setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * @param headers
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerRequest withHeaders(
            java.util.Map<String, String> headers) {
        setHeaders(headers);
        return this;
    }

    public TestInvokeAuthorizerRequest addHeadersEntry(String key, String value) {
        if (null == this.headers) {
            this.headers = new java.util.HashMap<String, String>();
        }
        if (this.headers.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.headers.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Headers. &lt;p> Returns a reference to
     * this object so that method calls can be chained together.
     */
    public TestInvokeAuthorizerRequest clearHeadersEntries() {
        this.headers = null;
        return this;
    }

    /**
     * @param pathWithQueryString
     */
    public void setPathWithQueryString(String pathWithQueryString) {
        this.pathWithQueryString = pathWithQueryString;
    }

    /**
     * @return
     */
    public String getPathWithQueryString() {
        return this.pathWithQueryString;
    }

    /**
     * @param pathWithQueryString
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerRequest withPathWithQueryString(
            String pathWithQueryString) {
        setPathWithQueryString(pathWithQueryString);
        return this;
    }

    /**
     * @param body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @return
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @param body
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerRequest withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * @return
     */
    public java.util.Map<String, String> getStageVariables() {
        return stageVariables;
    }

    /**
     * @param stageVariables
     */
    public void setStageVariables(java.util.Map<String, String> stageVariables) {
        this.stageVariables = stageVariables;
    }

    /**
     * @param stageVariables
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerRequest withStageVariables(
            java.util.Map<String, String> stageVariables) {
        setStageVariables(stageVariables);
        return this;
    }

    public TestInvokeAuthorizerRequest addStageVariablesEntry(String key,
            String value) {
        if (null == this.stageVariables) {
            this.stageVariables = new java.util.HashMap<String, String>();
        }
        if (this.stageVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.stageVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StageVariables. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */
    public TestInvokeAuthorizerRequest clearStageVariablesEntries() {
        this.stageVariables = null;
        return this;
    }

    /**
     * @return
     */
    public java.util.Map<String, String> getAdditionalContext() {
        return additionalContext;
    }

    /**
     * @param additionalContext
     */
    public void setAdditionalContext(
            java.util.Map<String, String> additionalContext) {
        this.additionalContext = additionalContext;
    }

    /**
     * @param additionalContext
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TestInvokeAuthorizerRequest withAdditionalContext(
            java.util.Map<String, String> additionalContext) {
        setAdditionalContext(additionalContext);
        return this;
    }

    public TestInvokeAuthorizerRequest addAdditionalContextEntry(String key,
            String value) {
        if (null == this.additionalContext) {
            this.additionalContext = new java.util.HashMap<String, String>();
        }
        if (this.additionalContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.additionalContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalContext. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */
    public TestInvokeAuthorizerRequest clearAdditionalContextEntries() {
        this.additionalContext = null;
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
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getAuthorizerId() != null)
            sb.append("AuthorizerId: " + getAuthorizerId() + ",");
        if (getHeaders() != null)
            sb.append("Headers: " + getHeaders() + ",");
        if (getPathWithQueryString() != null)
            sb.append("PathWithQueryString: " + getPathWithQueryString() + ",");
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getStageVariables() != null)
            sb.append("StageVariables: " + getStageVariables() + ",");
        if (getAdditionalContext() != null)
            sb.append("AdditionalContext: " + getAdditionalContext());
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
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getAuthorizerId() == null ^ this.getAuthorizerId() == null)
            return false;
        if (other.getAuthorizerId() != null
                && other.getAuthorizerId().equals(this.getAuthorizerId()) == false)
            return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null
                && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getPathWithQueryString() == null
                ^ this.getPathWithQueryString() == null)
            return false;
        if (other.getPathWithQueryString() != null
                && other.getPathWithQueryString().equals(
                        this.getPathWithQueryString()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null
                && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getStageVariables() == null
                ^ this.getStageVariables() == null)
            return false;
        if (other.getStageVariables() != null
                && other.getStageVariables().equals(this.getStageVariables()) == false)
            return false;
        if (other.getAdditionalContext() == null
                ^ this.getAdditionalContext() == null)
            return false;
        if (other.getAdditionalContext() != null
                && other.getAdditionalContext().equals(
                        this.getAdditionalContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuthorizerId() == null) ? 0 : getAuthorizerId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime
                * hashCode
                + ((getPathWithQueryString() == null) ? 0
                        : getPathWithQueryString().hashCode());
        hashCode = prime * hashCode
                + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime
                * hashCode
                + ((getStageVariables() == null) ? 0 : getStageVariables()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAdditionalContext() == null) ? 0
                        : getAdditionalContext().hashCode());
        return hashCode;
    }

    @Override
    public TestInvokeAuthorizerRequest clone() {
        return (TestInvokeAuthorizerRequest) super.clone();
    }
}