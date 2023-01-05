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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters required to set up a target for your pipe.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/PipeTargetParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeTargetParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parameters for using an Batch job as a target.
     * </p>
     */
    private PipeTargetBatchJobParameters batchJobParameters;
    /**
     * <p>
     * The parameters for using an CloudWatch Logs log stream as a target.
     * </p>
     */
    private PipeTargetCloudWatchLogsParameters cloudWatchLogsParameters;
    /**
     * <p>
     * The parameters for using an Amazon ECS task as a target.
     * </p>
     */
    private PipeTargetEcsTaskParameters ecsTaskParameters;
    /**
     * <p>
     * The parameters for using an EventBridge event bus as a target.
     * </p>
     */
    private PipeTargetEventBridgeEventBusParameters eventBridgeEventBusParameters;
    /**
     * <p>
     * These are custom parameter to be used when the target is an API Gateway REST APIs or EventBridge ApiDestinations.
     * </p>
     */
    private PipeTargetHttpParameters httpParameters;
    /**
     * <p>
     * Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target. For
     * more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object Notation (JSON)
     * Data Interchange Format</a>.
     * </p>
     */
    private String inputTemplate;
    /**
     * <p>
     * The parameters for using a Kinesis stream as a source.
     * </p>
     */
    private PipeTargetKinesisStreamParameters kinesisStreamParameters;
    /**
     * <p>
     * The parameters for using a Lambda function as a target.
     * </p>
     */
    private PipeTargetLambdaFunctionParameters lambdaFunctionParameters;
    /**
     * <p>
     * These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke the Amazon Redshift
     * Data API ExecuteStatement.
     * </p>
     */
    private PipeTargetRedshiftDataParameters redshiftDataParameters;
    /**
     * <p>
     * The parameters for using a SageMaker pipeline as a target.
     * </p>
     */
    private PipeTargetSageMakerPipelineParameters sageMakerPipelineParameters;
    /**
     * <p>
     * The parameters for using a Amazon SQS stream as a source.
     * </p>
     */
    private PipeTargetSqsQueueParameters sqsQueueParameters;
    /**
     * <p>
     * The parameters for using a Step Functions state machine as a target.
     * </p>
     */
    private PipeTargetStateMachineParameters stepFunctionStateMachineParameters;

    /**
     * <p>
     * The parameters for using an Batch job as a target.
     * </p>
     * 
     * @param batchJobParameters
     *        The parameters for using an Batch job as a target.
     */

    public void setBatchJobParameters(PipeTargetBatchJobParameters batchJobParameters) {
        this.batchJobParameters = batchJobParameters;
    }

    /**
     * <p>
     * The parameters for using an Batch job as a target.
     * </p>
     * 
     * @return The parameters for using an Batch job as a target.
     */

    public PipeTargetBatchJobParameters getBatchJobParameters() {
        return this.batchJobParameters;
    }

    /**
     * <p>
     * The parameters for using an Batch job as a target.
     * </p>
     * 
     * @param batchJobParameters
     *        The parameters for using an Batch job as a target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetParameters withBatchJobParameters(PipeTargetBatchJobParameters batchJobParameters) {
        setBatchJobParameters(batchJobParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for using an CloudWatch Logs log stream as a target.
     * </p>
     * 
     * @param cloudWatchLogsParameters
     *        The parameters for using an CloudWatch Logs log stream as a target.
     */

    public void setCloudWatchLogsParameters(PipeTargetCloudWatchLogsParameters cloudWatchLogsParameters) {
        this.cloudWatchLogsParameters = cloudWatchLogsParameters;
    }

    /**
     * <p>
     * The parameters for using an CloudWatch Logs log stream as a target.
     * </p>
     * 
     * @return The parameters for using an CloudWatch Logs log stream as a target.
     */

    public PipeTargetCloudWatchLogsParameters getCloudWatchLogsParameters() {
        return this.cloudWatchLogsParameters;
    }

    /**
     * <p>
     * The parameters for using an CloudWatch Logs log stream as a target.
     * </p>
     * 
     * @param cloudWatchLogsParameters
     *        The parameters for using an CloudWatch Logs log stream as a target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetParameters withCloudWatchLogsParameters(PipeTargetCloudWatchLogsParameters cloudWatchLogsParameters) {
        setCloudWatchLogsParameters(cloudWatchLogsParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for using an Amazon ECS task as a target.
     * </p>
     * 
     * @param ecsTaskParameters
     *        The parameters for using an Amazon ECS task as a target.
     */

    public void setEcsTaskParameters(PipeTargetEcsTaskParameters ecsTaskParameters) {
        this.ecsTaskParameters = ecsTaskParameters;
    }

    /**
     * <p>
     * The parameters for using an Amazon ECS task as a target.
     * </p>
     * 
     * @return The parameters for using an Amazon ECS task as a target.
     */

    public PipeTargetEcsTaskParameters getEcsTaskParameters() {
        return this.ecsTaskParameters;
    }

    /**
     * <p>
     * The parameters for using an Amazon ECS task as a target.
     * </p>
     * 
     * @param ecsTaskParameters
     *        The parameters for using an Amazon ECS task as a target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetParameters withEcsTaskParameters(PipeTargetEcsTaskParameters ecsTaskParameters) {
        setEcsTaskParameters(ecsTaskParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for using an EventBridge event bus as a target.
     * </p>
     * 
     * @param eventBridgeEventBusParameters
     *        The parameters for using an EventBridge event bus as a target.
     */

    public void setEventBridgeEventBusParameters(PipeTargetEventBridgeEventBusParameters eventBridgeEventBusParameters) {
        this.eventBridgeEventBusParameters = eventBridgeEventBusParameters;
    }

    /**
     * <p>
     * The parameters for using an EventBridge event bus as a target.
     * </p>
     * 
     * @return The parameters for using an EventBridge event bus as a target.
     */

    public PipeTargetEventBridgeEventBusParameters getEventBridgeEventBusParameters() {
        return this.eventBridgeEventBusParameters;
    }

    /**
     * <p>
     * The parameters for using an EventBridge event bus as a target.
     * </p>
     * 
     * @param eventBridgeEventBusParameters
     *        The parameters for using an EventBridge event bus as a target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetParameters withEventBridgeEventBusParameters(PipeTargetEventBridgeEventBusParameters eventBridgeEventBusParameters) {
        setEventBridgeEventBusParameters(eventBridgeEventBusParameters);
        return this;
    }

    /**
     * <p>
     * These are custom parameter to be used when the target is an API Gateway REST APIs or EventBridge ApiDestinations.
     * </p>
     * 
     * @param httpParameters
     *        These are custom parameter to be used when the target is an API Gateway REST APIs or EventBridge
     *        ApiDestinations.
     */

    public void setHttpParameters(PipeTargetHttpParameters httpParameters) {
        this.httpParameters = httpParameters;
    }

    /**
     * <p>
     * These are custom parameter to be used when the target is an API Gateway REST APIs or EventBridge ApiDestinations.
     * </p>
     * 
     * @return These are custom parameter to be used when the target is an API Gateway REST APIs or EventBridge
     *         ApiDestinations.
     */

    public PipeTargetHttpParameters getHttpParameters() {
        return this.httpParameters;
    }

    /**
     * <p>
     * These are custom parameter to be used when the target is an API Gateway REST APIs or EventBridge ApiDestinations.
     * </p>
     * 
     * @param httpParameters
     *        These are custom parameter to be used when the target is an API Gateway REST APIs or EventBridge
     *        ApiDestinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetParameters withHttpParameters(PipeTargetHttpParameters httpParameters) {
        setHttpParameters(httpParameters);
        return this;
    }

    /**
     * <p>
     * Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target. For
     * more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object Notation (JSON)
     * Data Interchange Format</a>.
     * </p>
     * 
     * @param inputTemplate
     *        Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target.
     *        For more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object
     *        Notation (JSON) Data Interchange Format</a>.
     */

    public void setInputTemplate(String inputTemplate) {
        this.inputTemplate = inputTemplate;
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

    public String getInputTemplate() {
        return this.inputTemplate;
    }

    /**
     * <p>
     * Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target. For
     * more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object Notation (JSON)
     * Data Interchange Format</a>.
     * </p>
     * 
     * @param inputTemplate
     *        Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target.
     *        For more information, see <a href="http://www.rfc-editor.org/rfc/rfc7159.txt">The JavaScript Object
     *        Notation (JSON) Data Interchange Format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetParameters withInputTemplate(String inputTemplate) {
        setInputTemplate(inputTemplate);
        return this;
    }

    /**
     * <p>
     * The parameters for using a Kinesis stream as a source.
     * </p>
     * 
     * @param kinesisStreamParameters
     *        The parameters for using a Kinesis stream as a source.
     */

    public void setKinesisStreamParameters(PipeTargetKinesisStreamParameters kinesisStreamParameters) {
        this.kinesisStreamParameters = kinesisStreamParameters;
    }

    /**
     * <p>
     * The parameters for using a Kinesis stream as a source.
     * </p>
     * 
     * @return The parameters for using a Kinesis stream as a source.
     */

    public PipeTargetKinesisStreamParameters getKinesisStreamParameters() {
        return this.kinesisStreamParameters;
    }

    /**
     * <p>
     * The parameters for using a Kinesis stream as a source.
     * </p>
     * 
     * @param kinesisStreamParameters
     *        The parameters for using a Kinesis stream as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetParameters withKinesisStreamParameters(PipeTargetKinesisStreamParameters kinesisStreamParameters) {
        setKinesisStreamParameters(kinesisStreamParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for using a Lambda function as a target.
     * </p>
     * 
     * @param lambdaFunctionParameters
     *        The parameters for using a Lambda function as a target.
     */

    public void setLambdaFunctionParameters(PipeTargetLambdaFunctionParameters lambdaFunctionParameters) {
        this.lambdaFunctionParameters = lambdaFunctionParameters;
    }

    /**
     * <p>
     * The parameters for using a Lambda function as a target.
     * </p>
     * 
     * @return The parameters for using a Lambda function as a target.
     */

    public PipeTargetLambdaFunctionParameters getLambdaFunctionParameters() {
        return this.lambdaFunctionParameters;
    }

    /**
     * <p>
     * The parameters for using a Lambda function as a target.
     * </p>
     * 
     * @param lambdaFunctionParameters
     *        The parameters for using a Lambda function as a target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetParameters withLambdaFunctionParameters(PipeTargetLambdaFunctionParameters lambdaFunctionParameters) {
        setLambdaFunctionParameters(lambdaFunctionParameters);
        return this;
    }

    /**
     * <p>
     * These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke the Amazon Redshift
     * Data API ExecuteStatement.
     * </p>
     * 
     * @param redshiftDataParameters
     *        These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke the Amazon
     *        Redshift Data API ExecuteStatement.
     */

    public void setRedshiftDataParameters(PipeTargetRedshiftDataParameters redshiftDataParameters) {
        this.redshiftDataParameters = redshiftDataParameters;
    }

    /**
     * <p>
     * These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke the Amazon Redshift
     * Data API ExecuteStatement.
     * </p>
     * 
     * @return These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke the Amazon
     *         Redshift Data API ExecuteStatement.
     */

    public PipeTargetRedshiftDataParameters getRedshiftDataParameters() {
        return this.redshiftDataParameters;
    }

    /**
     * <p>
     * These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke the Amazon Redshift
     * Data API ExecuteStatement.
     * </p>
     * 
     * @param redshiftDataParameters
     *        These are custom parameters to be used when the target is a Amazon Redshift cluster to invoke the Amazon
     *        Redshift Data API ExecuteStatement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetParameters withRedshiftDataParameters(PipeTargetRedshiftDataParameters redshiftDataParameters) {
        setRedshiftDataParameters(redshiftDataParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for using a SageMaker pipeline as a target.
     * </p>
     * 
     * @param sageMakerPipelineParameters
     *        The parameters for using a SageMaker pipeline as a target.
     */

    public void setSageMakerPipelineParameters(PipeTargetSageMakerPipelineParameters sageMakerPipelineParameters) {
        this.sageMakerPipelineParameters = sageMakerPipelineParameters;
    }

    /**
     * <p>
     * The parameters for using a SageMaker pipeline as a target.
     * </p>
     * 
     * @return The parameters for using a SageMaker pipeline as a target.
     */

    public PipeTargetSageMakerPipelineParameters getSageMakerPipelineParameters() {
        return this.sageMakerPipelineParameters;
    }

    /**
     * <p>
     * The parameters for using a SageMaker pipeline as a target.
     * </p>
     * 
     * @param sageMakerPipelineParameters
     *        The parameters for using a SageMaker pipeline as a target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetParameters withSageMakerPipelineParameters(PipeTargetSageMakerPipelineParameters sageMakerPipelineParameters) {
        setSageMakerPipelineParameters(sageMakerPipelineParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for using a Amazon SQS stream as a source.
     * </p>
     * 
     * @param sqsQueueParameters
     *        The parameters for using a Amazon SQS stream as a source.
     */

    public void setSqsQueueParameters(PipeTargetSqsQueueParameters sqsQueueParameters) {
        this.sqsQueueParameters = sqsQueueParameters;
    }

    /**
     * <p>
     * The parameters for using a Amazon SQS stream as a source.
     * </p>
     * 
     * @return The parameters for using a Amazon SQS stream as a source.
     */

    public PipeTargetSqsQueueParameters getSqsQueueParameters() {
        return this.sqsQueueParameters;
    }

    /**
     * <p>
     * The parameters for using a Amazon SQS stream as a source.
     * </p>
     * 
     * @param sqsQueueParameters
     *        The parameters for using a Amazon SQS stream as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetParameters withSqsQueueParameters(PipeTargetSqsQueueParameters sqsQueueParameters) {
        setSqsQueueParameters(sqsQueueParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for using a Step Functions state machine as a target.
     * </p>
     * 
     * @param stepFunctionStateMachineParameters
     *        The parameters for using a Step Functions state machine as a target.
     */

    public void setStepFunctionStateMachineParameters(PipeTargetStateMachineParameters stepFunctionStateMachineParameters) {
        this.stepFunctionStateMachineParameters = stepFunctionStateMachineParameters;
    }

    /**
     * <p>
     * The parameters for using a Step Functions state machine as a target.
     * </p>
     * 
     * @return The parameters for using a Step Functions state machine as a target.
     */

    public PipeTargetStateMachineParameters getStepFunctionStateMachineParameters() {
        return this.stepFunctionStateMachineParameters;
    }

    /**
     * <p>
     * The parameters for using a Step Functions state machine as a target.
     * </p>
     * 
     * @param stepFunctionStateMachineParameters
     *        The parameters for using a Step Functions state machine as a target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeTargetParameters withStepFunctionStateMachineParameters(PipeTargetStateMachineParameters stepFunctionStateMachineParameters) {
        setStepFunctionStateMachineParameters(stepFunctionStateMachineParameters);
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
        if (getBatchJobParameters() != null)
            sb.append("BatchJobParameters: ").append(getBatchJobParameters()).append(",");
        if (getCloudWatchLogsParameters() != null)
            sb.append("CloudWatchLogsParameters: ").append(getCloudWatchLogsParameters()).append(",");
        if (getEcsTaskParameters() != null)
            sb.append("EcsTaskParameters: ").append(getEcsTaskParameters()).append(",");
        if (getEventBridgeEventBusParameters() != null)
            sb.append("EventBridgeEventBusParameters: ").append(getEventBridgeEventBusParameters()).append(",");
        if (getHttpParameters() != null)
            sb.append("HttpParameters: ").append(getHttpParameters()).append(",");
        if (getInputTemplate() != null)
            sb.append("InputTemplate: ").append("***Sensitive Data Redacted***").append(",");
        if (getKinesisStreamParameters() != null)
            sb.append("KinesisStreamParameters: ").append(getKinesisStreamParameters()).append(",");
        if (getLambdaFunctionParameters() != null)
            sb.append("LambdaFunctionParameters: ").append(getLambdaFunctionParameters()).append(",");
        if (getRedshiftDataParameters() != null)
            sb.append("RedshiftDataParameters: ").append(getRedshiftDataParameters()).append(",");
        if (getSageMakerPipelineParameters() != null)
            sb.append("SageMakerPipelineParameters: ").append(getSageMakerPipelineParameters()).append(",");
        if (getSqsQueueParameters() != null)
            sb.append("SqsQueueParameters: ").append(getSqsQueueParameters()).append(",");
        if (getStepFunctionStateMachineParameters() != null)
            sb.append("StepFunctionStateMachineParameters: ").append(getStepFunctionStateMachineParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipeTargetParameters == false)
            return false;
        PipeTargetParameters other = (PipeTargetParameters) obj;
        if (other.getBatchJobParameters() == null ^ this.getBatchJobParameters() == null)
            return false;
        if (other.getBatchJobParameters() != null && other.getBatchJobParameters().equals(this.getBatchJobParameters()) == false)
            return false;
        if (other.getCloudWatchLogsParameters() == null ^ this.getCloudWatchLogsParameters() == null)
            return false;
        if (other.getCloudWatchLogsParameters() != null && other.getCloudWatchLogsParameters().equals(this.getCloudWatchLogsParameters()) == false)
            return false;
        if (other.getEcsTaskParameters() == null ^ this.getEcsTaskParameters() == null)
            return false;
        if (other.getEcsTaskParameters() != null && other.getEcsTaskParameters().equals(this.getEcsTaskParameters()) == false)
            return false;
        if (other.getEventBridgeEventBusParameters() == null ^ this.getEventBridgeEventBusParameters() == null)
            return false;
        if (other.getEventBridgeEventBusParameters() != null
                && other.getEventBridgeEventBusParameters().equals(this.getEventBridgeEventBusParameters()) == false)
            return false;
        if (other.getHttpParameters() == null ^ this.getHttpParameters() == null)
            return false;
        if (other.getHttpParameters() != null && other.getHttpParameters().equals(this.getHttpParameters()) == false)
            return false;
        if (other.getInputTemplate() == null ^ this.getInputTemplate() == null)
            return false;
        if (other.getInputTemplate() != null && other.getInputTemplate().equals(this.getInputTemplate()) == false)
            return false;
        if (other.getKinesisStreamParameters() == null ^ this.getKinesisStreamParameters() == null)
            return false;
        if (other.getKinesisStreamParameters() != null && other.getKinesisStreamParameters().equals(this.getKinesisStreamParameters()) == false)
            return false;
        if (other.getLambdaFunctionParameters() == null ^ this.getLambdaFunctionParameters() == null)
            return false;
        if (other.getLambdaFunctionParameters() != null && other.getLambdaFunctionParameters().equals(this.getLambdaFunctionParameters()) == false)
            return false;
        if (other.getRedshiftDataParameters() == null ^ this.getRedshiftDataParameters() == null)
            return false;
        if (other.getRedshiftDataParameters() != null && other.getRedshiftDataParameters().equals(this.getRedshiftDataParameters()) == false)
            return false;
        if (other.getSageMakerPipelineParameters() == null ^ this.getSageMakerPipelineParameters() == null)
            return false;
        if (other.getSageMakerPipelineParameters() != null && other.getSageMakerPipelineParameters().equals(this.getSageMakerPipelineParameters()) == false)
            return false;
        if (other.getSqsQueueParameters() == null ^ this.getSqsQueueParameters() == null)
            return false;
        if (other.getSqsQueueParameters() != null && other.getSqsQueueParameters().equals(this.getSqsQueueParameters()) == false)
            return false;
        if (other.getStepFunctionStateMachineParameters() == null ^ this.getStepFunctionStateMachineParameters() == null)
            return false;
        if (other.getStepFunctionStateMachineParameters() != null
                && other.getStepFunctionStateMachineParameters().equals(this.getStepFunctionStateMachineParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchJobParameters() == null) ? 0 : getBatchJobParameters().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogsParameters() == null) ? 0 : getCloudWatchLogsParameters().hashCode());
        hashCode = prime * hashCode + ((getEcsTaskParameters() == null) ? 0 : getEcsTaskParameters().hashCode());
        hashCode = prime * hashCode + ((getEventBridgeEventBusParameters() == null) ? 0 : getEventBridgeEventBusParameters().hashCode());
        hashCode = prime * hashCode + ((getHttpParameters() == null) ? 0 : getHttpParameters().hashCode());
        hashCode = prime * hashCode + ((getInputTemplate() == null) ? 0 : getInputTemplate().hashCode());
        hashCode = prime * hashCode + ((getKinesisStreamParameters() == null) ? 0 : getKinesisStreamParameters().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionParameters() == null) ? 0 : getLambdaFunctionParameters().hashCode());
        hashCode = prime * hashCode + ((getRedshiftDataParameters() == null) ? 0 : getRedshiftDataParameters().hashCode());
        hashCode = prime * hashCode + ((getSageMakerPipelineParameters() == null) ? 0 : getSageMakerPipelineParameters().hashCode());
        hashCode = prime * hashCode + ((getSqsQueueParameters() == null) ? 0 : getSqsQueueParameters().hashCode());
        hashCode = prime * hashCode + ((getStepFunctionStateMachineParameters() == null) ? 0 : getStepFunctionStateMachineParameters().hashCode());
        return hashCode;
    }

    @Override
    public PipeTargetParameters clone() {
        try {
            return (PipeTargetParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.PipeTargetParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
