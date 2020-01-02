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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListInputs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInputsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about the inputs.
     * </p>
     */
    private java.util.List<InputSummary> inputSummaries;
    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about the inputs.
     * </p>
     * 
     * @return Summary information about the inputs.
     */

    public java.util.List<InputSummary> getInputSummaries() {
        return inputSummaries;
    }

    /**
     * <p>
     * Summary information about the inputs.
     * </p>
     * 
     * @param inputSummaries
     *        Summary information about the inputs.
     */

    public void setInputSummaries(java.util.Collection<InputSummary> inputSummaries) {
        if (inputSummaries == null) {
            this.inputSummaries = null;
            return;
        }

        this.inputSummaries = new java.util.ArrayList<InputSummary>(inputSummaries);
    }

    /**
     * <p>
     * Summary information about the inputs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputSummaries(java.util.Collection)} or {@link #withInputSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputSummaries
     *        Summary information about the inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputsResult withInputSummaries(InputSummary... inputSummaries) {
        if (this.inputSummaries == null) {
            setInputSummaries(new java.util.ArrayList<InputSummary>(inputSummaries.length));
        }
        for (InputSummary ele : inputSummaries) {
            this.inputSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the inputs.
     * </p>
     * 
     * @param inputSummaries
     *        Summary information about the inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputsResult withInputSummaries(java.util.Collection<InputSummary> inputSummaries) {
        setInputSummaries(inputSummaries);
        return this;
    }

    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        A token to retrieve the next set of results, or <code>null</code> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     * 
     * @return A token to retrieve the next set of results, or <code>null</code> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        A token to retrieve the next set of results, or <code>null</code> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getInputSummaries() != null)
            sb.append("InputSummaries: ").append(getInputSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInputsResult == false)
            return false;
        ListInputsResult other = (ListInputsResult) obj;
        if (other.getInputSummaries() == null ^ this.getInputSummaries() == null)
            return false;
        if (other.getInputSummaries() != null && other.getInputSummaries().equals(this.getInputSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputSummaries() == null) ? 0 : getInputSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInputsResult clone() {
        try {
            return (ListInputsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
