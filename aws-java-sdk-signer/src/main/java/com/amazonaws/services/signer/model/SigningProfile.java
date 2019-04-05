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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the ACM certificates and AWS Signer configuration parameters that can be used by a given
 * AWS Signer user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/SigningProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SigningProfile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AWS Signer profile.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * The ACM certificate that is available for use by a signing profile.
     * </p>
     */
    private SigningMaterial signingMaterial;
    /**
     * <p>
     * The ID of a platform that is available for use by a signing profile.
     * </p>
     */
    private String platformId;
    /**
     * <p>
     * The parameters that are available for use by an AWS Signer user.
     * </p>
     */
    private java.util.Map<String, String> signingParameters;
    /**
     * <p>
     * The status of an AWS Signer profile.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the AWS Signer profile.
     * </p>
     * 
     * @param profileName
     *        The name of the AWS Signer profile.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The name of the AWS Signer profile.
     * </p>
     * 
     * @return The name of the AWS Signer profile.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The name of the AWS Signer profile.
     * </p>
     * 
     * @param profileName
     *        The name of the AWS Signer profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningProfile withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * The ACM certificate that is available for use by a signing profile.
     * </p>
     * 
     * @param signingMaterial
     *        The ACM certificate that is available for use by a signing profile.
     */

    public void setSigningMaterial(SigningMaterial signingMaterial) {
        this.signingMaterial = signingMaterial;
    }

    /**
     * <p>
     * The ACM certificate that is available for use by a signing profile.
     * </p>
     * 
     * @return The ACM certificate that is available for use by a signing profile.
     */

    public SigningMaterial getSigningMaterial() {
        return this.signingMaterial;
    }

    /**
     * <p>
     * The ACM certificate that is available for use by a signing profile.
     * </p>
     * 
     * @param signingMaterial
     *        The ACM certificate that is available for use by a signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningProfile withSigningMaterial(SigningMaterial signingMaterial) {
        setSigningMaterial(signingMaterial);
        return this;
    }

    /**
     * <p>
     * The ID of a platform that is available for use by a signing profile.
     * </p>
     * 
     * @param platformId
     *        The ID of a platform that is available for use by a signing profile.
     */

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    /**
     * <p>
     * The ID of a platform that is available for use by a signing profile.
     * </p>
     * 
     * @return The ID of a platform that is available for use by a signing profile.
     */

    public String getPlatformId() {
        return this.platformId;
    }

    /**
     * <p>
     * The ID of a platform that is available for use by a signing profile.
     * </p>
     * 
     * @param platformId
     *        The ID of a platform that is available for use by a signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningProfile withPlatformId(String platformId) {
        setPlatformId(platformId);
        return this;
    }

    /**
     * <p>
     * The parameters that are available for use by an AWS Signer user.
     * </p>
     * 
     * @return The parameters that are available for use by an AWS Signer user.
     */

    public java.util.Map<String, String> getSigningParameters() {
        return signingParameters;
    }

    /**
     * <p>
     * The parameters that are available for use by an AWS Signer user.
     * </p>
     * 
     * @param signingParameters
     *        The parameters that are available for use by an AWS Signer user.
     */

    public void setSigningParameters(java.util.Map<String, String> signingParameters) {
        this.signingParameters = signingParameters;
    }

    /**
     * <p>
     * The parameters that are available for use by an AWS Signer user.
     * </p>
     * 
     * @param signingParameters
     *        The parameters that are available for use by an AWS Signer user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningProfile withSigningParameters(java.util.Map<String, String> signingParameters) {
        setSigningParameters(signingParameters);
        return this;
    }

    public SigningProfile addSigningParametersEntry(String key, String value) {
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

    public SigningProfile clearSigningParametersEntries() {
        this.signingParameters = null;
        return this;
    }

    /**
     * <p>
     * The status of an AWS Signer profile.
     * </p>
     * 
     * @param status
     *        The status of an AWS Signer profile.
     * @see SigningProfileStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of an AWS Signer profile.
     * </p>
     * 
     * @return The status of an AWS Signer profile.
     * @see SigningProfileStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of an AWS Signer profile.
     * </p>
     * 
     * @param status
     *        The status of an AWS Signer profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningProfileStatus
     */

    public SigningProfile withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of an AWS Signer profile.
     * </p>
     * 
     * @param status
     *        The status of an AWS Signer profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningProfileStatus
     */

    public SigningProfile withStatus(SigningProfileStatus status) {
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

        if (obj instanceof SigningProfile == false)
            return false;
        SigningProfile other = (SigningProfile) obj;
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
        hashCode = prime * hashCode + ((getSigningParameters() == null) ? 0 : getSigningParameters().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SigningProfile clone() {
        try {
            return (SigningProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.SigningProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
