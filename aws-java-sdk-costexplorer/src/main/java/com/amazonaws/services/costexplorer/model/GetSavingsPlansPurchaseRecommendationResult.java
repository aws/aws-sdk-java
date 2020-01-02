/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansPurchaseRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSavingsPlansPurchaseRecommendationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information regarding this specific recommendation set.
     * </p>
     */
    private SavingsPlansPurchaseRecommendationMetadata metadata;
    /**
     * <p>
     * Contains your request parameters, Savings Plan Recommendations Summary, and Details.
     * </p>
     */
    private SavingsPlansPurchaseRecommendation savingsPlansPurchaseRecommendation;
    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
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

    public void setMetadata(SavingsPlansPurchaseRecommendationMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Information regarding this specific recommendation set.
     * </p>
     * 
     * @return Information regarding this specific recommendation set.
     */

    public SavingsPlansPurchaseRecommendationMetadata getMetadata() {
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

    public GetSavingsPlansPurchaseRecommendationResult withMetadata(SavingsPlansPurchaseRecommendationMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * Contains your request parameters, Savings Plan Recommendations Summary, and Details.
     * </p>
     * 
     * @param savingsPlansPurchaseRecommendation
     *        Contains your request parameters, Savings Plan Recommendations Summary, and Details.
     */

    public void setSavingsPlansPurchaseRecommendation(SavingsPlansPurchaseRecommendation savingsPlansPurchaseRecommendation) {
        this.savingsPlansPurchaseRecommendation = savingsPlansPurchaseRecommendation;
    }

    /**
     * <p>
     * Contains your request parameters, Savings Plan Recommendations Summary, and Details.
     * </p>
     * 
     * @return Contains your request parameters, Savings Plan Recommendations Summary, and Details.
     */

    public SavingsPlansPurchaseRecommendation getSavingsPlansPurchaseRecommendation() {
        return this.savingsPlansPurchaseRecommendation;
    }

    /**
     * <p>
     * Contains your request parameters, Savings Plan Recommendations Summary, and Details.
     * </p>
     * 
     * @param savingsPlansPurchaseRecommendation
     *        Contains your request parameters, Savings Plan Recommendations Summary, and Details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansPurchaseRecommendationResult withSavingsPlansPurchaseRecommendation(
            SavingsPlansPurchaseRecommendation savingsPlansPurchaseRecommendation) {
        setSavingsPlansPurchaseRecommendation(savingsPlansPurchaseRecommendation);
        return this;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token for the next set of retrievable results. AWS provides the token when the response from a
     *        previous call has more results than the maximum page size.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     * 
     * @return The token for the next set of retrievable results. AWS provides the token when the response from a
     *         previous call has more results than the maximum page size.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token when the response from a previous call
     * has more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token for the next set of retrievable results. AWS provides the token when the response from a
     *        previous call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansPurchaseRecommendationResult withNextPageToken(String nextPageToken) {
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
        if (getSavingsPlansPurchaseRecommendation() != null)
            sb.append("SavingsPlansPurchaseRecommendation: ").append(getSavingsPlansPurchaseRecommendation()).append(",");
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

        if (obj instanceof GetSavingsPlansPurchaseRecommendationResult == false)
            return false;
        GetSavingsPlansPurchaseRecommendationResult other = (GetSavingsPlansPurchaseRecommendationResult) obj;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getSavingsPlansPurchaseRecommendation() == null ^ this.getSavingsPlansPurchaseRecommendation() == null)
            return false;
        if (other.getSavingsPlansPurchaseRecommendation() != null
                && other.getSavingsPlansPurchaseRecommendation().equals(this.getSavingsPlansPurchaseRecommendation()) == false)
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
        hashCode = prime * hashCode + ((getSavingsPlansPurchaseRecommendation() == null) ? 0 : getSavingsPlansPurchaseRecommendation().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSavingsPlansPurchaseRecommendationResult clone() {
        try {
            return (GetSavingsPlansPurchaseRecommendationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
