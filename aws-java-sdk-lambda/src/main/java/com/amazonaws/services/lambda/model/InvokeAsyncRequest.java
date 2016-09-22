/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class InvokeAsyncRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Lambda function name.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
     * </p>
     */
    private java.io.InputStream invokeArgs;

    /**
     * <p>
     * The Lambda function name.
     * </p>
     * 
     * @param functionName
     *        The Lambda function name.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The Lambda function name.
     * </p>
     * 
     * @return The Lambda function name.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The Lambda function name.
     * </p>
     * 
     * @param functionName
     *        The Lambda function name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeAsyncRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
     * </p>
     * 
     * @param invokeArgs
     *        JSON that you want to provide to your Lambda function as input.
     */

    public void setInvokeArgs(java.io.InputStream invokeArgs) {
        this.invokeArgs = invokeArgs;
    }

    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
     * </p>
     * 
     * @return JSON that you want to provide to your Lambda function as input.
     */

    public java.io.InputStream getInvokeArgs() {
        return this.invokeArgs;
    }

    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
     * </p>
     * 
     * @param invokeArgs
     *        JSON that you want to provide to your Lambda function as input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeAsyncRequest withInvokeArgs(java.io.InputStream invokeArgs) {
        setInvokeArgs(invokeArgs);
        return this;
    }

    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
     * </p>
     * 
     * @param invokeArgs
     *        JSON that you want to provide to your Lambda function as input.
     */
    public void setInvokeArgs(String invokeArgs) {
        setInvokeArgs(new com.amazonaws.adapters.types.StringToInputStreamAdapter().adapt(invokeArgs));
    }

    /**
     * <p>
     * JSON that you want to provide to your Lambda function as input.
     * </p>
     * 
     * @param invokeArgs
     *        JSON that you want to provide to your Lambda function as input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public InvokeAsyncRequest withInvokeArgs(String invokeArgs) {
        setInvokeArgs(new com.amazonaws.adapters.types.StringToInputStreamAdapter().adapt(invokeArgs));
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
            sb.append("FunctionName: " + getFunctionName() + ",");
        if (getInvokeArgs() != null)
            sb.append("InvokeArgs: " + getInvokeArgs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvokeAsyncRequest == false)
            return false;
        InvokeAsyncRequest other = (InvokeAsyncRequest) obj;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getInvokeArgs() == null ^ this.getInvokeArgs() == null)
            return false;
        if (other.getInvokeArgs() != null && other.getInvokeArgs().equals(this.getInvokeArgs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getInvokeArgs() == null) ? 0 : getInvokeArgs().hashCode());
        return hashCode;
    }

    @Override
    public InvokeAsyncRequest clone() {
        return (InvokeAsyncRequest) super.clone();
    }
}
