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
import java.util.Objects;

/**
 * Specifies the S3 Intelligent-Tiering storage class tier of the configuration.
 */
public class Tiering implements Serializable {
    private Integer days;
    private IntelligentTieringAccessTier accessTier;

    /**
     * Returns the number of days that you want your archived data to be accessible.
     */
    public Integer getDays() {
        return days;
    }

    /**
     * Sets the number of days that you want your archived data to be accessible.
     * The minimum number of days specified in the restore request must be at least 90 days.
     * If a smaller value is specifed it will be ignored.
     */
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * Sets the number of days that you want your archived data to be accessible and returns the {@link Tiering} object
     * for method chaining. The minimum number of days specified in the restore request must be at least 90 days.
     * If a smaller value is specifed it will be ignored.
     */
    public Tiering withDays(Integer days) {
        setDays(days);
        return this;
    }

    /**
     * Returns the filter used to describe a set of objects for S3 Intelligent-Tiering.
     */
    public IntelligentTieringAccessTier getAccessTier() {
        return accessTier;
    }

    /**
     * Sets S3 Intelligent-Tiering access tier.
     * See <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access\">
     * Storage class for automatically optimizing frequently and infrequently accessed objects</a>
     * for a list of access tiers in the S3 Intelligent-Tiering storage class.
     */
    public void setAccessTier(IntelligentTieringAccessTier accessTier) {
        this.accessTier = accessTier;
    }

    /**
     * Sets S3 Intelligent-Tiering access tier and returns the {@link Tiering} object is returned for method chaining.
     * See <a href=\"https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access\">
     * Storage class for automatically optimizing frequently and infrequently accessed objects</a>
     * for a list of access tiers in the S3 Intelligent-Tiering storage class.
     */
    public Tiering withIntelligentTieringAccessTier(IntelligentTieringAccessTier intelligentTieringAccessTier) {
        setAccessTier(intelligentTieringAccessTier);
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tiering tiering = (Tiering) o;
        return Objects.equals(days, tiering.days) &&
                       accessTier == tiering.accessTier;
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, accessTier);
    }
}
