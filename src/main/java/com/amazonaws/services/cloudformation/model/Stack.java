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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;


/**
 * <p>
 * The Stack data type.
 * </p>
 */
public class Stack implements Serializable {

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
    private com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parameters;

    /**
     * Time at which the stack was created.
     */
    private java.util.Date creationTime;

    /**
     * The time the stack was last updated. This field will only be returned
     * if the stack has been updated at least once.
     */
    private java.util.Date lastUpdatedTime;

    /**
     * Current status of the stack.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE
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
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> notificationARNs;

    /**
     * The amount of time within which stack creation should complete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer timeoutInMinutes;

    /**
     * The capabilities allowed in the stack.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> capabilities;

    /**
     * A list of output structures.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Output> outputs;

    /**
     * A list of <code>Tag</code>s that specify cost allocation information
     * for the stack.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

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
              parameters = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>();
              parameters.setAutoConstruct(true);
        }
        return parameters;
    }
    
    /**
     * A list of <code>Parameter</code> structures.
     *
     * @param parameters A list of <code>Parameter</code> structures.
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parametersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>(parameters.size());
        parametersCopy.addAll(parameters);
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
        if (getParameters() == null) setParameters(new java.util.ArrayList<Parameter>(parameters.length));
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
        if (parameters == null) {
            this.parameters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parametersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>(parameters.size());
            parametersCopy.addAll(parameters);
            this.parameters = parametersCopy;
        }

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
     * The time the stack was last updated. This field will only be returned
     * if the stack has been updated at least once.
     *
     * @return The time the stack was last updated. This field will only be returned
     *         if the stack has been updated at least once.
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }
    
    /**
     * The time the stack was last updated. This field will only be returned
     * if the stack has been updated at least once.
     *
     * @param lastUpdatedTime The time the stack was last updated. This field will only be returned
     *         if the stack has been updated at least once.
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
    
    /**
     * The time the stack was last updated. This field will only be returned
     * if the stack has been updated at least once.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastUpdatedTime The time the stack was last updated. This field will only be returned
     *         if the stack has been updated at least once.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * Current status of the stack.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE
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
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE
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
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE
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
     * Current status of the stack.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE
     *
     * @param stackStatus Current status of the stack.
     *
     * @see StackStatus
     */
    public void setStackStatus(StackStatus stackStatus) {
        this.stackStatus = stackStatus.toString();
    }
    
