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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/ListSimulations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSimulationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, <code>nextToken</code>
     * is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide a token that isn't
     * valid, you receive an <i>HTTP 400 ValidationException</i> error.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of simulations.
     * </p>
     */
    private java.util.List<SimulationMetadata> simulations;

    /**
     * <p>
     * If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, <code>nextToken</code>
     * is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide a token that isn't
     * valid, you receive an <i>HTTP 400 ValidationException</i> error.
     * </p>
     * 
     * @param nextToken
     *        If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain,
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, you receive an <i>HTTP 400 ValidationException</i> error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, <code>nextToken</code>
     * is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide a token that isn't
     * valid, you receive an <i>HTTP 400 ValidationException</i> error.
     * </p>
     * 
     * @return If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *         operation again using the returned token. Keep all other arguments unchanged. If no results remain,
     *         <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *         provide a token that isn't valid, you receive an <i>HTTP 400 ValidationException</i> error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, <code>nextToken</code>
     * is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide a token that isn't
     * valid, you receive an <i>HTTP 400 ValidationException</i> error.
     * </p>
     * 
     * @param nextToken
     *        If SimSpace Weaver returns <code>nextToken</code>, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain,
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, you receive an <i>HTTP 400 ValidationException</i> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSimulationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of simulations.
     * </p>
     * 
     * @return The list of simulations.
     */

    public java.util.List<SimulationMetadata> getSimulations() {
        return simulations;
    }

    /**
     * <p>
     * The list of simulations.
     * </p>
     * 
     * @param simulations
     *        The list of simulations.
     */

    public void setSimulations(java.util.Collection<SimulationMetadata> simulations) {
        if (simulations == null) {
            this.simulations = null;
            return;
        }

        this.simulations = new java.util.ArrayList<SimulationMetadata>(simulations);
    }

    /**
     * <p>
     * The list of simulations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSimulations(java.util.Collection)} or {@link #withSimulations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param simulations
     *        The list of simulations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSimulationsResult withSimulations(SimulationMetadata... simulations) {
        if (this.simulations == null) {
            setSimulations(new java.util.ArrayList<SimulationMetadata>(simulations.length));
        }
        for (SimulationMetadata ele : simulations) {
            this.simulations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of simulations.
     * </p>
     * 
     * @param simulations
     *        The list of simulations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSimulationsResult withSimulations(java.util.Collection<SimulationMetadata> simulations) {
        setSimulations(simulations);
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
        if (getSimulations() != null)
            sb.append("Simulations: ").append(getSimulations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSimulationsResult == false)
            return false;
        ListSimulationsResult other = (ListSimulationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSimulations() == null ^ this.getSimulations() == null)
            return false;
        if (other.getSimulations() != null && other.getSimulations().equals(this.getSimulations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSimulations() == null) ? 0 : getSimulations().hashCode());
        return hashCode;
    }

    @Override
    public ListSimulationsResult clone() {
        try {
            return (ListSimulationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
