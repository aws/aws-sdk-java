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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkRoutes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNetworkRoutesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the route table.
     * </p>
     */
    private String routeTableArn;
    /**
     * <p>
     * Describes a core network segment edge.
     * </p>
     */
    private CoreNetworkSegmentEdgeIdentifier coreNetworkSegmentEdge;
    /**
     * <p>
     * The route table type.
     * </p>
     */
    private String routeTableType;
    /**
     * <p>
     * The route table creation time.
     * </p>
     */
    private java.util.Date routeTableTimestamp;
    /**
     * <p>
     * The network routes.
     * </p>
     */
    private java.util.List<NetworkRoute> networkRoutes;

    /**
     * <p>
     * The ARN of the route table.
     * </p>
     * 
     * @param routeTableArn
     *        The ARN of the route table.
     */

    public void setRouteTableArn(String routeTableArn) {
        this.routeTableArn = routeTableArn;
    }

    /**
     * <p>
     * The ARN of the route table.
     * </p>
     * 
     * @return The ARN of the route table.
     */

    public String getRouteTableArn() {
        return this.routeTableArn;
    }

    /**
     * <p>
     * The ARN of the route table.
     * </p>
     * 
     * @param routeTableArn
     *        The ARN of the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesResult withRouteTableArn(String routeTableArn) {
        setRouteTableArn(routeTableArn);
        return this;
    }

    /**
     * <p>
     * Describes a core network segment edge.
     * </p>
     * 
     * @param coreNetworkSegmentEdge
     *        Describes a core network segment edge.
     */

    public void setCoreNetworkSegmentEdge(CoreNetworkSegmentEdgeIdentifier coreNetworkSegmentEdge) {
        this.coreNetworkSegmentEdge = coreNetworkSegmentEdge;
    }

    /**
     * <p>
     * Describes a core network segment edge.
     * </p>
     * 
     * @return Describes a core network segment edge.
     */

    public CoreNetworkSegmentEdgeIdentifier getCoreNetworkSegmentEdge() {
        return this.coreNetworkSegmentEdge;
    }

    /**
     * <p>
     * Describes a core network segment edge.
     * </p>
     * 
     * @param coreNetworkSegmentEdge
     *        Describes a core network segment edge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesResult withCoreNetworkSegmentEdge(CoreNetworkSegmentEdgeIdentifier coreNetworkSegmentEdge) {
        setCoreNetworkSegmentEdge(coreNetworkSegmentEdge);
        return this;
    }

    /**
     * <p>
     * The route table type.
     * </p>
     * 
     * @param routeTableType
     *        The route table type.
     * @see RouteTableType
     */

    public void setRouteTableType(String routeTableType) {
        this.routeTableType = routeTableType;
    }

    /**
     * <p>
     * The route table type.
     * </p>
     * 
     * @return The route table type.
     * @see RouteTableType
     */

    public String getRouteTableType() {
        return this.routeTableType;
    }

    /**
     * <p>
     * The route table type.
     * </p>
     * 
     * @param routeTableType
     *        The route table type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteTableType
     */

    public GetNetworkRoutesResult withRouteTableType(String routeTableType) {
        setRouteTableType(routeTableType);
        return this;
    }

    /**
     * <p>
     * The route table type.
     * </p>
     * 
     * @param routeTableType
     *        The route table type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteTableType
     */

    public GetNetworkRoutesResult withRouteTableType(RouteTableType routeTableType) {
        this.routeTableType = routeTableType.toString();
        return this;
    }

    /**
     * <p>
     * The route table creation time.
     * </p>
     * 
     * @param routeTableTimestamp
     *        The route table creation time.
     */

    public void setRouteTableTimestamp(java.util.Date routeTableTimestamp) {
        this.routeTableTimestamp = routeTableTimestamp;
    }

    /**
     * <p>
     * The route table creation time.
     * </p>
     * 
     * @return The route table creation time.
     */

    public java.util.Date getRouteTableTimestamp() {
        return this.routeTableTimestamp;
    }

    /**
     * <p>
     * The route table creation time.
     * </p>
     * 
     * @param routeTableTimestamp
     *        The route table creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesResult withRouteTableTimestamp(java.util.Date routeTableTimestamp) {
        setRouteTableTimestamp(routeTableTimestamp);
        return this;
    }

    /**
     * <p>
     * The network routes.
     * </p>
     * 
     * @return The network routes.
     */

    public java.util.List<NetworkRoute> getNetworkRoutes() {
        return networkRoutes;
    }

    /**
     * <p>
     * The network routes.
     * </p>
     * 
     * @param networkRoutes
     *        The network routes.
     */

    public void setNetworkRoutes(java.util.Collection<NetworkRoute> networkRoutes) {
        if (networkRoutes == null) {
            this.networkRoutes = null;
            return;
        }

        this.networkRoutes = new java.util.ArrayList<NetworkRoute>(networkRoutes);
    }

    /**
     * <p>
     * The network routes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkRoutes(java.util.Collection)} or {@link #withNetworkRoutes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param networkRoutes
     *        The network routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesResult withNetworkRoutes(NetworkRoute... networkRoutes) {
        if (this.networkRoutes == null) {
            setNetworkRoutes(new java.util.ArrayList<NetworkRoute>(networkRoutes.length));
        }
        for (NetworkRoute ele : networkRoutes) {
            this.networkRoutes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network routes.
     * </p>
     * 
     * @param networkRoutes
     *        The network routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkRoutesResult withNetworkRoutes(java.util.Collection<NetworkRoute> networkRoutes) {
        setNetworkRoutes(networkRoutes);
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
        if (getRouteTableArn() != null)
            sb.append("RouteTableArn: ").append(getRouteTableArn()).append(",");
        if (getCoreNetworkSegmentEdge() != null)
            sb.append("CoreNetworkSegmentEdge: ").append(getCoreNetworkSegmentEdge()).append(",");
        if (getRouteTableType() != null)
            sb.append("RouteTableType: ").append(getRouteTableType()).append(",");
        if (getRouteTableTimestamp() != null)
            sb.append("RouteTableTimestamp: ").append(getRouteTableTimestamp()).append(",");
        if (getNetworkRoutes() != null)
            sb.append("NetworkRoutes: ").append(getNetworkRoutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetNetworkRoutesResult == false)
            return false;
        GetNetworkRoutesResult other = (GetNetworkRoutesResult) obj;
        if (other.getRouteTableArn() == null ^ this.getRouteTableArn() == null)
            return false;
        if (other.getRouteTableArn() != null && other.getRouteTableArn().equals(this.getRouteTableArn()) == false)
            return false;
        if (other.getCoreNetworkSegmentEdge() == null ^ this.getCoreNetworkSegmentEdge() == null)
            return false;
        if (other.getCoreNetworkSegmentEdge() != null && other.getCoreNetworkSegmentEdge().equals(this.getCoreNetworkSegmentEdge()) == false)
            return false;
        if (other.getRouteTableType() == null ^ this.getRouteTableType() == null)
            return false;
        if (other.getRouteTableType() != null && other.getRouteTableType().equals(this.getRouteTableType()) == false)
            return false;
        if (other.getRouteTableTimestamp() == null ^ this.getRouteTableTimestamp() == null)
            return false;
        if (other.getRouteTableTimestamp() != null && other.getRouteTableTimestamp().equals(this.getRouteTableTimestamp()) == false)
            return false;
        if (other.getNetworkRoutes() == null ^ this.getNetworkRoutes() == null)
            return false;
        if (other.getNetworkRoutes() != null && other.getNetworkRoutes().equals(this.getNetworkRoutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRouteTableArn() == null) ? 0 : getRouteTableArn().hashCode());
        hashCode = prime * hashCode + ((getCoreNetworkSegmentEdge() == null) ? 0 : getCoreNetworkSegmentEdge().hashCode());
        hashCode = prime * hashCode + ((getRouteTableType() == null) ? 0 : getRouteTableType().hashCode());
        hashCode = prime * hashCode + ((getRouteTableTimestamp() == null) ? 0 : getRouteTableTimestamp().hashCode());
        hashCode = prime * hashCode + ((getNetworkRoutes() == null) ? 0 : getNetworkRoutes().hashCode());
        return hashCode;
    }

    @Override
    public GetNetworkRoutesResult clone() {
        try {
            return (GetNetworkRoutesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
