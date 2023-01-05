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
 * The style configuration of the reference line.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ReferenceLineStyleConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceLineStyleConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The pattern type of the line style. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SOLID</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DASHED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOTTED</code>
     * </p>
     * </li>
     * </ul>
     */
    private String pattern;
    /**
     * <p>
     * The hex color of the reference line.
     * </p>
     */
    private String color;

    /**
     * <p>
     * The pattern type of the line style. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SOLID</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DASHED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOTTED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param pattern
     *        The pattern type of the line style. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SOLID</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DASHED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOTTED</code>
     *        </p>
     *        </li>
     * @see ReferenceLinePatternType
     */

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * The pattern type of the line style. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SOLID</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DASHED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOTTED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The pattern type of the line style. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SOLID</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DASHED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DOTTED</code>
     *         </p>
     *         </li>
     * @see ReferenceLinePatternType
     */

    public String getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * The pattern type of the line style. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SOLID</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DASHED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOTTED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param pattern
     *        The pattern type of the line style. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SOLID</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DASHED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOTTED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceLinePatternType
     */

    public ReferenceLineStyleConfiguration withPattern(String pattern) {
        setPattern(pattern);
        return this;
    }

    /**
     * <p>
     * The pattern type of the line style. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SOLID</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DASHED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DOTTED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param pattern
     *        The pattern type of the line style. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SOLID</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DASHED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DOTTED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReferenceLinePatternType
     */

    public ReferenceLineStyleConfiguration withPattern(ReferenceLinePatternType pattern) {
        this.pattern = pattern.toString();
        return this;
    }

    /**
     * <p>
     * The hex color of the reference line.
     * </p>
     * 
     * @param color
     *        The hex color of the reference line.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <p>
     * The hex color of the reference line.
     * </p>
     * 
     * @return The hex color of the reference line.
     */

    public String getColor() {
        return this.color;
    }

    /**
     * <p>
     * The hex color of the reference line.
     * </p>
     * 
     * @param color
     *        The hex color of the reference line.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceLineStyleConfiguration withColor(String color) {
        setColor(color);
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
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern()).append(",");
        if (getColor() != null)
            sb.append("Color: ").append(getColor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceLineStyleConfiguration == false)
            return false;
        ReferenceLineStyleConfiguration other = (ReferenceLineStyleConfiguration) obj;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceLineStyleConfiguration clone() {
        try {
            return (ReferenceLineStyleConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ReferenceLineStyleConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
