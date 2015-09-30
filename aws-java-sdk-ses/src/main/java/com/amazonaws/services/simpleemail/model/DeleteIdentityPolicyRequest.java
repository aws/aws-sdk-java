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
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#deleteIdentityPolicy(DeleteIdentityPolicyRequest) DeleteIdentityPolicy operation}.
 * <p>
 * Deletes the specified sending authorization policy for the given
 * identity (email address or domain). This API returns successfully even
 * if a policy with the specified name does not exist.
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
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#deleteIdentityPolicy(DeleteIdentityPolicyRequest)
 */
public class DeleteIdentityPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identity that is associated with the policy that you want to
     * delete. You can specify the identity by using its name or by using its
     * Amazon Resource Name (ARN). Examples: <code>user@example.com</code>,
     * <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     */
    private String identity;

    /**
     * The name of the policy to be deleted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String policyName;

    /**
     * The identity that is associated with the policy that you want to
     * delete. You can specify the identity by using its name or by using its
     * Amazon Resource Name (ARN). Examples: <code>user@example.com</code>,
     * <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     *
     * @return The identity that is associated with the policy that you want to
     *         delete. You can specify the identity by using its name or by using its
     *         Amazon Resource Name (ARN). Examples: <code>user@example.com</code>,
     *         <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     *         <p>To successfully call this API, you must own the identity.
     */
    public String getIdentity() {
        return identity;
    }
    
    /**
     * The identity that is associated with the policy that you want to
     * delete. You can specify the identity by using its name or by using its
     * Amazon Resource Name (ARN). Examples: <code>user@example.com</code>,
     * <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     *
     * @param identity The identity that is associated with the policy that you want to
     *         delete. You can specify the identity by using its name or by using its
     *         Amazon Resource Name (ARN). Examples: <code>user@example.com</code>,
     *         <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     *         <p>To successfully call this API, you must own the identity.
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    
    /**
     * The identity that is associated with the policy that you want to
     * delete. You can specify the identity by using its name or by using its
     * Amazon Resource Name (ARN). Examples: <code>user@example.com</code>,
     * <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identity The identity that is associated with the policy that you want to
     *         delete. You can specify the identity by using its name or by using its
     *         Amazon Resource Name (ARN). Examples: <code>user@example.com</code>,
     *         <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     *         <p>To successfully call this API, you must own the identity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteIdentityPolicyRequest withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * The name of the policy to be deleted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The name of the policy to be deleted.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name of the policy to be deleted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param policyName The name of the policy to be deleted.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name of the policy to be deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param policyName The name of the policy to be deleted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteIdentityPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
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
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteIdentityPolicyRequest == false) return false;
        DeleteIdentityPolicyRequest other = (DeleteIdentityPolicyRequest)obj;
        
        if (other.getIdentity() == null ^ this.getIdentity() == null) return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false) return false; 
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteIdentityPolicyRequest clone() {
        
            return (DeleteIdentityPolicyRequest) super.clone();
    }

}
    