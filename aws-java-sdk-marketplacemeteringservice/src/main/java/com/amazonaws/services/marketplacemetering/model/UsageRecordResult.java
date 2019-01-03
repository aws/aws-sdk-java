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
 * A UsageRecordResult indicates the status of a given UsageRecord processed by BatchMeterUsage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/meteringmarketplace-2016-01-14/UsageRecordResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageRecordResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The UsageRecord that was part of the BatchMeterUsage request.
     * </p>
     */
    private UsageRecord usageRecord;
    /**
     * <p>
     * The MeteringRecordId is a unique identifier for this metering event.
     * </p>
     */
    private String meteringRecordId;
    /**
     * <p>
     * The UsageRecordResult Status indicates the status of an individual UsageRecord processed by BatchMeterUsage.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The UsageRecord was accepted and honored by BatchMeterUsage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not subscribed to your product. The UsageRecord
     * was not honored. Future UsageRecords for this customer will fail until the customer subscribes to your product.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and not honored. A previously metered
     * UsageRecord had the same customer, dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The UsageRecord that was part of the BatchMeterUsage request.
     * </p>
     * 
     * @param usageRecord
     *        The UsageRecord that was part of the BatchMeterUsage request.
     */

    public void setUsageRecord(UsageRecord usageRecord) {
        this.usageRecord = usageRecord;
    }

    /**
     * <p>
     * The UsageRecord that was part of the BatchMeterUsage request.
     * </p>
     * 
     * @return The UsageRecord that was part of the BatchMeterUsage request.
     */

    public UsageRecord getUsageRecord() {
        return this.usageRecord;
    }

    /**
     * <p>
     * The UsageRecord that was part of the BatchMeterUsage request.
     * </p>
     * 
     * @param usageRecord
     *        The UsageRecord that was part of the BatchMeterUsage request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageRecordResult withUsageRecord(UsageRecord usageRecord) {
        setUsageRecord(usageRecord);
        return this;
    }

    /**
     * <p>
     * The MeteringRecordId is a unique identifier for this metering event.
     * </p>
     * 
     * @param meteringRecordId
     *        The MeteringRecordId is a unique identifier for this metering event.
     */

    public void setMeteringRecordId(String meteringRecordId) {
        this.meteringRecordId = meteringRecordId;
    }

    /**
     * <p>
     * The MeteringRecordId is a unique identifier for this metering event.
     * </p>
     * 
     * @return The MeteringRecordId is a unique identifier for this metering event.
     */

    public String getMeteringRecordId() {
        return this.meteringRecordId;
    }

    /**
     * <p>
     * The MeteringRecordId is a unique identifier for this metering event.
     * </p>
     * 
     * @param meteringRecordId
     *        The MeteringRecordId is a unique identifier for this metering event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageRecordResult withMeteringRecordId(String meteringRecordId) {
        setMeteringRecordId(meteringRecordId);
        return this;
    }

    /**
     * <p>
     * The UsageRecordResult Status indicates the status of an individual UsageRecord processed by BatchMeterUsage.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The UsageRecord was accepted and honored by BatchMeterUsage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not subscribed to your product. The UsageRecord
     * was not honored. Future UsageRecords for this customer will fail until the customer subscribes to your product.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and not honored. A previously metered
     * UsageRecord had the same customer, dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The UsageRecordResult Status indicates the status of an individual UsageRecord processed by
     *        BatchMeterUsage.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Success</i>- The UsageRecord was accepted and honored by BatchMeterUsage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not subscribed to your product. The
     *        UsageRecord was not honored. Future UsageRecords for this customer will fail until the customer subscribes
     *        to your product.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and not honored. A previously metered
     *        UsageRecord had the same customer, dimension, and time, but a different quantity.
     *        </p>
     *        </li>
     * @see UsageRecordResultStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The UsageRecordResult Status indicates the status of an individual UsageRecord processed by BatchMeterUsage.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The UsageRecord was accepted and honored by BatchMeterUsage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not subscribed to your product. The UsageRecord
     * was not honored. Future UsageRecords for this customer will fail until the customer subscribes to your product.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and not honored. A previously metered
     * UsageRecord had the same customer, dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The UsageRecordResult Status indicates the status of an individual UsageRecord processed by
     *         BatchMeterUsage.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Success</i>- The UsageRecord was accepted and honored by BatchMeterUsage.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not subscribed to your product. The
     *         UsageRecord was not honored. Future UsageRecords for this customer will fail until the customer
     *         subscribes to your product.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and not honored. A previously metered
     *         UsageRecord had the same customer, dimension, and time, but a different quantity.
     *         </p>
     *         </li>
     * @see UsageRecordResultStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The UsageRecordResult Status indicates the status of an individual UsageRecord processed by BatchMeterUsage.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The UsageRecord was accepted and honored by BatchMeterUsage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not subscribed to your product. The UsageRecord
     * was not honored. Future UsageRecords for this customer will fail until the customer subscribes to your product.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and not honored. A previously metered
     * UsageRecord had the same customer, dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The UsageRecordResult Status indicates the status of an individual UsageRecord processed by
     *        BatchMeterUsage.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Success</i>- The UsageRecord was accepted and honored by BatchMeterUsage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not subscribed to your product. The
     *        UsageRecord was not honored. Future UsageRecords for this customer will fail until the customer subscribes
     *        to your product.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and not honored. A previously metered
     *        UsageRecord had the same customer, dimension, and time, but a different quantity.
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
     * The UsageRecordResult Status indicates the status of an individual UsageRecord processed by BatchMeterUsage.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The UsageRecord was accepted and honored by BatchMeterUsage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not subscribed to your product. The UsageRecord
     * was not honored. Future UsageRecords for this customer will fail until the customer subscribes to your product.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and not honored. A previously metered
     * UsageRecord had the same customer, dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The UsageRecordResult Status indicates the status of an individual UsageRecord processed by
     *        BatchMeterUsage.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Success</i>- The UsageRecord was accepted and honored by BatchMeterUsage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not subscribed to your product. The
     *        UsageRecord was not honored. Future UsageRecords for this customer will fail until the customer subscribes
     *        to your product.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and not honored. A previously metered
     *        UsageRecord had the same customer, dimension, and time, but a different quantity.
     *        </p>
     *        </li>
     * @see UsageRecordResultStatus
     */

    public void setStatus(UsageRecordResultStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The UsageRecordResult Status indicates the status of an individual UsageRecord processed by BatchMeterUsage.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Success</i>- The UsageRecord was accepted and honored by BatchMeterUsage.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not subscribed to your product. The UsageRecord
     * was not honored. Future UsageRecords for this customer will fail until the customer subscribes to your product.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and not honored. A previously metered
     * UsageRecord had the same customer, dimension, and time, but a different quantity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The UsageRecordResult Status indicates the status of an individual UsageRecord processed by
     *        BatchMeterUsage.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Success</i>- The UsageRecord was accepted and honored by BatchMeterUsage.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>CustomerNotSubscribed</i>- The CustomerIdentifier specified is not subscribed to your product. The
     *        UsageRecord was not honored. Future UsageRecords for this customer will fail until the customer subscribes
     *        to your product.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>DuplicateRecord</i>- Indicates that the UsageRecord was invalid and not honored. A previously metered
     *        UsageRecord had the same customer, dimension, and time, but a different quantity.
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
