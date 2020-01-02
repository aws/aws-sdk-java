/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3Grant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Grant implements Serializable, Cloneable {

    /** <p/> */
    private S3Grantee grantee;
    /** <p/> */
    private String permission;

    /**
     * <p/>
     * 
     * @param grantee
     */

    public void setGrantee(S3Grantee grantee) {
        this.grantee = grantee;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public S3Grantee getGrantee() {
        return this.grantee;
    }

    /**
     * <p/>
     * 
     * @param grantee
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Grant withGrantee(S3Grantee grantee) {
        setGrantee(grantee);
        return this;
    }

    /**
     * <p/>
     * 
     * @param permission
     * @see S3Permission
     */

    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p/>
     * 
     * @return
     * @see S3Permission
     */

    public String getPermission() {
        return this.permission;
    }

    /**
     * <p/>
     * 
     * @param permission
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3Permission
     */

    public S3Grant withPermission(String permission) {
        setPermission(permission);
        return this;
    }

    /**
     * <p/>
     * 
     * @param permission
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3Permission
     */

    public S3Grant withPermission(S3Permission permission) {
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

        if (obj instanceof S3Grant == false)
            return false;
        S3Grant other = (S3Grant) obj;
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
    public S3Grant clone() {
        try {
            return (S3Grant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
