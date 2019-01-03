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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The POST request to import API keys from an external source, such as a CSV-formatted file.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportApiKeysRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The payload of the POST request to import API keys. For the payload format, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-key-file-format.html">API Key File
     * Format</a>.
     * </p>
     */
    private java.nio.ByteBuffer body;
    /**
     * <p>
     * A query parameter to specify the input format to imported API keys. Currently, only the <code>csv</code> format
     * is supported.
     * </p>
     */
    private String format;
    /**
     * <p>
     * A query parameter to indicate whether to rollback <a>ApiKey</a> importation (<code>true</code>) or not (
     * <code>false</code>) when error is encountered.
     * </p>
     */
    private Boolean failOnWarnings;

    /**
     * <p>
     * The payload of the POST request to import API keys. For the payload format, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-key-file-format.html">API Key File
     * Format</a>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param body
     *        The payload of the POST request to import API keys. For the payload format, see <a
     *        href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-key-file-format.html">API Key File
     *        Format</a>.
     */

    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * The payload of the POST request to import API keys. For the payload format, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-key-file-format.html">API Key File
     * Format</a>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The payload of the POST request to import API keys. For the payload format, see <a
     *         href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-key-file-format.html">API Key File
     *         Format</a>.
     */

    public java.nio.ByteBuffer getBody() {
        return this.body;
    }

    /**
     * <p>
     * The payload of the POST request to import API keys. For the payload format, see <a
     * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-key-file-format.html">API Key File
     * Format</a>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param body
     *        The payload of the POST request to import API keys. For the payload format, see <a
     *        href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-key-file-format.html">API Key File
     *        Format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportApiKeysRequest withBody(java.nio.ByteBuffer body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * A query parameter to specify the input format to imported API keys. Currently, only the <code>csv</code> format
     * is supported.
     * </p>
     * 
     * @param format
     *        A query parameter to specify the input format to imported API keys. Currently, only the <code>csv</code>
     *        format is supported.
     * @see ApiKeysFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * A query parameter to specify the input format to imported API keys. Currently, only the <code>csv</code> format
     * is supported.
     * </p>
     * 
     * @return A query parameter to specify the input format to imported API keys. Currently, only the <code>csv</code>
     *         format is supported.
     * @see ApiKeysFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * A query parameter to specify the input format to imported API keys. Currently, only the <code>csv</code> format
     * is supported.
     * </p>
     * 
     * @param format
     *        A query parameter to specify the input format to imported API keys. Currently, only the <code>csv</code>
     *        format is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiKeysFormat
     */

    public ImportApiKeysRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * A query parameter to specify the input format to imported API keys. Currently, only the <code>csv</code> format
     * is supported.
     * </p>
     * 
     * @param format
     *        A query parameter to specify the input format to imported API keys. Currently, only the <code>csv</code>
     *        format is supported.
     * @see ApiKeysFormat
     */

    public void setFormat(ApiKeysFormat format) {
        withFormat(format);
    }

    /**
     * <p>
     * A query parameter to specify the input format to imported API keys. Currently, only the <code>csv</code> format
     * is supported.
     * </p>
     * 
     * @param format
     *        A query parameter to specify the input format to imported API keys. Currently, only the <code>csv</code>
     *        format is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiKeysFormat
     */

    public ImportApiKeysRequest withFormat(ApiKeysFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback <a>ApiKey</a> importation (<code>true</code>) or not (
     * <code>false</code>) when error is encountered.
     * </p>
     * 
     * @param failOnWarnings
     *        A query parameter to indicate whether to rollback <a>ApiKey</a> importation (<code>true</code>) or not (
     *        <code>false</code>) when error is encountered.
     */

    public void setFailOnWarnings(Boolean failOnWarnings) {
        this.failOnWarnings = failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback <a>ApiKey</a> importation (<code>true</code>) or not (
     * <code>false</code>) when error is encountered.
     * </p>
     * 
     * @return A query parameter to indicate whether to rollback <a>ApiKey</a> importation (<code>true</code>) or not (
     *         <code>false</code>) when error is encountered.
     */

    public Boolean getFailOnWarnings() {
        return this.failOnWarnings;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback <a>ApiKey</a> importation (<code>true</code>) or not (
     * <code>false</code>) when error is encountered.
     * </p>
     * 
     * @param failOnWarnings
     *        A query parameter to indicate whether to rollback <a>ApiKey</a> importation (<code>true</code>) or not (
     *        <code>false</code>) when error is encountered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportApiKeysRequest withFailOnWarnings(Boolean failOnWarnings) {
        setFailOnWarnings(failOnWarnings);
        return this;
    }

    /**
     * <p>
     * A query parameter to indicate whether to rollback <a>ApiKey</a> importation (<code>true</code>) or not (
     * <code>false</code>) when error is encountered.
     * </p>
     * 
     * @return A query parameter to indicate whether to rollback <a>ApiKey</a> importation (<code>true</code>) or not (
     *         <code>false</code>) when error is encountered.
     */

    public Boolean isFailOnWarnings() {
        return this.failOnWarnings;
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
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getFailOnWarnings() != null)
            sb.append("FailOnWarnings: ").append(getFailOnWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportApiKeysRequest == false)
            return false;
        ImportApiKeysRequest other = (ImportApiKeysRequest) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getFailOnWarnings() == null ^ this.getFailOnWarnings() == null)
            return false;
        if (other.getFailOnWarnings() != null && other.getFailOnWarnings().equals(this.getFailOnWarnings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getFailOnWarnings() == null) ? 0 : getFailOnWarnings().hashCode());
        return hashCode;
    }

    @Override
    public ImportApiKeysRequest clone() {
        return (ImportApiKeysRequest) super.clone();
    }

}
