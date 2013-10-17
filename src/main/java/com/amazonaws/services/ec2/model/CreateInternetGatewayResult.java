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
 * Create Internet Gateway Result
 */
public class CreateInternetGatewayResult implements Serializable {

    private InternetGateway internetGateway;

    /**
     * Returns the value of the InternetGateway property for this object.
     *
     * @return The value of the InternetGateway property for this object.
     */
    public InternetGateway getInternetGateway() {
        return internetGateway;
    }
    
    /**
     * Sets the value of the InternetGateway property for this object.
     *
     * @param internetGateway The new value for the InternetGateway property for this object.
     */
    public void setInternetGateway(InternetGateway internetGateway) {
        this.internetGateway = internetGateway;
    }
    
    /**
     * Sets the value of the InternetGateway property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param internetGateway The new value for the InternetGateway property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateInternetGatewayResult withInternetGateway(InternetGateway internetGateway) {
        this.internetGateway = internetGateway;
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
        if (getInternetGateway() != null) sb.append("InternetGateway: " + getInternetGateway() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInternetGateway() == null) ? 0 : getInternetGateway().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateInternetGatewayResult == false) return false;
        CreateInternetGatewayResult other = (CreateInternetGatewayResult)obj;
        
        if (other.getInternetGateway() == null ^ this.getInternetGateway() == null) return false;
        if (other.getInternetGateway() != null && other.getInternetGateway().equals(this.getInternetGateway()) == false) return false; 
        return true;
    }
    
}
    