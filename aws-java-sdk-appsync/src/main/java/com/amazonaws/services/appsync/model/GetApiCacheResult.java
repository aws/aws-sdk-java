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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>GetApiCache</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetApiCache" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApiCacheResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>ApiCache</code> object.
     * </p>
     */
    private ApiCache apiCache;

    /**
     * <p>
     * The <code>ApiCache</code> object.
     * </p>
     * 
     * @param apiCache
     *        The <code>ApiCache</code> object.
     */

    public void setApiCache(ApiCache apiCache) {
        this.apiCache = apiCache;
    }

    /**
     * <p>
     * The <code>ApiCache</code> object.
     * </p>
     * 
     * @return The <code>ApiCache</code> object.
     */

    public ApiCache getApiCache() {
        return this.apiCache;
    }

    /**
     * <p>
     * The <code>ApiCache</code> object.
     * </p>
     * 
     * @param apiCache
     *        The <code>ApiCache</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApiCacheResult withApiCache(ApiCache apiCache) {
        setApiCache(apiCache);
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
        if (getApiCache() != null)
            sb.append("ApiCache: ").append(getApiCache());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApiCacheResult == false)
            return false;
        GetApiCacheResult other = (GetApiCacheResult) obj;
        if (other.getApiCache() == null ^ this.getApiCache() == null)
            return false;
        if (other.getApiCache() != null && other.getApiCache().equals(this.getApiCache()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiCache() == null) ? 0 : getApiCache().hashCode());
        return hashCode;
    }

    @Override
    public GetApiCacheResult clone() {
        try {
            return (GetApiCacheResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
