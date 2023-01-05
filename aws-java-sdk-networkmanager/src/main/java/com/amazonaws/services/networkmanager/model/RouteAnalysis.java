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
 * Describes a route analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RouteAnalysis" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteAnalysis implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The ID of the AWS account that created the route analysis.
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * The ID of the route analysis.
     * </p>
     */
    private String routeAnalysisId;
    /**
     * <p>
     * The time that the analysis started.
     * </p>
     */
    private java.util.Date startTimestamp;
    /**
     * <p>
     * The status of the route analysis.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The source.
     * </p>
     */
    private RouteAnalysisEndpointOptions source;
    /**
     * <p>
     * The destination.
     * </p>
     */
    private RouteAnalysisEndpointOptions destination;
    /**
     * <p>
     * Indicates whether to analyze the return path. The return path is not analyzed if the forward path analysis does
     * not succeed.
     * </p>
     */
    private Boolean includeReturnPath;
    /**
     * <p>
     * Indicates whether to include the location of middlebox appliances in the route analysis.
     * </p>
     */
    private Boolean useMiddleboxes;
    /**
     * <p>
     * The forward path.
     * </p>
     */
    private RouteAnalysisPath forwardPath;
    /**
     * <p>
     * The return path.
     * </p>
     */
    private RouteAnalysisPath returnPath;

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @return The ID of the global network.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysis withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that created the route analysis.
     * </p>
     * 
     * @param ownerAccountId
     *        The ID of the AWS account that created the route analysis.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that created the route analysis.
     * </p>
     * 
     * @return The ID of the AWS account that created the route analysis.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that created the route analysis.
     * </p>
     * 
     * @param ownerAccountId
     *        The ID of the AWS account that created the route analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysis withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the route analysis.
     * </p>
     * 
     * @param routeAnalysisId
     *        The ID of the route analysis.
     */

    public void setRouteAnalysisId(String routeAnalysisId) {
        this.routeAnalysisId = routeAnalysisId;
    }

    /**
     * <p>
     * The ID of the route analysis.
     * </p>
     * 
     * @return The ID of the route analysis.
     */

    public String getRouteAnalysisId() {
        return this.routeAnalysisId;
    }

    /**
     * <p>
     * The ID of the route analysis.
     * </p>
     * 
     * @param routeAnalysisId
     *        The ID of the route analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysis withRouteAnalysisId(String routeAnalysisId) {
        setRouteAnalysisId(routeAnalysisId);
        return this;
    }

    /**
     * <p>
     * The time that the analysis started.
     * </p>
     * 
     * @param startTimestamp
     *        The time that the analysis started.
     */

    public void setStartTimestamp(java.util.Date startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * The time that the analysis started.
     * </p>
     * 
     * @return The time that the analysis started.
     */

    public java.util.Date getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * <p>
     * The time that the analysis started.
     * </p>
     * 
     * @param startTimestamp
     *        The time that the analysis started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysis withStartTimestamp(java.util.Date startTimestamp) {
        setStartTimestamp(startTimestamp);
        return this;
    }

    /**
     * <p>
     * The status of the route analysis.
     * </p>
     * 
     * @param status
     *        The status of the route analysis.
     * @see RouteAnalysisStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the route analysis.
     * </p>
     * 
     * @return The status of the route analysis.
     * @see RouteAnalysisStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the route analysis.
     * </p>
     * 
     * @param status
     *        The status of the route analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteAnalysisStatus
     */

    public RouteAnalysis withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the route analysis.
     * </p>
     * 
     * @param status
     *        The status of the route analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteAnalysisStatus
     */

    public RouteAnalysis withStatus(RouteAnalysisStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The source.
     * </p>
     * 
     * @param source
     *        The source.
     */

    public void setSource(RouteAnalysisEndpointOptions source) {
        this.source = source;
    }

    /**
     * <p>
     * The source.
     * </p>
     * 
     * @return The source.
     */

    public RouteAnalysisEndpointOptions getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source.
     * </p>
     * 
     * @param source
     *        The source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysis withSource(RouteAnalysisEndpointOptions source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The destination.
     * </p>
     * 
     * @param destination
     *        The destination.
     */

    public void setDestination(RouteAnalysisEndpointOptions destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination.
     * </p>
     * 
     * @return The destination.
     */

    public RouteAnalysisEndpointOptions getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The destination.
     * </p>
     * 
     * @param destination
     *        The destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysis withDestination(RouteAnalysisEndpointOptions destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * Indicates whether to analyze the return path. The return path is not analyzed if the forward path analysis does
     * not succeed.
     * </p>
     * 
     * @param includeReturnPath
     *        Indicates whether to analyze the return path. The return path is not analyzed if the forward path analysis
     *        does not succeed.
     */

    public void setIncludeReturnPath(Boolean includeReturnPath) {
        this.includeReturnPath = includeReturnPath;
    }

    /**
     * <p>
     * Indicates whether to analyze the return path. The return path is not analyzed if the forward path analysis does
     * not succeed.
     * </p>
     * 
     * @return Indicates whether to analyze the return path. The return path is not analyzed if the forward path
     *         analysis does not succeed.
     */

    public Boolean getIncludeReturnPath() {
        return this.includeReturnPath;
    }

    /**
     * <p>
     * Indicates whether to analyze the return path. The return path is not analyzed if the forward path analysis does
     * not succeed.
     * </p>
     * 
     * @param includeReturnPath
     *        Indicates whether to analyze the return path. The return path is not analyzed if the forward path analysis
     *        does not succeed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysis withIncludeReturnPath(Boolean includeReturnPath) {
        setIncludeReturnPath(includeReturnPath);
        return this;
    }

    /**
     * <p>
     * Indicates whether to analyze the return path. The return path is not analyzed if the forward path analysis does
     * not succeed.
     * </p>
     * 
     * @return Indicates whether to analyze the return path. The return path is not analyzed if the forward path
     *         analysis does not succeed.
     */

    public Boolean isIncludeReturnPath() {
        return this.includeReturnPath;
    }

    /**
     * <p>
     * Indicates whether to include the location of middlebox appliances in the route analysis.
     * </p>
     * 
     * @param useMiddleboxes
     *        Indicates whether to include the location of middlebox appliances in the route analysis.
     */

    public void setUseMiddleboxes(Boolean useMiddleboxes) {
        this.useMiddleboxes = useMiddleboxes;
    }

    /**
     * <p>
     * Indicates whether to include the location of middlebox appliances in the route analysis.
     * </p>
     * 
     * @return Indicates whether to include the location of middlebox appliances in the route analysis.
     */

    public Boolean getUseMiddleboxes() {
        return this.useMiddleboxes;
    }

    /**
     * <p>
     * Indicates whether to include the location of middlebox appliances in the route analysis.
     * </p>
     * 
     * @param useMiddleboxes
     *        Indicates whether to include the location of middlebox appliances in the route analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysis withUseMiddleboxes(Boolean useMiddleboxes) {
        setUseMiddleboxes(useMiddleboxes);
        return this;
    }

    /**
     * <p>
     * Indicates whether to include the location of middlebox appliances in the route analysis.
     * </p>
     * 
     * @return Indicates whether to include the location of middlebox appliances in the route analysis.
     */

    public Boolean isUseMiddleboxes() {
        return this.useMiddleboxes;
    }

    /**
     * <p>
     * The forward path.
     * </p>
     * 
     * @param forwardPath
     *        The forward path.
     */

    public void setForwardPath(RouteAnalysisPath forwardPath) {
        this.forwardPath = forwardPath;
    }

    /**
     * <p>
     * The forward path.
     * </p>
     * 
     * @return The forward path.
     */

    public RouteAnalysisPath getForwardPath() {
        return this.forwardPath;
    }

    /**
     * <p>
     * The forward path.
     * </p>
     * 
     * @param forwardPath
     *        The forward path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysis withForwardPath(RouteAnalysisPath forwardPath) {
        setForwardPath(forwardPath);
        return this;
    }

    /**
     * <p>
     * The return path.
     * </p>
     * 
     * @param returnPath
     *        The return path.
     */

    public void setReturnPath(RouteAnalysisPath returnPath) {
        this.returnPath = returnPath;
    }

    /**
     * <p>
     * The return path.
     * </p>
     * 
     * @return The return path.
     */

    public RouteAnalysisPath getReturnPath() {
        return this.returnPath;
    }

    /**
     * <p>
     * The return path.
     * </p>
     * 
     * @param returnPath
     *        The return path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteAnalysis withReturnPath(RouteAnalysisPath returnPath) {
        setReturnPath(returnPath);
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
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId()).append(",");
        if (getRouteAnalysisId() != null)
            sb.append("RouteAnalysisId: ").append(getRouteAnalysisId()).append(",");
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: ").append(getStartTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getIncludeReturnPath() != null)
            sb.append("IncludeReturnPath: ").append(getIncludeReturnPath()).append(",");
        if (getUseMiddleboxes() != null)
            sb.append("UseMiddleboxes: ").append(getUseMiddleboxes()).append(",");
        if (getForwardPath() != null)
            sb.append("ForwardPath: ").append(getForwardPath()).append(",");
        if (getReturnPath() != null)
            sb.append("ReturnPath: ").append(getReturnPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteAnalysis == false)
            return false;
        RouteAnalysis other = (RouteAnalysis) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        if (other.getRouteAnalysisId() == null ^ this.getRouteAnalysisId() == null)
            return false;
        if (other.getRouteAnalysisId() != null && other.getRouteAnalysisId().equals(this.getRouteAnalysisId()) == false)
            return false;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getIncludeReturnPath() == null ^ this.getIncludeReturnPath() == null)
            return false;
        if (other.getIncludeReturnPath() != null && other.getIncludeReturnPath().equals(this.getIncludeReturnPath()) == false)
            return false;
        if (other.getUseMiddleboxes() == null ^ this.getUseMiddleboxes() == null)
            return false;
        if (other.getUseMiddleboxes() != null && other.getUseMiddleboxes().equals(this.getUseMiddleboxes()) == false)
            return false;
        if (other.getForwardPath() == null ^ this.getForwardPath() == null)
            return false;
        if (other.getForwardPath() != null && other.getForwardPath().equals(this.getForwardPath()) == false)
            return false;
        if (other.getReturnPath() == null ^ this.getReturnPath() == null)
            return false;
        if (other.getReturnPath() != null && other.getReturnPath().equals(this.getReturnPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getRouteAnalysisId() == null) ? 0 : getRouteAnalysisId().hashCode());
        hashCode = prime * hashCode + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getIncludeReturnPath() == null) ? 0 : getIncludeReturnPath().hashCode());
        hashCode = prime * hashCode + ((getUseMiddleboxes() == null) ? 0 : getUseMiddleboxes().hashCode());
        hashCode = prime * hashCode + ((getForwardPath() == null) ? 0 : getForwardPath().hashCode());
        hashCode = prime * hashCode + ((getReturnPath() == null) ? 0 : getReturnPath().hashCode());
        return hashCode;
    }

    @Override
    public RouteAnalysis clone() {
        try {
            return (RouteAnalysis) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.RouteAnalysisMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
