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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;


/**
 * <p>
 * This represents a step in a cluster.
 * </p>
 */
public class Step implements Serializable {

    /**
     * The identifier of the cluster step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String id;

    /**
     * The name of the cluster step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String name;

    /**
     * The Hadoop job configuration of the cluster step.
     */
    private HadoopStepConfig config;

    /**
     * This specifies what action to take when the cluster step fails.
     * TERMINATE_JOB_FLOW is deprecated, use TERMINATE_CLUSTER instead.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, TERMINATE_CLUSTER, CANCEL_AND_WAIT, CONTINUE
     */
    private String actionOnFailure;

    /**
     * The current execution status details of the cluster step.
     */
    private StepStatus status;

    /**
     * The identifier of the cluster step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The identifier of the cluster step.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The identifier of the cluster step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param id The identifier of the cluster step.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The identifier of the cluster step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param id The identifier of the cluster step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Step withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The name of the cluster step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The name of the cluster step.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the cluster step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param name The name of the cluster step.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the cluster step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param name The name of the cluster step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Step withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The Hadoop job configuration of the cluster step.
     *
     * @return The Hadoop job configuration of the cluster step.
     */
    public HadoopStepConfig getConfig() {
        return config;
    }
    
    /**
     * The Hadoop job configuration of the cluster step.
     *
     * @param config The Hadoop job configuration of the cluster step.
     */
    public void setConfig(HadoopStepConfig config) {
        this.config = config;
    }
    
    /**
     * The Hadoop job configuration of the cluster step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param config The Hadoop job configuration of the cluster step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Step withConfig(HadoopStepConfig config) {
        this.config = config;
        return this;
    }

    /**
     * This specifies what action to take when the cluster step fails.
     * TERMINATE_JOB_FLOW is deprecated, use TERMINATE_CLUSTER instead.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, TERMINATE_CLUSTER, CANCEL_AND_WAIT, CONTINUE
     *
     * @return This specifies what action to take when the cluster step fails.
     *         TERMINATE_JOB_FLOW is deprecated, use TERMINATE_CLUSTER instead.
     *
     * @see ActionOnFailure
     */
    public String getActionOnFailure() {
        return actionOnFailure;
    }
    
    /**
     * This specifies what action to take when the cluster step fails.
     * TERMINATE_JOB_FLOW is deprecated, use TERMINATE_CLUSTER instead.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, TERMINATE_CLUSTER, CANCEL_AND_WAIT, CONTINUE
     *
     * @param actionOnFailure This specifies what action to take when the cluster step fails.
     *         TERMINATE_JOB_FLOW is deprecated, use TERMINATE_CLUSTER instead.
     *
     * @see ActionOnFailure
     */
    public void setActionOnFailure(String actionOnFailure) {
        this.actionOnFailure = actionOnFailure;
    }
    
    /**
     * This specifies what action to take when the cluster step fails.
     * TERMINATE_JOB_FLOW is deprecated, use TERMINATE_CLUSTER instead.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, TERMINATE_CLUSTER, CANCEL_AND_WAIT, CONTINUE
     *
     * @param actionOnFailure This specifies what action to take when the cluster step fails.
     *         TERMINATE_JOB_FLOW is deprecated, use TERMINATE_CLUSTER instead.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ActionOnFailure
     */
    public Step withActionOnFailure(String actionOnFailure) {
        this.actionOnFailure = actionOnFailure;
        return this;
    }

    /**
     * This specifies what action to take when the cluster step fails.
     * TERMINATE_JOB_FLOW is deprecated, use TERMINATE_CLUSTER instead.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, TERMINATE_CLUSTER, CANCEL_AND_WAIT, CONTINUE
     *
     * @param actionOnFailure This specifies what action to take when the cluster step fails.
     *         TERMINATE_JOB_FLOW is deprecated, use TERMINATE_CLUSTER instead.
     *
     * @see ActionOnFailure
     */
    public void setActionOnFailure(ActionOnFailure actionOnFailure) {
        this.actionOnFailure = actionOnFailure.toString();
    }
    
    /**
     * This specifies what action to take when the cluster step fails.
     * TERMINATE_JOB_FLOW is deprecated, use TERMINATE_CLUSTER instead.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, TERMINATE_CLUSTER, CANCEL_AND_WAIT, CONTINUE
     *
     * @param actionOnFailure This specifies what action to take when the cluster step fails.
     *         TERMINATE_JOB_FLOW is deprecated, use TERMINATE_CLUSTER instead.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ActionOnFailure
     */
    public Step withActionOnFailure(ActionOnFailure actionOnFailure) {
        this.actionOnFailure = actionOnFailure.toString();
        return this;
    }

    /**
     * The current execution status details of the cluster step.
     *
     * @return The current execution status details of the cluster step.
     */
    public StepStatus getStatus() {
        return status;
    }
    
    /**
     * The current execution status details of the cluster step.
     *
     * @param status The current execution status details of the cluster step.
     */
    public void setStatus(StepStatus status) {
        this.status = status;
    }
    
    /**
     * The current execution status details of the cluster step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The current execution status details of the cluster step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Step withStatus(StepStatus status) {
        this.status = status;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getConfig() != null) sb.append("Config: " + getConfig() + ",");
        if (getActionOnFailure() != null) sb.append("ActionOnFailure: " + getActionOnFailure() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode()); 
        hashCode = prime * hashCode + ((getActionOnFailure() == null) ? 0 : getActionOnFailure().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Step == false) return false;
        Step other = (Step)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getConfig() == null ^ this.getConfig() == null) return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false) return false; 
        if (other.getActionOnFailure() == null ^ this.getActionOnFailure() == null) return false;
        if (other.getActionOnFailure() != null && other.getActionOnFailure().equals(this.getActionOnFailure()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    