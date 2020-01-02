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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a report detailing the data repository task results of the files processed that match the criteria specified
 * in the report <code>Scope</code> parameter. FSx delivers the report to the file system's linked data repository in
 * Amazon S3, using the path specified in the report <code>Path</code> parameter. You can specify whether or not a
 * report gets generated for a task using the <code>Enabled</code> parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CompletionReport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompletionReport implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Set <code>Enabled</code> to <code>True</code> to generate a <code>CompletionReport</code> when the task
     * completes. If set to <code>true</code>, then you need to provide a report <code>Scope</code>, <code>Path</code>,
     * and <code>Format</code>. Set <code>Enabled</code> to <code>False</code> if you do not want a
     * <code>CompletionReport</code> generated when the task completes.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Required if <code>Enabled</code> is set to <code>true</code>. Specifies the location of the report on the file
     * system's linked S3 data repository. An absolute path that defines where the completion report will be stored in
     * the destination location. The <code>Path</code> you provide must be located within the file system’s ExportPath.
     * An example <code>Path</code> value is "s3://myBucket/myExportPath/optionalPrefix". The report provides the
     * following information for each file in the report: FilePath, FileStatus, and ErrorCode. To learn more about a
     * file system's <code>ExportPath</code>, see .
     * </p>
     */
    private String path;
    /**
     * <p>
     * Required if <code>Enabled</code> is set to <code>true</code>. Specifies the format of the
     * <code>CompletionReport</code>. <code>REPORT_CSV_20191124</code> is the only format currently supported. When
     * <code>Format</code> is set to <code>REPORT_CSV_20191124</code>, the <code>CompletionReport</code> is provided in
     * CSV format, and is delivered to <code>{path}/task-{id}/failures.csv</code>.
     * </p>
     */
    private String format;
    /**
     * <p>
     * Required if <code>Enabled</code> is set to <code>true</code>. Specifies the scope of the
     * <code>CompletionReport</code>; <code>FAILED_FILES_ONLY</code> is the only scope currently supported. When
     * <code>Scope</code> is set to <code>FAILED_FILES_ONLY</code>, the <code>CompletionReport</code> only contains
     * information about files that the data repository task failed to process.
     * </p>
     */
    private String scope;

    /**
     * <p>
     * Set <code>Enabled</code> to <code>True</code> to generate a <code>CompletionReport</code> when the task
     * completes. If set to <code>true</code>, then you need to provide a report <code>Scope</code>, <code>Path</code>,
     * and <code>Format</code>. Set <code>Enabled</code> to <code>False</code> if you do not want a
     * <code>CompletionReport</code> generated when the task completes.
     * </p>
     * 
     * @param enabled
     *        Set <code>Enabled</code> to <code>True</code> to generate a <code>CompletionReport</code> when the task
     *        completes. If set to <code>true</code>, then you need to provide a report <code>Scope</code>,
     *        <code>Path</code>, and <code>Format</code>. Set <code>Enabled</code> to <code>False</code> if you do not
     *        want a <code>CompletionReport</code> generated when the task completes.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Set <code>Enabled</code> to <code>True</code> to generate a <code>CompletionReport</code> when the task
     * completes. If set to <code>true</code>, then you need to provide a report <code>Scope</code>, <code>Path</code>,
     * and <code>Format</code>. Set <code>Enabled</code> to <code>False</code> if you do not want a
     * <code>CompletionReport</code> generated when the task completes.
     * </p>
     * 
     * @return Set <code>Enabled</code> to <code>True</code> to generate a <code>CompletionReport</code> when the task
     *         completes. If set to <code>true</code>, then you need to provide a report <code>Scope</code>,
     *         <code>Path</code>, and <code>Format</code>. Set <code>Enabled</code> to <code>False</code> if you do not
     *         want a <code>CompletionReport</code> generated when the task completes.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Set <code>Enabled</code> to <code>True</code> to generate a <code>CompletionReport</code> when the task
     * completes. If set to <code>true</code>, then you need to provide a report <code>Scope</code>, <code>Path</code>,
     * and <code>Format</code>. Set <code>Enabled</code> to <code>False</code> if you do not want a
     * <code>CompletionReport</code> generated when the task completes.
     * </p>
     * 
     * @param enabled
     *        Set <code>Enabled</code> to <code>True</code> to generate a <code>CompletionReport</code> when the task
     *        completes. If set to <code>true</code>, then you need to provide a report <code>Scope</code>,
     *        <code>Path</code>, and <code>Format</code>. Set <code>Enabled</code> to <code>False</code> if you do not
     *        want a <code>CompletionReport</code> generated when the task completes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompletionReport withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Set <code>Enabled</code> to <code>True</code> to generate a <code>CompletionReport</code> when the task
     * completes. If set to <code>true</code>, then you need to provide a report <code>Scope</code>, <code>Path</code>,
     * and <code>Format</code>. Set <code>Enabled</code> to <code>False</code> if you do not want a
     * <code>CompletionReport</code> generated when the task completes.
     * </p>
     * 
     * @return Set <code>Enabled</code> to <code>True</code> to generate a <code>CompletionReport</code> when the task
     *         completes. If set to <code>true</code>, then you need to provide a report <code>Scope</code>,
     *         <code>Path</code>, and <code>Format</code>. Set <code>Enabled</code> to <code>False</code> if you do not
     *         want a <code>CompletionReport</code> generated when the task completes.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Required if <code>Enabled</code> is set to <code>true</code>. Specifies the location of the report on the file
     * system's linked S3 data repository. An absolute path that defines where the completion report will be stored in
     * the destination location. The <code>Path</code> you provide must be located within the file system’s ExportPath.
     * An example <code>Path</code> value is "s3://myBucket/myExportPath/optionalPrefix". The report provides the
     * following information for each file in the report: FilePath, FileStatus, and ErrorCode. To learn more about a
     * file system's <code>ExportPath</code>, see .
     * </p>
     * 
     * @param path
     *        Required if <code>Enabled</code> is set to <code>true</code>. Specifies the location of the report on the
     *        file system's linked S3 data repository. An absolute path that defines where the completion report will be
     *        stored in the destination location. The <code>Path</code> you provide must be located within the file
     *        system’s ExportPath. An example <code>Path</code> value is "s3://myBucket/myExportPath/optionalPrefix".
     *        The report provides the following information for each file in the report: FilePath, FileStatus, and
     *        ErrorCode. To learn more about a file system's <code>ExportPath</code>, see .
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * Required if <code>Enabled</code> is set to <code>true</code>. Specifies the location of the report on the file
     * system's linked S3 data repository. An absolute path that defines where the completion report will be stored in
     * the destination location. The <code>Path</code> you provide must be located within the file system’s ExportPath.
     * An example <code>Path</code> value is "s3://myBucket/myExportPath/optionalPrefix". The report provides the
     * following information for each file in the report: FilePath, FileStatus, and ErrorCode. To learn more about a
     * file system's <code>ExportPath</code>, see .
     * </p>
     * 
     * @return Required if <code>Enabled</code> is set to <code>true</code>. Specifies the location of the report on the
     *         file system's linked S3 data repository. An absolute path that defines where the completion report will
     *         be stored in the destination location. The <code>Path</code> you provide must be located within the file
     *         system’s ExportPath. An example <code>Path</code> value is "s3://myBucket/myExportPath/optionalPrefix".
     *         The report provides the following information for each file in the report: FilePath, FileStatus, and
     *         ErrorCode. To learn more about a file system's <code>ExportPath</code>, see .
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * Required if <code>Enabled</code> is set to <code>true</code>. Specifies the location of the report on the file
     * system's linked S3 data repository. An absolute path that defines where the completion report will be stored in
     * the destination location. The <code>Path</code> you provide must be located within the file system’s ExportPath.
     * An example <code>Path</code> value is "s3://myBucket/myExportPath/optionalPrefix". The report provides the
     * following information for each file in the report: FilePath, FileStatus, and ErrorCode. To learn more about a
     * file system's <code>ExportPath</code>, see .
     * </p>
     * 
     * @param path
     *        Required if <code>Enabled</code> is set to <code>true</code>. Specifies the location of the report on the
     *        file system's linked S3 data repository. An absolute path that defines where the completion report will be
     *        stored in the destination location. The <code>Path</code> you provide must be located within the file
     *        system’s ExportPath. An example <code>Path</code> value is "s3://myBucket/myExportPath/optionalPrefix".
     *        The report provides the following information for each file in the report: FilePath, FileStatus, and
     *        ErrorCode. To learn more about a file system's <code>ExportPath</code>, see .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompletionReport withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * Required if <code>Enabled</code> is set to <code>true</code>. Specifies the format of the
     * <code>CompletionReport</code>. <code>REPORT_CSV_20191124</code> is the only format currently supported. When
     * <code>Format</code> is set to <code>REPORT_CSV_20191124</code>, the <code>CompletionReport</code> is provided in
     * CSV format, and is delivered to <code>{path}/task-{id}/failures.csv</code>.
     * </p>
     * 
     * @param format
     *        Required if <code>Enabled</code> is set to <code>true</code>. Specifies the format of the
     *        <code>CompletionReport</code>. <code>REPORT_CSV_20191124</code> is the only format currently supported.
     *        When <code>Format</code> is set to <code>REPORT_CSV_20191124</code>, the <code>CompletionReport</code> is
     *        provided in CSV format, and is delivered to <code>{path}/task-{id}/failures.csv</code>.
     * @see ReportFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * Required if <code>Enabled</code> is set to <code>true</code>. Specifies the format of the
     * <code>CompletionReport</code>. <code>REPORT_CSV_20191124</code> is the only format currently supported. When
     * <code>Format</code> is set to <code>REPORT_CSV_20191124</code>, the <code>CompletionReport</code> is provided in
     * CSV format, and is delivered to <code>{path}/task-{id}/failures.csv</code>.
     * </p>
     * 
     * @return Required if <code>Enabled</code> is set to <code>true</code>. Specifies the format of the
     *         <code>CompletionReport</code>. <code>REPORT_CSV_20191124</code> is the only format currently supported.
     *         When <code>Format</code> is set to <code>REPORT_CSV_20191124</code>, the <code>CompletionReport</code> is
     *         provided in CSV format, and is delivered to <code>{path}/task-{id}/failures.csv</code>.
     * @see ReportFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * Required if <code>Enabled</code> is set to <code>true</code>. Specifies the format of the
     * <code>CompletionReport</code>. <code>REPORT_CSV_20191124</code> is the only format currently supported. When
     * <code>Format</code> is set to <code>REPORT_CSV_20191124</code>, the <code>CompletionReport</code> is provided in
     * CSV format, and is delivered to <code>{path}/task-{id}/failures.csv</code>.
     * </p>
     * 
     * @param format
     *        Required if <code>Enabled</code> is set to <code>true</code>. Specifies the format of the
     *        <code>CompletionReport</code>. <code>REPORT_CSV_20191124</code> is the only format currently supported.
     *        When <code>Format</code> is set to <code>REPORT_CSV_20191124</code>, the <code>CompletionReport</code> is
     *        provided in CSV format, and is delivered to <code>{path}/task-{id}/failures.csv</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFormat
     */

    public CompletionReport withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * Required if <code>Enabled</code> is set to <code>true</code>. Specifies the format of the
     * <code>CompletionReport</code>. <code>REPORT_CSV_20191124</code> is the only format currently supported. When
     * <code>Format</code> is set to <code>REPORT_CSV_20191124</code>, the <code>CompletionReport</code> is provided in
     * CSV format, and is delivered to <code>{path}/task-{id}/failures.csv</code>.
     * </p>
     * 
     * @param format
     *        Required if <code>Enabled</code> is set to <code>true</code>. Specifies the format of the
     *        <code>CompletionReport</code>. <code>REPORT_CSV_20191124</code> is the only format currently supported.
     *        When <code>Format</code> is set to <code>REPORT_CSV_20191124</code>, the <code>CompletionReport</code> is
     *        provided in CSV format, and is delivered to <code>{path}/task-{id}/failures.csv</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportFormat
     */

    public CompletionReport withFormat(ReportFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * Required if <code>Enabled</code> is set to <code>true</code>. Specifies the scope of the
     * <code>CompletionReport</code>; <code>FAILED_FILES_ONLY</code> is the only scope currently supported. When
     * <code>Scope</code> is set to <code>FAILED_FILES_ONLY</code>, the <code>CompletionReport</code> only contains
     * information about files that the data repository task failed to process.
     * </p>
     * 
     * @param scope
     *        Required if <code>Enabled</code> is set to <code>true</code>. Specifies the scope of the
     *        <code>CompletionReport</code>; <code>FAILED_FILES_ONLY</code> is the only scope currently supported. When
     *        <code>Scope</code> is set to <code>FAILED_FILES_ONLY</code>, the <code>CompletionReport</code> only
     *        contains information about files that the data repository task failed to process.
     * @see ReportScope
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Required if <code>Enabled</code> is set to <code>true</code>. Specifies the scope of the
     * <code>CompletionReport</code>; <code>FAILED_FILES_ONLY</code> is the only scope currently supported. When
     * <code>Scope</code> is set to <code>FAILED_FILES_ONLY</code>, the <code>CompletionReport</code> only contains
     * information about files that the data repository task failed to process.
     * </p>
     * 
     * @return Required if <code>Enabled</code> is set to <code>true</code>. Specifies the scope of the
     *         <code>CompletionReport</code>; <code>FAILED_FILES_ONLY</code> is the only scope currently supported. When
     *         <code>Scope</code> is set to <code>FAILED_FILES_ONLY</code>, the <code>CompletionReport</code> only
     *         contains information about files that the data repository task failed to process.
     * @see ReportScope
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Required if <code>Enabled</code> is set to <code>true</code>. Specifies the scope of the
     * <code>CompletionReport</code>; <code>FAILED_FILES_ONLY</code> is the only scope currently supported. When
     * <code>Scope</code> is set to <code>FAILED_FILES_ONLY</code>, the <code>CompletionReport</code> only contains
     * information about files that the data repository task failed to process.
     * </p>
     * 
     * @param scope
     *        Required if <code>Enabled</code> is set to <code>true</code>. Specifies the scope of the
     *        <code>CompletionReport</code>; <code>FAILED_FILES_ONLY</code> is the only scope currently supported. When
     *        <code>Scope</code> is set to <code>FAILED_FILES_ONLY</code>, the <code>CompletionReport</code> only
     *        contains information about files that the data repository task failed to process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportScope
     */

    public CompletionReport withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Required if <code>Enabled</code> is set to <code>true</code>. Specifies the scope of the
     * <code>CompletionReport</code>; <code>FAILED_FILES_ONLY</code> is the only scope currently supported. When
     * <code>Scope</code> is set to <code>FAILED_FILES_ONLY</code>, the <code>CompletionReport</code> only contains
     * information about files that the data repository task failed to process.
     * </p>
     * 
     * @param scope
     *        Required if <code>Enabled</code> is set to <code>true</code>. Specifies the scope of the
     *        <code>CompletionReport</code>; <code>FAILED_FILES_ONLY</code> is the only scope currently supported. When
     *        <code>Scope</code> is set to <code>FAILED_FILES_ONLY</code>, the <code>CompletionReport</code> only
     *        contains information about files that the data repository task failed to process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportScope
     */

    public CompletionReport withScope(ReportScope scope) {
        this.scope = scope.toString();
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompletionReport == false)
            return false;
        CompletionReport other = (CompletionReport) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        return hashCode;
    }

    @Override
    public CompletionReport clone() {
        try {
            return (CompletionReport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.CompletionReportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
