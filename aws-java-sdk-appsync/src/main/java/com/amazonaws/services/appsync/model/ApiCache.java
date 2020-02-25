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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <code>ApiCache</code> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ApiCache" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiCache implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * TTL in seconds for cache entries.
     * </p>
     * <p>
     * Valid values are between 1 and 3600 seconds.
     * </p>
     */
    private Long ttl;
    /**
     * <p>
     * Caching behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>FULL_REQUEST_CACHING</b>: All requests are fully cached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PER_RESOLVER_CACHING</b>: Individual resovlers that you specify are cached.
     * </p>
     * </li>
     * </ul>
     */
    private String apiCachingBehavior;
    /**
     * <p>
     * Transit encryption flag when connecting to cache. This setting cannot be updated after creation.
     * </p>
     */
    private Boolean transitEncryptionEnabled;
    /**
     * <p>
     * At rest encryption flag for cache. This setting cannot be updated after creation.
     * </p>
     */
    private Boolean atRestEncryptionEnabled;
    /**
     * <p>
     * The cache instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>T2_SMALL</b>: A t2.small instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>T2_MEDIUM</b>: A t2.medium instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_LARGE</b>: A r4.large instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_XLARGE</b>: A r4.xlarge instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_2XLARGE</b>: A r4.2xlarge instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_4XLARGE</b>: A r4.4xlarge instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_8XLARGE</b>: A r4.8xlarge instance type.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The cache instance status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AVAILABLE</b>: The instance is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREATING</b>: The instance is currently creating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b>: The instance is currently deleting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MODIFYING</b>: The instance is currently modifying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED</b>: The instance has failed creation.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * TTL in seconds for cache entries.
     * </p>
     * <p>
     * Valid values are between 1 and 3600 seconds.
     * </p>
     * 
     * @param ttl
     *        TTL in seconds for cache entries.</p>
     *        <p>
     *        Valid values are between 1 and 3600 seconds.
     */

    public void setTtl(Long ttl) {
        this.ttl = ttl;
    }

    /**
     * <p>
     * TTL in seconds for cache entries.
     * </p>
     * <p>
     * Valid values are between 1 and 3600 seconds.
     * </p>
     * 
     * @return TTL in seconds for cache entries.</p>
     *         <p>
     *         Valid values are between 1 and 3600 seconds.
     */

    public Long getTtl() {
        return this.ttl;
    }

    /**
     * <p>
     * TTL in seconds for cache entries.
     * </p>
     * <p>
     * Valid values are between 1 and 3600 seconds.
     * </p>
     * 
     * @param ttl
     *        TTL in seconds for cache entries.</p>
     *        <p>
     *        Valid values are between 1 and 3600 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiCache withTtl(Long ttl) {
        setTtl(ttl);
        return this;
    }

    /**
     * <p>
     * Caching behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>FULL_REQUEST_CACHING</b>: All requests are fully cached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PER_RESOLVER_CACHING</b>: Individual resovlers that you specify are cached.
     * </p>
     * </li>
     * </ul>
     * 
     * @param apiCachingBehavior
     *        Caching behavior.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>FULL_REQUEST_CACHING</b>: All requests are fully cached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PER_RESOLVER_CACHING</b>: Individual resovlers that you specify are cached.
     *        </p>
     *        </li>
     * @see ApiCachingBehavior
     */

    public void setApiCachingBehavior(String apiCachingBehavior) {
        this.apiCachingBehavior = apiCachingBehavior;
    }

    /**
     * <p>
     * Caching behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>FULL_REQUEST_CACHING</b>: All requests are fully cached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PER_RESOLVER_CACHING</b>: Individual resovlers that you specify are cached.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Caching behavior.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>FULL_REQUEST_CACHING</b>: All requests are fully cached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PER_RESOLVER_CACHING</b>: Individual resovlers that you specify are cached.
     *         </p>
     *         </li>
     * @see ApiCachingBehavior
     */

    public String getApiCachingBehavior() {
        return this.apiCachingBehavior;
    }

    /**
     * <p>
     * Caching behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>FULL_REQUEST_CACHING</b>: All requests are fully cached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PER_RESOLVER_CACHING</b>: Individual resovlers that you specify are cached.
     * </p>
     * </li>
     * </ul>
     * 
     * @param apiCachingBehavior
     *        Caching behavior.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>FULL_REQUEST_CACHING</b>: All requests are fully cached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PER_RESOLVER_CACHING</b>: Individual resovlers that you specify are cached.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiCachingBehavior
     */

    public ApiCache withApiCachingBehavior(String apiCachingBehavior) {
        setApiCachingBehavior(apiCachingBehavior);
        return this;
    }

    /**
     * <p>
     * Caching behavior.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>FULL_REQUEST_CACHING</b>: All requests are fully cached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PER_RESOLVER_CACHING</b>: Individual resovlers that you specify are cached.
     * </p>
     * </li>
     * </ul>
     * 
     * @param apiCachingBehavior
     *        Caching behavior.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>FULL_REQUEST_CACHING</b>: All requests are fully cached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PER_RESOLVER_CACHING</b>: Individual resovlers that you specify are cached.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiCachingBehavior
     */

    public ApiCache withApiCachingBehavior(ApiCachingBehavior apiCachingBehavior) {
        this.apiCachingBehavior = apiCachingBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Transit encryption flag when connecting to cache. This setting cannot be updated after creation.
     * </p>
     * 
     * @param transitEncryptionEnabled
     *        Transit encryption flag when connecting to cache. This setting cannot be updated after creation.
     */

    public void setTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
        this.transitEncryptionEnabled = transitEncryptionEnabled;
    }

    /**
     * <p>
     * Transit encryption flag when connecting to cache. This setting cannot be updated after creation.
     * </p>
     * 
     * @return Transit encryption flag when connecting to cache. This setting cannot be updated after creation.
     */

    public Boolean getTransitEncryptionEnabled() {
        return this.transitEncryptionEnabled;
    }

    /**
     * <p>
     * Transit encryption flag when connecting to cache. This setting cannot be updated after creation.
     * </p>
     * 
     * @param transitEncryptionEnabled
     *        Transit encryption flag when connecting to cache. This setting cannot be updated after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiCache withTransitEncryptionEnabled(Boolean transitEncryptionEnabled) {
        setTransitEncryptionEnabled(transitEncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * Transit encryption flag when connecting to cache. This setting cannot be updated after creation.
     * </p>
     * 
     * @return Transit encryption flag when connecting to cache. This setting cannot be updated after creation.
     */

    public Boolean isTransitEncryptionEnabled() {
        return this.transitEncryptionEnabled;
    }

    /**
     * <p>
     * At rest encryption flag for cache. This setting cannot be updated after creation.
     * </p>
     * 
     * @param atRestEncryptionEnabled
     *        At rest encryption flag for cache. This setting cannot be updated after creation.
     */

    public void setAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
        this.atRestEncryptionEnabled = atRestEncryptionEnabled;
    }

    /**
     * <p>
     * At rest encryption flag for cache. This setting cannot be updated after creation.
     * </p>
     * 
     * @return At rest encryption flag for cache. This setting cannot be updated after creation.
     */

    public Boolean getAtRestEncryptionEnabled() {
        return this.atRestEncryptionEnabled;
    }

    /**
     * <p>
     * At rest encryption flag for cache. This setting cannot be updated after creation.
     * </p>
     * 
     * @param atRestEncryptionEnabled
     *        At rest encryption flag for cache. This setting cannot be updated after creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiCache withAtRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
        setAtRestEncryptionEnabled(atRestEncryptionEnabled);
        return this;
    }

    /**
     * <p>
     * At rest encryption flag for cache. This setting cannot be updated after creation.
     * </p>
     * 
     * @return At rest encryption flag for cache. This setting cannot be updated after creation.
     */

    public Boolean isAtRestEncryptionEnabled() {
        return this.atRestEncryptionEnabled;
    }

    /**
     * <p>
     * The cache instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>T2_SMALL</b>: A t2.small instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>T2_MEDIUM</b>: A t2.medium instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_LARGE</b>: A r4.large instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_XLARGE</b>: A r4.xlarge instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_2XLARGE</b>: A r4.2xlarge instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_4XLARGE</b>: A r4.4xlarge instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_8XLARGE</b>: A r4.8xlarge instance type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The cache instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>T2_SMALL</b>: A t2.small instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>T2_MEDIUM</b>: A t2.medium instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>R4_LARGE</b>: A r4.large instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>R4_XLARGE</b>: A r4.xlarge instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>R4_2XLARGE</b>: A r4.2xlarge instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>R4_4XLARGE</b>: A r4.4xlarge instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>R4_8XLARGE</b>: A r4.8xlarge instance type.
     *        </p>
     *        </li>
     * @see ApiCacheType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The cache instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>T2_SMALL</b>: A t2.small instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>T2_MEDIUM</b>: A t2.medium instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_LARGE</b>: A r4.large instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_XLARGE</b>: A r4.xlarge instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_2XLARGE</b>: A r4.2xlarge instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_4XLARGE</b>: A r4.4xlarge instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_8XLARGE</b>: A r4.8xlarge instance type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The cache instance type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>T2_SMALL</b>: A t2.small instance type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>T2_MEDIUM</b>: A t2.medium instance type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>R4_LARGE</b>: A r4.large instance type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>R4_XLARGE</b>: A r4.xlarge instance type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>R4_2XLARGE</b>: A r4.2xlarge instance type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>R4_4XLARGE</b>: A r4.4xlarge instance type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>R4_8XLARGE</b>: A r4.8xlarge instance type.
     *         </p>
     *         </li>
     * @see ApiCacheType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The cache instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>T2_SMALL</b>: A t2.small instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>T2_MEDIUM</b>: A t2.medium instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_LARGE</b>: A r4.large instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_XLARGE</b>: A r4.xlarge instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_2XLARGE</b>: A r4.2xlarge instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_4XLARGE</b>: A r4.4xlarge instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_8XLARGE</b>: A r4.8xlarge instance type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The cache instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>T2_SMALL</b>: A t2.small instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>T2_MEDIUM</b>: A t2.medium instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>R4_LARGE</b>: A r4.large instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>R4_XLARGE</b>: A r4.xlarge instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>R4_2XLARGE</b>: A r4.2xlarge instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>R4_4XLARGE</b>: A r4.4xlarge instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>R4_8XLARGE</b>: A r4.8xlarge instance type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiCacheType
     */

    public ApiCache withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The cache instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>T2_SMALL</b>: A t2.small instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>T2_MEDIUM</b>: A t2.medium instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_LARGE</b>: A r4.large instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_XLARGE</b>: A r4.xlarge instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_2XLARGE</b>: A r4.2xlarge instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_4XLARGE</b>: A r4.4xlarge instance type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>R4_8XLARGE</b>: A r4.8xlarge instance type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The cache instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>T2_SMALL</b>: A t2.small instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>T2_MEDIUM</b>: A t2.medium instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>R4_LARGE</b>: A r4.large instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>R4_XLARGE</b>: A r4.xlarge instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>R4_2XLARGE</b>: A r4.2xlarge instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>R4_4XLARGE</b>: A r4.4xlarge instance type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>R4_8XLARGE</b>: A r4.8xlarge instance type.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiCacheType
     */

    public ApiCache withType(ApiCacheType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The cache instance status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AVAILABLE</b>: The instance is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREATING</b>: The instance is currently creating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b>: The instance is currently deleting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MODIFYING</b>: The instance is currently modifying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED</b>: The instance has failed creation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The cache instance status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AVAILABLE</b>: The instance is available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CREATING</b>: The instance is currently creating.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b>: The instance is currently deleting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MODIFYING</b>: The instance is currently modifying.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAILED</b>: The instance has failed creation.
     *        </p>
     *        </li>
     * @see ApiCacheStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The cache instance status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AVAILABLE</b>: The instance is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREATING</b>: The instance is currently creating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b>: The instance is currently deleting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MODIFYING</b>: The instance is currently modifying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED</b>: The instance has failed creation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The cache instance status.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>AVAILABLE</b>: The instance is available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CREATING</b>: The instance is currently creating.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DELETING</b>: The instance is currently deleting.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MODIFYING</b>: The instance is currently modifying.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FAILED</b>: The instance has failed creation.
     *         </p>
     *         </li>
     * @see ApiCacheStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The cache instance status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AVAILABLE</b>: The instance is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREATING</b>: The instance is currently creating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b>: The instance is currently deleting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MODIFYING</b>: The instance is currently modifying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED</b>: The instance has failed creation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The cache instance status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AVAILABLE</b>: The instance is available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CREATING</b>: The instance is currently creating.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b>: The instance is currently deleting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MODIFYING</b>: The instance is currently modifying.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAILED</b>: The instance has failed creation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiCacheStatus
     */

    public ApiCache withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The cache instance status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AVAILABLE</b>: The instance is available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CREATING</b>: The instance is currently creating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b>: The instance is currently deleting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MODIFYING</b>: The instance is currently modifying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAILED</b>: The instance has failed creation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The cache instance status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AVAILABLE</b>: The instance is available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CREATING</b>: The instance is currently creating.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b>: The instance is currently deleting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MODIFYING</b>: The instance is currently modifying.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAILED</b>: The instance has failed creation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiCacheStatus
     */

    public ApiCache withStatus(ApiCacheStatus status) {
        this.status = status.toString();
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
        if (getTtl() != null)
            sb.append("Ttl: ").append(getTtl()).append(",");
        if (getApiCachingBehavior() != null)
            sb.append("ApiCachingBehavior: ").append(getApiCachingBehavior()).append(",");
        if (getTransitEncryptionEnabled() != null)
            sb.append("TransitEncryptionEnabled: ").append(getTransitEncryptionEnabled()).append(",");
        if (getAtRestEncryptionEnabled() != null)
            sb.append("AtRestEncryptionEnabled: ").append(getAtRestEncryptionEnabled()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiCache == false)
            return false;
        ApiCache other = (ApiCache) obj;
        if (other.getTtl() == null ^ this.getTtl() == null)
            return false;
        if (other.getTtl() != null && other.getTtl().equals(this.getTtl()) == false)
            return false;
        if (other.getApiCachingBehavior() == null ^ this.getApiCachingBehavior() == null)
            return false;
        if (other.getApiCachingBehavior() != null && other.getApiCachingBehavior().equals(this.getApiCachingBehavior()) == false)
            return false;
        if (other.getTransitEncryptionEnabled() == null ^ this.getTransitEncryptionEnabled() == null)
            return false;
        if (other.getTransitEncryptionEnabled() != null && other.getTransitEncryptionEnabled().equals(this.getTransitEncryptionEnabled()) == false)
            return false;
        if (other.getAtRestEncryptionEnabled() == null ^ this.getAtRestEncryptionEnabled() == null)
            return false;
        if (other.getAtRestEncryptionEnabled() != null && other.getAtRestEncryptionEnabled().equals(this.getAtRestEncryptionEnabled()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTtl() == null) ? 0 : getTtl().hashCode());
        hashCode = prime * hashCode + ((getApiCachingBehavior() == null) ? 0 : getApiCachingBehavior().hashCode());
        hashCode = prime * hashCode + ((getTransitEncryptionEnabled() == null) ? 0 : getTransitEncryptionEnabled().hashCode());
        hashCode = prime * hashCode + ((getAtRestEncryptionEnabled() == null) ? 0 : getAtRestEncryptionEnabled().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ApiCache clone() {
        try {
            return (ApiCache) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.ApiCacheMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
