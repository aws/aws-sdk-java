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
package com.amazonaws.services.securityhub.model;

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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafv2RulesActionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafv2RulesActionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Instructs WAF to allow the web request.
     * </p>
     */
    private AwsWafv2ActionAllowDetails allow;
    /**
     * <p>
     * Instructs WAF to block the web request.
     * </p>
     */
    private AwsWafv2ActionBlockDetails block;
    /**
     * <p>
     * Instructs WAF to run a CAPTCHA check against the web request.
     * </p>
     */
    private AwsWafv2RulesActionCaptchaDetails captcha;
    /**
     * <p>
     * Instructs WAF to count the web request and then continue evaluating the request using the remaining rules in the
     * web ACL.
     * </p>
     */
    private AwsWafv2RulesActionCountDetails count;

    /**
     * <p>
     * Instructs WAF to allow the web request.
     * </p>
     * 
     * @param allow
     *        Instructs WAF to allow the web request.
     */

    public void setAllow(AwsWafv2ActionAllowDetails allow) {
        this.allow = allow;
    }

    /**
     * <p>
     * Instructs WAF to allow the web request.
     * </p>
     * 
     * @return Instructs WAF to allow the web request.
     */

    public AwsWafv2ActionAllowDetails getAllow() {
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

    public AwsWafv2RulesActionDetails withAllow(AwsWafv2ActionAllowDetails allow) {
        setAllow(allow);
        return this;
    }

    /**
     * <p>
     * Instructs WAF to block the web request.
     * </p>
     * 
     * @param block
     *        Instructs WAF to block the web request.
     */

    public void setBlock(AwsWafv2ActionBlockDetails block) {
        this.block = block;
    }

    /**
     * <p>
     * Instructs WAF to block the web request.
     * </p>
     * 
     * @return Instructs WAF to block the web request.
     */

    public AwsWafv2ActionBlockDetails getBlock() {
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

    public AwsWafv2RulesActionDetails withBlock(AwsWafv2ActionBlockDetails block) {
        setBlock(block);
        return this;
    }

    /**
     * <p>
     * Instructs WAF to run a CAPTCHA check against the web request.
     * </p>
     * 
     * @param captcha
     *        Instructs WAF to run a CAPTCHA check against the web request.
     */

    public void setCaptcha(AwsWafv2RulesActionCaptchaDetails captcha) {
        this.captcha = captcha;
    }

    /**
     * <p>
     * Instructs WAF to run a CAPTCHA check against the web request.
     * </p>
     * 
     * @return Instructs WAF to run a CAPTCHA check against the web request.
     */

    public AwsWafv2RulesActionCaptchaDetails getCaptcha() {
        return this.captcha;
    }

    /**
     * <p>
     * Instructs WAF to run a CAPTCHA check against the web request.
     * </p>
     * 
     * @param captcha
     *        Instructs WAF to run a CAPTCHA check against the web request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2RulesActionDetails withCaptcha(AwsWafv2RulesActionCaptchaDetails captcha) {
        setCaptcha(captcha);
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

    public void setCount(AwsWafv2RulesActionCountDetails count) {
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

    public AwsWafv2RulesActionCountDetails getCount() {
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

    public AwsWafv2RulesActionDetails withCount(AwsWafv2RulesActionCountDetails count) {
        setCount(count);
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
        if (getAllow() != null)
            sb.append("Allow: ").append(getAllow()).append(",");
        if (getBlock() != null)
            sb.append("Block: ").append(getBlock()).append(",");
        if (getCaptcha() != null)
            sb.append("Captcha: ").append(getCaptcha()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsWafv2RulesActionDetails == false)
            return false;
        AwsWafv2RulesActionDetails other = (AwsWafv2RulesActionDetails) obj;
        if (other.getAllow() == null ^ this.getAllow() == null)
            return false;
        if (other.getAllow() != null && other.getAllow().equals(this.getAllow()) == false)
            return false;
        if (other.getBlock() == null ^ this.getBlock() == null)
            return false;
        if (other.getBlock() != null && other.getBlock().equals(this.getBlock()) == false)
            return false;
        if (other.getCaptcha() == null ^ this.getCaptcha() == null)
            return false;
        if (other.getCaptcha() != null && other.getCaptcha().equals(this.getCaptcha()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllow() == null) ? 0 : getAllow().hashCode());
        hashCode = prime * hashCode + ((getBlock() == null) ? 0 : getBlock().hashCode());
        hashCode = prime * hashCode + ((getCaptcha() == null) ? 0 : getCaptcha().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafv2RulesActionDetails clone() {
        try {
            return (AwsWafv2RulesActionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafv2RulesActionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
