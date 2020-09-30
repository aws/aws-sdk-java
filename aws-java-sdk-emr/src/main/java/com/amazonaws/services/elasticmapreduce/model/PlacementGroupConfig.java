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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/PlacementGroupConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlacementGroupConfig implements Serializable, Cloneable, StructuredPojo {

    private String instanceRole;

    private String placementStrategy;

    /**
     * @param instanceRole
     * @see InstanceRoleType
     */

    public void setInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
    }

    /**
     * @return
     * @see InstanceRoleType
     */

    public String getInstanceRole() {
        return this.instanceRole;
    }

    /**
     * @param instanceRole
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceRoleType
     */

    public PlacementGroupConfig withInstanceRole(String instanceRole) {
        setInstanceRole(instanceRole);
        return this;
    }

    /**
     * @param instanceRole
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceRoleType
     */

    public PlacementGroupConfig withInstanceRole(InstanceRoleType instanceRole) {
        this.instanceRole = instanceRole.toString();
        return this;
    }

    /**
     * @param placementStrategy
     * @see PlacementGroupStrategy
     */

    public void setPlacementStrategy(String placementStrategy) {
        this.placementStrategy = placementStrategy;
    }

    /**
     * @return
     * @see PlacementGroupStrategy
     */

    public String getPlacementStrategy() {
        return this.placementStrategy;
    }

    /**
     * @param placementStrategy
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlacementGroupStrategy
     */

    public PlacementGroupConfig withPlacementStrategy(String placementStrategy) {
        setPlacementStrategy(placementStrategy);
        return this;
    }

    /**
     * @param placementStrategy
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlacementGroupStrategy
     */

    public PlacementGroupConfig withPlacementStrategy(PlacementGroupStrategy placementStrategy) {
        this.placementStrategy = placementStrategy.toString();
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
        if (getInstanceRole() != null)
            sb.append("InstanceRole: ").append(getInstanceRole()).append(",");
        if (getPlacementStrategy() != null)
            sb.append("PlacementStrategy: ").append(getPlacementStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlacementGroupConfig == false)
            return false;
        PlacementGroupConfig other = (PlacementGroupConfig) obj;
        if (other.getInstanceRole() == null ^ this.getInstanceRole() == null)
            return false;
        if (other.getInstanceRole() != null && other.getInstanceRole().equals(this.getInstanceRole()) == false)
            return false;
        if (other.getPlacementStrategy() == null ^ this.getPlacementStrategy() == null)
            return false;
        if (other.getPlacementStrategy() != null && other.getPlacementStrategy().equals(this.getPlacementStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceRole() == null) ? 0 : getInstanceRole().hashCode());
        hashCode = prime * hashCode + ((getPlacementStrategy() == null) ? 0 : getPlacementStrategy().hashCode());
        return hashCode;
    }

    @Override
    public PlacementGroupConfig clone() {
        try {
            return (PlacementGroupConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.PlacementGroupConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
