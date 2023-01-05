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
 * Specifies the action that Amazon CloudFront or WAF takes when a web request matches the conditions in the rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsWafv2WebAclActionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafv2WebAclActionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies that WAF should allow requests by default.
     * </p>
     */
    private AwsWafv2ActionAllowDetails allow;
    /**
     * <p>
     * Specifies that WAF should block requests by default.
     * </p>
     */
    private AwsWafv2ActionBlockDetails block;

    /**
     * <p>
     * Specifies that WAF should allow requests by default.
     * </p>
     * 
     * @param allow
     *        Specifies that WAF should allow requests by default.
     */

    public void setAllow(AwsWafv2ActionAllowDetails allow) {
        this.allow = allow;
    }

    /**
     * <p>
     * Specifies that WAF should allow requests by default.
     * </p>
     * 
     * @return Specifies that WAF should allow requests by default.
     */

    public AwsWafv2ActionAllowDetails getAllow() {
        return this.allow;
    }

    /**
     * <p>
     * Specifies that WAF should allow requests by default.
     * </p>
     * 
     * @param allow
     *        Specifies that WAF should allow requests by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2WebAclActionDetails withAllow(AwsWafv2ActionAllowDetails allow) {
        setAllow(allow);
        return this;
    }

    /**
     * <p>
     * Specifies that WAF should block requests by default.
     * </p>
     * 
     * @param block
     *        Specifies that WAF should block requests by default.
     */

    public void setBlock(AwsWafv2ActionBlockDetails block) {
        this.block = block;
    }

    /**
     * <p>
     * Specifies that WAF should block requests by default.
     * </p>
     * 
     * @return Specifies that WAF should block requests by default.
     */

    public AwsWafv2ActionBlockDetails getBlock() {
        return this.block;
    }

    /**
     * <p>
     * Specifies that WAF should block requests by default.
     * </p>
     * 
     * @param block
     *        Specifies that WAF should block requests by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsWafv2WebAclActionDetails withBlock(AwsWafv2ActionBlockDetails block) {
        setBlock(block);
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
            sb.append("Block: ").append(getBlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsWafv2WebAclActionDetails == false)
            return false;
        AwsWafv2WebAclActionDetails other = (AwsWafv2WebAclActionDetails) obj;
        if (other.getAllow() == null ^ this.getAllow() == null)
            return false;
        if (other.getAllow() != null && other.getAllow().equals(this.getAllow()) == false)
            return false;
        if (other.getBlock() == null ^ this.getBlock() == null)
            return false;
        if (other.getBlock() != null && other.getBlock().equals(this.getBlock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllow() == null) ? 0 : getAllow().hashCode());
        hashCode = prime * hashCode + ((getBlock() == null) ? 0 : getBlock().hashCode());
        return hashCode;
    }

    @Override
    public AwsWafv2WebAclActionDetails clone() {
        try {
            return (AwsWafv2WebAclActionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsWafv2WebAclActionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
