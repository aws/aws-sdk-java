/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDataLakeOrganizationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDataLakeOrganizationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Turns off automatic enablement of Security Lake for member accounts that are added to an organization.
     * </p>
     */
    private java.util.List<DataLakeAutoEnableNewAccountConfiguration> autoEnableNewAccount;

    /**
     * <p>
     * Turns off automatic enablement of Security Lake for member accounts that are added to an organization.
     * </p>
     * 
     * @return Turns off automatic enablement of Security Lake for member accounts that are added to an organization.
     */

    public java.util.List<DataLakeAutoEnableNewAccountConfiguration> getAutoEnableNewAccount() {
        return autoEnableNewAccount;
    }

    /**
     * <p>
     * Turns off automatic enablement of Security Lake for member accounts that are added to an organization.
     * </p>
     * 
     * @param autoEnableNewAccount
     *        Turns off automatic enablement of Security Lake for member accounts that are added to an organization.
     */

    public void setAutoEnableNewAccount(java.util.Collection<DataLakeAutoEnableNewAccountConfiguration> autoEnableNewAccount) {
        if (autoEnableNewAccount == null) {
            this.autoEnableNewAccount = null;
            return;
        }

        this.autoEnableNewAccount = new java.util.ArrayList<DataLakeAutoEnableNewAccountConfiguration>(autoEnableNewAccount);
    }

    /**
     * <p>
     * Turns off automatic enablement of Security Lake for member accounts that are added to an organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoEnableNewAccount(java.util.Collection)} or {@link #withAutoEnableNewAccount(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param autoEnableNewAccount
     *        Turns off automatic enablement of Security Lake for member accounts that are added to an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDataLakeOrganizationConfigurationRequest withAutoEnableNewAccount(DataLakeAutoEnableNewAccountConfiguration... autoEnableNewAccount) {
        if (this.autoEnableNewAccount == null) {
            setAutoEnableNewAccount(new java.util.ArrayList<DataLakeAutoEnableNewAccountConfiguration>(autoEnableNewAccount.length));
        }
        for (DataLakeAutoEnableNewAccountConfiguration ele : autoEnableNewAccount) {
            this.autoEnableNewAccount.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Turns off automatic enablement of Security Lake for member accounts that are added to an organization.
     * </p>
     * 
     * @param autoEnableNewAccount
     *        Turns off automatic enablement of Security Lake for member accounts that are added to an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDataLakeOrganizationConfigurationRequest withAutoEnableNewAccount(
            java.util.Collection<DataLakeAutoEnableNewAccountConfiguration> autoEnableNewAccount) {
        setAutoEnableNewAccount(autoEnableNewAccount);
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
        if (getAutoEnableNewAccount() != null)
            sb.append("AutoEnableNewAccount: ").append(getAutoEnableNewAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDataLakeOrganizationConfigurationRequest == false)
            return false;
        DeleteDataLakeOrganizationConfigurationRequest other = (DeleteDataLakeOrganizationConfigurationRequest) obj;
        if (other.getAutoEnableNewAccount() == null ^ this.getAutoEnableNewAccount() == null)
            return false;
        if (other.getAutoEnableNewAccount() != null && other.getAutoEnableNewAccount().equals(this.getAutoEnableNewAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoEnableNewAccount() == null) ? 0 : getAutoEnableNewAccount().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDataLakeOrganizationConfigurationRequest clone() {
        return (DeleteDataLakeOrganizationConfigurationRequest) super.clone();
    }

}
