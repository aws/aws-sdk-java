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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the information for the snapshot that you want to generate. This information is provided by
 * you when you start a new snapshot job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SnapshotFile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotFile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of <code>SnapshotFileSheetSelection</code> objects that contain information on the dashboard sheet that is
     * exported. These objects provide information about the snapshot artifacts that are generated during the job. This
     * structure can hold a maximum of 5 CSV configurations, 5 Excel configurations, or 1 configuration for PDF.
     * </p>
     */
    private java.util.List<SnapshotFileSheetSelection> sheetSelections;
    /**
     * <p>
     * The format of the snapshot file to be generated. You can choose between <code>CSV</code>, <code>Excel</code>, or
     * <code>PDF</code>.
     * </p>
     */
    private String formatType;

    /**
     * <p>
     * A list of <code>SnapshotFileSheetSelection</code> objects that contain information on the dashboard sheet that is
     * exported. These objects provide information about the snapshot artifacts that are generated during the job. This
     * structure can hold a maximum of 5 CSV configurations, 5 Excel configurations, or 1 configuration for PDF.
     * </p>
     * 
     * @return A list of <code>SnapshotFileSheetSelection</code> objects that contain information on the dashboard sheet
     *         that is exported. These objects provide information about the snapshot artifacts that are generated
     *         during the job. This structure can hold a maximum of 5 CSV configurations, 5 Excel configurations, or 1
     *         configuration for PDF.
     */

    public java.util.List<SnapshotFileSheetSelection> getSheetSelections() {
        return sheetSelections;
    }

    /**
     * <p>
     * A list of <code>SnapshotFileSheetSelection</code> objects that contain information on the dashboard sheet that is
     * exported. These objects provide information about the snapshot artifacts that are generated during the job. This
     * structure can hold a maximum of 5 CSV configurations, 5 Excel configurations, or 1 configuration for PDF.
     * </p>
     * 
     * @param sheetSelections
     *        A list of <code>SnapshotFileSheetSelection</code> objects that contain information on the dashboard sheet
     *        that is exported. These objects provide information about the snapshot artifacts that are generated during
     *        the job. This structure can hold a maximum of 5 CSV configurations, 5 Excel configurations, or 1
     *        configuration for PDF.
     */

    public void setSheetSelections(java.util.Collection<SnapshotFileSheetSelection> sheetSelections) {
        if (sheetSelections == null) {
            this.sheetSelections = null;
            return;
        }

        this.sheetSelections = new java.util.ArrayList<SnapshotFileSheetSelection>(sheetSelections);
    }

    /**
     * <p>
     * A list of <code>SnapshotFileSheetSelection</code> objects that contain information on the dashboard sheet that is
     * exported. These objects provide information about the snapshot artifacts that are generated during the job. This
     * structure can hold a maximum of 5 CSV configurations, 5 Excel configurations, or 1 configuration for PDF.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSheetSelections(java.util.Collection)} or {@link #withSheetSelections(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sheetSelections
     *        A list of <code>SnapshotFileSheetSelection</code> objects that contain information on the dashboard sheet
     *        that is exported. These objects provide information about the snapshot artifacts that are generated during
     *        the job. This structure can hold a maximum of 5 CSV configurations, 5 Excel configurations, or 1
     *        configuration for PDF.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotFile withSheetSelections(SnapshotFileSheetSelection... sheetSelections) {
        if (this.sheetSelections == null) {
            setSheetSelections(new java.util.ArrayList<SnapshotFileSheetSelection>(sheetSelections.length));
        }
        for (SnapshotFileSheetSelection ele : sheetSelections) {
            this.sheetSelections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>SnapshotFileSheetSelection</code> objects that contain information on the dashboard sheet that is
     * exported. These objects provide information about the snapshot artifacts that are generated during the job. This
     * structure can hold a maximum of 5 CSV configurations, 5 Excel configurations, or 1 configuration for PDF.
     * </p>
     * 
     * @param sheetSelections
     *        A list of <code>SnapshotFileSheetSelection</code> objects that contain information on the dashboard sheet
     *        that is exported. These objects provide information about the snapshot artifacts that are generated during
     *        the job. This structure can hold a maximum of 5 CSV configurations, 5 Excel configurations, or 1
     *        configuration for PDF.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotFile withSheetSelections(java.util.Collection<SnapshotFileSheetSelection> sheetSelections) {
        setSheetSelections(sheetSelections);
        return this;
    }

    /**
     * <p>
     * The format of the snapshot file to be generated. You can choose between <code>CSV</code>, <code>Excel</code>, or
     * <code>PDF</code>.
     * </p>
     * 
     * @param formatType
     *        The format of the snapshot file to be generated. You can choose between <code>CSV</code>,
     *        <code>Excel</code>, or <code>PDF</code>.
     * @see SnapshotFileFormatType
     */

    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }

    /**
     * <p>
     * The format of the snapshot file to be generated. You can choose between <code>CSV</code>, <code>Excel</code>, or
     * <code>PDF</code>.
     * </p>
     * 
     * @return The format of the snapshot file to be generated. You can choose between <code>CSV</code>,
     *         <code>Excel</code>, or <code>PDF</code>.
     * @see SnapshotFileFormatType
     */

    public String getFormatType() {
        return this.formatType;
    }

    /**
     * <p>
     * The format of the snapshot file to be generated. You can choose between <code>CSV</code>, <code>Excel</code>, or
     * <code>PDF</code>.
     * </p>
     * 
     * @param formatType
     *        The format of the snapshot file to be generated. You can choose between <code>CSV</code>,
     *        <code>Excel</code>, or <code>PDF</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotFileFormatType
     */

    public SnapshotFile withFormatType(String formatType) {
        setFormatType(formatType);
        return this;
    }

    /**
     * <p>
     * The format of the snapshot file to be generated. You can choose between <code>CSV</code>, <code>Excel</code>, or
     * <code>PDF</code>.
     * </p>
     * 
     * @param formatType
     *        The format of the snapshot file to be generated. You can choose between <code>CSV</code>,
     *        <code>Excel</code>, or <code>PDF</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotFileFormatType
     */

    public SnapshotFile withFormatType(SnapshotFileFormatType formatType) {
        this.formatType = formatType.toString();
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
        if (getSheetSelections() != null)
            sb.append("SheetSelections: ").append(getSheetSelections()).append(",");
        if (getFormatType() != null)
            sb.append("FormatType: ").append(getFormatType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotFile == false)
            return false;
        SnapshotFile other = (SnapshotFile) obj;
        if (other.getSheetSelections() == null ^ this.getSheetSelections() == null)
            return false;
        if (other.getSheetSelections() != null && other.getSheetSelections().equals(this.getSheetSelections()) == false)
            return false;
        if (other.getFormatType() == null ^ this.getFormatType() == null)
            return false;
        if (other.getFormatType() != null && other.getFormatType().equals(this.getFormatType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSheetSelections() == null) ? 0 : getSheetSelections().hashCode());
        hashCode = prime * hashCode + ((getFormatType() == null) ? 0 : getFormatType().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotFile clone() {
        try {
            return (SnapshotFile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SnapshotFileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
