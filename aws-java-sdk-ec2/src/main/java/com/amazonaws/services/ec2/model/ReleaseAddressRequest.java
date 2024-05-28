/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.ReleaseAddressRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReleaseAddressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ReleaseAddressRequest> {

    /**
     * <p>
     * The allocation ID. This parameter is required.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * Deprecated.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * The set of Availability Zones, Local Zones, or Wavelength Zones from which Amazon Web Services advertises IP
     * addresses.
     * </p>
     * <p>
     * If you provide an incorrect network border group, you receive an <code>InvalidAddress.NotFound</code> error.
     * </p>
     */
    private String networkBorderGroup;

    /**
     * Default constructor for ReleaseAddressRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public ReleaseAddressRequest() {
    }

    /**
     * Constructs a new ReleaseAddressRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param publicIp
     *        Deprecated.
     */
    public ReleaseAddressRequest(String publicIp) {
        setPublicIp(publicIp);
    }

    /**
     * <p>
     * The allocation ID. This parameter is required.
     * </p>
     * 
     * @param allocationId
     *        The allocation ID. This parameter is required.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * The allocation ID. This parameter is required.
     * </p>
     * 
     * @return The allocation ID. This parameter is required.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * The allocation ID. This parameter is required.
     * </p>
     * 
     * @param allocationId
     *        The allocation ID. This parameter is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleaseAddressRequest withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * Deprecated.
     * </p>
     * 
     * @param publicIp
     *        Deprecated.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * Deprecated.
     * </p>
     * 
     * @return Deprecated.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * Deprecated.
     * </p>
     * 
     * @param publicIp
     *        Deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleaseAddressRequest withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * <p>
     * The set of Availability Zones, Local Zones, or Wavelength Zones from which Amazon Web Services advertises IP
     * addresses.
     * </p>
     * <p>
     * If you provide an incorrect network border group, you receive an <code>InvalidAddress.NotFound</code> error.
     * </p>
     * 
     * @param networkBorderGroup
     *        The set of Availability Zones, Local Zones, or Wavelength Zones from which Amazon Web Services advertises
     *        IP addresses.</p>
     *        <p>
     *        If you provide an incorrect network border group, you receive an <code>InvalidAddress.NotFound</code>
     *        error.
     */

    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }

    /**
     * <p>
     * The set of Availability Zones, Local Zones, or Wavelength Zones from which Amazon Web Services advertises IP
     * addresses.
     * </p>
     * <p>
     * If you provide an incorrect network border group, you receive an <code>InvalidAddress.NotFound</code> error.
     * </p>
     * 
     * @return The set of Availability Zones, Local Zones, or Wavelength Zones from which Amazon Web Services advertises
     *         IP addresses.</p>
     *         <p>
     *         If you provide an incorrect network border group, you receive an <code>InvalidAddress.NotFound</code>
     *         error.
     */

    public String getNetworkBorderGroup() {
        return this.networkBorderGroup;
    }

    /**
     * <p>
     * The set of Availability Zones, Local Zones, or Wavelength Zones from which Amazon Web Services advertises IP
     * addresses.
     * </p>
     * <p>
     * If you provide an incorrect network border group, you receive an <code>InvalidAddress.NotFound</code> error.
     * </p>
     * 
     * @param networkBorderGroup
     *        The set of Availability Zones, Local Zones, or Wavelength Zones from which Amazon Web Services advertises
     *        IP addresses.</p>
     *        <p>
     *        If you provide an incorrect network border group, you receive an <code>InvalidAddress.NotFound</code>
     *        error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReleaseAddressRequest withNetworkBorderGroup(String networkBorderGroup) {
        setNetworkBorderGroup(networkBorderGroup);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ReleaseAddressRequest> getDryRunRequest() {
        Request<ReleaseAddressRequest> request = new ReleaseAddressRequestMarshaller().marshall(this);
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
        if (getAllocationId() != null)
            sb.append("AllocationId: ").append(getAllocationId()).append(",");
        if (getPublicIp() != null)
            sb.append("PublicIp: ").append(getPublicIp()).append(",");
        if (getNetworkBorderGroup() != null)
            sb.append("NetworkBorderGroup: ").append(getNetworkBorderGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReleaseAddressRequest == false)
            return false;
        ReleaseAddressRequest other = (ReleaseAddressRequest) obj;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getNetworkBorderGroup() == null ^ this.getNetworkBorderGroup() == null)
            return false;
        if (other.getNetworkBorderGroup() != null && other.getNetworkBorderGroup().equals(this.getNetworkBorderGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
        return hashCode;
    }

    @Override
    public ReleaseAddressRequest clone() {
        return (ReleaseAddressRequest) super.clone();
    }
}
