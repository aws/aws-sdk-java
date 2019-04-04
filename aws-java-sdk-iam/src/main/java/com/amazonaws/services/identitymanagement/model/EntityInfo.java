/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains details about the specified entity (user or role).
 * </p>
 * <p>
 * This data type is an element of the <a>EntityDetails</a> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/EntityInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityInfo implements Serializable, Cloneable {

    private String arn;
    /**
     * <p>
     * The name of the entity (user or role).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of entity (user or role).
     * </p>
     */
    private String type;
    /**
     * <p>
     * The identifier of the entity (user or role).
     * </p>
     */
    private String id;
    /**
     * <p>
     * The path to the entity (user or role). For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     */
    private String path;

    /**
     * @param arn
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * @return
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * @param arn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityInfo withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the entity (user or role).
     * </p>
     * 
     * @param name
     *        The name of the entity (user or role).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the entity (user or role).
     * </p>
     * 
     * @return The name of the entity (user or role).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the entity (user or role).
     * </p>
     * 
     * @param name
     *        The name of the entity (user or role).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of entity (user or role).
     * </p>
     * 
     * @param type
     *        The type of entity (user or role).
     * @see PolicyOwnerEntityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of entity (user or role).
     * </p>
     * 
     * @return The type of entity (user or role).
     * @see PolicyOwnerEntityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of entity (user or role).
     * </p>
     * 
     * @param type
     *        The type of entity (user or role).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyOwnerEntityType
     */

    public EntityInfo withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of entity (user or role).
     * </p>
     * 
     * @param type
     *        The type of entity (user or role).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyOwnerEntityType
     */

    public EntityInfo withType(PolicyOwnerEntityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the entity (user or role).
     * </p>
     * 
     * @param id
     *        The identifier of the entity (user or role).
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the entity (user or role).
     * </p>
     * 
     * @return The identifier of the entity (user or role).
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the entity (user or role).
     * </p>
     * 
     * @param id
     *        The identifier of the entity (user or role).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityInfo withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The path to the entity (user or role). For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the entity (user or role). For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the entity (user or role). For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @return The path to the entity (user or role). For more information about paths, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>Using IAM</i> guide.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the entity (user or role). For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     * <i>Using IAM</i> guide.
     * </p>
     * 
     * @param path
     *        The path to the entity (user or role). For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>Using IAM</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityInfo withPath(String path) {
        setPath(path);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityInfo == false)
            return false;
        EntityInfo other = (EntityInfo) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public EntityInfo clone() {
        try {
            return (EntityInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
