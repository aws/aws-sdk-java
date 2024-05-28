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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetTableOptimizer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetTableOptimizerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>BatchTableOptimizer</code> objects.
     * </p>
     */
    private java.util.List<BatchTableOptimizer> tableOptimizers;
    /**
     * <p>
     * A list of errors from the operation.
     * </p>
     */
    private java.util.List<BatchGetTableOptimizerError> failures;

    /**
     * <p>
     * A list of <code>BatchTableOptimizer</code> objects.
     * </p>
     * 
     * @return A list of <code>BatchTableOptimizer</code> objects.
     */

    public java.util.List<BatchTableOptimizer> getTableOptimizers() {
        return tableOptimizers;
    }

    /**
     * <p>
     * A list of <code>BatchTableOptimizer</code> objects.
     * </p>
     * 
     * @param tableOptimizers
     *        A list of <code>BatchTableOptimizer</code> objects.
     */

    public void setTableOptimizers(java.util.Collection<BatchTableOptimizer> tableOptimizers) {
        if (tableOptimizers == null) {
            this.tableOptimizers = null;
            return;
        }

        this.tableOptimizers = new java.util.ArrayList<BatchTableOptimizer>(tableOptimizers);
    }

    /**
     * <p>
     * A list of <code>BatchTableOptimizer</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTableOptimizers(java.util.Collection)} or {@link #withTableOptimizers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param tableOptimizers
     *        A list of <code>BatchTableOptimizer</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTableOptimizerResult withTableOptimizers(BatchTableOptimizer... tableOptimizers) {
        if (this.tableOptimizers == null) {
            setTableOptimizers(new java.util.ArrayList<BatchTableOptimizer>(tableOptimizers.length));
        }
        for (BatchTableOptimizer ele : tableOptimizers) {
            this.tableOptimizers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>BatchTableOptimizer</code> objects.
     * </p>
     * 
     * @param tableOptimizers
     *        A list of <code>BatchTableOptimizer</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTableOptimizerResult withTableOptimizers(java.util.Collection<BatchTableOptimizer> tableOptimizers) {
        setTableOptimizers(tableOptimizers);
        return this;
    }

    /**
     * <p>
     * A list of errors from the operation.
     * </p>
     * 
     * @return A list of errors from the operation.
     */

    public java.util.List<BatchGetTableOptimizerError> getFailures() {
        return failures;
    }

    /**
     * <p>
     * A list of errors from the operation.
     * </p>
     * 
     * @param failures
     *        A list of errors from the operation.
     */

    public void setFailures(java.util.Collection<BatchGetTableOptimizerError> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new java.util.ArrayList<BatchGetTableOptimizerError>(failures);
    }

    /**
     * <p>
     * A list of errors from the operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailures(java.util.Collection)} or {@link #withFailures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param failures
     *        A list of errors from the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTableOptimizerResult withFailures(BatchGetTableOptimizerError... failures) {
        if (this.failures == null) {
            setFailures(new java.util.ArrayList<BatchGetTableOptimizerError>(failures.length));
        }
        for (BatchGetTableOptimizerError ele : failures) {
            this.failures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors from the operation.
     * </p>
     * 
     * @param failures
     *        A list of errors from the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetTableOptimizerResult withFailures(java.util.Collection<BatchGetTableOptimizerError> failures) {
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
        if (getTableOptimizers() != null)
            sb.append("TableOptimizers: ").append(getTableOptimizers()).append(",");
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

        if (obj instanceof BatchGetTableOptimizerResult == false)
            return false;
        BatchGetTableOptimizerResult other = (BatchGetTableOptimizerResult) obj;
        if (other.getTableOptimizers() == null ^ this.getTableOptimizers() == null)
            return false;
        if (other.getTableOptimizers() != null && other.getTableOptimizers().equals(this.getTableOptimizers()) == false)
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

        hashCode = prime * hashCode + ((getTableOptimizers() == null) ? 0 : getTableOptimizers().hashCode());
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetTableOptimizerResult clone() {
        try {
            return (BatchGetTableOptimizerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
