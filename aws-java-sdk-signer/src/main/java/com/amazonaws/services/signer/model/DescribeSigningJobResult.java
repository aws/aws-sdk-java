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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/DescribeSigningJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSigningJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the signing job on output.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The object that contains the name of your S3 bucket or your raw code.
     * </p>
     */
    private Source source;
    /**
     * <p>
     * Amazon Resource Name (ARN) of your code signing certificate.
     * </p>
     */
    private SigningMaterial signingMaterial;
    /**
     * <p>
     * The microcontroller platform to which your signed code image will be distributed.
     * </p>
     */
    private String platformId;
    /**
     * <p>
     * The name of the profile that initiated the signing operation.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * A list of any overrides that were applied to the signing operation.
     * </p>
     */
    private SigningPlatformOverrides overrides;
    /**
     * <p>
     * Map of user-assigned key-value pairs used during signing. These values contain any information that you specified
     * for use in your signing job.
     * </p>
     */
    private java.util.Map<String, String> signingParameters;
    /**
     * <p>
     * Date and time that the signing job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Date and time that the signing job was completed.
     * </p>
     */
    private java.util.Date completedAt;
    /**
     * <p>
     * The IAM principal that requested the signing job.
     * </p>
     */
    private String requestedBy;
    /**
     * <p>
     * Status of the signing job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * String value that contains the status reason.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * Name of the S3 bucket where the signed code image is saved by AWS Signer.
     * </p>
     */
    private SignedObject signedObject;

    /**
     * <p>
     * The ID of the signing job on output.
     * </p>
     * 
     * @param jobId
     *        The ID of the signing job on output.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the signing job on output.
     * </p>
     * 
     * @return The ID of the signing job on output.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the signing job on output.
     * </p>
     * 
     * @param jobId
     *        The ID of the signing job on output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSigningJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The object that contains the name of your S3 bucket or your raw code.
     * </p>
     * 
     * @param source
     *        The object that contains the name of your S3 bucket or your raw code.
     */

    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * <p>
     * The object that contains the name of your S3 bucket or your raw code.
     * </p>
     * 
     * @return The object that contains the name of your S3 bucket or your raw code.
     */

    public Source getSource() {
        return this.source;
    }

    /**
     * <p>
     * The object that contains the name of your S3 bucket or your raw code.
     * </p>
     * 
     * @param source
     *        The object that contains the name of your S3 bucket or your raw code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSigningJobResult withSource(Source source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of your code signing certificate.
     * </p>
     * 
     * @param signingMaterial
     *        Amazon Resource Name (ARN) of your code signing certificate.
     */

    public void setSigningMaterial(SigningMaterial signingMaterial) {
        this.signingMaterial = signingMaterial;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of your code signing certificate.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of your code signing certificate.
     */

    public SigningMaterial getSigningMaterial() {
        return this.signingMaterial;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of your code signing certificate.
     * </p>
     * 
     * @param signingMaterial
     *        Amazon Resource Name (ARN) of your code signing certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSigningJobResult withSigningMaterial(SigningMaterial signingMaterial) {
        setSigningMaterial(signingMaterial);
        return this;
    }

    /**
     * <p>
     * The microcontroller platform to which your signed code image will be distributed.
     * </p>
     * 
     * @param platformId
     *        The microcontroller platform to which your signed code image will be distributed.
     */

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    /**
     * <p>
     * The microcontroller platform to which your signed code image will be distributed.
     * </p>
     * 
     * @return The microcontroller platform to which your signed code image will be distributed.
     */

    public String getPlatformId() {
        return this.platformId;
    }

    /**
     * <p>
     * The microcontroller platform to which your signed code image will be distributed.
     * </p>
     * 
     * @param platformId
     *        The microcontroller platform to which your signed code image will be distributed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSigningJobResult withPlatformId(String platformId) {
        setPlatformId(platformId);
        return this;
    }

    /**
     * <p>
     * The name of the profile that initiated the signing operation.
     * </p>
     * 
     * @param profileName
     *        The name of the profile that initiated the signing operation.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The name of the profile that initiated the signing operation.
     * </p>
     * 
     * @return The name of the profile that initiated the signing operation.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The name of the profile that initiated the signing operation.
     * </p>
     * 
     * @param profileName
     *        The name of the profile that initiated the signing operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSigningJobResult withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * A list of any overrides that were applied to the signing operation.
     * </p>
     * 
     * @param overrides
     *        A list of any overrides that were applied to the signing operation.
     */

    public void setOverrides(SigningPlatformOverrides overrides) {
        this.overrides = overrides;
    }

    /**
     * <p>
     * A list of any overrides that were applied to the signing operation.
     * </p>
     * 
     * @return A list of any overrides that were applied to the signing operation.
     */

    public SigningPlatformOverrides getOverrides() {
        return this.overrides;
    }

    /**
     * <p>
     * A list of any overrides that were applied to the signing operation.
     * </p>
     * 
     * @param overrides
     *        A list of any overrides that were applied to the signing operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSigningJobResult withOverrides(SigningPlatformOverrides overrides) {
        setOverrides(overrides);
        return this;
    }

    /**
     * <p>
     * Map of user-assigned key-value pairs used during signing. These values contain any information that you specified
     * for use in your signing job.
     * </p>
     * 
     * @return Map of user-assigned key-value pairs used during signing. These values contain any information that you
     *         specified for use in your signing job.
     */

    public java.util.Map<String, String> getSigningParameters() {
        return signingParameters;
    }

    /**
     * <p>
     * Map of user-assigned key-value pairs used during signing. These values contain any information that you specified
     * for use in your signing job.
     * </p>
     * 
     * @param signingParameters
     *        Map of user-assigned key-value pairs used during signing. These values contain any information that you
     *        specified for use in your signing job.
     */

    public void setSigningParameters(java.util.Map<String, String> signingParameters) {
        this.signingParameters = signingParameters;
    }

    /**
     * <p>
     * Map of user-assigned key-value pairs used during signing. These values contain any information that you specified
     * for use in your signing job.
     * </p>
     * 
     * @param signingParameters
     *        Map of user-assigned key-value pairs used during signing. These values contain any information that you
     *        specified for use in your signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSigningJobResult withSigningParameters(java.util.Map<String, String> signingParameters) {
        setSigningParameters(signingParameters);
        return this;
    }

    public DescribeSigningJobResult addSigningParametersEntry(String key, String value) {
        if (null == this.signingParameters) {
            this.signingParameters = new java.util.HashMap<String, String>();
        }
        if (this.signingParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.signingParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SigningParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSigningJobResult clearSigningParametersEntries() {
        this.signingParameters = null;
        return this;
    }

    /**
     * <p>
     * Date and time that the signing job was created.
     * </p>
     * 
     * @param createdAt
     *        Date and time that the signing job was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Date and time that the signing job was created.
     * </p>
     * 
     * @return Date and time that the signing job was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Date and time that the signing job was created.
     * </p>
     * 
     * @param createdAt
     *        Date and time that the signing job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSigningJobResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Date and time that the signing job was completed.
     * </p>
     * 
     * @param completedAt
     *        Date and time that the signing job was completed.
     */

    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * Date and time that the signing job was completed.
     * </p>
     * 
     * @return Date and time that the signing job was completed.
     */

    public java.util.Date getCompletedAt() {
        return this.completedAt;
    }

    /**
     * <p>
     * Date and time that the signing job was completed.
     * </p>
     * 
     * @param completedAt
     *        Date and time that the signing job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSigningJobResult withCompletedAt(java.util.Date completedAt) {
        setCompletedAt(completedAt);
        return this;
    }

    /**
     * <p>
     * The IAM principal that requested the signing job.
     * </p>
     * 
     * @param requestedBy
     *        The IAM principal that requested the signing job.
     */

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    /**
     * <p>
     * The IAM principal that requested the signing job.
     * </p>
     * 
     * @return The IAM principal that requested the signing job.
     */

    public String getRequestedBy() {
        return this.requestedBy;
    }

    /**
     * <p>
     * The IAM principal that requested the signing job.
     * </p>
     * 
     * @param requestedBy
     *        The IAM principal that requested the signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSigningJobResult withRequestedBy(String requestedBy) {
        setRequestedBy(requestedBy);
        return this;
    }

    /**
     * <p>
     * Status of the signing job.
     * </p>
     * 
     * @param status
     *        Status of the signing job.
     * @see SigningStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the signing job.
     * </p>
     * 
     * @return Status of the signing job.
     * @see SigningStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the signing job.
     * </p>
     * 
     * @param status
     *        Status of the signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningStatus
     */

    public DescribeSigningJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the signing job.
     * </p>
     * 
     * @param status
     *        Status of the signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningStatus
     */

    public DescribeSigningJobResult withStatus(SigningStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * String value that contains the status reason.
     * </p>
     * 
     * @param statusReason
     *        String value that contains the status reason.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * String value that contains the status reason.
     * </p>
     * 
     * @return String value that contains the status reason.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * String value that contains the status reason.
     * </p>
     * 
     * @param statusReason
     *        String value that contains the status reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSigningJobResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * Name of the S3 bucket where the signed code image is saved by AWS Signer.
     * </p>
     * 
     * @param signedObject
     *        Name of the S3 bucket where the signed code image is saved by AWS Signer.
     */

    public void setSignedObject(SignedObject signedObject) {
        this.signedObject = signedObject;
    }

    /**
     * <p>
     * Name of the S3 bucket where the signed code image is saved by AWS Signer.
     * </p>
     * 
     * @return Name of the S3 bucket where the signed code image is saved by AWS Signer.
     */

    public SignedObject getSignedObject() {
        return this.signedObject;
    }

    /**
     * <p>
     * Name of the S3 bucket where the signed code image is saved by AWS Signer.
     * </p>
     * 
     * @param signedObject
     *        Name of the S3 bucket where the signed code image is saved by AWS Signer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSigningJobResult withSignedObject(SignedObject signedObject) {
        setSignedObject(signedObject);
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
        if (getSigningMaterial() != null)
            sb.append("SigningMaterial: ").append(getSigningMaterial()).append(",");
        if (getPlatformId() != null)
            sb.append("PlatformId: ").append(getPlatformId()).append(",");
        if (getProfileName() != null)
            sb.append("ProfileName: ").append(getProfileName()).append(",");
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides()).append(",");
        if (getSigningParameters() != null)
            sb.append("SigningParameters: ").append(getSigningParameters()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCompletedAt() != null)
            sb.append("CompletedAt: ").append(getCompletedAt()).append(",");
        if (getRequestedBy() != null)
            sb.append("RequestedBy: ").append(getRequestedBy()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getSignedObject() != null)
            sb.append("SignedObject: ").append(getSignedObject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSigningJobResult == false)
            return false;
        DescribeSigningJobResult other = (DescribeSigningJobResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSigningMaterial() == null ^ this.getSigningMaterial() == null)
            return false;
        if (other.getSigningMaterial() != null && other.getSigningMaterial().equals(this.getSigningMaterial()) == false)
            return false;
        if (other.getPlatformId() == null ^ this.getPlatformId() == null)
            return false;
        if (other.getPlatformId() != null && other.getPlatformId().equals(this.getPlatformId()) == false)
            return false;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        if (other.getSigningParameters() == null ^ this.getSigningParameters() == null)
            return false;
        if (other.getSigningParameters() != null && other.getSigningParameters().equals(this.getSigningParameters()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null)
            return false;
        if (other.getCompletedAt() != null && other.getCompletedAt().equals(this.getCompletedAt()) == false)
            return false;
        if (other.getRequestedBy() == null ^ this.getRequestedBy() == null)
            return false;
        if (other.getRequestedBy() != null && other.getRequestedBy().equals(this.getRequestedBy()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getSignedObject() == null ^ this.getSignedObject() == null)
            return false;
        if (other.getSignedObject() != null && other.getSignedObject().equals(this.getSignedObject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSigningMaterial() == null) ? 0 : getSigningMaterial().hashCode());
        hashCode = prime * hashCode + ((getPlatformId() == null) ? 0 : getPlatformId().hashCode());
        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        hashCode = prime * hashCode + ((getSigningParameters() == null) ? 0 : getSigningParameters().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode());
        hashCode = prime * hashCode + ((getRequestedBy() == null) ? 0 : getRequestedBy().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getSignedObject() == null) ? 0 : getSignedObject().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSigningJobResult clone() {
        try {
            return (DescribeSigningJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
