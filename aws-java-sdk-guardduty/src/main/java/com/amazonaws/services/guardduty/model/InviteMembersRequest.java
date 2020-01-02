/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/InviteMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InviteMembersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account with which you want to invite members.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * A list of account IDs of the accounts that you want to invite to GuardDuty as members.
     * </p>
     */
    private java.util.List<String> accountIds;
    /**
     * <p>
     * A boolean value that specifies whether you want to disable email notification to the accounts that you’re
     * inviting to GuardDuty as members.
     * </p>
     */
    private Boolean disableEmailNotification;
    /**
     * <p>
     * The invitation message that you want to send to the accounts that you’re inviting to GuardDuty as members.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account with which you want to invite members.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector of the GuardDuty account with which you want to invite members.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account with which you want to invite members.
     * </p>
     * 
     * @return The unique ID of the detector of the GuardDuty account with which you want to invite members.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The unique ID of the detector of the GuardDuty account with which you want to invite members.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the detector of the GuardDuty account with which you want to invite members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteMembersRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * A list of account IDs of the accounts that you want to invite to GuardDuty as members.
     * </p>
     * 
     * @return A list of account IDs of the accounts that you want to invite to GuardDuty as members.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * A list of account IDs of the accounts that you want to invite to GuardDuty as members.
     * </p>
     * 
     * @param accountIds
     *        A list of account IDs of the accounts that you want to invite to GuardDuty as members.
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
     * A list of account IDs of the accounts that you want to invite to GuardDuty as members.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        A list of account IDs of the accounts that you want to invite to GuardDuty as members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteMembersRequest withAccountIds(String... accountIds) {
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
     * A list of account IDs of the accounts that you want to invite to GuardDuty as members.
     * </p>
     * 
     * @param accountIds
     *        A list of account IDs of the accounts that you want to invite to GuardDuty as members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteMembersRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * A boolean value that specifies whether you want to disable email notification to the accounts that you’re
     * inviting to GuardDuty as members.
     * </p>
     * 
     * @param disableEmailNotification
     *        A boolean value that specifies whether you want to disable email notification to the accounts that you’re
     *        inviting to GuardDuty as members.
     */

    public void setDisableEmailNotification(Boolean disableEmailNotification) {
        this.disableEmailNotification = disableEmailNotification;
    }

    /**
     * <p>
     * A boolean value that specifies whether you want to disable email notification to the accounts that you’re
     * inviting to GuardDuty as members.
     * </p>
     * 
     * @return A boolean value that specifies whether you want to disable email notification to the accounts that you’re
     *         inviting to GuardDuty as members.
     */

    public Boolean getDisableEmailNotification() {
        return this.disableEmailNotification;
    }

    /**
     * <p>
     * A boolean value that specifies whether you want to disable email notification to the accounts that you’re
     * inviting to GuardDuty as members.
     * </p>
     * 
     * @param disableEmailNotification
     *        A boolean value that specifies whether you want to disable email notification to the accounts that you’re
     *        inviting to GuardDuty as members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteMembersRequest withDisableEmailNotification(Boolean disableEmailNotification) {
        setDisableEmailNotification(disableEmailNotification);
        return this;
    }

    /**
     * <p>
     * A boolean value that specifies whether you want to disable email notification to the accounts that you’re
     * inviting to GuardDuty as members.
     * </p>
     * 
     * @return A boolean value that specifies whether you want to disable email notification to the accounts that you’re
     *         inviting to GuardDuty as members.
     */

    public Boolean isDisableEmailNotification() {
        return this.disableEmailNotification;
    }

    /**
     * <p>
     * The invitation message that you want to send to the accounts that you’re inviting to GuardDuty as members.
     * </p>
     * 
     * @param message
     *        The invitation message that you want to send to the accounts that you’re inviting to GuardDuty as members.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The invitation message that you want to send to the accounts that you’re inviting to GuardDuty as members.
     * </p>
     * 
     * @return The invitation message that you want to send to the accounts that you’re inviting to GuardDuty as
     *         members.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The invitation message that you want to send to the accounts that you’re inviting to GuardDuty as members.
     * </p>
     * 
     * @param message
     *        The invitation message that you want to send to the accounts that you’re inviting to GuardDuty as members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteMembersRequest withMessage(String message) {
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
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

        if (obj instanceof InviteMembersRequest == false)
            return false;
        InviteMembersRequest other = (InviteMembersRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getDisableEmailNotification() == null) ? 0 : getDisableEmailNotification().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public InviteMembersRequest clone() {
        return (InviteMembersRequest) super.clone();
    }

}
