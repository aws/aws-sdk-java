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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeploymentTargets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetDeploymentTargetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of target objects for a deployment. Each target object contains details about the target, such as its
     * status and lifecycle events. The type of the target objects depends on the deployment' compute platform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2/On-premises</b>: Each target object is an EC2 or on-premises instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Lambda</b>: The target object is a specific version of an AWS Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<DeploymentTarget> deploymentTargets;

    /**
     * <p>
     * A list of target objects for a deployment. Each target object contains details about the target, such as its
     * status and lifecycle events. The type of the target objects depends on the deployment' compute platform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2/On-premises</b>: Each target object is an EC2 or on-premises instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Lambda</b>: The target object is a specific version of an AWS Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of target objects for a deployment. Each target object contains details about the target, such as
     *         its status and lifecycle events. The type of the target objects depends on the deployment' compute
     *         platform. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>EC2/On-premises</b>: Each target object is an EC2 or on-premises instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AWS Lambda</b>: The target object is a specific version of an AWS Lambda function.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     *         </p>
     *         </li>
     */

    public java.util.List<DeploymentTarget> getDeploymentTargets() {
        if (deploymentTargets == null) {
            deploymentTargets = new com.amazonaws.internal.SdkInternalList<DeploymentTarget>();
        }
        return deploymentTargets;
    }

    /**
     * <p>
     * A list of target objects for a deployment. Each target object contains details about the target, such as its
     * status and lifecycle events. The type of the target objects depends on the deployment' compute platform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2/On-premises</b>: Each target object is an EC2 or on-premises instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Lambda</b>: The target object is a specific version of an AWS Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentTargets
     *        A list of target objects for a deployment. Each target object contains details about the target, such as
     *        its status and lifecycle events. The type of the target objects depends on the deployment' compute
     *        platform. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>EC2/On-premises</b>: Each target object is an EC2 or on-premises instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS Lambda</b>: The target object is a specific version of an AWS Lambda function.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     *        </p>
     *        </li>
     */

    public void setDeploymentTargets(java.util.Collection<DeploymentTarget> deploymentTargets) {
        if (deploymentTargets == null) {
            this.deploymentTargets = null;
            return;
        }

        this.deploymentTargets = new com.amazonaws.internal.SdkInternalList<DeploymentTarget>(deploymentTargets);
    }

    /**
     * <p>
     * A list of target objects for a deployment. Each target object contains details about the target, such as its
     * status and lifecycle events. The type of the target objects depends on the deployment' compute platform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2/On-premises</b>: Each target object is an EC2 or on-premises instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Lambda</b>: The target object is a specific version of an AWS Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentTargets(java.util.Collection)} or {@link #withDeploymentTargets(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param deploymentTargets
     *        A list of target objects for a deployment. Each target object contains details about the target, such as
     *        its status and lifecycle events. The type of the target objects depends on the deployment' compute
     *        platform. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>EC2/On-premises</b>: Each target object is an EC2 or on-premises instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS Lambda</b>: The target object is a specific version of an AWS Lambda function.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDeploymentTargetsResult withDeploymentTargets(DeploymentTarget... deploymentTargets) {
        if (this.deploymentTargets == null) {
            setDeploymentTargets(new com.amazonaws.internal.SdkInternalList<DeploymentTarget>(deploymentTargets.length));
        }
        for (DeploymentTarget ele : deploymentTargets) {
            this.deploymentTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of target objects for a deployment. Each target object contains details about the target, such as its
     * status and lifecycle events. The type of the target objects depends on the deployment' compute platform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2/On-premises</b>: Each target object is an EC2 or on-premises instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Lambda</b>: The target object is a specific version of an AWS Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentTargets
     *        A list of target objects for a deployment. Each target object contains details about the target, such as
     *        its status and lifecycle events. The type of the target objects depends on the deployment' compute
     *        platform. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>EC2/On-premises</b>: Each target object is an EC2 or on-premises instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS Lambda</b>: The target object is a specific version of an AWS Lambda function.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDeploymentTargetsResult withDeploymentTargets(java.util.Collection<DeploymentTarget> deploymentTargets) {
        setDeploymentTargets(deploymentTargets);
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
        if (getDeploymentTargets() != null)
            sb.append("DeploymentTargets: ").append(getDeploymentTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDeploymentTargetsResult == false)
            return false;
        BatchGetDeploymentTargetsResult other = (BatchGetDeploymentTargetsResult) obj;
        if (other.getDeploymentTargets() == null ^ this.getDeploymentTargets() == null)
            return false;
        if (other.getDeploymentTargets() != null && other.getDeploymentTargets().equals(this.getDeploymentTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentTargets() == null) ? 0 : getDeploymentTargets().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetDeploymentTargetsResult clone() {
        try {
            return (BatchGetDeploymentTargetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
