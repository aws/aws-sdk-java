/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateDeviceFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDeviceFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the fleet.
     * </p>
     */
    private String deviceFleetName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Description of the fleet.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Output configuration for storing sample data collected by the fleet.
     * </p>
     */
    private EdgeOutputConfig outputConfig;
    /**
     * <p>
     * Whether to create an Amazon Web Services IoT Role Alias during device fleet creation. The name of the role alias
     * generated will match this pattern: "SageMakerEdge-{DeviceFleetName}".
     * </p>
     * <p>
     * For example, if your device fleet is called "demo-fleet", the name of the role alias will be
     * "SageMakerEdge-demo-fleet".
     * </p>
     */
    private Boolean enableIotRoleAlias;

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet.
     */

    public void setDeviceFleetName(String deviceFleetName) {
        this.deviceFleetName = deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @return The name of the fleet.
     */

    public String getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceFleetRequest withDeviceFleetName(String deviceFleetName) {
        setDeviceFleetName(deviceFleetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the device.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceFleetRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Description of the fleet.
     * </p>
     * 
     * @param description
     *        Description of the fleet.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the fleet.
     * </p>
     * 
     * @return Description of the fleet.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the fleet.
     * </p>
     * 
     * @param description
     *        Description of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceFleetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Output configuration for storing sample data collected by the fleet.
     * </p>
     * 
     * @param outputConfig
     *        Output configuration for storing sample data collected by the fleet.
     */

    public void setOutputConfig(EdgeOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Output configuration for storing sample data collected by the fleet.
     * </p>
     * 
     * @return Output configuration for storing sample data collected by the fleet.
     */

    public EdgeOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * Output configuration for storing sample data collected by the fleet.
     * </p>
     * 
     * @param outputConfig
     *        Output configuration for storing sample data collected by the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceFleetRequest withOutputConfig(EdgeOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * Whether to create an Amazon Web Services IoT Role Alias during device fleet creation. The name of the role alias
     * generated will match this pattern: "SageMakerEdge-{DeviceFleetName}".
     * </p>
     * <p>
     * For example, if your device fleet is called "demo-fleet", the name of the role alias will be
     * "SageMakerEdge-demo-fleet".
     * </p>
     * 
     * @param enableIotRoleAlias
     *        Whether to create an Amazon Web Services IoT Role Alias during device fleet creation. The name of the role
     *        alias generated will match this pattern: "SageMakerEdge-{DeviceFleetName}".</p>
     *        <p>
     *        For example, if your device fleet is called "demo-fleet", the name of the role alias will be
     *        "SageMakerEdge-demo-fleet".
     */

    public void setEnableIotRoleAlias(Boolean enableIotRoleAlias) {
        this.enableIotRoleAlias = enableIotRoleAlias;
    }

    /**
     * <p>
     * Whether to create an Amazon Web Services IoT Role Alias during device fleet creation. The name of the role alias
     * generated will match this pattern: "SageMakerEdge-{DeviceFleetName}".
     * </p>
     * <p>
     * For example, if your device fleet is called "demo-fleet", the name of the role alias will be
     * "SageMakerEdge-demo-fleet".
     * </p>
     * 
     * @return Whether to create an Amazon Web Services IoT Role Alias during device fleet creation. The name of the
     *         role alias generated will match this pattern: "SageMakerEdge-{DeviceFleetName}".</p>
     *         <p>
     *         For example, if your device fleet is called "demo-fleet", the name of the role alias will be
     *         "SageMakerEdge-demo-fleet".
     */

    public Boolean getEnableIotRoleAlias() {
        return this.enableIotRoleAlias;
    }

    /**
     * <p>
     * Whether to create an Amazon Web Services IoT Role Alias during device fleet creation. The name of the role alias
     * generated will match this pattern: "SageMakerEdge-{DeviceFleetName}".
     * </p>
     * <p>
     * For example, if your device fleet is called "demo-fleet", the name of the role alias will be
     * "SageMakerEdge-demo-fleet".
     * </p>
     * 
     * @param enableIotRoleAlias
     *        Whether to create an Amazon Web Services IoT Role Alias during device fleet creation. The name of the role
     *        alias generated will match this pattern: "SageMakerEdge-{DeviceFleetName}".</p>
     *        <p>
     *        For example, if your device fleet is called "demo-fleet", the name of the role alias will be
     *        "SageMakerEdge-demo-fleet".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceFleetRequest withEnableIotRoleAlias(Boolean enableIotRoleAlias) {
        setEnableIotRoleAlias(enableIotRoleAlias);
        return this;
    }

    /**
     * <p>
     * Whether to create an Amazon Web Services IoT Role Alias during device fleet creation. The name of the role alias
     * generated will match this pattern: "SageMakerEdge-{DeviceFleetName}".
     * </p>
     * <p>
     * For example, if your device fleet is called "demo-fleet", the name of the role alias will be
     * "SageMakerEdge-demo-fleet".
     * </p>
     * 
     * @return Whether to create an Amazon Web Services IoT Role Alias during device fleet creation. The name of the
     *         role alias generated will match this pattern: "SageMakerEdge-{DeviceFleetName}".</p>
     *         <p>
     *         For example, if your device fleet is called "demo-fleet", the name of the role alias will be
     *         "SageMakerEdge-demo-fleet".
     */

    public Boolean isEnableIotRoleAlias() {
        return this.enableIotRoleAlias;
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
        if (getDeviceFleetName() != null)
            sb.append("DeviceFleetName: ").append(getDeviceFleetName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getEnableIotRoleAlias() != null)
            sb.append("EnableIotRoleAlias: ").append(getEnableIotRoleAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeviceFleetRequest == false)
            return false;
        UpdateDeviceFleetRequest other = (UpdateDeviceFleetRequest) obj;
        if (other.getDeviceFleetName() == null ^ this.getDeviceFleetName() == null)
            return false;
        if (other.getDeviceFleetName() != null && other.getDeviceFleetName().equals(this.getDeviceFleetName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getEnableIotRoleAlias() == null ^ this.getEnableIotRoleAlias() == null)
            return false;
        if (other.getEnableIotRoleAlias() != null && other.getEnableIotRoleAlias().equals(this.getEnableIotRoleAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceFleetName() == null) ? 0 : getDeviceFleetName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getEnableIotRoleAlias() == null) ? 0 : getEnableIotRoleAlias().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDeviceFleetRequest clone() {
        return (UpdateDeviceFleetRequest) super.clone();
    }

}
