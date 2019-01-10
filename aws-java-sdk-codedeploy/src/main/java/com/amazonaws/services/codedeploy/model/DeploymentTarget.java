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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the deployment target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeploymentTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The deployment type that is specific to the deployment's compute platform.
     * </p>
     */
    private String deploymentTargetType;
    /**
     * <p>
     * Information about the target for a deployment that uses the EC2/On-premises compute platform.
     * </p>
     */
    private InstanceTarget instanceTarget;
    /**
     * <p>
     * Information about the target for a deployment that uses the AWS Lambda compute platform.
     * </p>
     */
    private LambdaTarget lambdaTarget;
    /**
     * <p>
     * Information about the target for a deployment that uses the Amazon ECS compute platform.
     * </p>
     */
    private ECSTarget ecsTarget;

    /**
     * <p>
     * The deployment type that is specific to the deployment's compute platform.
     * </p>
     * 
     * @param deploymentTargetType
     *        The deployment type that is specific to the deployment's compute platform.
     * @see DeploymentTargetType
     */

    public void setDeploymentTargetType(String deploymentTargetType) {
        this.deploymentTargetType = deploymentTargetType;
    }

    /**
     * <p>
     * The deployment type that is specific to the deployment's compute platform.
     * </p>
     * 
     * @return The deployment type that is specific to the deployment's compute platform.
     * @see DeploymentTargetType
     */

    public String getDeploymentTargetType() {
        return this.deploymentTargetType;
    }

    /**
     * <p>
     * The deployment type that is specific to the deployment's compute platform.
     * </p>
     * 
     * @param deploymentTargetType
     *        The deployment type that is specific to the deployment's compute platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentTargetType
     */

    public DeploymentTarget withDeploymentTargetType(String deploymentTargetType) {
        setDeploymentTargetType(deploymentTargetType);
        return this;
    }

    /**
     * <p>
     * The deployment type that is specific to the deployment's compute platform.
     * </p>
     * 
     * @param deploymentTargetType
     *        The deployment type that is specific to the deployment's compute platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentTargetType
     */

    public DeploymentTarget withDeploymentTargetType(DeploymentTargetType deploymentTargetType) {
        this.deploymentTargetType = deploymentTargetType.toString();
        return this;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the EC2/On-premises compute platform.
     * </p>
     * 
     * @param instanceTarget
     *        Information about the target for a deployment that uses the EC2/On-premises compute platform.
     */

    public void setInstanceTarget(InstanceTarget instanceTarget) {
        this.instanceTarget = instanceTarget;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the EC2/On-premises compute platform.
     * </p>
     * 
     * @return Information about the target for a deployment that uses the EC2/On-premises compute platform.
     */

    public InstanceTarget getInstanceTarget() {
        return this.instanceTarget;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the EC2/On-premises compute platform.
     * </p>
     * 
     * @param instanceTarget
     *        Information about the target for a deployment that uses the EC2/On-premises compute platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentTarget withInstanceTarget(InstanceTarget instanceTarget) {
        setInstanceTarget(instanceTarget);
        return this;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the AWS Lambda compute platform.
     * </p>
     * 
     * @param lambdaTarget
     *        Information about the target for a deployment that uses the AWS Lambda compute platform.
     */

    public void setLambdaTarget(LambdaTarget lambdaTarget) {
        this.lambdaTarget = lambdaTarget;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the AWS Lambda compute platform.
     * </p>
     * 
     * @return Information about the target for a deployment that uses the AWS Lambda compute platform.
     */

    public LambdaTarget getLambdaTarget() {
        return this.lambdaTarget;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the AWS Lambda compute platform.
     * </p>
     * 
     * @param lambdaTarget
     *        Information about the target for a deployment that uses the AWS Lambda compute platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentTarget withLambdaTarget(LambdaTarget lambdaTarget) {
        setLambdaTarget(lambdaTarget);
        return this;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the Amazon ECS compute platform.
     * </p>
     * 
     * @param ecsTarget
     *        Information about the target for a deployment that uses the Amazon ECS compute platform.
     */

    public void setEcsTarget(ECSTarget ecsTarget) {
        this.ecsTarget = ecsTarget;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the Amazon ECS compute platform.
     * </p>
     * 
     * @return Information about the target for a deployment that uses the Amazon ECS compute platform.
     */

    public ECSTarget getEcsTarget() {
        return this.ecsTarget;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the Amazon ECS compute platform.
     * </p>
     * 
     * @param ecsTarget
     *        Information about the target for a deployment that uses the Amazon ECS compute platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentTarget withEcsTarget(ECSTarget ecsTarget) {
        setEcsTarget(ecsTarget);
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
        if (getDeploymentTargetType() != null)
            sb.append("DeploymentTargetType: ").append(getDeploymentTargetType()).append(",");
        if (getInstanceTarget() != null)
            sb.append("InstanceTarget: ").append(getInstanceTarget()).append(",");
        if (getLambdaTarget() != null)
            sb.append("LambdaTarget: ").append(getLambdaTarget()).append(",");
        if (getEcsTarget() != null)
            sb.append("EcsTarget: ").append(getEcsTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentTarget == false)
            return false;
        DeploymentTarget other = (DeploymentTarget) obj;
        if (other.getDeploymentTargetType() == null ^ this.getDeploymentTargetType() == null)
            return false;
        if (other.getDeploymentTargetType() != null && other.getDeploymentTargetType().equals(this.getDeploymentTargetType()) == false)
            return false;
        if (other.getInstanceTarget() == null ^ this.getInstanceTarget() == null)
            return false;
        if (other.getInstanceTarget() != null && other.getInstanceTarget().equals(this.getInstanceTarget()) == false)
            return false;
        if (other.getLambdaTarget() == null ^ this.getLambdaTarget() == null)
            return false;
        if (other.getLambdaTarget() != null && other.getLambdaTarget().equals(this.getLambdaTarget()) == false)
            return false;
        if (other.getEcsTarget() == null ^ this.getEcsTarget() == null)
            return false;
        if (other.getEcsTarget() != null && other.getEcsTarget().equals(this.getEcsTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentTargetType() == null) ? 0 : getDeploymentTargetType().hashCode());
        hashCode = prime * hashCode + ((getInstanceTarget() == null) ? 0 : getInstanceTarget().hashCode());
        hashCode = prime * hashCode + ((getLambdaTarget() == null) ? 0 : getLambdaTarget().hashCode());
        hashCode = prime * hashCode + ((getEcsTarget() == null) ? 0 : getEcsTarget().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentTarget clone() {
        try {
            return (DeploymentTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.DeploymentTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
