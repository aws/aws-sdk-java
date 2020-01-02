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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeProblem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProblemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the problem.
     * </p>
     */
    private Problem problem;

    /**
     * <p>
     * Information about the problem.
     * </p>
     * 
     * @param problem
     *        Information about the problem.
     */

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    /**
     * <p>
     * Information about the problem.
     * </p>
     * 
     * @return Information about the problem.
     */

    public Problem getProblem() {
        return this.problem;
    }

    /**
     * <p>
     * Information about the problem.
     * </p>
     * 
     * @param problem
     *        Information about the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProblemResult withProblem(Problem problem) {
        setProblem(problem);
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
        if (getProblem() != null)
            sb.append("Problem: ").append(getProblem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProblemResult == false)
            return false;
        DescribeProblemResult other = (DescribeProblemResult) obj;
        if (other.getProblem() == null ^ this.getProblem() == null)
            return false;
        if (other.getProblem() != null && other.getProblem().equals(this.getProblem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProblem() == null) ? 0 : getProblem().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProblemResult clone() {
        try {
            return (DescribeProblemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
