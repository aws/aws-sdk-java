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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#createPipeline(CreatePipelineRequest) CreatePipeline operation}.
 * <p>
 * Creates a new empty pipeline. When this action succeeds, you can then use the PutPipelineDefinition action to populate the pipeline.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#createPipeline(CreatePipelineRequest)
 */
public class CreatePipelineRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the new pipeline. You can use the same name for multiple
     * pipelines associated with your AWS account, because AWS Data Pipeline
     * assigns each new pipeline a unique pipeline identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String name;

    /**
     * A unique identifier that you specify. This identifier is not the same
     * as the pipeline identifier assigned by AWS Data Pipeline. You are
     * responsible for defining the format and ensuring the uniqueness of
     * this identifier. You use this parameter to ensure idempotency during
     * repeated calls to <a>CreatePipeline</a>. For example, if the first
     * call to <a>CreatePipeline</a> does not return a clear success, you can
     * pass in the same unique identifier and pipeline name combination on a
     * subsequent call to <a>CreatePipeline</a>. <a>CreatePipeline</a>
     * ensures that if a pipeline already exists with the same name and
     * unique identifier, a new pipeline will not be created. Instead, you'll
     * receive the pipeline identifier from the previous attempt. The
     * uniqueness of the name and unique identifier combination is scoped to
     * the AWS account or IAM user credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String uniqueId;

    /**
     * The description of the new pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String description;

    /**
     * The name of the new pipeline. You can use the same name for multiple
     * pipelines associated with your AWS account, because AWS Data Pipeline
     * assigns each new pipeline a unique pipeline identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the new pipeline. You can use the same name for multiple
     *         pipelines associated with your AWS account, because AWS Data Pipeline
     *         assigns each new pipeline a unique pipeline identifier.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the new pipeline. You can use the same name for multiple
     * pipelines associated with your AWS account, because AWS Data Pipeline
     * assigns each new pipeline a unique pipeline identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name The name of the new pipeline. You can use the same name for multiple
     *         pipelines associated with your AWS account, because AWS Data Pipeline
     *         assigns each new pipeline a unique pipeline identifier.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the new pipeline. You can use the same name for multiple
     * pipelines associated with your AWS account, because AWS Data Pipeline
     * assigns each new pipeline a unique pipeline identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name The name of the new pipeline. You can use the same name for multiple
     *         pipelines associated with your AWS account, because AWS Data Pipeline
     *         assigns each new pipeline a unique pipeline identifier.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePipelineRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A unique identifier that you specify. This identifier is not the same
     * as the pipeline identifier assigned by AWS Data Pipeline. You are
     * responsible for defining the format and ensuring the uniqueness of
     * this identifier. You use this parameter to ensure idempotency during
     * repeated calls to <a>CreatePipeline</a>. For example, if the first
     * call to <a>CreatePipeline</a> does not return a clear success, you can
     * pass in the same unique identifier and pipeline name combination on a
     * subsequent call to <a>CreatePipeline</a>. <a>CreatePipeline</a>
     * ensures that if a pipeline already exists with the same name and
     * unique identifier, a new pipeline will not be created. Instead, you'll
     * receive the pipeline identifier from the previous attempt. The
     * uniqueness of the name and unique identifier combination is scoped to
     * the AWS account or IAM user credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return A unique identifier that you specify. This identifier is not the same
     *         as the pipeline identifier assigned by AWS Data Pipeline. You are
     *         responsible for defining the format and ensuring the uniqueness of
     *         this identifier. You use this parameter to ensure idempotency during
     *         repeated calls to <a>CreatePipeline</a>. For example, if the first
     *         call to <a>CreatePipeline</a> does not return a clear success, you can
     *         pass in the same unique identifier and pipeline name combination on a
     *         subsequent call to <a>CreatePipeline</a>. <a>CreatePipeline</a>
     *         ensures that if a pipeline already exists with the same name and
     *         unique identifier, a new pipeline will not be created. Instead, you'll
     *         receive the pipeline identifier from the previous attempt. The
     *         uniqueness of the name and unique identifier combination is scoped to
     *         the AWS account or IAM user credentials.
     */
    public String getUniqueId() {
        return uniqueId;
    }
    
    /**
     * A unique identifier that you specify. This identifier is not the same
     * as the pipeline identifier assigned by AWS Data Pipeline. You are
     * responsible for defining the format and ensuring the uniqueness of
     * this identifier. You use this parameter to ensure idempotency during
     * repeated calls to <a>CreatePipeline</a>. For example, if the first
     * call to <a>CreatePipeline</a> does not return a clear success, you can
     * pass in the same unique identifier and pipeline name combination on a
     * subsequent call to <a>CreatePipeline</a>. <a>CreatePipeline</a>
     * ensures that if a pipeline already exists with the same name and
     * unique identifier, a new pipeline will not be created. Instead, you'll
     * receive the pipeline identifier from the previous attempt. The
     * uniqueness of the name and unique identifier combination is scoped to
     * the AWS account or IAM user credentials.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param uniqueId A unique identifier that you specify. This identifier is not the same
     *         as the pipeline identifier assigned by AWS Data Pipeline. You are
     *         responsible for defining the format and ensuring the uniqueness of
     *         this identifier. You use this parameter to ensure idempotency during
     *         repeated calls to <a>CreatePipeline</a>. For example, if the first
     *         call to <a>CreatePipeline</a> does not return a clear success, you can
     *         pass in the same unique identifier and pipeline name combination on a
     *         subsequent call to <a>CreatePipeline</a>. <a>CreatePipeline</a>
     *         ensures that if a pipeline already exists with the same name and
     *         unique identifier, a new pipeline will not be created. Instead, you'll
     *         receive the pipeline identifier from the previous attempt. The
     *         uniqueness of the name and unique identifier combination is scoped to
     *         the AWS account or IAM user credentials.
     */
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
    
    /**
     * A unique identifier that you specify. This identifier is not the same
     * as the pipeline identifier assigned by AWS Data Pipeline. You are
     * responsible for defining the format and ensuring the uniqueness of
     * this identifier. You use this parameter to ensure idempotency during
     * repeated calls to <a>CreatePipeline</a>. For example, if the first
     * call to <a>CreatePipeline</a> does not return a clear success, you can
     * pass in the same unique identifier and pipeline name combination on a
     * subsequent call to <a>CreatePipeline</a>. <a>CreatePipeline</a>
     * ensures that if a pipeline already exists with the same name and
     * unique identifier, a new pipeline will not be created. Instead, you'll
     * receive the pipeline identifier from the previous attempt. The
     * uniqueness of the name and unique identifier combination is scoped to
     * the AWS account or IAM user credentials.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param uniqueId A unique identifier that you specify. This identifier is not the same
     *         as the pipeline identifier assigned by AWS Data Pipeline. You are
     *         responsible for defining the format and ensuring the uniqueness of
     *         this identifier. You use this parameter to ensure idempotency during
     *         repeated calls to <a>CreatePipeline</a>. For example, if the first
     *         call to <a>CreatePipeline</a> does not return a clear success, you can
     *         pass in the same unique identifier and pipeline name combination on a
     *         subsequent call to <a>CreatePipeline</a>. <a>CreatePipeline</a>
     *         ensures that if a pipeline already exists with the same name and
     *         unique identifier, a new pipeline will not be created. Instead, you'll
     *         receive the pipeline identifier from the previous attempt. The
     *         uniqueness of the name and unique identifier combination is scoped to
     *         the AWS account or IAM user credentials.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePipelineRequest withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * The description of the new pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The description of the new pipeline.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the new pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param description The description of the new pipeline.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the new pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param description The description of the new pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePipelineRequest withDescription(String description) {
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getUniqueId() != null) sb.append("UniqueId: " + getUniqueId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() );
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
        return true;
    }
    
}
    