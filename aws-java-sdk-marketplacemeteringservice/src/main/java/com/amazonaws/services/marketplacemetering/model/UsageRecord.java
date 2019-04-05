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
package com.amazonaws.services.marketplacemetering.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A UsageRecord indicates a quantity of usage for a given product, customer, dimension and time.
 * </p>
 * <p>
 * Multiple requests with the same UsageRecords as input will be deduplicated to prevent double charges.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/UsageRecord" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Timestamp of the hour, recorded in UTC. The seconds and milliseconds portions of the timestamp will be ignored.
     * </p>
     * <p>
     * Your application can meter usage for up to one hour in the past.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The CustomerIdentifier is obtained through the ResolveCustomer operation and represents an individual buyer in
     * your application.
     * </p>
     */
    private String customerIdentifier;
    /**
     * <p>
     * During the process of registering a product on AWS Marketplace, up to eight dimensions are specified. These
     * represent different units of value in your application.
     * </p>
     */
    private String dimension;
    /**
     * <p>
     * The quantity of usage consumed by the customer for the given dimension and time. Defaults to <code>0</code> if
     * not specified.
     * </p>
     */
    private Integer quantity;

    /**
     * <p>
     * Timestamp of the hour, recorded in UTC. The seconds and milliseconds portions of the timestamp will be ignored.
     * </p>
     * <p>
     * Your application can meter usage for up to one hour in the past.
     * </p>
     * 
     * @param timestamp
     *        Timestamp of the hour, recorded in UTC. The seconds and milliseconds portions of the timestamp will be
     *        ignored.</p>
     *        <p>
     *        Your application can meter usage for up to one hour in the past.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Timestamp of the hour, recorded in UTC. The seconds and milliseconds portions of the timestamp will be ignored.
     * </p>
     * <p>
     * Your application can meter usage for up to one hour in the past.
     * </p>
     * 
     * @return Timestamp of the hour, recorded in UTC. The seconds and milliseconds portions of the timestamp will be
     *         ignored.</p>
     *         <p>
     *         Your application can meter usage for up to one hour in the past.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Timestamp of the hour, recorded in UTC. The seconds and milliseconds portions of the timestamp will be ignored.
     * </p>
     * <p>
     * Your application can meter usage for up to one hour in the past.
     * </p>
     * 
     * @param timestamp
     *        Timestamp of the hour, recorded in UTC. The seconds and milliseconds portions of the timestamp will be
     *        ignored.</p>
     *        <p>
     *        Your application can meter usage for up to one hour in the past.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageRecord withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The CustomerIdentifier is obtained through the ResolveCustomer operation and represents an individual buyer in
     * your application.
     * </p>
     * 
     * @param customerIdentifier
     *        The CustomerIdentifier is obtained through the ResolveCustomer operation and represents an individual
     *        buyer in your application.
     */

    public void setCustomerIdentifier(String customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
    }

    /**
     * <p>
     * The CustomerIdentifier is obtained through the ResolveCustomer operation and represents an individual buyer in
     * your application.
     * </p>
     * 
     * @return The CustomerIdentifier is obtained through the ResolveCustomer operation and represents an individual
     *         buyer in your application.
     */

    public String getCustomerIdentifier() {
        return this.customerIdentifier;
    }

    /**
     * <p>
     * The CustomerIdentifier is obtained through the ResolveCustomer operation and represents an individual buyer in
     * your application.
     * </p>
     * 
     * @param customerIdentifier
     *        The CustomerIdentifier is obtained through the ResolveCustomer operation and represents an individual
     *        buyer in your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageRecord withCustomerIdentifier(String customerIdentifier) {
        setCustomerIdentifier(customerIdentifier);
        return this;
    }

    /**
     * <p>
     * During the process of registering a product on AWS Marketplace, up to eight dimensions are specified. These
     * represent different units of value in your application.
     * </p>
     * 
     * @param dimension
     *        During the process of registering a product on AWS Marketplace, up to eight dimensions are specified.
     *        These represent different units of value in your application.
     */

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * <p>
     * During the process of registering a product on AWS Marketplace, up to eight dimensions are specified. These
     * represent different units of value in your application.
     * </p>
     * 
     * @return During the process of registering a product on AWS Marketplace, up to eight dimensions are specified.
     *         These represent different units of value in your application.
     */

    public String getDimension() {
        return this.dimension;
    }

    /**
     * <p>
     * During the process of registering a product on AWS Marketplace, up to eight dimensions are specified. These
     * represent different units of value in your application.
     * </p>
     * 
     * @param dimension
     *        During the process of registering a product on AWS Marketplace, up to eight dimensions are specified.
     *        These represent different units of value in your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageRecord withDimension(String dimension) {
        setDimension(dimension);
        return this;
    }

    /**
     * <p>
     * The quantity of usage consumed by the customer for the given dimension and time. Defaults to <code>0</code> if
     * not specified.
     * </p>
     * 
     * @param quantity
     *        The quantity of usage consumed by the customer for the given dimension and time. Defaults to
     *        <code>0</code> if not specified.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The quantity of usage consumed by the customer for the given dimension and time. Defaults to <code>0</code> if
     * not specified.
     * </p>
     * 
     * @return The quantity of usage consumed by the customer for the given dimension and time. Defaults to
     *         <code>0</code> if not specified.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The quantity of usage consumed by the customer for the given dimension and time. Defaults to <code>0</code> if
     * not specified.
     * </p>
     * 
     * @param quantity
     *        The quantity of usage consumed by the customer for the given dimension and time. Defaults to
     *        <code>0</code> if not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageRecord withQuantity(Integer quantity) {
        setQuantity(quantity);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getCustomerIdentifier() != null)
            sb.append("CustomerIdentifier: ").append(getCustomerIdentifier()).append(",");
        if (getDimension() != null)
            sb.append("Dimension: ").append(getDimension()).append(",");
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageRecord == false)
            return false;
        UsageRecord other = (UsageRecord) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getCustomerIdentifier() == null ^ this.getCustomerIdentifier() == null)
            return false;
        if (other.getCustomerIdentifier() != null && other.getCustomerIdentifier().equals(this.getCustomerIdentifier()) == false)
            return false;
        if (other.getDimension() == null ^ this.getDimension() == null)
            return false;
        if (other.getDimension() != null && other.getDimension().equals(this.getDimension()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCustomerIdentifier() == null) ? 0 : getCustomerIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDimension() == null) ? 0 : getDimension().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        return hashCode;
    }

    @Override
    public UsageRecord clone() {
        try {
            return (UsageRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacemetering.model.transform.UsageRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
