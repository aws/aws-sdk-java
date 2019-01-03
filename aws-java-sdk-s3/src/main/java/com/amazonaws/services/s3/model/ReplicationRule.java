/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.model;
import java.io.Serializable;

import com.amazonaws.services.s3.model.replication.ReplicationFilter;
import com.amazonaws.util.json.Jackson;

/**
 * Rule that specifies the replication configuration.
 */
public class ReplicationRule implements Serializable {

    /**
     * The Amazon S3 object prefix for the replication rule. This rule will be
     * applied if an Amazon S3 object matches this prefix.
     * Only valid for Replication configuration V1, deprecated in Replication configuration V2.
     */
    private String prefix;

    /**
     * The status of this replication rule. Valid values are Enabled, Disabled.
     * The rule will be applied only if the status is Enabled.
     */
    private String status;

    /**
     * Destination configuration for the replication rule.
     */
    private ReplicationDestinationConfig destinationConfig;

    private SourceSelectionCriteria sourceSelectionCriteria;

    /**
     * Filter associated with the replication rule.
     * Only valid for Replication configuration V2
     */
    private ReplicationFilter filter;

    /**
     * The priority of this replication rule. Valid values are from INT_MIN to INT_MAX.
     * Only valid for Replication configuration V2
     */
    private Integer priority;

    /**
     * The status of the replication of delete markers in this replication rule. Valid values are Enabled, Disabled.
     * The rule will be applied only if the status is Enabled, and is only valid for Replication configuration V2.
     */
    private DeleteMarkerReplication deleteMarkerReplication;

    /**
     * Returns the priority of current rule.
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Set the priority of current rule.
     * Priority must be unique in a configuration (you cannot have two different rules with the same priority).
     *
     * @param priority int
     */
    public void setPriority(Integer priority) {
        if (priority < 0) {
            throw new IllegalArgumentException("Priority has to be a positive number");
        }
        this.priority = priority;
    }

    /**
     * Fluent method to set the priority of current rule.
     * Priority must be unique in a configuration (you cannot have two different rules with the same priority).
     *
     * @param priority int
     * @return This object for method chaining.
     */
    public ReplicationRule withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * Returns the status of delete marker replication of current rule.
     */
    public DeleteMarkerReplication getDeleteMarkerReplication() {
        return deleteMarkerReplication;
    }
    /**
     * Sets the Amazon S3 Object prefix for the replication rule.
     *
     * @param deleteMarkerReplication Status of delete markers replication.
     */
    public void setDeleteMarkerReplication(DeleteMarkerReplication deleteMarkerReplication) {
        this.deleteMarkerReplication = deleteMarkerReplication;
    }

    /**
     * Fluent method to set the DeleteMarkerReplication that is indicate if delete
     * markers have or don't have to be replicated in Replication configuration V2.
     *
     * @param deleteMarkerReplication Status of delete markers replication.
     * @return This object for method chaining.
     */
    public ReplicationRule withDeleteMarkerReplication(DeleteMarkerReplication deleteMarkerReplication) {
        setDeleteMarkerReplication(deleteMarkerReplication);
        return this;
    }

    /**
     * Returns the prefix associated with the replication rule.
     * @deprecated Use {@link ReplicationFilter} instead.
     */
    @Deprecated
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the Amazon S3 Object prefix for the replication rule.
     *
     * @throws IllegalArgumentException
     *             if the prefix is null.
     * @deprecated Use {@link ReplicationFilter}.
     */
    @Deprecated
    public void setPrefix(String prefix) {
        if (prefix == null) {
            throw new IllegalArgumentException(
                    "Prefix cannot be null for a replication rule");
        }
        if (filter != null) {
            throw new IllegalArgumentException(
                    "You cannot use both prefix and filter at the same time in a replication rule");
        }
        this.prefix = prefix;
    }

    /**
     * Sets the Amazon S3 Object prefix for the replication rule. Returns the
     * updated object.
     *
     * @return the updated {@link ReplicationRule} object.
     * @throws IllegalArgumentException
     *             if the prefix is null.
     * @deprecated Use {@link ReplicationFilter}.
     */
    @Deprecated
    public ReplicationRule withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * Returns a {@link ReplicationFilter} that is used to identify objects that a CRR Rule applies to.
     */
    public ReplicationFilter getFilter() {
        return filter;
    }

