/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 */
public class DescribeFleetPortSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Object containing port settings for the requested fleet ID.
     * </p>
     */
    private java.util.List<IpPermission> inboundPermissions;

    /**
     * <p>
     * Object containing port settings for the requested fleet ID.
     * </p>
     * 
     * @return Object containing port settings for the requested fleet ID.
     */

    public java.util.List<IpPermission> getInboundPermissions() {
        return inboundPermissions;
    }

    /**
     * <p>
     * Object containing port settings for the requested fleet ID.
     * </p>
     * 
     * @param inboundPermissions
     *        Object containing port settings for the requested fleet ID.
     */

    public void setInboundPermissions(java.util.Collection<IpPermission> inboundPermissions) {
        if (inboundPermissions == null) {
            this.inboundPermissions = null;
            return;
        }

        this.inboundPermissions = new java.util.ArrayList<IpPermission>(inboundPermissions);
    }

    /**
     * <p>
     * Object containing port settings for the requested fleet ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInboundPermissions(java.util.Collection)} or {@link #withInboundPermissions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inboundPermissions
     *        Object containing port settings for the requested fleet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetPortSettingsResult withInboundPermissions(IpPermission... inboundPermissions) {
        if (this.inboundPermissions == null) {
            setInboundPermissions(new java.util.ArrayList<IpPermission>(inboundPermissions.length));
        }
        for (IpPermission ele : inboundPermissions) {
            this.inboundPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Object containing port settings for the requested fleet ID.
     * </p>
     * 
     * @param inboundPermissions
     *        Object containing port settings for the requested fleet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetPortSettingsResult withInboundPermissions(java.util.Collection<IpPermission> inboundPermissions) {
        setInboundPermissions(inboundPermissions);
        return this;
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
        if (getInboundPermissions() != null)
            sb.append("InboundPermissions: " + getInboundPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFleetPortSettingsResult == false)
            return false;
        DescribeFleetPortSettingsResult other = (DescribeFleetPortSettingsResult) obj;
        if (other.getInboundPermissions() == null ^ this.getInboundPermissions() == null)
            return false;
        if (other.getInboundPermissions() != null && other.getInboundPermissions().equals(this.getInboundPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInboundPermissions() == null) ? 0 : getInboundPermissions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetPortSettingsResult clone() {
        try {
            return (DescribeFleetPortSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
