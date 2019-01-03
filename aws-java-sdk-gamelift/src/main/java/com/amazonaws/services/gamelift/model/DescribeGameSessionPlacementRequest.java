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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionPlacement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGameSessionPlacementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a game session placement to retrieve.
     * </p>
     */
    private String placementId;

    /**
     * <p>
     * Unique identifier for a game session placement to retrieve.
     * </p>
     * 
     * @param placementId
     *        Unique identifier for a game session placement to retrieve.
     */

    public void setPlacementId(String placementId) {
        this.placementId = placementId;
    }

    /**
     * <p>
     * Unique identifier for a game session placement to retrieve.
     * </p>
     * 
     * @return Unique identifier for a game session placement to retrieve.
     */

    public String getPlacementId() {
        return this.placementId;
    }

    /**
     * <p>
     * Unique identifier for a game session placement to retrieve.
     * </p>
     * 
     * @param placementId
     *        Unique identifier for a game session placement to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameSessionPlacementRequest withPlacementId(String placementId) {
        setPlacementId(placementId);
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
        if (getPlacementId() != null)
            sb.append("PlacementId: ").append(getPlacementId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGameSessionPlacementRequest == false)
            return false;
        DescribeGameSessionPlacementRequest other = (DescribeGameSessionPlacementRequest) obj;
        if (other.getPlacementId() == null ^ this.getPlacementId() == null)
            return false;
        if (other.getPlacementId() != null && other.getPlacementId().equals(this.getPlacementId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlacementId() == null) ? 0 : getPlacementId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGameSessionPlacementRequest clone() {
        return (DescribeGameSessionPlacementRequest) super.clone();
    }

}
