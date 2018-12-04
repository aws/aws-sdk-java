/*
 * Copyright 2015-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.util.json.Jackson;

/**
 * Rule that specifies the replication configuration.
 */
public class ReplicationRule implements Serializable {

    /**
     * The Amazon S3 object prefix for the replication rule. This rule will be
     * applied if an Amazon S3 object matches this prefix.
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
     * Returns the prefix associated with the replication rule.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the Amazon S3 Object prefix for the replication rule.
     *
     * @throws IllegalArgumentException
     *             if the prefix is null.
     */
    public void setPrefix(String prefix) {
        if (prefix == null) {
            throw new IllegalArgumentException(
                    "Prefix cannot be null for a replication rule");
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
     */
    public ReplicationRule withPrefix(String prefix) {
        setPrefix(prefix);
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
    public void setDestinationConfig(
            ReplicationDestinationConfig destinationConfig) {
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
