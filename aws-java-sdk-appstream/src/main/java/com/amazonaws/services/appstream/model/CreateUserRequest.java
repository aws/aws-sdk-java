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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The email address of the user.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The action to take for the welcome email that is sent to a user after the user is created in the user pool. If
     * you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first name or last name of the
     * user. If the value is null, the email is sent.
     * </p>
     * <note>
     * <p>
     * The temporary password in the welcome email is valid for only 7 days. If users don’t set their passwords within 7
     * days, you must send them a new welcome email.
     * </p>
     * </note>
     */
    private String messageAction;
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
     * The authentication type for the user. You must specify USERPOOL.
     * </p>
     */
    private String authenticationType;

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

    public CreateUserRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The action to take for the welcome email that is sent to a user after the user is created in the user pool. If
     * you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first name or last name of the
     * user. If the value is null, the email is sent.
     * </p>
     * <note>
     * <p>
     * The temporary password in the welcome email is valid for only 7 days. If users don’t set their passwords within 7
     * days, you must send them a new welcome email.
     * </p>
     * </note>
     * 
     * @param messageAction
     *        The action to take for the welcome email that is sent to a user after the user is created in the user
     *        pool. If you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first name or
     *        last name of the user. If the value is null, the email is sent. </p> <note>
     *        <p>
     *        The temporary password in the welcome email is valid for only 7 days. If users don’t set their passwords
     *        within 7 days, you must send them a new welcome email.
     *        </p>
     * @see MessageAction
     */

    public void setMessageAction(String messageAction) {
        this.messageAction = messageAction;
    }

    /**
     * <p>
     * The action to take for the welcome email that is sent to a user after the user is created in the user pool. If
     * you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first name or last name of the
     * user. If the value is null, the email is sent.
     * </p>
     * <note>
     * <p>
     * The temporary password in the welcome email is valid for only 7 days. If users don’t set their passwords within 7
     * days, you must send them a new welcome email.
     * </p>
     * </note>
     * 
     * @return The action to take for the welcome email that is sent to a user after the user is created in the user
     *         pool. If you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first name or
     *         last name of the user. If the value is null, the email is sent. </p> <note>
     *         <p>
     *         The temporary password in the welcome email is valid for only 7 days. If users don’t set their passwords
     *         within 7 days, you must send them a new welcome email.
     *         </p>
     * @see MessageAction
     */

    public String getMessageAction() {
        return this.messageAction;
    }

    /**
     * <p>
     * The action to take for the welcome email that is sent to a user after the user is created in the user pool. If
     * you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first name or last name of the
     * user. If the value is null, the email is sent.
     * </p>
     * <note>
     * <p>
     * The temporary password in the welcome email is valid for only 7 days. If users don’t set their passwords within 7
     * days, you must send them a new welcome email.
     * </p>
     * </note>
     * 
     * @param messageAction
     *        The action to take for the welcome email that is sent to a user after the user is created in the user
     *        pool. If you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first name or
     *        last name of the user. If the value is null, the email is sent. </p> <note>
     *        <p>
     *        The temporary password in the welcome email is valid for only 7 days. If users don’t set their passwords
     *        within 7 days, you must send them a new welcome email.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageAction
     */

    public CreateUserRequest withMessageAction(String messageAction) {
        setMessageAction(messageAction);
        return this;
    }

    /**
     * <p>
     * The action to take for the welcome email that is sent to a user after the user is created in the user pool. If
     * you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first name or last name of the
     * user. If the value is null, the email is sent.
     * </p>
     * <note>
     * <p>
     * The temporary password in the welcome email is valid for only 7 days. If users don’t set their passwords within 7
     * days, you must send them a new welcome email.
     * </p>
     * </note>
     * 
     * @param messageAction
     *        The action to take for the welcome email that is sent to a user after the user is created in the user
     *        pool. If you specify SUPPRESS, no email is sent. If you specify RESEND, do not specify the first name or
     *        last name of the user. If the value is null, the email is sent. </p> <note>
     *        <p>
     *        The temporary password in the welcome email is valid for only 7 days. If users don’t set their passwords
     *        within 7 days, you must send them a new welcome email.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageAction
     */

    public CreateUserRequest withMessageAction(MessageAction messageAction) {
        this.messageAction = messageAction.toString();
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

    public CreateUserRequest withFirstName(String firstName) {
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

    public CreateUserRequest withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * The authentication type for the user. You must specify USERPOOL.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type for the user. You must specify USERPOOL.
     * @see AuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The authentication type for the user. You must specify USERPOOL.
     * </p>
     * 
     * @return The authentication type for the user. You must specify USERPOOL.
     * @see AuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The authentication type for the user. You must specify USERPOOL.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type for the user. You must specify USERPOOL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public CreateUserRequest withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The authentication type for the user. You must specify USERPOOL.
     * </p>
     * 
     * @param authenticationType
     *        The authentication type for the user. You must specify USERPOOL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationType
     */

    public CreateUserRequest withAuthenticationType(AuthenticationType authenticationType) {
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
        if (getUserName() != null)
            sb.append("UserName: ").append("***Sensitive Data Redacted***").append(",");
        if (getMessageAction() != null)
            sb.append("MessageAction: ").append(getMessageAction()).append(",");
        if (getFirstName() != null)
            sb.append("FirstName: ").append("***Sensitive Data Redacted***").append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof CreateUserRequest == false)
            return false;
        CreateUserRequest other = (CreateUserRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getMessageAction() == null ^ this.getMessageAction() == null)
            return false;
        if (other.getMessageAction() != null && other.getMessageAction().equals(this.getMessageAction()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
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

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getMessageAction() == null) ? 0 : getMessageAction().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserRequest clone() {
        return (CreateUserRequest) super.clone();
    }

}
