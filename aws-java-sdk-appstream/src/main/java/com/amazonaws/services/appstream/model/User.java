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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a user in the user pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/User" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class User implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the user.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The email address of the user.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * Specifies whether the user in the user pool is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The status of the user in the user pool. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED – The user is created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED – The user is confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED – The user is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED – The user is disabled because of a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN – The user status is not known.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The first name, or given name, of the user.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * The last name, or surname, of the user.
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * The date and time the user was created in the user pool.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The authentication type for the user.
     * </p>
     */
    private String authenticationType;

    /**
     * <p>
     * The ARN of the user.
     * </p>
     * 
     * @param arn
     *        The ARN of the user.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the user.
     * </p>
     * 
     * @return The ARN of the user.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the user.
     * </p>
     * 
     * @param arn
     *        The ARN of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The email address of the user.
     * </p>
     * 
     * @param userName
     *        The email address of the user.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The email address of the user.
     * </p>
     * 
     * @return The email address of the user.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The email address of the user.
     * </p>
     * 
     * @param userName
     *        The email address of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user in the user pool is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the user in the user pool is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the user in the user pool is enabled.
     * </p>
     * 
     * @return Specifies whether the user in the user pool is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether the user in the user pool is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the user in the user pool is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user in the user pool is enabled.
     * </p>
     * 
     * @return Specifies whether the user in the user pool is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The status of the user in the user pool. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED – The user is created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED – The user is confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED – The user is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED – The user is disabled because of a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN – The user status is not known.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the user in the user pool. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        UNCONFIRMED – The user is created but not confirmed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CONFIRMED – The user is confirmed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARCHIVED – The user is no longer active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPROMISED – The user is disabled because of a potential security threat.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN – The user status is not known.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the user in the user pool. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED – The user is created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED – The user is confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED – The user is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED – The user is disabled because of a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN – The user status is not known.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the user in the user pool. The status can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         UNCONFIRMED – The user is created but not confirmed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CONFIRMED – The user is confirmed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARCHIVED – The user is no longer active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         COMPROMISED – The user is disabled because of a potential security threat.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNKNOWN – The user status is not known.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the user in the user pool. The status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED – The user is created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED – The user is confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED – The user is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED – The user is disabled because of a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN – The user status is not known.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the user in the user pool. The status can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        UNCONFIRMED – The user is created but not confirmed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CONFIRMED – The user is confirmed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARCHIVED – The user is no longer active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPROMISED – The user is disabled because of a potential security threat.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN – The user status is not known.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The first name, or given name, of the user.
     * </p>
     * 
     * @param firstName
     *        The first name, or given name, of the user.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name, or given name, of the user.
     * </p>
     * 
     * @return The first name, or given name, of the user.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * The first name, or given name, of the user.
     * </p>
     * 
     * @param firstName
     *        The first name, or given name, of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * The last name, or surname, of the user.
     * </p>
     * 
     * @param lastName
     *        The last name, or surname, of the user.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name, or surname, of the user.
     * </p>
     * 
     * @return The last name, or surname, of the user.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * The last name, or surname, of the user.
     * </p>
     * 
     * @param lastName
     *        The last name, or surname, of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * The date and time the user was created in the user pool.
     * </p>
     * 
     * @param createdTime
     *        The date and time the user was created in the user pool.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time the user was created in the user pool.
     * </p>
     * 
     * @return The date and time the user was created in the user pool.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time the user was created in the user pool.
     * </p>
     * 
     * @param createdTime
     *        The date and time the user was created in the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The authentication type for the user.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type for the user.
     * @see AuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The authentication type for the user.
     * </p>
     * 
     * @return The authentication type for the user.
     * @see AuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The authentication type for the user.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public User withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The authentication type for the user.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public User withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append("***Sensitive Data Redacted***").append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFirstName() != null)
            sb.append("FirstName: ").append("***Sensitive Data Redacted***").append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append("***Sensitive Data Redacted***").append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof User == false)
            return false;
        User other = (User) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        return hashCode;
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.UserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
