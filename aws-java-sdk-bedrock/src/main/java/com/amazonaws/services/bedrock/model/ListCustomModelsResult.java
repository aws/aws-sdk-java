/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListCustomModels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCustomModelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Continuation token for the next request to list the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Model summaries.
     * </p>
     */
    private java.util.List<CustomModelSummary> modelSummaries;

    /**
     * <p>
     * Continuation token for the next request to list the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Continuation token for the next request to list the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Continuation token for the next request to list the next set of results.
     * </p>
     * 
     * @return Continuation token for the next request to list the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Continuation token for the next request to list the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Continuation token for the next request to list the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomModelsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Model summaries.
     * </p>
     * 
     * @return Model summaries.
     */

    public java.util.List<CustomModelSummary> getModelSummaries() {
        return modelSummaries;
    }

    /**
     * <p>
     * Model summaries.
     * </p>
     * 
     * @param modelSummaries
     *        Model summaries.
     */

    public void setModelSummaries(java.util.Collection<CustomModelSummary> modelSummaries) {
        if (modelSummaries == null) {
            this.modelSummaries = null;
            return;
        }

        this.modelSummaries = new java.util.ArrayList<CustomModelSummary>(modelSummaries);
    }

    /**
     * <p>
     * Model summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelSummaries(java.util.Collection)} or {@link #withModelSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param modelSummaries
     *        Model summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomModelsResult withModelSummaries(CustomModelSummary... modelSummaries) {
        if (this.modelSummaries == null) {
            setModelSummaries(new java.util.ArrayList<CustomModelSummary>(modelSummaries.length));
        }
        for (CustomModelSummary ele : modelSummaries) {
            this.modelSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Model summaries.
     * </p>
     * 
     * @param modelSummaries
     *        Model summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCustomModelsResult withModelSummaries(java.util.Collection<CustomModelSummary> modelSummaries) {
        setModelSummaries(modelSummaries);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getModelSummaries() != null)
            sb.append("ModelSummaries: ").append(getModelSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCustomModelsResult == false)
            return false;
        ListCustomModelsResult other = (ListCustomModelsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getModelSummaries() == null ^ this.getModelSummaries() == null)
            return false;
        if (other.getModelSummaries() != null && other.getModelSummaries().equals(this.getModelSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getModelSummaries() == null) ? 0 : getModelSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListCustomModelsResult clone() {
        try {
            return (ListCustomModelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
