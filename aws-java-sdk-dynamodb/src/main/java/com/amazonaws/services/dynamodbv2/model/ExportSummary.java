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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about an export task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ExportSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export.
     * </p>
     */
    private String exportArn;
    /**
     * <p>
     * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * </p>
     */
    private String exportStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export.
     * </p>
     * 
     * @param exportArn
     *        The Amazon Resource Name (ARN) of the export.
     */

    public void setExportArn(String exportArn) {
        this.exportArn = exportArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the export.
     */

    public String getExportArn() {
        return this.exportArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the export.
     * </p>
     * 
     * @param exportArn
     *        The Amazon Resource Name (ARN) of the export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSummary withExportArn(String exportArn) {
        setExportArn(exportArn);
        return this;
    }

    /**
     * <p>
     * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * </p>
     * 
     * @param exportStatus
     *        Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * @see ExportStatus
     */

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    /**
     * <p>
     * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * </p>
     * 
     * @return Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * @see ExportStatus
     */

    public String getExportStatus() {
        return this.exportStatus;
    }

    /**
     * <p>
     * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * </p>
     * 
     * @param exportStatus
     *        Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public ExportSummary withExportStatus(String exportStatus) {
        setExportStatus(exportStatus);
        return this;
    }

    /**
     * <p>
     * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * </p>
     * 
     * @param exportStatus
     *        Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public ExportSummary withExportStatus(ExportStatus exportStatus) {
        this.exportStatus = exportStatus.toString();
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
        if (getExportArn() != null)
            sb.append("ExportArn: ").append(getExportArn()).append(",");
        if (getExportStatus() != null)
            sb.append("ExportStatus: ").append(getExportStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportSummary == false)
            return false;
        ExportSummary other = (ExportSummary) obj;
        if (other.getExportArn() == null ^ this.getExportArn() == null)
            return false;
        if (other.getExportArn() != null && other.getExportArn().equals(this.getExportArn()) == false)
            return false;
        if (other.getExportStatus() == null ^ this.getExportStatus() == null)
            return false;
        if (other.getExportStatus() != null && other.getExportStatus().equals(this.getExportStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportArn() == null) ? 0 : getExportArn().hashCode());
        hashCode = prime * hashCode + ((getExportStatus() == null) ? 0 : getExportStatus().hashCode());
        return hashCode;
    }

    @Override
    public ExportSummary clone() {
        try {
            return (ExportSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ExportSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
