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
 * The table style target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableStyleTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableStyleTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cell type of the table style target.
     * </p>
     */
    private String cellType;

    /**
     * <p>
     * The cell type of the table style target.
     * </p>
     * 
     * @param cellType
     *        The cell type of the table style target.
     * @see StyledCellType
     */

    public void setCellType(String cellType) {
        this.cellType = cellType;
    }

    /**
     * <p>
     * The cell type of the table style target.
     * </p>
     * 
     * @return The cell type of the table style target.
     * @see StyledCellType
     */

    public String getCellType() {
        return this.cellType;
    }

    /**
     * <p>
     * The cell type of the table style target.
     * </p>
     * 
     * @param cellType
     *        The cell type of the table style target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StyledCellType
     */

    public TableStyleTarget withCellType(String cellType) {
        setCellType(cellType);
        return this;
    }

    /**
     * <p>
     * The cell type of the table style target.
     * </p>
     * 
     * @param cellType
     *        The cell type of the table style target.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StyledCellType
     */

    public TableStyleTarget withCellType(StyledCellType cellType) {
        this.cellType = cellType.toString();
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
        if (getCellType() != null)
            sb.append("CellType: ").append(getCellType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableStyleTarget == false)
            return false;
        TableStyleTarget other = (TableStyleTarget) obj;
        if (other.getCellType() == null ^ this.getCellType() == null)
            return false;
        if (other.getCellType() != null && other.getCellType().equals(this.getCellType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCellType() == null) ? 0 : getCellType().hashCode());
        return hashCode;
    }

    @Override
    public TableStyleTarget clone() {
        try {
            return (TableStyleTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableStyleTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
