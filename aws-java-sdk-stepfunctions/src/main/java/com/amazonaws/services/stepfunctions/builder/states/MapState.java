/*
 * Copyright 2011-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.stepfunctions.builder.states;

import com.amazonaws.services.stepfunctions.builder.internal.Buildable;
import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.util.ArrayList;
import java.util.List;

import static com.amazonaws.services.stepfunctions.builder.internal.JacksonUtils.*;

/**
 * State that allows for applying the same {@link Iterator} to multiple input elements.
 * The Map State (identified by "Type": "Map") causes the interpreter to process all the elements of an array,
 * potentially in parallel, with the processing of each element independent of the others.
 *
 * @see <a href="https://states-language.net/spec.html#map-state">https://states-language.net/spec.html#map-state</a>
 */
public final class MapState extends TransitionState {

    @JsonProperty(PropertyNames.COMMENT)
    private final String comment;

    @JsonProperty(PropertyNames.ITERATOR)
    private final Iterator iterator;

    @JsonProperty(PropertyNames.MAX_CONCURRENCY)
    private final Integer maxConcurrency;

    @JsonUnwrapped
    private final PathContainer pathContainer;

    @JsonUnwrapped
    private final Transition transition;

    @JsonProperty(PropertyNames.RETRY)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private final List<Retrier> retriers;

    @JsonProperty(PropertyNames.CATCH)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private final List<Catcher> catchers;

    private MapState(Builder builder) {
        this.comment = builder.comment;
        this.iterator = builder.iterator.build();
        this.pathContainer = builder.pathContainer.build();
        this.maxConcurrency = builder.maxConcurrency;
        this.transition = builder.transition.build();
        this.retriers = Buildable.Utils.build(builder.retriers);
        this.catchers = Buildable.Utils.build(builder.catchers);
    }

    /**
     * @return Type identifier of {@link MapState}.
     */
    @Override
    public String getType() {
        return "Map";
    }

    /**
     * @return The transition that will occur when all branches have executed successfully.
     */
    public Transition getTransition() {
        return transition;
    }

    /**
     * @return Human readable description for the state.
     */
    public String getComment() {
        return comment;
    }

    /**
     * @return Max Concurrency provides an upper bound on how many invocations of the Iterator may run in parallel
     */
    public Integer getMaxConcurrency() {
        return maxConcurrency;
    }

    /**
     * @return The iterator for this {@link MapState}.
     */
    public Iterator getIterator() {
        return iterator;
    }

    /**
     * @return The input path expression that may optionally transform the input to this state.
     */
    @JsonIgnore
    public String getInputPath() {
        return pathContainer.getInputPath();
    }

    /**
     * @return The result path expression that may optionally combine or replace the state's raw input with it's result.
     */
    @JsonIgnore
    public String getResultPath() {
        return pathContainer.getResultPath();
    }

    /**
     * @return The items path expression that is a reference path identifying where in the effective input the array field is found
     */
    @JsonIgnore
    public String getItemsPath() {
        return pathContainer.getItemsPath();
    }

    /**
     * @return The output path expression that may optionally transform the output to this state.
     */
    @JsonIgnore
    public String getOutputPath() {
        return pathContainer.getOutputPath();
    }

    /**
     * @return The Parameters JSON document that may optionally transform the effective input to the task.
     */
    @JsonIgnore
    public String getParameters() {
        return jsonToString(pathContainer.getParameters());
    }

    /**
     * @return The list of {@link Retrier}s for this state.
     */
    public List<Retrier> getRetriers() {
        return retriers;
    }

    /**
     * @return The list of {@link Catcher}s for this state.
     */
    public List<Catcher> getCatchers() {
        return catchers;
    }

    @Override
    public <T> T accept(StateVisitor<T> visitor) {
        return visitor.visit(this);
    }

