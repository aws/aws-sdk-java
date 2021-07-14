/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Batch condition that must be met (specified number of events received or batch time window expired) before
 * EventBridge event trigger fires.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/EventBatchingCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventBatchingCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Number of events that must be received from Amazon EventBridge before EventBridge event trigger fires.
     * </p>
     */
    private Integer batchSize;
    /**
     * <p>
     * Window of time in seconds after which EventBridge event trigger fires. Window starts when first event is
     * received.
     * </p>
     */
    private Integer batchWindow;

    /**
     * <p>
     * Number of events that must be received from Amazon EventBridge before EventBridge event trigger fires.
     * </p>
     * 
     * @param batchSize
     *        Number of events that must be received from Amazon EventBridge before EventBridge event trigger fires.
     */

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * <p>
     * Number of events that must be received from Amazon EventBridge before EventBridge event trigger fires.
     * </p>
     * 
     * @return Number of events that must be received from Amazon EventBridge before EventBridge event trigger fires.
     */

    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * <p>
     * Number of events that must be received from Amazon EventBridge before EventBridge event trigger fires.
     * </p>
     * 
     * @param batchSize
     *        Number of events that must be received from Amazon EventBridge before EventBridge event trigger fires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventBatchingCondition withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
        return this;
    }

    /**
     * <p>
     * Window of time in seconds after which EventBridge event trigger fires. Window starts when first event is
     * received.
     * </p>
     * 
     * @param batchWindow
     *        Window of time in seconds after which EventBridge event trigger fires. Window starts when first event is
     *        received.
     */

    public void setBatchWindow(Integer batchWindow) {
        this.batchWindow = batchWindow;
    }

    /**
     * <p>
     * Window of time in seconds after which EventBridge event trigger fires. Window starts when first event is
     * received.
     * </p>
     * 
     * @return Window of time in seconds after which EventBridge event trigger fires. Window starts when first event is
     *         received.
     */

    public Integer getBatchWindow() {
        return this.batchWindow;
    }

    /**
     * <p>
     * Window of time in seconds after which EventBridge event trigger fires. Window starts when first event is
     * received.
     * </p>
     * 
     * @param batchWindow
     *        Window of time in seconds after which EventBridge event trigger fires. Window starts when first event is
     *        received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventBatchingCondition withBatchWindow(Integer batchWindow) {
        setBatchWindow(batchWindow);
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
        if (getBatchSize() != null)
            sb.append("BatchSize: ").append(getBatchSize()).append(",");
        if (getBatchWindow() != null)
            sb.append("BatchWindow: ").append(getBatchWindow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventBatchingCondition == false)
            return false;
        EventBatchingCondition other = (EventBatchingCondition) obj;
        if (other.getBatchSize() == null ^ this.getBatchSize() == null)
            return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false)
            return false;
        if (other.getBatchWindow() == null ^ this.getBatchWindow() == null)
            return false;
        if (other.getBatchWindow() != null && other.getBatchWindow().equals(this.getBatchWindow()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        hashCode = prime * hashCode + ((getBatchWindow() == null) ? 0 : getBatchWindow().hashCode());
        return hashCode;
    }

    @Override
    public EventBatchingCondition clone() {
        try {
            return (EventBatchingCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.EventBatchingConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