    /**
     * Current status of the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE, ROLLBACK_IN_PROGRESS, ROLLBACK_FAILED, ROLLBACK_COMPLETE, DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE, UPDATE_IN_PROGRESS, UPDATE_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_COMPLETE, UPDATE_ROLLBACK_IN_PROGRESS, UPDATE_ROLLBACK_FAILED, UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS, UPDATE_ROLLBACK_COMPLETE
     *
     * @param stackStatus Current status of the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StackStatus
     */
    public Stack withStackStatus(StackStatus stackStatus) {
        this.stackStatus = stackStatus.toString();
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
              notificationARNs = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              notificationARNs.setAutoConstruct(true);
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
        if (notificationARNs == null) {
            this.notificationARNs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> notificationARNsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(notificationARNs.size());
        notificationARNsCopy.addAll(notificationARNs);
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
        if (getNotificationARNs() == null) setNotificationARNs(new java.util.ArrayList<String>(notificationARNs.length));
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
        if (notificationARNs == null) {
            this.notificationARNs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> notificationARNsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(notificationARNs.size());
            notificationARNsCopy.addAll(notificationARNs);
            this.notificationARNs = notificationARNsCopy;
        }

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
     * The capabilities allowed in the stack.
     *
     * @return The capabilities allowed in the stack.
     */
    public java.util.List<String> getCapabilities() {
        if (capabilities == null) {
              capabilities = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              capabilities.setAutoConstruct(true);
        }
        return capabilities;
    }
    
    /**
     * The capabilities allowed in the stack.
     *
     * @param capabilities The capabilities allowed in the stack.
     */
    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> capabilitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(capabilities.size());
        capabilitiesCopy.addAll(capabilities);
        this.capabilities = capabilitiesCopy;
    }
    
    /**
     * The capabilities allowed in the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capabilities The capabilities allowed in the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withCapabilities(String... capabilities) {
        if (getCapabilities() == null) setCapabilities(new java.util.ArrayList<String>(capabilities.length));
        for (String value : capabilities) {
            getCapabilities().add(value);
        }
        return this;
    }
    
    /**
     * The capabilities allowed in the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capabilities The capabilities allowed in the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> capabilitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(capabilities.size());
            capabilitiesCopy.addAll(capabilities);
            this.capabilities = capabilitiesCopy;
        }

        return this;
    }

    /**
     * The capabilities allowed in the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capabilities The capabilities allowed in the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withCapabilities(Capability... capabilities) {
        java.util.ArrayList<String> capabilitiesCopy = new java.util.ArrayList<String>(capabilities.length);
        for (Capability member : capabilities) {
            capabilitiesCopy.add(member.toString());
        }
        if (getCapabilities() == null) {
            setCapabilities(capabilitiesCopy);
        } else {
            getCapabilities().addAll(capabilitiesCopy);
        }
        return this;
    }

    /**
     * A list of output structures.
     *
     * @return A list of output structures.
     */
    public java.util.List<Output> getOutputs() {
        if (outputs == null) {
              outputs = new com.amazonaws.internal.ListWithAutoConstructFlag<Output>();
              outputs.setAutoConstruct(true);
        }
        return outputs;
    }
    
    /**
     * A list of output structures.
     *
     * @param outputs A list of output structures.
     */
    public void setOutputs(java.util.Collection<Output> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Output> outputsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Output>(outputs.size());
        outputsCopy.addAll(outputs);
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
        if (getOutputs() == null) setOutputs(new java.util.ArrayList<Output>(outputs.length));
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
        if (outputs == null) {
            this.outputs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Output> outputsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Output>(outputs.size());
            outputsCopy.addAll(outputs);
            this.outputs = outputsCopy;
        }

        return this;
    }

    /**
     * A list of <code>Tag</code>s that specify cost allocation information
     * for the stack.
     *
     * @return A list of <code>Tag</code>s that specify cost allocation information
     *         for the stack.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of <code>Tag</code>s that specify cost allocation information
     * for the stack.
     *
     * @param tags A list of <code>Tag</code>s that specify cost allocation information
     *         for the stack.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of <code>Tag</code>s that specify cost allocation information
     * for the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of <code>Tag</code>s that specify cost allocation information
     *         for the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>Tag</code>s that specify cost allocation information
     * for the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of <code>Tag</code>s that specify cost allocation information
     *         for the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Stack withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
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
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getStackName() != null) sb.append("StackName: " + getStackName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getParameters() != null) sb.append("Parameters: " + getParameters() + ",");
        if (getCreationTime() != null) sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastUpdatedTime() != null) sb.append("LastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getStackStatus() != null) sb.append("StackStatus: " + getStackStatus() + ",");
        if (getStackStatusReason() != null) sb.append("StackStatusReason: " + getStackStatusReason() + ",");
        if (isDisableRollback() != null) sb.append("DisableRollback: " + isDisableRollback() + ",");
        if (getNotificationARNs() != null) sb.append("NotificationARNs: " + getNotificationARNs() + ",");
        if (getTimeoutInMinutes() != null) sb.append("TimeoutInMinutes: " + getTimeoutInMinutes() + ",");
        if (getCapabilities() != null) sb.append("Capabilities: " + getCapabilities() + ",");
        if (getOutputs() != null) sb.append("Outputs: " + getOutputs() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode()); 
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode()); 
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode()); 
        hashCode = prime * hashCode + ((getStackStatus() == null) ? 0 : getStackStatus().hashCode()); 
        hashCode = prime * hashCode + ((getStackStatusReason() == null) ? 0 : getStackStatusReason().hashCode()); 
        hashCode = prime * hashCode + ((isDisableRollback() == null) ? 0 : isDisableRollback().hashCode()); 
        hashCode = prime * hashCode + ((getNotificationARNs() == null) ? 0 : getNotificationARNs().hashCode()); 
        hashCode = prime * hashCode + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode()); 
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode()); 
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Stack == false) return false;
        Stack other = (Stack)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getStackName() == null ^ this.getStackName() == null) return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        if (other.getCreationTime() == null ^ this.getCreationTime() == null) return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false) return false; 
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null) return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false) return false; 
        if (other.getStackStatus() == null ^ this.getStackStatus() == null) return false;
        if (other.getStackStatus() != null && other.getStackStatus().equals(this.getStackStatus()) == false) return false; 
        if (other.getStackStatusReason() == null ^ this.getStackStatusReason() == null) return false;
        if (other.getStackStatusReason() != null && other.getStackStatusReason().equals(this.getStackStatusReason()) == false) return false; 
        if (other.isDisableRollback() == null ^ this.isDisableRollback() == null) return false;
        if (other.isDisableRollback() != null && other.isDisableRollback().equals(this.isDisableRollback()) == false) return false; 
        if (other.getNotificationARNs() == null ^ this.getNotificationARNs() == null) return false;
        if (other.getNotificationARNs() != null && other.getNotificationARNs().equals(this.getNotificationARNs()) == false) return false; 
        if (other.getTimeoutInMinutes() == null ^ this.getTimeoutInMinutes() == null) return false;
        if (other.getTimeoutInMinutes() != null && other.getTimeoutInMinutes().equals(this.getTimeoutInMinutes()) == false) return false; 
        if (other.getCapabilities() == null ^ this.getCapabilities() == null) return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false) return false; 
        if (other.getOutputs() == null ^ this.getOutputs() == null) return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    