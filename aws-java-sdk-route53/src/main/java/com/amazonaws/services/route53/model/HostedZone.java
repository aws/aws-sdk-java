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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains general information about the hosted zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/HostedZone" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HostedZone implements Serializable, Cloneable {

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the domain. For public hosted zones, this is the name that you have registered with your DNS
     * registrar.
     * </p>
     * <p>
     * For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and <code>-</code>
     * (hyphen) and how to specify internationalized domain names, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html">CreateHostedZone</a>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value that you specified for <code>CallerReference</code> when you created the hosted zone.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * A complex type that includes the <code>Comment</code> and <code>PrivateZone</code> elements. If you omitted the
     * <code>HostedZoneConfig</code> and <code>Comment</code> elements from the request, the <code>Config</code> and
     * <code>Comment</code> elements don't appear in the response.
     * </p>
     */
    private HostedZoneConfig config;
    /**
     * <p>
     * The number of resource record sets in the hosted zone.
     * </p>
     */
    private Long resourceRecordSetCount;
    /**
     * <p>
     * If the hosted zone was created by another service, the service that created the hosted zone. When a hosted zone
     * is created by another service, you can't edit or delete it using Route 53.
     * </p>
     */
    private LinkedService linkedService;

    /**
     * Default constructor for HostedZone object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public HostedZone() {
    }

    /**
     * Constructs a new HostedZone object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param id
     *        The ID that Amazon Route 53 assigned to the hosted zone when you created it.
     * @param name
     *        The name of the domain. For public hosted zones, this is the name that you have registered with your DNS
     *        registrar.</p>
     *        <p>
     *        For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and
     *        <code>-</code> (hyphen) and how to specify internationalized domain names, see <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html"
     *        >CreateHostedZone</a>.
     * @param callerReference
     *        The value that you specified for <code>CallerReference</code> when you created the hosted zone.
     */
    public HostedZone(String id, String name, String callerReference) {
        setId(id);
        setName(name);
        setCallerReference(callerReference);
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
     * </p>
     * 
     * @param id
     *        The ID that Amazon Route 53 assigned to the hosted zone when you created it.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
     * </p>
     * 
     * @return The ID that Amazon Route 53 assigned to the hosted zone when you created it.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
     * </p>
     * 
     * @param id
     *        The ID that Amazon Route 53 assigned to the hosted zone when you created it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostedZone withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the domain. For public hosted zones, this is the name that you have registered with your DNS
     * registrar.
     * </p>
     * <p>
     * For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and <code>-</code>
     * (hyphen) and how to specify internationalized domain names, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html">CreateHostedZone</a>.
     * </p>
     * 
     * @param name
     *        The name of the domain. For public hosted zones, this is the name that you have registered with your DNS
     *        registrar.</p>
     *        <p>
     *        For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and
     *        <code>-</code> (hyphen) and how to specify internationalized domain names, see <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html"
     *        >CreateHostedZone</a>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain. For public hosted zones, this is the name that you have registered with your DNS
     * registrar.
     * </p>
     * <p>
     * For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and <code>-</code>
     * (hyphen) and how to specify internationalized domain names, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html">CreateHostedZone</a>.
     * </p>
     * 
     * @return The name of the domain. For public hosted zones, this is the name that you have registered with your DNS
     *         registrar.</p>
     *         <p>
     *         For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and
     *         <code>-</code> (hyphen) and how to specify internationalized domain names, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html"
     *         >CreateHostedZone</a>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain. For public hosted zones, this is the name that you have registered with your DNS
     * registrar.
     * </p>
     * <p>
     * For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and <code>-</code>
     * (hyphen) and how to specify internationalized domain names, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html">CreateHostedZone</a>.
     * </p>
     * 
     * @param name
     *        The name of the domain. For public hosted zones, this is the name that you have registered with your DNS
     *        registrar.</p>
     *        <p>
     *        For information about how to specify characters other than <code>a-z</code>, <code>0-9</code>, and
     *        <code>-</code> (hyphen) and how to specify internationalized domain names, see <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateHostedZone.html"
     *        >CreateHostedZone</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostedZone withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value that you specified for <code>CallerReference</code> when you created the hosted zone.
     * </p>
     * 
     * @param callerReference
     *        The value that you specified for <code>CallerReference</code> when you created the hosted zone.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * The value that you specified for <code>CallerReference</code> when you created the hosted zone.
     * </p>
     * 
     * @return The value that you specified for <code>CallerReference</code> when you created the hosted zone.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * The value that you specified for <code>CallerReference</code> when you created the hosted zone.
     * </p>
     * 
     * @param callerReference
     *        The value that you specified for <code>CallerReference</code> when you created the hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostedZone withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * A complex type that includes the <code>Comment</code> and <code>PrivateZone</code> elements. If you omitted the
     * <code>HostedZoneConfig</code> and <code>Comment</code> elements from the request, the <code>Config</code> and
     * <code>Comment</code> elements don't appear in the response.
     * </p>
     * 
     * @param config
     *        A complex type that includes the <code>Comment</code> and <code>PrivateZone</code> elements. If you
     *        omitted the <code>HostedZoneConfig</code> and <code>Comment</code> elements from the request, the
     *        <code>Config</code> and <code>Comment</code> elements don't appear in the response.
     */

    public void setConfig(HostedZoneConfig config) {
        this.config = config;
    }

    /**
     * <p>
     * A complex type that includes the <code>Comment</code> and <code>PrivateZone</code> elements. If you omitted the
     * <code>HostedZoneConfig</code> and <code>Comment</code> elements from the request, the <code>Config</code> and
     * <code>Comment</code> elements don't appear in the response.
     * </p>
     * 
     * @return A complex type that includes the <code>Comment</code> and <code>PrivateZone</code> elements. If you
     *         omitted the <code>HostedZoneConfig</code> and <code>Comment</code> elements from the request, the
     *         <code>Config</code> and <code>Comment</code> elements don't appear in the response.
     */

    public HostedZoneConfig getConfig() {
        return this.config;
    }

    /**
     * <p>
     * A complex type that includes the <code>Comment</code> and <code>PrivateZone</code> elements. If you omitted the
     * <code>HostedZoneConfig</code> and <code>Comment</code> elements from the request, the <code>Config</code> and
     * <code>Comment</code> elements don't appear in the response.
     * </p>
     * 
     * @param config
     *        A complex type that includes the <code>Comment</code> and <code>PrivateZone</code> elements. If you
     *        omitted the <code>HostedZoneConfig</code> and <code>Comment</code> elements from the request, the
     *        <code>Config</code> and <code>Comment</code> elements don't appear in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostedZone withConfig(HostedZoneConfig config) {
        setConfig(config);
        return this;
    }

    /**
     * <p>
     * The number of resource record sets in the hosted zone.
     * </p>
     * 
     * @param resourceRecordSetCount
     *        The number of resource record sets in the hosted zone.
     */

    public void setResourceRecordSetCount(Long resourceRecordSetCount) {
        this.resourceRecordSetCount = resourceRecordSetCount;
    }

    /**
     * <p>
     * The number of resource record sets in the hosted zone.
     * </p>
     * 
     * @return The number of resource record sets in the hosted zone.
     */

    public Long getResourceRecordSetCount() {
        return this.resourceRecordSetCount;
    }

    /**
     * <p>
     * The number of resource record sets in the hosted zone.
     * </p>
     * 
     * @param resourceRecordSetCount
     *        The number of resource record sets in the hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostedZone withResourceRecordSetCount(Long resourceRecordSetCount) {
        setResourceRecordSetCount(resourceRecordSetCount);
        return this;
    }

    /**
     * <p>
     * If the hosted zone was created by another service, the service that created the hosted zone. When a hosted zone
     * is created by another service, you can't edit or delete it using Route 53.
     * </p>
     * 
     * @param linkedService
     *        If the hosted zone was created by another service, the service that created the hosted zone. When a hosted
     *        zone is created by another service, you can't edit or delete it using Route 53.
     */

    public void setLinkedService(LinkedService linkedService) {
        this.linkedService = linkedService;
    }

    /**
     * <p>
     * If the hosted zone was created by another service, the service that created the hosted zone. When a hosted zone
     * is created by another service, you can't edit or delete it using Route 53.
     * </p>
     * 
     * @return If the hosted zone was created by another service, the service that created the hosted zone. When a
     *         hosted zone is created by another service, you can't edit or delete it using Route 53.
     */

    public LinkedService getLinkedService() {
        return this.linkedService;
    }

    /**
     * <p>
     * If the hosted zone was created by another service, the service that created the hosted zone. When a hosted zone
     * is created by another service, you can't edit or delete it using Route 53.
     * </p>
     * 
     * @param linkedService
     *        If the hosted zone was created by another service, the service that created the hosted zone. When a hosted
     *        zone is created by another service, you can't edit or delete it using Route 53.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostedZone withLinkedService(LinkedService linkedService) {
        setLinkedService(linkedService);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCallerReference() != null)
            sb.append("CallerReference: ").append(getCallerReference()).append(",");
        if (getConfig() != null)
            sb.append("Config: ").append(getConfig()).append(",");
        if (getResourceRecordSetCount() != null)
            sb.append("ResourceRecordSetCount: ").append(getResourceRecordSetCount()).append(",");
        if (getLinkedService() != null)
            sb.append("LinkedService: ").append(getLinkedService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostedZone == false)
            return false;
        HostedZone other = (HostedZone) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
            return false;
        if (other.getResourceRecordSetCount() == null ^ this.getResourceRecordSetCount() == null)
            return false;
        if (other.getResourceRecordSetCount() != null && other.getResourceRecordSetCount().equals(this.getResourceRecordSetCount()) == false)
            return false;
        if (other.getLinkedService() == null ^ this.getLinkedService() == null)
            return false;
        if (other.getLinkedService() != null && other.getLinkedService().equals(this.getLinkedService()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getLinkedService() == null) ? 0 : getLinkedService().hashCode());
        return hashCode;
    }

    @Override
    public HostedZone clone() {
        try {
            return (HostedZone) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
