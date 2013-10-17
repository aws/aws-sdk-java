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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;


/**
 * <p>
 * Contains information about a pipeline object. This can be a logical, physical, or physical attempt pipeline object. The complete set of components of
 * a pipeline defines the pipeline.
 * </p>
 */
public class PipelineObject implements Serializable {

    /**
     * Identifier of the object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String id;

    /**
     * Name of the object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String name;

    /**
     * Key-value pairs that define the properties of the object.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Field> fields;

    /**
     * Identifier of the object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Identifier of the object.
     */
    public String getId() {
        return id;
    }
    
    /**
     * Identifier of the object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param id Identifier of the object.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Identifier of the object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param id Identifier of the object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PipelineObject withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Name of the object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Name of the object.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Name of the object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name Name of the object.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Name of the object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name Name of the object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PipelineObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Key-value pairs that define the properties of the object.
     *
     * @return Key-value pairs that define the properties of the object.
     */
    public java.util.List<Field> getFields() {
        if (fields == null) {
              fields = new com.amazonaws.internal.ListWithAutoConstructFlag<Field>();
              fields.setAutoConstruct(true);
        }
        return fields;
    }
    
    /**
     * Key-value pairs that define the properties of the object.
     *
     * @param fields Key-value pairs that define the properties of the object.
     */
    public void setFields(java.util.Collection<Field> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Field> fieldsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Field>(fields.size());
        fieldsCopy.addAll(fields);
        this.fields = fieldsCopy;
    }
    
    /**
     * Key-value pairs that define the properties of the object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fields Key-value pairs that define the properties of the object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PipelineObject withFields(Field... fields) {
        if (getFields() == null) setFields(new java.util.ArrayList<Field>(fields.length));
        for (Field value : fields) {
            getFields().add(value);
        }
        return this;
    }
    
    /**
     * Key-value pairs that define the properties of the object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fields Key-value pairs that define the properties of the object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PipelineObject withFields(java.util.Collection<Field> fields) {
        if (fields == null) {
            this.fields = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Field> fieldsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Field>(fields.size());
            fieldsCopy.addAll(fields);
            this.fields = fieldsCopy;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getFields() != null) sb.append("Fields: " + getFields() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PipelineObject == false) return false;
        PipelineObject other = (PipelineObject)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getFields() == null ^ this.getFields() == null) return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false) return false; 
        return true;
    }
    
}
    