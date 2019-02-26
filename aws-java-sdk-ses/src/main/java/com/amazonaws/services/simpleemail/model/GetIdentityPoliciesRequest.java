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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to return the requested sending authorization policies for an identity. Sending authorization is
 * an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityPolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIdentityPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identity for which the policies will be retrieved. You can specify an identity by using its name or by using
     * its Amazon Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * To successfully call this API, you must own the identity.
     * </p>
     */
    private String identity;
    /**
     * <p>
     * A list of the names of policies to be retrieved. You can retrieve a maximum of 20 policies at a time. If you do
     * not know the names of the policies that are attached to the identity, you can use
     * <code>ListIdentityPolicies</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> policyNames;

    /**
     * <p>
     * The identity for which the policies will be retrieved. You can specify an identity by using its name or by using
     * its Amazon Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * To successfully call this API, you must own the identity.
     * </p>
     * 
     * @param identity
     *        The identity for which the policies will be retrieved. You can specify an identity by using its name or by
     *        using its Amazon Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.</p>
     *        <p>
     *        To successfully call this API, you must own the identity.
     */

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The identity for which the policies will be retrieved. You can specify an identity by using its name or by using
     * its Amazon Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * To successfully call this API, you must own the identity.
     * </p>
     * 
     * @return The identity for which the policies will be retrieved. You can specify an identity by using its name or
     *         by using its Amazon Resource Name (ARN). Examples: <code>user@example.com</code>,
     *         <code>example.com</code>, <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.</p>
     *         <p>
     *         To successfully call this API, you must own the identity.
     */

    public String getIdentity() {
        return this.identity;
    }

    /**
     * <p>
     * The identity for which the policies will be retrieved. You can specify an identity by using its name or by using
     * its Amazon Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * To successfully call this API, you must own the identity.
     * </p>
     * 
     * @param identity
     *        The identity for which the policies will be retrieved. You can specify an identity by using its name or by
     *        using its Amazon Resource Name (ARN). Examples: <code>user@example.com</code>, <code>example.com</code>,
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.</p>
     *        <p>
     *        To successfully call this API, you must own the identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityPoliciesRequest withIdentity(String identity) {
        setIdentity(identity);
        return this;
    }

    /**
     * <p>
     * A list of the names of policies to be retrieved. You can retrieve a maximum of 20 policies at a time. If you do
     * not know the names of the policies that are attached to the identity, you can use
     * <code>ListIdentityPolicies</code>.
     * </p>
     * 
     * @return A list of the names of policies to be retrieved. You can retrieve a maximum of 20 policies at a time. If
     *         you do not know the names of the policies that are attached to the identity, you can use
     *         <code>ListIdentityPolicies</code>.
     */

    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
            policyNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return policyNames;
    }

    /**
     * <p>
     * A list of the names of policies to be retrieved. You can retrieve a maximum of 20 policies at a time. If you do
     * not know the names of the policies that are attached to the identity, you can use
     * <code>ListIdentityPolicies</code>.
     * </p>
     * 
     * @param policyNames
     *        A list of the names of policies to be retrieved. You can retrieve a maximum of 20 policies at a time. If
     *        you do not know the names of the policies that are attached to the identity, you can use
     *        <code>ListIdentityPolicies</code>.
     */

    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }

        this.policyNames = new com.amazonaws.internal.SdkInternalList<String>(policyNames);
    }

    /**
     * <p>
     * A list of the names of policies to be retrieved. You can retrieve a maximum of 20 policies at a time. If you do
     * not know the names of the policies that are attached to the identity, you can use
     * <code>ListIdentityPolicies</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyNames(java.util.Collection)} or {@link #withPolicyNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyNames
     *        A list of the names of policies to be retrieved. You can retrieve a maximum of 20 policies at a time. If
     *        you do not know the names of the policies that are attached to the identity, you can use
     *        <code>ListIdentityPolicies</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityPoliciesRequest withPolicyNames(String... policyNames) {
        if (this.policyNames == null) {
            setPolicyNames(new com.amazonaws.internal.SdkInternalList<String>(policyNames.length));
        }
        for (String ele : policyNames) {
            this.policyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the names of policies to be retrieved. You can retrieve a maximum of 20 policies at a time. If you do
     * not know the names of the policies that are attached to the identity, you can use
     * <code>ListIdentityPolicies</code>.
     * </p>
     * 
     * @param policyNames
     *        A list of the names of policies to be retrieved. You can retrieve a maximum of 20 policies at a time. If
     *        you do not know the names of the policies that are attached to the identity, you can use
     *        <code>ListIdentityPolicies</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityPoliciesRequest withPolicyNames(java.util.Collection<String> policyNames) {
        setPolicyNames(policyNames);
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
        if (getIdentity() != null)
            sb.append("Identity: ").append(getIdentity()).append(",");
        if (getPolicyNames() != null)
            sb.append("PolicyNames: ").append(getPolicyNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIdentityPoliciesRequest == false)
            return false;
        GetIdentityPoliciesRequest other = (GetIdentityPoliciesRequest) obj;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null)
            return false;
        if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode());
        return hashCode;
    }

    @Override
    public GetIdentityPoliciesRequest clone() {
        return (GetIdentityPoliciesRequest) super.clone();
    }

}
