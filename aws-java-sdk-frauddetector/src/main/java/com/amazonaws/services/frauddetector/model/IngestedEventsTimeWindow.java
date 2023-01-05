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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The start and stop time of the ingested events.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/IngestedEventsTimeWindow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngestedEventsTimeWindow implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Timestamp of the first ingensted event.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * Timestamp of the final ingested event.
     * </p>
     */
    private String endTime;

    /**
     * <p>
     * Timestamp of the first ingensted event.
     * </p>
     * 
     * @param startTime
     *        Timestamp of the first ingensted event.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Timestamp of the first ingensted event.
     * </p>
     * 
     * @return Timestamp of the first ingensted event.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Timestamp of the first ingensted event.
     * </p>
     * 
     * @param startTime
     *        Timestamp of the first ingensted event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestedEventsTimeWindow withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Timestamp of the final ingested event.
     * </p>
     * 
     * @param endTime
     *        Timestamp of the final ingested event.
     */

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Timestamp of the final ingested event.
     * </p>
     * 
     * @return Timestamp of the final ingested event.
     */

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Timestamp of the final ingested event.
     * </p>
     * 
     * @param endTime
     *        Timestamp of the final ingested event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestedEventsTimeWindow withEndTime(String endTime) {
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

        if (obj instanceof IngestedEventsTimeWindow == false)
            return false;
        IngestedEventsTimeWindow other = (IngestedEventsTimeWindow) obj;
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
    public IngestedEventsTimeWindow clone() {
        try {
            return (IngestedEventsTimeWindow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.IngestedEventsTimeWindowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
