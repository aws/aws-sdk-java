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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMemberResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID for the account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Web Services account ID for the administrator account.
     * </p>
     */
    private String administratorAccountId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The email address for the account.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when an Amazon Macie membership invitation was last sent
     * to the account. This value is null if a Macie invitation hasn't been sent to the account.
     * </p>
     */
    private java.util.Date invitedAt;
    /**
     * <p>
     * (Deprecated) The Amazon Web Services account ID for the administrator account. This property has been replaced by
     * the administratorAccountId property and is retained only for backward compatibility.
     * </p>
     */
    private String masterAccountId;
    /**
     * <p>
     * The current status of the relationship between the account and the administrator account.
     * </p>
     */
    private String relationshipStatus;
    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the member account
     * in Amazon Macie.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the
     * relationship between the account and the administrator account.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Web Services account ID for the account.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the account.
     * </p>
     * 
     * @return The Amazon Web Services account ID for the account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the account.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMemberResult withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the administrator account.
     * </p>
     * 
     * @param administratorAccountId
     *        The Amazon Web Services account ID for the administrator account.
     */

    public void setAdministratorAccountId(String administratorAccountId) {
        this.administratorAccountId = administratorAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the administrator account.
     * </p>
     * 
     * @return The Amazon Web Services account ID for the administrator account.
     */

    public String getAdministratorAccountId() {
        return this.administratorAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the administrator account.
     * </p>
     * 
     * @param administratorAccountId
     *        The Amazon Web Services account ID for the administrator account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMemberResult withAdministratorAccountId(String administratorAccountId) {
        setAdministratorAccountId(administratorAccountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the account.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the account.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMemberResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The email address for the account.
     * </p>
     * 
     * @param email
     *        The email address for the account.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address for the account.
     * </p>
     * 
     * @return The email address for the account.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address for the account.
     * </p>
     * 
     * @param email
     *        The email address for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMemberResult withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when an Amazon Macie membership invitation was last sent
     * to the account. This value is null if a Macie invitation hasn't been sent to the account.
     * </p>
     * 
     * @param invitedAt
     *        The date and time, in UTC and extended ISO 8601 format, when an Amazon Macie membership invitation was
     *        last sent to the account. This value is null if a Macie invitation hasn't been sent to the account.
     */

    public void setInvitedAt(java.util.Date invitedAt) {
        this.invitedAt = invitedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when an Amazon Macie membership invitation was last sent
     * to the account. This value is null if a Macie invitation hasn't been sent to the account.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when an Amazon Macie membership invitation was
     *         last sent to the account. This value is null if a Macie invitation hasn't been sent to the account.
     */

    public java.util.Date getInvitedAt() {
        return this.invitedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when an Amazon Macie membership invitation was last sent
     * to the account. This value is null if a Macie invitation hasn't been sent to the account.
     * </p>
     * 
     * @param invitedAt
     *        The date and time, in UTC and extended ISO 8601 format, when an Amazon Macie membership invitation was
     *        last sent to the account. This value is null if a Macie invitation hasn't been sent to the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMemberResult withInvitedAt(java.util.Date invitedAt) {
        setInvitedAt(invitedAt);
        return this;
    }

    /**
     * <p>
     * (Deprecated) The Amazon Web Services account ID for the administrator account. This property has been replaced by
     * the administratorAccountId property and is retained only for backward compatibility.
     * </p>
     * 
     * @param masterAccountId
     *        (Deprecated) The Amazon Web Services account ID for the administrator account. This property has been
     *        replaced by the administratorAccountId property and is retained only for backward compatibility.
     */

    public void setMasterAccountId(String masterAccountId) {
        this.masterAccountId = masterAccountId;
    }

    /**
     * <p>
     * (Deprecated) The Amazon Web Services account ID for the administrator account. This property has been replaced by
     * the administratorAccountId property and is retained only for backward compatibility.
     * </p>
     * 
     * @return (Deprecated) The Amazon Web Services account ID for the administrator account. This property has been
     *         replaced by the administratorAccountId property and is retained only for backward compatibility.
     */

    public String getMasterAccountId() {
        return this.masterAccountId;
    }

    /**
     * <p>
     * (Deprecated) The Amazon Web Services account ID for the administrator account. This property has been replaced by
     * the administratorAccountId property and is retained only for backward compatibility.
     * </p>
     * 
     * @param masterAccountId
     *        (Deprecated) The Amazon Web Services account ID for the administrator account. This property has been
     *        replaced by the administratorAccountId property and is retained only for backward compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMemberResult withMasterAccountId(String masterAccountId) {
        setMasterAccountId(masterAccountId);
        return this;
    }

    /**
     * <p>
     * The current status of the relationship between the account and the administrator account.
     * </p>
     * 
     * @param relationshipStatus
     *        The current status of the relationship between the account and the administrator account.
     * @see RelationshipStatus
     */

    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    /**
     * <p>
     * The current status of the relationship between the account and the administrator account.
     * </p>
     * 
     * @return The current status of the relationship between the account and the administrator account.
     * @see RelationshipStatus
     */

    public String getRelationshipStatus() {
        return this.relationshipStatus;
    }

    /**
     * <p>
     * The current status of the relationship between the account and the administrator account.
     * </p>
     * 
     * @param relationshipStatus
     *        The current status of the relationship between the account and the administrator account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationshipStatus
     */

    public GetMemberResult withRelationshipStatus(String relationshipStatus) {
        setRelationshipStatus(relationshipStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the relationship between the account and the administrator account.
     * </p>
     * 
     * @param relationshipStatus
     *        The current status of the relationship between the account and the administrator account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationshipStatus
     */

    public GetMemberResult withRelationshipStatus(RelationshipStatus relationshipStatus) {
        this.relationshipStatus = relationshipStatus.toString();
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the member account
     * in Amazon Macie.
     * </p>
     * 
     * @return A map of key-value pairs that identifies the tags (keys and values) that are associated with the member
     *         account in Amazon Macie.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the member account
     * in Amazon Macie.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that identifies the tags (keys and values) that are associated with the member
     *        account in Amazon Macie.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the member account
     * in Amazon Macie.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that identifies the tags (keys and values) that are associated with the member
     *        account in Amazon Macie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMemberResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetMemberResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetMemberResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMemberResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the
     * relationship between the account and the administrator account.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the
     *        relationship between the account and the administrator account.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the
     * relationship between the account and the administrator account.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the
     *         relationship between the account and the administrator account.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the
     * relationship between the account and the administrator account.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the
     *        relationship between the account and the administrator account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMemberResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getAdministratorAccountId() != null)
            sb.append("AdministratorAccountId: ").append(getAdministratorAccountId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getInvitedAt() != null)
            sb.append("InvitedAt: ").append(getInvitedAt()).append(",");
        if (getMasterAccountId() != null)
            sb.append("MasterAccountId: ").append(getMasterAccountId()).append(",");
        if (getRelationshipStatus() != null)
            sb.append("RelationshipStatus: ").append(getRelationshipStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMemberResult == false)
            return false;
        GetMemberResult other = (GetMemberResult) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAdministratorAccountId() == null ^ this.getAdministratorAccountId() == null)
            return false;
        if (other.getAdministratorAccountId() != null && other.getAdministratorAccountId().equals(this.getAdministratorAccountId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getInvitedAt() == null ^ this.getInvitedAt() == null)
            return false;
        if (other.getInvitedAt() != null && other.getInvitedAt().equals(this.getInvitedAt()) == false)
            return false;
        if (other.getMasterAccountId() == null ^ this.getMasterAccountId() == null)
            return false;
        if (other.getMasterAccountId() != null && other.getMasterAccountId().equals(this.getMasterAccountId()) == false)
            return false;
        if (other.getRelationshipStatus() == null ^ this.getRelationshipStatus() == null)
            return false;
        if (other.getRelationshipStatus() != null && other.getRelationshipStatus().equals(this.getRelationshipStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAdministratorAccountId() == null) ? 0 : getAdministratorAccountId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getInvitedAt() == null) ? 0 : getInvitedAt().hashCode());
        hashCode = prime * hashCode + ((getMasterAccountId() == null) ? 0 : getMasterAccountId().hashCode());
        hashCode = prime * hashCode + ((getRelationshipStatus() == null) ? 0 : getRelationshipStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetMemberResult clone() {
        try {
            return (GetMemberResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
