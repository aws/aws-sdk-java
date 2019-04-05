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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreatePolicyVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePolicyVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM policy to which you want to add a new version.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String policyArn;
    /**
     * <p>
     * The JSON policy document that you want to use as the content for this new version of the policy.
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
     * Specifies whether to set this version as the policy's default version.
     * </p>
     * <p>
     * When this parameter is <code>true</code>, the new policy version becomes the operative version. That is, it
     * becomes the version that is in effect for the IAM users, groups, and roles that the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private Boolean setAsDefault;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM policy to which you want to add a new version.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) of the IAM policy to which you want to add a new version.</p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM policy to which you want to add a new version.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM policy to which you want to add a new version.</p>
     *         <p>
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM policy to which you want to add a new version.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) of the IAM policy to which you want to add a new version.</p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyVersionRequest withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * The JSON policy document that you want to use as the content for this new version of the policy.
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
     *        The JSON policy document that you want to use as the content for this new version of the policy.</p>
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
     * The JSON policy document that you want to use as the content for this new version of the policy.
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
     * @return The JSON policy document that you want to use as the content for this new version of the policy.</p>
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
     * The JSON policy document that you want to use as the content for this new version of the policy.
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
     *        The JSON policy document that you want to use as the content for this new version of the policy.</p>
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

    public CreatePolicyVersionRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * Specifies whether to set this version as the policy's default version.
     * </p>
     * <p>
     * When this parameter is <code>true</code>, the new policy version becomes the operative version. That is, it
     * becomes the version that is in effect for the IAM users, groups, and roles that the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param setAsDefault
     *        Specifies whether to set this version as the policy's default version.</p>
     *        <p>
     *        When this parameter is <code>true</code>, the new policy version becomes the operative version. That is,
     *        it becomes the version that is in effect for the IAM users, groups, and roles that the policy is attached
     *        to.
     *        </p>
     *        <p>
     *        For more information about managed policy versions, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for
     *        Managed Policies</a> in the <i>IAM User Guide</i>.
     */

    public void setSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
    }

    /**
     * <p>
     * Specifies whether to set this version as the policy's default version.
     * </p>
     * <p>
     * When this parameter is <code>true</code>, the new policy version becomes the operative version. That is, it
     * becomes the version that is in effect for the IAM users, groups, and roles that the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return Specifies whether to set this version as the policy's default version.</p>
     *         <p>
     *         When this parameter is <code>true</code>, the new policy version becomes the operative version. That is,
     *         it becomes the version that is in effect for the IAM users, groups, and roles that the policy is attached
     *         to.
     *         </p>
     *         <p>
     *         For more information about managed policy versions, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for
     *         Managed Policies</a> in the <i>IAM User Guide</i>.
     */

    public Boolean getSetAsDefault() {
        return this.setAsDefault;
    }

    /**
     * <p>
     * Specifies whether to set this version as the policy's default version.
     * </p>
     * <p>
     * When this parameter is <code>true</code>, the new policy version becomes the operative version. That is, it
     * becomes the version that is in effect for the IAM users, groups, and roles that the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param setAsDefault
     *        Specifies whether to set this version as the policy's default version.</p>
     *        <p>
     *        When this parameter is <code>true</code>, the new policy version becomes the operative version. That is,
     *        it becomes the version that is in effect for the IAM users, groups, and roles that the policy is attached
     *        to.
     *        </p>
     *        <p>
     *        For more information about managed policy versions, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for
     *        Managed Policies</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePolicyVersionRequest withSetAsDefault(Boolean setAsDefault) {
        setSetAsDefault(setAsDefault);
        return this;
    }

    /**
     * <p>
     * Specifies whether to set this version as the policy's default version.
     * </p>
     * <p>
     * When this parameter is <code>true</code>, the new policy version becomes the operative version. That is, it
     * becomes the version that is in effect for the IAM users, groups, and roles that the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for Managed
     * Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return Specifies whether to set this version as the policy's default version.</p>
     *         <p>
     *         When this parameter is <code>true</code>, the new policy version becomes the operative version. That is,
     *         it becomes the version that is in effect for the IAM users, groups, and roles that the policy is attached
     *         to.
     *         </p>
     *         <p>
     *         For more information about managed policy versions, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning for
     *         Managed Policies</a> in the <i>IAM User Guide</i>.
     */

    public Boolean isSetAsDefault() {
        return this.setAsDefault;
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
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getSetAsDefault() != null)
            sb.append("SetAsDefault: ").append(getSetAsDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePolicyVersionRequest == false)
            return false;
        CreatePolicyVersionRequest other = (CreatePolicyVersionRequest) obj;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getSetAsDefault() == null ^ this.getSetAsDefault() == null)
            return false;
        if (other.getSetAsDefault() != null && other.getSetAsDefault().equals(this.getSetAsDefault()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getSetAsDefault() == null) ? 0 : getSetAsDefault().hashCode());
        return hashCode;
    }

    @Override
    public CreatePolicyVersionRequest clone() {
        return (CreatePolicyVersionRequest) super.clone();
    }

}
