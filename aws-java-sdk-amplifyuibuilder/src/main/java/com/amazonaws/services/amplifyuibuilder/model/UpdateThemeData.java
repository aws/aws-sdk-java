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
 * Saves the data binding information for a theme.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/UpdateThemeData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateThemeData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the theme to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the theme to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Describes the properties that can be overriden to customize the theme.
     * </p>
     */
    private java.util.List<ThemeValues> overrides;
    /**
     * <p>
     * A list of key-value pairs that define the theme's properties.
     * </p>
     */
    private java.util.List<ThemeValues> values;

    /**
     * <p>
     * The unique ID of the theme to update.
     * </p>
     * 
     * @param id
     *        The unique ID of the theme to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of the theme to update.
     * </p>
     * 
     * @return The unique ID of the theme to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of the theme to update.
     * </p>
     * 
     * @param id
     *        The unique ID of the theme to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeData withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the theme to update.
     * </p>
     * 
     * @param name
     *        The name of the theme to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the theme to update.
     * </p>
     * 
     * @return The name of the theme to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the theme to update.
     * </p>
     * 
     * @param name
     *        The name of the theme to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeData withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Describes the properties that can be overriden to customize the theme.
     * </p>
     * 
     * @return Describes the properties that can be overriden to customize the theme.
     */

    public java.util.List<ThemeValues> getOverrides() {
        return overrides;
    }

    /**
     * <p>
     * Describes the properties that can be overriden to customize the theme.
     * </p>
     * 
     * @param overrides
     *        Describes the properties that can be overriden to customize the theme.
     */

    public void setOverrides(java.util.Collection<ThemeValues> overrides) {
        if (overrides == null) {
            this.overrides = null;
            return;
        }

        this.overrides = new java.util.ArrayList<ThemeValues>(overrides);
    }

    /**
     * <p>
     * Describes the properties that can be overriden to customize the theme.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOverrides(java.util.Collection)} or {@link #withOverrides(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param overrides
     *        Describes the properties that can be overriden to customize the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeData withOverrides(ThemeValues... overrides) {
        if (this.overrides == null) {
            setOverrides(new java.util.ArrayList<ThemeValues>(overrides.length));
        }
        for (ThemeValues ele : overrides) {
            this.overrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the properties that can be overriden to customize the theme.
     * </p>
     * 
     * @param overrides
     *        Describes the properties that can be overriden to customize the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeData withOverrides(java.util.Collection<ThemeValues> overrides) {
        setOverrides(overrides);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that define the theme's properties.
     * </p>
     * 
     * @return A list of key-value pairs that define the theme's properties.
     */

    public java.util.List<ThemeValues> getValues() {
        return values;
    }

    /**
     * <p>
     * A list of key-value pairs that define the theme's properties.
     * </p>
     * 
     * @param values
     *        A list of key-value pairs that define the theme's properties.
     */

    public void setValues(java.util.Collection<ThemeValues> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<ThemeValues>(values);
    }

    /**
     * <p>
     * A list of key-value pairs that define the theme's properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        A list of key-value pairs that define the theme's properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeData withValues(ThemeValues... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<ThemeValues>(values.length));
        }
        for (ThemeValues ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that define the theme's properties.
     * </p>
     * 
     * @param values
     *        A list of key-value pairs that define the theme's properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeData withValues(java.util.Collection<ThemeValues> values) {
        setValues(values);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateThemeData == false)
            return false;
        UpdateThemeData other = (UpdateThemeData) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public UpdateThemeData clone() {
        try {
            return (UpdateThemeData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.UpdateThemeDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
