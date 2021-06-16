/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.AssociateTrunkInterfaceRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateTrunkInterfaceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<AssociateTrunkInterfaceRequest> {

    /**
     * <p>
     * The ID of the branch network interface.
     * </p>
     */
    private String branchInterfaceId;
    /**
     * <p>
     * The ID of the trunk network interface.
     * </p>
     */
    private String trunkInterfaceId;
    /**
     * <p>
     * The ID of the VLAN. This applies to the VLAN protocol.
     * </p>
     */
    private Integer vlanId;
    /**
     * <p>
     * The application key. This applies to the GRE protocol.
     * </p>
     */
    private Integer greKey;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the branch network interface.
     * </p>
     * 
     * @param branchInterfaceId
     *        The ID of the branch network interface.
     */

    public void setBranchInterfaceId(String branchInterfaceId) {
        this.branchInterfaceId = branchInterfaceId;
    }

    /**
     * <p>
     * The ID of the branch network interface.
     * </p>
     * 
     * @return The ID of the branch network interface.
     */

    public String getBranchInterfaceId() {
        return this.branchInterfaceId;
    }

    /**
     * <p>
     * The ID of the branch network interface.
     * </p>
     * 
     * @param branchInterfaceId
     *        The ID of the branch network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTrunkInterfaceRequest withBranchInterfaceId(String branchInterfaceId) {
        setBranchInterfaceId(branchInterfaceId);
        return this;
    }

    /**
     * <p>
     * The ID of the trunk network interface.
     * </p>
     * 
     * @param trunkInterfaceId
     *        The ID of the trunk network interface.
     */

    public void setTrunkInterfaceId(String trunkInterfaceId) {
        this.trunkInterfaceId = trunkInterfaceId;
    }

    /**
     * <p>
     * The ID of the trunk network interface.
     * </p>
     * 
     * @return The ID of the trunk network interface.
     */

    public String getTrunkInterfaceId() {
        return this.trunkInterfaceId;
    }

    /**
     * <p>
     * The ID of the trunk network interface.
     * </p>
     * 
     * @param trunkInterfaceId
     *        The ID of the trunk network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTrunkInterfaceRequest withTrunkInterfaceId(String trunkInterfaceId) {
        setTrunkInterfaceId(trunkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The ID of the VLAN. This applies to the VLAN protocol.
     * </p>
     * 
     * @param vlanId
     *        The ID of the VLAN. This applies to the VLAN protocol.
     */

    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    /**
     * <p>
     * The ID of the VLAN. This applies to the VLAN protocol.
     * </p>
     * 
     * @return The ID of the VLAN. This applies to the VLAN protocol.
     */

    public Integer getVlanId() {
        return this.vlanId;
    }

    /**
     * <p>
     * The ID of the VLAN. This applies to the VLAN protocol.
     * </p>
     * 
     * @param vlanId
     *        The ID of the VLAN. This applies to the VLAN protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTrunkInterfaceRequest withVlanId(Integer vlanId) {
        setVlanId(vlanId);
        return this;
    }

    /**
     * <p>
     * The application key. This applies to the GRE protocol.
     * </p>
     * 
     * @param greKey
     *        The application key. This applies to the GRE protocol.
     */

    public void setGreKey(Integer greKey) {
        this.greKey = greKey;
    }

    /**
     * <p>
     * The application key. This applies to the GRE protocol.
     * </p>
     * 
     * @return The application key. This applies to the GRE protocol.
     */

    public Integer getGreKey() {
        return this.greKey;
    }

    /**
     * <p>
     * The application key. This applies to the GRE protocol.
     * </p>
     * 
     * @param greKey
     *        The application key. This applies to the GRE protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTrunkInterfaceRequest withGreKey(Integer greKey) {
        setGreKey(greKey);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTrunkInterfaceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AssociateTrunkInterfaceRequest> getDryRunRequest() {
        Request<AssociateTrunkInterfaceRequest> request = new AssociateTrunkInterfaceRequestMarshaller().marshall(this);
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
        if (getBranchInterfaceId() != null)
            sb.append("BranchInterfaceId: ").append(getBranchInterfaceId()).append(",");
        if (getTrunkInterfaceId() != null)
            sb.append("TrunkInterfaceId: ").append(getTrunkInterfaceId()).append(",");
        if (getVlanId() != null)
            sb.append("VlanId: ").append(getVlanId()).append(",");
        if (getGreKey() != null)
            sb.append("GreKey: ").append(getGreKey()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateTrunkInterfaceRequest == false)
            return false;
        AssociateTrunkInterfaceRequest other = (AssociateTrunkInterfaceRequest) obj;
        if (other.getBranchInterfaceId() == null ^ this.getBranchInterfaceId() == null)
            return false;
        if (other.getBranchInterfaceId() != null && other.getBranchInterfaceId().equals(this.getBranchInterfaceId()) == false)
            return false;
        if (other.getTrunkInterfaceId() == null ^ this.getTrunkInterfaceId() == null)
            return false;
        if (other.getTrunkInterfaceId() != null && other.getTrunkInterfaceId().equals(this.getTrunkInterfaceId()) == false)
            return false;
        if (other.getVlanId() == null ^ this.getVlanId() == null)
            return false;
        if (other.getVlanId() != null && other.getVlanId().equals(this.getVlanId()) == false)
            return false;
        if (other.getGreKey() == null ^ this.getGreKey() == null)
            return false;
        if (other.getGreKey() != null && other.getGreKey().equals(this.getGreKey()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranchInterfaceId() == null) ? 0 : getBranchInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getTrunkInterfaceId() == null) ? 0 : getTrunkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getVlanId() == null) ? 0 : getVlanId().hashCode());
        hashCode = prime * hashCode + ((getGreKey() == null) ? 0 : getGreKey().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public AssociateTrunkInterfaceRequest clone() {
        return (AssociateTrunkInterfaceRequest) super.clone();
    }
}
