/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.bedrockruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/InvokeModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Inference response from the model in the format specified in the <code>contentType</code> header. To see the
     * format and content of the request and response bodies for different models, refer to <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters</a>.
     * </p>
     */
    private java.nio.ByteBuffer body;
    /**
     * <p>
     * The MIME type of the inference result.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * Inference response from the model in the format specified in the <code>contentType</code> header. To see the
     * format and content of the request and response bodies for different models, refer to <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters</a>.
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
     *        Inference response from the model in the format specified in the <code>contentType</code> header. To see
     *        the format and content of the request and response bodies for different models, refer to <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference
     *        parameters</a>.
     */

    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * Inference response from the model in the format specified in the <code>contentType</code> header. To see the
     * format and content of the request and response bodies for different models, refer to <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters</a>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Inference response from the model in the format specified in the <code>contentType</code> header. To see
     *         the format and content of the request and response bodies for different models, refer to <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference
     *         parameters</a>.
     */

    public java.nio.ByteBuffer getBody() {
        return this.body;
    }

    /**
     * <p>
     * Inference response from the model in the format specified in the <code>contentType</code> header. To see the
     * format and content of the request and response bodies for different models, refer to <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters</a>.
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
     *        Inference response from the model in the format specified in the <code>contentType</code> header. To see
     *        the format and content of the request and response bodies for different models, refer to <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference
     *        parameters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeModelResult withBody(java.nio.ByteBuffer body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The MIME type of the inference result.
     * </p>
     * 
     * @param contentType
     *        The MIME type of the inference result.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The MIME type of the inference result.
     * </p>
     * 
     * @return The MIME type of the inference result.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The MIME type of the inference result.
     * </p>
     * 
     * @param contentType
     *        The MIME type of the inference result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeModelResult withContentType(String contentType) {
        setContentType(contentType);
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
        if (getBody() != null)
            sb.append("Body: ").append("***Sensitive Data Redacted***").append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeModelResult == false)
            return false;
        InvokeModelResult other = (InvokeModelResult) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public InvokeModelResult clone() {
        try {
            return (InvokeModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
