/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetReadinessCheckResourceStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReadinessCheckResourceStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The readiness at a rule level.
     * </p>
     */
    private String readiness;
    /**
     * <p>
     * Details of the rule's results.
     * </p>
     */
    private java.util.List<RuleResult> rules;

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @return The token that identifies which batch of results you want to see.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckResourceStatusResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The readiness at a rule level.
     * </p>
     * 
     * @param readiness
     *        The readiness at a rule level.
     * @see Readiness
     */

    public void setReadiness(String readiness) {
        this.readiness = readiness;
    }

    /**
     * <p>
     * The readiness at a rule level.
     * </p>
     * 
     * @return The readiness at a rule level.
     * @see Readiness
     */

    public String getReadiness() {
        return this.readiness;
    }

    /**
     * <p>
     * The readiness at a rule level.
     * </p>
     * 
     * @param readiness
     *        The readiness at a rule level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Readiness
     */

    public GetReadinessCheckResourceStatusResult withReadiness(String readiness) {
        setReadiness(readiness);
        return this;
    }

    /**
     * <p>
     * The readiness at a rule level.
     * </p>
     * 
     * @param readiness
     *        The readiness at a rule level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Readiness
     */

    public GetReadinessCheckResourceStatusResult withReadiness(Readiness readiness) {
        this.readiness = readiness.toString();
        return this;
    }

    /**
     * <p>
     * Details of the rule's results.
     * </p>
     * 
     * @return Details of the rule's results.
     */

    public java.util.List<RuleResult> getRules() {
        return rules;
    }

    /**
     * <p>
     * Details of the rule's results.
     * </p>
     * 
     * @param rules
     *        Details of the rule's results.
     */

    public void setRules(java.util.Collection<RuleResult> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<RuleResult>(rules);
    }

    /**
     * <p>
     * Details of the rule's results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        Details of the rule's results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckResourceStatusResult withRules(RuleResult... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<RuleResult>(rules.length));
        }
        for (RuleResult ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of the rule's results.
     * </p>
     * 
     * @param rules
     *        Details of the rule's results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadinessCheckResourceStatusResult withRules(java.util.Collection<RuleResult> rules) {
        setRules(rules);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getReadiness() != null)
            sb.append("Readiness: ").append(getReadiness()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReadinessCheckResourceStatusResult == false)
            return false;
        GetReadinessCheckResourceStatusResult other = (GetReadinessCheckResourceStatusResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReadiness() == null ^ this.getReadiness() == null)
            return false;
        if (other.getReadiness() != null && other.getReadiness().equals(this.getReadiness()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReadiness() == null) ? 0 : getReadiness().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public GetReadinessCheckResourceStatusResult clone() {
        try {
            return (GetReadinessCheckResourceStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
