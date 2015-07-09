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
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#putIdentityPolicy(PutIdentityPolicyRequest) PutIdentityPolicy operation}.
 * <p>
 * Adds or updates a sending authorization policy for the specified
 * identity (email address or domain).
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
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#putIdentityPolicy(PutIdentityPolicyRequest)
 */
public class PutIdentityPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identity to which the policy will apply. You can specify an
     * identity by using its name or by using its Amazon Resource Name (ARN).
     * Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     */
    private String identity;

    /**
     * The name of the policy. <p>The policy name cannot exceed 64 characters
     * and can only include alphanumeric characters, dashes, and underscores.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[^\\/\?\*\s]+<br/>
     */
    private String policyName;

    /**
     * The text of the policy in JSON format. The policy cannot exceed 4 KB.
     * <p>For information about the syntax of sending authorization policies,
     * see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html">Amazon
     * SES Developer Guide</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String policy;

    /**
     * The identity to which the policy will apply. You can specify an
     * identity by using its name or by using its Amazon Resource Name (ARN).
     * Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     *
     * @return The identity to which the policy will apply. You can specify an
     *         identity by using its name or by using its Amazon Resource Name (ARN).
     *         Examples: <code>user@example.com</code>, <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     *         <p>To successfully call this API, you must own the identity.
     */
    public String getIdentity() {
        return identity;
    }
    
    /**
     * The identity to which the policy will apply. You can specify an
     * identity by using its name or by using its Amazon Resource Name (ARN).
     * Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     *
     * @param identity The identity to which the policy will apply. You can specify an
     *         identity by using its name or by using its Amazon Resource Name (ARN).
     *         Examples: <code>user@example.com</code>, <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     *         <p>To successfully call this API, you must own the identity.
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    
    /**
     * The identity to which the policy will apply. You can specify an
     * identity by using its name or by using its Amazon Resource Name (ARN).
     * Examples: <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * <p>To successfully call this API, you must own the identity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identity The identity to which the policy will apply. You can specify an
     *         identity by using its name or by using its Amazon Resource Name (ARN).
     *         Examples: <code>user@example.com</code>, <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     *         <p>To successfully call this API, you must own the identity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutIdentityPolicyRequest withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * The name of the policy. <p>The policy name cannot exceed 64 characters
     * and can only include alphanumeric characters, dashes, and underscores.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[^\\/\?\*\s]+<br/>
     *
     * @return The name of the policy. <p>The policy name cannot exceed 64 characters
     *         and can only include alphanumeric characters, dashes, and underscores.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name of the policy. <p>The policy name cannot exceed 64 characters
     * and can only include alphanumeric characters, dashes, and underscores.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[^\\/\?\*\s]+<br/>
     *
     * @param policyName The name of the policy. <p>The policy name cannot exceed 64 characters
     *         and can only include alphanumeric characters, dashes, and underscores.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name of the policy. <p>The policy name cannot exceed 64 characters
     * and can only include alphanumeric characters, dashes, and underscores.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[^\\/\?\*\s]+<br/>
     *
     * @param policyName The name of the policy. <p>The policy name cannot exceed 64 characters
     *         and can only include alphanumeric characters, dashes, and underscores.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutIdentityPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * The text of the policy in JSON format. The policy cannot exceed 4 KB.
     * <p>For information about the syntax of sending authorization policies,
     * see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html">Amazon
     * SES Developer Guide</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The text of the policy in JSON format. The policy cannot exceed 4 KB.
     *         <p>For information about the syntax of sending authorization policies,
     *         see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html">Amazon
     *         SES Developer Guide</a>.
     */
    public String getPolicy() {
        return policy;
    }
    
    /**
     * The text of the policy in JSON format. The policy cannot exceed 4 KB.
     * <p>For information about the syntax of sending authorization policies,
     * see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html">Amazon
     * SES Developer Guide</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param policy The text of the policy in JSON format. The policy cannot exceed 4 KB.
     *         <p>For information about the syntax of sending authorization policies,
     *         see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html">Amazon
     *         SES Developer Guide</a>.
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }
    
    /**
     * The text of the policy in JSON format. The policy cannot exceed 4 KB.
     * <p>For information about the syntax of sending authorization policies,
     * see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html">Amazon
     * SES Developer Guide</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param policy The text of the policy in JSON format. The policy cannot exceed 4 KB.
     *         <p>For information about the syntax of sending authorization policies,
     *         see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html">Amazon
     *         SES Developer Guide</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutIdentityPolicyRequest withPolicy(String policy) {
        this.policy = policy;
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
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicy() != null) sb.append("Policy: " + getPolicy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutIdentityPolicyRequest == false) return false;
        PutIdentityPolicyRequest other = (PutIdentityPolicyRequest)obj;
        
        if (other.getIdentity() == null ^ this.getIdentity() == null) return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false) return false; 
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getPolicy() == null ^ this.getPolicy() == null) return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false) return false; 
        return true;
    }
    
    @Override
    public PutIdentityPolicyRequest clone() {
        
            return (PutIdentityPolicyRequest) super.clone();
    }

}
    