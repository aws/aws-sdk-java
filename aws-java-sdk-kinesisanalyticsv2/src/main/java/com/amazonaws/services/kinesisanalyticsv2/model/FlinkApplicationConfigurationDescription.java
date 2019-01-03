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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes configuration parameters for a Java-based Amazon Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/FlinkApplicationConfigurationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlinkApplicationConfigurationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application
     * state for fault tolerance.
     * </p>
     */
    private CheckpointConfigurationDescription checkpointConfigurationDescription;
    /**
     * <p>
     * Describes configuration parameters for Amazon CloudWatch logging for an application.
     * </p>
     */
    private MonitoringConfigurationDescription monitoringConfigurationDescription;
    /**
     * <p>
     * Describes parameters for how an application executes multiple tasks simultaneously.
     * </p>
     */
    private ParallelismConfigurationDescription parallelismConfigurationDescription;
    /**
     * <p>
     * The job plan for an application. For more information about the job plan, see <a
     * href="https://ci.apache.org/projects/flink/flink-docs-stable/internals/job_scheduling.html">Jobs and
     * Scheduling</a> in the <a href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink
     * Documentation</a>. To retrieve the job plan for the application, use the
     * <a>DescribeApplicationRequest$IncludeAdditionalDetails</a> parameter of the <a>DescribeApplication</a> operation.
     * </p>
     */
    private String jobPlanDescription;

    /**
     * <p>
     * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application
     * state for fault tolerance.
     * </p>
     * 
     * @param checkpointConfigurationDescription
     *        Describes an application's checkpointing configuration. Checkpointing is the process of persisting
     *        application state for fault tolerance.
     */

    public void setCheckpointConfigurationDescription(CheckpointConfigurationDescription checkpointConfigurationDescription) {
        this.checkpointConfigurationDescription = checkpointConfigurationDescription;
    }

    /**
     * <p>
     * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application
     * state for fault tolerance.
     * </p>
     * 
     * @return Describes an application's checkpointing configuration. Checkpointing is the process of persisting
     *         application state for fault tolerance.
     */

    public CheckpointConfigurationDescription getCheckpointConfigurationDescription() {
        return this.checkpointConfigurationDescription;
    }

    /**
     * <p>
     * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application
     * state for fault tolerance.
     * </p>
     * 
     * @param checkpointConfigurationDescription
     *        Describes an application's checkpointing configuration. Checkpointing is the process of persisting
     *        application state for fault tolerance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlinkApplicationConfigurationDescription withCheckpointConfigurationDescription(CheckpointConfigurationDescription checkpointConfigurationDescription) {
        setCheckpointConfigurationDescription(checkpointConfigurationDescription);
        return this;
    }

    /**
     * <p>
     * Describes configuration parameters for Amazon CloudWatch logging for an application.
     * </p>
     * 
     * @param monitoringConfigurationDescription
     *        Describes configuration parameters for Amazon CloudWatch logging for an application.
     */

    public void setMonitoringConfigurationDescription(MonitoringConfigurationDescription monitoringConfigurationDescription) {
        this.monitoringConfigurationDescription = monitoringConfigurationDescription;
    }

    /**
     * <p>
     * Describes configuration parameters for Amazon CloudWatch logging for an application.
     * </p>
     * 
     * @return Describes configuration parameters for Amazon CloudWatch logging for an application.
     */

    public MonitoringConfigurationDescription getMonitoringConfigurationDescription() {
        return this.monitoringConfigurationDescription;
    }

    /**
     * <p>
     * Describes configuration parameters for Amazon CloudWatch logging for an application.
     * </p>
     * 
     * @param monitoringConfigurationDescription
     *        Describes configuration parameters for Amazon CloudWatch logging for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlinkApplicationConfigurationDescription withMonitoringConfigurationDescription(MonitoringConfigurationDescription monitoringConfigurationDescription) {
        setMonitoringConfigurationDescription(monitoringConfigurationDescription);
        return this;
    }

    /**
     * <p>
     * Describes parameters for how an application executes multiple tasks simultaneously.
     * </p>
     * 
     * @param parallelismConfigurationDescription
     *        Describes parameters for how an application executes multiple tasks simultaneously.
     */

    public void setParallelismConfigurationDescription(ParallelismConfigurationDescription parallelismConfigurationDescription) {
        this.parallelismConfigurationDescription = parallelismConfigurationDescription;
    }

    /**
     * <p>
     * Describes parameters for how an application executes multiple tasks simultaneously.
     * </p>
     * 
     * @return Describes parameters for how an application executes multiple tasks simultaneously.
     */

    public ParallelismConfigurationDescription getParallelismConfigurationDescription() {
        return this.parallelismConfigurationDescription;
    }

    /**
     * <p>
     * Describes parameters for how an application executes multiple tasks simultaneously.
     * </p>
     * 
     * @param parallelismConfigurationDescription
     *        Describes parameters for how an application executes multiple tasks simultaneously.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlinkApplicationConfigurationDescription withParallelismConfigurationDescription(
            ParallelismConfigurationDescription parallelismConfigurationDescription) {
        setParallelismConfigurationDescription(parallelismConfigurationDescription);
        return this;
    }

    /**
     * <p>
     * The job plan for an application. For more information about the job plan, see <a
     * href="https://ci.apache.org/projects/flink/flink-docs-stable/internals/job_scheduling.html">Jobs and
     * Scheduling</a> in the <a href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink
     * Documentation</a>. To retrieve the job plan for the application, use the
     * <a>DescribeApplicationRequest$IncludeAdditionalDetails</a> parameter of the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @param jobPlanDescription
     *        The job plan for an application. For more information about the job plan, see <a
     *        href="https://ci.apache.org/projects/flink/flink-docs-stable/internals/job_scheduling.html">Jobs and
     *        Scheduling</a> in the <a href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink
     *        Documentation</a>. To retrieve the job plan for the application, use the
     *        <a>DescribeApplicationRequest$IncludeAdditionalDetails</a> parameter of the <a>DescribeApplication</a>
     *        operation.
     */

    public void setJobPlanDescription(String jobPlanDescription) {
        this.jobPlanDescription = jobPlanDescription;
    }

    /**
     * <p>
     * The job plan for an application. For more information about the job plan, see <a
     * href="https://ci.apache.org/projects/flink/flink-docs-stable/internals/job_scheduling.html">Jobs and
     * Scheduling</a> in the <a href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink
     * Documentation</a>. To retrieve the job plan for the application, use the
     * <a>DescribeApplicationRequest$IncludeAdditionalDetails</a> parameter of the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @return The job plan for an application. For more information about the job plan, see <a
     *         href="https://ci.apache.org/projects/flink/flink-docs-stable/internals/job_scheduling.html">Jobs and
     *         Scheduling</a> in the <a href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink
     *         Documentation</a>. To retrieve the job plan for the application, use the
     *         <a>DescribeApplicationRequest$IncludeAdditionalDetails</a> parameter of the <a>DescribeApplication</a>
     *         operation.
     */

    public String getJobPlanDescription() {
        return this.jobPlanDescription;
    }

    /**
     * <p>
     * The job plan for an application. For more information about the job plan, see <a
     * href="https://ci.apache.org/projects/flink/flink-docs-stable/internals/job_scheduling.html">Jobs and
     * Scheduling</a> in the <a href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink
     * Documentation</a>. To retrieve the job plan for the application, use the
     * <a>DescribeApplicationRequest$IncludeAdditionalDetails</a> parameter of the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @param jobPlanDescription
     *        The job plan for an application. For more information about the job plan, see <a
     *        href="https://ci.apache.org/projects/flink/flink-docs-stable/internals/job_scheduling.html">Jobs and
     *        Scheduling</a> in the <a href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink
     *        Documentation</a>. To retrieve the job plan for the application, use the
     *        <a>DescribeApplicationRequest$IncludeAdditionalDetails</a> parameter of the <a>DescribeApplication</a>
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlinkApplicationConfigurationDescription withJobPlanDescription(String jobPlanDescription) {
        setJobPlanDescription(jobPlanDescription);
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
        if (getCheckpointConfigurationDescription() != null)
            sb.append("CheckpointConfigurationDescription: ").append(getCheckpointConfigurationDescription()).append(",");
        if (getMonitoringConfigurationDescription() != null)
            sb.append("MonitoringConfigurationDescription: ").append(getMonitoringConfigurationDescription()).append(",");
        if (getParallelismConfigurationDescription() != null)
            sb.append("ParallelismConfigurationDescription: ").append(getParallelismConfigurationDescription()).append(",");
        if (getJobPlanDescription() != null)
            sb.append("JobPlanDescription: ").append(getJobPlanDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlinkApplicationConfigurationDescription == false)
            return false;
        FlinkApplicationConfigurationDescription other = (FlinkApplicationConfigurationDescription) obj;
        if (other.getCheckpointConfigurationDescription() == null ^ this.getCheckpointConfigurationDescription() == null)
            return false;
        if (other.getCheckpointConfigurationDescription() != null
                && other.getCheckpointConfigurationDescription().equals(this.getCheckpointConfigurationDescription()) == false)
            return false;
        if (other.getMonitoringConfigurationDescription() == null ^ this.getMonitoringConfigurationDescription() == null)
            return false;
        if (other.getMonitoringConfigurationDescription() != null
                && other.getMonitoringConfigurationDescription().equals(this.getMonitoringConfigurationDescription()) == false)
            return false;
        if (other.getParallelismConfigurationDescription() == null ^ this.getParallelismConfigurationDescription() == null)
            return false;
        if (other.getParallelismConfigurationDescription() != null
                && other.getParallelismConfigurationDescription().equals(this.getParallelismConfigurationDescription()) == false)
            return false;
        if (other.getJobPlanDescription() == null ^ this.getJobPlanDescription() == null)
            return false;
        if (other.getJobPlanDescription() != null && other.getJobPlanDescription().equals(this.getJobPlanDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckpointConfigurationDescription() == null) ? 0 : getCheckpointConfigurationDescription().hashCode());
        hashCode = prime * hashCode + ((getMonitoringConfigurationDescription() == null) ? 0 : getMonitoringConfigurationDescription().hashCode());
        hashCode = prime * hashCode + ((getParallelismConfigurationDescription() == null) ? 0 : getParallelismConfigurationDescription().hashCode());
        hashCode = prime * hashCode + ((getJobPlanDescription() == null) ? 0 : getJobPlanDescription().hashCode());
        return hashCode;
    }

    @Override
    public FlinkApplicationConfigurationDescription clone() {
        try {
            return (FlinkApplicationConfigurationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.FlinkApplicationConfigurationDescriptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
