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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;


/**
 * <p>
 * A structure containing a list of offerings.
 * </p>
 */
public class DescribeOfferingsResult implements Serializable {

    /**
     * A list of offerings.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Offering> offerings;

    /**
     * A list of offerings.
     *
     * @return A list of offerings.
     */
    public java.util.List<Offering> getOfferings() {
        
        if (offerings == null) {
              offerings = new com.amazonaws.internal.ListWithAutoConstructFlag<Offering>();
              offerings.setAutoConstruct(true);
        }
        return offerings;
    }
    
    /**
     * A list of offerings.
     *
     * @param offerings A list of offerings.
     */
    public void setOfferings(java.util.Collection<Offering> offerings) {
        if (offerings == null) {
            this.offerings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Offering> offeringsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Offering>(offerings.size());
        offeringsCopy.addAll(offerings);
        this.offerings = offeringsCopy;
    }
    
    /**
     * A list of offerings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param offerings A list of offerings.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeOfferingsResult withOfferings(Offering... offerings) {
        if (getOfferings() == null) setOfferings(new java.util.ArrayList<Offering>(offerings.length));
        for (Offering value : offerings) {
            getOfferings().add(value);
        }
        return this;
    }
    
    /**
     * A list of offerings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param offerings A list of offerings.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeOfferingsResult withOfferings(java.util.Collection<Offering> offerings) {
        if (offerings == null) {
            this.offerings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Offering> offeringsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Offering>(offerings.size());
            offeringsCopy.addAll(offerings);
            this.offerings = offeringsCopy;
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
        if (getOfferings() != null) sb.append("Offerings: " + getOfferings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOfferings() == null) ? 0 : getOfferings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeOfferingsResult == false) return false;
        DescribeOfferingsResult other = (DescribeOfferingsResult)obj;
        
        if (other.getOfferings() == null ^ this.getOfferings() == null) return false;
        if (other.getOfferings() != null && other.getOfferings().equals(this.getOfferings()) == false) return false; 
        return true;
    }
    
}
    