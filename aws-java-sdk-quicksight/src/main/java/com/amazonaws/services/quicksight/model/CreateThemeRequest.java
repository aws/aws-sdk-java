/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateTheme" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateThemeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account where you want to store the new theme.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * An ID for the theme that you want to create. The theme ID is unique per AWS Region in each AWS account.
     * </p>
     */
    private String themeId;
    /**
     * <p>
     * A display name for the theme.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the theme that a custom theme will inherit from. All themes inherit from one of the starting themes
     * defined by Amazon QuickSight. For a list of the starting themes, use <code>ListThemes</code> or choose
     * <b>Themes</b> from within a QuickSight analysis.
     * </p>
     */
    private String baseThemeId;
    /**
     * <p>
     * A description of the first version of the theme that you're creating. Every time <code>UpdateTheme</code> is
     * called, a new version is created. Each version of the theme has a description of the version in the
     * <code>VersionDescription</code> field.
     * </p>
     */
    private String versionDescription;
    /**
     * <p>
     * The theme configuration, which contains the theme display properties.
     * </p>
     */
    private ThemeConfiguration configuration;
    /**
     * <p>
     * A valid grouping of resource permissions to apply to the new theme.
     * </p>
     */
    private java.util.List<ResourcePermission> permissions;
    /**
     * <p>
     * A map of the key-value pairs for the resource tag or tags that you want to add to the resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the AWS account where you want to store the new theme.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account where you want to store the new theme.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account where you want to store the new theme.
     * </p>
     * 
     * @return The ID of the AWS account where you want to store the new theme.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account where you want to store the new theme.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account where you want to store the new theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThemeRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * An ID for the theme that you want to create. The theme ID is unique per AWS Region in each AWS account.
     * </p>
     * 
     * @param themeId
     *        An ID for the theme that you want to create. The theme ID is unique per AWS Region in each AWS account.
     */

    public void setThemeId(String themeId) {
        this.themeId = themeId;
    }

    /**
     * <p>
     * An ID for the theme that you want to create. The theme ID is unique per AWS Region in each AWS account.
     * </p>
     * 
     * @return An ID for the theme that you want to create. The theme ID is unique per AWS Region in each AWS account.
     */

    public String getThemeId() {
        return this.themeId;
    }

    /**
     * <p>
     * An ID for the theme that you want to create. The theme ID is unique per AWS Region in each AWS account.
     * </p>
     * 
     * @param themeId
     *        An ID for the theme that you want to create. The theme ID is unique per AWS Region in each AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThemeRequest withThemeId(String themeId) {
        setThemeId(themeId);
        return this;
    }

    /**
     * <p>
     * A display name for the theme.
     * </p>
     * 
     * @param name
     *        A display name for the theme.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the theme.
     * </p>
     * 
     * @return A display name for the theme.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A display name for the theme.
     * </p>
     * 
     * @param name
     *        A display name for the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThemeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the theme that a custom theme will inherit from. All themes inherit from one of the starting themes
     * defined by Amazon QuickSight. For a list of the starting themes, use <code>ListThemes</code> or choose
     * <b>Themes</b> from within a QuickSight analysis.
     * </p>
     * 
     * @param baseThemeId
     *        The ID of the theme that a custom theme will inherit from. All themes inherit from one of the starting
     *        themes defined by Amazon QuickSight. For a list of the starting themes, use <code>ListThemes</code> or
     *        choose <b>Themes</b> from within a QuickSight analysis.
     */

    public void setBaseThemeId(String baseThemeId) {
        this.baseThemeId = baseThemeId;
    }

    /**
     * <p>
     * The ID of the theme that a custom theme will inherit from. All themes inherit from one of the starting themes
     * defined by Amazon QuickSight. For a list of the starting themes, use <code>ListThemes</code> or choose
     * <b>Themes</b> from within a QuickSight analysis.
     * </p>
     * 
     * @return The ID of the theme that a custom theme will inherit from. All themes inherit from one of the starting
     *         themes defined by Amazon QuickSight. For a list of the starting themes, use <code>ListThemes</code> or
     *         choose <b>Themes</b> from within a QuickSight analysis.
     */

    public String getBaseThemeId() {
        return this.baseThemeId;
    }

    /**
     * <p>
     * The ID of the theme that a custom theme will inherit from. All themes inherit from one of the starting themes
     * defined by Amazon QuickSight. For a list of the starting themes, use <code>ListThemes</code> or choose
     * <b>Themes</b> from within a QuickSight analysis.
     * </p>
     * 
     * @param baseThemeId
     *        The ID of the theme that a custom theme will inherit from. All themes inherit from one of the starting
     *        themes defined by Amazon QuickSight. For a list of the starting themes, use <code>ListThemes</code> or
     *        choose <b>Themes</b> from within a QuickSight analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThemeRequest withBaseThemeId(String baseThemeId) {
        setBaseThemeId(baseThemeId);
        return this;
    }

    /**
     * <p>
     * A description of the first version of the theme that you're creating. Every time <code>UpdateTheme</code> is
     * called, a new version is created. Each version of the theme has a description of the version in the
     * <code>VersionDescription</code> field.
     * </p>
     * 
     * @param versionDescription
     *        A description of the first version of the theme that you're creating. Every time <code>UpdateTheme</code>
     *        is called, a new version is created. Each version of the theme has a description of the version in the
     *        <code>VersionDescription</code> field.
     */

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * A description of the first version of the theme that you're creating. Every time <code>UpdateTheme</code> is
     * called, a new version is created. Each version of the theme has a description of the version in the
     * <code>VersionDescription</code> field.
     * </p>
     * 
     * @return A description of the first version of the theme that you're creating. Every time <code>UpdateTheme</code>
     *         is called, a new version is created. Each version of the theme has a description of the version in the
     *         <code>VersionDescription</code> field.
     */

    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * <p>
     * A description of the first version of the theme that you're creating. Every time <code>UpdateTheme</code> is
     * called, a new version is created. Each version of the theme has a description of the version in the
     * <code>VersionDescription</code> field.
     * </p>
     * 
     * @param versionDescription
     *        A description of the first version of the theme that you're creating. Every time <code>UpdateTheme</code>
     *        is called, a new version is created. Each version of the theme has a description of the version in the
     *        <code>VersionDescription</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThemeRequest withVersionDescription(String versionDescription) {
        setVersionDescription(versionDescription);
        return this;
    }

    /**
     * <p>
     * The theme configuration, which contains the theme display properties.
     * </p>
     * 
     * @param configuration
     *        The theme configuration, which contains the theme display properties.
     */

    public void setConfiguration(ThemeConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The theme configuration, which contains the theme display properties.
     * </p>
     * 
     * @return The theme configuration, which contains the theme display properties.
     */

    public ThemeConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The theme configuration, which contains the theme display properties.
     * </p>
     * 
     * @param configuration
     *        The theme configuration, which contains the theme display properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThemeRequest withConfiguration(ThemeConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * A valid grouping of resource permissions to apply to the new theme.
     * </p>
     * 
     * @return A valid grouping of resource permissions to apply to the new theme.
     */

    public java.util.List<ResourcePermission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * A valid grouping of resource permissions to apply to the new theme.
     * </p>
     * 
     * @param permissions
     *        A valid grouping of resource permissions to apply to the new theme.
     */

    public void setPermissions(java.util.Collection<ResourcePermission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<ResourcePermission>(permissions);
    }

    /**
     * <p>
     * A valid grouping of resource permissions to apply to the new theme.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        A valid grouping of resource permissions to apply to the new theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThemeRequest withPermissions(ResourcePermission... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<ResourcePermission>(permissions.length));
        }
        for (ResourcePermission ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A valid grouping of resource permissions to apply to the new theme.
     * </p>
     * 
     * @param permissions
     *        A valid grouping of resource permissions to apply to the new theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThemeRequest withPermissions(java.util.Collection<ResourcePermission> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * A map of the key-value pairs for the resource tag or tags that you want to add to the resource.
     * </p>
     * 
     * @return A map of the key-value pairs for the resource tag or tags that you want to add to the resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of the key-value pairs for the resource tag or tags that you want to add to the resource.
     * </p>
     * 
     * @param tags
     *        A map of the key-value pairs for the resource tag or tags that you want to add to the resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A map of the key-value pairs for the resource tag or tags that you want to add to the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A map of the key-value pairs for the resource tag or tags that you want to add to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThemeRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A map of the key-value pairs for the resource tag or tags that you want to add to the resource.
     * </p>
     * 
     * @param tags
     *        A map of the key-value pairs for the resource tag or tags that you want to add to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThemeRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getThemeId() != null)
            sb.append("ThemeId: ").append(getThemeId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getBaseThemeId() != null)
            sb.append("BaseThemeId: ").append(getBaseThemeId()).append(",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: ").append(getVersionDescription()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateThemeRequest == false)
            return false;
        CreateThemeRequest other = (CreateThemeRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getThemeId() == null ^ this.getThemeId() == null)
            return false;
        if (other.getThemeId() != null && other.getThemeId().equals(this.getThemeId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getBaseThemeId() == null ^ this.getBaseThemeId() == null)
            return false;
        if (other.getBaseThemeId() != null && other.getBaseThemeId().equals(this.getBaseThemeId()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getThemeId() == null) ? 0 : getThemeId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getBaseThemeId() == null) ? 0 : getBaseThemeId().hashCode());
        hashCode = prime * hashCode + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateThemeRequest clone() {
        return (CreateThemeRequest) super.clone();
    }

}
