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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the action setting that Shield Advanced should use in the WAF rules that it creates on behalf of the
 * protected resource in response to DDoS attacks. You specify this as part of the configuration for the automatic
 * application layer DDoS mitigation feature, when you enable or update automatic mitigation. Shield Advanced creates
 * the WAF rules in a Shield Advanced-managed rule group, inside the web ACL that you have associated with the resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ResponseAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Block</code> action.
     * </p>
     * <p>
     * You must specify exactly one action, either <code>Block</code> or <code>Count</code>.
     * </p>
     */
    private BlockAction block;
    /**
     * <p>
     * Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Count</code> action.
     * </p>
     * <p>
     * You must specify exactly one action, either <code>Block</code> or <code>Count</code>.
     * </p>
     */
    private CountAction count;

    /**
     * <p>
     * Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Block</code> action.
     * </p>
     * <p>
     * You must specify exactly one action, either <code>Block</code> or <code>Count</code>.
     * </p>
     * 
     * @param block
     *        Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Block</code> action. </p>
     *        <p>
     *        You must specify exactly one action, either <code>Block</code> or <code>Count</code>.
     */

    public void setBlock(BlockAction block) {
        this.block = block;
    }

    /**
     * <p>
     * Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Block</code> action.
     * </p>
     * <p>
     * You must specify exactly one action, either <code>Block</code> or <code>Count</code>.
     * </p>
     * 
     * @return Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Block</code> action.
     *         </p>
     *         <p>
     *         You must specify exactly one action, either <code>Block</code> or <code>Count</code>.
     */

    public BlockAction getBlock() {
        return this.block;
    }

    /**
     * <p>
     * Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Block</code> action.
     * </p>
     * <p>
     * You must specify exactly one action, either <code>Block</code> or <code>Count</code>.
     * </p>
     * 
     * @param block
     *        Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Block</code> action. </p>
     *        <p>
     *        You must specify exactly one action, either <code>Block</code> or <code>Count</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseAction withBlock(BlockAction block) {
        setBlock(block);
        return this;
    }

    /**
     * <p>
     * Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Count</code> action.
     * </p>
     * <p>
     * You must specify exactly one action, either <code>Block</code> or <code>Count</code>.
     * </p>
     * 
     * @param count
     *        Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Count</code> action. </p>
     *        <p>
     *        You must specify exactly one action, either <code>Block</code> or <code>Count</code>.
     */

    public void setCount(CountAction count) {
        this.count = count;
    }

    /**
     * <p>
     * Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Count</code> action.
     * </p>
     * <p>
     * You must specify exactly one action, either <code>Block</code> or <code>Count</code>.
     * </p>
     * 
     * @return Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Count</code> action.
     *         </p>
     *         <p>
     *         You must specify exactly one action, either <code>Block</code> or <code>Count</code>.
     */

    public CountAction getCount() {
        return this.count;
    }

    /**
     * <p>
     * Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Count</code> action.
     * </p>
     * <p>
     * You must specify exactly one action, either <code>Block</code> or <code>Count</code>.
     * </p>
     * 
     * @param count
     *        Specifies that Shield Advanced should configure its WAF rules with the WAF <code>Count</code> action. </p>
     *        <p>
     *        You must specify exactly one action, either <code>Block</code> or <code>Count</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseAction withCount(CountAction count) {
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

        if (obj instanceof ResponseAction == false)
            return false;
        ResponseAction other = (ResponseAction) obj;
        if (other.getBlock() == null ^ this.getBlock() == null)
            return false;
        if (other.getBlock() != null && other.getBlock().equals(this.getBlock()) == false)
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
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public ResponseAction clone() {
        try {
            return (ResponseAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.ResponseActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
