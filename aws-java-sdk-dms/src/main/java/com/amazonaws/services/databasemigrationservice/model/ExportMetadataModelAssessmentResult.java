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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ExportMetadataModelAssessment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportMetadataModelAssessmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon S3 details for an assessment exported in PDF format.
     * </p>
     */
    private ExportMetadataModelAssessmentResultEntry pdfReport;
    /**
     * <p>
     * The Amazon S3 details for an assessment exported in CSV format.
     * </p>
     */
    private ExportMetadataModelAssessmentResultEntry csvReport;

    /**
     * <p>
     * The Amazon S3 details for an assessment exported in PDF format.
     * </p>
     * 
     * @param pdfReport
     *        The Amazon S3 details for an assessment exported in PDF format.
     */

    public void setPdfReport(ExportMetadataModelAssessmentResultEntry pdfReport) {
        this.pdfReport = pdfReport;
    }

    /**
     * <p>
     * The Amazon S3 details for an assessment exported in PDF format.
     * </p>
     * 
     * @return The Amazon S3 details for an assessment exported in PDF format.
     */

    public ExportMetadataModelAssessmentResultEntry getPdfReport() {
        return this.pdfReport;
    }

    /**
     * <p>
     * The Amazon S3 details for an assessment exported in PDF format.
     * </p>
     * 
     * @param pdfReport
     *        The Amazon S3 details for an assessment exported in PDF format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportMetadataModelAssessmentResult withPdfReport(ExportMetadataModelAssessmentResultEntry pdfReport) {
        setPdfReport(pdfReport);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 details for an assessment exported in CSV format.
     * </p>
     * 
     * @param csvReport
     *        The Amazon S3 details for an assessment exported in CSV format.
     */

    public void setCsvReport(ExportMetadataModelAssessmentResultEntry csvReport) {
        this.csvReport = csvReport;
    }

    /**
     * <p>
     * The Amazon S3 details for an assessment exported in CSV format.
     * </p>
     * 
     * @return The Amazon S3 details for an assessment exported in CSV format.
     */

    public ExportMetadataModelAssessmentResultEntry getCsvReport() {
        return this.csvReport;
    }

    /**
     * <p>
     * The Amazon S3 details for an assessment exported in CSV format.
     * </p>
     * 
     * @param csvReport
     *        The Amazon S3 details for an assessment exported in CSV format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportMetadataModelAssessmentResult withCsvReport(ExportMetadataModelAssessmentResultEntry csvReport) {
        setCsvReport(csvReport);
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
        if (getPdfReport() != null)
            sb.append("PdfReport: ").append(getPdfReport()).append(",");
        if (getCsvReport() != null)
            sb.append("CsvReport: ").append(getCsvReport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportMetadataModelAssessmentResult == false)
            return false;
        ExportMetadataModelAssessmentResult other = (ExportMetadataModelAssessmentResult) obj;
        if (other.getPdfReport() == null ^ this.getPdfReport() == null)
            return false;
        if (other.getPdfReport() != null && other.getPdfReport().equals(this.getPdfReport()) == false)
            return false;
        if (other.getCsvReport() == null ^ this.getCsvReport() == null)
            return false;
        if (other.getCsvReport() != null && other.getCsvReport().equals(this.getCsvReport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPdfReport() == null) ? 0 : getPdfReport().hashCode());
        hashCode = prime * hashCode + ((getCsvReport() == null) ? 0 : getCsvReport().hashCode());
        return hashCode;
    }

    @Override
    public ExportMetadataModelAssessmentResult clone() {
        try {
            return (ExportMetadataModelAssessmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
