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

import com.amazonaws.services.stepfunctions.builder.ErrorCodes;
import com.amazonaws.services.stepfunctions.builder.internal.Buildable;
import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import java.util.ArrayList;
import java.util.List;

/**
 * The Task State causes the interpreter to execute the work identified by the state’s “Resource” field.
 *
 * <p>Currently allowed resources include Lambda functions and States activities.</p>
 *
 * @see <a href="https://states-language.net/spec.html#task-state">https://states-language.net/spec.html#task-state</a>
 */
public final class TaskState extends TransitionState {

    @JsonProperty(PropertyNames.RESOURCE)
    private final String resource;

    @JsonUnwrapped
    private final PathContainer pathContainer;

    @JsonProperty(PropertyNames.COMMENT)
    private final String comment;

    @JsonProperty(PropertyNames.TIMEOUT_SECONDS)
    private final Integer timeoutSeconds;

    @JsonProperty(PropertyNames.HEARTBEAT_SECONDS)
    private final Integer heartbeatSeconds;

    @JsonUnwrapped
    private final Transition transition;

    @JsonProperty(PropertyNames.RETRY)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private final List<Retrier> retriers;

    @JsonProperty(PropertyNames.CATCH)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private final List<Catcher> catchers;

    private TaskState(Builder builder) {
        this.resource = builder.resource;
        this.pathContainer = builder.pathContainer.build();
        this.comment = builder.comment;
        this.timeoutSeconds = builder.timeoutSeconds;
        this.heartbeatSeconds = builder.heartbeatSeconds;
        this.transition = builder.transition.build();
        this.retriers = Buildable.Utils.build(builder.retriers);
        this.catchers = Buildable.Utils.build(builder.catchers);
    }

    /**
     * @return Type identifier of {@link TaskState}.
     */
    @Override
    public String getType() {
        return "Task";
    }

    /**
     * @return URI of the resource to be executed by this task.
     */
    public String getResource() {
        return resource;
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
     * @return The transition that will occur when this task completes successfully.
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
     * @return Timeout, in seconds, that a task is allowed to run.
     */
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * @return Allowed time between "Heartbeats".
     */
    public Integer getHeartbeatSeconds() {
        return heartbeatSeconds;
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
     * @return Builder instance to construct a {@link TaskState}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link TaskState}.
     */
    public static final class Builder extends TransitionStateBuilder
        implements InputOutputResultPathBuilder<Builder>, ParametersBuilder<Builder> {

        @JsonProperty(PropertyNames.RESOURCE)
        private String resource;

        @JsonProperty(PropertyNames.COMMENT)
        private String comment;

        @JsonProperty(PropertyNames.TIMEOUT_SECONDS)
        private Integer timeoutSeconds;

        @JsonProperty(PropertyNames.HEARTBEAT_SECONDS)
        private Integer heartbeatSeconds;

        private Transition.Builder transition = Transition.NULL_BUILDER;

        @JsonUnwrapped
        private PathContainer.Builder pathContainer = PathContainer.builder();

        @JsonProperty(PropertyNames.RETRY)
        private final List<Retrier.Builder> retriers = new ArrayList<Retrier.Builder>();

        @JsonProperty(PropertyNames.CATCH)
        private final List<Catcher.Builder> catchers = new ArrayList<Catcher.Builder>();

        private Builder() {
        }

        /**
         * REQUIRED. Sets the resource to be executed by this task. Must be a URI that uniquely identifies the specific task to
         * execute. This may be the ARN of a Lambda function or a States Activity.
         *
         * @param resource URI of resource.
         * @return This object for method chaining.
         */
        public Builder resource(String resource) {
            this.resource = resource;
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
         * OPTIONAL. Timeout, in seconds, that a task is allowed to run. If the task execution runs longer than this timeout the
         * execution fails with a {@link ErrorCodes#TIMEOUT} error.
         *
         * @param timeoutSeconds Timeout value.
         * @return This object for method chaining.
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * OPTIONAL. Allowed time between "Heartbeats". If the task does not send "Heartbeats" within the timeout then execution
         * fails with a {@link ErrorCodes#TIMEOUT}. If not set then no heartbeats are required. Heartbeats are a more granular
         * way
         * for a task to report it's progress to the state machine.
         *
         * @param heartbeatSeconds Heartbeat value.
         * @return This object for method chaining.
         */
        public Builder heartbeatSeconds(Integer heartbeatSeconds) {
            this.heartbeatSeconds = heartbeatSeconds;
            return this;
        }

        /**
         * REQUIRED. Sets the transition that will occur when the task completes successfully.
         *
         * @param transition New transition.
         * @return This object for method chaining.
         */
        public Builder transition(Transition.Builder transition) {
            this.transition = transition;
            return this;
        }

        /**
         * OPTIONAL. Adds the {@link Retrier}s to this states retriers. If the task exits abnormally (throws exception, times
         * out,
         * etc) it will be considered failed and eligible to be retried.
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
         * OPTIONAL. Adds the {@link Retrier} to this states retriers. If the task exits abnormally (throws exception, times out,
         * etc) it will be considered failed and eligible to be retried.
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
         * OPTIONAL. Adds the {@link Catcher}s to this states catchers. If the task exits abnormally (throws exception, times
         * out,
         * etc) it will be considered failed and eligible to be caught.
         *
         * @param catcherBuilders Instances of {@link com.amazonaws.services.stepfunctions.builder.states.Catcher.Builder}. Note
         *                        that the {@link
         *                        Catcher} object is not built until the {@link TaskState} is built so any modifications on the
         *                        state builder will be reflected in this object.
         * @return This object for method chaining.
         */
        public Builder catchers(Catcher.Builder... catcherBuilders) {
            for (Catcher.Builder catcherBuilder : catcherBuilders) {
                catcher(catcherBuilder);
            }
            return this;
        }

        /**
         * OPTIONAL. Adds the {@link Catcher} to this states catchers. If the task exits abnormally (throws exception, times out,
         * etc) it will be considered failed and eligible to be caught.
         *
         * @param catcherBuilder Instance of {@link com.amazonaws.services.stepfunctions.builder.states.Catcher.Builder}. Note
         *                       that the {@link
         *                       Catcher} object is not built until the {@link TaskState} is built so any modifications on the
         *                       state builder will be reflected in this object.
         * @return This object for method chaining.
         */
        public Builder catcher(Catcher.Builder catcherBuilder) {
            this.catchers.add(catcherBuilder);
            return this;
        }

        /**
         * @return An immutable {@link TaskState} object.
         */
        public TaskState build() {
            return new TaskState(this);
        }
    }

}
