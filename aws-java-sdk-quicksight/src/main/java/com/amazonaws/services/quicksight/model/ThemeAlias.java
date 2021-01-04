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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An alias for a theme.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ThemeAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThemeAlias implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the theme alias.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The display name of the theme alias.
     * </p>
     */
    private String aliasName;
    /**
     * <p>
     * The version number of the theme alias.
     * </p>
     */
    private Long themeVersionNumber;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the theme alias.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the theme alias.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the theme alias.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the theme alias.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the theme alias.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the theme alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeAlias withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The display name of the theme alias.
     * </p>
     * 
     * @param aliasName
     *        The display name of the theme alias.
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * The display name of the theme alias.
     * </p>
     * 
     * @return The display name of the theme alias.
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * The display name of the theme alias.
     * </p>
     * 
     * @param aliasName
     *        The display name of the theme alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeAlias withAliasName(String aliasName) {
        setAliasName(aliasName);
        return this;
    }

    /**
     * <p>
     * The version number of the theme alias.
     * </p>
     * 
     * @param themeVersionNumber
     *        The version number of the theme alias.
     */

    public void setThemeVersionNumber(Long themeVersionNumber) {
        this.themeVersionNumber = themeVersionNumber;
    }

    /**
     * <p>
     * The version number of the theme alias.
     * </p>
     * 
     * @return The version number of the theme alias.
     */

    public Long getThemeVersionNumber() {
        return this.themeVersionNumber;
    }

    /**
     * <p>
     * The version number of the theme alias.
     * </p>
     * 
     * @param themeVersionNumber
     *        The version number of the theme alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeAlias withThemeVersionNumber(Long themeVersionNumber) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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

        if (obj instanceof ThemeAlias == false)
            return false;
        ThemeAlias other = (ThemeAlias) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        hashCode = prime * hashCode + ((getThemeVersionNumber() == null) ? 0 : getThemeVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public ThemeAlias clone() {
        try {
            return (ThemeAlias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ThemeAliasMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
