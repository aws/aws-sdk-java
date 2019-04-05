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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreatePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The friendly name of the policy.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The path for the policy.
     * </p>
     * <p>
     * For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character (\u007F),
     * including most punctuation characters, digits, and upper and lowercased letters.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The JSON policy document that you want to use as the content for the new policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     */
    private String policyDocument;
    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * Typically used to store information about the permissions defined in the policy. For example,
     * "Grants access to production DynamoDB tables."
     * </p>
     * <p>
     * The policy description is immutable. After a value is assigned, it cannot be changed.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The friendly name of the policy.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param policyName
     *        The friendly name of the policy.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The friendly name of the policy.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @return The friendly name of the policy.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *         include any of the following characters: _+=,.@-
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The friendly name of the policy.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param policyName
     *        The friendly name of the policy.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The path for the policy.
     * </p>
     * <p>
     * For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character (\u007F),
     * including most punctuation characters, digits, and upper and lowercased letters.
     * </p>
     * 
     * @param path
     *        The path for the policy.</p>
     *        <p>
     *        For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>IAM User Guide</i>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to a slash (/).
     *        </p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *        forward slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL
     *        character (\u007F), including most punctuation characters, digits, and upper and lowercased letters.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path for the policy.
     * </p>
     * <p>
     * For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character (\u007F),
     * including most punctuation characters, digits, and upper and lowercased letters.
     * </p>
     * 
     * @return The path for the policy.</p>
     *         <p>
     *         For more information about paths, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         This parameter is optional. If it is not included, it defaults to a slash (/).
     *         </p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *         forward slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL
     *         character (\u007F), including most punctuation characters, digits, and upper and lowercased letters.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path for the policy.
     * </p>
     * <p>
     * For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character (\u007F),
     * including most punctuation characters, digits, and upper and lowercased letters.
     * </p>
     * 
     * @param path
     *        The path for the policy.</p>
     *        <p>
     *        For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>IAM User Guide</i>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to a slash (/).
     *        </p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *        forward slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL
     *        character (\u007F), including most punctuation characters, digits, and upper and lowercased letters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyRequest withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The JSON policy document that you want to use as the content for the new policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @param policyDocument
     *        The JSON policy document that you want to use as the content for the new policy.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The JSON policy document that you want to use as the content for the new policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @return The JSON policy document that you want to use as the content for the new policy.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *         string of characters consisting of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *         range
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The special characters tab ( ), line feed ( ), and carriage return ( )
     *         </p>
     *         </li>
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The JSON policy document that you want to use as the content for the new policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @param policyDocument
     *        The JSON policy document that you want to use as the content for the new policy.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * Typically used to store information about the permissions defined in the policy. For example,
     * "Grants access to production DynamoDB tables."
     * </p>
     * <p>
     * The policy description is immutable. After a value is assigned, it cannot be changed.
     * </p>
     * 
     * @param description
     *        A friendly description of the policy.</p>
     *        <p>
     *        Typically used to store information about the permissions defined in the policy. For example,
     *        "Grants access to production DynamoDB tables."
     *        </p>
     *        <p>
     *        The policy description is immutable. After a value is assigned, it cannot be changed.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * Typically used to store information about the permissions defined in the policy. For example,
     * "Grants access to production DynamoDB tables."
     * </p>
     * <p>
     * The policy description is immutable. After a value is assigned, it cannot be changed.
     * </p>
     * 
     * @return A friendly description of the policy.</p>
     *         <p>
     *         Typically used to store information about the permissions defined in the policy. For example,
     *         "Grants access to production DynamoDB tables."
     *         </p>
     *         <p>
     *         The policy description is immutable. After a value is assigned, it cannot be changed.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A friendly description of the policy.
     * </p>
     * <p>
     * Typically used to store information about the permissions defined in the policy. For example,
     * "Grants access to production DynamoDB tables."
     * </p>
     * <p>
     * The policy description is immutable. After a value is assigned, it cannot be changed.
     * </p>
     * 
     * @param description
     *        A friendly description of the policy.</p>
     *        <p>
     *        Typically used to store information about the permissions defined in the policy. For example,
     *        "Grants access to production DynamoDB tables."
     *        </p>
     *        <p>
     *        The policy description is immutable. After a value is assigned, it cannot be changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyRequest withDescription(String description) {
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
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
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

        if (obj instanceof CreatePolicyRequest == false)
            return false;
        CreatePolicyRequest other = (CreatePolicyRequest) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
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

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreatePolicyRequest clone() {
        return (CreatePolicyRequest) super.clone();
    }

}
