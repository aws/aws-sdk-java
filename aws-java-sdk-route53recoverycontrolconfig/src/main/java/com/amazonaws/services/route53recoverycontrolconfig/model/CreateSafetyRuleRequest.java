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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request body that you include when you create a safety rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/CreateSafetyRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSafetyRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The assertion rule requested.
     * </p>
     */
    private NewAssertionRule assertionRule;
    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an action,
     * specify a client token in the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The gating rule requested.
     * </p>
     */
    private NewGatingRule gatingRule;
    /**
     * <p>
     * The tags associated with the safety rule.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The assertion rule requested.
     * </p>
     * 
     * @param assertionRule
     *        The assertion rule requested.
     */

    public void setAssertionRule(NewAssertionRule assertionRule) {
        this.assertionRule = assertionRule;
    }

    /**
     * <p>
     * The assertion rule requested.
     * </p>
     * 
     * @return The assertion rule requested.
     */

    public NewAssertionRule getAssertionRule() {
        return this.assertionRule;
    }

    /**
     * <p>
     * The assertion rule requested.
     * </p>
     * 
     * @param assertionRule
     *        The assertion rule requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSafetyRuleRequest withAssertionRule(NewAssertionRule assertionRule) {
        setAssertionRule(assertionRule);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an action,
     * specify a client token in the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an
     *        action, specify a client token in the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an action,
     * specify a client token in the request.
     * </p>
     * 
     * @return A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an
     *         action, specify a client token in the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an action,
     * specify a client token in the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request with an
     *        action, specify a client token in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSafetyRuleRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The gating rule requested.
     * </p>
     * 
     * @param gatingRule
     *        The gating rule requested.
     */

    public void setGatingRule(NewGatingRule gatingRule) {
        this.gatingRule = gatingRule;
    }

    /**
     * <p>
     * The gating rule requested.
     * </p>
     * 
     * @return The gating rule requested.
     */

    public NewGatingRule getGatingRule() {
        return this.gatingRule;
    }

    /**
     * <p>
     * The gating rule requested.
     * </p>
     * 
     * @param gatingRule
     *        The gating rule requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSafetyRuleRequest withGatingRule(NewGatingRule gatingRule) {
        setGatingRule(gatingRule);
        return this;
    }

    /**
     * <p>
     * The tags associated with the safety rule.
     * </p>
     * 
     * @return The tags associated with the safety rule.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the safety rule.
     * </p>
     * 
     * @param tags
     *        The tags associated with the safety rule.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the safety rule.
     * </p>
     * 
     * @param tags
     *        The tags associated with the safety rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSafetyRuleRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSafetyRuleRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSafetyRuleRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSafetyRuleRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAssertionRule() != null)
            sb.append("AssertionRule: ").append(getAssertionRule()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getGatingRule() != null)
            sb.append("GatingRule: ").append(getGatingRule()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSafetyRuleRequest == false)
            return false;
        CreateSafetyRuleRequest other = (CreateSafetyRuleRequest) obj;
        if (other.getAssertionRule() == null ^ this.getAssertionRule() == null)
            return false;
        if (other.getAssertionRule() != null && other.getAssertionRule().equals(this.getAssertionRule()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getGatingRule() == null ^ this.getGatingRule() == null)
            return false;
        if (other.getGatingRule() != null && other.getGatingRule().equals(this.getGatingRule()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssertionRule() == null) ? 0 : getAssertionRule().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getGatingRule() == null) ? 0 : getGatingRule().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSafetyRuleRequest clone() {
        return (CreateSafetyRuleRequest) super.clone();
    }

}
