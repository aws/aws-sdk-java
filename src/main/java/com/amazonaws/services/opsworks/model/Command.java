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


/**
 * <p>
 * Describes a command.
 * </p>
 */
public class Command implements Serializable {

    /**
     * The command ID.
     */
    private String commandId;

    /**
     * The ID of the instance where the command was executed.
     */
    private String instanceId;

    /**
     * The command deployment ID.
     */
    private String deploymentId;

    /**
     * Date and time when the command was run.
     */
    private String createdAt;

    /**
     * Date and time when the command was acknowledged.
     */
    private String acknowledgedAt;

    /**
     * Date when the command completed.
     */
    private String completedAt;

    /**
     * The command status: <ul> <li>failed</li> <li>successful</li>
     * <li>skipped</li> <li>pending</li> </ul>
     */
    private String status;

    /**
     * The command exit code.
     */
    private Integer exitCode;

    /**
     * The URL of the command log.
     */
    private String logUrl;

    /**
     * The command type: <ul> <li>deploy</li> <li>rollback</li>
     * <li>start</li> <li>stop</li> <li>restart</li> <li>undeploy</li>
     * <li>update_dependencies</li> <li>install_dependencies</li>
     * <li>update_custom_cookbooks</li> <li>execute_recipes</li> </ul>
     */
    private String type;

    /**
     * The command ID.
     *
     * @return The command ID.
     */
    public String getCommandId() {
        return commandId;
    }
    
