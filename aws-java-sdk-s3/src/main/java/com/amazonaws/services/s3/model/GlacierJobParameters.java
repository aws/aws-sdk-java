/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Glacier related prameters pertaining to a job.
 */
public class GlacierJobParameters implements Serializable {

    private String tier;

    /**
     * @return Glacier retrieval tier at which the restore will be processed.
     */
    public String getTier() {
        return tier;
    }

    /**
     * Sets Glacier retrieval tier at which the restore will be processed.
     *
     * @param tier New tier value
     */
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * Sets Glacier retrieval tier at which the restore will be processed.
     *
     * @param tier New tier enum value.
     */
    public void setTier(Tier tier) {
        setTier(tier == null ? null : tier.toString());
    }

    /**
     * Sets Glacier retrieval tier at which the restore will be processed.
     *
     * @param tier New tier value.
     * @return This object for method chaining.
     */
    public GlacierJobParameters withTier(String tier) {
        setTier(tier);
        return this;
    }

    /**
     * Sets Glacier retrieval tier at which the restore will be processed.
     *
     * @param tier New tier enum value.
     * @return This object for method chaining.
     */
    public GlacierJobParameters withTier(Tier tier) {
        setTier(tier);
        return this;
    }
}
