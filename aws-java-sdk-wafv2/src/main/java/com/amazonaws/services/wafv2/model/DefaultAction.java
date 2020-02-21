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
 * In a <a>WebACL</a>, this is the action that you want AWS WAF to perform when a web request doesn't match any of the
 * rules in the <code>WebACL</code>. The default action must be a terminating action, so count is not allowed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DefaultAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies that AWS WAF should block requests by default.
     * </p>
     */
    private BlockAction block;
    /**
     * <p>
     * Specifies that AWS WAF should allow requests by default.
     * </p>
     */
    private AllowAction allow;

    /**
     * <p>
     * Specifies that AWS WAF should block requests by default.
     * </p>
     * 
     * @param block
     *        Specifies that AWS WAF should block requests by default.
     */

    public void setBlock(BlockAction block) {
        this.block = block;
    }

    /**
     * <p>
     * Specifies that AWS WAF should block requests by default.
     * </p>
     * 
     * @return Specifies that AWS WAF should block requests by default.
     */

    public BlockAction getBlock() {
        return this.block;
    }

    /**
     * <p>
     * Specifies that AWS WAF should block requests by default.
     * </p>
     * 
     * @param block
     *        Specifies that AWS WAF should block requests by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultAction withBlock(BlockAction block) {
        setBlock(block);
        return this;
    }

    /**
     * <p>
     * Specifies that AWS WAF should allow requests by default.
     * </p>
     * 
     * @param allow
     *        Specifies that AWS WAF should allow requests by default.
     */

    public void setAllow(AllowAction allow) {
        this.allow = allow;
    }

    /**
     * <p>
     * Specifies that AWS WAF should allow requests by default.
     * </p>
     * 
     * @return Specifies that AWS WAF should allow requests by default.
     */

    public AllowAction getAllow() {
        return this.allow;
    }

    /**
     * <p>
     * Specifies that AWS WAF should allow requests by default.
     * </p>
     * 
     * @param allow
     *        Specifies that AWS WAF should allow requests by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultAction withAllow(AllowAction allow) {
        setAllow(allow);
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
            sb.append("Allow: ").append(getAllow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultAction == false)
            return false;
        DefaultAction other = (DefaultAction) obj;
        if (other.getBlock() == null ^ this.getBlock() == null)
            return false;
        if (other.getBlock() != null && other.getBlock().equals(this.getBlock()) == false)
            return false;
        if (other.getAllow() == null ^ this.getAllow() == null)
            return false;
        if (other.getAllow() != null && other.getAllow().equals(this.getAllow()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlock() == null) ? 0 : getBlock().hashCode());
        hashCode = prime * hashCode + ((getAllow() == null) ? 0 : getAllow().hashCode());
        return hashCode;
    }

    @Override
    public DefaultAction clone() {
        try {
            return (DefaultAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.DefaultActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
