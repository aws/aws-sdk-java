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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The time range during which anomalous behavior in a proactive anomaly or an insight is expected to occur.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/PredictionTimeRange" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictionTimeRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time range during which a metric limit is expected to be exceeded. This applies to proactive insights only.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time when the behavior in a proactive insight is expected to end.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The time range during which a metric limit is expected to be exceeded. This applies to proactive insights only.
     * </p>
     * 
     * @param startTime
     *        The time range during which a metric limit is expected to be exceeded. This applies to proactive insights
     *        only.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time range during which a metric limit is expected to be exceeded. This applies to proactive insights only.
     * </p>
     * 
     * @return The time range during which a metric limit is expected to be exceeded. This applies to proactive insights
     *         only.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time range during which a metric limit is expected to be exceeded. This applies to proactive insights only.
     * </p>
     * 
     * @param startTime
     *        The time range during which a metric limit is expected to be exceeded. This applies to proactive insights
     *        only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictionTimeRange withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time when the behavior in a proactive insight is expected to end.
     * </p>
     * 
     * @param endTime
     *        The time when the behavior in a proactive insight is expected to end.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time when the behavior in a proactive insight is expected to end.
     * </p>
     * 
     * @return The time when the behavior in a proactive insight is expected to end.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time when the behavior in a proactive insight is expected to end.
     * </p>
     * 
     * @param endTime
     *        The time when the behavior in a proactive insight is expected to end.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictionTimeRange withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictionTimeRange == false)
            return false;
        PredictionTimeRange other = (PredictionTimeRange) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public PredictionTimeRange clone() {
        try {
            return (PredictionTimeRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.PredictionTimeRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
