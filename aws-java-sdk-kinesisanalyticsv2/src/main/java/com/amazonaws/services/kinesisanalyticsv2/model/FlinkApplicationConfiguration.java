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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/FlinkApplicationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlinkApplicationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application
     * state for fault tolerance. For more information, see <a href=
     * "https://ci.apache.org/projects/flink/flink-docs-release-1.6/concepts/programming-model.html#checkpoints-for-fault-tolerance"
     * > Checkpoints for Fault Tolerance</a> in the <a
     * href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink Documentation</a>.
     * </p>
     */
    private CheckpointConfiguration checkpointConfiguration;
    /**
     * <p>
     * Describes configuration parameters for Amazon CloudWatch logging for an application.
     * </p>
     */
    private MonitoringConfiguration monitoringConfiguration;
    /**
     * <p>
     * Describes parameters for how an application executes multiple tasks simultaneously.
     * </p>
     */
    private ParallelismConfiguration parallelismConfiguration;

    /**
     * <p>
     * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application
     * state for fault tolerance. For more information, see <a href=
     * "https://ci.apache.org/projects/flink/flink-docs-release-1.6/concepts/programming-model.html#checkpoints-for-fault-tolerance"
     * > Checkpoints for Fault Tolerance</a> in the <a
     * href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink Documentation</a>.
     * </p>
     * 
     * @param checkpointConfiguration
     *        Describes an application's checkpointing configuration. Checkpointing is the process of persisting
     *        application state for fault tolerance. For more information, see <a href=
     *        "https://ci.apache.org/projects/flink/flink-docs-release-1.6/concepts/programming-model.html#checkpoints-for-fault-tolerance"
     *        > Checkpoints for Fault Tolerance</a> in the <a
     *        href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink Documentation</a>.
     */

    public void setCheckpointConfiguration(CheckpointConfiguration checkpointConfiguration) {
        this.checkpointConfiguration = checkpointConfiguration;
    }

    /**
     * <p>
     * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application
     * state for fault tolerance. For more information, see <a href=
     * "https://ci.apache.org/projects/flink/flink-docs-release-1.6/concepts/programming-model.html#checkpoints-for-fault-tolerance"
     * > Checkpoints for Fault Tolerance</a> in the <a
     * href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink Documentation</a>.
     * </p>
     * 
     * @return Describes an application's checkpointing configuration. Checkpointing is the process of persisting
     *         application state for fault tolerance. For more information, see <a href=
     *         "https://ci.apache.org/projects/flink/flink-docs-release-1.6/concepts/programming-model.html#checkpoints-for-fault-tolerance"
     *         > Checkpoints for Fault Tolerance</a> in the <a
     *         href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink Documentation</a>.
     */

    public CheckpointConfiguration getCheckpointConfiguration() {
        return this.checkpointConfiguration;
    }

    /**
     * <p>
     * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application
     * state for fault tolerance. For more information, see <a href=
     * "https://ci.apache.org/projects/flink/flink-docs-release-1.6/concepts/programming-model.html#checkpoints-for-fault-tolerance"
     * > Checkpoints for Fault Tolerance</a> in the <a
     * href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink Documentation</a>.
     * </p>
     * 
     * @param checkpointConfiguration
     *        Describes an application's checkpointing configuration. Checkpointing is the process of persisting
     *        application state for fault tolerance. For more information, see <a href=
     *        "https://ci.apache.org/projects/flink/flink-docs-release-1.6/concepts/programming-model.html#checkpoints-for-fault-tolerance"
     *        > Checkpoints for Fault Tolerance</a> in the <a
     *        href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink Documentation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlinkApplicationConfiguration withCheckpointConfiguration(CheckpointConfiguration checkpointConfiguration) {
        setCheckpointConfiguration(checkpointConfiguration);
        return this;
    }

    /**
     * <p>
     * Describes configuration parameters for Amazon CloudWatch logging for an application.
     * </p>
     * 
     * @param monitoringConfiguration
     *        Describes configuration parameters for Amazon CloudWatch logging for an application.
     */

    public void setMonitoringConfiguration(MonitoringConfiguration monitoringConfiguration) {
        this.monitoringConfiguration = monitoringConfiguration;
    }

    /**
     * <p>
     * Describes configuration parameters for Amazon CloudWatch logging for an application.
     * </p>
     * 
     * @return Describes configuration parameters for Amazon CloudWatch logging for an application.
     */

    public MonitoringConfiguration getMonitoringConfiguration() {
        return this.monitoringConfiguration;
    }

    /**
     * <p>
     * Describes configuration parameters for Amazon CloudWatch logging for an application.
     * </p>
     * 
     * @param monitoringConfiguration
     *        Describes configuration parameters for Amazon CloudWatch logging for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlinkApplicationConfiguration withMonitoringConfiguration(MonitoringConfiguration monitoringConfiguration) {
        setMonitoringConfiguration(monitoringConfiguration);
        return this;
    }

    /**
     * <p>
     * Describes parameters for how an application executes multiple tasks simultaneously.
     * </p>
     * 
     * @param parallelismConfiguration
     *        Describes parameters for how an application executes multiple tasks simultaneously.
     */

    public void setParallelismConfiguration(ParallelismConfiguration parallelismConfiguration) {
        this.parallelismConfiguration = parallelismConfiguration;
    }

    /**
     * <p>
     * Describes parameters for how an application executes multiple tasks simultaneously.
     * </p>
     * 
     * @return Describes parameters for how an application executes multiple tasks simultaneously.
     */

    public ParallelismConfiguration getParallelismConfiguration() {
        return this.parallelismConfiguration;
    }

    /**
     * <p>
     * Describes parameters for how an application executes multiple tasks simultaneously.
     * </p>
     * 
     * @param parallelismConfiguration
     *        Describes parameters for how an application executes multiple tasks simultaneously.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlinkApplicationConfiguration withParallelismConfiguration(ParallelismConfiguration parallelismConfiguration) {
        setParallelismConfiguration(parallelismConfiguration);
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
        if (getCheckpointConfiguration() != null)
            sb.append("CheckpointConfiguration: ").append(getCheckpointConfiguration()).append(",");
        if (getMonitoringConfiguration() != null)
            sb.append("MonitoringConfiguration: ").append(getMonitoringConfiguration()).append(",");
        if (getParallelismConfiguration() != null)
            sb.append("ParallelismConfiguration: ").append(getParallelismConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlinkApplicationConfiguration == false)
            return false;
        FlinkApplicationConfiguration other = (FlinkApplicationConfiguration) obj;
        if (other.getCheckpointConfiguration() == null ^ this.getCheckpointConfiguration() == null)
            return false;
        if (other.getCheckpointConfiguration() != null && other.getCheckpointConfiguration().equals(this.getCheckpointConfiguration()) == false)
            return false;
        if (other.getMonitoringConfiguration() == null ^ this.getMonitoringConfiguration() == null)
            return false;
        if (other.getMonitoringConfiguration() != null && other.getMonitoringConfiguration().equals(this.getMonitoringConfiguration()) == false)
            return false;
        if (other.getParallelismConfiguration() == null ^ this.getParallelismConfiguration() == null)
            return false;
        if (other.getParallelismConfiguration() != null && other.getParallelismConfiguration().equals(this.getParallelismConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckpointConfiguration() == null) ? 0 : getCheckpointConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMonitoringConfiguration() == null) ? 0 : getMonitoringConfiguration().hashCode());
        hashCode = prime * hashCode + ((getParallelismConfiguration() == null) ? 0 : getParallelismConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public FlinkApplicationConfiguration clone() {
        try {
            return (FlinkApplicationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.FlinkApplicationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
