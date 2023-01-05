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
 * The shape conditional formatting of a filled map visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ShapeConditionalFormat" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShapeConditionalFormat implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The conditional formatting for the shape background color of a filled map visual.
     * </p>
     */
    private ConditionalFormattingColor backgroundColor;

    /**
     * <p>
     * The conditional formatting for the shape background color of a filled map visual.
     * </p>
     * 
     * @param backgroundColor
     *        The conditional formatting for the shape background color of a filled map visual.
     */

    public void setBackgroundColor(ConditionalFormattingColor backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * <p>
     * The conditional formatting for the shape background color of a filled map visual.
     * </p>
     * 
     * @return The conditional formatting for the shape background color of a filled map visual.
     */

    public ConditionalFormattingColor getBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * <p>
     * The conditional formatting for the shape background color of a filled map visual.
     * </p>
     * 
     * @param backgroundColor
     *        The conditional formatting for the shape background color of a filled map visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShapeConditionalFormat withBackgroundColor(ConditionalFormattingColor backgroundColor) {
        setBackgroundColor(backgroundColor);
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
        if (getBackgroundColor() != null)
            sb.append("BackgroundColor: ").append(getBackgroundColor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShapeConditionalFormat == false)
            return false;
        ShapeConditionalFormat other = (ShapeConditionalFormat) obj;
        if (other.getBackgroundColor() == null ^ this.getBackgroundColor() == null)
            return false;
        if (other.getBackgroundColor() != null && other.getBackgroundColor().equals(this.getBackgroundColor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackgroundColor() == null) ? 0 : getBackgroundColor().hashCode());
        return hashCode;
    }

    @Override
    public ShapeConditionalFormat clone() {
        try {
            return (ShapeConditionalFormat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ShapeConditionalFormatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
