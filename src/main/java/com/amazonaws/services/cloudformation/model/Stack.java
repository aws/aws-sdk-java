/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

/**
 * <p>
 * The Stack data type.
 * </p>
 */
public class Stack {

    /**
     * Unique identifier of the stack.
     */
    private String stackId;

    /**
     * The name associated with the stack.
     */
    private String stackName;

    /**
     * User defined description associated with the stack.
     */
    private String description;

    /**
     * A list of <code>Parameter</code> structures.
     */
    private java.util.List<Parameter> parameters;

    /**
     * Time at which the stack was created.
     */
    private java.util.Date creationTime;

    /**
     * Current status of the stack.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED
     */
    private String stackStatus;

    /**
     * Success/failure message associated with the stack status.
     */
    private String stackStatusReason;

    /**
     * Boolean to enable or disable rollback on stack creation failures: <p>
     * <ul> <li><code>true</code>: disable rollback</li>
     * <li><code>false</code>: enable rollback</li> </ul>
     */
    private Boolean disableRollback;

    /**
     * SNS topic ARNs to which stack related events are published.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     */
    private java.util.List<String> notificationARNs;

    /**
     * The amount of time within which stack creation should complete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer timeoutInMinutes;

    /**
     * A list of output structures.
     */
    private java.util.List<Output> outputs;

    /**
     * Unique identifier of the stack.
     *
     * @return Unique identifier of the stack.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * Unique identifier of the stack.
     *
     * @param stackId Unique identifier of the stack.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * Unique identifier of the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId Unique identifier of the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Stack withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    
    
    /**
     * The name associated with the stack.
     *
     * @return The name associated with the stack.
     */
    public String getStackName() {
        return stackName;
    }
    
