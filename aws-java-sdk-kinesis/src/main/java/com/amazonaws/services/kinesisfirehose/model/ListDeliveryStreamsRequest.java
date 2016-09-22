/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for <a>ListDeliveryStreams</a>.
 * </p>
 */
public class ListDeliveryStreamsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of delivery streams to list.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The name of the delivery stream to start the list with.
     * </p>
     */
    private String exclusiveStartDeliveryStreamName;

    /**
     * <p>
     * The maximum number of delivery streams to list.
     * </p>
     * 
     * @param limit
     *        The maximum number of delivery streams to list.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of delivery streams to list.
     * </p>
     * 
     * @return The maximum number of delivery streams to list.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of delivery streams to list.
     * </p>
     * 
     * @param limit
     *        The maximum number of delivery streams to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeliveryStreamsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The name of the delivery stream to start the list with.
     * </p>
     * 
     * @param exclusiveStartDeliveryStreamName
     *        The name of the delivery stream to start the list with.
     */

    public void setExclusiveStartDeliveryStreamName(String exclusiveStartDeliveryStreamName) {
        this.exclusiveStartDeliveryStreamName = exclusiveStartDeliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream to start the list with.
     * </p>
     * 
     * @return The name of the delivery stream to start the list with.
     */

    public String getExclusiveStartDeliveryStreamName() {
        return this.exclusiveStartDeliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream to start the list with.
     * </p>
     * 
     * @param exclusiveStartDeliveryStreamName
     *        The name of the delivery stream to start the list with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeliveryStreamsRequest withExclusiveStartDeliveryStreamName(String exclusiveStartDeliveryStreamName) {
        setExclusiveStartDeliveryStreamName(exclusiveStartDeliveryStreamName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Limit: " + getLimit() + ",");
        if (getExclusiveStartDeliveryStreamName() != null)
            sb.append("ExclusiveStartDeliveryStreamName: " + getExclusiveStartDeliveryStreamName());
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
        hashCode = prime * hashCode + ((getExclusiveStartDeliveryStreamName() == null) ? 0 : getExclusiveStartDeliveryStreamName().hashCode());
        return hashCode;
    }

    @Override
    public ListDeliveryStreamsRequest clone() {
        return (ListDeliveryStreamsRequest) super.clone();
    }
}
