/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplaceentitlement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An entitlement represents capacity in a product owned by the customer. For example, a customer might own some number
 * of users or seats in an SaaS application or some amount of data capacity in a multi-tenant database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entitlement.marketplace-2017-01-11/Entitlement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Entitlement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The product code for which the given entitlement applies. Product codes are provided by AWS Marketplace when the
     * product listing is created.
     * </p>
     */
    private String productCode;
    /**
     * <p>
     * The dimension for which the given entitlement applies. Dimensions represent categories of capacity in a product
     * and are specified when the product is listed in AWS Marketplace.
     * </p>
     */
    private String dimension;
    /**
     * <p>
     * The customer identifier is a handle to each unique customer in an application. Customer identifiers are obtained
     * through the ResolveCustomer operation in AWS Marketplace Metering Service.
     * </p>
     */
    private String customerIdentifier;
    /**
     * <p>
     * The EntitlementValue represents the amount of capacity that the customer is entitled to for the product.
     * </p>
     */
    private EntitlementValue value;
    /**
     * <p>
     * The expiration date represents the minimum date through which this entitlement is expected to remain valid. For
     * contractual products listed on AWS Marketplace, the expiration date is the date at which the customer will renew
     * or cancel their contract. Customers who are opting to renew their contract will still have entitlements with an
     * expiration date.
     * </p>
     */
    private java.util.Date expirationDate;

    /**
     * <p>
     * The product code for which the given entitlement applies. Product codes are provided by AWS Marketplace when the
     * product listing is created.
     * </p>
     * 
     * @param productCode
     *        The product code for which the given entitlement applies. Product codes are provided by AWS Marketplace
     *        when the product listing is created.
     */

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>
     * The product code for which the given entitlement applies. Product codes are provided by AWS Marketplace when the
     * product listing is created.
     * </p>
     * 
     * @return The product code for which the given entitlement applies. Product codes are provided by AWS Marketplace
     *         when the product listing is created.
     */

    public String getProductCode() {
        return this.productCode;
    }

    /**
     * <p>
     * The product code for which the given entitlement applies. Product codes are provided by AWS Marketplace when the
     * product listing is created.
     * </p>
     * 
     * @param productCode
     *        The product code for which the given entitlement applies. Product codes are provided by AWS Marketplace
     *        when the product listing is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entitlement withProductCode(String productCode) {
        setProductCode(productCode);
        return this;
    }

    /**
     * <p>
     * The dimension for which the given entitlement applies. Dimensions represent categories of capacity in a product
     * and are specified when the product is listed in AWS Marketplace.
     * </p>
     * 
     * @param dimension
     *        The dimension for which the given entitlement applies. Dimensions represent categories of capacity in a
     *        product and are specified when the product is listed in AWS Marketplace.
     */

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * <p>
     * The dimension for which the given entitlement applies. Dimensions represent categories of capacity in a product
     * and are specified when the product is listed in AWS Marketplace.
     * </p>
     * 
     * @return The dimension for which the given entitlement applies. Dimensions represent categories of capacity in a
     *         product and are specified when the product is listed in AWS Marketplace.
     */

    public String getDimension() {
        return this.dimension;
    }

    /**
     * <p>
     * The dimension for which the given entitlement applies. Dimensions represent categories of capacity in a product
     * and are specified when the product is listed in AWS Marketplace.
     * </p>
     * 
     * @param dimension
     *        The dimension for which the given entitlement applies. Dimensions represent categories of capacity in a
     *        product and are specified when the product is listed in AWS Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entitlement withDimension(String dimension) {
        setDimension(dimension);
        return this;
    }

    /**
     * <p>
     * The customer identifier is a handle to each unique customer in an application. Customer identifiers are obtained
     * through the ResolveCustomer operation in AWS Marketplace Metering Service.
     * </p>
     * 
     * @param customerIdentifier
     *        The customer identifier is a handle to each unique customer in an application. Customer identifiers are
     *        obtained through the ResolveCustomer operation in AWS Marketplace Metering Service.
     */

    public void setCustomerIdentifier(String customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
    }

    /**
     * <p>
     * The customer identifier is a handle to each unique customer in an application. Customer identifiers are obtained
     * through the ResolveCustomer operation in AWS Marketplace Metering Service.
     * </p>
     * 
     * @return The customer identifier is a handle to each unique customer in an application. Customer identifiers are
     *         obtained through the ResolveCustomer operation in AWS Marketplace Metering Service.
     */

    public String getCustomerIdentifier() {
        return this.customerIdentifier;
    }

    /**
     * <p>
     * The customer identifier is a handle to each unique customer in an application. Customer identifiers are obtained
     * through the ResolveCustomer operation in AWS Marketplace Metering Service.
     * </p>
     * 
     * @param customerIdentifier
     *        The customer identifier is a handle to each unique customer in an application. Customer identifiers are
     *        obtained through the ResolveCustomer operation in AWS Marketplace Metering Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entitlement withCustomerIdentifier(String customerIdentifier) {
        setCustomerIdentifier(customerIdentifier);
        return this;
    }

    /**
     * <p>
     * The EntitlementValue represents the amount of capacity that the customer is entitled to for the product.
     * </p>
     * 
     * @param value
     *        The EntitlementValue represents the amount of capacity that the customer is entitled to for the product.
     */

    public void setValue(EntitlementValue value) {
        this.value = value;
    }

    /**
     * <p>
     * The EntitlementValue represents the amount of capacity that the customer is entitled to for the product.
     * </p>
     * 
     * @return The EntitlementValue represents the amount of capacity that the customer is entitled to for the product.
     */

    public EntitlementValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * The EntitlementValue represents the amount of capacity that the customer is entitled to for the product.
     * </p>
     * 
     * @param value
     *        The EntitlementValue represents the amount of capacity that the customer is entitled to for the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entitlement withValue(EntitlementValue value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The expiration date represents the minimum date through which this entitlement is expected to remain valid. For
     * contractual products listed on AWS Marketplace, the expiration date is the date at which the customer will renew
     * or cancel their contract. Customers who are opting to renew their contract will still have entitlements with an
     * expiration date.
     * </p>
     * 
     * @param expirationDate
     *        The expiration date represents the minimum date through which this entitlement is expected to remain
     *        valid. For contractual products listed on AWS Marketplace, the expiration date is the date at which the
     *        customer will renew or cancel their contract. Customers who are opting to renew their contract will still
     *        have entitlements with an expiration date.
     */

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The expiration date represents the minimum date through which this entitlement is expected to remain valid. For
     * contractual products listed on AWS Marketplace, the expiration date is the date at which the customer will renew
     * or cancel their contract. Customers who are opting to renew their contract will still have entitlements with an
     * expiration date.
     * </p>
     * 
     * @return The expiration date represents the minimum date through which this entitlement is expected to remain
     *         valid. For contractual products listed on AWS Marketplace, the expiration date is the date at which the
     *         customer will renew or cancel their contract. Customers who are opting to renew their contract will still
     *         have entitlements with an expiration date.
     */

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The expiration date represents the minimum date through which this entitlement is expected to remain valid. For
     * contractual products listed on AWS Marketplace, the expiration date is the date at which the customer will renew
     * or cancel their contract. Customers who are opting to renew their contract will still have entitlements with an
     * expiration date.
     * </p>
     * 
     * @param expirationDate
     *        The expiration date represents the minimum date through which this entitlement is expected to remain
     *        valid. For contractual products listed on AWS Marketplace, the expiration date is the date at which the
     *        customer will renew or cancel their contract. Customers who are opting to renew their contract will still
     *        have entitlements with an expiration date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Entitlement withExpirationDate(java.util.Date expirationDate) {
        setExpirationDate(expirationDate);
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
        if (getProductCode() != null)
            sb.append("ProductCode: ").append(getProductCode()).append(",");
        if (getDimension() != null)
            sb.append("Dimension: ").append(getDimension()).append(",");
        if (getCustomerIdentifier() != null)
            sb.append("CustomerIdentifier: ").append(getCustomerIdentifier()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: ").append(getExpirationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Entitlement == false)
            return false;
        Entitlement other = (Entitlement) obj;
        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null && other.getProductCode().equals(this.getProductCode()) == false)
            return false;
        if (other.getDimension() == null ^ this.getDimension() == null)
            return false;
        if (other.getDimension() != null && other.getDimension().equals(this.getDimension()) == false)
            return false;
        if (other.getCustomerIdentifier() == null ^ this.getCustomerIdentifier() == null)
            return false;
        if (other.getCustomerIdentifier() != null && other.getCustomerIdentifier().equals(this.getCustomerIdentifier()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        hashCode = prime * hashCode + ((getDimension() == null) ? 0 : getDimension().hashCode());
        hashCode = prime * hashCode + ((getCustomerIdentifier() == null) ? 0 : getCustomerIdentifier().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        return hashCode;
    }

    @Override
    public Entitlement clone() {
        try {
            return (Entitlement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceentitlement.model.transform.EntitlementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
