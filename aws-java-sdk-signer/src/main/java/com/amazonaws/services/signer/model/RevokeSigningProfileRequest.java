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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/RevokeSigningProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeSigningProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the signing profile to be revoked.
     * </p>
     */
    private String profileName;
    /**
     * <p>
     * The version of the signing profile to be revoked.
     * </p>
     */
    private String profileVersion;
    /**
     * <p>
     * The reason for revoking a signing profile.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * A timestamp for when revocation of a Signing Profile should become effective. Signatures generated using the
     * signing profile after this timestamp are not trusted.
     * </p>
     */
    private java.util.Date effectiveTime;

    /**
     * <p>
     * The name of the signing profile to be revoked.
     * </p>
     * 
     * @param profileName
     *        The name of the signing profile to be revoked.
     */

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * <p>
     * The name of the signing profile to be revoked.
     * </p>
     * 
     * @return The name of the signing profile to be revoked.
     */

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * <p>
     * The name of the signing profile to be revoked.
     * </p>
     * 
     * @param profileName
     *        The name of the signing profile to be revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSigningProfileRequest withProfileName(String profileName) {
        setProfileName(profileName);
        return this;
    }

    /**
     * <p>
     * The version of the signing profile to be revoked.
     * </p>
     * 
     * @param profileVersion
     *        The version of the signing profile to be revoked.
     */

    public void setProfileVersion(String profileVersion) {
        this.profileVersion = profileVersion;
    }

    /**
     * <p>
     * The version of the signing profile to be revoked.
     * </p>
     * 
     * @return The version of the signing profile to be revoked.
     */

    public String getProfileVersion() {
        return this.profileVersion;
    }

    /**
     * <p>
     * The version of the signing profile to be revoked.
     * </p>
     * 
     * @param profileVersion
     *        The version of the signing profile to be revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSigningProfileRequest withProfileVersion(String profileVersion) {
        setProfileVersion(profileVersion);
        return this;
    }

    /**
     * <p>
     * The reason for revoking a signing profile.
     * </p>
     * 
     * @param reason
     *        The reason for revoking a signing profile.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for revoking a signing profile.
     * </p>
     * 
     * @return The reason for revoking a signing profile.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for revoking a signing profile.
     * </p>
     * 
     * @param reason
     *        The reason for revoking a signing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSigningProfileRequest withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * A timestamp for when revocation of a Signing Profile should become effective. Signatures generated using the
     * signing profile after this timestamp are not trusted.
     * </p>
     * 
     * @param effectiveTime
     *        A timestamp for when revocation of a Signing Profile should become effective. Signatures generated using
     *        the signing profile after this timestamp are not trusted.
     */

    public void setEffectiveTime(java.util.Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    /**
     * <p>
     * A timestamp for when revocation of a Signing Profile should become effective. Signatures generated using the
     * signing profile after this timestamp are not trusted.
     * </p>
     * 
     * @return A timestamp for when revocation of a Signing Profile should become effective. Signatures generated using
     *         the signing profile after this timestamp are not trusted.
     */

    public java.util.Date getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * <p>
     * A timestamp for when revocation of a Signing Profile should become effective. Signatures generated using the
     * signing profile after this timestamp are not trusted.
     * </p>
     * 
     * @param effectiveTime
     *        A timestamp for when revocation of a Signing Profile should become effective. Signatures generated using
     *        the signing profile after this timestamp are not trusted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSigningProfileRequest withEffectiveTime(java.util.Date effectiveTime) {
        setEffectiveTime(effectiveTime);
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
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getEffectiveTime() != null)
            sb.append("EffectiveTime: ").append(getEffectiveTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeSigningProfileRequest == false)
            return false;
        RevokeSigningProfileRequest other = (RevokeSigningProfileRequest) obj;
        if (other.getProfileName() == null ^ this.getProfileName() == null)
            return false;
        if (other.getProfileName() != null && other.getProfileName().equals(this.getProfileName()) == false)
            return false;
        if (other.getProfileVersion() == null ^ this.getProfileVersion() == null)
            return false;
        if (other.getProfileVersion() != null && other.getProfileVersion().equals(this.getProfileVersion()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getEffectiveTime() == null ^ this.getEffectiveTime() == null)
            return false;
        if (other.getEffectiveTime() != null && other.getEffectiveTime().equals(this.getEffectiveTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileName() == null) ? 0 : getProfileName().hashCode());
        hashCode = prime * hashCode + ((getProfileVersion() == null) ? 0 : getProfileVersion().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getEffectiveTime() == null) ? 0 : getEffectiveTime().hashCode());
        return hashCode;
    }

    @Override
    public RevokeSigningProfileRequest clone() {
        return (RevokeSigningProfileRequest) super.clone();
    }

}
