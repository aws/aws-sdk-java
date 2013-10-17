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
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#evaluateExpression(EvaluateExpressionRequest) EvaluateExpression operation}.
 * <p>
 * Evaluates a string in the context of a specified object. A task runner can use this action to evaluate SQL queries stored in Amazon S3.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#evaluateExpression(EvaluateExpressionRequest)
 */
public class EvaluateExpressionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String pipelineId;

    /**
     * The identifier of the object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String objectId;

    /**
     * The expression to evaluate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20971520<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String expression;

    /**
     * The identifier of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The identifier of the pipeline.
     */
    public String getPipelineId() {
        return pipelineId;
    }
    
    /**
     * The identifier of the pipeline.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The identifier of the pipeline.
     */
    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }
    
    /**
     * The identifier of the pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param pipelineId The identifier of the pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EvaluateExpressionRequest withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * The identifier of the object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The identifier of the object.
     */
    public String getObjectId() {
        return objectId;
    }
    
    /**
     * The identifier of the object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param objectId The identifier of the object.
     */
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }
    
    /**
     * The identifier of the object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param objectId The identifier of the object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EvaluateExpressionRequest withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * The expression to evaluate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20971520<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The expression to evaluate.
     */
    public String getExpression() {
        return expression;
    }
    
    /**
     * The expression to evaluate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20971520<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param expression The expression to evaluate.
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }
    
    /**
     * The expression to evaluate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20971520<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param expression The expression to evaluate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EvaluateExpressionRequest withExpression(String expression) {
        this.expression = expression;
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
        if (getObjectId() != null) sb.append("ObjectId: " + getObjectId() + ",");
        if (getExpression() != null) sb.append("Expression: " + getExpression() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode()); 
        hashCode = prime * hashCode + ((getObjectId() == null) ? 0 : getObjectId().hashCode()); 
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EvaluateExpressionRequest == false) return false;
        EvaluateExpressionRequest other = (EvaluateExpressionRequest)obj;
        
        if (other.getPipelineId() == null ^ this.getPipelineId() == null) return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false) return false; 
        if (other.getObjectId() == null ^ this.getObjectId() == null) return false;
        if (other.getObjectId() != null && other.getObjectId().equals(this.getObjectId()) == false) return false; 
        if (other.getExpression() == null ^ this.getExpression() == null) return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false) return false; 
        return true;
    }
    
}
    