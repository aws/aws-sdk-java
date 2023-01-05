/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the profile object that you are updating.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     */
    private java.util.List<String> certificateIds;

    /**
     * <p>
     * The identifier of the profile object that you are updating.
     * </p>
     * 
     * @param profileId
     *        The identifier of the profile object that you are updating.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * The identifier of the profile object that you are updating.
     * </p>
     * 
     * @return The identifier of the profile object that you are updating.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * The identifier of the profile object that you are updating.
     * </p>
     * 
     * @param profileId
     *        The identifier of the profile object that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     * 
     * @return An array of identifiers for the imported certificates. You use this identifier for working with profiles
     *         and partner profiles.
     */

    public java.util.List<String> getCertificateIds() {
        return certificateIds;
    }

    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     * 
     * @param certificateIds
     *        An array of identifiers for the imported certificates. You use this identifier for working with profiles
     *        and partner profiles.
     */

    public void setCertificateIds(java.util.Collection<String> certificateIds) {
        if (certificateIds == null) {
            this.certificateIds = null;
            return;
        }

        this.certificateIds = new java.util.ArrayList<String>(certificateIds);
    }

    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificateIds(java.util.Collection)} or {@link #withCertificateIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param certificateIds
     *        An array of identifiers for the imported certificates. You use this identifier for working with profiles
     *        and partner profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withCertificateIds(String... certificateIds) {
        if (this.certificateIds == null) {
            setCertificateIds(new java.util.ArrayList<String>(certificateIds.length));
        }
        for (String ele : certificateIds) {
            this.certificateIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     * 
     * @param certificateIds
     *        An array of identifiers for the imported certificates. You use this identifier for working with profiles
     *        and partner profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProfileRequest withCertificateIds(java.util.Collection<String> certificateIds) {
        setCertificateIds(certificateIds);
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
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
        if (getCertificateIds() != null)
            sb.append("CertificateIds: ").append(getCertificateIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProfileRequest == false)
            return false;
        UpdateProfileRequest other = (UpdateProfileRequest) obj;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getCertificateIds() == null ^ this.getCertificateIds() == null)
            return false;
        if (other.getCertificateIds() != null && other.getCertificateIds().equals(this.getCertificateIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getCertificateIds() == null) ? 0 : getCertificateIds().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProfileRequest clone() {
        return (UpdateProfileRequest) super.clone();
    }

}
