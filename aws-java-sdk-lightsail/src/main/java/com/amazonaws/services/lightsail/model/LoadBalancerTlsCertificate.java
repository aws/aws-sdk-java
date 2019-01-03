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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a load balancer SSL/TLS certificate.
 * </p>
 * <p>
 * TLS is just an updated, more secure version of Secure Socket Layer (SSL).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/LoadBalancerTlsCertificate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerTlsCertificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the SSL/TLS certificate (e.g., <code>my-certificate</code>).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL/TLS certificate.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail load
     * balancer or SSL/TLS certificate. This code enables our support team to look up your Lightsail information more
     * easily.
     * </p>
     */
    private String supportCode;
    /**
     * <p>
     * The time when you created your SSL/TLS certificate.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The AWS Region and Availability Zone where you created your certificate.
     * </p>
     */
    private ResourceLocation location;
    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancerTlsCertificate</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance</code> </b> - A Lightsail instance (a virtual private server)
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StaticIp</code> </b> - A static IP address
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KeyPair</code> </b> - The key pair used to connect to a Lightsail instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Domain</code> </b> - A DNS zone
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PeeredVpc</code> </b> - A peered VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS certificate associated with a Lightsail load
     * balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Disk</code> </b> - A Lightsail block storage disk
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskSnapshot</code> </b> - A block storage disk snapshot
     * </p>
     * </li>
     * </ul>
     */
    private String resourceType;
    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The load balancer name where your SSL/TLS certificate is attached.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     * </p>
     */
    private Boolean isAttached;
    /**
     * <p>
     * The status of the SSL/TLS certificate. Valid values are below.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The domain name for your SSL/TLS certificate.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * An array of LoadBalancerTlsCertificateDomainValidationRecord objects describing the records.
     * </p>
     */
    private java.util.List<LoadBalancerTlsCertificateDomainValidationRecord> domainValidationRecords;
    /**
     * <p>
     * The reason for the SSL/TLS certificate validation failure.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The time when the SSL/TLS certificate was issued.
     * </p>
     */
    private java.util.Date issuedAt;
    /**
     * <p>
     * The issuer of the certificate.
     * </p>
     */
    private String issuer;
    /**
     * <p>
     * The algorithm that was used to generate the key pair (the public and private key).
     * </p>
     */
    private String keyAlgorithm;
    /**
     * <p>
     * The timestamp when the SSL/TLS certificate expires.
     * </p>
     */
    private java.util.Date notAfter;
    /**
     * <p>
     * The timestamp when the SSL/TLS certificate is first valid.
     * </p>
     */
    private java.util.Date notBefore;
    /**
     * <p>
     * An object containing information about the status of Lightsail's managed renewal for the certificate.
     * </p>
     */
    private LoadBalancerTlsCertificateRenewalSummary renewalSummary;
    /**
     * <p>
     * The reason the certificate was revoked. Valid values are below.
     * </p>
     */
    private String revocationReason;
    /**
     * <p>
     * The timestamp when the SSL/TLS certificate was revoked.
     * </p>
     */
    private java.util.Date revokedAt;
    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     */
    private String serial;
    /**
     * <p>
     * The algorithm that was used to sign the certificate.
     * </p>
     */
    private String signatureAlgorithm;
    /**
     * <p>
     * The name of the entity that is associated with the public key contained in the certificate.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * One or more domains or subdomains included in the certificate. This list contains the domain names that are bound
     * to the public key that is contained in the certificate. The subject alternative names include the canonical
     * domain name (CNAME) of the certificate and additional domain names that can be used to connect to the website,
     * such as <code>example.com</code>, <code>www.example.com</code>, or <code>m.example.com</code>.
     * </p>
     */
    private java.util.List<String> subjectAlternativeNames;

    /**
     * <p>
     * The name of the SSL/TLS certificate (e.g., <code>my-certificate</code>).
     * </p>
     * 
     * @param name
     *        The name of the SSL/TLS certificate (e.g., <code>my-certificate</code>).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SSL/TLS certificate (e.g., <code>my-certificate</code>).
     * </p>
     * 
     * @return The name of the SSL/TLS certificate (e.g., <code>my-certificate</code>).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the SSL/TLS certificate (e.g., <code>my-certificate</code>).
     * </p>
     * 
     * @param name
     *        The name of the SSL/TLS certificate (e.g., <code>my-certificate</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL/TLS certificate.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the SSL/TLS certificate.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL/TLS certificate.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SSL/TLS certificate.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SSL/TLS certificate.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the SSL/TLS certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail load
     * balancer or SSL/TLS certificate. This code enables our support team to look up your Lightsail information more
     * easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about your Lightsail
     *        load balancer or SSL/TLS certificate. This code enables our support team to look up your Lightsail
     *        information more easily.
     */

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail load
     * balancer or SSL/TLS certificate. This code enables our support team to look up your Lightsail information more
     * easily.
     * </p>
     * 
     * @return The support code. Include this code in your email to support when you have questions about your Lightsail
     *         load balancer or SSL/TLS certificate. This code enables our support team to look up your Lightsail
     *         information more easily.
     */

    public String getSupportCode() {
        return this.supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail load
     * balancer or SSL/TLS certificate. This code enables our support team to look up your Lightsail information more
     * easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about your Lightsail
     *        load balancer or SSL/TLS certificate. This code enables our support team to look up your Lightsail
     *        information more easily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withSupportCode(String supportCode) {
        setSupportCode(supportCode);
        return this;
    }

    /**
     * <p>
     * The time when you created your SSL/TLS certificate.
     * </p>
     * 
     * @param createdAt
     *        The time when you created your SSL/TLS certificate.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when you created your SSL/TLS certificate.
     * </p>
     * 
     * @return The time when you created your SSL/TLS certificate.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when you created your SSL/TLS certificate.
     * </p>
     * 
     * @param createdAt
     *        The time when you created your SSL/TLS certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where you created your certificate.
     * </p>
     * 
     * @param location
     *        The AWS Region and Availability Zone where you created your certificate.
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where you created your certificate.
     * </p>
     * 
     * @return The AWS Region and Availability Zone where you created your certificate.
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The AWS Region and Availability Zone where you created your certificate.
     * </p>
     * 
     * @param location
     *        The AWS Region and Availability Zone where you created your certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancerTlsCertificate</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance</code> </b> - A Lightsail instance (a virtual private server)
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StaticIp</code> </b> - A static IP address
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KeyPair</code> </b> - The key pair used to connect to a Lightsail instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Domain</code> </b> - A DNS zone
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PeeredVpc</code> </b> - A peered VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS certificate associated with a Lightsail load
     * balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Disk</code> </b> - A Lightsail block storage disk
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskSnapshot</code> </b> - A block storage disk snapshot
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        The resource type (e.g., <code>LoadBalancerTlsCertificate</code>).</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Instance</code> </b> - A Lightsail instance (a virtual private server)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StaticIp</code> </b> - A static IP address
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>KeyPair</code> </b> - The key pair used to connect to a Lightsail instance
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance snapshot
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Domain</code> </b> - A DNS zone
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>PeeredVpc</code> </b> - A peered VPC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS certificate associated with a Lightsail load
     *        balancer
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Disk</code> </b> - A Lightsail block storage disk
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DiskSnapshot</code> </b> - A block storage disk snapshot
     *        </p>
     *        </li>
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancerTlsCertificate</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance</code> </b> - A Lightsail instance (a virtual private server)
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StaticIp</code> </b> - A static IP address
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KeyPair</code> </b> - The key pair used to connect to a Lightsail instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Domain</code> </b> - A DNS zone
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PeeredVpc</code> </b> - A peered VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS certificate associated with a Lightsail load
     * balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Disk</code> </b> - A Lightsail block storage disk
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskSnapshot</code> </b> - A block storage disk snapshot
     * </p>
     * </li>
     * </ul>
     * 
     * @return The resource type (e.g., <code>LoadBalancerTlsCertificate</code>).</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>Instance</code> </b> - A Lightsail instance (a virtual private server)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>StaticIp</code> </b> - A static IP address
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>KeyPair</code> </b> - The key pair used to connect to a Lightsail instance
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance snapshot
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Domain</code> </b> - A DNS zone
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>PeeredVpc</code> </b> - A peered VPC
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS certificate associated with a Lightsail
     *         load balancer
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>Disk</code> </b> - A Lightsail block storage disk
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>DiskSnapshot</code> </b> - A block storage disk snapshot
     *         </p>
     *         </li>
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancerTlsCertificate</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance</code> </b> - A Lightsail instance (a virtual private server)
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StaticIp</code> </b> - A static IP address
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KeyPair</code> </b> - The key pair used to connect to a Lightsail instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Domain</code> </b> - A DNS zone
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PeeredVpc</code> </b> - A peered VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS certificate associated with a Lightsail load
     * balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Disk</code> </b> - A Lightsail block storage disk
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskSnapshot</code> </b> - A block storage disk snapshot
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        The resource type (e.g., <code>LoadBalancerTlsCertificate</code>).</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Instance</code> </b> - A Lightsail instance (a virtual private server)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StaticIp</code> </b> - A static IP address
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>KeyPair</code> </b> - The key pair used to connect to a Lightsail instance
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance snapshot
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Domain</code> </b> - A DNS zone
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>PeeredVpc</code> </b> - A peered VPC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS certificate associated with a Lightsail load
     *        balancer
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Disk</code> </b> - A Lightsail block storage disk
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DiskSnapshot</code> </b> - A block storage disk snapshot
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LoadBalancerTlsCertificate withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type (e.g., <code>LoadBalancerTlsCertificate</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Instance</code> </b> - A Lightsail instance (a virtual private server)
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StaticIp</code> </b> - A static IP address
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>KeyPair</code> </b> - The key pair used to connect to a Lightsail instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance snapshot
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Domain</code> </b> - A DNS zone
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>PeeredVpc</code> </b> - A peered VPC
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS certificate associated with a Lightsail load
     * balancer
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>Disk</code> </b> - A Lightsail block storage disk
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskSnapshot</code> </b> - A block storage disk snapshot
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        The resource type (e.g., <code>LoadBalancerTlsCertificate</code>).</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Instance</code> </b> - A Lightsail instance (a virtual private server)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StaticIp</code> </b> - A static IP address
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>KeyPair</code> </b> - The key pair used to connect to a Lightsail instance
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>InstanceSnapshot</code> </b> - A Lightsail instance snapshot
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Domain</code> </b> - A DNS zone
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>PeeredVpc</code> </b> - A peered VPC
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>LoadBalancer</code> </b> - A Lightsail load balancer
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>LoadBalancerTlsCertificate</code> </b> - An SSL/TLS certificate associated with a Lightsail load
     *        balancer
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>Disk</code> </b> - A Lightsail block storage disk
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DiskSnapshot</code> </b> - A block storage disk snapshot
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LoadBalancerTlsCertificate withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @return The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *         <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *         Guide</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *        Guide</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Lightsail Dev
     *        Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The load balancer name where your SSL/TLS certificate is attached.
     * </p>
     * 
     * @param loadBalancerName
     *        The load balancer name where your SSL/TLS certificate is attached.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The load balancer name where your SSL/TLS certificate is attached.
     * </p>
     * 
     * @return The load balancer name where your SSL/TLS certificate is attached.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The load balancer name where your SSL/TLS certificate is attached.
     * </p>
     * 
     * @param loadBalancerName
     *        The load balancer name where your SSL/TLS certificate is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     * </p>
     * 
     * @param isAttached
     *        When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     */

    public void setIsAttached(Boolean isAttached) {
        this.isAttached = isAttached;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     * </p>
     * 
     * @return When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     */

    public Boolean getIsAttached() {
        return this.isAttached;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     * </p>
     * 
     * @param isAttached
     *        When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withIsAttached(Boolean isAttached) {
        setIsAttached(isAttached);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     * </p>
     * 
     * @return When <code>true</code>, the SSL/TLS certificate is attached to the Lightsail load balancer.
     */

    public Boolean isAttached() {
        return this.isAttached;
    }

    /**
     * <p>
     * The status of the SSL/TLS certificate. Valid values are below.
     * </p>
     * 
     * @param status
     *        The status of the SSL/TLS certificate. Valid values are below.
     * @see LoadBalancerTlsCertificateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the SSL/TLS certificate. Valid values are below.
     * </p>
     * 
     * @return The status of the SSL/TLS certificate. Valid values are below.
     * @see LoadBalancerTlsCertificateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the SSL/TLS certificate. Valid values are below.
     * </p>
     * 
     * @param status
     *        The status of the SSL/TLS certificate. Valid values are below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTlsCertificateStatus
     */

    public LoadBalancerTlsCertificate withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the SSL/TLS certificate. Valid values are below.
     * </p>
     * 
     * @param status
     *        The status of the SSL/TLS certificate. Valid values are below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTlsCertificateStatus
     */

    public LoadBalancerTlsCertificate withStatus(LoadBalancerTlsCertificateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The domain name for your SSL/TLS certificate.
     * </p>
     * 
     * @param domainName
     *        The domain name for your SSL/TLS certificate.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name for your SSL/TLS certificate.
     * </p>
     * 
     * @return The domain name for your SSL/TLS certificate.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name for your SSL/TLS certificate.
     * </p>
     * 
     * @param domainName
     *        The domain name for your SSL/TLS certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateDomainValidationRecord objects describing the records.
     * </p>
     * 
     * @return An array of LoadBalancerTlsCertificateDomainValidationRecord objects describing the records.
     */

    public java.util.List<LoadBalancerTlsCertificateDomainValidationRecord> getDomainValidationRecords() {
        return domainValidationRecords;
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateDomainValidationRecord objects describing the records.
     * </p>
     * 
     * @param domainValidationRecords
     *        An array of LoadBalancerTlsCertificateDomainValidationRecord objects describing the records.
     */

    public void setDomainValidationRecords(java.util.Collection<LoadBalancerTlsCertificateDomainValidationRecord> domainValidationRecords) {
        if (domainValidationRecords == null) {
            this.domainValidationRecords = null;
            return;
        }

        this.domainValidationRecords = new java.util.ArrayList<LoadBalancerTlsCertificateDomainValidationRecord>(domainValidationRecords);
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateDomainValidationRecord objects describing the records.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainValidationRecords(java.util.Collection)} or
     * {@link #withDomainValidationRecords(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param domainValidationRecords
     *        An array of LoadBalancerTlsCertificateDomainValidationRecord objects describing the records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withDomainValidationRecords(LoadBalancerTlsCertificateDomainValidationRecord... domainValidationRecords) {
        if (this.domainValidationRecords == null) {
            setDomainValidationRecords(new java.util.ArrayList<LoadBalancerTlsCertificateDomainValidationRecord>(domainValidationRecords.length));
        }
        for (LoadBalancerTlsCertificateDomainValidationRecord ele : domainValidationRecords) {
            this.domainValidationRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of LoadBalancerTlsCertificateDomainValidationRecord objects describing the records.
     * </p>
     * 
     * @param domainValidationRecords
     *        An array of LoadBalancerTlsCertificateDomainValidationRecord objects describing the records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withDomainValidationRecords(java.util.Collection<LoadBalancerTlsCertificateDomainValidationRecord> domainValidationRecords) {
        setDomainValidationRecords(domainValidationRecords);
        return this;
    }

    /**
     * <p>
     * The reason for the SSL/TLS certificate validation failure.
     * </p>
     * 
     * @param failureReason
     *        The reason for the SSL/TLS certificate validation failure.
     * @see LoadBalancerTlsCertificateFailureReason
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason for the SSL/TLS certificate validation failure.
     * </p>
     * 
     * @return The reason for the SSL/TLS certificate validation failure.
     * @see LoadBalancerTlsCertificateFailureReason
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason for the SSL/TLS certificate validation failure.
     * </p>
     * 
     * @param failureReason
     *        The reason for the SSL/TLS certificate validation failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTlsCertificateFailureReason
     */

    public LoadBalancerTlsCertificate withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The reason for the SSL/TLS certificate validation failure.
     * </p>
     * 
     * @param failureReason
     *        The reason for the SSL/TLS certificate validation failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTlsCertificateFailureReason
     */

    public LoadBalancerTlsCertificate withFailureReason(LoadBalancerTlsCertificateFailureReason failureReason) {
        this.failureReason = failureReason.toString();
        return this;
    }

    /**
     * <p>
     * The time when the SSL/TLS certificate was issued.
     * </p>
     * 
     * @param issuedAt
     *        The time when the SSL/TLS certificate was issued.
     */

    public void setIssuedAt(java.util.Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    /**
     * <p>
     * The time when the SSL/TLS certificate was issued.
     * </p>
     * 
     * @return The time when the SSL/TLS certificate was issued.
     */

    public java.util.Date getIssuedAt() {
        return this.issuedAt;
    }

    /**
     * <p>
     * The time when the SSL/TLS certificate was issued.
     * </p>
     * 
     * @param issuedAt
     *        The time when the SSL/TLS certificate was issued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withIssuedAt(java.util.Date issuedAt) {
        setIssuedAt(issuedAt);
        return this;
    }

    /**
     * <p>
     * The issuer of the certificate.
     * </p>
     * 
     * @param issuer
     *        The issuer of the certificate.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The issuer of the certificate.
     * </p>
     * 
     * @return The issuer of the certificate.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The issuer of the certificate.
     * </p>
     * 
     * @param issuer
     *        The issuer of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withIssuer(String issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * The algorithm that was used to generate the key pair (the public and private key).
     * </p>
     * 
     * @param keyAlgorithm
     *        The algorithm that was used to generate the key pair (the public and private key).
     */

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    /**
     * <p>
     * The algorithm that was used to generate the key pair (the public and private key).
     * </p>
     * 
     * @return The algorithm that was used to generate the key pair (the public and private key).
     */

    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * <p>
     * The algorithm that was used to generate the key pair (the public and private key).
     * </p>
     * 
     * @param keyAlgorithm
     *        The algorithm that was used to generate the key pair (the public and private key).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withKeyAlgorithm(String keyAlgorithm) {
        setKeyAlgorithm(keyAlgorithm);
        return this;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate expires.
     * </p>
     * 
     * @param notAfter
     *        The timestamp when the SSL/TLS certificate expires.
     */

    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate expires.
     * </p>
     * 
     * @return The timestamp when the SSL/TLS certificate expires.
     */

    public java.util.Date getNotAfter() {
        return this.notAfter;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate expires.
     * </p>
     * 
     * @param notAfter
     *        The timestamp when the SSL/TLS certificate expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withNotAfter(java.util.Date notAfter) {
        setNotAfter(notAfter);
        return this;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate is first valid.
     * </p>
     * 
     * @param notBefore
     *        The timestamp when the SSL/TLS certificate is first valid.
     */

    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate is first valid.
     * </p>
     * 
     * @return The timestamp when the SSL/TLS certificate is first valid.
     */

    public java.util.Date getNotBefore() {
        return this.notBefore;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate is first valid.
     * </p>
     * 
     * @param notBefore
     *        The timestamp when the SSL/TLS certificate is first valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withNotBefore(java.util.Date notBefore) {
        setNotBefore(notBefore);
        return this;
    }

    /**
     * <p>
     * An object containing information about the status of Lightsail's managed renewal for the certificate.
     * </p>
     * 
     * @param renewalSummary
     *        An object containing information about the status of Lightsail's managed renewal for the certificate.
     */

    public void setRenewalSummary(LoadBalancerTlsCertificateRenewalSummary renewalSummary) {
        this.renewalSummary = renewalSummary;
    }

    /**
     * <p>
     * An object containing information about the status of Lightsail's managed renewal for the certificate.
     * </p>
     * 
     * @return An object containing information about the status of Lightsail's managed renewal for the certificate.
     */

    public LoadBalancerTlsCertificateRenewalSummary getRenewalSummary() {
        return this.renewalSummary;
    }

    /**
     * <p>
     * An object containing information about the status of Lightsail's managed renewal for the certificate.
     * </p>
     * 
     * @param renewalSummary
     *        An object containing information about the status of Lightsail's managed renewal for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withRenewalSummary(LoadBalancerTlsCertificateRenewalSummary renewalSummary) {
        setRenewalSummary(renewalSummary);
        return this;
    }

    /**
     * <p>
     * The reason the certificate was revoked. Valid values are below.
     * </p>
     * 
     * @param revocationReason
     *        The reason the certificate was revoked. Valid values are below.
     * @see LoadBalancerTlsCertificateRevocationReason
     */

    public void setRevocationReason(String revocationReason) {
        this.revocationReason = revocationReason;
    }

    /**
     * <p>
     * The reason the certificate was revoked. Valid values are below.
     * </p>
     * 
     * @return The reason the certificate was revoked. Valid values are below.
     * @see LoadBalancerTlsCertificateRevocationReason
     */

    public String getRevocationReason() {
        return this.revocationReason;
    }

    /**
     * <p>
     * The reason the certificate was revoked. Valid values are below.
     * </p>
     * 
     * @param revocationReason
     *        The reason the certificate was revoked. Valid values are below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTlsCertificateRevocationReason
     */

    public LoadBalancerTlsCertificate withRevocationReason(String revocationReason) {
        setRevocationReason(revocationReason);
        return this;
    }

    /**
     * <p>
     * The reason the certificate was revoked. Valid values are below.
     * </p>
     * 
     * @param revocationReason
     *        The reason the certificate was revoked. Valid values are below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoadBalancerTlsCertificateRevocationReason
     */

    public LoadBalancerTlsCertificate withRevocationReason(LoadBalancerTlsCertificateRevocationReason revocationReason) {
        this.revocationReason = revocationReason.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate was revoked.
     * </p>
     * 
     * @param revokedAt
     *        The timestamp when the SSL/TLS certificate was revoked.
     */

    public void setRevokedAt(java.util.Date revokedAt) {
        this.revokedAt = revokedAt;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate was revoked.
     * </p>
     * 
     * @return The timestamp when the SSL/TLS certificate was revoked.
     */

    public java.util.Date getRevokedAt() {
        return this.revokedAt;
    }

    /**
     * <p>
     * The timestamp when the SSL/TLS certificate was revoked.
     * </p>
     * 
     * @param revokedAt
     *        The timestamp when the SSL/TLS certificate was revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withRevokedAt(java.util.Date revokedAt) {
        setRevokedAt(revokedAt);
        return this;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @param serial
     *        The serial number of the certificate.
     */

    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @return The serial number of the certificate.
     */

    public String getSerial() {
        return this.serial;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @param serial
     *        The serial number of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withSerial(String serial) {
        setSerial(serial);
        return this;
    }

    /**
     * <p>
     * The algorithm that was used to sign the certificate.
     * </p>
     * 
     * @param signatureAlgorithm
     *        The algorithm that was used to sign the certificate.
     */

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    /**
     * <p>
     * The algorithm that was used to sign the certificate.
     * </p>
     * 
     * @return The algorithm that was used to sign the certificate.
     */

    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    /**
     * <p>
     * The algorithm that was used to sign the certificate.
     * </p>
     * 
     * @param signatureAlgorithm
     *        The algorithm that was used to sign the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withSignatureAlgorithm(String signatureAlgorithm) {
        setSignatureAlgorithm(signatureAlgorithm);
        return this;
    }

    /**
     * <p>
     * The name of the entity that is associated with the public key contained in the certificate.
     * </p>
     * 
     * @param subject
     *        The name of the entity that is associated with the public key contained in the certificate.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The name of the entity that is associated with the public key contained in the certificate.
     * </p>
     * 
     * @return The name of the entity that is associated with the public key contained in the certificate.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The name of the entity that is associated with the public key contained in the certificate.
     * </p>
     * 
     * @param subject
     *        The name of the entity that is associated with the public key contained in the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * One or more domains or subdomains included in the certificate. This list contains the domain names that are bound
     * to the public key that is contained in the certificate. The subject alternative names include the canonical
     * domain name (CNAME) of the certificate and additional domain names that can be used to connect to the website,
     * such as <code>example.com</code>, <code>www.example.com</code>, or <code>m.example.com</code>.
     * </p>
     * 
     * @return One or more domains or subdomains included in the certificate. This list contains the domain names that
     *         are bound to the public key that is contained in the certificate. The subject alternative names include
     *         the canonical domain name (CNAME) of the certificate and additional domain names that can be used to
     *         connect to the website, such as <code>example.com</code>, <code>www.example.com</code>, or
     *         <code>m.example.com</code>.
     */

    public java.util.List<String> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    /**
     * <p>
     * One or more domains or subdomains included in the certificate. This list contains the domain names that are bound
     * to the public key that is contained in the certificate. The subject alternative names include the canonical
     * domain name (CNAME) of the certificate and additional domain names that can be used to connect to the website,
     * such as <code>example.com</code>, <code>www.example.com</code>, or <code>m.example.com</code>.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        One or more domains or subdomains included in the certificate. This list contains the domain names that
     *        are bound to the public key that is contained in the certificate. The subject alternative names include
     *        the canonical domain name (CNAME) of the certificate and additional domain names that can be used to
     *        connect to the website, such as <code>example.com</code>, <code>www.example.com</code>, or
     *        <code>m.example.com</code>.
     */

    public void setSubjectAlternativeNames(java.util.Collection<String> subjectAlternativeNames) {
        if (subjectAlternativeNames == null) {
            this.subjectAlternativeNames = null;
            return;
        }

        this.subjectAlternativeNames = new java.util.ArrayList<String>(subjectAlternativeNames);
    }

    /**
     * <p>
     * One or more domains or subdomains included in the certificate. This list contains the domain names that are bound
     * to the public key that is contained in the certificate. The subject alternative names include the canonical
     * domain name (CNAME) of the certificate and additional domain names that can be used to connect to the website,
     * such as <code>example.com</code>, <code>www.example.com</code>, or <code>m.example.com</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubjectAlternativeNames(java.util.Collection)} or
     * {@link #withSubjectAlternativeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        One or more domains or subdomains included in the certificate. This list contains the domain names that
     *        are bound to the public key that is contained in the certificate. The subject alternative names include
     *        the canonical domain name (CNAME) of the certificate and additional domain names that can be used to
     *        connect to the website, such as <code>example.com</code>, <code>www.example.com</code>, or
     *        <code>m.example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withSubjectAlternativeNames(String... subjectAlternativeNames) {
        if (this.subjectAlternativeNames == null) {
            setSubjectAlternativeNames(new java.util.ArrayList<String>(subjectAlternativeNames.length));
        }
        for (String ele : subjectAlternativeNames) {
            this.subjectAlternativeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more domains or subdomains included in the certificate. This list contains the domain names that are bound
     * to the public key that is contained in the certificate. The subject alternative names include the canonical
     * domain name (CNAME) of the certificate and additional domain names that can be used to connect to the website,
     * such as <code>example.com</code>, <code>www.example.com</code>, or <code>m.example.com</code>.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        One or more domains or subdomains included in the certificate. This list contains the domain names that
     *        are bound to the public key that is contained in the certificate. The subject alternative names include
     *        the canonical domain name (CNAME) of the certificate and additional domain names that can be used to
     *        connect to the website, such as <code>example.com</code>, <code>www.example.com</code>, or
     *        <code>m.example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTlsCertificate withSubjectAlternativeNames(java.util.Collection<String> subjectAlternativeNames) {
        setSubjectAlternativeNames(subjectAlternativeNames);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getSupportCode() != null)
            sb.append("SupportCode: ").append(getSupportCode()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: ").append(getLoadBalancerName()).append(",");
        if (getIsAttached() != null)
            sb.append("IsAttached: ").append(getIsAttached()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getDomainValidationRecords() != null)
            sb.append("DomainValidationRecords: ").append(getDomainValidationRecords()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getIssuedAt() != null)
            sb.append("IssuedAt: ").append(getIssuedAt()).append(",");
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer()).append(",");
        if (getKeyAlgorithm() != null)
            sb.append("KeyAlgorithm: ").append(getKeyAlgorithm()).append(",");
        if (getNotAfter() != null)
            sb.append("NotAfter: ").append(getNotAfter()).append(",");
        if (getNotBefore() != null)
            sb.append("NotBefore: ").append(getNotBefore()).append(",");
        if (getRenewalSummary() != null)
            sb.append("RenewalSummary: ").append(getRenewalSummary()).append(",");
        if (getRevocationReason() != null)
            sb.append("RevocationReason: ").append(getRevocationReason()).append(",");
        if (getRevokedAt() != null)
            sb.append("RevokedAt: ").append(getRevokedAt()).append(",");
        if (getSerial() != null)
            sb.append("Serial: ").append(getSerial()).append(",");
        if (getSignatureAlgorithm() != null)
            sb.append("SignatureAlgorithm: ").append(getSignatureAlgorithm()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getSubjectAlternativeNames() != null)
            sb.append("SubjectAlternativeNames: ").append(getSubjectAlternativeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerTlsCertificate == false)
            return false;
        LoadBalancerTlsCertificate other = (LoadBalancerTlsCertificate) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null && other.getSupportCode().equals(this.getSupportCode()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
            return false;
        if (other.getIsAttached() == null ^ this.getIsAttached() == null)
            return false;
        if (other.getIsAttached() != null && other.getIsAttached().equals(this.getIsAttached()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDomainValidationRecords() == null ^ this.getDomainValidationRecords() == null)
            return false;
        if (other.getDomainValidationRecords() != null && other.getDomainValidationRecords().equals(this.getDomainValidationRecords()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getIssuedAt() == null ^ this.getIssuedAt() == null)
            return false;
        if (other.getIssuedAt() != null && other.getIssuedAt().equals(this.getIssuedAt()) == false)
            return false;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getKeyAlgorithm() == null ^ this.getKeyAlgorithm() == null)
            return false;
        if (other.getKeyAlgorithm() != null && other.getKeyAlgorithm().equals(this.getKeyAlgorithm()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false)
            return false;
        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        if (other.getRenewalSummary() == null ^ this.getRenewalSummary() == null)
            return false;
        if (other.getRenewalSummary() != null && other.getRenewalSummary().equals(this.getRenewalSummary()) == false)
            return false;
        if (other.getRevocationReason() == null ^ this.getRevocationReason() == null)
            return false;
        if (other.getRevocationReason() != null && other.getRevocationReason().equals(this.getRevocationReason()) == false)
            return false;
        if (other.getRevokedAt() == null ^ this.getRevokedAt() == null)
            return false;
        if (other.getRevokedAt() != null && other.getRevokedAt().equals(this.getRevokedAt()) == false)
            return false;
        if (other.getSerial() == null ^ this.getSerial() == null)
            return false;
        if (other.getSerial() != null && other.getSerial().equals(this.getSerial()) == false)
            return false;
        if (other.getSignatureAlgorithm() == null ^ this.getSignatureAlgorithm() == null)
            return false;
        if (other.getSignatureAlgorithm() != null && other.getSignatureAlgorithm().equals(this.getSignatureAlgorithm()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getSubjectAlternativeNames() == null ^ this.getSubjectAlternativeNames() == null)
            return false;
        if (other.getSubjectAlternativeNames() != null && other.getSubjectAlternativeNames().equals(this.getSubjectAlternativeNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getIsAttached() == null) ? 0 : getIsAttached().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDomainValidationRecords() == null) ? 0 : getDomainValidationRecords().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getIssuedAt() == null) ? 0 : getIssuedAt().hashCode());
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getKeyAlgorithm() == null) ? 0 : getKeyAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        hashCode = prime * hashCode + ((getRenewalSummary() == null) ? 0 : getRenewalSummary().hashCode());
        hashCode = prime * hashCode + ((getRevocationReason() == null) ? 0 : getRevocationReason().hashCode());
        hashCode = prime * hashCode + ((getRevokedAt() == null) ? 0 : getRevokedAt().hashCode());
        hashCode = prime * hashCode + ((getSerial() == null) ? 0 : getSerial().hashCode());
        hashCode = prime * hashCode + ((getSignatureAlgorithm() == null) ? 0 : getSignatureAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getSubjectAlternativeNames() == null) ? 0 : getSubjectAlternativeNames().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancerTlsCertificate clone() {
        try {
            return (LoadBalancerTlsCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.LoadBalancerTlsCertificateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
