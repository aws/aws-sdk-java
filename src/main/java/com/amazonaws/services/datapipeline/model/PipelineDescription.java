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
 * Contains pipeline metadata.
 * </p>
 */
public class PipelineDescription implements Serializable {

    /**
     * The pipeline identifier that was assigned by AWS Data Pipeline. This
     * is a string of the form <code>df-297EG78HU43EEXAMPLE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String pipelineId;

    /**
     * Name of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String name;

    /**
     * A list of read-only fields that contain metadata about the pipeline:
     * @userId, @accountId, and @pipelineState.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Field> fields;

    /**
     * Description of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String description;

    /**
     * The pipeline identifier that was assigned by AWS Data Pipeline. This
     * is a string of the form <code>df-297EG78HU43EEXAMPLE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The pipeline identifier that was assigned by AWS Data Pipeline. This
     *         is a string of the form <code>df-297EG78HU43EEXAMPLE</code>.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    
    /**
     * The pipeline identifier that was assigned by AWS Data Pipeline. This
     * is a string of the form <code>df-297EG78HU43EEXAMPLE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The pipeline identifier that was assigned by AWS Data Pipeline. This
     *         is a string of the form <code>df-297EG78HU43EEXAMPLE</code>.
     */
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }
    
    /**
     * The pipeline identifier that was assigned by AWS Data Pipeline. This
     * is a string of the form <code>df-297EG78HU43EEXAMPLE</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The pipeline identifier that was assigned by AWS Data Pipeline. This
     *         is a string of the form <code>df-297EG78HU43EEXAMPLE</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PipelineDescription withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * Name of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Name of the pipeline.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Name of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name Name of the pipeline.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Name of the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name Name of the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PipelineDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A list of read-only fields that contain metadata about the pipeline:
     * @userId, @accountId, and @pipelineState.
     *
     * @return A list of read-only fields that contain metadata about the pipeline:
     *         @userId, @accountId, and @pipelineState.
     */
    public java.util.List<Field> getFields() {
        if (fields == null) {
              fields = new com.amazonaws.internal.ListWithAutoConstructFlag<Field>();
              fields.setAutoConstruct(true);
        }
        return fields;
    }
    
    /**
     * A list of read-only fields that contain metadata about the pipeline:
     * @userId, @accountId, and @pipelineState.
     *
     * @param fields A list of read-only fields that contain metadata about the pipeline:
     *         @userId, @accountId, and @pipelineState.
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
     * A list of read-only fields that contain metadata about the pipeline:
     * @userId, @accountId, and @pipelineState.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fields A list of read-only fields that contain metadata about the pipeline:
     *         @userId, @accountId, and @pipelineState.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PipelineDescription withFields(Field... fields) {
        if (getFields() == null) setFields(new java.util.ArrayList<Field>(fields.length));
        for (Field value : fields) {
            getFields().add(value);
        }
        return this;
    }
    
    /**
     * A list of read-only fields that contain metadata about the pipeline:
     * @userId, @accountId, and @pipelineState.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fields A list of read-only fields that contain metadata about the pipeline:
     *         @userId, @accountId, and @pipelineState.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PipelineDescription withFields(java.util.Collection<Field> fields) {
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
     * Description of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Description of the pipeline.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Description of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param description Description of the pipeline.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Description of the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param description Description of the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PipelineDescription withDescription(String description) {
        this.description = description;
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
        if (getPipelineId() != null) sb.append("PipelineId: " + getPipelineId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getFields() != null) sb.append("Fields: " + getFields() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PipelineDescription == false) return false;
        PipelineDescription other = (PipelineDescription)obj;
        
        if (other.getPipelineId() == null ^ this.getPipelineId() == null) return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getFields() == null ^ this.getFields() == null) return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        return true;
    }
    
}
    