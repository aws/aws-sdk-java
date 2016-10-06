/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The type of configuration for creating a new user profile.
 * </p>
 */
public class AdminCreateUserConfigType implements Serializable, Cloneable {

    /**
     * <p>
     * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign
     * themselves up via an app.
     * </p>
     */
    private Boolean allowAdminCreateUserOnly;
    /**
     * <p>
     * The user account expiration limit, in days, after which the account is no longer usable. To reset the account
     * after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the MessageAction parameter.
     * </p>
     */
    private Integer unusedAccountValidityDays;
    /**
     * <p>
     * The message template to be used for the welcome message to new users.
     * </p>
     */
    private MessageTemplateType inviteMessageTemplate;

    /**
     * <p>
     * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign
     * themselves up via an app.
     * </p>
     * 
     * @param allowAdminCreateUserOnly
     *        Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign
     *        themselves up via an app.
     */

    public void setAllowAdminCreateUserOnly(Boolean allowAdminCreateUserOnly) {
        this.allowAdminCreateUserOnly = allowAdminCreateUserOnly;
    }

    /**
     * <p>
     * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign
     * themselves up via an app.
     * </p>
     * 
     * @return Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign
     *         themselves up via an app.
     */

    public Boolean getAllowAdminCreateUserOnly() {
        return this.allowAdminCreateUserOnly;
    }

    /**
     * <p>
     * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign
     * themselves up via an app.
     * </p>
     * 
     * @param allowAdminCreateUserOnly
     *        Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign
     *        themselves up via an app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminCreateUserConfigType withAllowAdminCreateUserOnly(Boolean allowAdminCreateUserOnly) {
        setAllowAdminCreateUserOnly(allowAdminCreateUserOnly);
        return this;
    }

    /**
     * <p>
     * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign
     * themselves up via an app.
     * </p>
     * 
     * @return Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign
     *         themselves up via an app.
     */

    public Boolean isAllowAdminCreateUserOnly() {
        return this.allowAdminCreateUserOnly;
    }

    /**
     * <p>
     * The user account expiration limit, in days, after which the account is no longer usable. To reset the account
     * after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the MessageAction parameter.
     * </p>
     * 
     * @param unusedAccountValidityDays
     *        The user account expiration limit, in days, after which the account is no longer usable. To reset the
     *        account after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the
     *        MessageAction parameter.
     */

    public void setUnusedAccountValidityDays(Integer unusedAccountValidityDays) {
        this.unusedAccountValidityDays = unusedAccountValidityDays;
    }

    /**
     * <p>
     * The user account expiration limit, in days, after which the account is no longer usable. To reset the account
     * after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the MessageAction parameter.
     * </p>
     * 
     * @return The user account expiration limit, in days, after which the account is no longer usable. To reset the
     *         account after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the
     *         MessageAction parameter.
     */

    public Integer getUnusedAccountValidityDays() {
        return this.unusedAccountValidityDays;
    }

    /**
     * <p>
     * The user account expiration limit, in days, after which the account is no longer usable. To reset the account
     * after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the MessageAction parameter.
     * </p>
     * 
     * @param unusedAccountValidityDays
     *        The user account expiration limit, in days, after which the account is no longer usable. To reset the
     *        account after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the
     *        MessageAction parameter.
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
     * 
     * @param inviteMessageTemplate
     *        The message template to be used for the welcome message to new users.
     */

    public void setInviteMessageTemplate(MessageTemplateType inviteMessageTemplate) {
        this.inviteMessageTemplate = inviteMessageTemplate;
    }

    /**
     * <p>
     * The message template to be used for the welcome message to new users.
     * </p>
     * 
     * @return The message template to be used for the welcome message to new users.
     */

    public MessageTemplateType getInviteMessageTemplate() {
        return this.inviteMessageTemplate;
    }

    /**
     * <p>
     * The message template to be used for the welcome message to new users.
     * </p>
     * 
     * @param inviteMessageTemplate
     *        The message template to be used for the welcome message to new users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminCreateUserConfigType withInviteMessageTemplate(MessageTemplateType inviteMessageTemplate) {
        setInviteMessageTemplate(inviteMessageTemplate);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("AllowAdminCreateUserOnly: " + getAllowAdminCreateUserOnly() + ",");
        if (getUnusedAccountValidityDays() != null)
            sb.append("UnusedAccountValidityDays: " + getUnusedAccountValidityDays() + ",");
        if (getInviteMessageTemplate() != null)
            sb.append("InviteMessageTemplate: " + getInviteMessageTemplate());
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
}
