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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata for a step execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/PipelineExecutionStepMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineExecutionStepMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job that was run by this step execution.
     * </p>
     */
    private TrainingJobStepMetadata trainingJob;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job that was run by this step execution.
     * </p>
     */
    private ProcessingJobStepMetadata processingJob;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
     * </p>
     */
    private TransformJobStepMetadata transformJob;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job that was run by this step execution.
     * </p>
     */
    private TuningJobStepMetaData tuningJob;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model that was created by this step execution.
     * </p>
     */
    private ModelStepMetadata model;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package that the model was registered to by this step execution.
     * </p>
     */
    private RegisterModelStepMetadata registerModel;
    /**
     * <p>
     * The outcome of the condition evaluation that was run by this step execution.
     * </p>
     */
    private ConditionStepMetadata condition;
    /**
     * <p>
     * The URL of the Amazon SQS queue used by this step execution, the pipeline generated token, and a list of output
     * parameters.
     * </p>
     */
    private CallbackStepMetadata callback;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution and a list of output
     * parameters.
     * </p>
     */
    private LambdaStepMetadata lambda;
    /**
     * <p>
     * The configurations and outcomes of the check step execution. This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type of the check conducted.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of newly calculated baseline constraints and statistics.
     * </p>
     * </li>
     * <li>
     * <p>
     * The model package group name provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URI of the violation report if violations detected.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Resource Name (ARN) of check processing job initiated by the step execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Boolean flags indicating if the drift check is skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * If step property <code>BaselineUsedForDriftCheck</code> is set the same as <code>CalculatedBaseline</code>.
     * </p>
     * </li>
     * </ul>
     */
    private QualityCheckStepMetadata qualityCheck;
    /**
     * <p>
     * Container for the metadata for a Clarify check step. The configurations and outcomes of the check step execution.
     * This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type of the check conducted,
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of newly calculated baseline constraints and statistics.
     * </p>
     * </li>
     * <li>
     * <p>
     * The model package group name provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URI of the violation report if violations detected.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Resource Name (ARN) of check processing job initiated by the step execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * The boolean flags indicating if the drift check is skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * If step property <code>BaselineUsedForDriftCheck</code> is set the same as <code>CalculatedBaseline</code>.
     * </p>
     * </li>
     * </ul>
     */
    private ClarifyCheckStepMetadata clarifyCheck;
    /**
     * <p>
     * The configurations and outcomes of an Amazon EMR step execution.
     * </p>
     */
    private EMRStepMetadata eMR;
    /**
     * <p>
     * The configurations and outcomes of a Fail step execution.
     * </p>
     */
    private FailStepMetadata fail;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AutoML job that was run by this step.
     * </p>
     */
    private AutoMLJobStepMetadata autoMLJob;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job that was run by this step execution.
     * </p>
     * 
     * @param trainingJob
     *        The Amazon Resource Name (ARN) of the training job that was run by this step execution.
     */

    public void setTrainingJob(TrainingJobStepMetadata trainingJob) {
        this.trainingJob = trainingJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job that was run by this step execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the training job that was run by this step execution.
     */

    public TrainingJobStepMetadata getTrainingJob() {
        return this.trainingJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job that was run by this step execution.
     * </p>
     * 
     * @param trainingJob
     *        The Amazon Resource Name (ARN) of the training job that was run by this step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withTrainingJob(TrainingJobStepMetadata trainingJob) {
        setTrainingJob(trainingJob);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job that was run by this step execution.
     * </p>
     * 
     * @param processingJob
     *        The Amazon Resource Name (ARN) of the processing job that was run by this step execution.
     */

    public void setProcessingJob(ProcessingJobStepMetadata processingJob) {
        this.processingJob = processingJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job that was run by this step execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the processing job that was run by this step execution.
     */

    public ProcessingJobStepMetadata getProcessingJob() {
        return this.processingJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job that was run by this step execution.
     * </p>
     * 
     * @param processingJob
     *        The Amazon Resource Name (ARN) of the processing job that was run by this step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withProcessingJob(ProcessingJobStepMetadata processingJob) {
        setProcessingJob(processingJob);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
     * </p>
     * 
     * @param transformJob
     *        The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
     */

    public void setTransformJob(TransformJobStepMetadata transformJob) {
        this.transformJob = transformJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
     */

    public TransformJobStepMetadata getTransformJob() {
        return this.transformJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
     * </p>
     * 
     * @param transformJob
     *        The Amazon Resource Name (ARN) of the transform job that was run by this step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withTransformJob(TransformJobStepMetadata transformJob) {
        setTransformJob(transformJob);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job that was run by this step execution.
     * </p>
     * 
     * @param tuningJob
     *        The Amazon Resource Name (ARN) of the tuning job that was run by this step execution.
     */

    public void setTuningJob(TuningJobStepMetaData tuningJob) {
        this.tuningJob = tuningJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job that was run by this step execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the tuning job that was run by this step execution.
     */

    public TuningJobStepMetaData getTuningJob() {
        return this.tuningJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job that was run by this step execution.
     * </p>
     * 
     * @param tuningJob
     *        The Amazon Resource Name (ARN) of the tuning job that was run by this step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withTuningJob(TuningJobStepMetaData tuningJob) {
        setTuningJob(tuningJob);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model that was created by this step execution.
     * </p>
     * 
     * @param model
     *        The Amazon Resource Name (ARN) of the model that was created by this step execution.
     */

    public void setModel(ModelStepMetadata model) {
        this.model = model;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model that was created by this step execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model that was created by this step execution.
     */

    public ModelStepMetadata getModel() {
        return this.model;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model that was created by this step execution.
     * </p>
     * 
     * @param model
     *        The Amazon Resource Name (ARN) of the model that was created by this step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withModel(ModelStepMetadata model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package that the model was registered to by this step execution.
     * </p>
     * 
     * @param registerModel
     *        The Amazon Resource Name (ARN) of the model package that the model was registered to by this step
     *        execution.
     */

    public void setRegisterModel(RegisterModelStepMetadata registerModel) {
        this.registerModel = registerModel;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package that the model was registered to by this step execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model package that the model was registered to by this step
     *         execution.
     */

    public RegisterModelStepMetadata getRegisterModel() {
        return this.registerModel;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package that the model was registered to by this step execution.
     * </p>
     * 
     * @param registerModel
     *        The Amazon Resource Name (ARN) of the model package that the model was registered to by this step
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withRegisterModel(RegisterModelStepMetadata registerModel) {
        setRegisterModel(registerModel);
        return this;
    }

    /**
     * <p>
     * The outcome of the condition evaluation that was run by this step execution.
     * </p>
     * 
     * @param condition
     *        The outcome of the condition evaluation that was run by this step execution.
     */

    public void setCondition(ConditionStepMetadata condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The outcome of the condition evaluation that was run by this step execution.
     * </p>
     * 
     * @return The outcome of the condition evaluation that was run by this step execution.
     */

    public ConditionStepMetadata getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The outcome of the condition evaluation that was run by this step execution.
     * </p>
     * 
     * @param condition
     *        The outcome of the condition evaluation that was run by this step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withCondition(ConditionStepMetadata condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue used by this step execution, the pipeline generated token, and a list of output
     * parameters.
     * </p>
     * 
     * @param callback
     *        The URL of the Amazon SQS queue used by this step execution, the pipeline generated token, and a list of
     *        output parameters.
     */

    public void setCallback(CallbackStepMetadata callback) {
        this.callback = callback;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue used by this step execution, the pipeline generated token, and a list of output
     * parameters.
     * </p>
     * 
     * @return The URL of the Amazon SQS queue used by this step execution, the pipeline generated token, and a list of
     *         output parameters.
     */

    public CallbackStepMetadata getCallback() {
        return this.callback;
    }

    /**
     * <p>
     * The URL of the Amazon SQS queue used by this step execution, the pipeline generated token, and a list of output
     * parameters.
     * </p>
     * 
     * @param callback
     *        The URL of the Amazon SQS queue used by this step execution, the pipeline generated token, and a list of
     *        output parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withCallback(CallbackStepMetadata callback) {
        setCallback(callback);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution and a list of output
     * parameters.
     * </p>
     * 
     * @param lambda
     *        The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution and a list of
     *        output parameters.
     */

    public void setLambda(LambdaStepMetadata lambda) {
        this.lambda = lambda;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution and a list of output
     * parameters.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution and a list of
     *         output parameters.
     */

    public LambdaStepMetadata getLambda() {
        return this.lambda;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution and a list of output
     * parameters.
     * </p>
     * 
     * @param lambda
     *        The Amazon Resource Name (ARN) of the Lambda function that was run by this step execution and a list of
     *        output parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withLambda(LambdaStepMetadata lambda) {
        setLambda(lambda);
        return this;
    }

    /**
     * <p>
     * The configurations and outcomes of the check step execution. This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type of the check conducted.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of newly calculated baseline constraints and statistics.
     * </p>
     * </li>
     * <li>
     * <p>
     * The model package group name provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URI of the violation report if violations detected.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Resource Name (ARN) of check processing job initiated by the step execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Boolean flags indicating if the drift check is skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * If step property <code>BaselineUsedForDriftCheck</code> is set the same as <code>CalculatedBaseline</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param qualityCheck
     *        The configurations and outcomes of the check step execution. This includes: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The type of the check conducted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon S3 URIs of newly calculated baseline constraints and statistics.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The model package group name provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon S3 URI of the violation report if violations detected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon Resource Name (ARN) of check processing job initiated by the step execution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Boolean flags indicating if the drift check is skipped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If step property <code>BaselineUsedForDriftCheck</code> is set the same as <code>CalculatedBaseline</code>
     *        .
     *        </p>
     *        </li>
     */

    public void setQualityCheck(QualityCheckStepMetadata qualityCheck) {
        this.qualityCheck = qualityCheck;
    }

    /**
     * <p>
     * The configurations and outcomes of the check step execution. This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type of the check conducted.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of newly calculated baseline constraints and statistics.
     * </p>
     * </li>
     * <li>
     * <p>
     * The model package group name provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URI of the violation report if violations detected.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Resource Name (ARN) of check processing job initiated by the step execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Boolean flags indicating if the drift check is skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * If step property <code>BaselineUsedForDriftCheck</code> is set the same as <code>CalculatedBaseline</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The configurations and outcomes of the check step execution. This includes: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The type of the check conducted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The Amazon S3 URIs of newly calculated baseline constraints and statistics.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The model package group name provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The Amazon S3 URI of the violation report if violations detected.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The Amazon Resource Name (ARN) of check processing job initiated by the step execution.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The Boolean flags indicating if the drift check is skipped.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If step property <code>BaselineUsedForDriftCheck</code> is set the same as
     *         <code>CalculatedBaseline</code>.
     *         </p>
     *         </li>
     */

    public QualityCheckStepMetadata getQualityCheck() {
        return this.qualityCheck;
    }

    /**
     * <p>
     * The configurations and outcomes of the check step execution. This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type of the check conducted.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of newly calculated baseline constraints and statistics.
     * </p>
     * </li>
     * <li>
     * <p>
     * The model package group name provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URI of the violation report if violations detected.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Resource Name (ARN) of check processing job initiated by the step execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Boolean flags indicating if the drift check is skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * If step property <code>BaselineUsedForDriftCheck</code> is set the same as <code>CalculatedBaseline</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param qualityCheck
     *        The configurations and outcomes of the check step execution. This includes: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The type of the check conducted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon S3 URIs of newly calculated baseline constraints and statistics.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The model package group name provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon S3 URI of the violation report if violations detected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon Resource Name (ARN) of check processing job initiated by the step execution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Boolean flags indicating if the drift check is skipped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If step property <code>BaselineUsedForDriftCheck</code> is set the same as <code>CalculatedBaseline</code>
     *        .
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withQualityCheck(QualityCheckStepMetadata qualityCheck) {
        setQualityCheck(qualityCheck);
        return this;
    }

    /**
     * <p>
     * Container for the metadata for a Clarify check step. The configurations and outcomes of the check step execution.
     * This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type of the check conducted,
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of newly calculated baseline constraints and statistics.
     * </p>
     * </li>
     * <li>
     * <p>
     * The model package group name provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URI of the violation report if violations detected.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Resource Name (ARN) of check processing job initiated by the step execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * The boolean flags indicating if the drift check is skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * If step property <code>BaselineUsedForDriftCheck</code> is set the same as <code>CalculatedBaseline</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clarifyCheck
     *        Container for the metadata for a Clarify check step. The configurations and outcomes of the check step
     *        execution. This includes: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The type of the check conducted,
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon S3 URIs of newly calculated baseline constraints and statistics.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The model package group name provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon S3 URI of the violation report if violations detected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon Resource Name (ARN) of check processing job initiated by the step execution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The boolean flags indicating if the drift check is skipped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If step property <code>BaselineUsedForDriftCheck</code> is set the same as <code>CalculatedBaseline</code>
     *        .
     *        </p>
     *        </li>
     */

    public void setClarifyCheck(ClarifyCheckStepMetadata clarifyCheck) {
        this.clarifyCheck = clarifyCheck;
    }

    /**
     * <p>
     * Container for the metadata for a Clarify check step. The configurations and outcomes of the check step execution.
     * This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type of the check conducted,
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of newly calculated baseline constraints and statistics.
     * </p>
     * </li>
     * <li>
     * <p>
     * The model package group name provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URI of the violation report if violations detected.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Resource Name (ARN) of check processing job initiated by the step execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * The boolean flags indicating if the drift check is skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * If step property <code>BaselineUsedForDriftCheck</code> is set the same as <code>CalculatedBaseline</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Container for the metadata for a Clarify check step. The configurations and outcomes of the check step
     *         execution. This includes: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The type of the check conducted,
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The Amazon S3 URIs of newly calculated baseline constraints and statistics.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The model package group name provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The Amazon S3 URI of the violation report if violations detected.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The Amazon Resource Name (ARN) of check processing job initiated by the step execution.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The boolean flags indicating if the drift check is skipped.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If step property <code>BaselineUsedForDriftCheck</code> is set the same as
     *         <code>CalculatedBaseline</code>.
     *         </p>
     *         </li>
     */

    public ClarifyCheckStepMetadata getClarifyCheck() {
        return this.clarifyCheck;
    }

    /**
     * <p>
     * Container for the metadata for a Clarify check step. The configurations and outcomes of the check step execution.
     * This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type of the check conducted,
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URIs of newly calculated baseline constraints and statistics.
     * </p>
     * </li>
     * <li>
     * <p>
     * The model package group name provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon S3 URI of the violation report if violations detected.
     * </p>
     * </li>
     * <li>
     * <p>
     * The Amazon Resource Name (ARN) of check processing job initiated by the step execution.
     * </p>
     * </li>
     * <li>
     * <p>
     * The boolean flags indicating if the drift check is skipped.
     * </p>
     * </li>
     * <li>
     * <p>
     * If step property <code>BaselineUsedForDriftCheck</code> is set the same as <code>CalculatedBaseline</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clarifyCheck
     *        Container for the metadata for a Clarify check step. The configurations and outcomes of the check step
     *        execution. This includes: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The type of the check conducted,
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon S3 URIs of baseline constraints and statistics files to be used for the drift check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon S3 URIs of newly calculated baseline constraints and statistics.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The model package group name provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon S3 URI of the violation report if violations detected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The Amazon Resource Name (ARN) of check processing job initiated by the step execution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The boolean flags indicating if the drift check is skipped.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If step property <code>BaselineUsedForDriftCheck</code> is set the same as <code>CalculatedBaseline</code>
     *        .
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withClarifyCheck(ClarifyCheckStepMetadata clarifyCheck) {
        setClarifyCheck(clarifyCheck);
        return this;
    }

    /**
     * <p>
     * The configurations and outcomes of an Amazon EMR step execution.
     * </p>
     * 
     * @param eMR
     *        The configurations and outcomes of an Amazon EMR step execution.
     */

    public void setEMR(EMRStepMetadata eMR) {
        this.eMR = eMR;
    }

    /**
     * <p>
     * The configurations and outcomes of an Amazon EMR step execution.
     * </p>
     * 
     * @return The configurations and outcomes of an Amazon EMR step execution.
     */

    public EMRStepMetadata getEMR() {
        return this.eMR;
    }

    /**
     * <p>
     * The configurations and outcomes of an Amazon EMR step execution.
     * </p>
     * 
     * @param eMR
     *        The configurations and outcomes of an Amazon EMR step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withEMR(EMRStepMetadata eMR) {
        setEMR(eMR);
        return this;
    }

    /**
     * <p>
     * The configurations and outcomes of a Fail step execution.
     * </p>
     * 
     * @param fail
     *        The configurations and outcomes of a Fail step execution.
     */

    public void setFail(FailStepMetadata fail) {
        this.fail = fail;
    }

    /**
     * <p>
     * The configurations and outcomes of a Fail step execution.
     * </p>
     * 
     * @return The configurations and outcomes of a Fail step execution.
     */

    public FailStepMetadata getFail() {
        return this.fail;
    }

    /**
     * <p>
     * The configurations and outcomes of a Fail step execution.
     * </p>
     * 
     * @param fail
     *        The configurations and outcomes of a Fail step execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withFail(FailStepMetadata fail) {
        setFail(fail);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AutoML job that was run by this step.
     * </p>
     * 
     * @param autoMLJob
     *        The Amazon Resource Name (ARN) of the AutoML job that was run by this step.
     */

    public void setAutoMLJob(AutoMLJobStepMetadata autoMLJob) {
        this.autoMLJob = autoMLJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AutoML job that was run by this step.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AutoML job that was run by this step.
     */

    public AutoMLJobStepMetadata getAutoMLJob() {
        return this.autoMLJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AutoML job that was run by this step.
     * </p>
     * 
     * @param autoMLJob
     *        The Amazon Resource Name (ARN) of the AutoML job that was run by this step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionStepMetadata withAutoMLJob(AutoMLJobStepMetadata autoMLJob) {
        setAutoMLJob(autoMLJob);
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
        if (getTrainingJob() != null)
            sb.append("TrainingJob: ").append(getTrainingJob()).append(",");
        if (getProcessingJob() != null)
            sb.append("ProcessingJob: ").append(getProcessingJob()).append(",");
        if (getTransformJob() != null)
            sb.append("TransformJob: ").append(getTransformJob()).append(",");
        if (getTuningJob() != null)
            sb.append("TuningJob: ").append(getTuningJob()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getRegisterModel() != null)
            sb.append("RegisterModel: ").append(getRegisterModel()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getCallback() != null)
            sb.append("Callback: ").append(getCallback()).append(",");
        if (getLambda() != null)
            sb.append("Lambda: ").append(getLambda()).append(",");
        if (getQualityCheck() != null)
            sb.append("QualityCheck: ").append(getQualityCheck()).append(",");
        if (getClarifyCheck() != null)
            sb.append("ClarifyCheck: ").append(getClarifyCheck()).append(",");
        if (getEMR() != null)
            sb.append("EMR: ").append(getEMR()).append(",");
        if (getFail() != null)
            sb.append("Fail: ").append(getFail()).append(",");
        if (getAutoMLJob() != null)
            sb.append("AutoMLJob: ").append(getAutoMLJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineExecutionStepMetadata == false)
            return false;
        PipelineExecutionStepMetadata other = (PipelineExecutionStepMetadata) obj;
        if (other.getTrainingJob() == null ^ this.getTrainingJob() == null)
            return false;
        if (other.getTrainingJob() != null && other.getTrainingJob().equals(this.getTrainingJob()) == false)
            return false;
        if (other.getProcessingJob() == null ^ this.getProcessingJob() == null)
            return false;
        if (other.getProcessingJob() != null && other.getProcessingJob().equals(this.getProcessingJob()) == false)
            return false;
        if (other.getTransformJob() == null ^ this.getTransformJob() == null)
            return false;
        if (other.getTransformJob() != null && other.getTransformJob().equals(this.getTransformJob()) == false)
            return false;
        if (other.getTuningJob() == null ^ this.getTuningJob() == null)
            return false;
        if (other.getTuningJob() != null && other.getTuningJob().equals(this.getTuningJob()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getRegisterModel() == null ^ this.getRegisterModel() == null)
            return false;
        if (other.getRegisterModel() != null && other.getRegisterModel().equals(this.getRegisterModel()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getCallback() == null ^ this.getCallback() == null)
            return false;
        if (other.getCallback() != null && other.getCallback().equals(this.getCallback()) == false)
            return false;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        if (other.getQualityCheck() == null ^ this.getQualityCheck() == null)
            return false;
        if (other.getQualityCheck() != null && other.getQualityCheck().equals(this.getQualityCheck()) == false)
            return false;
        if (other.getClarifyCheck() == null ^ this.getClarifyCheck() == null)
            return false;
        if (other.getClarifyCheck() != null && other.getClarifyCheck().equals(this.getClarifyCheck()) == false)
            return false;
        if (other.getEMR() == null ^ this.getEMR() == null)
            return false;
        if (other.getEMR() != null && other.getEMR().equals(this.getEMR()) == false)
            return false;
        if (other.getFail() == null ^ this.getFail() == null)
            return false;
        if (other.getFail() != null && other.getFail().equals(this.getFail()) == false)
            return false;
        if (other.getAutoMLJob() == null ^ this.getAutoMLJob() == null)
            return false;
        if (other.getAutoMLJob() != null && other.getAutoMLJob().equals(this.getAutoMLJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingJob() == null) ? 0 : getTrainingJob().hashCode());
        hashCode = prime * hashCode + ((getProcessingJob() == null) ? 0 : getProcessingJob().hashCode());
        hashCode = prime * hashCode + ((getTransformJob() == null) ? 0 : getTransformJob().hashCode());
        hashCode = prime * hashCode + ((getTuningJob() == null) ? 0 : getTuningJob().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getRegisterModel() == null) ? 0 : getRegisterModel().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getCallback() == null) ? 0 : getCallback().hashCode());
        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        hashCode = prime * hashCode + ((getQualityCheck() == null) ? 0 : getQualityCheck().hashCode());
        hashCode = prime * hashCode + ((getClarifyCheck() == null) ? 0 : getClarifyCheck().hashCode());
        hashCode = prime * hashCode + ((getEMR() == null) ? 0 : getEMR().hashCode());
        hashCode = prime * hashCode + ((getFail() == null) ? 0 : getFail().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJob() == null) ? 0 : getAutoMLJob().hashCode());
        return hashCode;
    }

    @Override
    public PipelineExecutionStepMetadata clone() {
        try {
            return (PipelineExecutionStepMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.PipelineExecutionStepMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
