/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type containing the hosted zone request information.
 * </p>
 */
public class CreateHostedZoneRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain. For resource record types that include a domain name, specify a fully qualified domain
     * name, for example, <i>www.example.com</i>. The trailing dot is optional; Amazon Route 53 assumes that the domain
     * name is fully qualified. This means that Amazon Route 53 treats <i>www.example.com</i> (without a trailing dot)
     * and <i>www.example.com.</i> (with a trailing dot) as identical.
     * </p>
     * <p>
     * If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If your
     * domain name is registered with a registrar other than Amazon Route 53, change the name servers for your domain to
     * the set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in the DelegationSet element.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The VPC that you want your hosted zone to be associated with. By providing this parameter, your newly created
     * hosted can't be resolved anywhere other than the given VPC.
     * </p>
     */
    private VPC vPC;
    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreateHostedZone</code> requests to be
     * retried without the risk of executing the operation twice. You must use a unique <code>CallerReference</code>
     * string every time you create a hosted zone. <code>CallerReference</code> can be any unique string, for example, a
     * date/time stamp.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * (Optional) A complex type that contains an optional comment about your hosted zone. If you don't want to specify
     * a comment, omit both the <code>HostedZoneConfig</code> and <code>Comment</code> elements.
     * </p>
     */
    private HostedZoneConfig hostedZoneConfig;
    /**
     * <p>
     * If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53 assigned to
     * the reusable delegation set when you created it. For more information about reusable delegation sets, see
     * <a>CreateReusableDelegationSet</a>.
     * </p>
     * <dl>
     * <dt>Type</dt>
     * <dd>
     * <p>
     * String
     * </p>
     * </dd>
     * <dt>Default</dt>
     * <dd>
     * <p>
     * None
     * </p>
     * </dd>
     * <dt>Parent</dt>
     * <dd>
     * <p>
     * <code>CreatedHostedZoneRequest</code>
     * </p>
     * </dd>
     * </dl>
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
     *        The name of the domain. For resource record types that include a domain name, specify a fully qualified
     *        domain name, for example, <i>www.example.com</i>. The trailing dot is optional; Amazon Route 53 assumes
     *        that the domain name is fully qualified. This means that Amazon Route 53 treats <i>www.example.com</i>
     *        (without a trailing dot) and <i>www.example.com.</i> (with a trailing dot) as identical.</p>
     *        <p>
     *        If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If
     *        your domain name is registered with a registrar other than Amazon Route 53, change the name servers for
     *        your domain to the set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in the
     *        DelegationSet element.
     * @param callerReference
     *        A unique string that identifies the request and that allows failed <code>CreateHostedZone</code> requests
     *        to be retried without the risk of executing the operation twice. You must use a unique
     *        <code>CallerReference</code> string every time you create a hosted zone. <code>CallerReference</code> can
     *        be any unique string, for example, a date/time stamp.
     */
    public CreateHostedZoneRequest(String name, String callerReference) {
        setName(name);
        setCallerReference(callerReference);
    }

    /**
     * <p>
     * The name of the domain. For resource record types that include a domain name, specify a fully qualified domain
     * name, for example, <i>www.example.com</i>. The trailing dot is optional; Amazon Route 53 assumes that the domain
     * name is fully qualified. This means that Amazon Route 53 treats <i>www.example.com</i> (without a trailing dot)
     * and <i>www.example.com.</i> (with a trailing dot) as identical.
     * </p>
     * <p>
     * If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If your
     * domain name is registered with a registrar other than Amazon Route 53, change the name servers for your domain to
     * the set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in the DelegationSet element.
     * </p>
     * 
     * @param name
     *        The name of the domain. For resource record types that include a domain name, specify a fully qualified
     *        domain name, for example, <i>www.example.com</i>. The trailing dot is optional; Amazon Route 53 assumes
     *        that the domain name is fully qualified. This means that Amazon Route 53 treats <i>www.example.com</i>
     *        (without a trailing dot) and <i>www.example.com.</i> (with a trailing dot) as identical.</p>
     *        <p>
     *        If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If
     *        your domain name is registered with a registrar other than Amazon Route 53, change the name servers for
     *        your domain to the set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in the
     *        DelegationSet element.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain. For resource record types that include a domain name, specify a fully qualified domain
     * name, for example, <i>www.example.com</i>. The trailing dot is optional; Amazon Route 53 assumes that the domain
     * name is fully qualified. This means that Amazon Route 53 treats <i>www.example.com</i> (without a trailing dot)
     * and <i>www.example.com.</i> (with a trailing dot) as identical.
     * </p>
     * <p>
     * If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If your
     * domain name is registered with a registrar other than Amazon Route 53, change the name servers for your domain to
     * the set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in the DelegationSet element.
     * </p>
     * 
     * @return The name of the domain. For resource record types that include a domain name, specify a fully qualified
     *         domain name, for example, <i>www.example.com</i>. The trailing dot is optional; Amazon Route 53 assumes
     *         that the domain name is fully qualified. This means that Amazon Route 53 treats <i>www.example.com</i>
     *         (without a trailing dot) and <i>www.example.com.</i> (with a trailing dot) as identical.</p>
     *         <p>
     *         If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If
     *         your domain name is registered with a registrar other than Amazon Route 53, change the name servers for
     *         your domain to the set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in the
     *         DelegationSet element.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain. For resource record types that include a domain name, specify a fully qualified domain
     * name, for example, <i>www.example.com</i>. The trailing dot is optional; Amazon Route 53 assumes that the domain
     * name is fully qualified. This means that Amazon Route 53 treats <i>www.example.com</i> (without a trailing dot)
     * and <i>www.example.com.</i> (with a trailing dot) as identical.
     * </p>
     * <p>
     * If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If your
     * domain name is registered with a registrar other than Amazon Route 53, change the name servers for your domain to
     * the set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in the DelegationSet element.
     * </p>
     * 
     * @param name
     *        The name of the domain. For resource record types that include a domain name, specify a fully qualified
     *        domain name, for example, <i>www.example.com</i>. The trailing dot is optional; Amazon Route 53 assumes
     *        that the domain name is fully qualified. This means that Amazon Route 53 treats <i>www.example.com</i>
     *        (without a trailing dot) and <i>www.example.com.</i> (with a trailing dot) as identical.</p>
     *        <p>
     *        If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If
     *        your domain name is registered with a registrar other than Amazon Route 53, change the name servers for
     *        your domain to the set of <code>NameServers</code> that <code>CreateHostedZone</code> returns in the
     *        DelegationSet element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostedZoneRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The VPC that you want your hosted zone to be associated with. By providing this parameter, your newly created
     * hosted can't be resolved anywhere other than the given VPC.
     * </p>
     * 
     * @param vPC
     *        The VPC that you want your hosted zone to be associated with. By providing this parameter, your newly
     *        created hosted can't be resolved anywhere other than the given VPC.
     */

    public void setVPC(VPC vPC) {
        this.vPC = vPC;
    }

    /**
     * <p>
     * The VPC that you want your hosted zone to be associated with. By providing this parameter, your newly created
     * hosted can't be resolved anywhere other than the given VPC.
     * </p>
     * 
     * @return The VPC that you want your hosted zone to be associated with. By providing this parameter, your newly
     *         created hosted can't be resolved anywhere other than the given VPC.
     */

    public VPC getVPC() {
        return this.vPC;
    }

    /**
     * <p>
     * The VPC that you want your hosted zone to be associated with. By providing this parameter, your newly created
     * hosted can't be resolved anywhere other than the given VPC.
     * </p>
     * 
     * @param vPC
     *        The VPC that you want your hosted zone to be associated with. By providing this parameter, your newly
     *        created hosted can't be resolved anywhere other than the given VPC.
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
     * string every time you create a hosted zone. <code>CallerReference</code> can be any unique string, for example, a
     * date/time stamp.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request and that allows failed <code>CreateHostedZone</code> requests
     *        to be retried without the risk of executing the operation twice. You must use a unique
     *        <code>CallerReference</code> string every time you create a hosted zone. <code>CallerReference</code> can
     *        be any unique string, for example, a date/time stamp.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreateHostedZone</code> requests to be
     * retried without the risk of executing the operation twice. You must use a unique <code>CallerReference</code>
     * string every time you create a hosted zone. <code>CallerReference</code> can be any unique string, for example, a
     * date/time stamp.
     * </p>
     * 
     * @return A unique string that identifies the request and that allows failed <code>CreateHostedZone</code> requests
     *         to be retried without the risk of executing the operation twice. You must use a unique
     *         <code>CallerReference</code> string every time you create a hosted zone. <code>CallerReference</code> can
     *         be any unique string, for example, a date/time stamp.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreateHostedZone</code> requests to be
     * retried without the risk of executing the operation twice. You must use a unique <code>CallerReference</code>
     * string every time you create a hosted zone. <code>CallerReference</code> can be any unique string, for example, a
     * date/time stamp.
     * </p>
     * 
     * @param callerReference
     *        A unique string that identifies the request and that allows failed <code>CreateHostedZone</code> requests
     *        to be retried without the risk of executing the operation twice. You must use a unique
     *        <code>CallerReference</code> string every time you create a hosted zone. <code>CallerReference</code> can
     *        be any unique string, for example, a date/time stamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostedZoneRequest withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * (Optional) A complex type that contains an optional comment about your hosted zone. If you don't want to specify
     * a comment, omit both the <code>HostedZoneConfig</code> and <code>Comment</code> elements.
     * </p>
     * 
     * @param hostedZoneConfig
     *        (Optional) A complex type that contains an optional comment about your hosted zone. If you don't want to
     *        specify a comment, omit both the <code>HostedZoneConfig</code> and <code>Comment</code> elements.
     */

    public void setHostedZoneConfig(HostedZoneConfig hostedZoneConfig) {
        this.hostedZoneConfig = hostedZoneConfig;
    }

    /**
     * <p>
     * (Optional) A complex type that contains an optional comment about your hosted zone. If you don't want to specify
     * a comment, omit both the <code>HostedZoneConfig</code> and <code>Comment</code> elements.
     * </p>
     * 
     * @return (Optional) A complex type that contains an optional comment about your hosted zone. If you don't want to
     *         specify a comment, omit both the <code>HostedZoneConfig</code> and <code>Comment</code> elements.
     */

    public HostedZoneConfig getHostedZoneConfig() {
        return this.hostedZoneConfig;
    }

    /**
     * <p>
     * (Optional) A complex type that contains an optional comment about your hosted zone. If you don't want to specify
     * a comment, omit both the <code>HostedZoneConfig</code> and <code>Comment</code> elements.
     * </p>
     * 
     * @param hostedZoneConfig
     *        (Optional) A complex type that contains an optional comment about your hosted zone. If you don't want to
     *        specify a comment, omit both the <code>HostedZoneConfig</code> and <code>Comment</code> elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostedZoneRequest withHostedZoneConfig(HostedZoneConfig hostedZoneConfig) {
        setHostedZoneConfig(hostedZoneConfig);
        return this;
    }

    /**
     * <p>
     * If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53 assigned to
     * the reusable delegation set when you created it. For more information about reusable delegation sets, see
     * <a>CreateReusableDelegationSet</a>.
     * </p>
     * <dl>
     * <dt>Type</dt>
     * <dd>
     * <p>
     * String
     * </p>
     * </dd>
     * <dt>Default</dt>
     * <dd>
     * <p>
     * None
     * </p>
     * </dd>
     * <dt>Parent</dt>
     * <dd>
     * <p>
     * <code>CreatedHostedZoneRequest</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @param delegationSetId
     *        If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53
     *        assigned to the reusable delegation set when you created it. For more information about reusable
     *        delegation sets, see <a>CreateReusableDelegationSet</a>.</p>
     *        <dl>
     *        <dt>Type</dt>
     *        <dd>
     *        <p>
     *        String
     *        </p>
     *        </dd>
     *        <dt>Default</dt>
     *        <dd>
     *        <p>
     *        None
     *        </p>
     *        </dd>
     *        <dt>Parent</dt>
     *        <dd>
     *        <p>
     *        <code>CreatedHostedZoneRequest</code>
     *        </p>
     *        </dd>
     */

    public void setDelegationSetId(String delegationSetId) {
        this.delegationSetId = delegationSetId;
    }

    /**
     * <p>
     * If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53 assigned to
     * the reusable delegation set when you created it. For more information about reusable delegation sets, see
     * <a>CreateReusableDelegationSet</a>.
     * </p>
     * <dl>
     * <dt>Type</dt>
     * <dd>
     * <p>
     * String
     * </p>
     * </dd>
     * <dt>Default</dt>
     * <dd>
     * <p>
     * None
     * </p>
     * </dd>
     * <dt>Parent</dt>
     * <dd>
     * <p>
     * <code>CreatedHostedZoneRequest</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @return If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53
     *         assigned to the reusable delegation set when you created it. For more information about reusable
     *         delegation sets, see <a>CreateReusableDelegationSet</a>.</p>
     *         <dl>
     *         <dt>Type</dt>
     *         <dd>
     *         <p>
     *         String
     *         </p>
     *         </dd>
     *         <dt>Default</dt>
     *         <dd>
     *         <p>
     *         None
     *         </p>
     *         </dd>
     *         <dt>Parent</dt>
     *         <dd>
     *         <p>
     *         <code>CreatedHostedZoneRequest</code>
     *         </p>
     *         </dd>
     */

    public String getDelegationSetId() {
        return this.delegationSetId;
    }

    /**
     * <p>
     * If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53 assigned to
     * the reusable delegation set when you created it. For more information about reusable delegation sets, see
     * <a>CreateReusableDelegationSet</a>.
     * </p>
     * <dl>
     * <dt>Type</dt>
     * <dd>
     * <p>
     * String
     * </p>
     * </dd>
     * <dt>Default</dt>
     * <dd>
     * <p>
     * None
     * </p>
     * </dd>
     * <dt>Parent</dt>
     * <dd>
     * <p>
     * <code>CreatedHostedZoneRequest</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @param delegationSetId
     *        If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53
     *        assigned to the reusable delegation set when you created it. For more information about reusable
     *        delegation sets, see <a>CreateReusableDelegationSet</a>.</p>
     *        <dl>
     *        <dt>Type</dt>
     *        <dd>
     *        <p>
     *        String
     *        </p>
     *        </dd>
     *        <dt>Default</dt>
     *        <dd>
     *        <p>
     *        None
     *        </p>
     *        </dd>
     *        <dt>Parent</dt>
     *        <dd>
     *        <p>
     *        <code>CreatedHostedZoneRequest</code>
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostedZoneRequest withDelegationSetId(String delegationSetId) {
        setDelegationSetId(delegationSetId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
