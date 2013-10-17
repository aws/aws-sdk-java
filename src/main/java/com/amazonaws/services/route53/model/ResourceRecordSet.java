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


/**
 * <p>
 * A complex type that contains information about the current resource record set.
 * </p>
 */
public class ResourceRecordSet implements Serializable {

    /**
     * The domain name of the current resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String name;

    /**
     * The type of the current resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     */
    private String type;

    /**
     * <i>Weighted, Regional, and Failover resource record sets only:</i> An
     * identifier that differentiates among multiple resource record sets
     * that have the same combination of DNS name and type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String setIdentifier;

    /**
     * <i>Weighted resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * determines what portion of traffic for the current resource record set
     * is routed to the associated location.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     */
    private Long weight;

    /**
     * <i>Regional resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * specifies the AWS region for the current resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1, ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1
     */
    private String region;

    /**
     * <i>Failover resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * indicates whether the current resource record set is a primary or
     * secondary resource record set. A failover set may contain at most one
     * resource record set marked as primary and one resource record set
     * marked as secondary. A resource record set marked as primary will be
     * returned if any of the following are true: (1) an associated health
     * check is passing, (2) if the resource record set is an alias with the
     * evaluate target health and at least one target resource record set is
     * healthy, (3) both the primary and secondary resource record set are
     * failing health checks or (4) there is no secondary resource record
     * set. A secondary resource record set will be returned if: (1) the
     * primary is failing a health check and either the secondary is passing
     * a health check or has no associated health check, or (2) there is no
     * primary resource record set. <p>Valid values: <code>PRIMARY</code> |
     * <code>SECONDARY</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARY, SECONDARY
     */
    private String failover;

    /**
     * The cache time to live for the current resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Long tTL;

    /**
     * A complex type that contains the resource records for the current
     * resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ResourceRecord> resourceRecords;

    /**
     * <i>Alias resource record sets only:</i> Information about the AWS
     * resource to which you are redirecting traffic.
     */
    private AliasTarget aliasTarget;

    /**
     * <i>Health Check resource record sets only, not required for alias
     * resource record sets:</i> An identifier that is used to identify
     * health check associated with the resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String healthCheckId;

    /**
     * Default constructor for a new ResourceRecordSet object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ResourceRecordSet() {}
    
    /**
     * Constructs a new ResourceRecordSet object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name The domain name of the current resource record set.
     * @param type The type of the current resource record set.
     */
    public ResourceRecordSet(String name, String type) {
        setName(name);
        setType(type);
    }

    /**
     * Constructs a new ResourceRecordSet object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name The domain name of the current resource record set.
     * @param type The type of the current resource record set.
     */
    public ResourceRecordSet(String name, RRType type) {
        this.name = name;
        this.type = type.toString();
    }

    /**
     * The domain name of the current resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The domain name of the current resource record set.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The domain name of the current resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param name The domain name of the current resource record set.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The domain name of the current resource record set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param name The domain name of the current resource record set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResourceRecordSet withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The type of the current resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @return The type of the current resource record set.
     *
     * @see RRType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of the current resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The type of the current resource record set.
     *
     * @see RRType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of the current resource record set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The type of the current resource record set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RRType
     */
    public ResourceRecordSet withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the current resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The type of the current resource record set.
     *
     * @see RRType
     */
    public void setType(RRType type) {
        this.type = type.toString();
    }
    
