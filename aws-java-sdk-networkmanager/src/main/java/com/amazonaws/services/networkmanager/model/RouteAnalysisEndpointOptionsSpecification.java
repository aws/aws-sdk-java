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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a source or a destination.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RouteAnalysisEndpointOptionsSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteAnalysisEndpointOptionsSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the transit gateway attachment.
     * </p>
     */
    private String transitGatewayAttachmentArn;
    /**
     * <p>
     * The IP address.
     * </p>
     */
    private String ipAddress;

    /**
     * <p>
     * The ARN of the transit gateway attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentArn
     *        The ARN of the transit gateway attachment.
     */

    public void setTransitGatewayAttachmentArn(String transitGatewayAttachmentArn) {
        this.transitGatewayAttachmentArn = transitGatewayAttachmentArn;
    }

    /**
     * <p>
     * The ARN of the transit gateway attachment.
     * </p>
     * 
     * @return The ARN of the transit gateway attachment.
     */

    public String getTransitGatewayAttachmentArn() {
        return this.transitGatewayAttachmentArn;
    }

    /**
     * <p>
     * The ARN of the transit gateway attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentArn
     *        The ARN of the transit gateway attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysisEndpointOptionsSpecification withTransitGatewayAttachmentArn(String transitGatewayAttachmentArn) {
        setTransitGatewayAttachmentArn(transitGatewayAttachmentArn);
        return this;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param ipAddress
     *        The IP address.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @return The IP address.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address.
     * </p>
     * 
     * @param ipAddress
     *        The IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysisEndpointOptionsSpecification withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
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
        if (getTransitGatewayAttachmentArn() != null)
            sb.append("TransitGatewayAttachmentArn: ").append(getTransitGatewayAttachmentArn()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteAnalysisEndpointOptionsSpecification == false)
            return false;
        RouteAnalysisEndpointOptionsSpecification other = (RouteAnalysisEndpointOptionsSpecification) obj;
        if (other.getTransitGatewayAttachmentArn() == null ^ this.getTransitGatewayAttachmentArn() == null)
            return false;
        if (other.getTransitGatewayAttachmentArn() != null && other.getTransitGatewayAttachmentArn().equals(this.getTransitGatewayAttachmentArn()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayAttachmentArn() == null) ? 0 : getTransitGatewayAttachmentArn().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public RouteAnalysisEndpointOptionsSpecification clone() {
        try {
            return (RouteAnalysisEndpointOptionsSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.RouteAnalysisEndpointOptionsSpecificationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
