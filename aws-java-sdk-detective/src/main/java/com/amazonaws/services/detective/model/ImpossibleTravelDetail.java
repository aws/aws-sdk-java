/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on unusual and impossible travel in an account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/ImpossibleTravelDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImpossibleTravelDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * IP address where the resource was first used in the impossible travel.
     * </p>
     */
    private String startingIpAddress;
    /**
     * <p>
     * IP address where the resource was last used in the impossible travel.
     * </p>
     */
    private String endingIpAddress;
    /**
     * <p>
     * Location where the resource was first used in the impossible travel.
     * </p>
     */
    private String startingLocation;
    /**
     * <p>
     * Location where the resource was last used in the impossible travel.
     * </p>
     */
    private String endingLocation;
    /**
     * <p>
     * Returns the time difference between the first and last timestamp the resource was used.
     * </p>
     */
    private Integer hourlyTimeDelta;

    /**
     * <p>
     * IP address where the resource was first used in the impossible travel.
     * </p>
     * 
     * @param startingIpAddress
     *        IP address where the resource was first used in the impossible travel.
     */

    public void setStartingIpAddress(String startingIpAddress) {
        this.startingIpAddress = startingIpAddress;
    }

    /**
     * <p>
     * IP address where the resource was first used in the impossible travel.
     * </p>
     * 
     * @return IP address where the resource was first used in the impossible travel.
     */

    public String getStartingIpAddress() {
        return this.startingIpAddress;
    }

    /**
     * <p>
     * IP address where the resource was first used in the impossible travel.
     * </p>
     * 
     * @param startingIpAddress
     *        IP address where the resource was first used in the impossible travel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpossibleTravelDetail withStartingIpAddress(String startingIpAddress) {
        setStartingIpAddress(startingIpAddress);
        return this;
    }

    /**
     * <p>
     * IP address where the resource was last used in the impossible travel.
     * </p>
     * 
     * @param endingIpAddress
     *        IP address where the resource was last used in the impossible travel.
     */

    public void setEndingIpAddress(String endingIpAddress) {
        this.endingIpAddress = endingIpAddress;
    }

    /**
     * <p>
     * IP address where the resource was last used in the impossible travel.
     * </p>
     * 
     * @return IP address where the resource was last used in the impossible travel.
     */

    public String getEndingIpAddress() {
        return this.endingIpAddress;
    }

    /**
     * <p>
     * IP address where the resource was last used in the impossible travel.
     * </p>
     * 
     * @param endingIpAddress
     *        IP address where the resource was last used in the impossible travel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpossibleTravelDetail withEndingIpAddress(String endingIpAddress) {
        setEndingIpAddress(endingIpAddress);
        return this;
    }

    /**
     * <p>
     * Location where the resource was first used in the impossible travel.
     * </p>
     * 
     * @param startingLocation
     *        Location where the resource was first used in the impossible travel.
     */

    public void setStartingLocation(String startingLocation) {
        this.startingLocation = startingLocation;
    }

    /**
     * <p>
     * Location where the resource was first used in the impossible travel.
     * </p>
     * 
     * @return Location where the resource was first used in the impossible travel.
     */

    public String getStartingLocation() {
        return this.startingLocation;
    }

    /**
     * <p>
     * Location where the resource was first used in the impossible travel.
     * </p>
     * 
     * @param startingLocation
     *        Location where the resource was first used in the impossible travel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpossibleTravelDetail withStartingLocation(String startingLocation) {
        setStartingLocation(startingLocation);
        return this;
    }

    /**
     * <p>
     * Location where the resource was last used in the impossible travel.
     * </p>
     * 
     * @param endingLocation
     *        Location where the resource was last used in the impossible travel.
     */

    public void setEndingLocation(String endingLocation) {
        this.endingLocation = endingLocation;
    }

    /**
     * <p>
     * Location where the resource was last used in the impossible travel.
     * </p>
     * 
     * @return Location where the resource was last used in the impossible travel.
     */

    public String getEndingLocation() {
        return this.endingLocation;
    }

    /**
     * <p>
     * Location where the resource was last used in the impossible travel.
     * </p>
     * 
     * @param endingLocation
     *        Location where the resource was last used in the impossible travel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpossibleTravelDetail withEndingLocation(String endingLocation) {
        setEndingLocation(endingLocation);
        return this;
    }

    /**
     * <p>
     * Returns the time difference between the first and last timestamp the resource was used.
     * </p>
     * 
     * @param hourlyTimeDelta
     *        Returns the time difference between the first and last timestamp the resource was used.
     */

    public void setHourlyTimeDelta(Integer hourlyTimeDelta) {
        this.hourlyTimeDelta = hourlyTimeDelta;
    }

    /**
     * <p>
     * Returns the time difference between the first and last timestamp the resource was used.
     * </p>
     * 
     * @return Returns the time difference between the first and last timestamp the resource was used.
     */

    public Integer getHourlyTimeDelta() {
        return this.hourlyTimeDelta;
    }

    /**
     * <p>
     * Returns the time difference between the first and last timestamp the resource was used.
     * </p>
     * 
     * @param hourlyTimeDelta
     *        Returns the time difference between the first and last timestamp the resource was used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpossibleTravelDetail withHourlyTimeDelta(Integer hourlyTimeDelta) {
        setHourlyTimeDelta(hourlyTimeDelta);
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
        if (getStartingIpAddress() != null)
            sb.append("StartingIpAddress: ").append(getStartingIpAddress()).append(",");
        if (getEndingIpAddress() != null)
            sb.append("EndingIpAddress: ").append(getEndingIpAddress()).append(",");
        if (getStartingLocation() != null)
            sb.append("StartingLocation: ").append(getStartingLocation()).append(",");
        if (getEndingLocation() != null)
            sb.append("EndingLocation: ").append(getEndingLocation()).append(",");
        if (getHourlyTimeDelta() != null)
            sb.append("HourlyTimeDelta: ").append(getHourlyTimeDelta());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImpossibleTravelDetail == false)
            return false;
        ImpossibleTravelDetail other = (ImpossibleTravelDetail) obj;
        if (other.getStartingIpAddress() == null ^ this.getStartingIpAddress() == null)
            return false;
        if (other.getStartingIpAddress() != null && other.getStartingIpAddress().equals(this.getStartingIpAddress()) == false)
            return false;
        if (other.getEndingIpAddress() == null ^ this.getEndingIpAddress() == null)
            return false;
        if (other.getEndingIpAddress() != null && other.getEndingIpAddress().equals(this.getEndingIpAddress()) == false)
            return false;
        if (other.getStartingLocation() == null ^ this.getStartingLocation() == null)
            return false;
        if (other.getStartingLocation() != null && other.getStartingLocation().equals(this.getStartingLocation()) == false)
            return false;
        if (other.getEndingLocation() == null ^ this.getEndingLocation() == null)
            return false;
        if (other.getEndingLocation() != null && other.getEndingLocation().equals(this.getEndingLocation()) == false)
            return false;
        if (other.getHourlyTimeDelta() == null ^ this.getHourlyTimeDelta() == null)
            return false;
        if (other.getHourlyTimeDelta() != null && other.getHourlyTimeDelta().equals(this.getHourlyTimeDelta()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartingIpAddress() == null) ? 0 : getStartingIpAddress().hashCode());
        hashCode = prime * hashCode + ((getEndingIpAddress() == null) ? 0 : getEndingIpAddress().hashCode());
        hashCode = prime * hashCode + ((getStartingLocation() == null) ? 0 : getStartingLocation().hashCode());
        hashCode = prime * hashCode + ((getEndingLocation() == null) ? 0 : getEndingLocation().hashCode());
        hashCode = prime * hashCode + ((getHourlyTimeDelta() == null) ? 0 : getHourlyTimeDelta().hashCode());
        return hashCode;
    }

    @Override
    public ImpossibleTravelDetail clone() {
        try {
            return (ImpossibleTravelDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.ImpossibleTravelDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
