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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteServerlessCacheSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteServerlessCacheSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Idenfitier of the snapshot to be deleted. Available for Redis only.
     * </p>
     */
    private String serverlessCacheSnapshotName;

    /**
     * <p>
     * Idenfitier of the snapshot to be deleted. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheSnapshotName
     *        Idenfitier of the snapshot to be deleted. Available for Redis only.
     */

    public void setServerlessCacheSnapshotName(String serverlessCacheSnapshotName) {
        this.serverlessCacheSnapshotName = serverlessCacheSnapshotName;
    }

    /**
     * <p>
     * Idenfitier of the snapshot to be deleted. Available for Redis only.
     * </p>
     * 
     * @return Idenfitier of the snapshot to be deleted. Available for Redis only.
     */

    public String getServerlessCacheSnapshotName() {
        return this.serverlessCacheSnapshotName;
    }

    /**
     * <p>
     * Idenfitier of the snapshot to be deleted. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheSnapshotName
     *        Idenfitier of the snapshot to be deleted. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServerlessCacheSnapshotRequest withServerlessCacheSnapshotName(String serverlessCacheSnapshotName) {
        setServerlessCacheSnapshotName(serverlessCacheSnapshotName);
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
        if (getServerlessCacheSnapshotName() != null)
            sb.append("ServerlessCacheSnapshotName: ").append(getServerlessCacheSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteServerlessCacheSnapshotRequest == false)
            return false;
        DeleteServerlessCacheSnapshotRequest other = (DeleteServerlessCacheSnapshotRequest) obj;
        if (other.getServerlessCacheSnapshotName() == null ^ this.getServerlessCacheSnapshotName() == null)
            return false;
        if (other.getServerlessCacheSnapshotName() != null && other.getServerlessCacheSnapshotName().equals(this.getServerlessCacheSnapshotName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerlessCacheSnapshotName() == null) ? 0 : getServerlessCacheSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteServerlessCacheSnapshotRequest clone() {
        return (DeleteServerlessCacheSnapshotRequest) super.clone();
    }

}