    /**
     * @return Builder instance to construct a {@link MapState}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link MapState}.
     */
    public static final class Builder extends TransitionStateBuilder
        implements InputOutputResultItemsPathBuilder<Builder>, ParametersBuilder<Builder> {

        @JsonProperty(PropertyNames.COMMENT)
        private String comment;

        @JsonProperty(PropertyNames.MAX_CONCURRENCY)
        private Integer maxConcurrency;

        @JsonProperty(PropertyNames.ITERATOR)
        private Iterator.Builder iterator = Iterator.builder();

        @JsonUnwrapped
        private final PathContainer.Builder pathContainer = PathContainer.builder();

        private Transition.Builder transition = Transition.NULL_BUILDER;

        @JsonProperty(PropertyNames.RETRY)
        private List<Retrier.Builder> retriers = new ArrayList<Retrier.Builder>();

        @JsonProperty(PropertyNames.CATCH)
        private List<Catcher.Builder> catchers = new ArrayList<Catcher.Builder>();

        private Builder() {
        }

        /**
         * OPTIONAL. Human readable description for the state.
         *
         * @param comment New comment.
         * @return This object for method chaining.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * OPTIONAL. Max Concurrency provides an upper bound on how many invocations of the Iterator may run in parallel
         *
         * @param maxConcurrency New comment.
         * @return This object for method chaining.
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * REQUIRED. Iterator for this Map state.
         *
         * @param iteratorBuilder Instance of {@link Iterator.Builder}. Note that
         *                      the {@link
         *                      Iterator} object is not built until the {@link MapState} is built so any modifications on the
         *                      state builder will be reflected in this object.
         * @return This object for method chaining.
         */
        public Builder iterator(Iterator.Builder iteratorBuilder) {
            this.iterator = iteratorBuilder;
            return this;
        }

        @Override
        public Builder inputPath(String inputPath) {
            pathContainer.inputPath(inputPath);
            return this;
        }

        @Override
        public Builder resultPath(String resultPath) {
            pathContainer.resultPath(resultPath);
            return this;
        }

        @Override
        public Builder itemsPath(String itemsPath) {
            pathContainer.itemsPath(itemsPath);
            return this;
        }

        @Override
        public Builder outputPath(String outputPath) {
            pathContainer.outputPath(outputPath);
            return this;
        }

        @Override
        public Builder parameters(String parameters) {
            pathContainer.parameters(stringToJsonNode("Parameters", parameters));
            return this;
        }

        @Override
        public Builder parameters(Object parameters) {
            pathContainer.parameters(objectToJsonNode(parameters));
            return this;
        }

        /**
         * REQUIRED. Sets the transition that will occur when all branches in this map
         * state have executed successfully.
         *
         * @param builder New transition.
         * @return This object for method chaining.
         */
        @Override
        public Builder transition(Transition.Builder builder) {
            this.transition = builder;
            return this;
        }

        /**
         * OPTIONAL. Adds the {@link Retrier}s to this states retries. If a single branch fails then the entire map state is
         * considered failed and eligible for retry.
         *
         * @param retrierBuilders Instances of {@link Retrier.Builder}. Note
         *                        that the {@link
         *                        Retrier} object is not built until the {@link MapState} is built so any modifications on
         *                        the state builder will be reflected in this object.
         * @return This object for method chaining.
         */
        public Builder retriers(Retrier.Builder... retrierBuilders) {
            for (Retrier.Builder retrierBuilder : retrierBuilders) {
                retrier(retrierBuilder);
            }
            return this;
        }

        /**
         * OPTIONAL. Adds the {@link Retrier} to this states retries. If a single branch fails then the entire map state is
         * considered failed and eligible for retry.
         *
         * @param retrierBuilder Instance of {@link Retrier.Builder}. Note
         *                       that the {@link
         *                       Retrier} object is not built until the {@link MapState} is built so any modifications on
         *                       the
         *                       state builder will be reflected in this object.
         * @return This object for method chaining.
         */
        public Builder retrier(Retrier.Builder retrierBuilder) {
            this.retriers.add(retrierBuilder);
            return this;
        }

        /**
         * OPTIONAL. Adds the {@link Catcher}s to this states catchers.  If a single branch fails then the entire map state
         * is considered failed and eligible to be caught.
         *
         * @param catcherBuilders Instances of {@link Catcher.Builder}. Note
         *                        that the {@link
         *                        Catcher} object is not built until the {@link MapState} is built so any modifications on
         *                        the state builder will be reflected in this object.
         * @return This object for method chaining.
         */
        public Builder catchers(Catcher.Builder... catcherBuilders) {
            for (Catcher.Builder catcherBuilder : catcherBuilders) {
                catcher(catcherBuilder);
            }
            return this;
        }

        /**
         * OPTIONAL. Adds the {@link Catcher} to this states catchers.  If a single branch fails then the entire map state
         * is
         * considered failed and eligible to be caught.
         *
         * @param catcherBuilder Instance of {@link Catcher.Builder}. Note
         *                       that the {@link
         *                       Catcher} object is not built until the {@link MapState} is built so any modifications on
         *                       the
         *                       state builder will be reflected in this object.
         * @return This object for method chaining.
         */
        public Builder catcher(Catcher.Builder catcherBuilder) {
            this.catchers.add(catcherBuilder);
            return this;
        }

        /**
         * @return An immutable {@link MapState} object.
         */
        public MapState build() {
            return new MapState(this);
        }
    }
}
