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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a Resilience Hub application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/App" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class App implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
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
     * The current status of compliance for the resiliency policy.
     * </p>
     */
    private String complianceStatus;
    /**
     * <p>
     * The timestamp for when the app was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The optional description for an app.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The timestamp for the most recent compliance evaluation.
     * </p>
     */
    private java.util.Date lastAppComplianceEvaluationTime;
    /**
     * <p>
     * The timestamp for the most recent resiliency score evaluation.
     * </p>
     */
    private java.util.Date lastResiliencyScoreEvaluationTime;
    /**
     * <p>
     * The name for the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String policyArn;
    /**
     * <p>
     * The current resiliency score for the application.
     * </p>
     */
    private Double resiliencyScore;
    /**
     * <p>
     * The status of the application.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *         :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *         about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *         Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information about ARNs,
     * see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param appArn
     *        The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more information
     *        about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     *        Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
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
     * The current status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        The current status of compliance for the resiliency policy.
     * @see AppComplianceStatusType
     */

    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    /**
     * <p>
     * The current status of compliance for the resiliency policy.
     * </p>
     * 
     * @return The current status of compliance for the resiliency policy.
     * @see AppComplianceStatusType
     */

    public String getComplianceStatus() {
        return this.complianceStatus;
    }

    /**
     * <p>
     * The current status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        The current status of compliance for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppComplianceStatusType
     */

    public App withComplianceStatus(String complianceStatus) {
        setComplianceStatus(complianceStatus);
        return this;
    }

    /**
     * <p>
     * The current status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        The current status of compliance for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppComplianceStatusType
     */

    public App withComplianceStatus(AppComplianceStatusType complianceStatus) {
        this.complianceStatus = complianceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp for when the app was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp for when the app was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp for when the app was created.
     * </p>
     * 
     * @return The timestamp for when the app was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp for when the app was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp for when the app was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The optional description for an app.
     * </p>
     * 
     * @param description
     *        The optional description for an app.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for an app.
     * </p>
     * 
     * @return The optional description for an app.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description for an app.
     * </p>
     * 
     * @param description
     *        The optional description for an app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The timestamp for the most recent compliance evaluation.
     * </p>
     * 
     * @param lastAppComplianceEvaluationTime
     *        The timestamp for the most recent compliance evaluation.
     */

    public void setLastAppComplianceEvaluationTime(java.util.Date lastAppComplianceEvaluationTime) {
        this.lastAppComplianceEvaluationTime = lastAppComplianceEvaluationTime;
    }

    /**
     * <p>
     * The timestamp for the most recent compliance evaluation.
     * </p>
     * 
     * @return The timestamp for the most recent compliance evaluation.
     */

    public java.util.Date getLastAppComplianceEvaluationTime() {
        return this.lastAppComplianceEvaluationTime;
    }

    /**
     * <p>
     * The timestamp for the most recent compliance evaluation.
     * </p>
     * 
     * @param lastAppComplianceEvaluationTime
     *        The timestamp for the most recent compliance evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withLastAppComplianceEvaluationTime(java.util.Date lastAppComplianceEvaluationTime) {
        setLastAppComplianceEvaluationTime(lastAppComplianceEvaluationTime);
        return this;
    }

    /**
     * <p>
     * The timestamp for the most recent resiliency score evaluation.
     * </p>
     * 
     * @param lastResiliencyScoreEvaluationTime
     *        The timestamp for the most recent resiliency score evaluation.
     */

    public void setLastResiliencyScoreEvaluationTime(java.util.Date lastResiliencyScoreEvaluationTime) {
        this.lastResiliencyScoreEvaluationTime = lastResiliencyScoreEvaluationTime;
    }

    /**
     * <p>
     * The timestamp for the most recent resiliency score evaluation.
     * </p>
     * 
     * @return The timestamp for the most recent resiliency score evaluation.
     */

    public java.util.Date getLastResiliencyScoreEvaluationTime() {
        return this.lastResiliencyScoreEvaluationTime;
    }

    /**
     * <p>
     * The timestamp for the most recent resiliency score evaluation.
     * </p>
     * 
     * @param lastResiliencyScoreEvaluationTime
     *        The timestamp for the most recent resiliency score evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withLastResiliencyScoreEvaluationTime(java.util.Date lastResiliencyScoreEvaluationTime) {
        setLastResiliencyScoreEvaluationTime(lastResiliencyScoreEvaluationTime);
        return this;
    }

    /**
     * <p>
     * The name for the application.
     * </p>
     * 
     * @param name
     *        The name for the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the application.
     * </p>
     * 
     * @return The name for the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the application.
     * </p>
     * 
     * @param name
     *        The name for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/
     *        <code>policy-id</code>. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:
     *         <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/
     *         <code>policy-id</code>. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/<code>policy-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) of the resiliency policy. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:resiliency-policy/
     *        <code>policy-id</code>. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * The current resiliency score for the application.
     * </p>
     * 
     * @param resiliencyScore
     *        The current resiliency score for the application.
     */

    public void setResiliencyScore(Double resiliencyScore) {
        this.resiliencyScore = resiliencyScore;
    }

    /**
     * <p>
     * The current resiliency score for the application.
     * </p>
     * 
     * @return The current resiliency score for the application.
     */

    public Double getResiliencyScore() {
        return this.resiliencyScore;
    }

    /**
     * <p>
     * The current resiliency score for the application.
     * </p>
     * 
     * @param resiliencyScore
     *        The current resiliency score for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public App withResiliencyScore(Double resiliencyScore) {
        setResiliencyScore(resiliencyScore);
        return this;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param status
     *        The status of the application.
     * @see AppStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @return The status of the application.
     * @see AppStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param status
     *        The status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppStatusType
     */

    public App withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param status
     *        The status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppStatusType
     */

    public App withStatus(AppStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @return The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     *         Each tag consists of a key/value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key/value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag
     * consists of a key/value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource.
     *        Each tag consists of a key/value pair.
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
        if (getLastAppComplianceEvaluationTime() != null)
            sb.append("LastAppComplianceEvaluationTime: ").append(getLastAppComplianceEvaluationTime()).append(",");
        if (getLastResiliencyScoreEvaluationTime() != null)
            sb.append("LastResiliencyScoreEvaluationTime: ").append(getLastResiliencyScoreEvaluationTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn()).append(",");
        if (getResiliencyScore() != null)
            sb.append("ResiliencyScore: ").append(getResiliencyScore()).append(",");
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
        if (other.getLastAppComplianceEvaluationTime() == null ^ this.getLastAppComplianceEvaluationTime() == null)
            return false;
        if (other.getLastAppComplianceEvaluationTime() != null
                && other.getLastAppComplianceEvaluationTime().equals(this.getLastAppComplianceEvaluationTime()) == false)
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
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getResiliencyScore() == null ^ this.getResiliencyScore() == null)
            return false;
        if (other.getResiliencyScore() != null && other.getResiliencyScore().equals(this.getResiliencyScore()) == false)
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
        hashCode = prime * hashCode + ((getLastAppComplianceEvaluationTime() == null) ? 0 : getLastAppComplianceEvaluationTime().hashCode());
        hashCode = prime * hashCode + ((getLastResiliencyScoreEvaluationTime() == null) ? 0 : getLastResiliencyScoreEvaluationTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getResiliencyScore() == null) ? 0 : getResiliencyScore().hashCode());
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
