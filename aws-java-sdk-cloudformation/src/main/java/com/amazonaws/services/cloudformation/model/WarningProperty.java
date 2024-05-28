/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A specific property that is impacted by a warning.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/WarningProperty" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WarningProperty implements Serializable, Cloneable {

    /**
     * <p>
     * The path of the property. For example, if this is for the <code>S3Bucket</code> member of the <code>Code</code>
     * property, the property path would be <code>Code/S3Bucket</code>.
     * </p>
     */
    private String propertyPath;
    /**
     * <p>
     * If <code>true</code>, the specified property is required.
     * </p>
     */
    private Boolean required;
    /**
     * <p>
     * The description of the property from the resource provider schema.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The path of the property. For example, if this is for the <code>S3Bucket</code> member of the <code>Code</code>
     * property, the property path would be <code>Code/S3Bucket</code>.
     * </p>
     * 
     * @param propertyPath
     *        The path of the property. For example, if this is for the <code>S3Bucket</code> member of the
     *        <code>Code</code> property, the property path would be <code>Code/S3Bucket</code>.
     */

    public void setPropertyPath(String propertyPath) {
        this.propertyPath = propertyPath;
    }

    /**
     * <p>
     * The path of the property. For example, if this is for the <code>S3Bucket</code> member of the <code>Code</code>
     * property, the property path would be <code>Code/S3Bucket</code>.
     * </p>
     * 
     * @return The path of the property. For example, if this is for the <code>S3Bucket</code> member of the
     *         <code>Code</code> property, the property path would be <code>Code/S3Bucket</code>.
     */

    public String getPropertyPath() {
        return this.propertyPath;
    }

    /**
     * <p>
     * The path of the property. For example, if this is for the <code>S3Bucket</code> member of the <code>Code</code>
     * property, the property path would be <code>Code/S3Bucket</code>.
     * </p>
     * 
     * @param propertyPath
     *        The path of the property. For example, if this is for the <code>S3Bucket</code> member of the
     *        <code>Code</code> property, the property path would be <code>Code/S3Bucket</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WarningProperty withPropertyPath(String propertyPath) {
        setPropertyPath(propertyPath);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the specified property is required.
     * </p>
     * 
     * @param required
     *        If <code>true</code>, the specified property is required.
     */

    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * If <code>true</code>, the specified property is required.
     * </p>
     * 
     * @return If <code>true</code>, the specified property is required.
     */

    public Boolean getRequired() {
        return this.required;
    }

    /**
     * <p>
     * If <code>true</code>, the specified property is required.
     * </p>
     * 
     * @param required
     *        If <code>true</code>, the specified property is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WarningProperty withRequired(Boolean required) {
        setRequired(required);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the specified property is required.
     * </p>
     * 
     * @return If <code>true</code>, the specified property is required.
     */

    public Boolean isRequired() {
        return this.required;
    }

    /**
     * <p>
     * The description of the property from the resource provider schema.
     * </p>
     * 
     * @param description
     *        The description of the property from the resource provider schema.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the property from the resource provider schema.
     * </p>
     * 
     * @return The description of the property from the resource provider schema.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the property from the resource provider schema.
     * </p>
     * 
     * @param description
     *        The description of the property from the resource provider schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WarningProperty withDescription(String description) {
        setDescription(description);
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
        if (getPropertyPath() != null)
            sb.append("PropertyPath: ").append(getPropertyPath()).append(",");
        if (getRequired() != null)
            sb.append("Required: ").append(getRequired()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WarningProperty == false)
            return false;
        WarningProperty other = (WarningProperty) obj;
        if (other.getPropertyPath() == null ^ this.getPropertyPath() == null)
            return false;
        if (other.getPropertyPath() != null && other.getPropertyPath().equals(this.getPropertyPath()) == false)
            return false;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPropertyPath() == null) ? 0 : getPropertyPath().hashCode());
        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public WarningProperty clone() {
        try {
            return (WarningProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
