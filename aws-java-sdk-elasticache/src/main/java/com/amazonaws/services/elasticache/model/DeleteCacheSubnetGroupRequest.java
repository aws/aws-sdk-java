/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Represents the input of a <code>DeleteCacheSubnetGroup</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DeleteCacheSubnetGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCacheSubnetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cache subnet group to delete.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     */
    private String cacheSubnetGroupName;

    /**
     * <p>
     * The name of the cache subnet group to delete.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     * 
     * @param cacheSubnetGroupName
     *        The name of the cache subnet group to delete.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     */

    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group to delete.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     * 
     * @return The name of the cache subnet group to delete.</p>
     *         <p>
     *         Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     */

    public String getCacheSubnetGroupName() {
        return this.cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group to delete.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     * 
     * @param cacheSubnetGroupName
     *        The name of the cache subnet group to delete.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCacheSubnetGroupRequest withCacheSubnetGroupName(String cacheSubnetGroupName) {
        setCacheSubnetGroupName(cacheSubnetGroupName);
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
        if (getCacheSubnetGroupName() != null)
            sb.append("CacheSubnetGroupName: ").append(getCacheSubnetGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCacheSubnetGroupRequest == false)
            return false;
        DeleteCacheSubnetGroupRequest other = (DeleteCacheSubnetGroupRequest) obj;
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null)
            return false;
        if (other.getCacheSubnetGroupName() != null && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCacheSubnetGroupRequest clone() {
        return (DeleteCacheSubnetGroupRequest) super.clone();
    }

}
