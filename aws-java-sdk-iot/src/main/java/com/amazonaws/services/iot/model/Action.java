/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the actions associated with a rule.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Write to a DynamoDB table.
     * </p>
     */
    private DynamoDBAction dynamoDB;
    /**
     * <p>
     * Write to a DynamoDB table. This is a new version of the DynamoDB action. It allows you to write each attribute in
     * an MQTT message payload into a separate DynamoDB column.
     * </p>
     */
    private DynamoDBv2Action dynamoDBv2;
    /**
     * <p>
     * Invoke a Lambda function.
     * </p>
     */
    private LambdaAction lambda;
    /**
     * <p>
     * Publish to an Amazon SNS topic.
     * </p>
     */
    private SnsAction sns;
    /**
     * <p>
     * Publish to an Amazon SQS queue.
     * </p>
     */
    private SqsAction sqs;
    /**
     * <p>
     * Write data to an Amazon Kinesis stream.
     * </p>
     */
    private KinesisAction kinesis;
    /**
     * <p>
     * Publish to another MQTT topic.
     * </p>
     */
    private RepublishAction republish;
    /**
     * <p>
     * Write to an Amazon S3 bucket.
     * </p>
     */
    private S3Action s3;
    /**
     * <p>
     * Write to an Amazon Kinesis Firehose stream.
     * </p>
     */
    private FirehoseAction firehose;
    /**
     * <p>
     * Capture a CloudWatch metric.
     * </p>
     */
    private CloudwatchMetricAction cloudwatchMetric;
    /**
     * <p>
     * Change the state of a CloudWatch alarm.
     * </p>
     */
    private CloudwatchAlarmAction cloudwatchAlarm;
    /**
     * <p>
     * Write data to an Amazon Elasticsearch Service domain.
     * </p>
     */
    private ElasticsearchAction elasticsearch;
    /**
     * <p>
     * Send a message to a Salesforce IoT Cloud Input Stream.
     * </p>
     */
    private SalesforceAction salesforce;
    /**
     * <p>
     * Sends message data to an AWS IoT Analytics channel.
     * </p>
     */
    private IotAnalyticsAction iotAnalytics;
    /**
     * <p>
     * Sends an input to an AWS IoT Events detector.
     * </p>
     */
    private IotEventsAction iotEvents;
    /**
     * <p>
     * Starts execution of a Step Functions state machine.
     * </p>
     */
    private StepFunctionsAction stepFunctions;

    /**
     * <p>
     * Write to a DynamoDB table.
     * </p>
     * 
     * @param dynamoDB
     *        Write to a DynamoDB table.
     */

    public void setDynamoDB(DynamoDBAction dynamoDB) {
        this.dynamoDB = dynamoDB;
    }

    /**
     * <p>
     * Write to a DynamoDB table.
     * </p>
     * 
     * @return Write to a DynamoDB table.
     */

    public DynamoDBAction getDynamoDB() {
        return this.dynamoDB;
    }

    /**
     * <p>
     * Write to a DynamoDB table.
     * </p>
     * 
     * @param dynamoDB
     *        Write to a DynamoDB table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withDynamoDB(DynamoDBAction dynamoDB) {
        setDynamoDB(dynamoDB);
        return this;
    }

    /**
     * <p>
     * Write to a DynamoDB table. This is a new version of the DynamoDB action. It allows you to write each attribute in
     * an MQTT message payload into a separate DynamoDB column.
     * </p>
     * 
     * @param dynamoDBv2
     *        Write to a DynamoDB table. This is a new version of the DynamoDB action. It allows you to write each
     *        attribute in an MQTT message payload into a separate DynamoDB column.
     */

    public void setDynamoDBv2(DynamoDBv2Action dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
    }

    /**
     * <p>
     * Write to a DynamoDB table. This is a new version of the DynamoDB action. It allows you to write each attribute in
     * an MQTT message payload into a separate DynamoDB column.
     * </p>
     * 
     * @return Write to a DynamoDB table. This is a new version of the DynamoDB action. It allows you to write each
     *         attribute in an MQTT message payload into a separate DynamoDB column.
     */

    public DynamoDBv2Action getDynamoDBv2() {
        return this.dynamoDBv2;
    }

    /**
     * <p>
     * Write to a DynamoDB table. This is a new version of the DynamoDB action. It allows you to write each attribute in
     * an MQTT message payload into a separate DynamoDB column.
     * </p>
     * 
     * @param dynamoDBv2
     *        Write to a DynamoDB table. This is a new version of the DynamoDB action. It allows you to write each
     *        attribute in an MQTT message payload into a separate DynamoDB column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withDynamoDBv2(DynamoDBv2Action dynamoDBv2) {
        setDynamoDBv2(dynamoDBv2);
        return this;
    }

    /**
     * <p>
     * Invoke a Lambda function.
     * </p>
     * 
     * @param lambda
     *        Invoke a Lambda function.
     */

    public void setLambda(LambdaAction lambda) {
        this.lambda = lambda;
    }

    /**
     * <p>
     * Invoke a Lambda function.
     * </p>
     * 
     * @return Invoke a Lambda function.
     */

    public LambdaAction getLambda() {
        return this.lambda;
    }

    /**
     * <p>
     * Invoke a Lambda function.
     * </p>
     * 
     * @param lambda
     *        Invoke a Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withLambda(LambdaAction lambda) {
        setLambda(lambda);
        return this;
    }

    /**
     * <p>
     * Publish to an Amazon SNS topic.
     * </p>
     * 
     * @param sns
     *        Publish to an Amazon SNS topic.
     */

    public void setSns(SnsAction sns) {
        this.sns = sns;
    }

    /**
     * <p>
     * Publish to an Amazon SNS topic.
     * </p>
     * 
     * @return Publish to an Amazon SNS topic.
     */

    public SnsAction getSns() {
        return this.sns;
    }

    /**
     * <p>
     * Publish to an Amazon SNS topic.
     * </p>
     * 
     * @param sns
     *        Publish to an Amazon SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withSns(SnsAction sns) {
        setSns(sns);
        return this;
    }

    /**
     * <p>
     * Publish to an Amazon SQS queue.
     * </p>
     * 
     * @param sqs
     *        Publish to an Amazon SQS queue.
     */

    public void setSqs(SqsAction sqs) {
        this.sqs = sqs;
    }

    /**
     * <p>
     * Publish to an Amazon SQS queue.
     * </p>
     * 
     * @return Publish to an Amazon SQS queue.
     */

    public SqsAction getSqs() {
        return this.sqs;
    }

    /**
     * <p>
     * Publish to an Amazon SQS queue.
     * </p>
     * 
     * @param sqs
     *        Publish to an Amazon SQS queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withSqs(SqsAction sqs) {
        setSqs(sqs);
        return this;
    }

    /**
     * <p>
     * Write data to an Amazon Kinesis stream.
     * </p>
     * 
     * @param kinesis
     *        Write data to an Amazon Kinesis stream.
     */

    public void setKinesis(KinesisAction kinesis) {
        this.kinesis = kinesis;
    }

    /**
     * <p>
     * Write data to an Amazon Kinesis stream.
     * </p>
     * 
     * @return Write data to an Amazon Kinesis stream.
     */

    public KinesisAction getKinesis() {
        return this.kinesis;
    }

    /**
     * <p>
     * Write data to an Amazon Kinesis stream.
     * </p>
     * 
     * @param kinesis
     *        Write data to an Amazon Kinesis stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withKinesis(KinesisAction kinesis) {
        setKinesis(kinesis);
        return this;
    }

    /**
     * <p>
     * Publish to another MQTT topic.
     * </p>
     * 
     * @param republish
     *        Publish to another MQTT topic.
     */

    public void setRepublish(RepublishAction republish) {
        this.republish = republish;
    }

    /**
     * <p>
     * Publish to another MQTT topic.
     * </p>
     * 
     * @return Publish to another MQTT topic.
     */

    public RepublishAction getRepublish() {
        return this.republish;
    }

    /**
     * <p>
     * Publish to another MQTT topic.
     * </p>
     * 
     * @param republish
     *        Publish to another MQTT topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withRepublish(RepublishAction republish) {
        setRepublish(republish);
        return this;
    }

    /**
     * <p>
     * Write to an Amazon S3 bucket.
     * </p>
     * 
     * @param s3
     *        Write to an Amazon S3 bucket.
     */

    public void setS3(S3Action s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * Write to an Amazon S3 bucket.
     * </p>
     * 
     * @return Write to an Amazon S3 bucket.
     */

    public S3Action getS3() {
        return this.s3;
    }

    /**
     * <p>
     * Write to an Amazon S3 bucket.
     * </p>
     * 
     * @param s3
     *        Write to an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withS3(S3Action s3) {
        setS3(s3);
        return this;
    }

    /**
     * <p>
     * Write to an Amazon Kinesis Firehose stream.
     * </p>
     * 
     * @param firehose
     *        Write to an Amazon Kinesis Firehose stream.
     */

    public void setFirehose(FirehoseAction firehose) {
        this.firehose = firehose;
    }

    /**
     * <p>
     * Write to an Amazon Kinesis Firehose stream.
     * </p>
     * 
     * @return Write to an Amazon Kinesis Firehose stream.
     */

    public FirehoseAction getFirehose() {
        return this.firehose;
    }

    /**
     * <p>
     * Write to an Amazon Kinesis Firehose stream.
     * </p>
     * 
     * @param firehose
     *        Write to an Amazon Kinesis Firehose stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withFirehose(FirehoseAction firehose) {
        setFirehose(firehose);
        return this;
    }

    /**
     * <p>
     * Capture a CloudWatch metric.
     * </p>
     * 
     * @param cloudwatchMetric
     *        Capture a CloudWatch metric.
     */

    public void setCloudwatchMetric(CloudwatchMetricAction cloudwatchMetric) {
        this.cloudwatchMetric = cloudwatchMetric;
    }

    /**
     * <p>
     * Capture a CloudWatch metric.
     * </p>
     * 
     * @return Capture a CloudWatch metric.
     */

    public CloudwatchMetricAction getCloudwatchMetric() {
        return this.cloudwatchMetric;
    }

    /**
     * <p>
     * Capture a CloudWatch metric.
     * </p>
     * 
     * @param cloudwatchMetric
     *        Capture a CloudWatch metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withCloudwatchMetric(CloudwatchMetricAction cloudwatchMetric) {
        setCloudwatchMetric(cloudwatchMetric);
        return this;
    }

    /**
     * <p>
     * Change the state of a CloudWatch alarm.
     * </p>
     * 
     * @param cloudwatchAlarm
     *        Change the state of a CloudWatch alarm.
     */

    public void setCloudwatchAlarm(CloudwatchAlarmAction cloudwatchAlarm) {
        this.cloudwatchAlarm = cloudwatchAlarm;
    }

    /**
     * <p>
     * Change the state of a CloudWatch alarm.
     * </p>
     * 
     * @return Change the state of a CloudWatch alarm.
     */

    public CloudwatchAlarmAction getCloudwatchAlarm() {
        return this.cloudwatchAlarm;
    }

    /**
     * <p>
     * Change the state of a CloudWatch alarm.
     * </p>
     * 
     * @param cloudwatchAlarm
     *        Change the state of a CloudWatch alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withCloudwatchAlarm(CloudwatchAlarmAction cloudwatchAlarm) {
        setCloudwatchAlarm(cloudwatchAlarm);
        return this;
    }

    /**
     * <p>
     * Write data to an Amazon Elasticsearch Service domain.
     * </p>
     * 
     * @param elasticsearch
     *        Write data to an Amazon Elasticsearch Service domain.
     */

    public void setElasticsearch(ElasticsearchAction elasticsearch) {
        this.elasticsearch = elasticsearch;
    }

    /**
     * <p>
     * Write data to an Amazon Elasticsearch Service domain.
     * </p>
     * 
     * @return Write data to an Amazon Elasticsearch Service domain.
     */

    public ElasticsearchAction getElasticsearch() {
        return this.elasticsearch;
    }

    /**
     * <p>
     * Write data to an Amazon Elasticsearch Service domain.
     * </p>
     * 
     * @param elasticsearch
     *        Write data to an Amazon Elasticsearch Service domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withElasticsearch(ElasticsearchAction elasticsearch) {
        setElasticsearch(elasticsearch);
        return this;
    }

    /**
     * <p>
     * Send a message to a Salesforce IoT Cloud Input Stream.
     * </p>
     * 
     * @param salesforce
     *        Send a message to a Salesforce IoT Cloud Input Stream.
     */

    public void setSalesforce(SalesforceAction salesforce) {
        this.salesforce = salesforce;
    }

    /**
     * <p>
     * Send a message to a Salesforce IoT Cloud Input Stream.
     * </p>
     * 
     * @return Send a message to a Salesforce IoT Cloud Input Stream.
     */

    public SalesforceAction getSalesforce() {
        return this.salesforce;
    }

    /**
     * <p>
     * Send a message to a Salesforce IoT Cloud Input Stream.
     * </p>
     * 
     * @param salesforce
     *        Send a message to a Salesforce IoT Cloud Input Stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withSalesforce(SalesforceAction salesforce) {
        setSalesforce(salesforce);
        return this;
    }

    /**
     * <p>
     * Sends message data to an AWS IoT Analytics channel.
     * </p>
     * 
     * @param iotAnalytics
     *        Sends message data to an AWS IoT Analytics channel.
     */

    public void setIotAnalytics(IotAnalyticsAction iotAnalytics) {
        this.iotAnalytics = iotAnalytics;
    }

    /**
     * <p>
     * Sends message data to an AWS IoT Analytics channel.
     * </p>
     * 
     * @return Sends message data to an AWS IoT Analytics channel.
     */

    public IotAnalyticsAction getIotAnalytics() {
        return this.iotAnalytics;
    }

    /**
     * <p>
     * Sends message data to an AWS IoT Analytics channel.
     * </p>
     * 
     * @param iotAnalytics
     *        Sends message data to an AWS IoT Analytics channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withIotAnalytics(IotAnalyticsAction iotAnalytics) {
        setIotAnalytics(iotAnalytics);
        return this;
    }

    /**
     * <p>
     * Sends an input to an AWS IoT Events detector.
     * </p>
     * 
     * @param iotEvents
     *        Sends an input to an AWS IoT Events detector.
     */

    public void setIotEvents(IotEventsAction iotEvents) {
        this.iotEvents = iotEvents;
    }

    /**
     * <p>
     * Sends an input to an AWS IoT Events detector.
     * </p>
     * 
     * @return Sends an input to an AWS IoT Events detector.
     */

    public IotEventsAction getIotEvents() {
        return this.iotEvents;
    }

    /**
     * <p>
     * Sends an input to an AWS IoT Events detector.
     * </p>
     * 
     * @param iotEvents
     *        Sends an input to an AWS IoT Events detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withIotEvents(IotEventsAction iotEvents) {
        setIotEvents(iotEvents);
        return this;
    }

    /**
     * <p>
     * Starts execution of a Step Functions state machine.
     * </p>
     * 
     * @param stepFunctions
     *        Starts execution of a Step Functions state machine.
     */

    public void setStepFunctions(StepFunctionsAction stepFunctions) {
        this.stepFunctions = stepFunctions;
    }

    /**
     * <p>
     * Starts execution of a Step Functions state machine.
     * </p>
     * 
     * @return Starts execution of a Step Functions state machine.
     */

    public StepFunctionsAction getStepFunctions() {
        return this.stepFunctions;
    }

    /**
     * <p>
     * Starts execution of a Step Functions state machine.
     * </p>
     * 
     * @param stepFunctions
     *        Starts execution of a Step Functions state machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withStepFunctions(StepFunctionsAction stepFunctions) {
        setStepFunctions(stepFunctions);
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
        if (getDynamoDB() != null)
            sb.append("DynamoDB: ").append(getDynamoDB()).append(",");
        if (getDynamoDBv2() != null)
            sb.append("DynamoDBv2: ").append(getDynamoDBv2()).append(",");
        if (getLambda() != null)
            sb.append("Lambda: ").append(getLambda()).append(",");
        if (getSns() != null)
            sb.append("Sns: ").append(getSns()).append(",");
        if (getSqs() != null)
            sb.append("Sqs: ").append(getSqs()).append(",");
        if (getKinesis() != null)
            sb.append("Kinesis: ").append(getKinesis()).append(",");
        if (getRepublish() != null)
            sb.append("Republish: ").append(getRepublish()).append(",");
        if (getS3() != null)
            sb.append("S3: ").append(getS3()).append(",");
        if (getFirehose() != null)
            sb.append("Firehose: ").append(getFirehose()).append(",");
        if (getCloudwatchMetric() != null)
            sb.append("CloudwatchMetric: ").append(getCloudwatchMetric()).append(",");
        if (getCloudwatchAlarm() != null)
            sb.append("CloudwatchAlarm: ").append(getCloudwatchAlarm()).append(",");
        if (getElasticsearch() != null)
            sb.append("Elasticsearch: ").append(getElasticsearch()).append(",");
        if (getSalesforce() != null)
            sb.append("Salesforce: ").append(getSalesforce()).append(",");
        if (getIotAnalytics() != null)
            sb.append("IotAnalytics: ").append(getIotAnalytics()).append(",");
        if (getIotEvents() != null)
            sb.append("IotEvents: ").append(getIotEvents()).append(",");
        if (getStepFunctions() != null)
            sb.append("StepFunctions: ").append(getStepFunctions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;
        if (other.getDynamoDB() == null ^ this.getDynamoDB() == null)
            return false;
        if (other.getDynamoDB() != null && other.getDynamoDB().equals(this.getDynamoDB()) == false)
            return false;
        if (other.getDynamoDBv2() == null ^ this.getDynamoDBv2() == null)
            return false;
        if (other.getDynamoDBv2() != null && other.getDynamoDBv2().equals(this.getDynamoDBv2()) == false)
            return false;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        if (other.getSns() == null ^ this.getSns() == null)
            return false;
        if (other.getSns() != null && other.getSns().equals(this.getSns()) == false)
            return false;
        if (other.getSqs() == null ^ this.getSqs() == null)
            return false;
        if (other.getSqs() != null && other.getSqs().equals(this.getSqs()) == false)
            return false;
        if (other.getKinesis() == null ^ this.getKinesis() == null)
            return false;
        if (other.getKinesis() != null && other.getKinesis().equals(this.getKinesis()) == false)
            return false;
        if (other.getRepublish() == null ^ this.getRepublish() == null)
            return false;
        if (other.getRepublish() != null && other.getRepublish().equals(this.getRepublish()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        if (other.getFirehose() == null ^ this.getFirehose() == null)
            return false;
        if (other.getFirehose() != null && other.getFirehose().equals(this.getFirehose()) == false)
            return false;
        if (other.getCloudwatchMetric() == null ^ this.getCloudwatchMetric() == null)
            return false;
        if (other.getCloudwatchMetric() != null && other.getCloudwatchMetric().equals(this.getCloudwatchMetric()) == false)
            return false;
        if (other.getCloudwatchAlarm() == null ^ this.getCloudwatchAlarm() == null)
            return false;
        if (other.getCloudwatchAlarm() != null && other.getCloudwatchAlarm().equals(this.getCloudwatchAlarm()) == false)
            return false;
        if (other.getElasticsearch() == null ^ this.getElasticsearch() == null)
            return false;
        if (other.getElasticsearch() != null && other.getElasticsearch().equals(this.getElasticsearch()) == false)
            return false;
        if (other.getSalesforce() == null ^ this.getSalesforce() == null)
            return false;
        if (other.getSalesforce() != null && other.getSalesforce().equals(this.getSalesforce()) == false)
            return false;
        if (other.getIotAnalytics() == null ^ this.getIotAnalytics() == null)
            return false;
        if (other.getIotAnalytics() != null && other.getIotAnalytics().equals(this.getIotAnalytics()) == false)
            return false;
        if (other.getIotEvents() == null ^ this.getIotEvents() == null)
            return false;
        if (other.getIotEvents() != null && other.getIotEvents().equals(this.getIotEvents()) == false)
            return false;
        if (other.getStepFunctions() == null ^ this.getStepFunctions() == null)
            return false;
        if (other.getStepFunctions() != null && other.getStepFunctions().equals(this.getStepFunctions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDynamoDB() == null) ? 0 : getDynamoDB().hashCode());
        hashCode = prime * hashCode + ((getDynamoDBv2() == null) ? 0 : getDynamoDBv2().hashCode());
        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        hashCode = prime * hashCode + ((getSns() == null) ? 0 : getSns().hashCode());
        hashCode = prime * hashCode + ((getSqs() == null) ? 0 : getSqs().hashCode());
        hashCode = prime * hashCode + ((getKinesis() == null) ? 0 : getKinesis().hashCode());
        hashCode = prime * hashCode + ((getRepublish() == null) ? 0 : getRepublish().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getFirehose() == null) ? 0 : getFirehose().hashCode());
        hashCode = prime * hashCode + ((getCloudwatchMetric() == null) ? 0 : getCloudwatchMetric().hashCode());
        hashCode = prime * hashCode + ((getCloudwatchAlarm() == null) ? 0 : getCloudwatchAlarm().hashCode());
        hashCode = prime * hashCode + ((getElasticsearch() == null) ? 0 : getElasticsearch().hashCode());
        hashCode = prime * hashCode + ((getSalesforce() == null) ? 0 : getSalesforce().hashCode());
        hashCode = prime * hashCode + ((getIotAnalytics() == null) ? 0 : getIotAnalytics().hashCode());
        hashCode = prime * hashCode + ((getIotEvents() == null) ? 0 : getIotEvents().hashCode());
        hashCode = prime * hashCode + ((getStepFunctions() == null) ? 0 : getStepFunctions().hashCode());
        return hashCode;
    }

    @Override
    public Action clone() {
        try {
            return (Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
