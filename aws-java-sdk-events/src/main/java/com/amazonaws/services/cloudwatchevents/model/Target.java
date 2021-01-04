/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Targets are the resources to be invoked when a rule is triggered. For a complete list of services and resources that
 * can be set as a target, see <a>PutTargets</a>.
 * </p>
 * <p>
 * If you are setting the event bus of another account as the target, and that account granted permission to your
 * account through an organization instead of directly by the account ID, then you must specify a <code>RoleArn</code>
 * with proper permissions in the <code>Target</code> structure. For more information, see <a
 * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html">Sending
 * and Receiving Events Between AWS Accounts</a> in the <i>Amazon EventBridge User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/Target" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Target implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the target.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. If one rule
     * triggers multiple targets, you can use a different IAM role for each target.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target. For
     * more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object Notation (JSON)
     * Data Interchange Format</a>.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The value of the JSONPath that is used for extracting part of the matched event when passing it to the target.
     * You must use JSON dot notation, not bracket notation. For more information about JSON paths, see <a
     * href="http://goessner.net/articles/JsonPath/">JSONPath</a>.
     * </p>
     */
    private String inputPath;
    /**
     * <p>
     * Settings to enable you to provide custom input to a target based on certain event data. You can extract one or
     * more key-value pairs from the event and then use that data to send customized input to the target.
     * </p>
     */
    private InputTransformer inputTransformer;
    /**
     * <p>
     * The custom parameter you can use to control the shard assignment, when the target is a Kinesis data stream. If
     * you do not include this parameter, the default is to use the <code>eventId</code> as the partition key.
     * </p>
     */
    private KinesisParameters kinesisParameters;
    /**
     * <p>
     * Parameters used when you are using the rule to invoke Amazon EC2 Run Command.
     * </p>
     */
    private RunCommandParameters runCommandParameters;
    /**
     * <p>
     * Contains the Amazon ECS task definition and task count to be used, if the event target is an Amazon ECS task. For
     * more information about Amazon ECS tasks, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Task Definitions </a> in
     * the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     */
    private EcsParameters ecsParameters;
    /**
     * <p>
     * If the event target is an AWS Batch job, this contains the job definition, job name, and other parameters. For
     * more information, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/jobs.html">Jobs</a> in the
     * <i>AWS Batch User Guide</i>.
     * </p>
     */
    private BatchParameters batchParameters;
    /**
     * <p>
     * Contains the message group ID to use when the target is a FIFO queue.
     * </p>
     * <p>
     * If you specify an SQS FIFO queue as a target, the queue must have content-based deduplication enabled.
     * </p>
     */
    private SqsParameters sqsParameters;
    /**
     * <p>
     * Contains the HTTP parameters to use when the target is a API Gateway REST endpoint.
     * </p>
     * <p>
     * If you specify an API Gateway REST API as a target, you can use this parameter to specify headers, path
     * parameter, query string keys/values as part of your target invoking request.
     * </p>
     */
    private HttpParameters httpParameters;
    /**
     * <p>
     * Contains the Redshift Data API parameters to use when the target is a Redshift cluster.
     * </p>
     * <p>
     * If you specify a Redshift Cluster as a Target, you can use this to specify parameters to invoke the Redshift Data
     * API ExecuteStatement based on EventBridge events.
     * </p>
     */
    private RedshiftDataParameters redshiftDataParameters;
    /**
     * <p>
     * The <code>DeadLetterConfig</code> that defines the target queue to send dead-letter queue events to.
     * </p>
     */
    private DeadLetterConfig deadLetterConfig;
    /**
     * <p>
     * The <code>RetryPolicy</code> object that contains the retry policy configuration to use for the dead-letter
     * queue.
     * </p>
     */
    private RetryPolicy retryPolicy;

    /**
     * <p>
     * The ID of the target.
     * </p>
     * 
     * @param id
     *        The ID of the target.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the target.
     * </p>
     * 
     * @return The ID of the target.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the target.
     * </p>
     * 
     * @param id
     *        The ID of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withId(String id) {
        setId(id);
        return this;
    }

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
     * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. If one rule
     * triggers multiple targets, you can use a different IAM role for each target.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. If
     *        one rule triggers multiple targets, you can use a different IAM role for each target.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. If one rule
     * triggers multiple targets, you can use a different IAM role for each target.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. If
     *         one rule triggers multiple targets, you can use a different IAM role for each target.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. If one rule
     * triggers multiple targets, you can use a different IAM role for each target.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. If
     *        one rule triggers multiple targets, you can use a different IAM role for each target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target. For
     * more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object Notation (JSON)
     * Data Interchange Format</a>.
     * </p>
     * 
     * @param input
     *        Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target.
     *        For more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object
     *        Notation (JSON) Data Interchange Format</a>.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target. For
     * more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object Notation (JSON)
     * Data Interchange Format</a>.
     * </p>
     * 
     * @return Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the
     *         target. For more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript
     *         Object Notation (JSON) Data Interchange Format</a>.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target. For
     * more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object Notation (JSON)
     * Data Interchange Format</a>.
     * </p>
     * 
     * @param input
     *        Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target.
     *        For more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object
     *        Notation (JSON) Data Interchange Format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The value of the JSONPath that is used for extracting part of the matched event when passing it to the target.
     * You must use JSON dot notation, not bracket notation. For more information about JSON paths, see <a
     * href="http://goessner.net/articles/JsonPath/">JSONPath</a>.
     * </p>
     * 
     * @param inputPath
     *        The value of the JSONPath that is used for extracting part of the matched event when passing it to the
     *        target. You must use JSON dot notation, not bracket notation. For more information about JSON paths, see
     *        <a href="http://goessner.net/articles/JsonPath/">JSONPath</a>.
     */

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }

    /**
     * <p>
     * The value of the JSONPath that is used for extracting part of the matched event when passing it to the target.
     * You must use JSON dot notation, not bracket notation. For more information about JSON paths, see <a
     * href="http://goessner.net/articles/JsonPath/">JSONPath</a>.
     * </p>
     * 
     * @return The value of the JSONPath that is used for extracting part of the matched event when passing it to the
     *         target. You must use JSON dot notation, not bracket notation. For more information about JSON paths, see
     *         <a href="http://goessner.net/articles/JsonPath/">JSONPath</a>.
     */

    public String getInputPath() {
        return this.inputPath;
    }

    /**
     * <p>
     * The value of the JSONPath that is used for extracting part of the matched event when passing it to the target.
     * You must use JSON dot notation, not bracket notation. For more information about JSON paths, see <a
     * href="http://goessner.net/articles/JsonPath/">JSONPath</a>.
     * </p>
     * 
     * @param inputPath
     *        The value of the JSONPath that is used for extracting part of the matched event when passing it to the
     *        target. You must use JSON dot notation, not bracket notation. For more information about JSON paths, see
     *        <a href="http://goessner.net/articles/JsonPath/">JSONPath</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withInputPath(String inputPath) {
        setInputPath(inputPath);
        return this;
    }

    /**
     * <p>
     * Settings to enable you to provide custom input to a target based on certain event data. You can extract one or
     * more key-value pairs from the event and then use that data to send customized input to the target.
     * </p>
     * 
     * @param inputTransformer
     *        Settings to enable you to provide custom input to a target based on certain event data. You can extract
     *        one or more key-value pairs from the event and then use that data to send customized input to the target.
     */

    public void setInputTransformer(InputTransformer inputTransformer) {
        this.inputTransformer = inputTransformer;
    }

    /**
     * <p>
     * Settings to enable you to provide custom input to a target based on certain event data. You can extract one or
     * more key-value pairs from the event and then use that data to send customized input to the target.
     * </p>
     * 
     * @return Settings to enable you to provide custom input to a target based on certain event data. You can extract
     *         one or more key-value pairs from the event and then use that data to send customized input to the target.
     */

    public InputTransformer getInputTransformer() {
        return this.inputTransformer;
    }

    /**
     * <p>
     * Settings to enable you to provide custom input to a target based on certain event data. You can extract one or
     * more key-value pairs from the event and then use that data to send customized input to the target.
     * </p>
     * 
     * @param inputTransformer
     *        Settings to enable you to provide custom input to a target based on certain event data. You can extract
     *        one or more key-value pairs from the event and then use that data to send customized input to the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withInputTransformer(InputTransformer inputTransformer) {
        setInputTransformer(inputTransformer);
        return this;
    }

    /**
     * <p>
     * The custom parameter you can use to control the shard assignment, when the target is a Kinesis data stream. If
     * you do not include this parameter, the default is to use the <code>eventId</code> as the partition key.
     * </p>
     * 
     * @param kinesisParameters
     *        The custom parameter you can use to control the shard assignment, when the target is a Kinesis data
     *        stream. If you do not include this parameter, the default is to use the <code>eventId</code> as the
     *        partition key.
     */

    public void setKinesisParameters(KinesisParameters kinesisParameters) {
        this.kinesisParameters = kinesisParameters;
    }

    /**
     * <p>
     * The custom parameter you can use to control the shard assignment, when the target is a Kinesis data stream. If
     * you do not include this parameter, the default is to use the <code>eventId</code> as the partition key.
     * </p>
     * 
     * @return The custom parameter you can use to control the shard assignment, when the target is a Kinesis data
     *         stream. If you do not include this parameter, the default is to use the <code>eventId</code> as the
     *         partition key.
     */

    public KinesisParameters getKinesisParameters() {
        return this.kinesisParameters;
    }

    /**
     * <p>
     * The custom parameter you can use to control the shard assignment, when the target is a Kinesis data stream. If
     * you do not include this parameter, the default is to use the <code>eventId</code> as the partition key.
     * </p>
     * 
     * @param kinesisParameters
     *        The custom parameter you can use to control the shard assignment, when the target is a Kinesis data
     *        stream. If you do not include this parameter, the default is to use the <code>eventId</code> as the
     *        partition key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withKinesisParameters(KinesisParameters kinesisParameters) {
        setKinesisParameters(kinesisParameters);
        return this;
    }

    /**
     * <p>
     * Parameters used when you are using the rule to invoke Amazon EC2 Run Command.
     * </p>
     * 
     * @param runCommandParameters
     *        Parameters used when you are using the rule to invoke Amazon EC2 Run Command.
     */

    public void setRunCommandParameters(RunCommandParameters runCommandParameters) {
        this.runCommandParameters = runCommandParameters;
    }

    /**
     * <p>
     * Parameters used when you are using the rule to invoke Amazon EC2 Run Command.
     * </p>
     * 
     * @return Parameters used when you are using the rule to invoke Amazon EC2 Run Command.
     */

    public RunCommandParameters getRunCommandParameters() {
        return this.runCommandParameters;
    }

    /**
     * <p>
     * Parameters used when you are using the rule to invoke Amazon EC2 Run Command.
     * </p>
     * 
     * @param runCommandParameters
     *        Parameters used when you are using the rule to invoke Amazon EC2 Run Command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withRunCommandParameters(RunCommandParameters runCommandParameters) {
        setRunCommandParameters(runCommandParameters);
        return this;
    }

    /**
     * <p>
     * Contains the Amazon ECS task definition and task count to be used, if the event target is an Amazon ECS task. For
     * more information about Amazon ECS tasks, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Task Definitions </a> in
     * the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * 
     * @param ecsParameters
     *        Contains the Amazon ECS task definition and task count to be used, if the event target is an Amazon ECS
     *        task. For more information about Amazon ECS tasks, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Task Definitions
     *        </a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     */

    public void setEcsParameters(EcsParameters ecsParameters) {
        this.ecsParameters = ecsParameters;
    }

    /**
     * <p>
     * Contains the Amazon ECS task definition and task count to be used, if the event target is an Amazon ECS task. For
     * more information about Amazon ECS tasks, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Task Definitions </a> in
     * the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * 
     * @return Contains the Amazon ECS task definition and task count to be used, if the event target is an Amazon ECS
     *         task. For more information about Amazon ECS tasks, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Task Definitions
     *         </a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     */

    public EcsParameters getEcsParameters() {
        return this.ecsParameters;
    }

    /**
     * <p>
     * Contains the Amazon ECS task definition and task count to be used, if the event target is an Amazon ECS task. For
     * more information about Amazon ECS tasks, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Task Definitions </a> in
     * the <i>Amazon EC2 Container Service Developer Guide</i>.
     * </p>
     * 
     * @param ecsParameters
     *        Contains the Amazon ECS task definition and task count to be used, if the event target is an Amazon ECS
     *        task. For more information about Amazon ECS tasks, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html">Task Definitions
     *        </a> in the <i>Amazon EC2 Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withEcsParameters(EcsParameters ecsParameters) {
        setEcsParameters(ecsParameters);
        return this;
    }

    /**
     * <p>
     * If the event target is an AWS Batch job, this contains the job definition, job name, and other parameters. For
     * more information, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/jobs.html">Jobs</a> in the
     * <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param batchParameters
     *        If the event target is an AWS Batch job, this contains the job definition, job name, and other parameters.
     *        For more information, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/jobs.html">Jobs</a>
     *        in the <i>AWS Batch User Guide</i>.
     */

    public void setBatchParameters(BatchParameters batchParameters) {
        this.batchParameters = batchParameters;
    }

    /**
     * <p>
     * If the event target is an AWS Batch job, this contains the job definition, job name, and other parameters. For
     * more information, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/jobs.html">Jobs</a> in the
     * <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @return If the event target is an AWS Batch job, this contains the job definition, job name, and other
     *         parameters. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/jobs.html">Jobs</a> in the <i>AWS Batch User
     *         Guide</i>.
     */

    public BatchParameters getBatchParameters() {
        return this.batchParameters;
    }

    /**
     * <p>
     * If the event target is an AWS Batch job, this contains the job definition, job name, and other parameters. For
     * more information, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/jobs.html">Jobs</a> in the
     * <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param batchParameters
     *        If the event target is an AWS Batch job, this contains the job definition, job name, and other parameters.
     *        For more information, see <a href="https://docs.aws.amazon.com/batch/latest/userguide/jobs.html">Jobs</a>
     *        in the <i>AWS Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withBatchParameters(BatchParameters batchParameters) {
        setBatchParameters(batchParameters);
        return this;
    }

    /**
     * <p>
     * Contains the message group ID to use when the target is a FIFO queue.
     * </p>
     * <p>
     * If you specify an SQS FIFO queue as a target, the queue must have content-based deduplication enabled.
     * </p>
     * 
     * @param sqsParameters
     *        Contains the message group ID to use when the target is a FIFO queue.</p>
     *        <p>
     *        If you specify an SQS FIFO queue as a target, the queue must have content-based deduplication enabled.
     */

    public void setSqsParameters(SqsParameters sqsParameters) {
        this.sqsParameters = sqsParameters;
    }

    /**
     * <p>
     * Contains the message group ID to use when the target is a FIFO queue.
     * </p>
     * <p>
     * If you specify an SQS FIFO queue as a target, the queue must have content-based deduplication enabled.
     * </p>
     * 
     * @return Contains the message group ID to use when the target is a FIFO queue.</p>
     *         <p>
     *         If you specify an SQS FIFO queue as a target, the queue must have content-based deduplication enabled.
     */

    public SqsParameters getSqsParameters() {
        return this.sqsParameters;
    }

    /**
     * <p>
     * Contains the message group ID to use when the target is a FIFO queue.
     * </p>
     * <p>
     * If you specify an SQS FIFO queue as a target, the queue must have content-based deduplication enabled.
     * </p>
     * 
     * @param sqsParameters
     *        Contains the message group ID to use when the target is a FIFO queue.</p>
     *        <p>
     *        If you specify an SQS FIFO queue as a target, the queue must have content-based deduplication enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withSqsParameters(SqsParameters sqsParameters) {
        setSqsParameters(sqsParameters);
        return this;
    }

    /**
     * <p>
     * Contains the HTTP parameters to use when the target is a API Gateway REST endpoint.
     * </p>
     * <p>
     * If you specify an API Gateway REST API as a target, you can use this parameter to specify headers, path
     * parameter, query string keys/values as part of your target invoking request.
     * </p>
     * 
     * @param httpParameters
     *        Contains the HTTP parameters to use when the target is a API Gateway REST endpoint.</p>
     *        <p>
     *        If you specify an API Gateway REST API as a target, you can use this parameter to specify headers, path
     *        parameter, query string keys/values as part of your target invoking request.
     */

    public void setHttpParameters(HttpParameters httpParameters) {
        this.httpParameters = httpParameters;
    }

    /**
     * <p>
     * Contains the HTTP parameters to use when the target is a API Gateway REST endpoint.
     * </p>
     * <p>
     * If you specify an API Gateway REST API as a target, you can use this parameter to specify headers, path
     * parameter, query string keys/values as part of your target invoking request.
     * </p>
     * 
     * @return Contains the HTTP parameters to use when the target is a API Gateway REST endpoint.</p>
     *         <p>
     *         If you specify an API Gateway REST API as a target, you can use this parameter to specify headers, path
     *         parameter, query string keys/values as part of your target invoking request.
     */

    public HttpParameters getHttpParameters() {
        return this.httpParameters;
    }

    /**
     * <p>
     * Contains the HTTP parameters to use when the target is a API Gateway REST endpoint.
     * </p>
     * <p>
     * If you specify an API Gateway REST API as a target, you can use this parameter to specify headers, path
     * parameter, query string keys/values as part of your target invoking request.
     * </p>
     * 
     * @param httpParameters
     *        Contains the HTTP parameters to use when the target is a API Gateway REST endpoint.</p>
     *        <p>
     *        If you specify an API Gateway REST API as a target, you can use this parameter to specify headers, path
     *        parameter, query string keys/values as part of your target invoking request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withHttpParameters(HttpParameters httpParameters) {
        setHttpParameters(httpParameters);
        return this;
    }

    /**
     * <p>
     * Contains the Redshift Data API parameters to use when the target is a Redshift cluster.
     * </p>
     * <p>
     * If you specify a Redshift Cluster as a Target, you can use this to specify parameters to invoke the Redshift Data
     * API ExecuteStatement based on EventBridge events.
     * </p>
     * 
     * @param redshiftDataParameters
     *        Contains the Redshift Data API parameters to use when the target is a Redshift cluster.</p>
     *        <p>
     *        If you specify a Redshift Cluster as a Target, you can use this to specify parameters to invoke the
     *        Redshift Data API ExecuteStatement based on EventBridge events.
     */

    public void setRedshiftDataParameters(RedshiftDataParameters redshiftDataParameters) {
        this.redshiftDataParameters = redshiftDataParameters;
    }

    /**
     * <p>
     * Contains the Redshift Data API parameters to use when the target is a Redshift cluster.
     * </p>
     * <p>
     * If you specify a Redshift Cluster as a Target, you can use this to specify parameters to invoke the Redshift Data
     * API ExecuteStatement based on EventBridge events.
     * </p>
     * 
     * @return Contains the Redshift Data API parameters to use when the target is a Redshift cluster.</p>
     *         <p>
     *         If you specify a Redshift Cluster as a Target, you can use this to specify parameters to invoke the
     *         Redshift Data API ExecuteStatement based on EventBridge events.
     */

    public RedshiftDataParameters getRedshiftDataParameters() {
        return this.redshiftDataParameters;
    }

    /**
     * <p>
     * Contains the Redshift Data API parameters to use when the target is a Redshift cluster.
     * </p>
     * <p>
     * If you specify a Redshift Cluster as a Target, you can use this to specify parameters to invoke the Redshift Data
     * API ExecuteStatement based on EventBridge events.
     * </p>
     * 
     * @param redshiftDataParameters
     *        Contains the Redshift Data API parameters to use when the target is a Redshift cluster.</p>
     *        <p>
     *        If you specify a Redshift Cluster as a Target, you can use this to specify parameters to invoke the
     *        Redshift Data API ExecuteStatement based on EventBridge events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withRedshiftDataParameters(RedshiftDataParameters redshiftDataParameters) {
        setRedshiftDataParameters(redshiftDataParameters);
        return this;
    }

    /**
     * <p>
     * The <code>DeadLetterConfig</code> that defines the target queue to send dead-letter queue events to.
     * </p>
     * 
     * @param deadLetterConfig
     *        The <code>DeadLetterConfig</code> that defines the target queue to send dead-letter queue events to.
     */

    public void setDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        this.deadLetterConfig = deadLetterConfig;
    }

    /**
     * <p>
     * The <code>DeadLetterConfig</code> that defines the target queue to send dead-letter queue events to.
     * </p>
     * 
     * @return The <code>DeadLetterConfig</code> that defines the target queue to send dead-letter queue events to.
     */

    public DeadLetterConfig getDeadLetterConfig() {
        return this.deadLetterConfig;
    }

    /**
     * <p>
     * The <code>DeadLetterConfig</code> that defines the target queue to send dead-letter queue events to.
     * </p>
     * 
     * @param deadLetterConfig
     *        The <code>DeadLetterConfig</code> that defines the target queue to send dead-letter queue events to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        setDeadLetterConfig(deadLetterConfig);
        return this;
    }

    /**
     * <p>
     * The <code>RetryPolicy</code> object that contains the retry policy configuration to use for the dead-letter
     * queue.
     * </p>
     * 
     * @param retryPolicy
     *        The <code>RetryPolicy</code> object that contains the retry policy configuration to use for the
     *        dead-letter queue.
     */

    public void setRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
    }

    /**
     * <p>
     * The <code>RetryPolicy</code> object that contains the retry policy configuration to use for the dead-letter
     * queue.
     * </p>
     * 
     * @return The <code>RetryPolicy</code> object that contains the retry policy configuration to use for the
     *         dead-letter queue.
     */

    public RetryPolicy getRetryPolicy() {
        return this.retryPolicy;
    }

    /**
     * <p>
     * The <code>RetryPolicy</code> object that contains the retry policy configuration to use for the dead-letter
     * queue.
     * </p>
     * 
     * @param retryPolicy
     *        The <code>RetryPolicy</code> object that contains the retry policy configuration to use for the
     *        dead-letter queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withRetryPolicy(RetryPolicy retryPolicy) {
        setRetryPolicy(retryPolicy);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getInputPath() != null)
            sb.append("InputPath: ").append(getInputPath()).append(",");
        if (getInputTransformer() != null)
            sb.append("InputTransformer: ").append(getInputTransformer()).append(",");
        if (getKinesisParameters() != null)
            sb.append("KinesisParameters: ").append(getKinesisParameters()).append(",");
        if (getRunCommandParameters() != null)
            sb.append("RunCommandParameters: ").append(getRunCommandParameters()).append(",");
        if (getEcsParameters() != null)
            sb.append("EcsParameters: ").append(getEcsParameters()).append(",");
        if (getBatchParameters() != null)
            sb.append("BatchParameters: ").append(getBatchParameters()).append(",");
        if (getSqsParameters() != null)
            sb.append("SqsParameters: ").append(getSqsParameters()).append(",");
        if (getHttpParameters() != null)
            sb.append("HttpParameters: ").append(getHttpParameters()).append(",");
        if (getRedshiftDataParameters() != null)
            sb.append("RedshiftDataParameters: ").append(getRedshiftDataParameters()).append(",");
        if (getDeadLetterConfig() != null)
            sb.append("DeadLetterConfig: ").append(getDeadLetterConfig()).append(",");
        if (getRetryPolicy() != null)
            sb.append("RetryPolicy: ").append(getRetryPolicy());
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
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getInputPath() == null ^ this.getInputPath() == null)
            return false;
        if (other.getInputPath() != null && other.getInputPath().equals(this.getInputPath()) == false)
            return false;
        if (other.getInputTransformer() == null ^ this.getInputTransformer() == null)
            return false;
        if (other.getInputTransformer() != null && other.getInputTransformer().equals(this.getInputTransformer()) == false)
            return false;
        if (other.getKinesisParameters() == null ^ this.getKinesisParameters() == null)
            return false;
        if (other.getKinesisParameters() != null && other.getKinesisParameters().equals(this.getKinesisParameters()) == false)
            return false;
        if (other.getRunCommandParameters() == null ^ this.getRunCommandParameters() == null)
            return false;
        if (other.getRunCommandParameters() != null && other.getRunCommandParameters().equals(this.getRunCommandParameters()) == false)
            return false;
        if (other.getEcsParameters() == null ^ this.getEcsParameters() == null)
            return false;
        if (other.getEcsParameters() != null && other.getEcsParameters().equals(this.getEcsParameters()) == false)
            return false;
        if (other.getBatchParameters() == null ^ this.getBatchParameters() == null)
            return false;
        if (other.getBatchParameters() != null && other.getBatchParameters().equals(this.getBatchParameters()) == false)
            return false;
        if (other.getSqsParameters() == null ^ this.getSqsParameters() == null)
            return false;
        if (other.getSqsParameters() != null && other.getSqsParameters().equals(this.getSqsParameters()) == false)
            return false;
        if (other.getHttpParameters() == null ^ this.getHttpParameters() == null)
            return false;
        if (other.getHttpParameters() != null && other.getHttpParameters().equals(this.getHttpParameters()) == false)
            return false;
        if (other.getRedshiftDataParameters() == null ^ this.getRedshiftDataParameters() == null)
            return false;
        if (other.getRedshiftDataParameters() != null && other.getRedshiftDataParameters().equals(this.getRedshiftDataParameters()) == false)
            return false;
        if (other.getDeadLetterConfig() == null ^ this.getDeadLetterConfig() == null)
            return false;
        if (other.getDeadLetterConfig() != null && other.getDeadLetterConfig().equals(this.getDeadLetterConfig()) == false)
            return false;
        if (other.getRetryPolicy() == null ^ this.getRetryPolicy() == null)
            return false;
        if (other.getRetryPolicy() != null && other.getRetryPolicy().equals(this.getRetryPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getInputPath() == null) ? 0 : getInputPath().hashCode());
        hashCode = prime * hashCode + ((getInputTransformer() == null) ? 0 : getInputTransformer().hashCode());
        hashCode = prime * hashCode + ((getKinesisParameters() == null) ? 0 : getKinesisParameters().hashCode());
        hashCode = prime * hashCode + ((getRunCommandParameters() == null) ? 0 : getRunCommandParameters().hashCode());
        hashCode = prime * hashCode + ((getEcsParameters() == null) ? 0 : getEcsParameters().hashCode());
        hashCode = prime * hashCode + ((getBatchParameters() == null) ? 0 : getBatchParameters().hashCode());
        hashCode = prime * hashCode + ((getSqsParameters() == null) ? 0 : getSqsParameters().hashCode());
        hashCode = prime * hashCode + ((getHttpParameters() == null) ? 0 : getHttpParameters().hashCode());
        hashCode = prime * hashCode + ((getRedshiftDataParameters() == null) ? 0 : getRedshiftDataParameters().hashCode());
        hashCode = prime * hashCode + ((getDeadLetterConfig() == null) ? 0 : getDeadLetterConfig().hashCode());
        hashCode = prime * hashCode + ((getRetryPolicy() == null) ? 0 : getRetryPolicy().hashCode());
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
        com.amazonaws.services.cloudwatchevents.model.transform.TargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
