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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetCoverageStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCoverageStatisticsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the GuardDuty detector associated to the coverage statistics.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * Represents the criteria used to filter the coverage statistics
     * </p>
     */
    private CoverageFilterCriteria filterCriteria;
    /**
     * <p>
     * Represents the statistics type used to aggregate the coverage details.
     * </p>
     */
    private java.util.List<String> statisticsType;

    /**
     * <p>
     * The unique ID of the GuardDuty detector associated to the coverage statistics.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the GuardDuty detector associated to the coverage statistics.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the GuardDuty detector associated to the coverage statistics.
     * </p>
     * 
     * @return The unique ID of the GuardDuty detector associated to the coverage statistics.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The unique ID of the GuardDuty detector associated to the coverage statistics.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the GuardDuty detector associated to the coverage statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoverageStatisticsRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * Represents the criteria used to filter the coverage statistics
     * </p>
     * 
     * @param filterCriteria
     *        Represents the criteria used to filter the coverage statistics
     */

    public void setFilterCriteria(CoverageFilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    /**
     * <p>
     * Represents the criteria used to filter the coverage statistics
     * </p>
     * 
     * @return Represents the criteria used to filter the coverage statistics
     */

    public CoverageFilterCriteria getFilterCriteria() {
        return this.filterCriteria;
    }

    /**
     * <p>
     * Represents the criteria used to filter the coverage statistics
     * </p>
     * 
     * @param filterCriteria
     *        Represents the criteria used to filter the coverage statistics
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCoverageStatisticsRequest withFilterCriteria(CoverageFilterCriteria filterCriteria) {
        setFilterCriteria(filterCriteria);
        return this;
    }

    /**
     * <p>
     * Represents the statistics type used to aggregate the coverage details.
     * </p>
     * 
     * @return Represents the statistics type used to aggregate the coverage details.
     * @see CoverageStatisticsType
     */

    public java.util.List<String> getStatisticsType() {
        return statisticsType;
    }

    /**
     * <p>
     * Represents the statistics type used to aggregate the coverage details.
     * </p>
     * 
     * @param statisticsType
     *        Represents the statistics type used to aggregate the coverage details.
     * @see CoverageStatisticsType
     */

    public void setStatisticsType(java.util.Collection<String> statisticsType) {
        if (statisticsType == null) {
            this.statisticsType = null;
            return;
        }

        this.statisticsType = new java.util.ArrayList<String>(statisticsType);
    }

    /**
     * <p>
     * Represents the statistics type used to aggregate the coverage details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatisticsType(java.util.Collection)} or {@link #withStatisticsType(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param statisticsType
     *        Represents the statistics type used to aggregate the coverage details.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoverageStatisticsType
     */

    public GetCoverageStatisticsRequest withStatisticsType(String... statisticsType) {
        if (this.statisticsType == null) {
            setStatisticsType(new java.util.ArrayList<String>(statisticsType.length));
        }
        for (String ele : statisticsType) {
            this.statisticsType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the statistics type used to aggregate the coverage details.
     * </p>
     * 
     * @param statisticsType
     *        Represents the statistics type used to aggregate the coverage details.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoverageStatisticsType
     */

    public GetCoverageStatisticsRequest withStatisticsType(java.util.Collection<String> statisticsType) {
        setStatisticsType(statisticsType);
        return this;
    }

    /**
     * <p>
     * Represents the statistics type used to aggregate the coverage details.
     * </p>
     * 
     * @param statisticsType
     *        Represents the statistics type used to aggregate the coverage details.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoverageStatisticsType
     */

    public GetCoverageStatisticsRequest withStatisticsType(CoverageStatisticsType... statisticsType) {
        java.util.ArrayList<String> statisticsTypeCopy = new java.util.ArrayList<String>(statisticsType.length);
        for (CoverageStatisticsType value : statisticsType) {
            statisticsTypeCopy.add(value.toString());
        }
        if (getStatisticsType() == null) {
            setStatisticsType(statisticsTypeCopy);
        } else {
            getStatisticsType().addAll(statisticsTypeCopy);
        }
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getFilterCriteria() != null)
            sb.append("FilterCriteria: ").append(getFilterCriteria()).append(",");
        if (getStatisticsType() != null)
            sb.append("StatisticsType: ").append(getStatisticsType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCoverageStatisticsRequest == false)
            return false;
        GetCoverageStatisticsRequest other = (GetCoverageStatisticsRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getFilterCriteria() == null ^ this.getFilterCriteria() == null)
            return false;
        if (other.getFilterCriteria() != null && other.getFilterCriteria().equals(this.getFilterCriteria()) == false)
            return false;
        if (other.getStatisticsType() == null ^ this.getStatisticsType() == null)
            return false;
        if (other.getStatisticsType() != null && other.getStatisticsType().equals(this.getStatisticsType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getFilterCriteria() == null) ? 0 : getFilterCriteria().hashCode());
        hashCode = prime * hashCode + ((getStatisticsType() == null) ? 0 : getStatisticsType().hashCode());
        return hashCode;
    }

    @Override
    public GetCoverageStatisticsRequest clone() {
        return (GetCoverageStatisticsRequest) super.clone();
    }

}