    /**
     * The type of the current resource record set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The type of the current resource record set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RRType
     */
    public ResourceRecordSet withType(RRType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <i>Weighted, Regional, and Failover resource record sets only:</i> An
     * identifier that differentiates among multiple resource record sets
     * that have the same combination of DNS name and type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <i>Weighted, Regional, and Failover resource record sets only:</i> An
     *         identifier that differentiates among multiple resource record sets
     *         that have the same combination of DNS name and type.
     */
    public String getSetIdentifier() {
        return setIdentifier;
    }
    
    /**
     * <i>Weighted, Regional, and Failover resource record sets only:</i> An
     * identifier that differentiates among multiple resource record sets
     * that have the same combination of DNS name and type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param setIdentifier <i>Weighted, Regional, and Failover resource record sets only:</i> An
     *         identifier that differentiates among multiple resource record sets
     *         that have the same combination of DNS name and type.
     */
    public void setSetIdentifier(String setIdentifier) {
        this.setIdentifier = setIdentifier;
    }
    
    /**
     * <i>Weighted, Regional, and Failover resource record sets only:</i> An
     * identifier that differentiates among multiple resource record sets
     * that have the same combination of DNS name and type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param setIdentifier <i>Weighted, Regional, and Failover resource record sets only:</i> An
     *         identifier that differentiates among multiple resource record sets
     *         that have the same combination of DNS name and type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResourceRecordSet withSetIdentifier(String setIdentifier) {
        this.setIdentifier = setIdentifier;
        return this;
    }

    /**
     * <i>Weighted resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * determines what portion of traffic for the current resource record set
     * is routed to the associated location.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @return <i>Weighted resource record sets only:</i> Among resource record sets
     *         that have the same combination of DNS name and type, a value that
     *         determines what portion of traffic for the current resource record set
     *         is routed to the associated location.
     */
    public Long getWeight() {
        return weight;
    }
    
    /**
     * <i>Weighted resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * determines what portion of traffic for the current resource record set
     * is routed to the associated location.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param weight <i>Weighted resource record sets only:</i> Among resource record sets
     *         that have the same combination of DNS name and type, a value that
     *         determines what portion of traffic for the current resource record set
     *         is routed to the associated location.
     */
    public void setWeight(Long weight) {
        this.weight = weight;
    }
    
    /**
     * <i>Weighted resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * determines what portion of traffic for the current resource record set
     * is routed to the associated location.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 255<br/>
     *
     * @param weight <i>Weighted resource record sets only:</i> Among resource record sets
     *         that have the same combination of DNS name and type, a value that
     *         determines what portion of traffic for the current resource record set
     *         is routed to the associated location.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResourceRecordSet withWeight(Long weight) {
        this.weight = weight;
        return this;
    }

    /**
     * <i>Regional resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * specifies the AWS region for the current resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1, ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1
     *
     * @return <i>Regional resource record sets only:</i> Among resource record sets
     *         that have the same combination of DNS name and type, a value that
     *         specifies the AWS region for the current resource record set.
     *
     * @see ResourceRecordSetRegion
     */
    public String getRegion() {
        return region;
    }
    
    /**
     * <i>Regional resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * specifies the AWS region for the current resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1, ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1
     *
     * @param region <i>Regional resource record sets only:</i> Among resource record sets
     *         that have the same combination of DNS name and type, a value that
     *         specifies the AWS region for the current resource record set.
     *
     * @see ResourceRecordSetRegion
     */
    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     * <i>Regional resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * specifies the AWS region for the current resource record set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1, ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1
     *
     * @param region <i>Regional resource record sets only:</i> Among resource record sets
     *         that have the same combination of DNS name and type, a value that
     *         specifies the AWS region for the current resource record set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ResourceRecordSetRegion
     */
    public ResourceRecordSet withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <i>Regional resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * specifies the AWS region for the current resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1, ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1
     *
     * @param region <i>Regional resource record sets only:</i> Among resource record sets
     *         that have the same combination of DNS name and type, a value that
     *         specifies the AWS region for the current resource record set.
     *
     * @see ResourceRecordSetRegion
     */
    public void setRegion(ResourceRecordSetRegion region) {
        this.region = region.toString();
    }
    
    /**
     * <i>Regional resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * specifies the AWS region for the current resource record set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-west-1, us-west-2, eu-west-1, ap-southeast-1, ap-southeast-2, ap-northeast-1, sa-east-1
     *
     * @param region <i>Regional resource record sets only:</i> Among resource record sets
     *         that have the same combination of DNS name and type, a value that
     *         specifies the AWS region for the current resource record set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ResourceRecordSetRegion
     */
    public ResourceRecordSet withRegion(ResourceRecordSetRegion region) {
        this.region = region.toString();
        return this;
    }

    /**
     * <i>Failover resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * indicates whether the current resource record set is a primary or
     * secondary resource record set. A failover set may contain at most one
     * resource record set marked as primary and one resource record set
     * marked as secondary. A resource record set marked as primary will be
     * returned if any of the following are true: (1) an associated health
     * check is passing, (2) if the resource record set is an alias with the
     * evaluate target health and at least one target resource record set is
     * healthy, (3) both the primary and secondary resource record set are
     * failing health checks or (4) there is no secondary resource record
     * set. A secondary resource record set will be returned if: (1) the
     * primary is failing a health check and either the secondary is passing
     * a health check or has no associated health check, or (2) there is no
     * primary resource record set. <p>Valid values: <code>PRIMARY</code> |
     * <code>SECONDARY</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARY, SECONDARY
     *
     * @return <i>Failover resource record sets only:</i> Among resource record sets
     *         that have the same combination of DNS name and type, a value that
     *         indicates whether the current resource record set is a primary or
     *         secondary resource record set. A failover set may contain at most one
     *         resource record set marked as primary and one resource record set
     *         marked as secondary. A resource record set marked as primary will be
     *         returned if any of the following are true: (1) an associated health
     *         check is passing, (2) if the resource record set is an alias with the
     *         evaluate target health and at least one target resource record set is
     *         healthy, (3) both the primary and secondary resource record set are
     *         failing health checks or (4) there is no secondary resource record
     *         set. A secondary resource record set will be returned if: (1) the
     *         primary is failing a health check and either the secondary is passing
     *         a health check or has no associated health check, or (2) there is no
     *         primary resource record set. <p>Valid values: <code>PRIMARY</code> |
     *         <code>SECONDARY</code>
     *
     * @see ResourceRecordSetFailover
     */
    public String getFailover() {
        return failover;
    }
    
    /**
     * <i>Failover resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * indicates whether the current resource record set is a primary or
     * secondary resource record set. A failover set may contain at most one
     * resource record set marked as primary and one resource record set
     * marked as secondary. A resource record set marked as primary will be
     * returned if any of the following are true: (1) an associated health
     * check is passing, (2) if the resource record set is an alias with the
     * evaluate target health and at least one target resource record set is
     * healthy, (3) both the primary and secondary resource record set are
     * failing health checks or (4) there is no secondary resource record
     * set. A secondary resource record set will be returned if: (1) the
     * primary is failing a health check and either the secondary is passing
     * a health check or has no associated health check, or (2) there is no
     * primary resource record set. <p>Valid values: <code>PRIMARY</code> |
     * <code>SECONDARY</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARY, SECONDARY
     *
     * @param failover <i>Failover resource record sets only:</i> Among resource record sets
     *         that have the same combination of DNS name and type, a value that
     *         indicates whether the current resource record set is a primary or
     *         secondary resource record set. A failover set may contain at most one
     *         resource record set marked as primary and one resource record set
     *         marked as secondary. A resource record set marked as primary will be
     *         returned if any of the following are true: (1) an associated health
     *         check is passing, (2) if the resource record set is an alias with the
     *         evaluate target health and at least one target resource record set is
     *         healthy, (3) both the primary and secondary resource record set are
     *         failing health checks or (4) there is no secondary resource record
     *         set. A secondary resource record set will be returned if: (1) the
     *         primary is failing a health check and either the secondary is passing
     *         a health check or has no associated health check, or (2) there is no
     *         primary resource record set. <p>Valid values: <code>PRIMARY</code> |
     *         <code>SECONDARY</code>
     *
     * @see ResourceRecordSetFailover
     */
    public void setFailover(String failover) {
        this.failover = failover;
    }
    
    /**
     * <i>Failover resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * indicates whether the current resource record set is a primary or
     * secondary resource record set. A failover set may contain at most one
     * resource record set marked as primary and one resource record set
     * marked as secondary. A resource record set marked as primary will be
     * returned if any of the following are true: (1) an associated health
     * check is passing, (2) if the resource record set is an alias with the
     * evaluate target health and at least one target resource record set is
     * healthy, (3) both the primary and secondary resource record set are
     * failing health checks or (4) there is no secondary resource record
     * set. A secondary resource record set will be returned if: (1) the
     * primary is failing a health check and either the secondary is passing
     * a health check or has no associated health check, or (2) there is no
     * primary resource record set. <p>Valid values: <code>PRIMARY</code> |
     * <code>SECONDARY</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARY, SECONDARY
     *
     * @param failover <i>Failover resource record sets only:</i> Among resource record sets
     *         that have the same combination of DNS name and type, a value that
     *         indicates whether the current resource record set is a primary or
     *         secondary resource record set. A failover set may contain at most one
     *         resource record set marked as primary and one resource record set
     *         marked as secondary. A resource record set marked as primary will be
     *         returned if any of the following are true: (1) an associated health
     *         check is passing, (2) if the resource record set is an alias with the
     *         evaluate target health and at least one target resource record set is
     *         healthy, (3) both the primary and secondary resource record set are
     *         failing health checks or (4) there is no secondary resource record
     *         set. A secondary resource record set will be returned if: (1) the
     *         primary is failing a health check and either the secondary is passing
     *         a health check or has no associated health check, or (2) there is no
     *         primary resource record set. <p>Valid values: <code>PRIMARY</code> |
     *         <code>SECONDARY</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ResourceRecordSetFailover
     */
    public ResourceRecordSet withFailover(String failover) {
        this.failover = failover;
        return this;
    }

    /**
     * <i>Failover resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * indicates whether the current resource record set is a primary or
     * secondary resource record set. A failover set may contain at most one
     * resource record set marked as primary and one resource record set
     * marked as secondary. A resource record set marked as primary will be
     * returned if any of the following are true: (1) an associated health
     * check is passing, (2) if the resource record set is an alias with the
     * evaluate target health and at least one target resource record set is
     * healthy, (3) both the primary and secondary resource record set are
     * failing health checks or (4) there is no secondary resource record
     * set. A secondary resource record set will be returned if: (1) the
     * primary is failing a health check and either the secondary is passing
     * a health check or has no associated health check, or (2) there is no
     * primary resource record set. <p>Valid values: <code>PRIMARY</code> |
     * <code>SECONDARY</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARY, SECONDARY
     *
     * @param failover <i>Failover resource record sets only:</i> Among resource record sets
     *         that have the same combination of DNS name and type, a value that
     *         indicates whether the current resource record set is a primary or
     *         secondary resource record set. A failover set may contain at most one
     *         resource record set marked as primary and one resource record set
     *         marked as secondary. A resource record set marked as primary will be
     *         returned if any of the following are true: (1) an associated health
     *         check is passing, (2) if the resource record set is an alias with the
     *         evaluate target health and at least one target resource record set is
     *         healthy, (3) both the primary and secondary resource record set are
     *         failing health checks or (4) there is no secondary resource record
     *         set. A secondary resource record set will be returned if: (1) the
     *         primary is failing a health check and either the secondary is passing
     *         a health check or has no associated health check, or (2) there is no
     *         primary resource record set. <p>Valid values: <code>PRIMARY</code> |
     *         <code>SECONDARY</code>
     *
     * @see ResourceRecordSetFailover
     */
    public void setFailover(ResourceRecordSetFailover failover) {
        this.failover = failover.toString();
    }
    
    /**
     * <i>Failover resource record sets only:</i> Among resource record sets
     * that have the same combination of DNS name and type, a value that
     * indicates whether the current resource record set is a primary or
     * secondary resource record set. A failover set may contain at most one
     * resource record set marked as primary and one resource record set
     * marked as secondary. A resource record set marked as primary will be
     * returned if any of the following are true: (1) an associated health
     * check is passing, (2) if the resource record set is an alias with the
     * evaluate target health and at least one target resource record set is
     * healthy, (3) both the primary and secondary resource record set are
     * failing health checks or (4) there is no secondary resource record
     * set. A secondary resource record set will be returned if: (1) the
     * primary is failing a health check and either the secondary is passing
     * a health check or has no associated health check, or (2) there is no
     * primary resource record set. <p>Valid values: <code>PRIMARY</code> |
     * <code>SECONDARY</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRIMARY, SECONDARY
     *
     * @param failover <i>Failover resource record sets only:</i> Among resource record sets
     *         that have the same combination of DNS name and type, a value that
     *         indicates whether the current resource record set is a primary or
     *         secondary resource record set. A failover set may contain at most one
     *         resource record set marked as primary and one resource record set
     *         marked as secondary. A resource record set marked as primary will be
     *         returned if any of the following are true: (1) an associated health
     *         check is passing, (2) if the resource record set is an alias with the
     *         evaluate target health and at least one target resource record set is
     *         healthy, (3) both the primary and secondary resource record set are
     *         failing health checks or (4) there is no secondary resource record
     *         set. A secondary resource record set will be returned if: (1) the
     *         primary is failing a health check and either the secondary is passing
     *         a health check or has no associated health check, or (2) there is no
     *         primary resource record set. <p>Valid values: <code>PRIMARY</code> |
     *         <code>SECONDARY</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ResourceRecordSetFailover
     */
    public ResourceRecordSet withFailover(ResourceRecordSetFailover failover) {
        this.failover = failover.toString();
        return this;
    }

    /**
     * The cache time to live for the current resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return The cache time to live for the current resource record set.
     */
    public Long getTTL() {
        return tTL;
    }
    
    /**
     * The cache time to live for the current resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param tTL The cache time to live for the current resource record set.
     */
    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }
    
