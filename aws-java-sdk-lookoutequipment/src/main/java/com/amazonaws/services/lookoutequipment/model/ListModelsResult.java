/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListModels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of ML models.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Provides information on the specified model, including created time, model and dataset ARNs, and status.
     * </p>
     */
    private java.util.List<ModelSummary> modelSummaries;

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of ML models.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of ML models.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of ML models.
     * </p>
     * 
     * @return An opaque pagination token indicating where to continue the listing of ML models.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of ML models.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of ML models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Provides information on the specified model, including created time, model and dataset ARNs, and status.
     * </p>
     * 
     * @return Provides information on the specified model, including created time, model and dataset ARNs, and status.
     */

    public java.util.List<ModelSummary> getModelSummaries() {
        return modelSummaries;
    }

    /**
     * <p>
     * Provides information on the specified model, including created time, model and dataset ARNs, and status.
     * </p>
     * 
     * @param modelSummaries
     *        Provides information on the specified model, including created time, model and dataset ARNs, and status.
     */

    public void setModelSummaries(java.util.Collection<ModelSummary> modelSummaries) {
        if (modelSummaries == null) {
            this.modelSummaries = null;
            return;
        }

        this.modelSummaries = new java.util.ArrayList<ModelSummary>(modelSummaries);
    }

    /**
     * <p>
     * Provides information on the specified model, including created time, model and dataset ARNs, and status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelSummaries(java.util.Collection)} or {@link #withModelSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param modelSummaries
     *        Provides information on the specified model, including created time, model and dataset ARNs, and status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelsResult withModelSummaries(ModelSummary... modelSummaries) {
        if (this.modelSummaries == null) {
            setModelSummaries(new java.util.ArrayList<ModelSummary>(modelSummaries.length));
        }
        for (ModelSummary ele : modelSummaries) {
            this.modelSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides information on the specified model, including created time, model and dataset ARNs, and status.
     * </p>
     * 
     * @param modelSummaries
     *        Provides information on the specified model, including created time, model and dataset ARNs, and status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelsResult withModelSummaries(java.util.Collection<ModelSummary> modelSummaries) {
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

        if (obj instanceof ListModelsResult == false)
            return false;
        ListModelsResult other = (ListModelsResult) obj;
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
    public ListModelsResult clone() {
        try {
            return (ListModelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
