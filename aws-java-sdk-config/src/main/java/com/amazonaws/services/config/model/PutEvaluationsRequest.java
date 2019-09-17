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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutEvaluations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEvaluationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The assessments that the AWS Lambda function performs. Each evaluation identifies an AWS resource and indicates
     * whether it complies with the AWS Config rule that invokes the AWS Lambda function.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Evaluation> evaluations;
    /**
     * <p>
     * An encrypted token that associates an evaluation with an AWS Config rule. Identifies the rule and the event that
     * triggered the evaluation.
     * </p>
     */
    private String resultToken;
    /**
     * <p>
     * Use this parameter to specify a test run for <code>PutEvaluations</code>. You can verify whether your AWS Lambda
     * function will deliver evaluation results to AWS Config. No updates occur to your existing evaluations, and
     * evaluation results are not sent to AWS Config.
     * </p>
     * <note>
     * <p>
     * When <code>TestMode</code> is <code>true</code>, <code>PutEvaluations</code> doesn't require a valid value for
     * the <code>ResultToken</code> parameter, but the value cannot be null.
     * </p>
     * </note>
     */
    private Boolean testMode;

    /**
     * <p>
     * The assessments that the AWS Lambda function performs. Each evaluation identifies an AWS resource and indicates
     * whether it complies with the AWS Config rule that invokes the AWS Lambda function.
     * </p>
     * 
     * @return The assessments that the AWS Lambda function performs. Each evaluation identifies an AWS resource and
     *         indicates whether it complies with the AWS Config rule that invokes the AWS Lambda function.
     */

    public java.util.List<Evaluation> getEvaluations() {
        if (evaluations == null) {
            evaluations = new com.amazonaws.internal.SdkInternalList<Evaluation>();
        }
        return evaluations;
    }

    /**
     * <p>
     * The assessments that the AWS Lambda function performs. Each evaluation identifies an AWS resource and indicates
     * whether it complies with the AWS Config rule that invokes the AWS Lambda function.
     * </p>
     * 
     * @param evaluations
     *        The assessments that the AWS Lambda function performs. Each evaluation identifies an AWS resource and
     *        indicates whether it complies with the AWS Config rule that invokes the AWS Lambda function.
     */

    public void setEvaluations(java.util.Collection<Evaluation> evaluations) {
        if (evaluations == null) {
            this.evaluations = null;
            return;
        }

        this.evaluations = new com.amazonaws.internal.SdkInternalList<Evaluation>(evaluations);
    }

    /**
     * <p>
     * The assessments that the AWS Lambda function performs. Each evaluation identifies an AWS resource and indicates
     * whether it complies with the AWS Config rule that invokes the AWS Lambda function.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvaluations(java.util.Collection)} or {@link #withEvaluations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param evaluations
     *        The assessments that the AWS Lambda function performs. Each evaluation identifies an AWS resource and
     *        indicates whether it complies with the AWS Config rule that invokes the AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEvaluationsRequest withEvaluations(Evaluation... evaluations) {
        if (this.evaluations == null) {
            setEvaluations(new com.amazonaws.internal.SdkInternalList<Evaluation>(evaluations.length));
        }
        for (Evaluation ele : evaluations) {
            this.evaluations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The assessments that the AWS Lambda function performs. Each evaluation identifies an AWS resource and indicates
     * whether it complies with the AWS Config rule that invokes the AWS Lambda function.
     * </p>
     * 
     * @param evaluations
     *        The assessments that the AWS Lambda function performs. Each evaluation identifies an AWS resource and
     *        indicates whether it complies with the AWS Config rule that invokes the AWS Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEvaluationsRequest withEvaluations(java.util.Collection<Evaluation> evaluations) {
        setEvaluations(evaluations);
        return this;
    }

    /**
     * <p>
     * An encrypted token that associates an evaluation with an AWS Config rule. Identifies the rule and the event that
     * triggered the evaluation.
     * </p>
     * 
     * @param resultToken
     *        An encrypted token that associates an evaluation with an AWS Config rule. Identifies the rule and the
     *        event that triggered the evaluation.
     */

    public void setResultToken(String resultToken) {
        this.resultToken = resultToken;
    }

    /**
     * <p>
     * An encrypted token that associates an evaluation with an AWS Config rule. Identifies the rule and the event that
     * triggered the evaluation.
     * </p>
     * 
     * @return An encrypted token that associates an evaluation with an AWS Config rule. Identifies the rule and the
     *         event that triggered the evaluation.
     */

    public String getResultToken() {
        return this.resultToken;
    }

    /**
     * <p>
     * An encrypted token that associates an evaluation with an AWS Config rule. Identifies the rule and the event that
     * triggered the evaluation.
     * </p>
     * 
     * @param resultToken
     *        An encrypted token that associates an evaluation with an AWS Config rule. Identifies the rule and the
     *        event that triggered the evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEvaluationsRequest withResultToken(String resultToken) {
        setResultToken(resultToken);
        return this;
    }

    /**
     * <p>
     * Use this parameter to specify a test run for <code>PutEvaluations</code>. You can verify whether your AWS Lambda
     * function will deliver evaluation results to AWS Config. No updates occur to your existing evaluations, and
     * evaluation results are not sent to AWS Config.
     * </p>
     * <note>
     * <p>
     * When <code>TestMode</code> is <code>true</code>, <code>PutEvaluations</code> doesn't require a valid value for
     * the <code>ResultToken</code> parameter, but the value cannot be null.
     * </p>
     * </note>
     * 
     * @param testMode
     *        Use this parameter to specify a test run for <code>PutEvaluations</code>. You can verify whether your AWS
     *        Lambda function will deliver evaluation results to AWS Config. No updates occur to your existing
     *        evaluations, and evaluation results are not sent to AWS Config.</p> <note>
     *        <p>
     *        When <code>TestMode</code> is <code>true</code>, <code>PutEvaluations</code> doesn't require a valid value
     *        for the <code>ResultToken</code> parameter, but the value cannot be null.
     *        </p>
     */

    public void setTestMode(Boolean testMode) {
        this.testMode = testMode;
    }

    /**
     * <p>
     * Use this parameter to specify a test run for <code>PutEvaluations</code>. You can verify whether your AWS Lambda
     * function will deliver evaluation results to AWS Config. No updates occur to your existing evaluations, and
     * evaluation results are not sent to AWS Config.
     * </p>
     * <note>
     * <p>
     * When <code>TestMode</code> is <code>true</code>, <code>PutEvaluations</code> doesn't require a valid value for
     * the <code>ResultToken</code> parameter, but the value cannot be null.
     * </p>
     * </note>
     * 
     * @return Use this parameter to specify a test run for <code>PutEvaluations</code>. You can verify whether your AWS
     *         Lambda function will deliver evaluation results to AWS Config. No updates occur to your existing
     *         evaluations, and evaluation results are not sent to AWS Config.</p> <note>
     *         <p>
     *         When <code>TestMode</code> is <code>true</code>, <code>PutEvaluations</code> doesn't require a valid
     *         value for the <code>ResultToken</code> parameter, but the value cannot be null.
     *         </p>
     */

    public Boolean getTestMode() {
        return this.testMode;
    }

    /**
     * <p>
     * Use this parameter to specify a test run for <code>PutEvaluations</code>. You can verify whether your AWS Lambda
     * function will deliver evaluation results to AWS Config. No updates occur to your existing evaluations, and
     * evaluation results are not sent to AWS Config.
     * </p>
     * <note>
     * <p>
     * When <code>TestMode</code> is <code>true</code>, <code>PutEvaluations</code> doesn't require a valid value for
     * the <code>ResultToken</code> parameter, but the value cannot be null.
     * </p>
     * </note>
     * 
     * @param testMode
     *        Use this parameter to specify a test run for <code>PutEvaluations</code>. You can verify whether your AWS
     *        Lambda function will deliver evaluation results to AWS Config. No updates occur to your existing
     *        evaluations, and evaluation results are not sent to AWS Config.</p> <note>
     *        <p>
     *        When <code>TestMode</code> is <code>true</code>, <code>PutEvaluations</code> doesn't require a valid value
     *        for the <code>ResultToken</code> parameter, but the value cannot be null.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEvaluationsRequest withTestMode(Boolean testMode) {
        setTestMode(testMode);
        return this;
    }

    /**
     * <p>
     * Use this parameter to specify a test run for <code>PutEvaluations</code>. You can verify whether your AWS Lambda
     * function will deliver evaluation results to AWS Config. No updates occur to your existing evaluations, and
     * evaluation results are not sent to AWS Config.
     * </p>
     * <note>
     * <p>
     * When <code>TestMode</code> is <code>true</code>, <code>PutEvaluations</code> doesn't require a valid value for
     * the <code>ResultToken</code> parameter, but the value cannot be null.
     * </p>
     * </note>
     * 
     * @return Use this parameter to specify a test run for <code>PutEvaluations</code>. You can verify whether your AWS
     *         Lambda function will deliver evaluation results to AWS Config. No updates occur to your existing
     *         evaluations, and evaluation results are not sent to AWS Config.</p> <note>
     *         <p>
     *         When <code>TestMode</code> is <code>true</code>, <code>PutEvaluations</code> doesn't require a valid
     *         value for the <code>ResultToken</code> parameter, but the value cannot be null.
     *         </p>
     */

    public Boolean isTestMode() {
        return this.testMode;
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
        if (getEvaluations() != null)
            sb.append("Evaluations: ").append(getEvaluations()).append(",");
        if (getResultToken() != null)
            sb.append("ResultToken: ").append(getResultToken()).append(",");
        if (getTestMode() != null)
            sb.append("TestMode: ").append(getTestMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEvaluationsRequest == false)
            return false;
        PutEvaluationsRequest other = (PutEvaluationsRequest) obj;
        if (other.getEvaluations() == null ^ this.getEvaluations() == null)
            return false;
        if (other.getEvaluations() != null && other.getEvaluations().equals(this.getEvaluations()) == false)
            return false;
        if (other.getResultToken() == null ^ this.getResultToken() == null)
            return false;
        if (other.getResultToken() != null && other.getResultToken().equals(this.getResultToken()) == false)
            return false;
        if (other.getTestMode() == null ^ this.getTestMode() == null)
            return false;
        if (other.getTestMode() != null && other.getTestMode().equals(this.getTestMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluations() == null) ? 0 : getEvaluations().hashCode());
        hashCode = prime * hashCode + ((getResultToken() == null) ? 0 : getResultToken().hashCode());
        hashCode = prime * hashCode + ((getTestMode() == null) ? 0 : getTestMode().hashCode());
        return hashCode;
    }

    @Override
    public PutEvaluationsRequest clone() {
        return (PutEvaluationsRequest) super.clone();
    }

}
