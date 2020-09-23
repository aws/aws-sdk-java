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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A sheet is an object that contains a set of visuals that are viewed together on one page in the Amazon QuickSight
 * console. Every analysis and dashboard contains at least one sheet. Each sheet contains at least one visualization
 * widget, for example a chart, pivot table, or narrative insight. Sheets can be associated with other components, such
 * as controls, filters, and so on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/Sheet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Sheet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier associated with a sheet.
     * </p>
     */
    private String sheetId;
    /**
     * <p>
     * The name of a sheet. This is displayed on the sheet's tab in the QuickSight console.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The unique identifier associated with a sheet.
     * </p>
     * 
     * @param sheetId
     *        The unique identifier associated with a sheet.
     */

    public void setSheetId(String sheetId) {
        this.sheetId = sheetId;
    }

    /**
     * <p>
     * The unique identifier associated with a sheet.
     * </p>
     * 
     * @return The unique identifier associated with a sheet.
     */

    public String getSheetId() {
        return this.sheetId;
    }

    /**
     * <p>
     * The unique identifier associated with a sheet.
     * </p>
     * 
     * @param sheetId
     *        The unique identifier associated with a sheet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sheet withSheetId(String sheetId) {
        setSheetId(sheetId);
        return this;
    }

    /**
     * <p>
     * The name of a sheet. This is displayed on the sheet's tab in the QuickSight console.
     * </p>
     * 
     * @param name
     *        The name of a sheet. This is displayed on the sheet's tab in the QuickSight console.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a sheet. This is displayed on the sheet's tab in the QuickSight console.
     * </p>
     * 
     * @return The name of a sheet. This is displayed on the sheet's tab in the QuickSight console.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a sheet. This is displayed on the sheet's tab in the QuickSight console.
     * </p>
     * 
     * @param name
     *        The name of a sheet. This is displayed on the sheet's tab in the QuickSight console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Sheet withName(String name) {
        setName(name);
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
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Sheet == false)
            return false;
        Sheet other = (Sheet) obj;
        if (other.getSheetId() == null ^ this.getSheetId() == null)
            return false;
        if (other.getSheetId() != null && other.getSheetId().equals(this.getSheetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSheetId() == null) ? 0 : getSheetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public Sheet clone() {
        try {
            return (Sheet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SheetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
