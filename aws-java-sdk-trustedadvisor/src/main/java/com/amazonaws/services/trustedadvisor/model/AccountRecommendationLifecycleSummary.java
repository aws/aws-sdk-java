/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.trustedadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary of an AccountRecommendationLifecycle for an Organization Recommendation
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/AccountRecommendationLifecycleSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountRecommendationLifecycleSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS account ID
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Recommendation ARN
     * </p>
     */
    private String accountRecommendationArn;
    /**
     * <p>
     * When the Recommendation was last updated
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The lifecycle stage from AWS Trusted Advisor Priority
     * </p>
     */
    private String lifecycleStage;
    /**
     * <p>
     * Reason for the lifecycle stage change
     * </p>
     */
    private String updateReason;
    /**
     * <p>
     * Reason code for the lifecycle state change
     * </p>
     */
    private String updateReasonCode;
    /**
     * <p>
     * The person on whose behalf a Technical Account Manager (TAM) updated the recommendation. This information is only
     * available when a Technical Account Manager takes an action on a recommendation managed by AWS Trusted Advisor
     * Priority
     * </p>
     */
    private String updatedOnBehalfOf;
    /**
     * <p>
     * The job title of the person on whose behalf a Technical Account Manager (TAM) updated the recommendation. This
     * information is only available when a Technical Account Manager takes an action on a recommendation managed by AWS
     * Trusted Advisor Priority
     * </p>
     */
    private String updatedOnBehalfOfJobTitle;

    /**
     * <p>
     * The AWS account ID
     * </p>
     * 
     * @param accountId
     *        The AWS account ID
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID
     * </p>
     * 
     * @return The AWS account ID
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID
     * </p>
     * 
     * @param accountId
     *        The AWS account ID
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountRecommendationLifecycleSummary withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Recommendation ARN
     * </p>
     * 
     * @param accountRecommendationArn
     *        The Recommendation ARN
     */

    public void setAccountRecommendationArn(String accountRecommendationArn) {
        this.accountRecommendationArn = accountRecommendationArn;
    }

    /**
     * <p>
     * The Recommendation ARN
     * </p>
     * 
     * @return The Recommendation ARN
     */

    public String getAccountRecommendationArn() {
        return this.accountRecommendationArn;
    }

    /**
     * <p>
     * The Recommendation ARN
     * </p>
     * 
     * @param accountRecommendationArn
     *        The Recommendation ARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountRecommendationLifecycleSummary withAccountRecommendationArn(String accountRecommendationArn) {
        setAccountRecommendationArn(accountRecommendationArn);
        return this;
    }

    /**
     * <p>
     * When the Recommendation was last updated
     * </p>
     * 
     * @param lastUpdatedAt
     *        When the Recommendation was last updated
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * When the Recommendation was last updated
     * </p>
     * 
     * @return When the Recommendation was last updated
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * When the Recommendation was last updated
     * </p>
     * 
     * @param lastUpdatedAt
     *        When the Recommendation was last updated
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountRecommendationLifecycleSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The lifecycle stage from AWS Trusted Advisor Priority
     * </p>
     * 
     * @param lifecycleStage
     *        The lifecycle stage from AWS Trusted Advisor Priority
     * @see RecommendationLifecycleStage
     */

    public void setLifecycleStage(String lifecycleStage) {
        this.lifecycleStage = lifecycleStage;
    }

    /**
     * <p>
     * The lifecycle stage from AWS Trusted Advisor Priority
     * </p>
     * 
     * @return The lifecycle stage from AWS Trusted Advisor Priority
     * @see RecommendationLifecycleStage
     */

    public String getLifecycleStage() {
        return this.lifecycleStage;
    }

    /**
     * <p>
     * The lifecycle stage from AWS Trusted Advisor Priority
     * </p>
     * 
     * @param lifecycleStage
     *        The lifecycle stage from AWS Trusted Advisor Priority
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationLifecycleStage
     */

    public AccountRecommendationLifecycleSummary withLifecycleStage(String lifecycleStage) {
        setLifecycleStage(lifecycleStage);
        return this;
    }

    /**
     * <p>
     * The lifecycle stage from AWS Trusted Advisor Priority
     * </p>
     * 
     * @param lifecycleStage
     *        The lifecycle stage from AWS Trusted Advisor Priority
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationLifecycleStage
     */

    public AccountRecommendationLifecycleSummary withLifecycleStage(RecommendationLifecycleStage lifecycleStage) {
        this.lifecycleStage = lifecycleStage.toString();
        return this;
    }

    /**
     * <p>
     * Reason for the lifecycle stage change
     * </p>
     * 
     * @param updateReason
     *        Reason for the lifecycle stage change
     */

    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason;
    }

    /**
     * <p>
     * Reason for the lifecycle stage change
     * </p>
     * 
     * @return Reason for the lifecycle stage change
     */

    public String getUpdateReason() {
        return this.updateReason;
    }

    /**
     * <p>
     * Reason for the lifecycle stage change
     * </p>
     * 
     * @param updateReason
     *        Reason for the lifecycle stage change
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountRecommendationLifecycleSummary withUpdateReason(String updateReason) {
        setUpdateReason(updateReason);
        return this;
    }

    /**
     * <p>
     * Reason code for the lifecycle state change
     * </p>
     * 
     * @param updateReasonCode
     *        Reason code for the lifecycle state change
     * @see UpdateRecommendationLifecycleStageReasonCode
     */

    public void setUpdateReasonCode(String updateReasonCode) {
        this.updateReasonCode = updateReasonCode;
    }

    /**
     * <p>
     * Reason code for the lifecycle state change
     * </p>
     * 
     * @return Reason code for the lifecycle state change
     * @see UpdateRecommendationLifecycleStageReasonCode
     */

    public String getUpdateReasonCode() {
        return this.updateReasonCode;
    }

    /**
     * <p>
     * Reason code for the lifecycle state change
     * </p>
     * 
     * @param updateReasonCode
     *        Reason code for the lifecycle state change
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateRecommendationLifecycleStageReasonCode
     */

    public AccountRecommendationLifecycleSummary withUpdateReasonCode(String updateReasonCode) {
        setUpdateReasonCode(updateReasonCode);
        return this;
    }

    /**
     * <p>
     * Reason code for the lifecycle state change
     * </p>
     * 
     * @param updateReasonCode
     *        Reason code for the lifecycle state change
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateRecommendationLifecycleStageReasonCode
     */

    public AccountRecommendationLifecycleSummary withUpdateReasonCode(UpdateRecommendationLifecycleStageReasonCode updateReasonCode) {
        this.updateReasonCode = updateReasonCode.toString();
        return this;
    }

    /**
     * <p>
     * The person on whose behalf a Technical Account Manager (TAM) updated the recommendation. This information is only
     * available when a Technical Account Manager takes an action on a recommendation managed by AWS Trusted Advisor
     * Priority
     * </p>
     * 
     * @param updatedOnBehalfOf
     *        The person on whose behalf a Technical Account Manager (TAM) updated the recommendation. This information
     *        is only available when a Technical Account Manager takes an action on a recommendation managed by AWS
     *        Trusted Advisor Priority
     */

    public void setUpdatedOnBehalfOf(String updatedOnBehalfOf) {
        this.updatedOnBehalfOf = updatedOnBehalfOf;
    }

    /**
     * <p>
     * The person on whose behalf a Technical Account Manager (TAM) updated the recommendation. This information is only
     * available when a Technical Account Manager takes an action on a recommendation managed by AWS Trusted Advisor
     * Priority
     * </p>
     * 
     * @return The person on whose behalf a Technical Account Manager (TAM) updated the recommendation. This information
     *         is only available when a Technical Account Manager takes an action on a recommendation managed by AWS
     *         Trusted Advisor Priority
     */

    public String getUpdatedOnBehalfOf() {
        return this.updatedOnBehalfOf;
    }

    /**
     * <p>
     * The person on whose behalf a Technical Account Manager (TAM) updated the recommendation. This information is only
     * available when a Technical Account Manager takes an action on a recommendation managed by AWS Trusted Advisor
     * Priority
     * </p>
     * 
     * @param updatedOnBehalfOf
     *        The person on whose behalf a Technical Account Manager (TAM) updated the recommendation. This information
     *        is only available when a Technical Account Manager takes an action on a recommendation managed by AWS
     *        Trusted Advisor Priority
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountRecommendationLifecycleSummary withUpdatedOnBehalfOf(String updatedOnBehalfOf) {
        setUpdatedOnBehalfOf(updatedOnBehalfOf);
        return this;
    }

    /**
     * <p>
     * The job title of the person on whose behalf a Technical Account Manager (TAM) updated the recommendation. This
     * information is only available when a Technical Account Manager takes an action on a recommendation managed by AWS
     * Trusted Advisor Priority
     * </p>
     * 
     * @param updatedOnBehalfOfJobTitle
     *        The job title of the person on whose behalf a Technical Account Manager (TAM) updated the recommendation.
     *        This information is only available when a Technical Account Manager takes an action on a recommendation
     *        managed by AWS Trusted Advisor Priority
     */

    public void setUpdatedOnBehalfOfJobTitle(String updatedOnBehalfOfJobTitle) {
        this.updatedOnBehalfOfJobTitle = updatedOnBehalfOfJobTitle;
    }

    /**
     * <p>
     * The job title of the person on whose behalf a Technical Account Manager (TAM) updated the recommendation. This
     * information is only available when a Technical Account Manager takes an action on a recommendation managed by AWS
     * Trusted Advisor Priority
     * </p>
     * 
     * @return The job title of the person on whose behalf a Technical Account Manager (TAM) updated the recommendation.
     *         This information is only available when a Technical Account Manager takes an action on a recommendation
     *         managed by AWS Trusted Advisor Priority
     */

    public String getUpdatedOnBehalfOfJobTitle() {
        return this.updatedOnBehalfOfJobTitle;
    }

    /**
     * <p>
     * The job title of the person on whose behalf a Technical Account Manager (TAM) updated the recommendation. This
     * information is only available when a Technical Account Manager takes an action on a recommendation managed by AWS
     * Trusted Advisor Priority
     * </p>
     * 
     * @param updatedOnBehalfOfJobTitle
     *        The job title of the person on whose behalf a Technical Account Manager (TAM) updated the recommendation.
     *        This information is only available when a Technical Account Manager takes an action on a recommendation
     *        managed by AWS Trusted Advisor Priority
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountRecommendationLifecycleSummary withUpdatedOnBehalfOfJobTitle(String updatedOnBehalfOfJobTitle) {
        setUpdatedOnBehalfOfJobTitle(updatedOnBehalfOfJobTitle);
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
        if (getAccountRecommendationArn() != null)
            sb.append("AccountRecommendationArn: ").append(getAccountRecommendationArn()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getLifecycleStage() != null)
            sb.append("LifecycleStage: ").append(getLifecycleStage()).append(",");
        if (getUpdateReason() != null)
            sb.append("UpdateReason: ").append("***Sensitive Data Redacted***").append(",");
        if (getUpdateReasonCode() != null)
            sb.append("UpdateReasonCode: ").append(getUpdateReasonCode()).append(",");
        if (getUpdatedOnBehalfOf() != null)
            sb.append("UpdatedOnBehalfOf: ").append(getUpdatedOnBehalfOf()).append(",");
        if (getUpdatedOnBehalfOfJobTitle() != null)
            sb.append("UpdatedOnBehalfOfJobTitle: ").append(getUpdatedOnBehalfOfJobTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountRecommendationLifecycleSummary == false)
            return false;
        AccountRecommendationLifecycleSummary other = (AccountRecommendationLifecycleSummary) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAccountRecommendationArn() == null ^ this.getAccountRecommendationArn() == null)
            return false;
        if (other.getAccountRecommendationArn() != null && other.getAccountRecommendationArn().equals(this.getAccountRecommendationArn()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getLifecycleStage() == null ^ this.getLifecycleStage() == null)
            return false;
        if (other.getLifecycleStage() != null && other.getLifecycleStage().equals(this.getLifecycleStage()) == false)
            return false;
        if (other.getUpdateReason() == null ^ this.getUpdateReason() == null)
            return false;
        if (other.getUpdateReason() != null && other.getUpdateReason().equals(this.getUpdateReason()) == false)
            return false;
        if (other.getUpdateReasonCode() == null ^ this.getUpdateReasonCode() == null)
            return false;
        if (other.getUpdateReasonCode() != null && other.getUpdateReasonCode().equals(this.getUpdateReasonCode()) == false)
            return false;
        if (other.getUpdatedOnBehalfOf() == null ^ this.getUpdatedOnBehalfOf() == null)
            return false;
        if (other.getUpdatedOnBehalfOf() != null && other.getUpdatedOnBehalfOf().equals(this.getUpdatedOnBehalfOf()) == false)
            return false;
        if (other.getUpdatedOnBehalfOfJobTitle() == null ^ this.getUpdatedOnBehalfOfJobTitle() == null)
            return false;
        if (other.getUpdatedOnBehalfOfJobTitle() != null && other.getUpdatedOnBehalfOfJobTitle().equals(this.getUpdatedOnBehalfOfJobTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAccountRecommendationArn() == null) ? 0 : getAccountRecommendationArn().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getLifecycleStage() == null) ? 0 : getLifecycleStage().hashCode());
        hashCode = prime * hashCode + ((getUpdateReason() == null) ? 0 : getUpdateReason().hashCode());
        hashCode = prime * hashCode + ((getUpdateReasonCode() == null) ? 0 : getUpdateReasonCode().hashCode());
        hashCode = prime * hashCode + ((getUpdatedOnBehalfOf() == null) ? 0 : getUpdatedOnBehalfOf().hashCode());
        hashCode = prime * hashCode + ((getUpdatedOnBehalfOfJobTitle() == null) ? 0 : getUpdatedOnBehalfOfJobTitle().hashCode());
        return hashCode;
    }

    @Override
    public AccountRecommendationLifecycleSummary clone() {
        try {
            return (AccountRecommendationLifecycleSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.trustedadvisor.model.transform.AccountRecommendationLifecycleSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
