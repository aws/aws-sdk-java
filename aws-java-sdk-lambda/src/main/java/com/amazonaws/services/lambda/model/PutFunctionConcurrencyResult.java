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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionConcurrency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutFunctionConcurrencyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of concurrent executions that are reserved for this function. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     * </p>
     */
    private Integer reservedConcurrentExecutions;

    /**
     * <p>
     * The number of concurrent executions that are reserved for this function. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     * </p>
     * 
     * @param reservedConcurrentExecutions
     *        The number of concurrent executions that are reserved for this function. For more information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     */

    public void setReservedConcurrentExecutions(Integer reservedConcurrentExecutions) {
        this.reservedConcurrentExecutions = reservedConcurrentExecutions;
    }

    /**
     * <p>
     * The number of concurrent executions that are reserved for this function. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     * </p>
     * 
     * @return The number of concurrent executions that are reserved for this function. For more information, see <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     */

    public Integer getReservedConcurrentExecutions() {
        return this.reservedConcurrentExecutions;
    }

    /**
     * <p>
     * The number of concurrent executions that are reserved for this function. For more information, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     * </p>
     * 
     * @param reservedConcurrentExecutions
     *        The number of concurrent executions that are reserved for this function. For more information, see <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFunctionConcurrencyResult withReservedConcurrentExecutions(Integer reservedConcurrentExecutions) {
        setReservedConcurrentExecutions(reservedConcurrentExecutions);
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
        if (getReservedConcurrentExecutions() != null)
            sb.append("ReservedConcurrentExecutions: ").append(getReservedConcurrentExecutions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutFunctionConcurrencyResult == false)
            return false;
        PutFunctionConcurrencyResult other = (PutFunctionConcurrencyResult) obj;
        if (other.getReservedConcurrentExecutions() == null ^ this.getReservedConcurrentExecutions() == null)
            return false;
        if (other.getReservedConcurrentExecutions() != null && other.getReservedConcurrentExecutions().equals(this.getReservedConcurrentExecutions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedConcurrentExecutions() == null) ? 0 : getReservedConcurrentExecutions().hashCode());
        return hashCode;
    }

    @Override
    public PutFunctionConcurrencyResult clone() {
        try {
            return (PutFunctionConcurrencyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
