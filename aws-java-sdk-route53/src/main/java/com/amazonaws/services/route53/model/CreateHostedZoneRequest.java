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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains information about the request to create a public or private hosted zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateHostedZone" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHostedZoneRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain. Specify a fully qualified domain name, for example, <i>www.example.com</i>. The trailing
     * dot is optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that Route 53 treats
     * <i>www.example.com</i> (without a trailing dot) and <i>www.example.com.</i> (with a trailing dot) as identical.
     * </p>
     * <p>
     * If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If your
     * domain name is registered with a registrar other than Route 53, change the name servers for your domain to the
     * set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in <code>DelegationSet</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * (Private hosted zones only) A complex type that contains information about the Amazon VPC that you're associating
     * with this hosted zone.
     * </p>
     * <p>
     * You can specify only one Amazon VPC when you create a private hosted zone. To associate additional Amazon VPCs
     * with the hosted zone, use <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_AssociateVPCWithHostedZone.html"
     * >AssociateVPCWithHostedZone</a> after you create a hosted zone.
     * </p>
     */
    private VPC vPC;
    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreateHostedZone</code> requests to be
     * retried without the risk of executing the operation twice. You must use a unique <code>CallerReference</code>
     * string every time you submit a <code>CreateHostedZone</code> request. <code>CallerReference</code> can be any
     * unique string, for example, a date/time stamp.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * (Optional) A complex type that contains the following optional values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For public and private hosted zones, an optional comment
     * </p>
     * </li>
     * <li>
     * <p>
     * For private hosted zones, an optional <code>PrivateZone</code> element
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a comment or the <code>PrivateZone</code> element, omit <code>HostedZoneConfig</code> and
     * the other elements.
     * </p>
     */
    private HostedZoneConfig hostedZoneConfig;
    /**
     * <p>
     * If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53 assigned to
     * the reusable delegation set when you created it. For more information about reusable delegation sets, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html">
     * CreateReusableDelegationSet</a>.
     * </p>
     */
    private String delegationSetId;

    /**
     * Default constructor for CreateHostedZoneRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateHostedZoneRequest() {
    }

    /**
     * Constructs a new CreateHostedZoneRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param name
     *        The name of the domain. Specify a fully qualified domain name, for example, <i>www.example.com</i>. The
     *        trailing dot is optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that
     *        Route 53 treats <i>www.example.com</i> (without a trailing dot) and <i>www.example.com.</i> (with a
     *        trailing dot) as identical.</p>
     *        <p>
     *        If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If
     *        your domain name is registered with a registrar other than Route 53, change the name servers for your
     *        domain to the set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in
     *        <code>DelegationSet</code>.
     * @param callerReference
     *        A unique string that identifies the request and that allows failed <code>CreateHostedZone</code> requests
     *        to be retried without the risk of executing the operation twice. You must use a unique
     *        <code>CallerReference</code> string every time you submit a <code>CreateHostedZone</code> request.
     *        <code>CallerReference</code> can be any unique string, for example, a date/time stamp.
     */
    public CreateHostedZoneRequest(String name, String callerReference) {
        setName(name);
        setCallerReference(callerReference);
    }

    /**
     * <p>
     * The name of the domain. Specify a fully qualified domain name, for example, <i>www.example.com</i>. The trailing
     * dot is optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that Route 53 treats
     * <i>www.example.com</i> (without a trailing dot) and <i>www.example.com.</i> (with a trailing dot) as identical.
     * </p>
     * <p>
     * If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If your
     * domain name is registered with a registrar other than Route 53, change the name servers for your domain to the
     * set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in <code>DelegationSet</code>.
     * </p>
     * 
     * @param name
     *        The name of the domain. Specify a fully qualified domain name, for example, <i>www.example.com</i>. The
     *        trailing dot is optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that
     *        Route 53 treats <i>www.example.com</i> (without a trailing dot) and <i>www.example.com.</i> (with a
     *        trailing dot) as identical.</p>
     *        <p>
     *        If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If
     *        your domain name is registered with a registrar other than Route 53, change the name servers for your
     *        domain to the set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in
     *        <code>DelegationSet</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain. Specify a fully qualified domain name, for example, <i>www.example.com</i>. The trailing
     * dot is optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that Route 53 treats
     * <i>www.example.com</i> (without a trailing dot) and <i>www.example.com.</i> (with a trailing dot) as identical.
     * </p>
     * <p>
     * If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If your
     * domain name is registered with a registrar other than Route 53, change the name servers for your domain to the
     * set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in <code>DelegationSet</code>.
     * </p>
     * 
     * @return The name of the domain. Specify a fully qualified domain name, for example, <i>www.example.com</i>. The
     *         trailing dot is optional; Amazon Route 53 assumes that the domain name is fully qualified. This means
     *         that Route 53 treats <i>www.example.com</i> (without a trailing dot) and <i>www.example.com.</i> (with a
     *         trailing dot) as identical.</p>
     *         <p>
     *         If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If
     *         your domain name is registered with a registrar other than Route 53, change the name servers for your
     *         domain to the set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in
     *         <code>DelegationSet</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain. Specify a fully qualified domain name, for example, <i>www.example.com</i>. The trailing
     * dot is optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that Route 53 treats
     * <i>www.example.com</i> (without a trailing dot) and <i>www.example.com.</i> (with a trailing dot) as identical.
     * </p>
     * <p>
     * If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If your
     * domain name is registered with a registrar other than Route 53, change the name servers for your domain to the
     * set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in <code>DelegationSet</code>.
     * </p>
     * 
     * @param name
     *        The name of the domain. Specify a fully qualified domain name, for example, <i>www.example.com</i>. The
     *        trailing dot is optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that
     *        Route 53 treats <i>www.example.com</i> (without a trailing dot) and <i>www.example.com.</i> (with a
     *        trailing dot) as identical.</p>
     *        <p>
     *        If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If
     *        your domain name is registered with a registrar other than Route 53, change the name servers for your
     *        domain to the set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in
     *        <code>DelegationSet</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostedZoneRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * (Private hosted zones only) A complex type that contains information about the Amazon VPC that you're associating
     * with this hosted zone.
     * </p>
     * <p>
     * You can specify only one Amazon VPC when you create a private hosted zone. To associate additional Amazon VPCs
     * with the hosted zone, use <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_AssociateVPCWithHostedZone.html"
     * >AssociateVPCWithHostedZone</a> after you create a hosted zone.
     * </p>
     * 
     * @param vPC
     *        (Private hosted zones only) A complex type that contains information about the Amazon VPC that you're
     *        associating with this hosted zone.</p>
     *        <p>
     *        You can specify only one Amazon VPC when you create a private hosted zone. To associate additional Amazon
     *        VPCs with the hosted zone, use <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_AssociateVPCWithHostedZone.html"
     *        >AssociateVPCWithHostedZone</a> after you create a hosted zone.
     */

    public void setVPC(VPC vPC) {
        this.vPC = vPC;
    }

    /**
     * <p>
     * (Private hosted zones only) A complex type that contains information about the Amazon VPC that you're associating
     * with this hosted zone.
     * </p>
     * <p>
     * You can specify only one Amazon VPC when you create a private hosted zone. To associate additional Amazon VPCs
     * with the hosted zone, use <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_AssociateVPCWithHostedZone.html"
     * >AssociateVPCWithHostedZone</a> after you create a hosted zone.
     * </p>
     * 
     * @return (Private hosted zones only) A complex type that contains information about the Amazon VPC that you're
     *         associating with this hosted zone.</p>
     *         <p>
     *         You can specify only one Amazon VPC when you create a private hosted zone. To associate additional Amazon
     *         VPCs with the hosted zone, use <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_AssociateVPCWithHostedZone.html"
     *         >AssociateVPCWithHostedZone</a> after you create a hosted zone.
     */

    public VPC getVPC() {
        return this.vPC;
    }

    /**
     * <p>
     * (Private hosted zones only) A complex type that contains information about the Amazon VPC that you're associating
     * with this hosted zone.
     * </p>
     * <p>
     * You can specify only one Amazon VPC when you create a private hosted zone. To associate additional Amazon VPCs
     * with the hosted zone, use <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_AssociateVPCWithHostedZone.html"
     * >AssociateVPCWithHostedZone</a> after you create a hosted zone.
     * </p>
     * 
     * @param vPC
     *        (Private hosted zones only) A complex type that contains information about the Amazon VPC that you're
     *        associating with this hosted zone.</p>
     *        <p>
     *        You can specify only one Amazon VPC when you create a private hosted zone. To associate additional Amazon
     *        VPCs with the hosted zone, use <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_AssociateVPCWithHostedZone.html"
     *        >AssociateVPCWithHostedZone</a> after you create a hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostedZoneRequest withVPC(VPC vPC) {
        setVPC(vPC);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreateHostedZone</code> requests to be
     * retried without the risk of executing the operation twice. You must use a unique <code>CallerReference</code>
     * string every time you submit a <code>CreateHostedZone</code> request. <code>CallerReference</code> can be any
     * unique string, for example, a date/time stamp.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request and that allows failed <code>CreateHostedZone</code> requests
     *        to be retried without the risk of executing the operation twice. You must use a unique
     *        <code>CallerReference</code> string every time you submit a <code>CreateHostedZone</code> request.
     *        <code>CallerReference</code> can be any unique string, for example, a date/time stamp.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreateHostedZone</code> requests to be
     * retried without the risk of executing the operation twice. You must use a unique <code>CallerReference</code>
     * string every time you submit a <code>CreateHostedZone</code> request. <code>CallerReference</code> can be any
     * unique string, for example, a date/time stamp.
     * </p>
     * 
     * @return A unique string that identifies the request and that allows failed <code>CreateHostedZone</code> requests
     *         to be retried without the risk of executing the operation twice. You must use a unique
     *         <code>CallerReference</code> string every time you submit a <code>CreateHostedZone</code> request.
     *         <code>CallerReference</code> can be any unique string, for example, a date/time stamp.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreateHostedZone</code> requests to be
     * retried without the risk of executing the operation twice. You must use a unique <code>CallerReference</code>
     * string every time you submit a <code>CreateHostedZone</code> request. <code>CallerReference</code> can be any
     * unique string, for example, a date/time stamp.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request and that allows failed <code>CreateHostedZone</code> requests
     *        to be retried without the risk of executing the operation twice. You must use a unique
     *        <code>CallerReference</code> string every time you submit a <code>CreateHostedZone</code> request.
     *        <code>CallerReference</code> can be any unique string, for example, a date/time stamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostedZoneRequest withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * (Optional) A complex type that contains the following optional values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For public and private hosted zones, an optional comment
     * </p>
     * </li>
     * <li>
     * <p>
     * For private hosted zones, an optional <code>PrivateZone</code> element
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a comment or the <code>PrivateZone</code> element, omit <code>HostedZoneConfig</code> and
     * the other elements.
     * </p>
     * 
     * @param hostedZoneConfig
     *        (Optional) A complex type that contains the following optional values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For public and private hosted zones, an optional comment
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For private hosted zones, an optional <code>PrivateZone</code> element
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a comment or the <code>PrivateZone</code> element, omit <code>HostedZoneConfig</code>
     *        and the other elements.
     */

    public void setHostedZoneConfig(HostedZoneConfig hostedZoneConfig) {
        this.hostedZoneConfig = hostedZoneConfig;
    }

    /**
     * <p>
     * (Optional) A complex type that contains the following optional values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For public and private hosted zones, an optional comment
     * </p>
     * </li>
     * <li>
     * <p>
     * For private hosted zones, an optional <code>PrivateZone</code> element
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a comment or the <code>PrivateZone</code> element, omit <code>HostedZoneConfig</code> and
     * the other elements.
     * </p>
     * 
     * @return (Optional) A complex type that contains the following optional values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For public and private hosted zones, an optional comment
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For private hosted zones, an optional <code>PrivateZone</code> element
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify a comment or the <code>PrivateZone</code> element, omit
     *         <code>HostedZoneConfig</code> and the other elements.
     */

    public HostedZoneConfig getHostedZoneConfig() {
        return this.hostedZoneConfig;
    }

    /**
     * <p>
     * (Optional) A complex type that contains the following optional values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For public and private hosted zones, an optional comment
     * </p>
     * </li>
     * <li>
     * <p>
     * For private hosted zones, an optional <code>PrivateZone</code> element
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a comment or the <code>PrivateZone</code> element, omit <code>HostedZoneConfig</code> and
     * the other elements.
     * </p>
     * 
     * @param hostedZoneConfig
     *        (Optional) A complex type that contains the following optional values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For public and private hosted zones, an optional comment
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For private hosted zones, an optional <code>PrivateZone</code> element
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a comment or the <code>PrivateZone</code> element, omit <code>HostedZoneConfig</code>
     *        and the other elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostedZoneRequest withHostedZoneConfig(HostedZoneConfig hostedZoneConfig) {
        setHostedZoneConfig(hostedZoneConfig);
        return this;
    }

    /**
     * <p>
     * If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53 assigned to
     * the reusable delegation set when you created it. For more information about reusable delegation sets, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html">
     * CreateReusableDelegationSet</a>.
     * </p>
     * 
     * @param delegationSetId
     *        If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53
     *        assigned to the reusable delegation set when you created it. For more information about reusable
     *        delegation sets, see <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html"
     *        >CreateReusableDelegationSet</a>.
     */

    public void setDelegationSetId(String delegationSetId) {
        this.delegationSetId = delegationSetId;
    }

    /**
     * <p>
     * If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53 assigned to
     * the reusable delegation set when you created it. For more information about reusable delegation sets, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html">
     * CreateReusableDelegationSet</a>.
     * </p>
     * 
     * @return If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53
     *         assigned to the reusable delegation set when you created it. For more information about reusable
     *         delegation sets, see <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html"
     *         >CreateReusableDelegationSet</a>.
     */

    public String getDelegationSetId() {
        return this.delegationSetId;
    }

    /**
     * <p>
     * If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53 assigned to
     * the reusable delegation set when you created it. For more information about reusable delegation sets, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html">
     * CreateReusableDelegationSet</a>.
     * </p>
     * 
     * @param delegationSetId
     *        If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53
     *        assigned to the reusable delegation set when you created it. For more information about reusable
     *        delegation sets, see <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateReusableDelegationSet.html"
     *        >CreateReusableDelegationSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostedZoneRequest withDelegationSetId(String delegationSetId) {
        setDelegationSetId(delegationSetId);
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
        if (getVPC() != null)
            sb.append("VPC: ").append(getVPC()).append(",");
        if (getCallerReference() != null)
            sb.append("CallerReference: ").append(getCallerReference()).append(",");
        if (getHostedZoneConfig() != null)
            sb.append("HostedZoneConfig: ").append(getHostedZoneConfig()).append(",");
        if (getDelegationSetId() != null)
            sb.append("DelegationSetId: ").append(getDelegationSetId());
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
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVPC() == null ^ this.getVPC() == null)
            return false;
        if (other.getVPC() != null && other.getVPC().equals(this.getVPC()) == false)
            return false;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getHostedZoneConfig() == null ^ this.getHostedZoneConfig() == null)
            return false;
        if (other.getHostedZoneConfig() != null && other.getHostedZoneConfig().equals(this.getHostedZoneConfig()) == false)
            return false;
        if (other.getDelegationSetId() == null ^ this.getDelegationSetId() == null)
            return false;
        if (other.getDelegationSetId() != null && other.getDelegationSetId().equals(this.getDelegationSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVPC() == null) ? 0 : getVPC().hashCode());
        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode + ((getHostedZoneConfig() == null) ? 0 : getHostedZoneConfig().hashCode());
        hashCode = prime * hashCode + ((getDelegationSetId() == null) ? 0 : getDelegationSetId().hashCode());
        return hashCode;
    }

    @Override
    public CreateHostedZoneRequest clone() {
        return (CreateHostedZoneRequest) super.clone();
    }

}
