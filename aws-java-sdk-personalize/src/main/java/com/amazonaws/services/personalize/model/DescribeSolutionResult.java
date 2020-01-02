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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeSolution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSolutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that describes the solution.
     * </p>
     */
    private Solution solution;

    /**
     * <p>
     * An object that describes the solution.
     * </p>
     * 
     * @param solution
     *        An object that describes the solution.
     */

    public void setSolution(Solution solution) {
        this.solution = solution;
    }

    /**
     * <p>
     * An object that describes the solution.
     * </p>
     * 
     * @return An object that describes the solution.
     */

    public Solution getSolution() {
        return this.solution;
    }

    /**
     * <p>
     * An object that describes the solution.
     * </p>
     * 
     * @param solution
     *        An object that describes the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSolutionResult withSolution(Solution solution) {
        setSolution(solution);
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
        if (getSolution() != null)
            sb.append("Solution: ").append(getSolution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSolutionResult == false)
            return false;
        DescribeSolutionResult other = (DescribeSolutionResult) obj;
        if (other.getSolution() == null ^ this.getSolution() == null)
            return false;
        if (other.getSolution() != null && other.getSolution().equals(this.getSolution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSolution() == null) ? 0 : getSolution().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSolutionResult clone() {
        try {
            return (DescribeSolutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
