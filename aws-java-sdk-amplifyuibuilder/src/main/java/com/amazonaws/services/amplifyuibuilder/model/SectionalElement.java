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
 * Stores the configuration information for a visual helper element for a form. A sectional element can be a header, a
 * text block, or a divider. These elements are static and not associated with any data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/SectionalElement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SectionalElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the size of the font for a <code>Heading</code> sectional element. Valid values are
     * <code>1 | 2 | 3 | 4 | 5 | 6</code>.
     * </p>
     */
    private Integer level;
    /**
     * <p>
     * Specifies the orientation for a <code>Divider</code> sectional element. Valid values are <code>horizontal</code>
     * or <code>vertical</code>.
     * </p>
     */
    private String orientation;
    /**
     * <p>
     * Specifies the position of the text in a field for a <code>Text</code> sectional element.
     * </p>
     */
    private FieldPosition position;
    /**
     * <p>
     * The text for a <code>Text</code> sectional element.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The type of sectional element. Valid values are <code>Heading</code>, <code>Text</code>, and <code>Divider</code>
     * .
     * </p>
     */
    private String type;

    /**
     * <p>
     * Specifies the size of the font for a <code>Heading</code> sectional element. Valid values are
     * <code>1 | 2 | 3 | 4 | 5 | 6</code>.
     * </p>
     * 
     * @param level
     *        Specifies the size of the font for a <code>Heading</code> sectional element. Valid values are
     *        <code>1 | 2 | 3 | 4 | 5 | 6</code>.
     */

    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * <p>
     * Specifies the size of the font for a <code>Heading</code> sectional element. Valid values are
     * <code>1 | 2 | 3 | 4 | 5 | 6</code>.
     * </p>
     * 
     * @return Specifies the size of the font for a <code>Heading</code> sectional element. Valid values are
     *         <code>1 | 2 | 3 | 4 | 5 | 6</code>.
     */

    public Integer getLevel() {
        return this.level;
    }

    /**
     * <p>
     * Specifies the size of the font for a <code>Heading</code> sectional element. Valid values are
     * <code>1 | 2 | 3 | 4 | 5 | 6</code>.
     * </p>
     * 
     * @param level
     *        Specifies the size of the font for a <code>Heading</code> sectional element. Valid values are
     *        <code>1 | 2 | 3 | 4 | 5 | 6</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionalElement withLevel(Integer level) {
        setLevel(level);
        return this;
    }

    /**
     * <p>
     * Specifies the orientation for a <code>Divider</code> sectional element. Valid values are <code>horizontal</code>
     * or <code>vertical</code>.
     * </p>
     * 
     * @param orientation
     *        Specifies the orientation for a <code>Divider</code> sectional element. Valid values are
     *        <code>horizontal</code> or <code>vertical</code>.
     */

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    /**
     * <p>
     * Specifies the orientation for a <code>Divider</code> sectional element. Valid values are <code>horizontal</code>
     * or <code>vertical</code>.
     * </p>
     * 
     * @return Specifies the orientation for a <code>Divider</code> sectional element. Valid values are
     *         <code>horizontal</code> or <code>vertical</code>.
     */

    public String getOrientation() {
        return this.orientation;
    }

    /**
     * <p>
     * Specifies the orientation for a <code>Divider</code> sectional element. Valid values are <code>horizontal</code>
     * or <code>vertical</code>.
     * </p>
     * 
     * @param orientation
     *        Specifies the orientation for a <code>Divider</code> sectional element. Valid values are
     *        <code>horizontal</code> or <code>vertical</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionalElement withOrientation(String orientation) {
        setOrientation(orientation);
        return this;
    }

    /**
     * <p>
     * Specifies the position of the text in a field for a <code>Text</code> sectional element.
     * </p>
     * 
     * @param position
     *        Specifies the position of the text in a field for a <code>Text</code> sectional element.
     */

    public void setPosition(FieldPosition position) {
        this.position = position;
    }

    /**
     * <p>
     * Specifies the position of the text in a field for a <code>Text</code> sectional element.
     * </p>
     * 
     * @return Specifies the position of the text in a field for a <code>Text</code> sectional element.
     */

    public FieldPosition getPosition() {
        return this.position;
    }

    /**
     * <p>
     * Specifies the position of the text in a field for a <code>Text</code> sectional element.
     * </p>
     * 
     * @param position
     *        Specifies the position of the text in a field for a <code>Text</code> sectional element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionalElement withPosition(FieldPosition position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The text for a <code>Text</code> sectional element.
     * </p>
     * 
     * @param text
     *        The text for a <code>Text</code> sectional element.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text for a <code>Text</code> sectional element.
     * </p>
     * 
     * @return The text for a <code>Text</code> sectional element.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The text for a <code>Text</code> sectional element.
     * </p>
     * 
     * @param text
     *        The text for a <code>Text</code> sectional element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionalElement withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The type of sectional element. Valid values are <code>Heading</code>, <code>Text</code>, and <code>Divider</code>
     * .
     * </p>
     * 
     * @param type
     *        The type of sectional element. Valid values are <code>Heading</code>, <code>Text</code>, and
     *        <code>Divider</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of sectional element. Valid values are <code>Heading</code>, <code>Text</code>, and <code>Divider</code>
     * .
     * </p>
     * 
     * @return The type of sectional element. Valid values are <code>Heading</code>, <code>Text</code>, and
     *         <code>Divider</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of sectional element. Valid values are <code>Heading</code>, <code>Text</code>, and <code>Divider</code>
     * .
     * </p>
     * 
     * @param type
     *        The type of sectional element. Valid values are <code>Heading</code>, <code>Text</code>, and
     *        <code>Divider</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionalElement withType(String type) {
        setType(type);
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
        if (getLevel() != null)
            sb.append("Level: ").append(getLevel()).append(",");
        if (getOrientation() != null)
            sb.append("Orientation: ").append(getOrientation()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SectionalElement == false)
            return false;
        SectionalElement other = (SectionalElement) obj;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        if (other.getOrientation() == null ^ this.getOrientation() == null)
            return false;
        if (other.getOrientation() != null && other.getOrientation().equals(this.getOrientation()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        hashCode = prime * hashCode + ((getOrientation() == null) ? 0 : getOrientation().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SectionalElement clone() {
        try {
            return (SectionalElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.SectionalElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
