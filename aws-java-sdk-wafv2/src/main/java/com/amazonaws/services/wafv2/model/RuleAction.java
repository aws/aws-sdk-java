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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The action that WAF should take on a web request when it matches a rule's statement. Settings at the web ACL level
 * can override the rule action setting.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RuleAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Instructs WAF to block the web request.
     * </p>
     */
    private BlockAction block;
    /**
     * <p>
     * Instructs WAF to allow the web request.
     * </p>
     */
    private AllowAction allow;
    /**
     * <p>
     * Instructs WAF to count the web request and then continue evaluating the request using the remaining rules in the
     * web ACL.
     * </p>
     */
    private CountAction count;
    /**
     * <p>
     * Instructs WAF to run a <code>CAPTCHA</code> check against the web request.
     * </p>
     */
    private CaptchaAction captcha;
    /**
     * <p>
     * Instructs WAF to run a <code>Challenge</code> check against the web request.
     * </p>
     */
    private ChallengeAction challenge;

    /**
     * <p>
     * Instructs WAF to block the web request.
     * </p>
     * 
     * @param block
     *        Instructs WAF to block the web request.
     */

    public void setBlock(BlockAction block) {
        this.block = block;
    }

    /**
     * <p>
     * Instructs WAF to block the web request.
     * </p>
     * 
     * @return Instructs WAF to block the web request.
     */

    public BlockAction getBlock() {
        return this.block;
    }

    /**
     * <p>
     * Instructs WAF to block the web request.
     * </p>
     * 
     * @param block
     *        Instructs WAF to block the web request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withBlock(BlockAction block) {
        setBlock(block);
        return this;
    }

    /**
     * <p>
     * Instructs WAF to allow the web request.
     * </p>
     * 
     * @param allow
     *        Instructs WAF to allow the web request.
     */

    public void setAllow(AllowAction allow) {
        this.allow = allow;
    }

    /**
     * <p>
     * Instructs WAF to allow the web request.
     * </p>
     * 
     * @return Instructs WAF to allow the web request.
     */

    public AllowAction getAllow() {
        return this.allow;
    }

    /**
     * <p>
     * Instructs WAF to allow the web request.
     * </p>
     * 
     * @param allow
     *        Instructs WAF to allow the web request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withAllow(AllowAction allow) {
        setAllow(allow);
        return this;
    }

    /**
     * <p>
     * Instructs WAF to count the web request and then continue evaluating the request using the remaining rules in the
     * web ACL.
     * </p>
     * 
     * @param count
     *        Instructs WAF to count the web request and then continue evaluating the request using the remaining rules
     *        in the web ACL.
     */

    public void setCount(CountAction count) {
        this.count = count;
    }

    /**
     * <p>
     * Instructs WAF to count the web request and then continue evaluating the request using the remaining rules in the
     * web ACL.
     * </p>
     * 
     * @return Instructs WAF to count the web request and then continue evaluating the request using the remaining rules
     *         in the web ACL.
     */

    public CountAction getCount() {
        return this.count;
    }

    /**
     * <p>
     * Instructs WAF to count the web request and then continue evaluating the request using the remaining rules in the
     * web ACL.
     * </p>
     * 
     * @param count
     *        Instructs WAF to count the web request and then continue evaluating the request using the remaining rules
     *        in the web ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withCount(CountAction count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * Instructs WAF to run a <code>CAPTCHA</code> check against the web request.
     * </p>
     * 
     * @param captcha
     *        Instructs WAF to run a <code>CAPTCHA</code> check against the web request.
     */

    public void setCaptcha(CaptchaAction captcha) {
        this.captcha = captcha;
    }

    /**
     * <p>
     * Instructs WAF to run a <code>CAPTCHA</code> check against the web request.
     * </p>
     * 
     * @return Instructs WAF to run a <code>CAPTCHA</code> check against the web request.
     */

    public CaptchaAction getCaptcha() {
        return this.captcha;
    }

    /**
     * <p>
     * Instructs WAF to run a <code>CAPTCHA</code> check against the web request.
     * </p>
     * 
     * @param captcha
     *        Instructs WAF to run a <code>CAPTCHA</code> check against the web request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withCaptcha(CaptchaAction captcha) {
        setCaptcha(captcha);
        return this;
    }

    /**
     * <p>
     * Instructs WAF to run a <code>Challenge</code> check against the web request.
     * </p>
     * 
     * @param challenge
     *        Instructs WAF to run a <code>Challenge</code> check against the web request.
     */

    public void setChallenge(ChallengeAction challenge) {
        this.challenge = challenge;
    }

    /**
     * <p>
     * Instructs WAF to run a <code>Challenge</code> check against the web request.
     * </p>
     * 
     * @return Instructs WAF to run a <code>Challenge</code> check against the web request.
     */

    public ChallengeAction getChallenge() {
        return this.challenge;
    }

    /**
     * <p>
     * Instructs WAF to run a <code>Challenge</code> check against the web request.
     * </p>
     * 
     * @param challenge
     *        Instructs WAF to run a <code>Challenge</code> check against the web request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withChallenge(ChallengeAction challenge) {
        setChallenge(challenge);
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
        if (getBlock() != null)
            sb.append("Block: ").append(getBlock()).append(",");
        if (getAllow() != null)
            sb.append("Allow: ").append(getAllow()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getCaptcha() != null)
            sb.append("Captcha: ").append(getCaptcha()).append(",");
        if (getChallenge() != null)
            sb.append("Challenge: ").append(getChallenge());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleAction == false)
            return false;
        RuleAction other = (RuleAction) obj;
        if (other.getBlock() == null ^ this.getBlock() == null)
            return false;
        if (other.getBlock() != null && other.getBlock().equals(this.getBlock()) == false)
            return false;
        if (other.getAllow() == null ^ this.getAllow() == null)
            return false;
        if (other.getAllow() != null && other.getAllow().equals(this.getAllow()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getCaptcha() == null ^ this.getCaptcha() == null)
            return false;
        if (other.getCaptcha() != null && other.getCaptcha().equals(this.getCaptcha()) == false)
            return false;
        if (other.getChallenge() == null ^ this.getChallenge() == null)
            return false;
        if (other.getChallenge() != null && other.getChallenge().equals(this.getChallenge()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlock() == null) ? 0 : getBlock().hashCode());
        hashCode = prime * hashCode + ((getAllow() == null) ? 0 : getAllow().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getCaptcha() == null) ? 0 : getCaptcha().hashCode());
        hashCode = prime * hashCode + ((getChallenge() == null) ? 0 : getChallenge().hashCode());
        return hashCode;
    }

    @Override
    public RuleAction clone() {
        try {
            return (RuleAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.RuleActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
