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
 * GetFindingsStatistics request body.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindingsStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingsStatisticsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the detector that specifies the GuardDuty service whose findings' statistics you want to retrieve. */
    private String detectorId;
    /** Represents the criteria used for querying findings. */
    private FindingCriteria findingCriteria;
    /** Types of finding statistics to retrieve. */
    private java.util.List<String> findingStatisticTypes;

    /**
     * The ID of the detector that specifies the GuardDuty service whose findings' statistics you want to retrieve.
     * 
     * @param detectorId
     *        The ID of the detector that specifies the GuardDuty service whose findings' statistics you want to
     *        retrieve.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * The ID of the detector that specifies the GuardDuty service whose findings' statistics you want to retrieve.
     * 
     * @return The ID of the detector that specifies the GuardDuty service whose findings' statistics you want to
     *         retrieve.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * The ID of the detector that specifies the GuardDuty service whose findings' statistics you want to retrieve.
     * 
     * @param detectorId
     *        The ID of the detector that specifies the GuardDuty service whose findings' statistics you want to
     *        retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsStatisticsRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * Represents the criteria used for querying findings.
     * 
     * @param findingCriteria
     *        Represents the criteria used for querying findings.
     */

    public void setFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
    }

    /**
     * Represents the criteria used for querying findings.
     * 
     * @return Represents the criteria used for querying findings.
     */

    public FindingCriteria getFindingCriteria() {
        return this.findingCriteria;
    }

    /**
     * Represents the criteria used for querying findings.
     * 
     * @param findingCriteria
     *        Represents the criteria used for querying findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsStatisticsRequest withFindingCriteria(FindingCriteria findingCriteria) {
        setFindingCriteria(findingCriteria);
        return this;
    }

    /**
     * Types of finding statistics to retrieve.
     * 
     * @return Types of finding statistics to retrieve.
     * @see FindingStatisticType
     */

    public java.util.List<String> getFindingStatisticTypes() {
        return findingStatisticTypes;
    }

    /**
     * Types of finding statistics to retrieve.
     * 
     * @param findingStatisticTypes
     *        Types of finding statistics to retrieve.
     * @see FindingStatisticType
     */

    public void setFindingStatisticTypes(java.util.Collection<String> findingStatisticTypes) {
        if (findingStatisticTypes == null) {
            this.findingStatisticTypes = null;
            return;
        }

        this.findingStatisticTypes = new java.util.ArrayList<String>(findingStatisticTypes);
    }

    /**
     * Types of finding statistics to retrieve.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingStatisticTypes(java.util.Collection)} or
     * {@link #withFindingStatisticTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param findingStatisticTypes
     *        Types of finding statistics to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingStatisticType
     */

    public GetFindingsStatisticsRequest withFindingStatisticTypes(String... findingStatisticTypes) {
        if (this.findingStatisticTypes == null) {
            setFindingStatisticTypes(new java.util.ArrayList<String>(findingStatisticTypes.length));
        }
        for (String ele : findingStatisticTypes) {
            this.findingStatisticTypes.add(ele);
        }
        return this;
    }

    /**
     * Types of finding statistics to retrieve.
     * 
     * @param findingStatisticTypes
     *        Types of finding statistics to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingStatisticType
     */

    public GetFindingsStatisticsRequest withFindingStatisticTypes(java.util.Collection<String> findingStatisticTypes) {
        setFindingStatisticTypes(findingStatisticTypes);
        return this;
    }

    /**
     * Types of finding statistics to retrieve.
     * 
     * @param findingStatisticTypes
     *        Types of finding statistics to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingStatisticType
     */

    public GetFindingsStatisticsRequest withFindingStatisticTypes(FindingStatisticType... findingStatisticTypes) {
        java.util.ArrayList<String> findingStatisticTypesCopy = new java.util.ArrayList<String>(findingStatisticTypes.length);
        for (FindingStatisticType value : findingStatisticTypes) {
            findingStatisticTypesCopy.add(value.toString());
        }
        if (getFindingStatisticTypes() == null) {
            setFindingStatisticTypes(findingStatisticTypesCopy);
        } else {
            getFindingStatisticTypes().addAll(findingStatisticTypesCopy);
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
        if (getFindingCriteria() != null)
            sb.append("FindingCriteria: ").append(getFindingCriteria()).append(",");
        if (getFindingStatisticTypes() != null)
            sb.append("FindingStatisticTypes: ").append(getFindingStatisticTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingsStatisticsRequest == false)
            return false;
        GetFindingsStatisticsRequest other = (GetFindingsStatisticsRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getFindingCriteria() == null ^ this.getFindingCriteria() == null)
            return false;
        if (other.getFindingCriteria() != null && other.getFindingCriteria().equals(this.getFindingCriteria()) == false)
            return false;
        if (other.getFindingStatisticTypes() == null ^ this.getFindingStatisticTypes() == null)
            return false;
        if (other.getFindingStatisticTypes() != null && other.getFindingStatisticTypes().equals(this.getFindingStatisticTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getFindingCriteria() == null) ? 0 : getFindingCriteria().hashCode());
        hashCode = prime * hashCode + ((getFindingStatisticTypes() == null) ? 0 : getFindingStatisticTypes().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingsStatisticsRequest clone() {
        return (GetFindingsStatisticsRequest) super.clone();
    }

}
