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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * Instance Status Summary
 */
public class InstanceStatusSummary implements Serializable {

    private String status;

    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatusDetails> details;

    /**
     * Returns the value of the Status property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired, insufficient-data, not-applicable
     *
     * @return The value of the Status property for this object.
     *
     * @see SummaryStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Sets the value of the Status property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired, insufficient-data, not-applicable
     *
     * @param status The new value for the Status property for this object.
     *
     * @see SummaryStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Sets the value of the Status property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired, insufficient-data, not-applicable
     *
     * @param status The new value for the Status property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SummaryStatus
     */
    public InstanceStatusSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Sets the value of the Status property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired, insufficient-data, not-applicable
     *
     * @param status The new value for the Status property for this object.
     *
     * @see SummaryStatus
     */
    public void setStatus(SummaryStatus status) {
        this.status = status.toString();
    }
    
    /**
     * Sets the value of the Status property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ok, impaired, insufficient-data, not-applicable
     *
     * @param status The new value for the Status property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SummaryStatus
     */
    public InstanceStatusSummary withStatus(SummaryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Returns the value of the Details property for this object.
     *
     * @return The value of the Details property for this object.
     */
    public java.util.List<InstanceStatusDetails> getDetails() {
        if (details == null) {
              details = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatusDetails>();
              details.setAutoConstruct(true);
        }
        return details;
    }
    
    /**
     * Sets the value of the Details property for this object.
     *
     * @param details The new value for the Details property for this object.
     */
    public void setDetails(java.util.Collection<InstanceStatusDetails> details) {
        if (details == null) {
            this.details = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatusDetails> detailsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatusDetails>(details.size());
        detailsCopy.addAll(details);
        this.details = detailsCopy;
    }
    
    /**
     * Sets the value of the Details property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param details The new value for the Details property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceStatusSummary withDetails(InstanceStatusDetails... details) {
        if (getDetails() == null) setDetails(new java.util.ArrayList<InstanceStatusDetails>(details.length));
        for (InstanceStatusDetails value : details) {
            getDetails().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Details property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param details The new value for the Details property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceStatusSummary withDetails(java.util.Collection<InstanceStatusDetails> details) {
        if (details == null) {
            this.details = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatusDetails> detailsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceStatusDetails>(details.size());
            detailsCopy.addAll(details);
            this.details = detailsCopy;
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
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getDetails() != null) sb.append("Details: " + getDetails() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceStatusSummary == false) return false;
        InstanceStatusSummary other = (InstanceStatusSummary)obj;
        
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getDetails() == null ^ this.getDetails() == null) return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false) return false; 
        return true;
    }
    
}
    