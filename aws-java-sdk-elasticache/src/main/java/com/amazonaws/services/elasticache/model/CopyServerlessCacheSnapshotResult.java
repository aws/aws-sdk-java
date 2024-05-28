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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CopyServerlessCacheSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyServerlessCacheSnapshotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The response for the attempt to copy the serverless cache snapshot. Available for Redis only.
     * </p>
     */
    private ServerlessCacheSnapshot serverlessCacheSnapshot;

    /**
     * <p>
     * The response for the attempt to copy the serverless cache snapshot. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheSnapshot
     *        The response for the attempt to copy the serverless cache snapshot. Available for Redis only.
     */

    public void setServerlessCacheSnapshot(ServerlessCacheSnapshot serverlessCacheSnapshot) {
        this.serverlessCacheSnapshot = serverlessCacheSnapshot;
    }

    /**
     * <p>
     * The response for the attempt to copy the serverless cache snapshot. Available for Redis only.
     * </p>
     * 
     * @return The response for the attempt to copy the serverless cache snapshot. Available for Redis only.
     */

    public ServerlessCacheSnapshot getServerlessCacheSnapshot() {
        return this.serverlessCacheSnapshot;
    }

    /**
     * <p>
     * The response for the attempt to copy the serverless cache snapshot. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheSnapshot
     *        The response for the attempt to copy the serverless cache snapshot. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyServerlessCacheSnapshotResult withServerlessCacheSnapshot(ServerlessCacheSnapshot serverlessCacheSnapshot) {
        setServerlessCacheSnapshot(serverlessCacheSnapshot);
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
        if (getServerlessCacheSnapshot() != null)
            sb.append("ServerlessCacheSnapshot: ").append(getServerlessCacheSnapshot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyServerlessCacheSnapshotResult == false)
            return false;
        CopyServerlessCacheSnapshotResult other = (CopyServerlessCacheSnapshotResult) obj;
        if (other.getServerlessCacheSnapshot() == null ^ this.getServerlessCacheSnapshot() == null)
            return false;
        if (other.getServerlessCacheSnapshot() != null && other.getServerlessCacheSnapshot().equals(this.getServerlessCacheSnapshot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerlessCacheSnapshot() == null) ? 0 : getServerlessCacheSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public CopyServerlessCacheSnapshotResult clone() {
        try {
            return (CopyServerlessCacheSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
