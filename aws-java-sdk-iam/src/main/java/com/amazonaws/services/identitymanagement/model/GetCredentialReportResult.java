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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a successful <a>GetCredentialReport</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetCredentialReport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCredentialReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the credential report. The report is Base64-encoded.
     * </p>
     */
    private java.nio.ByteBuffer content;
    /**
     * <p>
     * The format (MIME type) of the credential report.
     * </p>
     */
    private String reportFormat;
    /**
     * <p>
     * The date and time when the credential report was created, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>.
     * </p>
     */
    private java.util.Date generatedTime;

    /**
     * <p>
     * Contains the credential report. The report is Base64-encoded.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param content
     *        Contains the credential report. The report is Base64-encoded.
     */

    public void setContent(java.nio.ByteBuffer content) {
        this.content = content;
    }

    /**
     * <p>
     * Contains the credential report. The report is Base64-encoded.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Contains the credential report. The report is Base64-encoded.
     */

    public java.nio.ByteBuffer getContent() {
        return this.content;
    }

    /**
     * <p>
     * Contains the credential report. The report is Base64-encoded.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param content
     *        Contains the credential report. The report is Base64-encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCredentialReportResult withContent(java.nio.ByteBuffer content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The format (MIME type) of the credential report.
     * </p>
     * 
     * @param reportFormat
     *        The format (MIME type) of the credential report.
     * @see ReportFormatType
     */

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    /**
     * <p>
     * The format (MIME type) of the credential report.
     * </p>
     * 
     * @return The format (MIME type) of the credential report.
     * @see ReportFormatType
     */

    public String getReportFormat() {
        return this.reportFormat;
    }

    /**
     * <p>
     * The format (MIME type) of the credential report.
     * </p>
     * 
     * @param reportFormat
     *        The format (MIME type) of the credential report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFormatType
     */

    public GetCredentialReportResult withReportFormat(String reportFormat) {
        setReportFormat(reportFormat);
        return this;
    }

    /**
     * <p>
     * The format (MIME type) of the credential report.
     * </p>
     * 
     * @param reportFormat
     *        The format (MIME type) of the credential report.
     * @see ReportFormatType
     */

    public void setReportFormat(ReportFormatType reportFormat) {
        withReportFormat(reportFormat);
    }

    /**
     * <p>
     * The format (MIME type) of the credential report.
     * </p>
     * 
     * @param reportFormat
     *        The format (MIME type) of the credential report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFormatType
     */

    public GetCredentialReportResult withReportFormat(ReportFormatType reportFormat) {
        this.reportFormat = reportFormat.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the credential report was created, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>.
     * </p>
     * 
     * @param generatedTime
     *        The date and time when the credential report was created, in <a href="http://www.iso.org/iso/iso8601">ISO
     *        8601 date-time format</a>.
     */

    public void setGeneratedTime(java.util.Date generatedTime) {
        this.generatedTime = generatedTime;
    }

    /**
     * <p>
     * The date and time when the credential report was created, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>.
     * </p>
     * 
     * @return The date and time when the credential report was created, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>.
     */

    public java.util.Date getGeneratedTime() {
        return this.generatedTime;
    }

    /**
     * <p>
     * The date and time when the credential report was created, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>.
     * </p>
     * 
     * @param generatedTime
     *        The date and time when the credential report was created, in <a href="http://www.iso.org/iso/iso8601">ISO
     *        8601 date-time format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCredentialReportResult withGeneratedTime(java.util.Date generatedTime) {
        setGeneratedTime(generatedTime);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getReportFormat() != null)
            sb.append("ReportFormat: ").append(getReportFormat()).append(",");
        if (getGeneratedTime() != null)
            sb.append("GeneratedTime: ").append(getGeneratedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCredentialReportResult == false)
            return false;
        GetCredentialReportResult other = (GetCredentialReportResult) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getReportFormat() == null ^ this.getReportFormat() == null)
            return false;
        if (other.getReportFormat() != null && other.getReportFormat().equals(this.getReportFormat()) == false)
            return false;
        if (other.getGeneratedTime() == null ^ this.getGeneratedTime() == null)
            return false;
        if (other.getGeneratedTime() != null && other.getGeneratedTime().equals(this.getGeneratedTime()) == false)
            return false;
        return true;
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
    public GetCredentialReportResult clone() {
        try {
            return (GetCredentialReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
