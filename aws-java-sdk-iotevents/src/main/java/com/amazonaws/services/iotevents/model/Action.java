/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An action to be performed when the <code>condition</code> is TRUE.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/Action" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets a variable to a specified value.
     * </p>
     */
    private SetVariableAction setVariable;
    /**
     * <p>
     * Sends an Amazon SNS message.
     * </p>
     */
    private SNSTopicPublishAction sns;
    /**
     * <p>
     * Publishes an MQTT message with the given topic to the AWS IoT message broker.
     * </p>
     */
    private IotTopicPublishAction iotTopicPublish;
    /**
     * <p>
     * Information needed to set the timer.
     * </p>
     */
    private SetTimerAction setTimer;
    /**
     * <p>
     * Information needed to clear the timer.
     * </p>
     */
    private ClearTimerAction clearTimer;
    /**
     * <p>
     * Information needed to reset the timer.
     * </p>
     */
    private ResetTimerAction resetTimer;
    /**
     * <p>
     * Calls a Lambda function, passing in information about the detector model instance and the event that triggered
     * the action.
     * </p>
     */
    private LambdaAction lambda;
    /**
     * <p>
     * Sends an AWS IoT Events input, passing in information about the detector model instance and the event that
     * triggered the action.
     * </p>
     */
    private IotEventsAction iotEvents;
    /**
     * <p>
     * Sends information about the detector model instance and the event that triggered the action to an Amazon SQS
     * queue.
     * </p>
     */
    private SqsAction sqs;
    /**
     * <p>
     * Sends information about the detector model instance and the event that triggered the action to an Amazon Kinesis
     * Data Firehose delivery stream.
     * </p>
     */
    private FirehoseAction firehose;

    /**
     * <p>
     * Sets a variable to a specified value.
     * </p>
     * 
     * @param setVariable
     *        Sets a variable to a specified value.
     */

    public void setSetVariable(SetVariableAction setVariable) {
        this.setVariable = setVariable;
    }

    /**
     * <p>
     * Sets a variable to a specified value.
     * </p>
     * 
     * @return Sets a variable to a specified value.
     */

    public SetVariableAction getSetVariable() {
        return this.setVariable;
    }

    /**
     * <p>
     * Sets a variable to a specified value.
     * </p>
     * 
     * @param setVariable
     *        Sets a variable to a specified value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withSetVariable(SetVariableAction setVariable) {
        setSetVariable(setVariable);
        return this;
    }

    /**
     * <p>
     * Sends an Amazon SNS message.
     * </p>
     * 
     * @param sns
     *        Sends an Amazon SNS message.
     */

    public void setSns(SNSTopicPublishAction sns) {
        this.sns = sns;
    }

    /**
     * <p>
     * Sends an Amazon SNS message.
     * </p>
     * 
     * @return Sends an Amazon SNS message.
     */

    public SNSTopicPublishAction getSns() {
        return this.sns;
    }

    /**
     * <p>
     * Sends an Amazon SNS message.
     * </p>
     * 
     * @param sns
     *        Sends an Amazon SNS message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withSns(SNSTopicPublishAction sns) {
        setSns(sns);
        return this;
    }

    /**
     * <p>
     * Publishes an MQTT message with the given topic to the AWS IoT message broker.
     * </p>
     * 
     * @param iotTopicPublish
     *        Publishes an MQTT message with the given topic to the AWS IoT message broker.
     */

    public void setIotTopicPublish(IotTopicPublishAction iotTopicPublish) {
        this.iotTopicPublish = iotTopicPublish;
    }

    /**
     * <p>
     * Publishes an MQTT message with the given topic to the AWS IoT message broker.
     * </p>
     * 
     * @return Publishes an MQTT message with the given topic to the AWS IoT message broker.
     */

    public IotTopicPublishAction getIotTopicPublish() {
        return this.iotTopicPublish;
    }

    /**
     * <p>
     * Publishes an MQTT message with the given topic to the AWS IoT message broker.
     * </p>
     * 
     * @param iotTopicPublish
     *        Publishes an MQTT message with the given topic to the AWS IoT message broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withIotTopicPublish(IotTopicPublishAction iotTopicPublish) {
        setIotTopicPublish(iotTopicPublish);
        return this;
    }

    /**
     * <p>
     * Information needed to set the timer.
     * </p>
     * 
     * @param setTimer
     *        Information needed to set the timer.
     */

    public void setSetTimer(SetTimerAction setTimer) {
        this.setTimer = setTimer;
    }

    /**
     * <p>
     * Information needed to set the timer.
     * </p>
     * 
     * @return Information needed to set the timer.
     */

    public SetTimerAction getSetTimer() {
        return this.setTimer;
    }

    /**
     * <p>
     * Information needed to set the timer.
     * </p>
     * 
     * @param setTimer
     *        Information needed to set the timer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withSetTimer(SetTimerAction setTimer) {
        setSetTimer(setTimer);
        return this;
    }

    /**
     * <p>
     * Information needed to clear the timer.
     * </p>
     * 
     * @param clearTimer
     *        Information needed to clear the timer.
     */

    public void setClearTimer(ClearTimerAction clearTimer) {
        this.clearTimer = clearTimer;
    }

    /**
     * <p>
     * Information needed to clear the timer.
     * </p>
     * 
     * @return Information needed to clear the timer.
     */

    public ClearTimerAction getClearTimer() {
        return this.clearTimer;
    }

    /**
     * <p>
     * Information needed to clear the timer.
     * </p>
     * 
     * @param clearTimer
     *        Information needed to clear the timer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withClearTimer(ClearTimerAction clearTimer) {
        setClearTimer(clearTimer);
        return this;
    }

    /**
     * <p>
     * Information needed to reset the timer.
     * </p>
     * 
     * @param resetTimer
     *        Information needed to reset the timer.
     */

    public void setResetTimer(ResetTimerAction resetTimer) {
        this.resetTimer = resetTimer;
    }

    /**
     * <p>
     * Information needed to reset the timer.
     * </p>
     * 
     * @return Information needed to reset the timer.
     */

    public ResetTimerAction getResetTimer() {
        return this.resetTimer;
    }

    /**
     * <p>
     * Information needed to reset the timer.
     * </p>
     * 
     * @param resetTimer
     *        Information needed to reset the timer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withResetTimer(ResetTimerAction resetTimer) {
        setResetTimer(resetTimer);
        return this;
    }

    /**
     * <p>
     * Calls a Lambda function, passing in information about the detector model instance and the event that triggered
     * the action.
     * </p>
     * 
     * @param lambda
     *        Calls a Lambda function, passing in information about the detector model instance and the event that
     *        triggered the action.
     */

    public void setLambda(LambdaAction lambda) {
        this.lambda = lambda;
    }

    /**
     * <p>
     * Calls a Lambda function, passing in information about the detector model instance and the event that triggered
     * the action.
     * </p>
     * 
     * @return Calls a Lambda function, passing in information about the detector model instance and the event that
     *         triggered the action.
     */

    public LambdaAction getLambda() {
        return this.lambda;
    }

    /**
     * <p>
     * Calls a Lambda function, passing in information about the detector model instance and the event that triggered
     * the action.
     * </p>
     * 
     * @param lambda
     *        Calls a Lambda function, passing in information about the detector model instance and the event that
     *        triggered the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withLambda(LambdaAction lambda) {
        setLambda(lambda);
        return this;
    }

    /**
     * <p>
     * Sends an AWS IoT Events input, passing in information about the detector model instance and the event that
     * triggered the action.
     * </p>
     * 
     * @param iotEvents
     *        Sends an AWS IoT Events input, passing in information about the detector model instance and the event that
     *        triggered the action.
     */

    public void setIotEvents(IotEventsAction iotEvents) {
        this.iotEvents = iotEvents;
    }

    /**
     * <p>
     * Sends an AWS IoT Events input, passing in information about the detector model instance and the event that
     * triggered the action.
     * </p>
     * 
     * @return Sends an AWS IoT Events input, passing in information about the detector model instance and the event
     *         that triggered the action.
     */

    public IotEventsAction getIotEvents() {
        return this.iotEvents;
    }

    /**
     * <p>
     * Sends an AWS IoT Events input, passing in information about the detector model instance and the event that
     * triggered the action.
     * </p>
     * 
     * @param iotEvents
     *        Sends an AWS IoT Events input, passing in information about the detector model instance and the event that
     *        triggered the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withIotEvents(IotEventsAction iotEvents) {
        setIotEvents(iotEvents);
        return this;
    }

    /**
     * <p>
     * Sends information about the detector model instance and the event that triggered the action to an Amazon SQS
     * queue.
     * </p>
     * 
     * @param sqs
     *        Sends information about the detector model instance and the event that triggered the action to an Amazon
     *        SQS queue.
     */

    public void setSqs(SqsAction sqs) {
        this.sqs = sqs;
    }

    /**
     * <p>
     * Sends information about the detector model instance and the event that triggered the action to an Amazon SQS
     * queue.
     * </p>
     * 
     * @return Sends information about the detector model instance and the event that triggered the action to an Amazon
     *         SQS queue.
     */

    public SqsAction getSqs() {
        return this.sqs;
    }

    /**
     * <p>
     * Sends information about the detector model instance and the event that triggered the action to an Amazon SQS
     * queue.
     * </p>
     * 
     * @param sqs
     *        Sends information about the detector model instance and the event that triggered the action to an Amazon
     *        SQS queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withSqs(SqsAction sqs) {
        setSqs(sqs);
        return this;
    }

    /**
     * <p>
     * Sends information about the detector model instance and the event that triggered the action to an Amazon Kinesis
     * Data Firehose delivery stream.
     * </p>
     * 
     * @param firehose
     *        Sends information about the detector model instance and the event that triggered the action to an Amazon
     *        Kinesis Data Firehose delivery stream.
     */

    public void setFirehose(FirehoseAction firehose) {
        this.firehose = firehose;
    }

    /**
     * <p>
     * Sends information about the detector model instance and the event that triggered the action to an Amazon Kinesis
     * Data Firehose delivery stream.
     * </p>
     * 
     * @return Sends information about the detector model instance and the event that triggered the action to an Amazon
     *         Kinesis Data Firehose delivery stream.
     */

    public FirehoseAction getFirehose() {
        return this.firehose;
    }

    /**
     * <p>
     * Sends information about the detector model instance and the event that triggered the action to an Amazon Kinesis
     * Data Firehose delivery stream.
     * </p>
     * 
     * @param firehose
     *        Sends information about the detector model instance and the event that triggered the action to an Amazon
     *        Kinesis Data Firehose delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withFirehose(FirehoseAction firehose) {
        setFirehose(firehose);
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
        if (getSetVariable() != null)
            sb.append("SetVariable: ").append(getSetVariable()).append(",");
        if (getSns() != null)
            sb.append("Sns: ").append(getSns()).append(",");
        if (getIotTopicPublish() != null)
            sb.append("IotTopicPublish: ").append(getIotTopicPublish()).append(",");
        if (getSetTimer() != null)
            sb.append("SetTimer: ").append(getSetTimer()).append(",");
        if (getClearTimer() != null)
            sb.append("ClearTimer: ").append(getClearTimer()).append(",");
        if (getResetTimer() != null)
            sb.append("ResetTimer: ").append(getResetTimer()).append(",");
        if (getLambda() != null)
            sb.append("Lambda: ").append(getLambda()).append(",");
        if (getIotEvents() != null)
            sb.append("IotEvents: ").append(getIotEvents()).append(",");
        if (getSqs() != null)
            sb.append("Sqs: ").append(getSqs()).append(",");
        if (getFirehose() != null)
            sb.append("Firehose: ").append(getFirehose());
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
        if (other.getSetVariable() == null ^ this.getSetVariable() == null)
            return false;
        if (other.getSetVariable() != null && other.getSetVariable().equals(this.getSetVariable()) == false)
            return false;
        if (other.getSns() == null ^ this.getSns() == null)
            return false;
        if (other.getSns() != null && other.getSns().equals(this.getSns()) == false)
            return false;
        if (other.getIotTopicPublish() == null ^ this.getIotTopicPublish() == null)
            return false;
        if (other.getIotTopicPublish() != null && other.getIotTopicPublish().equals(this.getIotTopicPublish()) == false)
            return false;
        if (other.getSetTimer() == null ^ this.getSetTimer() == null)
            return false;
        if (other.getSetTimer() != null && other.getSetTimer().equals(this.getSetTimer()) == false)
            return false;
        if (other.getClearTimer() == null ^ this.getClearTimer() == null)
            return false;
        if (other.getClearTimer() != null && other.getClearTimer().equals(this.getClearTimer()) == false)
            return false;
        if (other.getResetTimer() == null ^ this.getResetTimer() == null)
            return false;
        if (other.getResetTimer() != null && other.getResetTimer().equals(this.getResetTimer()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSetVariable() == null) ? 0 : getSetVariable().hashCode());
        hashCode = prime * hashCode + ((getSns() == null) ? 0 : getSns().hashCode());
        hashCode = prime * hashCode + ((getIotTopicPublish() == null) ? 0 : getIotTopicPublish().hashCode());
        hashCode = prime * hashCode + ((getSetTimer() == null) ? 0 : getSetTimer().hashCode());
        hashCode = prime * hashCode + ((getClearTimer() == null) ? 0 : getClearTimer().hashCode());
        hashCode = prime * hashCode + ((getResetTimer() == null) ? 0 : getResetTimer().hashCode());
        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        hashCode = prime * hashCode + ((getIotEvents() == null) ? 0 : getIotEvents().hashCode());
        hashCode = prime * hashCode + ((getSqs() == null) ? 0 : getSqs().hashCode());
        hashCode = prime * hashCode + ((getFirehose() == null) ? 0 : getFirehose().hashCode());
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
        com.amazonaws.services.iotevents.model.transform.ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
