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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The structure representing the GetRecommendationsResponse.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of anomalies that the analysis has found for this profile.
     * </p>
     */
    private java.util.List<Anomaly> anomalies;
    /**
     * <p>
     * The end time of the profile the analysis data is about. This is specified using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date profileEndTime;
    /**
     * <p>
     * The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For
     * example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date profileStartTime;
    /**
     * <p>
     * The name of the profiling group the analysis data is about.
     * </p>
     */
    private String profilingGroupName;
    /**
     * <p>
     * The list of recommendations that the analysis found for this profile.
     * </p>
     */
    private java.util.List<Recommendation> recommendations;

    /**
     * <p>
     * The list of anomalies that the analysis has found for this profile.
     * </p>
     * 
     * @return The list of anomalies that the analysis has found for this profile.
     */

    public java.util.List<Anomaly> getAnomalies() {
        return anomalies;
    }

    /**
     * <p>
     * The list of anomalies that the analysis has found for this profile.
     * </p>
     * 
     * @param anomalies
     *        The list of anomalies that the analysis has found for this profile.
     */

    public void setAnomalies(java.util.Collection<Anomaly> anomalies) {
        if (anomalies == null) {
            this.anomalies = null;
            return;
        }

        this.anomalies = new java.util.ArrayList<Anomaly>(anomalies);
    }

    /**
     * <p>
     * The list of anomalies that the analysis has found for this profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnomalies(java.util.Collection)} or {@link #withAnomalies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param anomalies
     *        The list of anomalies that the analysis has found for this profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsResult withAnomalies(Anomaly... anomalies) {
        if (this.anomalies == null) {
            setAnomalies(new java.util.ArrayList<Anomaly>(anomalies.length));
        }
        for (Anomaly ele : anomalies) {
            this.anomalies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of anomalies that the analysis has found for this profile.
     * </p>
     * 
     * @param anomalies
     *        The list of anomalies that the analysis has found for this profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsResult withAnomalies(java.util.Collection<Anomaly> anomalies) {
        setAnomalies(anomalies);
        return this;
    }

    /**
     * <p>
     * The end time of the profile the analysis data is about. This is specified using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param profileEndTime
     *        The end time of the profile the analysis data is about. This is specified using the ISO 8601 format. For
     *        example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public void setProfileEndTime(java.util.Date profileEndTime) {
        this.profileEndTime = profileEndTime;
    }

    /**
     * <p>
     * The end time of the profile the analysis data is about. This is specified using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @return The end time of the profile the analysis data is about. This is specified using the ISO 8601 format. For
     *         example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public java.util.Date getProfileEndTime() {
        return this.profileEndTime;
    }

    /**
     * <p>
     * The end time of the profile the analysis data is about. This is specified using the ISO 8601 format. For example,
     * 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param profileEndTime
     *        The end time of the profile the analysis data is about. This is specified using the ISO 8601 format. For
     *        example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsResult withProfileEndTime(java.util.Date profileEndTime) {
        setProfileEndTime(profileEndTime);
        return this;
    }

    /**
     * <p>
     * The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For
     * example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param profileStartTime
     *        The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For
     *        example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public void setProfileStartTime(java.util.Date profileStartTime) {
        this.profileStartTime = profileStartTime;
    }

    /**
     * <p>
     * The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For
     * example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @return The start time of the profile the analysis data is about. This is specified using the ISO 8601 format.
     *         For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public java.util.Date getProfileStartTime() {
        return this.profileStartTime;
    }

    /**
     * <p>
     * The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For
     * example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param profileStartTime
     *        The start time of the profile the analysis data is about. This is specified using the ISO 8601 format. For
     *        example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsResult withProfileStartTime(java.util.Date profileStartTime) {
        setProfileStartTime(profileStartTime);
        return this;
    }

    /**
     * <p>
     * The name of the profiling group the analysis data is about.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group the analysis data is about.
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group the analysis data is about.
     * </p>
     * 
     * @return The name of the profiling group the analysis data is about.
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group the analysis data is about.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group the analysis data is about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsResult withProfilingGroupName(String profilingGroupName) {
        setProfilingGroupName(profilingGroupName);
        return this;
    }

    /**
     * <p>
     * The list of recommendations that the analysis found for this profile.
     * </p>
     * 
     * @return The list of recommendations that the analysis found for this profile.
     */

    public java.util.List<Recommendation> getRecommendations() {
        return recommendations;
    }

    /**
     * <p>
     * The list of recommendations that the analysis found for this profile.
     * </p>
     * 
     * @param recommendations
     *        The list of recommendations that the analysis found for this profile.
     */

    public void setRecommendations(java.util.Collection<Recommendation> recommendations) {
        if (recommendations == null) {
            this.recommendations = null;
            return;
        }

        this.recommendations = new java.util.ArrayList<Recommendation>(recommendations);
    }

    /**
     * <p>
     * The list of recommendations that the analysis found for this profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendations(java.util.Collection)} or {@link #withRecommendations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recommendations
     *        The list of recommendations that the analysis found for this profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsResult withRecommendations(Recommendation... recommendations) {
        if (this.recommendations == null) {
            setRecommendations(new java.util.ArrayList<Recommendation>(recommendations.length));
        }
        for (Recommendation ele : recommendations) {
            this.recommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of recommendations that the analysis found for this profile.
     * </p>
     * 
     * @param recommendations
     *        The list of recommendations that the analysis found for this profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsResult withRecommendations(java.util.Collection<Recommendation> recommendations) {
        setRecommendations(recommendations);
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
        if (getAnomalies() != null)
            sb.append("Anomalies: ").append(getAnomalies()).append(",");
        if (getProfileEndTime() != null)
            sb.append("ProfileEndTime: ").append(getProfileEndTime()).append(",");
        if (getProfileStartTime() != null)
            sb.append("ProfileStartTime: ").append(getProfileStartTime()).append(",");
        if (getProfilingGroupName() != null)
            sb.append("ProfilingGroupName: ").append(getProfilingGroupName()).append(",");
        if (getRecommendations() != null)
            sb.append("Recommendations: ").append(getRecommendations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecommendationsResult == false)
            return false;
        GetRecommendationsResult other = (GetRecommendationsResult) obj;
        if (other.getAnomalies() == null ^ this.getAnomalies() == null)
            return false;
        if (other.getAnomalies() != null && other.getAnomalies().equals(this.getAnomalies()) == false)
            return false;
        if (other.getProfileEndTime() == null ^ this.getProfileEndTime() == null)
            return false;
        if (other.getProfileEndTime() != null && other.getProfileEndTime().equals(this.getProfileEndTime()) == false)
            return false;
        if (other.getProfileStartTime() == null ^ this.getProfileStartTime() == null)
            return false;
        if (other.getProfileStartTime() != null && other.getProfileStartTime().equals(this.getProfileStartTime()) == false)
            return false;
        if (other.getProfilingGroupName() == null ^ this.getProfilingGroupName() == null)
            return false;
        if (other.getProfilingGroupName() != null && other.getProfilingGroupName().equals(this.getProfilingGroupName()) == false)
            return false;
        if (other.getRecommendations() == null ^ this.getRecommendations() == null)
            return false;
        if (other.getRecommendations() != null && other.getRecommendations().equals(this.getRecommendations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalies() == null) ? 0 : getAnomalies().hashCode());
        hashCode = prime * hashCode + ((getProfileEndTime() == null) ? 0 : getProfileEndTime().hashCode());
        hashCode = prime * hashCode + ((getProfileStartTime() == null) ? 0 : getProfileStartTime().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupName() == null) ? 0 : getProfilingGroupName().hashCode());
        hashCode = prime * hashCode + ((getRecommendations() == null) ? 0 : getRecommendations().hashCode());
        return hashCode;
    }

    @Override
    public GetRecommendationsResult clone() {
        try {
            return (GetRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
