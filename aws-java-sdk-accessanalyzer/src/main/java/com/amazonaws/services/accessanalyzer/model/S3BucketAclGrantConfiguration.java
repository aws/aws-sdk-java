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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A proposed access control list grant configuration for an Amazon S3 bucket. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#setting-acls">How to Specify an ACL</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/S3BucketAclGrantConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BucketAclGrantConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The grantee to whom you’re assigning access rights.
     * </p>
     */
    private AclGrantee grantee;
    /**
     * <p>
     * The permissions being granted.
     * </p>
     */
    private String permission;

    /**
     * <p>
     * The grantee to whom you’re assigning access rights.
     * </p>
     * 
     * @param grantee
     *        The grantee to whom you’re assigning access rights.
     */

    public void setGrantee(AclGrantee grantee) {
        this.grantee = grantee;
    }

    /**
     * <p>
     * The grantee to whom you’re assigning access rights.
     * </p>
     * 
     * @return The grantee to whom you’re assigning access rights.
     */

    public AclGrantee getGrantee() {
        return this.grantee;
    }

    /**
     * <p>
     * The grantee to whom you’re assigning access rights.
     * </p>
     * 
     * @param grantee
     *        The grantee to whom you’re assigning access rights.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketAclGrantConfiguration withGrantee(AclGrantee grantee) {
        setGrantee(grantee);
        return this;
    }

    /**
     * <p>
     * The permissions being granted.
     * </p>
     * 
     * @param permission
     *        The permissions being granted.
     * @see AclPermission
     */

    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p>
     * The permissions being granted.
     * </p>
     * 
     * @return The permissions being granted.
     * @see AclPermission
     */

    public String getPermission() {
        return this.permission;
    }

    /**
     * <p>
     * The permissions being granted.
     * </p>
     * 
     * @param permission
     *        The permissions being granted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AclPermission
     */

    public S3BucketAclGrantConfiguration withPermission(String permission) {
        setPermission(permission);
        return this;
    }

    /**
     * <p>
     * The permissions being granted.
     * </p>
     * 
     * @param permission
     *        The permissions being granted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AclPermission
     */

    public S3BucketAclGrantConfiguration withPermission(AclPermission permission) {
        this.permission = permission.toString();
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
        if (getGrantee() != null)
            sb.append("Grantee: ").append(getGrantee()).append(",");
        if (getPermission() != null)
            sb.append("Permission: ").append(getPermission());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3BucketAclGrantConfiguration == false)
            return false;
        S3BucketAclGrantConfiguration other = (S3BucketAclGrantConfiguration) obj;
        if (other.getGrantee() == null ^ this.getGrantee() == null)
            return false;
        if (other.getGrantee() != null && other.getGrantee().equals(this.getGrantee()) == false)
            return false;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null && other.getPermission().equals(this.getPermission()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrantee() == null) ? 0 : getGrantee().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        return hashCode;
    }

    @Override
    public S3BucketAclGrantConfiguration clone() {
        try {
            return (S3BucketAclGrantConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.S3BucketAclGrantConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
