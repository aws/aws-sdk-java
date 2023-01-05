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
 * Describes the configuration for a button UI element that is a part of a form.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/FormButton" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormButton implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the button's properties.
     * </p>
     */
    private String children;
    /**
     * <p>
     * Specifies whether the button is visible on the form.
     * </p>
     */
    private Boolean excluded;
    /**
     * <p>
     * The position of the button.
     * </p>
     */
    private FieldPosition position;

    /**
     * <p>
     * Describes the button's properties.
     * </p>
     * 
     * @param children
     *        Describes the button's properties.
     */

    public void setChildren(String children) {
        this.children = children;
    }

    /**
     * <p>
     * Describes the button's properties.
     * </p>
     * 
     * @return Describes the button's properties.
     */

    public String getChildren() {
        return this.children;
    }

    /**
     * <p>
     * Describes the button's properties.
     * </p>
     * 
     * @param children
     *        Describes the button's properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormButton withChildren(String children) {
        setChildren(children);
        return this;
    }

    /**
     * <p>
     * Specifies whether the button is visible on the form.
     * </p>
     * 
     * @param excluded
     *        Specifies whether the button is visible on the form.
     */

    public void setExcluded(Boolean excluded) {
        this.excluded = excluded;
    }

    /**
     * <p>
     * Specifies whether the button is visible on the form.
     * </p>
     * 
     * @return Specifies whether the button is visible on the form.
     */

    public Boolean getExcluded() {
        return this.excluded;
    }

    /**
     * <p>
     * Specifies whether the button is visible on the form.
     * </p>
     * 
     * @param excluded
     *        Specifies whether the button is visible on the form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormButton withExcluded(Boolean excluded) {
        setExcluded(excluded);
        return this;
    }

    /**
     * <p>
     * Specifies whether the button is visible on the form.
     * </p>
     * 
     * @return Specifies whether the button is visible on the form.
     */

    public Boolean isExcluded() {
        return this.excluded;
    }

    /**
     * <p>
     * The position of the button.
     * </p>
     * 
     * @param position
     *        The position of the button.
     */

    public void setPosition(FieldPosition position) {
        this.position = position;
    }

    /**
     * <p>
     * The position of the button.
     * </p>
     * 
     * @return The position of the button.
     */

    public FieldPosition getPosition() {
        return this.position;
    }

    /**
     * <p>
     * The position of the button.
     * </p>
     * 
     * @param position
     *        The position of the button.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormButton withPosition(FieldPosition position) {
        setPosition(position);
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
        if (getChildren() != null)
            sb.append("Children: ").append(getChildren()).append(",");
        if (getExcluded() != null)
            sb.append("Excluded: ").append(getExcluded()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FormButton == false)
            return false;
        FormButton other = (FormButton) obj;
        if (other.getChildren() == null ^ this.getChildren() == null)
            return false;
        if (other.getChildren() != null && other.getChildren().equals(this.getChildren()) == false)
            return false;
        if (other.getExcluded() == null ^ this.getExcluded() == null)
            return false;
        if (other.getExcluded() != null && other.getExcluded().equals(this.getExcluded()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChildren() == null) ? 0 : getChildren().hashCode());
        hashCode = prime * hashCode + ((getExcluded() == null) ? 0 : getExcluded().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        return hashCode;
    }

    @Override
    public FormButton clone() {
        try {
            return (FormButton) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.FormButtonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
