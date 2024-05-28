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
 * The aggregated structure to store DICOM study date and study time for search capabilities.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/DICOMStudyDateAndTime"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DICOMStudyDateAndTime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The DICOM study date provided in <code>yyMMdd</code> format.
     * </p>
     */
    private String dICOMStudyDate;
    /**
     * <p>
     * The DICOM study time provided in <code>HHmmss.FFFFFF</code> format.
     * </p>
     */
    private String dICOMStudyTime;

    /**
     * <p>
     * The DICOM study date provided in <code>yyMMdd</code> format.
     * </p>
     * 
     * @param dICOMStudyDate
     *        The DICOM study date provided in <code>yyMMdd</code> format.
     */

    public void setDICOMStudyDate(String dICOMStudyDate) {
        this.dICOMStudyDate = dICOMStudyDate;
    }

    /**
     * <p>
     * The DICOM study date provided in <code>yyMMdd</code> format.
     * </p>
     * 
     * @return The DICOM study date provided in <code>yyMMdd</code> format.
     */

    public String getDICOMStudyDate() {
        return this.dICOMStudyDate;
    }

    /**
     * <p>
     * The DICOM study date provided in <code>yyMMdd</code> format.
     * </p>
     * 
     * @param dICOMStudyDate
     *        The DICOM study date provided in <code>yyMMdd</code> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMStudyDateAndTime withDICOMStudyDate(String dICOMStudyDate) {
        setDICOMStudyDate(dICOMStudyDate);
        return this;
    }

    /**
     * <p>
     * The DICOM study time provided in <code>HHmmss.FFFFFF</code> format.
     * </p>
     * 
     * @param dICOMStudyTime
     *        The DICOM study time provided in <code>HHmmss.FFFFFF</code> format.
     */

    public void setDICOMStudyTime(String dICOMStudyTime) {
        this.dICOMStudyTime = dICOMStudyTime;
    }

    /**
     * <p>
     * The DICOM study time provided in <code>HHmmss.FFFFFF</code> format.
     * </p>
     * 
     * @return The DICOM study time provided in <code>HHmmss.FFFFFF</code> format.
     */

    public String getDICOMStudyTime() {
        return this.dICOMStudyTime;
    }

    /**
     * <p>
     * The DICOM study time provided in <code>HHmmss.FFFFFF</code> format.
     * </p>
     * 
     * @param dICOMStudyTime
     *        The DICOM study time provided in <code>HHmmss.FFFFFF</code> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DICOMStudyDateAndTime withDICOMStudyTime(String dICOMStudyTime) {
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

        if (obj instanceof DICOMStudyDateAndTime == false)
            return false;
        DICOMStudyDateAndTime other = (DICOMStudyDateAndTime) obj;
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

        hashCode = prime * hashCode + ((getDICOMStudyDate() == null) ? 0 : getDICOMStudyDate().hashCode());
        hashCode = prime * hashCode + ((getDICOMStudyTime() == null) ? 0 : getDICOMStudyTime().hashCode());
        return hashCode;
    }

    @Override
    public DICOMStudyDateAndTime clone() {
        try {
            return (DICOMStudyDateAndTime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medicalimaging.model.transform.DICOMStudyDateAndTimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
