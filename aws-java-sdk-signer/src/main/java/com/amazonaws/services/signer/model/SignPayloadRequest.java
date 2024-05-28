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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/SignPayload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignPayloadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the signing profile.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * The AWS account ID of the profile owner.
     * </p>
     */
    private String profileOwner;
    /**
     * <p>
     * Specifies the object digest (hash) to sign.
     * </p>
     */
    private java.nio.ByteBuffer payload;
    /**
     * <p>
     * Payload content type. The single valid type is <code>application/vnd.cncf.notary.payload.v1+json</code>.
     * </p>
     */
    private String payloadFormat;

    /**
     * <p>
     * The name of the signing profile.
     * </p>
     * 
     * @param profileName
     *        The name of the signing profile.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The name of the signing profile.
     * </p>
     * 
     * @return The name of the signing profile.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The name of the signing profile.
     * </p>
     * 
     * @param profileName
     *        The name of the signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignPayloadRequest withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the profile owner.
     * </p>
     * 
     * @param profileOwner
     *        The AWS account ID of the profile owner.
     */

    public void setProfileOwner(String profileOwner) {
        this.profileOwner = profileOwner;
    }

    /**
     * <p>
     * The AWS account ID of the profile owner.
     * </p>
     * 
     * @return The AWS account ID of the profile owner.
     */

    public String getProfileOwner() {
        return this.profileOwner;
    }

    /**
     * <p>
     * The AWS account ID of the profile owner.
     * </p>
     * 
     * @param profileOwner
     *        The AWS account ID of the profile owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignPayloadRequest withProfileOwner(String profileOwner) {
        setProfileOwner(profileOwner);
        return this;
    }

    /**
     * <p>
     * Specifies the object digest (hash) to sign.
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
     * @param payload
     *        Specifies the object digest (hash) to sign.
     */

    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * Specifies the object digest (hash) to sign.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Specifies the object digest (hash) to sign.
     */

    public java.nio.ByteBuffer getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * Specifies the object digest (hash) to sign.
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
     * @param payload
     *        Specifies the object digest (hash) to sign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignPayloadRequest withPayload(java.nio.ByteBuffer payload) {
        setPayload(payload);
        return this;
    }

    /**
     * <p>
     * Payload content type. The single valid type is <code>application/vnd.cncf.notary.payload.v1+json</code>.
     * </p>
     * 
     * @param payloadFormat
     *        Payload content type. The single valid type is <code>application/vnd.cncf.notary.payload.v1+json</code>.
     */

    public void setPayloadFormat(String payloadFormat) {
        this.payloadFormat = payloadFormat;
    }

    /**
     * <p>
     * Payload content type. The single valid type is <code>application/vnd.cncf.notary.payload.v1+json</code>.
     * </p>
     * 
     * @return Payload content type. The single valid type is <code>application/vnd.cncf.notary.payload.v1+json</code>.
     */

    public String getPayloadFormat() {
        return this.payloadFormat;
    }

    /**
     * <p>
     * Payload content type. The single valid type is <code>application/vnd.cncf.notary.payload.v1+json</code>.
     * </p>
     * 
     * @param payloadFormat
     *        Payload content type. The single valid type is <code>application/vnd.cncf.notary.payload.v1+json</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignPayloadRequest withPayloadFormat(String payloadFormat) {
        setPayloadFormat(payloadFormat);
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
        if (getProfileName() != null)
            sb.append("ProfileName: ").append(getProfileName()).append(",");
        if (getProfileOwner() != null)
            sb.append("ProfileOwner: ").append(getProfileOwner()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload()).append(",");
        if (getPayloadFormat() != null)
            sb.append("PayloadFormat: ").append(getPayloadFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignPayloadRequest == false)
            return false;
        SignPayloadRequest other = (SignPayloadRequest) obj;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getProfileOwner() == null ^ this.getProfileOwner() == null)
            return false;
        if (other.getProfileOwner() != null && other.getProfileOwner().equals(this.getProfileOwner()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getPayloadFormat() == null ^ this.getPayloadFormat() == null)
            return false;
        if (other.getPayloadFormat() != null && other.getPayloadFormat().equals(this.getPayloadFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getProfileOwner() == null) ? 0 : getProfileOwner().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode + ((getPayloadFormat() == null) ? 0 : getPayloadFormat().hashCode());
        return hashCode;
    }

    @Override
    public SignPayloadRequest clone() {
        return (SignPayloadRequest) super.clone();
    }

}
