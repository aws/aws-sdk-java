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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateInvitations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInvitationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array that lists Amazon Web Services account IDs, one for each account to send the invitation to.
     * </p>
     */
    private java.util.List<String> accountIds;
    /**
     * <p>
     * Specifies whether to send an email notification to the root user of each account that the invitation will be sent
     * to. This notification is in addition to an alert that the root user receives in Personal Health Dashboard. To
     * send an email notification to the root user of each account, set this value to true.
     * </p>
     */
    private Boolean disableEmailNotification;
    /**
     * <p>
     * A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it
     * sends for an invitation.
     * </p>
     */
    private String message;

    /**
     * <p>
     * An array that lists Amazon Web Services account IDs, one for each account to send the invitation to.
     * </p>
     * 
     * @return An array that lists Amazon Web Services account IDs, one for each account to send the invitation to.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * An array that lists Amazon Web Services account IDs, one for each account to send the invitation to.
     * </p>
     * 
     * @param accountIds
     *        An array that lists Amazon Web Services account IDs, one for each account to send the invitation to.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * An array that lists Amazon Web Services account IDs, one for each account to send the invitation to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        An array that lists Amazon Web Services account IDs, one for each account to send the invitation to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInvitationsRequest withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists Amazon Web Services account IDs, one for each account to send the invitation to.
     * </p>
     * 
     * @param accountIds
     *        An array that lists Amazon Web Services account IDs, one for each account to send the invitation to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInvitationsRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * Specifies whether to send an email notification to the root user of each account that the invitation will be sent
     * to. This notification is in addition to an alert that the root user receives in Personal Health Dashboard. To
     * send an email notification to the root user of each account, set this value to true.
     * </p>
     * 
     * @param disableEmailNotification
     *        Specifies whether to send an email notification to the root user of each account that the invitation will
     *        be sent to. This notification is in addition to an alert that the root user receives in Personal Health
     *        Dashboard. To send an email notification to the root user of each account, set this value to true.
     */

    public void setDisableEmailNotification(Boolean disableEmailNotification) {
        this.disableEmailNotification = disableEmailNotification;
    }

    /**
     * <p>
     * Specifies whether to send an email notification to the root user of each account that the invitation will be sent
     * to. This notification is in addition to an alert that the root user receives in Personal Health Dashboard. To
     * send an email notification to the root user of each account, set this value to true.
     * </p>
     * 
     * @return Specifies whether to send an email notification to the root user of each account that the invitation will
     *         be sent to. This notification is in addition to an alert that the root user receives in Personal Health
     *         Dashboard. To send an email notification to the root user of each account, set this value to true.
     */

    public Boolean getDisableEmailNotification() {
        return this.disableEmailNotification;
    }

    /**
     * <p>
     * Specifies whether to send an email notification to the root user of each account that the invitation will be sent
     * to. This notification is in addition to an alert that the root user receives in Personal Health Dashboard. To
     * send an email notification to the root user of each account, set this value to true.
     * </p>
     * 
     * @param disableEmailNotification
     *        Specifies whether to send an email notification to the root user of each account that the invitation will
     *        be sent to. This notification is in addition to an alert that the root user receives in Personal Health
     *        Dashboard. To send an email notification to the root user of each account, set this value to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInvitationsRequest withDisableEmailNotification(Boolean disableEmailNotification) {
        setDisableEmailNotification(disableEmailNotification);
        return this;
    }

    /**
     * <p>
     * Specifies whether to send an email notification to the root user of each account that the invitation will be sent
     * to. This notification is in addition to an alert that the root user receives in Personal Health Dashboard. To
     * send an email notification to the root user of each account, set this value to true.
     * </p>
     * 
     * @return Specifies whether to send an email notification to the root user of each account that the invitation will
     *         be sent to. This notification is in addition to an alert that the root user receives in Personal Health
     *         Dashboard. To send an email notification to the root user of each account, set this value to true.
     */

    public Boolean isDisableEmailNotification() {
        return this.disableEmailNotification;
    }

    /**
     * <p>
     * A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it
     * sends for an invitation.
     * </p>
     * 
     * @param message
     *        A custom message to include in the invitation. Amazon Macie adds this message to the standard content that
     *        it sends for an invitation.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it
     * sends for an invitation.
     * </p>
     * 
     * @return A custom message to include in the invitation. Amazon Macie adds this message to the standard content
     *         that it sends for an invitation.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it
     * sends for an invitation.
     * </p>
     * 
     * @param message
     *        A custom message to include in the invitation. Amazon Macie adds this message to the standard content that
     *        it sends for an invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInvitationsRequest withMessage(String message) {
        setMessage(message);
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
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds()).append(",");
        if (getDisableEmailNotification() != null)
            sb.append("DisableEmailNotification: ").append(getDisableEmailNotification()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInvitationsRequest == false)
            return false;
        CreateInvitationsRequest other = (CreateInvitationsRequest) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getDisableEmailNotification() == null ^ this.getDisableEmailNotification() == null)
            return false;
        if (other.getDisableEmailNotification() != null && other.getDisableEmailNotification().equals(this.getDisableEmailNotification()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getDisableEmailNotification() == null) ? 0 : getDisableEmailNotification().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public CreateInvitationsRequest clone() {
        return (CreateInvitationsRequest) super.clone();
    }

}
