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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/DescribeDeliveryStream" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeliveryStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     */
    private String deliveryStreamName;
    /**
     * <p>
     * The limit on the number of destinations to return. You can have one destination per delivery stream.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The ID of the destination to start returning the destination information. Kinesis Data Firehose supports one
     * destination per delivery stream.
     * </p>
     */
    private String exclusiveStartDestinationId;

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the delivery stream.
     */

    public void setDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * 
     * @return The name of the delivery stream.
     */

    public String getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeliveryStreamRequest withDeliveryStreamName(String deliveryStreamName) {
        setDeliveryStreamName(deliveryStreamName);
        return this;
    }

    /**
     * <p>
     * The limit on the number of destinations to return. You can have one destination per delivery stream.
     * </p>
     * 
     * @param limit
     *        The limit on the number of destinations to return. You can have one destination per delivery stream.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The limit on the number of destinations to return. You can have one destination per delivery stream.
     * </p>
     * 
     * @return The limit on the number of destinations to return. You can have one destination per delivery stream.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The limit on the number of destinations to return. You can have one destination per delivery stream.
     * </p>
     * 
     * @param limit
     *        The limit on the number of destinations to return. You can have one destination per delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeliveryStreamRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The ID of the destination to start returning the destination information. Kinesis Data Firehose supports one
     * destination per delivery stream.
     * </p>
     * 
     * @param exclusiveStartDestinationId
     *        The ID of the destination to start returning the destination information. Kinesis Data Firehose supports
     *        one destination per delivery stream.
     */

    public void setExclusiveStartDestinationId(String exclusiveStartDestinationId) {
        this.exclusiveStartDestinationId = exclusiveStartDestinationId;
    }

    /**
     * <p>
     * The ID of the destination to start returning the destination information. Kinesis Data Firehose supports one
     * destination per delivery stream.
     * </p>
     * 
     * @return The ID of the destination to start returning the destination information. Kinesis Data Firehose supports
     *         one destination per delivery stream.
     */

    public String getExclusiveStartDestinationId() {
        return this.exclusiveStartDestinationId;
    }

    /**
     * <p>
     * The ID of the destination to start returning the destination information. Kinesis Data Firehose supports one
     * destination per delivery stream.
     * </p>
     * 
     * @param exclusiveStartDestinationId
     *        The ID of the destination to start returning the destination information. Kinesis Data Firehose supports
     *        one destination per delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeliveryStreamRequest withExclusiveStartDestinationId(String exclusiveStartDestinationId) {
        setExclusiveStartDestinationId(exclusiveStartDestinationId);
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
        if (getDeliveryStreamName() != null)
            sb.append("DeliveryStreamName: ").append(getDeliveryStreamName()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getExclusiveStartDestinationId() != null)
            sb.append("ExclusiveStartDestinationId: ").append(getExclusiveStartDestinationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDeliveryStreamRequest == false)
            return false;
        DescribeDeliveryStreamRequest other = (DescribeDeliveryStreamRequest) obj;
        if (other.getDeliveryStreamName() == null ^ this.getDeliveryStreamName() == null)
            return false;
        if (other.getDeliveryStreamName() != null && other.getDeliveryStreamName().equals(this.getDeliveryStreamName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getExclusiveStartDestinationId() == null ^ this.getExclusiveStartDestinationId() == null)
            return false;
        if (other.getExclusiveStartDestinationId() != null && other.getExclusiveStartDestinationId().equals(this.getExclusiveStartDestinationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryStreamName() == null) ? 0 : getDeliveryStreamName().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getExclusiveStartDestinationId() == null) ? 0 : getExclusiveStartDestinationId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeliveryStreamRequest clone() {
        return (DescribeDeliveryStreamRequest) super.clone();
    }

}
