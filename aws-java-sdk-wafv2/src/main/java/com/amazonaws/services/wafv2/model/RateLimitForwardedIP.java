/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies the first IP address in an HTTP header as an aggregate key for a rate-based rule. Each distinct forwarded
 * IP address contributes to the aggregation instance.
 * </p>
 * <p>
 * This setting is used only in the <code>RateBasedStatementCustomKey</code> specification of a rate-based rule
 * statement. When you specify an IP or forwarded IP in the custom key settings, you must also specify at least one
 * other key to use. You can aggregate on only the forwarded IP address by specifying <code>FORWARDED_IP</code> in your
 * rate-based statement's <code>AggregateKeyType</code>.
 * </p>
 * <p>
 * This data type supports using the forwarded IP address in the web request aggregation for a rate-based rule, in
 * <code>RateBasedStatementCustomKey</code>. The JSON specification for using the forwarded IP address doesn't
 * explicitly use this data type.
 * </p>
 * <p>
 * JSON specification: <code>"ForwardedIP": {}</code>
 * </p>
 * <p>
 * When you use this specification, you must also configure the forwarded IP address in the rate-based statement's
 * <code>ForwardedIPConfig</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RateLimitForwardedIP" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RateLimitForwardedIP implements Serializable, Cloneable, StructuredPojo {

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
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RateLimitForwardedIP == false)
            return false;
        RateLimitForwardedIP other = (RateLimitForwardedIP) obj;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        return hashCode;
    }

    @Override
    public RateLimitForwardedIP clone() {
        try {
            return (RateLimitForwardedIP) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.RateLimitForwardedIPMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
