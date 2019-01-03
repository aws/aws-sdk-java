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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * UpdateFilterRequest request body.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Specifies the action that is to be applied to the findings that match the filter. */
    private String action;
    /** The description of the filter. */
    private String description;
    /** The unique ID of the detector that specifies the GuardDuty service where you want to update a filter. */
    private String detectorId;
    /** The name of the filter. */
    private String filterName;
    /** Represents the criteria to be used in the filter for querying findings. */
    private FindingCriteria findingCriteria;
    /**
     * Specifies the position of the filter in the list of current filters. Also specifies the order in which this
     * filter is applied to the findings.
     */
    private Integer rank;

    /**
     * Specifies the action that is to be applied to the findings that match the filter.
     * 
     * @param action
     *        Specifies the action that is to be applied to the findings that match the filter.
     * @see FilterAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Specifies the action that is to be applied to the findings that match the filter.
     * 
     * @return Specifies the action that is to be applied to the findings that match the filter.
     * @see FilterAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * Specifies the action that is to be applied to the findings that match the filter.
     * 
     * @param action
     *        Specifies the action that is to be applied to the findings that match the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterAction
     */

    public UpdateFilterRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * Specifies the action that is to be applied to the findings that match the filter.
     * 
     * @param action
     *        Specifies the action that is to be applied to the findings that match the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterAction
     */

    public UpdateFilterRequest withAction(FilterAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * The description of the filter.
     * 
     * @param description
     *        The description of the filter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The description of the filter.
     * 
     * @return The description of the filter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * The description of the filter.
     * 
     * @param description
     *        The description of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFilterRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The unique ID of the detector that specifies the GuardDuty service where you want to update a filter.
     * 
     * @param detectorId
     *        The unique ID of the detector that specifies the GuardDuty service where you want to update a filter.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * The unique ID of the detector that specifies the GuardDuty service where you want to update a filter.
     * 
     * @return The unique ID of the detector that specifies the GuardDuty service where you want to update a filter.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * The unique ID of the detector that specifies the GuardDuty service where you want to update a filter.
     * 
     * @param detectorId
     *        The unique ID of the detector that specifies the GuardDuty service where you want to update a filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFilterRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * The name of the filter.
     * 
     * @param filterName
     *        The name of the filter.
     */

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * The name of the filter.
     * 
     * @return The name of the filter.
     */

    public String getFilterName() {
        return this.filterName;
    }

    /**
     * The name of the filter.
     * 
     * @param filterName
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFilterRequest withFilterName(String filterName) {
        setFilterName(filterName);
        return this;
    }

    /**
     * Represents the criteria to be used in the filter for querying findings.
     * 
     * @param findingCriteria
     *        Represents the criteria to be used in the filter for querying findings.
     */

    public void setFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
    }

    /**
     * Represents the criteria to be used in the filter for querying findings.
     * 
     * @return Represents the criteria to be used in the filter for querying findings.
     */

    public FindingCriteria getFindingCriteria() {
        return this.findingCriteria;
    }

    /**
     * Represents the criteria to be used in the filter for querying findings.
     * 
     * @param findingCriteria
     *        Represents the criteria to be used in the filter for querying findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFilterRequest withFindingCriteria(FindingCriteria findingCriteria) {
        setFindingCriteria(findingCriteria);
        return this;
    }

    /**
     * Specifies the position of the filter in the list of current filters. Also specifies the order in which this
     * filter is applied to the findings.
     * 
     * @param rank
     *        Specifies the position of the filter in the list of current filters. Also specifies the order in which
     *        this filter is applied to the findings.
     */

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * Specifies the position of the filter in the list of current filters. Also specifies the order in which this
     * filter is applied to the findings.
     * 
     * @return Specifies the position of the filter in the list of current filters. Also specifies the order in which
     *         this filter is applied to the findings.
     */

    public Integer getRank() {
        return this.rank;
    }

    /**
     * Specifies the position of the filter in the list of current filters. Also specifies the order in which this
     * filter is applied to the findings.
     * 
     * @param rank
     *        Specifies the position of the filter in the list of current filters. Also specifies the order in which
     *        this filter is applied to the findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFilterRequest withRank(Integer rank) {
        setRank(rank);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getFilterName() != null)
            sb.append("FilterName: ").append(getFilterName()).append(",");
        if (getFindingCriteria() != null)
            sb.append("FindingCriteria: ").append(getFindingCriteria()).append(",");
        if (getRank() != null)
            sb.append("Rank: ").append(getRank());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFilterRequest == false)
            return false;
        UpdateFilterRequest other = (UpdateFilterRequest) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getFilterName() == null ^ this.getFilterName() == null)
            return false;
        if (other.getFilterName() != null && other.getFilterName().equals(this.getFilterName()) == false)
            return false;
        if (other.getFindingCriteria() == null ^ this.getFindingCriteria() == null)
            return false;
        if (other.getFindingCriteria() != null && other.getFindingCriteria().equals(this.getFindingCriteria()) == false)
            return false;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        hashCode = prime * hashCode + ((getFindingCriteria() == null) ? 0 : getFindingCriteria().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFilterRequest clone() {
        return (UpdateFilterRequest) super.clone();
    }

}
