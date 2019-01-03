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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ExportTransitGatewayRoutesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportTransitGatewayRoutesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ExportTransitGatewayRoutesRequest> {

    /**
     * <p>
     * The ID of the route table.
     * </p>
     */
    private String transitGatewayRouteTableId;
    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>transit-gateway-route-destination-cidr-block</code> - The CIDR range.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-state</code> - The state of the route (<code>active</code> | <code>blackhole</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-transit-gateway-attachment-id</code> - The ID of the attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-type</code> - The route type (<code>static</code> | <code>propagated</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-vpn-connection-id</code> - The ID of the VPN connection.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     */
    private String s3Bucket;

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the route table.
     */

    public void setTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @return The ID of the route table.
     */

    public String getTransitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTransitGatewayRoutesRequest withTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        setTransitGatewayRouteTableId(transitGatewayRouteTableId);
        return this;
    }

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>transit-gateway-route-destination-cidr-block</code> - The CIDR range.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-state</code> - The state of the route (<code>active</code> | <code>blackhole</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-transit-gateway-attachment-id</code> - The ID of the attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-type</code> - The route type (<code>static</code> | <code>propagated</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-vpn-connection-id</code> - The ID of the VPN connection.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters. The possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>transit-gateway-route-destination-cidr-block</code> - The CIDR range.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>transit-gateway-route-state</code> - The state of the route (<code>active</code> |
     *         <code>blackhole</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>transit-gateway-route-transit-gateway-attachment-id</code> - The ID of the attachment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>transit-gateway-route-type</code> - The route type (<code>static</code> | <code>propagated</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>transit-gateway-route-vpn-connection-id</code> - The ID of the VPN connection.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>transit-gateway-route-destination-cidr-block</code> - The CIDR range.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-state</code> - The state of the route (<code>active</code> | <code>blackhole</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-transit-gateway-attachment-id</code> - The ID of the attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-type</code> - The route type (<code>static</code> | <code>propagated</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-vpn-connection-id</code> - The ID of the VPN connection.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-destination-cidr-block</code> - The CIDR range.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-state</code> - The state of the route (<code>active</code> |
     *        <code>blackhole</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-transit-gateway-attachment-id</code> - The ID of the attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-type</code> - The route type (<code>static</code> | <code>propagated</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-vpn-connection-id</code> - The ID of the VPN connection.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>transit-gateway-route-destination-cidr-block</code> - The CIDR range.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-state</code> - The state of the route (<code>active</code> | <code>blackhole</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-transit-gateway-attachment-id</code> - The ID of the attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-type</code> - The route type (<code>static</code> | <code>propagated</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-vpn-connection-id</code> - The ID of the VPN connection.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-destination-cidr-block</code> - The CIDR range.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-state</code> - The state of the route (<code>active</code> |
     *        <code>blackhole</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-transit-gateway-attachment-id</code> - The ID of the attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-type</code> - The route type (<code>static</code> | <code>propagated</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-vpn-connection-id</code> - The ID of the VPN connection.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTransitGatewayRoutesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>transit-gateway-route-destination-cidr-block</code> - The CIDR range.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-state</code> - The state of the route (<code>active</code> | <code>blackhole</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-transit-gateway-attachment-id</code> - The ID of the attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-type</code> - The route type (<code>static</code> | <code>propagated</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-route-vpn-connection-id</code> - The ID of the VPN connection.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-destination-cidr-block</code> - The CIDR range.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-state</code> - The state of the route (<code>active</code> |
     *        <code>blackhole</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-transit-gateway-attachment-id</code> - The ID of the attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-type</code> - The route type (<code>static</code> | <code>propagated</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-route-vpn-connection-id</code> - The ID of the VPN connection.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTransitGatewayRoutesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the S3 bucket.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @return The name of the S3 bucket.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTransitGatewayRoutesRequest withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ExportTransitGatewayRoutesRequest> getDryRunRequest() {
        Request<ExportTransitGatewayRoutesRequest> request = new ExportTransitGatewayRoutesRequestMarshaller().marshall(this);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTransitGatewayRoutesRequest == false)
            return false;
        ExportTransitGatewayRoutesRequest other = (ExportTransitGatewayRoutesRequest) obj;
        if (other.getTransitGatewayRouteTableId() == null ^ this.getTransitGatewayRouteTableId() == null)
            return false;
        if (other.getTransitGatewayRouteTableId() != null && other.getTransitGatewayRouteTableId().equals(this.getTransitGatewayRouteTableId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayRouteTableId() == null) ? 0 : getTransitGatewayRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        return hashCode;
    }

    @Override
    public ExportTransitGatewayRoutesRequest clone() {
        return (ExportTransitGatewayRoutesRequest) super.clone();
    }
}
