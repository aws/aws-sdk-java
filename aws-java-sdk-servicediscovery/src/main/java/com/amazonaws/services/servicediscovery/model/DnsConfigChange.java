/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains information about changes to the Route 53 DNS records that AWS Cloud Map creates when
 * you register an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DnsConfigChange" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnsConfigChange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array that contains one <code>DnsRecord</code> object for each Route 53 record that you want AWS Cloud Map to
     * create when you register an instance.
     * </p>
     */
    private java.util.List<DnsRecord> dnsRecords;

    /**
     * <p>
     * An array that contains one <code>DnsRecord</code> object for each Route 53 record that you want AWS Cloud Map to
     * create when you register an instance.
     * </p>
     * 
     * @return An array that contains one <code>DnsRecord</code> object for each Route 53 record that you want AWS Cloud
     *         Map to create when you register an instance.
     */

    public java.util.List<DnsRecord> getDnsRecords() {
        return dnsRecords;
    }

    /**
     * <p>
     * An array that contains one <code>DnsRecord</code> object for each Route 53 record that you want AWS Cloud Map to
     * create when you register an instance.
     * </p>
     * 
     * @param dnsRecords
     *        An array that contains one <code>DnsRecord</code> object for each Route 53 record that you want AWS Cloud
     *        Map to create when you register an instance.
     */

    public void setDnsRecords(java.util.Collection<DnsRecord> dnsRecords) {
        if (dnsRecords == null) {
            this.dnsRecords = null;
            return;
        }

        this.dnsRecords = new java.util.ArrayList<DnsRecord>(dnsRecords);
    }

    /**
     * <p>
     * An array that contains one <code>DnsRecord</code> object for each Route 53 record that you want AWS Cloud Map to
     * create when you register an instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsRecords(java.util.Collection)} or {@link #withDnsRecords(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsRecords
     *        An array that contains one <code>DnsRecord</code> object for each Route 53 record that you want AWS Cloud
     *        Map to create when you register an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsConfigChange withDnsRecords(DnsRecord... dnsRecords) {
        if (this.dnsRecords == null) {
            setDnsRecords(new java.util.ArrayList<DnsRecord>(dnsRecords.length));
        }
        for (DnsRecord ele : dnsRecords) {
            this.dnsRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains one <code>DnsRecord</code> object for each Route 53 record that you want AWS Cloud Map to
     * create when you register an instance.
     * </p>
     * 
     * @param dnsRecords
     *        An array that contains one <code>DnsRecord</code> object for each Route 53 record that you want AWS Cloud
     *        Map to create when you register an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsConfigChange withDnsRecords(java.util.Collection<DnsRecord> dnsRecords) {
        setDnsRecords(dnsRecords);
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
        if (getDnsRecords() != null)
            sb.append("DnsRecords: ").append(getDnsRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsConfigChange == false)
            return false;
        DnsConfigChange other = (DnsConfigChange) obj;
        if (other.getDnsRecords() == null ^ this.getDnsRecords() == null)
            return false;
        if (other.getDnsRecords() != null && other.getDnsRecords().equals(this.getDnsRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDnsRecords() == null) ? 0 : getDnsRecords().hashCode());
        return hashCode;
    }

    @Override
    public DnsConfigChange clone() {
        try {
            return (DnsConfigChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.DnsConfigChangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
