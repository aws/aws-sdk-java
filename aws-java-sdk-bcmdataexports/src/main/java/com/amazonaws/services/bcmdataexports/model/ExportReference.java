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
package com.amazonaws.services.bcmdataexports.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The reference details for a given export.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ExportReference" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this export.
     * </p>
     */
    private String exportArn;
    /**
     * <p>
     * The name of this specific data export.
     * </p>
     */
    private String exportName;
    /**
     * <p>
     * The status of this specific data export.
     * </p>
     */
    private ExportStatus exportStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this export.
     * </p>
     * 
     * @param exportArn
     *        The Amazon Resource Name (ARN) for this export.
     */

    public void setExportArn(String exportArn) {
        this.exportArn = exportArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this export.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for this export.
     */

    public String getExportArn() {
        return this.exportArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this export.
     * </p>
     * 
     * @param exportArn
     *        The Amazon Resource Name (ARN) for this export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportReference withExportArn(String exportArn) {
        setExportArn(exportArn);
        return this;
    }

    /**
     * <p>
     * The name of this specific data export.
     * </p>
     * 
     * @param exportName
     *        The name of this specific data export.
     */

    public void setExportName(String exportName) {
        this.exportName = exportName;
    }

    /**
     * <p>
     * The name of this specific data export.
     * </p>
     * 
     * @return The name of this specific data export.
     */

    public String getExportName() {
        return this.exportName;
    }

    /**
     * <p>
     * The name of this specific data export.
     * </p>
     * 
     * @param exportName
     *        The name of this specific data export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportReference withExportName(String exportName) {
        setExportName(exportName);
        return this;
    }

    /**
     * <p>
     * The status of this specific data export.
     * </p>
     * 
     * @param exportStatus
     *        The status of this specific data export.
     */

    public void setExportStatus(ExportStatus exportStatus) {
        this.exportStatus = exportStatus;
    }

    /**
     * <p>
     * The status of this specific data export.
     * </p>
     * 
     * @return The status of this specific data export.
     */

    public ExportStatus getExportStatus() {
        return this.exportStatus;
    }

    /**
     * <p>
     * The status of this specific data export.
     * </p>
     * 
     * @param exportStatus
     *        The status of this specific data export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportReference withExportStatus(ExportStatus exportStatus) {
        setExportStatus(exportStatus);
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
        if (getExportName() != null)
            sb.append("ExportName: ").append(getExportName()).append(",");
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

        if (obj instanceof ExportReference == false)
            return false;
        ExportReference other = (ExportReference) obj;
        if (other.getExportArn() == null ^ this.getExportArn() == null)
            return false;
        if (other.getExportArn() != null && other.getExportArn().equals(this.getExportArn()) == false)
            return false;
        if (other.getExportName() == null ^ this.getExportName() == null)
            return false;
        if (other.getExportName() != null && other.getExportName().equals(this.getExportName()) == false)
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
        hashCode = prime * hashCode + ((getExportName() == null) ? 0 : getExportName().hashCode());
        hashCode = prime * hashCode + ((getExportStatus() == null) ? 0 : getExportStatus().hashCode());
        return hashCode;
    }

    @Override
    public ExportReference clone() {
        try {
            return (ExportReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bcmdataexports.model.transform.ExportReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
