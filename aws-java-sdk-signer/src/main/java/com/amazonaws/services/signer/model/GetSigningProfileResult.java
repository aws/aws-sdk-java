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
        if (getSigningMaterial() != null)
            sb.append("SigningMaterial: ").append(getSigningMaterial()).append(",");
        if (getPlatformId() != null)
            sb.append("PlatformId: ").append(getPlatformId()).append(",");
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides()).append(",");
        if (getSigningParameters() != null)
            sb.append("SigningParameters: ").append(getSigningParameters()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
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
        if (other.getSigningMaterial() == null ^ this.getSigningMaterial() == null)
            return false;
        if (other.getSigningMaterial() != null && other.getSigningMaterial().equals(this.getSigningMaterial()) == false)
            return false;
        if (other.getPlatformId() == null ^ this.getPlatformId() == null)
            return false;
        if (other.getPlatformId() != null && other.getPlatformId().equals(this.getPlatformId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getSigningMaterial() == null) ? 0 : getSigningMaterial().hashCode());
        hashCode = prime * hashCode + ((getPlatformId() == null) ? 0 : getPlatformId().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        hashCode = prime * hashCode + ((getSigningParameters() == null) ? 0 : getSigningParameters().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
