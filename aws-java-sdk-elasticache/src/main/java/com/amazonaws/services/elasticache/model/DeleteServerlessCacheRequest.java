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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteServerlessCache" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteServerlessCacheRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the serverless cache to be deleted.
     * </p>
     */
    private String serverlessCacheName;
    /**
     * <p>
     * Name of the final snapshot to be taken before the serverless cache is deleted. Available for Redis only. Default:
     * NULL, i.e. a final snapshot is not taken.
     * </p>
     */
    private String finalSnapshotName;

    /**
     * <p>
     * The identifier of the serverless cache to be deleted.
     * </p>
     * 
     * @param serverlessCacheName
     *        The identifier of the serverless cache to be deleted.
     */

    public void setServerlessCacheName(String serverlessCacheName) {
        this.serverlessCacheName = serverlessCacheName;
    }

    /**
     * <p>
     * The identifier of the serverless cache to be deleted.
     * </p>
     * 
     * @return The identifier of the serverless cache to be deleted.
     */

    public String getServerlessCacheName() {
        return this.serverlessCacheName;
    }

    /**
     * <p>
     * The identifier of the serverless cache to be deleted.
     * </p>
     * 
     * @param serverlessCacheName
     *        The identifier of the serverless cache to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServerlessCacheRequest withServerlessCacheName(String serverlessCacheName) {
        setServerlessCacheName(serverlessCacheName);
        return this;
    }

    /**
     * <p>
     * Name of the final snapshot to be taken before the serverless cache is deleted. Available for Redis only. Default:
     * NULL, i.e. a final snapshot is not taken.
     * </p>
     * 
     * @param finalSnapshotName
     *        Name of the final snapshot to be taken before the serverless cache is deleted. Available for Redis only.
     *        Default: NULL, i.e. a final snapshot is not taken.
     */

    public void setFinalSnapshotName(String finalSnapshotName) {
        this.finalSnapshotName = finalSnapshotName;
    }

    /**
     * <p>
     * Name of the final snapshot to be taken before the serverless cache is deleted. Available for Redis only. Default:
     * NULL, i.e. a final snapshot is not taken.
     * </p>
     * 
     * @return Name of the final snapshot to be taken before the serverless cache is deleted. Available for Redis only.
     *         Default: NULL, i.e. a final snapshot is not taken.
     */

    public String getFinalSnapshotName() {
        return this.finalSnapshotName;
    }

    /**
     * <p>
     * Name of the final snapshot to be taken before the serverless cache is deleted. Available for Redis only. Default:
     * NULL, i.e. a final snapshot is not taken.
     * </p>
     * 
     * @param finalSnapshotName
     *        Name of the final snapshot to be taken before the serverless cache is deleted. Available for Redis only.
     *        Default: NULL, i.e. a final snapshot is not taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteServerlessCacheRequest withFinalSnapshotName(String finalSnapshotName) {
        setFinalSnapshotName(finalSnapshotName);
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
        if (getServerlessCacheName() != null)
            sb.append("ServerlessCacheName: ").append(getServerlessCacheName()).append(",");
        if (getFinalSnapshotName() != null)
            sb.append("FinalSnapshotName: ").append(getFinalSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteServerlessCacheRequest == false)
            return false;
        DeleteServerlessCacheRequest other = (DeleteServerlessCacheRequest) obj;
        if (other.getServerlessCacheName() == null ^ this.getServerlessCacheName() == null)
            return false;
        if (other.getServerlessCacheName() != null && other.getServerlessCacheName().equals(this.getServerlessCacheName()) == false)
            return false;
        if (other.getFinalSnapshotName() == null ^ this.getFinalSnapshotName() == null)
            return false;
        if (other.getFinalSnapshotName() != null && other.getFinalSnapshotName().equals(this.getFinalSnapshotName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerlessCacheName() == null) ? 0 : getServerlessCacheName().hashCode());
        hashCode = prime * hashCode + ((getFinalSnapshotName() == null) ? 0 : getFinalSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteServerlessCacheRequest clone() {
        return (DeleteServerlessCacheRequest) super.clone();
    }

}
