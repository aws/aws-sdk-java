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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/PutSigningProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSigningProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the signing profile to be created.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * The AWS Certificate Manager certificate that will be used to sign code with the new signing profile.
     * </p>
     */
    private SigningMaterial signingMaterial;
    /**
     * <p>
     * The ID of the signing profile to be created.
     * </p>
     */
    private String platformId;
    /**
     * <p>
     * A subfield of <code>platform</code>. This specifies any different configuration options that you want to apply to
     * the chosen platform (such as a different <code>hash-algorithm</code> or <code>signing-algorithm</code>).
     * </p>
     */
    private SigningPlatformOverrides overrides;
    /**
     * <p>
     * Map of key-value pairs for signing. These can include any information that you want to use during signing.
     * </p>
     */
    private java.util.Map<String, String> signingParameters;

    /**
     * <p>
     * The name of the signing profile to be created.
     * </p>
     * 
     * @param profileName
     *        The name of the signing profile to be created.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The name of the signing profile to be created.
     * </p>
     * 
     * @return The name of the signing profile to be created.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The name of the signing profile to be created.
     * </p>
     * 
     * @param profileName
     *        The name of the signing profile to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSigningProfileRequest withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * The AWS Certificate Manager certificate that will be used to sign code with the new signing profile.
     * </p>
     * 
     * @param signingMaterial
     *        The AWS Certificate Manager certificate that will be used to sign code with the new signing profile.
     */

    public void setSigningMaterial(SigningMaterial signingMaterial) {
        this.signingMaterial = signingMaterial;
    }

    /**
     * <p>
     * The AWS Certificate Manager certificate that will be used to sign code with the new signing profile.
     * </p>
     * 
     * @return The AWS Certificate Manager certificate that will be used to sign code with the new signing profile.
     */

    public SigningMaterial getSigningMaterial() {
        return this.signingMaterial;
    }

    /**
     * <p>
     * The AWS Certificate Manager certificate that will be used to sign code with the new signing profile.
     * </p>
     * 
     * @param signingMaterial
     *        The AWS Certificate Manager certificate that will be used to sign code with the new signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSigningProfileRequest withSigningMaterial(SigningMaterial signingMaterial) {
        setSigningMaterial(signingMaterial);
        return this;
    }

    /**
     * <p>
     * The ID of the signing profile to be created.
     * </p>
     * 
     * @param platformId
     *        The ID of the signing profile to be created.
     */

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    /**
     * <p>
     * The ID of the signing profile to be created.
     * </p>
     * 
     * @return The ID of the signing profile to be created.
     */

    public String getPlatformId() {
        return this.platformId;
    }

    /**
     * <p>
     * The ID of the signing profile to be created.
     * </p>
     * 
     * @param platformId
     *        The ID of the signing profile to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSigningProfileRequest withPlatformId(String platformId) {
        setPlatformId(platformId);
        return this;
    }

    /**
     * <p>
     * A subfield of <code>platform</code>. This specifies any different configuration options that you want to apply to
     * the chosen platform (such as a different <code>hash-algorithm</code> or <code>signing-algorithm</code>).
     * </p>
     * 
     * @param overrides
     *        A subfield of <code>platform</code>. This specifies any different configuration options that you want to
     *        apply to the chosen platform (such as a different <code>hash-algorithm</code> or
     *        <code>signing-algorithm</code>).
     */

    public void setOverrides(SigningPlatformOverrides overrides) {
        this.overrides = overrides;
    }

    /**
     * <p>
     * A subfield of <code>platform</code>. This specifies any different configuration options that you want to apply to
     * the chosen platform (such as a different <code>hash-algorithm</code> or <code>signing-algorithm</code>).
     * </p>
     * 
     * @return A subfield of <code>platform</code>. This specifies any different configuration options that you want to
     *         apply to the chosen platform (such as a different <code>hash-algorithm</code> or
     *         <code>signing-algorithm</code>).
     */

    public SigningPlatformOverrides getOverrides() {
        return this.overrides;
    }

    /**
     * <p>
     * A subfield of <code>platform</code>. This specifies any different configuration options that you want to apply to
     * the chosen platform (such as a different <code>hash-algorithm</code> or <code>signing-algorithm</code>).
     * </p>
     * 
     * @param overrides
     *        A subfield of <code>platform</code>. This specifies any different configuration options that you want to
     *        apply to the chosen platform (such as a different <code>hash-algorithm</code> or
     *        <code>signing-algorithm</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSigningProfileRequest withOverrides(SigningPlatformOverrides overrides) {
        setOverrides(overrides);
        return this;
    }

    /**
     * <p>
     * Map of key-value pairs for signing. These can include any information that you want to use during signing.
     * </p>
     * 
     * @return Map of key-value pairs for signing. These can include any information that you want to use during
     *         signing.
     */

    public java.util.Map<String, String> getSigningParameters() {
        return signingParameters;
    }

    /**
     * <p>
     * Map of key-value pairs for signing. These can include any information that you want to use during signing.
     * </p>
     * 
     * @param signingParameters
     *        Map of key-value pairs for signing. These can include any information that you want to use during signing.
     */

    public void setSigningParameters(java.util.Map<String, String> signingParameters) {
        this.signingParameters = signingParameters;
    }

    /**
     * <p>
     * Map of key-value pairs for signing. These can include any information that you want to use during signing.
     * </p>
     * 
     * @param signingParameters
     *        Map of key-value pairs for signing. These can include any information that you want to use during signing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSigningProfileRequest withSigningParameters(java.util.Map<String, String> signingParameters) {
        setSigningParameters(signingParameters);
        return this;
    }

    public PutSigningProfileRequest addSigningParametersEntry(String key, String value) {
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

    public PutSigningProfileRequest clearSigningParametersEntries() {
        this.signingParameters = null;
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
            sb.append("SigningParameters: ").append(getSigningParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSigningProfileRequest == false)
            return false;
        PutSigningProfileRequest other = (PutSigningProfileRequest) obj;
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
        return hashCode;
    }

    @Override
    public PutSigningProfileRequest clone() {
        return (PutSigningProfileRequest) super.clone();
    }

}
