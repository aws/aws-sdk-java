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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetRecommendationReportDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecommendationReportDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the recommendation report generation task. See the response of
     * <a>StartRecommendationReportGeneration</a>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Detailed information about the recommendation report.
     * </p>
     */
    private RecommendationReportDetails recommendationReportDetails;

    /**
     * <p>
     * The ID of the recommendation report generation task. See the response of
     * <a>StartRecommendationReportGeneration</a>.
     * </p>
     * 
     * @param id
     *        The ID of the recommendation report generation task. See the response of
     *        <a>StartRecommendationReportGeneration</a>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the recommendation report generation task. See the response of
     * <a>StartRecommendationReportGeneration</a>.
     * </p>
     * 
     * @return The ID of the recommendation report generation task. See the response of
     *         <a>StartRecommendationReportGeneration</a>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the recommendation report generation task. See the response of
     * <a>StartRecommendationReportGeneration</a>.
     * </p>
     * 
     * @param id
     *        The ID of the recommendation report generation task. See the response of
     *        <a>StartRecommendationReportGeneration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationReportDetailsResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Detailed information about the recommendation report.
     * </p>
     * 
     * @param recommendationReportDetails
     *        Detailed information about the recommendation report.
     */

    public void setRecommendationReportDetails(RecommendationReportDetails recommendationReportDetails) {
        this.recommendationReportDetails = recommendationReportDetails;
    }

    /**
     * <p>
     * Detailed information about the recommendation report.
     * </p>
     * 
     * @return Detailed information about the recommendation report.
     */

    public RecommendationReportDetails getRecommendationReportDetails() {
        return this.recommendationReportDetails;
    }

    /**
     * <p>
     * Detailed information about the recommendation report.
     * </p>
     * 
     * @param recommendationReportDetails
     *        Detailed information about the recommendation report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationReportDetailsResult withRecommendationReportDetails(RecommendationReportDetails recommendationReportDetails) {
        setRecommendationReportDetails(recommendationReportDetails);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRecommendationReportDetails() != null)
            sb.append("RecommendationReportDetails: ").append(getRecommendationReportDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecommendationReportDetailsResult == false)
            return false;
        GetRecommendationReportDetailsResult other = (GetRecommendationReportDetailsResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRecommendationReportDetails() == null ^ this.getRecommendationReportDetails() == null)
            return false;
        if (other.getRecommendationReportDetails() != null && other.getRecommendationReportDetails().equals(this.getRecommendationReportDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRecommendationReportDetails() == null) ? 0 : getRecommendationReportDetails().hashCode());
        return hashCode;
    }

    @Override
    public GetRecommendationReportDetailsResult clone() {
        try {
            return (GetRecommendationReportDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
