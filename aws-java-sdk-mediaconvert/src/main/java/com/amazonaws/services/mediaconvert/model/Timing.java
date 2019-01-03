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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about when jobs are submitted, started, and finished is specified in Unix epoch format in seconds.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Timing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Timing implements Serializable, Cloneable, StructuredPojo {

    /** The time, in Unix epoch format, that the transcoding job finished */
    private java.util.Date finishTime;
    /** The time, in Unix epoch format, that transcoding for the job began. */
    private java.util.Date startTime;
    /** The time, in Unix epoch format, that you submitted the job. */
    private java.util.Date submitTime;

    /**
     * The time, in Unix epoch format, that the transcoding job finished
     * 
     * @param finishTime
     *        The time, in Unix epoch format, that the transcoding job finished
     */

    public void setFinishTime(java.util.Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * The time, in Unix epoch format, that the transcoding job finished
     * 
     * @return The time, in Unix epoch format, that the transcoding job finished
     */

    public java.util.Date getFinishTime() {
        return this.finishTime;
    }

    /**
     * The time, in Unix epoch format, that the transcoding job finished
     * 
     * @param finishTime
     *        The time, in Unix epoch format, that the transcoding job finished
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Timing withFinishTime(java.util.Date finishTime) {
        setFinishTime(finishTime);
        return this;
    }

    /**
     * The time, in Unix epoch format, that transcoding for the job began.
     * 
     * @param startTime
     *        The time, in Unix epoch format, that transcoding for the job began.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * The time, in Unix epoch format, that transcoding for the job began.
     * 
     * @return The time, in Unix epoch format, that transcoding for the job began.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * The time, in Unix epoch format, that transcoding for the job began.
     * 
     * @param startTime
     *        The time, in Unix epoch format, that transcoding for the job began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Timing withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * The time, in Unix epoch format, that you submitted the job.
     * 
     * @param submitTime
     *        The time, in Unix epoch format, that you submitted the job.
     */

    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * The time, in Unix epoch format, that you submitted the job.
     * 
     * @return The time, in Unix epoch format, that you submitted the job.
     */

    public java.util.Date getSubmitTime() {
        return this.submitTime;
    }

    /**
     * The time, in Unix epoch format, that you submitted the job.
     * 
     * @param submitTime
     *        The time, in Unix epoch format, that you submitted the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Timing withSubmitTime(java.util.Date submitTime) {
        setSubmitTime(submitTime);
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
        if (getFinishTime() != null)
            sb.append("FinishTime: ").append(getFinishTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getSubmitTime() != null)
            sb.append("SubmitTime: ").append(getSubmitTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Timing == false)
            return false;
        Timing other = (Timing) obj;
        if (other.getFinishTime() == null ^ this.getFinishTime() == null)
            return false;
        if (other.getFinishTime() != null && other.getFinishTime().equals(this.getFinishTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getSubmitTime() == null ^ this.getSubmitTime() == null)
            return false;
        if (other.getSubmitTime() != null && other.getSubmitTime().equals(this.getSubmitTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFinishTime() == null) ? 0 : getFinishTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        return hashCode;
    }

    @Override
    public Timing clone() {
        try {
            return (Timing) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.TimingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
