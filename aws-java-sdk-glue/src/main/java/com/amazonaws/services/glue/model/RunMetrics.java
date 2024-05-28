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
 * Metrics for the optimizer run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/RunMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of bytes removed by the compaction job run.
     * </p>
     */
    private String numberOfBytesCompacted;
    /**
     * <p>
     * The number of files removed by the compaction job run.
     * </p>
     */
    private String numberOfFilesCompacted;
    /**
     * <p>
     * The number of DPU hours consumed by the job.
     * </p>
     */
    private String numberOfDpus;
    /**
     * <p>
     * The duration of the job in hours.
     * </p>
     */
    private String jobDurationInHour;

    /**
     * <p>
     * The number of bytes removed by the compaction job run.
     * </p>
     * 
     * @param numberOfBytesCompacted
     *        The number of bytes removed by the compaction job run.
     */

    public void setNumberOfBytesCompacted(String numberOfBytesCompacted) {
        this.numberOfBytesCompacted = numberOfBytesCompacted;
    }

    /**
     * <p>
     * The number of bytes removed by the compaction job run.
     * </p>
     * 
     * @return The number of bytes removed by the compaction job run.
     */

    public String getNumberOfBytesCompacted() {
        return this.numberOfBytesCompacted;
    }

    /**
     * <p>
     * The number of bytes removed by the compaction job run.
     * </p>
     * 
     * @param numberOfBytesCompacted
     *        The number of bytes removed by the compaction job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunMetrics withNumberOfBytesCompacted(String numberOfBytesCompacted) {
        setNumberOfBytesCompacted(numberOfBytesCompacted);
        return this;
    }

    /**
     * <p>
     * The number of files removed by the compaction job run.
     * </p>
     * 
     * @param numberOfFilesCompacted
     *        The number of files removed by the compaction job run.
     */

    public void setNumberOfFilesCompacted(String numberOfFilesCompacted) {
        this.numberOfFilesCompacted = numberOfFilesCompacted;
    }

    /**
     * <p>
     * The number of files removed by the compaction job run.
     * </p>
     * 
     * @return The number of files removed by the compaction job run.
     */

    public String getNumberOfFilesCompacted() {
        return this.numberOfFilesCompacted;
    }

    /**
     * <p>
     * The number of files removed by the compaction job run.
     * </p>
     * 
     * @param numberOfFilesCompacted
     *        The number of files removed by the compaction job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunMetrics withNumberOfFilesCompacted(String numberOfFilesCompacted) {
        setNumberOfFilesCompacted(numberOfFilesCompacted);
        return this;
    }

    /**
     * <p>
     * The number of DPU hours consumed by the job.
     * </p>
     * 
     * @param numberOfDpus
     *        The number of DPU hours consumed by the job.
     */

    public void setNumberOfDpus(String numberOfDpus) {
        this.numberOfDpus = numberOfDpus;
    }

    /**
     * <p>
     * The number of DPU hours consumed by the job.
     * </p>
     * 
     * @return The number of DPU hours consumed by the job.
     */

    public String getNumberOfDpus() {
        return this.numberOfDpus;
    }

    /**
     * <p>
     * The number of DPU hours consumed by the job.
     * </p>
     * 
     * @param numberOfDpus
     *        The number of DPU hours consumed by the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunMetrics withNumberOfDpus(String numberOfDpus) {
        setNumberOfDpus(numberOfDpus);
        return this;
    }

    /**
     * <p>
     * The duration of the job in hours.
     * </p>
     * 
     * @param jobDurationInHour
     *        The duration of the job in hours.
     */

    public void setJobDurationInHour(String jobDurationInHour) {
        this.jobDurationInHour = jobDurationInHour;
    }

    /**
     * <p>
     * The duration of the job in hours.
     * </p>
     * 
     * @return The duration of the job in hours.
     */

    public String getJobDurationInHour() {
        return this.jobDurationInHour;
    }

    /**
     * <p>
     * The duration of the job in hours.
     * </p>
     * 
     * @param jobDurationInHour
     *        The duration of the job in hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunMetrics withJobDurationInHour(String jobDurationInHour) {
        setJobDurationInHour(jobDurationInHour);
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
        if (getNumberOfBytesCompacted() != null)
            sb.append("NumberOfBytesCompacted: ").append(getNumberOfBytesCompacted()).append(",");
        if (getNumberOfFilesCompacted() != null)
            sb.append("NumberOfFilesCompacted: ").append(getNumberOfFilesCompacted()).append(",");
        if (getNumberOfDpus() != null)
            sb.append("NumberOfDpus: ").append(getNumberOfDpus()).append(",");
        if (getJobDurationInHour() != null)
            sb.append("JobDurationInHour: ").append(getJobDurationInHour());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunMetrics == false)
            return false;
        RunMetrics other = (RunMetrics) obj;
        if (other.getNumberOfBytesCompacted() == null ^ this.getNumberOfBytesCompacted() == null)
            return false;
        if (other.getNumberOfBytesCompacted() != null && other.getNumberOfBytesCompacted().equals(this.getNumberOfBytesCompacted()) == false)
            return false;
        if (other.getNumberOfFilesCompacted() == null ^ this.getNumberOfFilesCompacted() == null)
            return false;
        if (other.getNumberOfFilesCompacted() != null && other.getNumberOfFilesCompacted().equals(this.getNumberOfFilesCompacted()) == false)
            return false;
        if (other.getNumberOfDpus() == null ^ this.getNumberOfDpus() == null)
            return false;
        if (other.getNumberOfDpus() != null && other.getNumberOfDpus().equals(this.getNumberOfDpus()) == false)
            return false;
        if (other.getJobDurationInHour() == null ^ this.getJobDurationInHour() == null)
            return false;
        if (other.getJobDurationInHour() != null && other.getJobDurationInHour().equals(this.getJobDurationInHour()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfBytesCompacted() == null) ? 0 : getNumberOfBytesCompacted().hashCode());
        hashCode = prime * hashCode + ((getNumberOfFilesCompacted() == null) ? 0 : getNumberOfFilesCompacted().hashCode());
        hashCode = prime * hashCode + ((getNumberOfDpus() == null) ? 0 : getNumberOfDpus().hashCode());
        hashCode = prime * hashCode + ((getJobDurationInHour() == null) ? 0 : getJobDurationInHour().hashCode());
        return hashCode;
    }

    @Override
    public RunMetrics clone() {
        try {
            return (RunMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.RunMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
