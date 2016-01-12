/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateRoleRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The path to the role. For more information about paths, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     */
    private String path;
    /**
     * <p>
     * The name of the role to create.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The trust relationship policy document that grants an entity permission
     * to assume the role.
     * </p>
     */
    private String assumeRolePolicyDocument;

    /**
     * <p>
     * The path to the role. For more information about paths, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * 
     * @param path
     *        The path to the role. For more information about paths, see <a
     *        href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *        >IAM Identifiers</a> in the <i>Using IAM</i> guide. </p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to
     *        a slash (/).
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the role. For more information about paths, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * 
     * @return The path to the role. For more information about paths, see <a
     *         href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>Using IAM</i> guide. </p>
     *         <p>
     *         This parameter is optional. If it is not included, it defaults to
     *         a slash (/).
     */
    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the role. For more information about paths, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * 
     * @param path
     *        The path to the role. For more information about paths, see <a
     *        href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *        >IAM Identifiers</a> in the <i>Using IAM</i> guide. </p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to
     *        a slash (/).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateRoleRequest withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The name of the role to create.
     * </p>
     * 
     * @param roleName
     *        The name of the role to create.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role to create.
     * </p>
     * 
     * @return The name of the role to create.
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the role to create.
     * </p>
     * 
     * @param roleName
     *        The name of the role to create.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateRoleRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The trust relationship policy document that grants an entity permission
     * to assume the role.
     * </p>
     * 
     * @param assumeRolePolicyDocument
     *        The trust relationship policy document that grants an entity
     *        permission to assume the role.
     */
    public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The trust relationship policy document that grants an entity permission
     * to assume the role.
     * </p>
     * 
     * @return The trust relationship policy document that grants an entity
     *         permission to assume the role.
     */
    public String getAssumeRolePolicyDocument() {
        return this.assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The trust relationship policy document that grants an entity permission
     * to assume the role.
     * </p>
     * 
     * @param assumeRolePolicyDocument
     *        The trust relationship policy document that grants an entity
     *        permission to assume the role.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateRoleRequest withAssumeRolePolicyDocument(
            String assumeRolePolicyDocument) {
        setAssumeRolePolicyDocument(assumeRolePolicyDocument);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getAssumeRolePolicyDocument() != null)
            sb.append("AssumeRolePolicyDocument: "
                    + getAssumeRolePolicyDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRoleRequest == false)
            return false;
        CreateRoleRequest other = (CreateRoleRequest) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null
                && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null
                && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getAssumeRolePolicyDocument() == null
                ^ this.getAssumeRolePolicyDocument() == null)
            return false;
        if (other.getAssumeRolePolicyDocument() != null
                && other.getAssumeRolePolicyDocument().equals(
                        this.getAssumeRolePolicyDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode
                + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssumeRolePolicyDocument() == null) ? 0
                        : getAssumeRolePolicyDocument().hashCode());
        return hashCode;
    }

    @Override
    public CreateRoleRequest clone() {
        return (CreateRoleRequest) super.clone();
    }
}