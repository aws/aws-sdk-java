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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/SignPayload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignPayloadResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier of the signing job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The AWS account ID of the job owner.
     * </p>
     */
    private String jobOwner;
    /**
     * <p>
     * Information including the signing profile ARN and the signing job ID.
     * </p>
     */
    private java.util.Map<String, String> metadata;
    /**
     * <p>
     * A cryptographic signature.
     * </p>
     */
    private java.nio.ByteBuffer signature;

    /**
     * <p>
     * Unique identifier of the signing job.
     * </p>
     * 
     * @param jobId
     *        Unique identifier of the signing job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * Unique identifier of the signing job.
     * </p>
     * 
     * @return Unique identifier of the signing job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * Unique identifier of the signing job.
     * </p>
     * 
     * @param jobId
     *        Unique identifier of the signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignPayloadResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the job owner.
     * </p>
     * 
     * @param jobOwner
     *        The AWS account ID of the job owner.
     */

    public void setJobOwner(String jobOwner) {
        this.jobOwner = jobOwner;
    }

    /**
     * <p>
     * The AWS account ID of the job owner.
     * </p>
     * 
     * @return The AWS account ID of the job owner.
     */

    public String getJobOwner() {
        return this.jobOwner;
    }

    /**
     * <p>
     * The AWS account ID of the job owner.
     * </p>
     * 
     * @param jobOwner
     *        The AWS account ID of the job owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignPayloadResult withJobOwner(String jobOwner) {
        setJobOwner(jobOwner);
        return this;
    }

    /**
     * <p>
     * Information including the signing profile ARN and the signing job ID.
     * </p>
     * 
     * @return Information including the signing profile ARN and the signing job ID.
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * Information including the signing profile ARN and the signing job ID.
     * </p>
     * 
     * @param metadata
     *        Information including the signing profile ARN and the signing job ID.
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Information including the signing profile ARN and the signing job ID.
     * </p>
     * 
     * @param metadata
     *        Information including the signing profile ARN and the signing job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignPayloadResult withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see SignPayloadResult#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SignPayloadResult addMetadataEntry(String key, String value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, String>();
        }
        if (this.metadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignPayloadResult clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * A cryptographic signature.
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
     * @param signature
     *        A cryptographic signature.
     */

    public void setSignature(java.nio.ByteBuffer signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * A cryptographic signature.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return A cryptographic signature.
     */

    public java.nio.ByteBuffer getSignature() {
        return this.signature;
    }

    /**
     * <p>
     * A cryptographic signature.
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
     * @param signature
     *        A cryptographic signature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignPayloadResult withSignature(java.nio.ByteBuffer signature) {
        setSignature(signature);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobOwner() != null)
            sb.append("JobOwner: ").append(getJobOwner()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getSignature() != null)
            sb.append("Signature: ").append(getSignature());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignPayloadResult == false)
            return false;
        SignPayloadResult other = (SignPayloadResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobOwner() == null ^ this.getJobOwner() == null)
            return false;
        if (other.getJobOwner() != null && other.getJobOwner().equals(this.getJobOwner()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobOwner() == null) ? 0 : getJobOwner().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        return hashCode;
    }

    @Override
    public SignPayloadResult clone() {
        try {
            return (SignPayloadResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
