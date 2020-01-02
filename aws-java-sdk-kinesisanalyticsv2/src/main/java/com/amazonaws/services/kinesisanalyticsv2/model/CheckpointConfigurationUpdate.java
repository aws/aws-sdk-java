/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes updates to the checkpointing parameters for a Java-based Amazon Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CheckpointConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckpointConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes updates to whether the application uses the default checkpointing behavior of Kinesis Data Analytics.
     * You must set this property to <code>CUSTOM</code> in order to set the <code>CheckpointingEnabled</code>,
     * <code>CheckpointInterval</code>, or <code>MinPauseBetweenCheckpoints</code> parameters.
     * </p>
     * <note>
     * <p>
     * If this value is set to <code>DEFAULT</code>, the application will use the following values, even if they are set
     * to other values using APIs or application code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CheckpointingEnabled:</b> true
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CheckpointInterval:</b> 60000
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MinPauseBetweenCheckpoints:</b> 5000
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private String configurationTypeUpdate;
    /**
     * <p>
     * Describes updates to whether checkpointing is enabled for an application.
     * </p>
     * <note>
     * <p>
     * If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will use a
     * <code>CheckpointingEnabled</code> value of <code>true</code>, even if this value is set to another value using
     * this API or in application code.
     * </p>
     * </note>
     */
    private Boolean checkpointingEnabledUpdate;
    /**
     * <p>
     * Describes updates to the interval in milliseconds between checkpoint operations.
     * </p>
     * <note>
     * <p>
     * If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will use a
     * <code>CheckpointInterval</code> vaue of 60000, even if this value is set to another value using this API or in
     * application code.
     * </p>
     * </note>
     */
    private Long checkpointIntervalUpdate;
    /**
     * <p>
     * Describes updates to the minimum time in milliseconds after a checkpoint operation completes that a new
     * checkpoint operation can start.
     * </p>
     * <note>
     * <p>
     * If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will use a
     * <code>MinPauseBetweenCheckpoints</code> value of 5000, even if this value is set using this API or in application
     * code.
     * </p>
     * </note>
     */
    private Long minPauseBetweenCheckpointsUpdate;

    /**
     * <p>
     * Describes updates to whether the application uses the default checkpointing behavior of Kinesis Data Analytics.
     * You must set this property to <code>CUSTOM</code> in order to set the <code>CheckpointingEnabled</code>,
     * <code>CheckpointInterval</code>, or <code>MinPauseBetweenCheckpoints</code> parameters.
     * </p>
     * <note>
     * <p>
     * If this value is set to <code>DEFAULT</code>, the application will use the following values, even if they are set
     * to other values using APIs or application code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CheckpointingEnabled:</b> true
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CheckpointInterval:</b> 60000
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MinPauseBetweenCheckpoints:</b> 5000
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param configurationTypeUpdate
     *        Describes updates to whether the application uses the default checkpointing behavior of Kinesis Data
     *        Analytics. You must set this property to <code>CUSTOM</code> in order to set the
     *        <code>CheckpointingEnabled</code>, <code>CheckpointInterval</code>, or
     *        <code>MinPauseBetweenCheckpoints</code> parameters. </p> <note>
     *        <p>
     *        If this value is set to <code>DEFAULT</code>, the application will use the following values, even if they
     *        are set to other values using APIs or application code:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CheckpointingEnabled:</b> true
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CheckpointInterval:</b> 60000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MinPauseBetweenCheckpoints:</b> 5000
     *        </p>
     *        </li>
     *        </ul>
     * @see ConfigurationType
     */

    public void setConfigurationTypeUpdate(String configurationTypeUpdate) {
        this.configurationTypeUpdate = configurationTypeUpdate;
    }

    /**
     * <p>
     * Describes updates to whether the application uses the default checkpointing behavior of Kinesis Data Analytics.
     * You must set this property to <code>CUSTOM</code> in order to set the <code>CheckpointingEnabled</code>,
     * <code>CheckpointInterval</code>, or <code>MinPauseBetweenCheckpoints</code> parameters.
     * </p>
     * <note>
     * <p>
     * If this value is set to <code>DEFAULT</code>, the application will use the following values, even if they are set
     * to other values using APIs or application code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CheckpointingEnabled:</b> true
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CheckpointInterval:</b> 60000
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MinPauseBetweenCheckpoints:</b> 5000
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return Describes updates to whether the application uses the default checkpointing behavior of Kinesis Data
     *         Analytics. You must set this property to <code>CUSTOM</code> in order to set the
     *         <code>CheckpointingEnabled</code>, <code>CheckpointInterval</code>, or
     *         <code>MinPauseBetweenCheckpoints</code> parameters. </p> <note>
     *         <p>
     *         If this value is set to <code>DEFAULT</code>, the application will use the following values, even if they
     *         are set to other values using APIs or application code:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>CheckpointingEnabled:</b> true
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CheckpointInterval:</b> 60000
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MinPauseBetweenCheckpoints:</b> 5000
     *         </p>
     *         </li>
     *         </ul>
     * @see ConfigurationType
     */

    public String getConfigurationTypeUpdate() {
        return this.configurationTypeUpdate;
    }

    /**
     * <p>
     * Describes updates to whether the application uses the default checkpointing behavior of Kinesis Data Analytics.
     * You must set this property to <code>CUSTOM</code> in order to set the <code>CheckpointingEnabled</code>,
     * <code>CheckpointInterval</code>, or <code>MinPauseBetweenCheckpoints</code> parameters.
     * </p>
     * <note>
     * <p>
     * If this value is set to <code>DEFAULT</code>, the application will use the following values, even if they are set
     * to other values using APIs or application code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CheckpointingEnabled:</b> true
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CheckpointInterval:</b> 60000
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MinPauseBetweenCheckpoints:</b> 5000
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param configurationTypeUpdate
     *        Describes updates to whether the application uses the default checkpointing behavior of Kinesis Data
     *        Analytics. You must set this property to <code>CUSTOM</code> in order to set the
     *        <code>CheckpointingEnabled</code>, <code>CheckpointInterval</code>, or
     *        <code>MinPauseBetweenCheckpoints</code> parameters. </p> <note>
     *        <p>
     *        If this value is set to <code>DEFAULT</code>, the application will use the following values, even if they
     *        are set to other values using APIs or application code:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CheckpointingEnabled:</b> true
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CheckpointInterval:</b> 60000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MinPauseBetweenCheckpoints:</b> 5000
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationType
     */

    public CheckpointConfigurationUpdate withConfigurationTypeUpdate(String configurationTypeUpdate) {
        setConfigurationTypeUpdate(configurationTypeUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to whether the application uses the default checkpointing behavior of Kinesis Data Analytics.
     * You must set this property to <code>CUSTOM</code> in order to set the <code>CheckpointingEnabled</code>,
     * <code>CheckpointInterval</code>, or <code>MinPauseBetweenCheckpoints</code> parameters.
     * </p>
     * <note>
     * <p>
     * If this value is set to <code>DEFAULT</code>, the application will use the following values, even if they are set
     * to other values using APIs or application code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>CheckpointingEnabled:</b> true
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CheckpointInterval:</b> 60000
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MinPauseBetweenCheckpoints:</b> 5000
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param configurationTypeUpdate
     *        Describes updates to whether the application uses the default checkpointing behavior of Kinesis Data
     *        Analytics. You must set this property to <code>CUSTOM</code> in order to set the
     *        <code>CheckpointingEnabled</code>, <code>CheckpointInterval</code>, or
     *        <code>MinPauseBetweenCheckpoints</code> parameters. </p> <note>
     *        <p>
     *        If this value is set to <code>DEFAULT</code>, the application will use the following values, even if they
     *        are set to other values using APIs or application code:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>CheckpointingEnabled:</b> true
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CheckpointInterval:</b> 60000
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MinPauseBetweenCheckpoints:</b> 5000
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationType
     */

    public CheckpointConfigurationUpdate withConfigurationTypeUpdate(ConfigurationType configurationTypeUpdate) {
        this.configurationTypeUpdate = configurationTypeUpdate.toString();
        return this;
    }

    /**
     * <p>
     * Describes updates to whether checkpointing is enabled for an application.
     * </p>
     * <note>
     * <p>
     * If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will use a
     * <code>CheckpointingEnabled</code> value of <code>true</code>, even if this value is set to another value using
     * this API or in application code.
     * </p>
     * </note>
     * 
     * @param checkpointingEnabledUpdate
     *        Describes updates to whether checkpointing is enabled for an application.</p> <note>
     *        <p>
     *        If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will
     *        use a <code>CheckpointingEnabled</code> value of <code>true</code>, even if this value is set to another
     *        value using this API or in application code.
     *        </p>
     */

    public void setCheckpointingEnabledUpdate(Boolean checkpointingEnabledUpdate) {
        this.checkpointingEnabledUpdate = checkpointingEnabledUpdate;
    }

    /**
     * <p>
     * Describes updates to whether checkpointing is enabled for an application.
     * </p>
     * <note>
     * <p>
     * If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will use a
     * <code>CheckpointingEnabled</code> value of <code>true</code>, even if this value is set to another value using
     * this API or in application code.
     * </p>
     * </note>
     * 
     * @return Describes updates to whether checkpointing is enabled for an application.</p> <note>
     *         <p>
     *         If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will
     *         use a <code>CheckpointingEnabled</code> value of <code>true</code>, even if this value is set to another
     *         value using this API or in application code.
     *         </p>
     */

    public Boolean getCheckpointingEnabledUpdate() {
        return this.checkpointingEnabledUpdate;
    }

    /**
     * <p>
     * Describes updates to whether checkpointing is enabled for an application.
     * </p>
     * <note>
     * <p>
     * If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will use a
     * <code>CheckpointingEnabled</code> value of <code>true</code>, even if this value is set to another value using
     * this API or in application code.
     * </p>
     * </note>
     * 
     * @param checkpointingEnabledUpdate
     *        Describes updates to whether checkpointing is enabled for an application.</p> <note>
     *        <p>
     *        If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will
     *        use a <code>CheckpointingEnabled</code> value of <code>true</code>, even if this value is set to another
     *        value using this API or in application code.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckpointConfigurationUpdate withCheckpointingEnabledUpdate(Boolean checkpointingEnabledUpdate) {
        setCheckpointingEnabledUpdate(checkpointingEnabledUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to whether checkpointing is enabled for an application.
     * </p>
     * <note>
     * <p>
     * If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will use a
     * <code>CheckpointingEnabled</code> value of <code>true</code>, even if this value is set to another value using
     * this API or in application code.
     * </p>
     * </note>
     * 
     * @return Describes updates to whether checkpointing is enabled for an application.</p> <note>
     *         <p>
     *         If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will
     *         use a <code>CheckpointingEnabled</code> value of <code>true</code>, even if this value is set to another
     *         value using this API or in application code.
     *         </p>
     */

    public Boolean isCheckpointingEnabledUpdate() {
        return this.checkpointingEnabledUpdate;
    }

    /**
     * <p>
     * Describes updates to the interval in milliseconds between checkpoint operations.
     * </p>
     * <note>
     * <p>
     * If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will use a
     * <code>CheckpointInterval</code> vaue of 60000, even if this value is set to another value using this API or in
     * application code.
     * </p>
     * </note>
     * 
     * @param checkpointIntervalUpdate
     *        Describes updates to the interval in milliseconds between checkpoint operations.</p> <note>
     *        <p>
     *        If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will
     *        use a <code>CheckpointInterval</code> vaue of 60000, even if this value is set to another value using this
     *        API or in application code.
     *        </p>
     */

    public void setCheckpointIntervalUpdate(Long checkpointIntervalUpdate) {
        this.checkpointIntervalUpdate = checkpointIntervalUpdate;
    }

    /**
     * <p>
     * Describes updates to the interval in milliseconds between checkpoint operations.
     * </p>
     * <note>
     * <p>
     * If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will use a
     * <code>CheckpointInterval</code> vaue of 60000, even if this value is set to another value using this API or in
     * application code.
     * </p>
     * </note>
     * 
     * @return Describes updates to the interval in milliseconds between checkpoint operations.</p> <note>
     *         <p>
     *         If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will
     *         use a <code>CheckpointInterval</code> vaue of 60000, even if this value is set to another value using
     *         this API or in application code.
     *         </p>
     */

    public Long getCheckpointIntervalUpdate() {
        return this.checkpointIntervalUpdate;
    }

    /**
     * <p>
     * Describes updates to the interval in milliseconds between checkpoint operations.
     * </p>
     * <note>
     * <p>
     * If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will use a
     * <code>CheckpointInterval</code> vaue of 60000, even if this value is set to another value using this API or in
     * application code.
     * </p>
     * </note>
     * 
     * @param checkpointIntervalUpdate
     *        Describes updates to the interval in milliseconds between checkpoint operations.</p> <note>
     *        <p>
     *        If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will
     *        use a <code>CheckpointInterval</code> vaue of 60000, even if this value is set to another value using this
     *        API or in application code.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckpointConfigurationUpdate withCheckpointIntervalUpdate(Long checkpointIntervalUpdate) {
        setCheckpointIntervalUpdate(checkpointIntervalUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to the minimum time in milliseconds after a checkpoint operation completes that a new
     * checkpoint operation can start.
     * </p>
     * <note>
     * <p>
     * If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will use a
     * <code>MinPauseBetweenCheckpoints</code> value of 5000, even if this value is set using this API or in application
     * code.
     * </p>
     * </note>
     * 
     * @param minPauseBetweenCheckpointsUpdate
     *        Describes updates to the minimum time in milliseconds after a checkpoint operation completes that a new
     *        checkpoint operation can start.</p> <note>
     *        <p>
     *        If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will
     *        use a <code>MinPauseBetweenCheckpoints</code> value of 5000, even if this value is set using this API or
     *        in application code.
     *        </p>
     */

    public void setMinPauseBetweenCheckpointsUpdate(Long minPauseBetweenCheckpointsUpdate) {
        this.minPauseBetweenCheckpointsUpdate = minPauseBetweenCheckpointsUpdate;
    }

    /**
     * <p>
     * Describes updates to the minimum time in milliseconds after a checkpoint operation completes that a new
     * checkpoint operation can start.
     * </p>
     * <note>
     * <p>
     * If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will use a
     * <code>MinPauseBetweenCheckpoints</code> value of 5000, even if this value is set using this API or in application
     * code.
     * </p>
     * </note>
     * 
     * @return Describes updates to the minimum time in milliseconds after a checkpoint operation completes that a new
     *         checkpoint operation can start.</p> <note>
     *         <p>
     *         If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will
     *         use a <code>MinPauseBetweenCheckpoints</code> value of 5000, even if this value is set using this API or
     *         in application code.
     *         </p>
     */

    public Long getMinPauseBetweenCheckpointsUpdate() {
        return this.minPauseBetweenCheckpointsUpdate;
    }

    /**
     * <p>
     * Describes updates to the minimum time in milliseconds after a checkpoint operation completes that a new
     * checkpoint operation can start.
     * </p>
     * <note>
     * <p>
     * If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will use a
     * <code>MinPauseBetweenCheckpoints</code> value of 5000, even if this value is set using this API or in application
     * code.
     * </p>
     * </note>
     * 
     * @param minPauseBetweenCheckpointsUpdate
     *        Describes updates to the minimum time in milliseconds after a checkpoint operation completes that a new
     *        checkpoint operation can start.</p> <note>
     *        <p>
     *        If <code>CheckpointConfiguration.ConfigurationType</code> is <code>DEFAULT</code>, the application will
     *        use a <code>MinPauseBetweenCheckpoints</code> value of 5000, even if this value is set using this API or
     *        in application code.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CheckpointConfigurationUpdate withMinPauseBetweenCheckpointsUpdate(Long minPauseBetweenCheckpointsUpdate) {
        setMinPauseBetweenCheckpointsUpdate(minPauseBetweenCheckpointsUpdate);
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
        if (getConfigurationTypeUpdate() != null)
            sb.append("ConfigurationTypeUpdate: ").append(getConfigurationTypeUpdate()).append(",");
        if (getCheckpointingEnabledUpdate() != null)
            sb.append("CheckpointingEnabledUpdate: ").append(getCheckpointingEnabledUpdate()).append(",");
        if (getCheckpointIntervalUpdate() != null)
            sb.append("CheckpointIntervalUpdate: ").append(getCheckpointIntervalUpdate()).append(",");
        if (getMinPauseBetweenCheckpointsUpdate() != null)
            sb.append("MinPauseBetweenCheckpointsUpdate: ").append(getMinPauseBetweenCheckpointsUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckpointConfigurationUpdate == false)
            return false;
        CheckpointConfigurationUpdate other = (CheckpointConfigurationUpdate) obj;
        if (other.getConfigurationTypeUpdate() == null ^ this.getConfigurationTypeUpdate() == null)
            return false;
        if (other.getConfigurationTypeUpdate() != null && other.getConfigurationTypeUpdate().equals(this.getConfigurationTypeUpdate()) == false)
            return false;
        if (other.getCheckpointingEnabledUpdate() == null ^ this.getCheckpointingEnabledUpdate() == null)
            return false;
        if (other.getCheckpointingEnabledUpdate() != null && other.getCheckpointingEnabledUpdate().equals(this.getCheckpointingEnabledUpdate()) == false)
            return false;
        if (other.getCheckpointIntervalUpdate() == null ^ this.getCheckpointIntervalUpdate() == null)
            return false;
        if (other.getCheckpointIntervalUpdate() != null && other.getCheckpointIntervalUpdate().equals(this.getCheckpointIntervalUpdate()) == false)
            return false;
        if (other.getMinPauseBetweenCheckpointsUpdate() == null ^ this.getMinPauseBetweenCheckpointsUpdate() == null)
            return false;
        if (other.getMinPauseBetweenCheckpointsUpdate() != null
                && other.getMinPauseBetweenCheckpointsUpdate().equals(this.getMinPauseBetweenCheckpointsUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationTypeUpdate() == null) ? 0 : getConfigurationTypeUpdate().hashCode());
        hashCode = prime * hashCode + ((getCheckpointingEnabledUpdate() == null) ? 0 : getCheckpointingEnabledUpdate().hashCode());
        hashCode = prime * hashCode + ((getCheckpointIntervalUpdate() == null) ? 0 : getCheckpointIntervalUpdate().hashCode());
        hashCode = prime * hashCode + ((getMinPauseBetweenCheckpointsUpdate() == null) ? 0 : getMinPauseBetweenCheckpointsUpdate().hashCode());
        return hashCode;
    }

    @Override
    public CheckpointConfigurationUpdate clone() {
        try {
            return (CheckpointConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.CheckpointConfigurationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
