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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListApps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * Indicates the lower limit of the range that is used to filter applications based on their last assessment times.
     * </p>
     */
    private java.util.Date fromLastAssessmentTime;
    /**
     * <p>
     * Maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The name for the one of the listed applications.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Null, or the token from a previous call to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The application list is sorted based on the values of <code>lastAppComplianceEvaluationTime</code> field. By
     * default, application list is sorted in ascending order. To sort the appliation list in descending order, set this
     * field to <code>True</code>.
     * </p>
     */
    private Boolean reverseOrder;
    /**
     * <p>
     * Indicates the upper limit of the range that is used to filter the applications based on their last assessment
     * times.
     * </p>
     */
    private java.util.Date toLastAssessmentTime;

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

    public ListAppsRequest withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * Indicates the lower limit of the range that is used to filter applications based on their last assessment times.
     * </p>
     * 
     * @param fromLastAssessmentTime
     *        Indicates the lower limit of the range that is used to filter applications based on their last assessment
     *        times.
     */

    public void setFromLastAssessmentTime(java.util.Date fromLastAssessmentTime) {
        this.fromLastAssessmentTime = fromLastAssessmentTime;
    }

    /**
     * <p>
     * Indicates the lower limit of the range that is used to filter applications based on their last assessment times.
     * </p>
     * 
     * @return Indicates the lower limit of the range that is used to filter applications based on their last assessment
     *         times.
     */

    public java.util.Date getFromLastAssessmentTime() {
        return this.fromLastAssessmentTime;
    }

    /**
     * <p>
     * Indicates the lower limit of the range that is used to filter applications based on their last assessment times.
     * </p>
     * 
     * @param fromLastAssessmentTime
     *        Indicates the lower limit of the range that is used to filter applications based on their last assessment
     *        times.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsRequest withFromLastAssessmentTime(java.util.Date fromLastAssessmentTime) {
        setFromLastAssessmentTime(fromLastAssessmentTime);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to include in the response. If more results exist than the specified
     *        <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *        retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * 
     * @return Maximum number of results to include in the response. If more results exist than the specified
     *         <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *         retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to include in the response. If more results exist than the specified
     *        <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *        retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The name for the one of the listed applications.
     * </p>
     * 
     * @param name
     *        The name for the one of the listed applications.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the one of the listed applications.
     * </p>
     * 
     * @return The name for the one of the listed applications.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the one of the listed applications.
     * </p>
     * 
     * @param name
     *        The name for the one of the listed applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsRequest withName(String name) {
        setName(name);
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

    public ListAppsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The application list is sorted based on the values of <code>lastAppComplianceEvaluationTime</code> field. By
     * default, application list is sorted in ascending order. To sort the appliation list in descending order, set this
     * field to <code>True</code>.
     * </p>
     * 
     * @param reverseOrder
     *        The application list is sorted based on the values of <code>lastAppComplianceEvaluationTime</code> field.
     *        By default, application list is sorted in ascending order. To sort the appliation list in descending
     *        order, set this field to <code>True</code>.
     */

    public void setReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
    }

    /**
     * <p>
     * The application list is sorted based on the values of <code>lastAppComplianceEvaluationTime</code> field. By
     * default, application list is sorted in ascending order. To sort the appliation list in descending order, set this
     * field to <code>True</code>.
     * </p>
     * 
     * @return The application list is sorted based on the values of <code>lastAppComplianceEvaluationTime</code> field.
     *         By default, application list is sorted in ascending order. To sort the appliation list in descending
     *         order, set this field to <code>True</code>.
     */

    public Boolean getReverseOrder() {
        return this.reverseOrder;
    }

    /**
     * <p>
     * The application list is sorted based on the values of <code>lastAppComplianceEvaluationTime</code> field. By
     * default, application list is sorted in ascending order. To sort the appliation list in descending order, set this
     * field to <code>True</code>.
     * </p>
     * 
     * @param reverseOrder
     *        The application list is sorted based on the values of <code>lastAppComplianceEvaluationTime</code> field.
     *        By default, application list is sorted in ascending order. To sort the appliation list in descending
     *        order, set this field to <code>True</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsRequest withReverseOrder(Boolean reverseOrder) {
        setReverseOrder(reverseOrder);
        return this;
    }

    /**
     * <p>
     * The application list is sorted based on the values of <code>lastAppComplianceEvaluationTime</code> field. By
     * default, application list is sorted in ascending order. To sort the appliation list in descending order, set this
     * field to <code>True</code>.
     * </p>
     * 
     * @return The application list is sorted based on the values of <code>lastAppComplianceEvaluationTime</code> field.
     *         By default, application list is sorted in ascending order. To sort the appliation list in descending
     *         order, set this field to <code>True</code>.
     */

    public Boolean isReverseOrder() {
        return this.reverseOrder;
    }

    /**
     * <p>
     * Indicates the upper limit of the range that is used to filter the applications based on their last assessment
     * times.
     * </p>
     * 
     * @param toLastAssessmentTime
     *        Indicates the upper limit of the range that is used to filter the applications based on their last
     *        assessment times.
     */

    public void setToLastAssessmentTime(java.util.Date toLastAssessmentTime) {
        this.toLastAssessmentTime = toLastAssessmentTime;
    }

    /**
     * <p>
     * Indicates the upper limit of the range that is used to filter the applications based on their last assessment
     * times.
     * </p>
     * 
     * @return Indicates the upper limit of the range that is used to filter the applications based on their last
     *         assessment times.
     */

    public java.util.Date getToLastAssessmentTime() {
        return this.toLastAssessmentTime;
    }

    /**
     * <p>
     * Indicates the upper limit of the range that is used to filter the applications based on their last assessment
     * times.
     * </p>
     * 
     * @param toLastAssessmentTime
     *        Indicates the upper limit of the range that is used to filter the applications based on their last
     *        assessment times.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsRequest withToLastAssessmentTime(java.util.Date toLastAssessmentTime) {
        setToLastAssessmentTime(toLastAssessmentTime);
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
        if (getFromLastAssessmentTime() != null)
            sb.append("FromLastAssessmentTime: ").append(getFromLastAssessmentTime()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getReverseOrder() != null)
            sb.append("ReverseOrder: ").append(getReverseOrder()).append(",");
        if (getToLastAssessmentTime() != null)
            sb.append("ToLastAssessmentTime: ").append(getToLastAssessmentTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppsRequest == false)
            return false;
        ListAppsRequest other = (ListAppsRequest) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getFromLastAssessmentTime() == null ^ this.getFromLastAssessmentTime() == null)
            return false;
        if (other.getFromLastAssessmentTime() != null && other.getFromLastAssessmentTime().equals(this.getFromLastAssessmentTime()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReverseOrder() == null ^ this.getReverseOrder() == null)
            return false;
        if (other.getReverseOrder() != null && other.getReverseOrder().equals(this.getReverseOrder()) == false)
            return false;
        if (other.getToLastAssessmentTime() == null ^ this.getToLastAssessmentTime() == null)
            return false;
        if (other.getToLastAssessmentTime() != null && other.getToLastAssessmentTime().equals(this.getToLastAssessmentTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getFromLastAssessmentTime() == null) ? 0 : getFromLastAssessmentTime().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReverseOrder() == null) ? 0 : getReverseOrder().hashCode());
        hashCode = prime * hashCode + ((getToLastAssessmentTime() == null) ? 0 : getToLastAssessmentTime().hashCode());
        return hashCode;
    }

    @Override
    public ListAppsRequest clone() {
        return (ListAppsRequest) super.clone();
    }

}
