/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
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
package com.amazonaws.services.s3.model;
import java.io.Serializable;

/**
 * Container for bucket cross origin configuration operations.
 */

import java.util.Arrays;
import java.util.List;

public class BucketCrossOriginConfiguration implements Serializable {

	
    private List<CORSRule> rules;

    /**
     * Returns the list of rules that comprise this configuration.
     */
    public List<CORSRule> getRules() {
        return rules;
    }

    /**
     * Sets the rules that comprise this configuration.
     */
    public void setRules(List<CORSRule> rules) {
        this.rules = rules;
    }

    /**
     * Sets the rules that comprise this configuration and returns a reference
     * to this object for easy method chaining.
     */
    public BucketCrossOriginConfiguration withRules(List<CORSRule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * Convenience array style method for
     * {@link BucketCrossOriginConfiguration#withRules(List)}
     */
    public BucketCrossOriginConfiguration withRules(CORSRule... rules) {
        setRules(Arrays.asList(rules));
        return this;
    }

    /**
     * Constructs a new {@link BucketCrossOriginConfiguration} object with the
     * rules given.
     * 
     * @param rules
     */
    public BucketCrossOriginConfiguration(List<CORSRule> rules) {
        this.rules = rules;
    }

    public BucketCrossOriginConfiguration() {
        super();
    }
	
}


