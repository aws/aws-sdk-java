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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the ground station data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/GroundStationData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroundStationData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * UUID of a ground station.
     * </p>
     */
    private String groundStationId;
    /**
     * <p>
     * Name of a ground station.
     * </p>
     */
    private String groundStationName;
    /**
     * <p>
     * Ground station Region.
     * </p>
     */
    private String region;

    /**
     * <p>
     * UUID of a ground station.
     * </p>
     * 
     * @param groundStationId
     *        UUID of a ground station.
     */

    public void setGroundStationId(String groundStationId) {
        this.groundStationId = groundStationId;
    }

    /**
     * <p>
     * UUID of a ground station.
     * </p>
     * 
     * @return UUID of a ground station.
     */

    public String getGroundStationId() {
        return this.groundStationId;
    }

    /**
     * <p>
     * UUID of a ground station.
     * </p>
     * 
     * @param groundStationId
     *        UUID of a ground station.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroundStationData withGroundStationId(String groundStationId) {
        setGroundStationId(groundStationId);
        return this;
    }

    /**
     * <p>
     * Name of a ground station.
     * </p>
     * 
     * @param groundStationName
     *        Name of a ground station.
     */

    public void setGroundStationName(String groundStationName) {
        this.groundStationName = groundStationName;
    }

    /**
     * <p>
     * Name of a ground station.
     * </p>
     * 
     * @return Name of a ground station.
     */

    public String getGroundStationName() {
        return this.groundStationName;
    }

    /**
     * <p>
     * Name of a ground station.
     * </p>
     * 
     * @param groundStationName
     *        Name of a ground station.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroundStationData withGroundStationName(String groundStationName) {
        setGroundStationName(groundStationName);
        return this;
    }

    /**
     * <p>
     * Ground station Region.
     * </p>
     * 
     * @param region
     *        Ground station Region.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * Ground station Region.
     * </p>
     * 
     * @return Ground station Region.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * Ground station Region.
     * </p>
     * 
     * @param region
     *        Ground station Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroundStationData withRegion(String region) {
        setRegion(region);
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
        if (getGroundStationId() != null)
            sb.append("GroundStationId: ").append(getGroundStationId()).append(",");
        if (getGroundStationName() != null)
            sb.append("GroundStationName: ").append(getGroundStationName()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroundStationData == false)
            return false;
        GroundStationData other = (GroundStationData) obj;
        if (other.getGroundStationId() == null ^ this.getGroundStationId() == null)
            return false;
        if (other.getGroundStationId() != null && other.getGroundStationId().equals(this.getGroundStationId()) == false)
            return false;
        if (other.getGroundStationName() == null ^ this.getGroundStationName() == null)
            return false;
        if (other.getGroundStationName() != null && other.getGroundStationName().equals(this.getGroundStationName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroundStationId() == null) ? 0 : getGroundStationId().hashCode());
        hashCode = prime * hashCode + ((getGroundStationName() == null) ? 0 : getGroundStationName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public GroundStationData clone() {
        try {
            return (GroundStationData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.GroundStationDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
