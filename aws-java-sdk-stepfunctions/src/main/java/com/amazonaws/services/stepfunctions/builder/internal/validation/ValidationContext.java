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
package com.amazonaws.services.stepfunctions.builder.internal.validation;

import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.amazonaws.util.CollectionUtils;
import com.amazonaws.util.StringUtils;
import java.util.Collection;
import java.util.Map;

/**
 * Contains context about the current validation scope and factory methods
 * for new sub-contexts and for reporting various common problems.
 */
final class ValidationContext {

    private final ValidationContext parentContext;
    private final Location location;
    private final String identifier;
    private final ProblemReporter problemReporter;

    private ValidationContext(Builder builder) {
        this.parentContext = builder.parentContext;
        this.location = builder.location;
        this.identifier = builder.identifier;
        this.problemReporter = builder.problemReporter;
    }

    /**
     * @return Path to validation error given current context.
     */
    public String getPath() {
        String parentPath = parentContext == null ? "" : parentContext.getPath() + ".";
        switch (location) {
            case Branch:
            case Retrier:
            case Catcher:
            case Choice:
            case State:
                return String.format("%s%s[%s]", parentPath, location.toString(), identifier);
            case StateMachine:
                return "StateMachine";
            default:
                return "Unknown";
        }
    }

    /**
     * Asserts the value is not null, reporting to {@link ProblemReporter} with this context if it is.
     *
     * @param propertyValue Value to assert on.
     * @param propertyName  Name of property.
     */
    public void assertNotNull(Object propertyValue, String propertyName) {
        if (propertyValue == null) {
            problemReporter.report(new Problem(this, String.format("%s is a required property.", propertyName)));
        }
    }

    /**
     * Asserts the string is not null and not empty, reporting to {@link ProblemReporter} with this context if it is.
     *
     * @param propertyValue Value to assert on.
     * @param propertyName  Name of property.
     */
    public void assertStringNotEmpty(String propertyValue, String propertyName) {
        if (StringUtils.isNullOrEmpty(propertyValue)) {
            problemReporter.report(new Problem(this, String.format("%s is a required property.", propertyName)));
        }
    }

    /**
     * Asserts the collection is not null and not empty, reporting to {@link ProblemReporter} with this context if it is.
     *
     * @param collection   Collection to assert on.
     * @param propertyName Name of property.
     */
    public void assertNotEmpty(Collection<?> collection, String propertyName) {
        if (CollectionUtils.isNullOrEmpty(collection)) {
            problemReporter.report(new Problem(this, String.format("%s requires one or more items", propertyName)));
        }
    }

    /**
     * Asserts the map is not null and not empty, reporting to {@link ProblemReporter} with this context if it is.
     *
     * @param map          Map to assert on.
     * @param propertyName Name of property.
     */
    public void assertNotEmpty(Map<?, ?> map, String propertyName) {
        if (map == null || map.size() == 0) {
            problemReporter.report(new Problem(this, String.format("%s requires one or more entries", propertyName)));
        }
    }

    /**
     * Asserts the integer is either null or positive, reporting to {@link ProblemReporter} with this context if it is.
     *
     * @param integer      Value to assert on.
     * @param propertyName Name of property.
     */
    public void assertIsPositiveIfPresent(Integer integer, String propertyName) {
        if (integer != null && integer <= 0) {
            problemReporter.report(new Problem(this, String.format("%s must be positive", propertyName)));
        }
    }

    /**
     * Asserts the integer is either null or non-negative, reporting to {@link ProblemReporter} with this context if it is.
     *
     * @param integer      Value to assert on.
     * @param propertyName Name of property.
     */
    public void assertIsNotNegativeIfPresent(Integer integer, String propertyName) {
        if (integer != null && integer < 0) {
            problemReporter.report(new Problem(this, String.format("%s must be non negative", propertyName)));
        }
    }

    /**
     * Asserts that the string represents a valid JsonPath expression.
     *
     * @param path Path expression to validate.
     */
    public void assertIsValidInputPath(String path) {
        assertIsValidJsonPath(path, PropertyNames.INPUT_PATH);
    }

