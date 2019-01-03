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
 * Describes checkpointing parameters for a Java-based Amazon Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CheckpointConfigurationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckpointConfigurationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes whether the application uses the default checkpointing behavior in Kinesis Data Analytics.
     * </p>
     */
    private String configurationType;
    /**
     * <p>
     * Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     */
    private Boolean checkpointingEnabled;
    /**
     * <p>
     * Describes the interval in milliseconds between checkpoint operations.
     * </p>
     */
    private Long checkpointInterval;
    /**
     * <p>
     * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation
     * can start.
     * </p>
     */
    private Long minPauseBetweenCheckpoints;

    /**
     * <p>
     * Describes whether the application uses the default checkpointing behavior in Kinesis Data Analytics.
     * </p>
     * 
     * @param configurationType
     *        Describes whether the application uses the default checkpointing behavior in Kinesis Data Analytics.
     * @see ConfigurationType
     */

    public void setConfigurationType(String configurationType) {
        this.configurationType = configurationType;
    }

    /**
     * <p>
     * Describes whether the application uses the default checkpointing behavior in Kinesis Data Analytics.
     * </p>
     * 
     * @return Describes whether the application uses the default checkpointing behavior in Kinesis Data Analytics.
     * @see ConfigurationType
     */

    public String getConfigurationType() {
        return this.configurationType;
    }

    /**
     * <p>
     * Describes whether the application uses the default checkpointing behavior in Kinesis Data Analytics.
     * </p>
     * 
     * @param configurationType
     *        Describes whether the application uses the default checkpointing behavior in Kinesis Data Analytics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationType
     */

    public CheckpointConfigurationDescription withConfigurationType(String configurationType) {
        setConfigurationType(configurationType);
        return this;
    }

    /**
     * <p>
     * Describes whether the application uses the default checkpointing behavior in Kinesis Data Analytics.
     * </p>
     * 
     * @param configurationType
     *        Describes whether the application uses the default checkpointing behavior in Kinesis Data Analytics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationType
     */

    public CheckpointConfigurationDescription withConfigurationType(ConfigurationType configurationType) {
        this.configurationType = configurationType.toString();
        return this;
    }

    /**
     * <p>
     * Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param checkpointingEnabled
     *        Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.
     */

    public void setCheckpointingEnabled(Boolean checkpointingEnabled) {
        this.checkpointingEnabled = checkpointingEnabled;
    }

    /**
     * <p>
     * Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @return Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.
     */

    public Boolean getCheckpointingEnabled() {
        return this.checkpointingEnabled;
    }

    /**
     * <p>
     * Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @param checkpointingEnabled
     *        Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckpointConfigurationDescription withCheckpointingEnabled(Boolean checkpointingEnabled) {
        setCheckpointingEnabled(checkpointingEnabled);
        return this;
    }

    /**
     * <p>
     * Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.
     * </p>
     * 
     * @return Describes whether checkpointing is enabled for a Java-based Kinesis Data Analytics application.
     */

    public Boolean isCheckpointingEnabled() {
        return this.checkpointingEnabled;
    }

    /**
     * <p>
     * Describes the interval in milliseconds between checkpoint operations.
     * </p>
     * 
     * @param checkpointInterval
     *        Describes the interval in milliseconds between checkpoint operations.
     */

    public void setCheckpointInterval(Long checkpointInterval) {
        this.checkpointInterval = checkpointInterval;
    }

    /**
     * <p>
     * Describes the interval in milliseconds between checkpoint operations.
     * </p>
     * 
     * @return Describes the interval in milliseconds between checkpoint operations.
     */

    public Long getCheckpointInterval() {
        return this.checkpointInterval;
    }

    /**
     * <p>
     * Describes the interval in milliseconds between checkpoint operations.
     * </p>
     * 
     * @param checkpointInterval
     *        Describes the interval in milliseconds between checkpoint operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckpointConfigurationDescription withCheckpointInterval(Long checkpointInterval) {
        setCheckpointInterval(checkpointInterval);
        return this;
    }

    /**
     * <p>
     * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation
     * can start.
     * </p>
     * 
     * @param minPauseBetweenCheckpoints
     *        Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint
     *        operation can start.
     */

    public void setMinPauseBetweenCheckpoints(Long minPauseBetweenCheckpoints) {
        this.minPauseBetweenCheckpoints = minPauseBetweenCheckpoints;
    }

    /**
     * <p>
     * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation
     * can start.
     * </p>
     * 
     * @return Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint
     *         operation can start.
     */

    public Long getMinPauseBetweenCheckpoints() {
        return this.minPauseBetweenCheckpoints;
    }

    /**
     * <p>
     * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation
     * can start.
     * </p>
     * 
     * @param minPauseBetweenCheckpoints
     *        Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint
     *        operation can start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckpointConfigurationDescription withMinPauseBetweenCheckpoints(Long minPauseBetweenCheckpoints) {
        setMinPauseBetweenCheckpoints(minPauseBetweenCheckpoints);
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
        if (getConfigurationType() != null)
            sb.append("ConfigurationType: ").append(getConfigurationType()).append(",");
        if (getCheckpointingEnabled() != null)
            sb.append("CheckpointingEnabled: ").append(getCheckpointingEnabled()).append(",");
        if (getCheckpointInterval() != null)
            sb.append("CheckpointInterval: ").append(getCheckpointInterval()).append(",");
        if (getMinPauseBetweenCheckpoints() != null)
            sb.append("MinPauseBetweenCheckpoints: ").append(getMinPauseBetweenCheckpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckpointConfigurationDescription == false)
            return false;
        CheckpointConfigurationDescription other = (CheckpointConfigurationDescription) obj;
        if (other.getConfigurationType() == null ^ this.getConfigurationType() == null)
            return false;
        if (other.getConfigurationType() != null && other.getConfigurationType().equals(this.getConfigurationType()) == false)
            return false;
        if (other.getCheckpointingEnabled() == null ^ this.getCheckpointingEnabled() == null)
            return false;
        if (other.getCheckpointingEnabled() != null && other.getCheckpointingEnabled().equals(this.getCheckpointingEnabled()) == false)
            return false;
        if (other.getCheckpointInterval() == null ^ this.getCheckpointInterval() == null)
            return false;
        if (other.getCheckpointInterval() != null && other.getCheckpointInterval().equals(this.getCheckpointInterval()) == false)
            return false;
        if (other.getMinPauseBetweenCheckpoints() == null ^ this.getMinPauseBetweenCheckpoints() == null)
            return false;
        if (other.getMinPauseBetweenCheckpoints() != null && other.getMinPauseBetweenCheckpoints().equals(this.getMinPauseBetweenCheckpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationType() == null) ? 0 : getConfigurationType().hashCode());
        hashCode = prime * hashCode + ((getCheckpointingEnabled() == null) ? 0 : getCheckpointingEnabled().hashCode());
        hashCode = prime * hashCode + ((getCheckpointInterval() == null) ? 0 : getCheckpointInterval().hashCode());
        hashCode = prime * hashCode + ((getMinPauseBetweenCheckpoints() == null) ? 0 : getMinPauseBetweenCheckpoints().hashCode());
        return hashCode;
    }

    @Override
    public CheckpointConfigurationDescription clone() {
        try {
            return (CheckpointConfigurationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.CheckpointConfigurationDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
