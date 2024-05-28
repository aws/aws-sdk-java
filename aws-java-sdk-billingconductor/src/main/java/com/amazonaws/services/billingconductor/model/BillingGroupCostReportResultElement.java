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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A paginated call to retrieve a list of summary reports of actual Amazon Web Services charges and the calculated
 * Amazon Web Services charges, broken down by attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/BillingGroupCostReportResultElement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BillingGroupCostReportResultElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Number (ARN) that uniquely identifies the billing group.
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
     * The percentage of the billing group margin.
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
     * The list of key-value pairs that represent the attributes by which the <code>BillingGroupCostReportResults</code>
     * are grouped. For example, if you want the Amazon S3 service-level breakdown of a billing group for November 2023,
     * the attributes list will contain a key-value pair of <code>"PRODUCT_NAME"</code> and <code>"S3"</code> and a
     * key-value pair of <code>"BILLING_PERIOD"</code> and <code>"Nov 2023"</code>.
     * </p>
     */
    private java.util.List<Attribute> attributes;

    /**
     * <p>
     * The Amazon Resource Number (ARN) that uniquely identifies the billing group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Number (ARN) that uniquely identifies the billing group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) that uniquely identifies the billing group.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) that uniquely identifies the billing group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) that uniquely identifies the billing group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Number (ARN) that uniquely identifies the billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingGroupCostReportResultElement withArn(String arn) {
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

    public BillingGroupCostReportResultElement withAWSCost(String aWSCost) {
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

    public BillingGroupCostReportResultElement withProformaCost(String proformaCost) {
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

    public BillingGroupCostReportResultElement withMargin(String margin) {
        setMargin(margin);
        return this;
    }

    /**
     * <p>
     * The percentage of the billing group margin.
     * </p>
     * 
     * @param marginPercentage
     *        The percentage of the billing group margin.
     */

    public void setMarginPercentage(String marginPercentage) {
        this.marginPercentage = marginPercentage;
    }

    /**
     * <p>
     * The percentage of the billing group margin.
     * </p>
     * 
     * @return The percentage of the billing group margin.
     */

    public String getMarginPercentage() {
        return this.marginPercentage;
    }

    /**
     * <p>
     * The percentage of the billing group margin.
     * </p>
     * 
     * @param marginPercentage
     *        The percentage of the billing group margin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingGroupCostReportResultElement withMarginPercentage(String marginPercentage) {
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

    public BillingGroupCostReportResultElement withCurrency(String currency) {
        setCurrency(currency);
        return this;
    }

    /**
     * <p>
     * The list of key-value pairs that represent the attributes by which the <code>BillingGroupCostReportResults</code>
     * are grouped. For example, if you want the Amazon S3 service-level breakdown of a billing group for November 2023,
     * the attributes list will contain a key-value pair of <code>"PRODUCT_NAME"</code> and <code>"S3"</code> and a
     * key-value pair of <code>"BILLING_PERIOD"</code> and <code>"Nov 2023"</code>.
     * </p>
     * 
     * @return The list of key-value pairs that represent the attributes by which the
     *         <code>BillingGroupCostReportResults</code> are grouped. For example, if you want the Amazon S3
     *         service-level breakdown of a billing group for November 2023, the attributes list will contain a
     *         key-value pair of <code>"PRODUCT_NAME"</code> and <code>"S3"</code> and a key-value pair of
     *         <code>"BILLING_PERIOD"</code> and <code>"Nov 2023"</code>.
     */

    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The list of key-value pairs that represent the attributes by which the <code>BillingGroupCostReportResults</code>
     * are grouped. For example, if you want the Amazon S3 service-level breakdown of a billing group for November 2023,
     * the attributes list will contain a key-value pair of <code>"PRODUCT_NAME"</code> and <code>"S3"</code> and a
     * key-value pair of <code>"BILLING_PERIOD"</code> and <code>"Nov 2023"</code>.
     * </p>
     * 
     * @param attributes
     *        The list of key-value pairs that represent the attributes by which the
     *        <code>BillingGroupCostReportResults</code> are grouped. For example, if you want the Amazon S3
     *        service-level breakdown of a billing group for November 2023, the attributes list will contain a key-value
     *        pair of <code>"PRODUCT_NAME"</code> and <code>"S3"</code> and a key-value pair of
     *        <code>"BILLING_PERIOD"</code> and <code>"Nov 2023"</code>.
     */

    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<Attribute>(attributes);
    }

    /**
     * <p>
     * The list of key-value pairs that represent the attributes by which the <code>BillingGroupCostReportResults</code>
     * are grouped. For example, if you want the Amazon S3 service-level breakdown of a billing group for November 2023,
     * the attributes list will contain a key-value pair of <code>"PRODUCT_NAME"</code> and <code>"S3"</code> and a
     * key-value pair of <code>"BILLING_PERIOD"</code> and <code>"Nov 2023"</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The list of key-value pairs that represent the attributes by which the
     *        <code>BillingGroupCostReportResults</code> are grouped. For example, if you want the Amazon S3
     *        service-level breakdown of a billing group for November 2023, the attributes list will contain a key-value
     *        pair of <code>"PRODUCT_NAME"</code> and <code>"S3"</code> and a key-value pair of
     *        <code>"BILLING_PERIOD"</code> and <code>"Nov 2023"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingGroupCostReportResultElement withAttributes(Attribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<Attribute>(attributes.length));
        }
        for (Attribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of key-value pairs that represent the attributes by which the <code>BillingGroupCostReportResults</code>
     * are grouped. For example, if you want the Amazon S3 service-level breakdown of a billing group for November 2023,
     * the attributes list will contain a key-value pair of <code>"PRODUCT_NAME"</code> and <code>"S3"</code> and a
     * key-value pair of <code>"BILLING_PERIOD"</code> and <code>"Nov 2023"</code>.
     * </p>
     * 
     * @param attributes
     *        The list of key-value pairs that represent the attributes by which the
     *        <code>BillingGroupCostReportResults</code> are grouped. For example, if you want the Amazon S3
     *        service-level breakdown of a billing group for November 2023, the attributes list will contain a key-value
     *        pair of <code>"PRODUCT_NAME"</code> and <code>"S3"</code> and a key-value pair of
     *        <code>"BILLING_PERIOD"</code> and <code>"Nov 2023"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingGroupCostReportResultElement withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
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
            sb.append("Currency: ").append(getCurrency()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BillingGroupCostReportResultElement == false)
            return false;
        BillingGroupCostReportResultElement other = (BillingGroupCostReportResultElement) obj;
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
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
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
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public BillingGroupCostReportResultElement clone() {
        try {
            return (BillingGroupCostReportResultElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.BillingGroupCostReportResultElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
