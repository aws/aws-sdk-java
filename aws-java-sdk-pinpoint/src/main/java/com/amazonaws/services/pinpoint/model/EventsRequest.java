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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A set of events to process.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EventsRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventsRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as
     * the value.
     */
    private java.util.Map<String, EventsBatch> batchItem;

    /**
     * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as
     * the value.
     * 
     * @return A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch
     *         object as the value.
     */

    public java.util.Map<String, EventsBatch> getBatchItem() {
        return batchItem;
    }

    /**
     * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as
     * the value.
     * 
     * @param batchItem
     *        A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch
     *        object as the value.
     */

    public void setBatchItem(java.util.Map<String, EventsBatch> batchItem) {
        this.batchItem = batchItem;
    }

    /**
     * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as
     * the value.
     * 
     * @param batchItem
     *        A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch
     *        object as the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsRequest withBatchItem(java.util.Map<String, EventsBatch> batchItem) {
        setBatchItem(batchItem);
        return this;
    }

    public EventsRequest addBatchItemEntry(String key, EventsBatch value) {
        if (null == this.batchItem) {
            this.batchItem = new java.util.HashMap<String, EventsBatch>();
        }
        if (this.batchItem.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.batchItem.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BatchItem.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventsRequest clearBatchItemEntries() {
        this.batchItem = null;
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
        if (getBatchItem() != null)
            sb.append("BatchItem: ").append(getBatchItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventsRequest == false)
            return false;
        EventsRequest other = (EventsRequest) obj;
        if (other.getBatchItem() == null ^ this.getBatchItem() == null)
            return false;
        if (other.getBatchItem() != null && other.getBatchItem().equals(this.getBatchItem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchItem() == null) ? 0 : getBatchItem().hashCode());
        return hashCode;
    }

    @Override
    public EventsRequest clone() {
        try {
            return (EventsRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EventsRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
