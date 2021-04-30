/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetFunction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFunctionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The function code of a CloudFront function.
     * </p>
     */
    private java.nio.ByteBuffer functionCode;
    /**
     * <p>
     * The version identifier for the current version of the CloudFront function.
     * </p>
     */
    private String eTag;
    /**
     * <p>
     * The content type (media type) of the response.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The function code of a CloudFront function.
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
     * @param functionCode
     *        The function code of a CloudFront function.
     */

    public void setFunctionCode(java.nio.ByteBuffer functionCode) {
        this.functionCode = functionCode;
    }

    /**
     * <p>
     * The function code of a CloudFront function.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The function code of a CloudFront function.
     */

    public java.nio.ByteBuffer getFunctionCode() {
        return this.functionCode;
    }

    /**
     * <p>
     * The function code of a CloudFront function.
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
     * @param functionCode
     *        The function code of a CloudFront function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionResult withFunctionCode(java.nio.ByteBuffer functionCode) {
        setFunctionCode(functionCode);
        return this;
    }

    /**
     * <p>
     * The version identifier for the current version of the CloudFront function.
     * </p>
     * 
     * @param eTag
     *        The version identifier for the current version of the CloudFront function.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The version identifier for the current version of the CloudFront function.
     * </p>
     * 
     * @return The version identifier for the current version of the CloudFront function.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The version identifier for the current version of the CloudFront function.
     * </p>
     * 
     * @param eTag
     *        The version identifier for the current version of the CloudFront function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionResult withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * <p>
     * The content type (media type) of the response.
     * </p>
     * 
     * @param contentType
     *        The content type (media type) of the response.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type (media type) of the response.
     * </p>
     * 
     * @return The content type (media type) of the response.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type (media type) of the response.
     * </p>
     * 
     * @param contentType
     *        The content type (media type) of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFunctionResult withContentType(String contentType) {
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
        if (getFunctionCode() != null)
            sb.append("FunctionCode: ").append("***Sensitive Data Redacted***").append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag()).append(",");
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

        if (obj instanceof GetFunctionResult == false)
            return false;
        GetFunctionResult other = (GetFunctionResult) obj;
        if (other.getFunctionCode() == null ^ this.getFunctionCode() == null)
            return false;
        if (other.getFunctionCode() != null && other.getFunctionCode().equals(this.getFunctionCode()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
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

        hashCode = prime * hashCode + ((getFunctionCode() == null) ? 0 : getFunctionCode().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public GetFunctionResult clone() {
        try {
            return (GetFunctionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
