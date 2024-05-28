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
 * Defines an application assessment summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/AppAssessmentSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppAssessmentSummary implements Serializable, Cloneable, StructuredPojo {

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
     * Version of an application.
     * </p>
     */
    private String appVersion;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     */
    private String assessmentArn;
    /**
     * <p>
     * Name of the assessment.
     * </p>
     */
    private String assessmentName;
    /**
     * <p>
     * Current status of the assessment for the resiliency policy.
     * </p>
     */
    private String assessmentStatus;
    /**
     * <p>
     * TCurrent status of compliance for the resiliency policy.
     * </p>
     */
    private String complianceStatus;
    /**
     * <p>
     * Cost for an application.
     * </p>
     */
    private Cost cost;
    /**
     * <p>
     * Indicates if compliance drifts (deviations) were detected while running an assessment for your application.
     * </p>
     */
    private String driftStatus;
    /**
     * <p>
     * End time for the action.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Entity that invoked the assessment.
     * </p>
     */
    private String invoker;
    /**
     * <p>
     * Message from the assessment run.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Current resiliency score for the application.
     * </p>
     */
    private Double resiliencyScore;
    /**
     * <p>
     * Starting time for the action.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Name of an application version.
     * </p>
     */
    private String versionName;

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

    public AppAssessmentSummary withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * Version of an application.
     * </p>
     * 
     * @param appVersion
     *        Version of an application.
     */

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * <p>
     * Version of an application.
     * </p>
     * 
     * @return Version of an application.
     */

    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * <p>
     * Version of an application.
     * </p>
     * 
     * @param appVersion
     *        Version of an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withAppVersion(String appVersion) {
        setAppVersion(appVersion);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param assessmentArn
     *        Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more
     *        information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public void setAssessmentArn(String assessmentArn) {
        this.assessmentArn = assessmentArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     *         :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more
     *         information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public String getAssessmentArn() {
        return this.assessmentArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param assessmentArn
     *        Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more
     *        information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withAssessmentArn(String assessmentArn) {
        setAssessmentArn(assessmentArn);
        return this;
    }

    /**
     * <p>
     * Name of the assessment.
     * </p>
     * 
     * @param assessmentName
     *        Name of the assessment.
     */

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    /**
     * <p>
     * Name of the assessment.
     * </p>
     * 
     * @return Name of the assessment.
     */

    public String getAssessmentName() {
        return this.assessmentName;
    }

    /**
     * <p>
     * Name of the assessment.
     * </p>
     * 
     * @param assessmentName
     *        Name of the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withAssessmentName(String assessmentName) {
        setAssessmentName(assessmentName);
        return this;
    }

    /**
     * <p>
     * Current status of the assessment for the resiliency policy.
     * </p>
     * 
     * @param assessmentStatus
     *        Current status of the assessment for the resiliency policy.
     * @see AssessmentStatus
     */

    public void setAssessmentStatus(String assessmentStatus) {
        this.assessmentStatus = assessmentStatus;
    }

    /**
     * <p>
     * Current status of the assessment for the resiliency policy.
     * </p>
     * 
     * @return Current status of the assessment for the resiliency policy.
     * @see AssessmentStatus
     */

    public String getAssessmentStatus() {
        return this.assessmentStatus;
    }

    /**
     * <p>
     * Current status of the assessment for the resiliency policy.
     * </p>
     * 
     * @param assessmentStatus
     *        Current status of the assessment for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentStatus
     */

    public AppAssessmentSummary withAssessmentStatus(String assessmentStatus) {
        setAssessmentStatus(assessmentStatus);
        return this;
    }

    /**
     * <p>
     * Current status of the assessment for the resiliency policy.
     * </p>
     * 
     * @param assessmentStatus
     *        Current status of the assessment for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentStatus
     */

    public AppAssessmentSummary withAssessmentStatus(AssessmentStatus assessmentStatus) {
        this.assessmentStatus = assessmentStatus.toString();
        return this;
    }

    /**
     * <p>
     * TCurrent status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        TCurrent status of compliance for the resiliency policy.
     * @see ComplianceStatus
     */

    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    /**
     * <p>
     * TCurrent status of compliance for the resiliency policy.
     * </p>
     * 
     * @return TCurrent status of compliance for the resiliency policy.
     * @see ComplianceStatus
     */

    public String getComplianceStatus() {
        return this.complianceStatus;
    }

    /**
     * <p>
     * TCurrent status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        TCurrent status of compliance for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public AppAssessmentSummary withComplianceStatus(String complianceStatus) {
        setComplianceStatus(complianceStatus);
        return this;
    }

    /**
     * <p>
     * TCurrent status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        TCurrent status of compliance for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public AppAssessmentSummary withComplianceStatus(ComplianceStatus complianceStatus) {
        this.complianceStatus = complianceStatus.toString();
        return this;
    }

    /**
     * <p>
     * Cost for an application.
     * </p>
     * 
     * @param cost
     *        Cost for an application.
     */

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    /**
     * <p>
     * Cost for an application.
     * </p>
     * 
     * @return Cost for an application.
     */

    public Cost getCost() {
        return this.cost;
    }

    /**
     * <p>
     * Cost for an application.
     * </p>
     * 
     * @param cost
     *        Cost for an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withCost(Cost cost) {
        setCost(cost);
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
     * @see DriftStatus
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
     * @see DriftStatus
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
     * @see DriftStatus
     */

    public AppAssessmentSummary withDriftStatus(String driftStatus) {
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
     * @see DriftStatus
     */

    public AppAssessmentSummary withDriftStatus(DriftStatus driftStatus) {
        this.driftStatus = driftStatus.toString();
        return this;
    }

    /**
     * <p>
     * End time for the action.
     * </p>
     * 
     * @param endTime
     *        End time for the action.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * End time for the action.
     * </p>
     * 
     * @return End time for the action.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * End time for the action.
     * </p>
     * 
     * @param endTime
     *        End time for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Entity that invoked the assessment.
     * </p>
     * 
     * @param invoker
     *        Entity that invoked the assessment.
     * @see AssessmentInvoker
     */

    public void setInvoker(String invoker) {
        this.invoker = invoker;
    }

    /**
     * <p>
     * Entity that invoked the assessment.
     * </p>
     * 
     * @return Entity that invoked the assessment.
     * @see AssessmentInvoker
     */

    public String getInvoker() {
        return this.invoker;
    }

    /**
     * <p>
     * Entity that invoked the assessment.
     * </p>
     * 
     * @param invoker
     *        Entity that invoked the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentInvoker
     */

    public AppAssessmentSummary withInvoker(String invoker) {
        setInvoker(invoker);
        return this;
    }

    /**
     * <p>
     * Entity that invoked the assessment.
     * </p>
     * 
     * @param invoker
     *        Entity that invoked the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentInvoker
     */

    public AppAssessmentSummary withInvoker(AssessmentInvoker invoker) {
        this.invoker = invoker.toString();
        return this;
    }

    /**
     * <p>
     * Message from the assessment run.
     * </p>
     * 
     * @param message
     *        Message from the assessment run.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Message from the assessment run.
     * </p>
     * 
     * @return Message from the assessment run.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Message from the assessment run.
     * </p>
     * 
     * @param message
     *        Message from the assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withMessage(String message) {
        setMessage(message);
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

    public AppAssessmentSummary withResiliencyScore(Double resiliencyScore) {
        setResiliencyScore(resiliencyScore);
        return this;
    }

    /**
     * <p>
     * Starting time for the action.
     * </p>
     * 
     * @param startTime
     *        Starting time for the action.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Starting time for the action.
     * </p>
     * 
     * @return Starting time for the action.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Starting time for the action.
     * </p>
     * 
     * @param startTime
     *        Starting time for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Name of an application version.
     * </p>
     * 
     * @param versionName
     *        Name of an application version.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * Name of an application version.
     * </p>
     * 
     * @return Name of an application version.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * Name of an application version.
     * </p>
     * 
     * @param versionName
     *        Name of an application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessmentSummary withVersionName(String versionName) {
        setVersionName(versionName);
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
        if (getAppVersion() != null)
            sb.append("AppVersion: ").append(getAppVersion()).append(",");
        if (getAssessmentArn() != null)
            sb.append("AssessmentArn: ").append(getAssessmentArn()).append(",");
        if (getAssessmentName() != null)
            sb.append("AssessmentName: ").append(getAssessmentName()).append(",");
        if (getAssessmentStatus() != null)
            sb.append("AssessmentStatus: ").append(getAssessmentStatus()).append(",");
        if (getComplianceStatus() != null)
            sb.append("ComplianceStatus: ").append(getComplianceStatus()).append(",");
        if (getCost() != null)
            sb.append("Cost: ").append(getCost()).append(",");
        if (getDriftStatus() != null)
            sb.append("DriftStatus: ").append(getDriftStatus()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getInvoker() != null)
            sb.append("Invoker: ").append(getInvoker()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getResiliencyScore() != null)
            sb.append("ResiliencyScore: ").append(getResiliencyScore()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppAssessmentSummary == false)
            return false;
        AppAssessmentSummary other = (AppAssessmentSummary) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAppVersion() == null ^ this.getAppVersion() == null)
            return false;
        if (other.getAppVersion() != null && other.getAppVersion().equals(this.getAppVersion()) == false)
            return false;
        if (other.getAssessmentArn() == null ^ this.getAssessmentArn() == null)
            return false;
        if (other.getAssessmentArn() != null && other.getAssessmentArn().equals(this.getAssessmentArn()) == false)
            return false;
        if (other.getAssessmentName() == null ^ this.getAssessmentName() == null)
            return false;
        if (other.getAssessmentName() != null && other.getAssessmentName().equals(this.getAssessmentName()) == false)
            return false;
        if (other.getAssessmentStatus() == null ^ this.getAssessmentStatus() == null)
            return false;
        if (other.getAssessmentStatus() != null && other.getAssessmentStatus().equals(this.getAssessmentStatus()) == false)
            return false;
        if (other.getComplianceStatus() == null ^ this.getComplianceStatus() == null)
            return false;
        if (other.getComplianceStatus() != null && other.getComplianceStatus().equals(this.getComplianceStatus()) == false)
            return false;
        if (other.getCost() == null ^ this.getCost() == null)
            return false;
        if (other.getCost() != null && other.getCost().equals(this.getCost()) == false)
            return false;
        if (other.getDriftStatus() == null ^ this.getDriftStatus() == null)
            return false;
        if (other.getDriftStatus() != null && other.getDriftStatus().equals(this.getDriftStatus()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getInvoker() == null ^ this.getInvoker() == null)
            return false;
        if (other.getInvoker() != null && other.getInvoker().equals(this.getInvoker()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getResiliencyScore() == null ^ this.getResiliencyScore() == null)
            return false;
        if (other.getResiliencyScore() != null && other.getResiliencyScore().equals(this.getResiliencyScore()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        hashCode = prime * hashCode + ((getAssessmentArn() == null) ? 0 : getAssessmentArn().hashCode());
        hashCode = prime * hashCode + ((getAssessmentName() == null) ? 0 : getAssessmentName().hashCode());
        hashCode = prime * hashCode + ((getAssessmentStatus() == null) ? 0 : getAssessmentStatus().hashCode());
        hashCode = prime * hashCode + ((getComplianceStatus() == null) ? 0 : getComplianceStatus().hashCode());
        hashCode = prime * hashCode + ((getCost() == null) ? 0 : getCost().hashCode());
        hashCode = prime * hashCode + ((getDriftStatus() == null) ? 0 : getDriftStatus().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getInvoker() == null) ? 0 : getInvoker().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getResiliencyScore() == null) ? 0 : getResiliencyScore().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        return hashCode;
    }

    @Override
    public AppAssessmentSummary clone() {
        try {
            return (AppAssessmentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.AppAssessmentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
