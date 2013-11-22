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
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * <p>
 * Provides information on the option groups the DB instance is a member of.
 * </p>
 */
public class OptionGroupMembership implements Serializable {

    /**
     * The name of the option group that the instance belongs to.
     */
    private String optionGroupName;

    /**
     * The status of the DB instance's option group membership (e.g. in-sync,
     * pending, pending-maintenance, applying).
     */
    private String status;

    /**
     * The name of the option group that the instance belongs to.
     *
     * @return The name of the option group that the instance belongs to.
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * The name of the option group that the instance belongs to.
     *
     * @param optionGroupName The name of the option group that the instance belongs to.
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * The name of the option group that the instance belongs to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName The name of the option group that the instance belongs to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionGroupMembership withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * The status of the DB instance's option group membership (e.g. in-sync,
     * pending, pending-maintenance, applying).
     *
     * @return The status of the DB instance's option group membership (e.g. in-sync,
     *         pending, pending-maintenance, applying).
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the DB instance's option group membership (e.g. in-sync,
     * pending, pending-maintenance, applying).
     *
     * @param status The status of the DB instance's option group membership (e.g. in-sync,
     *         pending, pending-maintenance, applying).
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the DB instance's option group membership (e.g. in-sync,
     * pending, pending-maintenance, applying).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the DB instance's option group membership (e.g. in-sync,
     *         pending, pending-maintenance, applying).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionGroupMembership withStatus(String status) {
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
        if (getOptionGroupName() != null) sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof OptionGroupMembership == false) return false;
        OptionGroupMembership other = (OptionGroupMembership)obj;
        
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    