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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DeleteReplicationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteReplicationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the source file system in the replication configuration.
     * </p>
     */
    private String sourceFileSystemId;

    /**
     * <p>
     * The ID of the source file system in the replication configuration.
     * </p>
     * 
     * @param sourceFileSystemId
     *        The ID of the source file system in the replication configuration.
     */

    public void setSourceFileSystemId(String sourceFileSystemId) {
        this.sourceFileSystemId = sourceFileSystemId;
    }

    /**
     * <p>
     * The ID of the source file system in the replication configuration.
     * </p>
     * 
     * @return The ID of the source file system in the replication configuration.
     */

    public String getSourceFileSystemId() {
        return this.sourceFileSystemId;
    }

    /**
     * <p>
     * The ID of the source file system in the replication configuration.
     * </p>
     * 
     * @param sourceFileSystemId
     *        The ID of the source file system in the replication configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteReplicationConfigurationRequest withSourceFileSystemId(String sourceFileSystemId) {
        setSourceFileSystemId(sourceFileSystemId);
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
            sb.append("SourceFileSystemId: ").append(getSourceFileSystemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteReplicationConfigurationRequest == false)
            return false;
        DeleteReplicationConfigurationRequest other = (DeleteReplicationConfigurationRequest) obj;
        if (other.getSourceFileSystemId() == null ^ this.getSourceFileSystemId() == null)
            return false;
        if (other.getSourceFileSystemId() != null && other.getSourceFileSystemId().equals(this.getSourceFileSystemId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceFileSystemId() == null) ? 0 : getSourceFileSystemId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteReplicationConfigurationRequest clone() {
        return (DeleteReplicationConfigurationRequest) super.clone();
    }

}
