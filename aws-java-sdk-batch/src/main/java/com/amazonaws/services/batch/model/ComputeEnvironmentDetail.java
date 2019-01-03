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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an AWS Batch compute environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ComputeEnvironmentDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeEnvironmentDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the compute environment.
     * </p>
     */
    private String computeEnvironmentName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the compute environment.
     * </p>
     */
    private String computeEnvironmentArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
     * </p>
     */
    private String ecsClusterArn;
    /**
     * <p>
     * The type of the compute environment.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The state of the compute environment. The valid values are <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * <p>
     * If the state is <code>ENABLED</code>, then the AWS Batch scheduler can attempt to place jobs from an associated
     * job queue on the compute resources within the environment. If the compute environment is managed, then it can
     * scale its instances out or in automatically, based on the job queue demand.
     * </p>
     * <p>
     * If the state is <code>DISABLED</code>, then the AWS Batch scheduler does not attempt to place jobs within the
     * environment. Jobs in a <code>STARTING</code> or <code>RUNNING</code> state continue to progress normally. Managed
     * compute environments in the <code>DISABLED</code> state do not scale out. However, they scale in to
     * <code>minvCpus</code> value after instances become idle.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The current status of the compute environment (for example, <code>CREATING</code> or <code>VALID</code>).
     * </p>
     */
    private String status;
    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the compute environment.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The compute resources defined for the compute environment.
     * </p>
     */
    private ComputeResource computeResources;
    /**
     * <p>
     * The service role associated with the compute environment that allows AWS Batch to make calls to AWS API
     * operations on your behalf.
     * </p>
     */
    private String serviceRole;

    /**
     * <p>
     * The name of the compute environment.
     * </p>
     * 
     * @param computeEnvironmentName
     *        The name of the compute environment.
     */

    public void setComputeEnvironmentName(String computeEnvironmentName) {
        this.computeEnvironmentName = computeEnvironmentName;
    }

    /**
     * <p>
     * The name of the compute environment.
     * </p>
     * 
     * @return The name of the compute environment.
     */

    public String getComputeEnvironmentName() {
        return this.computeEnvironmentName;
    }

    /**
     * <p>
     * The name of the compute environment.
     * </p>
     * 
     * @param computeEnvironmentName
     *        The name of the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeEnvironmentDetail withComputeEnvironmentName(String computeEnvironmentName) {
        setComputeEnvironmentName(computeEnvironmentName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the compute environment.
     * </p>
     * 
     * @param computeEnvironmentArn
     *        The Amazon Resource Name (ARN) of the compute environment.
     */

    public void setComputeEnvironmentArn(String computeEnvironmentArn) {
        this.computeEnvironmentArn = computeEnvironmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the compute environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the compute environment.
     */

    public String getComputeEnvironmentArn() {
        return this.computeEnvironmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the compute environment.
     * </p>
     * 
     * @param computeEnvironmentArn
     *        The Amazon Resource Name (ARN) of the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeEnvironmentDetail withComputeEnvironmentArn(String computeEnvironmentArn) {
        setComputeEnvironmentArn(computeEnvironmentArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
     * </p>
     * 
     * @param ecsClusterArn
     *        The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
     */

    public void setEcsClusterArn(String ecsClusterArn) {
        this.ecsClusterArn = ecsClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
     */

    public String getEcsClusterArn() {
        return this.ecsClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
     * </p>
     * 
     * @param ecsClusterArn
     *        The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeEnvironmentDetail withEcsClusterArn(String ecsClusterArn) {
        setEcsClusterArn(ecsClusterArn);
        return this;
    }

    /**
     * <p>
     * The type of the compute environment.
     * </p>
     * 
     * @param type
     *        The type of the compute environment.
     * @see CEType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the compute environment.
     * </p>
     * 
     * @return The type of the compute environment.
     * @see CEType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the compute environment.
     * </p>
     * 
     * @param type
     *        The type of the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CEType
     */

    public ComputeEnvironmentDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the compute environment.
     * </p>
     * 
     * @param type
     *        The type of the compute environment.
     * @see CEType
     */

    public void setType(CEType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of the compute environment.
     * </p>
     * 
     * @param type
     *        The type of the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CEType
     */

    public ComputeEnvironmentDetail withType(CEType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The state of the compute environment. The valid values are <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * <p>
     * If the state is <code>ENABLED</code>, then the AWS Batch scheduler can attempt to place jobs from an associated
     * job queue on the compute resources within the environment. If the compute environment is managed, then it can
     * scale its instances out or in automatically, based on the job queue demand.
     * </p>
     * <p>
     * If the state is <code>DISABLED</code>, then the AWS Batch scheduler does not attempt to place jobs within the
     * environment. Jobs in a <code>STARTING</code> or <code>RUNNING</code> state continue to progress normally. Managed
     * compute environments in the <code>DISABLED</code> state do not scale out. However, they scale in to
     * <code>minvCpus</code> value after instances become idle.
     * </p>
     * 
     * @param state
     *        The state of the compute environment. The valid values are <code>ENABLED</code> or <code>DISABLED</code>.
     *        </p>
     *        <p>
     *        If the state is <code>ENABLED</code>, then the AWS Batch scheduler can attempt to place jobs from an
     *        associated job queue on the compute resources within the environment. If the compute environment is
     *        managed, then it can scale its instances out or in automatically, based on the job queue demand.
     *        </p>
     *        <p>
     *        If the state is <code>DISABLED</code>, then the AWS Batch scheduler does not attempt to place jobs within
     *        the environment. Jobs in a <code>STARTING</code> or <code>RUNNING</code> state continue to progress
     *        normally. Managed compute environments in the <code>DISABLED</code> state do not scale out. However, they
     *        scale in to <code>minvCpus</code> value after instances become idle.
     * @see CEState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the compute environment. The valid values are <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * <p>
     * If the state is <code>ENABLED</code>, then the AWS Batch scheduler can attempt to place jobs from an associated
     * job queue on the compute resources within the environment. If the compute environment is managed, then it can
     * scale its instances out or in automatically, based on the job queue demand.
     * </p>
     * <p>
     * If the state is <code>DISABLED</code>, then the AWS Batch scheduler does not attempt to place jobs within the
     * environment. Jobs in a <code>STARTING</code> or <code>RUNNING</code> state continue to progress normally. Managed
     * compute environments in the <code>DISABLED</code> state do not scale out. However, they scale in to
     * <code>minvCpus</code> value after instances become idle.
     * </p>
     * 
     * @return The state of the compute environment. The valid values are <code>ENABLED</code> or <code>DISABLED</code>.
     *         </p>
     *         <p>
     *         If the state is <code>ENABLED</code>, then the AWS Batch scheduler can attempt to place jobs from an
     *         associated job queue on the compute resources within the environment. If the compute environment is
     *         managed, then it can scale its instances out or in automatically, based on the job queue demand.
     *         </p>
     *         <p>
     *         If the state is <code>DISABLED</code>, then the AWS Batch scheduler does not attempt to place jobs within
     *         the environment. Jobs in a <code>STARTING</code> or <code>RUNNING</code> state continue to progress
     *         normally. Managed compute environments in the <code>DISABLED</code> state do not scale out. However, they
     *         scale in to <code>minvCpus</code> value after instances become idle.
     * @see CEState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the compute environment. The valid values are <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * <p>
     * If the state is <code>ENABLED</code>, then the AWS Batch scheduler can attempt to place jobs from an associated
     * job queue on the compute resources within the environment. If the compute environment is managed, then it can
     * scale its instances out or in automatically, based on the job queue demand.
     * </p>
     * <p>
     * If the state is <code>DISABLED</code>, then the AWS Batch scheduler does not attempt to place jobs within the
     * environment. Jobs in a <code>STARTING</code> or <code>RUNNING</code> state continue to progress normally. Managed
     * compute environments in the <code>DISABLED</code> state do not scale out. However, they scale in to
     * <code>minvCpus</code> value after instances become idle.
     * </p>
     * 
     * @param state
     *        The state of the compute environment. The valid values are <code>ENABLED</code> or <code>DISABLED</code>.
     *        </p>
     *        <p>
     *        If the state is <code>ENABLED</code>, then the AWS Batch scheduler can attempt to place jobs from an
     *        associated job queue on the compute resources within the environment. If the compute environment is
     *        managed, then it can scale its instances out or in automatically, based on the job queue demand.
     *        </p>
     *        <p>
     *        If the state is <code>DISABLED</code>, then the AWS Batch scheduler does not attempt to place jobs within
     *        the environment. Jobs in a <code>STARTING</code> or <code>RUNNING</code> state continue to progress
     *        normally. Managed compute environments in the <code>DISABLED</code> state do not scale out. However, they
     *        scale in to <code>minvCpus</code> value after instances become idle.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CEState
     */

    public ComputeEnvironmentDetail withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the compute environment. The valid values are <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * <p>
     * If the state is <code>ENABLED</code>, then the AWS Batch scheduler can attempt to place jobs from an associated
     * job queue on the compute resources within the environment. If the compute environment is managed, then it can
     * scale its instances out or in automatically, based on the job queue demand.
     * </p>
     * <p>
     * If the state is <code>DISABLED</code>, then the AWS Batch scheduler does not attempt to place jobs within the
     * environment. Jobs in a <code>STARTING</code> or <code>RUNNING</code> state continue to progress normally. Managed
     * compute environments in the <code>DISABLED</code> state do not scale out. However, they scale in to
     * <code>minvCpus</code> value after instances become idle.
     * </p>
     * 
     * @param state
     *        The state of the compute environment. The valid values are <code>ENABLED</code> or <code>DISABLED</code>.
     *        </p>
     *        <p>
     *        If the state is <code>ENABLED</code>, then the AWS Batch scheduler can attempt to place jobs from an
     *        associated job queue on the compute resources within the environment. If the compute environment is
     *        managed, then it can scale its instances out or in automatically, based on the job queue demand.
     *        </p>
     *        <p>
     *        If the state is <code>DISABLED</code>, then the AWS Batch scheduler does not attempt to place jobs within
     *        the environment. Jobs in a <code>STARTING</code> or <code>RUNNING</code> state continue to progress
     *        normally. Managed compute environments in the <code>DISABLED</code> state do not scale out. However, they
     *        scale in to <code>minvCpus</code> value after instances become idle.
     * @see CEState
     */

    public void setState(CEState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the compute environment. The valid values are <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * <p>
     * If the state is <code>ENABLED</code>, then the AWS Batch scheduler can attempt to place jobs from an associated
     * job queue on the compute resources within the environment. If the compute environment is managed, then it can
     * scale its instances out or in automatically, based on the job queue demand.
     * </p>
     * <p>
     * If the state is <code>DISABLED</code>, then the AWS Batch scheduler does not attempt to place jobs within the
     * environment. Jobs in a <code>STARTING</code> or <code>RUNNING</code> state continue to progress normally. Managed
     * compute environments in the <code>DISABLED</code> state do not scale out. However, they scale in to
     * <code>minvCpus</code> value after instances become idle.
     * </p>
     * 
     * @param state
     *        The state of the compute environment. The valid values are <code>ENABLED</code> or <code>DISABLED</code>.
     *        </p>
     *        <p>
     *        If the state is <code>ENABLED</code>, then the AWS Batch scheduler can attempt to place jobs from an
     *        associated job queue on the compute resources within the environment. If the compute environment is
     *        managed, then it can scale its instances out or in automatically, based on the job queue demand.
     *        </p>
     *        <p>
     *        If the state is <code>DISABLED</code>, then the AWS Batch scheduler does not attempt to place jobs within
     *        the environment. Jobs in a <code>STARTING</code> or <code>RUNNING</code> state continue to progress
     *        normally. Managed compute environments in the <code>DISABLED</code> state do not scale out. However, they
     *        scale in to <code>minvCpus</code> value after instances become idle.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CEState
     */

    public ComputeEnvironmentDetail withState(CEState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the compute environment (for example, <code>CREATING</code> or <code>VALID</code>).
     * </p>
     * 
     * @param status
     *        The current status of the compute environment (for example, <code>CREATING</code> or <code>VALID</code>).
     * @see CEStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the compute environment (for example, <code>CREATING</code> or <code>VALID</code>).
     * </p>
     * 
     * @return The current status of the compute environment (for example, <code>CREATING</code> or <code>VALID</code>).
     * @see CEStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the compute environment (for example, <code>CREATING</code> or <code>VALID</code>).
     * </p>
     * 
     * @param status
     *        The current status of the compute environment (for example, <code>CREATING</code> or <code>VALID</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CEStatus
     */

    public ComputeEnvironmentDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the compute environment (for example, <code>CREATING</code> or <code>VALID</code>).
     * </p>
     * 
     * @param status
     *        The current status of the compute environment (for example, <code>CREATING</code> or <code>VALID</code>).
     * @see CEStatus
     */

    public void setStatus(CEStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The current status of the compute environment (for example, <code>CREATING</code> or <code>VALID</code>).
     * </p>
     * 
     * @param status
     *        The current status of the compute environment (for example, <code>CREATING</code> or <code>VALID</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CEStatus
     */

    public ComputeEnvironmentDetail withStatus(CEStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the compute environment.
     * </p>
     * 
     * @param statusReason
     *        A short, human-readable string to provide additional details about the current status of the compute
     *        environment.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the compute environment.
     * </p>
     * 
     * @return A short, human-readable string to provide additional details about the current status of the compute
     *         environment.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the compute environment.
     * </p>
     * 
     * @param statusReason
     *        A short, human-readable string to provide additional details about the current status of the compute
     *        environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeEnvironmentDetail withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The compute resources defined for the compute environment.
     * </p>
     * 
     * @param computeResources
     *        The compute resources defined for the compute environment.
     */

    public void setComputeResources(ComputeResource computeResources) {
        this.computeResources = computeResources;
    }

    /**
     * <p>
     * The compute resources defined for the compute environment.
     * </p>
     * 
     * @return The compute resources defined for the compute environment.
     */

    public ComputeResource getComputeResources() {
        return this.computeResources;
    }

    /**
     * <p>
     * The compute resources defined for the compute environment.
     * </p>
     * 
     * @param computeResources
     *        The compute resources defined for the compute environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeEnvironmentDetail withComputeResources(ComputeResource computeResources) {
        setComputeResources(computeResources);
        return this;
    }

    /**
     * <p>
     * The service role associated with the compute environment that allows AWS Batch to make calls to AWS API
     * operations on your behalf.
     * </p>
     * 
     * @param serviceRole
     *        The service role associated with the compute environment that allows AWS Batch to make calls to AWS API
     *        operations on your behalf.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The service role associated with the compute environment that allows AWS Batch to make calls to AWS API
     * operations on your behalf.
     * </p>
     * 
     * @return The service role associated with the compute environment that allows AWS Batch to make calls to AWS API
     *         operations on your behalf.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The service role associated with the compute environment that allows AWS Batch to make calls to AWS API
     * operations on your behalf.
     * </p>
     * 
     * @param serviceRole
     *        The service role associated with the compute environment that allows AWS Batch to make calls to AWS API
     *        operations on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeEnvironmentDetail withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
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
        if (getComputeEnvironmentName() != null)
            sb.append("ComputeEnvironmentName: ").append(getComputeEnvironmentName()).append(",");
        if (getComputeEnvironmentArn() != null)
            sb.append("ComputeEnvironmentArn: ").append(getComputeEnvironmentArn()).append(",");
        if (getEcsClusterArn() != null)
            sb.append("EcsClusterArn: ").append(getEcsClusterArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getComputeResources() != null)
            sb.append("ComputeResources: ").append(getComputeResources()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeEnvironmentDetail == false)
            return false;
        ComputeEnvironmentDetail other = (ComputeEnvironmentDetail) obj;
        if (other.getComputeEnvironmentName() == null ^ this.getComputeEnvironmentName() == null)
            return false;
        if (other.getComputeEnvironmentName() != null && other.getComputeEnvironmentName().equals(this.getComputeEnvironmentName()) == false)
            return false;
        if (other.getComputeEnvironmentArn() == null ^ this.getComputeEnvironmentArn() == null)
            return false;
        if (other.getComputeEnvironmentArn() != null && other.getComputeEnvironmentArn().equals(this.getComputeEnvironmentArn()) == false)
            return false;
        if (other.getEcsClusterArn() == null ^ this.getEcsClusterArn() == null)
            return false;
        if (other.getEcsClusterArn() != null && other.getEcsClusterArn().equals(this.getEcsClusterArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getComputeResources() == null ^ this.getComputeResources() == null)
            return false;
        if (other.getComputeResources() != null && other.getComputeResources().equals(this.getComputeResources()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputeEnvironmentName() == null) ? 0 : getComputeEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getComputeEnvironmentArn() == null) ? 0 : getComputeEnvironmentArn().hashCode());
        hashCode = prime * hashCode + ((getEcsClusterArn() == null) ? 0 : getEcsClusterArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getComputeResources() == null) ? 0 : getComputeResources().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        return hashCode;
    }

    @Override
    public ComputeEnvironmentDetail clone() {
        try {
            return (ComputeEnvironmentDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.ComputeEnvironmentDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
