/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#getIdentityPolicies(GetIdentityPoliciesRequest) GetIdentityPolicies operation}.
 * <p>
 * Returns the requested sending authorization policies for the given
 * identity (email address or domain). The policies are returned as a map
 * of policy names to policy contents. You can retrieve a maximum of 20
 * policies at a time.
 * </p>
 * <p>
 * <b>NOTE:</b>This API is for the identity owner only. If you have not
 * verified the identity, this API will return an error.
 * </p>
 * <p>
 * Sending authorization is a feature that enables an identity owner to
 * authorize other senders to use its identities. For information about
 * using sending authorization, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 * <p>
 * This action is throttled at one request per second.
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#getIdentityPolicies(GetIdentityPoliciesRequest)
 */
public class GetIdentityPoliciesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identity for which the policies will be retrieved. You can specify
     * an identity by using its name or by using its Amazon Resource Name
     * (ARN). Examples: <code>user@example.com</code>,
     * <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     */
    private String identity;

    /**
     * A list of the names of policies to be retrieved. You can retrieve a
     * maximum of 20 policies at a time. If you do not know the names of the
     * policies that are attached to the identity, you can use
     * <code>ListIdentityPolicies</code>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNames;

    /**
     * The identity for which the policies will be retrieved. You can specify
     * an identity by using its name or by using its Amazon Resource Name
     * (ARN). Examples: <code>user@example.com</code>,
     * <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     *
     * @return The identity for which the policies will be retrieved. You can specify
     *         an identity by using its name or by using its Amazon Resource Name
     *         (ARN). Examples: <code>user@example.com</code>,
     *         <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     *         <p>To successfully call this API, you must own the identity.
     */
    public String getIdentity() {
        return identity;
    }
    
    /**
     * The identity for which the policies will be retrieved. You can specify
     * an identity by using its name or by using its Amazon Resource Name
     * (ARN). Examples: <code>user@example.com</code>,
     * <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     *
     * @param identity The identity for which the policies will be retrieved. You can specify
     *         an identity by using its name or by using its Amazon Resource Name
     *         (ARN). Examples: <code>user@example.com</code>,
     *         <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     *         <p>To successfully call this API, you must own the identity.
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    
    /**
     * The identity for which the policies will be retrieved. You can specify
     * an identity by using its name or by using its Amazon Resource Name
     * (ARN). Examples: <code>user@example.com</code>,
     * <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identity The identity for which the policies will be retrieved. You can specify
     *         an identity by using its name or by using its Amazon Resource Name
     *         (ARN). Examples: <code>user@example.com</code>,
     *         <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     *         <p>To successfully call this API, you must own the identity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetIdentityPoliciesRequest withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * A list of the names of policies to be retrieved. You can retrieve a
     * maximum of 20 policies at a time. If you do not know the names of the
     * policies that are attached to the identity, you can use
     * <code>ListIdentityPolicies</code>.
     *
     * @return A list of the names of policies to be retrieved. You can retrieve a
     *         maximum of 20 policies at a time. If you do not know the names of the
     *         policies that are attached to the identity, you can use
     *         <code>ListIdentityPolicies</code>.
     */
    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
              policyNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              policyNames.setAutoConstruct(true);
        }
        return policyNames;
    }
    
    /**
     * A list of the names of policies to be retrieved. You can retrieve a
     * maximum of 20 policies at a time. If you do not know the names of the
     * policies that are attached to the identity, you can use
     * <code>ListIdentityPolicies</code>.
     *
     * @param policyNames A list of the names of policies to be retrieved. You can retrieve a
     *         maximum of 20 policies at a time. If you do not know the names of the
     *         policies that are attached to the identity, you can use
     *         <code>ListIdentityPolicies</code>.
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyNames.size());
        policyNamesCopy.addAll(policyNames);
        this.policyNames = policyNamesCopy;
    }
    
    /**
     * A list of the names of policies to be retrieved. You can retrieve a
     * maximum of 20 policies at a time. If you do not know the names of the
     * policies that are attached to the identity, you can use
     * <code>ListIdentityPolicies</code>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyNames(java.util.Collection)} or {@link
     * #withPolicyNames(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames A list of the names of policies to be retrieved. You can retrieve a
     *         maximum of 20 policies at a time. If you do not know the names of the
     *         policies that are attached to the identity, you can use
     *         <code>ListIdentityPolicies</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetIdentityPoliciesRequest withPolicyNames(String... policyNames) {
        if (getPolicyNames() == null) setPolicyNames(new java.util.ArrayList<String>(policyNames.length));
        for (String value : policyNames) {
            getPolicyNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of the names of policies to be retrieved. You can retrieve a
     * maximum of 20 policies at a time. If you do not know the names of the
     * policies that are attached to the identity, you can use
     * <code>ListIdentityPolicies</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames A list of the names of policies to be retrieved. You can retrieve a
     *         maximum of 20 policies at a time. If you do not know the names of the
     *         policies that are attached to the identity, you can use
     *         <code>ListIdentityPolicies</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetIdentityPoliciesRequest withPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyNames.size());
            policyNamesCopy.addAll(policyNames);
            this.policyNames = policyNamesCopy;
        }

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
        if (getIdentity() != null) sb.append("Identity: " + getIdentity() + ",");
        if (getPolicyNames() != null) sb.append("PolicyNames: " + getPolicyNames() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetIdentityPoliciesRequest == false) return false;
        GetIdentityPoliciesRequest other = (GetIdentityPoliciesRequest)obj;
        
        if (other.getIdentity() == null ^ this.getIdentity() == null) return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false) return false; 
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null) return false;
        if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false) return false; 
        return true;
    }
    
    @Override
    public GetIdentityPoliciesRequest clone() {
        
            return (GetIdentityPoliciesRequest) super.clone();
    }

}
    