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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeCommands" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCommandsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The deployment ID. If you include this parameter, <code>DescribeCommands</code> returns a description of the
     * commands associated with the specified deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The instance ID. If you include this parameter, <code>DescribeCommands</code> returns a description of the
     * commands associated with the specified instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * An array of command IDs. If you include this parameter, <code>DescribeCommands</code> returns a description of
     * the specified commands. Otherwise, it returns a description of every command.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> commandIds;

    /**
     * <p>
     * The deployment ID. If you include this parameter, <code>DescribeCommands</code> returns a description of the
     * commands associated with the specified deployment.
     * </p>
     * 
     * @param deploymentId
     *        The deployment ID. If you include this parameter, <code>DescribeCommands</code> returns a description of
     *        the commands associated with the specified deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The deployment ID. If you include this parameter, <code>DescribeCommands</code> returns a description of the
     * commands associated with the specified deployment.
     * </p>
     * 
     * @return The deployment ID. If you include this parameter, <code>DescribeCommands</code> returns a description of
     *         the commands associated with the specified deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The deployment ID. If you include this parameter, <code>DescribeCommands</code> returns a description of the
     * commands associated with the specified deployment.
     * </p>
     * 
     * @param deploymentId
     *        The deployment ID. If you include this parameter, <code>DescribeCommands</code> returns a description of
     *        the commands associated with the specified deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCommandsRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The instance ID. If you include this parameter, <code>DescribeCommands</code> returns a description of the
     * commands associated with the specified instance.
     * </p>
     * 
     * @param instanceId
     *        The instance ID. If you include this parameter, <code>DescribeCommands</code> returns a description of the
     *        commands associated with the specified instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID. If you include this parameter, <code>DescribeCommands</code> returns a description of the
     * commands associated with the specified instance.
     * </p>
     * 
     * @return The instance ID. If you include this parameter, <code>DescribeCommands</code> returns a description of
     *         the commands associated with the specified instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID. If you include this parameter, <code>DescribeCommands</code> returns a description of the
     * commands associated with the specified instance.
     * </p>
     * 
     * @param instanceId
     *        The instance ID. If you include this parameter, <code>DescribeCommands</code> returns a description of the
     *        commands associated with the specified instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCommandsRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * An array of command IDs. If you include this parameter, <code>DescribeCommands</code> returns a description of
     * the specified commands. Otherwise, it returns a description of every command.
     * </p>
     * 
     * @return An array of command IDs. If you include this parameter, <code>DescribeCommands</code> returns a
     *         description of the specified commands. Otherwise, it returns a description of every command.
     */

    public java.util.List<String> getCommandIds() {
        if (commandIds == null) {
            commandIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return commandIds;
    }

    /**
     * <p>
     * An array of command IDs. If you include this parameter, <code>DescribeCommands</code> returns a description of
     * the specified commands. Otherwise, it returns a description of every command.
     * </p>
     * 
     * @param commandIds
     *        An array of command IDs. If you include this parameter, <code>DescribeCommands</code> returns a
     *        description of the specified commands. Otherwise, it returns a description of every command.
     */

    public void setCommandIds(java.util.Collection<String> commandIds) {
        if (commandIds == null) {
            this.commandIds = null;
            return;
        }

        this.commandIds = new com.amazonaws.internal.SdkInternalList<String>(commandIds);
    }

    /**
     * <p>
     * An array of command IDs. If you include this parameter, <code>DescribeCommands</code> returns a description of
     * the specified commands. Otherwise, it returns a description of every command.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommandIds(java.util.Collection)} or {@link #withCommandIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param commandIds
     *        An array of command IDs. If you include this parameter, <code>DescribeCommands</code> returns a
     *        description of the specified commands. Otherwise, it returns a description of every command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCommandsRequest withCommandIds(String... commandIds) {
        if (this.commandIds == null) {
            setCommandIds(new com.amazonaws.internal.SdkInternalList<String>(commandIds.length));
        }
        for (String ele : commandIds) {
            this.commandIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of command IDs. If you include this parameter, <code>DescribeCommands</code> returns a description of
     * the specified commands. Otherwise, it returns a description of every command.
     * </p>
     * 
     * @param commandIds
     *        An array of command IDs. If you include this parameter, <code>DescribeCommands</code> returns a
     *        description of the specified commands. Otherwise, it returns a description of every command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCommandsRequest withCommandIds(java.util.Collection<String> commandIds) {
        setCommandIds(commandIds);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getCommandIds() != null)
            sb.append("CommandIds: ").append(getCommandIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCommandsRequest == false)
            return false;
        DescribeCommandsRequest other = (DescribeCommandsRequest) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getCommandIds() == null ^ this.getCommandIds() == null)
            return false;
        if (other.getCommandIds() != null && other.getCommandIds().equals(this.getCommandIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getCommandIds() == null) ? 0 : getCommandIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCommandsRequest clone() {
        return (DescribeCommandsRequest) super.clone();
    }

}
