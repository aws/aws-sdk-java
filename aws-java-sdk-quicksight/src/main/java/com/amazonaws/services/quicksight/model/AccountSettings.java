/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The QuickSight settings associated with your AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AccountSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The "account name" you provided for the QuickSight subscription in your AWS account. You create this name when
     * you sign up for QuickSight. It is unique in all of AWS and it appears only in the console when users sign in.
     * </p>
     */
    private String accountName;
    /**
     * <p>
     * The edition of QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
     * </p>
     */
    private String edition;
    /**
     * <p>
     * The default QuickSight namespace for your AWS account.
     * </p>
     */
    private String defaultNamespace;
    /**
     * <p>
     * The main notification email for your QuickSight subscription.
     * </p>
     */
    private String notificationEmail;

    /**
     * <p>
     * The "account name" you provided for the QuickSight subscription in your AWS account. You create this name when
     * you sign up for QuickSight. It is unique in all of AWS and it appears only in the console when users sign in.
     * </p>
     * 
     * @param accountName
     *        The "account name" you provided for the QuickSight subscription in your AWS account. You create this name
     *        when you sign up for QuickSight. It is unique in all of AWS and it appears only in the console when users
     *        sign in.
     */

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * <p>
     * The "account name" you provided for the QuickSight subscription in your AWS account. You create this name when
     * you sign up for QuickSight. It is unique in all of AWS and it appears only in the console when users sign in.
     * </p>
     * 
     * @return The "account name" you provided for the QuickSight subscription in your AWS account. You create this name
     *         when you sign up for QuickSight. It is unique in all of AWS and it appears only in the console when users
     *         sign in.
     */

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * <p>
     * The "account name" you provided for the QuickSight subscription in your AWS account. You create this name when
     * you sign up for QuickSight. It is unique in all of AWS and it appears only in the console when users sign in.
     * </p>
     * 
     * @param accountName
     *        The "account name" you provided for the QuickSight subscription in your AWS account. You create this name
     *        when you sign up for QuickSight. It is unique in all of AWS and it appears only in the console when users
     *        sign in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSettings withAccountName(String accountName) {
        setAccountName(accountName);
        return this;
    }

    /**
     * <p>
     * The edition of QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
     * </p>
     * 
     * @param edition
     *        The edition of QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
     * @see Edition
     */

    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * <p>
     * The edition of QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
     * </p>
     * 
     * @return The edition of QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
     * @see Edition
     */

    public String getEdition() {
        return this.edition;
    }

    /**
     * <p>
     * The edition of QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
     * </p>
     * 
     * @param edition
     *        The edition of QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Edition
     */

    public AccountSettings withEdition(String edition) {
        setEdition(edition);
        return this;
    }

    /**
     * <p>
     * The edition of QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
     * </p>
     * 
     * @param edition
     *        The edition of QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Edition
     */

    public AccountSettings withEdition(Edition edition) {
        this.edition = edition.toString();
        return this;
    }

    /**
     * <p>
     * The default QuickSight namespace for your AWS account.
     * </p>
     * 
     * @param defaultNamespace
     *        The default QuickSight namespace for your AWS account.
     */

    public void setDefaultNamespace(String defaultNamespace) {
        this.defaultNamespace = defaultNamespace;
    }

    /**
     * <p>
     * The default QuickSight namespace for your AWS account.
     * </p>
     * 
     * @return The default QuickSight namespace for your AWS account.
     */

    public String getDefaultNamespace() {
        return this.defaultNamespace;
    }

    /**
     * <p>
     * The default QuickSight namespace for your AWS account.
     * </p>
     * 
     * @param defaultNamespace
     *        The default QuickSight namespace for your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSettings withDefaultNamespace(String defaultNamespace) {
        setDefaultNamespace(defaultNamespace);
        return this;
    }

    /**
     * <p>
     * The main notification email for your QuickSight subscription.
     * </p>
     * 
     * @param notificationEmail
     *        The main notification email for your QuickSight subscription.
     */

    public void setNotificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    /**
     * <p>
     * The main notification email for your QuickSight subscription.
     * </p>
     * 
     * @return The main notification email for your QuickSight subscription.
     */

    public String getNotificationEmail() {
        return this.notificationEmail;
    }

    /**
     * <p>
     * The main notification email for your QuickSight subscription.
     * </p>
     * 
     * @param notificationEmail
     *        The main notification email for your QuickSight subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSettings withNotificationEmail(String notificationEmail) {
        setNotificationEmail(notificationEmail);
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
        if (getAccountName() != null)
            sb.append("AccountName: ").append(getAccountName()).append(",");
        if (getEdition() != null)
            sb.append("Edition: ").append(getEdition()).append(",");
        if (getDefaultNamespace() != null)
            sb.append("DefaultNamespace: ").append(getDefaultNamespace()).append(",");
        if (getNotificationEmail() != null)
            sb.append("NotificationEmail: ").append(getNotificationEmail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountSettings == false)
            return false;
        AccountSettings other = (AccountSettings) obj;
        if (other.getAccountName() == null ^ this.getAccountName() == null)
            return false;
        if (other.getAccountName() != null && other.getAccountName().equals(this.getAccountName()) == false)
            return false;
        if (other.getEdition() == null ^ this.getEdition() == null)
            return false;
        if (other.getEdition() != null && other.getEdition().equals(this.getEdition()) == false)
            return false;
        if (other.getDefaultNamespace() == null ^ this.getDefaultNamespace() == null)
            return false;
        if (other.getDefaultNamespace() != null && other.getDefaultNamespace().equals(this.getDefaultNamespace()) == false)
            return false;
        if (other.getNotificationEmail() == null ^ this.getNotificationEmail() == null)
            return false;
        if (other.getNotificationEmail() != null && other.getNotificationEmail().equals(this.getNotificationEmail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        hashCode = prime * hashCode + ((getEdition() == null) ? 0 : getEdition().hashCode());
        hashCode = prime * hashCode + ((getDefaultNamespace() == null) ? 0 : getDefaultNamespace().hashCode());
        hashCode = prime * hashCode + ((getNotificationEmail() == null) ? 0 : getNotificationEmail().hashCode());
        return hashCode;
    }

    @Override
    public AccountSettings clone() {
        try {
            return (AccountSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AccountSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
