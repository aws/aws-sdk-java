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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/RedriveExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedriveExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date the execution was last redriven.
     * </p>
     */
    private java.util.Date redriveDate;

    /**
     * <p>
     * The date the execution was last redriven.
     * </p>
     * 
     * @param redriveDate
     *        The date the execution was last redriven.
     */

    public void setRedriveDate(java.util.Date redriveDate) {
        this.redriveDate = redriveDate;
    }

    /**
     * <p>
     * The date the execution was last redriven.
     * </p>
     * 
     * @return The date the execution was last redriven.
     */

    public java.util.Date getRedriveDate() {
        return this.redriveDate;
    }

    /**
     * <p>
     * The date the execution was last redriven.
     * </p>
     * 
     * @param redriveDate
     *        The date the execution was last redriven.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedriveExecutionResult withRedriveDate(java.util.Date redriveDate) {
        setRedriveDate(redriveDate);
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
        if (getRedriveDate() != null)
            sb.append("RedriveDate: ").append(getRedriveDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedriveExecutionResult == false)
            return false;
        RedriveExecutionResult other = (RedriveExecutionResult) obj;
        if (other.getRedriveDate() == null ^ this.getRedriveDate() == null)
            return false;
        if (other.getRedriveDate() != null && other.getRedriveDate().equals(this.getRedriveDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRedriveDate() == null) ? 0 : getRedriveDate().hashCode());
        return hashCode;
    }

    @Override
    public RedriveExecutionResult clone() {
        try {
            return (RedriveExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
