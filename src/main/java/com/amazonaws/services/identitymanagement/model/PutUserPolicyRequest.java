/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#putUserPolicy(PutUserPolicyRequest) PutUserPolicy operation}.
 * <p>
 * Adds (or updates) a policy document associated with the specified
 * User. For information about policies, refer to <a
 * ebservices.com/IAM/latest/UserGuide/index.html?PoliciesOverview.html">
 * Overview of Policies </a> in <i>Using AWS Identity and Access
 * Management</i> .
 * </p>
 * <p>
 * For information about limits on the number of policies you can
 * associate with a User, see <a
 * s.com/IAM/2010-05-08/UserGuide/index.html?LimitationsOnEntities.html">
 * Limitations on IAM Entities </a> in <i>Using AWS Identity and Access
 * Management</i> .
 * </p>
 * <p>
 * <b>NOTE:</b>Because policy documents can be large, you should use POST
 * rather than GET when calling PutUserPolicy. For more information, see
 * Making Query Requests in Using AWS Identity and Access Management.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#putUserPolicy(PutUserPolicyRequest)
 */
public class PutUserPolicyRequest extends AmazonWebServiceRequest {

    /**
     * Name of the User to associate the policy with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * Name of the policy document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String policyName;

    /**
     * The policy document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     */
    private String policyDocument;

    /**
     * Name of the User to associate the policy with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the User to associate the policy with.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the User to associate the policy with.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User to associate the policy with.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the User to associate the policy with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User to associate the policy with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutUserPolicyRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }
    
    
    /**
     * Name of the policy document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the policy document.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * Name of the policy document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param policyName Name of the policy document.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * Name of the policy document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param policyName Name of the policy document.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutUserPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    
    
    /**
     * The policy document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @return The policy document.
     */
    public String getPolicyDocument() {
        return policyDocument;
    }
    
    /**
     * The policy document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param policyDocument The policy document.
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }
    
    /**
     * The policy document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param policyDocument The policy document.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutUserPolicyRequest withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
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
        sb.append("UserName: " + userName + ", ");
        sb.append("PolicyName: " + policyName + ", ");
        sb.append("PolicyDocument: " + policyDocument + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    