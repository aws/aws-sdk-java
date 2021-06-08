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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a signing job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/SigningJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SigningJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the signing job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * A <code>Source</code> that contains information about a signing job's code image source.
     * </p>
     */
    private Source source;
    /**
     * <p>
     * A <code>SignedObject</code> structure that contains information about a signing job's signed code image.
     * </p>
     */
    private SignedObject signedObject;
    /**
     * <p>
     * A <code>SigningMaterial</code> object that contains the Amazon Resource Name (ARN) of the certificate used for
     * the signing job.
     * </p>
     */
    private SigningMaterial signingMaterial;
    /**
     * <p>
     * The date and time that the signing job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The status of the signing job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates whether the signing job is revoked.
     * </p>
     */
    private Boolean isRevoked;
    /**
     * <p>
     * The name of the signing profile that created a signing job.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * The version of the signing profile that created a signing job.
     * </p>
     */
    private String profileVersion;
    /**
     * <p>
     * The unique identifier for a signing platform.
     * </p>
     */
    private String platformId;
    /**
     * <p>
     * The name of a signing platform.
     * </p>
     */
    private String platformDisplayName;
    /**
     * <p>
     * The time when the signature of a signing job expires.
     * </p>
     */
    private java.util.Date signatureExpiresAt;
    /**
     * <p>
     * The AWS account ID of the job owner.
     * </p>
     */
    private String jobOwner;
    /**
     * <p>
     * The AWS account ID of the job invoker.
     * </p>
     */
    private String jobInvoker;

    /**
     * <p>
     * The ID of the signing job.
     * </p>
     * 
     * @param jobId
     *        The ID of the signing job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the signing job.
     * </p>
     * 
     * @return The ID of the signing job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the signing job.
     * </p>
     * 
     * @param jobId
     *        The ID of the signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * A <code>Source</code> that contains information about a signing job's code image source.
     * </p>
     * 
     * @param source
     *        A <code>Source</code> that contains information about a signing job's code image source.
     */

    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * <p>
     * A <code>Source</code> that contains information about a signing job's code image source.
     * </p>
     * 
     * @return A <code>Source</code> that contains information about a signing job's code image source.
     */

    public Source getSource() {
        return this.source;
    }

    /**
     * <p>
     * A <code>Source</code> that contains information about a signing job's code image source.
     * </p>
     * 
     * @param source
     *        A <code>Source</code> that contains information about a signing job's code image source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withSource(Source source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * A <code>SignedObject</code> structure that contains information about a signing job's signed code image.
     * </p>
     * 
     * @param signedObject
     *        A <code>SignedObject</code> structure that contains information about a signing job's signed code image.
     */

    public void setSignedObject(SignedObject signedObject) {
        this.signedObject = signedObject;
    }

    /**
     * <p>
     * A <code>SignedObject</code> structure that contains information about a signing job's signed code image.
     * </p>
     * 
     * @return A <code>SignedObject</code> structure that contains information about a signing job's signed code image.
     */

    public SignedObject getSignedObject() {
        return this.signedObject;
    }

    /**
     * <p>
     * A <code>SignedObject</code> structure that contains information about a signing job's signed code image.
     * </p>
     * 
     * @param signedObject
     *        A <code>SignedObject</code> structure that contains information about a signing job's signed code image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withSignedObject(SignedObject signedObject) {
        setSignedObject(signedObject);
        return this;
    }

    /**
     * <p>
     * A <code>SigningMaterial</code> object that contains the Amazon Resource Name (ARN) of the certificate used for
     * the signing job.
     * </p>
     * 
     * @param signingMaterial
     *        A <code>SigningMaterial</code> object that contains the Amazon Resource Name (ARN) of the certificate used
     *        for the signing job.
     */

    public void setSigningMaterial(SigningMaterial signingMaterial) {
        this.signingMaterial = signingMaterial;
    }

    /**
     * <p>
     * A <code>SigningMaterial</code> object that contains the Amazon Resource Name (ARN) of the certificate used for
     * the signing job.
     * </p>
     * 
     * @return A <code>SigningMaterial</code> object that contains the Amazon Resource Name (ARN) of the certificate
     *         used for the signing job.
     */

    public SigningMaterial getSigningMaterial() {
        return this.signingMaterial;
    }

    /**
     * <p>
     * A <code>SigningMaterial</code> object that contains the Amazon Resource Name (ARN) of the certificate used for
     * the signing job.
     * </p>
     * 
     * @param signingMaterial
     *        A <code>SigningMaterial</code> object that contains the Amazon Resource Name (ARN) of the certificate used
     *        for the signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withSigningMaterial(SigningMaterial signingMaterial) {
        setSigningMaterial(signingMaterial);
        return this;
    }

    /**
     * <p>
     * The date and time that the signing job was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the signing job was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the signing job was created.
     * </p>
     * 
     * @return The date and time that the signing job was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the signing job was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the signing job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The status of the signing job.
     * </p>
     * 
     * @param status
     *        The status of the signing job.
     * @see SigningStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the signing job.
     * </p>
     * 
     * @return The status of the signing job.
     * @see SigningStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the signing job.
     * </p>
     * 
     * @param status
     *        The status of the signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningStatus
     */

    public SigningJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the signing job.
     * </p>
     * 
     * @param status
     *        The status of the signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningStatus
     */

    public SigningJob withStatus(SigningStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the signing job is revoked.
     * </p>
     * 
     * @param isRevoked
     *        Indicates whether the signing job is revoked.
     */

    public void setIsRevoked(Boolean isRevoked) {
        this.isRevoked = isRevoked;
    }

    /**
     * <p>
     * Indicates whether the signing job is revoked.
     * </p>
     * 
     * @return Indicates whether the signing job is revoked.
     */

    public Boolean getIsRevoked() {
        return this.isRevoked;
    }

    /**
     * <p>
     * Indicates whether the signing job is revoked.
     * </p>
     * 
     * @param isRevoked
     *        Indicates whether the signing job is revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withIsRevoked(Boolean isRevoked) {
        setIsRevoked(isRevoked);
        return this;
    }

    /**
     * <p>
     * Indicates whether the signing job is revoked.
     * </p>
     * 
     * @return Indicates whether the signing job is revoked.
     */

    public Boolean isRevoked() {
        return this.isRevoked;
    }

    /**
     * <p>
     * The name of the signing profile that created a signing job.
     * </p>
     * 
     * @param profileName
     *        The name of the signing profile that created a signing job.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The name of the signing profile that created a signing job.
     * </p>
     * 
     * @return The name of the signing profile that created a signing job.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The name of the signing profile that created a signing job.
     * </p>
     * 
     * @param profileName
     *        The name of the signing profile that created a signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * The version of the signing profile that created a signing job.
     * </p>
     * 
     * @param profileVersion
     *        The version of the signing profile that created a signing job.
     */

    public void setProfileVersion(String profileVersion) {
        this.profileVersion = profileVersion;
    }

    /**
     * <p>
     * The version of the signing profile that created a signing job.
     * </p>
     * 
     * @return The version of the signing profile that created a signing job.
     */

    public String getProfileVersion() {
        return this.profileVersion;
    }

    /**
     * <p>
     * The version of the signing profile that created a signing job.
     * </p>
     * 
     * @param profileVersion
     *        The version of the signing profile that created a signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withProfileVersion(String profileVersion) {
        setProfileVersion(profileVersion);
        return this;
    }

    /**
     * <p>
     * The unique identifier for a signing platform.
     * </p>
     * 
     * @param platformId
     *        The unique identifier for a signing platform.
     */

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    /**
     * <p>
     * The unique identifier for a signing platform.
     * </p>
     * 
     * @return The unique identifier for a signing platform.
     */

    public String getPlatformId() {
        return this.platformId;
    }

    /**
     * <p>
     * The unique identifier for a signing platform.
     * </p>
     * 
     * @param platformId
     *        The unique identifier for a signing platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withPlatformId(String platformId) {
        setPlatformId(platformId);
        return this;
    }

    /**
     * <p>
     * The name of a signing platform.
     * </p>
     * 
     * @param platformDisplayName
     *        The name of a signing platform.
     */

    public void setPlatformDisplayName(String platformDisplayName) {
        this.platformDisplayName = platformDisplayName;
    }

    /**
     * <p>
     * The name of a signing platform.
     * </p>
     * 
     * @return The name of a signing platform.
     */

    public String getPlatformDisplayName() {
        return this.platformDisplayName;
    }

    /**
     * <p>
     * The name of a signing platform.
     * </p>
     * 
     * @param platformDisplayName
     *        The name of a signing platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withPlatformDisplayName(String platformDisplayName) {
        setPlatformDisplayName(platformDisplayName);
        return this;
    }

    /**
     * <p>
     * The time when the signature of a signing job expires.
     * </p>
     * 
     * @param signatureExpiresAt
     *        The time when the signature of a signing job expires.
     */

    public void setSignatureExpiresAt(java.util.Date signatureExpiresAt) {
        this.signatureExpiresAt = signatureExpiresAt;
    }

    /**
     * <p>
     * The time when the signature of a signing job expires.
     * </p>
     * 
     * @return The time when the signature of a signing job expires.
     */

    public java.util.Date getSignatureExpiresAt() {
        return this.signatureExpiresAt;
    }

    /**
     * <p>
     * The time when the signature of a signing job expires.
     * </p>
     * 
     * @param signatureExpiresAt
     *        The time when the signature of a signing job expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withSignatureExpiresAt(java.util.Date signatureExpiresAt) {
        setSignatureExpiresAt(signatureExpiresAt);
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

    public SigningJob withJobOwner(String jobOwner) {
        setJobOwner(jobOwner);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the job invoker.
     * </p>
     * 
     * @param jobInvoker
     *        The AWS account ID of the job invoker.
     */

    public void setJobInvoker(String jobInvoker) {
        this.jobInvoker = jobInvoker;
    }

    /**
     * <p>
     * The AWS account ID of the job invoker.
     * </p>
     * 
     * @return The AWS account ID of the job invoker.
     */

    public String getJobInvoker() {
        return this.jobInvoker;
    }

    /**
     * <p>
     * The AWS account ID of the job invoker.
     * </p>
     * 
     * @param jobInvoker
     *        The AWS account ID of the job invoker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withJobInvoker(String jobInvoker) {
        setJobInvoker(jobInvoker);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSignedObject() != null)
            sb.append("SignedObject: ").append(getSignedObject()).append(",");
        if (getSigningMaterial() != null)
            sb.append("SigningMaterial: ").append(getSigningMaterial()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getIsRevoked() != null)
            sb.append("IsRevoked: ").append(getIsRevoked()).append(",");
        if (getProfileName() != null)
            sb.append("ProfileName: ").append(getProfileName()).append(",");
        if (getProfileVersion() != null)
            sb.append("ProfileVersion: ").append(getProfileVersion()).append(",");
        if (getPlatformId() != null)
            sb.append("PlatformId: ").append(getPlatformId()).append(",");
        if (getPlatformDisplayName() != null)
            sb.append("PlatformDisplayName: ").append(getPlatformDisplayName()).append(",");
        if (getSignatureExpiresAt() != null)
            sb.append("SignatureExpiresAt: ").append(getSignatureExpiresAt()).append(",");
        if (getJobOwner() != null)
            sb.append("JobOwner: ").append(getJobOwner()).append(",");
        if (getJobInvoker() != null)
            sb.append("JobInvoker: ").append(getJobInvoker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SigningJob == false)
            return false;
        SigningJob other = (SigningJob) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSignedObject() == null ^ this.getSignedObject() == null)
            return false;
        if (other.getSignedObject() != null && other.getSignedObject().equals(this.getSignedObject()) == false)
            return false;
        if (other.getSigningMaterial() == null ^ this.getSigningMaterial() == null)
            return false;
        if (other.getSigningMaterial() != null && other.getSigningMaterial().equals(this.getSigningMaterial()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getIsRevoked() == null ^ this.getIsRevoked() == null)
            return false;
        if (other.getIsRevoked() != null && other.getIsRevoked().equals(this.getIsRevoked()) == false)
            return false;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getProfileVersion() == null ^ this.getProfileVersion() == null)
            return false;
        if (other.getProfileVersion() != null && other.getProfileVersion().equals(this.getProfileVersion()) == false)
            return false;
        if (other.getPlatformId() == null ^ this.getPlatformId() == null)
            return false;
        if (other.getPlatformId() != null && other.getPlatformId().equals(this.getPlatformId()) == false)
            return false;
        if (other.getPlatformDisplayName() == null ^ this.getPlatformDisplayName() == null)
            return false;
        if (other.getPlatformDisplayName() != null && other.getPlatformDisplayName().equals(this.getPlatformDisplayName()) == false)
            return false;
        if (other.getSignatureExpiresAt() == null ^ this.getSignatureExpiresAt() == null)
            return false;
        if (other.getSignatureExpiresAt() != null && other.getSignatureExpiresAt().equals(this.getSignatureExpiresAt()) == false)
            return false;
        if (other.getJobOwner() == null ^ this.getJobOwner() == null)
            return false;
        if (other.getJobOwner() != null && other.getJobOwner().equals(this.getJobOwner()) == false)
            return false;
        if (other.getJobInvoker() == null ^ this.getJobInvoker() == null)
            return false;
        if (other.getJobInvoker() != null && other.getJobInvoker().equals(this.getJobInvoker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSignedObject() == null) ? 0 : getSignedObject().hashCode());
        hashCode = prime * hashCode + ((getSigningMaterial() == null) ? 0 : getSigningMaterial().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getIsRevoked() == null) ? 0 : getIsRevoked().hashCode());
        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getProfileVersion() == null) ? 0 : getProfileVersion().hashCode());
        hashCode = prime * hashCode + ((getPlatformId() == null) ? 0 : getPlatformId().hashCode());
        hashCode = prime * hashCode + ((getPlatformDisplayName() == null) ? 0 : getPlatformDisplayName().hashCode());
        hashCode = prime * hashCode + ((getSignatureExpiresAt() == null) ? 0 : getSignatureExpiresAt().hashCode());
        hashCode = prime * hashCode + ((getJobOwner() == null) ? 0 : getJobOwner().hashCode());
        hashCode = prime * hashCode + ((getJobInvoker() == null) ? 0 : getJobInvoker().hashCode());
        return hashCode;
    }

    @Override
    public SigningJob clone() {
        try {
            return (SigningJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.SigningJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
