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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for EvaluateExpression.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/EvaluateExpression" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluateExpressionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the pipeline.
     * </p>
     */
    private String pipelineId;
    /**
     * <p>
     * The ID of the object.
     * </p>
     */
    private String objectId;
    /**
     * <p>
     * The expression to evaluate.
     * </p>
     */
    private String expression;

    /**
     * <p>
     * The ID of the pipeline.
     * </p>
     * 
     * @param pipelineId
     *        The ID of the pipeline.
     */

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * <p>
     * The ID of the pipeline.
     * </p>
     * 
     * @return The ID of the pipeline.
     */

    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * <p>
     * The ID of the pipeline.
     * </p>
     * 
     * @param pipelineId
     *        The ID of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateExpressionRequest withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
        return this;
    }

    /**
     * <p>
     * The ID of the object.
     * </p>
     * 
     * @param objectId
     *        The ID of the object.
     */

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    /**
     * <p>
     * The ID of the object.
     * </p>
     * 
     * @return The ID of the object.
     */

    public String getObjectId() {
        return this.objectId;
    }

    /**
     * <p>
     * The ID of the object.
     * </p>
     * 
     * @param objectId
     *        The ID of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateExpressionRequest withObjectId(String objectId) {
        setObjectId(objectId);
        return this;
    }

    /**
     * <p>
     * The expression to evaluate.
     * </p>
     * 
     * @param expression
     *        The expression to evaluate.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The expression to evaluate.
     * </p>
     * 
     * @return The expression to evaluate.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The expression to evaluate.
     * </p>
     * 
     * @param expression
     *        The expression to evaluate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluateExpressionRequest withExpression(String expression) {
        setExpression(expression);
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
        if (getObjectId() != null)
            sb.append("ObjectId: ").append(getObjectId()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluateExpressionRequest == false)
            return false;
        EvaluateExpressionRequest other = (EvaluateExpressionRequest) obj;
        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        if (other.getObjectId() == null ^ this.getObjectId() == null)
            return false;
        if (other.getObjectId() != null && other.getObjectId().equals(this.getObjectId()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        return true;
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
    public EvaluateExpressionRequest clone() {
        return (EvaluateExpressionRequest) super.clone();
    }

}
