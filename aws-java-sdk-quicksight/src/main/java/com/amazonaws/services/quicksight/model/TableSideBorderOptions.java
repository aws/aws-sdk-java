/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The side border options for a table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableSideBorderOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableSideBorderOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The table border options of the inner vertical border.
     * </p>
     */
    private TableBorderOptions innerVertical;
    /**
     * <p>
     * The table border options of the inner horizontal border.
     * </p>
     */
    private TableBorderOptions innerHorizontal;
    /**
     * <p>
     * The table border options of the left border.
     * </p>
     */
    private TableBorderOptions left;
    /**
     * <p>
     * The table border options of the right border.
     * </p>
     */
    private TableBorderOptions right;
    /**
     * <p>
     * The table border options of the top border.
     * </p>
     */
    private TableBorderOptions top;
    /**
     * <p>
     * The table border options of the bottom border.
     * </p>
     */
    private TableBorderOptions bottom;

    /**
     * <p>
     * The table border options of the inner vertical border.
     * </p>
     * 
     * @param innerVertical
     *        The table border options of the inner vertical border.
     */

    public void setInnerVertical(TableBorderOptions innerVertical) {
        this.innerVertical = innerVertical;
    }

    /**
     * <p>
     * The table border options of the inner vertical border.
     * </p>
     * 
     * @return The table border options of the inner vertical border.
     */

    public TableBorderOptions getInnerVertical() {
        return this.innerVertical;
    }

    /**
     * <p>
     * The table border options of the inner vertical border.
     * </p>
     * 
     * @param innerVertical
     *        The table border options of the inner vertical border.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableSideBorderOptions withInnerVertical(TableBorderOptions innerVertical) {
        setInnerVertical(innerVertical);
        return this;
    }

    /**
     * <p>
     * The table border options of the inner horizontal border.
     * </p>
     * 
     * @param innerHorizontal
     *        The table border options of the inner horizontal border.
     */

    public void setInnerHorizontal(TableBorderOptions innerHorizontal) {
        this.innerHorizontal = innerHorizontal;
    }

    /**
     * <p>
     * The table border options of the inner horizontal border.
     * </p>
     * 
     * @return The table border options of the inner horizontal border.
     */

    public TableBorderOptions getInnerHorizontal() {
        return this.innerHorizontal;
    }

    /**
     * <p>
     * The table border options of the inner horizontal border.
     * </p>
     * 
     * @param innerHorizontal
     *        The table border options of the inner horizontal border.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableSideBorderOptions withInnerHorizontal(TableBorderOptions innerHorizontal) {
        setInnerHorizontal(innerHorizontal);
        return this;
    }

    /**
     * <p>
     * The table border options of the left border.
     * </p>
     * 
     * @param left
     *        The table border options of the left border.
     */

    public void setLeft(TableBorderOptions left) {
        this.left = left;
    }

    /**
     * <p>
     * The table border options of the left border.
     * </p>
     * 
     * @return The table border options of the left border.
     */

    public TableBorderOptions getLeft() {
        return this.left;
    }

    /**
     * <p>
     * The table border options of the left border.
     * </p>
     * 
     * @param left
     *        The table border options of the left border.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableSideBorderOptions withLeft(TableBorderOptions left) {
        setLeft(left);
        return this;
    }

    /**
     * <p>
     * The table border options of the right border.
     * </p>
     * 
     * @param right
     *        The table border options of the right border.
     */

    public void setRight(TableBorderOptions right) {
        this.right = right;
    }

    /**
     * <p>
     * The table border options of the right border.
     * </p>
     * 
     * @return The table border options of the right border.
     */

    public TableBorderOptions getRight() {
        return this.right;
    }

    /**
     * <p>
     * The table border options of the right border.
     * </p>
     * 
     * @param right
     *        The table border options of the right border.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableSideBorderOptions withRight(TableBorderOptions right) {
        setRight(right);
        return this;
    }

    /**
     * <p>
     * The table border options of the top border.
     * </p>
     * 
     * @param top
     *        The table border options of the top border.
     */

    public void setTop(TableBorderOptions top) {
        this.top = top;
    }

    /**
     * <p>
     * The table border options of the top border.
     * </p>
     * 
     * @return The table border options of the top border.
     */

    public TableBorderOptions getTop() {
        return this.top;
    }

    /**
     * <p>
     * The table border options of the top border.
     * </p>
     * 
     * @param top
     *        The table border options of the top border.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableSideBorderOptions withTop(TableBorderOptions top) {
        setTop(top);
        return this;
    }

    /**
     * <p>
     * The table border options of the bottom border.
     * </p>
     * 
     * @param bottom
     *        The table border options of the bottom border.
     */

    public void setBottom(TableBorderOptions bottom) {
        this.bottom = bottom;
    }

    /**
     * <p>
     * The table border options of the bottom border.
     * </p>
     * 
     * @return The table border options of the bottom border.
     */

    public TableBorderOptions getBottom() {
        return this.bottom;
    }

    /**
     * <p>
     * The table border options of the bottom border.
     * </p>
     * 
     * @param bottom
     *        The table border options of the bottom border.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableSideBorderOptions withBottom(TableBorderOptions bottom) {
        setBottom(bottom);
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
        if (getInnerVertical() != null)
            sb.append("InnerVertical: ").append(getInnerVertical()).append(",");
        if (getInnerHorizontal() != null)
            sb.append("InnerHorizontal: ").append(getInnerHorizontal()).append(",");
        if (getLeft() != null)
            sb.append("Left: ").append(getLeft()).append(",");
        if (getRight() != null)
            sb.append("Right: ").append(getRight()).append(",");
        if (getTop() != null)
            sb.append("Top: ").append(getTop()).append(",");
        if (getBottom() != null)
            sb.append("Bottom: ").append(getBottom());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableSideBorderOptions == false)
            return false;
        TableSideBorderOptions other = (TableSideBorderOptions) obj;
        if (other.getInnerVertical() == null ^ this.getInnerVertical() == null)
            return false;
        if (other.getInnerVertical() != null && other.getInnerVertical().equals(this.getInnerVertical()) == false)
            return false;
        if (other.getInnerHorizontal() == null ^ this.getInnerHorizontal() == null)
            return false;
        if (other.getInnerHorizontal() != null && other.getInnerHorizontal().equals(this.getInnerHorizontal()) == false)
            return false;
        if (other.getLeft() == null ^ this.getLeft() == null)
            return false;
        if (other.getLeft() != null && other.getLeft().equals(this.getLeft()) == false)
            return false;
        if (other.getRight() == null ^ this.getRight() == null)
            return false;
        if (other.getRight() != null && other.getRight().equals(this.getRight()) == false)
            return false;
        if (other.getTop() == null ^ this.getTop() == null)
            return false;
        if (other.getTop() != null && other.getTop().equals(this.getTop()) == false)
            return false;
        if (other.getBottom() == null ^ this.getBottom() == null)
            return false;
        if (other.getBottom() != null && other.getBottom().equals(this.getBottom()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInnerVertical() == null) ? 0 : getInnerVertical().hashCode());
        hashCode = prime * hashCode + ((getInnerHorizontal() == null) ? 0 : getInnerHorizontal().hashCode());
        hashCode = prime * hashCode + ((getLeft() == null) ? 0 : getLeft().hashCode());
        hashCode = prime * hashCode + ((getRight() == null) ? 0 : getRight().hashCode());
        hashCode = prime * hashCode + ((getTop() == null) ? 0 : getTop().hashCode());
        hashCode = prime * hashCode + ((getBottom() == null) ? 0 : getBottom().hashCode());
        return hashCode;
    }

    @Override
    public TableSideBorderOptions clone() {
        try {
            return (TableSideBorderOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableSideBorderOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