    /**
     * Asserts that the string represents a valid JsonPath expression.
     *
     * @param path Path expression to validate.
     */
    public void assertIsValidOutputPath(String path) {
        assertIsValidJsonPath(path, PropertyNames.OUTPUT_PATH);
    }

    /**
     * Asserts that the string represents a valid JsonPath expression.
     *
     * @param path Path expression to validate.
     */
    public void assertIsValidResultPath(String path) {
        assertIsValidReferencePath(path, PropertyNames.RESULT_PATH);
    }

    /**
     * Asserts that the string represents a valid JsonPath expression.
     *
     * @param path         Path expression to validate.
     * @param propertyName Name of property.
     */
    public void assertIsValidJsonPath(String path, String propertyName) {
        if (path == null) {
            return;
        }
        if (path.isEmpty()) {
            problemReporter.report(new Problem(this, String.format("%s cannot be empty", propertyName)));
            return;
        }
    }

    /**
     * Asserts that the string represents a valid reference path expression.
     *
     * @param path         Path expression to validate.
     * @param propertyName Name of property.
     */
    public void assertIsValidReferencePath(String path, String propertyName) {
        if (path == null) {
            return;
        }
        if (path.isEmpty()) {
            problemReporter.report(new Problem(this, String.format("%s cannot be empty", propertyName)));
            return;
        }
    }

    /**
     * @param stateName Name of state.
     * @return State sub-context.
     */
    public ValidationContext state(String stateName) {
        return newChildContext()
                .identifier(stateName)
                .location(Location.State)
                .build();
    }

    /**
     * @param index Index of retrier.
     * @return Retrier sub-context.
     */
    public ValidationContext retrier(int index) {
        return newChildContext()
                .identifier(String.valueOf(index))
                .location(Location.Retrier)
                .build();
    }

    /**
     * @param index Index of branch.
     * @return Branch sub-context.
     */
    public ValidationContext branch(int index) {
        return newChildContext()
                .identifier(String.valueOf(index))
                .location(Location.Branch)
                .build();
    }

    /**
     * @param index Index of choice.
     * @return Choice sub-context.
     */
    public ValidationContext choice(int index) {
        return newChildContext()
                .identifier(String.valueOf(index))
                .location(Location.Choice)
                .build();
    }

    /**
     * @param index Index of catcher.
     * @return Catcher sub-context.
     */
    public ValidationContext catcher(int index) {
        return newChildContext()
                .identifier(String.valueOf(index))
                .location(Location.Catcher)
                .build();
    }

    /**
     * @return Sub-context with this context as the parent and the
     * same problem reporter.
     */
    private ValidationContext.Builder newChildContext() {
        return ValidationContext.builder()
                .parentContext(this)
                .problemReporter(problemReporter);
    }

    /**
     * @return Builder instance to construct a {@link ValidationContext}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link ValidationContext}.
     */
    public static final class Builder {

        private ValidationContext parentContext;
        private Location location;
        private String identifier;
        private ProblemReporter problemReporter;

        private Builder() {
        }

        /**
         * Sets the parent of the new context. May be null if at the root.
         *
         * @param parentContext Parent of context being built.
         * @return This object for method chaining.
         */
        public Builder parentContext(ValidationContext parentContext) {
            this.parentContext = parentContext;
            return this;
        }

        /**
         * Sets the location of the context.
         *
         * @return This object for method chaining.
         */
        public Builder location(Location location) {
            this.location = location;
            return this;
        }

        /**
         * Sets an additional identifier (i.e. state name, branch index, etc) for the context. May be null.
         *
         * @return This object for method chaining.
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * Sets the problem reporter to report problems in assertion methods.
         *
         * @return This object for method chaining.
         */
        public Builder problemReporter(ProblemReporter problemReporter) {
            this.problemReporter = problemReporter;
            return this;
        }

        /**
         * @return An immutable {@link ValidationContext} object.
         */
        public ValidationContext build() {
            return new ValidationContext(this);
        }
    }
}
