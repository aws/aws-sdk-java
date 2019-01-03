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
 * Information about blue/green deployment options for a deployment group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BlueGreenDeploymentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlueGreenDeploymentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about whether to terminate instances in the original fleet during a blue/green deployment.
     * </p>
     */
    private BlueInstanceTerminationOption terminateBlueInstancesOnDeploymentSuccess;
    /**
     * <p>
     * Information about the action to take when newly provisioned instances are ready to receive traffic in a
     * blue/green deployment.
     * </p>
     */
    private DeploymentReadyOption deploymentReadyOption;
    /**
     * <p>
     * Information about how instances are provisioned for a replacement environment in a blue/green deployment.
     * </p>
     */
    private GreenFleetProvisioningOption greenFleetProvisioningOption;

    /**
     * <p>
     * Information about whether to terminate instances in the original fleet during a blue/green deployment.
     * </p>
     * 
     * @param terminateBlueInstancesOnDeploymentSuccess
     *        Information about whether to terminate instances in the original fleet during a blue/green deployment.
     */

    public void setTerminateBlueInstancesOnDeploymentSuccess(BlueInstanceTerminationOption terminateBlueInstancesOnDeploymentSuccess) {
        this.terminateBlueInstancesOnDeploymentSuccess = terminateBlueInstancesOnDeploymentSuccess;
    }

    /**
     * <p>
     * Information about whether to terminate instances in the original fleet during a blue/green deployment.
     * </p>
     * 
     * @return Information about whether to terminate instances in the original fleet during a blue/green deployment.
     */

    public BlueInstanceTerminationOption getTerminateBlueInstancesOnDeploymentSuccess() {
        return this.terminateBlueInstancesOnDeploymentSuccess;
    }

    /**
     * <p>
     * Information about whether to terminate instances in the original fleet during a blue/green deployment.
     * </p>
     * 
     * @param terminateBlueInstancesOnDeploymentSuccess
     *        Information about whether to terminate instances in the original fleet during a blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeploymentConfiguration withTerminateBlueInstancesOnDeploymentSuccess(
            BlueInstanceTerminationOption terminateBlueInstancesOnDeploymentSuccess) {
        setTerminateBlueInstancesOnDeploymentSuccess(terminateBlueInstancesOnDeploymentSuccess);
        return this;
    }

    /**
     * <p>
     * Information about the action to take when newly provisioned instances are ready to receive traffic in a
     * blue/green deployment.
     * </p>
     * 
     * @param deploymentReadyOption
     *        Information about the action to take when newly provisioned instances are ready to receive traffic in a
     *        blue/green deployment.
     */

    public void setDeploymentReadyOption(DeploymentReadyOption deploymentReadyOption) {
        this.deploymentReadyOption = deploymentReadyOption;
    }

    /**
     * <p>
     * Information about the action to take when newly provisioned instances are ready to receive traffic in a
     * blue/green deployment.
     * </p>
     * 
     * @return Information about the action to take when newly provisioned instances are ready to receive traffic in a
     *         blue/green deployment.
     */

    public DeploymentReadyOption getDeploymentReadyOption() {
        return this.deploymentReadyOption;
    }

    /**
     * <p>
     * Information about the action to take when newly provisioned instances are ready to receive traffic in a
     * blue/green deployment.
     * </p>
     * 
     * @param deploymentReadyOption
     *        Information about the action to take when newly provisioned instances are ready to receive traffic in a
     *        blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeploymentConfiguration withDeploymentReadyOption(DeploymentReadyOption deploymentReadyOption) {
        setDeploymentReadyOption(deploymentReadyOption);
        return this;
    }

    /**
     * <p>
     * Information about how instances are provisioned for a replacement environment in a blue/green deployment.
     * </p>
     * 
     * @param greenFleetProvisioningOption
     *        Information about how instances are provisioned for a replacement environment in a blue/green deployment.
     */

    public void setGreenFleetProvisioningOption(GreenFleetProvisioningOption greenFleetProvisioningOption) {
        this.greenFleetProvisioningOption = greenFleetProvisioningOption;
    }

    /**
     * <p>
     * Information about how instances are provisioned for a replacement environment in a blue/green deployment.
     * </p>
     * 
     * @return Information about how instances are provisioned for a replacement environment in a blue/green deployment.
     */

    public GreenFleetProvisioningOption getGreenFleetProvisioningOption() {
        return this.greenFleetProvisioningOption;
    }

    /**
     * <p>
     * Information about how instances are provisioned for a replacement environment in a blue/green deployment.
     * </p>
     * 
     * @param greenFleetProvisioningOption
     *        Information about how instances are provisioned for a replacement environment in a blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeploymentConfiguration withGreenFleetProvisioningOption(GreenFleetProvisioningOption greenFleetProvisioningOption) {
        setGreenFleetProvisioningOption(greenFleetProvisioningOption);
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
        if (getTerminateBlueInstancesOnDeploymentSuccess() != null)
            sb.append("TerminateBlueInstancesOnDeploymentSuccess: ").append(getTerminateBlueInstancesOnDeploymentSuccess()).append(",");
        if (getDeploymentReadyOption() != null)
            sb.append("DeploymentReadyOption: ").append(getDeploymentReadyOption()).append(",");
        if (getGreenFleetProvisioningOption() != null)
            sb.append("GreenFleetProvisioningOption: ").append(getGreenFleetProvisioningOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlueGreenDeploymentConfiguration == false)
            return false;
        BlueGreenDeploymentConfiguration other = (BlueGreenDeploymentConfiguration) obj;
        if (other.getTerminateBlueInstancesOnDeploymentSuccess() == null ^ this.getTerminateBlueInstancesOnDeploymentSuccess() == null)
            return false;
        if (other.getTerminateBlueInstancesOnDeploymentSuccess() != null
                && other.getTerminateBlueInstancesOnDeploymentSuccess().equals(this.getTerminateBlueInstancesOnDeploymentSuccess()) == false)
            return false;
        if (other.getDeploymentReadyOption() == null ^ this.getDeploymentReadyOption() == null)
            return false;
        if (other.getDeploymentReadyOption() != null && other.getDeploymentReadyOption().equals(this.getDeploymentReadyOption()) == false)
            return false;
        if (other.getGreenFleetProvisioningOption() == null ^ this.getGreenFleetProvisioningOption() == null)
            return false;
        if (other.getGreenFleetProvisioningOption() != null && other.getGreenFleetProvisioningOption().equals(this.getGreenFleetProvisioningOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTerminateBlueInstancesOnDeploymentSuccess() == null) ? 0 : getTerminateBlueInstancesOnDeploymentSuccess().hashCode());
        hashCode = prime * hashCode + ((getDeploymentReadyOption() == null) ? 0 : getDeploymentReadyOption().hashCode());
        hashCode = prime * hashCode + ((getGreenFleetProvisioningOption() == null) ? 0 : getGreenFleetProvisioningOption().hashCode());
        return hashCode;
    }

    @Override
    public BlueGreenDeploymentConfiguration clone() {
        try {
            return (BlueGreenDeploymentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.BlueGreenDeploymentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
