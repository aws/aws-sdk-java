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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The specifications of an instance group that you need to define.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ClusterInstanceGroupSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterInstanceGroupSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the number of instances to add to the instance group of a SageMaker HyperPod cluster.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * Specifies the name of the instance group.
     * </p>
     */
    private String instanceGroupName;
    /**
     * <p>
     * Specifies the instance type of the instance group.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Specifies the LifeCycle configuration for the instance group.
     * </p>
     */
    private ClusterLifeCycleConfig lifeCycleConfig;
    /**
     * <p>
     * Specifies an IAM execution role to be assumed by the instance group.
     * </p>
     */
    private String executionRole;
    /**
     * <p>
     * Specifies the value for <b>Threads per core</b>. For instance types that support multithreading, you can specify
     * <code>1</code> for disabling multithreading and <code>2</code> for enabling multithreading. For instance types
     * that doesn't support multithreading, specify <code>1</code>. For more information, see the reference table of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cpu-options-supported-instances-values.html">CPU cores
     * and threads per CPU core per instance type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private Integer threadsPerCore;

    /**
     * <p>
     * Specifies the number of instances to add to the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @param instanceCount
     *        Specifies the number of instances to add to the instance group of a SageMaker HyperPod cluster.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * Specifies the number of instances to add to the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @return Specifies the number of instances to add to the instance group of a SageMaker HyperPod cluster.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * Specifies the number of instances to add to the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @param instanceCount
     *        Specifies the number of instances to add to the instance group of a SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInstanceGroupSpecification withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the instance group.
     * </p>
     * 
     * @param instanceGroupName
     *        Specifies the name of the instance group.
     */

    public void setInstanceGroupName(String instanceGroupName) {
        this.instanceGroupName = instanceGroupName;
    }

    /**
     * <p>
     * Specifies the name of the instance group.
     * </p>
     * 
     * @return Specifies the name of the instance group.
     */

    public String getInstanceGroupName() {
        return this.instanceGroupName;
    }

    /**
     * <p>
     * Specifies the name of the instance group.
     * </p>
     * 
     * @param instanceGroupName
     *        Specifies the name of the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInstanceGroupSpecification withInstanceGroupName(String instanceGroupName) {
        setInstanceGroupName(instanceGroupName);
        return this;
    }

    /**
     * <p>
     * Specifies the instance type of the instance group.
     * </p>
     * 
     * @param instanceType
     *        Specifies the instance type of the instance group.
     * @see ClusterInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Specifies the instance type of the instance group.
     * </p>
     * 
     * @return Specifies the instance type of the instance group.
     * @see ClusterInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * Specifies the instance type of the instance group.
     * </p>
     * 
     * @param instanceType
     *        Specifies the instance type of the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterInstanceType
     */

    public ClusterInstanceGroupSpecification withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * Specifies the instance type of the instance group.
     * </p>
     * 
     * @param instanceType
     *        Specifies the instance type of the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterInstanceType
     */

    public ClusterInstanceGroupSpecification withInstanceType(ClusterInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the LifeCycle configuration for the instance group.
     * </p>
     * 
     * @param lifeCycleConfig
     *        Specifies the LifeCycle configuration for the instance group.
     */

    public void setLifeCycleConfig(ClusterLifeCycleConfig lifeCycleConfig) {
        this.lifeCycleConfig = lifeCycleConfig;
    }

    /**
     * <p>
     * Specifies the LifeCycle configuration for the instance group.
     * </p>
     * 
     * @return Specifies the LifeCycle configuration for the instance group.
     */

    public ClusterLifeCycleConfig getLifeCycleConfig() {
        return this.lifeCycleConfig;
    }

    /**
     * <p>
     * Specifies the LifeCycle configuration for the instance group.
     * </p>
     * 
     * @param lifeCycleConfig
     *        Specifies the LifeCycle configuration for the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInstanceGroupSpecification withLifeCycleConfig(ClusterLifeCycleConfig lifeCycleConfig) {
        setLifeCycleConfig(lifeCycleConfig);
        return this;
    }

    /**
     * <p>
     * Specifies an IAM execution role to be assumed by the instance group.
     * </p>
     * 
     * @param executionRole
     *        Specifies an IAM execution role to be assumed by the instance group.
     */

    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * Specifies an IAM execution role to be assumed by the instance group.
     * </p>
     * 
     * @return Specifies an IAM execution role to be assumed by the instance group.
     */

    public String getExecutionRole() {
        return this.executionRole;
    }

    /**
     * <p>
     * Specifies an IAM execution role to be assumed by the instance group.
     * </p>
     * 
     * @param executionRole
     *        Specifies an IAM execution role to be assumed by the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInstanceGroupSpecification withExecutionRole(String executionRole) {
        setExecutionRole(executionRole);
        return this;
    }

    /**
     * <p>
     * Specifies the value for <b>Threads per core</b>. For instance types that support multithreading, you can specify
     * <code>1</code> for disabling multithreading and <code>2</code> for enabling multithreading. For instance types
     * that doesn't support multithreading, specify <code>1</code>. For more information, see the reference table of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cpu-options-supported-instances-values.html">CPU cores
     * and threads per CPU core per instance type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param threadsPerCore
     *        Specifies the value for <b>Threads per core</b>. For instance types that support multithreading, you can
     *        specify <code>1</code> for disabling multithreading and <code>2</code> for enabling multithreading. For
     *        instance types that doesn't support multithreading, specify <code>1</code>. For more information, see the
     *        reference table of <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cpu-options-supported-instances-values.html">CPU
     *        cores and threads per CPU core per instance type</a> in the <i>Amazon Elastic Compute Cloud User
     *        Guide</i>.
     */

    public void setThreadsPerCore(Integer threadsPerCore) {
        this.threadsPerCore = threadsPerCore;
    }

    /**
     * <p>
     * Specifies the value for <b>Threads per core</b>. For instance types that support multithreading, you can specify
     * <code>1</code> for disabling multithreading and <code>2</code> for enabling multithreading. For instance types
     * that doesn't support multithreading, specify <code>1</code>. For more information, see the reference table of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cpu-options-supported-instances-values.html">CPU cores
     * and threads per CPU core per instance type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Specifies the value for <b>Threads per core</b>. For instance types that support multithreading, you can
     *         specify <code>1</code> for disabling multithreading and <code>2</code> for enabling multithreading. For
     *         instance types that doesn't support multithreading, specify <code>1</code>. For more information, see the
     *         reference table of <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cpu-options-supported-instances-values.html"
     *         >CPU cores and threads per CPU core per instance type</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */

    public Integer getThreadsPerCore() {
        return this.threadsPerCore;
    }

    /**
     * <p>
     * Specifies the value for <b>Threads per core</b>. For instance types that support multithreading, you can specify
     * <code>1</code> for disabling multithreading and <code>2</code> for enabling multithreading. For instance types
     * that doesn't support multithreading, specify <code>1</code>. For more information, see the reference table of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cpu-options-supported-instances-values.html">CPU cores
     * and threads per CPU core per instance type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param threadsPerCore
     *        Specifies the value for <b>Threads per core</b>. For instance types that support multithreading, you can
     *        specify <code>1</code> for disabling multithreading and <code>2</code> for enabling multithreading. For
     *        instance types that doesn't support multithreading, specify <code>1</code>. For more information, see the
     *        reference table of <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cpu-options-supported-instances-values.html">CPU
     *        cores and threads per CPU core per instance type</a> in the <i>Amazon Elastic Compute Cloud User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInstanceGroupSpecification withThreadsPerCore(Integer threadsPerCore) {
        setThreadsPerCore(threadsPerCore);
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
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getInstanceGroupName() != null)
            sb.append("InstanceGroupName: ").append(getInstanceGroupName()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getLifeCycleConfig() != null)
            sb.append("LifeCycleConfig: ").append(getLifeCycleConfig()).append(",");
        if (getExecutionRole() != null)
            sb.append("ExecutionRole: ").append(getExecutionRole()).append(",");
        if (getThreadsPerCore() != null)
            sb.append("ThreadsPerCore: ").append(getThreadsPerCore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterInstanceGroupSpecification == false)
            return false;
        ClusterInstanceGroupSpecification other = (ClusterInstanceGroupSpecification) obj;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getInstanceGroupName() == null ^ this.getInstanceGroupName() == null)
            return false;
        if (other.getInstanceGroupName() != null && other.getInstanceGroupName().equals(this.getInstanceGroupName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getLifeCycleConfig() == null ^ this.getLifeCycleConfig() == null)
            return false;
        if (other.getLifeCycleConfig() != null && other.getLifeCycleConfig().equals(this.getLifeCycleConfig()) == false)
            return false;
        if (other.getExecutionRole() == null ^ this.getExecutionRole() == null)
            return false;
        if (other.getExecutionRole() != null && other.getExecutionRole().equals(this.getExecutionRole()) == false)
            return false;
        if (other.getThreadsPerCore() == null ^ this.getThreadsPerCore() == null)
            return false;
        if (other.getThreadsPerCore() != null && other.getThreadsPerCore().equals(this.getThreadsPerCore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getInstanceGroupName() == null) ? 0 : getInstanceGroupName().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getLifeCycleConfig() == null) ? 0 : getLifeCycleConfig().hashCode());
        hashCode = prime * hashCode + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getThreadsPerCore() == null) ? 0 : getThreadsPerCore().hashCode());
        return hashCode;
    }

    @Override
    public ClusterInstanceGroupSpecification clone() {
        try {
            return (ClusterInstanceGroupSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ClusterInstanceGroupSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
