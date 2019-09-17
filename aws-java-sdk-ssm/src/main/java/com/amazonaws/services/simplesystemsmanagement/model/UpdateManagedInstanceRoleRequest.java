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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateManagedInstanceRole" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateManagedInstanceRoleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the managed instance where you want to update the role.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The IAM role you want to assign or change.
     * </p>
     */
    private String iamRole;

    /**
     * <p>
     * The ID of the managed instance where you want to update the role.
     * </p>
     * 
     * @param instanceId
     *        The ID of the managed instance where you want to update the role.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the managed instance where you want to update the role.
     * </p>
     * 
     * @return The ID of the managed instance where you want to update the role.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the managed instance where you want to update the role.
     * </p>
     * 
     * @param instanceId
     *        The ID of the managed instance where you want to update the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateManagedInstanceRoleRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The IAM role you want to assign or change.
     * </p>
     * 
     * @param iamRole
     *        The IAM role you want to assign or change.
     */

    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * The IAM role you want to assign or change.
     * </p>
     * 
     * @return The IAM role you want to assign or change.
     */

    public String getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * The IAM role you want to assign or change.
     * </p>
     * 
     * @param iamRole
     *        The IAM role you want to assign or change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateManagedInstanceRoleRequest withIamRole(String iamRole) {
        setIamRole(iamRole);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getIamRole() != null)
            sb.append("IamRole: ").append(getIamRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateManagedInstanceRoleRequest == false)
            return false;
        UpdateManagedInstanceRoleRequest other = (UpdateManagedInstanceRoleRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        return hashCode;
    }

    @Override
    public UpdateManagedInstanceRoleRequest clone() {
        return (UpdateManagedInstanceRoleRequest) super.clone();
    }

}
