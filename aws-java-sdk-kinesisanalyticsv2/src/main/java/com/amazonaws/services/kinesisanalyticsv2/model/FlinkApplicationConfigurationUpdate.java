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
 * Describes updates to the configuration parameters for a Java-based Amazon Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/FlinkApplicationConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlinkApplicationConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes updates to an application's checkpointing configuration. Checkpointing is the process of persisting
     * application state for fault tolerance.
     * </p>
     */
    private CheckpointConfigurationUpdate checkpointConfigurationUpdate;
    /**
     * <p>
     * Describes updates to the configuration parameters for Amazon CloudWatch logging for an application.
     * </p>
     */
    private MonitoringConfigurationUpdate monitoringConfigurationUpdate;
    /**
     * <p>
     * Describes updates to the parameters for how an application executes multiple tasks simultaneously.
     * </p>
     */
    private ParallelismConfigurationUpdate parallelismConfigurationUpdate;

    /**
     * <p>
     * Describes updates to an application's checkpointing configuration. Checkpointing is the process of persisting
     * application state for fault tolerance.
     * </p>
     * 
     * @param checkpointConfigurationUpdate
     *        Describes updates to an application's checkpointing configuration. Checkpointing is the process of
     *        persisting application state for fault tolerance.
     */

    public void setCheckpointConfigurationUpdate(CheckpointConfigurationUpdate checkpointConfigurationUpdate) {
        this.checkpointConfigurationUpdate = checkpointConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to an application's checkpointing configuration. Checkpointing is the process of persisting
     * application state for fault tolerance.
     * </p>
     * 
     * @return Describes updates to an application's checkpointing configuration. Checkpointing is the process of
     *         persisting application state for fault tolerance.
     */

    public CheckpointConfigurationUpdate getCheckpointConfigurationUpdate() {
        return this.checkpointConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to an application's checkpointing configuration. Checkpointing is the process of persisting
     * application state for fault tolerance.
     * </p>
     * 
     * @param checkpointConfigurationUpdate
     *        Describes updates to an application's checkpointing configuration. Checkpointing is the process of
     *        persisting application state for fault tolerance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlinkApplicationConfigurationUpdate withCheckpointConfigurationUpdate(CheckpointConfigurationUpdate checkpointConfigurationUpdate) {
        setCheckpointConfigurationUpdate(checkpointConfigurationUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to the configuration parameters for Amazon CloudWatch logging for an application.
     * </p>
     * 
     * @param monitoringConfigurationUpdate
     *        Describes updates to the configuration parameters for Amazon CloudWatch logging for an application.
     */

    public void setMonitoringConfigurationUpdate(MonitoringConfigurationUpdate monitoringConfigurationUpdate) {
        this.monitoringConfigurationUpdate = monitoringConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to the configuration parameters for Amazon CloudWatch logging for an application.
     * </p>
     * 
     * @return Describes updates to the configuration parameters for Amazon CloudWatch logging for an application.
     */

    public MonitoringConfigurationUpdate getMonitoringConfigurationUpdate() {
        return this.monitoringConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to the configuration parameters for Amazon CloudWatch logging for an application.
     * </p>
     * 
     * @param monitoringConfigurationUpdate
     *        Describes updates to the configuration parameters for Amazon CloudWatch logging for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlinkApplicationConfigurationUpdate withMonitoringConfigurationUpdate(MonitoringConfigurationUpdate monitoringConfigurationUpdate) {
        setMonitoringConfigurationUpdate(monitoringConfigurationUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to the parameters for how an application executes multiple tasks simultaneously.
     * </p>
     * 
     * @param parallelismConfigurationUpdate
     *        Describes updates to the parameters for how an application executes multiple tasks simultaneously.
     */

    public void setParallelismConfigurationUpdate(ParallelismConfigurationUpdate parallelismConfigurationUpdate) {
        this.parallelismConfigurationUpdate = parallelismConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to the parameters for how an application executes multiple tasks simultaneously.
     * </p>
     * 
     * @return Describes updates to the parameters for how an application executes multiple tasks simultaneously.
     */

    public ParallelismConfigurationUpdate getParallelismConfigurationUpdate() {
        return this.parallelismConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to the parameters for how an application executes multiple tasks simultaneously.
     * </p>
     * 
     * @param parallelismConfigurationUpdate
     *        Describes updates to the parameters for how an application executes multiple tasks simultaneously.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlinkApplicationConfigurationUpdate withParallelismConfigurationUpdate(ParallelismConfigurationUpdate parallelismConfigurationUpdate) {
        setParallelismConfigurationUpdate(parallelismConfigurationUpdate);
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
        if (getCheckpointConfigurationUpdate() != null)
            sb.append("CheckpointConfigurationUpdate: ").append(getCheckpointConfigurationUpdate()).append(",");
        if (getMonitoringConfigurationUpdate() != null)
            sb.append("MonitoringConfigurationUpdate: ").append(getMonitoringConfigurationUpdate()).append(",");
        if (getParallelismConfigurationUpdate() != null)
            sb.append("ParallelismConfigurationUpdate: ").append(getParallelismConfigurationUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlinkApplicationConfigurationUpdate == false)
            return false;
        FlinkApplicationConfigurationUpdate other = (FlinkApplicationConfigurationUpdate) obj;
        if (other.getCheckpointConfigurationUpdate() == null ^ this.getCheckpointConfigurationUpdate() == null)
            return false;
        if (other.getCheckpointConfigurationUpdate() != null
                && other.getCheckpointConfigurationUpdate().equals(this.getCheckpointConfigurationUpdate()) == false)
            return false;
        if (other.getMonitoringConfigurationUpdate() == null ^ this.getMonitoringConfigurationUpdate() == null)
            return false;
        if (other.getMonitoringConfigurationUpdate() != null
                && other.getMonitoringConfigurationUpdate().equals(this.getMonitoringConfigurationUpdate()) == false)
            return false;
        if (other.getParallelismConfigurationUpdate() == null ^ this.getParallelismConfigurationUpdate() == null)
            return false;
        if (other.getParallelismConfigurationUpdate() != null
                && other.getParallelismConfigurationUpdate().equals(this.getParallelismConfigurationUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckpointConfigurationUpdate() == null) ? 0 : getCheckpointConfigurationUpdate().hashCode());
        hashCode = prime * hashCode + ((getMonitoringConfigurationUpdate() == null) ? 0 : getMonitoringConfigurationUpdate().hashCode());
        hashCode = prime * hashCode + ((getParallelismConfigurationUpdate() == null) ? 0 : getParallelismConfigurationUpdate().hashCode());
        return hashCode;
    }

    @Override
    public FlinkApplicationConfigurationUpdate clone() {
        try {
            return (FlinkApplicationConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.FlinkApplicationConfigurationUpdateMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
