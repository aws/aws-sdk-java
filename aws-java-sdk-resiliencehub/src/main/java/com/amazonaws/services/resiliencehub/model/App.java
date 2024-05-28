/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines an Resilience Hub application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/App" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class App implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     * </p>
     */
    private String assessmentSchedule;
    /**
     * <p>
     * Current status of compliance for the resiliency policy.
     * </p>
     */
    private String complianceStatus;
    /**
     * <p>
     * Date and time when the app was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Optional description for an application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates if compliance drifts (deviations) were detected while running an assessment for your application.
     * </p>
     */
    private String driftStatus;
    /**
     * <p>
     * The list of events you would like to subscribe and get notification for. Currently, Resilience Hub supports
     * notifications only for <b>Drift detected</b> and <b>Scheduled assessment failure</b> events.
     * </p>
     */
    private java.util.List<EventSubscription> eventSubscriptions;
    /**
     * <p>
     * Date and time the most recent compliance evaluation.
     * </p>
     */
    private java.util.Date lastAppComplianceEvaluationTime;
    /**
     * <p>
     * Indicates the last time that a drift was evaluated.
     * </p>
     */
    private java.util.Date lastDriftEvaluationTime;
    /**
     * <p>
     * Date and time the most recent resiliency score evaluation.
     * </p>
     */
    private java.util.Date lastResiliencyScoreEvaluationTime;
    /**
     * <p>
     * Name for the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Defines the roles and credentials that Resilience Hub would use while creating the application, importing its
     * resources, and running an assessment.
     * </p>
     */
    private PermissionModel permissionModel;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     */
    private String policyArn;
    /**
     * <p>
     * Current resiliency score for the application.
     * </p>
     */
    private Double resiliencyScore;
    /**
     * <p>
     * Recovery Point Objective (RPO) in seconds.
     * </p>
     */
    private Integer rpoInSecs;
    /**
     * <p>
     * Recovery Time Objective (RTO) in seconds.
     * </p>
     */
    private Integer rtoInSecs;
    /**
     * <p>
     * Status of the application.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For
     *        more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *         <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>.
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For
     *        more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     * </p>
     * 
     * @param assessmentSchedule
     *        Assessment execution schedule with 'Daily' or 'Disabled' values.
     * @see AppAssessmentScheduleType
     */

    public void setAssessmentSchedule(String assessmentSchedule) {
        this.assessmentSchedule = assessmentSchedule;
    }

    /**
     * <p>
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     * </p>
     * 
     * @return Assessment execution schedule with 'Daily' or 'Disabled' values.
     * @see AppAssessmentScheduleType
     */

    public String getAssessmentSchedule() {
        return this.assessmentSchedule;
    }

    /**
     * <p>
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     * </p>
     * 
     * @param assessmentSchedule
     *        Assessment execution schedule with 'Daily' or 'Disabled' values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppAssessmentScheduleType
     */

    public App withAssessmentSchedule(String assessmentSchedule) {
        setAssessmentSchedule(assessmentSchedule);
        return this;
    }

    /**
     * <p>
     * Assessment execution schedule with 'Daily' or 'Disabled' values.
     * </p>
     * 
     * @param assessmentSchedule
     *        Assessment execution schedule with 'Daily' or 'Disabled' values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppAssessmentScheduleType
     */

    public App withAssessmentSchedule(AppAssessmentScheduleType assessmentSchedule) {
        this.assessmentSchedule = assessmentSchedule.toString();
        return this;
    }

    /**
     * <p>
     * Current status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        Current status of compliance for the resiliency policy.
     * @see AppComplianceStatusType
     */

    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    /**
     * <p>
     * Current status of compliance for the resiliency policy.
     * </p>
     * 
     * @return Current status of compliance for the resiliency policy.
     * @see AppComplianceStatusType
     */

    public String getComplianceStatus() {
        return this.complianceStatus;
    }

    /**
     * <p>
     * Current status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        Current status of compliance for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppComplianceStatusType
     */

    public App withComplianceStatus(String complianceStatus) {
        setComplianceStatus(complianceStatus);
        return this;
    }

    /**
     * <p>
     * Current status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        Current status of compliance for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppComplianceStatusType
     */

    public App withComplianceStatus(AppComplianceStatusType complianceStatus) {
        this.complianceStatus = complianceStatus.toString();
        return this;
    }

    /**
     * <p>
     * Date and time when the app was created.
     * </p>
     * 
     * @param creationTime
     *        Date and time when the app was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Date and time when the app was created.
     * </p>
     * 
     * @return Date and time when the app was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Date and time when the app was created.
     * </p>
     * 
     * @param creationTime
     *        Date and time when the app was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Optional description for an application.
     * </p>
     * 
     * @param description
     *        Optional description for an application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Optional description for an application.
     * </p>
     * 
     * @return Optional description for an application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Optional description for an application.
     * </p>
     * 
     * @param description
     *        Optional description for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates if compliance drifts (deviations) were detected while running an assessment for your application.
     * </p>
     * 
     * @param driftStatus
     *        Indicates if compliance drifts (deviations) were detected while running an assessment for your
     *        application.
     * @see AppDriftStatusType
     */

    public void setDriftStatus(String driftStatus) {
        this.driftStatus = driftStatus;
    }

    /**
     * <p>
     * Indicates if compliance drifts (deviations) were detected while running an assessment for your application.
     * </p>
     * 
     * @return Indicates if compliance drifts (deviations) were detected while running an assessment for your
     *         application.
     * @see AppDriftStatusType
     */

    public String getDriftStatus() {
        return this.driftStatus;
    }

    /**
     * <p>
     * Indicates if compliance drifts (deviations) were detected while running an assessment for your application.
     * </p>
     * 
     * @param driftStatus
     *        Indicates if compliance drifts (deviations) were detected while running an assessment for your
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppDriftStatusType
     */

    public App withDriftStatus(String driftStatus) {
        setDriftStatus(driftStatus);
        return this;
    }

    /**
     * <p>
     * Indicates if compliance drifts (deviations) were detected while running an assessment for your application.
     * </p>
     * 
     * @param driftStatus
     *        Indicates if compliance drifts (deviations) were detected while running an assessment for your
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppDriftStatusType
     */

    public App withDriftStatus(AppDriftStatusType driftStatus) {
        this.driftStatus = driftStatus.toString();
        return this;
    }

    /**
     * <p>
     * The list of events you would like to subscribe and get notification for. Currently, Resilience Hub supports
     * notifications only for <b>Drift detected</b> and <b>Scheduled assessment failure</b> events.
     * </p>
     * 
     * @return The list of events you would like to subscribe and get notification for. Currently, Resilience Hub
     *         supports notifications only for <b>Drift detected</b> and <b>Scheduled assessment failure</b> events.
     */

    public java.util.List<EventSubscription> getEventSubscriptions() {
        return eventSubscriptions;
    }

    /**
     * <p>
     * The list of events you would like to subscribe and get notification for. Currently, Resilience Hub supports
     * notifications only for <b>Drift detected</b> and <b>Scheduled assessment failure</b> events.
     * </p>
     * 
     * @param eventSubscriptions
     *        The list of events you would like to subscribe and get notification for. Currently, Resilience Hub
     *        supports notifications only for <b>Drift detected</b> and <b>Scheduled assessment failure</b> events.
     */

    public void setEventSubscriptions(java.util.Collection<EventSubscription> eventSubscriptions) {
        if (eventSubscriptions == null) {
            this.eventSubscriptions = null;
            return;
        }

        this.eventSubscriptions = new java.util.ArrayList<EventSubscription>(eventSubscriptions);
    }

    /**
     * <p>
     * The list of events you would like to subscribe and get notification for. Currently, Resilience Hub supports
     * notifications only for <b>Drift detected</b> and <b>Scheduled assessment failure</b> events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventSubscriptions(java.util.Collection)} or {@link #withEventSubscriptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param eventSubscriptions
     *        The list of events you would like to subscribe and get notification for. Currently, Resilience Hub
     *        supports notifications only for <b>Drift detected</b> and <b>Scheduled assessment failure</b> events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withEventSubscriptions(EventSubscription... eventSubscriptions) {
        if (this.eventSubscriptions == null) {
            setEventSubscriptions(new java.util.ArrayList<EventSubscription>(eventSubscriptions.length));
        }
        for (EventSubscription ele : eventSubscriptions) {
            this.eventSubscriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of events you would like to subscribe and get notification for. Currently, Resilience Hub supports
     * notifications only for <b>Drift detected</b> and <b>Scheduled assessment failure</b> events.
     * </p>
     * 
     * @param eventSubscriptions
     *        The list of events you would like to subscribe and get notification for. Currently, Resilience Hub
     *        supports notifications only for <b>Drift detected</b> and <b>Scheduled assessment failure</b> events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withEventSubscriptions(java.util.Collection<EventSubscription> eventSubscriptions) {
        setEventSubscriptions(eventSubscriptions);
        return this;
    }

    /**
     * <p>
     * Date and time the most recent compliance evaluation.
     * </p>
     * 
     * @param lastAppComplianceEvaluationTime
     *        Date and time the most recent compliance evaluation.
     */

    public void setLastAppComplianceEvaluationTime(java.util.Date lastAppComplianceEvaluationTime) {
        this.lastAppComplianceEvaluationTime = lastAppComplianceEvaluationTime;
    }

    /**
     * <p>
     * Date and time the most recent compliance evaluation.
     * </p>
     * 
     * @return Date and time the most recent compliance evaluation.
     */

    public java.util.Date getLastAppComplianceEvaluationTime() {
        return this.lastAppComplianceEvaluationTime;
    }

    /**
     * <p>
     * Date and time the most recent compliance evaluation.
     * </p>
     * 
     * @param lastAppComplianceEvaluationTime
     *        Date and time the most recent compliance evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withLastAppComplianceEvaluationTime(java.util.Date lastAppComplianceEvaluationTime) {
        setLastAppComplianceEvaluationTime(lastAppComplianceEvaluationTime);
        return this;
    }

    /**
     * <p>
     * Indicates the last time that a drift was evaluated.
     * </p>
     * 
     * @param lastDriftEvaluationTime
     *        Indicates the last time that a drift was evaluated.
     */

    public void setLastDriftEvaluationTime(java.util.Date lastDriftEvaluationTime) {
        this.lastDriftEvaluationTime = lastDriftEvaluationTime;
    }

    /**
     * <p>
     * Indicates the last time that a drift was evaluated.
     * </p>
     * 
     * @return Indicates the last time that a drift was evaluated.
     */

    public java.util.Date getLastDriftEvaluationTime() {
        return this.lastDriftEvaluationTime;
    }

    /**
     * <p>
     * Indicates the last time that a drift was evaluated.
     * </p>
     * 
     * @param lastDriftEvaluationTime
     *        Indicates the last time that a drift was evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withLastDriftEvaluationTime(java.util.Date lastDriftEvaluationTime) {
        setLastDriftEvaluationTime(lastDriftEvaluationTime);
        return this;
    }

    /**
     * <p>
     * Date and time the most recent resiliency score evaluation.
     * </p>
     * 
     * @param lastResiliencyScoreEvaluationTime
     *        Date and time the most recent resiliency score evaluation.
     */

    public void setLastResiliencyScoreEvaluationTime(java.util.Date lastResiliencyScoreEvaluationTime) {
        this.lastResiliencyScoreEvaluationTime = lastResiliencyScoreEvaluationTime;
    }

    /**
     * <p>
     * Date and time the most recent resiliency score evaluation.
     * </p>
     * 
     * @return Date and time the most recent resiliency score evaluation.
     */

    public java.util.Date getLastResiliencyScoreEvaluationTime() {
        return this.lastResiliencyScoreEvaluationTime;
    }

    /**
     * <p>
     * Date and time the most recent resiliency score evaluation.
     * </p>
     * 
     * @param lastResiliencyScoreEvaluationTime
     *        Date and time the most recent resiliency score evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withLastResiliencyScoreEvaluationTime(java.util.Date lastResiliencyScoreEvaluationTime) {
        setLastResiliencyScoreEvaluationTime(lastResiliencyScoreEvaluationTime);
        return this;
    }

    /**
     * <p>
     * Name for the application.
     * </p>
     * 
     * @param name
     *        Name for the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name for the application.
     * </p>
     * 
     * @return Name for the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name for the application.
     * </p>
     * 
     * @param name
     *        Name for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Defines the roles and credentials that Resilience Hub would use while creating the application, importing its
     * resources, and running an assessment.
     * </p>
     * 
     * @param permissionModel
     *        Defines the roles and credentials that Resilience Hub would use while creating the application, importing
     *        its resources, and running an assessment.
     */

    public void setPermissionModel(PermissionModel permissionModel) {
        this.permissionModel = permissionModel;
    }

    /**
     * <p>
     * Defines the roles and credentials that Resilience Hub would use while creating the application, importing its
     * resources, and running an assessment.
     * </p>
     * 
     * @return Defines the roles and credentials that Resilience Hub would use while creating the application, importing
     *         its resources, and running an assessment.
     */

    public PermissionModel getPermissionModel() {
        return this.permissionModel;
    }

    /**
     * <p>
     * Defines the roles and credentials that Resilience Hub would use while creating the application, importing its
     * resources, and running an assessment.
     * </p>
     * 
     * @param permissionModel
     *        Defines the roles and credentials that Resilience Hub would use while creating the application, importing
     *        its resources, and running an assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withPermissionModel(PermissionModel permissionModel) {
        setPermissionModel(permissionModel);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param policyArn
     *        Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/
     *        <code>policy-id</code>. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:
     *         <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/
     *         <code>policy-id</code>. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param policyArn
     *        Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/
     *        <code>policy-id</code>. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * Current resiliency score for the application.
     * </p>
     * 
     * @param resiliencyScore
     *        Current resiliency score for the application.
     */

    public void setResiliencyScore(Double resiliencyScore) {
        this.resiliencyScore = resiliencyScore;
    }

    /**
     * <p>
     * Current resiliency score for the application.
     * </p>
     * 
     * @return Current resiliency score for the application.
     */

    public Double getResiliencyScore() {
        return this.resiliencyScore;
    }

    /**
     * <p>
     * Current resiliency score for the application.
     * </p>
     * 
     * @param resiliencyScore
     *        Current resiliency score for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withResiliencyScore(Double resiliencyScore) {
        setResiliencyScore(resiliencyScore);
        return this;
    }

    /**
     * <p>
     * Recovery Point Objective (RPO) in seconds.
     * </p>
     * 
     * @param rpoInSecs
     *        Recovery Point Objective (RPO) in seconds.
     */

    public void setRpoInSecs(Integer rpoInSecs) {
        this.rpoInSecs = rpoInSecs;
    }

    /**
     * <p>
     * Recovery Point Objective (RPO) in seconds.
     * </p>
     * 
     * @return Recovery Point Objective (RPO) in seconds.
     */

    public Integer getRpoInSecs() {
        return this.rpoInSecs;
    }

    /**
     * <p>
     * Recovery Point Objective (RPO) in seconds.
     * </p>
     * 
     * @param rpoInSecs
     *        Recovery Point Objective (RPO) in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withRpoInSecs(Integer rpoInSecs) {
        setRpoInSecs(rpoInSecs);
        return this;
    }

    /**
     * <p>
     * Recovery Time Objective (RTO) in seconds.
     * </p>
     * 
     * @param rtoInSecs
     *        Recovery Time Objective (RTO) in seconds.
     */

    public void setRtoInSecs(Integer rtoInSecs) {
        this.rtoInSecs = rtoInSecs;
    }

    /**
     * <p>
     * Recovery Time Objective (RTO) in seconds.
     * </p>
     * 
     * @return Recovery Time Objective (RTO) in seconds.
     */

    public Integer getRtoInSecs() {
        return this.rtoInSecs;
    }

    /**
     * <p>
     * Recovery Time Objective (RTO) in seconds.
     * </p>
     * 
     * @param rtoInSecs
     *        Recovery Time Objective (RTO) in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withRtoInSecs(Integer rtoInSecs) {
        setRtoInSecs(rtoInSecs);
        return this;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @param status
     *        Status of the application.
     * @see AppStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @return Status of the application.
     * @see AppStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @param status
     *        Status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppStatusType
     */

    public App withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the application.
     * </p>
     * 
     * @param status
     *        Status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppStatusType
     */

    public App withStatus(AppStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @return Tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each
     *         tag consists of a key/value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each
     *        tag consists of a key/value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @param tags
     *        Tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each
     *        tag consists of a key/value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see App#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public App addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App clearTagsEntries() {
        this.tags = null;
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
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn()).append(",");
        if (getAssessmentSchedule() != null)
            sb.append("AssessmentSchedule: ").append(getAssessmentSchedule()).append(",");
        if (getComplianceStatus() != null)
            sb.append("ComplianceStatus: ").append(getComplianceStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDriftStatus() != null)
            sb.append("DriftStatus: ").append(getDriftStatus()).append(",");
        if (getEventSubscriptions() != null)
            sb.append("EventSubscriptions: ").append(getEventSubscriptions()).append(",");
        if (getLastAppComplianceEvaluationTime() != null)
            sb.append("LastAppComplianceEvaluationTime: ").append(getLastAppComplianceEvaluationTime()).append(",");
        if (getLastDriftEvaluationTime() != null)
            sb.append("LastDriftEvaluationTime: ").append(getLastDriftEvaluationTime()).append(",");
        if (getLastResiliencyScoreEvaluationTime() != null)
            sb.append("LastResiliencyScoreEvaluationTime: ").append(getLastResiliencyScoreEvaluationTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPermissionModel() != null)
            sb.append("PermissionModel: ").append(getPermissionModel()).append(",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn()).append(",");
        if (getResiliencyScore() != null)
            sb.append("ResiliencyScore: ").append(getResiliencyScore()).append(",");
        if (getRpoInSecs() != null)
            sb.append("RpoInSecs: ").append(getRpoInSecs()).append(",");
        if (getRtoInSecs() != null)
            sb.append("RtoInSecs: ").append(getRtoInSecs()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof App == false)
            return false;
        App other = (App) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAssessmentSchedule() == null ^ this.getAssessmentSchedule() == null)
            return false;
        if (other.getAssessmentSchedule() != null && other.getAssessmentSchedule().equals(this.getAssessmentSchedule()) == false)
            return false;
        if (other.getComplianceStatus() == null ^ this.getComplianceStatus() == null)
            return false;
        if (other.getComplianceStatus() != null && other.getComplianceStatus().equals(this.getComplianceStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDriftStatus() == null ^ this.getDriftStatus() == null)
            return false;
        if (other.getDriftStatus() != null && other.getDriftStatus().equals(this.getDriftStatus()) == false)
            return false;
        if (other.getEventSubscriptions() == null ^ this.getEventSubscriptions() == null)
            return false;
        if (other.getEventSubscriptions() != null && other.getEventSubscriptions().equals(this.getEventSubscriptions()) == false)
            return false;
        if (other.getLastAppComplianceEvaluationTime() == null ^ this.getLastAppComplianceEvaluationTime() == null)
            return false;
        if (other.getLastAppComplianceEvaluationTime() != null
                && other.getLastAppComplianceEvaluationTime().equals(this.getLastAppComplianceEvaluationTime()) == false)
            return false;
        if (other.getLastDriftEvaluationTime() == null ^ this.getLastDriftEvaluationTime() == null)
            return false;
        if (other.getLastDriftEvaluationTime() != null && other.getLastDriftEvaluationTime().equals(this.getLastDriftEvaluationTime()) == false)
            return false;
        if (other.getLastResiliencyScoreEvaluationTime() == null ^ this.getLastResiliencyScoreEvaluationTime() == null)
            return false;
        if (other.getLastResiliencyScoreEvaluationTime() != null
                && other.getLastResiliencyScoreEvaluationTime().equals(this.getLastResiliencyScoreEvaluationTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPermissionModel() == null ^ this.getPermissionModel() == null)
            return false;
        if (other.getPermissionModel() != null && other.getPermissionModel().equals(this.getPermissionModel()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getResiliencyScore() == null ^ this.getResiliencyScore() == null)
            return false;
        if (other.getResiliencyScore() != null && other.getResiliencyScore().equals(this.getResiliencyScore()) == false)
            return false;
        if (other.getRpoInSecs() == null ^ this.getRpoInSecs() == null)
            return false;
        if (other.getRpoInSecs() != null && other.getRpoInSecs().equals(this.getRpoInSecs()) == false)
            return false;
        if (other.getRtoInSecs() == null ^ this.getRtoInSecs() == null)
            return false;
        if (other.getRtoInSecs() != null && other.getRtoInSecs().equals(this.getRtoInSecs()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAssessmentSchedule() == null) ? 0 : getAssessmentSchedule().hashCode());
        hashCode = prime * hashCode + ((getComplianceStatus() == null) ? 0 : getComplianceStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDriftStatus() == null) ? 0 : getDriftStatus().hashCode());
        hashCode = prime * hashCode + ((getEventSubscriptions() == null) ? 0 : getEventSubscriptions().hashCode());
        hashCode = prime * hashCode + ((getLastAppComplianceEvaluationTime() == null) ? 0 : getLastAppComplianceEvaluationTime().hashCode());
        hashCode = prime * hashCode + ((getLastDriftEvaluationTime() == null) ? 0 : getLastDriftEvaluationTime().hashCode());
        hashCode = prime * hashCode + ((getLastResiliencyScoreEvaluationTime() == null) ? 0 : getLastResiliencyScoreEvaluationTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPermissionModel() == null) ? 0 : getPermissionModel().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getResiliencyScore() == null) ? 0 : getResiliencyScore().hashCode());
        hashCode = prime * hashCode + ((getRpoInSecs() == null) ? 0 : getRpoInSecs().hashCode());
        hashCode = prime * hashCode + ((getRtoInSecs() == null) ? 0 : getRtoInSecs().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public App clone() {
        try {
            return (App) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.AppMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
