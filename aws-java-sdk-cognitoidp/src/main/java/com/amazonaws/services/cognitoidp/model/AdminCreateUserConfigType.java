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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for creating a new user profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminCreateUserConfigType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminCreateUserConfigType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Set to <code>True</code> if only the administrator is allowed to create user profiles. Set to <code>False</code>
     * if users can sign themselves up via an app.
     * </p>
     */
    private Boolean allowAdminCreateUserOnly;
    /**
     * <p>
     * The user account expiration limit, in days, after which the account is no longer usable. To reset the account
     * after that time limit, you must call <code>AdminCreateUser</code> again, specifying <code>"RESEND"</code> for the
     * <code>MessageAction</code> parameter. The default value for this parameter is 7.
     * </p>
     * <note>
     * <p>
     * If you set a value for <code>TemporaryPasswordValidityDays</code> in <code>PasswordPolicy</code>, that value will
     * be used and <code>UnusedAccountValidityDays</code> will be deprecated for that user pool.
     * </p>
     * </note>
     */
    private Integer unusedAccountValidityDays;
    /**
     * <p>
     * The message template to be used for the welcome message to new users.
     * </p>
     * <p>
     * See also <a href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization"
     * >Customizing User Invitation Messages</a>.
     * </p>
     */
    private MessageTemplateType inviteMessageTemplate;

    /**
     * <p>
     * Set to <code>True</code> if only the administrator is allowed to create user profiles. Set to <code>False</code>
     * if users can sign themselves up via an app.
     * </p>
     * 
     * @param allowAdminCreateUserOnly
     *        Set to <code>True</code> if only the administrator is allowed to create user profiles. Set to
     *        <code>False</code> if users can sign themselves up via an app.
     */

    public void setAllowAdminCreateUserOnly(Boolean allowAdminCreateUserOnly) {
        this.allowAdminCreateUserOnly = allowAdminCreateUserOnly;
    }

    /**
     * <p>
     * Set to <code>True</code> if only the administrator is allowed to create user profiles. Set to <code>False</code>
     * if users can sign themselves up via an app.
     * </p>
     * 
     * @return Set to <code>True</code> if only the administrator is allowed to create user profiles. Set to
     *         <code>False</code> if users can sign themselves up via an app.
     */

    public Boolean getAllowAdminCreateUserOnly() {
        return this.allowAdminCreateUserOnly;
    }

    /**
     * <p>
     * Set to <code>True</code> if only the administrator is allowed to create user profiles. Set to <code>False</code>
     * if users can sign themselves up via an app.
     * </p>
     * 
     * @param allowAdminCreateUserOnly
     *        Set to <code>True</code> if only the administrator is allowed to create user profiles. Set to
     *        <code>False</code> if users can sign themselves up via an app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminCreateUserConfigType withAllowAdminCreateUserOnly(Boolean allowAdminCreateUserOnly) {
        setAllowAdminCreateUserOnly(allowAdminCreateUserOnly);
        return this;
    }

    /**
     * <p>
     * Set to <code>True</code> if only the administrator is allowed to create user profiles. Set to <code>False</code>
     * if users can sign themselves up via an app.
     * </p>
     * 
     * @return Set to <code>True</code> if only the administrator is allowed to create user profiles. Set to
     *         <code>False</code> if users can sign themselves up via an app.
     */

    public Boolean isAllowAdminCreateUserOnly() {
        return this.allowAdminCreateUserOnly;
    }

    /**
     * <p>
     * The user account expiration limit, in days, after which the account is no longer usable. To reset the account
     * after that time limit, you must call <code>AdminCreateUser</code> again, specifying <code>"RESEND"</code> for the
     * <code>MessageAction</code> parameter. The default value for this parameter is 7.
     * </p>
     * <note>
     * <p>
     * If you set a value for <code>TemporaryPasswordValidityDays</code> in <code>PasswordPolicy</code>, that value will
     * be used and <code>UnusedAccountValidityDays</code> will be deprecated for that user pool.
     * </p>
     * </note>
     * 
     * @param unusedAccountValidityDays
     *        The user account expiration limit, in days, after which the account is no longer usable. To reset the
     *        account after that time limit, you must call <code>AdminCreateUser</code> again, specifying
     *        <code>"RESEND"</code> for the <code>MessageAction</code> parameter. The default value for this parameter
     *        is 7. </p> <note>
     *        <p>
     *        If you set a value for <code>TemporaryPasswordValidityDays</code> in <code>PasswordPolicy</code>, that
     *        value will be used and <code>UnusedAccountValidityDays</code> will be deprecated for that user pool.
     *        </p>
     */

    public void setUnusedAccountValidityDays(Integer unusedAccountValidityDays) {
        this.unusedAccountValidityDays = unusedAccountValidityDays;
    }

    /**
     * <p>
     * The user account expiration limit, in days, after which the account is no longer usable. To reset the account
     * after that time limit, you must call <code>AdminCreateUser</code> again, specifying <code>"RESEND"</code> for the
     * <code>MessageAction</code> parameter. The default value for this parameter is 7.
     * </p>
     * <note>
     * <p>
     * If you set a value for <code>TemporaryPasswordValidityDays</code> in <code>PasswordPolicy</code>, that value will
     * be used and <code>UnusedAccountValidityDays</code> will be deprecated for that user pool.
     * </p>
     * </note>
     * 
     * @return The user account expiration limit, in days, after which the account is no longer usable. To reset the
     *         account after that time limit, you must call <code>AdminCreateUser</code> again, specifying
     *         <code>"RESEND"</code> for the <code>MessageAction</code> parameter. The default value for this parameter
     *         is 7. </p> <note>
     *         <p>
     *         If you set a value for <code>TemporaryPasswordValidityDays</code> in <code>PasswordPolicy</code>, that
     *         value will be used and <code>UnusedAccountValidityDays</code> will be deprecated for that user pool.
     *         </p>
     */

    public Integer getUnusedAccountValidityDays() {
        return this.unusedAccountValidityDays;
    }

    /**
     * <p>
     * The user account expiration limit, in days, after which the account is no longer usable. To reset the account
     * after that time limit, you must call <code>AdminCreateUser</code> again, specifying <code>"RESEND"</code> for the
     * <code>MessageAction</code> parameter. The default value for this parameter is 7.
     * </p>
     * <note>
     * <p>
     * If you set a value for <code>TemporaryPasswordValidityDays</code> in <code>PasswordPolicy</code>, that value will
     * be used and <code>UnusedAccountValidityDays</code> will be deprecated for that user pool.
     * </p>
     * </note>
     * 
     * @param unusedAccountValidityDays
     *        The user account expiration limit, in days, after which the account is no longer usable. To reset the
     *        account after that time limit, you must call <code>AdminCreateUser</code> again, specifying
     *        <code>"RESEND"</code> for the <code>MessageAction</code> parameter. The default value for this parameter
     *        is 7. </p> <note>
     *        <p>
     *        If you set a value for <code>TemporaryPasswordValidityDays</code> in <code>PasswordPolicy</code>, that
     *        value will be used and <code>UnusedAccountValidityDays</code> will be deprecated for that user pool.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminCreateUserConfigType withUnusedAccountValidityDays(Integer unusedAccountValidityDays) {
        setUnusedAccountValidityDays(unusedAccountValidityDays);
        return this;
    }

    /**
     * <p>
     * The message template to be used for the welcome message to new users.
     * </p>
     * <p>
     * See also <a href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization"
     * >Customizing User Invitation Messages</a>.
     * </p>
     * 
     * @param inviteMessageTemplate
     *        The message template to be used for the welcome message to new users.</p>
     *        <p>
     *        See also <a href=
     *        "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization"
     *        >Customizing User Invitation Messages</a>.
     */

    public void setInviteMessageTemplate(MessageTemplateType inviteMessageTemplate) {
        this.inviteMessageTemplate = inviteMessageTemplate;
    }

    /**
     * <p>
     * The message template to be used for the welcome message to new users.
     * </p>
     * <p>
     * See also <a href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization"
     * >Customizing User Invitation Messages</a>.
     * </p>
     * 
     * @return The message template to be used for the welcome message to new users.</p>
     *         <p>
     *         See also <a href=
     *         "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization"
     *         >Customizing User Invitation Messages</a>.
     */

    public MessageTemplateType getInviteMessageTemplate() {
        return this.inviteMessageTemplate;
    }

    /**
     * <p>
     * The message template to be used for the welcome message to new users.
     * </p>
     * <p>
     * See also <a href=
     * "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization"
     * >Customizing User Invitation Messages</a>.
     * </p>
     * 
     * @param inviteMessageTemplate
     *        The message template to be used for the welcome message to new users.</p>
     *        <p>
     *        See also <a href=
     *        "http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization"
     *        >Customizing User Invitation Messages</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminCreateUserConfigType withInviteMessageTemplate(MessageTemplateType inviteMessageTemplate) {
        setInviteMessageTemplate(inviteMessageTemplate);
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
        if (getAllowAdminCreateUserOnly() != null)
            sb.append("AllowAdminCreateUserOnly: ").append(getAllowAdminCreateUserOnly()).append(",");
        if (getUnusedAccountValidityDays() != null)
            sb.append("UnusedAccountValidityDays: ").append(getUnusedAccountValidityDays()).append(",");
        if (getInviteMessageTemplate() != null)
            sb.append("InviteMessageTemplate: ").append(getInviteMessageTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminCreateUserConfigType == false)
            return false;
        AdminCreateUserConfigType other = (AdminCreateUserConfigType) obj;
        if (other.getAllowAdminCreateUserOnly() == null ^ this.getAllowAdminCreateUserOnly() == null)
            return false;
        if (other.getAllowAdminCreateUserOnly() != null && other.getAllowAdminCreateUserOnly().equals(this.getAllowAdminCreateUserOnly()) == false)
            return false;
        if (other.getUnusedAccountValidityDays() == null ^ this.getUnusedAccountValidityDays() == null)
            return false;
        if (other.getUnusedAccountValidityDays() != null && other.getUnusedAccountValidityDays().equals(this.getUnusedAccountValidityDays()) == false)
            return false;
        if (other.getInviteMessageTemplate() == null ^ this.getInviteMessageTemplate() == null)
            return false;
        if (other.getInviteMessageTemplate() != null && other.getInviteMessageTemplate().equals(this.getInviteMessageTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowAdminCreateUserOnly() == null) ? 0 : getAllowAdminCreateUserOnly().hashCode());
        hashCode = prime * hashCode + ((getUnusedAccountValidityDays() == null) ? 0 : getUnusedAccountValidityDays().hashCode());
        hashCode = prime * hashCode + ((getInviteMessageTemplate() == null) ? 0 : getInviteMessageTemplate().hashCode());
        return hashCode;
    }

    @Override
    public AdminCreateUserConfigType clone() {
        try {
            return (AdminCreateUserConfigType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.AdminCreateUserConfigTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
