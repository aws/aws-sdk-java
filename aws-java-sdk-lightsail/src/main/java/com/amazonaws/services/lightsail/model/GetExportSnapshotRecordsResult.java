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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetExportSnapshotRecords" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExportSnapshotRecordsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects describing the export snapshot records.
     * </p>
     */
    private java.util.List<ExportSnapshotRecord> exportSnapshotRecords;
    /**
     * <p>
     * A token used for advancing to the next page of results of your get relational database bundles request.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * A list of objects describing the export snapshot records.
     * </p>
     * 
     * @return A list of objects describing the export snapshot records.
     */

    public java.util.List<ExportSnapshotRecord> getExportSnapshotRecords() {
        return exportSnapshotRecords;
    }

    /**
     * <p>
     * A list of objects describing the export snapshot records.
     * </p>
     * 
     * @param exportSnapshotRecords
     *        A list of objects describing the export snapshot records.
     */

    public void setExportSnapshotRecords(java.util.Collection<ExportSnapshotRecord> exportSnapshotRecords) {
        if (exportSnapshotRecords == null) {
            this.exportSnapshotRecords = null;
            return;
        }

        this.exportSnapshotRecords = new java.util.ArrayList<ExportSnapshotRecord>(exportSnapshotRecords);
    }

    /**
     * <p>
     * A list of objects describing the export snapshot records.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportSnapshotRecords(java.util.Collection)} or
     * {@link #withExportSnapshotRecords(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param exportSnapshotRecords
     *        A list of objects describing the export snapshot records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportSnapshotRecordsResult withExportSnapshotRecords(ExportSnapshotRecord... exportSnapshotRecords) {
        if (this.exportSnapshotRecords == null) {
            setExportSnapshotRecords(new java.util.ArrayList<ExportSnapshotRecord>(exportSnapshotRecords.length));
        }
        for (ExportSnapshotRecord ele : exportSnapshotRecords) {
            this.exportSnapshotRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects describing the export snapshot records.
     * </p>
     * 
     * @param exportSnapshotRecords
     *        A list of objects describing the export snapshot records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportSnapshotRecordsResult withExportSnapshotRecords(java.util.Collection<ExportSnapshotRecord> exportSnapshotRecords) {
        setExportSnapshotRecords(exportSnapshotRecords);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results of your get relational database bundles request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results of your get relational database bundles request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results of your get relational database bundles request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results of your get relational database bundles request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results of your get relational database bundles request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results of your get relational database bundles request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportSnapshotRecordsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getExportSnapshotRecords() != null)
            sb.append("ExportSnapshotRecords: ").append(getExportSnapshotRecords()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExportSnapshotRecordsResult == false)
            return false;
        GetExportSnapshotRecordsResult other = (GetExportSnapshotRecordsResult) obj;
        if (other.getExportSnapshotRecords() == null ^ this.getExportSnapshotRecords() == null)
            return false;
        if (other.getExportSnapshotRecords() != null && other.getExportSnapshotRecords().equals(this.getExportSnapshotRecords()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportSnapshotRecords() == null) ? 0 : getExportSnapshotRecords().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetExportSnapshotRecordsResult clone() {
        try {
            return (GetExportSnapshotRecordsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
