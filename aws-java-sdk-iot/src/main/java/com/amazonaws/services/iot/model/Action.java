/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the actions associated with a rule.
 * </p>
 */
public class Action implements Serializable, Cloneable {

    /**
     * <p>
     * Write to a DynamoDB table.
     * </p>
     */
    private DynamoDBAction dynamoDB;
    /**
     * <p>
     * Invoke a Lambda function.
     * </p>
     */
    private LambdaAction lambda;
    /**
     * <p>
     * Publish to an SNS topic.
     * </p>
     */
    private SnsAction sns;
    /**
     * <p>
     * Publish to an SQS queue.
     * </p>
     */
    private SqsAction sqs;
    /**
     * <p>
     * Write data to a Kinesis stream.
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
     * Write to an S3 bucket.
     * </p>
     */
    private S3Action s3;

    private FirehoseAction firehose;

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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Action withDynamoDB(DynamoDBAction dynamoDB) {
        setDynamoDB(dynamoDB);
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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Action withLambda(LambdaAction lambda) {
        setLambda(lambda);
        return this;
    }

    /**
     * <p>
     * Publish to an SNS topic.
     * </p>
     * 
     * @param sns
     *        Publish to an SNS topic.
     */
    public void setSns(SnsAction sns) {
        this.sns = sns;
    }

    /**
     * <p>
     * Publish to an SNS topic.
     * </p>
     * 
     * @return Publish to an SNS topic.
     */
    public SnsAction getSns() {
        return this.sns;
    }

    /**
     * <p>
     * Publish to an SNS topic.
     * </p>
     * 
     * @param sns
     *        Publish to an SNS topic.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Action withSns(SnsAction sns) {
        setSns(sns);
        return this;
    }

    /**
     * <p>
     * Publish to an SQS queue.
     * </p>
     * 
     * @param sqs
     *        Publish to an SQS queue.
     */
    public void setSqs(SqsAction sqs) {
        this.sqs = sqs;
    }

    /**
     * <p>
     * Publish to an SQS queue.
     * </p>
     * 
     * @return Publish to an SQS queue.
     */
    public SqsAction getSqs() {
        return this.sqs;
    }

    /**
     * <p>
     * Publish to an SQS queue.
     * </p>
     * 
     * @param sqs
     *        Publish to an SQS queue.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Action withSqs(SqsAction sqs) {
        setSqs(sqs);
        return this;
    }

    /**
     * <p>
     * Write data to a Kinesis stream.
     * </p>
     * 
     * @param kinesis
     *        Write data to a Kinesis stream.
     */
    public void setKinesis(KinesisAction kinesis) {
        this.kinesis = kinesis;
    }

    /**
     * <p>
     * Write data to a Kinesis stream.
     * </p>
     * 
     * @return Write data to a Kinesis stream.
     */
    public KinesisAction getKinesis() {
        return this.kinesis;
    }

    /**
     * <p>
     * Write data to a Kinesis stream.
     * </p>
     * 
     * @param kinesis
     *        Write data to a Kinesis stream.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Action withRepublish(RepublishAction republish) {
        setRepublish(republish);
        return this;
    }

    /**
     * <p>
     * Write to an S3 bucket.
     * </p>
     * 
     * @param s3
     *        Write to an S3 bucket.
     */
    public void setS3(S3Action s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * Write to an S3 bucket.
     * </p>
     * 
     * @return Write to an S3 bucket.
     */
    public S3Action getS3() {
        return this.s3;
    }

    /**
     * <p>
     * Write to an S3 bucket.
     * </p>
     * 
     * @param s3
     *        Write to an S3 bucket.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Action withS3(S3Action s3) {
        setS3(s3);
        return this;
    }

    /**
     * @param firehose
     */
    public void setFirehose(FirehoseAction firehose) {
        this.firehose = firehose;
    }

    /**
     * @return
     */
    public FirehoseAction getFirehose() {
        return this.firehose;
    }

    /**
     * @param firehose
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Action withFirehose(FirehoseAction firehose) {
        setFirehose(firehose);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("DynamoDB: " + getDynamoDB() + ",");
        if (getLambda() != null)
            sb.append("Lambda: " + getLambda() + ",");
        if (getSns() != null)
            sb.append("Sns: " + getSns() + ",");
        if (getSqs() != null)
            sb.append("Sqs: " + getSqs() + ",");
        if (getKinesis() != null)
            sb.append("Kinesis: " + getKinesis() + ",");
        if (getRepublish() != null)
            sb.append("Republish: " + getRepublish() + ",");
        if (getS3() != null)
            sb.append("S3: " + getS3() + ",");
        if (getFirehose() != null)
            sb.append("Firehose: " + getFirehose());
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
        if (other.getDynamoDB() != null
                && other.getDynamoDB().equals(this.getDynamoDB()) == false)
            return false;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null
                && other.getLambda().equals(this.getLambda()) == false)
            return false;
        if (other.getSns() == null ^ this.getSns() == null)
            return false;
        if (other.getSns() != null
                && other.getSns().equals(this.getSns()) == false)
            return false;
        if (other.getSqs() == null ^ this.getSqs() == null)
            return false;
        if (other.getSqs() != null
                && other.getSqs().equals(this.getSqs()) == false)
            return false;
        if (other.getKinesis() == null ^ this.getKinesis() == null)
            return false;
        if (other.getKinesis() != null
                && other.getKinesis().equals(this.getKinesis()) == false)
            return false;
        if (other.getRepublish() == null ^ this.getRepublish() == null)
            return false;
        if (other.getRepublish() != null
                && other.getRepublish().equals(this.getRepublish()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null
                && other.getS3().equals(this.getS3()) == false)
            return false;
        if (other.getFirehose() == null ^ this.getFirehose() == null)
            return false;
        if (other.getFirehose() != null
                && other.getFirehose().equals(this.getFirehose()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDynamoDB() == null) ? 0 : getDynamoDB().hashCode());
        hashCode = prime * hashCode
                + ((getLambda() == null) ? 0 : getLambda().hashCode());
        hashCode = prime * hashCode
                + ((getSns() == null) ? 0 : getSns().hashCode());
        hashCode = prime * hashCode
                + ((getSqs() == null) ? 0 : getSqs().hashCode());
        hashCode = prime * hashCode
                + ((getKinesis() == null) ? 0 : getKinesis().hashCode());
        hashCode = prime * hashCode
                + ((getRepublish() == null) ? 0 : getRepublish().hashCode());
        hashCode = prime * hashCode
                + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode
                + ((getFirehose() == null) ? 0 : getFirehose().hashCode());
        return hashCode;
    }

    @Override
    public Action clone() {
        try {
            return (Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}