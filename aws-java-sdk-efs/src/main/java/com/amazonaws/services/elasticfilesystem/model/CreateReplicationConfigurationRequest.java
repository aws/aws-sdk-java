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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateReplicationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReplicationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the Amazon EFS file system that you want to replicate. This file system cannot already be a source or
     * destination file system in another replication configuration.
     * </p>
     */
    private String sourceFileSystemId;
    /**
     * <p>
     * An array of destination configuration objects. Only one destination configuration object is supported.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DestinationToCreate> destinations;

    /**
     * <p>
     * Specifies the Amazon EFS file system that you want to replicate. This file system cannot already be a source or
     * destination file system in another replication configuration.
     * </p>
     * 
     * @param sourceFileSystemId
     *        Specifies the Amazon EFS file system that you want to replicate. This file system cannot already be a
     *        source or destination file system in another replication configuration.
     */

    public void setSourceFileSystemId(String sourceFileSystemId) {
        this.sourceFileSystemId = sourceFileSystemId;
    }

    /**
     * <p>
     * Specifies the Amazon EFS file system that you want to replicate. This file system cannot already be a source or
     * destination file system in another replication configuration.
     * </p>
     * 
     * @return Specifies the Amazon EFS file system that you want to replicate. This file system cannot already be a
     *         source or destination file system in another replication configuration.
     */

    public String getSourceFileSystemId() {
        return this.sourceFileSystemId;
    }

    /**
     * <p>
     * Specifies the Amazon EFS file system that you want to replicate. This file system cannot already be a source or
     * destination file system in another replication configuration.
     * </p>
     * 
     * @param sourceFileSystemId
     *        Specifies the Amazon EFS file system that you want to replicate. This file system cannot already be a
     *        source or destination file system in another replication configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationRequest withSourceFileSystemId(String sourceFileSystemId) {
        setSourceFileSystemId(sourceFileSystemId);
        return this;
    }

    /**
     * <p>
     * An array of destination configuration objects. Only one destination configuration object is supported.
     * </p>
     * 
     * @return An array of destination configuration objects. Only one destination configuration object is supported.
     */

    public java.util.List<DestinationToCreate> getDestinations() {
        if (destinations == null) {
            destinations = new com.amazonaws.internal.SdkInternalList<DestinationToCreate>();
        }
        return destinations;
    }

    /**
     * <p>
     * An array of destination configuration objects. Only one destination configuration object is supported.
     * </p>
     * 
     * @param destinations
     *        An array of destination configuration objects. Only one destination configuration object is supported.
     */

    public void setDestinations(java.util.Collection<DestinationToCreate> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new com.amazonaws.internal.SdkInternalList<DestinationToCreate>(destinations);
    }

    /**
     * <p>
     * An array of destination configuration objects. Only one destination configuration object is supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        An array of destination configuration objects. Only one destination configuration object is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationRequest withDestinations(DestinationToCreate... destinations) {
        if (this.destinations == null) {
            setDestinations(new com.amazonaws.internal.SdkInternalList<DestinationToCreate>(destinations.length));
        }
        for (DestinationToCreate ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of destination configuration objects. Only one destination configuration object is supported.
     * </p>
     * 
     * @param destinations
     *        An array of destination configuration objects. Only one destination configuration object is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationRequest withDestinations(java.util.Collection<DestinationToCreate> destinations) {
        setDestinations(destinations);
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
        if (getSourceFileSystemId() != null)
            sb.append("SourceFileSystemId: ").append(getSourceFileSystemId()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReplicationConfigurationRequest == false)
            return false;
        CreateReplicationConfigurationRequest other = (CreateReplicationConfigurationRequest) obj;
        if (other.getSourceFileSystemId() == null ^ this.getSourceFileSystemId() == null)
            return false;
        if (other.getSourceFileSystemId() != null && other.getSourceFileSystemId().equals(this.getSourceFileSystemId()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceFileSystemId() == null) ? 0 : getSourceFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        return hashCode;
    }

    @Override
    public CreateReplicationConfigurationRequest clone() {
        return (CreateReplicationConfigurationRequest) super.clone();
    }

}
