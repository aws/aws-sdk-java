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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListModelCustomizationJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelCustomizationJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Page continuation token to use in the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Job summaries.
     * </p>
     */
    private java.util.List<ModelCustomizationJobSummary> modelCustomizationJobSummaries;

    /**
     * <p>
     * Page continuation token to use in the next request.
     * </p>
     * 
     * @param nextToken
     *        Page continuation token to use in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Page continuation token to use in the next request.
     * </p>
     * 
     * @return Page continuation token to use in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Page continuation token to use in the next request.
     * </p>
     * 
     * @param nextToken
     *        Page continuation token to use in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCustomizationJobsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Job summaries.
     * </p>
     * 
     * @return Job summaries.
     */

    public java.util.List<ModelCustomizationJobSummary> getModelCustomizationJobSummaries() {
        return modelCustomizationJobSummaries;
    }

    /**
     * <p>
     * Job summaries.
     * </p>
     * 
     * @param modelCustomizationJobSummaries
     *        Job summaries.
     */

    public void setModelCustomizationJobSummaries(java.util.Collection<ModelCustomizationJobSummary> modelCustomizationJobSummaries) {
        if (modelCustomizationJobSummaries == null) {
            this.modelCustomizationJobSummaries = null;
            return;
        }

        this.modelCustomizationJobSummaries = new java.util.ArrayList<ModelCustomizationJobSummary>(modelCustomizationJobSummaries);
    }

    /**
     * <p>
     * Job summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelCustomizationJobSummaries(java.util.Collection)} or
     * {@link #withModelCustomizationJobSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param modelCustomizationJobSummaries
     *        Job summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCustomizationJobsResult withModelCustomizationJobSummaries(ModelCustomizationJobSummary... modelCustomizationJobSummaries) {
        if (this.modelCustomizationJobSummaries == null) {
            setModelCustomizationJobSummaries(new java.util.ArrayList<ModelCustomizationJobSummary>(modelCustomizationJobSummaries.length));
        }
        for (ModelCustomizationJobSummary ele : modelCustomizationJobSummaries) {
            this.modelCustomizationJobSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Job summaries.
     * </p>
     * 
     * @param modelCustomizationJobSummaries
     *        Job summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCustomizationJobsResult withModelCustomizationJobSummaries(java.util.Collection<ModelCustomizationJobSummary> modelCustomizationJobSummaries) {
        setModelCustomizationJobSummaries(modelCustomizationJobSummaries);
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
        if (getModelCustomizationJobSummaries() != null)
            sb.append("ModelCustomizationJobSummaries: ").append(getModelCustomizationJobSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListModelCustomizationJobsResult == false)
            return false;
        ListModelCustomizationJobsResult other = (ListModelCustomizationJobsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getModelCustomizationJobSummaries() == null ^ this.getModelCustomizationJobSummaries() == null)
            return false;
        if (other.getModelCustomizationJobSummaries() != null
                && other.getModelCustomizationJobSummaries().equals(this.getModelCustomizationJobSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getModelCustomizationJobSummaries() == null) ? 0 : getModelCustomizationJobSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListModelCustomizationJobsResult clone() {
        try {
            return (ListModelCustomizationJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
