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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTrafficMirrorFilterNetworkServicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The Traffic Mirror filter that the network service is associated with.
     * </p>
     */
    private TrafficMirrorFilter trafficMirrorFilter;

    /**
     * <p>
     * The Traffic Mirror filter that the network service is associated with.
     * </p>
     * 
     * @param trafficMirrorFilter
     *        The Traffic Mirror filter that the network service is associated with.
     */

    public void setTrafficMirrorFilter(TrafficMirrorFilter trafficMirrorFilter) {
        this.trafficMirrorFilter = trafficMirrorFilter;
    }

    /**
     * <p>
     * The Traffic Mirror filter that the network service is associated with.
     * </p>
     * 
     * @return The Traffic Mirror filter that the network service is associated with.
     */

    public TrafficMirrorFilter getTrafficMirrorFilter() {
        return this.trafficMirrorFilter;
    }

    /**
     * <p>
     * The Traffic Mirror filter that the network service is associated with.
     * </p>
     * 
     * @param trafficMirrorFilter
     *        The Traffic Mirror filter that the network service is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrafficMirrorFilterNetworkServicesResult withTrafficMirrorFilter(TrafficMirrorFilter trafficMirrorFilter) {
        setTrafficMirrorFilter(trafficMirrorFilter);
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
        if (getTrafficMirrorFilter() != null)
            sb.append("TrafficMirrorFilter: ").append(getTrafficMirrorFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTrafficMirrorFilterNetworkServicesResult == false)
            return false;
        ModifyTrafficMirrorFilterNetworkServicesResult other = (ModifyTrafficMirrorFilterNetworkServicesResult) obj;
        if (other.getTrafficMirrorFilter() == null ^ this.getTrafficMirrorFilter() == null)
            return false;
        if (other.getTrafficMirrorFilter() != null && other.getTrafficMirrorFilter().equals(this.getTrafficMirrorFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficMirrorFilter() == null) ? 0 : getTrafficMirrorFilter().hashCode());
        return hashCode;
    }

    @Override
    public ModifyTrafficMirrorFilterNetworkServicesResult clone() {
        try {
            return (ModifyTrafficMirrorFilterNetworkServicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
