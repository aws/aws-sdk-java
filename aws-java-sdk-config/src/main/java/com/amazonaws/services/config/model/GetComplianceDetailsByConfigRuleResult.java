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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceDetailsByConfigRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComplianceDetailsByConfigRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Indicates whether the AWS resource complies with the specified AWS Config rule.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EvaluationResult> evaluationResults;
    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Indicates whether the AWS resource complies with the specified AWS Config rule.
     * </p>
     * 
     * @return Indicates whether the AWS resource complies with the specified AWS Config rule.
     */

    public java.util.List<EvaluationResult> getEvaluationResults() {
        if (evaluationResults == null) {
            evaluationResults = new com.amazonaws.internal.SdkInternalList<EvaluationResult>();
        }
        return evaluationResults;
    }

    /**
     * <p>
     * Indicates whether the AWS resource complies with the specified AWS Config rule.
     * </p>
     * 
     * @param evaluationResults
     *        Indicates whether the AWS resource complies with the specified AWS Config rule.
     */

    public void setEvaluationResults(java.util.Collection<EvaluationResult> evaluationResults) {
        if (evaluationResults == null) {
            this.evaluationResults = null;
            return;
        }

        this.evaluationResults = new com.amazonaws.internal.SdkInternalList<EvaluationResult>(evaluationResults);
    }

    /**
     * <p>
     * Indicates whether the AWS resource complies with the specified AWS Config rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvaluationResults(java.util.Collection)} or {@link #withEvaluationResults(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param evaluationResults
     *        Indicates whether the AWS resource complies with the specified AWS Config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceDetailsByConfigRuleResult withEvaluationResults(EvaluationResult... evaluationResults) {
        if (this.evaluationResults == null) {
            setEvaluationResults(new com.amazonaws.internal.SdkInternalList<EvaluationResult>(evaluationResults.length));
        }
        for (EvaluationResult ele : evaluationResults) {
            this.evaluationResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether the AWS resource complies with the specified AWS Config rule.
     * </p>
     * 
     * @param evaluationResults
     *        Indicates whether the AWS resource complies with the specified AWS Config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceDetailsByConfigRuleResult withEvaluationResults(java.util.Collection<EvaluationResult> evaluationResults) {
        setEvaluationResults(evaluationResults);
        return this;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next page of results in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     * 
     * @return The string that you use in a subsequent request to get the next page of results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next page of results in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceDetailsByConfigRuleResult withNextToken(String nextToken) {
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
        if (getEvaluationResults() != null)
            sb.append("EvaluationResults: ").append(getEvaluationResults()).append(",");
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

        if (obj instanceof GetComplianceDetailsByConfigRuleResult == false)
            return false;
        GetComplianceDetailsByConfigRuleResult other = (GetComplianceDetailsByConfigRuleResult) obj;
        if (other.getEvaluationResults() == null ^ this.getEvaluationResults() == null)
            return false;
        if (other.getEvaluationResults() != null && other.getEvaluationResults().equals(this.getEvaluationResults()) == false)
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

        hashCode = prime * hashCode + ((getEvaluationResults() == null) ? 0 : getEvaluationResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetComplianceDetailsByConfigRuleResult clone() {
        try {
            return (GetComplianceDetailsByConfigRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
