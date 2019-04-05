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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the timing of a job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Timing implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time the job was submitted to Elastic Transcoder, in epoch milliseconds.
     * </p>
     */
    private Long submitTimeMillis;
    /**
     * <p>
     * The time the job began transcoding, in epoch milliseconds.
     * </p>
     */
    private Long startTimeMillis;
    /**
     * <p>
     * The time the job finished transcoding, in epoch milliseconds.
     * </p>
     */
    private Long finishTimeMillis;

    /**
     * <p>
     * The time the job was submitted to Elastic Transcoder, in epoch milliseconds.
     * </p>
     * 
     * @param submitTimeMillis
     *        The time the job was submitted to Elastic Transcoder, in epoch milliseconds.
     */

    public void setSubmitTimeMillis(Long submitTimeMillis) {
        this.submitTimeMillis = submitTimeMillis;
    }

    /**
     * <p>
     * The time the job was submitted to Elastic Transcoder, in epoch milliseconds.
     * </p>
     * 
     * @return The time the job was submitted to Elastic Transcoder, in epoch milliseconds.
     */

    public Long getSubmitTimeMillis() {
        return this.submitTimeMillis;
    }

    /**
     * <p>
     * The time the job was submitted to Elastic Transcoder, in epoch milliseconds.
     * </p>
     * 
     * @param submitTimeMillis
     *        The time the job was submitted to Elastic Transcoder, in epoch milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Timing withSubmitTimeMillis(Long submitTimeMillis) {
        setSubmitTimeMillis(submitTimeMillis);
        return this;
    }

    /**
     * <p>
     * The time the job began transcoding, in epoch milliseconds.
     * </p>
     * 
     * @param startTimeMillis
     *        The time the job began transcoding, in epoch milliseconds.
     */

    public void setStartTimeMillis(Long startTimeMillis) {
        this.startTimeMillis = startTimeMillis;
    }

    /**
     * <p>
     * The time the job began transcoding, in epoch milliseconds.
     * </p>
     * 
     * @return The time the job began transcoding, in epoch milliseconds.
     */

    public Long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    /**
     * <p>
     * The time the job began transcoding, in epoch milliseconds.
     * </p>
     * 
     * @param startTimeMillis
     *        The time the job began transcoding, in epoch milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Timing withStartTimeMillis(Long startTimeMillis) {
        setStartTimeMillis(startTimeMillis);
        return this;
    }

    /**
     * <p>
     * The time the job finished transcoding, in epoch milliseconds.
     * </p>
     * 
     * @param finishTimeMillis
     *        The time the job finished transcoding, in epoch milliseconds.
     */

    public void setFinishTimeMillis(Long finishTimeMillis) {
        this.finishTimeMillis = finishTimeMillis;
    }

    /**
     * <p>
     * The time the job finished transcoding, in epoch milliseconds.
     * </p>
     * 
     * @return The time the job finished transcoding, in epoch milliseconds.
     */

    public Long getFinishTimeMillis() {
        return this.finishTimeMillis;
    }

    /**
     * <p>
     * The time the job finished transcoding, in epoch milliseconds.
     * </p>
     * 
     * @param finishTimeMillis
     *        The time the job finished transcoding, in epoch milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Timing withFinishTimeMillis(Long finishTimeMillis) {
        setFinishTimeMillis(finishTimeMillis);
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
        if (getSubmitTimeMillis() != null)
            sb.append("SubmitTimeMillis: ").append(getSubmitTimeMillis()).append(",");
        if (getStartTimeMillis() != null)
            sb.append("StartTimeMillis: ").append(getStartTimeMillis()).append(",");
        if (getFinishTimeMillis() != null)
            sb.append("FinishTimeMillis: ").append(getFinishTimeMillis());
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
        if (other.getSubmitTimeMillis() == null ^ this.getSubmitTimeMillis() == null)
            return false;
        if (other.getSubmitTimeMillis() != null && other.getSubmitTimeMillis().equals(this.getSubmitTimeMillis()) == false)
            return false;
        if (other.getStartTimeMillis() == null ^ this.getStartTimeMillis() == null)
            return false;
        if (other.getStartTimeMillis() != null && other.getStartTimeMillis().equals(this.getStartTimeMillis()) == false)
            return false;
        if (other.getFinishTimeMillis() == null ^ this.getFinishTimeMillis() == null)
            return false;
        if (other.getFinishTimeMillis() != null && other.getFinishTimeMillis().equals(this.getFinishTimeMillis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubmitTimeMillis() == null) ? 0 : getSubmitTimeMillis().hashCode());
        hashCode = prime * hashCode + ((getStartTimeMillis() == null) ? 0 : getStartTimeMillis().hashCode());
        hashCode = prime * hashCode + ((getFinishTimeMillis() == null) ? 0 : getFinishTimeMillis().hashCode());
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
        com.amazonaws.services.elastictranscoder.model.transform.TimingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
