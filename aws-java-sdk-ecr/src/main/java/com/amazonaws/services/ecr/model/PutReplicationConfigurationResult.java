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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutReplicationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutReplicationConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The contents of the replication configuration for the registry.
     * </p>
     */
    private ReplicationConfiguration replicationConfiguration;

    /**
     * <p>
     * The contents of the replication configuration for the registry.
     * </p>
     * 
     * @param replicationConfiguration
     *        The contents of the replication configuration for the registry.
     */

    public void setReplicationConfiguration(ReplicationConfiguration replicationConfiguration) {
        this.replicationConfiguration = replicationConfiguration;
    }

    /**
     * <p>
     * The contents of the replication configuration for the registry.
     * </p>
     * 
     * @return The contents of the replication configuration for the registry.
     */

    public ReplicationConfiguration getReplicationConfiguration() {
        return this.replicationConfiguration;
    }

    /**
     * <p>
     * The contents of the replication configuration for the registry.
     * </p>
     * 
     * @param replicationConfiguration
     *        The contents of the replication configuration for the registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutReplicationConfigurationResult withReplicationConfiguration(ReplicationConfiguration replicationConfiguration) {
        setReplicationConfiguration(replicationConfiguration);
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
        if (getReplicationConfiguration() != null)
            sb.append("ReplicationConfiguration: ").append(getReplicationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutReplicationConfigurationResult == false)
            return false;
        PutReplicationConfigurationResult other = (PutReplicationConfigurationResult) obj;
        if (other.getReplicationConfiguration() == null ^ this.getReplicationConfiguration() == null)
            return false;
        if (other.getReplicationConfiguration() != null && other.getReplicationConfiguration().equals(this.getReplicationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationConfiguration() == null) ? 0 : getReplicationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutReplicationConfigurationResult clone() {
        try {
            return (PutReplicationConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
