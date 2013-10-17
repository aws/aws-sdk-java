/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.route53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#createHostedZone(CreateHostedZoneRequest) CreateHostedZone operation}.
 * <p>
 * This action creates a new hosted zone.
 * </p>
 * <p>
 * To create a new hosted zone, send a <code>POST</code> request to the <code>2012-12-12/hostedzone</code> resource. The request body must include an XML
 * document with a <code>CreateHostedZoneRequest</code> element. The response returns the <code>CreateHostedZoneResponse</code> element that contains
 * metadata about the hosted zone.
 * </p>
 * <p>
 * Route 53 automatically creates a default SOA record and four NS records for the zone. The NS records in the hosted zone are the name servers you give
 * your registrar to delegate your domain to. For more information about SOA and NS records, see <a
 * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html"> NS and SOA Records that Route 53 Creates for a Hosted Zone </a>
 * in the <i>Amazon Route 53 Developer Guide</i> .
 * </p>
 * <p>
 * When you create a zone, its initial status is <code>PENDING</code> . This means that it is not yet available on all DNS servers. The status of the
 * zone changes to <code>INSYNC</code> when the NS and SOA records are available on all Route 53 DNS servers.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#createHostedZone(CreateHostedZoneRequest)
 */
public class CreateHostedZoneRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the domain. This must be a fully-specified domain, for
     * example, www.example.com. The trailing dot is optional; Route 53
     * assumes that the domain name is fully qualified. This means that Route
     * 53 treats www.example.com (without a trailing dot) and
     * www.example.com. (with a trailing dot) as identical. <p>This is the
     * name you have registered with your DNS registrar. You should ask your
     * registrar to change the authoritative name servers for your domain to
     * the set of <code>NameServers</code> elements returned in
     * <code>DelegationSet</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String name;

    /**
     * A unique string that identifies the request and that allows failed
     * <code>CreateHostedZone</code> requests to be retried without the risk
     * of executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you create a hosted
     * zone. <code>CallerReference</code> can be any unique string; you might
     * choose to use a string that identifies your project, such as
     * <code>DNSMigration_01</code>. <p>Valid characters are any Unicode code
     * points that are legal in an XML 1.0 document. The UTF-8 encoding of
     * the value must be less than 128 bytes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String callerReference;

    /**
     * A complex type that contains an optional comment about your hosted
     * zone.
     */
    private HostedZoneConfig hostedZoneConfig;

    /**
     * Default constructor for a new CreateHostedZoneRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateHostedZoneRequest() {}
    
    /**
     * Constructs a new CreateHostedZoneRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name The name of the domain. This must be a fully-specified
     * domain, for example, www.example.com. The trailing dot is optional;
     * Route 53 assumes that the domain name is fully qualified. This means
     * that Route 53 treats www.example.com (without a trailing dot) and
     * www.example.com. (with a trailing dot) as identical. <p>This is the
     * name you have registered with your DNS registrar. You should ask your
     * registrar to change the authoritative name servers for your domain to
     * the set of <code>NameServers</code> elements returned in
     * <code>DelegationSet</code>.
     * @param callerReference A unique string that identifies the request and
     * that allows failed <code>CreateHostedZone</code> requests to be
     * retried without the risk of executing the operation twice. You must
     * use a unique <code>CallerReference</code> string every time you create
     * a hosted zone. <code>CallerReference</code> can be any unique string;
     * you might choose to use a string that identifies your project, such as
     * <code>DNSMigration_01</code>. <p>Valid characters are any Unicode code
     * points that are legal in an XML 1.0 document. The UTF-8 encoding of
     * the value must be less than 128 bytes.
     */
    public CreateHostedZoneRequest(String name, String callerReference) {
        setName(name);
        setCallerReference(callerReference);
    }

    /**
     * The name of the domain. This must be a fully-specified domain, for
     * example, www.example.com. The trailing dot is optional; Route 53
     * assumes that the domain name is fully qualified. This means that Route
     * 53 treats www.example.com (without a trailing dot) and
     * www.example.com. (with a trailing dot) as identical. <p>This is the
     * name you have registered with your DNS registrar. You should ask your
     * registrar to change the authoritative name servers for your domain to
     * the set of <code>NameServers</code> elements returned in
     * <code>DelegationSet</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The name of the domain. This must be a fully-specified domain, for
     *         example, www.example.com. The trailing dot is optional; Route 53
     *         assumes that the domain name is fully qualified. This means that Route
     *         53 treats www.example.com (without a trailing dot) and
     *         www.example.com. (with a trailing dot) as identical. <p>This is the
     *         name you have registered with your DNS registrar. You should ask your
     *         registrar to change the authoritative name servers for your domain to
     *         the set of <code>NameServers</code> elements returned in
     *         <code>DelegationSet</code>.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the domain. This must be a fully-specified domain, for
     * example, www.example.com. The trailing dot is optional; Route 53
     * assumes that the domain name is fully qualified. This means that Route
     * 53 treats www.example.com (without a trailing dot) and
     * www.example.com. (with a trailing dot) as identical. <p>This is the
     * name you have registered with your DNS registrar. You should ask your
     * registrar to change the authoritative name servers for your domain to
     * the set of <code>NameServers</code> elements returned in
     * <code>DelegationSet</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param name The name of the domain. This must be a fully-specified domain, for
     *         example, www.example.com. The trailing dot is optional; Route 53
     *         assumes that the domain name is fully qualified. This means that Route
     *         53 treats www.example.com (without a trailing dot) and
     *         www.example.com. (with a trailing dot) as identical. <p>This is the
     *         name you have registered with your DNS registrar. You should ask your
     *         registrar to change the authoritative name servers for your domain to
     *         the set of <code>NameServers</code> elements returned in
     *         <code>DelegationSet</code>.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the domain. This must be a fully-specified domain, for
     * example, www.example.com. The trailing dot is optional; Route 53
     * assumes that the domain name is fully qualified. This means that Route
     * 53 treats www.example.com (without a trailing dot) and
     * www.example.com. (with a trailing dot) as identical. <p>This is the
     * name you have registered with your DNS registrar. You should ask your
     * registrar to change the authoritative name servers for your domain to
     * the set of <code>NameServers</code> elements returned in
     * <code>DelegationSet</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param name The name of the domain. This must be a fully-specified domain, for
     *         example, www.example.com. The trailing dot is optional; Route 53
     *         assumes that the domain name is fully qualified. This means that Route
     *         53 treats www.example.com (without a trailing dot) and
     *         www.example.com. (with a trailing dot) as identical. <p>This is the
     *         name you have registered with your DNS registrar. You should ask your
     *         registrar to change the authoritative name servers for your domain to
     *         the set of <code>NameServers</code> elements returned in
     *         <code>DelegationSet</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateHostedZoneRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A unique string that identifies the request and that allows failed
     * <code>CreateHostedZone</code> requests to be retried without the risk
     * of executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you create a hosted
     * zone. <code>CallerReference</code> can be any unique string; you might
     * choose to use a string that identifies your project, such as
     * <code>DNSMigration_01</code>. <p>Valid characters are any Unicode code
     * points that are legal in an XML 1.0 document. The UTF-8 encoding of
     * the value must be less than 128 bytes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return A unique string that identifies the request and that allows failed
     *         <code>CreateHostedZone</code> requests to be retried without the risk
     *         of executing the operation twice. You must use a unique
     *         <code>CallerReference</code> string every time you create a hosted
     *         zone. <code>CallerReference</code> can be any unique string; you might
     *         choose to use a string that identifies your project, such as
     *         <code>DNSMigration_01</code>. <p>Valid characters are any Unicode code
     *         points that are legal in an XML 1.0 document. The UTF-8 encoding of
     *         the value must be less than 128 bytes.
     */
    public String getCallerReference() {
        return callerReference;
    }
    
    /**
     * A unique string that identifies the request and that allows failed
     * <code>CreateHostedZone</code> requests to be retried without the risk
     * of executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you create a hosted
     * zone. <code>CallerReference</code> can be any unique string; you might
     * choose to use a string that identifies your project, such as
     * <code>DNSMigration_01</code>. <p>Valid characters are any Unicode code
     * points that are legal in an XML 1.0 document. The UTF-8 encoding of
     * the value must be less than 128 bytes.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference A unique string that identifies the request and that allows failed
     *         <code>CreateHostedZone</code> requests to be retried without the risk
     *         of executing the operation twice. You must use a unique
     *         <code>CallerReference</code> string every time you create a hosted
     *         zone. <code>CallerReference</code> can be any unique string; you might
     *         choose to use a string that identifies your project, such as
     *         <code>DNSMigration_01</code>. <p>Valid characters are any Unicode code
     *         points that are legal in an XML 1.0 document. The UTF-8 encoding of
     *         the value must be less than 128 bytes.
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }
    
    /**
     * A unique string that identifies the request and that allows failed
     * <code>CreateHostedZone</code> requests to be retried without the risk
     * of executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you create a hosted
     * zone. <code>CallerReference</code> can be any unique string; you might
     * choose to use a string that identifies your project, such as
     * <code>DNSMigration_01</code>. <p>Valid characters are any Unicode code
     * points that are legal in an XML 1.0 document. The UTF-8 encoding of
     * the value must be less than 128 bytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference A unique string that identifies the request and that allows failed
     *         <code>CreateHostedZone</code> requests to be retried without the risk
     *         of executing the operation twice. You must use a unique
     *         <code>CallerReference</code> string every time you create a hosted
     *         zone. <code>CallerReference</code> can be any unique string; you might
     *         choose to use a string that identifies your project, such as
     *         <code>DNSMigration_01</code>. <p>Valid characters are any Unicode code
     *         points that are legal in an XML 1.0 document. The UTF-8 encoding of
     *         the value must be less than 128 bytes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateHostedZoneRequest withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * A complex type that contains an optional comment about your hosted
     * zone.
     *
     * @return A complex type that contains an optional comment about your hosted
     *         zone.
     */
    public HostedZoneConfig getHostedZoneConfig() {
        return hostedZoneConfig;
    }
    
    /**
     * A complex type that contains an optional comment about your hosted
     * zone.
     *
     * @param hostedZoneConfig A complex type that contains an optional comment about your hosted
     *         zone.
     */
    public void setHostedZoneConfig(HostedZoneConfig hostedZoneConfig) {
        this.hostedZoneConfig = hostedZoneConfig;
    }
    
    /**
     * A complex type that contains an optional comment about your hosted
     * zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostedZoneConfig A complex type that contains an optional comment about your hosted
     *         zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateHostedZoneRequest withHostedZoneConfig(HostedZoneConfig hostedZoneConfig) {
        this.hostedZoneConfig = hostedZoneConfig;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getCallerReference() != null) sb.append("CallerReference: " + getCallerReference() + ",");
        if (getHostedZoneConfig() != null) sb.append("HostedZoneConfig: " + getHostedZoneConfig() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode()); 
        hashCode = prime * hashCode + ((getHostedZoneConfig() == null) ? 0 : getHostedZoneConfig().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateHostedZoneRequest == false) return false;
        CreateHostedZoneRequest other = (CreateHostedZoneRequest)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getCallerReference() == null ^ this.getCallerReference() == null) return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false) return false; 
        if (other.getHostedZoneConfig() == null ^ this.getHostedZoneConfig() == null) return false;
        if (other.getHostedZoneConfig() != null && other.getHostedZoneConfig().equals(this.getHostedZoneConfig()) == false) return false; 
        return true;
    }
    
}
    