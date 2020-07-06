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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeTheme" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeThemeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account that contains the theme that you're describing.
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
     * The version number for the version to describe. If a <code>VersionNumber</code> parameter value isn't provided,
     * the latest version of the theme is described.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The alias of the theme that you want to describe. If you name a specific alias, you describe the version that the
     * alias points to. You can specify the latest version of the theme by providing the keyword <code>$LATEST</code> in
     * the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't apply to themes.
     * </p>
     */
    private String aliasName;

    /**
     * <p>
     * The ID of the AWS account that contains the theme that you're describing.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the theme that you're describing.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the theme that you're describing.
     * </p>
     * 
     * @return The ID of the AWS account that contains the theme that you're describing.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the theme that you're describing.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the theme that you're describing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThemeRequest withAwsAccountId(String awsAccountId) {
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

    public DescribeThemeRequest withThemeId(String themeId) {
        setThemeId(themeId);
        return this;
    }

    /**
     * <p>
     * The version number for the version to describe. If a <code>VersionNumber</code> parameter value isn't provided,
     * the latest version of the theme is described.
     * </p>
     * 
     * @param versionNumber
     *        The version number for the version to describe. If a <code>VersionNumber</code> parameter value isn't
     *        provided, the latest version of the theme is described.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number for the version to describe. If a <code>VersionNumber</code> parameter value isn't provided,
     * the latest version of the theme is described.
     * </p>
     * 
     * @return The version number for the version to describe. If a <code>VersionNumber</code> parameter value isn't
     *         provided, the latest version of the theme is described.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number for the version to describe. If a <code>VersionNumber</code> parameter value isn't provided,
     * the latest version of the theme is described.
     * </p>
     * 
     * @param versionNumber
     *        The version number for the version to describe. If a <code>VersionNumber</code> parameter value isn't
     *        provided, the latest version of the theme is described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThemeRequest withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * The alias of the theme that you want to describe. If you name a specific alias, you describe the version that the
     * alias points to. You can specify the latest version of the theme by providing the keyword <code>$LATEST</code> in
     * the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't apply to themes.
     * </p>
     * 
     * @param aliasName
     *        The alias of the theme that you want to describe. If you name a specific alias, you describe the version
     *        that the alias points to. You can specify the latest version of the theme by providing the keyword
     *        <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't
     *        apply to themes.
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * The alias of the theme that you want to describe. If you name a specific alias, you describe the version that the
     * alias points to. You can specify the latest version of the theme by providing the keyword <code>$LATEST</code> in
     * the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't apply to themes.
     * </p>
     * 
     * @return The alias of the theme that you want to describe. If you name a specific alias, you describe the version
     *         that the alias points to. You can specify the latest version of the theme by providing the keyword
     *         <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't
     *         apply to themes.
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * The alias of the theme that you want to describe. If you name a specific alias, you describe the version that the
     * alias points to. You can specify the latest version of the theme by providing the keyword <code>$LATEST</code> in
     * the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't apply to themes.
     * </p>
     * 
     * @param aliasName
     *        The alias of the theme that you want to describe. If you name a specific alias, you describe the version
     *        that the alias points to. You can specify the latest version of the theme by providing the keyword
     *        <code>$LATEST</code> in the <code>AliasName</code> parameter. The keyword <code>$PUBLISHED</code> doesn't
     *        apply to themes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThemeRequest withAliasName(String aliasName) {
        setAliasName(aliasName);
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
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getAliasName() != null)
            sb.append("AliasName: ").append(getAliasName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeThemeRequest == false)
            return false;
        DescribeThemeRequest other = (DescribeThemeRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getThemeId() == null ^ this.getThemeId() == null)
            return false;
        if (other.getThemeId() != null && other.getThemeId().equals(this.getThemeId()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getThemeId() == null) ? 0 : getThemeId().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeThemeRequest clone() {
        return (DescribeThemeRequest) super.clone();
    }

}
