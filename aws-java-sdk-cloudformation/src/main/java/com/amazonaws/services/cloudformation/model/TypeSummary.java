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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains summary information about the specified CloudFormation type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/TypeSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypeSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The kind of type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the type.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The ID of the default version of the type. The default version is used when the type version is not specified.
     * </p>
     * <p>
     * To set the default version of a type, use <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     */
    private String defaultVersionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     */
    private String typeArn;
    /**
     * <p>
     * When the current default version of the type was registered.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * The description of the type.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The kind of type.
     * </p>
     * 
     * @param type
     *        The kind of type.
     * @see RegistryType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * 
     * @return The kind of type.
     * @see RegistryType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * 
     * @param type
     *        The kind of type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public TypeSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The kind of type.
     * </p>
     * 
     * @param type
     *        The kind of type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public TypeSummary withType(RegistryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the type.
     * </p>
     * 
     * @param typeName
     *        The name of the type.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the type.
     * </p>
     * 
     * @return The name of the type.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the type.
     * </p>
     * 
     * @param typeName
     *        The name of the type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The ID of the default version of the type. The default version is used when the type version is not specified.
     * </p>
     * <p>
     * To set the default version of a type, use <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     * 
     * @param defaultVersionId
     *        The ID of the default version of the type. The default version is used when the type version is not
     *        specified.</p>
     *        <p>
     *        To set the default version of a type, use <code> <a>SetTypeDefaultVersion</a> </code>.
     */

    public void setDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
    }

    /**
     * <p>
     * The ID of the default version of the type. The default version is used when the type version is not specified.
     * </p>
     * <p>
     * To set the default version of a type, use <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     * 
     * @return The ID of the default version of the type. The default version is used when the type version is not
     *         specified.</p>
     *         <p>
     *         To set the default version of a type, use <code> <a>SetTypeDefaultVersion</a> </code>.
     */

    public String getDefaultVersionId() {
        return this.defaultVersionId;
    }

    /**
     * <p>
     * The ID of the default version of the type. The default version is used when the type version is not specified.
     * </p>
     * <p>
     * To set the default version of a type, use <code> <a>SetTypeDefaultVersion</a> </code>.
     * </p>
     * 
     * @param defaultVersionId
     *        The ID of the default version of the type. The default version is used when the type version is not
     *        specified.</p>
     *        <p>
     *        To set the default version of a type, use <code> <a>SetTypeDefaultVersion</a> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withDefaultVersionId(String defaultVersionId) {
        setDefaultVersionId(defaultVersionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * 
     * @param typeArn
     *        The Amazon Resource Name (ARN) of the type.
     */

    public void setTypeArn(String typeArn) {
        this.typeArn = typeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the type.
     */

    public String getTypeArn() {
        return this.typeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type.
     * </p>
     * 
     * @param typeArn
     *        The Amazon Resource Name (ARN) of the type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withTypeArn(String typeArn) {
        setTypeArn(typeArn);
        return this;
    }

    /**
     * <p>
     * When the current default version of the type was registered.
     * </p>
     * 
     * @param lastUpdated
     *        When the current default version of the type was registered.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * When the current default version of the type was registered.
     * </p>
     * 
     * @return When the current default version of the type was registered.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * When the current default version of the type was registered.
     * </p>
     * 
     * @param lastUpdated
     *        When the current default version of the type was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The description of the type.
     * </p>
     * 
     * @param description
     *        The description of the type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the type.
     * </p>
     * 
     * @return The description of the type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the type.
     * </p>
     * 
     * @param description
     *        The description of the type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeSummary withDescription(String description) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getDefaultVersionId() != null)
            sb.append("DefaultVersionId: ").append(getDefaultVersionId()).append(",");
        if (getTypeArn() != null)
            sb.append("TypeArn: ").append(getTypeArn()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
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

        if (obj instanceof TypeSummary == false)
            return false;
        TypeSummary other = (TypeSummary) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getDefaultVersionId() == null ^ this.getDefaultVersionId() == null)
            return false;
        if (other.getDefaultVersionId() != null && other.getDefaultVersionId().equals(this.getDefaultVersionId()) == false)
            return false;
        if (other.getTypeArn() == null ^ this.getTypeArn() == null)
            return false;
        if (other.getTypeArn() != null && other.getTypeArn().equals(this.getTypeArn()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersionId() == null) ? 0 : getDefaultVersionId().hashCode());
        hashCode = prime * hashCode + ((getTypeArn() == null) ? 0 : getTypeArn().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public TypeSummary clone() {
        try {
            return (TypeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