    /**
     * The cache time to live for the current resource record set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param tTL The cache time to live for the current resource record set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResourceRecordSet withTTL(Long tTL) {
        this.tTL = tTL;
        return this;
    }

    /**
     * A complex type that contains the resource records for the current
     * resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A complex type that contains the resource records for the current
     *         resource record set.
     */
    public java.util.List<ResourceRecord> getResourceRecords() {
        if (resourceRecords == null) {
              resourceRecords = new com.amazonaws.internal.ListWithAutoConstructFlag<ResourceRecord>();
              resourceRecords.setAutoConstruct(true);
        }
        return resourceRecords;
    }
    
    /**
     * A complex type that contains the resource records for the current
     * resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param resourceRecords A complex type that contains the resource records for the current
     *         resource record set.
     */
    public void setResourceRecords(java.util.Collection<ResourceRecord> resourceRecords) {
        if (resourceRecords == null) {
            this.resourceRecords = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ResourceRecord> resourceRecordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ResourceRecord>(resourceRecords.size());
        resourceRecordsCopy.addAll(resourceRecords);
        this.resourceRecords = resourceRecordsCopy;
    }
    
    /**
     * A complex type that contains the resource records for the current
     * resource record set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param resourceRecords A complex type that contains the resource records for the current
     *         resource record set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResourceRecordSet withResourceRecords(ResourceRecord... resourceRecords) {
        if (getResourceRecords() == null) setResourceRecords(new java.util.ArrayList<ResourceRecord>(resourceRecords.length));
        for (ResourceRecord value : resourceRecords) {
            getResourceRecords().add(value);
        }
        return this;
    }
    
    /**
     * A complex type that contains the resource records for the current
     * resource record set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param resourceRecords A complex type that contains the resource records for the current
     *         resource record set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResourceRecordSet withResourceRecords(java.util.Collection<ResourceRecord> resourceRecords) {
        if (resourceRecords == null) {
            this.resourceRecords = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ResourceRecord> resourceRecordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ResourceRecord>(resourceRecords.size());
            resourceRecordsCopy.addAll(resourceRecords);
            this.resourceRecords = resourceRecordsCopy;
        }

        return this;
    }

    /**
     * <i>Alias resource record sets only:</i> Information about the AWS
     * resource to which you are redirecting traffic.
     *
     * @return <i>Alias resource record sets only:</i> Information about the AWS
     *         resource to which you are redirecting traffic.
     */
    public AliasTarget getAliasTarget() {
        return aliasTarget;
    }
    
    /**
     * <i>Alias resource record sets only:</i> Information about the AWS
     * resource to which you are redirecting traffic.
     *
     * @param aliasTarget <i>Alias resource record sets only:</i> Information about the AWS
     *         resource to which you are redirecting traffic.
     */
    public void setAliasTarget(AliasTarget aliasTarget) {
        this.aliasTarget = aliasTarget;
    }
    
    /**
     * <i>Alias resource record sets only:</i> Information about the AWS
     * resource to which you are redirecting traffic.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aliasTarget <i>Alias resource record sets only:</i> Information about the AWS
     *         resource to which you are redirecting traffic.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResourceRecordSet withAliasTarget(AliasTarget aliasTarget) {
        this.aliasTarget = aliasTarget;
        return this;
    }

    /**
     * <i>Health Check resource record sets only, not required for alias
     * resource record sets:</i> An identifier that is used to identify
     * health check associated with the resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return <i>Health Check resource record sets only, not required for alias
     *         resource record sets:</i> An identifier that is used to identify
     *         health check associated with the resource record set.
     */
    public String getHealthCheckId() {
        return healthCheckId;
    }
    
    /**
     * <i>Health Check resource record sets only, not required for alias
     * resource record sets:</i> An identifier that is used to identify
     * health check associated with the resource record set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param healthCheckId <i>Health Check resource record sets only, not required for alias
     *         resource record sets:</i> An identifier that is used to identify
     *         health check associated with the resource record set.
     */
    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }
    
