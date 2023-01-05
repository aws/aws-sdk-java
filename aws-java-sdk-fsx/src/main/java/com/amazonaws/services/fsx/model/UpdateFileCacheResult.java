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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileCache" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileCacheResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the cache that was updated.
     * </p>
     */
    private FileCache fileCache;

    /**
     * <p>
     * A description of the cache that was updated.
     * </p>
     * 
     * @param fileCache
     *        A description of the cache that was updated.
     */

    public void setFileCache(FileCache fileCache) {
        this.fileCache = fileCache;
    }

    /**
     * <p>
     * A description of the cache that was updated.
     * </p>
     * 
     * @return A description of the cache that was updated.
     */

    public FileCache getFileCache() {
        return this.fileCache;
    }

    /**
     * <p>
     * A description of the cache that was updated.
     * </p>
     * 
     * @param fileCache
     *        A description of the cache that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileCacheResult withFileCache(FileCache fileCache) {
        setFileCache(fileCache);
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
        if (getFileCache() != null)
            sb.append("FileCache: ").append(getFileCache());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileCacheResult == false)
            return false;
        UpdateFileCacheResult other = (UpdateFileCacheResult) obj;
        if (other.getFileCache() == null ^ this.getFileCache() == null)
            return false;
        if (other.getFileCache() != null && other.getFileCache().equals(this.getFileCache()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileCache() == null) ? 0 : getFileCache().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFileCacheResult clone() {
        try {
            return (UpdateFileCacheResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
