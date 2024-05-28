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
 * Specifies a label namespace to use as an aggregate key for a rate-based rule. Each distinct fully qualified label
 * name that has the specified label namespace contributes to the aggregation instance. If you use just one label
 * namespace as your custom key, then each label name fully defines an aggregation instance.
 * </p>
 * <p>
 * This uses only labels that have been added to the request by rules that are evaluated before this rate-based rule in
 * the web ACL.
 * </p>
 * <p>
 * For information about label namespaces and names, see <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-label-requirements.html">Label syntax and naming
 * requirements</a> in the <i>WAF Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RateLimitLabelNamespace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RateLimitLabelNamespace implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The namespace to use for aggregation.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The namespace to use for aggregation.
     * </p>
     * 
     * @param namespace
     *        The namespace to use for aggregation.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace to use for aggregation.
     * </p>
     * 
     * @return The namespace to use for aggregation.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace to use for aggregation.
     * </p>
     * 
     * @param namespace
     *        The namespace to use for aggregation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateLimitLabelNamespace withNamespace(String namespace) {
        setNamespace(namespace);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RateLimitLabelNamespace == false)
            return false;
        RateLimitLabelNamespace other = (RateLimitLabelNamespace) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public RateLimitLabelNamespace clone() {
        try {
            return (RateLimitLabelNamespace) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.RateLimitLabelNamespaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
