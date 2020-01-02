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
import com.amazonaws.services.ec2.model.transform.CreateLocalGatewayRouteRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocalGatewayRouteRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateLocalGatewayRouteRequest> {

    /**
     * <p>
     * The CIDR range used for destination matches. Routing decisions are based on the most specific match.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     */
    private String localGatewayRouteTableId;
    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     */
    private String localGatewayVirtualInterfaceGroupId;

    /**
     * <p>
     * The CIDR range used for destination matches. Routing decisions are based on the most specific match.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR range used for destination matches. Routing decisions are based on the most specific match.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR range used for destination matches. Routing decisions are based on the most specific match.
     * </p>
     * 
     * @return The CIDR range used for destination matches. Routing decisions are based on the most specific match.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR range used for destination matches. Routing decisions are based on the most specific match.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR range used for destination matches. Routing decisions are based on the most specific match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocalGatewayRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     */

    public void setLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @return The ID of the local gateway route table.
     */

    public String getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocalGatewayRouteRequest withLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        setLocalGatewayRouteTableId(localGatewayRouteTableId);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceGroupId
     *        The ID of the virtual interface group.
     */

    public void setLocalGatewayVirtualInterfaceGroupId(String localGatewayVirtualInterfaceGroupId) {
        this.localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     * 
     * @return The ID of the virtual interface group.
     */

    public String getLocalGatewayVirtualInterfaceGroupId() {
        return this.localGatewayVirtualInterfaceGroupId;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceGroupId
     *        The ID of the virtual interface group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocalGatewayRouteRequest withLocalGatewayVirtualInterfaceGroupId(String localGatewayVirtualInterfaceGroupId) {
        setLocalGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateLocalGatewayRouteRequest> getDryRunRequest() {
        Request<CreateLocalGatewayRouteRequest> request = new CreateLocalGatewayRouteRequestMarshaller().marshall(this);
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
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock()).append(",");
        if (getLocalGatewayRouteTableId() != null)
            sb.append("LocalGatewayRouteTableId: ").append(getLocalGatewayRouteTableId()).append(",");
        if (getLocalGatewayVirtualInterfaceGroupId() != null)
            sb.append("LocalGatewayVirtualInterfaceGroupId: ").append(getLocalGatewayVirtualInterfaceGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLocalGatewayRouteRequest == false)
            return false;
        CreateLocalGatewayRouteRequest other = (CreateLocalGatewayRouteRequest) obj;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getLocalGatewayRouteTableId() == null ^ this.getLocalGatewayRouteTableId() == null)
            return false;
        if (other.getLocalGatewayRouteTableId() != null && other.getLocalGatewayRouteTableId().equals(this.getLocalGatewayRouteTableId()) == false)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroupId() == null ^ this.getLocalGatewayVirtualInterfaceGroupId() == null)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroupId() != null
                && other.getLocalGatewayVirtualInterfaceGroupId().equals(this.getLocalGatewayVirtualInterfaceGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayRouteTableId() == null) ? 0 : getLocalGatewayRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayVirtualInterfaceGroupId() == null) ? 0 : getLocalGatewayVirtualInterfaceGroupId().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocalGatewayRouteRequest clone() {
        return (CreateLocalGatewayRouteRequest) super.clone();
    }
}
