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
 * Describes parameters for how a Java-based Amazon Kinesis Data Analytics application executes multiple tasks
 * simultaneously. For more information about parallelism, see <a
 * href="https://ci.apache.org/projects/flink/flink-docs-stable/dev/parallel.html">Parallel Execution</a> in the <a
 * href="https://ci.apache.org/projects/flink/flink-docs-release-1.6/">Apache Flink Documentation</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ParallelismConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParallelismConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service.
     * </p>
     */
    private String configurationType;
    /**
     * <p>
     * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can perform.
     * The Kinesis Data Analytics service can increase this number automatically if
     * <a>ParallelismConfiguration$AutoScalingEnabled</a> is set to <code>true</code>.
     * </p>
     */
    private Integer parallelism;
    /**
     * <p>
     * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform per
     * Kinesis Processing Unit (KPU) used by the application. For more information about KPUs, see <a
     * href="http://aws.amazon.com/kinesis/data-analytics/pricing/">Amazon Kinesis Data Analytics Pricing</a>.
     * </p>
     */
    private Integer parallelismPerKPU;
    /**
     * <p>
     * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response
     * to increased throughput.
     * </p>
     */
    private Boolean autoScalingEnabled;

    /**
     * <p>
     * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service.
     * </p>
     * 
     * @param configurationType
     *        Describes whether the application uses the default parallelism for the Kinesis Data Analytics service.
     * @see ConfigurationType
     */

    public void setConfigurationType(String configurationType) {
        this.configurationType = configurationType;
    }

    /**
     * <p>
     * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service.
     * </p>
     * 
     * @return Describes whether the application uses the default parallelism for the Kinesis Data Analytics service.
     * @see ConfigurationType
     */

    public String getConfigurationType() {
        return this.configurationType;
    }

    /**
     * <p>
     * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service.
     * </p>
     * 
     * @param configurationType
     *        Describes whether the application uses the default parallelism for the Kinesis Data Analytics service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationType
     */

    public ParallelismConfiguration withConfigurationType(String configurationType) {
        setConfigurationType(configurationType);
        return this;
    }

    /**
     * <p>
     * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service.
     * </p>
     * 
     * @param configurationType
     *        Describes whether the application uses the default parallelism for the Kinesis Data Analytics service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationType
     */

    public ParallelismConfiguration withConfigurationType(ConfigurationType configurationType) {
        this.configurationType = configurationType.toString();
        return this;
    }

    /**
     * <p>
     * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can perform.
     * The Kinesis Data Analytics service can increase this number automatically if
     * <a>ParallelismConfiguration$AutoScalingEnabled</a> is set to <code>true</code>.
     * </p>
     * 
     * @param parallelism
     *        Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can
     *        perform. The Kinesis Data Analytics service can increase this number automatically if
     *        <a>ParallelismConfiguration$AutoScalingEnabled</a> is set to <code>true</code>.
     */

    public void setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
    }

    /**
     * <p>
     * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can perform.
     * The Kinesis Data Analytics service can increase this number automatically if
     * <a>ParallelismConfiguration$AutoScalingEnabled</a> is set to <code>true</code>.
     * </p>
     * 
     * @return Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can
     *         perform. The Kinesis Data Analytics service can increase this number automatically if
     *         <a>ParallelismConfiguration$AutoScalingEnabled</a> is set to <code>true</code>.
     */

    public Integer getParallelism() {
        return this.parallelism;
    }

    /**
     * <p>
     * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can perform.
     * The Kinesis Data Analytics service can increase this number automatically if
     * <a>ParallelismConfiguration$AutoScalingEnabled</a> is set to <code>true</code>.
     * </p>
     * 
     * @param parallelism
     *        Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can
     *        perform. The Kinesis Data Analytics service can increase this number automatically if
     *        <a>ParallelismConfiguration$AutoScalingEnabled</a> is set to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelismConfiguration withParallelism(Integer parallelism) {
        setParallelism(parallelism);
        return this;
    }

    /**
     * <p>
     * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform per
     * Kinesis Processing Unit (KPU) used by the application. For more information about KPUs, see <a
     * href="http://aws.amazon.com/kinesis/data-analytics/pricing/">Amazon Kinesis Data Analytics Pricing</a>.
     * </p>
     * 
     * @param parallelismPerKPU
     *        Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform
     *        per Kinesis Processing Unit (KPU) used by the application. For more information about KPUs, see <a
     *        href="http://aws.amazon.com/kinesis/data-analytics/pricing/">Amazon Kinesis Data Analytics Pricing</a>.
     */

    public void setParallelismPerKPU(Integer parallelismPerKPU) {
        this.parallelismPerKPU = parallelismPerKPU;
    }

    /**
     * <p>
     * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform per
     * Kinesis Processing Unit (KPU) used by the application. For more information about KPUs, see <a
     * href="http://aws.amazon.com/kinesis/data-analytics/pricing/">Amazon Kinesis Data Analytics Pricing</a>.
     * </p>
     * 
     * @return Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform
     *         per Kinesis Processing Unit (KPU) used by the application. For more information about KPUs, see <a
     *         href="http://aws.amazon.com/kinesis/data-analytics/pricing/">Amazon Kinesis Data Analytics Pricing</a>.
     */

    public Integer getParallelismPerKPU() {
        return this.parallelismPerKPU;
    }

    /**
     * <p>
     * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform per
     * Kinesis Processing Unit (KPU) used by the application. For more information about KPUs, see <a
     * href="http://aws.amazon.com/kinesis/data-analytics/pricing/">Amazon Kinesis Data Analytics Pricing</a>.
     * </p>
     * 
     * @param parallelismPerKPU
     *        Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform
     *        per Kinesis Processing Unit (KPU) used by the application. For more information about KPUs, see <a
     *        href="http://aws.amazon.com/kinesis/data-analytics/pricing/">Amazon Kinesis Data Analytics Pricing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelismConfiguration withParallelismPerKPU(Integer parallelismPerKPU) {
        setParallelismPerKPU(parallelismPerKPU);
        return this;
    }

    /**
     * <p>
     * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response
     * to increased throughput.
     * </p>
     * 
     * @param autoScalingEnabled
     *        Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in
     *        response to increased throughput.
     */

    public void setAutoScalingEnabled(Boolean autoScalingEnabled) {
        this.autoScalingEnabled = autoScalingEnabled;
    }

    /**
     * <p>
     * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response
     * to increased throughput.
     * </p>
     * 
     * @return Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in
     *         response to increased throughput.
     */

    public Boolean getAutoScalingEnabled() {
        return this.autoScalingEnabled;
    }

    /**
     * <p>
     * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response
     * to increased throughput.
     * </p>
     * 
     * @param autoScalingEnabled
     *        Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in
     *        response to increased throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelismConfiguration withAutoScalingEnabled(Boolean autoScalingEnabled) {
        setAutoScalingEnabled(autoScalingEnabled);
        return this;
    }

    /**
     * <p>
     * Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in response
     * to increased throughput.
     * </p>
     * 
     * @return Describes whether the Kinesis Data Analytics service can increase the parallelism of the application in
     *         response to increased throughput.
     */

    public Boolean isAutoScalingEnabled() {
        return this.autoScalingEnabled;
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
        if (getParallelism() != null)
            sb.append("Parallelism: ").append(getParallelism()).append(",");
        if (getParallelismPerKPU() != null)
            sb.append("ParallelismPerKPU: ").append(getParallelismPerKPU()).append(",");
        if (getAutoScalingEnabled() != null)
            sb.append("AutoScalingEnabled: ").append(getAutoScalingEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParallelismConfiguration == false)
            return false;
        ParallelismConfiguration other = (ParallelismConfiguration) obj;
        if (other.getConfigurationType() == null ^ this.getConfigurationType() == null)
            return false;
        if (other.getConfigurationType() != null && other.getConfigurationType().equals(this.getConfigurationType()) == false)
            return false;
        if (other.getParallelism() == null ^ this.getParallelism() == null)
            return false;
        if (other.getParallelism() != null && other.getParallelism().equals(this.getParallelism()) == false)
            return false;
        if (other.getParallelismPerKPU() == null ^ this.getParallelismPerKPU() == null)
            return false;
        if (other.getParallelismPerKPU() != null && other.getParallelismPerKPU().equals(this.getParallelismPerKPU()) == false)
            return false;
        if (other.getAutoScalingEnabled() == null ^ this.getAutoScalingEnabled() == null)
            return false;
        if (other.getAutoScalingEnabled() != null && other.getAutoScalingEnabled().equals(this.getAutoScalingEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationType() == null) ? 0 : getConfigurationType().hashCode());
        hashCode = prime * hashCode + ((getParallelism() == null) ? 0 : getParallelism().hashCode());
        hashCode = prime * hashCode + ((getParallelismPerKPU() == null) ? 0 : getParallelismPerKPU().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingEnabled() == null) ? 0 : getAutoScalingEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ParallelismConfiguration clone() {
        try {
            return (ParallelismConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ParallelismConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
