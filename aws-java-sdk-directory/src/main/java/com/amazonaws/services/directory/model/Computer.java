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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a computer account in a directory.
 * </p>
 */
public class Computer implements Serializable, Cloneable {

    /**
     * The identifier of the computer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&\w+-.@]+<br/>
     */
    private String computerId;

    /**
     * The computer name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     */
    private String computerName;

    /**
     * An array of <a>Attribute</a> objects that contain the LDAP attributes
     * that belong to the computer account.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Attribute> computerAttributes;

    /**
     * The identifier of the computer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&\w+-.@]+<br/>
     *
     * @return The identifier of the computer.
     */
    public String getComputerId() {
        return computerId;
    }
    
    /**
     * The identifier of the computer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&\w+-.@]+<br/>
     *
     * @param computerId The identifier of the computer.
     */
    public void setComputerId(String computerId) {
        this.computerId = computerId;
    }
    
    /**
     * The identifier of the computer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&\w+-.@]+<br/>
     *
     * @param computerId The identifier of the computer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Computer withComputerId(String computerId) {
        this.computerId = computerId;
        return this;
    }

    /**
     * The computer name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     *
     * @return The computer name.
     */
    public String getComputerName() {
        return computerName;
    }
    
    /**
     * The computer name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     *
     * @param computerName The computer name.
     */
    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }
    
    /**
     * The computer name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 15<br/>
     *
     * @param computerName The computer name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Computer withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * An array of <a>Attribute</a> objects that contain the LDAP attributes
     * that belong to the computer account.
     *
     * @return An array of <a>Attribute</a> objects that contain the LDAP attributes
     *         that belong to the computer account.
     */
    public java.util.List<Attribute> getComputerAttributes() {
        if (computerAttributes == null) {
              computerAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<Attribute>();
              computerAttributes.setAutoConstruct(true);
        }
        return computerAttributes;
    }
    
    /**
     * An array of <a>Attribute</a> objects that contain the LDAP attributes
     * that belong to the computer account.
     *
     * @param computerAttributes An array of <a>Attribute</a> objects that contain the LDAP attributes
     *         that belong to the computer account.
     */
    public void setComputerAttributes(java.util.Collection<Attribute> computerAttributes) {
        if (computerAttributes == null) {
            this.computerAttributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Attribute> computerAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Attribute>(computerAttributes.size());
        computerAttributesCopy.addAll(computerAttributes);
        this.computerAttributes = computerAttributesCopy;
    }
    
    /**
     * An array of <a>Attribute</a> objects that contain the LDAP attributes
     * that belong to the computer account.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setComputerAttributes(java.util.Collection)} or
     * {@link #withComputerAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param computerAttributes An array of <a>Attribute</a> objects that contain the LDAP attributes
     *         that belong to the computer account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Computer withComputerAttributes(Attribute... computerAttributes) {
        if (getComputerAttributes() == null) setComputerAttributes(new java.util.ArrayList<Attribute>(computerAttributes.length));
        for (Attribute value : computerAttributes) {
            getComputerAttributes().add(value);
        }
        return this;
    }
    
    /**
     * An array of <a>Attribute</a> objects that contain the LDAP attributes
     * that belong to the computer account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param computerAttributes An array of <a>Attribute</a> objects that contain the LDAP attributes
     *         that belong to the computer account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Computer withComputerAttributes(java.util.Collection<Attribute> computerAttributes) {
        if (computerAttributes == null) {
            this.computerAttributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Attribute> computerAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Attribute>(computerAttributes.size());
            computerAttributesCopy.addAll(computerAttributes);
            this.computerAttributes = computerAttributesCopy;
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
        if (getComputerId() != null) sb.append("ComputerId: " + getComputerId() + ",");
        if (getComputerName() != null) sb.append("ComputerName: " + getComputerName() + ",");
        if (getComputerAttributes() != null) sb.append("ComputerAttributes: " + getComputerAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getComputerId() == null) ? 0 : getComputerId().hashCode()); 
        hashCode = prime * hashCode + ((getComputerName() == null) ? 0 : getComputerName().hashCode()); 
        hashCode = prime * hashCode + ((getComputerAttributes() == null) ? 0 : getComputerAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Computer == false) return false;
        Computer other = (Computer)obj;
        
        if (other.getComputerId() == null ^ this.getComputerId() == null) return false;
        if (other.getComputerId() != null && other.getComputerId().equals(this.getComputerId()) == false) return false; 
        if (other.getComputerName() == null ^ this.getComputerName() == null) return false;
        if (other.getComputerName() != null && other.getComputerName().equals(this.getComputerName()) == false) return false; 
        if (other.getComputerAttributes() == null ^ this.getComputerAttributes() == null) return false;
        if (other.getComputerAttributes() != null && other.getComputerAttributes().equals(this.getComputerAttributes()) == false) return false; 
        return true;
    }
    
    @Override
    public Computer clone() {
        try {
            return (Computer) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    