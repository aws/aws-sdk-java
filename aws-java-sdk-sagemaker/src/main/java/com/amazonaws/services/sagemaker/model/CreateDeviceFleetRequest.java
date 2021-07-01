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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateDeviceFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeviceFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the fleet that the device belongs to.
     * </p>
     */
    private String deviceFleetName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A description of the fleet.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The output configuration for storing sample data collected by the fleet.
     * </p>
     */
    private EdgeOutputConfig outputConfig;
    /**
     * <p>
     * Creates tags for the specified fleet.
     * </p>
     */
    private java.util.List<Tag> tags;
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
     * The name of the fleet that the device belongs to.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet that the device belongs to.
     */

    public void setDeviceFleetName(String deviceFleetName) {
        this.deviceFleetName = deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet that the device belongs to.
     * </p>
     * 
     * @return The name of the fleet that the device belongs to.
     */

    public String getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet that the device belongs to.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet that the device belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeviceFleetRequest withDeviceFleetName(String deviceFleetName) {
        setDeviceFleetName(deviceFleetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) that has access to Amazon Web Services Internet of Things (IoT).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeviceFleetRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A description of the fleet.
     * </p>
     * 
     * @param description
     *        A description of the fleet.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the fleet.
     * </p>
     * 
     * @return A description of the fleet.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the fleet.
     * </p>
     * 
     * @param description
     *        A description of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeviceFleetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The output configuration for storing sample data collected by the fleet.
     * </p>
     * 
     * @param outputConfig
     *        The output configuration for storing sample data collected by the fleet.
     */

    public void setOutputConfig(EdgeOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The output configuration for storing sample data collected by the fleet.
     * </p>
     * 
     * @return The output configuration for storing sample data collected by the fleet.
     */

    public EdgeOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The output configuration for storing sample data collected by the fleet.
     * </p>
     * 
     * @param outputConfig
     *        The output configuration for storing sample data collected by the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeviceFleetRequest withOutputConfig(EdgeOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * Creates tags for the specified fleet.
     * </p>
     * 
     * @return Creates tags for the specified fleet.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Creates tags for the specified fleet.
     * </p>
     * 
     * @param tags
     *        Creates tags for the specified fleet.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Creates tags for the specified fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Creates tags for the specified fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeviceFleetRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Creates tags for the specified fleet.
     * </p>
     * 
     * @param tags
     *        Creates tags for the specified fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeviceFleetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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

    public CreateDeviceFleetRequest withEnableIotRoleAlias(Boolean enableIotRoleAlias) {
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateDeviceFleetRequest == false)
            return false;
        CreateDeviceFleetRequest other = (CreateDeviceFleetRequest) obj;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getEnableIotRoleAlias() == null) ? 0 : getEnableIotRoleAlias().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeviceFleetRequest clone() {
        return (CreateDeviceFleetRequest) super.clone();
    }

}
