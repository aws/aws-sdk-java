/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about worlds that failed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/FailureSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailureSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of failures.
     * </p>
     */
    private Integer totalFailureCount;
    /**
     * <p>
     * The worlds that failed.
     * </p>
     */
    private java.util.List<WorldFailure> failures;

    /**
     * <p>
     * The total number of failures.
     * </p>
     * 
     * @param totalFailureCount
     *        The total number of failures.
     */

    public void setTotalFailureCount(Integer totalFailureCount) {
        this.totalFailureCount = totalFailureCount;
    }

    /**
     * <p>
     * The total number of failures.
     * </p>
     * 
     * @return The total number of failures.
     */

    public Integer getTotalFailureCount() {
        return this.totalFailureCount;
    }

    /**
     * <p>
     * The total number of failures.
     * </p>
     * 
     * @param totalFailureCount
     *        The total number of failures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureSummary withTotalFailureCount(Integer totalFailureCount) {
        setTotalFailureCount(totalFailureCount);
        return this;
    }

    /**
     * <p>
     * The worlds that failed.
     * </p>
     * 
     * @return The worlds that failed.
     */

    public java.util.List<WorldFailure> getFailures() {
        return failures;
    }

    /**
     * <p>
     * The worlds that failed.
     * </p>
     * 
     * @param failures
     *        The worlds that failed.
     */

    public void setFailures(java.util.Collection<WorldFailure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new java.util.ArrayList<WorldFailure>(failures);
    }

    /**
     * <p>
     * The worlds that failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailures(java.util.Collection)} or {@link #withFailures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param failures
     *        The worlds that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureSummary withFailures(WorldFailure... failures) {
        if (this.failures == null) {
            setFailures(new java.util.ArrayList<WorldFailure>(failures.length));
        }
        for (WorldFailure ele : failures) {
            this.failures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The worlds that failed.
     * </p>
     * 
     * @param failures
     *        The worlds that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailureSummary withFailures(java.util.Collection<WorldFailure> failures) {
        setFailures(failures);
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
        if (getTotalFailureCount() != null)
            sb.append("TotalFailureCount: ").append(getTotalFailureCount()).append(",");
        if (getFailures() != null)
            sb.append("Failures: ").append(getFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailureSummary == false)
            return false;
        FailureSummary other = (FailureSummary) obj;
        if (other.getTotalFailureCount() == null ^ this.getTotalFailureCount() == null)
            return false;
        if (other.getTotalFailureCount() != null && other.getTotalFailureCount().equals(this.getTotalFailureCount()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalFailureCount() == null) ? 0 : getTotalFailureCount().hashCode());
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        return hashCode;
    }

    @Override
    public FailureSummary clone() {
        try {
            return (FailureSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.FailureSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
