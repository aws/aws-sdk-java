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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>ModelSummary</code> objects, each of which lists a model.
     * </p>
     */
    private java.util.List<ModelSummary> models;
    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of models, use it in
     * the subsequent request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>ModelSummary</code> objects, each of which lists a model.
     * </p>
     * 
     * @return An array of <code>ModelSummary</code> objects, each of which lists a model.
     */

    public java.util.List<ModelSummary> getModels() {
        return models;
    }

    /**
     * <p>
     * An array of <code>ModelSummary</code> objects, each of which lists a model.
     * </p>
     * 
     * @param models
     *        An array of <code>ModelSummary</code> objects, each of which lists a model.
     */

    public void setModels(java.util.Collection<ModelSummary> models) {
        if (models == null) {
            this.models = null;
            return;
        }

        this.models = new java.util.ArrayList<ModelSummary>(models);
    }

    /**
     * <p>
     * An array of <code>ModelSummary</code> objects, each of which lists a model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModels(java.util.Collection)} or {@link #withModels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param models
     *        An array of <code>ModelSummary</code> objects, each of which lists a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelsResult withModels(ModelSummary... models) {
        if (this.models == null) {
            setModels(new java.util.ArrayList<ModelSummary>(models.length));
        }
        for (ModelSummary ele : models) {
            this.models.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ModelSummary</code> objects, each of which lists a model.
     * </p>
     * 
     * @param models
     *        An array of <code>ModelSummary</code> objects, each of which lists a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelsResult withModels(java.util.Collection<ModelSummary> models) {
        setModels(models);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of models, use it in
     * the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of models, use
     *        it in the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of models, use it in
     * the subsequent request.
     * </p>
     * 
     * @return If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of models,
     *         use it in the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of models, use it in
     * the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of models, use
     *        it in the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getModels() != null)
            sb.append("Models: ").append(getModels()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListModelsResult == false)
            return false;
        ListModelsResult other = (ListModelsResult) obj;
        if (other.getModels() == null ^ this.getModels() == null)
            return false;
        if (other.getModels() != null && other.getModels().equals(this.getModels()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModels() == null) ? 0 : getModels().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListModelsResult clone() {
        try {
            return (ListModelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
