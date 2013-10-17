/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getUserPolicy(GetUserPolicyRequest) GetUserPolicy operation}.
 * <p>
 * Retrieves the specified policy document for the specified user. The returned policy is URL-encoded according to RFC 3986. For more information about
 * RFC 3986, go to <a href="http://www.faqs.org/rfcs/rfc3986.html"> http://www.faqs.org/rfcs/rfc3986.html </a> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getUserPolicy(GetUserPolicyRequest)
 */
public class GetUserPolicyRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Name of the user who the policy is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * Name of the policy document to get.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String policyName;

    /**
     * Default constructor for a new GetUserPolicyRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetUserPolicyRequest() {}
    
    /**
     * Constructs a new GetUserPolicyRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName Name of the user who the policy is associated with.
     * @param policyName Name of the policy document to get.
     */
    public GetUserPolicyRequest(String userName, String policyName) {
        setUserName(userName);
        setPolicyName(policyName);
    }

    /**
     * Name of the user who the policy is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the user who the policy is associated with.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the user who the policy is associated with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user who the policy is associated with.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the user who the policy is associated with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user who the policy is associated with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetUserPolicyRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Name of the policy document to get.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the policy document to get.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * Name of the policy document to get.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param policyName Name of the policy document to get.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * Name of the policy document to get.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param policyName Name of the policy document to get.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetUserPolicyRequest withPolicyName(String policyName) {
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
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetUserPolicyRequest == false) return false;
        GetUserPolicyRequest other = (GetUserPolicyRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        return true;
    }
    
}
    