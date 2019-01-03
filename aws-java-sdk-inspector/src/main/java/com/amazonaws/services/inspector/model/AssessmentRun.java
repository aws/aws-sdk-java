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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A snapshot of an Amazon Inspector assessment run that contains the findings of the assessment run .
 * </p>
 * <p>
 * Used as the response element in the <a>DescribeAssessmentRuns</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/AssessmentRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentRun implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the assessment run.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The auto-generated name for the assessment run.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the assessment template that is associated with the assessment run.
     * </p>
     */
    private String assessmentTemplateArn;
    /**
     * <p>
     * The state of the assessment run.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The duration of the assessment run.
     * </p>
     */
    private Integer durationInSeconds;
    /**
     * <p>
     * The rules packages selected for the assessment run.
     * </p>
     */
    private java.util.List<String> rulesPackageArns;
    /**
     * <p>
     * The user-defined attributes that are assigned to every generated finding.
     * </p>
     */
    private java.util.List<Attribute> userAttributesForFindings;
    /**
     * <p>
     * The time when <a>StartAssessmentRun</a> was called.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time when <a>StartAssessmentRun</a> was called.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The assessment run completion time that corresponds to the rules packages evaluation completion time or failure.
     * </p>
     */
    private java.util.Date completedAt;
    /**
     * <p>
     * The last time when the assessment run's state changed.
     * </p>
     */
    private java.util.Date stateChangedAt;
    /**
     * <p>
     * A Boolean value (true or false) that specifies whether the process of collecting data from the agents is
     * completed.
     * </p>
     */
    private Boolean dataCollected;
    /**
     * <p>
     * A list of the assessment run state changes.
     * </p>
     */
    private java.util.List<AssessmentRunStateChange> stateChanges;
    /**
     * <p>
     * A list of notifications for the event subscriptions. A notification about a particular generated finding is added
     * to this list only once.
     * </p>
     */
    private java.util.List<AssessmentRunNotification> notifications;
    /**
     * <p>
     * Provides a total count of generated findings per severity.
     * </p>
     */
    private java.util.Map<String, Integer> findingCounts;

    /**
     * <p>
     * The ARN of the assessment run.
     * </p>
     * 
     * @param arn
     *        The ARN of the assessment run.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the assessment run.
     * </p>
     * 
     * @return The ARN of the assessment run.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the assessment run.
     * </p>
     * 
     * @param arn
     *        The ARN of the assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The auto-generated name for the assessment run.
     * </p>
     * 
     * @param name
     *        The auto-generated name for the assessment run.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The auto-generated name for the assessment run.
     * </p>
     * 
     * @return The auto-generated name for the assessment run.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The auto-generated name for the assessment run.
     * </p>
     * 
     * @param name
     *        The auto-generated name for the assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the assessment template that is associated with the assessment run.
     * </p>
     * 
     * @param assessmentTemplateArn
     *        The ARN of the assessment template that is associated with the assessment run.
     */

    public void setAssessmentTemplateArn(String assessmentTemplateArn) {
        this.assessmentTemplateArn = assessmentTemplateArn;
    }

    /**
     * <p>
     * The ARN of the assessment template that is associated with the assessment run.
     * </p>
     * 
     * @return The ARN of the assessment template that is associated with the assessment run.
     */

    public String getAssessmentTemplateArn() {
        return this.assessmentTemplateArn;
    }

    /**
     * <p>
     * The ARN of the assessment template that is associated with the assessment run.
     * </p>
     * 
     * @param assessmentTemplateArn
     *        The ARN of the assessment template that is associated with the assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withAssessmentTemplateArn(String assessmentTemplateArn) {
        setAssessmentTemplateArn(assessmentTemplateArn);
        return this;
    }

    /**
     * <p>
     * The state of the assessment run.
     * </p>
     * 
     * @param state
     *        The state of the assessment run.
     * @see AssessmentRunState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the assessment run.
     * </p>
     * 
     * @return The state of the assessment run.
     * @see AssessmentRunState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the assessment run.
     * </p>
     * 
     * @param state
     *        The state of the assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentRunState
     */

    public AssessmentRun withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the assessment run.
     * </p>
     * 
     * @param state
     *        The state of the assessment run.
     * @see AssessmentRunState
     */

    public void setState(AssessmentRunState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the assessment run.
     * </p>
     * 
     * @param state
     *        The state of the assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentRunState
     */

    public AssessmentRun withState(AssessmentRunState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The duration of the assessment run.
     * </p>
     * 
     * @param durationInSeconds
     *        The duration of the assessment run.
     */

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * The duration of the assessment run.
     * </p>
     * 
     * @return The duration of the assessment run.
     */

    public Integer getDurationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * <p>
     * The duration of the assessment run.
     * </p>
     * 
     * @param durationInSeconds
     *        The duration of the assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withDurationInSeconds(Integer durationInSeconds) {
        setDurationInSeconds(durationInSeconds);
        return this;
    }

    /**
     * <p>
     * The rules packages selected for the assessment run.
     * </p>
     * 
     * @return The rules packages selected for the assessment run.
     */

    public java.util.List<String> getRulesPackageArns() {
        return rulesPackageArns;
    }

    /**
     * <p>
     * The rules packages selected for the assessment run.
     * </p>
     * 
     * @param rulesPackageArns
     *        The rules packages selected for the assessment run.
     */

    public void setRulesPackageArns(java.util.Collection<String> rulesPackageArns) {
        if (rulesPackageArns == null) {
            this.rulesPackageArns = null;
            return;
        }

        this.rulesPackageArns = new java.util.ArrayList<String>(rulesPackageArns);
    }

    /**
     * <p>
     * The rules packages selected for the assessment run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRulesPackageArns(java.util.Collection)} or {@link #withRulesPackageArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param rulesPackageArns
     *        The rules packages selected for the assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withRulesPackageArns(String... rulesPackageArns) {
        if (this.rulesPackageArns == null) {
            setRulesPackageArns(new java.util.ArrayList<String>(rulesPackageArns.length));
        }
        for (String ele : rulesPackageArns) {
            this.rulesPackageArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules packages selected for the assessment run.
     * </p>
     * 
     * @param rulesPackageArns
     *        The rules packages selected for the assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withRulesPackageArns(java.util.Collection<String> rulesPackageArns) {
        setRulesPackageArns(rulesPackageArns);
        return this;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every generated finding.
     * </p>
     * 
     * @return The user-defined attributes that are assigned to every generated finding.
     */

    public java.util.List<Attribute> getUserAttributesForFindings() {
        return userAttributesForFindings;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every generated finding.
     * </p>
     * 
     * @param userAttributesForFindings
     *        The user-defined attributes that are assigned to every generated finding.
     */

    public void setUserAttributesForFindings(java.util.Collection<Attribute> userAttributesForFindings) {
        if (userAttributesForFindings == null) {
            this.userAttributesForFindings = null;
            return;
        }

        this.userAttributesForFindings = new java.util.ArrayList<Attribute>(userAttributesForFindings);
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every generated finding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAttributesForFindings(java.util.Collection)} or
     * {@link #withUserAttributesForFindings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param userAttributesForFindings
     *        The user-defined attributes that are assigned to every generated finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withUserAttributesForFindings(Attribute... userAttributesForFindings) {
        if (this.userAttributesForFindings == null) {
            setUserAttributesForFindings(new java.util.ArrayList<Attribute>(userAttributesForFindings.length));
        }
        for (Attribute ele : userAttributesForFindings) {
            this.userAttributesForFindings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user-defined attributes that are assigned to every generated finding.
     * </p>
     * 
     * @param userAttributesForFindings
     *        The user-defined attributes that are assigned to every generated finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withUserAttributesForFindings(java.util.Collection<Attribute> userAttributesForFindings) {
        setUserAttributesForFindings(userAttributesForFindings);
        return this;
    }

    /**
     * <p>
     * The time when <a>StartAssessmentRun</a> was called.
     * </p>
     * 
     * @param createdAt
     *        The time when <a>StartAssessmentRun</a> was called.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when <a>StartAssessmentRun</a> was called.
     * </p>
     * 
     * @return The time when <a>StartAssessmentRun</a> was called.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when <a>StartAssessmentRun</a> was called.
     * </p>
     * 
     * @param createdAt
     *        The time when <a>StartAssessmentRun</a> was called.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time when <a>StartAssessmentRun</a> was called.
     * </p>
     * 
     * @param startedAt
     *        The time when <a>StartAssessmentRun</a> was called.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The time when <a>StartAssessmentRun</a> was called.
     * </p>
     * 
     * @return The time when <a>StartAssessmentRun</a> was called.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The time when <a>StartAssessmentRun</a> was called.
     * </p>
     * 
     * @param startedAt
     *        The time when <a>StartAssessmentRun</a> was called.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The assessment run completion time that corresponds to the rules packages evaluation completion time or failure.
     * </p>
     * 
     * @param completedAt
     *        The assessment run completion time that corresponds to the rules packages evaluation completion time or
     *        failure.
     */

    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * The assessment run completion time that corresponds to the rules packages evaluation completion time or failure.
     * </p>
     * 
     * @return The assessment run completion time that corresponds to the rules packages evaluation completion time or
     *         failure.
     */

    public java.util.Date getCompletedAt() {
        return this.completedAt;
    }

    /**
     * <p>
     * The assessment run completion time that corresponds to the rules packages evaluation completion time or failure.
     * </p>
     * 
     * @param completedAt
     *        The assessment run completion time that corresponds to the rules packages evaluation completion time or
     *        failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withCompletedAt(java.util.Date completedAt) {
        setCompletedAt(completedAt);
        return this;
    }

    /**
     * <p>
     * The last time when the assessment run's state changed.
     * </p>
     * 
     * @param stateChangedAt
     *        The last time when the assessment run's state changed.
     */

    public void setStateChangedAt(java.util.Date stateChangedAt) {
        this.stateChangedAt = stateChangedAt;
    }

    /**
     * <p>
     * The last time when the assessment run's state changed.
     * </p>
     * 
     * @return The last time when the assessment run's state changed.
     */

    public java.util.Date getStateChangedAt() {
        return this.stateChangedAt;
    }

    /**
     * <p>
     * The last time when the assessment run's state changed.
     * </p>
     * 
     * @param stateChangedAt
     *        The last time when the assessment run's state changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withStateChangedAt(java.util.Date stateChangedAt) {
        setStateChangedAt(stateChangedAt);
        return this;
    }

    /**
     * <p>
     * A Boolean value (true or false) that specifies whether the process of collecting data from the agents is
     * completed.
     * </p>
     * 
     * @param dataCollected
     *        A Boolean value (true or false) that specifies whether the process of collecting data from the agents is
     *        completed.
     */

    public void setDataCollected(Boolean dataCollected) {
        this.dataCollected = dataCollected;
    }

    /**
     * <p>
     * A Boolean value (true or false) that specifies whether the process of collecting data from the agents is
     * completed.
     * </p>
     * 
     * @return A Boolean value (true or false) that specifies whether the process of collecting data from the agents is
     *         completed.
     */

    public Boolean getDataCollected() {
        return this.dataCollected;
    }

    /**
     * <p>
     * A Boolean value (true or false) that specifies whether the process of collecting data from the agents is
     * completed.
     * </p>
     * 
     * @param dataCollected
     *        A Boolean value (true or false) that specifies whether the process of collecting data from the agents is
     *        completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withDataCollected(Boolean dataCollected) {
        setDataCollected(dataCollected);
        return this;
    }

    /**
     * <p>
     * A Boolean value (true or false) that specifies whether the process of collecting data from the agents is
     * completed.
     * </p>
     * 
     * @return A Boolean value (true or false) that specifies whether the process of collecting data from the agents is
     *         completed.
     */

    public Boolean isDataCollected() {
        return this.dataCollected;
    }

    /**
     * <p>
     * A list of the assessment run state changes.
     * </p>
     * 
     * @return A list of the assessment run state changes.
     */

    public java.util.List<AssessmentRunStateChange> getStateChanges() {
        return stateChanges;
    }

    /**
     * <p>
     * A list of the assessment run state changes.
     * </p>
     * 
     * @param stateChanges
     *        A list of the assessment run state changes.
     */

    public void setStateChanges(java.util.Collection<AssessmentRunStateChange> stateChanges) {
        if (stateChanges == null) {
            this.stateChanges = null;
            return;
        }

        this.stateChanges = new java.util.ArrayList<AssessmentRunStateChange>(stateChanges);
    }

    /**
     * <p>
     * A list of the assessment run state changes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStateChanges(java.util.Collection)} or {@link #withStateChanges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stateChanges
     *        A list of the assessment run state changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withStateChanges(AssessmentRunStateChange... stateChanges) {
        if (this.stateChanges == null) {
            setStateChanges(new java.util.ArrayList<AssessmentRunStateChange>(stateChanges.length));
        }
        for (AssessmentRunStateChange ele : stateChanges) {
            this.stateChanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the assessment run state changes.
     * </p>
     * 
     * @param stateChanges
     *        A list of the assessment run state changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withStateChanges(java.util.Collection<AssessmentRunStateChange> stateChanges) {
        setStateChanges(stateChanges);
        return this;
    }

    /**
     * <p>
     * A list of notifications for the event subscriptions. A notification about a particular generated finding is added
     * to this list only once.
     * </p>
     * 
     * @return A list of notifications for the event subscriptions. A notification about a particular generated finding
     *         is added to this list only once.
     */

    public java.util.List<AssessmentRunNotification> getNotifications() {
        return notifications;
    }

    /**
     * <p>
     * A list of notifications for the event subscriptions. A notification about a particular generated finding is added
     * to this list only once.
     * </p>
     * 
     * @param notifications
     *        A list of notifications for the event subscriptions. A notification about a particular generated finding
     *        is added to this list only once.
     */

    public void setNotifications(java.util.Collection<AssessmentRunNotification> notifications) {
        if (notifications == null) {
            this.notifications = null;
            return;
        }

        this.notifications = new java.util.ArrayList<AssessmentRunNotification>(notifications);
    }

    /**
     * <p>
     * A list of notifications for the event subscriptions. A notification about a particular generated finding is added
     * to this list only once.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotifications(java.util.Collection)} or {@link #withNotifications(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param notifications
     *        A list of notifications for the event subscriptions. A notification about a particular generated finding
     *        is added to this list only once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withNotifications(AssessmentRunNotification... notifications) {
        if (this.notifications == null) {
            setNotifications(new java.util.ArrayList<AssessmentRunNotification>(notifications.length));
        }
        for (AssessmentRunNotification ele : notifications) {
            this.notifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of notifications for the event subscriptions. A notification about a particular generated finding is added
     * to this list only once.
     * </p>
     * 
     * @param notifications
     *        A list of notifications for the event subscriptions. A notification about a particular generated finding
     *        is added to this list only once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withNotifications(java.util.Collection<AssessmentRunNotification> notifications) {
        setNotifications(notifications);
        return this;
    }

    /**
     * <p>
     * Provides a total count of generated findings per severity.
     * </p>
     * 
     * @return Provides a total count of generated findings per severity.
     */

    public java.util.Map<String, Integer> getFindingCounts() {
        return findingCounts;
    }

    /**
     * <p>
     * Provides a total count of generated findings per severity.
     * </p>
     * 
     * @param findingCounts
     *        Provides a total count of generated findings per severity.
     */

    public void setFindingCounts(java.util.Map<String, Integer> findingCounts) {
        this.findingCounts = findingCounts;
    }

    /**
     * <p>
     * Provides a total count of generated findings per severity.
     * </p>
     * 
     * @param findingCounts
     *        Provides a total count of generated findings per severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun withFindingCounts(java.util.Map<String, Integer> findingCounts) {
        setFindingCounts(findingCounts);
        return this;
    }

    public AssessmentRun addFindingCountsEntry(String key, Integer value) {
        if (null == this.findingCounts) {
            this.findingCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.findingCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.findingCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FindingCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRun clearFindingCountsEntries() {
        this.findingCounts = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAssessmentTemplateArn() != null)
            sb.append("AssessmentTemplateArn: ").append(getAssessmentTemplateArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: ").append(getDurationInSeconds()).append(",");
        if (getRulesPackageArns() != null)
            sb.append("RulesPackageArns: ").append(getRulesPackageArns()).append(",");
        if (getUserAttributesForFindings() != null)
            sb.append("UserAttributesForFindings: ").append(getUserAttributesForFindings()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getCompletedAt() != null)
            sb.append("CompletedAt: ").append(getCompletedAt()).append(",");
        if (getStateChangedAt() != null)
            sb.append("StateChangedAt: ").append(getStateChangedAt()).append(",");
        if (getDataCollected() != null)
            sb.append("DataCollected: ").append(getDataCollected()).append(",");
        if (getStateChanges() != null)
            sb.append("StateChanges: ").append(getStateChanges()).append(",");
        if (getNotifications() != null)
            sb.append("Notifications: ").append(getNotifications()).append(",");
        if (getFindingCounts() != null)
            sb.append("FindingCounts: ").append(getFindingCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentRun == false)
            return false;
        AssessmentRun other = (AssessmentRun) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAssessmentTemplateArn() == null ^ this.getAssessmentTemplateArn() == null)
            return false;
        if (other.getAssessmentTemplateArn() != null && other.getAssessmentTemplateArn().equals(this.getAssessmentTemplateArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        if (other.getRulesPackageArns() == null ^ this.getRulesPackageArns() == null)
            return false;
        if (other.getRulesPackageArns() != null && other.getRulesPackageArns().equals(this.getRulesPackageArns()) == false)
            return false;
        if (other.getUserAttributesForFindings() == null ^ this.getUserAttributesForFindings() == null)
            return false;
        if (other.getUserAttributesForFindings() != null && other.getUserAttributesForFindings().equals(this.getUserAttributesForFindings()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null)
            return false;
        if (other.getCompletedAt() != null && other.getCompletedAt().equals(this.getCompletedAt()) == false)
            return false;
        if (other.getStateChangedAt() == null ^ this.getStateChangedAt() == null)
            return false;
        if (other.getStateChangedAt() != null && other.getStateChangedAt().equals(this.getStateChangedAt()) == false)
            return false;
        if (other.getDataCollected() == null ^ this.getDataCollected() == null)
            return false;
        if (other.getDataCollected() != null && other.getDataCollected().equals(this.getDataCollected()) == false)
            return false;
        if (other.getStateChanges() == null ^ this.getStateChanges() == null)
            return false;
        if (other.getStateChanges() != null && other.getStateChanges().equals(this.getStateChanges()) == false)
            return false;
        if (other.getNotifications() == null ^ this.getNotifications() == null)
            return false;
        if (other.getNotifications() != null && other.getNotifications().equals(this.getNotifications()) == false)
            return false;
        if (other.getFindingCounts() == null ^ this.getFindingCounts() == null)
            return false;
        if (other.getFindingCounts() != null && other.getFindingCounts().equals(this.getFindingCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAssessmentTemplateArn() == null) ? 0 : getAssessmentTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getRulesPackageArns() == null) ? 0 : getRulesPackageArns().hashCode());
        hashCode = prime * hashCode + ((getUserAttributesForFindings() == null) ? 0 : getUserAttributesForFindings().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode());
        hashCode = prime * hashCode + ((getStateChangedAt() == null) ? 0 : getStateChangedAt().hashCode());
        hashCode = prime * hashCode + ((getDataCollected() == null) ? 0 : getDataCollected().hashCode());
        hashCode = prime * hashCode + ((getStateChanges() == null) ? 0 : getStateChanges().hashCode());
        hashCode = prime * hashCode + ((getNotifications() == null) ? 0 : getNotifications().hashCode());
        hashCode = prime * hashCode + ((getFindingCounts() == null) ? 0 : getFindingCounts().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentRun clone() {
        try {
            return (AssessmentRun) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.AssessmentRunMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
