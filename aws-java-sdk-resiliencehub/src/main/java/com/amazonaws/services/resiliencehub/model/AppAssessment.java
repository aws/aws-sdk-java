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
 * Defines an application assessment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/AppAssessment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppAssessment implements Serializable, Cloneable, StructuredPojo {

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
     * The version of the application.
     * </p>
     */
    private String appVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String assessmentArn;
    /**
     * <p>
     * The name of the assessment.
     * </p>
     */
    private String assessmentName;
    /**
     * <p>
     * The current status of the assessment for the resiliency policy.
     * </p>
     */
    private String assessmentStatus;
    /**
     * <p>
     * The application compliance against the resiliency policy.
     * </p>
     */
    private java.util.Map<String, DisruptionCompliance> compliance;
    /**
     * <p>
     * The current status of the compliance for the resiliency policy.
     * </p>
     */
    private String complianceStatus;
    /**
     * <p>
     * The cost for the application.
     * </p>
     */
    private Cost cost;
    /**
     * <p>
     * The end time for the action.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The entity that invoked the assessment.
     * </p>
     */
    private String invoker;
    /**
     * <p>
     * Error or warning message from the assessment execution
     * </p>
     */
    private String message;
    /**
     * <p>
     * The resiliency policy.
     * </p>
     */
    private ResiliencyPolicy policy;
    /**
     * <p>
     * The current resiliency score for the application.
     * </p>
     */
    private ResiliencyScore resiliencyScore;
    /**
     * <p>
     * A resource error object containing a list of errors retrieving an application's resources.
     * </p>
     */
    private ResourceErrorsDetails resourceErrorsDetails;
    /**
     * <p>
     * The starting time for the action.
     * </p>
     */
    private java.util.Date startTime;
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

    public AppAssessment withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param appVersion
     *        The version of the application.
     */

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @return The version of the application.
     */

    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * <p>
     * The version of the application.
     * </p>
     * 
     * @param appVersion
     *        The version of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessment withAppVersion(String appVersion) {
        setAppVersion(appVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param assessmentArn
     *        The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more
     *        information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public void setAssessmentArn(String assessmentArn) {
        this.assessmentArn = assessmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     *         :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more
     *         information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>AWS General Reference</i>.
     */

    public String getAssessmentArn() {
        return this.assessmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     * :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more information
     * about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon
     * Resource Names (ARNs)</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param assessmentArn
     *        The Amazon Resource Name (ARN) of the assessment. The format for this ARN is: arn:<code>partition</code>
     *        :resiliencehub:<code>region</code>:<code>account</code>:app-assessment/<code>app-id</code>. For more
     *        information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessment withAssessmentArn(String assessmentArn) {
        setAssessmentArn(assessmentArn);
        return this;
    }

    /**
     * <p>
     * The name of the assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name of the assessment.
     */

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    /**
     * <p>
     * The name of the assessment.
     * </p>
     * 
     * @return The name of the assessment.
     */

    public String getAssessmentName() {
        return this.assessmentName;
    }

    /**
     * <p>
     * The name of the assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name of the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessment withAssessmentName(String assessmentName) {
        setAssessmentName(assessmentName);
        return this;
    }

    /**
     * <p>
     * The current status of the assessment for the resiliency policy.
     * </p>
     * 
     * @param assessmentStatus
     *        The current status of the assessment for the resiliency policy.
     * @see AssessmentStatus
     */

    public void setAssessmentStatus(String assessmentStatus) {
        this.assessmentStatus = assessmentStatus;
    }

    /**
     * <p>
     * The current status of the assessment for the resiliency policy.
     * </p>
     * 
     * @return The current status of the assessment for the resiliency policy.
     * @see AssessmentStatus
     */

    public String getAssessmentStatus() {
        return this.assessmentStatus;
    }

    /**
     * <p>
     * The current status of the assessment for the resiliency policy.
     * </p>
     * 
     * @param assessmentStatus
     *        The current status of the assessment for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentStatus
     */

    public AppAssessment withAssessmentStatus(String assessmentStatus) {
        setAssessmentStatus(assessmentStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the assessment for the resiliency policy.
     * </p>
     * 
     * @param assessmentStatus
     *        The current status of the assessment for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentStatus
     */

    public AppAssessment withAssessmentStatus(AssessmentStatus assessmentStatus) {
        this.assessmentStatus = assessmentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The application compliance against the resiliency policy.
     * </p>
     * 
     * @return The application compliance against the resiliency policy.
     */

    public java.util.Map<String, DisruptionCompliance> getCompliance() {
        return compliance;
    }

    /**
     * <p>
     * The application compliance against the resiliency policy.
     * </p>
     * 
     * @param compliance
     *        The application compliance against the resiliency policy.
     */

    public void setCompliance(java.util.Map<String, DisruptionCompliance> compliance) {
        this.compliance = compliance;
    }

    /**
     * <p>
     * The application compliance against the resiliency policy.
     * </p>
     * 
     * @param compliance
     *        The application compliance against the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessment withCompliance(java.util.Map<String, DisruptionCompliance> compliance) {
        setCompliance(compliance);
        return this;
    }

    /**
     * Add a single Compliance entry
     *
     * @see AppAssessment#withCompliance
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessment addComplianceEntry(String key, DisruptionCompliance value) {
        if (null == this.compliance) {
            this.compliance = new java.util.HashMap<String, DisruptionCompliance>();
        }
        if (this.compliance.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.compliance.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Compliance.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessment clearComplianceEntries() {
        this.compliance = null;
        return this;
    }

    /**
     * <p>
     * The current status of the compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        The current status of the compliance for the resiliency policy.
     * @see ComplianceStatus
     */

    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    /**
     * <p>
     * The current status of the compliance for the resiliency policy.
     * </p>
     * 
     * @return The current status of the compliance for the resiliency policy.
     * @see ComplianceStatus
     */

    public String getComplianceStatus() {
        return this.complianceStatus;
    }

    /**
     * <p>
     * The current status of the compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        The current status of the compliance for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public AppAssessment withComplianceStatus(String complianceStatus) {
        setComplianceStatus(complianceStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        The current status of the compliance for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public AppAssessment withComplianceStatus(ComplianceStatus complianceStatus) {
        this.complianceStatus = complianceStatus.toString();
        return this;
    }

    /**
     * <p>
     * The cost for the application.
     * </p>
     * 
     * @param cost
     *        The cost for the application.
     */

    public void setCost(Cost cost) {
        this.cost = cost;
    }

    /**
     * <p>
     * The cost for the application.
     * </p>
     * 
     * @return The cost for the application.
     */

    public Cost getCost() {
        return this.cost;
    }

    /**
     * <p>
     * The cost for the application.
     * </p>
     * 
     * @param cost
     *        The cost for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessment withCost(Cost cost) {
        setCost(cost);
        return this;
    }

    /**
     * <p>
     * The end time for the action.
     * </p>
     * 
     * @param endTime
     *        The end time for the action.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time for the action.
     * </p>
     * 
     * @return The end time for the action.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time for the action.
     * </p>
     * 
     * @param endTime
     *        The end time for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessment withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The entity that invoked the assessment.
     * </p>
     * 
     * @param invoker
     *        The entity that invoked the assessment.
     * @see AssessmentInvoker
     */

    public void setInvoker(String invoker) {
        this.invoker = invoker;
    }

    /**
     * <p>
     * The entity that invoked the assessment.
     * </p>
     * 
     * @return The entity that invoked the assessment.
     * @see AssessmentInvoker
     */

    public String getInvoker() {
        return this.invoker;
    }

    /**
     * <p>
     * The entity that invoked the assessment.
     * </p>
     * 
     * @param invoker
     *        The entity that invoked the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentInvoker
     */

    public AppAssessment withInvoker(String invoker) {
        setInvoker(invoker);
        return this;
    }

    /**
     * <p>
     * The entity that invoked the assessment.
     * </p>
     * 
     * @param invoker
     *        The entity that invoked the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentInvoker
     */

    public AppAssessment withInvoker(AssessmentInvoker invoker) {
        this.invoker = invoker.toString();
        return this;
    }

    /**
     * <p>
     * Error or warning message from the assessment execution
     * </p>
     * 
     * @param message
     *        Error or warning message from the assessment execution
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Error or warning message from the assessment execution
     * </p>
     * 
     * @return Error or warning message from the assessment execution
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Error or warning message from the assessment execution
     * </p>
     * 
     * @param message
     *        Error or warning message from the assessment execution
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessment withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The resiliency policy.
     * </p>
     * 
     * @param policy
     *        The resiliency policy.
     */

    public void setPolicy(ResiliencyPolicy policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The resiliency policy.
     * </p>
     * 
     * @return The resiliency policy.
     */

    public ResiliencyPolicy getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The resiliency policy.
     * </p>
     * 
     * @param policy
     *        The resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessment withPolicy(ResiliencyPolicy policy) {
        setPolicy(policy);
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

    public void setResiliencyScore(ResiliencyScore resiliencyScore) {
        this.resiliencyScore = resiliencyScore;
    }

    /**
     * <p>
     * The current resiliency score for the application.
     * </p>
     * 
     * @return The current resiliency score for the application.
     */

    public ResiliencyScore getResiliencyScore() {
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

    public AppAssessment withResiliencyScore(ResiliencyScore resiliencyScore) {
        setResiliencyScore(resiliencyScore);
        return this;
    }

    /**
     * <p>
     * A resource error object containing a list of errors retrieving an application's resources.
     * </p>
     * 
     * @param resourceErrorsDetails
     *        A resource error object containing a list of errors retrieving an application's resources.
     */

    public void setResourceErrorsDetails(ResourceErrorsDetails resourceErrorsDetails) {
        this.resourceErrorsDetails = resourceErrorsDetails;
    }

    /**
     * <p>
     * A resource error object containing a list of errors retrieving an application's resources.
     * </p>
     * 
     * @return A resource error object containing a list of errors retrieving an application's resources.
     */

    public ResourceErrorsDetails getResourceErrorsDetails() {
        return this.resourceErrorsDetails;
    }

    /**
     * <p>
     * A resource error object containing a list of errors retrieving an application's resources.
     * </p>
     * 
     * @param resourceErrorsDetails
     *        A resource error object containing a list of errors retrieving an application's resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessment withResourceErrorsDetails(ResourceErrorsDetails resourceErrorsDetails) {
        setResourceErrorsDetails(resourceErrorsDetails);
        return this;
    }

    /**
     * <p>
     * The starting time for the action.
     * </p>
     * 
     * @param startTime
     *        The starting time for the action.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The starting time for the action.
     * </p>
     * 
     * @return The starting time for the action.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The starting time for the action.
     * </p>
     * 
     * @param startTime
     *        The starting time for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessment withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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

    public AppAssessment withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see AppAssessment#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AppAssessment addTagsEntry(String key, String value) {
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

    public AppAssessment clearTagsEntries() {
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
        if (getAppVersion() != null)
            sb.append("AppVersion: ").append(getAppVersion()).append(",");
        if (getAssessmentArn() != null)
            sb.append("AssessmentArn: ").append(getAssessmentArn()).append(",");
        if (getAssessmentName() != null)
            sb.append("AssessmentName: ").append(getAssessmentName()).append(",");
        if (getAssessmentStatus() != null)
            sb.append("AssessmentStatus: ").append(getAssessmentStatus()).append(",");
        if (getCompliance() != null)
            sb.append("Compliance: ").append(getCompliance()).append(",");
        if (getComplianceStatus() != null)
            sb.append("ComplianceStatus: ").append(getComplianceStatus()).append(",");
        if (getCost() != null)
            sb.append("Cost: ").append(getCost()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getInvoker() != null)
            sb.append("Invoker: ").append(getInvoker()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getResiliencyScore() != null)
            sb.append("ResiliencyScore: ").append(getResiliencyScore()).append(",");
        if (getResourceErrorsDetails() != null)
            sb.append("ResourceErrorsDetails: ").append(getResourceErrorsDetails()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
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

        if (obj instanceof AppAssessment == false)
            return false;
        AppAssessment other = (AppAssessment) obj;
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
        if (other.getCompliance() == null ^ this.getCompliance() == null)
            return false;
        if (other.getCompliance() != null && other.getCompliance().equals(this.getCompliance()) == false)
            return false;
        if (other.getComplianceStatus() == null ^ this.getComplianceStatus() == null)
            return false;
        if (other.getComplianceStatus() != null && other.getComplianceStatus().equals(this.getComplianceStatus()) == false)
            return false;
        if (other.getCost() == null ^ this.getCost() == null)
            return false;
        if (other.getCost() != null && other.getCost().equals(this.getCost()) == false)
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
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getResiliencyScore() == null ^ this.getResiliencyScore() == null)
            return false;
        if (other.getResiliencyScore() != null && other.getResiliencyScore().equals(this.getResiliencyScore()) == false)
            return false;
        if (other.getResourceErrorsDetails() == null ^ this.getResourceErrorsDetails() == null)
            return false;
        if (other.getResourceErrorsDetails() != null && other.getResourceErrorsDetails().equals(this.getResourceErrorsDetails()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
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
        hashCode = prime * hashCode + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        hashCode = prime * hashCode + ((getAssessmentArn() == null) ? 0 : getAssessmentArn().hashCode());
        hashCode = prime * hashCode + ((getAssessmentName() == null) ? 0 : getAssessmentName().hashCode());
        hashCode = prime * hashCode + ((getAssessmentStatus() == null) ? 0 : getAssessmentStatus().hashCode());
        hashCode = prime * hashCode + ((getCompliance() == null) ? 0 : getCompliance().hashCode());
        hashCode = prime * hashCode + ((getComplianceStatus() == null) ? 0 : getComplianceStatus().hashCode());
        hashCode = prime * hashCode + ((getCost() == null) ? 0 : getCost().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getInvoker() == null) ? 0 : getInvoker().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getResiliencyScore() == null) ? 0 : getResiliencyScore().hashCode());
        hashCode = prime * hashCode + ((getResourceErrorsDetails() == null) ? 0 : getResourceErrorsDetails().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AppAssessment clone() {
        try {
            return (AppAssessment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.AppAssessmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
