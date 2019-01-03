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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The reason that the service-linked role deletion failed.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>GetServiceLinkedRoleDeletionStatus</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/DeletionTaskFailureReasonType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletionTaskFailureReasonType implements Serializable, Cloneable {

    /**
     * <p>
     * A short description of the reason that the service-linked role deletion failed.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * A list of objects that contains details about the service-linked role deletion failure, if that information is
     * returned by the service. If the service-linked role has active sessions or if any resources that were used by the
     * role have not been deleted from the linked service, the role can't be deleted. This parameter includes a list of
     * the resources that are associated with the role and the region in which the resources are being used.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RoleUsageType> roleUsageList;

    /**
     * <p>
     * A short description of the reason that the service-linked role deletion failed.
     * </p>
     * 
     * @param reason
     *        A short description of the reason that the service-linked role deletion failed.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A short description of the reason that the service-linked role deletion failed.
     * </p>
     * 
     * @return A short description of the reason that the service-linked role deletion failed.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A short description of the reason that the service-linked role deletion failed.
     * </p>
     * 
     * @param reason
     *        A short description of the reason that the service-linked role deletion failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletionTaskFailureReasonType withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * A list of objects that contains details about the service-linked role deletion failure, if that information is
     * returned by the service. If the service-linked role has active sessions or if any resources that were used by the
     * role have not been deleted from the linked service, the role can't be deleted. This parameter includes a list of
     * the resources that are associated with the role and the region in which the resources are being used.
     * </p>
     * 
     * @return A list of objects that contains details about the service-linked role deletion failure, if that
     *         information is returned by the service. If the service-linked role has active sessions or if any
     *         resources that were used by the role have not been deleted from the linked service, the role can't be
     *         deleted. This parameter includes a list of the resources that are associated with the role and the region
     *         in which the resources are being used.
     */

    public java.util.List<RoleUsageType> getRoleUsageList() {
        if (roleUsageList == null) {
            roleUsageList = new com.amazonaws.internal.SdkInternalList<RoleUsageType>();
        }
        return roleUsageList;
    }

    /**
     * <p>
     * A list of objects that contains details about the service-linked role deletion failure, if that information is
     * returned by the service. If the service-linked role has active sessions or if any resources that were used by the
     * role have not been deleted from the linked service, the role can't be deleted. This parameter includes a list of
     * the resources that are associated with the role and the region in which the resources are being used.
     * </p>
     * 
     * @param roleUsageList
     *        A list of objects that contains details about the service-linked role deletion failure, if that
     *        information is returned by the service. If the service-linked role has active sessions or if any resources
     *        that were used by the role have not been deleted from the linked service, the role can't be deleted. This
     *        parameter includes a list of the resources that are associated with the role and the region in which the
     *        resources are being used.
     */

    public void setRoleUsageList(java.util.Collection<RoleUsageType> roleUsageList) {
        if (roleUsageList == null) {
            this.roleUsageList = null;
            return;
        }

        this.roleUsageList = new com.amazonaws.internal.SdkInternalList<RoleUsageType>(roleUsageList);
    }

    /**
     * <p>
     * A list of objects that contains details about the service-linked role deletion failure, if that information is
     * returned by the service. If the service-linked role has active sessions or if any resources that were used by the
     * role have not been deleted from the linked service, the role can't be deleted. This parameter includes a list of
     * the resources that are associated with the role and the region in which the resources are being used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoleUsageList(java.util.Collection)} or {@link #withRoleUsageList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param roleUsageList
     *        A list of objects that contains details about the service-linked role deletion failure, if that
     *        information is returned by the service. If the service-linked role has active sessions or if any resources
     *        that were used by the role have not been deleted from the linked service, the role can't be deleted. This
     *        parameter includes a list of the resources that are associated with the role and the region in which the
     *        resources are being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletionTaskFailureReasonType withRoleUsageList(RoleUsageType... roleUsageList) {
        if (this.roleUsageList == null) {
            setRoleUsageList(new com.amazonaws.internal.SdkInternalList<RoleUsageType>(roleUsageList.length));
        }
        for (RoleUsageType ele : roleUsageList) {
            this.roleUsageList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that contains details about the service-linked role deletion failure, if that information is
     * returned by the service. If the service-linked role has active sessions or if any resources that were used by the
     * role have not been deleted from the linked service, the role can't be deleted. This parameter includes a list of
     * the resources that are associated with the role and the region in which the resources are being used.
     * </p>
     * 
     * @param roleUsageList
     *        A list of objects that contains details about the service-linked role deletion failure, if that
     *        information is returned by the service. If the service-linked role has active sessions or if any resources
     *        that were used by the role have not been deleted from the linked service, the role can't be deleted. This
     *        parameter includes a list of the resources that are associated with the role and the region in which the
     *        resources are being used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletionTaskFailureReasonType withRoleUsageList(java.util.Collection<RoleUsageType> roleUsageList) {
        setRoleUsageList(roleUsageList);
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
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getRoleUsageList() != null)
            sb.append("RoleUsageList: ").append(getRoleUsageList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletionTaskFailureReasonType == false)
            return false;
        DeletionTaskFailureReasonType other = (DeletionTaskFailureReasonType) obj;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getRoleUsageList() == null ^ this.getRoleUsageList() == null)
            return false;
        if (other.getRoleUsageList() != null && other.getRoleUsageList().equals(this.getRoleUsageList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getRoleUsageList() == null) ? 0 : getRoleUsageList().hashCode());
        return hashCode;
    }

    @Override
    public DeletionTaskFailureReasonType clone() {
        try {
            return (DeletionTaskFailureReasonType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
