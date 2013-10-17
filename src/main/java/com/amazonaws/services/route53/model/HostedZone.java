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
 * A complex type that contain information about the specified hosted zone.
 * </p>
 */
public class HostedZone implements Serializable {

    /**
     * The ID of the specified hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String id;

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
     * A unique string that identifies the request to create the hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String callerReference;

    /**
     * A complex type that contains the <code>Comment</code> element.
     */
    private HostedZoneConfig config;

    /**
     * Total number of resource record sets in the hosted zone.
     */
    private Long resourceRecordSetCount;

    /**
     * Default constructor for a new HostedZone object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public HostedZone() {}
    
    /**
     * Constructs a new HostedZone object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param id The ID of the specified hosted zone.
     * @param name The name of the domain. This must be a fully-specified
     * domain, for example, www.example.com. The trailing dot is optional;
     * Route 53 assumes that the domain name is fully qualified. This means
     * that Route 53 treats www.example.com (without a trailing dot) and
     * www.example.com. (with a trailing dot) as identical. <p>This is the
     * name you have registered with your DNS registrar. You should ask your
     * registrar to change the authoritative name servers for your domain to
     * the set of <code>NameServers</code> elements returned in
     * <code>DelegationSet</code>.
     * @param callerReference A unique string that identifies the request to
     * create the hosted zone.
     */
    public HostedZone(String id, String name, String callerReference) {
        setId(id);
        setName(name);
        setCallerReference(callerReference);
    }

    /**
     * The ID of the specified hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return The ID of the specified hosted zone.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID of the specified hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param id The ID of the specified hosted zone.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID of the specified hosted zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param id The ID of the specified hosted zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HostedZone withId(String id) {
        this.id = id;
        return this;
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
    public HostedZone withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A unique string that identifies the request to create the hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return A unique string that identifies the request to create the hosted zone.
     */
    public String getCallerReference() {
        return callerReference;
    }
    
    /**
     * A unique string that identifies the request to create the hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference A unique string that identifies the request to create the hosted zone.
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }
    
    /**
     * A unique string that identifies the request to create the hosted zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param callerReference A unique string that identifies the request to create the hosted zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HostedZone withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * A complex type that contains the <code>Comment</code> element.
     *
     * @return A complex type that contains the <code>Comment</code> element.
     */
    public HostedZoneConfig getConfig() {
        return config;
    }
    
    /**
     * A complex type that contains the <code>Comment</code> element.
     *
     * @param config A complex type that contains the <code>Comment</code> element.
     */
    public void setConfig(HostedZoneConfig config) {
        this.config = config;
    }
    
    /**
     * A complex type that contains the <code>Comment</code> element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param config A complex type that contains the <code>Comment</code> element.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HostedZone withConfig(HostedZoneConfig config) {
        this.config = config;
        return this;
    }

    /**
     * Total number of resource record sets in the hosted zone.
     *
     * @return Total number of resource record sets in the hosted zone.
     */
    public Long getResourceRecordSetCount() {
        return resourceRecordSetCount;
    }
    
    /**
     * Total number of resource record sets in the hosted zone.
     *
     * @param resourceRecordSetCount Total number of resource record sets in the hosted zone.
     */
    public void setResourceRecordSetCount(Long resourceRecordSetCount) {
        this.resourceRecordSetCount = resourceRecordSetCount;
    }
    
    /**
     * Total number of resource record sets in the hosted zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceRecordSetCount Total number of resource record sets in the hosted zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HostedZone withResourceRecordSetCount(Long resourceRecordSetCount) {
        this.resourceRecordSetCount = resourceRecordSetCount;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getCallerReference() != null) sb.append("CallerReference: " + getCallerReference() + ",");
        if (getConfig() != null) sb.append("Config: " + getConfig() + ",");
        if (getResourceRecordSetCount() != null) sb.append("ResourceRecordSetCount: " + getResourceRecordSetCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode()); 
        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode()); 
        hashCode = prime * hashCode + ((getResourceRecordSetCount() == null) ? 0 : getResourceRecordSetCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HostedZone == false) return false;
        HostedZone other = (HostedZone)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getCallerReference() == null ^ this.getCallerReference() == null) return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false) return false; 
        if (other.getConfig() == null ^ this.getConfig() == null) return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false) return false; 
        if (other.getResourceRecordSetCount() == null ^ this.getResourceRecordSetCount() == null) return false;
        if (other.getResourceRecordSetCount() != null && other.getResourceRecordSetCount().equals(this.getResourceRecordSetCount()) == false) return false; 
        return true;
    }
    
}
    