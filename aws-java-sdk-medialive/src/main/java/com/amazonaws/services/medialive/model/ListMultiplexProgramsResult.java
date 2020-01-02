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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for ListMultiplexProgramsResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListMultiplexPrograms" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMultiplexProgramsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** List of multiplex programs. */
    private java.util.List<MultiplexProgramSummary> multiplexPrograms;
    /** Token for the next ListMultiplexProgram request. */
    private String nextToken;

    /**
     * List of multiplex programs.
     * 
     * @return List of multiplex programs.
     */

    public java.util.List<MultiplexProgramSummary> getMultiplexPrograms() {
        return multiplexPrograms;
    }

    /**
     * List of multiplex programs.
     * 
     * @param multiplexPrograms
     *        List of multiplex programs.
     */

    public void setMultiplexPrograms(java.util.Collection<MultiplexProgramSummary> multiplexPrograms) {
        if (multiplexPrograms == null) {
            this.multiplexPrograms = null;
            return;
        }

        this.multiplexPrograms = new java.util.ArrayList<MultiplexProgramSummary>(multiplexPrograms);
    }

    /**
     * List of multiplex programs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMultiplexPrograms(java.util.Collection)} or {@link #withMultiplexPrograms(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param multiplexPrograms
     *        List of multiplex programs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultiplexProgramsResult withMultiplexPrograms(MultiplexProgramSummary... multiplexPrograms) {
        if (this.multiplexPrograms == null) {
            setMultiplexPrograms(new java.util.ArrayList<MultiplexProgramSummary>(multiplexPrograms.length));
        }
        for (MultiplexProgramSummary ele : multiplexPrograms) {
            this.multiplexPrograms.add(ele);
        }
        return this;
    }

    /**
     * List of multiplex programs.
     * 
     * @param multiplexPrograms
     *        List of multiplex programs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultiplexProgramsResult withMultiplexPrograms(java.util.Collection<MultiplexProgramSummary> multiplexPrograms) {
        setMultiplexPrograms(multiplexPrograms);
        return this;
    }

    /**
     * Token for the next ListMultiplexProgram request.
     * 
     * @param nextToken
     *        Token for the next ListMultiplexProgram request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Token for the next ListMultiplexProgram request.
     * 
     * @return Token for the next ListMultiplexProgram request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * Token for the next ListMultiplexProgram request.
     * 
     * @param nextToken
     *        Token for the next ListMultiplexProgram request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultiplexProgramsResult withNextToken(String nextToken) {
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
        if (getMultiplexPrograms() != null)
            sb.append("MultiplexPrograms: ").append(getMultiplexPrograms()).append(",");
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

        if (obj instanceof ListMultiplexProgramsResult == false)
            return false;
        ListMultiplexProgramsResult other = (ListMultiplexProgramsResult) obj;
        if (other.getMultiplexPrograms() == null ^ this.getMultiplexPrograms() == null)
            return false;
        if (other.getMultiplexPrograms() != null && other.getMultiplexPrograms().equals(this.getMultiplexPrograms()) == false)
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

        hashCode = prime * hashCode + ((getMultiplexPrograms() == null) ? 0 : getMultiplexPrograms().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMultiplexProgramsResult clone() {
        try {
            return (ListMultiplexProgramsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
