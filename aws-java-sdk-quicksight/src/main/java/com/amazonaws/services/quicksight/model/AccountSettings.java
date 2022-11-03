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
 * The Amazon QuickSight settings associated with your Amazon Web Services account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AccountSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The "account name" you provided for the Amazon QuickSight subscription in your Amazon Web Services account. You
     * create this name when you sign up for Amazon QuickSight. It is unique in all of Amazon Web Services and it
     * appears only when users sign in.
     * </p>
     */
    private String accountName;
    /**
     * <p>
     * The edition of Amazon QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
     * </p>
     */
    private String edition;
    /**
     * <p>
     * The default Amazon QuickSight namespace for your Amazon Web Services account.
     * </p>
     */
    private String defaultNamespace;
    /**
     * <p>
     * The main notification email for your Amazon QuickSight subscription.
     * </p>
     */
    private String notificationEmail;
    /**
     * <p>
     * A Boolean value that indicates whether public sharing is turned on for an Amazon QuickSight account. For more
     * information about turning on public sharing, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdatePublicSharingSettings.html"
     * >UpdatePublicSharingSettings</a>.
     * </p>
     */
    private Boolean publicSharingEnabled;

    /**
     * <p>
     * The "account name" you provided for the Amazon QuickSight subscription in your Amazon Web Services account. You
     * create this name when you sign up for Amazon QuickSight. It is unique in all of Amazon Web Services and it
     * appears only when users sign in.
     * </p>
     * 
     * @param accountName
     *        The "account name" you provided for the Amazon QuickSight subscription in your Amazon Web Services
     *        account. You create this name when you sign up for Amazon QuickSight. It is unique in all of Amazon Web
     *        Services and it appears only when users sign in.
     */

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * <p>
     * The "account name" you provided for the Amazon QuickSight subscription in your Amazon Web Services account. You
     * create this name when you sign up for Amazon QuickSight. It is unique in all of Amazon Web Services and it
     * appears only when users sign in.
     * </p>
     * 
     * @return The "account name" you provided for the Amazon QuickSight subscription in your Amazon Web Services
     *         account. You create this name when you sign up for Amazon QuickSight. It is unique in all of Amazon Web
     *         Services and it appears only when users sign in.
     */

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * <p>
     * The "account name" you provided for the Amazon QuickSight subscription in your Amazon Web Services account. You
     * create this name when you sign up for Amazon QuickSight. It is unique in all of Amazon Web Services and it
     * appears only when users sign in.
     * </p>
     * 
     * @param accountName
     *        The "account name" you provided for the Amazon QuickSight subscription in your Amazon Web Services
     *        account. You create this name when you sign up for Amazon QuickSight. It is unique in all of Amazon Web
     *        Services and it appears only when users sign in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSettings withAccountName(String accountName) {
        setAccountName(accountName);
        return this;
    }

    /**
     * <p>
     * The edition of Amazon QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
     * </p>
     * 
     * @param edition
     *        The edition of Amazon QuickSight that you're currently subscribed to: Enterprise edition or Standard
     *        edition.
     * @see Edition
     */

    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * <p>
     * The edition of Amazon QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
     * </p>
     * 
     * @return The edition of Amazon QuickSight that you're currently subscribed to: Enterprise edition or Standard
     *         edition.
     * @see Edition
     */

    public String getEdition() {
        return this.edition;
    }

    /**
     * <p>
     * The edition of Amazon QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
     * </p>
     * 
     * @param edition
     *        The edition of Amazon QuickSight that you're currently subscribed to: Enterprise edition or Standard
     *        edition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Edition
     */

    public AccountSettings withEdition(String edition) {
        setEdition(edition);
        return this;
    }

    /**
     * <p>
     * The edition of Amazon QuickSight that you're currently subscribed to: Enterprise edition or Standard edition.
     * </p>
     * 
     * @param edition
     *        The edition of Amazon QuickSight that you're currently subscribed to: Enterprise edition or Standard
     *        edition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Edition
     */

    public AccountSettings withEdition(Edition edition) {
        this.edition = edition.toString();
        return this;
    }

    /**
     * <p>
     * The default Amazon QuickSight namespace for your Amazon Web Services account.
     * </p>
     * 
     * @param defaultNamespace
     *        The default Amazon QuickSight namespace for your Amazon Web Services account.
     */

    public void setDefaultNamespace(String defaultNamespace) {
        this.defaultNamespace = defaultNamespace;
    }

    /**
     * <p>
     * The default Amazon QuickSight namespace for your Amazon Web Services account.
     * </p>
     * 
     * @return The default Amazon QuickSight namespace for your Amazon Web Services account.
     */

    public String getDefaultNamespace() {
        return this.defaultNamespace;
    }

    /**
     * <p>
     * The default Amazon QuickSight namespace for your Amazon Web Services account.
     * </p>
     * 
     * @param defaultNamespace
     *        The default Amazon QuickSight namespace for your Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSettings withDefaultNamespace(String defaultNamespace) {
        setDefaultNamespace(defaultNamespace);
        return this;
    }

    /**
     * <p>
     * The main notification email for your Amazon QuickSight subscription.
     * </p>
     * 
     * @param notificationEmail
     *        The main notification email for your Amazon QuickSight subscription.
     */

    public void setNotificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    /**
     * <p>
     * The main notification email for your Amazon QuickSight subscription.
     * </p>
     * 
     * @return The main notification email for your Amazon QuickSight subscription.
     */

    public String getNotificationEmail() {
        return this.notificationEmail;
    }

    /**
     * <p>
     * The main notification email for your Amazon QuickSight subscription.
     * </p>
     * 
     * @param notificationEmail
     *        The main notification email for your Amazon QuickSight subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSettings withNotificationEmail(String notificationEmail) {
        setNotificationEmail(notificationEmail);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether public sharing is turned on for an Amazon QuickSight account. For more
     * information about turning on public sharing, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdatePublicSharingSettings.html"
     * >UpdatePublicSharingSettings</a>.
     * </p>
     * 
     * @param publicSharingEnabled
     *        A Boolean value that indicates whether public sharing is turned on for an Amazon QuickSight account. For
     *        more information about turning on public sharing, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdatePublicSharingSettings.html"
     *        >UpdatePublicSharingSettings</a>.
     */

    public void setPublicSharingEnabled(Boolean publicSharingEnabled) {
        this.publicSharingEnabled = publicSharingEnabled;
    }

    /**
     * <p>
     * A Boolean value that indicates whether public sharing is turned on for an Amazon QuickSight account. For more
     * information about turning on public sharing, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdatePublicSharingSettings.html"
     * >UpdatePublicSharingSettings</a>.
     * </p>
     * 
     * @return A Boolean value that indicates whether public sharing is turned on for an Amazon QuickSight account. For
     *         more information about turning on public sharing, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdatePublicSharingSettings.html"
     *         >UpdatePublicSharingSettings</a>.
     */

    public Boolean getPublicSharingEnabled() {
        return this.publicSharingEnabled;
    }

    /**
     * <p>
     * A Boolean value that indicates whether public sharing is turned on for an Amazon QuickSight account. For more
     * information about turning on public sharing, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdatePublicSharingSettings.html"
     * >UpdatePublicSharingSettings</a>.
     * </p>
     * 
     * @param publicSharingEnabled
     *        A Boolean value that indicates whether public sharing is turned on for an Amazon QuickSight account. For
     *        more information about turning on public sharing, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdatePublicSharingSettings.html"
     *        >UpdatePublicSharingSettings</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSettings withPublicSharingEnabled(Boolean publicSharingEnabled) {
        setPublicSharingEnabled(publicSharingEnabled);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether public sharing is turned on for an Amazon QuickSight account. For more
     * information about turning on public sharing, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdatePublicSharingSettings.html"
     * >UpdatePublicSharingSettings</a>.
     * </p>
     * 
     * @return A Boolean value that indicates whether public sharing is turned on for an Amazon QuickSight account. For
     *         more information about turning on public sharing, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/APIReference/API_UpdatePublicSharingSettings.html"
     *         >UpdatePublicSharingSettings</a>.
     */

    public Boolean isPublicSharingEnabled() {
        return this.publicSharingEnabled;
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
            sb.append("NotificationEmail: ").append(getNotificationEmail()).append(",");
        if (getPublicSharingEnabled() != null)
            sb.append("PublicSharingEnabled: ").append(getPublicSharingEnabled());
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
        if (other.getPublicSharingEnabled() == null ^ this.getPublicSharingEnabled() == null)
            return false;
        if (other.getPublicSharingEnabled() != null && other.getPublicSharingEnabled().equals(this.getPublicSharingEnabled()) == false)
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
        hashCode = prime * hashCode + ((getPublicSharingEnabled() == null) ? 0 : getPublicSharingEnabled().hashCode());
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
