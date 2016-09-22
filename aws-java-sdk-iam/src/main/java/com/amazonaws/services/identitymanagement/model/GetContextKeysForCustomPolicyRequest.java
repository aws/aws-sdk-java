/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetContextKeysForCustomPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of policies for which you want the list of context keys referenced in those policies. Each document is
     * specified as a string containing the complete, valid JSON text of an IAM policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of any printable ASCII character ranging from the space character ( ) through end of the ASCII
     * character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage return (
     * ).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> policyInputList;

    /**
     * <p>
     * A list of policies for which you want the list of context keys referenced in those policies. Each document is
     * specified as a string containing the complete, valid JSON text of an IAM policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of any printable ASCII character ranging from the space character ( ) through end of the ASCII
     * character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage return (
     * ).
     * </p>
     * 
     * @return A list of policies for which you want the list of context keys referenced in those policies. Each
     *         document is specified as a string containing the complete, valid JSON text of an IAM policy.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *         characters consisting of any printable ASCII character ranging from the space character ( ) through end
     *         of the ASCII character range (\u00FF). It also includes the special characters tab ( ), line feed ( ),
     *         and carriage return ( ).
     */

    public java.util.List<String> getPolicyInputList() {
        if (policyInputList == null) {
            policyInputList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return policyInputList;
    }

    /**
     * <p>
     * A list of policies for which you want the list of context keys referenced in those policies. Each document is
     * specified as a string containing the complete, valid JSON text of an IAM policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of any printable ASCII character ranging from the space character ( ) through end of the ASCII
     * character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage return (
     * ).
     * </p>
     * 
     * @param policyInputList
     *        A list of policies for which you want the list of context keys referenced in those policies. Each document
     *        is specified as a string containing the complete, valid JSON text of an IAM policy.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of any printable ASCII character ranging from the space character ( ) through end of
     *        the ASCII character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and
     *        carriage return ( ).
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
     * A list of policies for which you want the list of context keys referenced in those policies. Each document is
     * specified as a string containing the complete, valid JSON text of an IAM policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of any printable ASCII character ranging from the space character ( ) through end of the ASCII
     * character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage return (
     * ).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyInputList(java.util.Collection)} or {@link #withPolicyInputList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param policyInputList
     *        A list of policies for which you want the list of context keys referenced in those policies. Each document
     *        is specified as a string containing the complete, valid JSON text of an IAM policy.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of any printable ASCII character ranging from the space character ( ) through end of
     *        the ASCII character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and
     *        carriage return ( ).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContextKeysForCustomPolicyRequest withPolicyInputList(String... policyInputList) {
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
     * A list of policies for which you want the list of context keys referenced in those policies. Each document is
     * specified as a string containing the complete, valid JSON text of an IAM policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters
     * consisting of any printable ASCII character ranging from the space character ( ) through end of the ASCII
     * character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and carriage return (
     * ).
     * </p>
     * 
     * @param policyInputList
     *        A list of policies for which you want the list of context keys referenced in those policies. Each document
     *        is specified as a string containing the complete, valid JSON text of an IAM policy.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters consisting of any printable ASCII character ranging from the space character ( ) through end of
     *        the ASCII character range (\u00FF). It also includes the special characters tab ( ), line feed ( ), and
     *        carriage return ( ).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContextKeysForCustomPolicyRequest withPolicyInputList(java.util.Collection<String> policyInputList) {
        setPolicyInputList(policyInputList);
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
        if (getPolicyInputList() != null)
            sb.append("PolicyInputList: " + getPolicyInputList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContextKeysForCustomPolicyRequest == false)
            return false;
        GetContextKeysForCustomPolicyRequest other = (GetContextKeysForCustomPolicyRequest) obj;
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

        hashCode = prime * hashCode + ((getPolicyInputList() == null) ? 0 : getPolicyInputList().hashCode());
        return hashCode;
    }

    @Override
    public GetContextKeysForCustomPolicyRequest clone() {
        return (GetContextKeysForCustomPolicyRequest) super.clone();
    }
}
