/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.scheduler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The schedule's target. EventBridge Scheduler supports templated target that invoke common API operations, as well as
 * universal targets that you can customize to invoke over 6,000 API operations across more than 270 services. You can
 * only specify one templated or universal target for a schedule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/Target" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Target implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * An object that contains information about an Amazon SQS queue that EventBridge Scheduler uses as a dead-letter
     * queue for your schedule. If specified, EventBridge Scheduler delivers failed events that could not be
     * successfully delivered to a target to the queue.
     * </p>
     */
    private DeadLetterConfig deadLetterConfig;
    /**
     * <p>
     * The templated target type for the Amazon ECS <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html"> <code>RunTask</code> </a> API
     * operation.
     * </p>
     */
    private EcsParameters ecsParameters;
    /**
     * <p>
     * The templated target type for the EventBridge <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html"> <code>PutEvents</code>
     * </a> API operation.
     * </p>
     */
    private EventBridgeParameters eventBridgeParameters;
    /**
     * <p>
     * The text, or well-formed JSON, passed to the target. If you are configuring a templated Lambda, AWS Step
     * Functions, or Amazon EventBridge target, the input must be a well-formed JSON. For all other target types, a JSON
     * is not required. If you do not specify anything for this field, EventBridge Scheduler delivers a default
     * notification to the target.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The templated target type for the Amazon Kinesis <a href="kinesis/latest/APIReference/API_PutRecord.html">
     * <code>PutRecord</code> </a> API operation.
     * </p>
     */
    private KinesisParameters kinesisParameters;
    /**
     * <p>
     * A <code>RetryPolicy</code> object that includes information about the retry policy settings, including the
     * maximum age of an event, and the maximum number of times EventBridge Scheduler will try to deliver the event to a
     * target.
     * </p>
     */
    private RetryPolicy retryPolicy;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that EventBridge Scheduler will use for this target when the
     * schedule is invoked.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The templated target type for the Amazon SageMaker <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html">
     * <code>StartPipelineExecution</code> </a> API operation.
     * </p>
     */
    private SageMakerPipelineParameters sageMakerPipelineParameters;
    /**
     * <p>
     * The templated target type for the Amazon SQS <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html">
     * <code>SendMessage</code> </a> API operation. Contains the message group ID to use when the target is a FIFO
     * queue. If you specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication
     * enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html"
     * >Using the Amazon SQS message deduplication ID</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     */
    private SqsParameters sqsParameters;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the target.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the target.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * An object that contains information about an Amazon SQS queue that EventBridge Scheduler uses as a dead-letter
     * queue for your schedule. If specified, EventBridge Scheduler delivers failed events that could not be
     * successfully delivered to a target to the queue.
     * </p>
     * 
     * @param deadLetterConfig
     *        An object that contains information about an Amazon SQS queue that EventBridge Scheduler uses as a
     *        dead-letter queue for your schedule. If specified, EventBridge Scheduler delivers failed events that could
     *        not be successfully delivered to a target to the queue.
     */

    public void setDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        this.deadLetterConfig = deadLetterConfig;
    }

    /**
     * <p>
     * An object that contains information about an Amazon SQS queue that EventBridge Scheduler uses as a dead-letter
     * queue for your schedule. If specified, EventBridge Scheduler delivers failed events that could not be
     * successfully delivered to a target to the queue.
     * </p>
     * 
     * @return An object that contains information about an Amazon SQS queue that EventBridge Scheduler uses as a
     *         dead-letter queue for your schedule. If specified, EventBridge Scheduler delivers failed events that
     *         could not be successfully delivered to a target to the queue.
     */

    public DeadLetterConfig getDeadLetterConfig() {
        return this.deadLetterConfig;
    }

    /**
     * <p>
     * An object that contains information about an Amazon SQS queue that EventBridge Scheduler uses as a dead-letter
     * queue for your schedule. If specified, EventBridge Scheduler delivers failed events that could not be
     * successfully delivered to a target to the queue.
     * </p>
     * 
     * @param deadLetterConfig
     *        An object that contains information about an Amazon SQS queue that EventBridge Scheduler uses as a
     *        dead-letter queue for your schedule. If specified, EventBridge Scheduler delivers failed events that could
     *        not be successfully delivered to a target to the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        setDeadLetterConfig(deadLetterConfig);
        return this;
    }

    /**
     * <p>
     * The templated target type for the Amazon ECS <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html"> <code>RunTask</code> </a> API
     * operation.
     * </p>
     * 
     * @param ecsParameters
     *        The templated target type for the Amazon ECS <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html"> <code>RunTask</code>
     *        </a> API operation.
     */

    public void setEcsParameters(EcsParameters ecsParameters) {
        this.ecsParameters = ecsParameters;
    }

    /**
     * <p>
     * The templated target type for the Amazon ECS <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html"> <code>RunTask</code> </a> API
     * operation.
     * </p>
     * 
     * @return The templated target type for the Amazon ECS <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html"> <code>RunTask</code>
     *         </a> API operation.
     */

    public EcsParameters getEcsParameters() {
        return this.ecsParameters;
    }

    /**
     * <p>
     * The templated target type for the Amazon ECS <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html"> <code>RunTask</code> </a> API
     * operation.
     * </p>
     * 
     * @param ecsParameters
     *        The templated target type for the Amazon ECS <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html"> <code>RunTask</code>
     *        </a> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withEcsParameters(EcsParameters ecsParameters) {
        setEcsParameters(ecsParameters);
        return this;
    }

    /**
     * <p>
     * The templated target type for the EventBridge <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html"> <code>PutEvents</code>
     * </a> API operation.
     * </p>
     * 
     * @param eventBridgeParameters
     *        The templated target type for the EventBridge <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html">
     *        <code>PutEvents</code> </a> API operation.
     */

    public void setEventBridgeParameters(EventBridgeParameters eventBridgeParameters) {
        this.eventBridgeParameters = eventBridgeParameters;
    }

    /**
     * <p>
     * The templated target type for the EventBridge <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html"> <code>PutEvents</code>
     * </a> API operation.
     * </p>
     * 
     * @return The templated target type for the EventBridge <a
     *         href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html">
     *         <code>PutEvents</code> </a> API operation.
     */

    public EventBridgeParameters getEventBridgeParameters() {
        return this.eventBridgeParameters;
    }

    /**
     * <p>
     * The templated target type for the EventBridge <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html"> <code>PutEvents</code>
     * </a> API operation.
     * </p>
     * 
     * @param eventBridgeParameters
     *        The templated target type for the EventBridge <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html">
     *        <code>PutEvents</code> </a> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withEventBridgeParameters(EventBridgeParameters eventBridgeParameters) {
        setEventBridgeParameters(eventBridgeParameters);
        return this;
    }

    /**
     * <p>
     * The text, or well-formed JSON, passed to the target. If you are configuring a templated Lambda, AWS Step
     * Functions, or Amazon EventBridge target, the input must be a well-formed JSON. For all other target types, a JSON
     * is not required. If you do not specify anything for this field, EventBridge Scheduler delivers a default
     * notification to the target.
     * </p>
     * 
     * @param input
     *        The text, or well-formed JSON, passed to the target. If you are configuring a templated Lambda, AWS Step
     *        Functions, or Amazon EventBridge target, the input must be a well-formed JSON. For all other target types,
     *        a JSON is not required. If you do not specify anything for this field, EventBridge Scheduler delivers a
     *        default notification to the target.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The text, or well-formed JSON, passed to the target. If you are configuring a templated Lambda, AWS Step
     * Functions, or Amazon EventBridge target, the input must be a well-formed JSON. For all other target types, a JSON
     * is not required. If you do not specify anything for this field, EventBridge Scheduler delivers a default
     * notification to the target.
     * </p>
     * 
     * @return The text, or well-formed JSON, passed to the target. If you are configuring a templated Lambda, AWS Step
     *         Functions, or Amazon EventBridge target, the input must be a well-formed JSON. For all other target
     *         types, a JSON is not required. If you do not specify anything for this field, EventBridge Scheduler
     *         delivers a default notification to the target.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The text, or well-formed JSON, passed to the target. If you are configuring a templated Lambda, AWS Step
     * Functions, or Amazon EventBridge target, the input must be a well-formed JSON. For all other target types, a JSON
     * is not required. If you do not specify anything for this field, EventBridge Scheduler delivers a default
     * notification to the target.
     * </p>
     * 
     * @param input
     *        The text, or well-formed JSON, passed to the target. If you are configuring a templated Lambda, AWS Step
     *        Functions, or Amazon EventBridge target, the input must be a well-formed JSON. For all other target types,
     *        a JSON is not required. If you do not specify anything for this field, EventBridge Scheduler delivers a
     *        default notification to the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The templated target type for the Amazon Kinesis <a href="kinesis/latest/APIReference/API_PutRecord.html">
     * <code>PutRecord</code> </a> API operation.
     * </p>
     * 
     * @param kinesisParameters
     *        The templated target type for the Amazon Kinesis <a href="kinesis/latest/APIReference/API_PutRecord.html">
     *        <code>PutRecord</code> </a> API operation.
     */

    public void setKinesisParameters(KinesisParameters kinesisParameters) {
        this.kinesisParameters = kinesisParameters;
    }

    /**
     * <p>
     * The templated target type for the Amazon Kinesis <a href="kinesis/latest/APIReference/API_PutRecord.html">
     * <code>PutRecord</code> </a> API operation.
     * </p>
     * 
     * @return The templated target type for the Amazon Kinesis <a
     *         href="kinesis/latest/APIReference/API_PutRecord.html"> <code>PutRecord</code> </a> API operation.
     */

    public KinesisParameters getKinesisParameters() {
        return this.kinesisParameters;
    }

    /**
     * <p>
     * The templated target type for the Amazon Kinesis <a href="kinesis/latest/APIReference/API_PutRecord.html">
     * <code>PutRecord</code> </a> API operation.
     * </p>
     * 
     * @param kinesisParameters
     *        The templated target type for the Amazon Kinesis <a href="kinesis/latest/APIReference/API_PutRecord.html">
     *        <code>PutRecord</code> </a> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withKinesisParameters(KinesisParameters kinesisParameters) {
        setKinesisParameters(kinesisParameters);
        return this;
    }

    /**
     * <p>
     * A <code>RetryPolicy</code> object that includes information about the retry policy settings, including the
     * maximum age of an event, and the maximum number of times EventBridge Scheduler will try to deliver the event to a
     * target.
     * </p>
     * 
     * @param retryPolicy
     *        A <code>RetryPolicy</code> object that includes information about the retry policy settings, including the
     *        maximum age of an event, and the maximum number of times EventBridge Scheduler will try to deliver the
     *        event to a target.
     */

    public void setRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
    }

    /**
     * <p>
     * A <code>RetryPolicy</code> object that includes information about the retry policy settings, including the
     * maximum age of an event, and the maximum number of times EventBridge Scheduler will try to deliver the event to a
     * target.
     * </p>
     * 
     * @return A <code>RetryPolicy</code> object that includes information about the retry policy settings, including
     *         the maximum age of an event, and the maximum number of times EventBridge Scheduler will try to deliver
     *         the event to a target.
     */

    public RetryPolicy getRetryPolicy() {
        return this.retryPolicy;
    }

    /**
     * <p>
     * A <code>RetryPolicy</code> object that includes information about the retry policy settings, including the
     * maximum age of an event, and the maximum number of times EventBridge Scheduler will try to deliver the event to a
     * target.
     * </p>
     * 
     * @param retryPolicy
     *        A <code>RetryPolicy</code> object that includes information about the retry policy settings, including the
     *        maximum age of an event, and the maximum number of times EventBridge Scheduler will try to deliver the
     *        event to a target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withRetryPolicy(RetryPolicy retryPolicy) {
        setRetryPolicy(retryPolicy);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that EventBridge Scheduler will use for this target when the
     * schedule is invoked.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that EventBridge Scheduler will use for this target when
     *        the schedule is invoked.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that EventBridge Scheduler will use for this target when the
     * schedule is invoked.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that EventBridge Scheduler will use for this target when
     *         the schedule is invoked.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that EventBridge Scheduler will use for this target when the
     * schedule is invoked.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that EventBridge Scheduler will use for this target when
     *        the schedule is invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The templated target type for the Amazon SageMaker <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html">
     * <code>StartPipelineExecution</code> </a> API operation.
     * </p>
     * 
     * @param sageMakerPipelineParameters
     *        The templated target type for the Amazon SageMaker <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html">
     *        <code>StartPipelineExecution</code> </a> API operation.
     */

    public void setSageMakerPipelineParameters(SageMakerPipelineParameters sageMakerPipelineParameters) {
        this.sageMakerPipelineParameters = sageMakerPipelineParameters;
    }

    /**
     * <p>
     * The templated target type for the Amazon SageMaker <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html">
     * <code>StartPipelineExecution</code> </a> API operation.
     * </p>
     * 
     * @return The templated target type for the Amazon SageMaker <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html">
     *         <code>StartPipelineExecution</code> </a> API operation.
     */

    public SageMakerPipelineParameters getSageMakerPipelineParameters() {
        return this.sageMakerPipelineParameters;
    }

    /**
     * <p>
     * The templated target type for the Amazon SageMaker <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html">
     * <code>StartPipelineExecution</code> </a> API operation.
     * </p>
     * 
     * @param sageMakerPipelineParameters
     *        The templated target type for the Amazon SageMaker <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html">
     *        <code>StartPipelineExecution</code> </a> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withSageMakerPipelineParameters(SageMakerPipelineParameters sageMakerPipelineParameters) {
        setSageMakerPipelineParameters(sageMakerPipelineParameters);
        return this;
    }

    /**
     * <p>
     * The templated target type for the Amazon SQS <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html">
     * <code>SendMessage</code> </a> API operation. Contains the message group ID to use when the target is a FIFO
     * queue. If you specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication
     * enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html"
     * >Using the Amazon SQS message deduplication ID</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param sqsParameters
     *        The templated target type for the Amazon SQS <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html">
     *        <code>SendMessage</code> </a> API operation. Contains the message group ID to use when the target is a
     *        FIFO queue. If you specify an Amazon SQS FIFO queue as a target, the queue must have content-based
     *        deduplication enabled. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html"
     *        >Using the Amazon SQS message deduplication ID</a> in the <i>Amazon SQS Developer Guide</i>.
     */

    public void setSqsParameters(SqsParameters sqsParameters) {
        this.sqsParameters = sqsParameters;
    }

    /**
     * <p>
     * The templated target type for the Amazon SQS <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html">
     * <code>SendMessage</code> </a> API operation. Contains the message group ID to use when the target is a FIFO
     * queue. If you specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication
     * enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html"
     * >Using the Amazon SQS message deduplication ID</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @return The templated target type for the Amazon SQS <a
     *         href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html">
     *         <code>SendMessage</code> </a> API operation. Contains the message group ID to use when the target is a
     *         FIFO queue. If you specify an Amazon SQS FIFO queue as a target, the queue must have content-based
     *         deduplication enabled. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html"
     *         >Using the Amazon SQS message deduplication ID</a> in the <i>Amazon SQS Developer Guide</i>.
     */

    public SqsParameters getSqsParameters() {
        return this.sqsParameters;
    }

    /**
     * <p>
     * The templated target type for the Amazon SQS <a
     * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html">
     * <code>SendMessage</code> </a> API operation. Contains the message group ID to use when the target is a FIFO
     * queue. If you specify an Amazon SQS FIFO queue as a target, the queue must have content-based deduplication
     * enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html"
     * >Using the Amazon SQS message deduplication ID</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param sqsParameters
     *        The templated target type for the Amazon SQS <a
     *        href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html">
     *        <code>SendMessage</code> </a> API operation. Contains the message group ID to use when the target is a
     *        FIFO queue. If you specify an Amazon SQS FIFO queue as a target, the queue must have content-based
     *        deduplication enabled. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html"
     *        >Using the Amazon SQS message deduplication ID</a> in the <i>Amazon SQS Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withSqsParameters(SqsParameters sqsParameters) {
        setSqsParameters(sqsParameters);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDeadLetterConfig() != null)
            sb.append("DeadLetterConfig: ").append(getDeadLetterConfig()).append(",");
        if (getEcsParameters() != null)
            sb.append("EcsParameters: ").append(getEcsParameters()).append(",");
        if (getEventBridgeParameters() != null)
            sb.append("EventBridgeParameters: ").append(getEventBridgeParameters()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getKinesisParameters() != null)
            sb.append("KinesisParameters: ").append(getKinesisParameters()).append(",");
        if (getRetryPolicy() != null)
            sb.append("RetryPolicy: ").append(getRetryPolicy()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSageMakerPipelineParameters() != null)
            sb.append("SageMakerPipelineParameters: ").append(getSageMakerPipelineParameters()).append(",");
        if (getSqsParameters() != null)
            sb.append("SqsParameters: ").append(getSqsParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Target == false)
            return false;
        Target other = (Target) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDeadLetterConfig() == null ^ this.getDeadLetterConfig() == null)
            return false;
        if (other.getDeadLetterConfig() != null && other.getDeadLetterConfig().equals(this.getDeadLetterConfig()) == false)
            return false;
        if (other.getEcsParameters() == null ^ this.getEcsParameters() == null)
            return false;
        if (other.getEcsParameters() != null && other.getEcsParameters().equals(this.getEcsParameters()) == false)
            return false;
        if (other.getEventBridgeParameters() == null ^ this.getEventBridgeParameters() == null)
            return false;
        if (other.getEventBridgeParameters() != null && other.getEventBridgeParameters().equals(this.getEventBridgeParameters()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getKinesisParameters() == null ^ this.getKinesisParameters() == null)
            return false;
        if (other.getKinesisParameters() != null && other.getKinesisParameters().equals(this.getKinesisParameters()) == false)
            return false;
        if (other.getRetryPolicy() == null ^ this.getRetryPolicy() == null)
            return false;
        if (other.getRetryPolicy() != null && other.getRetryPolicy().equals(this.getRetryPolicy()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSageMakerPipelineParameters() == null ^ this.getSageMakerPipelineParameters() == null)
            return false;
        if (other.getSageMakerPipelineParameters() != null && other.getSageMakerPipelineParameters().equals(this.getSageMakerPipelineParameters()) == false)
            return false;
        if (other.getSqsParameters() == null ^ this.getSqsParameters() == null)
            return false;
        if (other.getSqsParameters() != null && other.getSqsParameters().equals(this.getSqsParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDeadLetterConfig() == null) ? 0 : getDeadLetterConfig().hashCode());
        hashCode = prime * hashCode + ((getEcsParameters() == null) ? 0 : getEcsParameters().hashCode());
        hashCode = prime * hashCode + ((getEventBridgeParameters() == null) ? 0 : getEventBridgeParameters().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getKinesisParameters() == null) ? 0 : getKinesisParameters().hashCode());
        hashCode = prime * hashCode + ((getRetryPolicy() == null) ? 0 : getRetryPolicy().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSageMakerPipelineParameters() == null) ? 0 : getSageMakerPipelineParameters().hashCode());
        hashCode = prime * hashCode + ((getSqsParameters() == null) ? 0 : getSqsParameters().hashCode());
        return hashCode;
    }

    @Override
    public Target clone() {
        try {
            return (Target) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.scheduler.model.transform.TargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
