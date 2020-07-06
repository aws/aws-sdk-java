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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The theme summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ThemeSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThemeSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * the display name for the theme.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the theme. This ID is unique per AWS Region for each AWS account.
     * </p>
     */
    private String themeId;
    /**
     * <p>
     * The latest version number for the theme.
     * </p>
     */
    private Long latestVersionNumber;
    /**
     * <p>
     * The date and time that this theme was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The last date and time that this theme was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * the display name for the theme.
     * </p>
     * 
     * @param name
     *        the display name for the theme.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * the display name for the theme.
     * </p>
     * 
     * @return the display name for the theme.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * the display name for the theme.
     * </p>
     * 
     * @param name
     *        the display name for the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the theme. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @param themeId
     *        The ID of the theme. This ID is unique per AWS Region for each AWS account.
     */

    public void setThemeId(String themeId) {
        this.themeId = themeId;
    }

    /**
     * <p>
     * The ID of the theme. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @return The ID of the theme. This ID is unique per AWS Region for each AWS account.
     */

    public String getThemeId() {
        return this.themeId;
    }

    /**
     * <p>
     * The ID of the theme. This ID is unique per AWS Region for each AWS account.
     * </p>
     * 
     * @param themeId
     *        The ID of the theme. This ID is unique per AWS Region for each AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeSummary withThemeId(String themeId) {
        setThemeId(themeId);
        return this;
    }

    /**
     * <p>
     * The latest version number for the theme.
     * </p>
     * 
     * @param latestVersionNumber
     *        The latest version number for the theme.
     */

    public void setLatestVersionNumber(Long latestVersionNumber) {
        this.latestVersionNumber = latestVersionNumber;
    }

    /**
     * <p>
     * The latest version number for the theme.
     * </p>
     * 
     * @return The latest version number for the theme.
     */

    public Long getLatestVersionNumber() {
        return this.latestVersionNumber;
    }

    /**
     * <p>
     * The latest version number for the theme.
     * </p>
     * 
     * @param latestVersionNumber
     *        The latest version number for the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeSummary withLatestVersionNumber(Long latestVersionNumber) {
        setLatestVersionNumber(latestVersionNumber);
        return this;
    }

    /**
     * <p>
     * The date and time that this theme was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that this theme was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time that this theme was created.
     * </p>
     * 
     * @return The date and time that this theme was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time that this theme was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that this theme was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The last date and time that this theme was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last date and time that this theme was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last date and time that this theme was updated.
     * </p>
     * 
     * @return The last date and time that this theme was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last date and time that this theme was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last date and time that this theme was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getLatestVersionNumber() != null)
            sb.append("LatestVersionNumber: ").append(getLatestVersionNumber()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThemeSummary == false)
            return false;
        ThemeSummary other = (ThemeSummary) obj;
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
        if (other.getLatestVersionNumber() == null ^ this.getLatestVersionNumber() == null)
            return false;
        if (other.getLatestVersionNumber() != null && other.getLatestVersionNumber().equals(this.getLatestVersionNumber()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
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
        hashCode = prime * hashCode + ((getLatestVersionNumber() == null) ? 0 : getLatestVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public ThemeSummary clone() {
        try {
            return (ThemeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ThemeSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
