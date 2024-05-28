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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure of database cache configuration that is used for mapping database paths to cache types in clusters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxDatabaseCacheConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxDatabaseCacheConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of disk cache. This parameter is used to map the database path to cache storage. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CACHE_1000 – This type provides at least 1000 MB/s disk access throughput.
     * </p>
     * </li>
     * </ul>
     */
    private String cacheType;
    /**
     * <p>
     * Specifies the portions of database that will be loaded into the cache for access.
     * </p>
     */
    private java.util.List<String> dbPaths;
    /**
     * <p>
     * The name of the dataview to be used for caching historical data on disk.
     * </p>
     */
    private String dataviewName;

    /**
     * <p>
     * The type of disk cache. This parameter is used to map the database path to cache storage. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CACHE_1000 – This type provides at least 1000 MB/s disk access throughput.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cacheType
     *        The type of disk cache. This parameter is used to map the database path to cache storage. The valid values
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CACHE_1000 – This type provides at least 1000 MB/s disk access throughput.
     *        </p>
     *        </li>
     */

    public void setCacheType(String cacheType) {
        this.cacheType = cacheType;
    }

    /**
     * <p>
     * The type of disk cache. This parameter is used to map the database path to cache storage. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CACHE_1000 – This type provides at least 1000 MB/s disk access throughput.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of disk cache. This parameter is used to map the database path to cache storage. The valid
     *         values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         CACHE_1000 – This type provides at least 1000 MB/s disk access throughput.
     *         </p>
     *         </li>
     */

    public String getCacheType() {
        return this.cacheType;
    }

    /**
     * <p>
     * The type of disk cache. This parameter is used to map the database path to cache storage. The valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CACHE_1000 – This type provides at least 1000 MB/s disk access throughput.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cacheType
     *        The type of disk cache. This parameter is used to map the database path to cache storage. The valid values
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CACHE_1000 – This type provides at least 1000 MB/s disk access throughput.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDatabaseCacheConfiguration withCacheType(String cacheType) {
        setCacheType(cacheType);
        return this;
    }

    /**
     * <p>
     * Specifies the portions of database that will be loaded into the cache for access.
     * </p>
     * 
     * @return Specifies the portions of database that will be loaded into the cache for access.
     */

    public java.util.List<String> getDbPaths() {
        return dbPaths;
    }

    /**
     * <p>
     * Specifies the portions of database that will be loaded into the cache for access.
     * </p>
     * 
     * @param dbPaths
     *        Specifies the portions of database that will be loaded into the cache for access.
     */

    public void setDbPaths(java.util.Collection<String> dbPaths) {
        if (dbPaths == null) {
            this.dbPaths = null;
            return;
        }

        this.dbPaths = new java.util.ArrayList<String>(dbPaths);
    }

    /**
     * <p>
     * Specifies the portions of database that will be loaded into the cache for access.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDbPaths(java.util.Collection)} or {@link #withDbPaths(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param dbPaths
     *        Specifies the portions of database that will be loaded into the cache for access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDatabaseCacheConfiguration withDbPaths(String... dbPaths) {
        if (this.dbPaths == null) {
            setDbPaths(new java.util.ArrayList<String>(dbPaths.length));
        }
        for (String ele : dbPaths) {
            this.dbPaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the portions of database that will be loaded into the cache for access.
     * </p>
     * 
     * @param dbPaths
     *        Specifies the portions of database that will be loaded into the cache for access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDatabaseCacheConfiguration withDbPaths(java.util.Collection<String> dbPaths) {
        setDbPaths(dbPaths);
        return this;
    }

    /**
     * <p>
     * The name of the dataview to be used for caching historical data on disk.
     * </p>
     * 
     * @param dataviewName
     *        The name of the dataview to be used for caching historical data on disk.
     */

    public void setDataviewName(String dataviewName) {
        this.dataviewName = dataviewName;
    }

    /**
     * <p>
     * The name of the dataview to be used for caching historical data on disk.
     * </p>
     * 
     * @return The name of the dataview to be used for caching historical data on disk.
     */

    public String getDataviewName() {
        return this.dataviewName;
    }

    /**
     * <p>
     * The name of the dataview to be used for caching historical data on disk.
     * </p>
     * 
     * @param dataviewName
     *        The name of the dataview to be used for caching historical data on disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDatabaseCacheConfiguration withDataviewName(String dataviewName) {
        setDataviewName(dataviewName);
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
        if (getCacheType() != null)
            sb.append("CacheType: ").append(getCacheType()).append(",");
        if (getDbPaths() != null)
            sb.append("DbPaths: ").append(getDbPaths()).append(",");
        if (getDataviewName() != null)
            sb.append("DataviewName: ").append(getDataviewName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxDatabaseCacheConfiguration == false)
            return false;
        KxDatabaseCacheConfiguration other = (KxDatabaseCacheConfiguration) obj;
        if (other.getCacheType() == null ^ this.getCacheType() == null)
            return false;
        if (other.getCacheType() != null && other.getCacheType().equals(this.getCacheType()) == false)
            return false;
        if (other.getDbPaths() == null ^ this.getDbPaths() == null)
            return false;
        if (other.getDbPaths() != null && other.getDbPaths().equals(this.getDbPaths()) == false)
            return false;
        if (other.getDataviewName() == null ^ this.getDataviewName() == null)
            return false;
        if (other.getDataviewName() != null && other.getDataviewName().equals(this.getDataviewName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheType() == null) ? 0 : getCacheType().hashCode());
        hashCode = prime * hashCode + ((getDbPaths() == null) ? 0 : getDbPaths().hashCode());
        hashCode = prime * hashCode + ((getDataviewName() == null) ? 0 : getDataviewName().hashCode());
        return hashCode;
    }

    @Override
    public KxDatabaseCacheConfiguration clone() {
        try {
            return (KxDatabaseCacheConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxDatabaseCacheConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
