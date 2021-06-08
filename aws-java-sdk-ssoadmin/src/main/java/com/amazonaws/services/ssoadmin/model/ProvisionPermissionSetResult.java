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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ProvisionPermissionSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionPermissionSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status object for the permission set provisioning operation.
     * </p>
     */
    private PermissionSetProvisioningStatus permissionSetProvisioningStatus;

    /**
     * <p>
     * The status object for the permission set provisioning operation.
     * </p>
     * 
     * @param permissionSetProvisioningStatus
     *        The status object for the permission set provisioning operation.
     */

    public void setPermissionSetProvisioningStatus(PermissionSetProvisioningStatus permissionSetProvisioningStatus) {
        this.permissionSetProvisioningStatus = permissionSetProvisioningStatus;
    }

    /**
     * <p>
     * The status object for the permission set provisioning operation.
     * </p>
     * 
     * @return The status object for the permission set provisioning operation.
     */

    public PermissionSetProvisioningStatus getPermissionSetProvisioningStatus() {
        return this.permissionSetProvisioningStatus;
    }

    /**
     * <p>
     * The status object for the permission set provisioning operation.
     * </p>
     * 
     * @param permissionSetProvisioningStatus
     *        The status object for the permission set provisioning operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionPermissionSetResult withPermissionSetProvisioningStatus(PermissionSetProvisioningStatus permissionSetProvisioningStatus) {
        setPermissionSetProvisioningStatus(permissionSetProvisioningStatus);
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
        if (getPermissionSetProvisioningStatus() != null)
            sb.append("PermissionSetProvisioningStatus: ").append(getPermissionSetProvisioningStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionPermissionSetResult == false)
            return false;
        ProvisionPermissionSetResult other = (ProvisionPermissionSetResult) obj;
        if (other.getPermissionSetProvisioningStatus() == null ^ this.getPermissionSetProvisioningStatus() == null)
            return false;
        if (other.getPermissionSetProvisioningStatus() != null
                && other.getPermissionSetProvisioningStatus().equals(this.getPermissionSetProvisioningStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissionSetProvisioningStatus() == null) ? 0 : getPermissionSetProvisioningStatus().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionPermissionSetResult clone() {
        try {
            return (ProvisionPermissionSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
