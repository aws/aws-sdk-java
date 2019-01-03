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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddInstanceFleet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddInstanceFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * Specifies the configuration of the instance fleet.
     * </p>
     */
    private InstanceFleetConfig instanceFleet;

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * 
     * @param clusterId
     *        The unique identifier of the cluster.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * 
     * @return The unique identifier of the cluster.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * 
     * @param clusterId
     *        The unique identifier of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddInstanceFleetRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * Specifies the configuration of the instance fleet.
     * </p>
     * 
     * @param instanceFleet
     *        Specifies the configuration of the instance fleet.
     */

    public void setInstanceFleet(InstanceFleetConfig instanceFleet) {
        this.instanceFleet = instanceFleet;
    }

    /**
     * <p>
     * Specifies the configuration of the instance fleet.
     * </p>
     * 
     * @return Specifies the configuration of the instance fleet.
     */

    public InstanceFleetConfig getInstanceFleet() {
        return this.instanceFleet;
    }

    /**
     * <p>
     * Specifies the configuration of the instance fleet.
     * </p>
     * 
     * @param instanceFleet
     *        Specifies the configuration of the instance fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddInstanceFleetRequest withInstanceFleet(InstanceFleetConfig instanceFleet) {
        setInstanceFleet(instanceFleet);
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getInstanceFleet() != null)
            sb.append("InstanceFleet: ").append(getInstanceFleet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddInstanceFleetRequest == false)
            return false;
        AddInstanceFleetRequest other = (AddInstanceFleetRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getInstanceFleet() == null ^ this.getInstanceFleet() == null)
            return false;
        if (other.getInstanceFleet() != null && other.getInstanceFleet().equals(this.getInstanceFleet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getInstanceFleet() == null) ? 0 : getInstanceFleet().hashCode());
        return hashCode;
    }

    @Override
    public AddInstanceFleetRequest clone() {
        return (AddInstanceFleetRequest) super.clone();
    }

}
