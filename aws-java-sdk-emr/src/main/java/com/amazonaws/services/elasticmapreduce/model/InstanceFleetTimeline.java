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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides historical timestamps for the instance fleet, including the time of creation, the time it became ready to
 * run jobs, and the time of termination.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/InstanceFleetTimeline"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceFleetTimeline implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time and date the instance fleet was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The time and date the instance fleet was ready to run jobs.
     * </p>
     */
    private java.util.Date readyDateTime;
    /**
     * <p>
     * The time and date the instance fleet terminated.
     * </p>
     */
    private java.util.Date endDateTime;

    /**
     * <p>
     * The time and date the instance fleet was created.
     * </p>
     * 
     * @param creationDateTime
     *        The time and date the instance fleet was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The time and date the instance fleet was created.
     * </p>
     * 
     * @return The time and date the instance fleet was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The time and date the instance fleet was created.
     * </p>
     * 
     * @param creationDateTime
     *        The time and date the instance fleet was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetTimeline withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The time and date the instance fleet was ready to run jobs.
     * </p>
     * 
     * @param readyDateTime
     *        The time and date the instance fleet was ready to run jobs.
     */

    public void setReadyDateTime(java.util.Date readyDateTime) {
        this.readyDateTime = readyDateTime;
    }

    /**
     * <p>
     * The time and date the instance fleet was ready to run jobs.
     * </p>
     * 
     * @return The time and date the instance fleet was ready to run jobs.
     */

    public java.util.Date getReadyDateTime() {
        return this.readyDateTime;
    }

    /**
     * <p>
     * The time and date the instance fleet was ready to run jobs.
     * </p>
     * 
     * @param readyDateTime
     *        The time and date the instance fleet was ready to run jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetTimeline withReadyDateTime(java.util.Date readyDateTime) {
        setReadyDateTime(readyDateTime);
        return this;
    }

    /**
     * <p>
     * The time and date the instance fleet terminated.
     * </p>
     * 
     * @param endDateTime
     *        The time and date the instance fleet terminated.
     */

    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The time and date the instance fleet terminated.
     * </p>
     * 
     * @return The time and date the instance fleet terminated.
     */

    public java.util.Date getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * The time and date the instance fleet terminated.
     * </p>
     * 
     * @param endDateTime
     *        The time and date the instance fleet terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetTimeline withEndDateTime(java.util.Date endDateTime) {
        setEndDateTime(endDateTime);
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
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getReadyDateTime() != null)
            sb.append("ReadyDateTime: ").append(getReadyDateTime()).append(",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: ").append(getEndDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceFleetTimeline == false)
            return false;
        InstanceFleetTimeline other = (InstanceFleetTimeline) obj;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getReadyDateTime() == null ^ this.getReadyDateTime() == null)
            return false;
        if (other.getReadyDateTime() != null && other.getReadyDateTime().equals(this.getReadyDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getReadyDateTime() == null) ? 0 : getReadyDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        return hashCode;
    }

    @Override
    public InstanceFleetTimeline clone() {
        try {
            return (InstanceFleetTimeline) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceFleetTimelineMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
