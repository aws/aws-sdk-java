/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a parameter object.
 * </p>
 */
public class ParameterObject implements Serializable {

    /**
     * Identifier of the parameter object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String id;

    /**
     * The attributes of the parameter object.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ParameterAttribute> attributes;

    /**
     * Identifier of the parameter object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return Identifier of the parameter object.
     */
    public String getId() {
        return id;
    }
    
    /**
     * Identifier of the parameter object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param id Identifier of the parameter object.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Identifier of the parameter object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param id Identifier of the parameter object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ParameterObject withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The attributes of the parameter object.
     *
     * @return The attributes of the parameter object.
     */
    public java.util.List<ParameterAttribute> getAttributes() {
        if (attributes == null) {
              attributes = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterAttribute>();
              attributes.setAutoConstruct(true);
        }
        return attributes;
    }
    
    /**
     * The attributes of the parameter object.
     *
     * @param attributes The attributes of the parameter object.
     */
    public void setAttributes(java.util.Collection<ParameterAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ParameterAttribute> attributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterAttribute>(attributes.size());
        attributesCopy.addAll(attributes);
        this.attributes = attributesCopy;
    }
    
    /**
     * The attributes of the parameter object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The attributes of the parameter object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ParameterObject withAttributes(ParameterAttribute... attributes) {
        if (getAttributes() == null) setAttributes(new java.util.ArrayList<ParameterAttribute>(attributes.length));
        for (ParameterAttribute value : attributes) {
            getAttributes().add(value);
        }
        return this;
    }
    
    /**
     * The attributes of the parameter object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The attributes of the parameter object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ParameterObject withAttributes(java.util.Collection<ParameterAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ParameterAttribute> attributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterAttribute>(attributes.size());
            attributesCopy.addAll(attributes);
            this.attributes = attributesCopy;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ParameterObject == false) return false;
        ParameterObject other = (ParameterObject)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
}
    