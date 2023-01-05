/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.AllocateIpamPoolCidrRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllocateIpamPoolCidrRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<AllocateIpamPoolCidrRequest> {

    /**
     * <p>
     * The ID of the IPAM pool from which you would like to allocate a CIDR.
     * </p>
     */
    private String ipamPoolId;
    /**
     * <p>
     * The CIDR you would like to allocate from the IPAM pool. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the NetmaskLength or
     * the CIDR.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength or the
     * CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Possible values: Any available IPv4 or IPv6 CIDR.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The netmask length of the CIDR you would like to allocate from the IPAM pool. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the NetmaskLength or
     * the CIDR.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength or the
     * CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     * </p>
     */
    private Integer netmaskLength;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A description for the allocation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A preview of the next available CIDR in a pool.
     * </p>
     */
    private Boolean previewNextCidr;
    /**
     * <p>
     * Exclude a particular CIDR range from being returned by the pool. Disallowed CIDRs are only allowed if using
     * netmask length for allocation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> disallowedCidrs;

    /**
     * <p>
     * The ID of the IPAM pool from which you would like to allocate a CIDR.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool from which you would like to allocate a CIDR.
     */

    public void setIpamPoolId(String ipamPoolId) {
        this.ipamPoolId = ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool from which you would like to allocate a CIDR.
     * </p>
     * 
     * @return The ID of the IPAM pool from which you would like to allocate a CIDR.
     */

    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * <p>
     * The ID of the IPAM pool from which you would like to allocate a CIDR.
     * </p>
     * 
     * @param ipamPoolId
     *        The ID of the IPAM pool from which you would like to allocate a CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateIpamPoolCidrRequest withIpamPoolId(String ipamPoolId) {
        setIpamPoolId(ipamPoolId);
        return this;
    }

    /**
     * <p>
     * The CIDR you would like to allocate from the IPAM pool. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the NetmaskLength or
     * the CIDR.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength or the
     * CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Possible values: Any available IPv4 or IPv6 CIDR.
     * </p>
     * 
     * @param cidr
     *        The CIDR you would like to allocate from the IPAM pool. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the
     *        NetmaskLength or the CIDR.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength
     *        or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Possible values: Any available IPv4 or IPv6 CIDR.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The CIDR you would like to allocate from the IPAM pool. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the NetmaskLength or
     * the CIDR.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength or the
     * CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Possible values: Any available IPv4 or IPv6 CIDR.
     * </p>
     * 
     * @return The CIDR you would like to allocate from the IPAM pool. Note the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the
     *         NetmaskLength or the CIDR.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength
     *         or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Possible values: Any available IPv4 or IPv6 CIDR.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The CIDR you would like to allocate from the IPAM pool. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the NetmaskLength or
     * the CIDR.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength or the
     * CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Possible values: Any available IPv4 or IPv6 CIDR.
     * </p>
     * 
     * @param cidr
     *        The CIDR you would like to allocate from the IPAM pool. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the
     *        NetmaskLength or the CIDR.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength
     *        or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Possible values: Any available IPv4 or IPv6 CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateIpamPoolCidrRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The netmask length of the CIDR you would like to allocate from the IPAM pool. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the NetmaskLength or
     * the CIDR.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength or the
     * CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     * </p>
     * 
     * @param netmaskLength
     *        The netmask length of the CIDR you would like to allocate from the IPAM pool. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the
     *        NetmaskLength or the CIDR.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength
     *        or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0
     *        - 128.
     */

    public void setNetmaskLength(Integer netmaskLength) {
        this.netmaskLength = netmaskLength;
    }

    /**
     * <p>
     * The netmask length of the CIDR you would like to allocate from the IPAM pool. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the NetmaskLength or
     * the CIDR.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength or the
     * CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     * </p>
     * 
     * @return The netmask length of the CIDR you would like to allocate from the IPAM pool. Note the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the
     *         NetmaskLength or the CIDR.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength
     *         or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0
     *         - 128.
     */

    public Integer getNetmaskLength() {
        return this.netmaskLength;
    }

    /**
     * <p>
     * The netmask length of the CIDR you would like to allocate from the IPAM pool. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the NetmaskLength or
     * the CIDR.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength or the
     * CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0 - 128.
     * </p>
     * 
     * @param netmaskLength
     *        The netmask length of the CIDR you would like to allocate from the IPAM pool. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If there is no DefaultNetmaskLength allocation rule set on the pool, you must specify either the
     *        NetmaskLength or the CIDR.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the DefaultNetmaskLength allocation rule is set on the pool, you can specify either the NetmaskLength
     *        or the CIDR and the DefaultNetmaskLength allocation rule will be ignored.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Possible netmask lengths for IPv4 addresses are 0 - 32. Possible netmask lengths for IPv6 addresses are 0
     *        - 128.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateIpamPoolCidrRequest withNetmaskLength(Integer netmaskLength) {
        setNetmaskLength(netmaskLength);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateIpamPoolCidrRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A description for the allocation.
     * </p>
     * 
     * @param description
     *        A description for the allocation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the allocation.
     * </p>
     * 
     * @return A description for the allocation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the allocation.
     * </p>
     * 
     * @param description
     *        A description for the allocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateIpamPoolCidrRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A preview of the next available CIDR in a pool.
     * </p>
     * 
     * @param previewNextCidr
     *        A preview of the next available CIDR in a pool.
     */

    public void setPreviewNextCidr(Boolean previewNextCidr) {
        this.previewNextCidr = previewNextCidr;
    }

    /**
     * <p>
     * A preview of the next available CIDR in a pool.
     * </p>
     * 
     * @return A preview of the next available CIDR in a pool.
     */

    public Boolean getPreviewNextCidr() {
        return this.previewNextCidr;
    }

    /**
     * <p>
     * A preview of the next available CIDR in a pool.
     * </p>
     * 
     * @param previewNextCidr
     *        A preview of the next available CIDR in a pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateIpamPoolCidrRequest withPreviewNextCidr(Boolean previewNextCidr) {
        setPreviewNextCidr(previewNextCidr);
        return this;
    }

    /**
     * <p>
     * A preview of the next available CIDR in a pool.
     * </p>
     * 
     * @return A preview of the next available CIDR in a pool.
     */

    public Boolean isPreviewNextCidr() {
        return this.previewNextCidr;
    }

    /**
     * <p>
     * Exclude a particular CIDR range from being returned by the pool. Disallowed CIDRs are only allowed if using
     * netmask length for allocation.
     * </p>
     * 
     * @return Exclude a particular CIDR range from being returned by the pool. Disallowed CIDRs are only allowed if
     *         using netmask length for allocation.
     */

    public java.util.List<String> getDisallowedCidrs() {
        if (disallowedCidrs == null) {
            disallowedCidrs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return disallowedCidrs;
    }

    /**
     * <p>
     * Exclude a particular CIDR range from being returned by the pool. Disallowed CIDRs are only allowed if using
     * netmask length for allocation.
     * </p>
     * 
     * @param disallowedCidrs
     *        Exclude a particular CIDR range from being returned by the pool. Disallowed CIDRs are only allowed if
     *        using netmask length for allocation.
     */

    public void setDisallowedCidrs(java.util.Collection<String> disallowedCidrs) {
        if (disallowedCidrs == null) {
            this.disallowedCidrs = null;
            return;
        }

        this.disallowedCidrs = new com.amazonaws.internal.SdkInternalList<String>(disallowedCidrs);
    }

    /**
     * <p>
     * Exclude a particular CIDR range from being returned by the pool. Disallowed CIDRs are only allowed if using
     * netmask length for allocation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisallowedCidrs(java.util.Collection)} or {@link #withDisallowedCidrs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param disallowedCidrs
     *        Exclude a particular CIDR range from being returned by the pool. Disallowed CIDRs are only allowed if
     *        using netmask length for allocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateIpamPoolCidrRequest withDisallowedCidrs(String... disallowedCidrs) {
        if (this.disallowedCidrs == null) {
            setDisallowedCidrs(new com.amazonaws.internal.SdkInternalList<String>(disallowedCidrs.length));
        }
        for (String ele : disallowedCidrs) {
            this.disallowedCidrs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Exclude a particular CIDR range from being returned by the pool. Disallowed CIDRs are only allowed if using
     * netmask length for allocation.
     * </p>
     * 
     * @param disallowedCidrs
     *        Exclude a particular CIDR range from being returned by the pool. Disallowed CIDRs are only allowed if
     *        using netmask length for allocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllocateIpamPoolCidrRequest withDisallowedCidrs(java.util.Collection<String> disallowedCidrs) {
        setDisallowedCidrs(disallowedCidrs);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AllocateIpamPoolCidrRequest> getDryRunRequest() {
        Request<AllocateIpamPoolCidrRequest> request = new AllocateIpamPoolCidrRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getIpamPoolId() != null)
            sb.append("IpamPoolId: ").append(getIpamPoolId()).append(",");
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getNetmaskLength() != null)
            sb.append("NetmaskLength: ").append(getNetmaskLength()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPreviewNextCidr() != null)
            sb.append("PreviewNextCidr: ").append(getPreviewNextCidr()).append(",");
        if (getDisallowedCidrs() != null)
            sb.append("DisallowedCidrs: ").append(getDisallowedCidrs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateIpamPoolCidrRequest == false)
            return false;
        AllocateIpamPoolCidrRequest other = (AllocateIpamPoolCidrRequest) obj;
        if (other.getIpamPoolId() == null ^ this.getIpamPoolId() == null)
            return false;
        if (other.getIpamPoolId() != null && other.getIpamPoolId().equals(this.getIpamPoolId()) == false)
            return false;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getNetmaskLength() == null ^ this.getNetmaskLength() == null)
            return false;
        if (other.getNetmaskLength() != null && other.getNetmaskLength().equals(this.getNetmaskLength()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPreviewNextCidr() == null ^ this.getPreviewNextCidr() == null)
            return false;
        if (other.getPreviewNextCidr() != null && other.getPreviewNextCidr().equals(this.getPreviewNextCidr()) == false)
            return false;
        if (other.getDisallowedCidrs() == null ^ this.getDisallowedCidrs() == null)
            return false;
        if (other.getDisallowedCidrs() != null && other.getDisallowedCidrs().equals(this.getDisallowedCidrs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamPoolId() == null) ? 0 : getIpamPoolId().hashCode());
        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getNetmaskLength() == null) ? 0 : getNetmaskLength().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPreviewNextCidr() == null) ? 0 : getPreviewNextCidr().hashCode());
        hashCode = prime * hashCode + ((getDisallowedCidrs() == null) ? 0 : getDisallowedCidrs().hashCode());
        return hashCode;
    }

    @Override
    public AllocateIpamPoolCidrRequest clone() {
        return (AllocateIpamPoolCidrRequest) super.clone();
    }
}
