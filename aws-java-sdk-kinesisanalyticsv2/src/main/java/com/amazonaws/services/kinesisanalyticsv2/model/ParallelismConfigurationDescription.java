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
 * Describes parameters for how a Java-based Kinesis Data Analytics application executes multiple tasks simultaneously.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ParallelismConfigurationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParallelismConfigurationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes whether the application uses the default parallelism for the Kinesis Data Analytics service.
     * </p>
     */
    private String configurationType;
    /**
     * <p>
     * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can perform.
     * </p>
     */
    private Integer parallelism;
    /**
     * <p>
     * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform per
     * Kinesis Processing Unit (KPU) used by the application.
     * </p>
     */
    private Integer parallelismPerKPU;
    /**
     * <p>
     * Describes the current number of parallel tasks that a Java-based Kinesis Data Analytics application can perform.
     * </p>
     */
    private Integer currentParallelism;
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

    public ParallelismConfigurationDescription withConfigurationType(String configurationType) {
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

    public ParallelismConfigurationDescription withConfigurationType(ConfigurationType configurationType) {
        this.configurationType = configurationType.toString();
        return this;
    }

    /**
     * <p>
     * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can perform.
     * </p>
     * 
     * @param parallelism
     *        Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can
     *        perform.
     */

    public void setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
    }

    /**
     * <p>
     * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can perform.
     * </p>
     * 
     * @return Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can
     *         perform.
     */

    public Integer getParallelism() {
        return this.parallelism;
    }

    /**
     * <p>
     * Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can perform.
     * </p>
     * 
     * @param parallelism
     *        Describes the initial number of parallel tasks that a Java-based Kinesis Data Analytics application can
     *        perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelismConfigurationDescription withParallelism(Integer parallelism) {
        setParallelism(parallelism);
        return this;
    }

    /**
     * <p>
     * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform per
     * Kinesis Processing Unit (KPU) used by the application.
     * </p>
     * 
     * @param parallelismPerKPU
     *        Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform
     *        per Kinesis Processing Unit (KPU) used by the application.
     */

    public void setParallelismPerKPU(Integer parallelismPerKPU) {
        this.parallelismPerKPU = parallelismPerKPU;
    }

    /**
     * <p>
     * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform per
     * Kinesis Processing Unit (KPU) used by the application.
     * </p>
     * 
     * @return Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform
     *         per Kinesis Processing Unit (KPU) used by the application.
     */

    public Integer getParallelismPerKPU() {
        return this.parallelismPerKPU;
    }

    /**
     * <p>
     * Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform per
     * Kinesis Processing Unit (KPU) used by the application.
     * </p>
     * 
     * @param parallelismPerKPU
     *        Describes the number of parallel tasks that a Java-based Kinesis Data Analytics application can perform
     *        per Kinesis Processing Unit (KPU) used by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelismConfigurationDescription withParallelismPerKPU(Integer parallelismPerKPU) {
        setParallelismPerKPU(parallelismPerKPU);
        return this;
    }

    /**
     * <p>
     * Describes the current number of parallel tasks that a Java-based Kinesis Data Analytics application can perform.
     * </p>
     * 
     * @param currentParallelism
     *        Describes the current number of parallel tasks that a Java-based Kinesis Data Analytics application can
     *        perform.
     */

    public void setCurrentParallelism(Integer currentParallelism) {
        this.currentParallelism = currentParallelism;
    }

    /**
     * <p>
     * Describes the current number of parallel tasks that a Java-based Kinesis Data Analytics application can perform.
     * </p>
     * 
     * @return Describes the current number of parallel tasks that a Java-based Kinesis Data Analytics application can
     *         perform.
     */

    public Integer getCurrentParallelism() {
        return this.currentParallelism;
    }

    /**
     * <p>
     * Describes the current number of parallel tasks that a Java-based Kinesis Data Analytics application can perform.
     * </p>
     * 
     * @param currentParallelism
     *        Describes the current number of parallel tasks that a Java-based Kinesis Data Analytics application can
     *        perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelismConfigurationDescription withCurrentParallelism(Integer currentParallelism) {
        setCurrentParallelism(currentParallelism);
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

    public ParallelismConfigurationDescription withAutoScalingEnabled(Boolean autoScalingEnabled) {
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
        if (getCurrentParallelism() != null)
            sb.append("CurrentParallelism: ").append(getCurrentParallelism()).append(",");
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

        if (obj instanceof ParallelismConfigurationDescription == false)
            return false;
        ParallelismConfigurationDescription other = (ParallelismConfigurationDescription) obj;
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
        if (other.getCurrentParallelism() == null ^ this.getCurrentParallelism() == null)
            return false;
        if (other.getCurrentParallelism() != null && other.getCurrentParallelism().equals(this.getCurrentParallelism()) == false)
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
        hashCode = prime * hashCode + ((getCurrentParallelism() == null) ? 0 : getCurrentParallelism().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingEnabled() == null) ? 0 : getAutoScalingEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ParallelismConfigurationDescription clone() {
        try {
            return (ParallelismConfigurationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ParallelismConfigurationDescriptionMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
