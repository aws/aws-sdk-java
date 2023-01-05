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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListLaunches" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLaunchesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures that contain the configuration details of the launches in the specified project.
     * </p>
     */
    private java.util.List<Launch> launches;
    /**
     * <p>
     * The token to use in a subsequent <code>ListLaunches</code> operation to return the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of structures that contain the configuration details of the launches in the specified project.
     * </p>
     * 
     * @return An array of structures that contain the configuration details of the launches in the specified project.
     */

    public java.util.List<Launch> getLaunches() {
        return launches;
    }

    /**
     * <p>
     * An array of structures that contain the configuration details of the launches in the specified project.
     * </p>
     * 
     * @param launches
     *        An array of structures that contain the configuration details of the launches in the specified project.
     */

    public void setLaunches(java.util.Collection<Launch> launches) {
        if (launches == null) {
            this.launches = null;
            return;
        }

        this.launches = new java.util.ArrayList<Launch>(launches);
    }

    /**
     * <p>
     * An array of structures that contain the configuration details of the launches in the specified project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunches(java.util.Collection)} or {@link #withLaunches(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param launches
     *        An array of structures that contain the configuration details of the launches in the specified project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLaunchesResult withLaunches(Launch... launches) {
        if (this.launches == null) {
            setLaunches(new java.util.ArrayList<Launch>(launches.length));
        }
        for (Launch ele : launches) {
            this.launches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that contain the configuration details of the launches in the specified project.
     * </p>
     * 
     * @param launches
     *        An array of structures that contain the configuration details of the launches in the specified project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLaunchesResult withLaunches(java.util.Collection<Launch> launches) {
        setLaunches(launches);
        return this;
    }

    /**
     * <p>
     * The token to use in a subsequent <code>ListLaunches</code> operation to return the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use in a subsequent <code>ListLaunches</code> operation to return the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use in a subsequent <code>ListLaunches</code> operation to return the next set of results.
     * </p>
     * 
     * @return The token to use in a subsequent <code>ListLaunches</code> operation to return the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use in a subsequent <code>ListLaunches</code> operation to return the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use in a subsequent <code>ListLaunches</code> operation to return the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLaunchesResult withNextToken(String nextToken) {
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
        if (getLaunches() != null)
            sb.append("Launches: ").append(getLaunches()).append(",");
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

        if (obj instanceof ListLaunchesResult == false)
            return false;
        ListLaunchesResult other = (ListLaunchesResult) obj;
        if (other.getLaunches() == null ^ this.getLaunches() == null)
            return false;
        if (other.getLaunches() != null && other.getLaunches().equals(this.getLaunches()) == false)
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

        hashCode = prime * hashCode + ((getLaunches() == null) ? 0 : getLaunches().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLaunchesResult clone() {
        try {
            return (ListLaunchesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
