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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetDevicePositionHistory" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDevicePositionHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains the position history details for the requested device.
     * </p>
     */
    private java.util.List<DevicePosition> devicePositions;
    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains the position history details for the requested device.
     * </p>
     * 
     * @return Contains the position history details for the requested device.
     */

    public java.util.List<DevicePosition> getDevicePositions() {
        return devicePositions;
    }

    /**
     * <p>
     * Contains the position history details for the requested device.
     * </p>
     * 
     * @param devicePositions
     *        Contains the position history details for the requested device.
     */

    public void setDevicePositions(java.util.Collection<DevicePosition> devicePositions) {
        if (devicePositions == null) {
            this.devicePositions = null;
            return;
        }

        this.devicePositions = new java.util.ArrayList<DevicePosition>(devicePositions);
    }

    /**
     * <p>
     * Contains the position history details for the requested device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevicePositions(java.util.Collection)} or {@link #withDevicePositions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param devicePositions
     *        Contains the position history details for the requested device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicePositionHistoryResult withDevicePositions(DevicePosition... devicePositions) {
        if (this.devicePositions == null) {
            setDevicePositions(new java.util.ArrayList<DevicePosition>(devicePositions.length));
        }
        for (DevicePosition ele : devicePositions) {
            this.devicePositions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the position history details for the requested device.
     * </p>
     * 
     * @param devicePositions
     *        Contains the position history details for the requested device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicePositionHistoryResult withDevicePositions(java.util.Collection<DevicePosition> devicePositions) {
        setDevicePositions(devicePositions);
        return this;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token indicating there are additional pages available. You can use the token in a following
     *        request to fetch the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     * 
     * @return A pagination token indicating there are additional pages available. You can use the token in a following
     *         request to fetch the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You can use the token in a following request
     * to fetch the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token indicating there are additional pages available. You can use the token in a following
     *        request to fetch the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicePositionHistoryResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDevicePositions() != null)
            sb.append("DevicePositions: ").append(getDevicePositions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDevicePositionHistoryResult == false)
            return false;
        GetDevicePositionHistoryResult other = (GetDevicePositionHistoryResult) obj;
        if (other.getDevicePositions() == null ^ this.getDevicePositions() == null)
            return false;
        if (other.getDevicePositions() != null && other.getDevicePositions().equals(this.getDevicePositions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevicePositions() == null) ? 0 : getDevicePositions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDevicePositionHistoryResult clone() {
        try {
            return (GetDevicePositionHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
