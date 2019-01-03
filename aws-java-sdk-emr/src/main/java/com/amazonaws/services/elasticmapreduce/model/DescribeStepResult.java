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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This output contains the description of the cluster step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/DescribeStep" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStepResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The step details for the requested step identifier.
     * </p>
     */
    private Step step;

    /**
     * <p>
     * The step details for the requested step identifier.
     * </p>
     * 
     * @param step
     *        The step details for the requested step identifier.
     */

    public void setStep(Step step) {
        this.step = step;
    }

    /**
     * <p>
     * The step details for the requested step identifier.
     * </p>
     * 
     * @return The step details for the requested step identifier.
     */

    public Step getStep() {
        return this.step;
    }

    /**
     * <p>
     * The step details for the requested step identifier.
     * </p>
     * 
     * @param step
     *        The step details for the requested step identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStepResult withStep(Step step) {
        setStep(step);
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
        if (getStep() != null)
            sb.append("Step: ").append(getStep());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStepResult == false)
            return false;
        DescribeStepResult other = (DescribeStepResult) obj;
        if (other.getStep() == null ^ this.getStep() == null)
            return false;
        if (other.getStep() != null && other.getStep().equals(this.getStep()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStep() == null) ? 0 : getStep().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStepResult clone() {
        try {
            return (DescribeStepResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
