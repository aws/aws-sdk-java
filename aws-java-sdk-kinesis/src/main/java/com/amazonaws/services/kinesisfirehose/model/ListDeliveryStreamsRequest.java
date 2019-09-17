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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/ListDeliveryStreams" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeliveryStreamsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of delivery streams to list. The default value is 10.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The delivery stream type. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is optional. If this parameter is omitted, delivery streams of all types are returned.
     * </p>
     */
    private String deliveryStreamType;
    /**
     * <p>
     * The list of delivery streams returned by this call to <code>ListDeliveryStreams</code> will start with the
     * delivery stream whose name comes alphabetically immediately after the name you specify in
     * <code>ExclusiveStartDeliveryStreamName</code>.
     * </p>
     */
    private String exclusiveStartDeliveryStreamName;

    /**
     * <p>
     * The maximum number of delivery streams to list. The default value is 10.
     * </p>
     * 
     * @param limit
     *        The maximum number of delivery streams to list. The default value is 10.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of delivery streams to list. The default value is 10.
     * </p>
     * 
     * @return The maximum number of delivery streams to list. The default value is 10.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of delivery streams to list. The default value is 10.
     * </p>
     * 
     * @param limit
     *        The maximum number of delivery streams to list. The default value is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeliveryStreamsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The delivery stream type. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is optional. If this parameter is omitted, delivery streams of all types are returned.
     * </p>
     * 
     * @param deliveryStreamType
     *        The delivery stream type. This can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DirectPut</code>: Provider applications access the delivery stream directly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This parameter is optional. If this parameter is omitted, delivery streams of all types are returned.
     * @see DeliveryStreamType
     */

    public void setDeliveryStreamType(String deliveryStreamType) {
        this.deliveryStreamType = deliveryStreamType;
    }

    /**
     * <p>
     * The delivery stream type. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is optional. If this parameter is omitted, delivery streams of all types are returned.
     * </p>
     * 
     * @return The delivery stream type. This can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DirectPut</code>: Provider applications access the delivery stream directly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This parameter is optional. If this parameter is omitted, delivery streams of all types are returned.
     * @see DeliveryStreamType
     */

    public String getDeliveryStreamType() {
        return this.deliveryStreamType;
    }

    /**
     * <p>
     * The delivery stream type. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is optional. If this parameter is omitted, delivery streams of all types are returned.
     * </p>
     * 
     * @param deliveryStreamType
     *        The delivery stream type. This can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DirectPut</code>: Provider applications access the delivery stream directly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This parameter is optional. If this parameter is omitted, delivery streams of all types are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamType
     */

    public ListDeliveryStreamsRequest withDeliveryStreamType(String deliveryStreamType) {
        setDeliveryStreamType(deliveryStreamType);
        return this;
    }

    /**
     * <p>
     * The delivery stream type. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This parameter is optional. If this parameter is omitted, delivery streams of all types are returned.
     * </p>
     * 
     * @param deliveryStreamType
     *        The delivery stream type. This can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DirectPut</code>: Provider applications access the delivery stream directly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis data stream as a source.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This parameter is optional. If this parameter is omitted, delivery streams of all types are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamType
     */

    public ListDeliveryStreamsRequest withDeliveryStreamType(DeliveryStreamType deliveryStreamType) {
        this.deliveryStreamType = deliveryStreamType.toString();
        return this;
    }

    /**
     * <p>
     * The list of delivery streams returned by this call to <code>ListDeliveryStreams</code> will start with the
     * delivery stream whose name comes alphabetically immediately after the name you specify in
     * <code>ExclusiveStartDeliveryStreamName</code>.
     * </p>
     * 
     * @param exclusiveStartDeliveryStreamName
     *        The list of delivery streams returned by this call to <code>ListDeliveryStreams</code> will start with the
     *        delivery stream whose name comes alphabetically immediately after the name you specify in
     *        <code>ExclusiveStartDeliveryStreamName</code>.
     */

    public void setExclusiveStartDeliveryStreamName(String exclusiveStartDeliveryStreamName) {
        this.exclusiveStartDeliveryStreamName = exclusiveStartDeliveryStreamName;
    }

    /**
     * <p>
     * The list of delivery streams returned by this call to <code>ListDeliveryStreams</code> will start with the
     * delivery stream whose name comes alphabetically immediately after the name you specify in
     * <code>ExclusiveStartDeliveryStreamName</code>.
     * </p>
     * 
     * @return The list of delivery streams returned by this call to <code>ListDeliveryStreams</code> will start with
     *         the delivery stream whose name comes alphabetically immediately after the name you specify in
     *         <code>ExclusiveStartDeliveryStreamName</code>.
     */

    public String getExclusiveStartDeliveryStreamName() {
        return this.exclusiveStartDeliveryStreamName;
    }

    /**
     * <p>
     * The list of delivery streams returned by this call to <code>ListDeliveryStreams</code> will start with the
     * delivery stream whose name comes alphabetically immediately after the name you specify in
     * <code>ExclusiveStartDeliveryStreamName</code>.
     * </p>
     * 
     * @param exclusiveStartDeliveryStreamName
     *        The list of delivery streams returned by this call to <code>ListDeliveryStreams</code> will start with the
     *        delivery stream whose name comes alphabetically immediately after the name you specify in
     *        <code>ExclusiveStartDeliveryStreamName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeliveryStreamsRequest withExclusiveStartDeliveryStreamName(String exclusiveStartDeliveryStreamName) {
        setExclusiveStartDeliveryStreamName(exclusiveStartDeliveryStreamName);
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getDeliveryStreamType() != null)
            sb.append("DeliveryStreamType: ").append(getDeliveryStreamType()).append(",");
        if (getExclusiveStartDeliveryStreamName() != null)
            sb.append("ExclusiveStartDeliveryStreamName: ").append(getExclusiveStartDeliveryStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeliveryStreamsRequest == false)
            return false;
        ListDeliveryStreamsRequest other = (ListDeliveryStreamsRequest) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getDeliveryStreamType() == null ^ this.getDeliveryStreamType() == null)
            return false;
        if (other.getDeliveryStreamType() != null && other.getDeliveryStreamType().equals(this.getDeliveryStreamType()) == false)
            return false;
        if (other.getExclusiveStartDeliveryStreamName() == null ^ this.getExclusiveStartDeliveryStreamName() == null)
            return false;
        if (other.getExclusiveStartDeliveryStreamName() != null
                && other.getExclusiveStartDeliveryStreamName().equals(this.getExclusiveStartDeliveryStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getDeliveryStreamType() == null) ? 0 : getDeliveryStreamType().hashCode());
        hashCode = prime * hashCode + ((getExclusiveStartDeliveryStreamName() == null) ? 0 : getExclusiveStartDeliveryStreamName().hashCode());
        return hashCode;
    }

    @Override
    public ListDeliveryStreamsRequest clone() {
        return (ListDeliveryStreamsRequest) super.clone();
    }

}
