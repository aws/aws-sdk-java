/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 */
public class AssociateRouteTableResult implements Serializable {

    /**
     * The route table association ID (needed to disassociate the route
     * table).
     */
    private String associationId;

    /**
     * The route table association ID (needed to disassociate the route
     * table).
     *
     * @return The route table association ID (needed to disassociate the route
     *         table).
     */
    public String getAssociationId() {
        return associationId;
    }
    
    /**
     * The route table association ID (needed to disassociate the route
     * table).
     *
     * @param associationId The route table association ID (needed to disassociate the route
     *         table).
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }
    
    /**
     * The route table association ID (needed to disassociate the route
     * table).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associationId The route table association ID (needed to disassociate the route
     *         table).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssociateRouteTableResult withAssociationId(String associationId) {
        this.associationId = associationId;
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
        if (getAssociationId() != null) sb.append("AssociationId: " + getAssociationId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssociateRouteTableResult == false) return false;
        AssociateRouteTableResult other = (AssociateRouteTableResult)obj;
        
        if (other.getAssociationId() == null ^ this.getAssociationId() == null) return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false) return false; 
        return true;
    }
    
}
    