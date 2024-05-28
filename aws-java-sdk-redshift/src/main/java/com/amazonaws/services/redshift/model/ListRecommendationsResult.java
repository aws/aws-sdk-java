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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ListRecommendations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Advisor recommendations for action on the Amazon Redshift cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Recommendation> recommendations;
    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been
     * retrieved for the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The Advisor recommendations for action on the Amazon Redshift cluster.
     * </p>
     * 
     * @return The Advisor recommendations for action on the Amazon Redshift cluster.
     */

    public java.util.List<Recommendation> getRecommendations() {
        if (recommendations == null) {
            recommendations = new com.amazonaws.internal.SdkInternalList<Recommendation>();
        }
        return recommendations;
    }

    /**
     * <p>
     * The Advisor recommendations for action on the Amazon Redshift cluster.
     * </p>
     * 
     * @param recommendations
     *        The Advisor recommendations for action on the Amazon Redshift cluster.
     */

    public void setRecommendations(java.util.Collection<Recommendation> recommendations) {
        if (recommendations == null) {
            this.recommendations = null;
            return;
        }

        this.recommendations = new com.amazonaws.internal.SdkInternalList<Recommendation>(recommendations);
    }

    /**
     * <p>
     * The Advisor recommendations for action on the Amazon Redshift cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendations(java.util.Collection)} or {@link #withRecommendations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recommendations
     *        The Advisor recommendations for action on the Amazon Redshift cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsResult withRecommendations(Recommendation... recommendations) {
        if (this.recommendations == null) {
            setRecommendations(new com.amazonaws.internal.SdkInternalList<Recommendation>(recommendations.length));
        }
        for (Recommendation ele : recommendations) {
            this.recommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Advisor recommendations for action on the Amazon Redshift cluster.
     * </p>
     * 
     * @param recommendations
     *        The Advisor recommendations for action on the Amazon Redshift cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsResult withRecommendations(java.util.Collection<Recommendation> recommendations) {
        setRecommendations(recommendations);
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been
     * retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response
     *        records have been retrieved for the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been
     * retrieved for the request.
     * </p>
     * 
     * @return A value that indicates the starting point for the next set of response records in a subsequent request.
     *         If a value is returned in a response, you can retrieve the next set of records by providing this returned
     *         marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response
     *         records have been retrieved for the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been
     * retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response
     *        records have been retrieved for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecommendationsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getRecommendations() != null)
            sb.append("Recommendations: ").append(getRecommendations()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecommendationsResult == false)
            return false;
        ListRecommendationsResult other = (ListRecommendationsResult) obj;
        if (other.getRecommendations() == null ^ this.getRecommendations() == null)
            return false;
        if (other.getRecommendations() != null && other.getRecommendations().equals(this.getRecommendations()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendations() == null) ? 0 : getRecommendations().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListRecommendationsResult clone() {
        try {
            return (ListRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
