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

/**
 * <p>
 * Represents the output of a <code>PurchaseReservedCacheNodesOffering</code> operation.
 * </p>
 */
public class ReservedCacheNode implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     */
    private String reservedCacheNodeId;
    /**
     * <p>
     * The offering identifier.
     * </p>
     */
    private String reservedCacheNodesOfferingId;
    /**
     * <p>
     * The cache node type for the reserved cache nodes.
     * </p>
     * <p>
     * Valid node types are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>, <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     * <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized: <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis backup/restore is not supported for Redis (cluster mode disabled) T1 and T2 instances. Backup/restore is
     * supported on Redis (cluster mode enabled) T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and either
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     */
    private String cacheNodeType;
    /**
     * <p>
     * The time the reservation started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The fixed price charged for this reserved cache node.
     * </p>
     */
    private Double fixedPrice;
    /**
     * <p>
     * The hourly price charged for this reserved cache node.
     * </p>
     */
    private Double usagePrice;
    /**
     * <p>
     * The number of cache nodes that have been reserved.
     * </p>
     */
    private Integer cacheNodeCount;
    /**
     * <p>
     * The description of the reserved cache node.
     * </p>
     */
    private String productDescription;
    /**
     * <p>
     * The offering type of this reserved cache node.
     * </p>
     */
    private String offeringType;
    /**
     * <p>
     * The state of the reserved cache node.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The recurring price charged to run this reserved cache node.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RecurringCharge> recurringCharges;

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * 
     * @param reservedCacheNodeId
     *        The unique identifier for the reservation.
     */

    public void setReservedCacheNodeId(String reservedCacheNodeId) {
        this.reservedCacheNodeId = reservedCacheNodeId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * 
     * @return The unique identifier for the reservation.
     */

    public String getReservedCacheNodeId() {
        return this.reservedCacheNodeId;
    }

    /**
     * <p>
     * The unique identifier for the reservation.
     * </p>
     * 
     * @param reservedCacheNodeId
     *        The unique identifier for the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedCacheNode withReservedCacheNodeId(String reservedCacheNodeId) {
        setReservedCacheNodeId(reservedCacheNodeId);
        return this;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     * 
     * @param reservedCacheNodesOfferingId
     *        The offering identifier.
     */

    public void setReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     * 
     * @return The offering identifier.
     */

    public String getReservedCacheNodesOfferingId() {
        return this.reservedCacheNodesOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     * 
     * @param reservedCacheNodesOfferingId
     *        The offering identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedCacheNode withReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        setReservedCacheNodesOfferingId(reservedCacheNodesOfferingId);
        return this;
    }

    /**
     * <p>
     * The cache node type for the reserved cache nodes.
     * </p>
     * <p>
     * Valid node types are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>, <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     * <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized: <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis backup/restore is not supported for Redis (cluster mode disabled) T1 and T2 instances. Backup/restore is
     * supported on Redis (cluster mode enabled) T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and either
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     * 
     * @param cacheNodeType
     *        The cache node type for the reserved cache nodes.</p>
     *        <p>
     *        Valid node types are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General purpose:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>, <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     *        <code>cache.m3.2xlarge</code>, <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     *        <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>,
     *        <code>cache.m1.medium</code>, <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Compute optimized: <code>cache.c1.xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Memory optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *        <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *        <code>cache.m2.4xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Notes:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis backup/restore is not supported for Redis (cluster mode disabled) T1 and T2 instances.
     *        Backup/restore is supported on Redis (cluster mode enabled) T2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a complete listing of node types and specifications, see <a
     *        href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and
     *        either <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Redis</a>.
     */

    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }

    /**
     * <p>
     * The cache node type for the reserved cache nodes.
     * </p>
     * <p>
     * Valid node types are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>, <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     * <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized: <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis backup/restore is not supported for Redis (cluster mode disabled) T1 and T2 instances. Backup/restore is
     * supported on Redis (cluster mode enabled) T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and either
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     * 
     * @return The cache node type for the reserved cache nodes.</p>
     *         <p>
     *         Valid node types are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General purpose:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>,
     *         <code>cache.t2.medium</code>, <code>cache.m3.medium</code>, <code>cache.m3.large</code>,
     *         <code>cache.m3.xlarge</code>, <code>cache.m3.2xlarge</code>, <code>cache.m4.large</code>,
     *         <code>cache.m4.xlarge</code>, <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>,
     *         <code>cache.m4.10xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>,
     *         <code>cache.m1.medium</code>, <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Compute optimized: <code>cache.c1.xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Memory optimized:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *         <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *         <code>cache.m2.4xlarge</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Notes:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis backup/restore is not supported for Redis (cluster mode disabled) T1 and T2 instances.
     *         Backup/restore is supported on Redis (cluster mode enabled) T2 instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a complete listing of node types and specifications, see <a
     *         href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and
     *         either <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     *         >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     *         "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     *         >Cache Node Type-Specific Parameters for Redis</a>.
     */

    public String getCacheNodeType() {
        return this.cacheNodeType;
    }

    /**
     * <p>
     * The cache node type for the reserved cache nodes.
     * </p>
     * <p>
     * Valid node types are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General purpose:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>,
     * <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     * <code>cache.m3.2xlarge</code>, <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     * <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>, <code>cache.m1.medium</code>,
     * <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Compute optimized: <code>cache.c1.xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Memory optimized:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>, <code>cache.r3.2xlarge</code>,
     * <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>, <code>cache.m2.4xlarge</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>Notes:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis backup/restore is not supported for Redis (cluster mode disabled) T1 and T2 instances. Backup/restore is
     * supported on Redis (cluster mode enabled) T2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete listing of node types and specifications, see <a
     * href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and either
     * <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     * "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     * >Cache Node Type-Specific Parameters for Redis</a>.
     * </p>
     * 
     * @param cacheNodeType
     *        The cache node type for the reserved cache nodes.</p>
     *        <p>
     *        Valid node types are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General purpose:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation: <code>cache.t2.micro</code>, <code>cache.t2.small</code>, <code>cache.t2.medium</code>, <code>cache.m3.medium</code>, <code>cache.m3.large</code>, <code>cache.m3.xlarge</code>,
     *        <code>cache.m3.2xlarge</code>, <code>cache.m4.large</code>, <code>cache.m4.xlarge</code>,
     *        <code>cache.m4.2xlarge</code>, <code>cache.m4.4xlarge</code>, <code>cache.m4.10xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.t1.micro</code>, <code>cache.m1.small</code>,
     *        <code>cache.m1.medium</code>, <code>cache.m1.large</code>, <code>cache.m1.xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Compute optimized: <code>cache.c1.xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Memory optimized:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Current generation: <code>cache.r3.large</code>, <code>cache.r3.xlarge</code>,
     *        <code>cache.r3.2xlarge</code>, <code>cache.r3.4xlarge</code>, <code>cache.r3.8xlarge</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Previous generation: <code>cache.m2.xlarge</code>, <code>cache.m2.2xlarge</code>,
     *        <code>cache.m2.4xlarge</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Notes:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        All T2 instances are created in an Amazon Virtual Private Cloud (Amazon VPC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis backup/restore is not supported for Redis (cluster mode disabled) T1 and T2 instances.
     *        Backup/restore is supported on Redis (cluster mode enabled) T2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Redis Append-only files (AOF) functionality is not supported for T1 or T2 instances.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a complete listing of node types and specifications, see <a
     *        href="http://aws.amazon.com/elasticache/details">Amazon ElastiCache Product Features and Details</a> and
     *        either <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Memcached.html#ParameterGroups.Memcached.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Memcached</a> or <a href=
     *        "http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/CacheParameterGroups.Redis.html#ParameterGroups.Redis.NodeSpecific"
     *        >Cache Node Type-Specific Parameters for Redis</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedCacheNode withCacheNodeType(String cacheNodeType) {
        setCacheNodeType(cacheNodeType);
        return this;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     * 
     * @param startTime
     *        The time the reservation started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     * 
     * @return The time the reservation started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time the reservation started.
     * </p>
     * 
     * @param startTime
     *        The time the reservation started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedCacheNode withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the reservation in seconds.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     * 
     * @return The duration of the reservation in seconds.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the reservation in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedCacheNode withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The fixed price charged for this reserved cache node.
     * </p>
     * 
     * @param fixedPrice
     *        The fixed price charged for this reserved cache node.
     */

    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this reserved cache node.
     * </p>
     * 
     * @return The fixed price charged for this reserved cache node.
     */

    public Double getFixedPrice() {
        return this.fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this reserved cache node.
     * </p>
     * 
     * @param fixedPrice
     *        The fixed price charged for this reserved cache node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedCacheNode withFixedPrice(Double fixedPrice) {
        setFixedPrice(fixedPrice);
        return this;
    }

    /**
     * <p>
     * The hourly price charged for this reserved cache node.
     * </p>
     * 
     * @param usagePrice
     *        The hourly price charged for this reserved cache node.
     */

    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The hourly price charged for this reserved cache node.
     * </p>
     * 
     * @return The hourly price charged for this reserved cache node.
     */

    public Double getUsagePrice() {
        return this.usagePrice;
    }

    /**
     * <p>
     * The hourly price charged for this reserved cache node.
     * </p>
     * 
     * @param usagePrice
     *        The hourly price charged for this reserved cache node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedCacheNode withUsagePrice(Double usagePrice) {
        setUsagePrice(usagePrice);
        return this;
    }

    /**
     * <p>
     * The number of cache nodes that have been reserved.
     * </p>
     * 
     * @param cacheNodeCount
     *        The number of cache nodes that have been reserved.
     */

    public void setCacheNodeCount(Integer cacheNodeCount) {
        this.cacheNodeCount = cacheNodeCount;
    }

    /**
     * <p>
     * The number of cache nodes that have been reserved.
     * </p>
     * 
     * @return The number of cache nodes that have been reserved.
     */

    public Integer getCacheNodeCount() {
        return this.cacheNodeCount;
    }

    /**
     * <p>
     * The number of cache nodes that have been reserved.
     * </p>
     * 
     * @param cacheNodeCount
     *        The number of cache nodes that have been reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedCacheNode withCacheNodeCount(Integer cacheNodeCount) {
        setCacheNodeCount(cacheNodeCount);
        return this;
    }

    /**
     * <p>
     * The description of the reserved cache node.
     * </p>
     * 
     * @param productDescription
     *        The description of the reserved cache node.
     */

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The description of the reserved cache node.
     * </p>
     * 
     * @return The description of the reserved cache node.
     */

    public String getProductDescription() {
        return this.productDescription;
    }

    /**
     * <p>
     * The description of the reserved cache node.
     * </p>
     * 
     * @param productDescription
     *        The description of the reserved cache node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedCacheNode withProductDescription(String productDescription) {
        setProductDescription(productDescription);
        return this;
    }

    /**
     * <p>
     * The offering type of this reserved cache node.
     * </p>
     * 
     * @param offeringType
     *        The offering type of this reserved cache node.
     */

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The offering type of this reserved cache node.
     * </p>
     * 
     * @return The offering type of this reserved cache node.
     */

    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * <p>
     * The offering type of this reserved cache node.
     * </p>
     * 
     * @param offeringType
     *        The offering type of this reserved cache node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedCacheNode withOfferingType(String offeringType) {
        setOfferingType(offeringType);
        return this;
    }

    /**
     * <p>
     * The state of the reserved cache node.
     * </p>
     * 
     * @param state
     *        The state of the reserved cache node.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the reserved cache node.
     * </p>
     * 
     * @return The state of the reserved cache node.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the reserved cache node.
     * </p>
     * 
     * @param state
     *        The state of the reserved cache node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedCacheNode withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved cache node.
     * </p>
     * 
     * @return The recurring price charged to run this reserved cache node.
     */

    public java.util.List<RecurringCharge> getRecurringCharges() {
        if (recurringCharges == null) {
            recurringCharges = new com.amazonaws.internal.SdkInternalList<RecurringCharge>();
        }
        return recurringCharges;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved cache node.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring price charged to run this reserved cache node.
     */

    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }

        this.recurringCharges = new com.amazonaws.internal.SdkInternalList<RecurringCharge>(recurringCharges);
    }

    /**
     * <p>
     * The recurring price charged to run this reserved cache node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecurringCharges(java.util.Collection)} or {@link #withRecurringCharges(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring price charged to run this reserved cache node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedCacheNode withRecurringCharges(RecurringCharge... recurringCharges) {
        if (this.recurringCharges == null) {
            setRecurringCharges(new com.amazonaws.internal.SdkInternalList<RecurringCharge>(recurringCharges.length));
        }
        for (RecurringCharge ele : recurringCharges) {
            this.recurringCharges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved cache node.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring price charged to run this reserved cache node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedCacheNode withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
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
        if (getReservedCacheNodeId() != null)
            sb.append("ReservedCacheNodeId: " + getReservedCacheNodeId() + ",");
        if (getReservedCacheNodesOfferingId() != null)
            sb.append("ReservedCacheNodesOfferingId: " + getReservedCacheNodesOfferingId() + ",");
        if (getCacheNodeType() != null)
            sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: " + getUsagePrice() + ",");
        if (getCacheNodeCount() != null)
            sb.append("CacheNodeCount: " + getCacheNodeCount() + ",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getOfferingType() != null)
            sb.append("OfferingType: " + getOfferingType() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: " + getRecurringCharges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedCacheNode == false)
            return false;
        ReservedCacheNode other = (ReservedCacheNode) obj;
        if (other.getReservedCacheNodeId() == null ^ this.getReservedCacheNodeId() == null)
            return false;
        if (other.getReservedCacheNodeId() != null && other.getReservedCacheNodeId().equals(this.getReservedCacheNodeId()) == false)
            return false;
        if (other.getReservedCacheNodesOfferingId() == null ^ this.getReservedCacheNodesOfferingId() == null)
            return false;
        if (other.getReservedCacheNodesOfferingId() != null && other.getReservedCacheNodesOfferingId().equals(this.getReservedCacheNodesOfferingId()) == false)
            return false;
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null)
            return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null)
            return false;
        if (other.getFixedPrice() != null && other.getFixedPrice().equals(this.getFixedPrice()) == false)
            return false;
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null)
            return false;
        if (other.getUsagePrice() != null && other.getUsagePrice().equals(this.getUsagePrice()) == false)
            return false;
        if (other.getCacheNodeCount() == null ^ this.getCacheNodeCount() == null)
            return false;
        if (other.getCacheNodeCount() != null && other.getCacheNodeCount().equals(this.getCacheNodeCount()) == false)
            return false;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedCacheNodeId() == null) ? 0 : getReservedCacheNodeId().hashCode());
        hashCode = prime * hashCode + ((getReservedCacheNodesOfferingId() == null) ? 0 : getReservedCacheNodesOfferingId().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeCount() == null) ? 0 : getCacheNodeCount().hashCode());
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        return hashCode;
    }

    @Override
    public ReservedCacheNode clone() {
        try {
            return (ReservedCacheNode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
