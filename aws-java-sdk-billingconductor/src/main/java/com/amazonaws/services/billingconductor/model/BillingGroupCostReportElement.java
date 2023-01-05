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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary report of actual Amazon Web Services charges and calculated Amazon Web Services charges, based on the
 * associated pricing plan of a billing group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/BillingGroupCostReportElement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BillingGroupCostReportElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a billing group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The actual Amazon Web Services charges for the billing group.
     * </p>
     */
    private String aWSCost;
    /**
     * <p>
     * The hypothetical Amazon Web Services charges based on the associated pricing plan of a billing group.
     * </p>
     */
    private String proformaCost;
    /**
     * <p>
     * The billing group margin.
     * </p>
     */
    private String margin;
    /**
     * <p>
     * The percentage of billing group margin.
     * </p>
     */
    private String marginPercentage;
    /**
     * <p>
     * The displayed currency.
     * </p>
     */
    private String currency;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a billing group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of a billing group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a billing group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a billing group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a billing group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of a billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingGroupCostReportElement withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The actual Amazon Web Services charges for the billing group.
     * </p>
     * 
     * @param aWSCost
     *        The actual Amazon Web Services charges for the billing group.
     */

    public void setAWSCost(String aWSCost) {
        this.aWSCost = aWSCost;
    }

    /**
     * <p>
     * The actual Amazon Web Services charges for the billing group.
     * </p>
     * 
     * @return The actual Amazon Web Services charges for the billing group.
     */

    public String getAWSCost() {
        return this.aWSCost;
    }

    /**
     * <p>
     * The actual Amazon Web Services charges for the billing group.
     * </p>
     * 
     * @param aWSCost
     *        The actual Amazon Web Services charges for the billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingGroupCostReportElement withAWSCost(String aWSCost) {
        setAWSCost(aWSCost);
        return this;
    }

    /**
     * <p>
     * The hypothetical Amazon Web Services charges based on the associated pricing plan of a billing group.
     * </p>
     * 
     * @param proformaCost
     *        The hypothetical Amazon Web Services charges based on the associated pricing plan of a billing group.
     */

    public void setProformaCost(String proformaCost) {
        this.proformaCost = proformaCost;
    }

    /**
     * <p>
     * The hypothetical Amazon Web Services charges based on the associated pricing plan of a billing group.
     * </p>
     * 
     * @return The hypothetical Amazon Web Services charges based on the associated pricing plan of a billing group.
     */

    public String getProformaCost() {
        return this.proformaCost;
    }

    /**
     * <p>
     * The hypothetical Amazon Web Services charges based on the associated pricing plan of a billing group.
     * </p>
     * 
     * @param proformaCost
     *        The hypothetical Amazon Web Services charges based on the associated pricing plan of a billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingGroupCostReportElement withProformaCost(String proformaCost) {
        setProformaCost(proformaCost);
        return this;
    }

    /**
     * <p>
     * The billing group margin.
     * </p>
     * 
     * @param margin
     *        The billing group margin.
     */

    public void setMargin(String margin) {
        this.margin = margin;
    }

    /**
     * <p>
     * The billing group margin.
     * </p>
     * 
     * @return The billing group margin.
     */

    public String getMargin() {
        return this.margin;
    }

    /**
     * <p>
     * The billing group margin.
     * </p>
     * 
     * @param margin
     *        The billing group margin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingGroupCostReportElement withMargin(String margin) {
        setMargin(margin);
        return this;
    }

    /**
     * <p>
     * The percentage of billing group margin.
     * </p>
     * 
     * @param marginPercentage
     *        The percentage of billing group margin.
     */

    public void setMarginPercentage(String marginPercentage) {
        this.marginPercentage = marginPercentage;
    }

    /**
     * <p>
     * The percentage of billing group margin.
     * </p>
     * 
     * @return The percentage of billing group margin.
     */

    public String getMarginPercentage() {
        return this.marginPercentage;
    }

    /**
     * <p>
     * The percentage of billing group margin.
     * </p>
     * 
     * @param marginPercentage
     *        The percentage of billing group margin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingGroupCostReportElement withMarginPercentage(String marginPercentage) {
        setMarginPercentage(marginPercentage);
        return this;
    }

    /**
     * <p>
     * The displayed currency.
     * </p>
     * 
     * @param currency
     *        The displayed currency.
     */

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * <p>
     * The displayed currency.
     * </p>
     * 
     * @return The displayed currency.
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     * <p>
     * The displayed currency.
     * </p>
     * 
     * @param currency
     *        The displayed currency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingGroupCostReportElement withCurrency(String currency) {
        setCurrency(currency);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAWSCost() != null)
            sb.append("AWSCost: ").append(getAWSCost()).append(",");
        if (getProformaCost() != null)
            sb.append("ProformaCost: ").append(getProformaCost()).append(",");
        if (getMargin() != null)
            sb.append("Margin: ").append(getMargin()).append(",");
        if (getMarginPercentage() != null)
            sb.append("MarginPercentage: ").append(getMarginPercentage()).append(",");
        if (getCurrency() != null)
            sb.append("Currency: ").append(getCurrency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BillingGroupCostReportElement == false)
            return false;
        BillingGroupCostReportElement other = (BillingGroupCostReportElement) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAWSCost() == null ^ this.getAWSCost() == null)
            return false;
        if (other.getAWSCost() != null && other.getAWSCost().equals(this.getAWSCost()) == false)
            return false;
        if (other.getProformaCost() == null ^ this.getProformaCost() == null)
            return false;
        if (other.getProformaCost() != null && other.getProformaCost().equals(this.getProformaCost()) == false)
            return false;
        if (other.getMargin() == null ^ this.getMargin() == null)
            return false;
        if (other.getMargin() != null && other.getMargin().equals(this.getMargin()) == false)
            return false;
        if (other.getMarginPercentage() == null ^ this.getMarginPercentage() == null)
            return false;
        if (other.getMarginPercentage() != null && other.getMarginPercentage().equals(this.getMarginPercentage()) == false)
            return false;
        if (other.getCurrency() == null ^ this.getCurrency() == null)
            return false;
        if (other.getCurrency() != null && other.getCurrency().equals(this.getCurrency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAWSCost() == null) ? 0 : getAWSCost().hashCode());
        hashCode = prime * hashCode + ((getProformaCost() == null) ? 0 : getProformaCost().hashCode());
        hashCode = prime * hashCode + ((getMargin() == null) ? 0 : getMargin().hashCode());
        hashCode = prime * hashCode + ((getMarginPercentage() == null) ? 0 : getMarginPercentage().hashCode());
        hashCode = prime * hashCode + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        return hashCode;
    }

    @Override
    public BillingGroupCostReportElement clone() {
        try {
            return (BillingGroupCostReportElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.BillingGroupCostReportElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
