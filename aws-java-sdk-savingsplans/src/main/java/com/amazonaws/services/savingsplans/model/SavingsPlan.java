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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a Savings Plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/SavingsPlan" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlan implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the offering.
     * </p>
     */
    private String offeringId;
    /**
     * <p>
     * The ID of the Savings Plan.
     * </p>
     */
    private String savingsPlanId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Savings Plan.
     * </p>
     */
    private String savingsPlanArn;
    /**
     * <p>
     * The description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The start time.
     * </p>
     */
    private String start;
    /**
     * <p>
     * The end time.
     * </p>
     */
    private String end;
    /**
     * <p>
     * The state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The AWS Region.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The EC2 instance family.
     * </p>
     */
    private String ec2InstanceFamily;
    /**
     * <p>
     * The plan type.
     * </p>
     */
    private String savingsPlanType;
    /**
     * <p>
     * The payment option.
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The product types.
     * </p>
     */
    private java.util.List<String> productTypes;
    /**
     * <p>
     * The currency.
     * </p>
     */
    private String currency;
    /**
     * <p>
     * The hourly commitment, in USD.
     * </p>
     */
    private String commitment;
    /**
     * <p>
     * The up-front payment amount.
     * </p>
     */
    private String upfrontPaymentAmount;
    /**
     * <p>
     * The recurring payment amount.
     * </p>
     */
    private String recurringPaymentAmount;
    /**
     * <p>
     * The duration of the term, in seconds.
     * </p>
     */
    private Long termDurationInSeconds;
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
     * @param offeringId
     *        The ID of the offering.
     */

    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The ID of the offering.
     * </p>
     * 
     * @return The ID of the offering.
     */

    public String getOfferingId() {
        return this.offeringId;
    }

    /**
     * <p>
     * The ID of the offering.
     * </p>
     * 
     * @param offeringId
     *        The ID of the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlan withOfferingId(String offeringId) {
        setOfferingId(offeringId);
        return this;
    }

    /**
     * <p>
     * The ID of the Savings Plan.
     * </p>
     * 
     * @param savingsPlanId
     *        The ID of the Savings Plan.
     */

    public void setSavingsPlanId(String savingsPlanId) {
        this.savingsPlanId = savingsPlanId;
    }

    /**
     * <p>
     * The ID of the Savings Plan.
     * </p>
     * 
     * @return The ID of the Savings Plan.
     */

    public String getSavingsPlanId() {
        return this.savingsPlanId;
    }

    /**
     * <p>
     * The ID of the Savings Plan.
     * </p>
     * 
     * @param savingsPlanId
     *        The ID of the Savings Plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlan withSavingsPlanId(String savingsPlanId) {
        setSavingsPlanId(savingsPlanId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Savings Plan.
     * </p>
     * 
     * @param savingsPlanArn
     *        The Amazon Resource Name (ARN) of the Savings Plan.
     */

    public void setSavingsPlanArn(String savingsPlanArn) {
        this.savingsPlanArn = savingsPlanArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Savings Plan.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Savings Plan.
     */

    public String getSavingsPlanArn() {
        return this.savingsPlanArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Savings Plan.
     * </p>
     * 
     * @param savingsPlanArn
     *        The Amazon Resource Name (ARN) of the Savings Plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlan withSavingsPlanArn(String savingsPlanArn) {
        setSavingsPlanArn(savingsPlanArn);
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @return The description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlan withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The start time.
     * </p>
     * 
     * @param start
     *        The start time.
     */

    public void setStart(String start) {
        this.start = start;
    }

    /**
     * <p>
     * The start time.
     * </p>
     * 
     * @return The start time.
     */

    public String getStart() {
        return this.start;
    }

    /**
     * <p>
     * The start time.
     * </p>
     * 
     * @param start
     *        The start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlan withStart(String start) {
        setStart(start);
        return this;
    }

    /**
     * <p>
     * The end time.
     * </p>
     * 
     * @param end
     *        The end time.
     */

    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * <p>
     * The end time.
     * </p>
     * 
     * @return The end time.
     */

    public String getEnd() {
        return this.end;
    }

    /**
     * <p>
     * The end time.
     * </p>
     * 
     * @param end
     *        The end time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlan withEnd(String end) {
        setEnd(end);
        return this;
    }

    /**
     * <p>
     * The state.
     * </p>
     * 
     * @param state
     *        The state.
     * @see SavingsPlanState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state.
     * </p>
     * 
     * @return The state.
     * @see SavingsPlanState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state.
     * </p>
     * 
     * @param state
     *        The state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanState
     */

    public SavingsPlan withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state.
     * </p>
     * 
     * @param state
     *        The state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanState
     */

    public SavingsPlan withState(SavingsPlanState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The AWS Region.
     * </p>
     * 
     * @param region
     *        The AWS Region.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region.
     * </p>
     * 
     * @return The AWS Region.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region.
     * </p>
     * 
     * @param region
     *        The AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlan withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The EC2 instance family.
     * </p>
     * 
     * @param ec2InstanceFamily
     *        The EC2 instance family.
     */

    public void setEc2InstanceFamily(String ec2InstanceFamily) {
        this.ec2InstanceFamily = ec2InstanceFamily;
    }

    /**
     * <p>
     * The EC2 instance family.
     * </p>
     * 
     * @return The EC2 instance family.
     */

    public String getEc2InstanceFamily() {
        return this.ec2InstanceFamily;
    }

    /**
     * <p>
     * The EC2 instance family.
     * </p>
     * 
     * @param ec2InstanceFamily
     *        The EC2 instance family.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlan withEc2InstanceFamily(String ec2InstanceFamily) {
        setEc2InstanceFamily(ec2InstanceFamily);
        return this;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @param savingsPlanType
     *        The plan type.
     * @see SavingsPlanType
     */

    public void setSavingsPlanType(String savingsPlanType) {
        this.savingsPlanType = savingsPlanType;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @return The plan type.
     * @see SavingsPlanType
     */

    public String getSavingsPlanType() {
        return this.savingsPlanType;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @param savingsPlanType
     *        The plan type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanType
     */

    public SavingsPlan withSavingsPlanType(String savingsPlanType) {
        setSavingsPlanType(savingsPlanType);
        return this;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @param savingsPlanType
     *        The plan type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanType
     */

    public SavingsPlan withSavingsPlanType(SavingsPlanType savingsPlanType) {
        this.savingsPlanType = savingsPlanType.toString();
        return this;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @param paymentOption
     *        The payment option.
     * @see SavingsPlanPaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @return The payment option.
     * @see SavingsPlanPaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @param paymentOption
     *        The payment option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanPaymentOption
     */

    public SavingsPlan withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @param paymentOption
     *        The payment option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanPaymentOption
     */

    public SavingsPlan withPaymentOption(SavingsPlanPaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The product types.
     * </p>
     * 
     * @return The product types.
     * @see SavingsPlanProductType
     */

    public java.util.List<String> getProductTypes() {
        return productTypes;
    }

    /**
     * <p>
     * The product types.
     * </p>
     * 
     * @param productTypes
     *        The product types.
     * @see SavingsPlanProductType
     */

    public void setProductTypes(java.util.Collection<String> productTypes) {
        if (productTypes == null) {
            this.productTypes = null;
            return;
        }

        this.productTypes = new java.util.ArrayList<String>(productTypes);
    }

    /**
     * <p>
     * The product types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductTypes(java.util.Collection)} or {@link #withProductTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param productTypes
     *        The product types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanProductType
     */

    public SavingsPlan withProductTypes(String... productTypes) {
        if (this.productTypes == null) {
            setProductTypes(new java.util.ArrayList<String>(productTypes.length));
        }
        for (String ele : productTypes) {
            this.productTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The product types.
     * </p>
     * 
     * @param productTypes
     *        The product types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanProductType
     */

    public SavingsPlan withProductTypes(java.util.Collection<String> productTypes) {
        setProductTypes(productTypes);
        return this;
    }

    /**
     * <p>
     * The product types.
     * </p>
     * 
     * @param productTypes
     *        The product types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanProductType
     */

    public SavingsPlan withProductTypes(SavingsPlanProductType... productTypes) {
        java.util.ArrayList<String> productTypesCopy = new java.util.ArrayList<String>(productTypes.length);
        for (SavingsPlanProductType value : productTypes) {
            productTypesCopy.add(value.toString());
        }
        if (getProductTypes() == null) {
            setProductTypes(productTypesCopy);
        } else {
            getProductTypes().addAll(productTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The currency.
     * </p>
     * 
     * @param currency
     *        The currency.
     * @see CurrencyCode
     */

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * <p>
     * The currency.
     * </p>
     * 
     * @return The currency.
     * @see CurrencyCode
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     * <p>
     * The currency.
     * </p>
     * 
     * @param currency
     *        The currency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCode
     */

    public SavingsPlan withCurrency(String currency) {
        setCurrency(currency);
        return this;
    }

    /**
     * <p>
     * The currency.
     * </p>
     * 
     * @param currency
     *        The currency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCode
     */

    public SavingsPlan withCurrency(CurrencyCode currency) {
        this.currency = currency.toString();
        return this;
    }

    /**
     * <p>
     * The hourly commitment, in USD.
     * </p>
     * 
     * @param commitment
     *        The hourly commitment, in USD.
     */

    public void setCommitment(String commitment) {
        this.commitment = commitment;
    }

    /**
     * <p>
     * The hourly commitment, in USD.
     * </p>
     * 
     * @return The hourly commitment, in USD.
     */

    public String getCommitment() {
        return this.commitment;
    }

    /**
     * <p>
     * The hourly commitment, in USD.
     * </p>
     * 
     * @param commitment
     *        The hourly commitment, in USD.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlan withCommitment(String commitment) {
        setCommitment(commitment);
        return this;
    }

    /**
     * <p>
     * The up-front payment amount.
     * </p>
     * 
     * @param upfrontPaymentAmount
     *        The up-front payment amount.
     */

    public void setUpfrontPaymentAmount(String upfrontPaymentAmount) {
        this.upfrontPaymentAmount = upfrontPaymentAmount;
    }

    /**
     * <p>
     * The up-front payment amount.
     * </p>
     * 
     * @return The up-front payment amount.
     */

    public String getUpfrontPaymentAmount() {
        return this.upfrontPaymentAmount;
    }

    /**
     * <p>
     * The up-front payment amount.
     * </p>
     * 
     * @param upfrontPaymentAmount
     *        The up-front payment amount.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlan withUpfrontPaymentAmount(String upfrontPaymentAmount) {
        setUpfrontPaymentAmount(upfrontPaymentAmount);
        return this;
    }

    /**
     * <p>
     * The recurring payment amount.
     * </p>
     * 
     * @param recurringPaymentAmount
     *        The recurring payment amount.
     */

    public void setRecurringPaymentAmount(String recurringPaymentAmount) {
        this.recurringPaymentAmount = recurringPaymentAmount;
    }

    /**
     * <p>
     * The recurring payment amount.
     * </p>
     * 
     * @return The recurring payment amount.
     */

    public String getRecurringPaymentAmount() {
        return this.recurringPaymentAmount;
    }

    /**
     * <p>
     * The recurring payment amount.
     * </p>
     * 
     * @param recurringPaymentAmount
     *        The recurring payment amount.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlan withRecurringPaymentAmount(String recurringPaymentAmount) {
        setRecurringPaymentAmount(recurringPaymentAmount);
        return this;
    }

    /**
     * <p>
     * The duration of the term, in seconds.
     * </p>
     * 
     * @param termDurationInSeconds
     *        The duration of the term, in seconds.
     */

    public void setTermDurationInSeconds(Long termDurationInSeconds) {
        this.termDurationInSeconds = termDurationInSeconds;
    }

    /**
     * <p>
     * The duration of the term, in seconds.
     * </p>
     * 
     * @return The duration of the term, in seconds.
     */

    public Long getTermDurationInSeconds() {
        return this.termDurationInSeconds;
    }

    /**
     * <p>
     * The duration of the term, in seconds.
     * </p>
     * 
     * @param termDurationInSeconds
     *        The duration of the term, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlan withTermDurationInSeconds(Long termDurationInSeconds) {
        setTermDurationInSeconds(termDurationInSeconds);
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

    public SavingsPlan withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see SavingsPlan#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlan addTagsEntry(String key, String value) {
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

    public SavingsPlan clearTagsEntries() {
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
        if (getOfferingId() != null)
            sb.append("OfferingId: ").append(getOfferingId()).append(",");
        if (getSavingsPlanId() != null)
            sb.append("SavingsPlanId: ").append(getSavingsPlanId()).append(",");
        if (getSavingsPlanArn() != null)
            sb.append("SavingsPlanArn: ").append(getSavingsPlanArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart()).append(",");
        if (getEnd() != null)
            sb.append("End: ").append(getEnd()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getEc2InstanceFamily() != null)
            sb.append("Ec2InstanceFamily: ").append(getEc2InstanceFamily()).append(",");
        if (getSavingsPlanType() != null)
            sb.append("SavingsPlanType: ").append(getSavingsPlanType()).append(",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: ").append(getPaymentOption()).append(",");
        if (getProductTypes() != null)
            sb.append("ProductTypes: ").append(getProductTypes()).append(",");
        if (getCurrency() != null)
            sb.append("Currency: ").append(getCurrency()).append(",");
        if (getCommitment() != null)
            sb.append("Commitment: ").append(getCommitment()).append(",");
        if (getUpfrontPaymentAmount() != null)
            sb.append("UpfrontPaymentAmount: ").append(getUpfrontPaymentAmount()).append(",");
        if (getRecurringPaymentAmount() != null)
            sb.append("RecurringPaymentAmount: ").append(getRecurringPaymentAmount()).append(",");
        if (getTermDurationInSeconds() != null)
            sb.append("TermDurationInSeconds: ").append(getTermDurationInSeconds()).append(",");
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

        if (obj instanceof SavingsPlan == false)
            return false;
        SavingsPlan other = (SavingsPlan) obj;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        if (other.getSavingsPlanId() == null ^ this.getSavingsPlanId() == null)
            return false;
        if (other.getSavingsPlanId() != null && other.getSavingsPlanId().equals(this.getSavingsPlanId()) == false)
            return false;
        if (other.getSavingsPlanArn() == null ^ this.getSavingsPlanArn() == null)
            return false;
        if (other.getSavingsPlanArn() != null && other.getSavingsPlanArn().equals(this.getSavingsPlanArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getEc2InstanceFamily() == null ^ this.getEc2InstanceFamily() == null)
            return false;
        if (other.getEc2InstanceFamily() != null && other.getEc2InstanceFamily().equals(this.getEc2InstanceFamily()) == false)
            return false;
        if (other.getSavingsPlanType() == null ^ this.getSavingsPlanType() == null)
            return false;
        if (other.getSavingsPlanType() != null && other.getSavingsPlanType().equals(this.getSavingsPlanType()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getProductTypes() == null ^ this.getProductTypes() == null)
            return false;
        if (other.getProductTypes() != null && other.getProductTypes().equals(this.getProductTypes()) == false)
            return false;
        if (other.getCurrency() == null ^ this.getCurrency() == null)
            return false;
        if (other.getCurrency() != null && other.getCurrency().equals(this.getCurrency()) == false)
            return false;
        if (other.getCommitment() == null ^ this.getCommitment() == null)
            return false;
        if (other.getCommitment() != null && other.getCommitment().equals(this.getCommitment()) == false)
            return false;
        if (other.getUpfrontPaymentAmount() == null ^ this.getUpfrontPaymentAmount() == null)
            return false;
        if (other.getUpfrontPaymentAmount() != null && other.getUpfrontPaymentAmount().equals(this.getUpfrontPaymentAmount()) == false)
            return false;
        if (other.getRecurringPaymentAmount() == null ^ this.getRecurringPaymentAmount() == null)
            return false;
        if (other.getRecurringPaymentAmount() != null && other.getRecurringPaymentAmount().equals(this.getRecurringPaymentAmount()) == false)
            return false;
        if (other.getTermDurationInSeconds() == null ^ this.getTermDurationInSeconds() == null)
            return false;
        if (other.getTermDurationInSeconds() != null && other.getTermDurationInSeconds().equals(this.getTermDurationInSeconds()) == false)
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

        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode + ((getSavingsPlanId() == null) ? 0 : getSavingsPlanId().hashCode());
        hashCode = prime * hashCode + ((getSavingsPlanArn() == null) ? 0 : getSavingsPlanArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceFamily() == null) ? 0 : getEc2InstanceFamily().hashCode());
        hashCode = prime * hashCode + ((getSavingsPlanType() == null) ? 0 : getSavingsPlanType().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getProductTypes() == null) ? 0 : getProductTypes().hashCode());
        hashCode = prime * hashCode + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        hashCode = prime * hashCode + ((getCommitment() == null) ? 0 : getCommitment().hashCode());
        hashCode = prime * hashCode + ((getUpfrontPaymentAmount() == null) ? 0 : getUpfrontPaymentAmount().hashCode());
        hashCode = prime * hashCode + ((getRecurringPaymentAmount() == null) ? 0 : getRecurringPaymentAmount().hashCode());
        hashCode = prime * hashCode + ((getTermDurationInSeconds() == null) ? 0 : getTermDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public SavingsPlan clone() {
        try {
            return (SavingsPlan) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.savingsplans.model.transform.SavingsPlanMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
