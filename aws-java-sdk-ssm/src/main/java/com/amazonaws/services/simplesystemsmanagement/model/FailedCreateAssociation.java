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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a failed association.
 * </p>
 */
public class FailedCreateAssociation implements Serializable, Cloneable {

    /**
     * The association.
     */
    private CreateAssociationBatchRequestEntry entry;

    /**
     * A description of the failure.
     */
    private String message;

    /**
     * The source of the failure.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Client, Server, Unknown
     */
    private String fault;

    /**
     * The association.
     *
     * @return The association.
     */
    public CreateAssociationBatchRequestEntry getEntry() {
        return entry;
    }
    
    /**
     * The association.
     *
     * @param entry The association.
     */
    public void setEntry(CreateAssociationBatchRequestEntry entry) {
        this.entry = entry;
    }
    
    /**
     * The association.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param entry The association.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FailedCreateAssociation withEntry(CreateAssociationBatchRequestEntry entry) {
        this.entry = entry;
        return this;
    }

    /**
     * A description of the failure.
     *
     * @return A description of the failure.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * A description of the failure.
     *
     * @param message A description of the failure.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * A description of the failure.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message A description of the failure.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FailedCreateAssociation withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * The source of the failure.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Client, Server, Unknown
     *
     * @return The source of the failure.
     *
     * @see Fault
     */
    public String getFault() {
        return fault;
    }
    
    /**
     * The source of the failure.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Client, Server, Unknown
     *
     * @param fault The source of the failure.
     *
     * @see Fault
     */
    public void setFault(String fault) {
        this.fault = fault;
    }
    
    /**
     * The source of the failure.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Client, Server, Unknown
     *
     * @param fault The source of the failure.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Fault
     */
    public FailedCreateAssociation withFault(String fault) {
        this.fault = fault;
        return this;
    }

    /**
     * The source of the failure.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Client, Server, Unknown
     *
     * @param fault The source of the failure.
     *
     * @see Fault
     */
    public void setFault(Fault fault) {
        this.fault = fault.toString();
    }
    
    /**
     * The source of the failure.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Client, Server, Unknown
     *
     * @param fault The source of the failure.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Fault
     */
    public FailedCreateAssociation withFault(Fault fault) {
        this.fault = fault.toString();
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
        if (getEntry() != null) sb.append("Entry: " + getEntry() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getFault() != null) sb.append("Fault: " + getFault() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEntry() == null) ? 0 : getEntry().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        hashCode = prime * hashCode + ((getFault() == null) ? 0 : getFault().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof FailedCreateAssociation == false) return false;
        FailedCreateAssociation other = (FailedCreateAssociation)obj;
        
        if (other.getEntry() == null ^ this.getEntry() == null) return false;
        if (other.getEntry() != null && other.getEntry().equals(this.getEntry()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getFault() == null ^ this.getFault() == null) return false;
        if (other.getFault() != null && other.getFault().equals(this.getFault()) == false) return false; 
        return true;
    }
    
    @Override
    public FailedCreateAssociation clone() {
        try {
            return (FailedCreateAssociation) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    