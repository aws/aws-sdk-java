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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DiscoverInstancesRevision"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiscoverInstancesRevisionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The increasing revision associated to the response Instances list. If a new instance is registered or
     * deregistered, the <code>InstancesRevision</code> updates. The health status updates don't update
     * <code>InstancesRevision</code>.
     * </p>
     */
    private Long instancesRevision;

    /**
     * <p>
     * The increasing revision associated to the response Instances list. If a new instance is registered or
     * deregistered, the <code>InstancesRevision</code> updates. The health status updates don't update
     * <code>InstancesRevision</code>.
     * </p>
     * 
     * @param instancesRevision
     *        The increasing revision associated to the response Instances list. If a new instance is registered or
     *        deregistered, the <code>InstancesRevision</code> updates. The health status updates don't update
     *        <code>InstancesRevision</code>.
     */

    public void setInstancesRevision(Long instancesRevision) {
        this.instancesRevision = instancesRevision;
    }

    /**
     * <p>
     * The increasing revision associated to the response Instances list. If a new instance is registered or
     * deregistered, the <code>InstancesRevision</code> updates. The health status updates don't update
     * <code>InstancesRevision</code>.
     * </p>
     * 
     * @return The increasing revision associated to the response Instances list. If a new instance is registered or
     *         deregistered, the <code>InstancesRevision</code> updates. The health status updates don't update
     *         <code>InstancesRevision</code>.
     */

    public Long getInstancesRevision() {
        return this.instancesRevision;
    }

    /**
     * <p>
     * The increasing revision associated to the response Instances list. If a new instance is registered or
     * deregistered, the <code>InstancesRevision</code> updates. The health status updates don't update
     * <code>InstancesRevision</code>.
     * </p>
     * 
     * @param instancesRevision
     *        The increasing revision associated to the response Instances list. If a new instance is registered or
     *        deregistered, the <code>InstancesRevision</code> updates. The health status updates don't update
     *        <code>InstancesRevision</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInstancesRevisionResult withInstancesRevision(Long instancesRevision) {
        setInstancesRevision(instancesRevision);
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
        if (getInstancesRevision() != null)
            sb.append("InstancesRevision: ").append(getInstancesRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoverInstancesRevisionResult == false)
            return false;
        DiscoverInstancesRevisionResult other = (DiscoverInstancesRevisionResult) obj;
        if (other.getInstancesRevision() == null ^ this.getInstancesRevision() == null)
            return false;
        if (other.getInstancesRevision() != null && other.getInstancesRevision().equals(this.getInstancesRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstancesRevision() == null) ? 0 : getInstancesRevision().hashCode());
        return hashCode;
    }

    @Override
    public DiscoverInstancesRevisionResult clone() {
        try {
            return (DiscoverInstancesRevisionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