    /**
     * <i>Health Check resource record sets only, not required for alias
     * resource record sets:</i> An identifier that is used to identify
     * health check associated with the resource record set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param healthCheckId <i>Health Check resource record sets only, not required for alias
     *         resource record sets:</i> An identifier that is used to identify
     *         health check associated with the resource record set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResourceRecordSet withHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
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
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getSetIdentifier() != null) sb.append("SetIdentifier: " + getSetIdentifier() + ",");
        if (getWeight() != null) sb.append("Weight: " + getWeight() + ",");
        if (getRegion() != null) sb.append("Region: " + getRegion() + ",");
        if (getFailover() != null) sb.append("Failover: " + getFailover() + ",");
        if (getTTL() != null) sb.append("TTL: " + getTTL() + ",");
        if (getResourceRecords() != null) sb.append("ResourceRecords: " + getResourceRecords() + ",");
        if (getAliasTarget() != null) sb.append("AliasTarget: " + getAliasTarget() + ",");
        if (getHealthCheckId() != null) sb.append("HealthCheckId: " + getHealthCheckId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getSetIdentifier() == null) ? 0 : getSetIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode()); 
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode()); 
        hashCode = prime * hashCode + ((getFailover() == null) ? 0 : getFailover().hashCode()); 
        hashCode = prime * hashCode + ((getTTL() == null) ? 0 : getTTL().hashCode()); 
        hashCode = prime * hashCode + ((getResourceRecords() == null) ? 0 : getResourceRecords().hashCode()); 
        hashCode = prime * hashCode + ((getAliasTarget() == null) ? 0 : getAliasTarget().hashCode()); 
        hashCode = prime * hashCode + ((getHealthCheckId() == null) ? 0 : getHealthCheckId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResourceRecordSet == false) return false;
        ResourceRecordSet other = (ResourceRecordSet)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getSetIdentifier() == null ^ this.getSetIdentifier() == null) return false;
        if (other.getSetIdentifier() != null && other.getSetIdentifier().equals(this.getSetIdentifier()) == false) return false; 
        if (other.getWeight() == null ^ this.getWeight() == null) return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false) return false; 
        if (other.getRegion() == null ^ this.getRegion() == null) return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false) return false; 
        if (other.getFailover() == null ^ this.getFailover() == null) return false;
        if (other.getFailover() != null && other.getFailover().equals(this.getFailover()) == false) return false; 
        if (other.getTTL() == null ^ this.getTTL() == null) return false;
        if (other.getTTL() != null && other.getTTL().equals(this.getTTL()) == false) return false; 
        if (other.getResourceRecords() == null ^ this.getResourceRecords() == null) return false;
        if (other.getResourceRecords() != null && other.getResourceRecords().equals(this.getResourceRecords()) == false) return false; 
        if (other.getAliasTarget() == null ^ this.getAliasTarget() == null) return false;
        if (other.getAliasTarget() != null && other.getAliasTarget().equals(this.getAliasTarget()) == false) return false; 
        if (other.getHealthCheckId() == null ^ this.getHealthCheckId() == null) return false;
        if (other.getHealthCheckId() != null && other.getHealthCheckId().equals(this.getHealthCheckId()) == false) return false; 
        return true;
    }
    
}
    