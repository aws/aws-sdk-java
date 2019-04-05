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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetContextKeysForPrincipalPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContextKeysForPrincipalPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of a user, group, or role whose policies contain the context keys that you want listed. If you specify a
     * user, the list includes context keys that are found in all policies that are attached to the user. The list also
     * includes all groups that the user is a member of. If you pick a group or a role, then it includes only those
     * context keys that are found in policies attached to that entity. Note that all parameters are shown in unencoded
     * form here for clarity, but must be URL encoded to be included as a part of a real HTML request.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String policySourceArn;
    /**
     * <p>
     * An optional list of additional policies for which you want the list of context keys that are referenced.
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
    private com.amazonaws.internal.SdkInternalList<String> policyInputList;

    /**
     * <p>
     * The ARN of a user, group, or role whose policies contain the context keys that you want listed. If you specify a
     * user, the list includes context keys that are found in all policies that are attached to the user. The list also
     * includes all groups that the user is a member of. If you pick a group or a role, then it includes only those
     * context keys that are found in policies attached to that entity. Note that all parameters are shown in unencoded
     * form here for clarity, but must be URL encoded to be included as a part of a real HTML request.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param policySourceArn
     *        The ARN of a user, group, or role whose policies contain the context keys that you want listed. If you
     *        specify a user, the list includes context keys that are found in all policies that are attached to the
     *        user. The list also includes all groups that the user is a member of. If you pick a group or a role, then
     *        it includes only those context keys that are found in policies attached to that entity. Note that all
     *        parameters are shown in unencoded form here for clarity, but must be URL encoded to be included as a part
     *        of a real HTML request.</p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setPolicySourceArn(String policySourceArn) {
        this.policySourceArn = policySourceArn;
    }

    /**
     * <p>
     * The ARN of a user, group, or role whose policies contain the context keys that you want listed. If you specify a
     * user, the list includes context keys that are found in all policies that are attached to the user. The list also
     * includes all groups that the user is a member of. If you pick a group or a role, then it includes only those
     * context keys that are found in policies attached to that entity. Note that all parameters are shown in unencoded
     * form here for clarity, but must be URL encoded to be included as a part of a real HTML request.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The ARN of a user, group, or role whose policies contain the context keys that you want listed. If you
     *         specify a user, the list includes context keys that are found in all policies that are attached to the
     *         user. The list also includes all groups that the user is a member of. If you pick a group or a role, then
     *         it includes only those context keys that are found in policies attached to that entity. Note that all
     *         parameters are shown in unencoded form here for clarity, but must be URL encoded to be included as a part
     *         of a real HTML request.</p>
     *         <p>
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public String getPolicySourceArn() {
        return this.policySourceArn;
    }

    /**
     * <p>
     * The ARN of a user, group, or role whose policies contain the context keys that you want listed. If you specify a
     * user, the list includes context keys that are found in all policies that are attached to the user. The list also
     * includes all groups that the user is a member of. If you pick a group or a role, then it includes only those
     * context keys that are found in policies attached to that entity. Note that all parameters are shown in unencoded
     * form here for clarity, but must be URL encoded to be included as a part of a real HTML request.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param policySourceArn
     *        The ARN of a user, group, or role whose policies contain the context keys that you want listed. If you
     *        specify a user, the list includes context keys that are found in all policies that are attached to the
     *        user. The list also includes all groups that the user is a member of. If you pick a group or a role, then
     *        it includes only those context keys that are found in policies attached to that entity. Note that all
     *        parameters are shown in unencoded form here for clarity, but must be URL encoded to be included as a part
     *        of a real HTML request.</p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContextKeysForPrincipalPolicyRequest withPolicySourceArn(String policySourceArn) {
        setPolicySourceArn(policySourceArn);
        return this;
    }

    /**
     * <p>
     * An optional list of additional policies for which you want the list of context keys that are referenced.
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
     * @return An optional list of additional policies for which you want the list of context keys that are
     *         referenced.</p>
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

    public java.util.List<String> getPolicyInputList() {
        if (policyInputList == null) {
            policyInputList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return policyInputList;
    }

    /**
     * <p>
     * An optional list of additional policies for which you want the list of context keys that are referenced.
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
     * @param policyInputList
     *        An optional list of additional policies for which you want the list of context keys that are
     *        referenced.</p>
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

    public void setPolicyInputList(java.util.Collection<String> policyInputList) {
        if (policyInputList == null) {
            this.policyInputList = null;
            return;
        }

        this.policyInputList = new com.amazonaws.internal.SdkInternalList<String>(policyInputList);
    }

    /**
     * <p>
     * An optional list of additional policies for which you want the list of context keys that are referenced.
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
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyInputList(java.util.Collection)} or {@link #withPolicyInputList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param policyInputList
     *        An optional list of additional policies for which you want the list of context keys that are
     *        referenced.</p>
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

    public GetContextKeysForPrincipalPolicyRequest withPolicyInputList(String... policyInputList) {
        if (this.policyInputList == null) {
            setPolicyInputList(new com.amazonaws.internal.SdkInternalList<String>(policyInputList.length));
        }
        for (String ele : policyInputList) {
            this.policyInputList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of additional policies for which you want the list of context keys that are referenced.
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
     * @param policyInputList
     *        An optional list of additional policies for which you want the list of context keys that are
     *        referenced.</p>
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

    public GetContextKeysForPrincipalPolicyRequest withPolicyInputList(java.util.Collection<String> policyInputList) {
        setPolicyInputList(policyInputList);
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
        if (getPolicySourceArn() != null)
            sb.append("PolicySourceArn: ").append(getPolicySourceArn()).append(",");
        if (getPolicyInputList() != null)
            sb.append("PolicyInputList: ").append(getPolicyInputList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContextKeysForPrincipalPolicyRequest == false)
            return false;
        GetContextKeysForPrincipalPolicyRequest other = (GetContextKeysForPrincipalPolicyRequest) obj;
        if (other.getPolicySourceArn() == null ^ this.getPolicySourceArn() == null)
            return false;
        if (other.getPolicySourceArn() != null && other.getPolicySourceArn().equals(this.getPolicySourceArn()) == false)
            return false;
        if (other.getPolicyInputList() == null ^ this.getPolicyInputList() == null)
            return false;
        if (other.getPolicyInputList() != null && other.getPolicyInputList().equals(this.getPolicyInputList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicySourceArn() == null) ? 0 : getPolicySourceArn().hashCode());
        hashCode = prime * hashCode + ((getPolicyInputList() == null) ? 0 : getPolicyInputList().hashCode());
        return hashCode;
    }

    @Override
    public GetContextKeysForPrincipalPolicyRequest clone() {
        return (GetContextKeysForPrincipalPolicyRequest) super.clone();
    }

}
