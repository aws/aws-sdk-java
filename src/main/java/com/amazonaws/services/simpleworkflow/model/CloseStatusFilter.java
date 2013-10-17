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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;


/**
 * <p>
 * Used to filter the closed workflow executions in visibility APIs by their close status.
 * </p>
 */
public class CloseStatusFilter implements Serializable {

    /**
     * The close status that must match the close status of an execution for
     * it to meet the criteria of this filter. This field is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT
     */
    private String status;

    /**
     * The close status that must match the close status of an execution for
     * it to meet the criteria of this filter. This field is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT
     *
     * @return The close status that must match the close status of an execution for
     *         it to meet the criteria of this filter. This field is required.
     *
     * @see CloseStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The close status that must match the close status of an execution for
     * it to meet the criteria of this filter. This field is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT
     *
     * @param status The close status that must match the close status of an execution for
     *         it to meet the criteria of this filter. This field is required.
     *
     * @see CloseStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The close status that must match the close status of an execution for
     * it to meet the criteria of this filter. This field is required.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT
     *
     * @param status The close status that must match the close status of an execution for
     *         it to meet the criteria of this filter. This field is required.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see CloseStatus
     */
    public CloseStatusFilter withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The close status that must match the close status of an execution for
     * it to meet the criteria of this filter. This field is required.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT
     *
     * @param status The close status that must match the close status of an execution for
     *         it to meet the criteria of this filter. This field is required.
     *
     * @see CloseStatus
     */
    public void setStatus(CloseStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The close status that must match the close status of an execution for
     * it to meet the criteria of this filter. This field is required.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPLETED, FAILED, CANCELED, TERMINATED, CONTINUED_AS_NEW, TIMED_OUT
     *
     * @param status The close status that must match the close status of an execution for
     *         it to meet the criteria of this filter. This field is required.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see CloseStatus
     */
    public CloseStatusFilter withStatus(CloseStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CloseStatusFilter == false) return false;
        CloseStatusFilter other = (CloseStatusFilter)obj;
        
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    