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
 * A version of a theme.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ThemeVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThemeVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version number of the theme.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The description of the theme.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon QuickSight-defined ID of the theme that a custom theme inherits from. All themes initially inherit
     * from a default QuickSight theme.
     * </p>
     */
    private String baseThemeId;
    /**
     * <p>
     * The date and time that this theme version was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The theme configuration, which contains all the theme display properties.
     * </p>
     */
    private ThemeConfiguration configuration;
    /**
     * <p>
     * Errors associated with the theme.
     * </p>
     */
    private java.util.List<ThemeError> errors;
    /**
     * <p>
     * The status of the theme version.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The version number of the theme.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the theme.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number of the theme.
     * </p>
     * 
     * @return The version number of the theme.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number of the theme.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeVersion withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

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

    public ThemeVersion withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The description of the theme.
     * </p>
     * 
     * @param description
     *        The description of the theme.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the theme.
     * </p>
     * 
     * @return The description of the theme.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the theme.
     * </p>
     * 
     * @param description
     *        The description of the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeVersion withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight-defined ID of the theme that a custom theme inherits from. All themes initially inherit
     * from a default QuickSight theme.
     * </p>
     * 
     * @param baseThemeId
     *        The Amazon QuickSight-defined ID of the theme that a custom theme inherits from. All themes initially
     *        inherit from a default QuickSight theme.
     */

    public void setBaseThemeId(String baseThemeId) {
        this.baseThemeId = baseThemeId;
    }

    /**
     * <p>
     * The Amazon QuickSight-defined ID of the theme that a custom theme inherits from. All themes initially inherit
     * from a default QuickSight theme.
     * </p>
     * 
     * @return The Amazon QuickSight-defined ID of the theme that a custom theme inherits from. All themes initially
     *         inherit from a default QuickSight theme.
     */

    public String getBaseThemeId() {
        return this.baseThemeId;
    }

    /**
     * <p>
     * The Amazon QuickSight-defined ID of the theme that a custom theme inherits from. All themes initially inherit
     * from a default QuickSight theme.
     * </p>
     * 
     * @param baseThemeId
     *        The Amazon QuickSight-defined ID of the theme that a custom theme inherits from. All themes initially
     *        inherit from a default QuickSight theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeVersion withBaseThemeId(String baseThemeId) {
        setBaseThemeId(baseThemeId);
        return this;
    }

    /**
     * <p>
     * The date and time that this theme version was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that this theme version was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time that this theme version was created.
     * </p>
     * 
     * @return The date and time that this theme version was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time that this theme version was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that this theme version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeVersion withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The theme configuration, which contains all the theme display properties.
     * </p>
     * 
     * @param configuration
     *        The theme configuration, which contains all the theme display properties.
     */

    public void setConfiguration(ThemeConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The theme configuration, which contains all the theme display properties.
     * </p>
     * 
     * @return The theme configuration, which contains all the theme display properties.
     */

    public ThemeConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The theme configuration, which contains all the theme display properties.
     * </p>
     * 
     * @param configuration
     *        The theme configuration, which contains all the theme display properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeVersion withConfiguration(ThemeConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * Errors associated with the theme.
     * </p>
     * 
     * @return Errors associated with the theme.
     */

    public java.util.List<ThemeError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Errors associated with the theme.
     * </p>
     * 
     * @param errors
     *        Errors associated with the theme.
     */

    public void setErrors(java.util.Collection<ThemeError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<ThemeError>(errors);
    }

    /**
     * <p>
     * Errors associated with the theme.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Errors associated with the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeVersion withErrors(ThemeError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<ThemeError>(errors.length));
        }
        for (ThemeError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Errors associated with the theme.
     * </p>
     * 
     * @param errors
     *        Errors associated with the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThemeVersion withErrors(java.util.Collection<ThemeError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * The status of the theme version.
     * </p>
     * 
     * @param status
     *        The status of the theme version.
     * @see ResourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the theme version.
     * </p>
     * 
     * @return The status of the theme version.
     * @see ResourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the theme version.
     * </p>
     * 
     * @param status
     *        The status of the theme version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public ThemeVersion withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the theme version.
     * </p>
     * 
     * @param status
     *        The status of the theme version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public ThemeVersion withStatus(ResourceStatus status) {
        this.status = status.toString();
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
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getBaseThemeId() != null)
            sb.append("BaseThemeId: ").append(getBaseThemeId()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThemeVersion == false)
            return false;
        ThemeVersion other = (ThemeVersion) obj;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBaseThemeId() == null ^ this.getBaseThemeId() == null)
            return false;
        if (other.getBaseThemeId() != null && other.getBaseThemeId().equals(this.getBaseThemeId()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBaseThemeId() == null) ? 0 : getBaseThemeId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ThemeVersion clone() {
        try {
            return (ThemeVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ThemeVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
