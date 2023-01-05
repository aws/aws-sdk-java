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
package com.amazonaws.services.marketplacemetering.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>UsageRecordResult</code> indicates the status of a given <code>UsageRecord</code> processed by
 * <code>BatchMeterUsage</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/UsageRecordResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageRecordResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>UsageRecord</code> that was part of the <code>BatchMeterUsage</code> request.
     * </p>
     */
    private UsageRecord usageRecord;
    /**
     * <p>
     * The <code>MeteringRecordId</code> is a unique identifier for this metering event.
     * </p>
     */
    private String meteringRecordId;
    /**
     * <p>
     * The <code>UsageRecordResult</code> <code>Status</code> indicates the status of an individual
     * <code>UsageRecord</code> processed by <code>BatchMeterUsage</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The <code>UsageRecord</code> was accepted and honored by <code>BatchMeterUsage</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The <code>CustomerIdentifier</code> specified is not able to use your product. The
     * <code>UsageRecord</code> was not honored. There are three causes for this result:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The customer identifier is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The customer identifier provided in the metering record does not have an active agreement or subscription with
     * this product. Future <code>UsageRecords</code> for this customer will fail until the customer subscribes to your
     * product.
     * </p>
     * </li>
     * <li>
     * <p>
     * The customer's AWS account was suspended.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the <code>UsageRecord</code> was invalid and not honored. A previously
     * metered <code>UsageRecord</code> had the same customer, dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The <code>UsageRecord</code> that was part of the <code>BatchMeterUsage</code> request.
     * </p>
     * 
     * @param usageRecord
     *        The <code>UsageRecord</code> that was part of the <code>BatchMeterUsage</code> request.
     */

    public void setUsageRecord(UsageRecord usageRecord) {
        this.usageRecord = usageRecord;
    }

    /**
     * <p>
     * The <code>UsageRecord</code> that was part of the <code>BatchMeterUsage</code> request.
     * </p>
     * 
     * @return The <code>UsageRecord</code> that was part of the <code>BatchMeterUsage</code> request.
     */

    public UsageRecord getUsageRecord() {
        return this.usageRecord;
    }

    /**
     * <p>
     * The <code>UsageRecord</code> that was part of the <code>BatchMeterUsage</code> request.
     * </p>
     * 
     * @param usageRecord
     *        The <code>UsageRecord</code> that was part of the <code>BatchMeterUsage</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageRecordResult withUsageRecord(UsageRecord usageRecord) {
        setUsageRecord(usageRecord);
        return this;
    }

    /**
     * <p>
     * The <code>MeteringRecordId</code> is a unique identifier for this metering event.
     * </p>
     * 
     * @param meteringRecordId
     *        The <code>MeteringRecordId</code> is a unique identifier for this metering event.
     */

    public void setMeteringRecordId(String meteringRecordId) {
        this.meteringRecordId = meteringRecordId;
    }

    /**
     * <p>
     * The <code>MeteringRecordId</code> is a unique identifier for this metering event.
     * </p>
     * 
     * @return The <code>MeteringRecordId</code> is a unique identifier for this metering event.
     */

    public String getMeteringRecordId() {
        return this.meteringRecordId;
    }

    /**
     * <p>
     * The <code>MeteringRecordId</code> is a unique identifier for this metering event.
     * </p>
     * 
     * @param meteringRecordId
     *        The <code>MeteringRecordId</code> is a unique identifier for this metering event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageRecordResult withMeteringRecordId(String meteringRecordId) {
        setMeteringRecordId(meteringRecordId);
        return this;
    }

    /**
     * <p>
     * The <code>UsageRecordResult</code> <code>Status</code> indicates the status of an individual
     * <code>UsageRecord</code> processed by <code>BatchMeterUsage</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The <code>UsageRecord</code> was accepted and honored by <code>BatchMeterUsage</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The <code>CustomerIdentifier</code> specified is not able to use your product. The
     * <code>UsageRecord</code> was not honored. There are three causes for this result:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The customer identifier is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The customer identifier provided in the metering record does not have an active agreement or subscription with
     * this product. Future <code>UsageRecords</code> for this customer will fail until the customer subscribes to your
     * product.
     * </p>
     * </li>
     * <li>
     * <p>
     * The customer's AWS account was suspended.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the <code>UsageRecord</code> was invalid and not honored. A previously
     * metered <code>UsageRecord</code> had the same customer, dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The <code>UsageRecordResult</code> <code>Status</code> indicates the status of an individual
     *        <code>UsageRecord</code> processed by <code>BatchMeterUsage</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Success</i>- The <code>UsageRecord</code> was accepted and honored by <code>BatchMeterUsage</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CustomerNotSubscribed</i>- The <code>CustomerIdentifier</code> specified is not able to use your
     *        product. The <code>UsageRecord</code> was not honored. There are three causes for this result:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The customer identifier is invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The customer identifier provided in the metering record does not have an active agreement or subscription
     *        with this product. Future <code>UsageRecords</code> for this customer will fail until the customer
     *        subscribes to your product.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The customer's AWS account was suspended.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DuplicateRecord</i>- Indicates that the <code>UsageRecord</code> was invalid and not honored. A
     *        previously metered <code>UsageRecord</code> had the same customer, dimension, and time, but a different
     *        quantity.
     *        </p>
     *        </li>
     * @see UsageRecordResultStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The <code>UsageRecordResult</code> <code>Status</code> indicates the status of an individual
     * <code>UsageRecord</code> processed by <code>BatchMeterUsage</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The <code>UsageRecord</code> was accepted and honored by <code>BatchMeterUsage</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The <code>CustomerIdentifier</code> specified is not able to use your product. The
     * <code>UsageRecord</code> was not honored. There are three causes for this result:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The customer identifier is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The customer identifier provided in the metering record does not have an active agreement or subscription with
     * this product. Future <code>UsageRecords</code> for this customer will fail until the customer subscribes to your
     * product.
     * </p>
     * </li>
     * <li>
     * <p>
     * The customer's AWS account was suspended.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the <code>UsageRecord</code> was invalid and not honored. A previously
     * metered <code>UsageRecord</code> had the same customer, dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The <code>UsageRecordResult</code> <code>Status</code> indicates the status of an individual
     *         <code>UsageRecord</code> processed by <code>BatchMeterUsage</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Success</i>- The <code>UsageRecord</code> was accepted and honored by <code>BatchMeterUsage</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>CustomerNotSubscribed</i>- The <code>CustomerIdentifier</code> specified is not able to use your
     *         product. The <code>UsageRecord</code> was not honored. There are three causes for this result:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The customer identifier is invalid.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The customer identifier provided in the metering record does not have an active agreement or subscription
     *         with this product. Future <code>UsageRecords</code> for this customer will fail until the customer
     *         subscribes to your product.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The customer's AWS account was suspended.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <i>DuplicateRecord</i>- Indicates that the <code>UsageRecord</code> was invalid and not honored. A
     *         previously metered <code>UsageRecord</code> had the same customer, dimension, and time, but a different
     *         quantity.
     *         </p>
     *         </li>
     * @see UsageRecordResultStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The <code>UsageRecordResult</code> <code>Status</code> indicates the status of an individual
     * <code>UsageRecord</code> processed by <code>BatchMeterUsage</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The <code>UsageRecord</code> was accepted and honored by <code>BatchMeterUsage</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The <code>CustomerIdentifier</code> specified is not able to use your product. The
     * <code>UsageRecord</code> was not honored. There are three causes for this result:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The customer identifier is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The customer identifier provided in the metering record does not have an active agreement or subscription with
     * this product. Future <code>UsageRecords</code> for this customer will fail until the customer subscribes to your
     * product.
     * </p>
     * </li>
     * <li>
     * <p>
     * The customer's AWS account was suspended.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the <code>UsageRecord</code> was invalid and not honored. A previously
     * metered <code>UsageRecord</code> had the same customer, dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The <code>UsageRecordResult</code> <code>Status</code> indicates the status of an individual
     *        <code>UsageRecord</code> processed by <code>BatchMeterUsage</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Success</i>- The <code>UsageRecord</code> was accepted and honored by <code>BatchMeterUsage</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CustomerNotSubscribed</i>- The <code>CustomerIdentifier</code> specified is not able to use your
     *        product. The <code>UsageRecord</code> was not honored. There are three causes for this result:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The customer identifier is invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The customer identifier provided in the metering record does not have an active agreement or subscription
     *        with this product. Future <code>UsageRecords</code> for this customer will fail until the customer
     *        subscribes to your product.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The customer's AWS account was suspended.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DuplicateRecord</i>- Indicates that the <code>UsageRecord</code> was invalid and not honored. A
     *        previously metered <code>UsageRecord</code> had the same customer, dimension, and time, but a different
     *        quantity.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageRecordResultStatus
     */

    public UsageRecordResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The <code>UsageRecordResult</code> <code>Status</code> indicates the status of an individual
     * <code>UsageRecord</code> processed by <code>BatchMeterUsage</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The <code>UsageRecord</code> was accepted and honored by <code>BatchMeterUsage</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The <code>CustomerIdentifier</code> specified is not able to use your product. The
     * <code>UsageRecord</code> was not honored. There are three causes for this result:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The customer identifier is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The customer identifier provided in the metering record does not have an active agreement or subscription with
     * this product. Future <code>UsageRecords</code> for this customer will fail until the customer subscribes to your
     * product.
     * </p>
     * </li>
     * <li>
     * <p>
     * The customer's AWS account was suspended.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the <code>UsageRecord</code> was invalid and not honored. A previously
     * metered <code>UsageRecord</code> had the same customer, dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The <code>UsageRecordResult</code> <code>Status</code> indicates the status of an individual
     *        <code>UsageRecord</code> processed by <code>BatchMeterUsage</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Success</i>- The <code>UsageRecord</code> was accepted and honored by <code>BatchMeterUsage</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CustomerNotSubscribed</i>- The <code>CustomerIdentifier</code> specified is not able to use your
     *        product. The <code>UsageRecord</code> was not honored. There are three causes for this result:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The customer identifier is invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The customer identifier provided in the metering record does not have an active agreement or subscription
     *        with this product. Future <code>UsageRecords</code> for this customer will fail until the customer
     *        subscribes to your product.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The customer's AWS account was suspended.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DuplicateRecord</i>- Indicates that the <code>UsageRecord</code> was invalid and not honored. A
     *        previously metered <code>UsageRecord</code> had the same customer, dimension, and time, but a different
     *        quantity.
     *        </p>
     *        </li>
     * @see UsageRecordResultStatus
     */

    public void setStatus(UsageRecordResultStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The <code>UsageRecordResult</code> <code>Status</code> indicates the status of an individual
     * <code>UsageRecord</code> processed by <code>BatchMeterUsage</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The <code>UsageRecord</code> was accepted and honored by <code>BatchMeterUsage</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The <code>CustomerIdentifier</code> specified is not able to use your product. The
     * <code>UsageRecord</code> was not honored. There are three causes for this result:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The customer identifier is invalid.
     * </p>
     * </li>
     * <li>
     * <p>
     * The customer identifier provided in the metering record does not have an active agreement or subscription with
     * this product. Future <code>UsageRecords</code> for this customer will fail until the customer subscribes to your
     * product.
     * </p>
     * </li>
     * <li>
     * <p>
     * The customer's AWS account was suspended.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the <code>UsageRecord</code> was invalid and not honored. A previously
     * metered <code>UsageRecord</code> had the same customer, dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The <code>UsageRecordResult</code> <code>Status</code> indicates the status of an individual
     *        <code>UsageRecord</code> processed by <code>BatchMeterUsage</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Success</i>- The <code>UsageRecord</code> was accepted and honored by <code>BatchMeterUsage</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CustomerNotSubscribed</i>- The <code>CustomerIdentifier</code> specified is not able to use your
     *        product. The <code>UsageRecord</code> was not honored. There are three causes for this result:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The customer identifier is invalid.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The customer identifier provided in the metering record does not have an active agreement or subscription
     *        with this product. Future <code>UsageRecords</code> for this customer will fail until the customer
     *        subscribes to your product.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The customer's AWS account was suspended.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DuplicateRecord</i>- Indicates that the <code>UsageRecord</code> was invalid and not honored. A
     *        previously metered <code>UsageRecord</code> had the same customer, dimension, and time, but a different
     *        quantity.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageRecordResultStatus
     */

    public UsageRecordResult withStatus(UsageRecordResultStatus status) {
        this.status = status.toString();
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
        if (getUsageRecord() != null)
            sb.append("UsageRecord: ").append(getUsageRecord()).append(",");
        if (getMeteringRecordId() != null)
            sb.append("MeteringRecordId: ").append(getMeteringRecordId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageRecordResult == false)
            return false;
        UsageRecordResult other = (UsageRecordResult) obj;
        if (other.getUsageRecord() == null ^ this.getUsageRecord() == null)
            return false;
        if (other.getUsageRecord() != null && other.getUsageRecord().equals(this.getUsageRecord()) == false)
            return false;
        if (other.getMeteringRecordId() == null ^ this.getMeteringRecordId() == null)
            return false;
        if (other.getMeteringRecordId() != null && other.getMeteringRecordId().equals(this.getMeteringRecordId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsageRecord() == null) ? 0 : getUsageRecord().hashCode());
        hashCode = prime * hashCode + ((getMeteringRecordId() == null) ? 0 : getMeteringRecordId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UsageRecordResult clone() {
        try {
            return (UsageRecordResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacemetering.model.transform.UsageRecordResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
