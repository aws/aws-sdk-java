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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateThemeAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateThemeAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account that contains the theme alias that you're updating.
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
     * The name of the theme alias that you want to update.
     * </p>
     */
    private String aliasName;
    /**
     * <p>
     * The version number of the theme that the alias should reference.
     * </p>
     */
    private Long themeVersionNumber;

    /**
     * <p>
     * The ID of the AWS account that contains the theme alias that you're updating.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the theme alias that you're updating.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the theme alias that you're updating.
     * </p>
     * 
     * @return The ID of the AWS account that contains the theme alias that you're updating.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the theme alias that you're updating.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account that contains the theme alias that you're updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeAliasRequest withAwsAccountId(String awsAccountId) {
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

    public UpdateThemeAliasRequest withThemeId(String themeId) {
        setThemeId(themeId);
        return this;
    }

    /**
     * <p>
     * The name of the theme alias that you want to update.
     * </p>
     * 
     * @param aliasName
     *        The name of the theme alias that you want to update.
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * The name of the theme alias that you want to update.
     * </p>
     * 
     * @return The name of the theme alias that you want to update.
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * The name of the theme alias that you want to update.
     * </p>
     * 
     * @param aliasName
     *        The name of the theme alias that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeAliasRequest withAliasName(String aliasName) {
        setAliasName(aliasName);
        return this;
    }

    /**
     * <p>
     * The version number of the theme that the alias should reference.
     * </p>
     * 
     * @param themeVersionNumber
     *        The version number of the theme that the alias should reference.
     */

    public void setThemeVersionNumber(Long themeVersionNumber) {
        this.themeVersionNumber = themeVersionNumber;
    }

    /**
     * <p>
     * The version number of the theme that the alias should reference.
     * </p>
     * 
     * @return The version number of the theme that the alias should reference.
     */

    public Long getThemeVersionNumber() {
        return this.themeVersionNumber;
    }

    /**
     * <p>
     * The version number of the theme that the alias should reference.
     * </p>
     * 
     * @param themeVersionNumber
     *        The version number of the theme that the alias should reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeAliasRequest withThemeVersionNumber(Long themeVersionNumber) {
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

        if (obj instanceof UpdateThemeAliasRequest == false)
            return false;
        UpdateThemeAliasRequest other = (UpdateThemeAliasRequest) obj;
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
    public UpdateThemeAliasRequest clone() {
        return (UpdateThemeAliasRequest) super.clone();
    }

}
