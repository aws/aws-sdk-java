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
package com.amazonaws.services.savingsplans.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/CreateSavingsPlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSavingsPlanRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the offering.
     * </p>
     */
    private String savingsPlanOfferingId;
    /**
     * <p>
     * The hourly commitment, in USD. This is a value between 0.001 and 1 million. You cannot specify more than three
     * digits after the decimal point.
     * </p>
     */
    private String commitment;
    /**
     * <p>
     * The up-front payment amount. This is a whole number between 50 and 99 percent of the total value of the Savings
     * Plan. This parameter is supported only if the payment option is <code>Partial Upfront</code>.
     * </p>
     */
    private String upfrontPaymentAmount;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the offering.
     * </p>
     * 
     * @param savingsPlanOfferingId
     *        The ID of the offering.
     */

    public void setSavingsPlanOfferingId(String savingsPlanOfferingId) {
        this.savingsPlanOfferingId = savingsPlanOfferingId;
    }

    /**
     * <p>
     * The ID of the offering.
     * </p>
     * 
     * @return The ID of the offering.
     */

    public String getSavingsPlanOfferingId() {
        return this.savingsPlanOfferingId;
    }

    /**
     * <p>
     * The ID of the offering.
     * </p>
     * 
     * @param savingsPlanOfferingId
     *        The ID of the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSavingsPlanRequest withSavingsPlanOfferingId(String savingsPlanOfferingId) {
        setSavingsPlanOfferingId(savingsPlanOfferingId);
        return this;
    }

    /**
     * <p>
     * The hourly commitment, in USD. This is a value between 0.001 and 1 million. You cannot specify more than three
     * digits after the decimal point.
     * </p>
     * 
     * @param commitment
     *        The hourly commitment, in USD. This is a value between 0.001 and 1 million. You cannot specify more than
     *        three digits after the decimal point.
     */

    public void setCommitment(String commitment) {
        this.commitment = commitment;
    }

    /**
     * <p>
     * The hourly commitment, in USD. This is a value between 0.001 and 1 million. You cannot specify more than three
     * digits after the decimal point.
     * </p>
     * 
     * @return The hourly commitment, in USD. This is a value between 0.001 and 1 million. You cannot specify more than
     *         three digits after the decimal point.
     */

    public String getCommitment() {
        return this.commitment;
    }

    /**
     * <p>
     * The hourly commitment, in USD. This is a value between 0.001 and 1 million. You cannot specify more than three
     * digits after the decimal point.
     * </p>
     * 
     * @param commitment
     *        The hourly commitment, in USD. This is a value between 0.001 and 1 million. You cannot specify more than
     *        three digits after the decimal point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSavingsPlanRequest withCommitment(String commitment) {
        setCommitment(commitment);
        return this;
    }

    /**
     * <p>
     * The up-front payment amount. This is a whole number between 50 and 99 percent of the total value of the Savings
     * Plan. This parameter is supported only if the payment option is <code>Partial Upfront</code>.
     * </p>
     * 
     * @param upfrontPaymentAmount
     *        The up-front payment amount. This is a whole number between 50 and 99 percent of the total value of the
     *        Savings Plan. This parameter is supported only if the payment option is <code>Partial Upfront</code>.
     */

    public void setUpfrontPaymentAmount(String upfrontPaymentAmount) {
        this.upfrontPaymentAmount = upfrontPaymentAmount;
    }

    /**
     * <p>
     * The up-front payment amount. This is a whole number between 50 and 99 percent of the total value of the Savings
     * Plan. This parameter is supported only if the payment option is <code>Partial Upfront</code>.
     * </p>
     * 
     * @return The up-front payment amount. This is a whole number between 50 and 99 percent of the total value of the
     *         Savings Plan. This parameter is supported only if the payment option is <code>Partial Upfront</code>.
     */

    public String getUpfrontPaymentAmount() {
        return this.upfrontPaymentAmount;
    }

    /**
     * <p>
     * The up-front payment amount. This is a whole number between 50 and 99 percent of the total value of the Savings
     * Plan. This parameter is supported only if the payment option is <code>Partial Upfront</code>.
     * </p>
     * 
     * @param upfrontPaymentAmount
     *        The up-front payment amount. This is a whole number between 50 and 99 percent of the total value of the
     *        Savings Plan. This parameter is supported only if the payment option is <code>Partial Upfront</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSavingsPlanRequest withUpfrontPaymentAmount(String upfrontPaymentAmount) {
        setUpfrontPaymentAmount(upfrontPaymentAmount);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSavingsPlanRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @return One or more tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSavingsPlanRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSavingsPlanRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSavingsPlanRequest addTagsEntry(String key, String value) {
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

    public CreateSavingsPlanRequest clearTagsEntries() {
        this.tags = null;
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
        if (getSavingsPlanOfferingId() != null)
            sb.append("SavingsPlanOfferingId: ").append(getSavingsPlanOfferingId()).append(",");
        if (getCommitment() != null)
            sb.append("Commitment: ").append(getCommitment()).append(",");
        if (getUpfrontPaymentAmount() != null)
            sb.append("UpfrontPaymentAmount: ").append(getUpfrontPaymentAmount()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSavingsPlanRequest == false)
            return false;
        CreateSavingsPlanRequest other = (CreateSavingsPlanRequest) obj;
        if (other.getSavingsPlanOfferingId() == null ^ this.getSavingsPlanOfferingId() == null)
            return false;
        if (other.getSavingsPlanOfferingId() != null && other.getSavingsPlanOfferingId().equals(this.getSavingsPlanOfferingId()) == false)
            return false;
        if (other.getCommitment() == null ^ this.getCommitment() == null)
            return false;
        if (other.getCommitment() != null && other.getCommitment().equals(this.getCommitment()) == false)
            return false;
        if (other.getUpfrontPaymentAmount() == null ^ this.getUpfrontPaymentAmount() == null)
            return false;
        if (other.getUpfrontPaymentAmount() != null && other.getUpfrontPaymentAmount().equals(this.getUpfrontPaymentAmount()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSavingsPlanOfferingId() == null) ? 0 : getSavingsPlanOfferingId().hashCode());
        hashCode = prime * hashCode + ((getCommitment() == null) ? 0 : getCommitment().hashCode());
        hashCode = prime * hashCode + ((getUpfrontPaymentAmount() == null) ? 0 : getUpfrontPaymentAmount().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSavingsPlanRequest clone() {
        return (CreateSavingsPlanRequest) super.clone();
    }

}
