/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the domain validation records of an Amazon Lightsail SSL/TLS certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DomainValidationRecord" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainValidationRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The domain name of the certificate validation record. For example, <code>example.com</code> or
     * <code>www.example.com</code>.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
     * </p>
     */
    private ResourceRecord resourceRecord;

    /**
     * <p>
     * The domain name of the certificate validation record. For example, <code>example.com</code> or
     * <code>www.example.com</code>.
     * </p>
     * 
     * @param domainName
     *        The domain name of the certificate validation record. For example, <code>example.com</code> or
     *        <code>www.example.com</code>.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name of the certificate validation record. For example, <code>example.com</code> or
     * <code>www.example.com</code>.
     * </p>
     * 
     * @return The domain name of the certificate validation record. For example, <code>example.com</code> or
     *         <code>www.example.com</code>.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name of the certificate validation record. For example, <code>example.com</code> or
     * <code>www.example.com</code>.
     * </p>
     * 
     * @param domainName
     *        The domain name of the certificate validation record. For example, <code>example.com</code> or
     *        <code>www.example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidationRecord withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
     * </p>
     * 
     * @param resourceRecord
     *        An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
     */

    public void setResourceRecord(ResourceRecord resourceRecord) {
        this.resourceRecord = resourceRecord;
    }

    /**
     * <p>
     * An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
     * </p>
     * 
     * @return An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
     */

    public ResourceRecord getResourceRecord() {
        return this.resourceRecord;
    }

    /**
     * <p>
     * An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
     * </p>
     * 
     * @param resourceRecord
     *        An object that describes the DNS records to add to your domain's DNS to validate it for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidationRecord withResourceRecord(ResourceRecord resourceRecord) {
        setResourceRecord(resourceRecord);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getResourceRecord() != null)
            sb.append("ResourceRecord: ").append(getResourceRecord());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainValidationRecord == false)
            return false;
        DomainValidationRecord other = (DomainValidationRecord) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getResourceRecord() == null ^ this.getResourceRecord() == null)
            return false;
        if (other.getResourceRecord() != null && other.getResourceRecord().equals(this.getResourceRecord()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getResourceRecord() == null) ? 0 : getResourceRecord().hashCode());
        return hashCode;
    }

    @Override
    public DomainValidationRecord clone() {
        try {
            return (DomainValidationRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.DomainValidationRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
