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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctionEventInvokeConfigs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFunctionEventInvokeConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of configurations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FunctionEventInvokeConfig> functionEventInvokeConfigs;
    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * A list of configurations.
     * </p>
     * 
     * @return A list of configurations.
     */

    public java.util.List<FunctionEventInvokeConfig> getFunctionEventInvokeConfigs() {
        if (functionEventInvokeConfigs == null) {
            functionEventInvokeConfigs = new com.amazonaws.internal.SdkInternalList<FunctionEventInvokeConfig>();
        }
        return functionEventInvokeConfigs;
    }

    /**
     * <p>
     * A list of configurations.
     * </p>
     * 
     * @param functionEventInvokeConfigs
     *        A list of configurations.
     */

    public void setFunctionEventInvokeConfigs(java.util.Collection<FunctionEventInvokeConfig> functionEventInvokeConfigs) {
        if (functionEventInvokeConfigs == null) {
            this.functionEventInvokeConfigs = null;
            return;
        }

        this.functionEventInvokeConfigs = new com.amazonaws.internal.SdkInternalList<FunctionEventInvokeConfig>(functionEventInvokeConfigs);
    }

    /**
     * <p>
     * A list of configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFunctionEventInvokeConfigs(java.util.Collection)} or
     * {@link #withFunctionEventInvokeConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param functionEventInvokeConfigs
     *        A list of configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionEventInvokeConfigsResult withFunctionEventInvokeConfigs(FunctionEventInvokeConfig... functionEventInvokeConfigs) {
        if (this.functionEventInvokeConfigs == null) {
            setFunctionEventInvokeConfigs(new com.amazonaws.internal.SdkInternalList<FunctionEventInvokeConfig>(functionEventInvokeConfigs.length));
        }
        for (FunctionEventInvokeConfig ele : functionEventInvokeConfigs) {
            this.functionEventInvokeConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of configurations.
     * </p>
     * 
     * @param functionEventInvokeConfigs
     *        A list of configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionEventInvokeConfigsResult withFunctionEventInvokeConfigs(java.util.Collection<FunctionEventInvokeConfig> functionEventInvokeConfigs) {
        setFunctionEventInvokeConfigs(functionEventInvokeConfigs);
        return this;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextMarker
     *        The pagination token that's included if more results are available.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @return The pagination token that's included if more results are available.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextMarker
     *        The pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFunctionEventInvokeConfigsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
        if (getFunctionEventInvokeConfigs() != null)
            sb.append("FunctionEventInvokeConfigs: ").append(getFunctionEventInvokeConfigs()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFunctionEventInvokeConfigsResult == false)
            return false;
        ListFunctionEventInvokeConfigsResult other = (ListFunctionEventInvokeConfigsResult) obj;
        if (other.getFunctionEventInvokeConfigs() == null ^ this.getFunctionEventInvokeConfigs() == null)
            return false;
        if (other.getFunctionEventInvokeConfigs() != null && other.getFunctionEventInvokeConfigs().equals(this.getFunctionEventInvokeConfigs()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionEventInvokeConfigs() == null) ? 0 : getFunctionEventInvokeConfigs().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListFunctionEventInvokeConfigsResult clone() {
        try {
            return (ListFunctionEventInvokeConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
