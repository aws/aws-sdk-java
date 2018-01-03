/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateRole" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRoleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This paramater allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes, containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F), including most
     * punctuation characters, digits, and upper and lowercased letters.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The name of the role to create.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * <p>
     * Role names are not distinguished by case. For example, you cannot create roles named both "PRODROLE" and
     * "prodrole".
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The trust relationship policy document that grants an entity permission to assume the role.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of any printable ASCII character ranging from the space character ( ) through end of the
     * ASCII character range as well as the printable characters in the Basic Latin and Latin-1 Supplement character set
     * (through \u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage return ( ).
     * </p>
     */
    private String assumeRolePolicyDocument;
    /**
     * <p>
     * A customer-provided description of the role.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This paramater allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes, containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F), including most
     * punctuation characters, digits, and upper and lowercased letters.
     * </p>
     * 
     * @param path
     *        The path to the role. For more information about paths, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to a slash (/).
     *        </p>
     *        <p>
     *        This paramater allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *        characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *        forward slashes, containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F),
     *        including most punctuation characters, digits, and upper and lowercased letters.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This paramater allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes, containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F), including most
     * punctuation characters, digits, and upper and lowercased letters.
     * </p>
     * 
     * @return The path to the role. For more information about paths, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>IAM User Guide</i>.</p>
     *         <p>
     *         This parameter is optional. If it is not included, it defaults to a slash (/).
     *         </p>
     *         <p>
     *         This paramater allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *         characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *         forward slashes, containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F),
     *         including most punctuation characters, digits, and upper and lowercased letters.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This paramater allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes, containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F), including most
     * punctuation characters, digits, and upper and lowercased letters.
     * </p>
     * 
     * @param path
     *        The path to the role. For more information about paths, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to a slash (/).
     *        </p>
     *        <p>
     *        This paramater allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *        characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *        forward slashes, containing any ASCII character from the ! (\u0021) thru the DEL character (\u007F),
     *        including most punctuation characters, digits, and upper and lowercased letters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleRequest withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The name of the role to create.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * <p>
     * Role names are not distinguished by case. For example, you cannot create roles named both "PRODROLE" and
     * "prodrole".
     * </p>
     * 
     * @param roleName
     *        The name of the role to create.</p>
     *        <p>
     *        This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: _+=,.@-
     *        </p>
     *        <p>
     *        Role names are not distinguished by case. For example, you cannot create roles named both "PRODROLE" and
     *        "prodrole".
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role to create.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * <p>
     * Role names are not distinguished by case. For example, you cannot create roles named both "PRODROLE" and
     * "prodrole".
     * </p>
     * 
     * @return The name of the role to create.</p>
     *         <p>
     *         This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *         characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *         any of the following characters: _+=,.@-
     *         </p>
     *         <p>
     *         Role names are not distinguished by case. For example, you cannot create roles named both "PRODROLE" and
     *         "prodrole".
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the role to create.
     * </p>
     * <p>
     * This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * <p>
     * Role names are not distinguished by case. For example, you cannot create roles named both "PRODROLE" and
     * "prodrole".
     * </p>
     * 
     * @param roleName
     *        The name of the role to create.</p>
     *        <p>
     *        This parameter allows (per its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     *        characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     *        any of the following characters: _+=,.@-
     *        </p>
     *        <p>
     *        Role names are not distinguished by case. For example, you cannot create roles named both "PRODROLE" and
     *        "prodrole".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The trust relationship policy document that grants an entity permission to assume the role.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of any printable ASCII character ranging from the space character ( ) through end of the
     * ASCII character range as well as the printable characters in the Basic Latin and Latin-1 Supplement character set
     * (through \u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage return ( ).
     * </p>
     * 
     * @param assumeRolePolicyDocument
     *        The trust relationship policy document that grants an entity permission to assume the role.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of any printable ASCII character ranging from the space character ( )
     *        through end of the ASCII character range as well as the printable characters in the Basic Latin and
     *        Latin-1 Supplement character set (through \u00FF). It also includes the special characters tab ( ), line
     *        feed ( ), and carriage return ( ).
     */

    public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The trust relationship policy document that grants an entity permission to assume the role.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of any printable ASCII character ranging from the space character ( ) through end of the
     * ASCII character range as well as the printable characters in the Basic Latin and Latin-1 Supplement character set
     * (through \u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage return ( ).
     * </p>
     * 
     * @return The trust relationship policy document that grants an entity permission to assume the role.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *         string of characters consisting of any printable ASCII character ranging from the space character ( )
     *         through end of the ASCII character range as well as the printable characters in the Basic Latin and
     *         Latin-1 Supplement character set (through \u00FF). It also includes the special characters tab ( ), line
     *         feed ( ), and carriage return ( ).
     */

    public String getAssumeRolePolicyDocument() {
        return this.assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The trust relationship policy document that grants an entity permission to assume the role.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of any printable ASCII character ranging from the space character ( ) through end of the
     * ASCII character range as well as the printable characters in the Basic Latin and Latin-1 Supplement character set
     * (through \u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage return ( ).
     * </p>
     * 
     * @param assumeRolePolicyDocument
     *        The trust relationship policy document that grants an entity permission to assume the role.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of any printable ASCII character ranging from the space character ( )
     *        through end of the ASCII character range as well as the printable characters in the Basic Latin and
     *        Latin-1 Supplement character set (through \u00FF). It also includes the special characters tab ( ), line
     *        feed ( ), and carriage return ( ).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleRequest withAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        setAssumeRolePolicyDocument(assumeRolePolicyDocument);
        return this;
    }

    /**
     * <p>
     * A customer-provided description of the role.
     * </p>
     * 
     * @param description
     *        A customer-provided description of the role.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A customer-provided description of the role.
     * </p>
     * 
     * @return A customer-provided description of the role.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A customer-provided description of the role.
     * </p>
     * 
     * @param description
     *        A customer-provided description of the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Path: ").append(getPath()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getAssumeRolePolicyDocument() != null)
            sb.append("AssumeRolePolicyDocument: ").append(getAssumeRolePolicyDocument()).append(",");
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

        if (obj instanceof CreateRoleRequest == false)
            return false;
        CreateRoleRequest other = (CreateRoleRequest) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getAssumeRolePolicyDocument() == null ^ this.getAssumeRolePolicyDocument() == null)
            return false;
        if (other.getAssumeRolePolicyDocument() != null && other.getAssumeRolePolicyDocument().equals(this.getAssumeRolePolicyDocument()) == false)
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

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getAssumeRolePolicyDocument() == null) ? 0 : getAssumeRolePolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateRoleRequest clone() {
        return (CreateRoleRequest) super.clone();
    }

}
