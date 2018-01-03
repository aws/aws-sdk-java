/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name you assign to this job.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Description of the job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     */
    private String logUri;
    /**
     * <p>
     * The role associated with this job.
     * </p>
     */
    private String role;
    /**
     * <p>
     * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     */
    private ExecutionProperty executionProperty;
    /**
     * <p>
     * The JobCommand that executes this job.
     * </p>
     */
    private JobCommand command;
    /**
     * <p>
     * The default parameters for this job.
     * </p>
     */
    private java.util.Map<String, String> defaultArguments;
    /**
     * <p>
     * The connections used for this job.
     * </p>
     */
    private ConnectionsList connections;
    /**
     * <p>
     * The maximum number of times to retry this job if it fails.
     * </p>
     */
    private Integer maxRetries;
    /**
     * <p>
     * The number of capacity units allocated to this job.
     * </p>
     */
    private Integer allocatedCapacity;

    /**
     * <p>
     * The name you assign to this job.
     * </p>
     * 
     * @param name
     *        The name you assign to this job.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name you assign to this job.
     * </p>
     * 
     * @return The name you assign to this job.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name you assign to this job.
     * </p>
     * 
     * @param name
     *        The name you assign to this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Description of the job.
     * </p>
     * 
     * @param description
     *        Description of the job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the job.
     * </p>
     * 
     * @return Description of the job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the job.
     * </p>
     * 
     * @param description
     *        Description of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     * 
     * @param logUri
     *        This field is reserved for future use.
     */

    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     * 
     * @return This field is reserved for future use.
     */

    public String getLogUri() {
        return this.logUri;
    }

    /**
     * <p>
     * This field is reserved for future use.
     * </p>
     * 
     * @param logUri
     *        This field is reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withLogUri(String logUri) {
        setLogUri(logUri);
        return this;
    }

    /**
     * <p>
     * The role associated with this job.
     * </p>
     * 
     * @param role
     *        The role associated with this job.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The role associated with this job.
     * </p>
     * 
     * @return The role associated with this job.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The role associated with this job.
     * </p>
     * 
     * @param role
     *        The role associated with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     * 
     * @param executionProperty
     *        An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     */

    public void setExecutionProperty(ExecutionProperty executionProperty) {
        this.executionProperty = executionProperty;
    }

    /**
     * <p>
     * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     * 
     * @return An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     */

    public ExecutionProperty getExecutionProperty() {
        return this.executionProperty;
    }

    /**
     * <p>
     * An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     * </p>
     * 
     * @param executionProperty
     *        An ExecutionProperty specifying the maximum number of concurrent runs allowed for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withExecutionProperty(ExecutionProperty executionProperty) {
        setExecutionProperty(executionProperty);
        return this;
    }

    /**
     * <p>
     * The JobCommand that executes this job.
     * </p>
     * 
     * @param command
     *        The JobCommand that executes this job.
     */

    public void setCommand(JobCommand command) {
        this.command = command;
    }

    /**
     * <p>
     * The JobCommand that executes this job.
     * </p>
     * 
     * @return The JobCommand that executes this job.
     */

    public JobCommand getCommand() {
        return this.command;
    }

    /**
     * <p>
     * The JobCommand that executes this job.
     * </p>
     * 
     * @param command
     *        The JobCommand that executes this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withCommand(JobCommand command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The default parameters for this job.
     * </p>
     * 
     * @return The default parameters for this job.
     */

    public java.util.Map<String, String> getDefaultArguments() {
        return defaultArguments;
    }

    /**
     * <p>
     * The default parameters for this job.
     * </p>
     * 
     * @param defaultArguments
     *        The default parameters for this job.
     */

    public void setDefaultArguments(java.util.Map<String, String> defaultArguments) {
        this.defaultArguments = defaultArguments;
    }

    /**
     * <p>
     * The default parameters for this job.
     * </p>
     * 
     * @param defaultArguments
     *        The default parameters for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withDefaultArguments(java.util.Map<String, String> defaultArguments) {
        setDefaultArguments(defaultArguments);
        return this;
    }

    public CreateJobRequest addDefaultArgumentsEntry(String key, String value) {
        if (null == this.defaultArguments) {
            this.defaultArguments = new java.util.HashMap<String, String>();
        }
        if (this.defaultArguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.defaultArguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DefaultArguments.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest clearDefaultArgumentsEntries() {
        this.defaultArguments = null;
        return this;
    }

    /**
     * <p>
     * The connections used for this job.
     * </p>
     * 
     * @param connections
     *        The connections used for this job.
     */

    public void setConnections(ConnectionsList connections) {
        this.connections = connections;
    }

    /**
     * <p>
     * The connections used for this job.
     * </p>
     * 
     * @return The connections used for this job.
     */

    public ConnectionsList getConnections() {
        return this.connections;
    }

    /**
     * <p>
     * The connections used for this job.
     * </p>
     * 
     * @param connections
     *        The connections used for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withConnections(ConnectionsList connections) {
        setConnections(connections);
        return this;
    }

    /**
     * <p>
     * The maximum number of times to retry this job if it fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry this job if it fails.
     */

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry this job if it fails.
     * </p>
     * 
     * @return The maximum number of times to retry this job if it fails.
     */

    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry this job if it fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry this job if it fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withMaxRetries(Integer maxRetries) {
        setMaxRetries(maxRetries);
        return this;
    }

    /**
     * <p>
     * The number of capacity units allocated to this job.
     * </p>
     * 
     * @param allocatedCapacity
     *        The number of capacity units allocated to this job.
     */

    public void setAllocatedCapacity(Integer allocatedCapacity) {
        this.allocatedCapacity = allocatedCapacity;
    }

    /**
     * <p>
     * The number of capacity units allocated to this job.
     * </p>
     * 
     * @return The number of capacity units allocated to this job.
     */

    public Integer getAllocatedCapacity() {
        return this.allocatedCapacity;
    }

    /**
     * <p>
     * The number of capacity units allocated to this job.
     * </p>
     * 
     * @param allocatedCapacity
     *        The number of capacity units allocated to this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withAllocatedCapacity(Integer allocatedCapacity) {
        setAllocatedCapacity(allocatedCapacity);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLogUri() != null)
            sb.append("LogUri: ").append(getLogUri()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getExecutionProperty() != null)
            sb.append("ExecutionProperty: ").append(getExecutionProperty()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getDefaultArguments() != null)
            sb.append("DefaultArguments: ").append(getDefaultArguments()).append(",");
        if (getConnections() != null)
            sb.append("Connections: ").append(getConnections()).append(",");
        if (getMaxRetries() != null)
            sb.append("MaxRetries: ").append(getMaxRetries()).append(",");
        if (getAllocatedCapacity() != null)
            sb.append("AllocatedCapacity: ").append(getAllocatedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobRequest == false)
            return false;
        CreateJobRequest other = (CreateJobRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLogUri() == null ^ this.getLogUri() == null)
            return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getExecutionProperty() == null ^ this.getExecutionProperty() == null)
            return false;
        if (other.getExecutionProperty() != null && other.getExecutionProperty().equals(this.getExecutionProperty()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getDefaultArguments() == null ^ this.getDefaultArguments() == null)
            return false;
        if (other.getDefaultArguments() != null && other.getDefaultArguments().equals(this.getDefaultArguments()) == false)
            return false;
        if (other.getConnections() == null ^ this.getConnections() == null)
            return false;
        if (other.getConnections() != null && other.getConnections().equals(this.getConnections()) == false)
            return false;
        if (other.getMaxRetries() == null ^ this.getMaxRetries() == null)
            return false;
        if (other.getMaxRetries() != null && other.getMaxRetries().equals(this.getMaxRetries()) == false)
            return false;
        if (other.getAllocatedCapacity() == null ^ this.getAllocatedCapacity() == null)
            return false;
        if (other.getAllocatedCapacity() != null && other.getAllocatedCapacity().equals(this.getAllocatedCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getExecutionProperty() == null) ? 0 : getExecutionProperty().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getDefaultArguments() == null) ? 0 : getDefaultArguments().hashCode());
        hashCode = prime * hashCode + ((getConnections() == null) ? 0 : getConnections().hashCode());
        hashCode = prime * hashCode + ((getMaxRetries() == null) ? 0 : getMaxRetries().hashCode());
        hashCode = prime * hashCode + ((getAllocatedCapacity() == null) ? 0 : getAllocatedCapacity().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobRequest clone() {
        return (CreateJobRequest) super.clone();
    }

}
