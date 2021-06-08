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
import com.amazonaws.services.ec2.model.transform.ModifyTransitGatewayPrefixListReferenceRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTransitGatewayPrefixListReferenceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyTransitGatewayPrefixListReferenceRequest> {

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     */
    private String transitGatewayRouteTableId;
    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     */
    private String prefixListId;
    /**
     * <p>
     * The ID of the attachment to which traffic is routed.
     * </p>
     */
    private String transitGatewayAttachmentId;
    /**
     * <p>
     * Indicates whether to drop traffic that matches this route.
     * </p>
     */
    private Boolean blackhole;

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the transit gateway route table.
     */

    public void setTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * 
     * @return The ID of the transit gateway route table.
     */

    public String getTransitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the transit gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTransitGatewayPrefixListReferenceRequest withTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        setTransitGatewayRouteTableId(transitGatewayRouteTableId);
        return this;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     */

    public void setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @return The ID of the prefix list.
     */

    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix list.
     * </p>
     * 
     * @param prefixListId
     *        The ID of the prefix list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTransitGatewayPrefixListReferenceRequest withPrefixListId(String prefixListId) {
        setPrefixListId(prefixListId);
        return this;
    }

    /**
     * <p>
     * The ID of the attachment to which traffic is routed.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the attachment to which traffic is routed.
     */

    public void setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment to which traffic is routed.
     * </p>
     * 
     * @return The ID of the attachment to which traffic is routed.
     */

    public String getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment to which traffic is routed.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the attachment to which traffic is routed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTransitGatewayPrefixListReferenceRequest withTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        setTransitGatewayAttachmentId(transitGatewayAttachmentId);
        return this;
    }

    /**
     * <p>
     * Indicates whether to drop traffic that matches this route.
     * </p>
     * 
     * @param blackhole
     *        Indicates whether to drop traffic that matches this route.
     */

    public void setBlackhole(Boolean blackhole) {
        this.blackhole = blackhole;
    }

    /**
     * <p>
     * Indicates whether to drop traffic that matches this route.
     * </p>
     * 
     * @return Indicates whether to drop traffic that matches this route.
     */

    public Boolean getBlackhole() {
        return this.blackhole;
    }

    /**
     * <p>
     * Indicates whether to drop traffic that matches this route.
     * </p>
     * 
     * @param blackhole
     *        Indicates whether to drop traffic that matches this route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTransitGatewayPrefixListReferenceRequest withBlackhole(Boolean blackhole) {
        setBlackhole(blackhole);
        return this;
    }

    /**
     * <p>
     * Indicates whether to drop traffic that matches this route.
     * </p>
     * 
     * @return Indicates whether to drop traffic that matches this route.
     */

    public Boolean isBlackhole() {
        return this.blackhole;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyTransitGatewayPrefixListReferenceRequest> getDryRunRequest() {
        Request<ModifyTransitGatewayPrefixListReferenceRequest> request = new ModifyTransitGatewayPrefixListReferenceRequestMarshaller().marshall(this);
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
        if (getTransitGatewayRouteTableId() != null)
            sb.append("TransitGatewayRouteTableId: ").append(getTransitGatewayRouteTableId()).append(",");
        if (getPrefixListId() != null)
            sb.append("PrefixListId: ").append(getPrefixListId()).append(",");
        if (getTransitGatewayAttachmentId() != null)
            sb.append("TransitGatewayAttachmentId: ").append(getTransitGatewayAttachmentId()).append(",");
        if (getBlackhole() != null)
            sb.append("Blackhole: ").append(getBlackhole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTransitGatewayPrefixListReferenceRequest == false)
            return false;
        ModifyTransitGatewayPrefixListReferenceRequest other = (ModifyTransitGatewayPrefixListReferenceRequest) obj;
        if (other.getTransitGatewayRouteTableId() == null ^ this.getTransitGatewayRouteTableId() == null)
            return false;
        if (other.getTransitGatewayRouteTableId() != null && other.getTransitGatewayRouteTableId().equals(this.getTransitGatewayRouteTableId()) == false)
            return false;
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null)
            return false;
        if (other.getPrefixListId() != null && other.getPrefixListId().equals(this.getPrefixListId()) == false)
            return false;
        if (other.getTransitGatewayAttachmentId() == null ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null && other.getTransitGatewayAttachmentId().equals(this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getBlackhole() == null ^ this.getBlackhole() == null)
            return false;
        if (other.getBlackhole() != null && other.getBlackhole().equals(this.getBlackhole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayRouteTableId() == null) ? 0 : getTransitGatewayRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayAttachmentId() == null) ? 0 : getTransitGatewayAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getBlackhole() == null) ? 0 : getBlackhole().hashCode());
        return hashCode;
    }

    @Override
    public ModifyTransitGatewayPrefixListReferenceRequest clone() {
        return (ModifyTransitGatewayPrefixListReferenceRequest) super.clone();
    }
}
