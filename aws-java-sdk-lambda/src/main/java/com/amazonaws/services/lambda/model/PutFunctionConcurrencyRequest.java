/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionConcurrency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutFunctionConcurrencyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the function you are setting concurrent execution limits on.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * The concurrent execution limit reserved for this function.
     * </p>
     */
    private Integer reservedConcurrentExecutions;

    /**
     * <p>
     * The name of the function you are setting concurrent execution limits on.
     * </p>
     * 
     * @param functionName
     *        The name of the function you are setting concurrent execution limits on.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the function you are setting concurrent execution limits on.
     * </p>
     * 
     * @return The name of the function you are setting concurrent execution limits on.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the function you are setting concurrent execution limits on.
     * </p>
     * 
     * @param functionName
     *        The name of the function you are setting concurrent execution limits on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFunctionConcurrencyRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * The concurrent execution limit reserved for this function.
     * </p>
     * 
     * @param reservedConcurrentExecutions
     *        The concurrent execution limit reserved for this function.
     */

    public void setReservedConcurrentExecutions(Integer reservedConcurrentExecutions) {
        this.reservedConcurrentExecutions = reservedConcurrentExecutions;
    }

    /**
     * <p>
     * The concurrent execution limit reserved for this function.
     * </p>
     * 
     * @return The concurrent execution limit reserved for this function.
     */

    public Integer getReservedConcurrentExecutions() {
        return this.reservedConcurrentExecutions;
    }

    /**
     * <p>
     * The concurrent execution limit reserved for this function.
     * </p>
     * 
     * @param reservedConcurrentExecutions
     *        The concurrent execution limit reserved for this function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFunctionConcurrencyRequest withReservedConcurrentExecutions(Integer reservedConcurrentExecutions) {
        setReservedConcurrentExecutions(reservedConcurrentExecutions);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
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

        if (obj instanceof PutFunctionConcurrencyRequest == false)
            return false;
        PutFunctionConcurrencyRequest other = (PutFunctionConcurrencyRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getReservedConcurrentExecutions() == null) ? 0 : getReservedConcurrentExecutions().hashCode());
        return hashCode;
    }

    @Override
    public PutFunctionConcurrencyRequest clone() {
        return (PutFunctionConcurrencyRequest) super.clone();
    }

}
