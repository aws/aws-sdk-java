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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a grant.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Grant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The grantee.
     * </p>
     */
    private Grantee grantee;
    /**
     * <p>
     * Specifies the permission given to the grantee.
     * </p>
     */
    private String permission;

    /**
     * <p>
     * The grantee.
     * </p>
     * 
     * @param grantee
     *        The grantee.
     */

    public void setGrantee(Grantee grantee) {
        this.grantee = grantee;
    }

    /**
     * <p>
     * The grantee.
     * </p>
     * 
     * @return The grantee.
     */

    public Grantee getGrantee() {
        return this.grantee;
    }

    /**
     * <p>
     * The grantee.
     * </p>
     * 
     * @param grantee
     *        The grantee.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grant withGrantee(Grantee grantee) {
        setGrantee(grantee);
        return this;
    }

    /**
     * <p>
     * Specifies the permission given to the grantee.
     * </p>
     * 
     * @param permission
     *        Specifies the permission given to the grantee.
     * @see Permission
     */

    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p>
     * Specifies the permission given to the grantee.
     * </p>
     * 
     * @return Specifies the permission given to the grantee.
     * @see Permission
     */

    public String getPermission() {
        return this.permission;
    }

    /**
     * <p>
     * Specifies the permission given to the grantee.
     * </p>
     * 
     * @param permission
     *        Specifies the permission given to the grantee.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public Grant withPermission(String permission) {
        setPermission(permission);
        return this;
    }

    /**
     * <p>
     * Specifies the permission given to the grantee.
     * </p>
     * 
     * @param permission
     *        Specifies the permission given to the grantee.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public Grant withPermission(Permission permission) {
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

        if (obj instanceof Grant == false)
            return false;
        Grant other = (Grant) obj;
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
    public Grant clone() {
        try {
            return (Grant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.GrantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
