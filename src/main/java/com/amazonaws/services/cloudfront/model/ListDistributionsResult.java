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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;


/**
 * <p>
 * The returned result of the corresponding request.
 * </p>
 */
public class ListDistributionsResult implements Serializable {

    /**
     * The DistributionList type.
     */
    private DistributionList distributionList;

    /**
     * The DistributionList type.
     *
     * @return The DistributionList type.
     */
    public DistributionList getDistributionList() {
        return distributionList;
    }
    
    /**
     * The DistributionList type.
     *
     * @param distributionList The DistributionList type.
     */
    public void setDistributionList(DistributionList distributionList) {
        this.distributionList = distributionList;
    }
    
    /**
     * The DistributionList type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param distributionList The DistributionList type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListDistributionsResult withDistributionList(DistributionList distributionList) {
        this.distributionList = distributionList;
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
        if (getDistributionList() != null) sb.append("DistributionList: " + getDistributionList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDistributionList() == null) ? 0 : getDistributionList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDistributionsResult == false) return false;
        ListDistributionsResult other = (ListDistributionsResult)obj;
        
        if (other.getDistributionList() == null ^ this.getDistributionList() == null) return false;
        if (other.getDistributionList() != null && other.getDistributionList().equals(this.getDistributionList()) == false) return false; 
        return true;
    }
    
}
    