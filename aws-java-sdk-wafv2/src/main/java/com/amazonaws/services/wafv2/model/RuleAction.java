/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * The action that AWS WAF should take on a web request when it matches a rule's statement. Settings at the web ACL
 * level can override the rule action setting.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RuleAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Instructs AWS WAF to block the web request.
     * </p>
     */
    private BlockAction block;
    /**
     * <p>
     * Instructs AWS WAF to allow the web request.
     * </p>
     */
    private AllowAction allow;
    /**
     * <p>
     * Instructs AWS WAF to count the web request and allow it.
     * </p>
     */
    private CountAction count;

    /**
     * <p>
     * Instructs AWS WAF to block the web request.
     * </p>
     * 
     * @param block
     *        Instructs AWS WAF to block the web request.
     */

    public void setBlock(BlockAction block) {
        this.block = block;
    }

    /**
     * <p>
     * Instructs AWS WAF to block the web request.
     * </p>
     * 
     * @return Instructs AWS WAF to block the web request.
     */

    public BlockAction getBlock() {
        return this.block;
    }

    /**
     * <p>
     * Instructs AWS WAF to block the web request.
     * </p>
     * 
     * @param block
     *        Instructs AWS WAF to block the web request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withBlock(BlockAction block) {
        setBlock(block);
        return this;
    }

    /**
     * <p>
     * Instructs AWS WAF to allow the web request.
     * </p>
     * 
     * @param allow
     *        Instructs AWS WAF to allow the web request.
     */

    public void setAllow(AllowAction allow) {
        this.allow = allow;
    }

    /**
     * <p>
     * Instructs AWS WAF to allow the web request.
     * </p>
     * 
     * @return Instructs AWS WAF to allow the web request.
     */

    public AllowAction getAllow() {
        return this.allow;
    }

    /**
     * <p>
     * Instructs AWS WAF to allow the web request.
     * </p>
     * 
     * @param allow
     *        Instructs AWS WAF to allow the web request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withAllow(AllowAction allow) {
        setAllow(allow);
        return this;
    }

    /**
     * <p>
     * Instructs AWS WAF to count the web request and allow it.
     * </p>
     * 
     * @param count
     *        Instructs AWS WAF to count the web request and allow it.
     */

    public void setCount(CountAction count) {
        this.count = count;
    }

    /**
     * <p>
     * Instructs AWS WAF to count the web request and allow it.
     * </p>
     * 
     * @return Instructs AWS WAF to count the web request and allow it.
     */

    public CountAction getCount() {
        return this.count;
    }

    /**
     * <p>
     * Instructs AWS WAF to count the web request and allow it.
     * </p>
     * 
     * @param count
     *        Instructs AWS WAF to count the web request and allow it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withCount(CountAction count) {
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
        if (getBlock() != null)
            sb.append("Block: ").append(getBlock()).append(",");
        if (getAllow() != null)
            sb.append("Allow: ").append(getAllow()).append(",");
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlock() == null) ? 0 : getBlock().hashCode());
        hashCode = prime * hashCode + ((getAllow() == null) ? 0 : getAllow().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
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
