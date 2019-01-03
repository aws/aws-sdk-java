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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAutomationStepExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAutomationStepExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of details about the current state of all steps that make up an execution.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StepExecution> stepExecutions;
    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of details about the current state of all steps that make up an execution.
     * </p>
     * 
     * @return A list of details about the current state of all steps that make up an execution.
     */

    public java.util.List<StepExecution> getStepExecutions() {
        if (stepExecutions == null) {
            stepExecutions = new com.amazonaws.internal.SdkInternalList<StepExecution>();
        }
        return stepExecutions;
    }

    /**
     * <p>
     * A list of details about the current state of all steps that make up an execution.
     * </p>
     * 
     * @param stepExecutions
     *        A list of details about the current state of all steps that make up an execution.
     */

    public void setStepExecutions(java.util.Collection<StepExecution> stepExecutions) {
        if (stepExecutions == null) {
            this.stepExecutions = null;
            return;
        }

        this.stepExecutions = new com.amazonaws.internal.SdkInternalList<StepExecution>(stepExecutions);
    }

    /**
     * <p>
     * A list of details about the current state of all steps that make up an execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStepExecutions(java.util.Collection)} or {@link #withStepExecutions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stepExecutions
     *        A list of details about the current state of all steps that make up an execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutomationStepExecutionsResult withStepExecutions(StepExecution... stepExecutions) {
        if (this.stepExecutions == null) {
            setStepExecutions(new com.amazonaws.internal.SdkInternalList<StepExecution>(stepExecutions.length));
        }
        for (StepExecution ele : stepExecutions) {
            this.stepExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of details about the current state of all steps that make up an execution.
     * </p>
     * 
     * @param stepExecutions
     *        A list of details about the current state of all steps that make up an execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutomationStepExecutionsResult withStepExecutions(java.util.Collection<StepExecution> stepExecutions) {
        setStepExecutions(stepExecutions);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @return The token to use when requesting the next set of items. If there are no additional items to return, the
     *         string is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutomationStepExecutionsResult withNextToken(String nextToken) {
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
        if (getStepExecutions() != null)
            sb.append("StepExecutions: ").append(getStepExecutions()).append(",");
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

        if (obj instanceof DescribeAutomationStepExecutionsResult == false)
            return false;
        DescribeAutomationStepExecutionsResult other = (DescribeAutomationStepExecutionsResult) obj;
        if (other.getStepExecutions() == null ^ this.getStepExecutions() == null)
            return false;
        if (other.getStepExecutions() != null && other.getStepExecutions().equals(this.getStepExecutions()) == false)
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

        hashCode = prime * hashCode + ((getStepExecutions() == null) ? 0 : getStepExecutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAutomationStepExecutionsResult clone() {
        try {
            return (DescribeAutomationStepExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
