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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ModifyServerlessCache" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyServerlessCacheResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The response for the attempt to modify the serverless cache.
     * </p>
     */
    private ServerlessCache serverlessCache;

    /**
     * <p>
     * The response for the attempt to modify the serverless cache.
     * </p>
     * 
     * @param serverlessCache
     *        The response for the attempt to modify the serverless cache.
     */

    public void setServerlessCache(ServerlessCache serverlessCache) {
        this.serverlessCache = serverlessCache;
    }

    /**
     * <p>
     * The response for the attempt to modify the serverless cache.
     * </p>
     * 
     * @return The response for the attempt to modify the serverless cache.
     */

    public ServerlessCache getServerlessCache() {
        return this.serverlessCache;
    }

    /**
     * <p>
     * The response for the attempt to modify the serverless cache.
     * </p>
     * 
     * @param serverlessCache
     *        The response for the attempt to modify the serverless cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyServerlessCacheResult withServerlessCache(ServerlessCache serverlessCache) {
        setServerlessCache(serverlessCache);
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
        if (getServerlessCache() != null)
            sb.append("ServerlessCache: ").append(getServerlessCache());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyServerlessCacheResult == false)
            return false;
        ModifyServerlessCacheResult other = (ModifyServerlessCacheResult) obj;
        if (other.getServerlessCache() == null ^ this.getServerlessCache() == null)
            return false;
        if (other.getServerlessCache() != null && other.getServerlessCache().equals(this.getServerlessCache()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerlessCache() == null) ? 0 : getServerlessCache().hashCode());
        return hashCode;
    }

    @Override
    public ModifyServerlessCacheResult clone() {
        try {
            return (ModifyServerlessCacheResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
