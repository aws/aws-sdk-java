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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ListInferenceSchedulers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInferenceSchedulersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference schedulers.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the maximum number of inference schedulers to list.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The beginning of the name of the inference schedulers to be listed.
     * </p>
     */
    private String inferenceSchedulerNameBeginsWith;
    /**
     * <p>
     * The name of the ML model used by the inference scheduler to be listed.
     * </p>
     */
    private String modelName;

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference schedulers.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of inference schedulers.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference schedulers.
     * </p>
     * 
     * @return An opaque pagination token indicating where to continue the listing of inference schedulers.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token indicating where to continue the listing of inference schedulers.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token indicating where to continue the listing of inference schedulers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceSchedulersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of inference schedulers to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of inference schedulers to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of inference schedulers to list.
     * </p>
     * 
     * @return Specifies the maximum number of inference schedulers to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of inference schedulers to list.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of inference schedulers to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceSchedulersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The beginning of the name of the inference schedulers to be listed.
     * </p>
     * 
     * @param inferenceSchedulerNameBeginsWith
     *        The beginning of the name of the inference schedulers to be listed.
     */

    public void setInferenceSchedulerNameBeginsWith(String inferenceSchedulerNameBeginsWith) {
        this.inferenceSchedulerNameBeginsWith = inferenceSchedulerNameBeginsWith;
    }

    /**
     * <p>
     * The beginning of the name of the inference schedulers to be listed.
     * </p>
     * 
     * @return The beginning of the name of the inference schedulers to be listed.
     */

    public String getInferenceSchedulerNameBeginsWith() {
        return this.inferenceSchedulerNameBeginsWith;
    }

    /**
     * <p>
     * The beginning of the name of the inference schedulers to be listed.
     * </p>
     * 
     * @param inferenceSchedulerNameBeginsWith
     *        The beginning of the name of the inference schedulers to be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceSchedulersRequest withInferenceSchedulerNameBeginsWith(String inferenceSchedulerNameBeginsWith) {
        setInferenceSchedulerNameBeginsWith(inferenceSchedulerNameBeginsWith);
        return this;
    }

    /**
     * <p>
     * The name of the ML model used by the inference scheduler to be listed.
     * </p>
     * 
     * @param modelName
     *        The name of the ML model used by the inference scheduler to be listed.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the ML model used by the inference scheduler to be listed.
     * </p>
     * 
     * @return The name of the ML model used by the inference scheduler to be listed.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the ML model used by the inference scheduler to be listed.
     * </p>
     * 
     * @param modelName
     *        The name of the ML model used by the inference scheduler to be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceSchedulersRequest withModelName(String modelName) {
        setModelName(modelName);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getInferenceSchedulerNameBeginsWith() != null)
            sb.append("InferenceSchedulerNameBeginsWith: ").append(getInferenceSchedulerNameBeginsWith()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInferenceSchedulersRequest == false)
            return false;
        ListInferenceSchedulersRequest other = (ListInferenceSchedulersRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getInferenceSchedulerNameBeginsWith() == null ^ this.getInferenceSchedulerNameBeginsWith() == null)
            return false;
        if (other.getInferenceSchedulerNameBeginsWith() != null
                && other.getInferenceSchedulerNameBeginsWith().equals(this.getInferenceSchedulerNameBeginsWith()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getInferenceSchedulerNameBeginsWith() == null) ? 0 : getInferenceSchedulerNameBeginsWith().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        return hashCode;
    }

    @Override
    public ListInferenceSchedulersRequest clone() {
        return (ListInferenceSchedulersRequest) super.clone();
    }

}
