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
 * Describes updates to parameters for how a Java-based Kinesis Data Analytics application executes multiple tasks
 * simultaneously.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ParallelismConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParallelismConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes updates to whether the application uses the default parallelism for the Kinesis Data Analytics service,
     * or if a custom parallelism is used.
     * </p>
     */
    private String configurationTypeUpdate;
    /**
     * <p>
     * Describes updates to the initial number of parallel tasks an application can perform.
     * </p>
     */
    private Integer parallelismUpdate;
    /**
     * <p>
     * Describes updates to the number of parallel tasks an application can perform per Kinesis Processing Unit (KPU)
     * used by the application.
     * </p>
     */
    private Integer parallelismPerKPUUpdate;
    /**
     * <p>
     * Describes updates to whether the Kinesis Data Analytics service can increase the parallelism of the application
     * in response to increased throughput.
     * </p>
     */
    private Boolean autoScalingEnabledUpdate;

    /**
     * <p>
     * Describes updates to whether the application uses the default parallelism for the Kinesis Data Analytics service,
     * or if a custom parallelism is used.
     * </p>
     * 
     * @param configurationTypeUpdate
     *        Describes updates to whether the application uses the default parallelism for the Kinesis Data Analytics
     *        service, or if a custom parallelism is used.
     * @see ConfigurationType
     */

    public void setConfigurationTypeUpdate(String configurationTypeUpdate) {
        this.configurationTypeUpdate = configurationTypeUpdate;
    }

    /**
     * <p>
     * Describes updates to whether the application uses the default parallelism for the Kinesis Data Analytics service,
     * or if a custom parallelism is used.
     * </p>
     * 
     * @return Describes updates to whether the application uses the default parallelism for the Kinesis Data Analytics
     *         service, or if a custom parallelism is used.
     * @see ConfigurationType
     */

    public String getConfigurationTypeUpdate() {
        return this.configurationTypeUpdate;
    }

    /**
     * <p>
     * Describes updates to whether the application uses the default parallelism for the Kinesis Data Analytics service,
     * or if a custom parallelism is used.
     * </p>
     * 
     * @param configurationTypeUpdate
     *        Describes updates to whether the application uses the default parallelism for the Kinesis Data Analytics
     *        service, or if a custom parallelism is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationType
     */

    public ParallelismConfigurationUpdate withConfigurationTypeUpdate(String configurationTypeUpdate) {
        setConfigurationTypeUpdate(configurationTypeUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to whether the application uses the default parallelism for the Kinesis Data Analytics service,
     * or if a custom parallelism is used.
     * </p>
     * 
     * @param configurationTypeUpdate
     *        Describes updates to whether the application uses the default parallelism for the Kinesis Data Analytics
     *        service, or if a custom parallelism is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationType
     */

    public ParallelismConfigurationUpdate withConfigurationTypeUpdate(ConfigurationType configurationTypeUpdate) {
        this.configurationTypeUpdate = configurationTypeUpdate.toString();
        return this;
    }

    /**
     * <p>
     * Describes updates to the initial number of parallel tasks an application can perform.
     * </p>
     * 
     * @param parallelismUpdate
     *        Describes updates to the initial number of parallel tasks an application can perform.
     */

    public void setParallelismUpdate(Integer parallelismUpdate) {
        this.parallelismUpdate = parallelismUpdate;
    }

    /**
     * <p>
     * Describes updates to the initial number of parallel tasks an application can perform.
     * </p>
     * 
     * @return Describes updates to the initial number of parallel tasks an application can perform.
     */

    public Integer getParallelismUpdate() {
        return this.parallelismUpdate;
    }

    /**
     * <p>
     * Describes updates to the initial number of parallel tasks an application can perform.
     * </p>
     * 
     * @param parallelismUpdate
     *        Describes updates to the initial number of parallel tasks an application can perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelismConfigurationUpdate withParallelismUpdate(Integer parallelismUpdate) {
        setParallelismUpdate(parallelismUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to the number of parallel tasks an application can perform per Kinesis Processing Unit (KPU)
     * used by the application.
     * </p>
     * 
     * @param parallelismPerKPUUpdate
     *        Describes updates to the number of parallel tasks an application can perform per Kinesis Processing Unit
     *        (KPU) used by the application.
     */

    public void setParallelismPerKPUUpdate(Integer parallelismPerKPUUpdate) {
        this.parallelismPerKPUUpdate = parallelismPerKPUUpdate;
    }

    /**
     * <p>
     * Describes updates to the number of parallel tasks an application can perform per Kinesis Processing Unit (KPU)
     * used by the application.
     * </p>
     * 
     * @return Describes updates to the number of parallel tasks an application can perform per Kinesis Processing Unit
     *         (KPU) used by the application.
     */

    public Integer getParallelismPerKPUUpdate() {
        return this.parallelismPerKPUUpdate;
    }

    /**
     * <p>
     * Describes updates to the number of parallel tasks an application can perform per Kinesis Processing Unit (KPU)
     * used by the application.
     * </p>
     * 
     * @param parallelismPerKPUUpdate
     *        Describes updates to the number of parallel tasks an application can perform per Kinesis Processing Unit
     *        (KPU) used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelismConfigurationUpdate withParallelismPerKPUUpdate(Integer parallelismPerKPUUpdate) {
        setParallelismPerKPUUpdate(parallelismPerKPUUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to whether the Kinesis Data Analytics service can increase the parallelism of the application
     * in response to increased throughput.
     * </p>
     * 
     * @param autoScalingEnabledUpdate
     *        Describes updates to whether the Kinesis Data Analytics service can increase the parallelism of the
     *        application in response to increased throughput.
     */

    public void setAutoScalingEnabledUpdate(Boolean autoScalingEnabledUpdate) {
        this.autoScalingEnabledUpdate = autoScalingEnabledUpdate;
    }

    /**
     * <p>
     * Describes updates to whether the Kinesis Data Analytics service can increase the parallelism of the application
     * in response to increased throughput.
     * </p>
     * 
     * @return Describes updates to whether the Kinesis Data Analytics service can increase the parallelism of the
     *         application in response to increased throughput.
     */

    public Boolean getAutoScalingEnabledUpdate() {
        return this.autoScalingEnabledUpdate;
    }

    /**
     * <p>
     * Describes updates to whether the Kinesis Data Analytics service can increase the parallelism of the application
     * in response to increased throughput.
     * </p>
     * 
     * @param autoScalingEnabledUpdate
     *        Describes updates to whether the Kinesis Data Analytics service can increase the parallelism of the
     *        application in response to increased throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelismConfigurationUpdate withAutoScalingEnabledUpdate(Boolean autoScalingEnabledUpdate) {
        setAutoScalingEnabledUpdate(autoScalingEnabledUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to whether the Kinesis Data Analytics service can increase the parallelism of the application
     * in response to increased throughput.
     * </p>
     * 
     * @return Describes updates to whether the Kinesis Data Analytics service can increase the parallelism of the
     *         application in response to increased throughput.
     */

    public Boolean isAutoScalingEnabledUpdate() {
        return this.autoScalingEnabledUpdate;
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
        if (getParallelismUpdate() != null)
            sb.append("ParallelismUpdate: ").append(getParallelismUpdate()).append(",");
        if (getParallelismPerKPUUpdate() != null)
            sb.append("ParallelismPerKPUUpdate: ").append(getParallelismPerKPUUpdate()).append(",");
        if (getAutoScalingEnabledUpdate() != null)
            sb.append("AutoScalingEnabledUpdate: ").append(getAutoScalingEnabledUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParallelismConfigurationUpdate == false)
            return false;
        ParallelismConfigurationUpdate other = (ParallelismConfigurationUpdate) obj;
        if (other.getConfigurationTypeUpdate() == null ^ this.getConfigurationTypeUpdate() == null)
            return false;
        if (other.getConfigurationTypeUpdate() != null && other.getConfigurationTypeUpdate().equals(this.getConfigurationTypeUpdate()) == false)
            return false;
        if (other.getParallelismUpdate() == null ^ this.getParallelismUpdate() == null)
            return false;
        if (other.getParallelismUpdate() != null && other.getParallelismUpdate().equals(this.getParallelismUpdate()) == false)
            return false;
        if (other.getParallelismPerKPUUpdate() == null ^ this.getParallelismPerKPUUpdate() == null)
            return false;
        if (other.getParallelismPerKPUUpdate() != null && other.getParallelismPerKPUUpdate().equals(this.getParallelismPerKPUUpdate()) == false)
            return false;
        if (other.getAutoScalingEnabledUpdate() == null ^ this.getAutoScalingEnabledUpdate() == null)
            return false;
        if (other.getAutoScalingEnabledUpdate() != null && other.getAutoScalingEnabledUpdate().equals(this.getAutoScalingEnabledUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationTypeUpdate() == null) ? 0 : getConfigurationTypeUpdate().hashCode());
        hashCode = prime * hashCode + ((getParallelismUpdate() == null) ? 0 : getParallelismUpdate().hashCode());
        hashCode = prime * hashCode + ((getParallelismPerKPUUpdate() == null) ? 0 : getParallelismPerKPUUpdate().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingEnabledUpdate() == null) ? 0 : getAutoScalingEnabledUpdate().hashCode());
        return hashCode;
    }

    @Override
    public ParallelismConfigurationUpdate clone() {
        try {
            return (ParallelismConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ParallelismConfigurationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
