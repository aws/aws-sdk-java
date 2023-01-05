/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about a stage in an edge deployment plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeploymentStage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentStage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the stage.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * Configuration of the devices in the stage.
     * </p>
     */
    private DeviceSelectionConfig deviceSelectionConfig;
    /**
     * <p>
     * Configuration of the deployment details.
     * </p>
     */
    private EdgeDeploymentConfig deploymentConfig;

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param stageName
     *        The name of the stage.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @return The name of the stage.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param stageName
     *        The name of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentStage withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * Configuration of the devices in the stage.
     * </p>
     * 
     * @param deviceSelectionConfig
     *        Configuration of the devices in the stage.
     */

    public void setDeviceSelectionConfig(DeviceSelectionConfig deviceSelectionConfig) {
        this.deviceSelectionConfig = deviceSelectionConfig;
    }

    /**
     * <p>
     * Configuration of the devices in the stage.
     * </p>
     * 
     * @return Configuration of the devices in the stage.
     */

    public DeviceSelectionConfig getDeviceSelectionConfig() {
        return this.deviceSelectionConfig;
    }

    /**
     * <p>
     * Configuration of the devices in the stage.
     * </p>
     * 
     * @param deviceSelectionConfig
     *        Configuration of the devices in the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentStage withDeviceSelectionConfig(DeviceSelectionConfig deviceSelectionConfig) {
        setDeviceSelectionConfig(deviceSelectionConfig);
        return this;
    }

    /**
     * <p>
     * Configuration of the deployment details.
     * </p>
     * 
     * @param deploymentConfig
     *        Configuration of the deployment details.
     */

    public void setDeploymentConfig(EdgeDeploymentConfig deploymentConfig) {
        this.deploymentConfig = deploymentConfig;
    }

    /**
     * <p>
     * Configuration of the deployment details.
     * </p>
     * 
     * @return Configuration of the deployment details.
     */

    public EdgeDeploymentConfig getDeploymentConfig() {
        return this.deploymentConfig;
    }

    /**
     * <p>
     * Configuration of the deployment details.
     * </p>
     * 
     * @param deploymentConfig
     *        Configuration of the deployment details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentStage withDeploymentConfig(EdgeDeploymentConfig deploymentConfig) {
        setDeploymentConfig(deploymentConfig);
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
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
        if (getDeviceSelectionConfig() != null)
            sb.append("DeviceSelectionConfig: ").append(getDeviceSelectionConfig()).append(",");
        if (getDeploymentConfig() != null)
            sb.append("DeploymentConfig: ").append(getDeploymentConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentStage == false)
            return false;
        DeploymentStage other = (DeploymentStage) obj;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getDeviceSelectionConfig() == null ^ this.getDeviceSelectionConfig() == null)
            return false;
        if (other.getDeviceSelectionConfig() != null && other.getDeviceSelectionConfig().equals(this.getDeviceSelectionConfig()) == false)
            return false;
        if (other.getDeploymentConfig() == null ^ this.getDeploymentConfig() == null)
            return false;
        if (other.getDeploymentConfig() != null && other.getDeploymentConfig().equals(this.getDeploymentConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getDeviceSelectionConfig() == null) ? 0 : getDeviceSelectionConfig().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfig() == null) ? 0 : getDeploymentConfig().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentStage clone() {
        try {
            return (DeploymentStage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DeploymentStageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
