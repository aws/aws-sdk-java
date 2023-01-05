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
 * Describes the configuration for the form's style.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/FormStyle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormStyle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The spacing for the horizontal gap.
     * </p>
     */
    private FormStyleConfig horizontalGap;
    /**
     * <p>
     * The size of the outer padding for the form.
     * </p>
     */
    private FormStyleConfig outerPadding;
    /**
     * <p>
     * The spacing for the vertical gap.
     * </p>
     */
    private FormStyleConfig verticalGap;

    /**
     * <p>
     * The spacing for the horizontal gap.
     * </p>
     * 
     * @param horizontalGap
     *        The spacing for the horizontal gap.
     */

    public void setHorizontalGap(FormStyleConfig horizontalGap) {
        this.horizontalGap = horizontalGap;
    }

    /**
     * <p>
     * The spacing for the horizontal gap.
     * </p>
     * 
     * @return The spacing for the horizontal gap.
     */

    public FormStyleConfig getHorizontalGap() {
        return this.horizontalGap;
    }

    /**
     * <p>
     * The spacing for the horizontal gap.
     * </p>
     * 
     * @param horizontalGap
     *        The spacing for the horizontal gap.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormStyle withHorizontalGap(FormStyleConfig horizontalGap) {
        setHorizontalGap(horizontalGap);
        return this;
    }

    /**
     * <p>
     * The size of the outer padding for the form.
     * </p>
     * 
     * @param outerPadding
     *        The size of the outer padding for the form.
     */

    public void setOuterPadding(FormStyleConfig outerPadding) {
        this.outerPadding = outerPadding;
    }

    /**
     * <p>
     * The size of the outer padding for the form.
     * </p>
     * 
     * @return The size of the outer padding for the form.
     */

    public FormStyleConfig getOuterPadding() {
        return this.outerPadding;
    }

    /**
     * <p>
     * The size of the outer padding for the form.
     * </p>
     * 
     * @param outerPadding
     *        The size of the outer padding for the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormStyle withOuterPadding(FormStyleConfig outerPadding) {
        setOuterPadding(outerPadding);
        return this;
    }

    /**
     * <p>
     * The spacing for the vertical gap.
     * </p>
     * 
     * @param verticalGap
     *        The spacing for the vertical gap.
     */

    public void setVerticalGap(FormStyleConfig verticalGap) {
        this.verticalGap = verticalGap;
    }

    /**
     * <p>
     * The spacing for the vertical gap.
     * </p>
     * 
     * @return The spacing for the vertical gap.
     */

    public FormStyleConfig getVerticalGap() {
        return this.verticalGap;
    }

    /**
     * <p>
     * The spacing for the vertical gap.
     * </p>
     * 
     * @param verticalGap
     *        The spacing for the vertical gap.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormStyle withVerticalGap(FormStyleConfig verticalGap) {
        setVerticalGap(verticalGap);
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
        if (getHorizontalGap() != null)
            sb.append("HorizontalGap: ").append(getHorizontalGap()).append(",");
        if (getOuterPadding() != null)
            sb.append("OuterPadding: ").append(getOuterPadding()).append(",");
        if (getVerticalGap() != null)
            sb.append("VerticalGap: ").append(getVerticalGap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FormStyle == false)
            return false;
        FormStyle other = (FormStyle) obj;
        if (other.getHorizontalGap() == null ^ this.getHorizontalGap() == null)
            return false;
        if (other.getHorizontalGap() != null && other.getHorizontalGap().equals(this.getHorizontalGap()) == false)
            return false;
        if (other.getOuterPadding() == null ^ this.getOuterPadding() == null)
            return false;
        if (other.getOuterPadding() != null && other.getOuterPadding().equals(this.getOuterPadding()) == false)
            return false;
        if (other.getVerticalGap() == null ^ this.getVerticalGap() == null)
            return false;
        if (other.getVerticalGap() != null && other.getVerticalGap().equals(this.getVerticalGap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHorizontalGap() == null) ? 0 : getHorizontalGap().hashCode());
        hashCode = prime * hashCode + ((getOuterPadding() == null) ? 0 : getOuterPadding().hashCode());
        hashCode = prime * hashCode + ((getVerticalGap() == null) ? 0 : getVerticalGap().hashCode());
        return hashCode;
    }

    @Override
    public FormStyle clone() {
        try {
            return (FormStyle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.FormStyleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