    /**
     * The command ID.
     *
     * @param commandId The command ID.
     */
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }
    
    /**
     * The command ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param commandId The command ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Command withCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * The ID of the instance where the command was executed.
     *
     * @return The ID of the instance where the command was executed.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance where the command was executed.
     *
     * @param instanceId The ID of the instance where the command was executed.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance where the command was executed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance where the command was executed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Command withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The command deployment ID.
     *
     * @return The command deployment ID.
     */
    public String getDeploymentId() {
        return deploymentId;
    }
    
    /**
     * The command deployment ID.
     *
     * @param deploymentId The command deployment ID.
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }
    
    /**
     * The command deployment ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentId The command deployment ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Command withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * Date and time when the command was run.
     *
     * @return Date and time when the command was run.
     */
    public String getCreatedAt() {
        return createdAt;
    }
    
    /**
     * Date and time when the command was run.
     *
     * @param createdAt Date and time when the command was run.
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    
    /**
     * Date and time when the command was run.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAt Date and time when the command was run.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Command withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Date and time when the command was acknowledged.
     *
     * @return Date and time when the command was acknowledged.
     */
    public String getAcknowledgedAt() {
        return acknowledgedAt;
    }
    
    /**
     * Date and time when the command was acknowledged.
     *
     * @param acknowledgedAt Date and time when the command was acknowledged.
     */
    public void setAcknowledgedAt(String acknowledgedAt) {
        this.acknowledgedAt = acknowledgedAt;
    }
    
    /**
     * Date and time when the command was acknowledged.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param acknowledgedAt Date and time when the command was acknowledged.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Command withAcknowledgedAt(String acknowledgedAt) {
        this.acknowledgedAt = acknowledgedAt;
        return this;
    }

    /**
     * Date when the command completed.
     *
     * @return Date when the command completed.
     */
    public String getCompletedAt() {
        return completedAt;
    }
    
    /**
     * Date when the command completed.
     *
     * @param completedAt Date when the command completed.
     */
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }
    
    /**
     * Date when the command completed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param completedAt Date when the command completed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Command withCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * The command status: <ul> <li>failed</li> <li>successful</li>
     * <li>skipped</li> <li>pending</li> </ul>
     *
     * @return The command status: <ul> <li>failed</li> <li>successful</li>
     *         <li>skipped</li> <li>pending</li> </ul>
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The command status: <ul> <li>failed</li> <li>successful</li>
     * <li>skipped</li> <li>pending</li> </ul>
     *
     * @param status The command status: <ul> <li>failed</li> <li>successful</li>
     *         <li>skipped</li> <li>pending</li> </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The command status: <ul> <li>failed</li> <li>successful</li>
     * <li>skipped</li> <li>pending</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The command status: <ul> <li>failed</li> <li>successful</li>
     *         <li>skipped</li> <li>pending</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Command withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The command exit code.
     *
     * @return The command exit code.
     */
    public Integer getExitCode() {
        return exitCode;
    }
    
    /**
     * The command exit code.
     *
     * @param exitCode The command exit code.
     */
    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }
    
    /**
     * The command exit code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exitCode The command exit code.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Command withExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * The URL of the command log.
     *
     * @return The URL of the command log.
     */
    public String getLogUrl() {
        return logUrl;
    }
    
    /**
     * The URL of the command log.
     *
     * @param logUrl The URL of the command log.
     */
    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }
    
    /**
     * The URL of the command log.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logUrl The URL of the command log.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Command withLogUrl(String logUrl) {
        this.logUrl = logUrl;
        return this;
    }

    /**
     * The command type: <ul> <li>deploy</li> <li>rollback</li>
     * <li>start</li> <li>stop</li> <li>restart</li> <li>undeploy</li>
     * <li>update_dependencies</li> <li>install_dependencies</li>
     * <li>update_custom_cookbooks</li> <li>execute_recipes</li> </ul>
     *
     * @return The command type: <ul> <li>deploy</li> <li>rollback</li>
     *         <li>start</li> <li>stop</li> <li>restart</li> <li>undeploy</li>
     *         <li>update_dependencies</li> <li>install_dependencies</li>
     *         <li>update_custom_cookbooks</li> <li>execute_recipes</li> </ul>
     */
    public String getType() {
        return type;
    }
    
    /**
     * The command type: <ul> <li>deploy</li> <li>rollback</li>
     * <li>start</li> <li>stop</li> <li>restart</li> <li>undeploy</li>
     * <li>update_dependencies</li> <li>install_dependencies</li>
     * <li>update_custom_cookbooks</li> <li>execute_recipes</li> </ul>
     *
     * @param type The command type: <ul> <li>deploy</li> <li>rollback</li>
     *         <li>start</li> <li>stop</li> <li>restart</li> <li>undeploy</li>
     *         <li>update_dependencies</li> <li>install_dependencies</li>
     *         <li>update_custom_cookbooks</li> <li>execute_recipes</li> </ul>
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The command type: <ul> <li>deploy</li> <li>rollback</li>
     * <li>start</li> <li>stop</li> <li>restart</li> <li>undeploy</li>
     * <li>update_dependencies</li> <li>install_dependencies</li>
     * <li>update_custom_cookbooks</li> <li>execute_recipes</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The command type: <ul> <li>deploy</li> <li>rollback</li>
     *         <li>start</li> <li>stop</li> <li>restart</li> <li>undeploy</li>
     *         <li>update_dependencies</li> <li>install_dependencies</li>
     *         <li>update_custom_cookbooks</li> <li>execute_recipes</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Command withType(String type) {
        this.type = type;
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
        if (getCommandId() != null) sb.append("CommandId: " + getCommandId() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getDeploymentId() != null) sb.append("DeploymentId: " + getDeploymentId() + ",");
        if (getCreatedAt() != null) sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getAcknowledgedAt() != null) sb.append("AcknowledgedAt: " + getAcknowledgedAt() + ",");
        if (getCompletedAt() != null) sb.append("CompletedAt: " + getCompletedAt() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getExitCode() != null) sb.append("ExitCode: " + getExitCode() + ",");
        if (getLogUrl() != null) sb.append("LogUrl: " + getLogUrl() + ",");
        if (getType() != null) sb.append("Type: " + getType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCommandId() == null) ? 0 : getCommandId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode()); 
        hashCode = prime * hashCode + ((getAcknowledgedAt() == null) ? 0 : getAcknowledgedAt().hashCode()); 
        hashCode = prime * hashCode + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getExitCode() == null) ? 0 : getExitCode().hashCode()); 
        hashCode = prime * hashCode + ((getLogUrl() == null) ? 0 : getLogUrl().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Command == false) return false;
        Command other = (Command)obj;
        
        if (other.getCommandId() == null ^ this.getCommandId() == null) return false;
        if (other.getCommandId() != null && other.getCommandId().equals(this.getCommandId()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null) return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false) return false; 
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null) return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false) return false; 
        if (other.getAcknowledgedAt() == null ^ this.getAcknowledgedAt() == null) return false;
        if (other.getAcknowledgedAt() != null && other.getAcknowledgedAt().equals(this.getAcknowledgedAt()) == false) return false; 
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null) return false;
        if (other.getCompletedAt() != null && other.getCompletedAt().equals(this.getCompletedAt()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getExitCode() == null ^ this.getExitCode() == null) return false;
        if (other.getExitCode() != null && other.getExitCode().equals(this.getExitCode()) == false) return false; 
        if (other.getLogUrl() == null ^ this.getLogUrl() == null) return false;
        if (other.getLogUrl() != null && other.getLogUrl().equals(this.getLogUrl()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        return true;
    }
    
}
    