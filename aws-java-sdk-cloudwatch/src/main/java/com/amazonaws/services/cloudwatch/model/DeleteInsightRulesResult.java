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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DeleteInsightRules" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteInsightRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array listing the rules that could not be deleted. You cannot delete built-in rules.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PartialFailure> failures;

    /**
     * <p>
     * An array listing the rules that could not be deleted. You cannot delete built-in rules.
     * </p>
     * 
     * @return An array listing the rules that could not be deleted. You cannot delete built-in rules.
     */

    public java.util.List<PartialFailure> getFailures() {
        if (failures == null) {
            failures = new com.amazonaws.internal.SdkInternalList<PartialFailure>();
        }
        return failures;
    }

    /**
     * <p>
     * An array listing the rules that could not be deleted. You cannot delete built-in rules.
     * </p>
     * 
     * @param failures
     *        An array listing the rules that could not be deleted. You cannot delete built-in rules.
     */

    public void setFailures(java.util.Collection<PartialFailure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new com.amazonaws.internal.SdkInternalList<PartialFailure>(failures);
    }

    /**
     * <p>
     * An array listing the rules that could not be deleted. You cannot delete built-in rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailures(java.util.Collection)} or {@link #withFailures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param failures
     *        An array listing the rules that could not be deleted. You cannot delete built-in rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInsightRulesResult withFailures(PartialFailure... failures) {
        if (this.failures == null) {
            setFailures(new com.amazonaws.internal.SdkInternalList<PartialFailure>(failures.length));
        }
        for (PartialFailure ele : failures) {
            this.failures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array listing the rules that could not be deleted. You cannot delete built-in rules.
     * </p>
     * 
     * @param failures
     *        An array listing the rules that could not be deleted. You cannot delete built-in rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInsightRulesResult withFailures(java.util.Collection<PartialFailure> failures) {
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

        if (obj instanceof DeleteInsightRulesResult == false)
            return false;
        DeleteInsightRulesResult other = (DeleteInsightRulesResult) obj;
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

        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInsightRulesResult clone() {
        try {
            return (DeleteInsightRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
