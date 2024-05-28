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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code>DescribeDomainHealth</code> request. Contains health information for the requested domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDomainHealthResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current state of the domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Processing</code> - The domain has updates in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Active</code> - Requested changes have been processed and deployed to the domain.
     * </p>
     * </li>
     * </ul>
     */
    private String domainState;
    /**
     * <p>
     * The number of Availability Zones configured for the domain. If the service is unable to fetch this information,
     * it will return <code>NotAvailable</code>.
     * </p>
     */
    private String availabilityZoneCount;
    /**
     * <p>
     * The number of active Availability Zones configured for the domain. If the service is unable to fetch this
     * information, it will return <code>NotAvailable</code>.
     * </p>
     */
    private String activeAvailabilityZoneCount;
    /**
     * <p>
     * The number of standby Availability Zones configured for the domain. If the service is unable to fetch this
     * information, it will return <code>NotAvailable</code>.
     * </p>
     */
    private String standByAvailabilityZoneCount;
    /**
     * <p>
     * The number of data nodes configured for the domain. If the service is unable to fetch this information, it will
     * return <code>NotAvailable</code>.
     * </p>
     */
    private String dataNodeCount;
    /**
     * <p>
     * A boolean that indicates if dedicated master nodes are activated for the domain.
     * </p>
     */
    private Boolean dedicatedMaster;
    /**
     * <p>
     * The number of nodes that can be elected as a master node. If dedicated master nodes is turned on, this value is
     * the number of dedicated master nodes configured for the domain. If the service is unable to fetch this
     * information, it will return <code>NotAvailable</code>.
     * </p>
     */
    private String masterEligibleNodeCount;
    /**
     * <p>
     * The number of warm nodes configured for the domain.
     * </p>
     */
    private String warmNodeCount;
    /**
     * <p>
     * Indicates whether the domain has an elected master node.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Available</b> - The domain has an elected master node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UnAvailable</b> - The master node hasn't yet been elected, and a quorum to elect a new master node hasn't been
     * reached.
     * </p>
     * </li>
     * </ul>
     */
    private String masterNode;
    /**
     * <p>
     * The current health status of your cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Red</code> - At least one primary shard is not allocated to any node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Yellow</code> - All primary shards are allocated to nodes, but some replicas aren’t.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Green</code> - All primary shards and their replicas are allocated to nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NotAvailable</code> - Unable to retrieve cluster health.
     * </p>
     * </li>
     * </ul>
     */
    private String clusterHealth;
    /**
     * <p>
     * The total number of primary and replica shards for the domain.
     * </p>
     */
    private String totalShards;
    /**
     * <p>
     * The total number of primary and replica shards not allocated to any of the nodes for the cluster.
     * </p>
     */
    private String totalUnAssignedShards;
    /**
     * <p>
     * A list of <code>EnvironmentInfo</code> for the domain.
     * </p>
     */
    private java.util.List<EnvironmentInfo> environmentInformation;

    /**
     * <p>
     * The current state of the domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Processing</code> - The domain has updates in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Active</code> - Requested changes have been processed and deployed to the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param domainState
     *        The current state of the domain.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Processing</code> - The domain has updates in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Active</code> - Requested changes have been processed and deployed to the domain.
     *        </p>
     *        </li>
     * @see DomainState
     */

    public void setDomainState(String domainState) {
        this.domainState = domainState;
    }

    /**
     * <p>
     * The current state of the domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Processing</code> - The domain has updates in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Active</code> - Requested changes have been processed and deployed to the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the domain.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Processing</code> - The domain has updates in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Active</code> - Requested changes have been processed and deployed to the domain.
     *         </p>
     *         </li>
     * @see DomainState
     */

    public String getDomainState() {
        return this.domainState;
    }

    /**
     * <p>
     * The current state of the domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Processing</code> - The domain has updates in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Active</code> - Requested changes have been processed and deployed to the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param domainState
     *        The current state of the domain.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Processing</code> - The domain has updates in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Active</code> - Requested changes have been processed and deployed to the domain.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainState
     */

    public DescribeDomainHealthResult withDomainState(String domainState) {
        setDomainState(domainState);
        return this;
    }

    /**
     * <p>
     * The current state of the domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Processing</code> - The domain has updates in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Active</code> - Requested changes have been processed and deployed to the domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param domainState
     *        The current state of the domain.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Processing</code> - The domain has updates in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Active</code> - Requested changes have been processed and deployed to the domain.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainState
     */

    public DescribeDomainHealthResult withDomainState(DomainState domainState) {
        this.domainState = domainState.toString();
        return this;
    }

    /**
     * <p>
     * The number of Availability Zones configured for the domain. If the service is unable to fetch this information,
     * it will return <code>NotAvailable</code>.
     * </p>
     * 
     * @param availabilityZoneCount
     *        The number of Availability Zones configured for the domain. If the service is unable to fetch this
     *        information, it will return <code>NotAvailable</code>.
     */

    public void setAvailabilityZoneCount(String availabilityZoneCount) {
        this.availabilityZoneCount = availabilityZoneCount;
    }

    /**
     * <p>
     * The number of Availability Zones configured for the domain. If the service is unable to fetch this information,
     * it will return <code>NotAvailable</code>.
     * </p>
     * 
     * @return The number of Availability Zones configured for the domain. If the service is unable to fetch this
     *         information, it will return <code>NotAvailable</code>.
     */

    public String getAvailabilityZoneCount() {
        return this.availabilityZoneCount;
    }

    /**
     * <p>
     * The number of Availability Zones configured for the domain. If the service is unable to fetch this information,
     * it will return <code>NotAvailable</code>.
     * </p>
     * 
     * @param availabilityZoneCount
     *        The number of Availability Zones configured for the domain. If the service is unable to fetch this
     *        information, it will return <code>NotAvailable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainHealthResult withAvailabilityZoneCount(String availabilityZoneCount) {
        setAvailabilityZoneCount(availabilityZoneCount);
        return this;
    }

    /**
     * <p>
     * The number of active Availability Zones configured for the domain. If the service is unable to fetch this
     * information, it will return <code>NotAvailable</code>.
     * </p>
     * 
     * @param activeAvailabilityZoneCount
     *        The number of active Availability Zones configured for the domain. If the service is unable to fetch this
     *        information, it will return <code>NotAvailable</code>.
     */

    public void setActiveAvailabilityZoneCount(String activeAvailabilityZoneCount) {
        this.activeAvailabilityZoneCount = activeAvailabilityZoneCount;
    }

    /**
     * <p>
     * The number of active Availability Zones configured for the domain. If the service is unable to fetch this
     * information, it will return <code>NotAvailable</code>.
     * </p>
     * 
     * @return The number of active Availability Zones configured for the domain. If the service is unable to fetch this
     *         information, it will return <code>NotAvailable</code>.
     */

    public String getActiveAvailabilityZoneCount() {
        return this.activeAvailabilityZoneCount;
    }

    /**
     * <p>
     * The number of active Availability Zones configured for the domain. If the service is unable to fetch this
     * information, it will return <code>NotAvailable</code>.
     * </p>
     * 
     * @param activeAvailabilityZoneCount
     *        The number of active Availability Zones configured for the domain. If the service is unable to fetch this
     *        information, it will return <code>NotAvailable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainHealthResult withActiveAvailabilityZoneCount(String activeAvailabilityZoneCount) {
        setActiveAvailabilityZoneCount(activeAvailabilityZoneCount);
        return this;
    }

    /**
     * <p>
     * The number of standby Availability Zones configured for the domain. If the service is unable to fetch this
     * information, it will return <code>NotAvailable</code>.
     * </p>
     * 
     * @param standByAvailabilityZoneCount
     *        The number of standby Availability Zones configured for the domain. If the service is unable to fetch this
     *        information, it will return <code>NotAvailable</code>.
     */

    public void setStandByAvailabilityZoneCount(String standByAvailabilityZoneCount) {
        this.standByAvailabilityZoneCount = standByAvailabilityZoneCount;
    }

    /**
     * <p>
     * The number of standby Availability Zones configured for the domain. If the service is unable to fetch this
     * information, it will return <code>NotAvailable</code>.
     * </p>
     * 
     * @return The number of standby Availability Zones configured for the domain. If the service is unable to fetch
     *         this information, it will return <code>NotAvailable</code>.
     */

    public String getStandByAvailabilityZoneCount() {
        return this.standByAvailabilityZoneCount;
    }

    /**
     * <p>
     * The number of standby Availability Zones configured for the domain. If the service is unable to fetch this
     * information, it will return <code>NotAvailable</code>.
     * </p>
     * 
     * @param standByAvailabilityZoneCount
     *        The number of standby Availability Zones configured for the domain. If the service is unable to fetch this
     *        information, it will return <code>NotAvailable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainHealthResult withStandByAvailabilityZoneCount(String standByAvailabilityZoneCount) {
        setStandByAvailabilityZoneCount(standByAvailabilityZoneCount);
        return this;
    }

    /**
     * <p>
     * The number of data nodes configured for the domain. If the service is unable to fetch this information, it will
     * return <code>NotAvailable</code>.
     * </p>
     * 
     * @param dataNodeCount
     *        The number of data nodes configured for the domain. If the service is unable to fetch this information, it
     *        will return <code>NotAvailable</code>.
     */

    public void setDataNodeCount(String dataNodeCount) {
        this.dataNodeCount = dataNodeCount;
    }

    /**
     * <p>
     * The number of data nodes configured for the domain. If the service is unable to fetch this information, it will
     * return <code>NotAvailable</code>.
     * </p>
     * 
     * @return The number of data nodes configured for the domain. If the service is unable to fetch this information,
     *         it will return <code>NotAvailable</code>.
     */

    public String getDataNodeCount() {
        return this.dataNodeCount;
    }

    /**
     * <p>
     * The number of data nodes configured for the domain. If the service is unable to fetch this information, it will
     * return <code>NotAvailable</code>.
     * </p>
     * 
     * @param dataNodeCount
     *        The number of data nodes configured for the domain. If the service is unable to fetch this information, it
     *        will return <code>NotAvailable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainHealthResult withDataNodeCount(String dataNodeCount) {
        setDataNodeCount(dataNodeCount);
        return this;
    }

    /**
     * <p>
     * A boolean that indicates if dedicated master nodes are activated for the domain.
     * </p>
     * 
     * @param dedicatedMaster
     *        A boolean that indicates if dedicated master nodes are activated for the domain.
     */

    public void setDedicatedMaster(Boolean dedicatedMaster) {
        this.dedicatedMaster = dedicatedMaster;
    }

    /**
     * <p>
     * A boolean that indicates if dedicated master nodes are activated for the domain.
     * </p>
     * 
     * @return A boolean that indicates if dedicated master nodes are activated for the domain.
     */

    public Boolean getDedicatedMaster() {
        return this.dedicatedMaster;
    }

    /**
     * <p>
     * A boolean that indicates if dedicated master nodes are activated for the domain.
     * </p>
     * 
     * @param dedicatedMaster
     *        A boolean that indicates if dedicated master nodes are activated for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainHealthResult withDedicatedMaster(Boolean dedicatedMaster) {
        setDedicatedMaster(dedicatedMaster);
        return this;
    }

    /**
     * <p>
     * A boolean that indicates if dedicated master nodes are activated for the domain.
     * </p>
     * 
     * @return A boolean that indicates if dedicated master nodes are activated for the domain.
     */

    public Boolean isDedicatedMaster() {
        return this.dedicatedMaster;
    }

    /**
     * <p>
     * The number of nodes that can be elected as a master node. If dedicated master nodes is turned on, this value is
     * the number of dedicated master nodes configured for the domain. If the service is unable to fetch this
     * information, it will return <code>NotAvailable</code>.
     * </p>
     * 
     * @param masterEligibleNodeCount
     *        The number of nodes that can be elected as a master node. If dedicated master nodes is turned on, this
     *        value is the number of dedicated master nodes configured for the domain. If the service is unable to fetch
     *        this information, it will return <code>NotAvailable</code>.
     */

    public void setMasterEligibleNodeCount(String masterEligibleNodeCount) {
        this.masterEligibleNodeCount = masterEligibleNodeCount;
    }

    /**
     * <p>
     * The number of nodes that can be elected as a master node. If dedicated master nodes is turned on, this value is
     * the number of dedicated master nodes configured for the domain. If the service is unable to fetch this
     * information, it will return <code>NotAvailable</code>.
     * </p>
     * 
     * @return The number of nodes that can be elected as a master node. If dedicated master nodes is turned on, this
     *         value is the number of dedicated master nodes configured for the domain. If the service is unable to
     *         fetch this information, it will return <code>NotAvailable</code>.
     */

    public String getMasterEligibleNodeCount() {
        return this.masterEligibleNodeCount;
    }

    /**
     * <p>
     * The number of nodes that can be elected as a master node. If dedicated master nodes is turned on, this value is
     * the number of dedicated master nodes configured for the domain. If the service is unable to fetch this
     * information, it will return <code>NotAvailable</code>.
     * </p>
     * 
     * @param masterEligibleNodeCount
     *        The number of nodes that can be elected as a master node. If dedicated master nodes is turned on, this
     *        value is the number of dedicated master nodes configured for the domain. If the service is unable to fetch
     *        this information, it will return <code>NotAvailable</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainHealthResult withMasterEligibleNodeCount(String masterEligibleNodeCount) {
        setMasterEligibleNodeCount(masterEligibleNodeCount);
        return this;
    }

    /**
     * <p>
     * The number of warm nodes configured for the domain.
     * </p>
     * 
     * @param warmNodeCount
     *        The number of warm nodes configured for the domain.
     */

    public void setWarmNodeCount(String warmNodeCount) {
        this.warmNodeCount = warmNodeCount;
    }

    /**
     * <p>
     * The number of warm nodes configured for the domain.
     * </p>
     * 
     * @return The number of warm nodes configured for the domain.
     */

    public String getWarmNodeCount() {
        return this.warmNodeCount;
    }

    /**
     * <p>
     * The number of warm nodes configured for the domain.
     * </p>
     * 
     * @param warmNodeCount
     *        The number of warm nodes configured for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainHealthResult withWarmNodeCount(String warmNodeCount) {
        setWarmNodeCount(warmNodeCount);
        return this;
    }

    /**
     * <p>
     * Indicates whether the domain has an elected master node.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Available</b> - The domain has an elected master node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UnAvailable</b> - The master node hasn't yet been elected, and a quorum to elect a new master node hasn't been
     * reached.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterNode
     *        Indicates whether the domain has an elected master node.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Available</b> - The domain has an elected master node.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UnAvailable</b> - The master node hasn't yet been elected, and a quorum to elect a new master node
     *        hasn't been reached.
     *        </p>
     *        </li>
     * @see MasterNodeStatus
     */

    public void setMasterNode(String masterNode) {
        this.masterNode = masterNode;
    }

    /**
     * <p>
     * Indicates whether the domain has an elected master node.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Available</b> - The domain has an elected master node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UnAvailable</b> - The master node hasn't yet been elected, and a quorum to elect a new master node hasn't been
     * reached.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether the domain has an elected master node.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Available</b> - The domain has an elected master node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>UnAvailable</b> - The master node hasn't yet been elected, and a quorum to elect a new master node
     *         hasn't been reached.
     *         </p>
     *         </li>
     * @see MasterNodeStatus
     */

    public String getMasterNode() {
        return this.masterNode;
    }

    /**
     * <p>
     * Indicates whether the domain has an elected master node.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Available</b> - The domain has an elected master node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UnAvailable</b> - The master node hasn't yet been elected, and a quorum to elect a new master node hasn't been
     * reached.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterNode
     *        Indicates whether the domain has an elected master node.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Available</b> - The domain has an elected master node.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UnAvailable</b> - The master node hasn't yet been elected, and a quorum to elect a new master node
     *        hasn't been reached.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MasterNodeStatus
     */

    public DescribeDomainHealthResult withMasterNode(String masterNode) {
        setMasterNode(masterNode);
        return this;
    }

    /**
     * <p>
     * Indicates whether the domain has an elected master node.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Available</b> - The domain has an elected master node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>UnAvailable</b> - The master node hasn't yet been elected, and a quorum to elect a new master node hasn't been
     * reached.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterNode
     *        Indicates whether the domain has an elected master node.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Available</b> - The domain has an elected master node.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>UnAvailable</b> - The master node hasn't yet been elected, and a quorum to elect a new master node
     *        hasn't been reached.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MasterNodeStatus
     */

    public DescribeDomainHealthResult withMasterNode(MasterNodeStatus masterNode) {
        this.masterNode = masterNode.toString();
        return this;
    }

    /**
     * <p>
     * The current health status of your cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Red</code> - At least one primary shard is not allocated to any node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Yellow</code> - All primary shards are allocated to nodes, but some replicas aren’t.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Green</code> - All primary shards and their replicas are allocated to nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NotAvailable</code> - Unable to retrieve cluster health.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterHealth
     *        The current health status of your cluster.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Red</code> - At least one primary shard is not allocated to any node.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Yellow</code> - All primary shards are allocated to nodes, but some replicas aren’t.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Green</code> - All primary shards and their replicas are allocated to nodes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NotAvailable</code> - Unable to retrieve cluster health.
     *        </p>
     *        </li>
     * @see DomainHealth
     */

    public void setClusterHealth(String clusterHealth) {
        this.clusterHealth = clusterHealth;
    }

    /**
     * <p>
     * The current health status of your cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Red</code> - At least one primary shard is not allocated to any node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Yellow</code> - All primary shards are allocated to nodes, but some replicas aren’t.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Green</code> - All primary shards and their replicas are allocated to nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NotAvailable</code> - Unable to retrieve cluster health.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current health status of your cluster.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Red</code> - At least one primary shard is not allocated to any node.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Yellow</code> - All primary shards are allocated to nodes, but some replicas aren’t.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Green</code> - All primary shards and their replicas are allocated to nodes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NotAvailable</code> - Unable to retrieve cluster health.
     *         </p>
     *         </li>
     * @see DomainHealth
     */

    public String getClusterHealth() {
        return this.clusterHealth;
    }

    /**
     * <p>
     * The current health status of your cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Red</code> - At least one primary shard is not allocated to any node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Yellow</code> - All primary shards are allocated to nodes, but some replicas aren’t.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Green</code> - All primary shards and their replicas are allocated to nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NotAvailable</code> - Unable to retrieve cluster health.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterHealth
     *        The current health status of your cluster.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Red</code> - At least one primary shard is not allocated to any node.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Yellow</code> - All primary shards are allocated to nodes, but some replicas aren’t.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Green</code> - All primary shards and their replicas are allocated to nodes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NotAvailable</code> - Unable to retrieve cluster health.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainHealth
     */

    public DescribeDomainHealthResult withClusterHealth(String clusterHealth) {
        setClusterHealth(clusterHealth);
        return this;
    }

    /**
     * <p>
     * The current health status of your cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Red</code> - At least one primary shard is not allocated to any node.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Yellow</code> - All primary shards are allocated to nodes, but some replicas aren’t.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Green</code> - All primary shards and their replicas are allocated to nodes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NotAvailable</code> - Unable to retrieve cluster health.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterHealth
     *        The current health status of your cluster.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Red</code> - At least one primary shard is not allocated to any node.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Yellow</code> - All primary shards are allocated to nodes, but some replicas aren’t.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Green</code> - All primary shards and their replicas are allocated to nodes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NotAvailable</code> - Unable to retrieve cluster health.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainHealth
     */

    public DescribeDomainHealthResult withClusterHealth(DomainHealth clusterHealth) {
        this.clusterHealth = clusterHealth.toString();
        return this;
    }

    /**
     * <p>
     * The total number of primary and replica shards for the domain.
     * </p>
     * 
     * @param totalShards
     *        The total number of primary and replica shards for the domain.
     */

    public void setTotalShards(String totalShards) {
        this.totalShards = totalShards;
    }

    /**
     * <p>
     * The total number of primary and replica shards for the domain.
     * </p>
     * 
     * @return The total number of primary and replica shards for the domain.
     */

    public String getTotalShards() {
        return this.totalShards;
    }

    /**
     * <p>
     * The total number of primary and replica shards for the domain.
     * </p>
     * 
     * @param totalShards
     *        The total number of primary and replica shards for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainHealthResult withTotalShards(String totalShards) {
        setTotalShards(totalShards);
        return this;
    }

    /**
     * <p>
     * The total number of primary and replica shards not allocated to any of the nodes for the cluster.
     * </p>
     * 
     * @param totalUnAssignedShards
     *        The total number of primary and replica shards not allocated to any of the nodes for the cluster.
     */

    public void setTotalUnAssignedShards(String totalUnAssignedShards) {
        this.totalUnAssignedShards = totalUnAssignedShards;
    }

    /**
     * <p>
     * The total number of primary and replica shards not allocated to any of the nodes for the cluster.
     * </p>
     * 
     * @return The total number of primary and replica shards not allocated to any of the nodes for the cluster.
     */

    public String getTotalUnAssignedShards() {
        return this.totalUnAssignedShards;
    }

    /**
     * <p>
     * The total number of primary and replica shards not allocated to any of the nodes for the cluster.
     * </p>
     * 
     * @param totalUnAssignedShards
     *        The total number of primary and replica shards not allocated to any of the nodes for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainHealthResult withTotalUnAssignedShards(String totalUnAssignedShards) {
        setTotalUnAssignedShards(totalUnAssignedShards);
        return this;
    }

    /**
     * <p>
     * A list of <code>EnvironmentInfo</code> for the domain.
     * </p>
     * 
     * @return A list of <code>EnvironmentInfo</code> for the domain.
     */

    public java.util.List<EnvironmentInfo> getEnvironmentInformation() {
        return environmentInformation;
    }

    /**
     * <p>
     * A list of <code>EnvironmentInfo</code> for the domain.
     * </p>
     * 
     * @param environmentInformation
     *        A list of <code>EnvironmentInfo</code> for the domain.
     */

    public void setEnvironmentInformation(java.util.Collection<EnvironmentInfo> environmentInformation) {
        if (environmentInformation == null) {
            this.environmentInformation = null;
            return;
        }

        this.environmentInformation = new java.util.ArrayList<EnvironmentInfo>(environmentInformation);
    }

    /**
     * <p>
     * A list of <code>EnvironmentInfo</code> for the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentInformation(java.util.Collection)} or
     * {@link #withEnvironmentInformation(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param environmentInformation
     *        A list of <code>EnvironmentInfo</code> for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainHealthResult withEnvironmentInformation(EnvironmentInfo... environmentInformation) {
        if (this.environmentInformation == null) {
            setEnvironmentInformation(new java.util.ArrayList<EnvironmentInfo>(environmentInformation.length));
        }
        for (EnvironmentInfo ele : environmentInformation) {
            this.environmentInformation.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>EnvironmentInfo</code> for the domain.
     * </p>
     * 
     * @param environmentInformation
     *        A list of <code>EnvironmentInfo</code> for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainHealthResult withEnvironmentInformation(java.util.Collection<EnvironmentInfo> environmentInformation) {
        setEnvironmentInformation(environmentInformation);
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
        if (getDomainState() != null)
            sb.append("DomainState: ").append(getDomainState()).append(",");
        if (getAvailabilityZoneCount() != null)
            sb.append("AvailabilityZoneCount: ").append(getAvailabilityZoneCount()).append(",");
        if (getActiveAvailabilityZoneCount() != null)
            sb.append("ActiveAvailabilityZoneCount: ").append(getActiveAvailabilityZoneCount()).append(",");
        if (getStandByAvailabilityZoneCount() != null)
            sb.append("StandByAvailabilityZoneCount: ").append(getStandByAvailabilityZoneCount()).append(",");
        if (getDataNodeCount() != null)
            sb.append("DataNodeCount: ").append(getDataNodeCount()).append(",");
        if (getDedicatedMaster() != null)
            sb.append("DedicatedMaster: ").append(getDedicatedMaster()).append(",");
        if (getMasterEligibleNodeCount() != null)
            sb.append("MasterEligibleNodeCount: ").append(getMasterEligibleNodeCount()).append(",");
        if (getWarmNodeCount() != null)
            sb.append("WarmNodeCount: ").append(getWarmNodeCount()).append(",");
        if (getMasterNode() != null)
            sb.append("MasterNode: ").append(getMasterNode()).append(",");
        if (getClusterHealth() != null)
            sb.append("ClusterHealth: ").append(getClusterHealth()).append(",");
        if (getTotalShards() != null)
            sb.append("TotalShards: ").append(getTotalShards()).append(",");
        if (getTotalUnAssignedShards() != null)
            sb.append("TotalUnAssignedShards: ").append(getTotalUnAssignedShards()).append(",");
        if (getEnvironmentInformation() != null)
            sb.append("EnvironmentInformation: ").append(getEnvironmentInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDomainHealthResult == false)
            return false;
        DescribeDomainHealthResult other = (DescribeDomainHealthResult) obj;
        if (other.getDomainState() == null ^ this.getDomainState() == null)
            return false;
        if (other.getDomainState() != null && other.getDomainState().equals(this.getDomainState()) == false)
            return false;
        if (other.getAvailabilityZoneCount() == null ^ this.getAvailabilityZoneCount() == null)
            return false;
        if (other.getAvailabilityZoneCount() != null && other.getAvailabilityZoneCount().equals(this.getAvailabilityZoneCount()) == false)
            return false;
        if (other.getActiveAvailabilityZoneCount() == null ^ this.getActiveAvailabilityZoneCount() == null)
            return false;
        if (other.getActiveAvailabilityZoneCount() != null && other.getActiveAvailabilityZoneCount().equals(this.getActiveAvailabilityZoneCount()) == false)
            return false;
        if (other.getStandByAvailabilityZoneCount() == null ^ this.getStandByAvailabilityZoneCount() == null)
            return false;
        if (other.getStandByAvailabilityZoneCount() != null && other.getStandByAvailabilityZoneCount().equals(this.getStandByAvailabilityZoneCount()) == false)
            return false;
        if (other.getDataNodeCount() == null ^ this.getDataNodeCount() == null)
            return false;
        if (other.getDataNodeCount() != null && other.getDataNodeCount().equals(this.getDataNodeCount()) == false)
            return false;
        if (other.getDedicatedMaster() == null ^ this.getDedicatedMaster() == null)
            return false;
        if (other.getDedicatedMaster() != null && other.getDedicatedMaster().equals(this.getDedicatedMaster()) == false)
            return false;
        if (other.getMasterEligibleNodeCount() == null ^ this.getMasterEligibleNodeCount() == null)
            return false;
        if (other.getMasterEligibleNodeCount() != null && other.getMasterEligibleNodeCount().equals(this.getMasterEligibleNodeCount()) == false)
            return false;
        if (other.getWarmNodeCount() == null ^ this.getWarmNodeCount() == null)
            return false;
        if (other.getWarmNodeCount() != null && other.getWarmNodeCount().equals(this.getWarmNodeCount()) == false)
            return false;
        if (other.getMasterNode() == null ^ this.getMasterNode() == null)
            return false;
        if (other.getMasterNode() != null && other.getMasterNode().equals(this.getMasterNode()) == false)
            return false;
        if (other.getClusterHealth() == null ^ this.getClusterHealth() == null)
            return false;
        if (other.getClusterHealth() != null && other.getClusterHealth().equals(this.getClusterHealth()) == false)
            return false;
        if (other.getTotalShards() == null ^ this.getTotalShards() == null)
            return false;
        if (other.getTotalShards() != null && other.getTotalShards().equals(this.getTotalShards()) == false)
            return false;
        if (other.getTotalUnAssignedShards() == null ^ this.getTotalUnAssignedShards() == null)
            return false;
        if (other.getTotalUnAssignedShards() != null && other.getTotalUnAssignedShards().equals(this.getTotalUnAssignedShards()) == false)
            return false;
        if (other.getEnvironmentInformation() == null ^ this.getEnvironmentInformation() == null)
            return false;
        if (other.getEnvironmentInformation() != null && other.getEnvironmentInformation().equals(this.getEnvironmentInformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainState() == null) ? 0 : getDomainState().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneCount() == null) ? 0 : getAvailabilityZoneCount().hashCode());
        hashCode = prime * hashCode + ((getActiveAvailabilityZoneCount() == null) ? 0 : getActiveAvailabilityZoneCount().hashCode());
        hashCode = prime * hashCode + ((getStandByAvailabilityZoneCount() == null) ? 0 : getStandByAvailabilityZoneCount().hashCode());
        hashCode = prime * hashCode + ((getDataNodeCount() == null) ? 0 : getDataNodeCount().hashCode());
        hashCode = prime * hashCode + ((getDedicatedMaster() == null) ? 0 : getDedicatedMaster().hashCode());
        hashCode = prime * hashCode + ((getMasterEligibleNodeCount() == null) ? 0 : getMasterEligibleNodeCount().hashCode());
        hashCode = prime * hashCode + ((getWarmNodeCount() == null) ? 0 : getWarmNodeCount().hashCode());
        hashCode = prime * hashCode + ((getMasterNode() == null) ? 0 : getMasterNode().hashCode());
        hashCode = prime * hashCode + ((getClusterHealth() == null) ? 0 : getClusterHealth().hashCode());
        hashCode = prime * hashCode + ((getTotalShards() == null) ? 0 : getTotalShards().hashCode());
        hashCode = prime * hashCode + ((getTotalUnAssignedShards() == null) ? 0 : getTotalUnAssignedShards().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentInformation() == null) ? 0 : getEnvironmentInformation().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDomainHealthResult clone() {
        try {
            return (DescribeDomainHealthResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
