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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the data being transformed during an action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ViewFrame" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ViewFrame implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The starting index for the range of columns to return in the view frame.
     * </p>
     */
    private Integer startColumnIndex;
    /**
     * <p>
     * The number of columns to include in the view frame, beginning with the <code>StartColumnIndex</code> value and
     * ignoring any columns in the <code>HiddenColumns</code> list.
     * </p>
     */
    private Integer columnRange;
    /**
     * <p>
     * A list of columns to hide in the view frame.
     * </p>
     */
    private java.util.List<String> hiddenColumns;

    /**
     * <p>
     * The starting index for the range of columns to return in the view frame.
     * </p>
     * 
     * @param startColumnIndex
     *        The starting index for the range of columns to return in the view frame.
     */

    public void setStartColumnIndex(Integer startColumnIndex) {
        this.startColumnIndex = startColumnIndex;
    }

    /**
     * <p>
     * The starting index for the range of columns to return in the view frame.
     * </p>
     * 
     * @return The starting index for the range of columns to return in the view frame.
     */

    public Integer getStartColumnIndex() {
        return this.startColumnIndex;
    }

    /**
     * <p>
     * The starting index for the range of columns to return in the view frame.
     * </p>
     * 
     * @param startColumnIndex
     *        The starting index for the range of columns to return in the view frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewFrame withStartColumnIndex(Integer startColumnIndex) {
        setStartColumnIndex(startColumnIndex);
        return this;
    }

    /**
     * <p>
     * The number of columns to include in the view frame, beginning with the <code>StartColumnIndex</code> value and
     * ignoring any columns in the <code>HiddenColumns</code> list.
     * </p>
     * 
     * @param columnRange
     *        The number of columns to include in the view frame, beginning with the <code>StartColumnIndex</code> value
     *        and ignoring any columns in the <code>HiddenColumns</code> list.
     */

    public void setColumnRange(Integer columnRange) {
        this.columnRange = columnRange;
    }

    /**
     * <p>
     * The number of columns to include in the view frame, beginning with the <code>StartColumnIndex</code> value and
     * ignoring any columns in the <code>HiddenColumns</code> list.
     * </p>
     * 
     * @return The number of columns to include in the view frame, beginning with the <code>StartColumnIndex</code>
     *         value and ignoring any columns in the <code>HiddenColumns</code> list.
     */

    public Integer getColumnRange() {
        return this.columnRange;
    }

    /**
     * <p>
     * The number of columns to include in the view frame, beginning with the <code>StartColumnIndex</code> value and
     * ignoring any columns in the <code>HiddenColumns</code> list.
     * </p>
     * 
     * @param columnRange
     *        The number of columns to include in the view frame, beginning with the <code>StartColumnIndex</code> value
     *        and ignoring any columns in the <code>HiddenColumns</code> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewFrame withColumnRange(Integer columnRange) {
        setColumnRange(columnRange);
        return this;
    }

    /**
     * <p>
     * A list of columns to hide in the view frame.
     * </p>
     * 
     * @return A list of columns to hide in the view frame.
     */

    public java.util.List<String> getHiddenColumns() {
        return hiddenColumns;
    }

    /**
     * <p>
     * A list of columns to hide in the view frame.
     * </p>
     * 
     * @param hiddenColumns
     *        A list of columns to hide in the view frame.
     */

    public void setHiddenColumns(java.util.Collection<String> hiddenColumns) {
        if (hiddenColumns == null) {
            this.hiddenColumns = null;
            return;
        }

        this.hiddenColumns = new java.util.ArrayList<String>(hiddenColumns);
    }

    /**
     * <p>
     * A list of columns to hide in the view frame.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHiddenColumns(java.util.Collection)} or {@link #withHiddenColumns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param hiddenColumns
     *        A list of columns to hide in the view frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewFrame withHiddenColumns(String... hiddenColumns) {
        if (this.hiddenColumns == null) {
            setHiddenColumns(new java.util.ArrayList<String>(hiddenColumns.length));
        }
        for (String ele : hiddenColumns) {
            this.hiddenColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of columns to hide in the view frame.
     * </p>
     * 
     * @param hiddenColumns
     *        A list of columns to hide in the view frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewFrame withHiddenColumns(java.util.Collection<String> hiddenColumns) {
        setHiddenColumns(hiddenColumns);
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
        if (getStartColumnIndex() != null)
            sb.append("StartColumnIndex: ").append(getStartColumnIndex()).append(",");
        if (getColumnRange() != null)
            sb.append("ColumnRange: ").append(getColumnRange()).append(",");
        if (getHiddenColumns() != null)
            sb.append("HiddenColumns: ").append(getHiddenColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewFrame == false)
            return false;
        ViewFrame other = (ViewFrame) obj;
        if (other.getStartColumnIndex() == null ^ this.getStartColumnIndex() == null)
            return false;
        if (other.getStartColumnIndex() != null && other.getStartColumnIndex().equals(this.getStartColumnIndex()) == false)
            return false;
        if (other.getColumnRange() == null ^ this.getColumnRange() == null)
            return false;
        if (other.getColumnRange() != null && other.getColumnRange().equals(this.getColumnRange()) == false)
            return false;
        if (other.getHiddenColumns() == null ^ this.getHiddenColumns() == null)
            return false;
        if (other.getHiddenColumns() != null && other.getHiddenColumns().equals(this.getHiddenColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartColumnIndex() == null) ? 0 : getStartColumnIndex().hashCode());
        hashCode = prime * hashCode + ((getColumnRange() == null) ? 0 : getColumnRange().hashCode());
        hashCode = prime * hashCode + ((getHiddenColumns() == null) ? 0 : getHiddenColumns().hashCode());
        return hashCode;
    }

    @Override
    public ViewFrame clone() {
        try {
            return (ViewFrame) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.ViewFrameMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