    /**
     * Sets the {@link ReplicationFilter} that is used to identify objects that a CRR Rule applies to.
     * A rule cannot have both {@link ReplicationFilter} and the deprecated {@link #prefix}.
     *
     * @param filter {@link ReplicationFilter}
     */
    public void setFilter(ReplicationFilter filter) {
        if (filter == null) {
            throw new IllegalArgumentException(
                    "Filter cannot be null for a replication rule");
        }
        if (prefix != null) {
            throw new IllegalArgumentException(
                    "You cannot use both prefix and filter at the same time in a replication rule");
        }
        this.filter = filter;
    }

    /**
     * Fluent method to set the {@link ReplicationFilter} that is used to identify objects
     * that a CRR Rule applies to. A rule cannot have both {@link ReplicationFilter}
     * and the deprecated {@link #prefix}.
     *
     * @param filter {@link ReplicationFilter}
     * @return This object for method chaining.
     */
    public ReplicationRule withFilter(ReplicationFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * Returns the status of the replication rule.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status of this replication rule. Valid values are Enabled,
     * Disabled. The rule will be applied only if the status is Enabled.
     *
     * @param status
     *            the status of the replication rule.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Sets the status of this replication rule. Valid values are Enabled,
     * Disabled. The rule will be applied only if the status is Enabled.
     *
     * @param status
     *            the status of replication rule.
     *
     * @return the updated {@link ReplicationRule} object.
     */
    public ReplicationRule withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * Sets the status of this replication rule. Valid values are Enabled,
     * Disabled. The rule will be applied only if the status is Enabled.
     *
     * @param status
     *            the status of the replication rule.
     */
    public void setStatus(ReplicationRuleStatus status) {
        setStatus(status.getStatus());
    }

    /**
     * Sets the status of this replication rule. Valid values are Enabled,
     * Disabled. The rule will be applied only if the status is Enabled.
     *
     * @param status
     *            the status of replication rule.
     *
     * @return the updated {@link ReplicationRule} object.
     */
    public ReplicationRule withStatus(ReplicationRuleStatus status) {
        setStatus(status.getStatus());
        return this;
    }

    /**
     * Returns the destination configuration for the replication rule.
     */
    public ReplicationDestinationConfig getDestinationConfig() {
        return destinationConfig;
    }

    /**
     * Sets the destination configuration for the replication rule.
     *
     * @throws IllegalArgumentException
     *             if the destinationConfig is null.
     */
    public void setDestinationConfig(ReplicationDestinationConfig destinationConfig) {
        if (destinationConfig == null) {
            throw new IllegalArgumentException(
                    "Destination cannot be null in the replication rule");
        }
        this.destinationConfig = destinationConfig;
    }

    /**
     * Sets the destination configuration for the replication rule.Returns the
     * updated object.
     *
     * @throws IllegalArgumentException
     *             if the destinationConfig is null.
     * @return the updated {@link ReplicationRule} object.
     */
    public ReplicationRule withDestinationConfig(
            ReplicationDestinationConfig destinationConfig) {
        setDestinationConfig(destinationConfig);
        return this;
    }

    /**
     * @return Container for filters that define which source objects should be replicated.
     */
    public SourceSelectionCriteria getSourceSelectionCriteria() {
        return sourceSelectionCriteria;
    }

    /**
     * Sets the container for filters that define which source objects should be replicated.
     *
     * @param sourceSelectionCriteria New source selection criteria
     */
    public void setSourceSelectionCriteria(SourceSelectionCriteria sourceSelectionCriteria) {
        this.sourceSelectionCriteria = sourceSelectionCriteria;
    }

    /**
     * Sets the container for filters that define which source objects should be replicated.
     *
     * @param sourceSelectionCriteria New source selection criteria
     * @return This object for method chaining.
     */
    public ReplicationRule withSourceSelectionCriteria(SourceSelectionCriteria sourceSelectionCriteria) {
        setSourceSelectionCriteria(sourceSelectionCriteria);
        return this;
    }

    @Override
    public String toString() {
        return Jackson.toJsonString(this);
    }
}
