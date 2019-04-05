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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeploymentTargets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetDeploymentTargetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The unique IDs of the deployment targets. The compute platform of the deployment determines the type of the
     * targets and their formats.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For deployments that use the EC2/On-premises compute platform, the target IDs are EC2 or on-premises instances
     * IDs, and their target type is <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the AWS Lambda compute platform, the target IDs are the names of Lambda functions, and
     * their target type is <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the Amazon ECS compute platform, the target IDs are pairs of Amazon ECS clusters and
     * services specified using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their target type is
     * <code>ecsTarget</code>.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> targetIds;

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @return The unique ID of a deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDeploymentTargetsRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The unique IDs of the deployment targets. The compute platform of the deployment determines the type of the
     * targets and their formats.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For deployments that use the EC2/On-premises compute platform, the target IDs are EC2 or on-premises instances
     * IDs, and their target type is <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the AWS Lambda compute platform, the target IDs are the names of Lambda functions, and
     * their target type is <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the Amazon ECS compute platform, the target IDs are pairs of Amazon ECS clusters and
     * services specified using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their target type is
     * <code>ecsTarget</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The unique IDs of the deployment targets. The compute platform of the deployment determines the type of
     *         the targets and their formats. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For deployments that use the EC2/On-premises compute platform, the target IDs are EC2 or on-premises
     *         instances IDs, and their target type is <code>instanceTarget</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For deployments that use the AWS Lambda compute platform, the target IDs are the names of Lambda
     *         functions, and their target type is <code>instanceTarget</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For deployments that use the Amazon ECS compute platform, the target IDs are pairs of Amazon ECS clusters
     *         and services specified using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their
     *         target type is <code>ecsTarget</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getTargetIds() {
        if (targetIds == null) {
            targetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return targetIds;
    }

    /**
     * <p>
     * The unique IDs of the deployment targets. The compute platform of the deployment determines the type of the
     * targets and their formats.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For deployments that use the EC2/On-premises compute platform, the target IDs are EC2 or on-premises instances
     * IDs, and their target type is <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the AWS Lambda compute platform, the target IDs are the names of Lambda functions, and
     * their target type is <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the Amazon ECS compute platform, the target IDs are pairs of Amazon ECS clusters and
     * services specified using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their target type is
     * <code>ecsTarget</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetIds
     *        The unique IDs of the deployment targets. The compute platform of the deployment determines the type of
     *        the targets and their formats. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For deployments that use the EC2/On-premises compute platform, the target IDs are EC2 or on-premises
     *        instances IDs, and their target type is <code>instanceTarget</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For deployments that use the AWS Lambda compute platform, the target IDs are the names of Lambda
     *        functions, and their target type is <code>instanceTarget</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For deployments that use the Amazon ECS compute platform, the target IDs are pairs of Amazon ECS clusters
     *        and services specified using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their target
     *        type is <code>ecsTarget</code>.
     *        </p>
     *        </li>
     */

    public void setTargetIds(java.util.Collection<String> targetIds) {
        if (targetIds == null) {
            this.targetIds = null;
            return;
        }

        this.targetIds = new com.amazonaws.internal.SdkInternalList<String>(targetIds);
    }

    /**
     * <p>
     * The unique IDs of the deployment targets. The compute platform of the deployment determines the type of the
     * targets and their formats.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For deployments that use the EC2/On-premises compute platform, the target IDs are EC2 or on-premises instances
     * IDs, and their target type is <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the AWS Lambda compute platform, the target IDs are the names of Lambda functions, and
     * their target type is <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the Amazon ECS compute platform, the target IDs are pairs of Amazon ECS clusters and
     * services specified using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their target type is
     * <code>ecsTarget</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetIds(java.util.Collection)} or {@link #withTargetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetIds
     *        The unique IDs of the deployment targets. The compute platform of the deployment determines the type of
     *        the targets and their formats. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For deployments that use the EC2/On-premises compute platform, the target IDs are EC2 or on-premises
     *        instances IDs, and their target type is <code>instanceTarget</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For deployments that use the AWS Lambda compute platform, the target IDs are the names of Lambda
     *        functions, and their target type is <code>instanceTarget</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For deployments that use the Amazon ECS compute platform, the target IDs are pairs of Amazon ECS clusters
     *        and services specified using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their target
     *        type is <code>ecsTarget</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDeploymentTargetsRequest withTargetIds(String... targetIds) {
        if (this.targetIds == null) {
            setTargetIds(new com.amazonaws.internal.SdkInternalList<String>(targetIds.length));
        }
        for (String ele : targetIds) {
            this.targetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique IDs of the deployment targets. The compute platform of the deployment determines the type of the
     * targets and their formats.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For deployments that use the EC2/On-premises compute platform, the target IDs are EC2 or on-premises instances
     * IDs, and their target type is <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the AWS Lambda compute platform, the target IDs are the names of Lambda functions, and
     * their target type is <code>instanceTarget</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deployments that use the Amazon ECS compute platform, the target IDs are pairs of Amazon ECS clusters and
     * services specified using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their target type is
     * <code>ecsTarget</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetIds
     *        The unique IDs of the deployment targets. The compute platform of the deployment determines the type of
     *        the targets and their formats. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For deployments that use the EC2/On-premises compute platform, the target IDs are EC2 or on-premises
     *        instances IDs, and their target type is <code>instanceTarget</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For deployments that use the AWS Lambda compute platform, the target IDs are the names of Lambda
     *        functions, and their target type is <code>instanceTarget</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For deployments that use the Amazon ECS compute platform, the target IDs are pairs of Amazon ECS clusters
     *        and services specified using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>. Their target
     *        type is <code>ecsTarget</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDeploymentTargetsRequest withTargetIds(java.util.Collection<String> targetIds) {
        setTargetIds(targetIds);
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
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getTargetIds() != null)
            sb.append("TargetIds: ").append(getTargetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDeploymentTargetsRequest == false)
            return false;
        BatchGetDeploymentTargetsRequest other = (BatchGetDeploymentTargetsRequest) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getTargetIds() == null ^ this.getTargetIds() == null)
            return false;
        if (other.getTargetIds() != null && other.getTargetIds().equals(this.getTargetIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getTargetIds() == null) ? 0 : getTargetIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetDeploymentTargetsRequest clone() {
        return (BatchGetDeploymentTargetsRequest) super.clone();
    }

}
