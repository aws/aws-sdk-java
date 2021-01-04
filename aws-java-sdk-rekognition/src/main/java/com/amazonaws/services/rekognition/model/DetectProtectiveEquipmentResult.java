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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectProtectiveEquipmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The version number of the PPE detection model used to detect PPE in the image.
     * </p>
     */
    private String protectiveEquipmentModelVersion;
    /**
     * <p>
     * An array of persons detected in the image (including persons not wearing PPE).
     * </p>
     */
    private java.util.List<ProtectiveEquipmentPerson> persons;
    /**
     * <p>
     * Summary information for the types of PPE specified in the <code>SummarizationAttributes</code> input parameter.
     * </p>
     */
    private ProtectiveEquipmentSummary summary;

    /**
     * <p>
     * The version number of the PPE detection model used to detect PPE in the image.
     * </p>
     * 
     * @param protectiveEquipmentModelVersion
     *        The version number of the PPE detection model used to detect PPE in the image.
     */

    public void setProtectiveEquipmentModelVersion(String protectiveEquipmentModelVersion) {
        this.protectiveEquipmentModelVersion = protectiveEquipmentModelVersion;
    }

    /**
     * <p>
     * The version number of the PPE detection model used to detect PPE in the image.
     * </p>
     * 
     * @return The version number of the PPE detection model used to detect PPE in the image.
     */

    public String getProtectiveEquipmentModelVersion() {
        return this.protectiveEquipmentModelVersion;
    }

    /**
     * <p>
     * The version number of the PPE detection model used to detect PPE in the image.
     * </p>
     * 
     * @param protectiveEquipmentModelVersion
     *        The version number of the PPE detection model used to detect PPE in the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectProtectiveEquipmentResult withProtectiveEquipmentModelVersion(String protectiveEquipmentModelVersion) {
        setProtectiveEquipmentModelVersion(protectiveEquipmentModelVersion);
        return this;
    }

    /**
     * <p>
     * An array of persons detected in the image (including persons not wearing PPE).
     * </p>
     * 
     * @return An array of persons detected in the image (including persons not wearing PPE).
     */

    public java.util.List<ProtectiveEquipmentPerson> getPersons() {
        return persons;
    }

    /**
     * <p>
     * An array of persons detected in the image (including persons not wearing PPE).
     * </p>
     * 
     * @param persons
     *        An array of persons detected in the image (including persons not wearing PPE).
     */

    public void setPersons(java.util.Collection<ProtectiveEquipmentPerson> persons) {
        if (persons == null) {
            this.persons = null;
            return;
        }

        this.persons = new java.util.ArrayList<ProtectiveEquipmentPerson>(persons);
    }

    /**
     * <p>
     * An array of persons detected in the image (including persons not wearing PPE).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPersons(java.util.Collection)} or {@link #withPersons(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param persons
     *        An array of persons detected in the image (including persons not wearing PPE).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectProtectiveEquipmentResult withPersons(ProtectiveEquipmentPerson... persons) {
        if (this.persons == null) {
            setPersons(new java.util.ArrayList<ProtectiveEquipmentPerson>(persons.length));
        }
        for (ProtectiveEquipmentPerson ele : persons) {
            this.persons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of persons detected in the image (including persons not wearing PPE).
     * </p>
     * 
     * @param persons
     *        An array of persons detected in the image (including persons not wearing PPE).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectProtectiveEquipmentResult withPersons(java.util.Collection<ProtectiveEquipmentPerson> persons) {
        setPersons(persons);
        return this;
    }

    /**
     * <p>
     * Summary information for the types of PPE specified in the <code>SummarizationAttributes</code> input parameter.
     * </p>
     * 
     * @param summary
     *        Summary information for the types of PPE specified in the <code>SummarizationAttributes</code> input
     *        parameter.
     */

    public void setSummary(ProtectiveEquipmentSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * Summary information for the types of PPE specified in the <code>SummarizationAttributes</code> input parameter.
     * </p>
     * 
     * @return Summary information for the types of PPE specified in the <code>SummarizationAttributes</code> input
     *         parameter.
     */

    public ProtectiveEquipmentSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * Summary information for the types of PPE specified in the <code>SummarizationAttributes</code> input parameter.
     * </p>
     * 
     * @param summary
     *        Summary information for the types of PPE specified in the <code>SummarizationAttributes</code> input
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectProtectiveEquipmentResult withSummary(ProtectiveEquipmentSummary summary) {
        setSummary(summary);
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
        if (getProtectiveEquipmentModelVersion() != null)
            sb.append("ProtectiveEquipmentModelVersion: ").append(getProtectiveEquipmentModelVersion()).append(",");
        if (getPersons() != null)
            sb.append("Persons: ").append(getPersons()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectProtectiveEquipmentResult == false)
            return false;
        DetectProtectiveEquipmentResult other = (DetectProtectiveEquipmentResult) obj;
        if (other.getProtectiveEquipmentModelVersion() == null ^ this.getProtectiveEquipmentModelVersion() == null)
            return false;
        if (other.getProtectiveEquipmentModelVersion() != null
                && other.getProtectiveEquipmentModelVersion().equals(this.getProtectiveEquipmentModelVersion()) == false)
            return false;
        if (other.getPersons() == null ^ this.getPersons() == null)
            return false;
        if (other.getPersons() != null && other.getPersons().equals(this.getPersons()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectiveEquipmentModelVersion() == null) ? 0 : getProtectiveEquipmentModelVersion().hashCode());
        hashCode = prime * hashCode + ((getPersons() == null) ? 0 : getPersons().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        return hashCode;
    }

    @Override
    public DetectProtectiveEquipmentResult clone() {
        try {
            return (DetectProtectiveEquipmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
