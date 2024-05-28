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
 * The DICOM attributes returned as a part of a response. Each image set has these properties as part of a search
 * result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/DICOMTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DICOMTags implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for a patient in a DICOM Study.
     * </p>
     */
    private String dICOMPatientId;
    /**
     * <p>
     * The patient name.
     * </p>
     */
    private String dICOMPatientName;
    /**
     * <p>
     * The patient birth date.
     * </p>
     */
    private String dICOMPatientBirthDate;
    /**
     * <p>
     * The patient sex.
     * </p>
     */
    private String dICOMPatientSex;
    /**
     * <p>
     * The DICOM provided identifier for the Study Instance UID.
     * </p>
     */
    private String dICOMStudyInstanceUID;
    /**
     * <p>
     * The DICOM provided identifier for the Study ID.
     * </p>
     */
    private String dICOMStudyId;
    /**
     * <p>
     * The DICOM provided Study Description.
     * </p>
     */
    private String dICOMStudyDescription;
    /**
     * <p>
     * The total number of series in the DICOM study.
     * </p>
     */
    private Integer dICOMNumberOfStudyRelatedSeries;
    /**
     * <p>
     * The total number of instances in the DICOM study.
     * </p>
     */
    private Integer dICOMNumberOfStudyRelatedInstances;
    /**
     * <p>
     * The accession number for the DICOM study.
     * </p>
     */
    private String dICOMAccessionNumber;
    /**
     * <p>
     * The DICOM provided identifier for the Series Instance UID.
     * </p>
     */
    private String dICOMSeriesInstanceUID;
    /**
     * <p>
     * The DICOM provided identifier for the series Modality.
     * </p>
     */
    private String dICOMSeriesModality;
    /**
     * <p>
     * The DICOM provided identifier for the series Body Part Examined.
     * </p>
     */
    private String dICOMSeriesBodyPart;
    /**
     * <p>
     * The DICOM provided identifier for the Series Number.
     * </p>
     */
    private Integer dICOMSeriesNumber;
    /**
     * <p>
     * The study date.
     * </p>
     */
    private String dICOMStudyDate;
    /**
     * <p>
     * The study time.
     * </p>
     */
    private String dICOMStudyTime;

    /**
     * <p>
     * The unique identifier for a patient in a DICOM Study.
     * </p>
     * 
     * @param dICOMPatientId
     *        The unique identifier for a patient in a DICOM Study.
     */

    public void setDICOMPatientId(String dICOMPatientId) {
        this.dICOMPatientId = dICOMPatientId;
    }

    /**
     * <p>
     * The unique identifier for a patient in a DICOM Study.
     * </p>
     * 
     * @return The unique identifier for a patient in a DICOM Study.
     */

    public String getDICOMPatientId() {
        return this.dICOMPatientId;
    }

    /**
     * <p>
     * The unique identifier for a patient in a DICOM Study.
     * </p>
     * 
     * @param dICOMPatientId
     *        The unique identifier for a patient in a DICOM Study.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMPatientId(String dICOMPatientId) {
        setDICOMPatientId(dICOMPatientId);
        return this;
    }

    /**
     * <p>
     * The patient name.
     * </p>
     * 
     * @param dICOMPatientName
     *        The patient name.
     */

    public void setDICOMPatientName(String dICOMPatientName) {
        this.dICOMPatientName = dICOMPatientName;
    }

    /**
     * <p>
     * The patient name.
     * </p>
     * 
     * @return The patient name.
     */

    public String getDICOMPatientName() {
        return this.dICOMPatientName;
    }

    /**
     * <p>
     * The patient name.
     * </p>
     * 
     * @param dICOMPatientName
     *        The patient name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMPatientName(String dICOMPatientName) {
        setDICOMPatientName(dICOMPatientName);
        return this;
    }

    /**
     * <p>
     * The patient birth date.
     * </p>
     * 
     * @param dICOMPatientBirthDate
     *        The patient birth date.
     */

    public void setDICOMPatientBirthDate(String dICOMPatientBirthDate) {
        this.dICOMPatientBirthDate = dICOMPatientBirthDate;
    }

    /**
     * <p>
     * The patient birth date.
     * </p>
     * 
     * @return The patient birth date.
     */

    public String getDICOMPatientBirthDate() {
        return this.dICOMPatientBirthDate;
    }

    /**
     * <p>
     * The patient birth date.
     * </p>
     * 
     * @param dICOMPatientBirthDate
     *        The patient birth date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMPatientBirthDate(String dICOMPatientBirthDate) {
        setDICOMPatientBirthDate(dICOMPatientBirthDate);
        return this;
    }

    /**
     * <p>
     * The patient sex.
     * </p>
     * 
     * @param dICOMPatientSex
     *        The patient sex.
     */

    public void setDICOMPatientSex(String dICOMPatientSex) {
        this.dICOMPatientSex = dICOMPatientSex;
    }

    /**
     * <p>
     * The patient sex.
     * </p>
     * 
     * @return The patient sex.
     */

    public String getDICOMPatientSex() {
        return this.dICOMPatientSex;
    }

    /**
     * <p>
     * The patient sex.
     * </p>
     * 
     * @param dICOMPatientSex
     *        The patient sex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMPatientSex(String dICOMPatientSex) {
        setDICOMPatientSex(dICOMPatientSex);
        return this;
    }

    /**
     * <p>
     * The DICOM provided identifier for the Study Instance UID.
     * </p>
     * 
     * @param dICOMStudyInstanceUID
     *        The DICOM provided identifier for the Study Instance UID.
     */

    public void setDICOMStudyInstanceUID(String dICOMStudyInstanceUID) {
        this.dICOMStudyInstanceUID = dICOMStudyInstanceUID;
    }

    /**
     * <p>
     * The DICOM provided identifier for the Study Instance UID.
     * </p>
     * 
     * @return The DICOM provided identifier for the Study Instance UID.
     */

    public String getDICOMStudyInstanceUID() {
        return this.dICOMStudyInstanceUID;
    }

    /**
     * <p>
     * The DICOM provided identifier for the Study Instance UID.
     * </p>
     * 
     * @param dICOMStudyInstanceUID
     *        The DICOM provided identifier for the Study Instance UID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMStudyInstanceUID(String dICOMStudyInstanceUID) {
        setDICOMStudyInstanceUID(dICOMStudyInstanceUID);
        return this;
    }

    /**
     * <p>
     * The DICOM provided identifier for the Study ID.
     * </p>
     * 
     * @param dICOMStudyId
     *        The DICOM provided identifier for the Study ID.
     */

    public void setDICOMStudyId(String dICOMStudyId) {
        this.dICOMStudyId = dICOMStudyId;
    }

    /**
     * <p>
     * The DICOM provided identifier for the Study ID.
     * </p>
     * 
     * @return The DICOM provided identifier for the Study ID.
     */

    public String getDICOMStudyId() {
        return this.dICOMStudyId;
    }

    /**
     * <p>
     * The DICOM provided identifier for the Study ID.
     * </p>
     * 
     * @param dICOMStudyId
     *        The DICOM provided identifier for the Study ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMStudyId(String dICOMStudyId) {
        setDICOMStudyId(dICOMStudyId);
        return this;
    }

    /**
     * <p>
     * The DICOM provided Study Description.
     * </p>
     * 
     * @param dICOMStudyDescription
     *        The DICOM provided Study Description.
     */

    public void setDICOMStudyDescription(String dICOMStudyDescription) {
        this.dICOMStudyDescription = dICOMStudyDescription;
    }

    /**
     * <p>
     * The DICOM provided Study Description.
     * </p>
     * 
     * @return The DICOM provided Study Description.
     */

    public String getDICOMStudyDescription() {
        return this.dICOMStudyDescription;
    }

    /**
     * <p>
     * The DICOM provided Study Description.
     * </p>
     * 
     * @param dICOMStudyDescription
     *        The DICOM provided Study Description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMStudyDescription(String dICOMStudyDescription) {
        setDICOMStudyDescription(dICOMStudyDescription);
        return this;
    }

    /**
     * <p>
     * The total number of series in the DICOM study.
     * </p>
     * 
     * @param dICOMNumberOfStudyRelatedSeries
     *        The total number of series in the DICOM study.
     */

    public void setDICOMNumberOfStudyRelatedSeries(Integer dICOMNumberOfStudyRelatedSeries) {
        this.dICOMNumberOfStudyRelatedSeries = dICOMNumberOfStudyRelatedSeries;
    }

    /**
     * <p>
     * The total number of series in the DICOM study.
     * </p>
     * 
     * @return The total number of series in the DICOM study.
     */

    public Integer getDICOMNumberOfStudyRelatedSeries() {
        return this.dICOMNumberOfStudyRelatedSeries;
    }

    /**
     * <p>
     * The total number of series in the DICOM study.
     * </p>
     * 
     * @param dICOMNumberOfStudyRelatedSeries
     *        The total number of series in the DICOM study.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMNumberOfStudyRelatedSeries(Integer dICOMNumberOfStudyRelatedSeries) {
        setDICOMNumberOfStudyRelatedSeries(dICOMNumberOfStudyRelatedSeries);
        return this;
    }

    /**
     * <p>
     * The total number of instances in the DICOM study.
     * </p>
     * 
     * @param dICOMNumberOfStudyRelatedInstances
     *        The total number of instances in the DICOM study.
     */

    public void setDICOMNumberOfStudyRelatedInstances(Integer dICOMNumberOfStudyRelatedInstances) {
        this.dICOMNumberOfStudyRelatedInstances = dICOMNumberOfStudyRelatedInstances;
    }

    /**
     * <p>
     * The total number of instances in the DICOM study.
     * </p>
     * 
     * @return The total number of instances in the DICOM study.
     */

    public Integer getDICOMNumberOfStudyRelatedInstances() {
        return this.dICOMNumberOfStudyRelatedInstances;
    }

    /**
     * <p>
     * The total number of instances in the DICOM study.
     * </p>
     * 
     * @param dICOMNumberOfStudyRelatedInstances
     *        The total number of instances in the DICOM study.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMNumberOfStudyRelatedInstances(Integer dICOMNumberOfStudyRelatedInstances) {
        setDICOMNumberOfStudyRelatedInstances(dICOMNumberOfStudyRelatedInstances);
        return this;
    }

    /**
     * <p>
     * The accession number for the DICOM study.
     * </p>
     * 
     * @param dICOMAccessionNumber
     *        The accession number for the DICOM study.
     */

    public void setDICOMAccessionNumber(String dICOMAccessionNumber) {
        this.dICOMAccessionNumber = dICOMAccessionNumber;
    }

    /**
     * <p>
     * The accession number for the DICOM study.
     * </p>
     * 
     * @return The accession number for the DICOM study.
     */

    public String getDICOMAccessionNumber() {
        return this.dICOMAccessionNumber;
    }

    /**
     * <p>
     * The accession number for the DICOM study.
     * </p>
     * 
     * @param dICOMAccessionNumber
     *        The accession number for the DICOM study.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMAccessionNumber(String dICOMAccessionNumber) {
        setDICOMAccessionNumber(dICOMAccessionNumber);
        return this;
    }

    /**
     * <p>
     * The DICOM provided identifier for the Series Instance UID.
     * </p>
     * 
     * @param dICOMSeriesInstanceUID
     *        The DICOM provided identifier for the Series Instance UID.
     */

    public void setDICOMSeriesInstanceUID(String dICOMSeriesInstanceUID) {
        this.dICOMSeriesInstanceUID = dICOMSeriesInstanceUID;
    }

    /**
     * <p>
     * The DICOM provided identifier for the Series Instance UID.
     * </p>
     * 
     * @return The DICOM provided identifier for the Series Instance UID.
     */

    public String getDICOMSeriesInstanceUID() {
        return this.dICOMSeriesInstanceUID;
    }

    /**
     * <p>
     * The DICOM provided identifier for the Series Instance UID.
     * </p>
     * 
     * @param dICOMSeriesInstanceUID
     *        The DICOM provided identifier for the Series Instance UID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMSeriesInstanceUID(String dICOMSeriesInstanceUID) {
        setDICOMSeriesInstanceUID(dICOMSeriesInstanceUID);
        return this;
    }

    /**
     * <p>
     * The DICOM provided identifier for the series Modality.
     * </p>
     * 
     * @param dICOMSeriesModality
     *        The DICOM provided identifier for the series Modality.
     */

    public void setDICOMSeriesModality(String dICOMSeriesModality) {
        this.dICOMSeriesModality = dICOMSeriesModality;
    }

    /**
     * <p>
     * The DICOM provided identifier for the series Modality.
     * </p>
     * 
     * @return The DICOM provided identifier for the series Modality.
     */

    public String getDICOMSeriesModality() {
        return this.dICOMSeriesModality;
    }

    /**
     * <p>
     * The DICOM provided identifier for the series Modality.
     * </p>
     * 
     * @param dICOMSeriesModality
     *        The DICOM provided identifier for the series Modality.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMSeriesModality(String dICOMSeriesModality) {
        setDICOMSeriesModality(dICOMSeriesModality);
        return this;
    }

    /**
     * <p>
     * The DICOM provided identifier for the series Body Part Examined.
     * </p>
     * 
     * @param dICOMSeriesBodyPart
     *        The DICOM provided identifier for the series Body Part Examined.
     */

    public void setDICOMSeriesBodyPart(String dICOMSeriesBodyPart) {
        this.dICOMSeriesBodyPart = dICOMSeriesBodyPart;
    }

    /**
     * <p>
     * The DICOM provided identifier for the series Body Part Examined.
     * </p>
     * 
     * @return The DICOM provided identifier for the series Body Part Examined.
     */

    public String getDICOMSeriesBodyPart() {
        return this.dICOMSeriesBodyPart;
    }

    /**
     * <p>
     * The DICOM provided identifier for the series Body Part Examined.
     * </p>
     * 
     * @param dICOMSeriesBodyPart
     *        The DICOM provided identifier for the series Body Part Examined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMSeriesBodyPart(String dICOMSeriesBodyPart) {
        setDICOMSeriesBodyPart(dICOMSeriesBodyPart);
        return this;
    }

    /**
     * <p>
     * The DICOM provided identifier for the Series Number.
     * </p>
     * 
     * @param dICOMSeriesNumber
     *        The DICOM provided identifier for the Series Number.
     */

    public void setDICOMSeriesNumber(Integer dICOMSeriesNumber) {
        this.dICOMSeriesNumber = dICOMSeriesNumber;
    }

    /**
     * <p>
     * The DICOM provided identifier for the Series Number.
     * </p>
     * 
     * @return The DICOM provided identifier for the Series Number.
     */

    public Integer getDICOMSeriesNumber() {
        return this.dICOMSeriesNumber;
    }

    /**
     * <p>
     * The DICOM provided identifier for the Series Number.
     * </p>
     * 
     * @param dICOMSeriesNumber
     *        The DICOM provided identifier for the Series Number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMSeriesNumber(Integer dICOMSeriesNumber) {
        setDICOMSeriesNumber(dICOMSeriesNumber);
        return this;
    }

    /**
     * <p>
     * The study date.
     * </p>
     * 
     * @param dICOMStudyDate
     *        The study date.
     */

    public void setDICOMStudyDate(String dICOMStudyDate) {
        this.dICOMStudyDate = dICOMStudyDate;
    }

    /**
     * <p>
     * The study date.
     * </p>
     * 
     * @return The study date.
     */

    public String getDICOMStudyDate() {
        return this.dICOMStudyDate;
    }

    /**
     * <p>
     * The study date.
     * </p>
     * 
     * @param dICOMStudyDate
     *        The study date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMStudyDate(String dICOMStudyDate) {
        setDICOMStudyDate(dICOMStudyDate);
        return this;
    }

    /**
     * <p>
     * The study time.
     * </p>
     * 
     * @param dICOMStudyTime
     *        The study time.
     */

    public void setDICOMStudyTime(String dICOMStudyTime) {
        this.dICOMStudyTime = dICOMStudyTime;
    }

    /**
     * <p>
     * The study time.
     * </p>
     * 
     * @return The study time.
     */

    public String getDICOMStudyTime() {
        return this.dICOMStudyTime;
    }

    /**
     * <p>
     * The study time.
     * </p>
     * 
     * @param dICOMStudyTime
     *        The study time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMTags withDICOMStudyTime(String dICOMStudyTime) {
        setDICOMStudyTime(dICOMStudyTime);
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
        if (getDICOMPatientName() != null)
            sb.append("DICOMPatientName: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMPatientBirthDate() != null)
            sb.append("DICOMPatientBirthDate: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMPatientSex() != null)
            sb.append("DICOMPatientSex: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMStudyInstanceUID() != null)
            sb.append("DICOMStudyInstanceUID: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMStudyId() != null)
            sb.append("DICOMStudyId: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMStudyDescription() != null)
            sb.append("DICOMStudyDescription: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMNumberOfStudyRelatedSeries() != null)
            sb.append("DICOMNumberOfStudyRelatedSeries: ").append(getDICOMNumberOfStudyRelatedSeries()).append(",");
        if (getDICOMNumberOfStudyRelatedInstances() != null)
            sb.append("DICOMNumberOfStudyRelatedInstances: ").append(getDICOMNumberOfStudyRelatedInstances()).append(",");
        if (getDICOMAccessionNumber() != null)
            sb.append("DICOMAccessionNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMSeriesInstanceUID() != null)
            sb.append("DICOMSeriesInstanceUID: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMSeriesModality() != null)
            sb.append("DICOMSeriesModality: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMSeriesBodyPart() != null)
            sb.append("DICOMSeriesBodyPart: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMSeriesNumber() != null)
            sb.append("DICOMSeriesNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMStudyDate() != null)
            sb.append("DICOMStudyDate: ").append("***Sensitive Data Redacted***").append(",");
        if (getDICOMStudyTime() != null)
            sb.append("DICOMStudyTime: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DICOMTags == false)
            return false;
        DICOMTags other = (DICOMTags) obj;
        if (other.getDICOMPatientId() == null ^ this.getDICOMPatientId() == null)
            return false;
        if (other.getDICOMPatientId() != null && other.getDICOMPatientId().equals(this.getDICOMPatientId()) == false)
            return false;
        if (other.getDICOMPatientName() == null ^ this.getDICOMPatientName() == null)
            return false;
        if (other.getDICOMPatientName() != null && other.getDICOMPatientName().equals(this.getDICOMPatientName()) == false)
            return false;
        if (other.getDICOMPatientBirthDate() == null ^ this.getDICOMPatientBirthDate() == null)
            return false;
        if (other.getDICOMPatientBirthDate() != null && other.getDICOMPatientBirthDate().equals(this.getDICOMPatientBirthDate()) == false)
            return false;
        if (other.getDICOMPatientSex() == null ^ this.getDICOMPatientSex() == null)
            return false;
        if (other.getDICOMPatientSex() != null && other.getDICOMPatientSex().equals(this.getDICOMPatientSex()) == false)
            return false;
        if (other.getDICOMStudyInstanceUID() == null ^ this.getDICOMStudyInstanceUID() == null)
            return false;
        if (other.getDICOMStudyInstanceUID() != null && other.getDICOMStudyInstanceUID().equals(this.getDICOMStudyInstanceUID()) == false)
            return false;
        if (other.getDICOMStudyId() == null ^ this.getDICOMStudyId() == null)
            return false;
        if (other.getDICOMStudyId() != null && other.getDICOMStudyId().equals(this.getDICOMStudyId()) == false)
            return false;
        if (other.getDICOMStudyDescription() == null ^ this.getDICOMStudyDescription() == null)
            return false;
        if (other.getDICOMStudyDescription() != null && other.getDICOMStudyDescription().equals(this.getDICOMStudyDescription()) == false)
            return false;
        if (other.getDICOMNumberOfStudyRelatedSeries() == null ^ this.getDICOMNumberOfStudyRelatedSeries() == null)
            return false;
        if (other.getDICOMNumberOfStudyRelatedSeries() != null
                && other.getDICOMNumberOfStudyRelatedSeries().equals(this.getDICOMNumberOfStudyRelatedSeries()) == false)
            return false;
        if (other.getDICOMNumberOfStudyRelatedInstances() == null ^ this.getDICOMNumberOfStudyRelatedInstances() == null)
            return false;
        if (other.getDICOMNumberOfStudyRelatedInstances() != null
                && other.getDICOMNumberOfStudyRelatedInstances().equals(this.getDICOMNumberOfStudyRelatedInstances()) == false)
            return false;
        if (other.getDICOMAccessionNumber() == null ^ this.getDICOMAccessionNumber() == null)
            return false;
        if (other.getDICOMAccessionNumber() != null && other.getDICOMAccessionNumber().equals(this.getDICOMAccessionNumber()) == false)
            return false;
        if (other.getDICOMSeriesInstanceUID() == null ^ this.getDICOMSeriesInstanceUID() == null)
            return false;
        if (other.getDICOMSeriesInstanceUID() != null && other.getDICOMSeriesInstanceUID().equals(this.getDICOMSeriesInstanceUID()) == false)
            return false;
        if (other.getDICOMSeriesModality() == null ^ this.getDICOMSeriesModality() == null)
            return false;
        if (other.getDICOMSeriesModality() != null && other.getDICOMSeriesModality().equals(this.getDICOMSeriesModality()) == false)
            return false;
        if (other.getDICOMSeriesBodyPart() == null ^ this.getDICOMSeriesBodyPart() == null)
            return false;
        if (other.getDICOMSeriesBodyPart() != null && other.getDICOMSeriesBodyPart().equals(this.getDICOMSeriesBodyPart()) == false)
            return false;
        if (other.getDICOMSeriesNumber() == null ^ this.getDICOMSeriesNumber() == null)
            return false;
        if (other.getDICOMSeriesNumber() != null && other.getDICOMSeriesNumber().equals(this.getDICOMSeriesNumber()) == false)
            return false;
        if (other.getDICOMStudyDate() == null ^ this.getDICOMStudyDate() == null)
            return false;
        if (other.getDICOMStudyDate() != null && other.getDICOMStudyDate().equals(this.getDICOMStudyDate()) == false)
            return false;
        if (other.getDICOMStudyTime() == null ^ this.getDICOMStudyTime() == null)
            return false;
        if (other.getDICOMStudyTime() != null && other.getDICOMStudyTime().equals(this.getDICOMStudyTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDICOMPatientId() == null) ? 0 : getDICOMPatientId().hashCode());
        hashCode = prime * hashCode + ((getDICOMPatientName() == null) ? 0 : getDICOMPatientName().hashCode());
        hashCode = prime * hashCode + ((getDICOMPatientBirthDate() == null) ? 0 : getDICOMPatientBirthDate().hashCode());
        hashCode = prime * hashCode + ((getDICOMPatientSex() == null) ? 0 : getDICOMPatientSex().hashCode());
        hashCode = prime * hashCode + ((getDICOMStudyInstanceUID() == null) ? 0 : getDICOMStudyInstanceUID().hashCode());
        hashCode = prime * hashCode + ((getDICOMStudyId() == null) ? 0 : getDICOMStudyId().hashCode());
        hashCode = prime * hashCode + ((getDICOMStudyDescription() == null) ? 0 : getDICOMStudyDescription().hashCode());
        hashCode = prime * hashCode + ((getDICOMNumberOfStudyRelatedSeries() == null) ? 0 : getDICOMNumberOfStudyRelatedSeries().hashCode());
        hashCode = prime * hashCode + ((getDICOMNumberOfStudyRelatedInstances() == null) ? 0 : getDICOMNumberOfStudyRelatedInstances().hashCode());
        hashCode = prime * hashCode + ((getDICOMAccessionNumber() == null) ? 0 : getDICOMAccessionNumber().hashCode());
        hashCode = prime * hashCode + ((getDICOMSeriesInstanceUID() == null) ? 0 : getDICOMSeriesInstanceUID().hashCode());
        hashCode = prime * hashCode + ((getDICOMSeriesModality() == null) ? 0 : getDICOMSeriesModality().hashCode());
        hashCode = prime * hashCode + ((getDICOMSeriesBodyPart() == null) ? 0 : getDICOMSeriesBodyPart().hashCode());
        hashCode = prime * hashCode + ((getDICOMSeriesNumber() == null) ? 0 : getDICOMSeriesNumber().hashCode());
        hashCode = prime * hashCode + ((getDICOMStudyDate() == null) ? 0 : getDICOMStudyDate().hashCode());
        hashCode = prime * hashCode + ((getDICOMStudyTime() == null) ? 0 : getDICOMStudyTime().hashCode());
        return hashCode;
    }

    @Override
    public DICOMTags clone() {
        try {
            return (DICOMTags) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medicalimaging.model.transform.DICOMTagsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
