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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the field position.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/FieldPosition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldPosition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field position is below the field specified by the string.
     * </p>
     */
    private String below;
    /**
     * <p>
     * The field position is fixed and doesn't change in relation to other fields.
     * </p>
     */
    private String fixed;
    /**
     * <p>
     * The field position is to the right of the field specified by the string.
     * </p>
     */
    private String rightOf;

    /**
     * <p>
     * The field position is below the field specified by the string.
     * </p>
     * 
     * @param below
     *        The field position is below the field specified by the string.
     */

    public void setBelow(String below) {
        this.below = below;
    }

    /**
     * <p>
     * The field position is below the field specified by the string.
     * </p>
     * 
     * @return The field position is below the field specified by the string.
     */

    public String getBelow() {
        return this.below;
    }

    /**
     * <p>
     * The field position is below the field specified by the string.
     * </p>
     * 
     * @param below
     *        The field position is below the field specified by the string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldPosition withBelow(String below) {
        setBelow(below);
        return this;
    }

    /**
     * <p>
     * The field position is fixed and doesn't change in relation to other fields.
     * </p>
     * 
     * @param fixed
     *        The field position is fixed and doesn't change in relation to other fields.
     * @see FixedPosition
     */

    public void setFixed(String fixed) {
        this.fixed = fixed;
    }

    /**
     * <p>
     * The field position is fixed and doesn't change in relation to other fields.
     * </p>
     * 
     * @return The field position is fixed and doesn't change in relation to other fields.
     * @see FixedPosition
     */

    public String getFixed() {
        return this.fixed;
    }

    /**
     * <p>
     * The field position is fixed and doesn't change in relation to other fields.
     * </p>
     * 
     * @param fixed
     *        The field position is fixed and doesn't change in relation to other fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FixedPosition
     */

    public FieldPosition withFixed(String fixed) {
        setFixed(fixed);
        return this;
    }

    /**
     * <p>
     * The field position is fixed and doesn't change in relation to other fields.
     * </p>
     * 
     * @param fixed
     *        The field position is fixed and doesn't change in relation to other fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FixedPosition
     */

    public FieldPosition withFixed(FixedPosition fixed) {
        this.fixed = fixed.toString();
        return this;
    }

    /**
     * <p>
     * The field position is to the right of the field specified by the string.
     * </p>
     * 
     * @param rightOf
     *        The field position is to the right of the field specified by the string.
     */

    public void setRightOf(String rightOf) {
        this.rightOf = rightOf;
    }

    /**
     * <p>
     * The field position is to the right of the field specified by the string.
     * </p>
     * 
     * @return The field position is to the right of the field specified by the string.
     */

    public String getRightOf() {
        return this.rightOf;
    }

    /**
     * <p>
     * The field position is to the right of the field specified by the string.
     * </p>
     * 
     * @param rightOf
     *        The field position is to the right of the field specified by the string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldPosition withRightOf(String rightOf) {
        setRightOf(rightOf);
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
        if (getBelow() != null)
            sb.append("Below: ").append(getBelow()).append(",");
        if (getFixed() != null)
            sb.append("Fixed: ").append(getFixed()).append(",");
        if (getRightOf() != null)
            sb.append("RightOf: ").append(getRightOf());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldPosition == false)
            return false;
        FieldPosition other = (FieldPosition) obj;
        if (other.getBelow() == null ^ this.getBelow() == null)
            return false;
        if (other.getBelow() != null && other.getBelow().equals(this.getBelow()) == false)
            return false;
        if (other.getFixed() == null ^ this.getFixed() == null)
            return false;
        if (other.getFixed() != null && other.getFixed().equals(this.getFixed()) == false)
            return false;
        if (other.getRightOf() == null ^ this.getRightOf() == null)
            return false;
        if (other.getRightOf() != null && other.getRightOf().equals(this.getRightOf()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBelow() == null) ? 0 : getBelow().hashCode());
        hashCode = prime * hashCode + ((getFixed() == null) ? 0 : getFixed().hashCode());
        hashCode = prime * hashCode + ((getRightOf() == null) ? 0 : getRightOf().hashCode());
        return hashCode;
    }

    @Override
    public FieldPosition clone() {
        try {
            return (FieldPosition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.FieldPositionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
