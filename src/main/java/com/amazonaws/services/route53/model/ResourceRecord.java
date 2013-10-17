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
package com.amazonaws.services.route53.model;

import java.io.Serializable;


/**
 * <p>
 * A complex type that contains the value of the <code>Value</code> element for the current resource record set.
 * </p>
 */
public class ResourceRecord implements Serializable {

    /**
     * The value of the <code>Value</code> element for the current resource
     * record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4000<br/>
     */
    private String value;

    /**
     * Default constructor for a new ResourceRecord object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ResourceRecord() {}
    
    /**
     * Constructs a new ResourceRecord object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param value The value of the <code>Value</code> element for the
     * current resource record set.
     */
    public ResourceRecord(String value) {
        setValue(value);
    }

    /**
     * The value of the <code>Value</code> element for the current resource
     * record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4000<br/>
     *
     * @return The value of the <code>Value</code> element for the current resource
     *         record set.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The value of the <code>Value</code> element for the current resource
     * record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4000<br/>
     *
     * @param value The value of the <code>Value</code> element for the current resource
     *         record set.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The value of the <code>Value</code> element for the current resource
     * record set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4000<br/>
     *
     * @param value The value of the <code>Value</code> element for the current resource
     *         record set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResourceRecord withValue(String value) {
        this.value = value;
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
        if (getValue() != null) sb.append("Value: " + getValue() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResourceRecord == false) return false;
        ResourceRecord other = (ResourceRecord)obj;
        
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        return true;
    }
    
}
    