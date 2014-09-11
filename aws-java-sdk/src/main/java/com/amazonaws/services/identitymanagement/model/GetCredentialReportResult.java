/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the result of a successful invocation of the
 * GetCredentialReport action.
 * </p>
 */
public class GetCredentialReportResult implements Serializable {

    /**
     * Contains the credential report. The report is Base64-encoded.
     */
    private java.nio.ByteBuffer content;

    /**
     * The format (MIME type) of the credential report.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>text/csv
     */
    private String reportFormat;

    /**
     * The time and date when the credential report was created, in <a
     * href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>.
     */
    private java.util.Date generatedTime;

    /**
     * Contains the credential report. The report is Base64-encoded.
     *
     * @return Contains the credential report. The report is Base64-encoded.
     */
    public java.nio.ByteBuffer getContent() {
        return content;
    }
    
    /**
     * Contains the credential report. The report is Base64-encoded.
     *
     * @param content Contains the credential report. The report is Base64-encoded.
     */
    public void setContent(java.nio.ByteBuffer content) {
        this.content = content;
    }
    
    /**
     * Contains the credential report. The report is Base64-encoded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param content Contains the credential report. The report is Base64-encoded.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetCredentialReportResult withContent(java.nio.ByteBuffer content) {
        this.content = content;
        return this;
    }

    /**
     * The format (MIME type) of the credential report.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>text/csv
     *
     * @return The format (MIME type) of the credential report.
     *
     * @see ReportFormatType
     */
    public String getReportFormat() {
        return reportFormat;
    }
    
    /**
     * The format (MIME type) of the credential report.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>text/csv
     *
     * @param reportFormat The format (MIME type) of the credential report.
     *
     * @see ReportFormatType
     */
    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }
    
    /**
     * The format (MIME type) of the credential report.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>text/csv
     *
     * @param reportFormat The format (MIME type) of the credential report.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ReportFormatType
     */
    public GetCredentialReportResult withReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
        return this;
    }

    /**
     * The format (MIME type) of the credential report.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>text/csv
     *
     * @param reportFormat The format (MIME type) of the credential report.
     *
     * @see ReportFormatType
     */
    public void setReportFormat(ReportFormatType reportFormat) {
        this.reportFormat = reportFormat.toString();
    }
    
    /**
     * The format (MIME type) of the credential report.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>text/csv
     *
     * @param reportFormat The format (MIME type) of the credential report.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ReportFormatType
     */
    public GetCredentialReportResult withReportFormat(ReportFormatType reportFormat) {
        this.reportFormat = reportFormat.toString();
        return this;
    }

    /**
     * The time and date when the credential report was created, in <a
     * href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>.
     *
     * @return The time and date when the credential report was created, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>.
     */
    public java.util.Date getGeneratedTime() {
        return generatedTime;
    }
    
    /**
     * The time and date when the credential report was created, in <a
     * href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>.
     *
     * @param generatedTime The time and date when the credential report was created, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>.
     */
    public void setGeneratedTime(java.util.Date generatedTime) {
        this.generatedTime = generatedTime;
    }
    
    /**
     * The time and date when the credential report was created, in <a
     * href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param generatedTime The time and date when the credential report was created, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetCredentialReportResult withGeneratedTime(java.util.Date generatedTime) {
        this.generatedTime = generatedTime;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContent() != null) sb.append("Content: " + getContent() + ",");
        if (getReportFormat() != null) sb.append("ReportFormat: " + getReportFormat() + ",");
        if (getGeneratedTime() != null) sb.append("GeneratedTime: " + getGeneratedTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode()); 
        hashCode = prime * hashCode + ((getReportFormat() == null) ? 0 : getReportFormat().hashCode()); 
        hashCode = prime * hashCode + ((getGeneratedTime() == null) ? 0 : getGeneratedTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetCredentialReportResult == false) return false;
        GetCredentialReportResult other = (GetCredentialReportResult)obj;
        
        if (other.getContent() == null ^ this.getContent() == null) return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false) return false; 
        if (other.getReportFormat() == null ^ this.getReportFormat() == null) return false;
        if (other.getReportFormat() != null && other.getReportFormat().equals(this.getReportFormat()) == false) return false; 
        if (other.getGeneratedTime() == null ^ this.getGeneratedTime() == null) return false;
        if (other.getGeneratedTime() != null && other.getGeneratedTime().equals(this.getGeneratedTime()) == false) return false; 
        return true;
    }
    
}
    