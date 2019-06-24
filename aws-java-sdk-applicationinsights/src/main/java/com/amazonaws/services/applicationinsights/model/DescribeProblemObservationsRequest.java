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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/DescribeProblemObservations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProblemObservationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the problem.
     * </p>
     */
    private String problemId;

    /**
     * <p>
     * The ID of the problem.
     * </p>
     * 
     * @param problemId
     *        The ID of the problem.
     */

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }

    /**
     * <p>
     * The ID of the problem.
     * </p>
     * 
     * @return The ID of the problem.
     */

    public String getProblemId() {
        return this.problemId;
    }

    /**
     * <p>
     * The ID of the problem.
     * </p>
     * 
     * @param problemId
     *        The ID of the problem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProblemObservationsRequest withProblemId(String problemId) {
        setProblemId(problemId);
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
        if (getProblemId() != null)
            sb.append("ProblemId: ").append(getProblemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProblemObservationsRequest == false)
            return false;
        DescribeProblemObservationsRequest other = (DescribeProblemObservationsRequest) obj;
        if (other.getProblemId() == null ^ this.getProblemId() == null)
            return false;
        if (other.getProblemId() != null && other.getProblemId().equals(this.getProblemId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProblemId() == null) ? 0 : getProblemId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProblemObservationsRequest clone() {
        return (DescribeProblemObservationsRequest) super.clone();
    }

}
