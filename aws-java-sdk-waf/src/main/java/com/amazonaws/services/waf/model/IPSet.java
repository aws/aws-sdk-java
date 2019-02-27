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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains one or more IP addresses or blocks of IP addresses specified in Classless Inter-Domain Routing (CIDR)
 * notation. AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6
 * address ranges: /24, /32, /48, /56, /64, and /128.
 * </p>
 * <p>
 * To specify an individual IP address, you specify the four-part IP address followed by a <code>/32</code>, for
 * example, 192.0.2.0/31. To block a range of IP addresses, you can specify /8 or any range between /16 through /32 (for
 * IPv4) or /24, /32, /48, /56, /64, or /128 (for IPv6). For more information about CIDR notation, see the Wikipedia
 * entry <a href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/IPSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IPSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>IPSetId</code> for an <code>IPSet</code>. You use <code>IPSetId</code> to get information about an
     * <code>IPSet</code> (see <a>GetIPSet</a>), update an <code>IPSet</code> (see <a>UpdateIPSet</a>), insert an
     * <code>IPSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and
     * delete an <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).
     * </p>
     * <p>
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by <a>ListIPSets</a>.
     * </p>
     */
    private String iPSetId;
    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the name of an <code>IPSet</code> after you
     * create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP address range (in CIDR notation) that web
     * requests originate from. If the <code>WebACL</code> is associated with a CloudFront distribution and the viewer
     * did not use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in the
     * CloudFront access logs.
     * </p>
     */
    private java.util.List<IPSetDescriptor> iPSetDescriptors;

    /**
     * <p>
     * The <code>IPSetId</code> for an <code>IPSet</code>. You use <code>IPSetId</code> to get information about an
     * <code>IPSet</code> (see <a>GetIPSet</a>), update an <code>IPSet</code> (see <a>UpdateIPSet</a>), insert an
     * <code>IPSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and
     * delete an <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).
     * </p>
     * <p>
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by <a>ListIPSets</a>.
     * </p>
     * 
     * @param iPSetId
     *        The <code>IPSetId</code> for an <code>IPSet</code>. You use <code>IPSetId</code> to get information about
     *        an <code>IPSet</code> (see <a>GetIPSet</a>), update an <code>IPSet</code> (see <a>UpdateIPSet</a>), insert
     *        an <code>IPSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see
     *        <a>UpdateRule</a>), and delete an <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).</p>
     *        <p>
     *        <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by <a>ListIPSets</a>.
     */

    public void setIPSetId(String iPSetId) {
        this.iPSetId = iPSetId;
    }

    /**
     * <p>
     * The <code>IPSetId</code> for an <code>IPSet</code>. You use <code>IPSetId</code> to get information about an
     * <code>IPSet</code> (see <a>GetIPSet</a>), update an <code>IPSet</code> (see <a>UpdateIPSet</a>), insert an
     * <code>IPSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and
     * delete an <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).
     * </p>
     * <p>
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by <a>ListIPSets</a>.
     * </p>
     * 
     * @return The <code>IPSetId</code> for an <code>IPSet</code>. You use <code>IPSetId</code> to get information about
     *         an <code>IPSet</code> (see <a>GetIPSet</a>), update an <code>IPSet</code> (see <a>UpdateIPSet</a>),
     *         insert an <code>IPSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see
     *         <a>UpdateRule</a>), and delete an <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).</p>
     *         <p>
     *         <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by <a>ListIPSets</a>.
     */

    public String getIPSetId() {
        return this.iPSetId;
    }

    /**
     * <p>
     * The <code>IPSetId</code> for an <code>IPSet</code>. You use <code>IPSetId</code> to get information about an
     * <code>IPSet</code> (see <a>GetIPSet</a>), update an <code>IPSet</code> (see <a>UpdateIPSet</a>), insert an
     * <code>IPSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see <a>UpdateRule</a>), and
     * delete an <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).
     * </p>
     * <p>
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by <a>ListIPSets</a>.
     * </p>
     * 
     * @param iPSetId
     *        The <code>IPSetId</code> for an <code>IPSet</code>. You use <code>IPSetId</code> to get information about
     *        an <code>IPSet</code> (see <a>GetIPSet</a>), update an <code>IPSet</code> (see <a>UpdateIPSet</a>), insert
     *        an <code>IPSet</code> into a <code>Rule</code> or delete one from a <code>Rule</code> (see
     *        <a>UpdateRule</a>), and delete an <code>IPSet</code> from AWS WAF (see <a>DeleteIPSet</a>).</p>
     *        <p>
     *        <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by <a>ListIPSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPSet withIPSetId(String iPSetId) {
        setIPSetId(iPSetId);
        return this;
    }

    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the name of an <code>IPSet</code> after you
     * create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>IPSet</a>. You can't change the name of an <code>IPSet</code>
     *        after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the name of an <code>IPSet</code> after you
     * create it.
     * </p>
     * 
     * @return A friendly name or description of the <a>IPSet</a>. You can't change the name of an <code>IPSet</code>
     *         after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>IPSet</a>. You can't change the name of an <code>IPSet</code> after you
     * create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>IPSet</a>. You can't change the name of an <code>IPSet</code>
     *        after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPSet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP address range (in CIDR notation) that web
     * requests originate from. If the <code>WebACL</code> is associated with a CloudFront distribution and the viewer
     * did not use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in the
     * CloudFront access logs.
     * </p>
     * 
     * @return The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP address range (in CIDR notation)
     *         that web requests originate from. If the <code>WebACL</code> is associated with a CloudFront distribution
     *         and the viewer did not use an HTTP proxy or a load balancer to send the request, this is the value of the
     *         c-ip field in the CloudFront access logs.
     */

    public java.util.List<IPSetDescriptor> getIPSetDescriptors() {
        return iPSetDescriptors;
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP address range (in CIDR notation) that web
     * requests originate from. If the <code>WebACL</code> is associated with a CloudFront distribution and the viewer
     * did not use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in the
     * CloudFront access logs.
     * </p>
     * 
     * @param iPSetDescriptors
     *        The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP address range (in CIDR notation)
     *        that web requests originate from. If the <code>WebACL</code> is associated with a CloudFront distribution
     *        and the viewer did not use an HTTP proxy or a load balancer to send the request, this is the value of the
     *        c-ip field in the CloudFront access logs.
     */

    public void setIPSetDescriptors(java.util.Collection<IPSetDescriptor> iPSetDescriptors) {
        if (iPSetDescriptors == null) {
            this.iPSetDescriptors = null;
            return;
        }

        this.iPSetDescriptors = new java.util.ArrayList<IPSetDescriptor>(iPSetDescriptors);
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP address range (in CIDR notation) that web
     * requests originate from. If the <code>WebACL</code> is associated with a CloudFront distribution and the viewer
     * did not use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in the
     * CloudFront access logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIPSetDescriptors(java.util.Collection)} or {@link #withIPSetDescriptors(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param iPSetDescriptors
     *        The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP address range (in CIDR notation)
     *        that web requests originate from. If the <code>WebACL</code> is associated with a CloudFront distribution
     *        and the viewer did not use an HTTP proxy or a load balancer to send the request, this is the value of the
     *        c-ip field in the CloudFront access logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPSet withIPSetDescriptors(IPSetDescriptor... iPSetDescriptors) {
        if (this.iPSetDescriptors == null) {
            setIPSetDescriptors(new java.util.ArrayList<IPSetDescriptor>(iPSetDescriptors.length));
        }
        for (IPSetDescriptor ele : iPSetDescriptors) {
            this.iPSetDescriptors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP address range (in CIDR notation) that web
     * requests originate from. If the <code>WebACL</code> is associated with a CloudFront distribution and the viewer
     * did not use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in the
     * CloudFront access logs.
     * </p>
     * 
     * @param iPSetDescriptors
     *        The IP address type (<code>IPV4</code> or <code>IPV6</code>) and the IP address range (in CIDR notation)
     *        that web requests originate from. If the <code>WebACL</code> is associated with a CloudFront distribution
     *        and the viewer did not use an HTTP proxy or a load balancer to send the request, this is the value of the
     *        c-ip field in the CloudFront access logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IPSet withIPSetDescriptors(java.util.Collection<IPSetDescriptor> iPSetDescriptors) {
        setIPSetDescriptors(iPSetDescriptors);
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
        if (getIPSetId() != null)
            sb.append("IPSetId: ").append(getIPSetId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIPSetDescriptors() != null)
            sb.append("IPSetDescriptors: ").append(getIPSetDescriptors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IPSet == false)
            return false;
        IPSet other = (IPSet) obj;
        if (other.getIPSetId() == null ^ this.getIPSetId() == null)
            return false;
        if (other.getIPSetId() != null && other.getIPSetId().equals(this.getIPSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIPSetDescriptors() == null ^ this.getIPSetDescriptors() == null)
            return false;
        if (other.getIPSetDescriptors() != null && other.getIPSetDescriptors().equals(this.getIPSetDescriptors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIPSetId() == null) ? 0 : getIPSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIPSetDescriptors() == null) ? 0 : getIPSetDescriptors().hashCode());
        return hashCode;
    }

    @Override
    public IPSet clone() {
        try {
            return (IPSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.IPSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
