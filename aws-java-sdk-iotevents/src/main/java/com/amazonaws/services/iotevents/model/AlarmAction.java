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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies one of the following actions to receive notifications when the alarm state changes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/AlarmAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmAction implements Serializable, Cloneable, StructuredPojo {

    private SNSTopicPublishAction sns;

    private IotTopicPublishAction iotTopicPublish;

    private LambdaAction lambda;

    private IotEventsAction iotEvents;

    private SqsAction sqs;

    private FirehoseAction firehose;

    private DynamoDBAction dynamoDB;

    private DynamoDBv2Action dynamoDBv2;

    private IotSiteWiseAction iotSiteWise;

    /**
     * @param sns
     */

    public void setSns(SNSTopicPublishAction sns) {
        this.sns = sns;
    }

    /**
     * @return
     */

    public SNSTopicPublishAction getSns() {
        return this.sns;
    }

    /**
     * @param sns
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmAction withSns(SNSTopicPublishAction sns) {
        setSns(sns);
        return this;
    }

    /**
     * @param iotTopicPublish
     */

    public void setIotTopicPublish(IotTopicPublishAction iotTopicPublish) {
        this.iotTopicPublish = iotTopicPublish;
    }

    /**
     * @return
     */

    public IotTopicPublishAction getIotTopicPublish() {
        return this.iotTopicPublish;
    }

    /**
     * @param iotTopicPublish
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmAction withIotTopicPublish(IotTopicPublishAction iotTopicPublish) {
        setIotTopicPublish(iotTopicPublish);
        return this;
    }

    /**
     * @param lambda
     */

    public void setLambda(LambdaAction lambda) {
        this.lambda = lambda;
    }

    /**
     * @return
     */

    public LambdaAction getLambda() {
        return this.lambda;
    }

    /**
     * @param lambda
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmAction withLambda(LambdaAction lambda) {
        setLambda(lambda);
        return this;
    }

    /**
     * @param iotEvents
     */

    public void setIotEvents(IotEventsAction iotEvents) {
        this.iotEvents = iotEvents;
    }

    /**
     * @return
     */

    public IotEventsAction getIotEvents() {
        return this.iotEvents;
    }

    /**
     * @param iotEvents
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmAction withIotEvents(IotEventsAction iotEvents) {
        setIotEvents(iotEvents);
        return this;
    }

    /**
     * @param sqs
     */

    public void setSqs(SqsAction sqs) {
        this.sqs = sqs;
    }

    /**
     * @return
     */

    public SqsAction getSqs() {
        return this.sqs;
    }

    /**
     * @param sqs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmAction withSqs(SqsAction sqs) {
        setSqs(sqs);
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmAction withFirehose(FirehoseAction firehose) {
        setFirehose(firehose);
        return this;
    }

    /**
     * @param dynamoDB
     */

    public void setDynamoDB(DynamoDBAction dynamoDB) {
        this.dynamoDB = dynamoDB;
    }

    /**
     * @return
     */

    public DynamoDBAction getDynamoDB() {
        return this.dynamoDB;
    }

    /**
     * @param dynamoDB
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmAction withDynamoDB(DynamoDBAction dynamoDB) {
        setDynamoDB(dynamoDB);
        return this;
    }

    /**
     * @param dynamoDBv2
     */

    public void setDynamoDBv2(DynamoDBv2Action dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
    }

    /**
     * @return
     */

    public DynamoDBv2Action getDynamoDBv2() {
        return this.dynamoDBv2;
    }

    /**
     * @param dynamoDBv2
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmAction withDynamoDBv2(DynamoDBv2Action dynamoDBv2) {
        setDynamoDBv2(dynamoDBv2);
        return this;
    }

    /**
     * @param iotSiteWise
     */

    public void setIotSiteWise(IotSiteWiseAction iotSiteWise) {
        this.iotSiteWise = iotSiteWise;
    }

    /**
     * @return
     */

    public IotSiteWiseAction getIotSiteWise() {
        return this.iotSiteWise;
    }

    /**
     * @param iotSiteWise
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmAction withIotSiteWise(IotSiteWiseAction iotSiteWise) {
        setIotSiteWise(iotSiteWise);
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
        if (getSns() != null)
            sb.append("Sns: ").append(getSns()).append(",");
        if (getIotTopicPublish() != null)
            sb.append("IotTopicPublish: ").append(getIotTopicPublish()).append(",");
        if (getLambda() != null)
            sb.append("Lambda: ").append(getLambda()).append(",");
        if (getIotEvents() != null)
            sb.append("IotEvents: ").append(getIotEvents()).append(",");
        if (getSqs() != null)
            sb.append("Sqs: ").append(getSqs()).append(",");
        if (getFirehose() != null)
            sb.append("Firehose: ").append(getFirehose()).append(",");
        if (getDynamoDB() != null)
            sb.append("DynamoDB: ").append(getDynamoDB()).append(",");
        if (getDynamoDBv2() != null)
            sb.append("DynamoDBv2: ").append(getDynamoDBv2()).append(",");
        if (getIotSiteWise() != null)
            sb.append("IotSiteWise: ").append(getIotSiteWise());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmAction == false)
            return false;
        AlarmAction other = (AlarmAction) obj;
        if (other.getSns() == null ^ this.getSns() == null)
            return false;
        if (other.getSns() != null && other.getSns().equals(this.getSns()) == false)
            return false;
        if (other.getIotTopicPublish() == null ^ this.getIotTopicPublish() == null)
            return false;
        if (other.getIotTopicPublish() != null && other.getIotTopicPublish().equals(this.getIotTopicPublish()) == false)
            return false;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        if (other.getIotEvents() == null ^ this.getIotEvents() == null)
            return false;
        if (other.getIotEvents() != null && other.getIotEvents().equals(this.getIotEvents()) == false)
            return false;
        if (other.getSqs() == null ^ this.getSqs() == null)
            return false;
        if (other.getSqs() != null && other.getSqs().equals(this.getSqs()) == false)
            return false;
        if (other.getFirehose() == null ^ this.getFirehose() == null)
            return false;
        if (other.getFirehose() != null && other.getFirehose().equals(this.getFirehose()) == false)
            return false;
        if (other.getDynamoDB() == null ^ this.getDynamoDB() == null)
            return false;
        if (other.getDynamoDB() != null && other.getDynamoDB().equals(this.getDynamoDB()) == false)
            return false;
        if (other.getDynamoDBv2() == null ^ this.getDynamoDBv2() == null)
            return false;
        if (other.getDynamoDBv2() != null && other.getDynamoDBv2().equals(this.getDynamoDBv2()) == false)
            return false;
        if (other.getIotSiteWise() == null ^ this.getIotSiteWise() == null)
            return false;
        if (other.getIotSiteWise() != null && other.getIotSiteWise().equals(this.getIotSiteWise()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSns() == null) ? 0 : getSns().hashCode());
        hashCode = prime * hashCode + ((getIotTopicPublish() == null) ? 0 : getIotTopicPublish().hashCode());
        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        hashCode = prime * hashCode + ((getIotEvents() == null) ? 0 : getIotEvents().hashCode());
        hashCode = prime * hashCode + ((getSqs() == null) ? 0 : getSqs().hashCode());
        hashCode = prime * hashCode + ((getFirehose() == null) ? 0 : getFirehose().hashCode());
        hashCode = prime * hashCode + ((getDynamoDB() == null) ? 0 : getDynamoDB().hashCode());
        hashCode = prime * hashCode + ((getDynamoDBv2() == null) ? 0 : getDynamoDBv2().hashCode());
        hashCode = prime * hashCode + ((getIotSiteWise() == null) ? 0 : getIotSiteWise().hashCode());
        return hashCode;
    }

    @Override
    public AlarmAction clone() {
        try {
            return (AlarmAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.AlarmActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
