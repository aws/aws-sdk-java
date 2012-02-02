/*
 * Copyright 2011-2012 Amazon Technologies, Inc.
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

import java.util.Arrays;
import java.util.List;

/**
 * Container for bucket lifecycle configuration operations.
 */
public class BucketLifecycleConfiguration {

    /**
     * Constant for an enabled rule.
     * 
     * @see Rule#setStatus(String)
     */
    public static final String ENABLED = "Enabled";

    /**
     * Constant for a disabled rule.
     * 
     * @see Rule#setStatus(String)
     */
    public static final String DISABLED = "Disabled";

    private List<Rule> rules;

    /**
     * Returns the list of rules that comprise this configuration.
     */
    public List<Rule> getRules() {
        return rules;
    }

    /**
     * Sets the rules that comprise this configuration.
     */
    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    /**
     * Sets the rules that comprise this configuration and returns a reference
     * to this object for easy method chaining.
     */
    public BucketLifecycleConfiguration withRules(List<Rule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * Convenience array style method for
     * {@link BucketLifecycleConfiguration#withRules(List)}
     */
    public BucketLifecycleConfiguration withRules(Rule... rules) {
        setRules(Arrays.asList(rules));
        return this;
    }

    /**
     * Constructs a new {@link BucketLifecycleConfiguration} object with the
     * rules given.
     * 
     * @param rules
     */
    public BucketLifecycleConfiguration(List<Rule> rules) {
        this.rules = rules;
    }

    public BucketLifecycleConfiguration() {
        super();
    }

    public static class Rule {

        private String id;
        private String prefix;
        private String status;
        private int expirationInDays;

        /**
         * Sets the ID of this rule. Rules must be less than 255 alphanumeric
         * characters, and must be unique for a bucket. If you do not assign an
         * ID, one will be generated.
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         * Sets the key prefix for which this rule will apply.
         */
        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        /**
         * Sets the time, in days, between when an object is uploaded to the
         * bucket and when it expires.
         */
        public void setExpirationInDays(int expirationInDays) {
            this.expirationInDays = expirationInDays;
        }

        /**
         * Returns the ID of this rule.
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the ID of this rule and returns a reference to this object for
         * method chaining.
         * 
         * @see Rule#setId(String)
         */
        public Rule withId(String id) {
            this.id = id;
            return this;
        }

        /**
         * Returns the key prefix for which this rule will apply.
         */
        public String getPrefix() {
            return prefix;
        }

        /**
         * Sets the key prefix for this rule and returns a reference to this
         * object for method chaining.
         * 
         * @see Rule#setPrefix(String)
         */
        public Rule withPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Returns the time in days from an object's creation to its expiration.
         */
        public int getExpirationInDays() {
            return expirationInDays;
        }

        /**
         * Sets the time, in days, between when an object is uploaded to the
         * bucket and when it expires, and returns a reference to this object
         * for method chaining.
         * 
         * @see Rule#setExpirationInDays(int)
         */
        public Rule withExpirationInDays(int expirationInDays) {
            this.expirationInDays = expirationInDays;
            return this;
        }

        /**
         * Returns the status of this rule.
         * 
         * @see BucketLifecycleConfiguration#DISABLED
         * @see BucketLifecycleConfiguration#ENABLED
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the status of this rule.
         * 
         * @see BucketLifecycleConfiguration#DISABLED
         * @see BucketLifecycleConfiguration#ENABLED
         */
        public void setStatus(String status) {
            this.status = status;
        }

        /**
         * Sets the status of this rule and returns a reference to this object
         * for method chaining.
         * 
         * @see Rule#setStatus(String)
         * @see BucketLifecycleConfiguration#DISABLED
         * @see BucketLifecycleConfiguration#ENABLED
         */
        public Rule withStatus(String status) {
            setStatus(status);
            return this;
        }
    }

}
