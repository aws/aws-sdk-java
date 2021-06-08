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
 * Summary information about a theme.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/Theme" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Theme implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the theme.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name that the user gives to the theme.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier that the user gives to the theme.
     * </p>
     */
    private String themeId;

    private ThemeVersion version;
    /**
     * <p>
     * The date and time that the theme was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The date and time that the theme was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The type of theme, based on how it was created. Valid values include: <code>QUICKSIGHT</code> and
     * <code>CUSTOM</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the theme.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the theme.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the theme.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the theme.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the theme.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name that the user gives to the theme.
     * </p>
     * 
     * @param name
     *        The name that the user gives to the theme.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that the user gives to the theme.
     * </p>
     * 
     * @return The name that the user gives to the theme.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that the user gives to the theme.
     * </p>
     * 
     * @param name
     *        The name that the user gives to the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier that the user gives to the theme.
     * </p>
     * 
     * @param themeId
     *        The identifier that the user gives to the theme.
     */

    public void setThemeId(String themeId) {
        this.themeId = themeId;
    }

    /**
     * <p>
     * The identifier that the user gives to the theme.
     * </p>
     * 
     * @return The identifier that the user gives to the theme.
     */

    public String getThemeId() {
        return this.themeId;
    }

    /**
     * <p>
     * The identifier that the user gives to the theme.
     * </p>
     * 
     * @param themeId
     *        The identifier that the user gives to the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withThemeId(String themeId) {
        setThemeId(themeId);
        return this;
    }

    /**
     * @param version
     */

    public void setVersion(ThemeVersion version) {
        this.version = version;
    }

    /**
     * @return
     */

    public ThemeVersion getVersion() {
        return this.version;
    }

    /**
     * @param version
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withVersion(ThemeVersion version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The date and time that the theme was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the theme was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time that the theme was created.
     * </p>
     * 
     * @return The date and time that the theme was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time that the theme was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that the theme was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the theme was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that the theme was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that the theme was last updated.
     * </p>
     * 
     * @return The date and time that the theme was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that the theme was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that the theme was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Theme withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The type of theme, based on how it was created. Valid values include: <code>QUICKSIGHT</code> and
     * <code>CUSTOM</code>.
     * </p>
     * 
     * @param type
     *        The type of theme, based on how it was created. Valid values include: <code>QUICKSIGHT</code> and
     *        <code>CUSTOM</code>.
     * @see ThemeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of theme, based on how it was created. Valid values include: <code>QUICKSIGHT</code> and
     * <code>CUSTOM</code>.
     * </p>
     * 
     * @return The type of theme, based on how it was created. Valid values include: <code>QUICKSIGHT</code> and
     *         <code>CUSTOM</code>.
     * @see ThemeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of theme, based on how it was created. Valid values include: <code>QUICKSIGHT</code> and
     * <code>CUSTOM</code>.
     * </p>
     * 
     * @param type
     *        The type of theme, based on how it was created. Valid values include: <code>QUICKSIGHT</code> and
     *        <code>CUSTOM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThemeType
     */

    public Theme withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of theme, based on how it was created. Valid values include: <code>QUICKSIGHT</code> and
     * <code>CUSTOM</code>.
     * </p>
     * 
     * @param type
     *        The type of theme, based on how it was created. Valid values include: <code>QUICKSIGHT</code> and
     *        <code>CUSTOM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThemeType
     */

    public Theme withType(ThemeType type) {
        this.type = type.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getThemeId() != null)
            sb.append("ThemeId: ").append(getThemeId()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
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
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getThemeId() == null ^ this.getThemeId() == null)
            return false;
        if (other.getThemeId() != null && other.getThemeId().equals(this.getThemeId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getThemeId() == null) ? 0 : getThemeId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
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
        com.amazonaws.services.quicksight.model.transform.ThemeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
