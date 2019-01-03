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
 * CreateFilterRequest request body.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Specifies the action that is to be applied to the findings that match the filter. */
    private String action;
    /** The idempotency token for the create request. */
    private String clientToken;
    /** The description of the filter. */
    private String description;
    /** The unique ID of the detector that you want to update. */
    private String detectorId;
    /** Represents the criteria to be used in the filter for querying findings. */
    private FindingCriteria findingCriteria;
    /** The name of the filter. */
    private String name;
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

    public CreateFilterRequest withAction(String action) {
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

    public CreateFilterRequest withAction(FilterAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * The idempotency token for the create request.
     * 
     * @param clientToken
     *        The idempotency token for the create request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * The idempotency token for the create request.
     * 
     * @return The idempotency token for the create request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * The idempotency token for the create request.
     * 
     * @param clientToken
     *        The idempotency token for the create request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public CreateFilterRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The unique ID of the detector that you want to update.
     * 
     * @param detectorId
     *        The unique ID of the detector that you want to update.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * The unique ID of the detector that you want to update.
     * 
     * @return The unique ID of the detector that you want to update.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * The unique ID of the detector that you want to update.
     * 
     * @param detectorId
     *        The unique ID of the detector that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
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

    public CreateFilterRequest withFindingCriteria(FindingCriteria findingCriteria) {
        setFindingCriteria(findingCriteria);
        return this;
    }

    /**
     * The name of the filter.
     * 
     * @param name
     *        The name of the filter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the filter.
     * 
     * @return The name of the filter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the filter.
     * 
     * @param name
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withName(String name) {
        setName(name);
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

    public CreateFilterRequest withRank(Integer rank) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getFindingCriteria() != null)
            sb.append("FindingCriteria: ").append(getFindingCriteria()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof CreateFilterRequest == false)
            return false;
        CreateFilterRequest other = (CreateFilterRequest) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getFindingCriteria() == null ^ this.getFindingCriteria() == null)
            return false;
        if (other.getFindingCriteria() != null && other.getFindingCriteria().equals(this.getFindingCriteria()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getFindingCriteria() == null) ? 0 : getFindingCriteria().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        return hashCode;
    }

    @Override
    public CreateFilterRequest clone() {
        return (CreateFilterRequest) super.clone();
    }

}
