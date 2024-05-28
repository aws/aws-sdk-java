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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/DeleteFirewallRule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFirewallRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the firewall rule group that you want to delete the rule from.
     * </p>
     */
    private String firewallRuleGroupId;
    /**
     * <p>
     * The ID of the domain list that's used in the rule.
     * </p>
     */
    private String firewallDomainListId;
    /**
     * <p>
     * The DNS query type that the rule you are deleting evaluates. Allowed values are;
     * </p>
     * <ul>
     * <li>
     * <p>
     * A: Returns an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * AAAA: Returns an Ipv6 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * CAA: Restricts CAs that can create SSL/TLS certifications for the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * CNAME: Returns another domain name.
     * </p>
     * </li>
     * <li>
     * <p>
     * DS: Record that identifies the DNSSEC signing key of a delegated zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * MX: Specifies mail servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * NAPTR: Regular-expression-based rewriting of domain names.
     * </p>
     * </li>
     * <li>
     * <p>
     * NS: Authoritative name servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * PTR: Maps an IP address to a domain name.
     * </p>
     * </li>
     * <li>
     * <p>
     * SOA: Start of authority record for the zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * SPF: Lists the servers authorized to send emails from a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * SRV: Application specific values that identify servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * TXT: Verifies email senders and application-specific values.
     * </p>
     * </li>
     * <li>
     * <p>
     * A query type you define by using the DNS type ID, for example 28 for AAAA. The values must be defined as
     * TYPENUMBER, where the NUMBER can be 1-65334, for example, TYPE28. For more information, see <a
     * href="https://en.wikipedia.org/wiki/List_of_DNS_record_types">List of DNS record types</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String qtype;

    /**
     * <p>
     * The unique identifier of the firewall rule group that you want to delete the rule from.
     * </p>
     * 
     * @param firewallRuleGroupId
     *        The unique identifier of the firewall rule group that you want to delete the rule from.
     */

    public void setFirewallRuleGroupId(String firewallRuleGroupId) {
        this.firewallRuleGroupId = firewallRuleGroupId;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group that you want to delete the rule from.
     * </p>
     * 
     * @return The unique identifier of the firewall rule group that you want to delete the rule from.
     */

    public String getFirewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }

    /**
     * <p>
     * The unique identifier of the firewall rule group that you want to delete the rule from.
     * </p>
     * 
     * @param firewallRuleGroupId
     *        The unique identifier of the firewall rule group that you want to delete the rule from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFirewallRuleRequest withFirewallRuleGroupId(String firewallRuleGroupId) {
        setFirewallRuleGroupId(firewallRuleGroupId);
        return this;
    }

    /**
     * <p>
     * The ID of the domain list that's used in the rule.
     * </p>
     * 
     * @param firewallDomainListId
     *        The ID of the domain list that's used in the rule.
     */

    public void setFirewallDomainListId(String firewallDomainListId) {
        this.firewallDomainListId = firewallDomainListId;
    }

    /**
     * <p>
     * The ID of the domain list that's used in the rule.
     * </p>
     * 
     * @return The ID of the domain list that's used in the rule.
     */

    public String getFirewallDomainListId() {
        return this.firewallDomainListId;
    }

    /**
     * <p>
     * The ID of the domain list that's used in the rule.
     * </p>
     * 
     * @param firewallDomainListId
     *        The ID of the domain list that's used in the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFirewallRuleRequest withFirewallDomainListId(String firewallDomainListId) {
        setFirewallDomainListId(firewallDomainListId);
        return this;
    }

    /**
     * <p>
     * The DNS query type that the rule you are deleting evaluates. Allowed values are;
     * </p>
     * <ul>
     * <li>
     * <p>
     * A: Returns an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * AAAA: Returns an Ipv6 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * CAA: Restricts CAs that can create SSL/TLS certifications for the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * CNAME: Returns another domain name.
     * </p>
     * </li>
     * <li>
     * <p>
     * DS: Record that identifies the DNSSEC signing key of a delegated zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * MX: Specifies mail servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * NAPTR: Regular-expression-based rewriting of domain names.
     * </p>
     * </li>
     * <li>
     * <p>
     * NS: Authoritative name servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * PTR: Maps an IP address to a domain name.
     * </p>
     * </li>
     * <li>
     * <p>
     * SOA: Start of authority record for the zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * SPF: Lists the servers authorized to send emails from a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * SRV: Application specific values that identify servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * TXT: Verifies email senders and application-specific values.
     * </p>
     * </li>
     * <li>
     * <p>
     * A query type you define by using the DNS type ID, for example 28 for AAAA. The values must be defined as
     * TYPENUMBER, where the NUMBER can be 1-65334, for example, TYPE28. For more information, see <a
     * href="https://en.wikipedia.org/wiki/List_of_DNS_record_types">List of DNS record types</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param qtype
     *        The DNS query type that the rule you are deleting evaluates. Allowed values are; </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A: Returns an IPv4 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AAAA: Returns an Ipv6 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CAA: Restricts CAs that can create SSL/TLS certifications for the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CNAME: Returns another domain name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DS: Record that identifies the DNSSEC signing key of a delegated zone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MX: Specifies mail servers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NAPTR: Regular-expression-based rewriting of domain names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NS: Authoritative name servers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PTR: Maps an IP address to a domain name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SOA: Start of authority record for the zone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SPF: Lists the servers authorized to send emails from a domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SRV: Application specific values that identify servers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TXT: Verifies email senders and application-specific values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A query type you define by using the DNS type ID, for example 28 for AAAA. The values must be defined as
     *        TYPENUMBER, where the NUMBER can be 1-65334, for example, TYPE28. For more information, see <a
     *        href="https://en.wikipedia.org/wiki/List_of_DNS_record_types">List of DNS record types</a>.
     *        </p>
     *        </li>
     */

    public void setQtype(String qtype) {
        this.qtype = qtype;
    }

    /**
     * <p>
     * The DNS query type that the rule you are deleting evaluates. Allowed values are;
     * </p>
     * <ul>
     * <li>
     * <p>
     * A: Returns an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * AAAA: Returns an Ipv6 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * CAA: Restricts CAs that can create SSL/TLS certifications for the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * CNAME: Returns another domain name.
     * </p>
     * </li>
     * <li>
     * <p>
     * DS: Record that identifies the DNSSEC signing key of a delegated zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * MX: Specifies mail servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * NAPTR: Regular-expression-based rewriting of domain names.
     * </p>
     * </li>
     * <li>
     * <p>
     * NS: Authoritative name servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * PTR: Maps an IP address to a domain name.
     * </p>
     * </li>
     * <li>
     * <p>
     * SOA: Start of authority record for the zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * SPF: Lists the servers authorized to send emails from a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * SRV: Application specific values that identify servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * TXT: Verifies email senders and application-specific values.
     * </p>
     * </li>
     * <li>
     * <p>
     * A query type you define by using the DNS type ID, for example 28 for AAAA. The values must be defined as
     * TYPENUMBER, where the NUMBER can be 1-65334, for example, TYPE28. For more information, see <a
     * href="https://en.wikipedia.org/wiki/List_of_DNS_record_types">List of DNS record types</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The DNS query type that the rule you are deleting evaluates. Allowed values are; </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A: Returns an IPv4 address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AAAA: Returns an Ipv6 address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CAA: Restricts CAs that can create SSL/TLS certifications for the domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CNAME: Returns another domain name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DS: Record that identifies the DNSSEC signing key of a delegated zone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         MX: Specifies mail servers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NAPTR: Regular-expression-based rewriting of domain names.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NS: Authoritative name servers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PTR: Maps an IP address to a domain name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SOA: Start of authority record for the zone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SPF: Lists the servers authorized to send emails from a domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SRV: Application specific values that identify servers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TXT: Verifies email senders and application-specific values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A query type you define by using the DNS type ID, for example 28 for AAAA. The values must be defined as
     *         TYPENUMBER, where the NUMBER can be 1-65334, for example, TYPE28. For more information, see <a
     *         href="https://en.wikipedia.org/wiki/List_of_DNS_record_types">List of DNS record types</a>.
     *         </p>
     *         </li>
     */

    public String getQtype() {
        return this.qtype;
    }

    /**
     * <p>
     * The DNS query type that the rule you are deleting evaluates. Allowed values are;
     * </p>
     * <ul>
     * <li>
     * <p>
     * A: Returns an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * AAAA: Returns an Ipv6 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * CAA: Restricts CAs that can create SSL/TLS certifications for the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * CNAME: Returns another domain name.
     * </p>
     * </li>
     * <li>
     * <p>
     * DS: Record that identifies the DNSSEC signing key of a delegated zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * MX: Specifies mail servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * NAPTR: Regular-expression-based rewriting of domain names.
     * </p>
     * </li>
     * <li>
     * <p>
     * NS: Authoritative name servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * PTR: Maps an IP address to a domain name.
     * </p>
     * </li>
     * <li>
     * <p>
     * SOA: Start of authority record for the zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * SPF: Lists the servers authorized to send emails from a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * SRV: Application specific values that identify servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * TXT: Verifies email senders and application-specific values.
     * </p>
     * </li>
     * <li>
     * <p>
     * A query type you define by using the DNS type ID, for example 28 for AAAA. The values must be defined as
     * TYPENUMBER, where the NUMBER can be 1-65334, for example, TYPE28. For more information, see <a
     * href="https://en.wikipedia.org/wiki/List_of_DNS_record_types">List of DNS record types</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param qtype
     *        The DNS query type that the rule you are deleting evaluates. Allowed values are; </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A: Returns an IPv4 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AAAA: Returns an Ipv6 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CAA: Restricts CAs that can create SSL/TLS certifications for the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CNAME: Returns another domain name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DS: Record that identifies the DNSSEC signing key of a delegated zone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        MX: Specifies mail servers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NAPTR: Regular-expression-based rewriting of domain names.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NS: Authoritative name servers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PTR: Maps an IP address to a domain name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SOA: Start of authority record for the zone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SPF: Lists the servers authorized to send emails from a domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SRV: Application specific values that identify servers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TXT: Verifies email senders and application-specific values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A query type you define by using the DNS type ID, for example 28 for AAAA. The values must be defined as
     *        TYPENUMBER, where the NUMBER can be 1-65334, for example, TYPE28. For more information, see <a
     *        href="https://en.wikipedia.org/wiki/List_of_DNS_record_types">List of DNS record types</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFirewallRuleRequest withQtype(String qtype) {
        setQtype(qtype);
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
        if (getFirewallRuleGroupId() != null)
            sb.append("FirewallRuleGroupId: ").append(getFirewallRuleGroupId()).append(",");
        if (getFirewallDomainListId() != null)
            sb.append("FirewallDomainListId: ").append(getFirewallDomainListId()).append(",");
        if (getQtype() != null)
            sb.append("Qtype: ").append(getQtype());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFirewallRuleRequest == false)
            return false;
        DeleteFirewallRuleRequest other = (DeleteFirewallRuleRequest) obj;
        if (other.getFirewallRuleGroupId() == null ^ this.getFirewallRuleGroupId() == null)
            return false;
        if (other.getFirewallRuleGroupId() != null && other.getFirewallRuleGroupId().equals(this.getFirewallRuleGroupId()) == false)
            return false;
        if (other.getFirewallDomainListId() == null ^ this.getFirewallDomainListId() == null)
            return false;
        if (other.getFirewallDomainListId() != null && other.getFirewallDomainListId().equals(this.getFirewallDomainListId()) == false)
            return false;
        if (other.getQtype() == null ^ this.getQtype() == null)
            return false;
        if (other.getQtype() != null && other.getQtype().equals(this.getQtype()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallRuleGroupId() == null) ? 0 : getFirewallRuleGroupId().hashCode());
        hashCode = prime * hashCode + ((getFirewallDomainListId() == null) ? 0 : getFirewallDomainListId().hashCode());
        hashCode = prime * hashCode + ((getQtype() == null) ? 0 : getQtype().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFirewallRuleRequest clone() {
        return (DeleteFirewallRuleRequest) super.clone();
    }

}
