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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListFoundationModels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFoundationModelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of Amazon Bedrock foundation models.
     * </p>
     */
    private java.util.List<FoundationModelSummary> modelSummaries;

    /**
     * <p>
     * A list of Amazon Bedrock foundation models.
     * </p>
     * 
     * @return A list of Amazon Bedrock foundation models.
     */

    public java.util.List<FoundationModelSummary> getModelSummaries() {
        return modelSummaries;
    }

    /**
     * <p>
     * A list of Amazon Bedrock foundation models.
     * </p>
     * 
     * @param modelSummaries
     *        A list of Amazon Bedrock foundation models.
     */

    public void setModelSummaries(java.util.Collection<FoundationModelSummary> modelSummaries) {
        if (modelSummaries == null) {
            this.modelSummaries = null;
            return;
        }

        this.modelSummaries = new java.util.ArrayList<FoundationModelSummary>(modelSummaries);
    }

    /**
     * <p>
     * A list of Amazon Bedrock foundation models.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelSummaries(java.util.Collection)} or {@link #withModelSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param modelSummaries
     *        A list of Amazon Bedrock foundation models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFoundationModelsResult withModelSummaries(FoundationModelSummary... modelSummaries) {
        if (this.modelSummaries == null) {
            setModelSummaries(new java.util.ArrayList<FoundationModelSummary>(modelSummaries.length));
        }
        for (FoundationModelSummary ele : modelSummaries) {
            this.modelSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Bedrock foundation models.
     * </p>
     * 
     * @param modelSummaries
     *        A list of Amazon Bedrock foundation models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFoundationModelsResult withModelSummaries(java.util.Collection<FoundationModelSummary> modelSummaries) {
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

        if (obj instanceof ListFoundationModelsResult == false)
            return false;
        ListFoundationModelsResult other = (ListFoundationModelsResult) obj;
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

        hashCode = prime * hashCode + ((getModelSummaries() == null) ? 0 : getModelSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListFoundationModelsResult clone() {
        try {
            return (ListFoundationModelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
