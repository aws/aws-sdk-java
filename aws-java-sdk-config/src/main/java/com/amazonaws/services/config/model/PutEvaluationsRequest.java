/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.config.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#putEvaluations(PutEvaluationsRequest) PutEvaluations operation}.
 * <p>
 * Used by an AWS Lambda function to deliver evaluation results to AWS
 * Config. This action is required in every AWS Lambda function that is
 * invoked by an AWS Config rule.
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#putEvaluations(PutEvaluationsRequest)
 */
public class PutEvaluationsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The assessments that the AWS Lambda function performs. Each evaluation
     * identifies an AWS resource and indicates whether it complies with the
     * AWS Config rule that invokes the AWS Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Evaluation> evaluations;

    /**
     * An encrypted token that associates an evaluation with an AWS Config
     * rule. Identifies the rule and the event that triggered the evaluation
     */
    private String resultToken;

    /**
     * The assessments that the AWS Lambda function performs. Each evaluation
     * identifies an AWS resource and indicates whether it complies with the
     * AWS Config rule that invokes the AWS Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return The assessments that the AWS Lambda function performs. Each evaluation
     *         identifies an AWS resource and indicates whether it complies with the
     *         AWS Config rule that invokes the AWS Lambda function.
     */
    public java.util.List<Evaluation> getEvaluations() {
        if (evaluations == null) {
              evaluations = new com.amazonaws.internal.ListWithAutoConstructFlag<Evaluation>();
              evaluations.setAutoConstruct(true);
        }
        return evaluations;
    }
    
    /**
     * The assessments that the AWS Lambda function performs. Each evaluation
     * identifies an AWS resource and indicates whether it complies with the
     * AWS Config rule that invokes the AWS Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param evaluations The assessments that the AWS Lambda function performs. Each evaluation
     *         identifies an AWS resource and indicates whether it complies with the
     *         AWS Config rule that invokes the AWS Lambda function.
     */
    public void setEvaluations(java.util.Collection<Evaluation> evaluations) {
        if (evaluations == null) {
            this.evaluations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Evaluation> evaluationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Evaluation>(evaluations.size());
        evaluationsCopy.addAll(evaluations);
        this.evaluations = evaluationsCopy;
    }
    
    /**
     * The assessments that the AWS Lambda function performs. Each evaluation
     * identifies an AWS resource and indicates whether it complies with the
     * AWS Config rule that invokes the AWS Lambda function.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEvaluations(java.util.Collection)} or {@link
     * #withEvaluations(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param evaluations The assessments that the AWS Lambda function performs. Each evaluation
     *         identifies an AWS resource and indicates whether it complies with the
     *         AWS Config rule that invokes the AWS Lambda function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutEvaluationsRequest withEvaluations(Evaluation... evaluations) {
        if (getEvaluations() == null) setEvaluations(new java.util.ArrayList<Evaluation>(evaluations.length));
        for (Evaluation value : evaluations) {
            getEvaluations().add(value);
        }
        return this;
    }
    
    /**
     * The assessments that the AWS Lambda function performs. Each evaluation
     * identifies an AWS resource and indicates whether it complies with the
     * AWS Config rule that invokes the AWS Lambda function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param evaluations The assessments that the AWS Lambda function performs. Each evaluation
     *         identifies an AWS resource and indicates whether it complies with the
     *         AWS Config rule that invokes the AWS Lambda function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutEvaluationsRequest withEvaluations(java.util.Collection<Evaluation> evaluations) {
        if (evaluations == null) {
            this.evaluations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Evaluation> evaluationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Evaluation>(evaluations.size());
            evaluationsCopy.addAll(evaluations);
            this.evaluations = evaluationsCopy;
        }

        return this;
    }

    /**
     * An encrypted token that associates an evaluation with an AWS Config
     * rule. Identifies the rule and the event that triggered the evaluation
     *
     * @return An encrypted token that associates an evaluation with an AWS Config
     *         rule. Identifies the rule and the event that triggered the evaluation
     */
    public String getResultToken() {
        return resultToken;
    }
    
    /**
     * An encrypted token that associates an evaluation with an AWS Config
     * rule. Identifies the rule and the event that triggered the evaluation
     *
     * @param resultToken An encrypted token that associates an evaluation with an AWS Config
     *         rule. Identifies the rule and the event that triggered the evaluation
     */
    public void setResultToken(String resultToken) {
        this.resultToken = resultToken;
    }
    
    /**
     * An encrypted token that associates an evaluation with an AWS Config
     * rule. Identifies the rule and the event that triggered the evaluation
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resultToken An encrypted token that associates an evaluation with an AWS Config
     *         rule. Identifies the rule and the event that triggered the evaluation
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PutEvaluationsRequest withResultToken(String resultToken) {
        this.resultToken = resultToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEvaluations() != null) sb.append("Evaluations: " + getEvaluations() + ",");
        if (getResultToken() != null) sb.append("ResultToken: " + getResultToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvaluations() == null) ? 0 : getEvaluations().hashCode()); 
        hashCode = prime * hashCode + ((getResultToken() == null) ? 0 : getResultToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutEvaluationsRequest == false) return false;
        PutEvaluationsRequest other = (PutEvaluationsRequest)obj;
        
        if (other.getEvaluations() == null ^ this.getEvaluations() == null) return false;
        if (other.getEvaluations() != null && other.getEvaluations().equals(this.getEvaluations()) == false) return false; 
        if (other.getResultToken() == null ^ this.getResultToken() == null) return false;
        if (other.getResultToken() != null && other.getResultToken().equals(this.getResultToken()) == false) return false; 
        return true;
    }
    
    @Override
    public PutEvaluationsRequest clone() {
        
            return (PutEvaluationsRequest) super.clone();
    }

}
    