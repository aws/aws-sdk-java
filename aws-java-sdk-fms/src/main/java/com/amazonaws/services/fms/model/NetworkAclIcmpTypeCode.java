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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * ICMP protocol: The ICMP type and code.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/NetworkAclIcmpTypeCode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkAclIcmpTypeCode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ICMP code.
     * </p>
     */
    private Integer code;
    /**
     * <p>
     * ICMP type.
     * </p>
     */
    private Integer type;

    /**
     * <p>
     * ICMP code.
     * </p>
     * 
     * @param code
     *        ICMP code.
     */

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * <p>
     * ICMP code.
     * </p>
     * 
     * @return ICMP code.
     */

    public Integer getCode() {
        return this.code;
    }

    /**
     * <p>
     * ICMP code.
     * </p>
     * 
     * @param code
     *        ICMP code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclIcmpTypeCode withCode(Integer code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * ICMP type.
     * </p>
     * 
     * @param type
     *        ICMP type.
     */

    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * <p>
     * ICMP type.
     * </p>
     * 
     * @return ICMP type.
     */

    public Integer getType() {
        return this.type;
    }

    /**
     * <p>
     * ICMP type.
     * </p>
     * 
     * @param type
     *        ICMP type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAclIcmpTypeCode withType(Integer type) {
        setType(type);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkAclIcmpTypeCode == false)
            return false;
        NetworkAclIcmpTypeCode other = (NetworkAclIcmpTypeCode) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public NetworkAclIcmpTypeCode clone() {
        try {
            return (NetworkAclIcmpTypeCode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.NetworkAclIcmpTypeCodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
