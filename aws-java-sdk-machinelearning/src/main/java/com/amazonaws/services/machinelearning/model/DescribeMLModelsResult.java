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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>DescribeMLModels</code> operation. The content is essentially a list of
 * <code>MLModel</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMLModelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>MLModel</code> that meet the search criteria.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MLModel> results;
    /**
     * <p>
     * The ID of the next page in the paginated results that indicates at least one more page follows.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>MLModel</code> that meet the search criteria.
     * </p>
     * 
     * @return A list of <code>MLModel</code> that meet the search criteria.
     */

    public java.util.List<MLModel> getResults() {
        if (results == null) {
            results = new com.amazonaws.internal.SdkInternalList<MLModel>();
        }
        return results;
    }

    /**
     * <p>
     * A list of <code>MLModel</code> that meet the search criteria.
     * </p>
     * 
     * @param results
     *        A list of <code>MLModel</code> that meet the search criteria.
     */

    public void setResults(java.util.Collection<MLModel> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new com.amazonaws.internal.SdkInternalList<MLModel>(results);
    }

    /**
     * <p>
     * A list of <code>MLModel</code> that meet the search criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        A list of <code>MLModel</code> that meet the search criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMLModelsResult withResults(MLModel... results) {
        if (this.results == null) {
            setResults(new com.amazonaws.internal.SdkInternalList<MLModel>(results.length));
        }
        for (MLModel ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>MLModel</code> that meet the search criteria.
     * </p>
     * 
     * @param results
     *        A list of <code>MLModel</code> that meet the search criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMLModelsResult withResults(java.util.Collection<MLModel> results) {
        setResults(results);
        return this;
    }

    /**
     * <p>
     * The ID of the next page in the paginated results that indicates at least one more page follows.
     * </p>
     * 
     * @param nextToken
     *        The ID of the next page in the paginated results that indicates at least one more page follows.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The ID of the next page in the paginated results that indicates at least one more page follows.
     * </p>
     * 
     * @return The ID of the next page in the paginated results that indicates at least one more page follows.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The ID of the next page in the paginated results that indicates at least one more page follows.
     * </p>
     * 
     * @param nextToken
     *        The ID of the next page in the paginated results that indicates at least one more page follows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMLModelsResult withNextToken(String nextToken) {
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
        if (getResults() != null)
            sb.append("Results: ").append(getResults()).append(",");
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

        if (obj instanceof DescribeMLModelsResult == false)
            return false;
        DescribeMLModelsResult other = (DescribeMLModelsResult) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
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

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMLModelsResult clone() {
        try {
            return (DescribeMLModelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
