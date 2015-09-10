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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getContextKeysForPrincipalPolicy(GetContextKeysForPrincipalPolicyRequest) GetContextKeysForPrincipalPolicy operation}.
 * <p>
 * Gets a list of all of the context keys referenced in
 * <code>Condition</code> elements in all of the IAM policies attached to
 * the specified IAM entity. The entity can be an IAM user, group, or
 * role. If you specify a user, then the request also includes all of the
 * policies attached to groups that the user is a member of.
 * </p>
 * <p>
 * You can optionally include a list of one or more additional policies,
 * specified as strings. If you want to include only a list of policies
 * by string, use GetContextKeysForCustomPolicy instead.
 * </p>
 * <p>
 * <b>Note:</b> This API discloses information about the permissions
 * granted to other users. If you do not want users to see other user's
 * permissions, then consider allowing them to use
 * GetContextKeysForCustomPolicy instead.
 * </p>
 * <p>
 * Context keys are variables maintained by AWS and its services that
 * provide details about the context of an API query request, and can be
 * evaluated by using the <code>Condition</code> element of an IAM
 * policy. Use GetContextKeysForPrincipalPolicy to understand what key
 * names and values you must supply when you call
 * SimulatePrincipalPolicy.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getContextKeysForPrincipalPolicy(GetContextKeysForPrincipalPolicyRequest)
 */
public class GetContextKeysForPrincipalPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ARN of a user, group, or role whose policies contain the context
     * keys that you want listed. If you specify a user, the list includes
     * context keys that are found in all policies attached to the user as
     * well as to all groups that the user is a member of. If you pick a
     * group or a role, then it includes only those context keys that are
     * found in policies attached to that entity. Note that all parameters
     * are shown in unencoded form here for clarity, but must be URL encoded
     * to be included as a part of a real HTML request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String policySourceArn;

    /**
     * A optional list of additional policies for which you want list of
     * context keys used in <code>Condition</code> elements.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> policyInputList;

    /**
     * The ARN of a user, group, or role whose policies contain the context
     * keys that you want listed. If you specify a user, the list includes
     * context keys that are found in all policies attached to the user as
     * well as to all groups that the user is a member of. If you pick a
     * group or a role, then it includes only those context keys that are
     * found in policies attached to that entity. Note that all parameters
     * are shown in unencoded form here for clarity, but must be URL encoded
     * to be included as a part of a real HTML request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The ARN of a user, group, or role whose policies contain the context
     *         keys that you want listed. If you specify a user, the list includes
     *         context keys that are found in all policies attached to the user as
     *         well as to all groups that the user is a member of. If you pick a
     *         group or a role, then it includes only those context keys that are
     *         found in policies attached to that entity. Note that all parameters
     *         are shown in unencoded form here for clarity, but must be URL encoded
     *         to be included as a part of a real HTML request.
     */
    public String getPolicySourceArn() {
        return policySourceArn;
    }
    
    /**
     * The ARN of a user, group, or role whose policies contain the context
     * keys that you want listed. If you specify a user, the list includes
     * context keys that are found in all policies attached to the user as
     * well as to all groups that the user is a member of. If you pick a
     * group or a role, then it includes only those context keys that are
     * found in policies attached to that entity. Note that all parameters
     * are shown in unencoded form here for clarity, but must be URL encoded
     * to be included as a part of a real HTML request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policySourceArn The ARN of a user, group, or role whose policies contain the context
     *         keys that you want listed. If you specify a user, the list includes
     *         context keys that are found in all policies attached to the user as
     *         well as to all groups that the user is a member of. If you pick a
     *         group or a role, then it includes only those context keys that are
     *         found in policies attached to that entity. Note that all parameters
     *         are shown in unencoded form here for clarity, but must be URL encoded
     *         to be included as a part of a real HTML request.
     */
    public void setPolicySourceArn(String policySourceArn) {
        this.policySourceArn = policySourceArn;
    }
    
    /**
     * The ARN of a user, group, or role whose policies contain the context
     * keys that you want listed. If you specify a user, the list includes
     * context keys that are found in all policies attached to the user as
     * well as to all groups that the user is a member of. If you pick a
     * group or a role, then it includes only those context keys that are
     * found in policies attached to that entity. Note that all parameters
     * are shown in unencoded form here for clarity, but must be URL encoded
     * to be included as a part of a real HTML request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param policySourceArn The ARN of a user, group, or role whose policies contain the context
     *         keys that you want listed. If you specify a user, the list includes
     *         context keys that are found in all policies attached to the user as
     *         well as to all groups that the user is a member of. If you pick a
     *         group or a role, then it includes only those context keys that are
     *         found in policies attached to that entity. Note that all parameters
     *         are shown in unencoded form here for clarity, but must be URL encoded
     *         to be included as a part of a real HTML request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetContextKeysForPrincipalPolicyRequest withPolicySourceArn(String policySourceArn) {
        this.policySourceArn = policySourceArn;
        return this;
    }

    /**
     * A optional list of additional policies for which you want list of
     * context keys used in <code>Condition</code> elements.
     *
     * @return A optional list of additional policies for which you want list of
     *         context keys used in <code>Condition</code> elements.
     */
    public java.util.List<String> getPolicyInputList() {
        if (policyInputList == null) {
              policyInputList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              policyInputList.setAutoConstruct(true);
        }
        return policyInputList;
    }
    
    /**
     * A optional list of additional policies for which you want list of
     * context keys used in <code>Condition</code> elements.
     *
     * @param policyInputList A optional list of additional policies for which you want list of
     *         context keys used in <code>Condition</code> elements.
     */
    public void setPolicyInputList(java.util.Collection<String> policyInputList) {
        if (policyInputList == null) {
            this.policyInputList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> policyInputListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyInputList.size());
        policyInputListCopy.addAll(policyInputList);
        this.policyInputList = policyInputListCopy;
    }
    
    /**
     * A optional list of additional policies for which you want list of
     * context keys used in <code>Condition</code> elements.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyInputList(java.util.Collection)} or {@link
     * #withPolicyInputList(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyInputList A optional list of additional policies for which you want list of
     *         context keys used in <code>Condition</code> elements.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetContextKeysForPrincipalPolicyRequest withPolicyInputList(String... policyInputList) {
        if (getPolicyInputList() == null) setPolicyInputList(new java.util.ArrayList<String>(policyInputList.length));
        for (String value : policyInputList) {
            getPolicyInputList().add(value);
        }
        return this;
    }
    
    /**
     * A optional list of additional policies for which you want list of
     * context keys used in <code>Condition</code> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyInputList A optional list of additional policies for which you want list of
     *         context keys used in <code>Condition</code> elements.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetContextKeysForPrincipalPolicyRequest withPolicyInputList(java.util.Collection<String> policyInputList) {
        if (policyInputList == null) {
            this.policyInputList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> policyInputListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyInputList.size());
            policyInputListCopy.addAll(policyInputList);
            this.policyInputList = policyInputListCopy;
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
        if (getPolicySourceArn() != null) sb.append("PolicySourceArn: " + getPolicySourceArn() + ",");
        if (getPolicyInputList() != null) sb.append("PolicyInputList: " + getPolicyInputList() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetContextKeysForPrincipalPolicyRequest == false) return false;
        GetContextKeysForPrincipalPolicyRequest other = (GetContextKeysForPrincipalPolicyRequest)obj;
        
        if (other.getPolicySourceArn() == null ^ this.getPolicySourceArn() == null) return false;
        if (other.getPolicySourceArn() != null && other.getPolicySourceArn().equals(this.getPolicySourceArn()) == false) return false; 
        if (other.getPolicyInputList() == null ^ this.getPolicyInputList() == null) return false;
        if (other.getPolicyInputList() != null && other.getPolicyInputList().equals(this.getPolicyInputList()) == false) return false; 
        return true;
    }
    
    @Override
    public GetContextKeysForPrincipalPolicyRequest clone() {
        
            return (GetContextKeysForPrincipalPolicyRequest) super.clone();
    }

}
    