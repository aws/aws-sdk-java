/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/EvaluatePullRequestApprovalRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluatePullRequestApprovalRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The result of the evaluation, including the names of the rules whose conditions have been met (if any), the names
     * of the rules whose conditions have not been met (if any), whether the pull request is in the approved state, and
     * whether the pull request approval rule has been set aside by an override.
     * </p>
     */
    private Evaluation evaluation;

    /**
     * <p>
     * The result of the evaluation, including the names of the rules whose conditions have been met (if any), the names
     * of the rules whose conditions have not been met (if any), whether the pull request is in the approved state, and
     * whether the pull request approval rule has been set aside by an override.
     * </p>
     * 
     * @param evaluation
     *        The result of the evaluation, including the names of the rules whose conditions have been met (if any),
     *        the names of the rules whose conditions have not been met (if any), whether the pull request is in the
     *        approved state, and whether the pull request approval rule has been set aside by an override.
     */

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    /**
     * <p>
     * The result of the evaluation, including the names of the rules whose conditions have been met (if any), the names
     * of the rules whose conditions have not been met (if any), whether the pull request is in the approved state, and
     * whether the pull request approval rule has been set aside by an override.
     * </p>
     * 
     * @return The result of the evaluation, including the names of the rules whose conditions have been met (if any),
     *         the names of the rules whose conditions have not been met (if any), whether the pull request is in the
     *         approved state, and whether the pull request approval rule has been set aside by an override.
     */

    public Evaluation getEvaluation() {
        return this.evaluation;
    }

    /**
     * <p>
     * The result of the evaluation, including the names of the rules whose conditions have been met (if any), the names
     * of the rules whose conditions have not been met (if any), whether the pull request is in the approved state, and
     * whether the pull request approval rule has been set aside by an override.
     * </p>
     * 
     * @param evaluation
     *        The result of the evaluation, including the names of the rules whose conditions have been met (if any),
     *        the names of the rules whose conditions have not been met (if any), whether the pull request is in the
     *        approved state, and whether the pull request approval rule has been set aside by an override.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatePullRequestApprovalRulesResult withEvaluation(Evaluation evaluation) {
        setEvaluation(evaluation);
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
        if (getEvaluation() != null)
            sb.append("Evaluation: ").append(getEvaluation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluatePullRequestApprovalRulesResult == false)
            return false;
        EvaluatePullRequestApprovalRulesResult other = (EvaluatePullRequestApprovalRulesResult) obj;
        if (other.getEvaluation() == null ^ this.getEvaluation() == null)
            return false;
        if (other.getEvaluation() != null && other.getEvaluation().equals(this.getEvaluation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluation() == null) ? 0 : getEvaluation().hashCode());
        return hashCode;
    }

    @Override
    public EvaluatePullRequestApprovalRulesResult clone() {
        try {
            return (EvaluatePullRequestApprovalRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
