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
 * A rule statement used to detect web requests coming from particular IP addresses or address ranges. To use this,
 * create an <a>IPSet</a> that specifies the addresses you want to detect, then use the ARN of that set in this
 * statement. To create an IP set, see <a>CreateIPSet</a>.
 * </p>
 * <p>
 * Each IP set rule statement references an IP set. You create and maintain the set independent of your rules. This
 * allows you to use the single set in multiple rules. When you update the referenced set, AWS WAF automatically updates
 * all rules that reference it.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/IPSetReferenceStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IPSetReferenceStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a>IPSet</a> that this statement references.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a>IPSet</a> that this statement references.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the <a>IPSet</a> that this statement references.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a>IPSet</a> that this statement references.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the <a>IPSet</a> that this statement references.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the <a>IPSet</a> that this statement references.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the <a>IPSet</a> that this statement references.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPSetReferenceStatement withARN(String aRN) {
        setARN(aRN);
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IPSetReferenceStatement == false)
            return false;
        IPSetReferenceStatement other = (IPSetReferenceStatement) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public IPSetReferenceStatement clone() {
        try {
            return (IPSetReferenceStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.IPSetReferenceStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
