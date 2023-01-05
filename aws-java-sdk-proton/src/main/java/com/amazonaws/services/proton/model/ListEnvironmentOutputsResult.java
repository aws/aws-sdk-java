/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListEnvironmentOutputs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEnvironmentOutputsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token that indicates the location of the next environment output in the array of environment outputs, after the
     * current requested list of environment outputs.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of environment outputs with detail data.
     * </p>
     */
    private java.util.List<Output> outputs;

    /**
     * <p>
     * A token that indicates the location of the next environment output in the array of environment outputs, after the
     * current requested list of environment outputs.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next environment output in the array of environment outputs,
     *        after the current requested list of environment outputs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next environment output in the array of environment outputs, after the
     * current requested list of environment outputs.
     * </p>
     * 
     * @return A token that indicates the location of the next environment output in the array of environment outputs,
     *         after the current requested list of environment outputs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next environment output in the array of environment outputs, after the
     * current requested list of environment outputs.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next environment output in the array of environment outputs,
     *        after the current requested list of environment outputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentOutputsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of environment outputs with detail data.
     * </p>
     * 
     * @return An array of environment outputs with detail data.
     */

    public java.util.List<Output> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * An array of environment outputs with detail data.
     * </p>
     * 
     * @param outputs
     *        An array of environment outputs with detail data.
     */

    public void setOutputs(java.util.Collection<Output> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<Output>(outputs);
    }

    /**
     * <p>
     * An array of environment outputs with detail data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        An array of environment outputs with detail data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentOutputsResult withOutputs(Output... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<Output>(outputs.length));
        }
        for (Output ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of environment outputs with detail data.
     * </p>
     * 
     * @param outputs
     *        An array of environment outputs with detail data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEnvironmentOutputsResult withOutputs(java.util.Collection<Output> outputs) {
        setOutputs(outputs);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEnvironmentOutputsResult == false)
            return false;
        ListEnvironmentOutputsResult other = (ListEnvironmentOutputsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        return hashCode;
    }

    @Override
    public ListEnvironmentOutputsResult clone() {
        try {
            return (ListEnvironmentOutputsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
