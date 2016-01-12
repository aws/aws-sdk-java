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
public class TestInvokeMethodRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    private String restApiId;

    private String resourceId;

    private String httpMethod;

    private String pathWithQueryString;

    private String body;

    private java.util.Map<String, String> headers;

    private String clientCertificateId;

    private java.util.Map<String, String> stageVariables;

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
    public TestInvokeMethodRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * @return
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @param resourceId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * @param httpMethod
     */
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * @return
     */
    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * @param httpMethod
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodRequest withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
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
    public TestInvokeMethodRequest withPathWithQueryString(
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
    public TestInvokeMethodRequest withBody(String body) {
        setBody(body);
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
    public TestInvokeMethodRequest withHeaders(
            java.util.Map<String, String> headers) {
        setHeaders(headers);
        return this;
    }

    public TestInvokeMethodRequest addHeadersEntry(String key, String value) {
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
    public TestInvokeMethodRequest clearHeadersEntries() {
        this.headers = null;
        return this;
    }

    /**
     * @param clientCertificateId
     */
    public void setClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    /**
     * @return
     */
    public String getClientCertificateId() {
        return this.clientCertificateId;
    }

    /**
     * @param clientCertificateId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TestInvokeMethodRequest withClientCertificateId(
            String clientCertificateId) {
        setClientCertificateId(clientCertificateId);
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
    public TestInvokeMethodRequest withStageVariables(
            java.util.Map<String, String> stageVariables) {
        setStageVariables(stageVariables);
        return this;
    }

    public TestInvokeMethodRequest addStageVariablesEntry(String key,
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
    public TestInvokeMethodRequest clearStageVariablesEntries() {
        this.stageVariables = null;
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
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: " + getHttpMethod() + ",");
        if (getPathWithQueryString() != null)
            sb.append("PathWithQueryString: " + getPathWithQueryString() + ",");
        if (getBody() != null)
            sb.append("Body: " + getBody() + ",");
        if (getHeaders() != null)
            sb.append("Headers: " + getHeaders() + ",");
        if (getClientCertificateId() != null)
            sb.append("ClientCertificateId: " + getClientCertificateId() + ",");
        if (getStageVariables() != null)
            sb.append("StageVariables: " + getStageVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestInvokeMethodRequest == false)
            return false;
        TestInvokeMethodRequest other = (TestInvokeMethodRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null
                && other.getHttpMethod().equals(this.getHttpMethod()) == false)
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
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null
                && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getClientCertificateId() == null
                ^ this.getClientCertificateId() == null)
            return false;
        if (other.getClientCertificateId() != null
                && other.getClientCertificateId().equals(
                        this.getClientCertificateId()) == false)
            return false;
        if (other.getStageVariables() == null
                ^ this.getStageVariables() == null)
            return false;
        if (other.getStageVariables() != null
                && other.getStageVariables().equals(this.getStageVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime
                * hashCode
                + ((getPathWithQueryString() == null) ? 0
                        : getPathWithQueryString().hashCode());
        hashCode = prime * hashCode
                + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode
                + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime
                * hashCode
                + ((getClientCertificateId() == null) ? 0
                        : getClientCertificateId().hashCode());
        hashCode = prime
                * hashCode
                + ((getStageVariables() == null) ? 0 : getStageVariables()
                        .hashCode());
        return hashCode;
    }

    @Override
    public TestInvokeMethodRequest clone() {
        return (TestInvokeMethodRequest) super.clone();
    }
}