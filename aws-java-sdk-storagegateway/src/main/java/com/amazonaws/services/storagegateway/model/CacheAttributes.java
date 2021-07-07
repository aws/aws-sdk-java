/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The refresh cache information for the file share or FSx file systems.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/CacheAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Refreshes a file share's cache by using Time To Live (TTL). TTL is the length of time since the last refresh
     * after which access to the directory would cause the file gateway to first refresh that directory's contents from
     * the Amazon S3 bucket or Amazon FSx file system. The TTL duration is in seconds.
     * </p>
     * <p>
     * Valid Values:0, 300 to 2,592,000 seconds (5 minutes to 30 days)
     * </p>
     */
    private Integer cacheStaleTimeoutInSeconds;

    /**
     * <p>
     * Refreshes a file share's cache by using Time To Live (TTL). TTL is the length of time since the last refresh
     * after which access to the directory would cause the file gateway to first refresh that directory's contents from
     * the Amazon S3 bucket or Amazon FSx file system. The TTL duration is in seconds.
     * </p>
     * <p>
     * Valid Values:0, 300 to 2,592,000 seconds (5 minutes to 30 days)
     * </p>
     * 
     * @param cacheStaleTimeoutInSeconds
     *        Refreshes a file share's cache by using Time To Live (TTL). TTL is the length of time since the last
     *        refresh after which access to the directory would cause the file gateway to first refresh that directory's
     *        contents from the Amazon S3 bucket or Amazon FSx file system. The TTL duration is in seconds.</p>
     *        <p>
     *        Valid Values:0, 300 to 2,592,000 seconds (5 minutes to 30 days)
     */

    public void setCacheStaleTimeoutInSeconds(Integer cacheStaleTimeoutInSeconds) {
        this.cacheStaleTimeoutInSeconds = cacheStaleTimeoutInSeconds;
    }

    /**
     * <p>
     * Refreshes a file share's cache by using Time To Live (TTL). TTL is the length of time since the last refresh
     * after which access to the directory would cause the file gateway to first refresh that directory's contents from
     * the Amazon S3 bucket or Amazon FSx file system. The TTL duration is in seconds.
     * </p>
     * <p>
     * Valid Values:0, 300 to 2,592,000 seconds (5 minutes to 30 days)
     * </p>
     * 
     * @return Refreshes a file share's cache by using Time To Live (TTL). TTL is the length of time since the last
     *         refresh after which access to the directory would cause the file gateway to first refresh that
     *         directory's contents from the Amazon S3 bucket or Amazon FSx file system. The TTL duration is in
     *         seconds.</p>
     *         <p>
     *         Valid Values:0, 300 to 2,592,000 seconds (5 minutes to 30 days)
     */

    public Integer getCacheStaleTimeoutInSeconds() {
        return this.cacheStaleTimeoutInSeconds;
    }

    /**
     * <p>
     * Refreshes a file share's cache by using Time To Live (TTL). TTL is the length of time since the last refresh
     * after which access to the directory would cause the file gateway to first refresh that directory's contents from
     * the Amazon S3 bucket or Amazon FSx file system. The TTL duration is in seconds.
     * </p>
     * <p>
     * Valid Values:0, 300 to 2,592,000 seconds (5 minutes to 30 days)
     * </p>
     * 
     * @param cacheStaleTimeoutInSeconds
     *        Refreshes a file share's cache by using Time To Live (TTL). TTL is the length of time since the last
     *        refresh after which access to the directory would cause the file gateway to first refresh that directory's
     *        contents from the Amazon S3 bucket or Amazon FSx file system. The TTL duration is in seconds.</p>
     *        <p>
     *        Valid Values:0, 300 to 2,592,000 seconds (5 minutes to 30 days)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheAttributes withCacheStaleTimeoutInSeconds(Integer cacheStaleTimeoutInSeconds) {
        setCacheStaleTimeoutInSeconds(cacheStaleTimeoutInSeconds);
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
        if (getCacheStaleTimeoutInSeconds() != null)
            sb.append("CacheStaleTimeoutInSeconds: ").append(getCacheStaleTimeoutInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheAttributes == false)
            return false;
        CacheAttributes other = (CacheAttributes) obj;
        if (other.getCacheStaleTimeoutInSeconds() == null ^ this.getCacheStaleTimeoutInSeconds() == null)
            return false;
        if (other.getCacheStaleTimeoutInSeconds() != null && other.getCacheStaleTimeoutInSeconds().equals(this.getCacheStaleTimeoutInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheStaleTimeoutInSeconds() == null) ? 0 : getCacheStaleTimeoutInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public CacheAttributes clone() {
        try {
            return (CacheAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.CacheAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
