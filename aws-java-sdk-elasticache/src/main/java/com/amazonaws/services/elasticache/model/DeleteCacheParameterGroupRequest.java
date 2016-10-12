/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>DeleteCacheParameterGroup</code> operation.
 * </p>
 */
public class DeleteCacheParameterGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cache parameter group to delete.
     * </p>
     * <note>
     * <p>
     * The specified cache security group must not be associated with any cache clusters.
     * </p>
     * </note>
     */
    private String cacheParameterGroupName;

    /**
     * Default constructor for DeleteCacheParameterGroupRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DeleteCacheParameterGroupRequest() {
    }

    /**
     * Constructs a new DeleteCacheParameterGroupRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group to delete.</p> <note>
     *        <p>
     *        The specified cache security group must not be associated with any cache clusters.
     *        </p>
     */
    public DeleteCacheParameterGroupRequest(String cacheParameterGroupName) {
        setCacheParameterGroupName(cacheParameterGroupName);
    }

    /**
     * <p>
     * The name of the cache parameter group to delete.
     * </p>
     * <note>
     * <p>
     * The specified cache security group must not be associated with any cache clusters.
     * </p>
     * </note>
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group to delete.</p> <note>
     *        <p>
     *        The specified cache security group must not be associated with any cache clusters.
     *        </p>
     */

    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to delete.
     * </p>
     * <note>
     * <p>
     * The specified cache security group must not be associated with any cache clusters.
     * </p>
     * </note>
     * 
     * @return The name of the cache parameter group to delete.</p> <note>
     *         <p>
     *         The specified cache security group must not be associated with any cache clusters.
     *         </p>
     */

    public String getCacheParameterGroupName() {
        return this.cacheParameterGroupName;
    }

    /**
     * <p>
     * The name of the cache parameter group to delete.
     * </p>
     * <note>
     * <p>
     * The specified cache security group must not be associated with any cache clusters.
     * </p>
     * </note>
     * 
     * @param cacheParameterGroupName
     *        The name of the cache parameter group to delete.</p> <note>
     *        <p>
     *        The specified cache security group must not be associated with any cache clusters.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCacheParameterGroupRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        setCacheParameterGroupName(cacheParameterGroupName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: " + getCacheParameterGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCacheParameterGroupRequest == false)
            return false;
        DeleteCacheParameterGroupRequest other = (DeleteCacheParameterGroupRequest) obj;
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCacheParameterGroupRequest clone() {
        return (DeleteCacheParameterGroupRequest) super.clone();
    }
}
