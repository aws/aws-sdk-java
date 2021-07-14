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
 * The batch condition that started the workflow run. Either the number of events in the batch size arrived, in which
 * case the BatchSize member is non-zero, or the batch window expired, in which case the BatchWindow member is non-zero.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartingEventBatchCondition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartingEventBatchCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Number of events in the batch.
     * </p>
     */
    private Integer batchSize;
    /**
     * <p>
     * Duration of the batch window in seconds.
     * </p>
     */
    private Integer batchWindow;

    /**
     * <p>
     * Number of events in the batch.
     * </p>
     * 
     * @param batchSize
     *        Number of events in the batch.
     */

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * <p>
     * Number of events in the batch.
     * </p>
     * 
     * @return Number of events in the batch.
     */

    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * <p>
     * Number of events in the batch.
     * </p>
     * 
     * @param batchSize
     *        Number of events in the batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartingEventBatchCondition withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
        return this;
    }

    /**
     * <p>
     * Duration of the batch window in seconds.
     * </p>
     * 
     * @param batchWindow
     *        Duration of the batch window in seconds.
     */

    public void setBatchWindow(Integer batchWindow) {
        this.batchWindow = batchWindow;
    }

    /**
     * <p>
     * Duration of the batch window in seconds.
     * </p>
     * 
     * @return Duration of the batch window in seconds.
     */

    public Integer getBatchWindow() {
        return this.batchWindow;
    }

    /**
     * <p>
     * Duration of the batch window in seconds.
     * </p>
     * 
     * @param batchWindow
     *        Duration of the batch window in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartingEventBatchCondition withBatchWindow(Integer batchWindow) {
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

        if (obj instanceof StartingEventBatchCondition == false)
            return false;
        StartingEventBatchCondition other = (StartingEventBatchCondition) obj;
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
    public StartingEventBatchCondition clone() {
        try {
            return (StartingEventBatchCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.StartingEventBatchConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
