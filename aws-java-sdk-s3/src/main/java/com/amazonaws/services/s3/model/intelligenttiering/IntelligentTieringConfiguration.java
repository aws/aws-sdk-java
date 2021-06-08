/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model.intelligenttiering;

import java.io.Serializable;
import java.util.List;

/**
 * <p>Specifies the S3 Intelligent-Tiering configuration for an Amazon S3 bucket.</p>
 *
 * <p>For information about the S3 Intelligent-Tiering storage class,
 * see <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access\">
 *     Storage class for automatically optimizing frequently and infrequently accessed objects</a>.</p>
 *
 * @see com.amazonaws.services.s3.model.intelligenttiering.IntelligentTieringAccessTier
 */
public class IntelligentTieringConfiguration implements Serializable {
    private String id;
    private IntelligentTieringFilter filter;
    private IntelligentTieringStatus status;
    private List<Tiering> tierings;

    /**
     * Returns the identifier used to represent an S3 Intelligent-Tiering configuration.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the identifier used to represent an S3 Intelligent-Tiering configuration.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the identifier used to represent an S3 Intelligent-Tiering configuration
     * and returns the {@link IntelligentTieringConfiguration} object
     * for method chaining.
     */
    public IntelligentTieringConfiguration withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Returns the filter used to describe a set of objects for S3 Intelligent-Tiering.
     * The configuration only includes objects that meet the filter's criteria.
     */
    public IntelligentTieringFilter getFilter() {
        return filter;
    }

    /**
     * Sets the filter used to describe a set of objects for S3 Intelligent-Tiering.
     * If no filter is provided, all objects will be considered.
     */
    public void setFilter(IntelligentTieringFilter filter) {
        this.filter = filter;
    }

    /**
     * Sets the filter used to describe a set of objects for S3 Intelligent-Tiering.
     * If no filter is provided, all objects will be considered.
     *
     * The {@link IntelligentTieringConfiguration} object is returned for method chaining.
     */
    public IntelligentTieringConfiguration withFilter(IntelligentTieringFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * Returns the status of the configuration {@link com.amazonaws.services.s3.model.intelligenttiering.IntelligentTieringStatus}
     */
    public IntelligentTieringStatus getStatus() {
        return status;
    }

    /**
     * Sets the {@link com.amazonaws.services.s3.model.intelligenttiering.IntelligentTieringStatus} for the config.
     */
    public void setStatus(IntelligentTieringStatus status) {
        this.status = status;
    }

    /**
     * Sets the {@link com.amazonaws.services.s3.model.intelligenttiering.IntelligentTieringStatus} for the config.
     */
    public IntelligentTieringConfiguration withStatus(IntelligentTieringStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * Returns the S3 Intelligent-Tiering storage class tier of the configuration.
     */
    public List<Tiering> getTierings() {
        return tierings;
    }

    /**
     * Specifies the S3 Intelligent-Tiering storage class tier of the configuration.
     */
    public void setTierings(List<Tiering> tierings) {
        this.tierings = tierings;
    }

    /**
     * Specifies the S3 Intelligent-Tiering storage class tier of the configuration.
     */
    public IntelligentTieringConfiguration withTierings(List<Tiering> tierings) {
        setTierings(tierings);
        return this;
    }
}
