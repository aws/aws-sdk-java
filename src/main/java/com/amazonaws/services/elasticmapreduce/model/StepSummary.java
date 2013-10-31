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
 * The summary of the cluster step.
 * </p>
 */
public class StepSummary implements Serializable {

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
    public StepSummary withId(String id) {
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
    public StepSummary withName(String name) {
        this.name = name;
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
    public StepSummary withStatus(StepStatus status) {
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
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StepSummary == false) return false;
        StepSummary other = (StepSummary)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    