    /**
     * The name associated with the stack.
     *
     * @param stackName The name associated with the stack.
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }
    
    /**
     * The name associated with the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackName The name associated with the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Stack withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    
    
    /**
     * User defined description associated with the stack.
     *
     * @return User defined description associated with the stack.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * User defined description associated with the stack.
     *
     * @param description User defined description associated with the stack.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * User defined description associated with the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description User defined description associated with the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Stack withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * A list of <code>Parameter</code> structures.
     *
     * @return A list of <code>Parameter</code> structures.
     */
    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new java.util.ArrayList<Parameter>();
        }
        return parameters;
    }
    
    /**
     * A list of <code>Parameter</code> structures.
     *
     * @param parameters A list of <code>Parameter</code> structures.
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        java.util.List<Parameter> parametersCopy = new java.util.ArrayList<Parameter>();
        if (parameters != null) {
            parametersCopy.addAll(parameters);
        }
        this.parameters = parametersCopy;
    }
    
    /**
     * A list of <code>Parameter</code> structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <code>Parameter</code> structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Stack withParameters(Parameter... parameters) {
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>Parameter</code> structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <code>Parameter</code> structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Stack withParameters(java.util.Collection<Parameter> parameters) {
        java.util.List<Parameter> parametersCopy = new java.util.ArrayList<Parameter>();
        if (parameters != null) {
            parametersCopy.addAll(parameters);
        }
        this.parameters = parametersCopy;

        return this;
    }
    
    /**
     * Time at which the stack was created.
     *
     * @return Time at which the stack was created.
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }
    
    /**
     * Time at which the stack was created.
     *
     * @param creationTime Time at which the stack was created.
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }
    
    /**
     * Time at which the stack was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationTime Time at which the stack was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Stack withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    
    
    /**
     * Current status of the stack.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED
     *
     * @return Current status of the stack.
     *
     * @see StackStatus
     */
    public String getStackStatus() {
        return stackStatus;
    }
    
    /**
     * Current status of the stack.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED
     *
     * @param stackStatus Current status of the stack.
     *
     * @see StackStatus
     */
    public void setStackStatus(String stackStatus) {
        this.stackStatus = stackStatus;
    }
    
    /**
     * Current status of the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED
     *
     * @param stackStatus Current status of the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see StackStatus
     */
    public Stack withStackStatus(String stackStatus) {
        this.stackStatus = stackStatus;
        return this;
    }
    
    
    /**
     * Success/failure message associated with the stack status.
     *
     * @return Success/failure message associated with the stack status.
     */
    public String getStackStatusReason() {
        return stackStatusReason;
    }
    
    /**
     * Success/failure message associated with the stack status.
     *
     * @param stackStatusReason Success/failure message associated with the stack status.
     */
    public void setStackStatusReason(String stackStatusReason) {
        this.stackStatusReason = stackStatusReason;
    }
    
    /**
     * Success/failure message associated with the stack status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackStatusReason Success/failure message associated with the stack status.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Stack withStackStatusReason(String stackStatusReason) {
        this.stackStatusReason = stackStatusReason;
        return this;
    }
    
    
    /**
     * Boolean to enable or disable rollback on stack creation failures: <p>
     * <ul> <li><code>true</code>: disable rollback</li>
     * <li><code>false</code>: enable rollback</li> </ul>
     *
     * @return Boolean to enable or disable rollback on stack creation failures: <p>
     *         <ul> <li><code>true</code>: disable rollback</li>
     *         <li><code>false</code>: enable rollback</li> </ul>
     */
    public Boolean isDisableRollback() {
        return disableRollback;
    }
    
    /**
     * Boolean to enable or disable rollback on stack creation failures: <p>
     * <ul> <li><code>true</code>: disable rollback</li>
     * <li><code>false</code>: enable rollback</li> </ul>
     *
     * @param disableRollback Boolean to enable or disable rollback on stack creation failures: <p>
     *         <ul> <li><code>true</code>: disable rollback</li>
     *         <li><code>false</code>: enable rollback</li> </ul>
     */
    public void setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
    }
    
    /**
     * Boolean to enable or disable rollback on stack creation failures: <p>
     * <ul> <li><code>true</code>: disable rollback</li>
     * <li><code>false</code>: enable rollback</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param disableRollback Boolean to enable or disable rollback on stack creation failures: <p>
     *         <ul> <li><code>true</code>: disable rollback</li>
     *         <li><code>false</code>: enable rollback</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Stack withDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    
    
    /**
     * Boolean to enable or disable rollback on stack creation failures: <p>
     * <ul> <li><code>true</code>: disable rollback</li>
     * <li><code>false</code>: enable rollback</li> </ul>
     *
     * @return Boolean to enable or disable rollback on stack creation failures: <p>
     *         <ul> <li><code>true</code>: disable rollback</li>
     *         <li><code>false</code>: enable rollback</li> </ul>
     */
    public Boolean getDisableRollback() {
        return disableRollback;
    }
    
    /**
     * SNS topic ARNs to which stack related events are published.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return SNS topic ARNs to which stack related events are published.
     */
    public java.util.List<String> getNotificationARNs() {
        if (notificationARNs == null) {
            notificationARNs = new java.util.ArrayList<String>();
        }
        return notificationARNs;
    }
    
    /**
     * SNS topic ARNs to which stack related events are published.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param notificationARNs SNS topic ARNs to which stack related events are published.
     */
    public void setNotificationARNs(java.util.Collection<String> notificationARNs) {
        java.util.List<String> notificationARNsCopy = new java.util.ArrayList<String>();
        if (notificationARNs != null) {
            notificationARNsCopy.addAll(notificationARNs);
        }
        this.notificationARNs = notificationARNsCopy;
    }
    
    /**
     * SNS topic ARNs to which stack related events are published.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param notificationARNs SNS topic ARNs to which stack related events are published.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Stack withNotificationARNs(String... notificationARNs) {
        for (String value : notificationARNs) {
            getNotificationARNs().add(value);
        }
        return this;
    }
    
    /**
     * SNS topic ARNs to which stack related events are published.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param notificationARNs SNS topic ARNs to which stack related events are published.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Stack withNotificationARNs(java.util.Collection<String> notificationARNs) {
        java.util.List<String> notificationARNsCopy = new java.util.ArrayList<String>();
        if (notificationARNs != null) {
            notificationARNsCopy.addAll(notificationARNs);
        }
        this.notificationARNs = notificationARNsCopy;

        return this;
    }
    
    /**
     * The amount of time within which stack creation should complete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The amount of time within which stack creation should complete.
     */
    public Integer getTimeoutInMinutes() {
        return timeoutInMinutes;
    }
    
    /**
     * The amount of time within which stack creation should complete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeoutInMinutes The amount of time within which stack creation should complete.
     */
    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }
    
    /**
     * The amount of time within which stack creation should complete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeoutInMinutes The amount of time within which stack creation should complete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Stack withTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    
    
    /**
     * A list of output structures.
     *
     * @return A list of output structures.
     */
    public java.util.List<Output> getOutputs() {
        if (outputs == null) {
            outputs = new java.util.ArrayList<Output>();
        }
        return outputs;
    }
    
    /**
     * A list of output structures.
     *
     * @param outputs A list of output structures.
     */
    public void setOutputs(java.util.Collection<Output> outputs) {
        java.util.List<Output> outputsCopy = new java.util.ArrayList<Output>();
        if (outputs != null) {
            outputsCopy.addAll(outputs);
        }
        this.outputs = outputsCopy;
    }
    
    /**
     * A list of output structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param outputs A list of output structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Stack withOutputs(Output... outputs) {
        for (Output value : outputs) {
            getOutputs().add(value);
        }
        return this;
    }
    
    /**
     * A list of output structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param outputs A list of output structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Stack withOutputs(java.util.Collection<Output> outputs) {
        java.util.List<Output> outputsCopy = new java.util.ArrayList<Output>();
        if (outputs != null) {
            outputsCopy.addAll(outputs);
        }
        this.outputs = outputsCopy;

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
        sb.append("StackId: " + stackId + ", ");
        sb.append("StackName: " + stackName + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("Parameters: " + parameters + ", ");
        sb.append("CreationTime: " + creationTime + ", ");
        sb.append("StackStatus: " + stackStatus + ", ");
        sb.append("StackStatusReason: " + stackStatusReason + ", ");
        sb.append("DisableRollback: " + disableRollback + ", ");
        sb.append("NotificationARNs: " + notificationARNs + ", ");
        sb.append("TimeoutInMinutes: " + timeoutInMinutes + ", ");
        sb.append("Outputs: " + outputs + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    