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
 * The configuration of spacing (often a margin or padding).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/Spacing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Spacing implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Define the top spacing.
     * </p>
     */
    private String top;
    /**
     * <p>
     * Define the bottom spacing.
     * </p>
     */
    private String bottom;
    /**
     * <p>
     * Define the left spacing.
     * </p>
     */
    private String left;
    /**
     * <p>
     * Define the right spacing.
     * </p>
     */
    private String right;

    /**
     * <p>
     * Define the top spacing.
     * </p>
     * 
     * @param top
     *        Define the top spacing.
     */

    public void setTop(String top) {
        this.top = top;
    }

    /**
     * <p>
     * Define the top spacing.
     * </p>
     * 
     * @return Define the top spacing.
     */

    public String getTop() {
        return this.top;
    }

    /**
     * <p>
     * Define the top spacing.
     * </p>
     * 
     * @param top
     *        Define the top spacing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Spacing withTop(String top) {
        setTop(top);
        return this;
    }

    /**
     * <p>
     * Define the bottom spacing.
     * </p>
     * 
     * @param bottom
     *        Define the bottom spacing.
     */

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    /**
     * <p>
     * Define the bottom spacing.
     * </p>
     * 
     * @return Define the bottom spacing.
     */

    public String getBottom() {
        return this.bottom;
    }

    /**
     * <p>
     * Define the bottom spacing.
     * </p>
     * 
     * @param bottom
     *        Define the bottom spacing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Spacing withBottom(String bottom) {
        setBottom(bottom);
        return this;
    }

    /**
     * <p>
     * Define the left spacing.
     * </p>
     * 
     * @param left
     *        Define the left spacing.
     */

    public void setLeft(String left) {
        this.left = left;
    }

    /**
     * <p>
     * Define the left spacing.
     * </p>
     * 
     * @return Define the left spacing.
     */

    public String getLeft() {
        return this.left;
    }

    /**
     * <p>
     * Define the left spacing.
     * </p>
     * 
     * @param left
     *        Define the left spacing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Spacing withLeft(String left) {
        setLeft(left);
        return this;
    }

    /**
     * <p>
     * Define the right spacing.
     * </p>
     * 
     * @param right
     *        Define the right spacing.
     */

    public void setRight(String right) {
        this.right = right;
    }

    /**
     * <p>
     * Define the right spacing.
     * </p>
     * 
     * @return Define the right spacing.
     */

    public String getRight() {
        return this.right;
    }

    /**
     * <p>
     * Define the right spacing.
     * </p>
     * 
     * @param right
     *        Define the right spacing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Spacing withRight(String right) {
        setRight(right);
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
        if (getTop() != null)
            sb.append("Top: ").append(getTop()).append(",");
        if (getBottom() != null)
            sb.append("Bottom: ").append(getBottom()).append(",");
        if (getLeft() != null)
            sb.append("Left: ").append(getLeft()).append(",");
        if (getRight() != null)
            sb.append("Right: ").append(getRight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Spacing == false)
            return false;
        Spacing other = (Spacing) obj;
        if (other.getTop() == null ^ this.getTop() == null)
            return false;
        if (other.getTop() != null && other.getTop().equals(this.getTop()) == false)
            return false;
        if (other.getBottom() == null ^ this.getBottom() == null)
            return false;
        if (other.getBottom() != null && other.getBottom().equals(this.getBottom()) == false)
            return false;
        if (other.getLeft() == null ^ this.getLeft() == null)
            return false;
        if (other.getLeft() != null && other.getLeft().equals(this.getLeft()) == false)
            return false;
        if (other.getRight() == null ^ this.getRight() == null)
            return false;
        if (other.getRight() != null && other.getRight().equals(this.getRight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTop() == null) ? 0 : getTop().hashCode());
        hashCode = prime * hashCode + ((getBottom() == null) ? 0 : getBottom().hashCode());
        hashCode = prime * hashCode + ((getLeft() == null) ? 0 : getLeft().hashCode());
        hashCode = prime * hashCode + ((getRight() == null) ? 0 : getRight().hashCode());
        return hashCode;
    }

    @Override
    public Spacing clone() {
        try {
            return (Spacing) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SpacingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
