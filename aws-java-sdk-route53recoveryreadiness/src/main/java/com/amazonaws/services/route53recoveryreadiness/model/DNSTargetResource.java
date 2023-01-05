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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A component for DNS/routing control readiness checks and architecture checks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DNSTargetResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DNSTargetResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The domain name that acts as an ingress point to a portion of the customer application.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The hosted zone Amazon Resource Name (ARN) that contains the DNS record with the provided name of the target
     * resource.
     * </p>
     */
    private String hostedZoneArn;
    /**
     * <p>
     * The Route 53 record set ID that uniquely identifies a DNS record, given a name and a type.
     * </p>
     */
    private String recordSetId;
    /**
     * <p>
     * The type of DNS record of the target resource.
     * </p>
     */
    private String recordType;
    /**
     * <p>
     * The target resource of the DNS target resource.
     * </p>
     */
    private TargetResource targetResource;

    /**
     * <p>
     * The domain name that acts as an ingress point to a portion of the customer application.
     * </p>
     * 
     * @param domainName
     *        The domain name that acts as an ingress point to a portion of the customer application.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name that acts as an ingress point to a portion of the customer application.
     * </p>
     * 
     * @return The domain name that acts as an ingress point to a portion of the customer application.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name that acts as an ingress point to a portion of the customer application.
     * </p>
     * 
     * @param domainName
     *        The domain name that acts as an ingress point to a portion of the customer application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNSTargetResource withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The hosted zone Amazon Resource Name (ARN) that contains the DNS record with the provided name of the target
     * resource.
     * </p>
     * 
     * @param hostedZoneArn
     *        The hosted zone Amazon Resource Name (ARN) that contains the DNS record with the provided name of the
     *        target resource.
     */

    public void setHostedZoneArn(String hostedZoneArn) {
        this.hostedZoneArn = hostedZoneArn;
    }

    /**
     * <p>
     * The hosted zone Amazon Resource Name (ARN) that contains the DNS record with the provided name of the target
     * resource.
     * </p>
     * 
     * @return The hosted zone Amazon Resource Name (ARN) that contains the DNS record with the provided name of the
     *         target resource.
     */

    public String getHostedZoneArn() {
        return this.hostedZoneArn;
    }

    /**
     * <p>
     * The hosted zone Amazon Resource Name (ARN) that contains the DNS record with the provided name of the target
     * resource.
     * </p>
     * 
     * @param hostedZoneArn
     *        The hosted zone Amazon Resource Name (ARN) that contains the DNS record with the provided name of the
     *        target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNSTargetResource withHostedZoneArn(String hostedZoneArn) {
        setHostedZoneArn(hostedZoneArn);
        return this;
    }

    /**
     * <p>
     * The Route 53 record set ID that uniquely identifies a DNS record, given a name and a type.
     * </p>
     * 
     * @param recordSetId
     *        The Route 53 record set ID that uniquely identifies a DNS record, given a name and a type.
     */

    public void setRecordSetId(String recordSetId) {
        this.recordSetId = recordSetId;
    }

    /**
     * <p>
     * The Route 53 record set ID that uniquely identifies a DNS record, given a name and a type.
     * </p>
     * 
     * @return The Route 53 record set ID that uniquely identifies a DNS record, given a name and a type.
     */

    public String getRecordSetId() {
        return this.recordSetId;
    }

    /**
     * <p>
     * The Route 53 record set ID that uniquely identifies a DNS record, given a name and a type.
     * </p>
     * 
     * @param recordSetId
     *        The Route 53 record set ID that uniquely identifies a DNS record, given a name and a type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNSTargetResource withRecordSetId(String recordSetId) {
        setRecordSetId(recordSetId);
        return this;
    }

    /**
     * <p>
     * The type of DNS record of the target resource.
     * </p>
     * 
     * @param recordType
     *        The type of DNS record of the target resource.
     */

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    /**
     * <p>
     * The type of DNS record of the target resource.
     * </p>
     * 
     * @return The type of DNS record of the target resource.
     */

    public String getRecordType() {
        return this.recordType;
    }

    /**
     * <p>
     * The type of DNS record of the target resource.
     * </p>
     * 
     * @param recordType
     *        The type of DNS record of the target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNSTargetResource withRecordType(String recordType) {
        setRecordType(recordType);
        return this;
    }

    /**
     * <p>
     * The target resource of the DNS target resource.
     * </p>
     * 
     * @param targetResource
     *        The target resource of the DNS target resource.
     */

    public void setTargetResource(TargetResource targetResource) {
        this.targetResource = targetResource;
    }

    /**
     * <p>
     * The target resource of the DNS target resource.
     * </p>
     * 
     * @return The target resource of the DNS target resource.
     */

    public TargetResource getTargetResource() {
        return this.targetResource;
    }

    /**
     * <p>
     * The target resource of the DNS target resource.
     * </p>
     * 
     * @param targetResource
     *        The target resource of the DNS target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNSTargetResource withTargetResource(TargetResource targetResource) {
        setTargetResource(targetResource);
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
        if (getHostedZoneArn() != null)
            sb.append("HostedZoneArn: ").append(getHostedZoneArn()).append(",");
        if (getRecordSetId() != null)
            sb.append("RecordSetId: ").append(getRecordSetId()).append(",");
        if (getRecordType() != null)
            sb.append("RecordType: ").append(getRecordType()).append(",");
        if (getTargetResource() != null)
            sb.append("TargetResource: ").append(getTargetResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DNSTargetResource == false)
            return false;
        DNSTargetResource other = (DNSTargetResource) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getHostedZoneArn() == null ^ this.getHostedZoneArn() == null)
            return false;
        if (other.getHostedZoneArn() != null && other.getHostedZoneArn().equals(this.getHostedZoneArn()) == false)
            return false;
        if (other.getRecordSetId() == null ^ this.getRecordSetId() == null)
            return false;
        if (other.getRecordSetId() != null && other.getRecordSetId().equals(this.getRecordSetId()) == false)
            return false;
        if (other.getRecordType() == null ^ this.getRecordType() == null)
            return false;
        if (other.getRecordType() != null && other.getRecordType().equals(this.getRecordType()) == false)
            return false;
        if (other.getTargetResource() == null ^ this.getTargetResource() == null)
            return false;
        if (other.getTargetResource() != null && other.getTargetResource().equals(this.getTargetResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getHostedZoneArn() == null) ? 0 : getHostedZoneArn().hashCode());
        hashCode = prime * hashCode + ((getRecordSetId() == null) ? 0 : getRecordSetId().hashCode());
        hashCode = prime * hashCode + ((getRecordType() == null) ? 0 : getRecordType().hashCode());
        hashCode = prime * hashCode + ((getTargetResource() == null) ? 0 : getTargetResource().hashCode());
        return hashCode;
    }

    @Override
    public DNSTargetResource clone() {
        try {
            return (DNSTargetResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoveryreadiness.model.transform.DNSTargetResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
