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
 * Describes a user in the user pool and the associated stack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/UserStackAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserStackAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the stack that is associated with the user.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The email address of the user who is associated with the stack.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The authentication type for the user.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     * </p>
     */
    private Boolean sendEmailNotification;

    /**
     * <p>
     * The name of the stack that is associated with the user.
     * </p>
     * 
     * @param stackName
     *        The name of the stack that is associated with the user.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name of the stack that is associated with the user.
     * </p>
     * 
     * @return The name of the stack that is associated with the user.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name of the stack that is associated with the user.
     * </p>
     * 
     * @param stackName
     *        The name of the stack that is associated with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserStackAssociation withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The email address of the user who is associated with the stack.
     * </p>
     * 
     * @param userName
     *        The email address of the user who is associated with the stack.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The email address of the user who is associated with the stack.
     * </p>
     * 
     * @return The email address of the user who is associated with the stack.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The email address of the user who is associated with the stack.
     * </p>
     * 
     * @param userName
     *        The email address of the user who is associated with the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserStackAssociation withUserName(String userName) {
        setUserName(userName);
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

    public UserStackAssociation withAuthenticationType(String authenticationType) {
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

    public UserStackAssociation withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     * </p>
     * 
     * @param sendEmailNotification
     *        Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     */

    public void setSendEmailNotification(Boolean sendEmailNotification) {
        this.sendEmailNotification = sendEmailNotification;
    }

    /**
     * <p>
     * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     * </p>
     * 
     * @return Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     */

    public Boolean getSendEmailNotification() {
        return this.sendEmailNotification;
    }

    /**
     * <p>
     * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     * </p>
     * 
     * @param sendEmailNotification
     *        Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserStackAssociation withSendEmailNotification(Boolean sendEmailNotification) {
        setSendEmailNotification(sendEmailNotification);
        return this;
    }

    /**
     * <p>
     * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     * </p>
     * 
     * @return Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     */

    public Boolean isSendEmailNotification() {
        return this.sendEmailNotification;
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append("***Sensitive Data Redacted***").append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getSendEmailNotification() != null)
            sb.append("SendEmailNotification: ").append(getSendEmailNotification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserStackAssociation == false)
            return false;
        UserStackAssociation other = (UserStackAssociation) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getSendEmailNotification() == null ^ this.getSendEmailNotification() == null)
            return false;
        if (other.getSendEmailNotification() != null && other.getSendEmailNotification().equals(this.getSendEmailNotification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getSendEmailNotification() == null) ? 0 : getSendEmailNotification().hashCode());
        return hashCode;
    }

    @Override
    public UserStackAssociation clone() {
        try {
            return (UserStackAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.UserStackAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
