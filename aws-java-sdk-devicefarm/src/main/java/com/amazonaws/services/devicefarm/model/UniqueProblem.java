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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of one or more problems, grouped by their result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UniqueProblem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UniqueProblem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A message about the unique problems' result.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Information about the problems.
     * </p>
     */
    private java.util.List<Problem> problems;

    /**
     * <p>
     * A message about the unique problems' result.
     * </p>
     * 
     * @param message
     *        A message about the unique problems' result.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message about the unique problems' result.
     * </p>
     * 
     * @return A message about the unique problems' result.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message about the unique problems' result.
     * </p>
     * 
     * @param message
     *        A message about the unique problems' result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UniqueProblem withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Information about the problems.
     * </p>
     * 
     * @return Information about the problems.
     */

    public java.util.List<Problem> getProblems() {
        return problems;
    }

    /**
     * <p>
     * Information about the problems.
     * </p>
     * 
     * @param problems
     *        Information about the problems.
     */

    public void setProblems(java.util.Collection<Problem> problems) {
        if (problems == null) {
            this.problems = null;
            return;
        }

        this.problems = new java.util.ArrayList<Problem>(problems);
    }

    /**
     * <p>
     * Information about the problems.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProblems(java.util.Collection)} or {@link #withProblems(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param problems
     *        Information about the problems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UniqueProblem withProblems(Problem... problems) {
        if (this.problems == null) {
            setProblems(new java.util.ArrayList<Problem>(problems.length));
        }
        for (Problem ele : problems) {
            this.problems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the problems.
     * </p>
     * 
     * @param problems
     *        Information about the problems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UniqueProblem withProblems(java.util.Collection<Problem> problems) {
        setProblems(problems);
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getProblems() != null)
            sb.append("Problems: ").append(getProblems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UniqueProblem == false)
            return false;
        UniqueProblem other = (UniqueProblem) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getProblems() == null ^ this.getProblems() == null)
            return false;
        if (other.getProblems() != null && other.getProblems().equals(this.getProblems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getProblems() == null) ? 0 : getProblems().hashCode());
        return hashCode;
    }

    @Override
    public UniqueProblem clone() {
        try {
            return (UniqueProblem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.UniqueProblemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
