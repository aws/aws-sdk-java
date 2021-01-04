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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/GetSigningProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSigningProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the target signing profile.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * The current version of the signing profile.
     * </p>
     */
    private String profileVersion;
    /**
     * <p>
     * The signing profile ARN, including the profile version.
     * </p>
     */
    private String profileVersionArn;

    private SigningProfileRevocationRecord revocationRecord;
    /**
     * <p>
     * The ARN of the certificate that the target profile uses for signing operations.
     * </p>
     */
    private SigningMaterial signingMaterial;
    /**
     * <p>
     * The ID of the platform that is used by the target signing profile.
     * </p>
     */
    private String platformId;
    /**
     * <p>
     * A human-readable name for the signing platform associated with the signing profile.
     * </p>
     */
    private String platformDisplayName;

    private SignatureValidityPeriod signatureValidityPeriod;
    /**
     * <p>
     * A list of overrides applied by the target signing profile for signing operations.
     * </p>
     */
    private SigningPlatformOverrides overrides;
    /**
     * <p>
     * A map of key-value pairs for signing operations that is attached to the target signing profile.
     * </p>
     */
    private java.util.Map<String, String> signingParameters;
    /**
     * <p>
     * The status of the target signing profile.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Reason for the status of the target signing profile.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the signing profile.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A list of tags associated with the signing profile.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the target signing profile.
     * </p>
     * 
     * @param profileName
     *        The name of the target signing profile.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The name of the target signing profile.
     * </p>
     * 
     * @return The name of the target signing profile.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The name of the target signing profile.
     * </p>
     * 
     * @param profileName
     *        The name of the target signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * The current version of the signing profile.
     * </p>
     * 
     * @param profileVersion
     *        The current version of the signing profile.
     */

    public void setProfileVersion(String profileVersion) {
        this.profileVersion = profileVersion;
    }

    /**
     * <p>
     * The current version of the signing profile.
     * </p>
     * 
     * @return The current version of the signing profile.
     */

    public String getProfileVersion() {
        return this.profileVersion;
    }

    /**
     * <p>
     * The current version of the signing profile.
     * </p>
     * 
     * @param profileVersion
     *        The current version of the signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult withProfileVersion(String profileVersion) {
        setProfileVersion(profileVersion);
        return this;
    }

    /**
     * <p>
     * The signing profile ARN, including the profile version.
     * </p>
     * 
     * @param profileVersionArn
     *        The signing profile ARN, including the profile version.
     */

    public void setProfileVersionArn(String profileVersionArn) {
        this.profileVersionArn = profileVersionArn;
    }

    /**
     * <p>
     * The signing profile ARN, including the profile version.
     * </p>
     * 
     * @return The signing profile ARN, including the profile version.
     */

    public String getProfileVersionArn() {
        return this.profileVersionArn;
    }

    /**
     * <p>
     * The signing profile ARN, including the profile version.
     * </p>
     * 
     * @param profileVersionArn
     *        The signing profile ARN, including the profile version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult withProfileVersionArn(String profileVersionArn) {
        setProfileVersionArn(profileVersionArn);
        return this;
    }

    /**
     * @param revocationRecord
     */

    public void setRevocationRecord(SigningProfileRevocationRecord revocationRecord) {
        this.revocationRecord = revocationRecord;
    }

    /**
     * @return
     */

    public SigningProfileRevocationRecord getRevocationRecord() {
        return this.revocationRecord;
    }

    /**
     * @param revocationRecord
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult withRevocationRecord(SigningProfileRevocationRecord revocationRecord) {
        setRevocationRecord(revocationRecord);
        return this;
    }

    /**
     * <p>
     * The ARN of the certificate that the target profile uses for signing operations.
     * </p>
     * 
     * @param signingMaterial
     *        The ARN of the certificate that the target profile uses for signing operations.
     */

    public void setSigningMaterial(SigningMaterial signingMaterial) {
        this.signingMaterial = signingMaterial;
    }

    /**
     * <p>
     * The ARN of the certificate that the target profile uses for signing operations.
     * </p>
     * 
     * @return The ARN of the certificate that the target profile uses for signing operations.
     */

    public SigningMaterial getSigningMaterial() {
        return this.signingMaterial;
    }

    /**
     * <p>
     * The ARN of the certificate that the target profile uses for signing operations.
     * </p>
     * 
     * @param signingMaterial
     *        The ARN of the certificate that the target profile uses for signing operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult withSigningMaterial(SigningMaterial signingMaterial) {
        setSigningMaterial(signingMaterial);
        return this;
    }

    /**
     * <p>
     * The ID of the platform that is used by the target signing profile.
     * </p>
     * 
     * @param platformId
     *        The ID of the platform that is used by the target signing profile.
     */

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    /**
     * <p>
     * The ID of the platform that is used by the target signing profile.
     * </p>
     * 
     * @return The ID of the platform that is used by the target signing profile.
     */

    public String getPlatformId() {
        return this.platformId;
    }

    /**
     * <p>
     * The ID of the platform that is used by the target signing profile.
     * </p>
     * 
     * @param platformId
     *        The ID of the platform that is used by the target signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult withPlatformId(String platformId) {
        setPlatformId(platformId);
        return this;
    }

    /**
     * <p>
     * A human-readable name for the signing platform associated with the signing profile.
     * </p>
     * 
     * @param platformDisplayName
     *        A human-readable name for the signing platform associated with the signing profile.
     */

    public void setPlatformDisplayName(String platformDisplayName) {
        this.platformDisplayName = platformDisplayName;
    }

    /**
     * <p>
     * A human-readable name for the signing platform associated with the signing profile.
     * </p>
     * 
     * @return A human-readable name for the signing platform associated with the signing profile.
     */

    public String getPlatformDisplayName() {
        return this.platformDisplayName;
    }

    /**
     * <p>
     * A human-readable name for the signing platform associated with the signing profile.
     * </p>
     * 
     * @param platformDisplayName
     *        A human-readable name for the signing platform associated with the signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult withPlatformDisplayName(String platformDisplayName) {
        setPlatformDisplayName(platformDisplayName);
        return this;
    }

    /**
     * @param signatureValidityPeriod
     */

    public void setSignatureValidityPeriod(SignatureValidityPeriod signatureValidityPeriod) {
        this.signatureValidityPeriod = signatureValidityPeriod;
    }

    /**
     * @return
     */

    public SignatureValidityPeriod getSignatureValidityPeriod() {
        return this.signatureValidityPeriod;
    }

    /**
     * @param signatureValidityPeriod
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult withSignatureValidityPeriod(SignatureValidityPeriod signatureValidityPeriod) {
        setSignatureValidityPeriod(signatureValidityPeriod);
        return this;
    }

    /**
     * <p>
     * A list of overrides applied by the target signing profile for signing operations.
     * </p>
     * 
     * @param overrides
     *        A list of overrides applied by the target signing profile for signing operations.
     */

    public void setOverrides(SigningPlatformOverrides overrides) {
        this.overrides = overrides;
    }

    /**
     * <p>
     * A list of overrides applied by the target signing profile for signing operations.
     * </p>
     * 
     * @return A list of overrides applied by the target signing profile for signing operations.
     */

    public SigningPlatformOverrides getOverrides() {
        return this.overrides;
    }

    /**
     * <p>
     * A list of overrides applied by the target signing profile for signing operations.
     * </p>
     * 
     * @param overrides
     *        A list of overrides applied by the target signing profile for signing operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult withOverrides(SigningPlatformOverrides overrides) {
        setOverrides(overrides);
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs for signing operations that is attached to the target signing profile.
     * </p>
     * 
     * @return A map of key-value pairs for signing operations that is attached to the target signing profile.
     */

    public java.util.Map<String, String> getSigningParameters() {
        return signingParameters;
    }

    /**
     * <p>
     * A map of key-value pairs for signing operations that is attached to the target signing profile.
     * </p>
     * 
     * @param signingParameters
     *        A map of key-value pairs for signing operations that is attached to the target signing profile.
     */

    public void setSigningParameters(java.util.Map<String, String> signingParameters) {
        this.signingParameters = signingParameters;
    }

    /**
     * <p>
     * A map of key-value pairs for signing operations that is attached to the target signing profile.
     * </p>
     * 
     * @param signingParameters
     *        A map of key-value pairs for signing operations that is attached to the target signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult withSigningParameters(java.util.Map<String, String> signingParameters) {
        setSigningParameters(signingParameters);
        return this;
    }

    /**
     * Add a single SigningParameters entry
     *
     * @see GetSigningProfileResult#withSigningParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult addSigningParametersEntry(String key, String value) {
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

    public GetSigningProfileResult clearSigningParametersEntries() {
        this.signingParameters = null;
        return this;
    }

    /**
     * <p>
     * The status of the target signing profile.
     * </p>
     * 
     * @param status
     *        The status of the target signing profile.
     * @see SigningProfileStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the target signing profile.
     * </p>
     * 
     * @return The status of the target signing profile.
     * @see SigningProfileStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the target signing profile.
     * </p>
     * 
     * @param status
     *        The status of the target signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningProfileStatus
     */

    public GetSigningProfileResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the target signing profile.
     * </p>
     * 
     * @param status
     *        The status of the target signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningProfileStatus
     */

    public GetSigningProfileResult withStatus(SigningProfileStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Reason for the status of the target signing profile.
     * </p>
     * 
     * @param statusReason
     *        Reason for the status of the target signing profile.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Reason for the status of the target signing profile.
     * </p>
     * 
     * @return Reason for the status of the target signing profile.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * Reason for the status of the target signing profile.
     * </p>
     * 
     * @param statusReason
     *        Reason for the status of the target signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the signing profile.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the signing profile.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the signing profile.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the signing profile.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the signing profile.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A list of tags associated with the signing profile.
     * </p>
     * 
     * @return A list of tags associated with the signing profile.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with the signing profile.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the signing profile.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags associated with the signing profile.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetSigningProfileResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSigningProfileResult clearTagsEntries() {
        this.tags = null;
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
        if (getProfileVersion() != null)
            sb.append("ProfileVersion: ").append(getProfileVersion()).append(",");
        if (getProfileVersionArn() != null)
            sb.append("ProfileVersionArn: ").append(getProfileVersionArn()).append(",");
        if (getRevocationRecord() != null)
            sb.append("RevocationRecord: ").append(getRevocationRecord()).append(",");
        if (getSigningMaterial() != null)
            sb.append("SigningMaterial: ").append(getSigningMaterial()).append(",");
        if (getPlatformId() != null)
            sb.append("PlatformId: ").append(getPlatformId()).append(",");
        if (getPlatformDisplayName() != null)
            sb.append("PlatformDisplayName: ").append(getPlatformDisplayName()).append(",");
        if (getSignatureValidityPeriod() != null)
            sb.append("SignatureValidityPeriod: ").append(getSignatureValidityPeriod()).append(",");
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides()).append(",");
        if (getSigningParameters() != null)
            sb.append("SigningParameters: ").append(getSigningParameters()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSigningProfileResult == false)
            return false;
        GetSigningProfileResult other = (GetSigningProfileResult) obj;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getProfileVersion() == null ^ this.getProfileVersion() == null)
            return false;
        if (other.getProfileVersion() != null && other.getProfileVersion().equals(this.getProfileVersion()) == false)
            return false;
        if (other.getProfileVersionArn() == null ^ this.getProfileVersionArn() == null)
            return false;
        if (other.getProfileVersionArn() != null && other.getProfileVersionArn().equals(this.getProfileVersionArn()) == false)
            return false;
        if (other.getRevocationRecord() == null ^ this.getRevocationRecord() == null)
            return false;
        if (other.getRevocationRecord() != null && other.getRevocationRecord().equals(this.getRevocationRecord()) == false)
            return false;
        if (other.getSigningMaterial() == null ^ this.getSigningMaterial() == null)
            return false;
        if (other.getSigningMaterial() != null && other.getSigningMaterial().equals(this.getSigningMaterial()) == false)
            return false;
        if (other.getPlatformId() == null ^ this.getPlatformId() == null)
            return false;
        if (other.getPlatformId() != null && other.getPlatformId().equals(this.getPlatformId()) == false)
            return false;
        if (other.getPlatformDisplayName() == null ^ this.getPlatformDisplayName() == null)
            return false;
        if (other.getPlatformDisplayName() != null && other.getPlatformDisplayName().equals(this.getPlatformDisplayName()) == false)
            return false;
        if (other.getSignatureValidityPeriod() == null ^ this.getSignatureValidityPeriod() == null)
            return false;
        if (other.getSignatureValidityPeriod() != null && other.getSignatureValidityPeriod().equals(this.getSignatureValidityPeriod()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        if (other.getSigningParameters() == null ^ this.getSigningParameters() == null)
            return false;
        if (other.getSigningParameters() != null && other.getSigningParameters().equals(this.getSigningParameters()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getProfileVersion() == null) ? 0 : getProfileVersion().hashCode());
        hashCode = prime * hashCode + ((getProfileVersionArn() == null) ? 0 : getProfileVersionArn().hashCode());
        hashCode = prime * hashCode + ((getRevocationRecord() == null) ? 0 : getRevocationRecord().hashCode());
        hashCode = prime * hashCode + ((getSigningMaterial() == null) ? 0 : getSigningMaterial().hashCode());
        hashCode = prime * hashCode + ((getPlatformId() == null) ? 0 : getPlatformId().hashCode());
        hashCode = prime * hashCode + ((getPlatformDisplayName() == null) ? 0 : getPlatformDisplayName().hashCode());
        hashCode = prime * hashCode + ((getSignatureValidityPeriod() == null) ? 0 : getSignatureValidityPeriod().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        hashCode = prime * hashCode + ((getSigningParameters() == null) ? 0 : getSigningParameters().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetSigningProfileResult clone() {
        try {
            return (GetSigningProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
