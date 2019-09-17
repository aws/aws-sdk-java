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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CreateComputeEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateComputeEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     */
    private String computeEnvironmentName;
    /**
     * <p>
     * The type of the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute Environments</a> in
     * the <i>AWS Batch User Guide</i>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The state of the compute environment. If the state is <code>ENABLED</code>, then the compute environment accepts
     * jobs from a queue and can scale out automatically based on queues.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Details of the compute resources managed by the compute environment. This parameter is required for managed
     * compute environments. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute Environments</a> in
     * the <i>AWS Batch User Guide</i>.
     * </p>
     */
    private ComputeResource computeResources;
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
     * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     * 
     * @param computeEnvironmentName
     *        The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and
     *        underscores are allowed.
     */

    public void setComputeEnvironmentName(String computeEnvironmentName) {
        this.computeEnvironmentName = computeEnvironmentName;
    }

    /**
     * <p>
     * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     * 
     * @return The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and
     *         underscores are allowed.
     */

    public String getComputeEnvironmentName() {
        return this.computeEnvironmentName;
    }

    /**
     * <p>
     * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     * 
     * @param computeEnvironmentName
     *        The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, hyphens, and
     *        underscores are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComputeEnvironmentRequest withComputeEnvironmentName(String computeEnvironmentName) {
        setComputeEnvironmentName(computeEnvironmentName);
        return this;
    }

    /**
     * <p>
     * The type of the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute Environments</a> in
     * the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of the compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute
     *        Environments</a> in the <i>AWS Batch User Guide</i>.
     * @see CEType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute Environments</a> in
     * the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @return The type of the compute environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute
     *         Environments</a> in the <i>AWS Batch User Guide</i>.
     * @see CEType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute Environments</a> in
     * the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of the compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute
     *        Environments</a> in the <i>AWS Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CEType
     */

    public CreateComputeEnvironmentRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute Environments</a> in
     * the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of the compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute
     *        Environments</a> in the <i>AWS Batch User Guide</i>.
     * @see CEType
     */

    public void setType(CEType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of the compute environment. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute Environments</a> in
     * the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of the compute environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute
     *        Environments</a> in the <i>AWS Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CEType
     */

    public CreateComputeEnvironmentRequest withType(CEType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The state of the compute environment. If the state is <code>ENABLED</code>, then the compute environment accepts
     * jobs from a queue and can scale out automatically based on queues.
     * </p>
     * 
     * @param state
     *        The state of the compute environment. If the state is <code>ENABLED</code>, then the compute environment
     *        accepts jobs from a queue and can scale out automatically based on queues.
     * @see CEState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the compute environment. If the state is <code>ENABLED</code>, then the compute environment accepts
     * jobs from a queue and can scale out automatically based on queues.
     * </p>
     * 
     * @return The state of the compute environment. If the state is <code>ENABLED</code>, then the compute environment
     *         accepts jobs from a queue and can scale out automatically based on queues.
     * @see CEState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the compute environment. If the state is <code>ENABLED</code>, then the compute environment accepts
     * jobs from a queue and can scale out automatically based on queues.
     * </p>
     * 
     * @param state
     *        The state of the compute environment. If the state is <code>ENABLED</code>, then the compute environment
     *        accepts jobs from a queue and can scale out automatically based on queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CEState
     */

    public CreateComputeEnvironmentRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the compute environment. If the state is <code>ENABLED</code>, then the compute environment accepts
     * jobs from a queue and can scale out automatically based on queues.
     * </p>
     * 
     * @param state
     *        The state of the compute environment. If the state is <code>ENABLED</code>, then the compute environment
     *        accepts jobs from a queue and can scale out automatically based on queues.
     * @see CEState
     */

    public void setState(CEState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the compute environment. If the state is <code>ENABLED</code>, then the compute environment accepts
     * jobs from a queue and can scale out automatically based on queues.
     * </p>
     * 
     * @param state
     *        The state of the compute environment. If the state is <code>ENABLED</code>, then the compute environment
     *        accepts jobs from a queue and can scale out automatically based on queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CEState
     */

    public CreateComputeEnvironmentRequest withState(CEState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Details of the compute resources managed by the compute environment. This parameter is required for managed
     * compute environments. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute Environments</a> in
     * the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param computeResources
     *        Details of the compute resources managed by the compute environment. This parameter is required for
     *        managed compute environments. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute
     *        Environments</a> in the <i>AWS Batch User Guide</i>.
     */

    public void setComputeResources(ComputeResource computeResources) {
        this.computeResources = computeResources;
    }

    /**
     * <p>
     * Details of the compute resources managed by the compute environment. This parameter is required for managed
     * compute environments. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute Environments</a> in
     * the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @return Details of the compute resources managed by the compute environment. This parameter is required for
     *         managed compute environments. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute
     *         Environments</a> in the <i>AWS Batch User Guide</i>.
     */

    public ComputeResource getComputeResources() {
        return this.computeResources;
    }

    /**
     * <p>
     * Details of the compute resources managed by the compute environment. This parameter is required for managed
     * compute environments. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute Environments</a> in
     * the <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param computeResources
     *        Details of the compute resources managed by the compute environment. This parameter is required for
     *        managed compute environments. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute
     *        Environments</a> in the <i>AWS Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComputeEnvironmentRequest withComputeResources(ComputeResource computeResources) {
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

    public CreateComputeEnvironmentRequest withServiceRole(String serviceRole) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof CreateComputeEnvironmentRequest == false)
            return false;
        CreateComputeEnvironmentRequest other = (CreateComputeEnvironmentRequest) obj;
        if (other.getComputeEnvironmentName() == null ^ this.getComputeEnvironmentName() == null)
            return false;
        if (other.getComputeEnvironmentName() != null && other.getComputeEnvironmentName().equals(this.getComputeEnvironmentName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getComputeEnvironmentName() == null) ? 0 : getComputeEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getComputeResources() == null) ? 0 : getComputeResources().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        return hashCode;
    }

    @Override
    public CreateComputeEnvironmentRequest clone() {
        return (CreateComputeEnvironmentRequest) super.clone();
    }

}
