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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddInstanceFleet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddInstanceFleetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     */
    private String instanceFleetId;

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

    public AddInstanceFleetResult withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     * 
     * @param instanceFleetId
     *        The unique identifier of the instance fleet.
     */

    public void setInstanceFleetId(String instanceFleetId) {
        this.instanceFleetId = instanceFleetId;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     * 
     * @return The unique identifier of the instance fleet.
     */

    public String getInstanceFleetId() {
        return this.instanceFleetId;
    }

    /**
     * <p>
     * The unique identifier of the instance fleet.
     * </p>
     * 
     * @param instanceFleetId
     *        The unique identifier of the instance fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddInstanceFleetResult withInstanceFleetId(String instanceFleetId) {
        setInstanceFleetId(instanceFleetId);
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
        if (getInstanceFleetId() != null)
            sb.append("InstanceFleetId: ").append(getInstanceFleetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddInstanceFleetResult == false)
            return false;
        AddInstanceFleetResult other = (AddInstanceFleetResult) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getInstanceFleetId() == null ^ this.getInstanceFleetId() == null)
            return false;
        if (other.getInstanceFleetId() != null && other.getInstanceFleetId().equals(this.getInstanceFleetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getInstanceFleetId() == null) ? 0 : getInstanceFleetId().hashCode());
        return hashCode;
    }

    @Override
    public AddInstanceFleetResult clone() {
        try {
            return (AddInstanceFleetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
