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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of IP address ranges (<a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">CIDRs</a>).
 * Used to create an allow list of IP addresses for a private workforce. For more information, see .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SourceIpConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceIpConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of one to four <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Classless
     * Inter-Domain Routing</a> (CIDR) values.
     * </p>
     * <p>
     * Maximum: Four CIDR values
     * </p>
     * <note>
     * <p>
     * The following Length Constraints apply to individual CIDR values in the CIDR value list.
     * </p>
     * </note>
     */
    private java.util.List<String> cidrs;

    /**
     * <p>
     * A list of one to four <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Classless
     * Inter-Domain Routing</a> (CIDR) values.
     * </p>
     * <p>
     * Maximum: Four CIDR values
     * </p>
     * <note>
     * <p>
     * The following Length Constraints apply to individual CIDR values in the CIDR value list.
     * </p>
     * </note>
     * 
     * @return A list of one to four <a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Classless Inter-Domain
     *         Routing</a> (CIDR) values.</p>
     *         <p>
     *         Maximum: Four CIDR values
     *         </p>
     *         <note>
     *         <p>
     *         The following Length Constraints apply to individual CIDR values in the CIDR value list.
     *         </p>
     */

    public java.util.List<String> getCidrs() {
        return cidrs;
    }

    /**
     * <p>
     * A list of one to four <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Classless
     * Inter-Domain Routing</a> (CIDR) values.
     * </p>
     * <p>
     * Maximum: Four CIDR values
     * </p>
     * <note>
     * <p>
     * The following Length Constraints apply to individual CIDR values in the CIDR value list.
     * </p>
     * </note>
     * 
     * @param cidrs
     *        A list of one to four <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Classless Inter-Domain
     *        Routing</a> (CIDR) values.</p>
     *        <p>
     *        Maximum: Four CIDR values
     *        </p>
     *        <note>
     *        <p>
     *        The following Length Constraints apply to individual CIDR values in the CIDR value list.
     *        </p>
     */

    public void setCidrs(java.util.Collection<String> cidrs) {
        if (cidrs == null) {
            this.cidrs = null;
            return;
        }

        this.cidrs = new java.util.ArrayList<String>(cidrs);
    }

    /**
     * <p>
     * A list of one to four <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Classless
     * Inter-Domain Routing</a> (CIDR) values.
     * </p>
     * <p>
     * Maximum: Four CIDR values
     * </p>
     * <note>
     * <p>
     * The following Length Constraints apply to individual CIDR values in the CIDR value list.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrs(java.util.Collection)} or {@link #withCidrs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cidrs
     *        A list of one to four <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Classless Inter-Domain
     *        Routing</a> (CIDR) values.</p>
     *        <p>
     *        Maximum: Four CIDR values
     *        </p>
     *        <note>
     *        <p>
     *        The following Length Constraints apply to individual CIDR values in the CIDR value list.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceIpConfig withCidrs(String... cidrs) {
        if (this.cidrs == null) {
            setCidrs(new java.util.ArrayList<String>(cidrs.length));
        }
        for (String ele : cidrs) {
            this.cidrs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one to four <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Classless
     * Inter-Domain Routing</a> (CIDR) values.
     * </p>
     * <p>
     * Maximum: Four CIDR values
     * </p>
     * <note>
     * <p>
     * The following Length Constraints apply to individual CIDR values in the CIDR value list.
     * </p>
     * </note>
     * 
     * @param cidrs
     *        A list of one to four <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">Classless Inter-Domain
     *        Routing</a> (CIDR) values.</p>
     *        <p>
     *        Maximum: Four CIDR values
     *        </p>
     *        <note>
     *        <p>
     *        The following Length Constraints apply to individual CIDR values in the CIDR value list.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceIpConfig withCidrs(java.util.Collection<String> cidrs) {
        setCidrs(cidrs);
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
        if (getCidrs() != null)
            sb.append("Cidrs: ").append(getCidrs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceIpConfig == false)
            return false;
        SourceIpConfig other = (SourceIpConfig) obj;
        if (other.getCidrs() == null ^ this.getCidrs() == null)
            return false;
        if (other.getCidrs() != null && other.getCidrs().equals(this.getCidrs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrs() == null) ? 0 : getCidrs().hashCode());
        return hashCode;
    }

    @Override
    public SourceIpConfig clone() {
        try {
            return (SourceIpConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SourceIpConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
