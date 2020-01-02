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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteSolution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSolutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the solution to delete.
     * </p>
     */
    private String solutionArn;

    /**
     * <p>
     * The ARN of the solution to delete.
     * </p>
     * 
     * @param solutionArn
     *        The ARN of the solution to delete.
     */

    public void setSolutionArn(String solutionArn) {
        this.solutionArn = solutionArn;
    }

    /**
     * <p>
     * The ARN of the solution to delete.
     * </p>
     * 
     * @return The ARN of the solution to delete.
     */

    public String getSolutionArn() {
        return this.solutionArn;
    }

    /**
     * <p>
     * The ARN of the solution to delete.
     * </p>
     * 
     * @param solutionArn
     *        The ARN of the solution to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSolutionRequest withSolutionArn(String solutionArn) {
        setSolutionArn(solutionArn);
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
        if (getSolutionArn() != null)
            sb.append("SolutionArn: ").append(getSolutionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSolutionRequest == false)
            return false;
        DeleteSolutionRequest other = (DeleteSolutionRequest) obj;
        if (other.getSolutionArn() == null ^ this.getSolutionArn() == null)
            return false;
        if (other.getSolutionArn() != null && other.getSolutionArn().equals(this.getSolutionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSolutionArn() == null) ? 0 : getSolutionArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSolutionRequest clone() {
        return (DeleteSolutionRequest) super.clone();
    }

}
