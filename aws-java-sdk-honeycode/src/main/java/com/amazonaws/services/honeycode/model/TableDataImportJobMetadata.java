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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata associated with the table data import job that was submitted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/TableDataImportJobMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableDataImportJobMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the submitter of the import request.
     * </p>
     */
    private ImportJobSubmitter submitter;
    /**
     * <p>
     * The timestamp when the job was submitted for import.
     * </p>
     */
    private java.util.Date submitTime;
    /**
     * <p>
     * The options that was specified at the time of submitting the import request.
     * </p>
     */
    private ImportOptions importOptions;
    /**
     * <p>
     * The source of the data that was submitted for import.
     * </p>
     */
    private ImportDataSource dataSource;

    /**
     * <p>
     * Details about the submitter of the import request.
     * </p>
     * 
     * @param submitter
     *        Details about the submitter of the import request.
     */

    public void setSubmitter(ImportJobSubmitter submitter) {
        this.submitter = submitter;
    }

    /**
     * <p>
     * Details about the submitter of the import request.
     * </p>
     * 
     * @return Details about the submitter of the import request.
     */

    public ImportJobSubmitter getSubmitter() {
        return this.submitter;
    }

    /**
     * <p>
     * Details about the submitter of the import request.
     * </p>
     * 
     * @param submitter
     *        Details about the submitter of the import request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDataImportJobMetadata withSubmitter(ImportJobSubmitter submitter) {
        setSubmitter(submitter);
        return this;
    }

    /**
     * <p>
     * The timestamp when the job was submitted for import.
     * </p>
     * 
     * @param submitTime
     *        The timestamp when the job was submitted for import.
     */

    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * <p>
     * The timestamp when the job was submitted for import.
     * </p>
     * 
     * @return The timestamp when the job was submitted for import.
     */

    public java.util.Date getSubmitTime() {
        return this.submitTime;
    }

    /**
     * <p>
     * The timestamp when the job was submitted for import.
     * </p>
     * 
     * @param submitTime
     *        The timestamp when the job was submitted for import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDataImportJobMetadata withSubmitTime(java.util.Date submitTime) {
        setSubmitTime(submitTime);
        return this;
    }

    /**
     * <p>
     * The options that was specified at the time of submitting the import request.
     * </p>
     * 
     * @param importOptions
     *        The options that was specified at the time of submitting the import request.
     */

    public void setImportOptions(ImportOptions importOptions) {
        this.importOptions = importOptions;
    }

    /**
     * <p>
     * The options that was specified at the time of submitting the import request.
     * </p>
     * 
     * @return The options that was specified at the time of submitting the import request.
     */

    public ImportOptions getImportOptions() {
        return this.importOptions;
    }

    /**
     * <p>
     * The options that was specified at the time of submitting the import request.
     * </p>
     * 
     * @param importOptions
     *        The options that was specified at the time of submitting the import request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDataImportJobMetadata withImportOptions(ImportOptions importOptions) {
        setImportOptions(importOptions);
        return this;
    }

    /**
     * <p>
     * The source of the data that was submitted for import.
     * </p>
     * 
     * @param dataSource
     *        The source of the data that was submitted for import.
     */

    public void setDataSource(ImportDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The source of the data that was submitted for import.
     * </p>
     * 
     * @return The source of the data that was submitted for import.
     */

    public ImportDataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The source of the data that was submitted for import.
     * </p>
     * 
     * @param dataSource
     *        The source of the data that was submitted for import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableDataImportJobMetadata withDataSource(ImportDataSource dataSource) {
        setDataSource(dataSource);
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
        if (getSubmitter() != null)
            sb.append("Submitter: ").append(getSubmitter()).append(",");
        if (getSubmitTime() != null)
            sb.append("SubmitTime: ").append(getSubmitTime()).append(",");
        if (getImportOptions() != null)
            sb.append("ImportOptions: ").append(getImportOptions()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableDataImportJobMetadata == false)
            return false;
        TableDataImportJobMetadata other = (TableDataImportJobMetadata) obj;
        if (other.getSubmitter() == null ^ this.getSubmitter() == null)
            return false;
        if (other.getSubmitter() != null && other.getSubmitter().equals(this.getSubmitter()) == false)
            return false;
        if (other.getSubmitTime() == null ^ this.getSubmitTime() == null)
            return false;
        if (other.getSubmitTime() != null && other.getSubmitTime().equals(this.getSubmitTime()) == false)
            return false;
        if (other.getImportOptions() == null ^ this.getImportOptions() == null)
            return false;
        if (other.getImportOptions() != null && other.getImportOptions().equals(this.getImportOptions()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubmitter() == null) ? 0 : getSubmitter().hashCode());
        hashCode = prime * hashCode + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        hashCode = prime * hashCode + ((getImportOptions() == null) ? 0 : getImportOptions().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        return hashCode;
    }

    @Override
    public TableDataImportJobMetadata clone() {
        try {
            return (TableDataImportJobMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.TableDataImportJobMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
