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
 * A structure that contains information that identifies the snapshot that needs to be generated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SnapshotFileSheetSelection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotFileSheetSelection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sheet ID of the dashboard to generate the snapshot artifact from. This value is required for CSV, Excel, and
     * PDF format types.
     * </p>
     */
    private String sheetId;
    /**
     * <p>
     * The selection scope of the visuals on a sheet of a dashboard that you are generating a snapthot of. You can
     * choose one of the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VISUALS</code> - Selects all visuals that are on the sheet. This value is required if the snapshot is a
     * PDF.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SELECTED_VISUALS</code> - Select the visual that you want to add to the snapshot. This value is required if
     * the snapshot is a CSV or Excel workbook.
     * </p>
     * </li>
     * </ul>
     */
    private String selectionScope;
    /**
     * <p>
     * A structure that lists the IDs of the visuals in the selected sheet. Supported visual types are table, pivot
     * table visuals. This value is required if you are generating a CSV or Excel workbook. This value supports a
     * maximum of 1 visual ID for CSV and 5 visual IDs across up to 5 sheet selections for Excel. If you are generating
     * an Excel workbook, the order of the visual IDs provided in this structure determines the order of the worksheets
     * in the Excel file.
     * </p>
     */
    private java.util.List<String> visualIds;

    /**
     * <p>
     * The sheet ID of the dashboard to generate the snapshot artifact from. This value is required for CSV, Excel, and
     * PDF format types.
     * </p>
     * 
     * @param sheetId
     *        The sheet ID of the dashboard to generate the snapshot artifact from. This value is required for CSV,
     *        Excel, and PDF format types.
     */

    public void setSheetId(String sheetId) {
        this.sheetId = sheetId;
    }

    /**
     * <p>
     * The sheet ID of the dashboard to generate the snapshot artifact from. This value is required for CSV, Excel, and
     * PDF format types.
     * </p>
     * 
     * @return The sheet ID of the dashboard to generate the snapshot artifact from. This value is required for CSV,
     *         Excel, and PDF format types.
     */

    public String getSheetId() {
        return this.sheetId;
    }

    /**
     * <p>
     * The sheet ID of the dashboard to generate the snapshot artifact from. This value is required for CSV, Excel, and
     * PDF format types.
     * </p>
     * 
     * @param sheetId
     *        The sheet ID of the dashboard to generate the snapshot artifact from. This value is required for CSV,
     *        Excel, and PDF format types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotFileSheetSelection withSheetId(String sheetId) {
        setSheetId(sheetId);
        return this;
    }

    /**
     * <p>
     * The selection scope of the visuals on a sheet of a dashboard that you are generating a snapthot of. You can
     * choose one of the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VISUALS</code> - Selects all visuals that are on the sheet. This value is required if the snapshot is a
     * PDF.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SELECTED_VISUALS</code> - Select the visual that you want to add to the snapshot. This value is required if
     * the snapshot is a CSV or Excel workbook.
     * </p>
     * </li>
     * </ul>
     * 
     * @param selectionScope
     *        The selection scope of the visuals on a sheet of a dashboard that you are generating a snapthot of. You
     *        can choose one of the following options.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_VISUALS</code> - Selects all visuals that are on the sheet. This value is required if the
     *        snapshot is a PDF.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SELECTED_VISUALS</code> - Select the visual that you want to add to the snapshot. This value is
     *        required if the snapshot is a CSV or Excel workbook.
     *        </p>
     *        </li>
     * @see SnapshotFileSheetSelectionScope
     */

    public void setSelectionScope(String selectionScope) {
        this.selectionScope = selectionScope;
    }

    /**
     * <p>
     * The selection scope of the visuals on a sheet of a dashboard that you are generating a snapthot of. You can
     * choose one of the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VISUALS</code> - Selects all visuals that are on the sheet. This value is required if the snapshot is a
     * PDF.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SELECTED_VISUALS</code> - Select the visual that you want to add to the snapshot. This value is required if
     * the snapshot is a CSV or Excel workbook.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The selection scope of the visuals on a sheet of a dashboard that you are generating a snapthot of. You
     *         can choose one of the following options.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL_VISUALS</code> - Selects all visuals that are on the sheet. This value is required if the
     *         snapshot is a PDF.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SELECTED_VISUALS</code> - Select the visual that you want to add to the snapshot. This value is
     *         required if the snapshot is a CSV or Excel workbook.
     *         </p>
     *         </li>
     * @see SnapshotFileSheetSelectionScope
     */

    public String getSelectionScope() {
        return this.selectionScope;
    }

    /**
     * <p>
     * The selection scope of the visuals on a sheet of a dashboard that you are generating a snapthot of. You can
     * choose one of the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VISUALS</code> - Selects all visuals that are on the sheet. This value is required if the snapshot is a
     * PDF.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SELECTED_VISUALS</code> - Select the visual that you want to add to the snapshot. This value is required if
     * the snapshot is a CSV or Excel workbook.
     * </p>
     * </li>
     * </ul>
     * 
     * @param selectionScope
     *        The selection scope of the visuals on a sheet of a dashboard that you are generating a snapthot of. You
     *        can choose one of the following options.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_VISUALS</code> - Selects all visuals that are on the sheet. This value is required if the
     *        snapshot is a PDF.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SELECTED_VISUALS</code> - Select the visual that you want to add to the snapshot. This value is
     *        required if the snapshot is a CSV or Excel workbook.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotFileSheetSelectionScope
     */

    public SnapshotFileSheetSelection withSelectionScope(String selectionScope) {
        setSelectionScope(selectionScope);
        return this;
    }

    /**
     * <p>
     * The selection scope of the visuals on a sheet of a dashboard that you are generating a snapthot of. You can
     * choose one of the following options.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VISUALS</code> - Selects all visuals that are on the sheet. This value is required if the snapshot is a
     * PDF.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SELECTED_VISUALS</code> - Select the visual that you want to add to the snapshot. This value is required if
     * the snapshot is a CSV or Excel workbook.
     * </p>
     * </li>
     * </ul>
     * 
     * @param selectionScope
     *        The selection scope of the visuals on a sheet of a dashboard that you are generating a snapthot of. You
     *        can choose one of the following options.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_VISUALS</code> - Selects all visuals that are on the sheet. This value is required if the
     *        snapshot is a PDF.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SELECTED_VISUALS</code> - Select the visual that you want to add to the snapshot. This value is
     *        required if the snapshot is a CSV or Excel workbook.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotFileSheetSelectionScope
     */

    public SnapshotFileSheetSelection withSelectionScope(SnapshotFileSheetSelectionScope selectionScope) {
        this.selectionScope = selectionScope.toString();
        return this;
    }

    /**
     * <p>
     * A structure that lists the IDs of the visuals in the selected sheet. Supported visual types are table, pivot
     * table visuals. This value is required if you are generating a CSV or Excel workbook. This value supports a
     * maximum of 1 visual ID for CSV and 5 visual IDs across up to 5 sheet selections for Excel. If you are generating
     * an Excel workbook, the order of the visual IDs provided in this structure determines the order of the worksheets
     * in the Excel file.
     * </p>
     * 
     * @return A structure that lists the IDs of the visuals in the selected sheet. Supported visual types are table,
     *         pivot table visuals. This value is required if you are generating a CSV or Excel workbook. This value
     *         supports a maximum of 1 visual ID for CSV and 5 visual IDs across up to 5 sheet selections for Excel. If
     *         you are generating an Excel workbook, the order of the visual IDs provided in this structure determines
     *         the order of the worksheets in the Excel file.
     */

    public java.util.List<String> getVisualIds() {
        return visualIds;
    }

    /**
     * <p>
     * A structure that lists the IDs of the visuals in the selected sheet. Supported visual types are table, pivot
     * table visuals. This value is required if you are generating a CSV or Excel workbook. This value supports a
     * maximum of 1 visual ID for CSV and 5 visual IDs across up to 5 sheet selections for Excel. If you are generating
     * an Excel workbook, the order of the visual IDs provided in this structure determines the order of the worksheets
     * in the Excel file.
     * </p>
     * 
     * @param visualIds
     *        A structure that lists the IDs of the visuals in the selected sheet. Supported visual types are table,
     *        pivot table visuals. This value is required if you are generating a CSV or Excel workbook. This value
     *        supports a maximum of 1 visual ID for CSV and 5 visual IDs across up to 5 sheet selections for Excel. If
     *        you are generating an Excel workbook, the order of the visual IDs provided in this structure determines
     *        the order of the worksheets in the Excel file.
     */

    public void setVisualIds(java.util.Collection<String> visualIds) {
        if (visualIds == null) {
            this.visualIds = null;
            return;
        }

        this.visualIds = new java.util.ArrayList<String>(visualIds);
    }

    /**
     * <p>
     * A structure that lists the IDs of the visuals in the selected sheet. Supported visual types are table, pivot
     * table visuals. This value is required if you are generating a CSV or Excel workbook. This value supports a
     * maximum of 1 visual ID for CSV and 5 visual IDs across up to 5 sheet selections for Excel. If you are generating
     * an Excel workbook, the order of the visual IDs provided in this structure determines the order of the worksheets
     * in the Excel file.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVisualIds(java.util.Collection)} or {@link #withVisualIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param visualIds
     *        A structure that lists the IDs of the visuals in the selected sheet. Supported visual types are table,
     *        pivot table visuals. This value is required if you are generating a CSV or Excel workbook. This value
     *        supports a maximum of 1 visual ID for CSV and 5 visual IDs across up to 5 sheet selections for Excel. If
     *        you are generating an Excel workbook, the order of the visual IDs provided in this structure determines
     *        the order of the worksheets in the Excel file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotFileSheetSelection withVisualIds(String... visualIds) {
        if (this.visualIds == null) {
            setVisualIds(new java.util.ArrayList<String>(visualIds.length));
        }
        for (String ele : visualIds) {
            this.visualIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure that lists the IDs of the visuals in the selected sheet. Supported visual types are table, pivot
     * table visuals. This value is required if you are generating a CSV or Excel workbook. This value supports a
     * maximum of 1 visual ID for CSV and 5 visual IDs across up to 5 sheet selections for Excel. If you are generating
     * an Excel workbook, the order of the visual IDs provided in this structure determines the order of the worksheets
     * in the Excel file.
     * </p>
     * 
     * @param visualIds
     *        A structure that lists the IDs of the visuals in the selected sheet. Supported visual types are table,
     *        pivot table visuals. This value is required if you are generating a CSV or Excel workbook. This value
     *        supports a maximum of 1 visual ID for CSV and 5 visual IDs across up to 5 sheet selections for Excel. If
     *        you are generating an Excel workbook, the order of the visual IDs provided in this structure determines
     *        the order of the worksheets in the Excel file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotFileSheetSelection withVisualIds(java.util.Collection<String> visualIds) {
        setVisualIds(visualIds);
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
        if (getSheetId() != null)
            sb.append("SheetId: ").append(getSheetId()).append(",");
        if (getSelectionScope() != null)
            sb.append("SelectionScope: ").append(getSelectionScope()).append(",");
        if (getVisualIds() != null)
            sb.append("VisualIds: ").append(getVisualIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotFileSheetSelection == false)
            return false;
        SnapshotFileSheetSelection other = (SnapshotFileSheetSelection) obj;
        if (other.getSheetId() == null ^ this.getSheetId() == null)
            return false;
        if (other.getSheetId() != null && other.getSheetId().equals(this.getSheetId()) == false)
            return false;
        if (other.getSelectionScope() == null ^ this.getSelectionScope() == null)
            return false;
        if (other.getSelectionScope() != null && other.getSelectionScope().equals(this.getSelectionScope()) == false)
            return false;
        if (other.getVisualIds() == null ^ this.getVisualIds() == null)
            return false;
        if (other.getVisualIds() != null && other.getVisualIds().equals(this.getVisualIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSheetId() == null) ? 0 : getSheetId().hashCode());
        hashCode = prime * hashCode + ((getSelectionScope() == null) ? 0 : getSelectionScope().hashCode());
        hashCode = prime * hashCode + ((getVisualIds() == null) ? 0 : getVisualIds().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotFileSheetSelection clone() {
        try {
            return (SnapshotFileSheetSelection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SnapshotFileSheetSelectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
