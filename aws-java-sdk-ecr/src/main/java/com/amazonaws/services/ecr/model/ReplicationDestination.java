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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An array of objects representing the details of a replication destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ReplicationDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Region to replicate to.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The account ID of the destination registry to replicate to.
     * </p>
     */
    private String registryId;

    /**
     * <p>
     * A Region to replicate to.
     * </p>
     * 
     * @param region
     *        A Region to replicate to.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * A Region to replicate to.
     * </p>
     * 
     * @return A Region to replicate to.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * A Region to replicate to.
     * </p>
     * 
     * @param region
     *        A Region to replicate to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationDestination withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The account ID of the destination registry to replicate to.
     * </p>
     * 
     * @param registryId
     *        The account ID of the destination registry to replicate to.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The account ID of the destination registry to replicate to.
     * </p>
     * 
     * @return The account ID of the destination registry to replicate to.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The account ID of the destination registry to replicate to.
     * </p>
     * 
     * @param registryId
     *        The account ID of the destination registry to replicate to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationDestination withRegistryId(String registryId) {
        setRegistryId(registryId);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationDestination == false)
            return false;
        ReplicationDestination other = (ReplicationDestination) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationDestination clone() {
        try {
            return (ReplicationDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.ReplicationDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
