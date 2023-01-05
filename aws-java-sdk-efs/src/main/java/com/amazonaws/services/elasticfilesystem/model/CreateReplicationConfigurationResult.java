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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateReplicationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReplicationConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the source Amazon EFS file system that is being replicated.
     * </p>
     */
    private String sourceFileSystemId;
    /**
     * <p>
     * The Amazon Web Services Region in which the source Amazon EFS file system is located.
     * </p>
     */
    private String sourceFileSystemRegion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current source file system in the replication configuration.
     * </p>
     */
    private String sourceFileSystemArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the original source Amazon EFS file system in the replication configuration.
     * </p>
     */
    private String originalSourceFileSystemArn;
    /**
     * <p>
     * Describes when the replication configuration was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * An array of destination objects. Only one destination object is supported.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Destination> destinations;

    /**
     * <p>
     * The ID of the source Amazon EFS file system that is being replicated.
     * </p>
     * 
     * @param sourceFileSystemId
     *        The ID of the source Amazon EFS file system that is being replicated.
     */

    public void setSourceFileSystemId(String sourceFileSystemId) {
        this.sourceFileSystemId = sourceFileSystemId;
    }

    /**
     * <p>
     * The ID of the source Amazon EFS file system that is being replicated.
     * </p>
     * 
     * @return The ID of the source Amazon EFS file system that is being replicated.
     */

    public String getSourceFileSystemId() {
        return this.sourceFileSystemId;
    }

    /**
     * <p>
     * The ID of the source Amazon EFS file system that is being replicated.
     * </p>
     * 
     * @param sourceFileSystemId
     *        The ID of the source Amazon EFS file system that is being replicated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationResult withSourceFileSystemId(String sourceFileSystemId) {
        setSourceFileSystemId(sourceFileSystemId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the source Amazon EFS file system is located.
     * </p>
     * 
     * @param sourceFileSystemRegion
     *        The Amazon Web Services Region in which the source Amazon EFS file system is located.
     */

    public void setSourceFileSystemRegion(String sourceFileSystemRegion) {
        this.sourceFileSystemRegion = sourceFileSystemRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the source Amazon EFS file system is located.
     * </p>
     * 
     * @return The Amazon Web Services Region in which the source Amazon EFS file system is located.
     */

    public String getSourceFileSystemRegion() {
        return this.sourceFileSystemRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which the source Amazon EFS file system is located.
     * </p>
     * 
     * @param sourceFileSystemRegion
     *        The Amazon Web Services Region in which the source Amazon EFS file system is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationResult withSourceFileSystemRegion(String sourceFileSystemRegion) {
        setSourceFileSystemRegion(sourceFileSystemRegion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current source file system in the replication configuration.
     * </p>
     * 
     * @param sourceFileSystemArn
     *        The Amazon Resource Name (ARN) of the current source file system in the replication configuration.
     */

    public void setSourceFileSystemArn(String sourceFileSystemArn) {
        this.sourceFileSystemArn = sourceFileSystemArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current source file system in the replication configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the current source file system in the replication configuration.
     */

    public String getSourceFileSystemArn() {
        return this.sourceFileSystemArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the current source file system in the replication configuration.
     * </p>
     * 
     * @param sourceFileSystemArn
     *        The Amazon Resource Name (ARN) of the current source file system in the replication configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationResult withSourceFileSystemArn(String sourceFileSystemArn) {
        setSourceFileSystemArn(sourceFileSystemArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the original source Amazon EFS file system in the replication configuration.
     * </p>
     * 
     * @param originalSourceFileSystemArn
     *        The Amazon Resource Name (ARN) of the original source Amazon EFS file system in the replication
     *        configuration.
     */

    public void setOriginalSourceFileSystemArn(String originalSourceFileSystemArn) {
        this.originalSourceFileSystemArn = originalSourceFileSystemArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the original source Amazon EFS file system in the replication configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the original source Amazon EFS file system in the replication
     *         configuration.
     */

    public String getOriginalSourceFileSystemArn() {
        return this.originalSourceFileSystemArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the original source Amazon EFS file system in the replication configuration.
     * </p>
     * 
     * @param originalSourceFileSystemArn
     *        The Amazon Resource Name (ARN) of the original source Amazon EFS file system in the replication
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationResult withOriginalSourceFileSystemArn(String originalSourceFileSystemArn) {
        setOriginalSourceFileSystemArn(originalSourceFileSystemArn);
        return this;
    }

    /**
     * <p>
     * Describes when the replication configuration was created.
     * </p>
     * 
     * @param creationTime
     *        Describes when the replication configuration was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Describes when the replication configuration was created.
     * </p>
     * 
     * @return Describes when the replication configuration was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Describes when the replication configuration was created.
     * </p>
     * 
     * @param creationTime
     *        Describes when the replication configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * An array of destination objects. Only one destination object is supported.
     * </p>
     * 
     * @return An array of destination objects. Only one destination object is supported.
     */

    public java.util.List<Destination> getDestinations() {
        if (destinations == null) {
            destinations = new com.amazonaws.internal.SdkInternalList<Destination>();
        }
        return destinations;
    }

    /**
     * <p>
     * An array of destination objects. Only one destination object is supported.
     * </p>
     * 
     * @param destinations
     *        An array of destination objects. Only one destination object is supported.
     */

    public void setDestinations(java.util.Collection<Destination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new com.amazonaws.internal.SdkInternalList<Destination>(destinations);
    }

    /**
     * <p>
     * An array of destination objects. Only one destination object is supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        An array of destination objects. Only one destination object is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationResult withDestinations(Destination... destinations) {
        if (this.destinations == null) {
            setDestinations(new com.amazonaws.internal.SdkInternalList<Destination>(destinations.length));
        }
        for (Destination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of destination objects. Only one destination object is supported.
     * </p>
     * 
     * @param destinations
     *        An array of destination objects. Only one destination object is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationConfigurationResult withDestinations(java.util.Collection<Destination> destinations) {
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
        if (getSourceFileSystemRegion() != null)
            sb.append("SourceFileSystemRegion: ").append(getSourceFileSystemRegion()).append(",");
        if (getSourceFileSystemArn() != null)
            sb.append("SourceFileSystemArn: ").append(getSourceFileSystemArn()).append(",");
        if (getOriginalSourceFileSystemArn() != null)
            sb.append("OriginalSourceFileSystemArn: ").append(getOriginalSourceFileSystemArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
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

        if (obj instanceof CreateReplicationConfigurationResult == false)
            return false;
        CreateReplicationConfigurationResult other = (CreateReplicationConfigurationResult) obj;
        if (other.getSourceFileSystemId() == null ^ this.getSourceFileSystemId() == null)
            return false;
        if (other.getSourceFileSystemId() != null && other.getSourceFileSystemId().equals(this.getSourceFileSystemId()) == false)
            return false;
        if (other.getSourceFileSystemRegion() == null ^ this.getSourceFileSystemRegion() == null)
            return false;
        if (other.getSourceFileSystemRegion() != null && other.getSourceFileSystemRegion().equals(this.getSourceFileSystemRegion()) == false)
            return false;
        if (other.getSourceFileSystemArn() == null ^ this.getSourceFileSystemArn() == null)
            return false;
        if (other.getSourceFileSystemArn() != null && other.getSourceFileSystemArn().equals(this.getSourceFileSystemArn()) == false)
            return false;
        if (other.getOriginalSourceFileSystemArn() == null ^ this.getOriginalSourceFileSystemArn() == null)
            return false;
        if (other.getOriginalSourceFileSystemArn() != null && other.getOriginalSourceFileSystemArn().equals(this.getOriginalSourceFileSystemArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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
        hashCode = prime * hashCode + ((getSourceFileSystemRegion() == null) ? 0 : getSourceFileSystemRegion().hashCode());
        hashCode = prime * hashCode + ((getSourceFileSystemArn() == null) ? 0 : getSourceFileSystemArn().hashCode());
        hashCode = prime * hashCode + ((getOriginalSourceFileSystemArn() == null) ? 0 : getOriginalSourceFileSystemArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        return hashCode;
    }

    @Override
    public CreateReplicationConfigurationResult clone() {
        try {
            return (CreateReplicationConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
