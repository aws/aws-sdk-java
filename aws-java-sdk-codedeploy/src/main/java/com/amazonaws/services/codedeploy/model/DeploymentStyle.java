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
 * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route
 * deployment traffic behind a load balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeploymentStyle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentStyle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether to run an in-place deployment or a blue/green deployment.
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * Indicates whether to route deployment traffic behind a load balancer.
     * </p>
     */
    private String deploymentOption;

    /**
     * <p>
     * Indicates whether to run an in-place deployment or a blue/green deployment.
     * </p>
     * 
     * @param deploymentType
     *        Indicates whether to run an in-place deployment or a blue/green deployment.
     * @see DeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Indicates whether to run an in-place deployment or a blue/green deployment.
     * </p>
     * 
     * @return Indicates whether to run an in-place deployment or a blue/green deployment.
     * @see DeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * Indicates whether to run an in-place deployment or a blue/green deployment.
     * </p>
     * 
     * @param deploymentType
     *        Indicates whether to run an in-place deployment or a blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public DeploymentStyle withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * Indicates whether to run an in-place deployment or a blue/green deployment.
     * </p>
     * 
     * @param deploymentType
     *        Indicates whether to run an in-place deployment or a blue/green deployment.
     * @see DeploymentType
     */

    public void setDeploymentType(DeploymentType deploymentType) {
        withDeploymentType(deploymentType);
    }

    /**
     * <p>
     * Indicates whether to run an in-place deployment or a blue/green deployment.
     * </p>
     * 
     * @param deploymentType
     *        Indicates whether to run an in-place deployment or a blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentType
     */

    public DeploymentStyle withDeploymentType(DeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether to route deployment traffic behind a load balancer.
     * </p>
     * 
     * @param deploymentOption
     *        Indicates whether to route deployment traffic behind a load balancer.
     * @see DeploymentOption
     */

    public void setDeploymentOption(String deploymentOption) {
        this.deploymentOption = deploymentOption;
    }

    /**
     * <p>
     * Indicates whether to route deployment traffic behind a load balancer.
     * </p>
     * 
     * @return Indicates whether to route deployment traffic behind a load balancer.
     * @see DeploymentOption
     */

    public String getDeploymentOption() {
        return this.deploymentOption;
    }

    /**
     * <p>
     * Indicates whether to route deployment traffic behind a load balancer.
     * </p>
     * 
     * @param deploymentOption
     *        Indicates whether to route deployment traffic behind a load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentOption
     */

    public DeploymentStyle withDeploymentOption(String deploymentOption) {
        setDeploymentOption(deploymentOption);
        return this;
    }

    /**
     * <p>
     * Indicates whether to route deployment traffic behind a load balancer.
     * </p>
     * 
     * @param deploymentOption
     *        Indicates whether to route deployment traffic behind a load balancer.
     * @see DeploymentOption
     */

    public void setDeploymentOption(DeploymentOption deploymentOption) {
        withDeploymentOption(deploymentOption);
    }

    /**
     * <p>
     * Indicates whether to route deployment traffic behind a load balancer.
     * </p>
     * 
     * @param deploymentOption
     *        Indicates whether to route deployment traffic behind a load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentOption
     */

    public DeploymentStyle withDeploymentOption(DeploymentOption deploymentOption) {
        this.deploymentOption = deploymentOption.toString();
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
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getDeploymentOption() != null)
            sb.append("DeploymentOption: ").append(getDeploymentOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentStyle == false)
            return false;
        DeploymentStyle other = (DeploymentStyle) obj;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getDeploymentOption() == null ^ this.getDeploymentOption() == null)
            return false;
        if (other.getDeploymentOption() != null && other.getDeploymentOption().equals(this.getDeploymentOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getDeploymentOption() == null) ? 0 : getDeploymentOption().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentStyle clone() {
        try {
            return (DeploymentStyle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.DeploymentStyleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
