/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.AssociateTransitGatewayMulticastDomainRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateTransitGatewayMulticastDomainRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<AssociateTransitGatewayMulticastDomainRequest> {

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     */
    private String transitGatewayMulticastDomainId;
    /**
     * <p>
     * The ID of the transit gateway attachment to associate with the transit gateway multicast domain.
     * </p>
     */
    private String transitGatewayAttachmentId;
    /**
     * <p>
     * The IDs of the subnets to associate with the transit gateway multicast domain.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * 
     * @param transitGatewayMulticastDomainId
     *        The ID of the transit gateway multicast domain.
     */

    public void setTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
        this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * 
     * @return The ID of the transit gateway multicast domain.
     */

    public String getTransitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * 
     * @param transitGatewayMulticastDomainId
     *        The ID of the transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTransitGatewayMulticastDomainRequest withTransitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
        setTransitGatewayMulticastDomainId(transitGatewayMulticastDomainId);
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment to associate with the transit gateway multicast domain.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the transit gateway attachment to associate with the transit gateway multicast domain.
     */

    public void setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment to associate with the transit gateway multicast domain.
     * </p>
     * 
     * @return The ID of the transit gateway attachment to associate with the transit gateway multicast domain.
     */

    public String getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment to associate with the transit gateway multicast domain.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the transit gateway attachment to associate with the transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTransitGatewayMulticastDomainRequest withTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        setTransitGatewayAttachmentId(transitGatewayAttachmentId);
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets to associate with the transit gateway multicast domain.
     * </p>
     * 
     * @return The IDs of the subnets to associate with the transit gateway multicast domain.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * The IDs of the subnets to associate with the transit gateway multicast domain.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of the subnets to associate with the transit gateway multicast domain.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * The IDs of the subnets to associate with the transit gateway multicast domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of the subnets to associate with the transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTransitGatewayMulticastDomainRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets to associate with the transit gateway multicast domain.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of the subnets to associate with the transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateTransitGatewayMulticastDomainRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AssociateTransitGatewayMulticastDomainRequest> getDryRunRequest() {
        Request<AssociateTransitGatewayMulticastDomainRequest> request = new AssociateTransitGatewayMulticastDomainRequestMarshaller().marshall(this);
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
        if (getTransitGatewayMulticastDomainId() != null)
            sb.append("TransitGatewayMulticastDomainId: ").append(getTransitGatewayMulticastDomainId()).append(",");
        if (getTransitGatewayAttachmentId() != null)
            sb.append("TransitGatewayAttachmentId: ").append(getTransitGatewayAttachmentId()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateTransitGatewayMulticastDomainRequest == false)
            return false;
        AssociateTransitGatewayMulticastDomainRequest other = (AssociateTransitGatewayMulticastDomainRequest) obj;
        if (other.getTransitGatewayMulticastDomainId() == null ^ this.getTransitGatewayMulticastDomainId() == null)
            return false;
        if (other.getTransitGatewayMulticastDomainId() != null
                && other.getTransitGatewayMulticastDomainId().equals(this.getTransitGatewayMulticastDomainId()) == false)
            return false;
        if (other.getTransitGatewayAttachmentId() == null ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null && other.getTransitGatewayAttachmentId().equals(this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayMulticastDomainId() == null) ? 0 : getTransitGatewayMulticastDomainId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayAttachmentId() == null) ? 0 : getTransitGatewayAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public AssociateTransitGatewayMulticastDomainRequest clone() {
        return (AssociateTransitGatewayMulticastDomainRequest) super.clone();
    }
}
