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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetAdminAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAdminAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account that is set as the AWS Firewall Manager administrator.
     * </p>
     */
    private String adminAccount;
    /**
     * <p>
     * The status of the AWS account that you set as the AWS Firewall Manager administrator.
     * </p>
     */
    private String roleStatus;

    /**
     * <p>
     * The AWS account that is set as the AWS Firewall Manager administrator.
     * </p>
     * 
     * @param adminAccount
     *        The AWS account that is set as the AWS Firewall Manager administrator.
     */

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    /**
     * <p>
     * The AWS account that is set as the AWS Firewall Manager administrator.
     * </p>
     * 
     * @return The AWS account that is set as the AWS Firewall Manager administrator.
     */

    public String getAdminAccount() {
        return this.adminAccount;
    }

    /**
     * <p>
     * The AWS account that is set as the AWS Firewall Manager administrator.
     * </p>
     * 
     * @param adminAccount
     *        The AWS account that is set as the AWS Firewall Manager administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdminAccountResult withAdminAccount(String adminAccount) {
        setAdminAccount(adminAccount);
        return this;
    }

    /**
     * <p>
     * The status of the AWS account that you set as the AWS Firewall Manager administrator.
     * </p>
     * 
     * @param roleStatus
     *        The status of the AWS account that you set as the AWS Firewall Manager administrator.
     * @see AccountRoleStatus
     */

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus;
    }

    /**
     * <p>
     * The status of the AWS account that you set as the AWS Firewall Manager administrator.
     * </p>
     * 
     * @return The status of the AWS account that you set as the AWS Firewall Manager administrator.
     * @see AccountRoleStatus
     */

    public String getRoleStatus() {
        return this.roleStatus;
    }

    /**
     * <p>
     * The status of the AWS account that you set as the AWS Firewall Manager administrator.
     * </p>
     * 
     * @param roleStatus
     *        The status of the AWS account that you set as the AWS Firewall Manager administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountRoleStatus
     */

    public GetAdminAccountResult withRoleStatus(String roleStatus) {
        setRoleStatus(roleStatus);
        return this;
    }

    /**
     * <p>
     * The status of the AWS account that you set as the AWS Firewall Manager administrator.
     * </p>
     * 
     * @param roleStatus
     *        The status of the AWS account that you set as the AWS Firewall Manager administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountRoleStatus
     */

    public GetAdminAccountResult withRoleStatus(AccountRoleStatus roleStatus) {
        this.roleStatus = roleStatus.toString();
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
        if (getAdminAccount() != null)
            sb.append("AdminAccount: ").append(getAdminAccount()).append(",");
        if (getRoleStatus() != null)
            sb.append("RoleStatus: ").append(getRoleStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAdminAccountResult == false)
            return false;
        GetAdminAccountResult other = (GetAdminAccountResult) obj;
        if (other.getAdminAccount() == null ^ this.getAdminAccount() == null)
            return false;
        if (other.getAdminAccount() != null && other.getAdminAccount().equals(this.getAdminAccount()) == false)
            return false;
        if (other.getRoleStatus() == null ^ this.getRoleStatus() == null)
            return false;
        if (other.getRoleStatus() != null && other.getRoleStatus().equals(this.getRoleStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminAccount() == null) ? 0 : getAdminAccount().hashCode());
        hashCode = prime * hashCode + ((getRoleStatus() == null) ? 0 : getRoleStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetAdminAccountResult clone() {
        try {
            return (GetAdminAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
