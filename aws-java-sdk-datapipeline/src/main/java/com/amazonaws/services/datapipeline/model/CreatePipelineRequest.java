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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#createPipeline(CreatePipelineRequest) CreatePipeline operation}.
 * <p>
 * Creates a new, empty pipeline. Use PutPipelineDefinition to populate
 * the pipeline.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#createPipeline(CreatePipelineRequest)
 */
public class CreatePipelineRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name for the pipeline. You can use the same name for multiple
     * pipelines associated with your AWS account, because AWS Data Pipeline
     * assigns each pipeline a unique pipeline identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String name;

    /**
     * A unique identifier. This identifier is not the same as the pipeline
     * identifier assigned by AWS Data Pipeline. You are responsible for
     * defining the format and ensuring the uniqueness of this identifier.
     * You use this parameter to ensure idempotency during repeated calls to
     * <code>CreatePipeline</code>. For example, if the first call to
     * <code>CreatePipeline</code> does not succeed, you can pass in the same
     * unique identifier and pipeline name combination on a subsequent call
     * to <code>CreatePipeline</code>. <code>CreatePipeline</code> ensures
     * that if a pipeline already exists with the same name and unique
     * identifier, a new pipeline is not created. Instead, you'll receive the
     * pipeline identifier from the previous attempt. The uniqueness of the
     * name and unique identifier combination is scoped to the AWS account or
     * IAM user credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String uniqueId;

    /**
     * The description for the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String description;

    /**
     * A list of tags to associate with the pipeline at creation. Tags let
     * you control access to pipelines. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     * User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The name for the pipeline. You can use the same name for multiple
     * pipelines associated with your AWS account, because AWS Data Pipeline
     * assigns each pipeline a unique pipeline identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name for the pipeline. You can use the same name for multiple
     *         pipelines associated with your AWS account, because AWS Data Pipeline
     *         assigns each pipeline a unique pipeline identifier.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name for the pipeline. You can use the same name for multiple
     * pipelines associated with your AWS account, because AWS Data Pipeline
     * assigns each pipeline a unique pipeline identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param name The name for the pipeline. You can use the same name for multiple
     *         pipelines associated with your AWS account, because AWS Data Pipeline
     *         assigns each pipeline a unique pipeline identifier.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name for the pipeline. You can use the same name for multiple
     * pipelines associated with your AWS account, because AWS Data Pipeline
     * assigns each pipeline a unique pipeline identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param name The name for the pipeline. You can use the same name for multiple
     *         pipelines associated with your AWS account, because AWS Data Pipeline
     *         assigns each pipeline a unique pipeline identifier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePipelineRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A unique identifier. This identifier is not the same as the pipeline
     * identifier assigned by AWS Data Pipeline. You are responsible for
     * defining the format and ensuring the uniqueness of this identifier.
     * You use this parameter to ensure idempotency during repeated calls to
     * <code>CreatePipeline</code>. For example, if the first call to
     * <code>CreatePipeline</code> does not succeed, you can pass in the same
     * unique identifier and pipeline name combination on a subsequent call
     * to <code>CreatePipeline</code>. <code>CreatePipeline</code> ensures
     * that if a pipeline already exists with the same name and unique
     * identifier, a new pipeline is not created. Instead, you'll receive the
     * pipeline identifier from the previous attempt. The uniqueness of the
     * name and unique identifier combination is scoped to the AWS account or
     * IAM user credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return A unique identifier. This identifier is not the same as the pipeline
     *         identifier assigned by AWS Data Pipeline. You are responsible for
     *         defining the format and ensuring the uniqueness of this identifier.
     *         You use this parameter to ensure idempotency during repeated calls to
     *         <code>CreatePipeline</code>. For example, if the first call to
     *         <code>CreatePipeline</code> does not succeed, you can pass in the same
     *         unique identifier and pipeline name combination on a subsequent call
     *         to <code>CreatePipeline</code>. <code>CreatePipeline</code> ensures
     *         that if a pipeline already exists with the same name and unique
     *         identifier, a new pipeline is not created. Instead, you'll receive the
     *         pipeline identifier from the previous attempt. The uniqueness of the
     *         name and unique identifier combination is scoped to the AWS account or
     *         IAM user credentials.
     */
    public String getUniqueId() {
        return uniqueId;
    }
    
    /**
     * A unique identifier. This identifier is not the same as the pipeline
     * identifier assigned by AWS Data Pipeline. You are responsible for
     * defining the format and ensuring the uniqueness of this identifier.
     * You use this parameter to ensure idempotency during repeated calls to
     * <code>CreatePipeline</code>. For example, if the first call to
     * <code>CreatePipeline</code> does not succeed, you can pass in the same
     * unique identifier and pipeline name combination on a subsequent call
     * to <code>CreatePipeline</code>. <code>CreatePipeline</code> ensures
     * that if a pipeline already exists with the same name and unique
     * identifier, a new pipeline is not created. Instead, you'll receive the
     * pipeline identifier from the previous attempt. The uniqueness of the
     * name and unique identifier combination is scoped to the AWS account or
     * IAM user credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param uniqueId A unique identifier. This identifier is not the same as the pipeline
     *         identifier assigned by AWS Data Pipeline. You are responsible for
     *         defining the format and ensuring the uniqueness of this identifier.
     *         You use this parameter to ensure idempotency during repeated calls to
     *         <code>CreatePipeline</code>. For example, if the first call to
     *         <code>CreatePipeline</code> does not succeed, you can pass in the same
     *         unique identifier and pipeline name combination on a subsequent call
     *         to <code>CreatePipeline</code>. <code>CreatePipeline</code> ensures
     *         that if a pipeline already exists with the same name and unique
     *         identifier, a new pipeline is not created. Instead, you'll receive the
     *         pipeline identifier from the previous attempt. The uniqueness of the
     *         name and unique identifier combination is scoped to the AWS account or
     *         IAM user credentials.
     */
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
    
    /**
     * A unique identifier. This identifier is not the same as the pipeline
     * identifier assigned by AWS Data Pipeline. You are responsible for
     * defining the format and ensuring the uniqueness of this identifier.
     * You use this parameter to ensure idempotency during repeated calls to
     * <code>CreatePipeline</code>. For example, if the first call to
     * <code>CreatePipeline</code> does not succeed, you can pass in the same
     * unique identifier and pipeline name combination on a subsequent call
     * to <code>CreatePipeline</code>. <code>CreatePipeline</code> ensures
     * that if a pipeline already exists with the same name and unique
     * identifier, a new pipeline is not created. Instead, you'll receive the
     * pipeline identifier from the previous attempt. The uniqueness of the
     * name and unique identifier combination is scoped to the AWS account or
     * IAM user credentials.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param uniqueId A unique identifier. This identifier is not the same as the pipeline
     *         identifier assigned by AWS Data Pipeline. You are responsible for
     *         defining the format and ensuring the uniqueness of this identifier.
     *         You use this parameter to ensure idempotency during repeated calls to
     *         <code>CreatePipeline</code>. For example, if the first call to
     *         <code>CreatePipeline</code> does not succeed, you can pass in the same
     *         unique identifier and pipeline name combination on a subsequent call
     *         to <code>CreatePipeline</code>. <code>CreatePipeline</code> ensures
     *         that if a pipeline already exists with the same name and unique
     *         identifier, a new pipeline is not created. Instead, you'll receive the
     *         pipeline identifier from the previous attempt. The uniqueness of the
     *         name and unique identifier combination is scoped to the AWS account or
     *         IAM user credentials.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePipelineRequest withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * The description for the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The description for the pipeline.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description for the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param description The description for the pipeline.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description for the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param description The description for the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePipelineRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * A list of tags to associate with the pipeline at creation. Tags let
     * you control access to pipelines. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     * User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return A list of tags to associate with the pipeline at creation. Tags let
     *         you control access to pipelines. For more information, see <a
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
     * A list of tags to associate with the pipeline at creation. Tags let
     * you control access to pipelines. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     * User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param tags A list of tags to associate with the pipeline at creation. Tags let
     *         you control access to pipelines. For more information, see <a
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
     * A list of tags to associate with the pipeline at creation. Tags let
     * you control access to pipelines. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     * User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     * Guide</i>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param tags A list of tags to associate with the pipeline at creation. Tags let
     *         you control access to pipelines. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     *         User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePipelineRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags to associate with the pipeline at creation. Tags let
     * you control access to pipelines. For more information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     * User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param tags A list of tags to associate with the pipeline at creation. Tags let
     *         you control access to pipelines. For more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     *         User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePipelineRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getUniqueId() != null) sb.append("UniqueId: " + getUniqueId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getUniqueId() == null) ? 0 : getUniqueId().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePipelineRequest == false) return false;
        CreatePipelineRequest other = (CreatePipelineRequest)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getUniqueId() == null ^ this.getUniqueId() == null) return false;
        if (other.getUniqueId() != null && other.getUniqueId().equals(this.getUniqueId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public CreatePipelineRequest clone() {
        
            return (CreatePipelineRequest) super.clone();
    }

}
    