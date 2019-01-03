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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The IAM access key details (IAM user information) of a user that engaged in the activity that prompted GuardDuty to
 * generate a finding.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AccessKeyDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessKeyDetails implements Serializable, Cloneable, StructuredPojo {

    /** Access key ID of the user. */
    private String accessKeyId;
    /** The principal ID of the user. */
    private String principalId;
    /** The name of the user. */
    private String userName;
    /** The type of the user. */
    private String userType;

    /**
     * Access key ID of the user.
     * 
     * @param accessKeyId
     *        Access key ID of the user.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * Access key ID of the user.
     * 
     * @return Access key ID of the user.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * Access key ID of the user.
     * 
     * @param accessKeyId
     *        Access key ID of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKeyDetails withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * The principal ID of the user.
     * 
     * @param principalId
     *        The principal ID of the user.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * The principal ID of the user.
     * 
     * @return The principal ID of the user.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * The principal ID of the user.
     * 
     * @param principalId
     *        The principal ID of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKeyDetails withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * The name of the user.
     * 
     * @param userName
     *        The name of the user.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * The name of the user.
     * 
     * @return The name of the user.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * The name of the user.
     * 
     * @param userName
     *        The name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKeyDetails withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * The type of the user.
     * 
     * @param userType
     *        The type of the user.
     */

    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * The type of the user.
     * 
     * @return The type of the user.
     */

    public String getUserType() {
        return this.userType;
    }

    /**
     * The type of the user.
     * 
     * @param userType
     *        The type of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKeyDetails withUserType(String userType) {
        setUserType(userType);
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
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: ").append(getAccessKeyId()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getUserType() != null)
            sb.append("UserType: ").append(getUserType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessKeyDetails == false)
            return false;
        AccessKeyDetails other = (AccessKeyDetails) obj;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getUserType() == null ^ this.getUserType() == null)
            return false;
        if (other.getUserType() != null && other.getUserType().equals(this.getUserType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getUserType() == null) ? 0 : getUserType().hashCode());
        return hashCode;
    }

    @Override
    public AccessKeyDetails clone() {
        try {
            return (AccessKeyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.AccessKeyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
