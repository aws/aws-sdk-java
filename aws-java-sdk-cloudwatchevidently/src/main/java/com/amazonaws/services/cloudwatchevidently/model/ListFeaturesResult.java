/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListFeatures" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFeaturesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures that contain the configuration details of the features in the specified project.
     * </p>
     */
    private java.util.List<FeatureSummary> features;
    /**
     * <p>
     * The token to use in a subsequent <code>ListFeatures</code> operation to return the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of structures that contain the configuration details of the features in the specified project.
     * </p>
     * 
     * @return An array of structures that contain the configuration details of the features in the specified project.
     */

    public java.util.List<FeatureSummary> getFeatures() {
        return features;
    }

    /**
     * <p>
     * An array of structures that contain the configuration details of the features in the specified project.
     * </p>
     * 
     * @param features
     *        An array of structures that contain the configuration details of the features in the specified project.
     */

    public void setFeatures(java.util.Collection<FeatureSummary> features) {
        if (features == null) {
            this.features = null;
            return;
        }

        this.features = new java.util.ArrayList<FeatureSummary>(features);
    }

    /**
     * <p>
     * An array of structures that contain the configuration details of the features in the specified project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatures(java.util.Collection)} or {@link #withFeatures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param features
     *        An array of structures that contain the configuration details of the features in the specified project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeaturesResult withFeatures(FeatureSummary... features) {
        if (this.features == null) {
            setFeatures(new java.util.ArrayList<FeatureSummary>(features.length));
        }
        for (FeatureSummary ele : features) {
            this.features.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that contain the configuration details of the features in the specified project.
     * </p>
     * 
     * @param features
     *        An array of structures that contain the configuration details of the features in the specified project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeaturesResult withFeatures(java.util.Collection<FeatureSummary> features) {
        setFeatures(features);
        return this;
    }

    /**
     * <p>
     * The token to use in a subsequent <code>ListFeatures</code> operation to return the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use in a subsequent <code>ListFeatures</code> operation to return the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use in a subsequent <code>ListFeatures</code> operation to return the next set of results.
     * </p>
     * 
     * @return The token to use in a subsequent <code>ListFeatures</code> operation to return the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use in a subsequent <code>ListFeatures</code> operation to return the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use in a subsequent <code>ListFeatures</code> operation to return the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFeaturesResult withNextToken(String nextToken) {
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
        if (getFeatures() != null)
            sb.append("Features: ").append(getFeatures()).append(",");
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

        if (obj instanceof ListFeaturesResult == false)
            return false;
        ListFeaturesResult other = (ListFeaturesResult) obj;
        if (other.getFeatures() == null ^ this.getFeatures() == null)
            return false;
        if (other.getFeatures() != null && other.getFeatures().equals(this.getFeatures()) == false)
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

        hashCode = prime * hashCode + ((getFeatures() == null) ? 0 : getFeatures().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFeaturesResult clone() {
        try {
            return (ListFeaturesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
