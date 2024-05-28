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
 * Details of an instance group in a SageMaker HyperPod cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ClusterInstanceGroupDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterInstanceGroupDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of instances that are currently in the instance group of a SageMaker HyperPod cluster.
     * </p>
     */
    private Integer currentCount;
    /**
     * <p>
     * The number of instances you specified to add to the instance group of a SageMaker HyperPod cluster.
     * </p>
     */
    private Integer targetCount;
    /**
     * <p>
     * The name of the instance group of a SageMaker HyperPod cluster.
     * </p>
     */
    private String instanceGroupName;
    /**
     * <p>
     * The instance type of the instance group of a SageMaker HyperPod cluster.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Details of LifeCycle configuration for the instance group.
     * </p>
     */
    private ClusterLifeCycleConfig lifeCycleConfig;
    /**
     * <p>
     * The execution role for the instance group to assume.
     * </p>
     */
    private String executionRole;
    /**
     * <p>
     * The number you specified to <code>TreadsPerCore</code> in <code>CreateCluster</code> for enabling or disabling
     * multithreading. For instance types that support multithreading, you can specify 1 for disabling multithreading
     * and 2 for enabling multithreading. For more information, see the reference table of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cpu-options-supported-instances-values.html">CPU cores
     * and threads per CPU core per instance type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private Integer threadsPerCore;

    /**
     * <p>
     * The number of instances that are currently in the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @param currentCount
     *        The number of instances that are currently in the instance group of a SageMaker HyperPod cluster.
     */

    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    /**
     * <p>
     * The number of instances that are currently in the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @return The number of instances that are currently in the instance group of a SageMaker HyperPod cluster.
     */

    public Integer getCurrentCount() {
        return this.currentCount;
    }

    /**
     * <p>
     * The number of instances that are currently in the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @param currentCount
     *        The number of instances that are currently in the instance group of a SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInstanceGroupDetails withCurrentCount(Integer currentCount) {
        setCurrentCount(currentCount);
        return this;
    }

    /**
     * <p>
     * The number of instances you specified to add to the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @param targetCount
     *        The number of instances you specified to add to the instance group of a SageMaker HyperPod cluster.
     */

    public void setTargetCount(Integer targetCount) {
        this.targetCount = targetCount;
    }

    /**
     * <p>
     * The number of instances you specified to add to the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @return The number of instances you specified to add to the instance group of a SageMaker HyperPod cluster.
     */

    public Integer getTargetCount() {
        return this.targetCount;
    }

    /**
     * <p>
     * The number of instances you specified to add to the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @param targetCount
     *        The number of instances you specified to add to the instance group of a SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInstanceGroupDetails withTargetCount(Integer targetCount) {
        setTargetCount(targetCount);
        return this;
    }

    /**
     * <p>
     * The name of the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @param instanceGroupName
     *        The name of the instance group of a SageMaker HyperPod cluster.
     */

    public void setInstanceGroupName(String instanceGroupName) {
        this.instanceGroupName = instanceGroupName;
    }

    /**
     * <p>
     * The name of the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @return The name of the instance group of a SageMaker HyperPod cluster.
     */

    public String getInstanceGroupName() {
        return this.instanceGroupName;
    }

    /**
     * <p>
     * The name of the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @param instanceGroupName
     *        The name of the instance group of a SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInstanceGroupDetails withInstanceGroupName(String instanceGroupName) {
        setInstanceGroupName(instanceGroupName);
        return this;
    }

    /**
     * <p>
     * The instance type of the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the instance group of a SageMaker HyperPod cluster.
     * @see ClusterInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @return The instance type of the instance group of a SageMaker HyperPod cluster.
     * @see ClusterInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the instance group of a SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterInstanceType
     */

    public ClusterInstanceGroupDetails withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type of the instance group of a SageMaker HyperPod cluster.
     * </p>
     * 
     * @param instanceType
     *        The instance type of the instance group of a SageMaker HyperPod cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterInstanceType
     */

    public ClusterInstanceGroupDetails withInstanceType(ClusterInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * Details of LifeCycle configuration for the instance group.
     * </p>
     * 
     * @param lifeCycleConfig
     *        Details of LifeCycle configuration for the instance group.
     */

    public void setLifeCycleConfig(ClusterLifeCycleConfig lifeCycleConfig) {
        this.lifeCycleConfig = lifeCycleConfig;
    }

    /**
     * <p>
     * Details of LifeCycle configuration for the instance group.
     * </p>
     * 
     * @return Details of LifeCycle configuration for the instance group.
     */

    public ClusterLifeCycleConfig getLifeCycleConfig() {
        return this.lifeCycleConfig;
    }

    /**
     * <p>
     * Details of LifeCycle configuration for the instance group.
     * </p>
     * 
     * @param lifeCycleConfig
     *        Details of LifeCycle configuration for the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInstanceGroupDetails withLifeCycleConfig(ClusterLifeCycleConfig lifeCycleConfig) {
        setLifeCycleConfig(lifeCycleConfig);
        return this;
    }

    /**
     * <p>
     * The execution role for the instance group to assume.
     * </p>
     * 
     * @param executionRole
     *        The execution role for the instance group to assume.
     */

    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * The execution role for the instance group to assume.
     * </p>
     * 
     * @return The execution role for the instance group to assume.
     */

    public String getExecutionRole() {
        return this.executionRole;
    }

    /**
     * <p>
     * The execution role for the instance group to assume.
     * </p>
     * 
     * @param executionRole
     *        The execution role for the instance group to assume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInstanceGroupDetails withExecutionRole(String executionRole) {
        setExecutionRole(executionRole);
        return this;
    }

    /**
     * <p>
     * The number you specified to <code>TreadsPerCore</code> in <code>CreateCluster</code> for enabling or disabling
     * multithreading. For instance types that support multithreading, you can specify 1 for disabling multithreading
     * and 2 for enabling multithreading. For more information, see the reference table of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cpu-options-supported-instances-values.html">CPU cores
     * and threads per CPU core per instance type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param threadsPerCore
     *        The number you specified to <code>TreadsPerCore</code> in <code>CreateCluster</code> for enabling or
     *        disabling multithreading. For instance types that support multithreading, you can specify 1 for disabling
     *        multithreading and 2 for enabling multithreading. For more information, see the reference table of <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cpu-options-supported-instances-values.html">CPU
     *        cores and threads per CPU core per instance type</a> in the <i>Amazon Elastic Compute Cloud User
     *        Guide</i>.
     */

    public void setThreadsPerCore(Integer threadsPerCore) {
        this.threadsPerCore = threadsPerCore;
    }

    /**
     * <p>
     * The number you specified to <code>TreadsPerCore</code> in <code>CreateCluster</code> for enabling or disabling
     * multithreading. For instance types that support multithreading, you can specify 1 for disabling multithreading
     * and 2 for enabling multithreading. For more information, see the reference table of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cpu-options-supported-instances-values.html">CPU cores
     * and threads per CPU core per instance type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The number you specified to <code>TreadsPerCore</code> in <code>CreateCluster</code> for enabling or
     *         disabling multithreading. For instance types that support multithreading, you can specify 1 for disabling
     *         multithreading and 2 for enabling multithreading. For more information, see the reference table of <a
     *         href
     *         ="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cpu-options-supported-instances-values.html">CPU
     *         cores and threads per CPU core per instance type</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */

    public Integer getThreadsPerCore() {
        return this.threadsPerCore;
    }

    /**
     * <p>
     * The number you specified to <code>TreadsPerCore</code> in <code>CreateCluster</code> for enabling or disabling
     * multithreading. For instance types that support multithreading, you can specify 1 for disabling multithreading
     * and 2 for enabling multithreading. For more information, see the reference table of <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cpu-options-supported-instances-values.html">CPU cores
     * and threads per CPU core per instance type</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param threadsPerCore
     *        The number you specified to <code>TreadsPerCore</code> in <code>CreateCluster</code> for enabling or
     *        disabling multithreading. For instance types that support multithreading, you can specify 1 for disabling
     *        multithreading and 2 for enabling multithreading. For more information, see the reference table of <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cpu-options-supported-instances-values.html">CPU
     *        cores and threads per CPU core per instance type</a> in the <i>Amazon Elastic Compute Cloud User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInstanceGroupDetails withThreadsPerCore(Integer threadsPerCore) {
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
        if (getCurrentCount() != null)
            sb.append("CurrentCount: ").append(getCurrentCount()).append(",");
        if (getTargetCount() != null)
            sb.append("TargetCount: ").append(getTargetCount()).append(",");
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

        if (obj instanceof ClusterInstanceGroupDetails == false)
            return false;
        ClusterInstanceGroupDetails other = (ClusterInstanceGroupDetails) obj;
        if (other.getCurrentCount() == null ^ this.getCurrentCount() == null)
            return false;
        if (other.getCurrentCount() != null && other.getCurrentCount().equals(this.getCurrentCount()) == false)
            return false;
        if (other.getTargetCount() == null ^ this.getTargetCount() == null)
            return false;
        if (other.getTargetCount() != null && other.getTargetCount().equals(this.getTargetCount()) == false)
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

        hashCode = prime * hashCode + ((getCurrentCount() == null) ? 0 : getCurrentCount().hashCode());
        hashCode = prime * hashCode + ((getTargetCount() == null) ? 0 : getTargetCount().hashCode());
        hashCode = prime * hashCode + ((getInstanceGroupName() == null) ? 0 : getInstanceGroupName().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getLifeCycleConfig() == null) ? 0 : getLifeCycleConfig().hashCode());
        hashCode = prime * hashCode + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getThreadsPerCore() == null) ? 0 : getThreadsPerCore().hashCode());
        return hashCode;
    }

    @Override
    public ClusterInstanceGroupDetails clone() {
        try {
            return (ClusterInstanceGroupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ClusterInstanceGroupDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
