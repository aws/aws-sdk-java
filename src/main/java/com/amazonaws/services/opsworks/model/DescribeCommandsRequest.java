/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeCommands(DescribeCommandsRequest) DescribeCommands operation}.
 * <p>
 * Describes the results of specified commands.
 * </p>
 * <p>
 * <b>NOTE:</b>You must specify at least one of the parameters.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeCommands(DescribeCommandsRequest)
 */
public class DescribeCommandsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The deployment ID. If you include this parameter,
     * <code>DescribeCommands</code> returns a description of the commands
     * associated with the specified deployment.
     */
    private String deploymentId;

    /**
     * The instance ID. If you include this parameter,
     * <code>DescribeCommands</code> returns a description of the commands
     * associated with the specified instance.
     */
    private String instanceId;

    /**
     * An array of command IDs. If you include this parameter,
     * <code>DescribeCommands</code> returns a description of the specified
     * commands. Otherwise, it returns a description of every command.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> commandIds;

    /**
     * The deployment ID. If you include this parameter,
     * <code>DescribeCommands</code> returns a description of the commands
     * associated with the specified deployment.
     *
     * @return The deployment ID. If you include this parameter,
     *         <code>DescribeCommands</code> returns a description of the commands
     *         associated with the specified deployment.
     */
    public String getDeploymentId() {
        return deploymentId;
    }
    
    /**
     * The deployment ID. If you include this parameter,
     * <code>DescribeCommands</code> returns a description of the commands
     * associated with the specified deployment.
     *
     * @param deploymentId The deployment ID. If you include this parameter,
     *         <code>DescribeCommands</code> returns a description of the commands
     *         associated with the specified deployment.
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }
    
    /**
     * The deployment ID. If you include this parameter,
     * <code>DescribeCommands</code> returns a description of the commands
     * associated with the specified deployment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentId The deployment ID. If you include this parameter,
     *         <code>DescribeCommands</code> returns a description of the commands
     *         associated with the specified deployment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCommandsRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * The instance ID. If you include this parameter,
     * <code>DescribeCommands</code> returns a description of the commands
     * associated with the specified instance.
     *
     * @return The instance ID. If you include this parameter,
     *         <code>DescribeCommands</code> returns a description of the commands
     *         associated with the specified instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID. If you include this parameter,
     * <code>DescribeCommands</code> returns a description of the commands
     * associated with the specified instance.
     *
     * @param instanceId The instance ID. If you include this parameter,
     *         <code>DescribeCommands</code> returns a description of the commands
     *         associated with the specified instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID. If you include this parameter,
     * <code>DescribeCommands</code> returns a description of the commands
     * associated with the specified instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID. If you include this parameter,
     *         <code>DescribeCommands</code> returns a description of the commands
     *         associated with the specified instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCommandsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * An array of command IDs. If you include this parameter,
     * <code>DescribeCommands</code> returns a description of the specified
     * commands. Otherwise, it returns a description of every command.
     *
     * @return An array of command IDs. If you include this parameter,
     *         <code>DescribeCommands</code> returns a description of the specified
     *         commands. Otherwise, it returns a description of every command.
     */
    public java.util.List<String> getCommandIds() {
        if (commandIds == null) {
              commandIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              commandIds.setAutoConstruct(true);
        }
        return commandIds;
    }
    
    /**
     * An array of command IDs. If you include this parameter,
     * <code>DescribeCommands</code> returns a description of the specified
     * commands. Otherwise, it returns a description of every command.
     *
     * @param commandIds An array of command IDs. If you include this parameter,
     *         <code>DescribeCommands</code> returns a description of the specified
     *         commands. Otherwise, it returns a description of every command.
     */
    public void setCommandIds(java.util.Collection<String> commandIds) {
        if (commandIds == null) {
            this.commandIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> commandIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(commandIds.size());
        commandIdsCopy.addAll(commandIds);
        this.commandIds = commandIdsCopy;
    }
    
    /**
     * An array of command IDs. If you include this parameter,
     * <code>DescribeCommands</code> returns a description of the specified
     * commands. Otherwise, it returns a description of every command.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param commandIds An array of command IDs. If you include this parameter,
     *         <code>DescribeCommands</code> returns a description of the specified
     *         commands. Otherwise, it returns a description of every command.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCommandsRequest withCommandIds(String... commandIds) {
        if (getCommandIds() == null) setCommandIds(new java.util.ArrayList<String>(commandIds.length));
        for (String value : commandIds) {
            getCommandIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of command IDs. If you include this parameter,
     * <code>DescribeCommands</code> returns a description of the specified
     * commands. Otherwise, it returns a description of every command.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param commandIds An array of command IDs. If you include this parameter,
     *         <code>DescribeCommands</code> returns a description of the specified
     *         commands. Otherwise, it returns a description of every command.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCommandsRequest withCommandIds(java.util.Collection<String> commandIds) {
        if (commandIds == null) {
            this.commandIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> commandIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(commandIds.size());
            commandIdsCopy.addAll(commandIds);
            this.commandIds = commandIdsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeploymentId() != null) sb.append("DeploymentId: " + getDeploymentId() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getCommandIds() != null) sb.append("CommandIds: " + getCommandIds() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCommandsRequest == false) return false;
        DescribeCommandsRequest other = (DescribeCommandsRequest)obj;
        
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null) return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getCommandIds() == null ^ this.getCommandIds() == null) return false;
        if (other.getCommandIds() != null && other.getCommandIds().equals(this.getCommandIds()) == false) return false; 
        return true;
    }
    
}
    