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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The search input attribute value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/SearchByAttributeValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchByAttributeValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The patient ID input for search.
     * </p>
     */
    private String dICOMPatientId;
    /**
     * <p>
     * The DICOM accession number for search.
     * </p>
     */
    private String dICOMAccessionNumber;
    /**
     * <p>
     * The DICOM study ID for search.
     * </p>
     */
    private String dICOMStudyId;
    /**
     * <p>
     * The DICOM study instance UID for search.
     * </p>
     */
    private String dICOMStudyInstanceUID;
    /**
     * <p>
     * The Series Instance UID input for search.
     * </p>
     */
    private String dICOMSeriesInstanceUID;
    /**
     * <p>
     * The created at time of the image set provided for search.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp input for search.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The aggregated structure containing DICOM study date and study time for search.
     * </p>
     */
    private DICOMStudyDateAndTime dICOMStudyDateAndTime;

    /**
     * <p>
     * The patient ID input for search.
     * </p>
     * 
     * @param dICOMPatientId
     *        The patient ID input for search.
     */

    public void setDICOMPatientId(String dICOMPatientId) {
        this.dICOMPatientId = dICOMPatientId;
    }

    /**
     * <p>
     * The patient ID input for search.
     * </p>
     * 
     * @return The patient ID input for search.
     */

    public String getDICOMPatientId() {
        return this.dICOMPatientId;
    }

    /**
     * <p>
     * The patient ID input for search.
     * </p>
     * 
     * @param dICOMPatientId
     *        The patient ID input for search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchByAttributeValue withDICOMPatientId(String dICOMPatientId) {
        setDICOMPatientId(dICOMPatientId);
        return this;
    }

    /**
     * <p>
     * The DICOM accession number for search.
     * </p>
     * 
     * @param dICOMAccessionNumber
     *        The DICOM accession number for search.
     */

    public void setDICOMAccessionNumber(String dICOMAccessionNumber) {
        this.dICOMAccessionNumber = dICOMAccessionNumber;
    }

    /**
     * <p>
     * The DICOM accession number for search.
     * </p>
     * 
     * @return The DICOM accession number for search.
     */

    public String getDICOMAccessionNumber() {
        return this.dICOMAccessionNumber;
    }

    /**
     * <p>
     * The DICOM accession number for search.
     * </p>
     * 
     * @param dICOMAccessionNumber
     *        The DICOM accession number for search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchByAttributeValue withDICOMAccessionNumber(String dICOMAccessionNumber) {
        setDICOMAccessionNumber(dICOMAccessionNumber);
        return this;
    }

    /**
     * <p>
     * The DICOM study ID for search.
     * </p>
     * 
     * @param dICOMStudyId
     *        The DICOM study ID for search.
     */

    public void setDICOMStudyId(String dICOMStudyId) {
        this.dICOMStudyId = dICOMStudyId;
    }

    /**
     * <p>
     * The DICOM study ID for search.
     * </p>
     * 
     * @return The DICOM study ID for search.
     */

    public String getDICOMStudyId() {
        return this.dICOMStudyId;
    }

    /**
     * <p>
     * The DICOM study ID for search.
     * </p>
     * 
     * @param dICOMStudyId
     *        The DICOM study ID for search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchByAttributeValue withDICOMStudyId(String dICOMStudyId) {
        setDICOMStudyId(dICOMStudyId);
        return this;
    }

    /**
     * <p>
     * The DICOM study instance UID for search.
     * </p>
     * 
     * @param dICOMStudyInstanceUID
     *        The DICOM study instance UID for search.
     */

    public void setDICOMStudyInstanceUID(String dICOMStudyInstanceUID) {
        this.dICOMStudyInstanceUID = dICOMStudyInstanceUID;
    }

    /**
     * <p>
     * The DICOM study instance UID for search.
     * </p>
     * 
     * @return The DICOM study instance UID for search.
     */

    public String getDICOMStudyInstanceUID() {
        return this.dICOMStudyInstanceUID;
    }

    /**
     * <p>
     * The DICOM study instance UID for search.
     * </p>
     * 
     * @param dICOMStudyInstanceUID
     *        The DICOM study instance UID for search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchByAttributeValue withDICOMStudyInstanceUID(String dICOMStudyInstanceUID) {
        setDICOMStudyInstanceUID(dICOMStudyInstanceUID);
        return this;
    }

    /**
     * <p>
     * The Series Instance UID input for search.
     * </p>
     * 
     * @param dICOMSeriesInstanceUID
     *        The Series Instance UID input for search.
     */

    public void setDICOMSeriesInstanceUID(String dICOMSeriesInstanceUID) {
        this.dICOMSeriesInstanceUID = dICOMSeriesInstanceUID;
    }

    /**
     * <p>
     * The Series Instance UID input for search.
     * </p>
     * 
     * @return The Series Instance UID input for search.
     */

    public String getDICOMSeriesInstanceUID() {
        return this.dICOMSeriesInstanceUID;
    }

    /**
     * <p>
     * The Series Instance UID input for search.
     * </p>
     * 
     * @param dICOMSeriesInstanceUID
     *        The Series Instance UID input for search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchByAttributeValue withDICOMSeriesInstanceUID(String dICOMSeriesInstanceUID) {
        setDICOMSeriesInstanceUID(dICOMSeriesInstanceUID);
        return this;
    }

    /**
     * <p>
     * The created at time of the image set provided for search.
     * </p>
     * 
     * @param createdAt
     *        The created at time of the image set provided for search.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The created at time of the image set provided for search.
     * </p>
     * 
     * @return The created at time of the image set provided for search.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The created at time of the image set provided for search.
     * </p>
     * 
     * @param createdAt
     *        The created at time of the image set provided for search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchByAttributeValue withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp input for search.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp input for search.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp input for search.
     * </p>
     * 
     * @return The timestamp input for search.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp input for search.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp input for search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchByAttributeValue withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The aggregated structure containing DICOM study date and study time for search.
     * </p>
     * 
     * @param dICOMStudyDateAndTime
     *        The aggregated structure containing DICOM study date and study time for search.
     */

    public void setDICOMStudyDateAndTime(DICOMStudyDateAndTime dICOMStudyDateAndTime) {
        this.dICOMStudyDateAndTime = dICOMStudyDateAndTime;
    }

    /**
     * <p>
     * The aggregated structure containing DICOM study date and study time for search.
     * </p>
     * 
     * @return The aggregated structure containing DICOM study date and study time for search.
     */

    public DICOMStudyDateAndTime getDICOMStudyDateAndTime() {
        return this.dICOMStudyDateAndTime;
    }

    /**
     * <p>
     * The aggregated structure containing DICOM study date and study time for search.
     * </p>
     * 
     * @param dICOMStudyDateAndTime
     *        The aggregated structure containing DICOM study date and study time for search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchByAttributeValue withDICOMStudyDateAndTime(DICOMStudyDateAndTime dICOMStudyDateAndTime) {
        setDICOMStudyDateAndTime(dICOMStudyDateAndTime);
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
        if (getDICOMPatientId() != null)
            sb.append("DICOMPatientId: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMAccessionNumber() != null)
            sb.append("DICOMAccessionNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMStudyId() != null)
            sb.append("DICOMStudyId: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMStudyInstanceUID() != null)
            sb.append("DICOMStudyInstanceUID: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMSeriesInstanceUID() != null)
            sb.append("DICOMSeriesInstanceUID: ").append("***Sensitive Data Redacted***").append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getDICOMStudyDateAndTime() != null)
            sb.append("DICOMStudyDateAndTime: ").append(getDICOMStudyDateAndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchByAttributeValue == false)
            return false;
        SearchByAttributeValue other = (SearchByAttributeValue) obj;
        if (other.getDICOMPatientId() == null ^ this.getDICOMPatientId() == null)
            return false;
        if (other.getDICOMPatientId() != null && other.getDICOMPatientId().equals(this.getDICOMPatientId()) == false)
            return false;
        if (other.getDICOMAccessionNumber() == null ^ this.getDICOMAccessionNumber() == null)
            return false;
        if (other.getDICOMAccessionNumber() != null && other.getDICOMAccessionNumber().equals(this.getDICOMAccessionNumber()) == false)
            return false;
        if (other.getDICOMStudyId() == null ^ this.getDICOMStudyId() == null)
            return false;
        if (other.getDICOMStudyId() != null && other.getDICOMStudyId().equals(this.getDICOMStudyId()) == false)
            return false;
        if (other.getDICOMStudyInstanceUID() == null ^ this.getDICOMStudyInstanceUID() == null)
            return false;
        if (other.getDICOMStudyInstanceUID() != null && other.getDICOMStudyInstanceUID().equals(this.getDICOMStudyInstanceUID()) == false)
            return false;
        if (other.getDICOMSeriesInstanceUID() == null ^ this.getDICOMSeriesInstanceUID() == null)
            return false;
        if (other.getDICOMSeriesInstanceUID() != null && other.getDICOMSeriesInstanceUID().equals(this.getDICOMSeriesInstanceUID()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getDICOMStudyDateAndTime() == null ^ this.getDICOMStudyDateAndTime() == null)
            return false;
        if (other.getDICOMStudyDateAndTime() != null && other.getDICOMStudyDateAndTime().equals(this.getDICOMStudyDateAndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDICOMPatientId() == null) ? 0 : getDICOMPatientId().hashCode());
        hashCode = prime * hashCode + ((getDICOMAccessionNumber() == null) ? 0 : getDICOMAccessionNumber().hashCode());
        hashCode = prime * hashCode + ((getDICOMStudyId() == null) ? 0 : getDICOMStudyId().hashCode());
        hashCode = prime * hashCode + ((getDICOMStudyInstanceUID() == null) ? 0 : getDICOMStudyInstanceUID().hashCode());
        hashCode = prime * hashCode + ((getDICOMSeriesInstanceUID() == null) ? 0 : getDICOMSeriesInstanceUID().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getDICOMStudyDateAndTime() == null) ? 0 : getDICOMStudyDateAndTime().hashCode());
        return hashCode;
    }

    @Override
    public SearchByAttributeValue clone() {
        try {
            return (SearchByAttributeValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medicalimaging.model.transform.SearchByAttributeValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
