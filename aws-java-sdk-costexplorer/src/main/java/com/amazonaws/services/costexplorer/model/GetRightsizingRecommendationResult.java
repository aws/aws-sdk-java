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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetRightsizingRecommendation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRightsizingRecommendationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information regarding this specific recommendation set.
     * </p>
     */
    private RightsizingRecommendationMetadata metadata;
    /**
     * <p>
     * Summary of this recommendation set.
     * </p>
     */
    private RightsizingRecommendationSummary summary;
    /**
     * <p>
     * Recommendations to rightsize resources.
     * </p>
     */
    private java.util.List<RightsizingRecommendation> rightsizingRecommendations;
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * Information regarding this specific recommendation set.
     * </p>
     * 
     * @param metadata
     *        Information regarding this specific recommendation set.
     */

    public void setMetadata(RightsizingRecommendationMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Information regarding this specific recommendation set.
     * </p>
     * 
     * @return Information regarding this specific recommendation set.
     */

    public RightsizingRecommendationMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * Information regarding this specific recommendation set.
     * </p>
     * 
     * @param metadata
     *        Information regarding this specific recommendation set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRightsizingRecommendationResult withMetadata(RightsizingRecommendationMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * Summary of this recommendation set.
     * </p>
     * 
     * @param summary
     *        Summary of this recommendation set.
     */

    public void setSummary(RightsizingRecommendationSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * Summary of this recommendation set.
     * </p>
     * 
     * @return Summary of this recommendation set.
     */

    public RightsizingRecommendationSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * Summary of this recommendation set.
     * </p>
     * 
     * @param summary
     *        Summary of this recommendation set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRightsizingRecommendationResult withSummary(RightsizingRecommendationSummary summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * Recommendations to rightsize resources.
     * </p>
     * 
     * @return Recommendations to rightsize resources.
     */

    public java.util.List<RightsizingRecommendation> getRightsizingRecommendations() {
        return rightsizingRecommendations;
    }

    /**
     * <p>
     * Recommendations to rightsize resources.
     * </p>
     * 
     * @param rightsizingRecommendations
     *        Recommendations to rightsize resources.
     */

    public void setRightsizingRecommendations(java.util.Collection<RightsizingRecommendation> rightsizingRecommendations) {
        if (rightsizingRecommendations == null) {
            this.rightsizingRecommendations = null;
            return;
        }

        this.rightsizingRecommendations = new java.util.ArrayList<RightsizingRecommendation>(rightsizingRecommendations);
    }

    /**
     * <p>
     * Recommendations to rightsize resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRightsizingRecommendations(java.util.Collection)} or
     * {@link #withRightsizingRecommendations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param rightsizingRecommendations
     *        Recommendations to rightsize resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRightsizingRecommendationResult withRightsizingRecommendations(RightsizingRecommendation... rightsizingRecommendations) {
        if (this.rightsizingRecommendations == null) {
            setRightsizingRecommendations(new java.util.ArrayList<RightsizingRecommendation>(rightsizingRecommendations.length));
        }
        for (RightsizingRecommendation ele : rightsizingRecommendations) {
            this.rightsizingRecommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Recommendations to rightsize resources.
     * </p>
     * 
     * @param rightsizingRecommendations
     *        Recommendations to rightsize resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRightsizingRecommendationResult withRightsizingRecommendations(java.util.Collection<RightsizingRecommendation> rightsizingRecommendations) {
        setRightsizingRecommendations(rightsizingRecommendations);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRightsizingRecommendationResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
        if (getRightsizingRecommendations() != null)
            sb.append("RightsizingRecommendations: ").append(getRightsizingRecommendations()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRightsizingRecommendationResult == false)
            return false;
        GetRightsizingRecommendationResult other = (GetRightsizingRecommendationResult) obj;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getRightsizingRecommendations() == null ^ this.getRightsizingRecommendations() == null)
            return false;
        if (other.getRightsizingRecommendations() != null && other.getRightsizingRecommendations().equals(this.getRightsizingRecommendations()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getRightsizingRecommendations() == null) ? 0 : getRightsizingRecommendations().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetRightsizingRecommendationResult clone() {
        try {
            return (GetRightsizingRecommendationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
