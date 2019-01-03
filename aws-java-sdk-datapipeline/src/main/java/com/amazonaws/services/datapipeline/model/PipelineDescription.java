/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains pipeline metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/PipelineDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The pipeline identifier that was assigned by AWS Data Pipeline. This is a string of the form
     * <code>df-297EG78HU43EEXAMPLE</code>.
     * </p>
     */
    private String pipelineId;
    /**
     * <p>
     * The name of the pipeline.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of read-only fields that contain metadata about the pipeline: @userId, @accountId, and @pipelineState.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Field> fields;
    /**
     * <p>
     * Description of the pipeline.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of tags to associated with a pipeline. Tags let you control access to pipelines. For more information, see
     * <a href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling User
     * Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The pipeline identifier that was assigned by AWS Data Pipeline. This is a string of the form
     * <code>df-297EG78HU43EEXAMPLE</code>.
     * </p>
     * 
     * @param pipelineId
     *        The pipeline identifier that was assigned by AWS Data Pipeline. This is a string of the form
     *        <code>df-297EG78HU43EEXAMPLE</code>.
     */

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * <p>
     * The pipeline identifier that was assigned by AWS Data Pipeline. This is a string of the form
     * <code>df-297EG78HU43EEXAMPLE</code>.
     * </p>
     * 
     * @return The pipeline identifier that was assigned by AWS Data Pipeline. This is a string of the form
     *         <code>df-297EG78HU43EEXAMPLE</code>.
     */

    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * <p>
     * The pipeline identifier that was assigned by AWS Data Pipeline. This is a string of the form
     * <code>df-297EG78HU43EEXAMPLE</code>.
     * </p>
     * 
     * @param pipelineId
     *        The pipeline identifier that was assigned by AWS Data Pipeline. This is a string of the form
     *        <code>df-297EG78HU43EEXAMPLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDescription withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
        return this;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param name
     *        The name of the pipeline.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @return The name of the pipeline.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param name
     *        The name of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of read-only fields that contain metadata about the pipeline: @userId, @accountId, and @pipelineState.
     * </p>
     * 
     * @return A list of read-only fields that contain metadata about the pipeline: @userId, @accountId, and
     *         @pipelineState.
     */

    public java.util.List<Field> getFields() {
        if (fields == null) {
            fields = new com.amazonaws.internal.SdkInternalList<Field>();
        }
        return fields;
    }

    /**
     * <p>
     * A list of read-only fields that contain metadata about the pipeline: @userId, @accountId, and @pipelineState.
     * </p>
     * 
     * @param fields
     *        A list of read-only fields that contain metadata about the pipeline: @userId, @accountId, and
     *        @pipelineState.
     */

    public void setFields(java.util.Collection<Field> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new com.amazonaws.internal.SdkInternalList<Field>(fields);
    }

    /**
     * <p>
     * A list of read-only fields that contain metadata about the pipeline: @userId, @accountId, and @pipelineState.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        A list of read-only fields that contain metadata about the pipeline: @userId, @accountId, and
     *        @pipelineState.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDescription withFields(Field... fields) {
        if (this.fields == null) {
            setFields(new com.amazonaws.internal.SdkInternalList<Field>(fields.length));
        }
        for (Field ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of read-only fields that contain metadata about the pipeline: @userId, @accountId, and @pipelineState.
     * </p>
     * 
     * @param fields
     *        A list of read-only fields that contain metadata about the pipeline: @userId, @accountId, and
     *        @pipelineState.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDescription withFields(java.util.Collection<Field> fields) {
        setFields(fields);
        return this;
    }

    /**
     * <p>
     * Description of the pipeline.
     * </p>
     * 
     * @param description
     *        Description of the pipeline.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the pipeline.
     * </p>
     * 
     * @return Description of the pipeline.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the pipeline.
     * </p>
     * 
     * @param description
     *        Description of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of tags to associated with a pipeline. Tags let you control access to pipelines. For more information, see
     * <a href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling User
     * Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     * </p>
     * 
     * @return A list of tags to associated with a pipeline. Tags let you control access to pipelines. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     *         User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags to associated with a pipeline. Tags let you control access to pipelines. For more information, see
     * <a href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling User
     * Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of tags to associated with a pipeline. Tags let you control access to pipelines. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     *        User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to associated with a pipeline. Tags let you control access to pipelines. For more information, see
     * <a href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling User
     * Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to associated with a pipeline. Tags let you control access to pipelines. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     *        User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDescription withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to associated with a pipeline. Tags let you control access to pipelines. For more information, see
     * <a href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling User
     * Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of tags to associated with a pipeline. Tags let you control access to pipelines. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     *        User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineDescription withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPipelineId() != null)
            sb.append("PipelineId: ").append(getPipelineId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineDescription == false)
            return false;
        PipelineDescription other = (PipelineDescription) obj;
        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
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
    public PipelineDescription clone() {
        try {
            return (PipelineDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datapipeline.model.transform.PipelineDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
