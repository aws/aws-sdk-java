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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The user ID and user fields to update, used with the <a>BatchUpdateUser</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateUserRequestItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserRequestItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user ID.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The user license type.
     * </p>
     */
    private String licenseType;

    /**
     * <p>
     * The user ID.
     * </p>
     * 
     * @param userId
     *        The user ID.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * 
     * @return The user ID.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * 
     * @param userId
     *        The user ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequestItem withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The user license type.
     * </p>
     * 
     * @param licenseType
     *        The user license type.
     * @see License
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The user license type.
     * </p>
     * 
     * @return The user license type.
     * @see License
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * The user license type.
     * </p>
     * 
     * @param licenseType
     *        The user license type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see License
     */

    public UpdateUserRequestItem withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * The user license type.
     * </p>
     * 
     * @param licenseType
     *        The user license type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see License
     */

    public UpdateUserRequestItem withLicenseType(License licenseType) {
        this.licenseType = licenseType.toString();
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getLicenseType() != null)
            sb.append("LicenseType: ").append(getLicenseType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserRequestItem == false)
            return false;
        UpdateUserRequestItem other = (UpdateUserRequestItem) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserRequestItem clone() {
        try {
            return (UpdateUserRequestItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.UpdateUserRequestItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
