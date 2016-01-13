/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * <p>
 * A complex type that contains information about the request to create a hosted
 * zone.
 * </p>
 */
public class CreateHostedZoneRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain. This must be a fully-specified domain, for
     * example, www.example.com. The trailing dot is optional; Amazon Route 53
     * assumes that the domain name is fully qualified. This means that Amazon
     * Route 53 treats www.example.com (without a trailing dot) and
     * www.example.com. (with a trailing dot) as identical.
     * </p>
     * <p>
     * This is the name you have registered with your DNS registrar. You should
     * ask your registrar to change the authoritative name servers for your
     * domain to the set of <code>NameServers</code> elements returned in
     * <code>DelegationSet</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The VPC that you want your hosted zone to be associated with. By
     * providing this parameter, your newly created hosted cannot be resolved
     * anywhere other than the given VPC.
     * </p>
     */
    private VPC vPC;
    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateHostedZone</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you create a hosted zone.
     * <code>CallerReference</code> can be any unique string; you might choose
     * to use a string that identifies your project, such as
     * <code>DNSMigration_01</code>.
     * </p>
     * <p>
     * Valid characters are any Unicode code points that are legal in an XML 1.0
     * document. The UTF-8 encoding of the value must be less than 128 bytes.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * A complex type that contains an optional comment about your hosted zone.
     * </p>
     */
    private HostedZoneConfig hostedZoneConfig;
    /**
     * <p>
     * The delegation set id of the reusable delgation set whose NS records you
     * want to assign to the new hosted zone.
     * </p>
     */
    private String delegationSetId;

    /**
     * Default constructor for CreateHostedZoneRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize the
     * object after creating it.
     */
    public CreateHostedZoneRequest() {
    }

    /**
     * Constructs a new CreateHostedZoneRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param name
     *        The name of the domain. This must be a fully-specified domain, for
     *        example, www.example.com. The trailing dot is optional; Amazon
     *        Route 53 assumes that the domain name is fully qualified. This
     *        means that Amazon Route 53 treats www.example.com (without a
     *        trailing dot) and www.example.com. (with a trailing dot) as
     *        identical.</p>
     *        <p>
     *        This is the name you have registered with your DNS registrar. You
     *        should ask your registrar to change the authoritative name servers
     *        for your domain to the set of <code>NameServers</code> elements
     *        returned in <code>DelegationSet</code>.
     * @param callerReference
     *        A unique string that identifies the request and that allows failed
     *        <code>CreateHostedZone</code> requests to be retried without the
     *        risk of executing the operation twice. You must use a unique
     *        <code>CallerReference</code> string every time you create a hosted
     *        zone. <code>CallerReference</code> can be any unique string; you
     *        might choose to use a string that identifies your project, such as
     *        <code>DNSMigration_01</code>.
     *        </p>
     *        <p>
     *        Valid characters are any Unicode code points that are legal in an
     *        XML 1.0 document. The UTF-8 encoding of the value must be less
     *        than 128 bytes.
     */
    public CreateHostedZoneRequest(String name, String callerReference) {
        setName(name);
        setCallerReference(callerReference);
    }

    /**
     * <p>
     * The name of the domain. This must be a fully-specified domain, for
     * example, www.example.com. The trailing dot is optional; Amazon Route 53
     * assumes that the domain name is fully qualified. This means that Amazon
     * Route 53 treats www.example.com (without a trailing dot) and
     * www.example.com. (with a trailing dot) as identical.
     * </p>
     * <p>
     * This is the name you have registered with your DNS registrar. You should
     * ask your registrar to change the authoritative name servers for your
     * domain to the set of <code>NameServers</code> elements returned in
     * <code>DelegationSet</code>.
     * </p>
     * 
     * @param name
     *        The name of the domain. This must be a fully-specified domain, for
     *        example, www.example.com. The trailing dot is optional; Amazon
     *        Route 53 assumes that the domain name is fully qualified. This
     *        means that Amazon Route 53 treats www.example.com (without a
     *        trailing dot) and www.example.com. (with a trailing dot) as
     *        identical.</p>
     *        <p>
     *        This is the name you have registered with your DNS registrar. You
     *        should ask your registrar to change the authoritative name servers
     *        for your domain to the set of <code>NameServers</code> elements
     *        returned in <code>DelegationSet</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain. This must be a fully-specified domain, for
     * example, www.example.com. The trailing dot is optional; Amazon Route 53
     * assumes that the domain name is fully qualified. This means that Amazon
     * Route 53 treats www.example.com (without a trailing dot) and
     * www.example.com. (with a trailing dot) as identical.
     * </p>
     * <p>
     * This is the name you have registered with your DNS registrar. You should
     * ask your registrar to change the authoritative name servers for your
     * domain to the set of <code>NameServers</code> elements returned in
     * <code>DelegationSet</code>.
     * </p>
     * 
     * @return The name of the domain. This must be a fully-specified domain,
     *         for example, www.example.com. The trailing dot is optional;
     *         Amazon Route 53 assumes that the domain name is fully qualified.
     *         This means that Amazon Route 53 treats www.example.com (without a
     *         trailing dot) and www.example.com. (with a trailing dot) as
     *         identical.</p>
     *         <p>
     *         This is the name you have registered with your DNS registrar. You
     *         should ask your registrar to change the authoritative name
     *         servers for your domain to the set of <code>NameServers</code>
     *         elements returned in <code>DelegationSet</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain. This must be a fully-specified domain, for
     * example, www.example.com. The trailing dot is optional; Amazon Route 53
     * assumes that the domain name is fully qualified. This means that Amazon
     * Route 53 treats www.example.com (without a trailing dot) and
     * www.example.com. (with a trailing dot) as identical.
     * </p>
     * <p>
     * This is the name you have registered with your DNS registrar. You should
     * ask your registrar to change the authoritative name servers for your
     * domain to the set of <code>NameServers</code> elements returned in
     * <code>DelegationSet</code>.
     * </p>
     * 
     * @param name
     *        The name of the domain. This must be a fully-specified domain, for
     *        example, www.example.com. The trailing dot is optional; Amazon
     *        Route 53 assumes that the domain name is fully qualified. This
     *        means that Amazon Route 53 treats www.example.com (without a
     *        trailing dot) and www.example.com. (with a trailing dot) as
     *        identical.</p>
     *        <p>
     *        This is the name you have registered with your DNS registrar. You
     *        should ask your registrar to change the authoritative name servers
     *        for your domain to the set of <code>NameServers</code> elements
     *        returned in <code>DelegationSet</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateHostedZoneRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The VPC that you want your hosted zone to be associated with. By
     * providing this parameter, your newly created hosted cannot be resolved
     * anywhere other than the given VPC.
     * </p>
     * 
     * @param vPC
     *        The VPC that you want your hosted zone to be associated with. By
     *        providing this parameter, your newly created hosted cannot be
     *        resolved anywhere other than the given VPC.
     */
    public void setVPC(VPC vPC) {
        this.vPC = vPC;
    }

    /**
     * <p>
     * The VPC that you want your hosted zone to be associated with. By
     * providing this parameter, your newly created hosted cannot be resolved
     * anywhere other than the given VPC.
     * </p>
     * 
     * @return The VPC that you want your hosted zone to be associated with. By
     *         providing this parameter, your newly created hosted cannot be
     *         resolved anywhere other than the given VPC.
     */
    public VPC getVPC() {
        return this.vPC;
    }

    /**
     * <p>
     * The VPC that you want your hosted zone to be associated with. By
     * providing this parameter, your newly created hosted cannot be resolved
     * anywhere other than the given VPC.
     * </p>
     * 
     * @param vPC
     *        The VPC that you want your hosted zone to be associated with. By
     *        providing this parameter, your newly created hosted cannot be
     *        resolved anywhere other than the given VPC.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateHostedZoneRequest withVPC(VPC vPC) {
        setVPC(vPC);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateHostedZone</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you create a hosted zone.
     * <code>CallerReference</code> can be any unique string; you might choose
     * to use a string that identifies your project, such as
     * <code>DNSMigration_01</code>.
     * </p>
     * <p>
     * Valid characters are any Unicode code points that are legal in an XML 1.0
     * document. The UTF-8 encoding of the value must be less than 128 bytes.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request and that allows failed
     *        <code>CreateHostedZone</code> requests to be retried without the
     *        risk of executing the operation twice. You must use a unique
     *        <code>CallerReference</code> string every time you create a hosted
     *        zone. <code>CallerReference</code> can be any unique string; you
     *        might choose to use a string that identifies your project, such as
     *        <code>DNSMigration_01</code>.</p>
     *        <p>
     *        Valid characters are any Unicode code points that are legal in an
     *        XML 1.0 document. The UTF-8 encoding of the value must be less
     *        than 128 bytes.
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateHostedZone</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you create a hosted zone.
     * <code>CallerReference</code> can be any unique string; you might choose
     * to use a string that identifies your project, such as
     * <code>DNSMigration_01</code>.
     * </p>
     * <p>
     * Valid characters are any Unicode code points that are legal in an XML 1.0
     * document. The UTF-8 encoding of the value must be less than 128 bytes.
     * </p>
     * 
     * @return A unique string that identifies the request and that allows
     *         failed <code>CreateHostedZone</code> requests to be retried
     *         without the risk of executing the operation twice. You must use a
     *         unique <code>CallerReference</code> string every time you create
     *         a hosted zone. <code>CallerReference</code> can be any unique
     *         string; you might choose to use a string that identifies your
     *         project, such as <code>DNSMigration_01</code>.</p>
     *         <p>
     *         Valid characters are any Unicode code points that are legal in an
     *         XML 1.0 document. The UTF-8 encoding of the value must be less
     *         than 128 bytes.
     */
    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateHostedZone</code> requests to be retried without the risk of
     * executing the operation twice. You must use a unique
     * <code>CallerReference</code> string every time you create a hosted zone.
     * <code>CallerReference</code> can be any unique string; you might choose
     * to use a string that identifies your project, such as
     * <code>DNSMigration_01</code>.
     * </p>
     * <p>
     * Valid characters are any Unicode code points that are legal in an XML 1.0
     * document. The UTF-8 encoding of the value must be less than 128 bytes.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request and that allows failed
     *        <code>CreateHostedZone</code> requests to be retried without the
     *        risk of executing the operation twice. You must use a unique
     *        <code>CallerReference</code> string every time you create a hosted
     *        zone. <code>CallerReference</code> can be any unique string; you
     *        might choose to use a string that identifies your project, such as
     *        <code>DNSMigration_01</code>.</p>
     *        <p>
     *        Valid characters are any Unicode code points that are legal in an
     *        XML 1.0 document. The UTF-8 encoding of the value must be less
     *        than 128 bytes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateHostedZoneRequest withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * A complex type that contains an optional comment about your hosted zone.
     * </p>
     * 
     * @param hostedZoneConfig
     *        A complex type that contains an optional comment about your hosted
     *        zone.
     */
    public void setHostedZoneConfig(HostedZoneConfig hostedZoneConfig) {
        this.hostedZoneConfig = hostedZoneConfig;
    }

    /**
     * <p>
     * A complex type that contains an optional comment about your hosted zone.
     * </p>
     * 
     * @return A complex type that contains an optional comment about your
     *         hosted zone.
     */
    public HostedZoneConfig getHostedZoneConfig() {
        return this.hostedZoneConfig;
    }

    /**
     * <p>
     * A complex type that contains an optional comment about your hosted zone.
     * </p>
     * 
     * @param hostedZoneConfig
     *        A complex type that contains an optional comment about your hosted
     *        zone.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateHostedZoneRequest withHostedZoneConfig(
            HostedZoneConfig hostedZoneConfig) {
        setHostedZoneConfig(hostedZoneConfig);
        return this;
    }

    /**
     * <p>
     * The delegation set id of the reusable delgation set whose NS records you
     * want to assign to the new hosted zone.
     * </p>
     * 
     * @param delegationSetId
     *        The delegation set id of the reusable delgation set whose NS
     *        records you want to assign to the new hosted zone.
     */
    public void setDelegationSetId(String delegationSetId) {
        this.delegationSetId = delegationSetId;
    }

    /**
     * <p>
     * The delegation set id of the reusable delgation set whose NS records you
     * want to assign to the new hosted zone.
     * </p>
     * 
     * @return The delegation set id of the reusable delgation set whose NS
     *         records you want to assign to the new hosted zone.
     */
    public String getDelegationSetId() {
        return this.delegationSetId;
    }

    /**
     * <p>
     * The delegation set id of the reusable delgation set whose NS records you
     * want to assign to the new hosted zone.
     * </p>
     * 
     * @param delegationSetId
     *        The delegation set id of the reusable delgation set whose NS
     *        records you want to assign to the new hosted zone.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateHostedZoneRequest withDelegationSetId(String delegationSetId) {
        setDelegationSetId(delegationSetId);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getVPC() != null)
            sb.append("VPC: " + getVPC() + ",");
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference() + ",");
        if (getHostedZoneConfig() != null)
            sb.append("HostedZoneConfig: " + getHostedZoneConfig() + ",");
        if (getDelegationSetId() != null)
            sb.append("DelegationSetId: " + getDelegationSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHostedZoneRequest == false)
            return false;
        CreateHostedZoneRequest other = (CreateHostedZoneRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVPC() == null ^ this.getVPC() == null)
            return false;
        if (other.getVPC() != null
                && other.getVPC().equals(this.getVPC()) == false)
            return false;
        if (other.getCallerReference() == null
                ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getHostedZoneConfig() == null
                ^ this.getHostedZoneConfig() == null)
            return false;
        if (other.getHostedZoneConfig() != null
                && other.getHostedZoneConfig().equals(
                        this.getHostedZoneConfig()) == false)
            return false;
        if (other.getDelegationSetId() == null
                ^ this.getDelegationSetId() == null)
            return false;
        if (other.getDelegationSetId() != null
                && other.getDelegationSetId().equals(this.getDelegationSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getVPC() == null) ? 0 : getVPC().hashCode());
        hashCode = prime
                * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHostedZoneConfig() == null) ? 0 : getHostedZoneConfig()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDelegationSetId() == null) ? 0 : getDelegationSetId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CreateHostedZoneRequest clone() {
        return (CreateHostedZoneRequest) super.clone();
    }
}