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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetAssessment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssessmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of criteria for assessment.
     * </p>
     */
    private java.util.List<AssessmentTarget> assessmentTargets;
    /**
     * <p>
     * Detailed information about the assessment.
     * </p>
     */
    private DataCollectionDetails dataCollectionDetails;
    /**
     * <p>
     * The ID for the specific assessment task.
     * </p>
     */
    private String id;

    /**
     * <p>
     * List of criteria for assessment.
     * </p>
     * 
     * @return List of criteria for assessment.
     */

    public java.util.List<AssessmentTarget> getAssessmentTargets() {
        return assessmentTargets;
    }

    /**
     * <p>
     * List of criteria for assessment.
     * </p>
     * 
     * @param assessmentTargets
     *        List of criteria for assessment.
     */

    public void setAssessmentTargets(java.util.Collection<AssessmentTarget> assessmentTargets) {
        if (assessmentTargets == null) {
            this.assessmentTargets = null;
            return;
        }

        this.assessmentTargets = new java.util.ArrayList<AssessmentTarget>(assessmentTargets);
    }

    /**
     * <p>
     * List of criteria for assessment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssessmentTargets(java.util.Collection)} or {@link #withAssessmentTargets(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param assessmentTargets
     *        List of criteria for assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssessmentResult withAssessmentTargets(AssessmentTarget... assessmentTargets) {
        if (this.assessmentTargets == null) {
            setAssessmentTargets(new java.util.ArrayList<AssessmentTarget>(assessmentTargets.length));
        }
        for (AssessmentTarget ele : assessmentTargets) {
            this.assessmentTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of criteria for assessment.
     * </p>
     * 
     * @param assessmentTargets
     *        List of criteria for assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssessmentResult withAssessmentTargets(java.util.Collection<AssessmentTarget> assessmentTargets) {
        setAssessmentTargets(assessmentTargets);
        return this;
    }

    /**
     * <p>
     * Detailed information about the assessment.
     * </p>
     * 
     * @param dataCollectionDetails
     *        Detailed information about the assessment.
     */

    public void setDataCollectionDetails(DataCollectionDetails dataCollectionDetails) {
        this.dataCollectionDetails = dataCollectionDetails;
    }

    /**
     * <p>
     * Detailed information about the assessment.
     * </p>
     * 
     * @return Detailed information about the assessment.
     */

    public DataCollectionDetails getDataCollectionDetails() {
        return this.dataCollectionDetails;
    }

    /**
     * <p>
     * Detailed information about the assessment.
     * </p>
     * 
     * @param dataCollectionDetails
     *        Detailed information about the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssessmentResult withDataCollectionDetails(DataCollectionDetails dataCollectionDetails) {
        setDataCollectionDetails(dataCollectionDetails);
        return this;
    }

    /**
     * <p>
     * The ID for the specific assessment task.
     * </p>
     * 
     * @param id
     *        The ID for the specific assessment task.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for the specific assessment task.
     * </p>
     * 
     * @return The ID for the specific assessment task.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for the specific assessment task.
     * </p>
     * 
     * @param id
     *        The ID for the specific assessment task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssessmentResult withId(String id) {
        setId(id);
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
        if (getAssessmentTargets() != null)
            sb.append("AssessmentTargets: ").append(getAssessmentTargets()).append(",");
        if (getDataCollectionDetails() != null)
            sb.append("DataCollectionDetails: ").append(getDataCollectionDetails()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssessmentResult == false)
            return false;
        GetAssessmentResult other = (GetAssessmentResult) obj;
        if (other.getAssessmentTargets() == null ^ this.getAssessmentTargets() == null)
            return false;
        if (other.getAssessmentTargets() != null && other.getAssessmentTargets().equals(this.getAssessmentTargets()) == false)
            return false;
        if (other.getDataCollectionDetails() == null ^ this.getDataCollectionDetails() == null)
            return false;
        if (other.getDataCollectionDetails() != null && other.getDataCollectionDetails().equals(this.getDataCollectionDetails()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentTargets() == null) ? 0 : getAssessmentTargets().hashCode());
        hashCode = prime * hashCode + ((getDataCollectionDetails() == null) ? 0 : getDataCollectionDetails().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public GetAssessmentResult clone() {
        try {
            return (GetAssessmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
