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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListFeatureGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFeatureGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A summary of feature groups.
     * </p>
     */
    private java.util.List<FeatureGroupSummary> featureGroupSummaries;
    /**
     * <p>
     * A token to resume pagination of <code>ListFeatureGroups</code> results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A summary of feature groups.
     * </p>
     * 
     * @return A summary of feature groups.
     */

    public java.util.List<FeatureGroupSummary> getFeatureGroupSummaries() {
        return featureGroupSummaries;
    }

    /**
     * <p>
     * A summary of feature groups.
     * </p>
     * 
     * @param featureGroupSummaries
     *        A summary of feature groups.
     */

    public void setFeatureGroupSummaries(java.util.Collection<FeatureGroupSummary> featureGroupSummaries) {
        if (featureGroupSummaries == null) {
            this.featureGroupSummaries = null;
            return;
        }

        this.featureGroupSummaries = new java.util.ArrayList<FeatureGroupSummary>(featureGroupSummaries);
    }

    /**
     * <p>
     * A summary of feature groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureGroupSummaries(java.util.Collection)} or
     * {@link #withFeatureGroupSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param featureGroupSummaries
     *        A summary of feature groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeatureGroupsResult withFeatureGroupSummaries(FeatureGroupSummary... featureGroupSummaries) {
        if (this.featureGroupSummaries == null) {
            setFeatureGroupSummaries(new java.util.ArrayList<FeatureGroupSummary>(featureGroupSummaries.length));
        }
        for (FeatureGroupSummary ele : featureGroupSummaries) {
            this.featureGroupSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A summary of feature groups.
     * </p>
     * 
     * @param featureGroupSummaries
     *        A summary of feature groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeatureGroupsResult withFeatureGroupSummaries(java.util.Collection<FeatureGroupSummary> featureGroupSummaries) {
        setFeatureGroupSummaries(featureGroupSummaries);
        return this;
    }

    /**
     * <p>
     * A token to resume pagination of <code>ListFeatureGroups</code> results.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination of <code>ListFeatureGroups</code> results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to resume pagination of <code>ListFeatureGroups</code> results.
     * </p>
     * 
     * @return A token to resume pagination of <code>ListFeatureGroups</code> results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to resume pagination of <code>ListFeatureGroups</code> results.
     * </p>
     * 
     * @param nextToken
     *        A token to resume pagination of <code>ListFeatureGroups</code> results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeatureGroupsResult withNextToken(String nextToken) {
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
        if (getFeatureGroupSummaries() != null)
            sb.append("FeatureGroupSummaries: ").append(getFeatureGroupSummaries()).append(",");
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

        if (obj instanceof ListFeatureGroupsResult == false)
            return false;
        ListFeatureGroupsResult other = (ListFeatureGroupsResult) obj;
        if (other.getFeatureGroupSummaries() == null ^ this.getFeatureGroupSummaries() == null)
            return false;
        if (other.getFeatureGroupSummaries() != null && other.getFeatureGroupSummaries().equals(this.getFeatureGroupSummaries()) == false)
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

        hashCode = prime * hashCode + ((getFeatureGroupSummaries() == null) ? 0 : getFeatureGroupSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFeatureGroupsResult clone() {
        try {
            return (ListFeatureGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
