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
 * A structure that contains the following account information elements:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Your Amazon QuickSight account name.
 * </p>
 * </li>
 * <li>
 * <p>
 * The edition of Amazon QuickSight that your account is using.
 * </p>
 * </li>
 * <li>
 * <p>
 * The notification email address that is associated with the Amazon QuickSight account.
 * </p>
 * </li>
 * <li>
 * <p>
 * The authentication type of the Amazon QuickSight account.
 * </p>
 * </li>
 * <li>
 * <p>
 * The status of the Amazon QuickSight account's subscription.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AccountInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account name that you provided for the Amazon QuickSight subscription in your Amazon Web Services account.
     * You create this name when you sign up for Amazon QuickSight. It's unique over all of Amazon Web Services, and it
     * appears only when users sign in.
     * </p>
     */
    private String accountName;
    /**
     * <p>
     * The edition of your Amazon QuickSight account.
     * </p>
     */
    private String edition;
    /**
     * <p>
     * The email address that will be used for Amazon QuickSight to send notifications regarding your Amazon Web
     * Services account or Amazon QuickSight subscription.
     * </p>
     */
    private String notificationEmail;
    /**
     * <p>
     * The way that your Amazon QuickSight account is authenticated.
     * </p>
     */
    private String authenticationType;
    /**
     * <p>
     * The status of your account subscription.
     * </p>
     */
    private String accountSubscriptionStatus;

    /**
     * <p>
     * The account name that you provided for the Amazon QuickSight subscription in your Amazon Web Services account.
     * You create this name when you sign up for Amazon QuickSight. It's unique over all of Amazon Web Services, and it
     * appears only when users sign in.
     * </p>
     * 
     * @param accountName
     *        The account name that you provided for the Amazon QuickSight subscription in your Amazon Web Services
     *        account. You create this name when you sign up for Amazon QuickSight. It's unique over all of Amazon Web
     *        Services, and it appears only when users sign in.
     */

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * <p>
     * The account name that you provided for the Amazon QuickSight subscription in your Amazon Web Services account.
     * You create this name when you sign up for Amazon QuickSight. It's unique over all of Amazon Web Services, and it
     * appears only when users sign in.
     * </p>
     * 
     * @return The account name that you provided for the Amazon QuickSight subscription in your Amazon Web Services
     *         account. You create this name when you sign up for Amazon QuickSight. It's unique over all of Amazon Web
     *         Services, and it appears only when users sign in.
     */

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * <p>
     * The account name that you provided for the Amazon QuickSight subscription in your Amazon Web Services account.
     * You create this name when you sign up for Amazon QuickSight. It's unique over all of Amazon Web Services, and it
     * appears only when users sign in.
     * </p>
     * 
     * @param accountName
     *        The account name that you provided for the Amazon QuickSight subscription in your Amazon Web Services
     *        account. You create this name when you sign up for Amazon QuickSight. It's unique over all of Amazon Web
     *        Services, and it appears only when users sign in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountInfo withAccountName(String accountName) {
        setAccountName(accountName);
        return this;
    }

    /**
     * <p>
     * The edition of your Amazon QuickSight account.
     * </p>
     * 
     * @param edition
     *        The edition of your Amazon QuickSight account.
     * @see Edition
     */

    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * <p>
     * The edition of your Amazon QuickSight account.
     * </p>
     * 
     * @return The edition of your Amazon QuickSight account.
     * @see Edition
     */

    public String getEdition() {
        return this.edition;
    }

    /**
     * <p>
     * The edition of your Amazon QuickSight account.
     * </p>
     * 
     * @param edition
     *        The edition of your Amazon QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Edition
     */

    public AccountInfo withEdition(String edition) {
        setEdition(edition);
        return this;
    }

    /**
     * <p>
     * The edition of your Amazon QuickSight account.
     * </p>
     * 
     * @param edition
     *        The edition of your Amazon QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Edition
     */

    public AccountInfo withEdition(Edition edition) {
        this.edition = edition.toString();
        return this;
    }

    /**
     * <p>
     * The email address that will be used for Amazon QuickSight to send notifications regarding your Amazon Web
     * Services account or Amazon QuickSight subscription.
     * </p>
     * 
     * @param notificationEmail
     *        The email address that will be used for Amazon QuickSight to send notifications regarding your Amazon Web
     *        Services account or Amazon QuickSight subscription.
     */

    public void setNotificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    /**
     * <p>
     * The email address that will be used for Amazon QuickSight to send notifications regarding your Amazon Web
     * Services account or Amazon QuickSight subscription.
     * </p>
     * 
     * @return The email address that will be used for Amazon QuickSight to send notifications regarding your Amazon Web
     *         Services account or Amazon QuickSight subscription.
     */

    public String getNotificationEmail() {
        return this.notificationEmail;
    }

    /**
     * <p>
     * The email address that will be used for Amazon QuickSight to send notifications regarding your Amazon Web
     * Services account or Amazon QuickSight subscription.
     * </p>
     * 
     * @param notificationEmail
     *        The email address that will be used for Amazon QuickSight to send notifications regarding your Amazon Web
     *        Services account or Amazon QuickSight subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountInfo withNotificationEmail(String notificationEmail) {
        setNotificationEmail(notificationEmail);
        return this;
    }

    /**
     * <p>
     * The way that your Amazon QuickSight account is authenticated.
     * </p>
     * 
     * @param authenticationType
     *        The way that your Amazon QuickSight account is authenticated.
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The way that your Amazon QuickSight account is authenticated.
     * </p>
     * 
     * @return The way that your Amazon QuickSight account is authenticated.
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The way that your Amazon QuickSight account is authenticated.
     * </p>
     * 
     * @param authenticationType
     *        The way that your Amazon QuickSight account is authenticated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountInfo withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The status of your account subscription.
     * </p>
     * 
     * @param accountSubscriptionStatus
     *        The status of your account subscription.
     */

    public void setAccountSubscriptionStatus(String accountSubscriptionStatus) {
        this.accountSubscriptionStatus = accountSubscriptionStatus;
    }

    /**
     * <p>
     * The status of your account subscription.
     * </p>
     * 
     * @return The status of your account subscription.
     */

    public String getAccountSubscriptionStatus() {
        return this.accountSubscriptionStatus;
    }

    /**
     * <p>
     * The status of your account subscription.
     * </p>
     * 
     * @param accountSubscriptionStatus
     *        The status of your account subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountInfo withAccountSubscriptionStatus(String accountSubscriptionStatus) {
        setAccountSubscriptionStatus(accountSubscriptionStatus);
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
        if (getNotificationEmail() != null)
            sb.append("NotificationEmail: ").append(getNotificationEmail()).append(",");
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType()).append(",");
        if (getAccountSubscriptionStatus() != null)
            sb.append("AccountSubscriptionStatus: ").append(getAccountSubscriptionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountInfo == false)
            return false;
        AccountInfo other = (AccountInfo) obj;
        if (other.getAccountName() == null ^ this.getAccountName() == null)
            return false;
        if (other.getAccountName() != null && other.getAccountName().equals(this.getAccountName()) == false)
            return false;
        if (other.getEdition() == null ^ this.getEdition() == null)
            return false;
        if (other.getEdition() != null && other.getEdition().equals(this.getEdition()) == false)
            return false;
        if (other.getNotificationEmail() == null ^ this.getNotificationEmail() == null)
            return false;
        if (other.getNotificationEmail() != null && other.getNotificationEmail().equals(this.getNotificationEmail()) == false)
            return false;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        if (other.getAccountSubscriptionStatus() == null ^ this.getAccountSubscriptionStatus() == null)
            return false;
        if (other.getAccountSubscriptionStatus() != null && other.getAccountSubscriptionStatus().equals(this.getAccountSubscriptionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        hashCode = prime * hashCode + ((getEdition() == null) ? 0 : getEdition().hashCode());
        hashCode = prime * hashCode + ((getNotificationEmail() == null) ? 0 : getNotificationEmail().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getAccountSubscriptionStatus() == null) ? 0 : getAccountSubscriptionStatus().hashCode());
        return hashCode;
    }

    @Override
    public AccountInfo clone() {
        try {
            return (AccountInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AccountInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
