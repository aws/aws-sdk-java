/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The cluster configuration status for a domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterConfigStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Cluster configuration options for the specified domain.
     * </p>
     */
    private ClusterConfig options;
    /**
     * <p>
     * The status of cluster configuration options for the specified domain.
     * </p>
     */
    private OptionStatus status;

    /**
     * <p>
     * Cluster configuration options for the specified domain.
     * </p>
     * 
     * @param options
     *        Cluster configuration options for the specified domain.
     */

    public void setOptions(ClusterConfig options) {
        this.options = options;
    }

    /**
     * <p>
     * Cluster configuration options for the specified domain.
     * </p>
     * 
     * @return Cluster configuration options for the specified domain.
     */

    public ClusterConfig getOptions() {
        return this.options;
    }

    /**
     * <p>
     * Cluster configuration options for the specified domain.
     * </p>
     * 
     * @param options
     *        Cluster configuration options for the specified domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfigStatus withOptions(ClusterConfig options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The status of cluster configuration options for the specified domain.
     * </p>
     * 
     * @param status
     *        The status of cluster configuration options for the specified domain.
     */

    public void setStatus(OptionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of cluster configuration options for the specified domain.
     * </p>
     * 
     * @return The status of cluster configuration options for the specified domain.
     */

    public OptionStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of cluster configuration options for the specified domain.
     * </p>
     * 
     * @param status
     *        The status of cluster configuration options for the specified domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfigStatus withStatus(OptionStatus status) {
        setStatus(status);
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
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterConfigStatus == false)
            return false;
        ClusterConfigStatus other = (ClusterConfigStatus) obj;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ClusterConfigStatus clone() {
        try {
            return (ClusterConfigStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.ClusterConfigStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
