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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/UpdateComputeEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateComputeEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the compute environment to update.
     * </p>
     */
    private String computeEnvironment;
    /**
     * <p>
     * The state of the compute environment. Compute environments in the <code>ENABLED</code> state can accept jobs from
     * a queue and scale in or out automatically based on the workload demand of its associated queues.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Details of the compute resources managed by the compute environment. Required for a managed compute environment.
     * </p>
     */
    private ComputeResourceUpdate computeResources;
    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on
     * your behalf.
     * </p>
     * <p>
     * If your specified role has a path other than <code>/</code>, then you must either specify the full role ARN (this
     * is recommended) or prefix the role name with the path.
     * </p>
     * <note>
     * <p>
     * Depending on how you created your AWS Batch service role, its ARN may contain the <code>service-role</code> path
     * prefix. When you only specify the name of the service role, AWS Batch assumes that your ARN does not use the
     * <code>service-role</code> path prefix. Because of this, we recommend that you specify the full ARN of your
     * service role when you create compute environments.
     * </p>
     * </note>
     */
    private String serviceRole;

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the compute environment to update.
     * </p>
     * 
     * @param computeEnvironment
     *        The name or full Amazon Resource Name (ARN) of the compute environment to update.
     */

    public void setComputeEnvironment(String computeEnvironment) {
        this.computeEnvironment = computeEnvironment;
    }

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the compute environment to update.
     * </p>
     * 
     * @return The name or full Amazon Resource Name (ARN) of the compute environment to update.
     */

    public String getComputeEnvironment() {
        return this.computeEnvironment;
    }

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the compute environment to update.
     * </p>
     * 
     * @param computeEnvironment
     *        The name or full Amazon Resource Name (ARN) of the compute environment to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComputeEnvironmentRequest withComputeEnvironment(String computeEnvironment) {
        setComputeEnvironment(computeEnvironment);
        return this;
    }

    /**
     * <p>
     * The state of the compute environment. Compute environments in the <code>ENABLED</code> state can accept jobs from
     * a queue and scale in or out automatically based on the workload demand of its associated queues.
     * </p>
     * 
     * @param state
     *        The state of the compute environment. Compute environments in the <code>ENABLED</code> state can accept
     *        jobs from a queue and scale in or out automatically based on the workload demand of its associated queues.
     * @see CEState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the compute environment. Compute environments in the <code>ENABLED</code> state can accept jobs from
     * a queue and scale in or out automatically based on the workload demand of its associated queues.
     * </p>
     * 
     * @return The state of the compute environment. Compute environments in the <code>ENABLED</code> state can accept
     *         jobs from a queue and scale in or out automatically based on the workload demand of its associated
     *         queues.
     * @see CEState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the compute environment. Compute environments in the <code>ENABLED</code> state can accept jobs from
     * a queue and scale in or out automatically based on the workload demand of its associated queues.
     * </p>
     * 
     * @param state
     *        The state of the compute environment. Compute environments in the <code>ENABLED</code> state can accept
     *        jobs from a queue and scale in or out automatically based on the workload demand of its associated queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CEState
     */

    public UpdateComputeEnvironmentRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the compute environment. Compute environments in the <code>ENABLED</code> state can accept jobs from
     * a queue and scale in or out automatically based on the workload demand of its associated queues.
     * </p>
     * 
     * @param state
     *        The state of the compute environment. Compute environments in the <code>ENABLED</code> state can accept
     *        jobs from a queue and scale in or out automatically based on the workload demand of its associated queues.
     * @see CEState
     */

    public void setState(CEState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the compute environment. Compute environments in the <code>ENABLED</code> state can accept jobs from
     * a queue and scale in or out automatically based on the workload demand of its associated queues.
     * </p>
     * 
     * @param state
     *        The state of the compute environment. Compute environments in the <code>ENABLED</code> state can accept
     *        jobs from a queue and scale in or out automatically based on the workload demand of its associated queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CEState
     */

    public UpdateComputeEnvironmentRequest withState(CEState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Details of the compute resources managed by the compute environment. Required for a managed compute environment.
     * </p>
     * 
     * @param computeResources
     *        Details of the compute resources managed by the compute environment. Required for a managed compute
     *        environment.
     */

    public void setComputeResources(ComputeResourceUpdate computeResources) {
        this.computeResources = computeResources;
    }

    /**
     * <p>
     * Details of the compute resources managed by the compute environment. Required for a managed compute environment.
     * </p>
     * 
     * @return Details of the compute resources managed by the compute environment. Required for a managed compute
     *         environment.
     */

    public ComputeResourceUpdate getComputeResources() {
        return this.computeResources;
    }

    /**
     * <p>
     * Details of the compute resources managed by the compute environment. Required for a managed compute environment.
     * </p>
     * 
     * @param computeResources
     *        Details of the compute resources managed by the compute environment. Required for a managed compute
     *        environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComputeEnvironmentRequest withComputeResources(ComputeResourceUpdate computeResources) {
        setComputeResources(computeResources);
        return this;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on
     * your behalf.
     * </p>
     * <p>
     * If your specified role has a path other than <code>/</code>, then you must either specify the full role ARN (this
     * is recommended) or prefix the role name with the path.
     * </p>
     * <note>
     * <p>
     * Depending on how you created your AWS Batch service role, its ARN may contain the <code>service-role</code> path
     * prefix. When you only specify the name of the service role, AWS Batch assumes that your ARN does not use the
     * <code>service-role</code> path prefix. Because of this, we recommend that you specify the full ARN of your
     * service role when you create compute environments.
     * </p>
     * </note>
     * 
     * @param serviceRole
     *        The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS
     *        services on your behalf.</p>
     *        <p>
     *        If your specified role has a path other than <code>/</code>, then you must either specify the full role
     *        ARN (this is recommended) or prefix the role name with the path.
     *        </p>
     *        <note>
     *        <p>
     *        Depending on how you created your AWS Batch service role, its ARN may contain the
     *        <code>service-role</code> path prefix. When you only specify the name of the service role, AWS Batch
     *        assumes that your ARN does not use the <code>service-role</code> path prefix. Because of this, we
     *        recommend that you specify the full ARN of your service role when you create compute environments.
     *        </p>
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on
     * your behalf.
     * </p>
     * <p>
     * If your specified role has a path other than <code>/</code>, then you must either specify the full role ARN (this
     * is recommended) or prefix the role name with the path.
     * </p>
     * <note>
     * <p>
     * Depending on how you created your AWS Batch service role, its ARN may contain the <code>service-role</code> path
     * prefix. When you only specify the name of the service role, AWS Batch assumes that your ARN does not use the
     * <code>service-role</code> path prefix. Because of this, we recommend that you specify the full ARN of your
     * service role when you create compute environments.
     * </p>
     * </note>
     * 
     * @return The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS
     *         services on your behalf.</p>
     *         <p>
     *         If your specified role has a path other than <code>/</code>, then you must either specify the full role
     *         ARN (this is recommended) or prefix the role name with the path.
     *         </p>
     *         <note>
     *         <p>
     *         Depending on how you created your AWS Batch service role, its ARN may contain the
     *         <code>service-role</code> path prefix. When you only specify the name of the service role, AWS Batch
     *         assumes that your ARN does not use the <code>service-role</code> path prefix. Because of this, we
     *         recommend that you specify the full ARN of your service role when you create compute environments.
     *         </p>
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on
     * your behalf.
     * </p>
     * <p>
     * If your specified role has a path other than <code>/</code>, then you must either specify the full role ARN (this
     * is recommended) or prefix the role name with the path.
     * </p>
     * <note>
     * <p>
     * Depending on how you created your AWS Batch service role, its ARN may contain the <code>service-role</code> path
     * prefix. When you only specify the name of the service role, AWS Batch assumes that your ARN does not use the
     * <code>service-role</code> path prefix. Because of this, we recommend that you specify the full ARN of your
     * service role when you create compute environments.
     * </p>
     * </note>
     * 
     * @param serviceRole
     *        The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS
     *        services on your behalf.</p>
     *        <p>
     *        If your specified role has a path other than <code>/</code>, then you must either specify the full role
     *        ARN (this is recommended) or prefix the role name with the path.
     *        </p>
     *        <note>
     *        <p>
     *        Depending on how you created your AWS Batch service role, its ARN may contain the
     *        <code>service-role</code> path prefix. When you only specify the name of the service role, AWS Batch
     *        assumes that your ARN does not use the <code>service-role</code> path prefix. Because of this, we
     *        recommend that you specify the full ARN of your service role when you create compute environments.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComputeEnvironmentRequest withServiceRole(String serviceRole) {
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
        if (getComputeEnvironment() != null)
            sb.append("ComputeEnvironment: ").append(getComputeEnvironment()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof UpdateComputeEnvironmentRequest == false)
            return false;
        UpdateComputeEnvironmentRequest other = (UpdateComputeEnvironmentRequest) obj;
        if (other.getComputeEnvironment() == null ^ this.getComputeEnvironment() == null)
            return false;
        if (other.getComputeEnvironment() != null && other.getComputeEnvironment().equals(this.getComputeEnvironment()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getComputeEnvironment() == null) ? 0 : getComputeEnvironment().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getComputeResources() == null) ? 0 : getComputeResources().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        return hashCode;
    }

    @Override
    public UpdateComputeEnvironmentRequest clone() {
        return (UpdateComputeEnvironmentRequest) super.clone();
    }

}
