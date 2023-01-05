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
 * The configuration of a free-form layout.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FreeFormLayoutConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FreeFormLayoutConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The elements that are included in a free-form layout.
     * </p>
     */
    private java.util.List<FreeFormLayoutElement> elements;

    private FreeFormLayoutCanvasSizeOptions canvasSizeOptions;

    /**
     * <p>
     * The elements that are included in a free-form layout.
     * </p>
     * 
     * @return The elements that are included in a free-form layout.
     */

    public java.util.List<FreeFormLayoutElement> getElements() {
        return elements;
    }

    /**
     * <p>
     * The elements that are included in a free-form layout.
     * </p>
     * 
     * @param elements
     *        The elements that are included in a free-form layout.
     */

    public void setElements(java.util.Collection<FreeFormLayoutElement> elements) {
        if (elements == null) {
            this.elements = null;
            return;
        }

        this.elements = new java.util.ArrayList<FreeFormLayoutElement>(elements);
    }

    /**
     * <p>
     * The elements that are included in a free-form layout.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElements(java.util.Collection)} or {@link #withElements(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param elements
     *        The elements that are included in a free-form layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeFormLayoutConfiguration withElements(FreeFormLayoutElement... elements) {
        if (this.elements == null) {
            setElements(new java.util.ArrayList<FreeFormLayoutElement>(elements.length));
        }
        for (FreeFormLayoutElement ele : elements) {
            this.elements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The elements that are included in a free-form layout.
     * </p>
     * 
     * @param elements
     *        The elements that are included in a free-form layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeFormLayoutConfiguration withElements(java.util.Collection<FreeFormLayoutElement> elements) {
        setElements(elements);
        return this;
    }

    /**
     * @param canvasSizeOptions
     */

    public void setCanvasSizeOptions(FreeFormLayoutCanvasSizeOptions canvasSizeOptions) {
        this.canvasSizeOptions = canvasSizeOptions;
    }

    /**
     * @return
     */

    public FreeFormLayoutCanvasSizeOptions getCanvasSizeOptions() {
        return this.canvasSizeOptions;
    }

    /**
     * @param canvasSizeOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeFormLayoutConfiguration withCanvasSizeOptions(FreeFormLayoutCanvasSizeOptions canvasSizeOptions) {
        setCanvasSizeOptions(canvasSizeOptions);
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
        if (getElements() != null)
            sb.append("Elements: ").append(getElements()).append(",");
        if (getCanvasSizeOptions() != null)
            sb.append("CanvasSizeOptions: ").append(getCanvasSizeOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FreeFormLayoutConfiguration == false)
            return false;
        FreeFormLayoutConfiguration other = (FreeFormLayoutConfiguration) obj;
        if (other.getElements() == null ^ this.getElements() == null)
            return false;
        if (other.getElements() != null && other.getElements().equals(this.getElements()) == false)
            return false;
        if (other.getCanvasSizeOptions() == null ^ this.getCanvasSizeOptions() == null)
            return false;
        if (other.getCanvasSizeOptions() != null && other.getCanvasSizeOptions().equals(this.getCanvasSizeOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElements() == null) ? 0 : getElements().hashCode());
        hashCode = prime * hashCode + ((getCanvasSizeOptions() == null) ? 0 : getCanvasSizeOptions().hashCode());
        return hashCode;
    }

    @Override
    public FreeFormLayoutConfiguration clone() {
        try {
            return (FreeFormLayoutConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FreeFormLayoutConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
