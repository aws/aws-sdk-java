/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>SignupResponse</code> object that contains a summary of a newly created account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SignupResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignupResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean that is <code>TRUE</code> if the Amazon QuickSight uses IAM as an authentication method.
     * </p>
     */
    private Boolean iAMUser;
    /**
     * <p>
     * The user login name for your Amazon QuickSight account.
     * </p>
     */
    private String userLoginName;
    /**
     * <p>
     * The name of your Amazon QuickSight account.
     * </p>
     */
    private String accountName;
    /**
     * <p>
     * The type of Active Directory that is being used to authenticate the Amazon QuickSight account. Valid values are
     * <code>SIMPLE_AD</code>, <code>AD_CONNECTOR</code>, and <code>MICROSOFT_AD</code>.
     * </p>
     */
    private String directoryType;

    /**
     * <p>
     * A Boolean that is <code>TRUE</code> if the Amazon QuickSight uses IAM as an authentication method.
     * </p>
     * 
     * @param iAMUser
     *        A Boolean that is <code>TRUE</code> if the Amazon QuickSight uses IAM as an authentication method.
     */

    public void setIAMUser(Boolean iAMUser) {
        this.iAMUser = iAMUser;
    }

    /**
     * <p>
     * A Boolean that is <code>TRUE</code> if the Amazon QuickSight uses IAM as an authentication method.
     * </p>
     * 
     * @return A Boolean that is <code>TRUE</code> if the Amazon QuickSight uses IAM as an authentication method.
     */

    public Boolean getIAMUser() {
        return this.iAMUser;
    }

    /**
     * <p>
     * A Boolean that is <code>TRUE</code> if the Amazon QuickSight uses IAM as an authentication method.
     * </p>
     * 
     * @param iAMUser
     *        A Boolean that is <code>TRUE</code> if the Amazon QuickSight uses IAM as an authentication method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignupResponse withIAMUser(Boolean iAMUser) {
        setIAMUser(iAMUser);
        return this;
    }

    /**
     * <p>
     * A Boolean that is <code>TRUE</code> if the Amazon QuickSight uses IAM as an authentication method.
     * </p>
     * 
     * @return A Boolean that is <code>TRUE</code> if the Amazon QuickSight uses IAM as an authentication method.
     */

    public Boolean isIAMUser() {
        return this.iAMUser;
    }

    /**
     * <p>
     * The user login name for your Amazon QuickSight account.
     * </p>
     * 
     * @param userLoginName
     *        The user login name for your Amazon QuickSight account.
     */

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    /**
     * <p>
     * The user login name for your Amazon QuickSight account.
     * </p>
     * 
     * @return The user login name for your Amazon QuickSight account.
     */

    public String getUserLoginName() {
        return this.userLoginName;
    }

    /**
     * <p>
     * The user login name for your Amazon QuickSight account.
     * </p>
     * 
     * @param userLoginName
     *        The user login name for your Amazon QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignupResponse withUserLoginName(String userLoginName) {
        setUserLoginName(userLoginName);
        return this;
    }

    /**
     * <p>
     * The name of your Amazon QuickSight account.
     * </p>
     * 
     * @param accountName
     *        The name of your Amazon QuickSight account.
     */

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * <p>
     * The name of your Amazon QuickSight account.
     * </p>
     * 
     * @return The name of your Amazon QuickSight account.
     */

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * <p>
     * The name of your Amazon QuickSight account.
     * </p>
     * 
     * @param accountName
     *        The name of your Amazon QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignupResponse withAccountName(String accountName) {
        setAccountName(accountName);
        return this;
    }

    /**
     * <p>
     * The type of Active Directory that is being used to authenticate the Amazon QuickSight account. Valid values are
     * <code>SIMPLE_AD</code>, <code>AD_CONNECTOR</code>, and <code>MICROSOFT_AD</code>.
     * </p>
     * 
     * @param directoryType
     *        The type of Active Directory that is being used to authenticate the Amazon QuickSight account. Valid
     *        values are <code>SIMPLE_AD</code>, <code>AD_CONNECTOR</code>, and <code>MICROSOFT_AD</code>.
     */

    public void setDirectoryType(String directoryType) {
        this.directoryType = directoryType;
    }

    /**
     * <p>
     * The type of Active Directory that is being used to authenticate the Amazon QuickSight account. Valid values are
     * <code>SIMPLE_AD</code>, <code>AD_CONNECTOR</code>, and <code>MICROSOFT_AD</code>.
     * </p>
     * 
     * @return The type of Active Directory that is being used to authenticate the Amazon QuickSight account. Valid
     *         values are <code>SIMPLE_AD</code>, <code>AD_CONNECTOR</code>, and <code>MICROSOFT_AD</code>.
     */

    public String getDirectoryType() {
        return this.directoryType;
    }

    /**
     * <p>
     * The type of Active Directory that is being used to authenticate the Amazon QuickSight account. Valid values are
     * <code>SIMPLE_AD</code>, <code>AD_CONNECTOR</code>, and <code>MICROSOFT_AD</code>.
     * </p>
     * 
     * @param directoryType
     *        The type of Active Directory that is being used to authenticate the Amazon QuickSight account. Valid
     *        values are <code>SIMPLE_AD</code>, <code>AD_CONNECTOR</code>, and <code>MICROSOFT_AD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignupResponse withDirectoryType(String directoryType) {
        setDirectoryType(directoryType);
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
        if (getIAMUser() != null)
            sb.append("IAMUser: ").append(getIAMUser()).append(",");
        if (getUserLoginName() != null)
            sb.append("UserLoginName: ").append(getUserLoginName()).append(",");
        if (getAccountName() != null)
            sb.append("AccountName: ").append(getAccountName()).append(",");
        if (getDirectoryType() != null)
            sb.append("DirectoryType: ").append(getDirectoryType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignupResponse == false)
            return false;
        SignupResponse other = (SignupResponse) obj;
        if (other.getIAMUser() == null ^ this.getIAMUser() == null)
            return false;
        if (other.getIAMUser() != null && other.getIAMUser().equals(this.getIAMUser()) == false)
            return false;
        if (other.getUserLoginName() == null ^ this.getUserLoginName() == null)
            return false;
        if (other.getUserLoginName() != null && other.getUserLoginName().equals(this.getUserLoginName()) == false)
            return false;
        if (other.getAccountName() == null ^ this.getAccountName() == null)
            return false;
        if (other.getAccountName() != null && other.getAccountName().equals(this.getAccountName()) == false)
            return false;
        if (other.getDirectoryType() == null ^ this.getDirectoryType() == null)
            return false;
        if (other.getDirectoryType() != null && other.getDirectoryType().equals(this.getDirectoryType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIAMUser() == null) ? 0 : getIAMUser().hashCode());
        hashCode = prime * hashCode + ((getUserLoginName() == null) ? 0 : getUserLoginName().hashCode());
        hashCode = prime * hashCode + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        hashCode = prime * hashCode + ((getDirectoryType() == null) ? 0 : getDirectoryType().hashCode());
        return hashCode;
    }

    @Override
    public SignupResponse clone() {
        try {
            return (SignupResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SignupResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
