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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateThemeAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateThemeAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account that contains the theme for the new theme alias.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * An ID for the theme alias.
     * </p>
     */
    private String themeId;
    /**
     * <p>
     * The name that you want to give to the theme alias that you are creating. The alias name can't begin with a
     * <code>$</code>. Alias names that start with <code>$</code> are reserved by Amazon QuickSight.
     * </p>
     */
    private String aliasName;
    /**
     * <p>
     * The version number of the theme.
     * </p>
     */
    private Long themeVersionNumber;

    /**
     * <p>
     * The ID of the AWS account that contains the theme for the new theme alias.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the theme for the new theme alias.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the theme for the new theme alias.
     * </p>
     * 
     * @return The ID of the AWS account that contains the theme for the new theme alias.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the theme for the new theme alias.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the theme for the new theme alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThemeAliasRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * An ID for the theme alias.
     * </p>
     * 
     * @param themeId
     *        An ID for the theme alias.
     */

    public void setThemeId(String themeId) {
        this.themeId = themeId;
    }

    /**
     * <p>
     * An ID for the theme alias.
     * </p>
     * 
     * @return An ID for the theme alias.
     */

    public String getThemeId() {
        return this.themeId;
    }

    /**
     * <p>
     * An ID for the theme alias.
     * </p>
     * 
     * @param themeId
     *        An ID for the theme alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThemeAliasRequest withThemeId(String themeId) {
        setThemeId(themeId);
        return this;
    }

    /**
     * <p>
     * The name that you want to give to the theme alias that you are creating. The alias name can't begin with a
     * <code>$</code>. Alias names that start with <code>$</code> are reserved by Amazon QuickSight.
     * </p>
     * 
     * @param aliasName
     *        The name that you want to give to the theme alias that you are creating. The alias name can't begin with a
     *        <code>$</code>. Alias names that start with <code>$</code> are reserved by Amazon QuickSight.
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * The name that you want to give to the theme alias that you are creating. The alias name can't begin with a
     * <code>$</code>. Alias names that start with <code>$</code> are reserved by Amazon QuickSight.
     * </p>
     * 
     * @return The name that you want to give to the theme alias that you are creating. The alias name can't begin with
     *         a <code>$</code>. Alias names that start with <code>$</code> are reserved by Amazon QuickSight.
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * The name that you want to give to the theme alias that you are creating. The alias name can't begin with a
     * <code>$</code>. Alias names that start with <code>$</code> are reserved by Amazon QuickSight.
     * </p>
     * 
     * @param aliasName
     *        The name that you want to give to the theme alias that you are creating. The alias name can't begin with a
     *        <code>$</code>. Alias names that start with <code>$</code> are reserved by Amazon QuickSight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThemeAliasRequest withAliasName(String aliasName) {
        setAliasName(aliasName);
        return this;
    }

    /**
     * <p>
     * The version number of the theme.
     * </p>
     * 
     * @param themeVersionNumber
     *        The version number of the theme.
     */

    public void setThemeVersionNumber(Long themeVersionNumber) {
        this.themeVersionNumber = themeVersionNumber;
    }

    /**
     * <p>
     * The version number of the theme.
     * </p>
     * 
     * @return The version number of the theme.
     */

    public Long getThemeVersionNumber() {
        return this.themeVersionNumber;
    }

    /**
     * <p>
     * The version number of the theme.
     * </p>
     * 
     * @param themeVersionNumber
     *        The version number of the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThemeAliasRequest withThemeVersionNumber(Long themeVersionNumber) {
        setThemeVersionNumber(themeVersionNumber);
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
        if (getAliasName() != null)
            sb.append("AliasName: ").append(getAliasName()).append(",");
        if (getThemeVersionNumber() != null)
            sb.append("ThemeVersionNumber: ").append(getThemeVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateThemeAliasRequest == false)
            return false;
        CreateThemeAliasRequest other = (CreateThemeAliasRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getThemeId() == null ^ this.getThemeId() == null)
            return false;
        if (other.getThemeId() != null && other.getThemeId().equals(this.getThemeId()) == false)
            return false;
        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        if (other.getThemeVersionNumber() == null ^ this.getThemeVersionNumber() == null)
            return false;
        if (other.getThemeVersionNumber() != null && other.getThemeVersionNumber().equals(this.getThemeVersionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getThemeId() == null) ? 0 : getThemeId().hashCode());
        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        hashCode = prime * hashCode + ((getThemeVersionNumber() == null) ? 0 : getThemeVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public CreateThemeAliasRequest clone() {
        return (CreateThemeAliasRequest) super.clone();
    }

}
