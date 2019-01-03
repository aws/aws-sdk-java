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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A rule that maps a claim name, a claim value, and a match type to a role ARN.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/MappingRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MappingRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The claim name that must be present in the token, for example, "isAdmin" or "paid".
     * </p>
     */
    private String claim;
    /**
     * <p>
     * The match condition that specifies how closely the claim value in the IdP token must match <code>Value</code>.
     * </p>
     */
    private String matchType;
    /**
     * <p>
     * A brief string that the claim must match, for example, "paid" or "yes".
     * </p>
     */
    private String value;
    /**
     * <p>
     * The role ARN.
     * </p>
     */
    private String roleARN;

    /**
     * <p>
     * The claim name that must be present in the token, for example, "isAdmin" or "paid".
     * </p>
     * 
     * @param claim
     *        The claim name that must be present in the token, for example, "isAdmin" or "paid".
     */

    public void setClaim(String claim) {
        this.claim = claim;
    }

    /**
     * <p>
     * The claim name that must be present in the token, for example, "isAdmin" or "paid".
     * </p>
     * 
     * @return The claim name that must be present in the token, for example, "isAdmin" or "paid".
     */

    public String getClaim() {
        return this.claim;
    }

    /**
     * <p>
     * The claim name that must be present in the token, for example, "isAdmin" or "paid".
     * </p>
     * 
     * @param claim
     *        The claim name that must be present in the token, for example, "isAdmin" or "paid".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MappingRule withClaim(String claim) {
        setClaim(claim);
        return this;
    }

    /**
     * <p>
     * The match condition that specifies how closely the claim value in the IdP token must match <code>Value</code>.
     * </p>
     * 
     * @param matchType
     *        The match condition that specifies how closely the claim value in the IdP token must match
     *        <code>Value</code>.
     * @see MappingRuleMatchType
     */

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    /**
     * <p>
     * The match condition that specifies how closely the claim value in the IdP token must match <code>Value</code>.
     * </p>
     * 
     * @return The match condition that specifies how closely the claim value in the IdP token must match
     *         <code>Value</code>.
     * @see MappingRuleMatchType
     */

    public String getMatchType() {
        return this.matchType;
    }

    /**
     * <p>
     * The match condition that specifies how closely the claim value in the IdP token must match <code>Value</code>.
     * </p>
     * 
     * @param matchType
     *        The match condition that specifies how closely the claim value in the IdP token must match
     *        <code>Value</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MappingRuleMatchType
     */

    public MappingRule withMatchType(String matchType) {
        setMatchType(matchType);
        return this;
    }

    /**
     * <p>
     * The match condition that specifies how closely the claim value in the IdP token must match <code>Value</code>.
     * </p>
     * 
     * @param matchType
     *        The match condition that specifies how closely the claim value in the IdP token must match
     *        <code>Value</code>.
     * @see MappingRuleMatchType
     */

    public void setMatchType(MappingRuleMatchType matchType) {
        withMatchType(matchType);
    }

    /**
     * <p>
     * The match condition that specifies how closely the claim value in the IdP token must match <code>Value</code>.
     * </p>
     * 
     * @param matchType
     *        The match condition that specifies how closely the claim value in the IdP token must match
     *        <code>Value</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MappingRuleMatchType
     */

    public MappingRule withMatchType(MappingRuleMatchType matchType) {
        this.matchType = matchType.toString();
        return this;
    }

    /**
     * <p>
     * A brief string that the claim must match, for example, "paid" or "yes".
     * </p>
     * 
     * @param value
     *        A brief string that the claim must match, for example, "paid" or "yes".
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A brief string that the claim must match, for example, "paid" or "yes".
     * </p>
     * 
     * @return A brief string that the claim must match, for example, "paid" or "yes".
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A brief string that the claim must match, for example, "paid" or "yes".
     * </p>
     * 
     * @param value
     *        A brief string that the claim must match, for example, "paid" or "yes".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MappingRule withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The role ARN.
     * </p>
     * 
     * @param roleARN
     *        The role ARN.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The role ARN.
     * </p>
     * 
     * @return The role ARN.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The role ARN.
     * </p>
     * 
     * @param roleARN
     *        The role ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MappingRule withRoleARN(String roleARN) {
        setRoleARN(roleARN);
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
        if (getClaim() != null)
            sb.append("Claim: ").append(getClaim()).append(",");
        if (getMatchType() != null)
            sb.append("MatchType: ").append(getMatchType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MappingRule == false)
            return false;
        MappingRule other = (MappingRule) obj;
        if (other.getClaim() == null ^ this.getClaim() == null)
            return false;
        if (other.getClaim() != null && other.getClaim().equals(this.getClaim()) == false)
            return false;
        if (other.getMatchType() == null ^ this.getMatchType() == null)
            return false;
        if (other.getMatchType() != null && other.getMatchType().equals(this.getMatchType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClaim() == null) ? 0 : getClaim().hashCode());
        hashCode = prime * hashCode + ((getMatchType() == null) ? 0 : getMatchType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        return hashCode;
    }

    @Override
    public MappingRule clone() {
        try {
            return (MappingRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidentity.model.transform.MappingRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
