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
 * A single resource returned as part of the <a>Search</a> API response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SearchRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The properties of a training job.
     * </p>
     */
    private TrainingJob trainingJob;
    /**
     * <p>
     * The properties of an experiment.
     * </p>
     */
    private Experiment experiment;
    /**
     * <p>
     * The properties of a trial.
     * </p>
     */
    private Trial trial;
    /**
     * <p>
     * The properties of a trial component.
     * </p>
     */
    private TrialComponent trialComponent;

    private Endpoint endpoint;

    private ModelPackage modelPackage;

    private ModelPackageGroup modelPackageGroup;

    private Pipeline pipeline;

    private PipelineExecution pipelineExecution;

    private FeatureGroup featureGroup;
    /**
     * <p>
     * The properties of a project.
     * </p>
     */
    private Project project;
    /**
     * <p>
     * The feature metadata used to search through the features.
     * </p>
     */
    private FeatureMetadata featureMetadata;
    /**
     * <p>
     * The properties of a hyperparameter tuning job.
     * </p>
     */
    private HyperParameterTuningJobSearchEntity hyperParameterTuningJob;

    private ModelDashboardModel model;
    /**
     * <p>
     * An Amazon SageMaker Model Card that documents details about a machine learning model.
     * </p>
     */
    private ModelCard modelCard;

    /**
     * <p>
     * The properties of a training job.
     * </p>
     * 
     * @param trainingJob
     *        The properties of a training job.
     */

    public void setTrainingJob(TrainingJob trainingJob) {
        this.trainingJob = trainingJob;
    }

    /**
     * <p>
     * The properties of a training job.
     * </p>
     * 
     * @return The properties of a training job.
     */

    public TrainingJob getTrainingJob() {
        return this.trainingJob;
    }

    /**
     * <p>
     * The properties of a training job.
     * </p>
     * 
     * @param trainingJob
     *        The properties of a training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withTrainingJob(TrainingJob trainingJob) {
        setTrainingJob(trainingJob);
        return this;
    }

    /**
     * <p>
     * The properties of an experiment.
     * </p>
     * 
     * @param experiment
     *        The properties of an experiment.
     */

    public void setExperiment(Experiment experiment) {
        this.experiment = experiment;
    }

    /**
     * <p>
     * The properties of an experiment.
     * </p>
     * 
     * @return The properties of an experiment.
     */

    public Experiment getExperiment() {
        return this.experiment;
    }

    /**
     * <p>
     * The properties of an experiment.
     * </p>
     * 
     * @param experiment
     *        The properties of an experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withExperiment(Experiment experiment) {
        setExperiment(experiment);
        return this;
    }

    /**
     * <p>
     * The properties of a trial.
     * </p>
     * 
     * @param trial
     *        The properties of a trial.
     */

    public void setTrial(Trial trial) {
        this.trial = trial;
    }

    /**
     * <p>
     * The properties of a trial.
     * </p>
     * 
     * @return The properties of a trial.
     */

    public Trial getTrial() {
        return this.trial;
    }

    /**
     * <p>
     * The properties of a trial.
     * </p>
     * 
     * @param trial
     *        The properties of a trial.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withTrial(Trial trial) {
        setTrial(trial);
        return this;
    }

    /**
     * <p>
     * The properties of a trial component.
     * </p>
     * 
     * @param trialComponent
     *        The properties of a trial component.
     */

    public void setTrialComponent(TrialComponent trialComponent) {
        this.trialComponent = trialComponent;
    }

    /**
     * <p>
     * The properties of a trial component.
     * </p>
     * 
     * @return The properties of a trial component.
     */

    public TrialComponent getTrialComponent() {
        return this.trialComponent;
    }

    /**
     * <p>
     * The properties of a trial component.
     * </p>
     * 
     * @param trialComponent
     *        The properties of a trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withTrialComponent(TrialComponent trialComponent) {
        setTrialComponent(trialComponent);
        return this;
    }

    /**
     * @param endpoint
     */

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * @return
     */

    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * @param endpoint
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withEndpoint(Endpoint endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * @param modelPackage
     */

    public void setModelPackage(ModelPackage modelPackage) {
        this.modelPackage = modelPackage;
    }

    /**
     * @return
     */

    public ModelPackage getModelPackage() {
        return this.modelPackage;
    }

    /**
     * @param modelPackage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withModelPackage(ModelPackage modelPackage) {
        setModelPackage(modelPackage);
        return this;
    }

    /**
     * @param modelPackageGroup
     */

    public void setModelPackageGroup(ModelPackageGroup modelPackageGroup) {
        this.modelPackageGroup = modelPackageGroup;
    }

    /**
     * @return
     */

    public ModelPackageGroup getModelPackageGroup() {
        return this.modelPackageGroup;
    }

    /**
     * @param modelPackageGroup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withModelPackageGroup(ModelPackageGroup modelPackageGroup) {
        setModelPackageGroup(modelPackageGroup);
        return this;
    }

    /**
     * @param pipeline
     */

    public void setPipeline(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    /**
     * @return
     */

    public Pipeline getPipeline() {
        return this.pipeline;
    }

    /**
     * @param pipeline
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withPipeline(Pipeline pipeline) {
        setPipeline(pipeline);
        return this;
    }

    /**
     * @param pipelineExecution
     */

    public void setPipelineExecution(PipelineExecution pipelineExecution) {
        this.pipelineExecution = pipelineExecution;
    }

    /**
     * @return
     */

    public PipelineExecution getPipelineExecution() {
        return this.pipelineExecution;
    }

    /**
     * @param pipelineExecution
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withPipelineExecution(PipelineExecution pipelineExecution) {
        setPipelineExecution(pipelineExecution);
        return this;
    }

    /**
     * @param featureGroup
     */

    public void setFeatureGroup(FeatureGroup featureGroup) {
        this.featureGroup = featureGroup;
    }

    /**
     * @return
     */

    public FeatureGroup getFeatureGroup() {
        return this.featureGroup;
    }

    /**
     * @param featureGroup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withFeatureGroup(FeatureGroup featureGroup) {
        setFeatureGroup(featureGroup);
        return this;
    }

    /**
     * <p>
     * The properties of a project.
     * </p>
     * 
     * @param project
     *        The properties of a project.
     */

    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * <p>
     * The properties of a project.
     * </p>
     * 
     * @return The properties of a project.
     */

    public Project getProject() {
        return this.project;
    }

    /**
     * <p>
     * The properties of a project.
     * </p>
     * 
     * @param project
     *        The properties of a project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withProject(Project project) {
        setProject(project);
        return this;
    }

    /**
     * <p>
     * The feature metadata used to search through the features.
     * </p>
     * 
     * @param featureMetadata
     *        The feature metadata used to search through the features.
     */

    public void setFeatureMetadata(FeatureMetadata featureMetadata) {
        this.featureMetadata = featureMetadata;
    }

    /**
     * <p>
     * The feature metadata used to search through the features.
     * </p>
     * 
     * @return The feature metadata used to search through the features.
     */

    public FeatureMetadata getFeatureMetadata() {
        return this.featureMetadata;
    }

    /**
     * <p>
     * The feature metadata used to search through the features.
     * </p>
     * 
     * @param featureMetadata
     *        The feature metadata used to search through the features.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withFeatureMetadata(FeatureMetadata featureMetadata) {
        setFeatureMetadata(featureMetadata);
        return this;
    }

    /**
     * <p>
     * The properties of a hyperparameter tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJob
     *        The properties of a hyperparameter tuning job.
     */

    public void setHyperParameterTuningJob(HyperParameterTuningJobSearchEntity hyperParameterTuningJob) {
        this.hyperParameterTuningJob = hyperParameterTuningJob;
    }

    /**
     * <p>
     * The properties of a hyperparameter tuning job.
     * </p>
     * 
     * @return The properties of a hyperparameter tuning job.
     */

    public HyperParameterTuningJobSearchEntity getHyperParameterTuningJob() {
        return this.hyperParameterTuningJob;
    }

    /**
     * <p>
     * The properties of a hyperparameter tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJob
     *        The properties of a hyperparameter tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withHyperParameterTuningJob(HyperParameterTuningJobSearchEntity hyperParameterTuningJob) {
        setHyperParameterTuningJob(hyperParameterTuningJob);
        return this;
    }

    /**
     * @param model
     */

    public void setModel(ModelDashboardModel model) {
        this.model = model;
    }

    /**
     * @return
     */

    public ModelDashboardModel getModel() {
        return this.model;
    }

    /**
     * @param model
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withModel(ModelDashboardModel model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * An Amazon SageMaker Model Card that documents details about a machine learning model.
     * </p>
     * 
     * @param modelCard
     *        An Amazon SageMaker Model Card that documents details about a machine learning model.
     */

    public void setModelCard(ModelCard modelCard) {
        this.modelCard = modelCard;
    }

    /**
     * <p>
     * An Amazon SageMaker Model Card that documents details about a machine learning model.
     * </p>
     * 
     * @return An Amazon SageMaker Model Card that documents details about a machine learning model.
     */

    public ModelCard getModelCard() {
        return this.modelCard;
    }

    /**
     * <p>
     * An Amazon SageMaker Model Card that documents details about a machine learning model.
     * </p>
     * 
     * @param modelCard
     *        An Amazon SageMaker Model Card that documents details about a machine learning model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRecord withModelCard(ModelCard modelCard) {
        setModelCard(modelCard);
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
        if (getExperiment() != null)
            sb.append("Experiment: ").append(getExperiment()).append(",");
        if (getTrial() != null)
            sb.append("Trial: ").append(getTrial()).append(",");
        if (getTrialComponent() != null)
            sb.append("TrialComponent: ").append(getTrialComponent()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getModelPackage() != null)
            sb.append("ModelPackage: ").append(getModelPackage()).append(",");
        if (getModelPackageGroup() != null)
            sb.append("ModelPackageGroup: ").append(getModelPackageGroup()).append(",");
        if (getPipeline() != null)
            sb.append("Pipeline: ").append(getPipeline()).append(",");
        if (getPipelineExecution() != null)
            sb.append("PipelineExecution: ").append(getPipelineExecution()).append(",");
        if (getFeatureGroup() != null)
            sb.append("FeatureGroup: ").append(getFeatureGroup()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getFeatureMetadata() != null)
            sb.append("FeatureMetadata: ").append(getFeatureMetadata()).append(",");
        if (getHyperParameterTuningJob() != null)
            sb.append("HyperParameterTuningJob: ").append(getHyperParameterTuningJob()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getModelCard() != null)
            sb.append("ModelCard: ").append(getModelCard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchRecord == false)
            return false;
        SearchRecord other = (SearchRecord) obj;
        if (other.getTrainingJob() == null ^ this.getTrainingJob() == null)
            return false;
        if (other.getTrainingJob() != null && other.getTrainingJob().equals(this.getTrainingJob()) == false)
            return false;
        if (other.getExperiment() == null ^ this.getExperiment() == null)
            return false;
        if (other.getExperiment() != null && other.getExperiment().equals(this.getExperiment()) == false)
            return false;
        if (other.getTrial() == null ^ this.getTrial() == null)
            return false;
        if (other.getTrial() != null && other.getTrial().equals(this.getTrial()) == false)
            return false;
        if (other.getTrialComponent() == null ^ this.getTrialComponent() == null)
            return false;
        if (other.getTrialComponent() != null && other.getTrialComponent().equals(this.getTrialComponent()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getModelPackage() == null ^ this.getModelPackage() == null)
            return false;
        if (other.getModelPackage() != null && other.getModelPackage().equals(this.getModelPackage()) == false)
            return false;
        if (other.getModelPackageGroup() == null ^ this.getModelPackageGroup() == null)
            return false;
        if (other.getModelPackageGroup() != null && other.getModelPackageGroup().equals(this.getModelPackageGroup()) == false)
            return false;
        if (other.getPipeline() == null ^ this.getPipeline() == null)
            return false;
        if (other.getPipeline() != null && other.getPipeline().equals(this.getPipeline()) == false)
            return false;
        if (other.getPipelineExecution() == null ^ this.getPipelineExecution() == null)
            return false;
        if (other.getPipelineExecution() != null && other.getPipelineExecution().equals(this.getPipelineExecution()) == false)
            return false;
        if (other.getFeatureGroup() == null ^ this.getFeatureGroup() == null)
            return false;
        if (other.getFeatureGroup() != null && other.getFeatureGroup().equals(this.getFeatureGroup()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        if (other.getFeatureMetadata() == null ^ this.getFeatureMetadata() == null)
            return false;
        if (other.getFeatureMetadata() != null && other.getFeatureMetadata().equals(this.getFeatureMetadata()) == false)
            return false;
        if (other.getHyperParameterTuningJob() == null ^ this.getHyperParameterTuningJob() == null)
            return false;
        if (other.getHyperParameterTuningJob() != null && other.getHyperParameterTuningJob().equals(this.getHyperParameterTuningJob()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getModelCard() == null ^ this.getModelCard() == null)
            return false;
        if (other.getModelCard() != null && other.getModelCard().equals(this.getModelCard()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingJob() == null) ? 0 : getTrainingJob().hashCode());
        hashCode = prime * hashCode + ((getExperiment() == null) ? 0 : getExperiment().hashCode());
        hashCode = prime * hashCode + ((getTrial() == null) ? 0 : getTrial().hashCode());
        hashCode = prime * hashCode + ((getTrialComponent() == null) ? 0 : getTrialComponent().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getModelPackage() == null) ? 0 : getModelPackage().hashCode());
        hashCode = prime * hashCode + ((getModelPackageGroup() == null) ? 0 : getModelPackageGroup().hashCode());
        hashCode = prime * hashCode + ((getPipeline() == null) ? 0 : getPipeline().hashCode());
        hashCode = prime * hashCode + ((getPipelineExecution() == null) ? 0 : getPipelineExecution().hashCode());
        hashCode = prime * hashCode + ((getFeatureGroup() == null) ? 0 : getFeatureGroup().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getFeatureMetadata() == null) ? 0 : getFeatureMetadata().hashCode());
        hashCode = prime * hashCode + ((getHyperParameterTuningJob() == null) ? 0 : getHyperParameterTuningJob().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getModelCard() == null) ? 0 : getModelCard().hashCode());
        return hashCode;
    }

    @Override
    public SearchRecord clone() {
        try {
            return (SearchRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SearchRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
