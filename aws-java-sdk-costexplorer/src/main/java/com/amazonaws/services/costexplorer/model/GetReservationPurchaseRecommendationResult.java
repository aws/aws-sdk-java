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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationPurchaseRecommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReservationPurchaseRecommendationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about this specific recommendation call, such as the time stamp for when Cost Explorer generated this
     * recommendation.
     * </p>
     */
    private ReservationPurchaseRecommendationMetadata metadata;
    /**
     * <p>
     * Recommendations for reservations to purchase.
     * </p>
     */
    private java.util.List<ReservationPurchaseRecommendation> recommendations;
    /**
     * <p>
     * The pagination token for the next set of retrievable results.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * Information about this specific recommendation call, such as the time stamp for when Cost Explorer generated this
     * recommendation.
     * </p>
     * 
     * @param metadata
     *        Information about this specific recommendation call, such as the time stamp for when Cost Explorer
     *        generated this recommendation.
     */

    public void setMetadata(ReservationPurchaseRecommendationMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Information about this specific recommendation call, such as the time stamp for when Cost Explorer generated this
     * recommendation.
     * </p>
     * 
     * @return Information about this specific recommendation call, such as the time stamp for when Cost Explorer
     *         generated this recommendation.
     */

    public ReservationPurchaseRecommendationMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * Information about this specific recommendation call, such as the time stamp for when Cost Explorer generated this
     * recommendation.
     * </p>
     * 
     * @param metadata
     *        Information about this specific recommendation call, such as the time stamp for when Cost Explorer
     *        generated this recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationPurchaseRecommendationResult withMetadata(ReservationPurchaseRecommendationMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * Recommendations for reservations to purchase.
     * </p>
     * 
     * @return Recommendations for reservations to purchase.
     */

    public java.util.List<ReservationPurchaseRecommendation> getRecommendations() {
        return recommendations;
    }

    /**
     * <p>
     * Recommendations for reservations to purchase.
     * </p>
     * 
     * @param recommendations
     *        Recommendations for reservations to purchase.
     */

    public void setRecommendations(java.util.Collection<ReservationPurchaseRecommendation> recommendations) {
        if (recommendations == null) {
            this.recommendations = null;
            return;
        }

        this.recommendations = new java.util.ArrayList<ReservationPurchaseRecommendation>(recommendations);
    }

    /**
     * <p>
     * Recommendations for reservations to purchase.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendations(java.util.Collection)} or {@link #withRecommendations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recommendations
     *        Recommendations for reservations to purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationPurchaseRecommendationResult withRecommendations(ReservationPurchaseRecommendation... recommendations) {
        if (this.recommendations == null) {
            setRecommendations(new java.util.ArrayList<ReservationPurchaseRecommendation>(recommendations.length));
        }
        for (ReservationPurchaseRecommendation ele : recommendations) {
            this.recommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Recommendations for reservations to purchase.
     * </p>
     * 
     * @param recommendations
     *        Recommendations for reservations to purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationPurchaseRecommendationResult withRecommendations(java.util.Collection<ReservationPurchaseRecommendation> recommendations) {
        setRecommendations(recommendations);
        return this;
    }

    /**
     * <p>
     * The pagination token for the next set of retrievable results.
     * </p>
     * 
     * @param nextPageToken
     *        The pagination token for the next set of retrievable results.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The pagination token for the next set of retrievable results.
     * </p>
     * 
     * @return The pagination token for the next set of retrievable results.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The pagination token for the next set of retrievable results.
     * </p>
     * 
     * @param nextPageToken
     *        The pagination token for the next set of retrievable results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationPurchaseRecommendationResult withNextPageToken(String nextPageToken) {
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
        if (getRecommendations() != null)
            sb.append("Recommendations: ").append(getRecommendations()).append(",");
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

        if (obj instanceof GetReservationPurchaseRecommendationResult == false)
            return false;
        GetReservationPurchaseRecommendationResult other = (GetReservationPurchaseRecommendationResult) obj;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getRecommendations() == null ^ this.getRecommendations() == null)
            return false;
        if (other.getRecommendations() != null && other.getRecommendations().equals(this.getRecommendations()) == false)
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
        hashCode = prime * hashCode + ((getRecommendations() == null) ? 0 : getRecommendations().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetReservationPurchaseRecommendationResult clone() {
        try {
            return (GetReservationPurchaseRecommendationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
