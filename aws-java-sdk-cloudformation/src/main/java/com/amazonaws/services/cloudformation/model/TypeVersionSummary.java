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
 * Contains summary information about a specific version of a CloudFormation type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/TypeVersionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypeVersionSummary implements Serializable, Cloneable {

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
     * The ID of a specific version of the type. The version ID is the value at the end of the Amazon Resource Name
     * (ARN) assigned to the type version when it is registered.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type version.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * When the version was registered.
     * </p>
     */
    private java.util.Date timeCreated;
    /**
     * <p>
     * The description of the type version.
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

    public TypeVersionSummary withType(String type) {
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

    public TypeVersionSummary withType(RegistryType type) {
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

    public TypeVersionSummary withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The ID of a specific version of the type. The version ID is the value at the end of the Amazon Resource Name
     * (ARN) assigned to the type version when it is registered.
     * </p>
     * 
     * @param versionId
     *        The ID of a specific version of the type. The version ID is the value at the end of the Amazon Resource
     *        Name (ARN) assigned to the type version when it is registered.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The ID of a specific version of the type. The version ID is the value at the end of the Amazon Resource Name
     * (ARN) assigned to the type version when it is registered.
     * </p>
     * 
     * @return The ID of a specific version of the type. The version ID is the value at the end of the Amazon Resource
     *         Name (ARN) assigned to the type version when it is registered.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The ID of a specific version of the type. The version ID is the value at the end of the Amazon Resource Name
     * (ARN) assigned to the type version when it is registered.
     * </p>
     * 
     * @param versionId
     *        The ID of a specific version of the type. The version ID is the value at the end of the Amazon Resource
     *        Name (ARN) assigned to the type version when it is registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeVersionSummary withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type version.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the type version.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the type version.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the type version.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the type version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeVersionSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * When the version was registered.
     * </p>
     * 
     * @param timeCreated
     *        When the version was registered.
     */

    public void setTimeCreated(java.util.Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    /**
     * <p>
     * When the version was registered.
     * </p>
     * 
     * @return When the version was registered.
     */

    public java.util.Date getTimeCreated() {
        return this.timeCreated;
    }

    /**
     * <p>
     * When the version was registered.
     * </p>
     * 
     * @param timeCreated
     *        When the version was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeVersionSummary withTimeCreated(java.util.Date timeCreated) {
        setTimeCreated(timeCreated);
        return this;
    }

    /**
     * <p>
     * The description of the type version.
     * </p>
     * 
     * @param description
     *        The description of the type version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the type version.
     * </p>
     * 
     * @return The description of the type version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the type version.
     * </p>
     * 
     * @param description
     *        The description of the type version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeVersionSummary withDescription(String description) {
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
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getTimeCreated() != null)
            sb.append("TimeCreated: ").append(getTimeCreated()).append(",");
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

        if (obj instanceof TypeVersionSummary == false)
            return false;
        TypeVersionSummary other = (TypeVersionSummary) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTimeCreated() == null ^ this.getTimeCreated() == null)
            return false;
        if (other.getTimeCreated() != null && other.getTimeCreated().equals(this.getTimeCreated()) == false)
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
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTimeCreated() == null) ? 0 : getTimeCreated().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public TypeVersionSummary clone() {
        try {
            return (TypeVersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
