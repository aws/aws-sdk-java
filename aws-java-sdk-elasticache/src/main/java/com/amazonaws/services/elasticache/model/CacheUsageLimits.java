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
 * <p>
 * The usage limits for storage and ElastiCache Processing Units for the cache.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CacheUsageLimits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheUsageLimits implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum data storage limit in the cache, expressed in Gigabytes.
     * </p>
     */
    private DataStorage dataStorage;

    private ECPUPerSecond eCPUPerSecond;

    /**
     * <p>
     * The maximum data storage limit in the cache, expressed in Gigabytes.
     * </p>
     * 
     * @param dataStorage
     *        The maximum data storage limit in the cache, expressed in Gigabytes.
     */

    public void setDataStorage(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    /**
     * <p>
     * The maximum data storage limit in the cache, expressed in Gigabytes.
     * </p>
     * 
     * @return The maximum data storage limit in the cache, expressed in Gigabytes.
     */

    public DataStorage getDataStorage() {
        return this.dataStorage;
    }

    /**
     * <p>
     * The maximum data storage limit in the cache, expressed in Gigabytes.
     * </p>
     * 
     * @param dataStorage
     *        The maximum data storage limit in the cache, expressed in Gigabytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheUsageLimits withDataStorage(DataStorage dataStorage) {
        setDataStorage(dataStorage);
        return this;
    }

    /**
     * @param eCPUPerSecond
     */

    public void setECPUPerSecond(ECPUPerSecond eCPUPerSecond) {
        this.eCPUPerSecond = eCPUPerSecond;
    }

    /**
     * @return
     */

    public ECPUPerSecond getECPUPerSecond() {
        return this.eCPUPerSecond;
    }

    /**
     * @param eCPUPerSecond
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheUsageLimits withECPUPerSecond(ECPUPerSecond eCPUPerSecond) {
        setECPUPerSecond(eCPUPerSecond);
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
        if (getDataStorage() != null)
            sb.append("DataStorage: ").append(getDataStorage()).append(",");
        if (getECPUPerSecond() != null)
            sb.append("ECPUPerSecond: ").append(getECPUPerSecond());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheUsageLimits == false)
            return false;
        CacheUsageLimits other = (CacheUsageLimits) obj;
        if (other.getDataStorage() == null ^ this.getDataStorage() == null)
            return false;
        if (other.getDataStorage() != null && other.getDataStorage().equals(this.getDataStorage()) == false)
            return false;
        if (other.getECPUPerSecond() == null ^ this.getECPUPerSecond() == null)
            return false;
        if (other.getECPUPerSecond() != null && other.getECPUPerSecond().equals(this.getECPUPerSecond()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataStorage() == null) ? 0 : getDataStorage().hashCode());
        hashCode = prime * hashCode + ((getECPUPerSecond() == null) ? 0 : getECPUPerSecond().hashCode());
        return hashCode;
    }

    @Override
    public CacheUsageLimits clone() {
        try {
            return (CacheUsageLimits) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
