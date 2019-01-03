/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents the response of the test invoke request in the HTTP method.
 * </p>
 * <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-test-method.html#how-to-test-method-console"
 * >Test API using the API Gateway console</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestInvokeMethodResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The HTTP status code.
     * </p>
     */
    private Integer status;
    /**
     * <p>
     * The body of the HTTP response.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The headers of the HTTP response.
     * </p>
     */
    private java.util.Map<String, String> headers;
    /**
     * <p>
     * The headers of the HTTP response as a map from string to list of values.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> multiValueHeaders;
    /**
     * <p>
     * The API Gateway execution log for the test invoke request.
     * </p>
     */
    private String log;
    /**
     * <p>
     * The execution latency of the test invoke request.
     * </p>
     */
    private Long latency;

    /**
     * <p>
     * The HTTP status code.
     * </p>
     * 
     * @param status
     *        The HTTP status code.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status code.
     * </p>
     * 
     * @return The HTTP status code.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status code.
     * </p>
     * 
     * @param status
     *        The HTTP status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeMethodResult withStatus(Integer status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The body of the HTTP response.
     * </p>
     * 
     * @param body
     *        The body of the HTTP response.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The body of the HTTP response.
     * </p>
     * 
     * @return The body of the HTTP response.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The body of the HTTP response.
     * </p>
     * 
     * @param body
     *        The body of the HTTP response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeMethodResult withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The headers of the HTTP response.
     * </p>
     * 
     * @return The headers of the HTTP response.
     */

    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * The headers of the HTTP response.
     * </p>
     * 
     * @param headers
     *        The headers of the HTTP response.
     */

    public void setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * <p>
     * The headers of the HTTP response.
     * </p>
     * 
     * @param headers
     *        The headers of the HTTP response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeMethodResult withHeaders(java.util.Map<String, String> headers) {
        setHeaders(headers);
        return this;
    }

    public TestInvokeMethodResult addHeadersEntry(String key, String value) {
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

    public TestInvokeMethodResult clearHeadersEntries() {
        this.headers = null;
        return this;
    }

    /**
     * <p>
     * The headers of the HTTP response as a map from string to list of values.
     * </p>
     * 
     * @return The headers of the HTTP response as a map from string to list of values.
     */

    public java.util.Map<String, java.util.List<String>> getMultiValueHeaders() {
        return multiValueHeaders;
    }

    /**
     * <p>
     * The headers of the HTTP response as a map from string to list of values.
     * </p>
     * 
     * @param multiValueHeaders
     *        The headers of the HTTP response as a map from string to list of values.
     */

    public void setMultiValueHeaders(java.util.Map<String, java.util.List<String>> multiValueHeaders) {
        this.multiValueHeaders = multiValueHeaders;
    }

    /**
     * <p>
     * The headers of the HTTP response as a map from string to list of values.
     * </p>
     * 
     * @param multiValueHeaders
     *        The headers of the HTTP response as a map from string to list of values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeMethodResult withMultiValueHeaders(java.util.Map<String, java.util.List<String>> multiValueHeaders) {
        setMultiValueHeaders(multiValueHeaders);
        return this;
    }

    public TestInvokeMethodResult addMultiValueHeadersEntry(String key, java.util.List<String> value) {
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

    public TestInvokeMethodResult clearMultiValueHeadersEntries() {
        this.multiValueHeaders = null;
        return this;
    }

    /**
     * <p>
     * The API Gateway execution log for the test invoke request.
     * </p>
     * 
     * @param log
     *        The API Gateway execution log for the test invoke request.
     */

    public void setLog(String log) {
        this.log = log;
    }

    /**
     * <p>
     * The API Gateway execution log for the test invoke request.
     * </p>
     * 
     * @return The API Gateway execution log for the test invoke request.
     */

    public String getLog() {
        return this.log;
    }

    /**
     * <p>
     * The API Gateway execution log for the test invoke request.
     * </p>
     * 
     * @param log
     *        The API Gateway execution log for the test invoke request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeMethodResult withLog(String log) {
        setLog(log);
        return this;
    }

    /**
     * <p>
     * The execution latency of the test invoke request.
     * </p>
     * 
     * @param latency
     *        The execution latency of the test invoke request.
     */

    public void setLatency(Long latency) {
        this.latency = latency;
    }

    /**
     * <p>
     * The execution latency of the test invoke request.
     * </p>
     * 
     * @return The execution latency of the test invoke request.
     */

    public Long getLatency() {
        return this.latency;
    }

    /**
     * <p>
     * The execution latency of the test invoke request.
     * </p>
     * 
     * @param latency
     *        The execution latency of the test invoke request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeMethodResult withLatency(Long latency) {
        setLatency(latency);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getHeaders() != null)
            sb.append("Headers: ").append(getHeaders()).append(",");
        if (getMultiValueHeaders() != null)
            sb.append("MultiValueHeaders: ").append(getMultiValueHeaders()).append(",");
        if (getLog() != null)
            sb.append("Log: ").append(getLog()).append(",");
        if (getLatency() != null)
            sb.append("Latency: ").append(getLatency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestInvokeMethodResult == false)
            return false;
        TestInvokeMethodResult other = (TestInvokeMethodResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getMultiValueHeaders() == null ^ this.getMultiValueHeaders() == null)
            return false;
        if (other.getMultiValueHeaders() != null && other.getMultiValueHeaders().equals(this.getMultiValueHeaders()) == false)
            return false;
        if (other.getLog() == null ^ this.getLog() == null)
            return false;
        if (other.getLog() != null && other.getLog().equals(this.getLog()) == false)
            return false;
        if (other.getLatency() == null ^ this.getLatency() == null)
            return false;
        if (other.getLatency() != null && other.getLatency().equals(this.getLatency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode + ((getMultiValueHeaders() == null) ? 0 : getMultiValueHeaders().hashCode());
        hashCode = prime * hashCode + ((getLog() == null) ? 0 : getLog().hashCode());
        hashCode = prime * hashCode + ((getLatency() == null) ? 0 : getLatency().hashCode());
        return hashCode;
    }

    @Override
    public TestInvokeMethodResult clone() {
        try {
            return (TestInvokeMethodResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
