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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateLag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLagRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The number of physical connections initially provisioned and bundled by the LAG.
     * </p>
     */
    private Integer numberOfConnections;
    /**
     * <p>
     * The location for the LAG.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The bandwidth of the individual physical connections bundled by the LAG. The possible values are 50Mbps, 100Mbps,
     * 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps.
     * </p>
     */
    private String connectionsBandwidth;
    /**
     * <p>
     * The name of the LAG.
     * </p>
     */
    private String lagName;
    /**
     * <p>
     * The ID of an existing connection to migrate to the LAG.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * The number of physical connections initially provisioned and bundled by the LAG.
     * </p>
     * 
     * @param numberOfConnections
     *        The number of physical connections initially provisioned and bundled by the LAG.
     */

    public void setNumberOfConnections(Integer numberOfConnections) {
        this.numberOfConnections = numberOfConnections;
    }

    /**
     * <p>
     * The number of physical connections initially provisioned and bundled by the LAG.
     * </p>
     * 
     * @return The number of physical connections initially provisioned and bundled by the LAG.
     */

    public Integer getNumberOfConnections() {
        return this.numberOfConnections;
    }

    /**
     * <p>
     * The number of physical connections initially provisioned and bundled by the LAG.
     * </p>
     * 
     * @param numberOfConnections
     *        The number of physical connections initially provisioned and bundled by the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLagRequest withNumberOfConnections(Integer numberOfConnections) {
        setNumberOfConnections(numberOfConnections);
        return this;
    }

    /**
     * <p>
     * The location for the LAG.
     * </p>
     * 
     * @param location
     *        The location for the LAG.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location for the LAG.
     * </p>
     * 
     * @return The location for the LAG.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location for the LAG.
     * </p>
     * 
     * @param location
     *        The location for the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLagRequest withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The bandwidth of the individual physical connections bundled by the LAG. The possible values are 50Mbps, 100Mbps,
     * 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps.
     * </p>
     * 
     * @param connectionsBandwidth
     *        The bandwidth of the individual physical connections bundled by the LAG. The possible values are 50Mbps,
     *        100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps.
     */

    public void setConnectionsBandwidth(String connectionsBandwidth) {
        this.connectionsBandwidth = connectionsBandwidth;
    }

    /**
     * <p>
     * The bandwidth of the individual physical connections bundled by the LAG. The possible values are 50Mbps, 100Mbps,
     * 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps.
     * </p>
     * 
     * @return The bandwidth of the individual physical connections bundled by the LAG. The possible values are 50Mbps,
     *         100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps.
     */

    public String getConnectionsBandwidth() {
        return this.connectionsBandwidth;
    }

    /**
     * <p>
     * The bandwidth of the individual physical connections bundled by the LAG. The possible values are 50Mbps, 100Mbps,
     * 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps.
     * </p>
     * 
     * @param connectionsBandwidth
     *        The bandwidth of the individual physical connections bundled by the LAG. The possible values are 50Mbps,
     *        100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps, and 10Gbps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLagRequest withConnectionsBandwidth(String connectionsBandwidth) {
        setConnectionsBandwidth(connectionsBandwidth);
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

    public CreateLagRequest withLagName(String lagName) {
        setLagName(lagName);
        return this;
    }

    /**
     * <p>
     * The ID of an existing connection to migrate to the LAG.
     * </p>
     * 
     * @param connectionId
     *        The ID of an existing connection to migrate to the LAG.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of an existing connection to migrate to the LAG.
     * </p>
     * 
     * @return The ID of an existing connection to migrate to the LAG.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of an existing connection to migrate to the LAG.
     * </p>
     * 
     * @param connectionId
     *        The ID of an existing connection to migrate to the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLagRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
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
        if (getNumberOfConnections() != null)
            sb.append("NumberOfConnections: ").append(getNumberOfConnections()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getConnectionsBandwidth() != null)
            sb.append("ConnectionsBandwidth: ").append(getConnectionsBandwidth()).append(",");
        if (getLagName() != null)
            sb.append("LagName: ").append(getLagName()).append(",");
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLagRequest == false)
            return false;
        CreateLagRequest other = (CreateLagRequest) obj;
        if (other.getNumberOfConnections() == null ^ this.getNumberOfConnections() == null)
            return false;
        if (other.getNumberOfConnections() != null && other.getNumberOfConnections().equals(this.getNumberOfConnections()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getConnectionsBandwidth() == null ^ this.getConnectionsBandwidth() == null)
            return false;
        if (other.getConnectionsBandwidth() != null && other.getConnectionsBandwidth().equals(this.getConnectionsBandwidth()) == false)
            return false;
        if (other.getLagName() == null ^ this.getLagName() == null)
            return false;
        if (other.getLagName() != null && other.getLagName().equals(this.getLagName()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfConnections() == null) ? 0 : getNumberOfConnections().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getConnectionsBandwidth() == null) ? 0 : getConnectionsBandwidth().hashCode());
        hashCode = prime * hashCode + ((getLagName() == null) ? 0 : getLagName().hashCode());
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateLagRequest clone() {
        return (CreateLagRequest) super.clone();
    }

}
