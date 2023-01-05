/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Account details for a Well-Architected best practice in relation to Trusted Advisor checks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CheckDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Trusted Advisor check ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Trusted Advisor check name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Trusted Advisor check description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Provider of the check related to the best practice.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * Well-Architected Lens ARN associated to the check.
     * </p>
     */
    private String lensArn;

    private String pillarId;

    private String questionId;

    private String choiceId;
    /**
     * <p>
     * Status associated to the check.
     * </p>
     */
    private String status;

    private String accountId;
    /**
     * <p>
     * Count of flagged resources associated to the check.
     * </p>
     */
    private Integer flaggedResources;
    /**
     * <p>
     * Reason associated to the check.
     * </p>
     */
    private String reason;

    private java.util.Date updatedAt;

    /**
     * <p>
     * Trusted Advisor check ID.
     * </p>
     * 
     * @param id
     *        Trusted Advisor check ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Trusted Advisor check ID.
     * </p>
     * 
     * @return Trusted Advisor check ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Trusted Advisor check ID.
     * </p>
     * 
     * @param id
     *        Trusted Advisor check ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Trusted Advisor check name.
     * </p>
     * 
     * @param name
     *        Trusted Advisor check name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Trusted Advisor check name.
     * </p>
     * 
     * @return Trusted Advisor check name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Trusted Advisor check name.
     * </p>
     * 
     * @param name
     *        Trusted Advisor check name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Trusted Advisor check description.
     * </p>
     * 
     * @param description
     *        Trusted Advisor check description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Trusted Advisor check description.
     * </p>
     * 
     * @return Trusted Advisor check description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Trusted Advisor check description.
     * </p>
     * 
     * @param description
     *        Trusted Advisor check description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDetail withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Provider of the check related to the best practice.
     * </p>
     * 
     * @param provider
     *        Provider of the check related to the best practice.
     * @see CheckProvider
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * Provider of the check related to the best practice.
     * </p>
     * 
     * @return Provider of the check related to the best practice.
     * @see CheckProvider
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * Provider of the check related to the best practice.
     * </p>
     * 
     * @param provider
     *        Provider of the check related to the best practice.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CheckProvider
     */

    public CheckDetail withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * Provider of the check related to the best practice.
     * </p>
     * 
     * @param provider
     *        Provider of the check related to the best practice.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CheckProvider
     */

    public CheckDetail withProvider(CheckProvider provider) {
        this.provider = provider.toString();
        return this;
    }

    /**
     * <p>
     * Well-Architected Lens ARN associated to the check.
     * </p>
     * 
     * @param lensArn
     *        Well-Architected Lens ARN associated to the check.
     */

    public void setLensArn(String lensArn) {
        this.lensArn = lensArn;
    }

    /**
     * <p>
     * Well-Architected Lens ARN associated to the check.
     * </p>
     * 
     * @return Well-Architected Lens ARN associated to the check.
     */

    public String getLensArn() {
        return this.lensArn;
    }

    /**
     * <p>
     * Well-Architected Lens ARN associated to the check.
     * </p>
     * 
     * @param lensArn
     *        Well-Architected Lens ARN associated to the check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDetail withLensArn(String lensArn) {
        setLensArn(lensArn);
        return this;
    }

    /**
     * @param pillarId
     */

    public void setPillarId(String pillarId) {
        this.pillarId = pillarId;
    }

    /**
     * @return
     */

    public String getPillarId() {
        return this.pillarId;
    }

    /**
     * @param pillarId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDetail withPillarId(String pillarId) {
        setPillarId(pillarId);
        return this;
    }

    /**
     * @param questionId
     */

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    /**
     * @return
     */

    public String getQuestionId() {
        return this.questionId;
    }

    /**
     * @param questionId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDetail withQuestionId(String questionId) {
        setQuestionId(questionId);
        return this;
    }

    /**
     * @param choiceId
     */

    public void setChoiceId(String choiceId) {
        this.choiceId = choiceId;
    }

    /**
     * @return
     */

    public String getChoiceId() {
        return this.choiceId;
    }

    /**
     * @param choiceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDetail withChoiceId(String choiceId) {
        setChoiceId(choiceId);
        return this;
    }

    /**
     * <p>
     * Status associated to the check.
     * </p>
     * 
     * @param status
     *        Status associated to the check.
     * @see CheckStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status associated to the check.
     * </p>
     * 
     * @return Status associated to the check.
     * @see CheckStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status associated to the check.
     * </p>
     * 
     * @param status
     *        Status associated to the check.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CheckStatus
     */

    public CheckDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status associated to the check.
     * </p>
     * 
     * @param status
     *        Status associated to the check.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CheckStatus
     */

    public CheckDetail withStatus(CheckStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @param accountId
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * @return
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @param accountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDetail withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Count of flagged resources associated to the check.
     * </p>
     * 
     * @param flaggedResources
     *        Count of flagged resources associated to the check.
     */

    public void setFlaggedResources(Integer flaggedResources) {
        this.flaggedResources = flaggedResources;
    }

    /**
     * <p>
     * Count of flagged resources associated to the check.
     * </p>
     * 
     * @return Count of flagged resources associated to the check.
     */

    public Integer getFlaggedResources() {
        return this.flaggedResources;
    }

    /**
     * <p>
     * Count of flagged resources associated to the check.
     * </p>
     * 
     * @param flaggedResources
     *        Count of flagged resources associated to the check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDetail withFlaggedResources(Integer flaggedResources) {
        setFlaggedResources(flaggedResources);
        return this;
    }

    /**
     * <p>
     * Reason associated to the check.
     * </p>
     * 
     * @param reason
     *        Reason associated to the check.
     * @see CheckFailureReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * Reason associated to the check.
     * </p>
     * 
     * @return Reason associated to the check.
     * @see CheckFailureReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * Reason associated to the check.
     * </p>
     * 
     * @param reason
     *        Reason associated to the check.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CheckFailureReason
     */

    public CheckDetail withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * Reason associated to the check.
     * </p>
     * 
     * @param reason
     *        Reason associated to the check.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CheckFailureReason
     */

    public CheckDetail withReason(CheckFailureReason reason) {
        this.reason = reason.toString();
        return this;
    }

    /**
     * @param updatedAt
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @param updatedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckDetail withUpdatedAt(java.util.Date updatedAt) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getLensArn() != null)
            sb.append("LensArn: ").append(getLensArn()).append(",");
        if (getPillarId() != null)
            sb.append("PillarId: ").append(getPillarId()).append(",");
        if (getQuestionId() != null)
            sb.append("QuestionId: ").append(getQuestionId()).append(",");
        if (getChoiceId() != null)
            sb.append("ChoiceId: ").append(getChoiceId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getFlaggedResources() != null)
            sb.append("FlaggedResources: ").append(getFlaggedResources()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
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

        if (obj instanceof CheckDetail == false)
            return false;
        CheckDetail other = (CheckDetail) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getLensArn() == null ^ this.getLensArn() == null)
            return false;
        if (other.getLensArn() != null && other.getLensArn().equals(this.getLensArn()) == false)
            return false;
        if (other.getPillarId() == null ^ this.getPillarId() == null)
            return false;
        if (other.getPillarId() != null && other.getPillarId().equals(this.getPillarId()) == false)
            return false;
        if (other.getQuestionId() == null ^ this.getQuestionId() == null)
            return false;
        if (other.getQuestionId() != null && other.getQuestionId().equals(this.getQuestionId()) == false)
            return false;
        if (other.getChoiceId() == null ^ this.getChoiceId() == null)
            return false;
        if (other.getChoiceId() != null && other.getChoiceId().equals(this.getChoiceId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getFlaggedResources() == null ^ this.getFlaggedResources() == null)
            return false;
        if (other.getFlaggedResources() != null && other.getFlaggedResources().equals(this.getFlaggedResources()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getLensArn() == null) ? 0 : getLensArn().hashCode());
        hashCode = prime * hashCode + ((getPillarId() == null) ? 0 : getPillarId().hashCode());
        hashCode = prime * hashCode + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        hashCode = prime * hashCode + ((getChoiceId() == null) ? 0 : getChoiceId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getFlaggedResources() == null) ? 0 : getFlaggedResources().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public CheckDetail clone() {
        try {
            return (CheckDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.CheckDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
