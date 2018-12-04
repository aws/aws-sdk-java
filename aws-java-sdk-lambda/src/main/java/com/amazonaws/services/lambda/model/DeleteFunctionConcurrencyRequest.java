/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunctionConcurrency" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFunctionConcurrencyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the function you are removing concurrent execution limits from. For more information, see
     * <a>concurrent-executions</a>.
     * </p>
     */
    private String functionName;

    /**
     * <p>
     * The name of the function you are removing concurrent execution limits from. For more information, see
     * <a>concurrent-executions</a>.
     * </p>
     * 
     * @param functionName
     *        The name of the function you are removing concurrent execution limits from. For more information, see
     *        <a>concurrent-executions</a>.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the function you are removing concurrent execution limits from. For more information, see
     * <a>concurrent-executions</a>.
     * </p>
     * 
     * @return The name of the function you are removing concurrent execution limits from. For more information, see
     *         <a>concurrent-executions</a>.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the function you are removing concurrent execution limits from. For more information, see
     * <a>concurrent-executions</a>.
     * </p>
     * 
     * @param functionName
     *        The name of the function you are removing concurrent execution limits from. For more information, see
     *        <a>concurrent-executions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFunctionConcurrencyRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
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
            sb.append("FunctionName: ").append(getFunctionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFunctionConcurrencyRequest == false)
            return false;
        DeleteFunctionConcurrencyRequest other = (DeleteFunctionConcurrencyRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFunctionConcurrencyRequest clone() {
        return (DeleteFunctionConcurrencyRequest) super.clone();
    }

}
