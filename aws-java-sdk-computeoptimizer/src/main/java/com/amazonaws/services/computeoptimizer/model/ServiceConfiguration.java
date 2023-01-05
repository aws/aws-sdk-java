/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon ECS service configurations used for recommendations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ServiceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of memory used by the tasks in the ECS service.
     * </p>
     */
    private Integer memory;
    /**
     * <p>
     * The number of CPU units used by the tasks in the ECS service.
     * </p>
     */
    private Integer cpu;
    /**
     * <p>
     * The container configurations within a task of an ECS service.
     * </p>
     */
    private java.util.List<ContainerConfiguration> containerConfigurations;
    /**
     * <p>
     * Describes the Auto Scaling configuration methods for an Amazon ECS service. This affects the generated
     * recommendations. For example, if Auto Scaling is configured on a ECS service’s CPU, then Compute Optimizer
     * doesn’t generate CPU size recommendations.
     * </p>
     * <p>
     * The Auto Scaling configuration methods include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TARGET_TRACKING_SCALING_CPU</code> — If the ECS service is configured to use target scaling on CPU, Compute
     * Optimizer doesn't generate CPU recommendations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TARGET_TRACKING_SCALING_MEMORY</code> — If the ECS service is configured to use target scaling on memory,
     * Compute Optimizer doesn't generate memory recommendations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about step scaling and target scaling, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     * > Step scaling policies for Application Auto Scaling</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html">
     * Target tracking scaling policies for Application Auto Scaling</a> in the <i>Application Auto Scaling User
     * Guide</i>.
     * </p>
     */
    private String autoScalingConfiguration;
    /**
     * <p>
     * The task definition ARN used by the tasks in the ECS service.
     * </p>
     */
    private String taskDefinitionArn;

    /**
     * <p>
     * The amount of memory used by the tasks in the ECS service.
     * </p>
     * 
     * @param memory
     *        The amount of memory used by the tasks in the ECS service.
     */

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * The amount of memory used by the tasks in the ECS service.
     * </p>
     * 
     * @return The amount of memory used by the tasks in the ECS service.
     */

    public Integer getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * The amount of memory used by the tasks in the ECS service.
     * </p>
     * 
     * @param memory
     *        The amount of memory used by the tasks in the ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConfiguration withMemory(Integer memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * The number of CPU units used by the tasks in the ECS service.
     * </p>
     * 
     * @param cpu
     *        The number of CPU units used by the tasks in the ECS service.
     */

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    /**
     * <p>
     * The number of CPU units used by the tasks in the ECS service.
     * </p>
     * 
     * @return The number of CPU units used by the tasks in the ECS service.
     */

    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * <p>
     * The number of CPU units used by the tasks in the ECS service.
     * </p>
     * 
     * @param cpu
     *        The number of CPU units used by the tasks in the ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConfiguration withCpu(Integer cpu) {
        setCpu(cpu);
        return this;
    }

    /**
     * <p>
     * The container configurations within a task of an ECS service.
     * </p>
     * 
     * @return The container configurations within a task of an ECS service.
     */

    public java.util.List<ContainerConfiguration> getContainerConfigurations() {
        return containerConfigurations;
    }

    /**
     * <p>
     * The container configurations within a task of an ECS service.
     * </p>
     * 
     * @param containerConfigurations
     *        The container configurations within a task of an ECS service.
     */

    public void setContainerConfigurations(java.util.Collection<ContainerConfiguration> containerConfigurations) {
        if (containerConfigurations == null) {
            this.containerConfigurations = null;
            return;
        }

        this.containerConfigurations = new java.util.ArrayList<ContainerConfiguration>(containerConfigurations);
    }

    /**
     * <p>
     * The container configurations within a task of an ECS service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerConfigurations(java.util.Collection)} or
     * {@link #withContainerConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param containerConfigurations
     *        The container configurations within a task of an ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConfiguration withContainerConfigurations(ContainerConfiguration... containerConfigurations) {
        if (this.containerConfigurations == null) {
            setContainerConfigurations(new java.util.ArrayList<ContainerConfiguration>(containerConfigurations.length));
        }
        for (ContainerConfiguration ele : containerConfigurations) {
            this.containerConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The container configurations within a task of an ECS service.
     * </p>
     * 
     * @param containerConfigurations
     *        The container configurations within a task of an ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConfiguration withContainerConfigurations(java.util.Collection<ContainerConfiguration> containerConfigurations) {
        setContainerConfigurations(containerConfigurations);
        return this;
    }

    /**
     * <p>
     * Describes the Auto Scaling configuration methods for an Amazon ECS service. This affects the generated
     * recommendations. For example, if Auto Scaling is configured on a ECS service’s CPU, then Compute Optimizer
     * doesn’t generate CPU size recommendations.
     * </p>
     * <p>
     * The Auto Scaling configuration methods include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TARGET_TRACKING_SCALING_CPU</code> — If the ECS service is configured to use target scaling on CPU, Compute
     * Optimizer doesn't generate CPU recommendations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TARGET_TRACKING_SCALING_MEMORY</code> — If the ECS service is configured to use target scaling on memory,
     * Compute Optimizer doesn't generate memory recommendations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about step scaling and target scaling, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     * > Step scaling policies for Application Auto Scaling</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html">
     * Target tracking scaling policies for Application Auto Scaling</a> in the <i>Application Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @param autoScalingConfiguration
     *        Describes the Auto Scaling configuration methods for an Amazon ECS service. This affects the generated
     *        recommendations. For example, if Auto Scaling is configured on a ECS service’s CPU, then Compute Optimizer
     *        doesn’t generate CPU size recommendations. </p>
     *        <p>
     *        The Auto Scaling configuration methods include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TARGET_TRACKING_SCALING_CPU</code> — If the ECS service is configured to use target scaling on CPU,
     *        Compute Optimizer doesn't generate CPU recommendations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TARGET_TRACKING_SCALING_MEMORY</code> — If the ECS service is configured to use target scaling on
     *        memory, Compute Optimizer doesn't generate memory recommendations.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about step scaling and target scaling, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     *        > Step scaling policies for Application Auto Scaling</a> and <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html"
     *        > Target tracking scaling policies for Application Auto Scaling</a> in the <i>Application Auto Scaling
     *        User Guide</i>.
     * @see AutoScalingConfiguration
     */

    public void setAutoScalingConfiguration(String autoScalingConfiguration) {
        this.autoScalingConfiguration = autoScalingConfiguration;
    }

    /**
     * <p>
     * Describes the Auto Scaling configuration methods for an Amazon ECS service. This affects the generated
     * recommendations. For example, if Auto Scaling is configured on a ECS service’s CPU, then Compute Optimizer
     * doesn’t generate CPU size recommendations.
     * </p>
     * <p>
     * The Auto Scaling configuration methods include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TARGET_TRACKING_SCALING_CPU</code> — If the ECS service is configured to use target scaling on CPU, Compute
     * Optimizer doesn't generate CPU recommendations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TARGET_TRACKING_SCALING_MEMORY</code> — If the ECS service is configured to use target scaling on memory,
     * Compute Optimizer doesn't generate memory recommendations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about step scaling and target scaling, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     * > Step scaling policies for Application Auto Scaling</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html">
     * Target tracking scaling policies for Application Auto Scaling</a> in the <i>Application Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @return Describes the Auto Scaling configuration methods for an Amazon ECS service. This affects the generated
     *         recommendations. For example, if Auto Scaling is configured on a ECS service’s CPU, then Compute
     *         Optimizer doesn’t generate CPU size recommendations. </p>
     *         <p>
     *         The Auto Scaling configuration methods include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TARGET_TRACKING_SCALING_CPU</code> — If the ECS service is configured to use target scaling on CPU,
     *         Compute Optimizer doesn't generate CPU recommendations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TARGET_TRACKING_SCALING_MEMORY</code> — If the ECS service is configured to use target scaling on
     *         memory, Compute Optimizer doesn't generate memory recommendations.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about step scaling and target scaling, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     *         > Step scaling policies for Application Auto Scaling</a> and <a href=
     *         "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html"
     *         > Target tracking scaling policies for Application Auto Scaling</a> in the <i>Application Auto Scaling
     *         User Guide</i>.
     * @see AutoScalingConfiguration
     */

    public String getAutoScalingConfiguration() {
        return this.autoScalingConfiguration;
    }

    /**
     * <p>
     * Describes the Auto Scaling configuration methods for an Amazon ECS service. This affects the generated
     * recommendations. For example, if Auto Scaling is configured on a ECS service’s CPU, then Compute Optimizer
     * doesn’t generate CPU size recommendations.
     * </p>
     * <p>
     * The Auto Scaling configuration methods include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TARGET_TRACKING_SCALING_CPU</code> — If the ECS service is configured to use target scaling on CPU, Compute
     * Optimizer doesn't generate CPU recommendations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TARGET_TRACKING_SCALING_MEMORY</code> — If the ECS service is configured to use target scaling on memory,
     * Compute Optimizer doesn't generate memory recommendations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about step scaling and target scaling, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     * > Step scaling policies for Application Auto Scaling</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html">
     * Target tracking scaling policies for Application Auto Scaling</a> in the <i>Application Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @param autoScalingConfiguration
     *        Describes the Auto Scaling configuration methods for an Amazon ECS service. This affects the generated
     *        recommendations. For example, if Auto Scaling is configured on a ECS service’s CPU, then Compute Optimizer
     *        doesn’t generate CPU size recommendations. </p>
     *        <p>
     *        The Auto Scaling configuration methods include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TARGET_TRACKING_SCALING_CPU</code> — If the ECS service is configured to use target scaling on CPU,
     *        Compute Optimizer doesn't generate CPU recommendations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TARGET_TRACKING_SCALING_MEMORY</code> — If the ECS service is configured to use target scaling on
     *        memory, Compute Optimizer doesn't generate memory recommendations.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about step scaling and target scaling, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     *        > Step scaling policies for Application Auto Scaling</a> and <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html"
     *        > Target tracking scaling policies for Application Auto Scaling</a> in the <i>Application Auto Scaling
     *        User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingConfiguration
     */

    public ServiceConfiguration withAutoScalingConfiguration(String autoScalingConfiguration) {
        setAutoScalingConfiguration(autoScalingConfiguration);
        return this;
    }

    /**
     * <p>
     * Describes the Auto Scaling configuration methods for an Amazon ECS service. This affects the generated
     * recommendations. For example, if Auto Scaling is configured on a ECS service’s CPU, then Compute Optimizer
     * doesn’t generate CPU size recommendations.
     * </p>
     * <p>
     * The Auto Scaling configuration methods include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TARGET_TRACKING_SCALING_CPU</code> — If the ECS service is configured to use target scaling on CPU, Compute
     * Optimizer doesn't generate CPU recommendations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TARGET_TRACKING_SCALING_MEMORY</code> — If the ECS service is configured to use target scaling on memory,
     * Compute Optimizer doesn't generate memory recommendations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about step scaling and target scaling, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     * > Step scaling policies for Application Auto Scaling</a> and <a href=
     * "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html">
     * Target tracking scaling policies for Application Auto Scaling</a> in the <i>Application Auto Scaling User
     * Guide</i>.
     * </p>
     * 
     * @param autoScalingConfiguration
     *        Describes the Auto Scaling configuration methods for an Amazon ECS service. This affects the generated
     *        recommendations. For example, if Auto Scaling is configured on a ECS service’s CPU, then Compute Optimizer
     *        doesn’t generate CPU size recommendations. </p>
     *        <p>
     *        The Auto Scaling configuration methods include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TARGET_TRACKING_SCALING_CPU</code> — If the ECS service is configured to use target scaling on CPU,
     *        Compute Optimizer doesn't generate CPU recommendations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TARGET_TRACKING_SCALING_MEMORY</code> — If the ECS service is configured to use target scaling on
     *        memory, Compute Optimizer doesn't generate memory recommendations.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about step scaling and target scaling, see <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html"
     *        > Step scaling policies for Application Auto Scaling</a> and <a href=
     *        "https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html"
     *        > Target tracking scaling policies for Application Auto Scaling</a> in the <i>Application Auto Scaling
     *        User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingConfiguration
     */

    public ServiceConfiguration withAutoScalingConfiguration(AutoScalingConfiguration autoScalingConfiguration) {
        this.autoScalingConfiguration = autoScalingConfiguration.toString();
        return this;
    }

    /**
     * <p>
     * The task definition ARN used by the tasks in the ECS service.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The task definition ARN used by the tasks in the ECS service.
     */

    public void setTaskDefinitionArn(String taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
    }

    /**
     * <p>
     * The task definition ARN used by the tasks in the ECS service.
     * </p>
     * 
     * @return The task definition ARN used by the tasks in the ECS service.
     */

    public String getTaskDefinitionArn() {
        return this.taskDefinitionArn;
    }

    /**
     * <p>
     * The task definition ARN used by the tasks in the ECS service.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The task definition ARN used by the tasks in the ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConfiguration withTaskDefinitionArn(String taskDefinitionArn) {
        setTaskDefinitionArn(taskDefinitionArn);
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
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getCpu() != null)
            sb.append("Cpu: ").append(getCpu()).append(",");
        if (getContainerConfigurations() != null)
            sb.append("ContainerConfigurations: ").append(getContainerConfigurations()).append(",");
        if (getAutoScalingConfiguration() != null)
            sb.append("AutoScalingConfiguration: ").append(getAutoScalingConfiguration()).append(",");
        if (getTaskDefinitionArn() != null)
            sb.append("TaskDefinitionArn: ").append(getTaskDefinitionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceConfiguration == false)
            return false;
        ServiceConfiguration other = (ServiceConfiguration) obj;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getCpu() == null ^ this.getCpu() == null)
            return false;
        if (other.getCpu() != null && other.getCpu().equals(this.getCpu()) == false)
            return false;
        if (other.getContainerConfigurations() == null ^ this.getContainerConfigurations() == null)
            return false;
        if (other.getContainerConfigurations() != null && other.getContainerConfigurations().equals(this.getContainerConfigurations()) == false)
            return false;
        if (other.getAutoScalingConfiguration() == null ^ this.getAutoScalingConfiguration() == null)
            return false;
        if (other.getAutoScalingConfiguration() != null && other.getAutoScalingConfiguration().equals(this.getAutoScalingConfiguration()) == false)
            return false;
        if (other.getTaskDefinitionArn() == null ^ this.getTaskDefinitionArn() == null)
            return false;
        if (other.getTaskDefinitionArn() != null && other.getTaskDefinitionArn().equals(this.getTaskDefinitionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getCpu() == null) ? 0 : getCpu().hashCode());
        hashCode = prime * hashCode + ((getContainerConfigurations() == null) ? 0 : getContainerConfigurations().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingConfiguration() == null) ? 0 : getAutoScalingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTaskDefinitionArn() == null) ? 0 : getTaskDefinitionArn().hashCode());
        return hashCode;
    }

    @Override
    public ServiceConfiguration clone() {
        try {
            return (ServiceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.ServiceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
