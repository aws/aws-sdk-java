/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CancelFlowExecutions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelFlowExecutionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of runs that Amazon AppFlow couldn't cancel. These runs might be ineligible for canceling because they
     * haven't started yet or have already completed.
     * </p>
     */
    private java.util.List<String> invalidExecutions;

    /**
     * <p>
     * The IDs of runs that Amazon AppFlow couldn't cancel. These runs might be ineligible for canceling because they
     * haven't started yet or have already completed.
     * </p>
     * 
     * @return The IDs of runs that Amazon AppFlow couldn't cancel. These runs might be ineligible for canceling because
     *         they haven't started yet or have already completed.
     */

    public java.util.List<String> getInvalidExecutions() {
        return invalidExecutions;
    }

    /**
     * <p>
     * The IDs of runs that Amazon AppFlow couldn't cancel. These runs might be ineligible for canceling because they
     * haven't started yet or have already completed.
     * </p>
     * 
     * @param invalidExecutions
     *        The IDs of runs that Amazon AppFlow couldn't cancel. These runs might be ineligible for canceling because
     *        they haven't started yet or have already completed.
     */

    public void setInvalidExecutions(java.util.Collection<String> invalidExecutions) {
        if (invalidExecutions == null) {
            this.invalidExecutions = null;
            return;
        }

        this.invalidExecutions = new java.util.ArrayList<String>(invalidExecutions);
    }

    /**
     * <p>
     * The IDs of runs that Amazon AppFlow couldn't cancel. These runs might be ineligible for canceling because they
     * haven't started yet or have already completed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvalidExecutions(java.util.Collection)} or {@link #withInvalidExecutions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param invalidExecutions
     *        The IDs of runs that Amazon AppFlow couldn't cancel. These runs might be ineligible for canceling because
     *        they haven't started yet or have already completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelFlowExecutionsResult withInvalidExecutions(String... invalidExecutions) {
        if (this.invalidExecutions == null) {
            setInvalidExecutions(new java.util.ArrayList<String>(invalidExecutions.length));
        }
        for (String ele : invalidExecutions) {
            this.invalidExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of runs that Amazon AppFlow couldn't cancel. These runs might be ineligible for canceling because they
     * haven't started yet or have already completed.
     * </p>
     * 
     * @param invalidExecutions
     *        The IDs of runs that Amazon AppFlow couldn't cancel. These runs might be ineligible for canceling because
     *        they haven't started yet or have already completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelFlowExecutionsResult withInvalidExecutions(java.util.Collection<String> invalidExecutions) {
        setInvalidExecutions(invalidExecutions);
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
        if (getInvalidExecutions() != null)
            sb.append("InvalidExecutions: ").append(getInvalidExecutions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelFlowExecutionsResult == false)
            return false;
        CancelFlowExecutionsResult other = (CancelFlowExecutionsResult) obj;
        if (other.getInvalidExecutions() == null ^ this.getInvalidExecutions() == null)
            return false;
        if (other.getInvalidExecutions() != null && other.getInvalidExecutions().equals(this.getInvalidExecutions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvalidExecutions() == null) ? 0 : getInvalidExecutions().hashCode());
        return hashCode;
    }

    @Override
    public CancelFlowExecutionsResult clone() {
        try {
            return (CancelFlowExecutionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
