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
package com.amazonaws.services.stepfunctions.builder.states;

import static com.amazonaws.services.stepfunctions.builder.internal.JacksonUtils.jsonToString;
import static com.amazonaws.services.stepfunctions.builder.internal.JacksonUtils.objectToJsonNode;
import static com.amazonaws.services.stepfunctions.builder.internal.JacksonUtils.stringToJsonNode;

import com.amazonaws.services.stepfunctions.builder.internal.Buildable;
import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import java.util.ArrayList;
import java.util.List;

/**
 * State that allows for parallel execution of {@link Branch}s. A Parallel state causes the interpreter to execute each branch
 * starting with the state named in its “StartAt” field, as concurrently as possible, and wait until each branch terminates
 * (reaches a terminal state) before processing the Parallel state's “Next” field.
 *
 * @see <a href="https://states-language.net/spec.html#parallel-state">https://states-language.net/spec.html#parallel-state</a>
 */
public final class ParallelState extends TransitionState {

    @JsonProperty(PropertyNames.COMMENT)
    private final String comment;

    @JsonProperty(PropertyNames.BRANCHES)
    private final List<Branch> branches;

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

    private ParallelState(Builder builder) {
        this.comment = builder.comment;
        this.branches = Buildable.Utils.build(builder.branches);
        this.pathContainer = builder.pathContainer.build();
        this.transition = builder.transition.build();
        this.retriers = Buildable.Utils.build(builder.retriers);
        this.catchers = Buildable.Utils.build(builder.catchers);
    }

    /**
     * @return Type identifier of {@link ParallelState}.
     */
    @Override
    public String getType() {
        return "Parallel";
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
     * @return The branches of execution for this {@link ParallelState}.
     */
    public List<Branch> getBranches() {
        return branches;
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
     * @return Builder instance to construct a {@link ParallelState}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link ParallelState}.
     */
    public static final class Builder extends TransitionStateBuilder
        implements InputOutputResultPathBuilder<Builder>, ParametersBuilder<Builder> {

        @JsonProperty(PropertyNames.COMMENT)
        private String comment;

        @JsonProperty(PropertyNames.BRANCHES)
        private List<Branch.Builder> branches = new ArrayList<Branch.Builder>();

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
         * REQUIRED. Adds a new branch of execution to this states branches. A parallel state must have at least one branch.
         *
         * @param branchBuilder Instance of {@link com.amazonaws.services.stepfunctions.builder.states.Branch.Builder}. Note that
         *                      the {@link
         *                      Branch} object is not built until the {@link ParallelState} is built so any modifications on the
         *                      state builder will be reflected in this object.
         * @return This object for method chaining.
         */
        public Builder branch(Branch.Builder branchBuilder) {
            this.branches.add(branchBuilder);
            return this;
        }

        /**
         * REQUIRED. Adds the branches of execution to this states branches. A parallel state must have at least one branch.
         *
         * @param branchBuilders Instances of {@link com.amazonaws.services.stepfunctions.builder.states.Branch.Builder}. Note
         *                       that the {@link
         *                       Branch} object is not built until the {@link ParallelState} is built so any modifications on the
         *                       state builder will be reflected in this object.
         * @return This object for method chaining.
         */
        public Builder branches(Branch.Builder... branchBuilders) {
            for (Branch.Builder branchBuilder : branchBuilders) {
                branch(branchBuilder);
            }
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
         * REQUIRED. Sets the transition that will occur when all branches in this parallel
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
         * OPTIONAL. Adds the {@link Retrier}s to this states retries. If a single branch fails then the entire parallel state is
         * considered failed and eligible for retry.
         *
         * @param retrierBuilders Instances of {@link com.amazonaws.services.stepfunctions.builder.states.Retrier.Builder}. Note
         *                        that the {@link
         *                        Retrier} object is not built until the {@link ParallelState} is built so any modifications on
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
         * OPTIONAL. Adds the {@link Retrier} to this states retries. If a single branch fails then the entire parallel state is
         * considered failed and eligible for retry.
         *
         * @param retrierBuilder Instance of {@link com.amazonaws.services.stepfunctions.builder.states.Retrier.Builder}. Note
         *                       that the {@link
         *                       Retrier} object is not built until the {@link ParallelState} is built so any modifications on
         *                       the
         *                       state builder will be reflected in this object.
         * @return This object for method chaining.
         */
        public Builder retrier(Retrier.Builder retrierBuilder) {
            this.retriers.add(retrierBuilder);
            return this;
        }

        /**
         * OPTIONAL. Adds the {@link Catcher}s to this states catchers.  If a single branch fails then the entire parallel state
         * is considered failed and eligible to be caught.
         *
         * @param catcherBuilders Instances of {@link com.amazonaws.services.stepfunctions.builder.states.Catcher.Builder}. Note
         *                        that the {@link
         *                        Catcher} object is not built until the {@link ParallelState} is built so any modifications on
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
         * OPTIONAL. Adds the {@link Catcher} to this states catchers.  If a single branch fails then the entire parallel state
         * is
         * considered failed and eligible to be caught.
         *
         * @param catcherBuilder Instance of {@link com.amazonaws.services.stepfunctions.builder.states.Catcher.Builder}. Note
         *                       that the {@link
         *                       Catcher} object is not built until the {@link ParallelState} is built so any modifications on
         *                       the
         *                       state builder will be reflected in this object.
         * @return This object for method chaining.
         */
        public Builder catcher(Catcher.Builder catcherBuilder) {
            this.catchers.add(catcherBuilder);
            return this;
        }

        /**
         * @return An immutable {@link ParallelState} object.
         */
        public ParallelState build() {
            return new ParallelState(this);
        }
    }
}
