/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The override parameters for a single theme that is imported.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportJobThemeOverrideParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobThemeOverrideParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the theme to apply overrides to.
     * </p>
     */
    private String themeId;
    /**
     * <p>
     * A new name for the theme.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ID of the theme to apply overrides to.
     * </p>
     * 
     * @param themeId
     *        The ID of the theme to apply overrides to.
     */

    public void setThemeId(String themeId) {
        this.themeId = themeId;
    }

    /**
     * <p>
     * The ID of the theme to apply overrides to.
     * </p>
     * 
     * @return The ID of the theme to apply overrides to.
     */

    public String getThemeId() {
        return this.themeId;
    }

    /**
     * <p>
     * The ID of the theme to apply overrides to.
     * </p>
     * 
     * @param themeId
     *        The ID of the theme to apply overrides to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobThemeOverrideParameters withThemeId(String themeId) {
        setThemeId(themeId);
        return this;
    }

    /**
     * <p>
     * A new name for the theme.
     * </p>
     * 
     * @param name
     *        A new name for the theme.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A new name for the theme.
     * </p>
     * 
     * @return A new name for the theme.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A new name for the theme.
     * </p>
     * 
     * @param name
     *        A new name for the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobThemeOverrideParameters withName(String name) {
        setName(name);
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
        if (getThemeId() != null)
            sb.append("ThemeId: ").append(getThemeId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleImportJobThemeOverrideParameters == false)
            return false;
        AssetBundleImportJobThemeOverrideParameters other = (AssetBundleImportJobThemeOverrideParameters) obj;
        if (other.getThemeId() == null ^ this.getThemeId() == null)
            return false;
        if (other.getThemeId() != null && other.getThemeId().equals(this.getThemeId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThemeId() == null) ? 0 : getThemeId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportJobThemeOverrideParameters clone() {
        try {
            return (AssetBundleImportJobThemeOverrideParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportJobThemeOverrideParametersMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
