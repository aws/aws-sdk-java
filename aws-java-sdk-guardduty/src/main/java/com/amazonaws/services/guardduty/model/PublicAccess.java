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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the public access policies that apply to the S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/PublicAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicAccess implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about how permissions are configured for the S3 bucket.
     * </p>
     */
    private PermissionConfiguration permissionConfiguration;
    /**
     * <p>
     * Describes the effective permission on this bucket after factoring all attached policies.
     * </p>
     */
    private String effectivePermission;

    /**
     * <p>
     * Contains information about how permissions are configured for the S3 bucket.
     * </p>
     * 
     * @param permissionConfiguration
     *        Contains information about how permissions are configured for the S3 bucket.
     */

    public void setPermissionConfiguration(PermissionConfiguration permissionConfiguration) {
        this.permissionConfiguration = permissionConfiguration;
    }

    /**
     * <p>
     * Contains information about how permissions are configured for the S3 bucket.
     * </p>
     * 
     * @return Contains information about how permissions are configured for the S3 bucket.
     */

    public PermissionConfiguration getPermissionConfiguration() {
        return this.permissionConfiguration;
    }

    /**
     * <p>
     * Contains information about how permissions are configured for the S3 bucket.
     * </p>
     * 
     * @param permissionConfiguration
     *        Contains information about how permissions are configured for the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicAccess withPermissionConfiguration(PermissionConfiguration permissionConfiguration) {
        setPermissionConfiguration(permissionConfiguration);
        return this;
    }

    /**
     * <p>
     * Describes the effective permission on this bucket after factoring all attached policies.
     * </p>
     * 
     * @param effectivePermission
     *        Describes the effective permission on this bucket after factoring all attached policies.
     */

    public void setEffectivePermission(String effectivePermission) {
        this.effectivePermission = effectivePermission;
    }

    /**
     * <p>
     * Describes the effective permission on this bucket after factoring all attached policies.
     * </p>
     * 
     * @return Describes the effective permission on this bucket after factoring all attached policies.
     */

    public String getEffectivePermission() {
        return this.effectivePermission;
    }

    /**
     * <p>
     * Describes the effective permission on this bucket after factoring all attached policies.
     * </p>
     * 
     * @param effectivePermission
     *        Describes the effective permission on this bucket after factoring all attached policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublicAccess withEffectivePermission(String effectivePermission) {
        setEffectivePermission(effectivePermission);
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
        if (getPermissionConfiguration() != null)
            sb.append("PermissionConfiguration: ").append(getPermissionConfiguration()).append(",");
        if (getEffectivePermission() != null)
            sb.append("EffectivePermission: ").append(getEffectivePermission());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicAccess == false)
            return false;
        PublicAccess other = (PublicAccess) obj;
        if (other.getPermissionConfiguration() == null ^ this.getPermissionConfiguration() == null)
            return false;
        if (other.getPermissionConfiguration() != null && other.getPermissionConfiguration().equals(this.getPermissionConfiguration()) == false)
            return false;
        if (other.getEffectivePermission() == null ^ this.getEffectivePermission() == null)
            return false;
        if (other.getEffectivePermission() != null && other.getEffectivePermission().equals(this.getEffectivePermission()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissionConfiguration() == null) ? 0 : getPermissionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEffectivePermission() == null) ? 0 : getEffectivePermission().hashCode());
        return hashCode;
    }

    @Override
    public PublicAccess clone() {
        try {
            return (PublicAccess) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.PublicAccessMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
