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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppComponentCompliances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppComponentCompliancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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

    public ListAppComponentCompliancesRequest withAssessmentArn(String assessmentArn) {
        setAssessmentArn(assessmentArn);
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

    public ListAppComponentCompliancesRequest withMaxResults(Integer maxResults) {
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

    public ListAppComponentCompliancesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAssessmentArn() != null)
            sb.append("AssessmentArn: ").append(getAssessmentArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAppComponentCompliancesRequest == false)
            return false;
        ListAppComponentCompliancesRequest other = (ListAppComponentCompliancesRequest) obj;
        if (other.getAssessmentArn() == null ^ this.getAssessmentArn() == null)
            return false;
        if (other.getAssessmentArn() != null && other.getAssessmentArn().equals(this.getAssessmentArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentArn() == null) ? 0 : getAssessmentArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppComponentCompliancesRequest clone() {
        return (ListAppComponentCompliancesRequest) super.clone();
    }

}
