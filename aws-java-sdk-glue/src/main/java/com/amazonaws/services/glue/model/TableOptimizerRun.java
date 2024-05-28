/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains details for a table optimizer run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TableOptimizerRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableOptimizerRun implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An event type representing the status of the table optimizer run.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * Represents the epoch timestamp at which the compaction job was started within Lake Formation.
     * </p>
     */
    private java.util.Date startTimestamp;
    /**
     * <p>
     * Represents the epoch timestamp at which the compaction job ended.
     * </p>
     */
    private java.util.Date endTimestamp;
    /**
     * <p>
     * A <code>RunMetrics</code> object containing metrics for the optimizer run.
     * </p>
     */
    private RunMetrics metrics;
    /**
     * <p>
     * An error that occured during the optimizer run.
     * </p>
     */
    private String error;

    /**
     * <p>
     * An event type representing the status of the table optimizer run.
     * </p>
     * 
     * @param eventType
     *        An event type representing the status of the table optimizer run.
     * @see TableOptimizerEventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * An event type representing the status of the table optimizer run.
     * </p>
     * 
     * @return An event type representing the status of the table optimizer run.
     * @see TableOptimizerEventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * An event type representing the status of the table optimizer run.
     * </p>
     * 
     * @param eventType
     *        An event type representing the status of the table optimizer run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableOptimizerEventType
     */

    public TableOptimizerRun withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * An event type representing the status of the table optimizer run.
     * </p>
     * 
     * @param eventType
     *        An event type representing the status of the table optimizer run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableOptimizerEventType
     */

    public TableOptimizerRun withEventType(TableOptimizerEventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * Represents the epoch timestamp at which the compaction job was started within Lake Formation.
     * </p>
     * 
     * @param startTimestamp
     *        Represents the epoch timestamp at which the compaction job was started within Lake Formation.
     */

    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * Represents the epoch timestamp at which the compaction job was started within Lake Formation.
     * </p>
     * 
     * @return Represents the epoch timestamp at which the compaction job was started within Lake Formation.
     */

    public java.util.Date getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * <p>
     * Represents the epoch timestamp at which the compaction job was started within Lake Formation.
     * </p>
     * 
     * @param startTimestamp
     *        Represents the epoch timestamp at which the compaction job was started within Lake Formation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableOptimizerRun withStartTimestamp(java.util.Date startTimestamp) {
        setStartTimestamp(startTimestamp);
        return this;
    }

    /**
     * <p>
     * Represents the epoch timestamp at which the compaction job ended.
     * </p>
     * 
     * @param endTimestamp
     *        Represents the epoch timestamp at which the compaction job ended.
     */

    public void setEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * <p>
     * Represents the epoch timestamp at which the compaction job ended.
     * </p>
     * 
     * @return Represents the epoch timestamp at which the compaction job ended.
     */

    public java.util.Date getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * <p>
     * Represents the epoch timestamp at which the compaction job ended.
     * </p>
     * 
     * @param endTimestamp
     *        Represents the epoch timestamp at which the compaction job ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableOptimizerRun withEndTimestamp(java.util.Date endTimestamp) {
        setEndTimestamp(endTimestamp);
        return this;
    }

    /**
     * <p>
     * A <code>RunMetrics</code> object containing metrics for the optimizer run.
     * </p>
     * 
     * @param metrics
     *        A <code>RunMetrics</code> object containing metrics for the optimizer run.
     */

    public void setMetrics(RunMetrics metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * A <code>RunMetrics</code> object containing metrics for the optimizer run.
     * </p>
     * 
     * @return A <code>RunMetrics</code> object containing metrics for the optimizer run.
     */

    public RunMetrics getMetrics() {
        return this.metrics;
    }

    /**
     * <p>
     * A <code>RunMetrics</code> object containing metrics for the optimizer run.
     * </p>
     * 
     * @param metrics
     *        A <code>RunMetrics</code> object containing metrics for the optimizer run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableOptimizerRun withMetrics(RunMetrics metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * An error that occured during the optimizer run.
     * </p>
     * 
     * @param error
     *        An error that occured during the optimizer run.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * An error that occured during the optimizer run.
     * </p>
     * 
     * @return An error that occured during the optimizer run.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * An error that occured during the optimizer run.
     * </p>
     * 
     * @param error
     *        An error that occured during the optimizer run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableOptimizerRun withError(String error) {
        setError(error);
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
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: ").append(getStartTimestamp()).append(",");
        if (getEndTimestamp() != null)
            sb.append("EndTimestamp: ").append(getEndTimestamp()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableOptimizerRun == false)
            return false;
        TableOptimizerRun other = (TableOptimizerRun) obj;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getEndTimestamp() == null ^ this.getEndTimestamp() == null)
            return false;
        if (other.getEndTimestamp() != null && other.getEndTimestamp().equals(this.getEndTimestamp()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEndTimestamp() == null) ? 0 : getEndTimestamp().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public TableOptimizerRun clone() {
        try {
            return (TableOptimizerRun) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.TableOptimizerRunMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
