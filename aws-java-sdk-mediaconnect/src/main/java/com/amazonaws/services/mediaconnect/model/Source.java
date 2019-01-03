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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The settings for the source of the flow.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/Source" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Source implements Serializable, Cloneable, StructuredPojo {

    /** The type of encryption that is used on the content ingested from this source. */
    private Encryption decryption;
    /**
     * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect
     * account.
     */
    private String description;
    /**
     * The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The
     * entitlement is set by the content originator and the ARN is generated as part of the originator's flow.
     */
    private String entitlementArn;
    /** The IP address that the flow will be listening on for incoming content. */
    private String ingestIp;
    /** The port that the flow will be listening on for incoming content. */
    private Integer ingestPort;
    /** The name of the source. */
    private String name;
    /** The ARN of the source. */
    private String sourceArn;
    /** Attributes related to the transport stream that are used in the source. */
    private Transport transport;
    /**
     * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should
     * in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     */
    private String whitelistCidr;

    /**
     * The type of encryption that is used on the content ingested from this source.
     * 
     * @param decryption
     *        The type of encryption that is used on the content ingested from this source.
     */

    public void setDecryption(Encryption decryption) {
        this.decryption = decryption;
    }

    /**
     * The type of encryption that is used on the content ingested from this source.
     * 
     * @return The type of encryption that is used on the content ingested from this source.
     */

    public Encryption getDecryption() {
        return this.decryption;
    }

    /**
     * The type of encryption that is used on the content ingested from this source.
     * 
     * @param decryption
     *        The type of encryption that is used on the content ingested from this source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withDecryption(Encryption decryption) {
        setDecryption(decryption);
        return this;
    }

    /**
     * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect
     * account.
     * 
     * @param description
     *        A description for the source. This value is not used or seen outside of the current AWS Elemental
     *        MediaConnect account.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect
     * account.
     * 
     * @return A description for the source. This value is not used or seen outside of the current AWS Elemental
     *         MediaConnect account.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect
     * account.
     * 
     * @param description
     *        A description for the source. This value is not used or seen outside of the current AWS Elemental
     *        MediaConnect account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The
     * entitlement is set by the content originator and the ARN is generated as part of the originator's flow.
     * 
     * @param entitlementArn
     *        The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account.
     *        The entitlement is set by the content originator and the ARN is generated as part of the originator's
     *        flow.
     */

    public void setEntitlementArn(String entitlementArn) {
        this.entitlementArn = entitlementArn;
    }

    /**
     * The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The
     * entitlement is set by the content originator and the ARN is generated as part of the originator's flow.
     * 
     * @return The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account.
     *         The entitlement is set by the content originator and the ARN is generated as part of the originator's
     *         flow.
     */

    public String getEntitlementArn() {
        return this.entitlementArn;
    }

    /**
     * The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The
     * entitlement is set by the content originator and the ARN is generated as part of the originator's flow.
     * 
     * @param entitlementArn
     *        The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account.
     *        The entitlement is set by the content originator and the ARN is generated as part of the originator's
     *        flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withEntitlementArn(String entitlementArn) {
        setEntitlementArn(entitlementArn);
        return this;
    }

    /**
     * The IP address that the flow will be listening on for incoming content.
     * 
     * @param ingestIp
     *        The IP address that the flow will be listening on for incoming content.
     */

    public void setIngestIp(String ingestIp) {
        this.ingestIp = ingestIp;
    }

    /**
     * The IP address that the flow will be listening on for incoming content.
     * 
     * @return The IP address that the flow will be listening on for incoming content.
     */

    public String getIngestIp() {
        return this.ingestIp;
    }

    /**
     * The IP address that the flow will be listening on for incoming content.
     * 
     * @param ingestIp
     *        The IP address that the flow will be listening on for incoming content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withIngestIp(String ingestIp) {
        setIngestIp(ingestIp);
        return this;
    }

    /**
     * The port that the flow will be listening on for incoming content.
     * 
     * @param ingestPort
     *        The port that the flow will be listening on for incoming content.
     */

    public void setIngestPort(Integer ingestPort) {
        this.ingestPort = ingestPort;
    }

    /**
     * The port that the flow will be listening on for incoming content.
     * 
     * @return The port that the flow will be listening on for incoming content.
     */

    public Integer getIngestPort() {
        return this.ingestPort;
    }

    /**
     * The port that the flow will be listening on for incoming content.
     * 
     * @param ingestPort
     *        The port that the flow will be listening on for incoming content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withIngestPort(Integer ingestPort) {
        setIngestPort(ingestPort);
        return this;
    }

    /**
     * The name of the source.
     * 
     * @param name
     *        The name of the source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the source.
     * 
     * @return The name of the source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the source.
     * 
     * @param name
     *        The name of the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The ARN of the source.
     * 
     * @param sourceArn
     *        The ARN of the source.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * The ARN of the source.
     * 
     * @return The ARN of the source.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * The ARN of the source.
     * 
     * @param sourceArn
     *        The ARN of the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * Attributes related to the transport stream that are used in the source.
     * 
     * @param transport
     *        Attributes related to the transport stream that are used in the source.
     */

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    /**
     * Attributes related to the transport stream that are used in the source.
     * 
     * @return Attributes related to the transport stream that are used in the source.
     */

    public Transport getTransport() {
        return this.transport;
    }

    /**
     * Attributes related to the transport stream that are used in the source.
     * 
     * @param transport
     *        Attributes related to the transport stream that are used in the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withTransport(Transport transport) {
        setTransport(transport);
        return this;
    }

    /**
     * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should
     * in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @param whitelistCidr
     *        The range of IP addresses that should be allowed to contribute content to your source. These IP addresses
     *        should in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     */

    public void setWhitelistCidr(String whitelistCidr) {
        this.whitelistCidr = whitelistCidr;
    }

    /**
     * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should
     * in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @return The range of IP addresses that should be allowed to contribute content to your source. These IP addresses
     *         should in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     */

    public String getWhitelistCidr() {
        return this.whitelistCidr;
    }

    /**
     * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should
     * in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     * @param whitelistCidr
     *        The range of IP addresses that should be allowed to contribute content to your source. These IP addresses
     *        should in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withWhitelistCidr(String whitelistCidr) {
        setWhitelistCidr(whitelistCidr);
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
        if (getDecryption() != null)
            sb.append("Decryption: ").append(getDecryption()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEntitlementArn() != null)
            sb.append("EntitlementArn: ").append(getEntitlementArn()).append(",");
        if (getIngestIp() != null)
            sb.append("IngestIp: ").append(getIngestIp()).append(",");
        if (getIngestPort() != null)
            sb.append("IngestPort: ").append(getIngestPort()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getTransport() != null)
            sb.append("Transport: ").append(getTransport()).append(",");
        if (getWhitelistCidr() != null)
            sb.append("WhitelistCidr: ").append(getWhitelistCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Source == false)
            return false;
        Source other = (Source) obj;
        if (other.getDecryption() == null ^ this.getDecryption() == null)
            return false;
        if (other.getDecryption() != null && other.getDecryption().equals(this.getDecryption()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEntitlementArn() == null ^ this.getEntitlementArn() == null)
            return false;
        if (other.getEntitlementArn() != null && other.getEntitlementArn().equals(this.getEntitlementArn()) == false)
            return false;
        if (other.getIngestIp() == null ^ this.getIngestIp() == null)
            return false;
        if (other.getIngestIp() != null && other.getIngestIp().equals(this.getIngestIp()) == false)
            return false;
        if (other.getIngestPort() == null ^ this.getIngestPort() == null)
            return false;
        if (other.getIngestPort() != null && other.getIngestPort().equals(this.getIngestPort()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getTransport() == null ^ this.getTransport() == null)
            return false;
        if (other.getTransport() != null && other.getTransport().equals(this.getTransport()) == false)
            return false;
        if (other.getWhitelistCidr() == null ^ this.getWhitelistCidr() == null)
            return false;
        if (other.getWhitelistCidr() != null && other.getWhitelistCidr().equals(this.getWhitelistCidr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDecryption() == null) ? 0 : getDecryption().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEntitlementArn() == null) ? 0 : getEntitlementArn().hashCode());
        hashCode = prime * hashCode + ((getIngestIp() == null) ? 0 : getIngestIp().hashCode());
        hashCode = prime * hashCode + ((getIngestPort() == null) ? 0 : getIngestPort().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getTransport() == null) ? 0 : getTransport().hashCode());
        hashCode = prime * hashCode + ((getWhitelistCidr() == null) ? 0 : getWhitelistCidr().hashCode());
        return hashCode;
    }

    @Override
    public Source clone() {
        try {
            return (Source) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.SourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
