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
import com.amazonaws.services.ec2.model.transform.DeleteIpamRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteIpamRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteIpamRequest> {

    /**
     * <p>
     * The ID of the IPAM to delete.
     * </p>
     */
    private String ipamId;
    /**
     * <p>
     * Enables you to quickly delete an IPAM, private scopes, pools in private scopes, and any allocations in the pools
     * in private scopes. You cannot delete the IPAM with this option if there is a pool in your public scope. If you
     * use this option, IPAM does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deallocates any CIDRs allocated to VPC resources (such as VPCs) in pools in private scopes.
     * </p>
     * <note>
     * <p>
     * No VPC resources are deleted as a result of enabling this option. The CIDR associated with the resource will no
     * longer be allocated from an IPAM pool, but the CIDR itself will remain unchanged.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Deprovisions all IPv4 CIDRs provisioned to IPAM pools in private scopes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes all IPAM pools in private scopes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes all non-default private scopes in the IPAM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes the default public and private scopes and the IPAM.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean cascade;

    /**
     * <p>
     * The ID of the IPAM to delete.
     * </p>
     * 
     * @param ipamId
     *        The ID of the IPAM to delete.
     */

    public void setIpamId(String ipamId) {
        this.ipamId = ipamId;
    }

    /**
     * <p>
     * The ID of the IPAM to delete.
     * </p>
     * 
     * @return The ID of the IPAM to delete.
     */

    public String getIpamId() {
        return this.ipamId;
    }

    /**
     * <p>
     * The ID of the IPAM to delete.
     * </p>
     * 
     * @param ipamId
     *        The ID of the IPAM to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIpamRequest withIpamId(String ipamId) {
        setIpamId(ipamId);
        return this;
    }

    /**
     * <p>
     * Enables you to quickly delete an IPAM, private scopes, pools in private scopes, and any allocations in the pools
     * in private scopes. You cannot delete the IPAM with this option if there is a pool in your public scope. If you
     * use this option, IPAM does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deallocates any CIDRs allocated to VPC resources (such as VPCs) in pools in private scopes.
     * </p>
     * <note>
     * <p>
     * No VPC resources are deleted as a result of enabling this option. The CIDR associated with the resource will no
     * longer be allocated from an IPAM pool, but the CIDR itself will remain unchanged.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Deprovisions all IPv4 CIDRs provisioned to IPAM pools in private scopes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes all IPAM pools in private scopes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes all non-default private scopes in the IPAM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes the default public and private scopes and the IPAM.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cascade
     *        Enables you to quickly delete an IPAM, private scopes, pools in private scopes, and any allocations in the
     *        pools in private scopes. You cannot delete the IPAM with this option if there is a pool in your public
     *        scope. If you use this option, IPAM does the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Deallocates any CIDRs allocated to VPC resources (such as VPCs) in pools in private scopes.
     *        </p>
     *        <note>
     *        <p>
     *        No VPC resources are deleted as a result of enabling this option. The CIDR associated with the resource
     *        will no longer be allocated from an IPAM pool, but the CIDR itself will remain unchanged.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        Deprovisions all IPv4 CIDRs provisioned to IPAM pools in private scopes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deletes all IPAM pools in private scopes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deletes all non-default private scopes in the IPAM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deletes the default public and private scopes and the IPAM.
     *        </p>
     *        </li>
     */

    public void setCascade(Boolean cascade) {
        this.cascade = cascade;
    }

    /**
     * <p>
     * Enables you to quickly delete an IPAM, private scopes, pools in private scopes, and any allocations in the pools
     * in private scopes. You cannot delete the IPAM with this option if there is a pool in your public scope. If you
     * use this option, IPAM does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deallocates any CIDRs allocated to VPC resources (such as VPCs) in pools in private scopes.
     * </p>
     * <note>
     * <p>
     * No VPC resources are deleted as a result of enabling this option. The CIDR associated with the resource will no
     * longer be allocated from an IPAM pool, but the CIDR itself will remain unchanged.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Deprovisions all IPv4 CIDRs provisioned to IPAM pools in private scopes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes all IPAM pools in private scopes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes all non-default private scopes in the IPAM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes the default public and private scopes and the IPAM.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Enables you to quickly delete an IPAM, private scopes, pools in private scopes, and any allocations in
     *         the pools in private scopes. You cannot delete the IPAM with this option if there is a pool in your
     *         public scope. If you use this option, IPAM does the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Deallocates any CIDRs allocated to VPC resources (such as VPCs) in pools in private scopes.
     *         </p>
     *         <note>
     *         <p>
     *         No VPC resources are deleted as a result of enabling this option. The CIDR associated with the resource
     *         will no longer be allocated from an IPAM pool, but the CIDR itself will remain unchanged.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         Deprovisions all IPv4 CIDRs provisioned to IPAM pools in private scopes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Deletes all IPAM pools in private scopes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Deletes all non-default private scopes in the IPAM.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Deletes the default public and private scopes and the IPAM.
     *         </p>
     *         </li>
     */

    public Boolean getCascade() {
        return this.cascade;
    }

    /**
     * <p>
     * Enables you to quickly delete an IPAM, private scopes, pools in private scopes, and any allocations in the pools
     * in private scopes. You cannot delete the IPAM with this option if there is a pool in your public scope. If you
     * use this option, IPAM does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deallocates any CIDRs allocated to VPC resources (such as VPCs) in pools in private scopes.
     * </p>
     * <note>
     * <p>
     * No VPC resources are deleted as a result of enabling this option. The CIDR associated with the resource will no
     * longer be allocated from an IPAM pool, but the CIDR itself will remain unchanged.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Deprovisions all IPv4 CIDRs provisioned to IPAM pools in private scopes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes all IPAM pools in private scopes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes all non-default private scopes in the IPAM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes the default public and private scopes and the IPAM.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cascade
     *        Enables you to quickly delete an IPAM, private scopes, pools in private scopes, and any allocations in the
     *        pools in private scopes. You cannot delete the IPAM with this option if there is a pool in your public
     *        scope. If you use this option, IPAM does the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Deallocates any CIDRs allocated to VPC resources (such as VPCs) in pools in private scopes.
     *        </p>
     *        <note>
     *        <p>
     *        No VPC resources are deleted as a result of enabling this option. The CIDR associated with the resource
     *        will no longer be allocated from an IPAM pool, but the CIDR itself will remain unchanged.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        Deprovisions all IPv4 CIDRs provisioned to IPAM pools in private scopes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deletes all IPAM pools in private scopes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deletes all non-default private scopes in the IPAM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deletes the default public and private scopes and the IPAM.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIpamRequest withCascade(Boolean cascade) {
        setCascade(cascade);
        return this;
    }

    /**
     * <p>
     * Enables you to quickly delete an IPAM, private scopes, pools in private scopes, and any allocations in the pools
     * in private scopes. You cannot delete the IPAM with this option if there is a pool in your public scope. If you
     * use this option, IPAM does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deallocates any CIDRs allocated to VPC resources (such as VPCs) in pools in private scopes.
     * </p>
     * <note>
     * <p>
     * No VPC resources are deleted as a result of enabling this option. The CIDR associated with the resource will no
     * longer be allocated from an IPAM pool, but the CIDR itself will remain unchanged.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * Deprovisions all IPv4 CIDRs provisioned to IPAM pools in private scopes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes all IPAM pools in private scopes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes all non-default private scopes in the IPAM.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes the default public and private scopes and the IPAM.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Enables you to quickly delete an IPAM, private scopes, pools in private scopes, and any allocations in
     *         the pools in private scopes. You cannot delete the IPAM with this option if there is a pool in your
     *         public scope. If you use this option, IPAM does the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Deallocates any CIDRs allocated to VPC resources (such as VPCs) in pools in private scopes.
     *         </p>
     *         <note>
     *         <p>
     *         No VPC resources are deleted as a result of enabling this option. The CIDR associated with the resource
     *         will no longer be allocated from an IPAM pool, but the CIDR itself will remain unchanged.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         Deprovisions all IPv4 CIDRs provisioned to IPAM pools in private scopes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Deletes all IPAM pools in private scopes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Deletes all non-default private scopes in the IPAM.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Deletes the default public and private scopes and the IPAM.
     *         </p>
     *         </li>
     */

    public Boolean isCascade() {
        return this.cascade;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteIpamRequest> getDryRunRequest() {
        Request<DeleteIpamRequest> request = new DeleteIpamRequestMarshaller().marshall(this);
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
        if (getIpamId() != null)
            sb.append("IpamId: ").append(getIpamId()).append(",");
        if (getCascade() != null)
            sb.append("Cascade: ").append(getCascade());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIpamRequest == false)
            return false;
        DeleteIpamRequest other = (DeleteIpamRequest) obj;
        if (other.getIpamId() == null ^ this.getIpamId() == null)
            return false;
        if (other.getIpamId() != null && other.getIpamId().equals(this.getIpamId()) == false)
            return false;
        if (other.getCascade() == null ^ this.getCascade() == null)
            return false;
        if (other.getCascade() != null && other.getCascade().equals(this.getCascade()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamId() == null) ? 0 : getIpamId().hashCode());
        hashCode = prime * hashCode + ((getCascade() == null) ? 0 : getCascade().hashCode());
        return hashCode;
    }

    @Override
    public DeleteIpamRequest clone() {
        return (DeleteIpamRequest) super.clone();
    }
}
