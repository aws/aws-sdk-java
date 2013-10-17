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
 * Iam Instance Profile Specification
 */
public class IamInstanceProfileSpecification implements Serializable {

    private String arn;

    private String name;

    /**
     * Returns the value of the Arn property for this object.
     *
     * @return The value of the Arn property for this object.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * Sets the value of the Arn property for this object.
     *
     * @param arn The new value for the Arn property for this object.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * Sets the value of the Arn property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param arn The new value for the Arn property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IamInstanceProfileSpecification withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * Returns the value of the Name property for this object.
     *
     * @return The value of the Name property for this object.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     *
     * @param name The new value for the Name property for this object.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The new value for the Name property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IamInstanceProfileSpecification withName(String name) {
        this.name = name;
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
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getName() != null) sb.append("Name: " + getName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof IamInstanceProfileSpecification == false) return false;
        IamInstanceProfileSpecification other = (IamInstanceProfileSpecification)obj;
        
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        return true;
    }
    
}
    