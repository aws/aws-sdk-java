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
package com.amazonaws.services.sagemakerruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.sagemaker-2017-05-13/InvokeEndpoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Includes the inference provided by the model.
     * </p>
     * <p>
     * For information about the format of the response body, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html">Common Data Formats—Inference</a>.
     * </p>
     */
    private java.nio.ByteBuffer body;
    /**
     * <p>
     * The MIME type of the inference returned in the response body.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * Identifies the production variant that was invoked.
     * </p>
     */
    private String invokedProductionVariant;
    /** <p/> */
    private String customAttributes;

    /**
     * <p>
     * Includes the inference provided by the model.
     * </p>
     * <p>
     * For information about the format of the response body, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html">Common Data Formats—Inference</a>.
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
     *        Includes the inference provided by the model.</p>
     *        <p>
     *        For information about the format of the response body, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html">Common Data
     *        Formats—Inference</a>.
     */

    public void setBody(java.nio.ByteBuffer body) {
        this.body = body;
    }

    /**
     * <p>
     * Includes the inference provided by the model.
     * </p>
     * <p>
     * For information about the format of the response body, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html">Common Data Formats—Inference</a>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Includes the inference provided by the model.</p>
     *         <p>
     *         For information about the format of the response body, see <a
     *         href="http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html">Common Data
     *         Formats—Inference</a>.
     */

    public java.nio.ByteBuffer getBody() {
        return this.body;
    }

    /**
     * <p>
     * Includes the inference provided by the model.
     * </p>
     * <p>
     * For information about the format of the response body, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html">Common Data Formats—Inference</a>.
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
     *        Includes the inference provided by the model.</p>
     *        <p>
     *        For information about the format of the response body, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/cdf-inference.html">Common Data
     *        Formats—Inference</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointResult withBody(java.nio.ByteBuffer body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The MIME type of the inference returned in the response body.
     * </p>
     * 
     * @param contentType
     *        The MIME type of the inference returned in the response body.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The MIME type of the inference returned in the response body.
     * </p>
     * 
     * @return The MIME type of the inference returned in the response body.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The MIME type of the inference returned in the response body.
     * </p>
     * 
     * @param contentType
     *        The MIME type of the inference returned in the response body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * Identifies the production variant that was invoked.
     * </p>
     * 
     * @param invokedProductionVariant
     *        Identifies the production variant that was invoked.
     */

    public void setInvokedProductionVariant(String invokedProductionVariant) {
        this.invokedProductionVariant = invokedProductionVariant;
    }

    /**
     * <p>
     * Identifies the production variant that was invoked.
     * </p>
     * 
     * @return Identifies the production variant that was invoked.
     */

    public String getInvokedProductionVariant() {
        return this.invokedProductionVariant;
    }

    /**
     * <p>
     * Identifies the production variant that was invoked.
     * </p>
     * 
     * @param invokedProductionVariant
     *        Identifies the production variant that was invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointResult withInvokedProductionVariant(String invokedProductionVariant) {
        setInvokedProductionVariant(invokedProductionVariant);
        return this;
    }

    /**
     * <p/>
     * 
     * @param customAttributes
     */

    public void setCustomAttributes(String customAttributes) {
        this.customAttributes = customAttributes;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getCustomAttributes() {
        return this.customAttributes;
    }

    /**
     * <p/>
     * 
     * @param customAttributes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeEndpointResult withCustomAttributes(String customAttributes) {
        setCustomAttributes(customAttributes);
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
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getInvokedProductionVariant() != null)
            sb.append("InvokedProductionVariant: ").append(getInvokedProductionVariant()).append(",");
        if (getCustomAttributes() != null)
            sb.append("CustomAttributes: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeEndpointResult == false)
            return false;
        InvokeEndpointResult other = (InvokeEndpointResult) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getInvokedProductionVariant() == null ^ this.getInvokedProductionVariant() == null)
            return false;
        if (other.getInvokedProductionVariant() != null && other.getInvokedProductionVariant().equals(this.getInvokedProductionVariant()) == false)
            return false;
        if (other.getCustomAttributes() == null ^ this.getCustomAttributes() == null)
            return false;
        if (other.getCustomAttributes() != null && other.getCustomAttributes().equals(this.getCustomAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getInvokedProductionVariant() == null) ? 0 : getInvokedProductionVariant().hashCode());
        hashCode = prime * hashCode + ((getCustomAttributes() == null) ? 0 : getCustomAttributes().hashCode());
        return hashCode;
    }

    @Override
    public InvokeEndpointResult clone() {
        try {
            return (InvokeEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
