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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The structure representing the listProfilingGroupsResponse.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ListProfilingGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProfilingGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListProfilingGroups</code> request. When the
     * results of a <code>ListProfilingGroups</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about profiling group names.
     * </p>
     */
    private java.util.List<String> profilingGroupNames;
    /**
     * <p>
     * Information about profiling groups.
     * </p>
     */
    private java.util.List<ProfilingGroupDescription> profilingGroups;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListProfilingGroups</code> request. When the
     * results of a <code>ListProfilingGroups</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListProfilingGroups</code> request. When the
     *        results of a <code>ListProfilingGroups</code> request exceed <code>maxResults</code>, this value can be
     *        used to retrieve the next page of results. This value is <code>null</code> when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListProfilingGroups</code> request. When the
     * results of a <code>ListProfilingGroups</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListProfilingGroups</code> request. When
     *         the results of a <code>ListProfilingGroups</code> request exceed <code>maxResults</code>, this value can
     *         be used to retrieve the next page of results. This value is <code>null</code> when there are no more
     *         results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListProfilingGroups</code> request. When the
     * results of a <code>ListProfilingGroups</code> request exceed <code>maxResults</code>, this value can be used to
     * retrieve the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListProfilingGroups</code> request. When the
     *        results of a <code>ListProfilingGroups</code> request exceed <code>maxResults</code>, this value can be
     *        used to retrieve the next page of results. This value is <code>null</code> when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilingGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about profiling group names.
     * </p>
     * 
     * @return Information about profiling group names.
     */

    public java.util.List<String> getProfilingGroupNames() {
        return profilingGroupNames;
    }

    /**
     * <p>
     * Information about profiling group names.
     * </p>
     * 
     * @param profilingGroupNames
     *        Information about profiling group names.
     */

    public void setProfilingGroupNames(java.util.Collection<String> profilingGroupNames) {
        if (profilingGroupNames == null) {
            this.profilingGroupNames = null;
            return;
        }

        this.profilingGroupNames = new java.util.ArrayList<String>(profilingGroupNames);
    }

    /**
     * <p>
     * Information about profiling group names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfilingGroupNames(java.util.Collection)} or {@link #withProfilingGroupNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param profilingGroupNames
     *        Information about profiling group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilingGroupsResult withProfilingGroupNames(String... profilingGroupNames) {
        if (this.profilingGroupNames == null) {
            setProfilingGroupNames(new java.util.ArrayList<String>(profilingGroupNames.length));
        }
        for (String ele : profilingGroupNames) {
            this.profilingGroupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about profiling group names.
     * </p>
     * 
     * @param profilingGroupNames
     *        Information about profiling group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilingGroupsResult withProfilingGroupNames(java.util.Collection<String> profilingGroupNames) {
        setProfilingGroupNames(profilingGroupNames);
        return this;
    }

    /**
     * <p>
     * Information about profiling groups.
     * </p>
     * 
     * @return Information about profiling groups.
     */

    public java.util.List<ProfilingGroupDescription> getProfilingGroups() {
        return profilingGroups;
    }

    /**
     * <p>
     * Information about profiling groups.
     * </p>
     * 
     * @param profilingGroups
     *        Information about profiling groups.
     */

    public void setProfilingGroups(java.util.Collection<ProfilingGroupDescription> profilingGroups) {
        if (profilingGroups == null) {
            this.profilingGroups = null;
            return;
        }

        this.profilingGroups = new java.util.ArrayList<ProfilingGroupDescription>(profilingGroups);
    }

    /**
     * <p>
     * Information about profiling groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfilingGroups(java.util.Collection)} or {@link #withProfilingGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param profilingGroups
     *        Information about profiling groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilingGroupsResult withProfilingGroups(ProfilingGroupDescription... profilingGroups) {
        if (this.profilingGroups == null) {
            setProfilingGroups(new java.util.ArrayList<ProfilingGroupDescription>(profilingGroups.length));
        }
        for (ProfilingGroupDescription ele : profilingGroups) {
            this.profilingGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about profiling groups.
     * </p>
     * 
     * @param profilingGroups
     *        Information about profiling groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProfilingGroupsResult withProfilingGroups(java.util.Collection<ProfilingGroupDescription> profilingGroups) {
        setProfilingGroups(profilingGroups);
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
        if (getProfilingGroupNames() != null)
            sb.append("ProfilingGroupNames: ").append(getProfilingGroupNames()).append(",");
        if (getProfilingGroups() != null)
            sb.append("ProfilingGroups: ").append(getProfilingGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProfilingGroupsResult == false)
            return false;
        ListProfilingGroupsResult other = (ListProfilingGroupsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProfilingGroupNames() == null ^ this.getProfilingGroupNames() == null)
            return false;
        if (other.getProfilingGroupNames() != null && other.getProfilingGroupNames().equals(this.getProfilingGroupNames()) == false)
            return false;
        if (other.getProfilingGroups() == null ^ this.getProfilingGroups() == null)
            return false;
        if (other.getProfilingGroups() != null && other.getProfilingGroups().equals(this.getProfilingGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupNames() == null) ? 0 : getProfilingGroupNames().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroups() == null) ? 0 : getProfilingGroups().hashCode());
        return hashCode;
    }

    @Override
    public ListProfilingGroupsResult clone() {
        try {
            return (ListProfilingGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
