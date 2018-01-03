/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a link aggregation group (LAG). A LAG is a connection that uses the Link Aggregation Control Protocol
 * (LACP) to logically aggregate a bundle of physical connections. Like an interconnect, it can host other connections.
 * All connections in a LAG must terminate on the same physical AWS Direct Connect endpoint, and must be the same
 * bandwidth.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateLag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLagResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The individual bandwidth of the physical connections bundled by the LAG.
     * </p>
     * <p>
     * Available values: 1Gbps, 10Gbps
     * </p>
     */
    private String connectionsBandwidth;
    /**
     * <p>
     * The number of physical connections bundled by the LAG, up to a maximum of 10.
     * </p>
     */
    private Integer numberOfConnections;

    private String lagId;
    /**
     * <p>
     * The owner of the LAG.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * The name of the LAG.
     * </p>
     */
    private String lagName;

    private String lagState;

    private String location;

    private String region;
    /**
     * <p>
     * The minimum number of physical connections that must be operational for the LAG itself to be operational. If the
     * number of operational connections drops below this setting, the LAG state changes to <code>down</code>. This
     * value can help to ensure that a LAG is not overutilized if a significant number of its bundled connections go
     * down.
     * </p>
     */
    private Integer minimumLinks;
    /**
     * <p>
     * The AWS Direct Connection endpoint that hosts the LAG.
     * </p>
     */
    private String awsDevice;
    /**
     * <p>
     * A list of connections bundled by this LAG.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Connection> connections;
    /**
     * <p>
     * Indicates whether the LAG can host other connections.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     */
    private Boolean allowsHostedConnections;

    /**
     * <p>
     * The individual bandwidth of the physical connections bundled by the LAG.
     * </p>
     * <p>
     * Available values: 1Gbps, 10Gbps
     * </p>
     * 
     * @param connectionsBandwidth
     *        The individual bandwidth of the physical connections bundled by the LAG.</p>
     *        <p>
     *        Available values: 1Gbps, 10Gbps
     */

    public void setConnectionsBandwidth(String connectionsBandwidth) {
        this.connectionsBandwidth = connectionsBandwidth;
    }

    /**
     * <p>
     * The individual bandwidth of the physical connections bundled by the LAG.
     * </p>
     * <p>
     * Available values: 1Gbps, 10Gbps
     * </p>
     * 
     * @return The individual bandwidth of the physical connections bundled by the LAG.</p>
     *         <p>
     *         Available values: 1Gbps, 10Gbps
     */

    public String getConnectionsBandwidth() {
        return this.connectionsBandwidth;
    }

    /**
     * <p>
     * The individual bandwidth of the physical connections bundled by the LAG.
     * </p>
     * <p>
     * Available values: 1Gbps, 10Gbps
     * </p>
     * 
     * @param connectionsBandwidth
     *        The individual bandwidth of the physical connections bundled by the LAG.</p>
     *        <p>
     *        Available values: 1Gbps, 10Gbps
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLagResult withConnectionsBandwidth(String connectionsBandwidth) {
        setConnectionsBandwidth(connectionsBandwidth);
        return this;
    }

    /**
     * <p>
     * The number of physical connections bundled by the LAG, up to a maximum of 10.
     * </p>
     * 
     * @param numberOfConnections
     *        The number of physical connections bundled by the LAG, up to a maximum of 10.
     */

    public void setNumberOfConnections(Integer numberOfConnections) {
        this.numberOfConnections = numberOfConnections;
    }

    /**
     * <p>
     * The number of physical connections bundled by the LAG, up to a maximum of 10.
     * </p>
     * 
     * @return The number of physical connections bundled by the LAG, up to a maximum of 10.
     */

    public Integer getNumberOfConnections() {
        return this.numberOfConnections;
    }

    /**
     * <p>
     * The number of physical connections bundled by the LAG, up to a maximum of 10.
     * </p>
     * 
     * @param numberOfConnections
     *        The number of physical connections bundled by the LAG, up to a maximum of 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLagResult withNumberOfConnections(Integer numberOfConnections) {
        setNumberOfConnections(numberOfConnections);
        return this;
    }

    /**
     * @param lagId
     */

    public void setLagId(String lagId) {
        this.lagId = lagId;
    }

    /**
     * @return
     */

    public String getLagId() {
        return this.lagId;
    }

    /**
     * @param lagId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLagResult withLagId(String lagId) {
        setLagId(lagId);
        return this;
    }

    /**
     * <p>
     * The owner of the LAG.
     * </p>
     * 
     * @param ownerAccount
     *        The owner of the LAG.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The owner of the LAG.
     * </p>
     * 
     * @return The owner of the LAG.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The owner of the LAG.
     * </p>
     * 
     * @param ownerAccount
     *        The owner of the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLagResult withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     * 
     * @param lagName
     *        The name of the LAG.
     */

    public void setLagName(String lagName) {
        this.lagName = lagName;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     * 
     * @return The name of the LAG.
     */

    public String getLagName() {
        return this.lagName;
    }

    /**
     * <p>
     * The name of the LAG.
     * </p>
     * 
     * @param lagName
     *        The name of the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLagResult withLagName(String lagName) {
        setLagName(lagName);
        return this;
    }

    /**
     * @param lagState
     * @see LagState
     */

    public void setLagState(String lagState) {
        this.lagState = lagState;
    }

    /**
     * @return
     * @see LagState
     */

    public String getLagState() {
        return this.lagState;
    }

    /**
     * @param lagState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LagState
     */

    public UpdateLagResult withLagState(String lagState) {
        setLagState(lagState);
        return this;
    }

    /**
     * @param lagState
     * @see LagState
     */

    public void setLagState(LagState lagState) {
        withLagState(lagState);
    }

    /**
     * @param lagState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LagState
     */

    public UpdateLagResult withLagState(LagState lagState) {
        this.lagState = lagState.toString();
        return this;
    }

    /**
     * @param location
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * @param location
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLagResult withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * @param region
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * @param region
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLagResult withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The minimum number of physical connections that must be operational for the LAG itself to be operational. If the
     * number of operational connections drops below this setting, the LAG state changes to <code>down</code>. This
     * value can help to ensure that a LAG is not overutilized if a significant number of its bundled connections go
     * down.
     * </p>
     * 
     * @param minimumLinks
     *        The minimum number of physical connections that must be operational for the LAG itself to be operational.
     *        If the number of operational connections drops below this setting, the LAG state changes to
     *        <code>down</code>. This value can help to ensure that a LAG is not overutilized if a significant number of
     *        its bundled connections go down.
     */

    public void setMinimumLinks(Integer minimumLinks) {
        this.minimumLinks = minimumLinks;
    }

    /**
     * <p>
     * The minimum number of physical connections that must be operational for the LAG itself to be operational. If the
     * number of operational connections drops below this setting, the LAG state changes to <code>down</code>. This
     * value can help to ensure that a LAG is not overutilized if a significant number of its bundled connections go
     * down.
     * </p>
     * 
     * @return The minimum number of physical connections that must be operational for the LAG itself to be operational.
     *         If the number of operational connections drops below this setting, the LAG state changes to
     *         <code>down</code>. This value can help to ensure that a LAG is not overutilized if a significant number
     *         of its bundled connections go down.
     */

    public Integer getMinimumLinks() {
        return this.minimumLinks;
    }

    /**
     * <p>
     * The minimum number of physical connections that must be operational for the LAG itself to be operational. If the
     * number of operational connections drops below this setting, the LAG state changes to <code>down</code>. This
     * value can help to ensure that a LAG is not overutilized if a significant number of its bundled connections go
     * down.
     * </p>
     * 
     * @param minimumLinks
     *        The minimum number of physical connections that must be operational for the LAG itself to be operational.
     *        If the number of operational connections drops below this setting, the LAG state changes to
     *        <code>down</code>. This value can help to ensure that a LAG is not overutilized if a significant number of
     *        its bundled connections go down.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLagResult withMinimumLinks(Integer minimumLinks) {
        setMinimumLinks(minimumLinks);
        return this;
    }

    /**
     * <p>
     * The AWS Direct Connection endpoint that hosts the LAG.
     * </p>
     * 
     * @param awsDevice
     *        The AWS Direct Connection endpoint that hosts the LAG.
     */

    public void setAwsDevice(String awsDevice) {
        this.awsDevice = awsDevice;
    }

    /**
     * <p>
     * The AWS Direct Connection endpoint that hosts the LAG.
     * </p>
     * 
     * @return The AWS Direct Connection endpoint that hosts the LAG.
     */

    public String getAwsDevice() {
        return this.awsDevice;
    }

    /**
     * <p>
     * The AWS Direct Connection endpoint that hosts the LAG.
     * </p>
     * 
     * @param awsDevice
     *        The AWS Direct Connection endpoint that hosts the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLagResult withAwsDevice(String awsDevice) {
        setAwsDevice(awsDevice);
        return this;
    }

    /**
     * <p>
     * A list of connections bundled by this LAG.
     * </p>
     * 
     * @return A list of connections bundled by this LAG.
     */

    public java.util.List<Connection> getConnections() {
        if (connections == null) {
            connections = new com.amazonaws.internal.SdkInternalList<Connection>();
        }
        return connections;
    }

    /**
     * <p>
     * A list of connections bundled by this LAG.
     * </p>
     * 
     * @param connections
     *        A list of connections bundled by this LAG.
     */

    public void setConnections(java.util.Collection<Connection> connections) {
        if (connections == null) {
            this.connections = null;
            return;
        }

        this.connections = new com.amazonaws.internal.SdkInternalList<Connection>(connections);
    }

    /**
     * <p>
     * A list of connections bundled by this LAG.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnections(java.util.Collection)} or {@link #withConnections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param connections
     *        A list of connections bundled by this LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLagResult withConnections(Connection... connections) {
        if (this.connections == null) {
            setConnections(new com.amazonaws.internal.SdkInternalList<Connection>(connections.length));
        }
        for (Connection ele : connections) {
            this.connections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of connections bundled by this LAG.
     * </p>
     * 
     * @param connections
     *        A list of connections bundled by this LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLagResult withConnections(java.util.Collection<Connection> connections) {
        setConnections(connections);
        return this;
    }

    /**
     * <p>
     * Indicates whether the LAG can host other connections.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param allowsHostedConnections
     *        Indicates whether the LAG can host other connections.</p> <note>
     *        <p>
     *        This is intended for use by AWS Direct Connect partners only.
     *        </p>
     */

    public void setAllowsHostedConnections(Boolean allowsHostedConnections) {
        this.allowsHostedConnections = allowsHostedConnections;
    }

    /**
     * <p>
     * Indicates whether the LAG can host other connections.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @return Indicates whether the LAG can host other connections.</p> <note>
     *         <p>
     *         This is intended for use by AWS Direct Connect partners only.
     *         </p>
     */

    public Boolean getAllowsHostedConnections() {
        return this.allowsHostedConnections;
    }

    /**
     * <p>
     * Indicates whether the LAG can host other connections.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param allowsHostedConnections
     *        Indicates whether the LAG can host other connections.</p> <note>
     *        <p>
     *        This is intended for use by AWS Direct Connect partners only.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLagResult withAllowsHostedConnections(Boolean allowsHostedConnections) {
        setAllowsHostedConnections(allowsHostedConnections);
        return this;
    }

    /**
     * <p>
     * Indicates whether the LAG can host other connections.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @return Indicates whether the LAG can host other connections.</p> <note>
     *         <p>
     *         This is intended for use by AWS Direct Connect partners only.
     *         </p>
     */

    public Boolean isAllowsHostedConnections() {
        return this.allowsHostedConnections;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConnectionsBandwidth() != null)
            sb.append("ConnectionsBandwidth: ").append(getConnectionsBandwidth()).append(",");
        if (getNumberOfConnections() != null)
            sb.append("NumberOfConnections: ").append(getNumberOfConnections()).append(",");
        if (getLagId() != null)
            sb.append("LagId: ").append(getLagId()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getLagName() != null)
            sb.append("LagName: ").append(getLagName()).append(",");
        if (getLagState() != null)
            sb.append("LagState: ").append(getLagState()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getMinimumLinks() != null)
            sb.append("MinimumLinks: ").append(getMinimumLinks()).append(",");
        if (getAwsDevice() != null)
            sb.append("AwsDevice: ").append(getAwsDevice()).append(",");
        if (getConnections() != null)
            sb.append("Connections: ").append(getConnections()).append(",");
        if (getAllowsHostedConnections() != null)
            sb.append("AllowsHostedConnections: ").append(getAllowsHostedConnections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLagResult == false)
            return false;
        UpdateLagResult other = (UpdateLagResult) obj;
        if (other.getConnectionsBandwidth() == null ^ this.getConnectionsBandwidth() == null)
            return false;
        if (other.getConnectionsBandwidth() != null && other.getConnectionsBandwidth().equals(this.getConnectionsBandwidth()) == false)
            return false;
        if (other.getNumberOfConnections() == null ^ this.getNumberOfConnections() == null)
            return false;
        if (other.getNumberOfConnections() != null && other.getNumberOfConnections().equals(this.getNumberOfConnections()) == false)
            return false;
        if (other.getLagId() == null ^ this.getLagId() == null)
            return false;
        if (other.getLagId() != null && other.getLagId().equals(this.getLagId()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getLagName() == null ^ this.getLagName() == null)
            return false;
        if (other.getLagName() != null && other.getLagName().equals(this.getLagName()) == false)
            return false;
        if (other.getLagState() == null ^ this.getLagState() == null)
            return false;
        if (other.getLagState() != null && other.getLagState().equals(this.getLagState()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getMinimumLinks() == null ^ this.getMinimumLinks() == null)
            return false;
        if (other.getMinimumLinks() != null && other.getMinimumLinks().equals(this.getMinimumLinks()) == false)
            return false;
        if (other.getAwsDevice() == null ^ this.getAwsDevice() == null)
            return false;
        if (other.getAwsDevice() != null && other.getAwsDevice().equals(this.getAwsDevice()) == false)
            return false;
        if (other.getConnections() == null ^ this.getConnections() == null)
            return false;
        if (other.getConnections() != null && other.getConnections().equals(this.getConnections()) == false)
            return false;
        if (other.getAllowsHostedConnections() == null ^ this.getAllowsHostedConnections() == null)
            return false;
        if (other.getAllowsHostedConnections() != null && other.getAllowsHostedConnections().equals(this.getAllowsHostedConnections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionsBandwidth() == null) ? 0 : getConnectionsBandwidth().hashCode());
        hashCode = prime * hashCode + ((getNumberOfConnections() == null) ? 0 : getNumberOfConnections().hashCode());
        hashCode = prime * hashCode + ((getLagId() == null) ? 0 : getLagId().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getLagName() == null) ? 0 : getLagName().hashCode());
        hashCode = prime * hashCode + ((getLagState() == null) ? 0 : getLagState().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getMinimumLinks() == null) ? 0 : getMinimumLinks().hashCode());
        hashCode = prime * hashCode + ((getAwsDevice() == null) ? 0 : getAwsDevice().hashCode());
        hashCode = prime * hashCode + ((getConnections() == null) ? 0 : getConnections().hashCode());
        hashCode = prime * hashCode + ((getAllowsHostedConnections() == null) ? 0 : getAllowsHostedConnections().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLagResult clone() {
        try {
            return (UpdateLagResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
