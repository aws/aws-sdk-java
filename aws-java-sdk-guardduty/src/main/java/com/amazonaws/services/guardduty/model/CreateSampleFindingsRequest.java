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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateSampleFindings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSampleFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the detector to create sample findings for.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * Types of sample findings to generate.
     * </p>
     */
    private java.util.List<String> findingTypes;

    /**
     * <p>
     * The ID of the detector to create sample findings for.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector to create sample findings for.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector to create sample findings for.
     * </p>
     * 
     * @return The ID of the detector to create sample findings for.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The ID of the detector to create sample findings for.
     * </p>
     * 
     * @param detectorId
     *        The ID of the detector to create sample findings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSampleFindingsRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * Types of sample findings to generate.
     * </p>
     * 
     * @return Types of sample findings to generate.
     */

    public java.util.List<String> getFindingTypes() {
        return findingTypes;
    }

    /**
     * <p>
     * Types of sample findings to generate.
     * </p>
     * 
     * @param findingTypes
     *        Types of sample findings to generate.
     */

    public void setFindingTypes(java.util.Collection<String> findingTypes) {
        if (findingTypes == null) {
            this.findingTypes = null;
            return;
        }

        this.findingTypes = new java.util.ArrayList<String>(findingTypes);
    }

    /**
     * <p>
     * Types of sample findings to generate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingTypes(java.util.Collection)} or {@link #withFindingTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param findingTypes
     *        Types of sample findings to generate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSampleFindingsRequest withFindingTypes(String... findingTypes) {
        if (this.findingTypes == null) {
            setFindingTypes(new java.util.ArrayList<String>(findingTypes.length));
        }
        for (String ele : findingTypes) {
            this.findingTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Types of sample findings to generate.
     * </p>
     * 
     * @param findingTypes
     *        Types of sample findings to generate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSampleFindingsRequest withFindingTypes(java.util.Collection<String> findingTypes) {
        setFindingTypes(findingTypes);
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
        if (getFindingTypes() != null)
            sb.append("FindingTypes: ").append(getFindingTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSampleFindingsRequest == false)
            return false;
        CreateSampleFindingsRequest other = (CreateSampleFindingsRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getFindingTypes() == null ^ this.getFindingTypes() == null)
            return false;
        if (other.getFindingTypes() != null && other.getFindingTypes().equals(this.getFindingTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getFindingTypes() == null) ? 0 : getFindingTypes().hashCode());
        return hashCode;
    }

    @Override
    public CreateSampleFindingsRequest clone() {
        return (CreateSampleFindingsRequest) super.clone();
    }

}
