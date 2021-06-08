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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayTaskDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWirelessGatewayTaskDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Whether to automatically create tasks using this task definition for all gateways with the specified current
     * version. If <code>false</code>, the task must me created by calling <code>CreateWirelessGatewayTask</code>.
     * </p>
     */
    private Boolean autoCreateTasks;
    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Information about the gateways to update.
     * </p>
     */
    private UpdateWirelessGatewayTaskCreate update;
    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * Whether to automatically create tasks using this task definition for all gateways with the specified current
     * version. If <code>false</code>, the task must me created by calling <code>CreateWirelessGatewayTask</code>.
     * </p>
     * 
     * @param autoCreateTasks
     *        Whether to automatically create tasks using this task definition for all gateways with the specified
     *        current version. If <code>false</code>, the task must me created by calling
     *        <code>CreateWirelessGatewayTask</code>.
     */

    public void setAutoCreateTasks(Boolean autoCreateTasks) {
        this.autoCreateTasks = autoCreateTasks;
    }

    /**
     * <p>
     * Whether to automatically create tasks using this task definition for all gateways with the specified current
     * version. If <code>false</code>, the task must me created by calling <code>CreateWirelessGatewayTask</code>.
     * </p>
     * 
     * @return Whether to automatically create tasks using this task definition for all gateways with the specified
     *         current version. If <code>false</code>, the task must me created by calling
     *         <code>CreateWirelessGatewayTask</code>.
     */

    public Boolean getAutoCreateTasks() {
        return this.autoCreateTasks;
    }

    /**
     * <p>
     * Whether to automatically create tasks using this task definition for all gateways with the specified current
     * version. If <code>false</code>, the task must me created by calling <code>CreateWirelessGatewayTask</code>.
     * </p>
     * 
     * @param autoCreateTasks
     *        Whether to automatically create tasks using this task definition for all gateways with the specified
     *        current version. If <code>false</code>, the task must me created by calling
     *        <code>CreateWirelessGatewayTask</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayTaskDefinitionResult withAutoCreateTasks(Boolean autoCreateTasks) {
        setAutoCreateTasks(autoCreateTasks);
        return this;
    }

    /**
     * <p>
     * Whether to automatically create tasks using this task definition for all gateways with the specified current
     * version. If <code>false</code>, the task must me created by calling <code>CreateWirelessGatewayTask</code>.
     * </p>
     * 
     * @return Whether to automatically create tasks using this task definition for all gateways with the specified
     *         current version. If <code>false</code>, the task must me created by calling
     *         <code>CreateWirelessGatewayTask</code>.
     */

    public Boolean isAutoCreateTasks() {
        return this.autoCreateTasks;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param name
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayTaskDefinitionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Information about the gateways to update.
     * </p>
     * 
     * @param update
     *        Information about the gateways to update.
     */

    public void setUpdate(UpdateWirelessGatewayTaskCreate update) {
        this.update = update;
    }

    /**
     * <p>
     * Information about the gateways to update.
     * </p>
     * 
     * @return Information about the gateways to update.
     */

    public UpdateWirelessGatewayTaskCreate getUpdate() {
        return this.update;
    }

    /**
     * <p>
     * Information about the gateways to update.
     * </p>
     * 
     * @param update
     *        Information about the gateways to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayTaskDefinitionResult withUpdate(UpdateWirelessGatewayTaskCreate update) {
        setUpdate(update);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayTaskDefinitionResult withArn(String arn) {
        setArn(arn);
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
        if (getAutoCreateTasks() != null)
            sb.append("AutoCreateTasks: ").append(getAutoCreateTasks()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUpdate() != null)
            sb.append("Update: ").append(getUpdate()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWirelessGatewayTaskDefinitionResult == false)
            return false;
        GetWirelessGatewayTaskDefinitionResult other = (GetWirelessGatewayTaskDefinitionResult) obj;
        if (other.getAutoCreateTasks() == null ^ this.getAutoCreateTasks() == null)
            return false;
        if (other.getAutoCreateTasks() != null && other.getAutoCreateTasks().equals(this.getAutoCreateTasks()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUpdate() == null ^ this.getUpdate() == null)
            return false;
        if (other.getUpdate() != null && other.getUpdate().equals(this.getUpdate()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoCreateTasks() == null) ? 0 : getAutoCreateTasks().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUpdate() == null) ? 0 : getUpdate().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public GetWirelessGatewayTaskDefinitionResult clone() {
        try {
            return (GetWirelessGatewayTaskDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
