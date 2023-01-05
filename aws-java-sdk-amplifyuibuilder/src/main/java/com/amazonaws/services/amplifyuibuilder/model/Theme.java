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
 * A theme is a collection of style settings that apply globally to the components associated with an Amplify
 * application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/Theme" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Theme implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID for the Amplify app associated with the theme.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The time that the theme was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The ID for the theme.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The time that the theme was modified.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * The name of the theme.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Describes the properties that can be overriden to customize a theme.
     * </p>
     */
    private java.util.List<ThemeValues> overrides;
    /**
     * <p>
     * One or more key-value pairs to use when tagging the theme.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A list of key-value pairs that defines the properties of the theme.
     * </p>
     */
    private java.util.List<ThemeValues> values;

    /**
     * <p>
     * The unique ID for the Amplify app associated with the theme.
     * </p>
     * 
     * @param appId
     *        The unique ID for the Amplify app associated with the theme.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID for the Amplify app associated with the theme.
     * </p>
     * 
     * @return The unique ID for the Amplify app associated with the theme.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The unique ID for the Amplify app associated with the theme.
     * </p>
     * 
     * @param appId
     *        The unique ID for the Amplify app associated with the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The time that the theme was created.
     * </p>
     * 
     * @param createdAt
     *        The time that the theme was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time that the theme was created.
     * </p>
     * 
     * @return The time that the theme was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time that the theme was created.
     * </p>
     * 
     * @param createdAt
     *        The time that the theme was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment that is a part of the Amplify app.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     * 
     * @return The name of the backend environment that is a part of the Amplify app.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment that is a part of the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The ID for the theme.
     * </p>
     * 
     * @param id
     *        The ID for the theme.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for the theme.
     * </p>
     * 
     * @return The ID for the theme.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for the theme.
     * </p>
     * 
     * @param id
     *        The ID for the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The time that the theme was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time that the theme was modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The time that the theme was modified.
     * </p>
     * 
     * @return The time that the theme was modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The time that the theme was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time that the theme was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * The name of the theme.
     * </p>
     * 
     * @param name
     *        The name of the theme.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the theme.
     * </p>
     * 
     * @return The name of the theme.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the theme.
     * </p>
     * 
     * @param name
     *        The name of the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Describes the properties that can be overriden to customize a theme.
     * </p>
     * 
     * @return Describes the properties that can be overriden to customize a theme.
     */

    public java.util.List<ThemeValues> getOverrides() {
        return overrides;
    }

    /**
     * <p>
     * Describes the properties that can be overriden to customize a theme.
     * </p>
     * 
     * @param overrides
     *        Describes the properties that can be overriden to customize a theme.
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
     * Describes the properties that can be overriden to customize a theme.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOverrides(java.util.Collection)} or {@link #withOverrides(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param overrides
     *        Describes the properties that can be overriden to customize a theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withOverrides(ThemeValues... overrides) {
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
     * Describes the properties that can be overriden to customize a theme.
     * </p>
     * 
     * @param overrides
     *        Describes the properties that can be overriden to customize a theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withOverrides(java.util.Collection<ThemeValues> overrides) {
        setOverrides(overrides);
        return this;
    }

    /**
     * <p>
     * One or more key-value pairs to use when tagging the theme.
     * </p>
     * 
     * @return One or more key-value pairs to use when tagging the theme.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more key-value pairs to use when tagging the theme.
     * </p>
     * 
     * @param tags
     *        One or more key-value pairs to use when tagging the theme.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more key-value pairs to use when tagging the theme.
     * </p>
     * 
     * @param tags
     *        One or more key-value pairs to use when tagging the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Theme#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Theme addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that defines the properties of the theme.
     * </p>
     * 
     * @return A list of key-value pairs that defines the properties of the theme.
     */

    public java.util.List<ThemeValues> getValues() {
        return values;
    }

    /**
     * <p>
     * A list of key-value pairs that defines the properties of the theme.
     * </p>
     * 
     * @param values
     *        A list of key-value pairs that defines the properties of the theme.
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
     * A list of key-value pairs that defines the properties of the theme.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        A list of key-value pairs that defines the properties of the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withValues(ThemeValues... values) {
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
     * A list of key-value pairs that defines the properties of the theme.
     * </p>
     * 
     * @param values
     *        A list of key-value pairs that defines the properties of the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withValues(java.util.Collection<ThemeValues> values) {
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof Theme == false)
            return false;
        Theme other = (Theme) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public Theme clone() {
        try {
            return (Theme) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ThemeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
