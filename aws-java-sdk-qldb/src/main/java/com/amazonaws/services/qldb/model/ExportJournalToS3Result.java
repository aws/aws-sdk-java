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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/ExportJournalToS3" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportJournalToS3Result extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID that QLDB assigns to each journal export job.
     * </p>
     * <p>
     * To describe your export request and check the status of the job, you can use <code>ExportId</code> to call
     * <code>DescribeJournalS3Export</code>.
     * </p>
     */
    private String exportId;

    /**
     * <p>
     * The unique ID that QLDB assigns to each journal export job.
     * </p>
     * <p>
     * To describe your export request and check the status of the job, you can use <code>ExportId</code> to call
     * <code>DescribeJournalS3Export</code>.
     * </p>
     * 
     * @param exportId
     *        The unique ID that QLDB assigns to each journal export job.</p>
     *        <p>
     *        To describe your export request and check the status of the job, you can use <code>ExportId</code> to call
     *        <code>DescribeJournalS3Export</code>.
     */

    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    /**
     * <p>
     * The unique ID that QLDB assigns to each journal export job.
     * </p>
     * <p>
     * To describe your export request and check the status of the job, you can use <code>ExportId</code> to call
     * <code>DescribeJournalS3Export</code>.
     * </p>
     * 
     * @return The unique ID that QLDB assigns to each journal export job.</p>
     *         <p>
     *         To describe your export request and check the status of the job, you can use <code>ExportId</code> to
     *         call <code>DescribeJournalS3Export</code>.
     */

    public String getExportId() {
        return this.exportId;
    }

    /**
     * <p>
     * The unique ID that QLDB assigns to each journal export job.
     * </p>
     * <p>
     * To describe your export request and check the status of the job, you can use <code>ExportId</code> to call
     * <code>DescribeJournalS3Export</code>.
     * </p>
     * 
     * @param exportId
     *        The unique ID that QLDB assigns to each journal export job.</p>
     *        <p>
     *        To describe your export request and check the status of the job, you can use <code>ExportId</code> to call
     *        <code>DescribeJournalS3Export</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportJournalToS3Result withExportId(String exportId) {
        setExportId(exportId);
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
        if (getExportId() != null)
            sb.append("ExportId: ").append(getExportId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportJournalToS3Result == false)
            return false;
        ExportJournalToS3Result other = (ExportJournalToS3Result) obj;
        if (other.getExportId() == null ^ this.getExportId() == null)
            return false;
        if (other.getExportId() != null && other.getExportId().equals(this.getExportId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportId() == null) ? 0 : getExportId().hashCode());
        return hashCode;
    }

    @Override
    public ExportJournalToS3Result clone() {
        try {
            return (ExportJournalToS3Result) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
