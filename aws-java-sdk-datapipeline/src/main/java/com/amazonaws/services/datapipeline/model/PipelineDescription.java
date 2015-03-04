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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Contains pipeline metadata.
 * </p>
 */
public class PipelineDescription implements Serializable, Cloneable {

    /**
     * The pipeline identifier that was assigned by AWS Data Pipeline. This
     * is a string of the form <code>df-297EG78HU43EEXAMPLE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String pipelineId;

    /**
     * Name of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
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
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String description;

    /**
     * A list of tags to associated with a pipeline. Tags let you control
     * access to pipelines. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     * User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The pipeline identifier that was assigned by AWS Data Pipeline. This
     * is a string of the form <code>df-297EG78HU43EEXAMPLE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
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
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
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
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
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
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
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
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
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
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
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
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
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
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
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
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
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
     * A list of tags to associated with a pipeline. Tags let you control
     * access to pipelines. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     * User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return A list of tags to associated with a pipeline. Tags let you control
     *         access to pipelines. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     *         User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     *         Guide</i>.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags to associated with a pipeline. Tags let you control
     * access to pipelines. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     * User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param tags A list of tags to associated with a pipeline. Tags let you control
     *         access to pipelines. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     *         User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     *         Guide</i>.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags to associated with a pipeline. Tags let you control
     * access to pipelines. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     * User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param tags A list of tags to associated with a pipeline. Tags let you control
     *         access to pipelines. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     *         User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PipelineDescription withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags to associated with a pipeline. Tags let you control
     * access to pipelines. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     * User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param tags A list of tags to associated with a pipeline. Tags let you control
     *         access to pipelines. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     *         User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PipelineDescription withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
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
        if (getPipelineId() != null) sb.append("PipelineId: " + getPipelineId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getFields() != null) sb.append("Fields: " + getFields() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
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
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public PipelineDescription clone() {
        try {
            return (PipelineDescription) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    