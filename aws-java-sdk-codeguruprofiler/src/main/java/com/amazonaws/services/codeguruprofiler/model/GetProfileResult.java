/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The structure representing the getProfileResponse.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The content encoding of the profile.
     * </p>
     */
    private String contentEncoding;
    /**
     * <p>
     * The content type of the profile in the payload. It is either <code>application/json</code> or the default
     * <code>application/x-amzn-ion</code>.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * Information about the profile.
     * </p>
     */
    private java.nio.ByteBuffer profile;

    /**
     * <p>
     * The content encoding of the profile.
     * </p>
     * 
     * @param contentEncoding
     *        The content encoding of the profile.
     */

    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    /**
     * <p>
     * The content encoding of the profile.
     * </p>
     * 
     * @return The content encoding of the profile.
     */

    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * <p>
     * The content encoding of the profile.
     * </p>
     * 
     * @param contentEncoding
     *        The content encoding of the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileResult withContentEncoding(String contentEncoding) {
        setContentEncoding(contentEncoding);
        return this;
    }

    /**
     * <p>
     * The content type of the profile in the payload. It is either <code>application/json</code> or the default
     * <code>application/x-amzn-ion</code>.
     * </p>
     * 
     * @param contentType
     *        The content type of the profile in the payload. It is either <code>application/json</code> or the default
     *        <code>application/x-amzn-ion</code>.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the profile in the payload. It is either <code>application/json</code> or the default
     * <code>application/x-amzn-ion</code>.
     * </p>
     * 
     * @return The content type of the profile in the payload. It is either <code>application/json</code> or the default
     *         <code>application/x-amzn-ion</code>.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the profile in the payload. It is either <code>application/json</code> or the default
     * <code>application/x-amzn-ion</code>.
     * </p>
     * 
     * @param contentType
     *        The content type of the profile in the payload. It is either <code>application/json</code> or the default
     *        <code>application/x-amzn-ion</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * Information about the profile.
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
     * @param profile
     *        Information about the profile.
     */

    public void setProfile(java.nio.ByteBuffer profile) {
        this.profile = profile;
    }

    /**
     * <p>
     * Information about the profile.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Information about the profile.
     */

    public java.nio.ByteBuffer getProfile() {
        return this.profile;
    }

    /**
     * <p>
     * Information about the profile.
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
     * @param profile
     *        Information about the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileResult withProfile(java.nio.ByteBuffer profile) {
        setProfile(profile);
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
        if (getContentEncoding() != null)
            sb.append("ContentEncoding: ").append(getContentEncoding()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getProfile() != null)
            sb.append("Profile: ").append(getProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProfileResult == false)
            return false;
        GetProfileResult other = (GetProfileResult) obj;
        if (other.getContentEncoding() == null ^ this.getContentEncoding() == null)
            return false;
        if (other.getContentEncoding() != null && other.getContentEncoding().equals(this.getContentEncoding()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getProfile() == null ^ this.getProfile() == null)
            return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentEncoding() == null) ? 0 : getContentEncoding().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        return hashCode;
    }

    @Override
    public GetProfileResult clone() {
        try {
            return (GetProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
