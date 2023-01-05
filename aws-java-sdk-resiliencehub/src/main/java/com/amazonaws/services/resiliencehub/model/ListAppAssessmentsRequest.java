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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppAssessments" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppAssessmentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The name for the assessment.
     * </p>
     */
    private String assessmentName;
    /**
     * <p>
     * The current status of the assessment for the resiliency policy.
     * </p>
     */
    private java.util.List<String> assessmentStatus;
    /**
     * <p>
     * The current status of compliance for the resiliency policy.
     * </p>
     */
    private String complianceStatus;
    /**
     * <p>
     * Specifies the entity that invoked a specific assessment, either a <code>User</code> or the <code>System</code>.
     * </p>
     */
    private String invoker;
    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set reverseOrder to
     * <code>true</code>.
     * </p>
     */
    private Boolean reverseOrder;

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

    public ListAppAssessmentsRequest withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * The name for the assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name for the assessment.
     */

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    /**
     * <p>
     * The name for the assessment.
     * </p>
     * 
     * @return The name for the assessment.
     */

    public String getAssessmentName() {
        return this.assessmentName;
    }

    /**
     * <p>
     * The name for the assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name for the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppAssessmentsRequest withAssessmentName(String assessmentName) {
        setAssessmentName(assessmentName);
        return this;
    }

    /**
     * <p>
     * The current status of the assessment for the resiliency policy.
     * </p>
     * 
     * @return The current status of the assessment for the resiliency policy.
     * @see AssessmentStatus
     */

    public java.util.List<String> getAssessmentStatus() {
        return assessmentStatus;
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

    public void setAssessmentStatus(java.util.Collection<String> assessmentStatus) {
        if (assessmentStatus == null) {
            this.assessmentStatus = null;
            return;
        }

        this.assessmentStatus = new java.util.ArrayList<String>(assessmentStatus);
    }

    /**
     * <p>
     * The current status of the assessment for the resiliency policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssessmentStatus(java.util.Collection)} or {@link #withAssessmentStatus(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param assessmentStatus
     *        The current status of the assessment for the resiliency policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentStatus
     */

    public ListAppAssessmentsRequest withAssessmentStatus(String... assessmentStatus) {
        if (this.assessmentStatus == null) {
            setAssessmentStatus(new java.util.ArrayList<String>(assessmentStatus.length));
        }
        for (String ele : assessmentStatus) {
            this.assessmentStatus.add(ele);
        }
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

    public ListAppAssessmentsRequest withAssessmentStatus(java.util.Collection<String> assessmentStatus) {
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

    public ListAppAssessmentsRequest withAssessmentStatus(AssessmentStatus... assessmentStatus) {
        java.util.ArrayList<String> assessmentStatusCopy = new java.util.ArrayList<String>(assessmentStatus.length);
        for (AssessmentStatus value : assessmentStatus) {
            assessmentStatusCopy.add(value.toString());
        }
        if (getAssessmentStatus() == null) {
            setAssessmentStatus(assessmentStatusCopy);
        } else {
            getAssessmentStatus().addAll(assessmentStatusCopy);
        }
        return this;
    }

    /**
     * <p>
     * The current status of compliance for the resiliency policy.
     * </p>
     * 
     * @param complianceStatus
     *        The current status of compliance for the resiliency policy.
     * @see ComplianceStatus
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
     * @see ComplianceStatus
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
     * @see ComplianceStatus
     */

    public ListAppAssessmentsRequest withComplianceStatus(String complianceStatus) {
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
     * @see ComplianceStatus
     */

    public ListAppAssessmentsRequest withComplianceStatus(ComplianceStatus complianceStatus) {
        this.complianceStatus = complianceStatus.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the entity that invoked a specific assessment, either a <code>User</code> or the <code>System</code>.
     * </p>
     * 
     * @param invoker
     *        Specifies the entity that invoked a specific assessment, either a <code>User</code> or the
     *        <code>System</code>.
     * @see AssessmentInvoker
     */

    public void setInvoker(String invoker) {
        this.invoker = invoker;
    }

    /**
     * <p>
     * Specifies the entity that invoked a specific assessment, either a <code>User</code> or the <code>System</code>.
     * </p>
     * 
     * @return Specifies the entity that invoked a specific assessment, either a <code>User</code> or the
     *         <code>System</code>.
     * @see AssessmentInvoker
     */

    public String getInvoker() {
        return this.invoker;
    }

    /**
     * <p>
     * Specifies the entity that invoked a specific assessment, either a <code>User</code> or the <code>System</code>.
     * </p>
     * 
     * @param invoker
     *        Specifies the entity that invoked a specific assessment, either a <code>User</code> or the
     *        <code>System</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentInvoker
     */

    public ListAppAssessmentsRequest withInvoker(String invoker) {
        setInvoker(invoker);
        return this;
    }

    /**
     * <p>
     * Specifies the entity that invoked a specific assessment, either a <code>User</code> or the <code>System</code>.
     * </p>
     * 
     * @param invoker
     *        Specifies the entity that invoked a specific assessment, either a <code>User</code> or the
     *        <code>System</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentInvoker
     */

    public ListAppAssessmentsRequest withInvoker(AssessmentInvoker invoker) {
        this.invoker = invoker.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If more results exist than the specified
     *        <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *        retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * 
     * @return The maximum number of results to include in the response. If more results exist than the specified
     *         <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *         retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If more results exist than the specified
     *        <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *        retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppAssessmentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Null, or the token from a previous call to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     * 
     * @return Null, or the token from a previous call to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Null, or the token from a previous call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppAssessmentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set reverseOrder to
     * <code>true</code>.
     * </p>
     * 
     * @param reverseOrder
     *        The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set
     *        reverseOrder to <code>true</code>.
     */

    public void setReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
    }

    /**
     * <p>
     * The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set reverseOrder to
     * <code>true</code>.
     * </p>
     * 
     * @return The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set
     *         reverseOrder to <code>true</code>.
     */

    public Boolean getReverseOrder() {
        return this.reverseOrder;
    }

    /**
     * <p>
     * The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set reverseOrder to
     * <code>true</code>.
     * </p>
     * 
     * @param reverseOrder
     *        The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set
     *        reverseOrder to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppAssessmentsRequest withReverseOrder(Boolean reverseOrder) {
        setReverseOrder(reverseOrder);
        return this;
    }

    /**
     * <p>
     * The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set reverseOrder to
     * <code>true</code>.
     * </p>
     * 
     * @return The default is to sort by ascending <b>startTime</b>. To sort by descending <b>startTime</b>, set
     *         reverseOrder to <code>true</code>.
     */

    public Boolean isReverseOrder() {
        return this.reverseOrder;
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
        if (getAssessmentName() != null)
            sb.append("AssessmentName: ").append(getAssessmentName()).append(",");
        if (getAssessmentStatus() != null)
            sb.append("AssessmentStatus: ").append(getAssessmentStatus()).append(",");
        if (getComplianceStatus() != null)
            sb.append("ComplianceStatus: ").append(getComplianceStatus()).append(",");
        if (getInvoker() != null)
            sb.append("Invoker: ").append(getInvoker()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getReverseOrder() != null)
            sb.append("ReverseOrder: ").append(getReverseOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppAssessmentsRequest == false)
            return false;
        ListAppAssessmentsRequest other = (ListAppAssessmentsRequest) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
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
        if (other.getInvoker() == null ^ this.getInvoker() == null)
            return false;
        if (other.getInvoker() != null && other.getInvoker().equals(this.getInvoker()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReverseOrder() == null ^ this.getReverseOrder() == null)
            return false;
        if (other.getReverseOrder() != null && other.getReverseOrder().equals(this.getReverseOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAssessmentName() == null) ? 0 : getAssessmentName().hashCode());
        hashCode = prime * hashCode + ((getAssessmentStatus() == null) ? 0 : getAssessmentStatus().hashCode());
        hashCode = prime * hashCode + ((getComplianceStatus() == null) ? 0 : getComplianceStatus().hashCode());
        hashCode = prime * hashCode + ((getInvoker() == null) ? 0 : getInvoker().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReverseOrder() == null) ? 0 : getReverseOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListAppAssessmentsRequest clone() {
        return (ListAppAssessmentsRequest) super.clone();
    }

}
