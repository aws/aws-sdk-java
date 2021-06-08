/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateTheme" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateThemeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account that contains the theme that you're updating.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID for the theme.
     * </p>
     */
    private String themeId;
    /**
     * <p>
     * The name for the theme.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The theme ID, defined by Amazon QuickSight, that a custom theme inherits from. All themes initially inherit from
     * a default QuickSight theme.
     * </p>
     */
    private String baseThemeId;
    /**
     * <p>
     * A description of the theme version that you're updating Every time that you call <code>UpdateTheme</code>, you
     * create a new version of the theme. Each version of the theme maintains a description of the version in
     * <code>VersionDescription</code>.
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
     * The ID of the AWS account that contains the theme that you're updating.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the theme that you're updating.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the theme that you're updating.
     * </p>
     * 
     * @return The ID of the AWS account that contains the theme that you're updating.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the theme that you're updating.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the theme that you're updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID for the theme.
     * </p>
     * 
     * @param themeId
     *        The ID for the theme.
     */

    public void setThemeId(String themeId) {
        this.themeId = themeId;
    }

    /**
     * <p>
     * The ID for the theme.
     * </p>
     * 
     * @return The ID for the theme.
     */

    public String getThemeId() {
        return this.themeId;
    }

    /**
     * <p>
     * The ID for the theme.
     * </p>
     * 
     * @param themeId
     *        The ID for the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeRequest withThemeId(String themeId) {
        setThemeId(themeId);
        return this;
    }

    /**
     * <p>
     * The name for the theme.
     * </p>
     * 
     * @param name
     *        The name for the theme.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the theme.
     * </p>
     * 
     * @return The name for the theme.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the theme.
     * </p>
     * 
     * @param name
     *        The name for the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The theme ID, defined by Amazon QuickSight, that a custom theme inherits from. All themes initially inherit from
     * a default QuickSight theme.
     * </p>
     * 
     * @param baseThemeId
     *        The theme ID, defined by Amazon QuickSight, that a custom theme inherits from. All themes initially
     *        inherit from a default QuickSight theme.
     */

    public void setBaseThemeId(String baseThemeId) {
        this.baseThemeId = baseThemeId;
    }

    /**
     * <p>
     * The theme ID, defined by Amazon QuickSight, that a custom theme inherits from. All themes initially inherit from
     * a default QuickSight theme.
     * </p>
     * 
     * @return The theme ID, defined by Amazon QuickSight, that a custom theme inherits from. All themes initially
     *         inherit from a default QuickSight theme.
     */

    public String getBaseThemeId() {
        return this.baseThemeId;
    }

    /**
     * <p>
     * The theme ID, defined by Amazon QuickSight, that a custom theme inherits from. All themes initially inherit from
     * a default QuickSight theme.
     * </p>
     * 
     * @param baseThemeId
     *        The theme ID, defined by Amazon QuickSight, that a custom theme inherits from. All themes initially
     *        inherit from a default QuickSight theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeRequest withBaseThemeId(String baseThemeId) {
        setBaseThemeId(baseThemeId);
        return this;
    }

    /**
     * <p>
     * A description of the theme version that you're updating Every time that you call <code>UpdateTheme</code>, you
     * create a new version of the theme. Each version of the theme maintains a description of the version in
     * <code>VersionDescription</code>.
     * </p>
     * 
     * @param versionDescription
     *        A description of the theme version that you're updating Every time that you call <code>UpdateTheme</code>,
     *        you create a new version of the theme. Each version of the theme maintains a description of the version in
     *        <code>VersionDescription</code>.
     */

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * A description of the theme version that you're updating Every time that you call <code>UpdateTheme</code>, you
     * create a new version of the theme. Each version of the theme maintains a description of the version in
     * <code>VersionDescription</code>.
     * </p>
     * 
     * @return A description of the theme version that you're updating Every time that you call <code>UpdateTheme</code>
     *         , you create a new version of the theme. Each version of the theme maintains a description of the version
     *         in <code>VersionDescription</code>.
     */

    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * <p>
     * A description of the theme version that you're updating Every time that you call <code>UpdateTheme</code>, you
     * create a new version of the theme. Each version of the theme maintains a description of the version in
     * <code>VersionDescription</code>.
     * </p>
     * 
     * @param versionDescription
     *        A description of the theme version that you're updating Every time that you call <code>UpdateTheme</code>,
     *        you create a new version of the theme. Each version of the theme maintains a description of the version in
     *        <code>VersionDescription</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeRequest withVersionDescription(String versionDescription) {
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

    public UpdateThemeRequest withConfiguration(ThemeConfiguration configuration) {
        setConfiguration(configuration);
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
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateThemeRequest == false)
            return false;
        UpdateThemeRequest other = (UpdateThemeRequest) obj;
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
        return hashCode;
    }

    @Override
    public UpdateThemeRequest clone() {
        return (UpdateThemeRequest) super.clone();
    }

}
