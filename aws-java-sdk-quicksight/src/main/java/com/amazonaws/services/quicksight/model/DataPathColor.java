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
 * The color map that determines the color options for a particular element.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataPathColor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataPathColor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The element that the color needs to be applied to.
     * </p>
     */
    private DataPathValue element;
    /**
     * <p>
     * The color that needs to be applied to the element.
     * </p>
     */
    private String color;
    /**
     * <p>
     * The time granularity of the field that the color needs to be applied to.
     * </p>
     */
    private String timeGranularity;

    /**
     * <p>
     * The element that the color needs to be applied to.
     * </p>
     * 
     * @param element
     *        The element that the color needs to be applied to.
     */

    public void setElement(DataPathValue element) {
        this.element = element;
    }

    /**
     * <p>
     * The element that the color needs to be applied to.
     * </p>
     * 
     * @return The element that the color needs to be applied to.
     */

    public DataPathValue getElement() {
        return this.element;
    }

    /**
     * <p>
     * The element that the color needs to be applied to.
     * </p>
     * 
     * @param element
     *        The element that the color needs to be applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataPathColor withElement(DataPathValue element) {
        setElement(element);
        return this;
    }

    /**
     * <p>
     * The color that needs to be applied to the element.
     * </p>
     * 
     * @param color
     *        The color that needs to be applied to the element.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <p>
     * The color that needs to be applied to the element.
     * </p>
     * 
     * @return The color that needs to be applied to the element.
     */

    public String getColor() {
        return this.color;
    }

    /**
     * <p>
     * The color that needs to be applied to the element.
     * </p>
     * 
     * @param color
     *        The color that needs to be applied to the element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataPathColor withColor(String color) {
        setColor(color);
        return this;
    }

    /**
     * <p>
     * The time granularity of the field that the color needs to be applied to.
     * </p>
     * 
     * @param timeGranularity
     *        The time granularity of the field that the color needs to be applied to.
     * @see TimeGranularity
     */

    public void setTimeGranularity(String timeGranularity) {
        this.timeGranularity = timeGranularity;
    }

    /**
     * <p>
     * The time granularity of the field that the color needs to be applied to.
     * </p>
     * 
     * @return The time granularity of the field that the color needs to be applied to.
     * @see TimeGranularity
     */

    public String getTimeGranularity() {
        return this.timeGranularity;
    }

    /**
     * <p>
     * The time granularity of the field that the color needs to be applied to.
     * </p>
     * 
     * @param timeGranularity
     *        The time granularity of the field that the color needs to be applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeGranularity
     */

    public DataPathColor withTimeGranularity(String timeGranularity) {
        setTimeGranularity(timeGranularity);
        return this;
    }

    /**
     * <p>
     * The time granularity of the field that the color needs to be applied to.
     * </p>
     * 
     * @param timeGranularity
     *        The time granularity of the field that the color needs to be applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeGranularity
     */

    public DataPathColor withTimeGranularity(TimeGranularity timeGranularity) {
        this.timeGranularity = timeGranularity.toString();
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
        if (getElement() != null)
            sb.append("Element: ").append(getElement()).append(",");
        if (getColor() != null)
            sb.append("Color: ").append(getColor()).append(",");
        if (getTimeGranularity() != null)
            sb.append("TimeGranularity: ").append(getTimeGranularity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataPathColor == false)
            return false;
        DataPathColor other = (DataPathColor) obj;
        if (other.getElement() == null ^ this.getElement() == null)
            return false;
        if (other.getElement() != null && other.getElement().equals(this.getElement()) == false)
            return false;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
            return false;
        if (other.getTimeGranularity() == null ^ this.getTimeGranularity() == null)
            return false;
        if (other.getTimeGranularity() != null && other.getTimeGranularity().equals(this.getTimeGranularity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElement() == null) ? 0 : getElement().hashCode());
        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        hashCode = prime * hashCode + ((getTimeGranularity() == null) ? 0 : getTimeGranularity().hashCode());
        return hashCode;
    }

    @Override
    public DataPathColor clone() {
        try {
            return (DataPathColor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataPathColorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
