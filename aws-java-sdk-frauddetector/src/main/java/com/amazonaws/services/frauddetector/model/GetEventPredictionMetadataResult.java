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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEventPredictionMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEventPredictionMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The event ID.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The event type associated with the detector specified for this prediction.
     * </p>
     */
    private String eventTypeName;
    /**
     * <p>
     * The entity ID.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The entity type.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * The timestamp for when the prediction was generated for the associated event ID.
     * </p>
     */
    private String eventTimestamp;
    /**
     * <p>
     * The detector ID.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The detector version ID.
     * </p>
     */
    private String detectorVersionId;
    /**
     * <p>
     * The status of the detector version.
     * </p>
     */
    private String detectorVersionStatus;
    /**
     * <p>
     * A list of event variables that influenced the prediction scores.
     * </p>
     */
    private java.util.List<EventVariableSummary> eventVariables;
    /**
     * <p>
     * List of rules associated with the detector version that were used for evaluating variable values.
     * </p>
     */
    private java.util.List<EvaluatedRule> rules;
    /**
     * <p>
     * The execution mode of the rule used for evaluating variable values.
     * </p>
     */
    private String ruleExecutionMode;
    /**
     * <p>
     * The outcomes of the matched rule, based on the rule execution mode.
     * </p>
     */
    private java.util.List<String> outcomes;
    /**
     * <p>
     * Model versions that were evaluated for generating predictions.
     * </p>
     */
    private java.util.List<EvaluatedModelVersion> evaluatedModelVersions;
    /**
     * <p>
     * External (Amazon SageMaker) models that were evaluated for generating predictions.
     * </p>
     */
    private java.util.List<EvaluatedExternalModel> evaluatedExternalModels;
    /**
     * <p>
     * The timestamp that defines when the prediction was generated.
     * </p>
     */
    private String predictionTimestamp;

    /**
     * <p>
     * The event ID.
     * </p>
     * 
     * @param eventId
     *        The event ID.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The event ID.
     * </p>
     * 
     * @return The event ID.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The event ID.
     * </p>
     * 
     * @param eventId
     *        The event ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The event type associated with the detector specified for this prediction.
     * </p>
     * 
     * @param eventTypeName
     *        The event type associated with the detector specified for this prediction.
     */

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * <p>
     * The event type associated with the detector specified for this prediction.
     * </p>
     * 
     * @return The event type associated with the detector specified for this prediction.
     */

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * <p>
     * The event type associated with the detector specified for this prediction.
     * </p>
     * 
     * @param eventTypeName
     *        The event type associated with the detector specified for this prediction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
        return this;
    }

    /**
     * <p>
     * The entity ID.
     * </p>
     * 
     * @param entityId
     *        The entity ID.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The entity ID.
     * </p>
     * 
     * @return The entity ID.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The entity ID.
     * </p>
     * 
     * @param entityId
     *        The entity ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The entity type.
     * </p>
     * 
     * @param entityType
     *        The entity type.
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The entity type.
     * </p>
     * 
     * @return The entity type.
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The entity type.
     * </p>
     * 
     * @param entityType
     *        The entity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the prediction was generated for the associated event ID.
     * </p>
     * 
     * @param eventTimestamp
     *        The timestamp for when the prediction was generated for the associated event ID.
     */

    public void setEventTimestamp(String eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    /**
     * <p>
     * The timestamp for when the prediction was generated for the associated event ID.
     * </p>
     * 
     * @return The timestamp for when the prediction was generated for the associated event ID.
     */

    public String getEventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * <p>
     * The timestamp for when the prediction was generated for the associated event ID.
     * </p>
     * 
     * @param eventTimestamp
     *        The timestamp for when the prediction was generated for the associated event ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withEventTimestamp(String eventTimestamp) {
        setEventTimestamp(eventTimestamp);
        return this;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @param detectorId
     *        The detector ID.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @return The detector ID.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @param detectorId
     *        The detector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * 
     * @param detectorVersionId
     *        The detector version ID.
     */

    public void setDetectorVersionId(String detectorVersionId) {
        this.detectorVersionId = detectorVersionId;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * 
     * @return The detector version ID.
     */

    public String getDetectorVersionId() {
        return this.detectorVersionId;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * 
     * @param detectorVersionId
     *        The detector version ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withDetectorVersionId(String detectorVersionId) {
        setDetectorVersionId(detectorVersionId);
        return this;
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * 
     * @param detectorVersionStatus
     *        The status of the detector version.
     */

    public void setDetectorVersionStatus(String detectorVersionStatus) {
        this.detectorVersionStatus = detectorVersionStatus;
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * 
     * @return The status of the detector version.
     */

    public String getDetectorVersionStatus() {
        return this.detectorVersionStatus;
    }

    /**
     * <p>
     * The status of the detector version.
     * </p>
     * 
     * @param detectorVersionStatus
     *        The status of the detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withDetectorVersionStatus(String detectorVersionStatus) {
        setDetectorVersionStatus(detectorVersionStatus);
        return this;
    }

    /**
     * <p>
     * A list of event variables that influenced the prediction scores.
     * </p>
     * 
     * @return A list of event variables that influenced the prediction scores.
     */

    public java.util.List<EventVariableSummary> getEventVariables() {
        return eventVariables;
    }

    /**
     * <p>
     * A list of event variables that influenced the prediction scores.
     * </p>
     * 
     * @param eventVariables
     *        A list of event variables that influenced the prediction scores.
     */

    public void setEventVariables(java.util.Collection<EventVariableSummary> eventVariables) {
        if (eventVariables == null) {
            this.eventVariables = null;
            return;
        }

        this.eventVariables = new java.util.ArrayList<EventVariableSummary>(eventVariables);
    }

    /**
     * <p>
     * A list of event variables that influenced the prediction scores.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventVariables(java.util.Collection)} or {@link #withEventVariables(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param eventVariables
     *        A list of event variables that influenced the prediction scores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withEventVariables(EventVariableSummary... eventVariables) {
        if (this.eventVariables == null) {
            setEventVariables(new java.util.ArrayList<EventVariableSummary>(eventVariables.length));
        }
        for (EventVariableSummary ele : eventVariables) {
            this.eventVariables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of event variables that influenced the prediction scores.
     * </p>
     * 
     * @param eventVariables
     *        A list of event variables that influenced the prediction scores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withEventVariables(java.util.Collection<EventVariableSummary> eventVariables) {
        setEventVariables(eventVariables);
        return this;
    }

    /**
     * <p>
     * List of rules associated with the detector version that were used for evaluating variable values.
     * </p>
     * 
     * @return List of rules associated with the detector version that were used for evaluating variable values.
     */

    public java.util.List<EvaluatedRule> getRules() {
        return rules;
    }

    /**
     * <p>
     * List of rules associated with the detector version that were used for evaluating variable values.
     * </p>
     * 
     * @param rules
     *        List of rules associated with the detector version that were used for evaluating variable values.
     */

    public void setRules(java.util.Collection<EvaluatedRule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<EvaluatedRule>(rules);
    }

    /**
     * <p>
     * List of rules associated with the detector version that were used for evaluating variable values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        List of rules associated with the detector version that were used for evaluating variable values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withRules(EvaluatedRule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<EvaluatedRule>(rules.length));
        }
        for (EvaluatedRule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of rules associated with the detector version that were used for evaluating variable values.
     * </p>
     * 
     * @param rules
     *        List of rules associated with the detector version that were used for evaluating variable values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withRules(java.util.Collection<EvaluatedRule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * The execution mode of the rule used for evaluating variable values.
     * </p>
     * 
     * @param ruleExecutionMode
     *        The execution mode of the rule used for evaluating variable values.
     * @see RuleExecutionMode
     */

    public void setRuleExecutionMode(String ruleExecutionMode) {
        this.ruleExecutionMode = ruleExecutionMode;
    }

    /**
     * <p>
     * The execution mode of the rule used for evaluating variable values.
     * </p>
     * 
     * @return The execution mode of the rule used for evaluating variable values.
     * @see RuleExecutionMode
     */

    public String getRuleExecutionMode() {
        return this.ruleExecutionMode;
    }

    /**
     * <p>
     * The execution mode of the rule used for evaluating variable values.
     * </p>
     * 
     * @param ruleExecutionMode
     *        The execution mode of the rule used for evaluating variable values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleExecutionMode
     */

    public GetEventPredictionMetadataResult withRuleExecutionMode(String ruleExecutionMode) {
        setRuleExecutionMode(ruleExecutionMode);
        return this;
    }

    /**
     * <p>
     * The execution mode of the rule used for evaluating variable values.
     * </p>
     * 
     * @param ruleExecutionMode
     *        The execution mode of the rule used for evaluating variable values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleExecutionMode
     */

    public GetEventPredictionMetadataResult withRuleExecutionMode(RuleExecutionMode ruleExecutionMode) {
        this.ruleExecutionMode = ruleExecutionMode.toString();
        return this;
    }

    /**
     * <p>
     * The outcomes of the matched rule, based on the rule execution mode.
     * </p>
     * 
     * @return The outcomes of the matched rule, based on the rule execution mode.
     */

    public java.util.List<String> getOutcomes() {
        return outcomes;
    }

    /**
     * <p>
     * The outcomes of the matched rule, based on the rule execution mode.
     * </p>
     * 
     * @param outcomes
     *        The outcomes of the matched rule, based on the rule execution mode.
     */

    public void setOutcomes(java.util.Collection<String> outcomes) {
        if (outcomes == null) {
            this.outcomes = null;
            return;
        }

        this.outcomes = new java.util.ArrayList<String>(outcomes);
    }

    /**
     * <p>
     * The outcomes of the matched rule, based on the rule execution mode.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutcomes(java.util.Collection)} or {@link #withOutcomes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outcomes
     *        The outcomes of the matched rule, based on the rule execution mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withOutcomes(String... outcomes) {
        if (this.outcomes == null) {
            setOutcomes(new java.util.ArrayList<String>(outcomes.length));
        }
        for (String ele : outcomes) {
            this.outcomes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The outcomes of the matched rule, based on the rule execution mode.
     * </p>
     * 
     * @param outcomes
     *        The outcomes of the matched rule, based on the rule execution mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withOutcomes(java.util.Collection<String> outcomes) {
        setOutcomes(outcomes);
        return this;
    }

    /**
     * <p>
     * Model versions that were evaluated for generating predictions.
     * </p>
     * 
     * @return Model versions that were evaluated for generating predictions.
     */

    public java.util.List<EvaluatedModelVersion> getEvaluatedModelVersions() {
        return evaluatedModelVersions;
    }

    /**
     * <p>
     * Model versions that were evaluated for generating predictions.
     * </p>
     * 
     * @param evaluatedModelVersions
     *        Model versions that were evaluated for generating predictions.
     */

    public void setEvaluatedModelVersions(java.util.Collection<EvaluatedModelVersion> evaluatedModelVersions) {
        if (evaluatedModelVersions == null) {
            this.evaluatedModelVersions = null;
            return;
        }

        this.evaluatedModelVersions = new java.util.ArrayList<EvaluatedModelVersion>(evaluatedModelVersions);
    }

    /**
     * <p>
     * Model versions that were evaluated for generating predictions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvaluatedModelVersions(java.util.Collection)} or
     * {@link #withEvaluatedModelVersions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param evaluatedModelVersions
     *        Model versions that were evaluated for generating predictions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withEvaluatedModelVersions(EvaluatedModelVersion... evaluatedModelVersions) {
        if (this.evaluatedModelVersions == null) {
            setEvaluatedModelVersions(new java.util.ArrayList<EvaluatedModelVersion>(evaluatedModelVersions.length));
        }
        for (EvaluatedModelVersion ele : evaluatedModelVersions) {
            this.evaluatedModelVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Model versions that were evaluated for generating predictions.
     * </p>
     * 
     * @param evaluatedModelVersions
     *        Model versions that were evaluated for generating predictions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withEvaluatedModelVersions(java.util.Collection<EvaluatedModelVersion> evaluatedModelVersions) {
        setEvaluatedModelVersions(evaluatedModelVersions);
        return this;
    }

    /**
     * <p>
     * External (Amazon SageMaker) models that were evaluated for generating predictions.
     * </p>
     * 
     * @return External (Amazon SageMaker) models that were evaluated for generating predictions.
     */

    public java.util.List<EvaluatedExternalModel> getEvaluatedExternalModels() {
        return evaluatedExternalModels;
    }

    /**
     * <p>
     * External (Amazon SageMaker) models that were evaluated for generating predictions.
     * </p>
     * 
     * @param evaluatedExternalModels
     *        External (Amazon SageMaker) models that were evaluated for generating predictions.
     */

    public void setEvaluatedExternalModels(java.util.Collection<EvaluatedExternalModel> evaluatedExternalModels) {
        if (evaluatedExternalModels == null) {
            this.evaluatedExternalModels = null;
            return;
        }

        this.evaluatedExternalModels = new java.util.ArrayList<EvaluatedExternalModel>(evaluatedExternalModels);
    }

    /**
     * <p>
     * External (Amazon SageMaker) models that were evaluated for generating predictions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvaluatedExternalModels(java.util.Collection)} or
     * {@link #withEvaluatedExternalModels(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param evaluatedExternalModels
     *        External (Amazon SageMaker) models that were evaluated for generating predictions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withEvaluatedExternalModels(EvaluatedExternalModel... evaluatedExternalModels) {
        if (this.evaluatedExternalModels == null) {
            setEvaluatedExternalModels(new java.util.ArrayList<EvaluatedExternalModel>(evaluatedExternalModels.length));
        }
        for (EvaluatedExternalModel ele : evaluatedExternalModels) {
            this.evaluatedExternalModels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * External (Amazon SageMaker) models that were evaluated for generating predictions.
     * </p>
     * 
     * @param evaluatedExternalModels
     *        External (Amazon SageMaker) models that were evaluated for generating predictions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withEvaluatedExternalModels(java.util.Collection<EvaluatedExternalModel> evaluatedExternalModels) {
        setEvaluatedExternalModels(evaluatedExternalModels);
        return this;
    }

    /**
     * <p>
     * The timestamp that defines when the prediction was generated.
     * </p>
     * 
     * @param predictionTimestamp
     *        The timestamp that defines when the prediction was generated.
     */

    public void setPredictionTimestamp(String predictionTimestamp) {
        this.predictionTimestamp = predictionTimestamp;
    }

    /**
     * <p>
     * The timestamp that defines when the prediction was generated.
     * </p>
     * 
     * @return The timestamp that defines when the prediction was generated.
     */

    public String getPredictionTimestamp() {
        return this.predictionTimestamp;
    }

    /**
     * <p>
     * The timestamp that defines when the prediction was generated.
     * </p>
     * 
     * @param predictionTimestamp
     *        The timestamp that defines when the prediction was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataResult withPredictionTimestamp(String predictionTimestamp) {
        setPredictionTimestamp(predictionTimestamp);
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
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getEventTypeName() != null)
            sb.append("EventTypeName: ").append(getEventTypeName()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
        if (getEventTimestamp() != null)
            sb.append("EventTimestamp: ").append(getEventTimestamp()).append(",");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getDetectorVersionId() != null)
            sb.append("DetectorVersionId: ").append(getDetectorVersionId()).append(",");
        if (getDetectorVersionStatus() != null)
            sb.append("DetectorVersionStatus: ").append(getDetectorVersionStatus()).append(",");
        if (getEventVariables() != null)
            sb.append("EventVariables: ").append(getEventVariables()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getRuleExecutionMode() != null)
            sb.append("RuleExecutionMode: ").append(getRuleExecutionMode()).append(",");
        if (getOutcomes() != null)
            sb.append("Outcomes: ").append(getOutcomes()).append(",");
        if (getEvaluatedModelVersions() != null)
            sb.append("EvaluatedModelVersions: ").append(getEvaluatedModelVersions()).append(",");
        if (getEvaluatedExternalModels() != null)
            sb.append("EvaluatedExternalModels: ").append(getEvaluatedExternalModels()).append(",");
        if (getPredictionTimestamp() != null)
            sb.append("PredictionTimestamp: ").append(getPredictionTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEventPredictionMetadataResult == false)
            return false;
        GetEventPredictionMetadataResult other = (GetEventPredictionMetadataResult) obj;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventTypeName() == null ^ this.getEventTypeName() == null)
            return false;
        if (other.getEventTypeName() != null && other.getEventTypeName().equals(this.getEventTypeName()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getEventTimestamp() == null ^ this.getEventTimestamp() == null)
            return false;
        if (other.getEventTimestamp() != null && other.getEventTimestamp().equals(this.getEventTimestamp()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDetectorVersionId() == null ^ this.getDetectorVersionId() == null)
            return false;
        if (other.getDetectorVersionId() != null && other.getDetectorVersionId().equals(this.getDetectorVersionId()) == false)
            return false;
        if (other.getDetectorVersionStatus() == null ^ this.getDetectorVersionStatus() == null)
            return false;
        if (other.getDetectorVersionStatus() != null && other.getDetectorVersionStatus().equals(this.getDetectorVersionStatus()) == false)
            return false;
        if (other.getEventVariables() == null ^ this.getEventVariables() == null)
            return false;
        if (other.getEventVariables() != null && other.getEventVariables().equals(this.getEventVariables()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getRuleExecutionMode() == null ^ this.getRuleExecutionMode() == null)
            return false;
        if (other.getRuleExecutionMode() != null && other.getRuleExecutionMode().equals(this.getRuleExecutionMode()) == false)
            return false;
        if (other.getOutcomes() == null ^ this.getOutcomes() == null)
            return false;
        if (other.getOutcomes() != null && other.getOutcomes().equals(this.getOutcomes()) == false)
            return false;
        if (other.getEvaluatedModelVersions() == null ^ this.getEvaluatedModelVersions() == null)
            return false;
        if (other.getEvaluatedModelVersions() != null && other.getEvaluatedModelVersions().equals(this.getEvaluatedModelVersions()) == false)
            return false;
        if (other.getEvaluatedExternalModels() == null ^ this.getEvaluatedExternalModels() == null)
            return false;
        if (other.getEvaluatedExternalModels() != null && other.getEvaluatedExternalModels().equals(this.getEvaluatedExternalModels()) == false)
            return false;
        if (other.getPredictionTimestamp() == null ^ this.getPredictionTimestamp() == null)
            return false;
        if (other.getPredictionTimestamp() != null && other.getPredictionTimestamp().equals(this.getPredictionTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventTypeName() == null) ? 0 : getEventTypeName().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getEventTimestamp() == null) ? 0 : getEventTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getDetectorVersionId() == null) ? 0 : getDetectorVersionId().hashCode());
        hashCode = prime * hashCode + ((getDetectorVersionStatus() == null) ? 0 : getDetectorVersionStatus().hashCode());
        hashCode = prime * hashCode + ((getEventVariables() == null) ? 0 : getEventVariables().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getRuleExecutionMode() == null) ? 0 : getRuleExecutionMode().hashCode());
        hashCode = prime * hashCode + ((getOutcomes() == null) ? 0 : getOutcomes().hashCode());
        hashCode = prime * hashCode + ((getEvaluatedModelVersions() == null) ? 0 : getEvaluatedModelVersions().hashCode());
        hashCode = prime * hashCode + ((getEvaluatedExternalModels() == null) ? 0 : getEvaluatedExternalModels().hashCode());
        hashCode = prime * hashCode + ((getPredictionTimestamp() == null) ? 0 : getPredictionTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public GetEventPredictionMetadataResult clone() {
        try {
            return (GetEventPredictionMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
