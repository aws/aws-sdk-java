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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A DNS record uploaded to your DNS provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DnsRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnsRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The RFC 1035 record type. Possible values: <code>CNAME</code>, <code>A</code>, <code>MX</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The DNS hostname.- For example, <code>domain.example.com</code>.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * The value returned by the DNS for a query to that hostname and record type.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The RFC 1035 record type. Possible values: <code>CNAME</code>, <code>A</code>, <code>MX</code>.
     * </p>
     * 
     * @param type
     *        The RFC 1035 record type. Possible values: <code>CNAME</code>, <code>A</code>, <code>MX</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The RFC 1035 record type. Possible values: <code>CNAME</code>, <code>A</code>, <code>MX</code>.
     * </p>
     * 
     * @return The RFC 1035 record type. Possible values: <code>CNAME</code>, <code>A</code>, <code>MX</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The RFC 1035 record type. Possible values: <code>CNAME</code>, <code>A</code>, <code>MX</code>.
     * </p>
     * 
     * @param type
     *        The RFC 1035 record type. Possible values: <code>CNAME</code>, <code>A</code>, <code>MX</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRecord withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The DNS hostname.- For example, <code>domain.example.com</code>.
     * </p>
     * 
     * @param hostname
     *        The DNS hostname.- For example, <code>domain.example.com</code>.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The DNS hostname.- For example, <code>domain.example.com</code>.
     * </p>
     * 
     * @return The DNS hostname.- For example, <code>domain.example.com</code>.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The DNS hostname.- For example, <code>domain.example.com</code>.
     * </p>
     * 
     * @param hostname
     *        The DNS hostname.- For example, <code>domain.example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRecord withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The value returned by the DNS for a query to that hostname and record type.
     * </p>
     * 
     * @param value
     *        The value returned by the DNS for a query to that hostname and record type.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value returned by the DNS for a query to that hostname and record type.
     * </p>
     * 
     * @return The value returned by the DNS for a query to that hostname and record type.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value returned by the DNS for a query to that hostname and record type.
     * </p>
     * 
     * @param value
     *        The value returned by the DNS for a query to that hostname and record type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRecord withValue(String value) {
        setValue(value);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsRecord == false)
            return false;
        DnsRecord other = (DnsRecord) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public DnsRecord clone() {
        try {
            return (DnsRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.DnsRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
