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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ListApplications" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of application results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of applications that can be listed.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An optional filter for application states. Note that if this filter contains multiple states, the resulting list
     * will be grouped by the state.
     * </p>
     */
    private java.util.List<String> states;

    /**
     * <p>
     * The token for the next set of application results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of application results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of application results.
     * </p>
     * 
     * @return The token for the next set of application results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of application results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of application results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of applications that can be listed.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of applications that can be listed.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of applications that can be listed.
     * </p>
     * 
     * @return The maximum number of applications that can be listed.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of applications that can be listed.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of applications that can be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An optional filter for application states. Note that if this filter contains multiple states, the resulting list
     * will be grouped by the state.
     * </p>
     * 
     * @return An optional filter for application states. Note that if this filter contains multiple states, the
     *         resulting list will be grouped by the state.
     * @see ApplicationState
     */

    public java.util.List<String> getStates() {
        return states;
    }

    /**
     * <p>
     * An optional filter for application states. Note that if this filter contains multiple states, the resulting list
     * will be grouped by the state.
     * </p>
     * 
     * @param states
     *        An optional filter for application states. Note that if this filter contains multiple states, the
     *        resulting list will be grouped by the state.
     * @see ApplicationState
     */

    public void setStates(java.util.Collection<String> states) {
        if (states == null) {
            this.states = null;
            return;
        }

        this.states = new java.util.ArrayList<String>(states);
    }

    /**
     * <p>
     * An optional filter for application states. Note that if this filter contains multiple states, the resulting list
     * will be grouped by the state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStates(java.util.Collection)} or {@link #withStates(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param states
     *        An optional filter for application states. Note that if this filter contains multiple states, the
     *        resulting list will be grouped by the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationState
     */

    public ListApplicationsRequest withStates(String... states) {
        if (this.states == null) {
            setStates(new java.util.ArrayList<String>(states.length));
        }
        for (String ele : states) {
            this.states.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional filter for application states. Note that if this filter contains multiple states, the resulting list
     * will be grouped by the state.
     * </p>
     * 
     * @param states
     *        An optional filter for application states. Note that if this filter contains multiple states, the
     *        resulting list will be grouped by the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationState
     */

    public ListApplicationsRequest withStates(java.util.Collection<String> states) {
        setStates(states);
        return this;
    }

    /**
     * <p>
     * An optional filter for application states. Note that if this filter contains multiple states, the resulting list
     * will be grouped by the state.
     * </p>
     * 
     * @param states
     *        An optional filter for application states. Note that if this filter contains multiple states, the
     *        resulting list will be grouped by the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationState
     */

    public ListApplicationsRequest withStates(ApplicationState... states) {
        java.util.ArrayList<String> statesCopy = new java.util.ArrayList<String>(states.length);
        for (ApplicationState value : states) {
            statesCopy.add(value.toString());
        }
        if (getStates() == null) {
            setStates(statesCopy);
        } else {
            getStates().addAll(statesCopy);
        }
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStates() != null)
            sb.append("States: ").append(getStates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListApplicationsRequest == false)
            return false;
        ListApplicationsRequest other = (ListApplicationsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStates() == null ^ this.getStates() == null)
            return false;
        if (other.getStates() != null && other.getStates().equals(this.getStates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStates() == null) ? 0 : getStates().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationsRequest clone() {
        return (ListApplicationsRequest) super.clone();
    }

}
