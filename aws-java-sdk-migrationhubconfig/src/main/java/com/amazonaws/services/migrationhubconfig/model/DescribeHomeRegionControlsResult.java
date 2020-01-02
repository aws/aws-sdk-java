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
package com.amazonaws.services.migrationhubconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/DescribeHomeRegionControls"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHomeRegionControlsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array that contains your <code>HomeRegionControl</code> objects.
     * </p>
     */
    private java.util.List<HomeRegionControl> homeRegionControls;
    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, more results are available. To retrieve the next
     * page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array that contains your <code>HomeRegionControl</code> objects.
     * </p>
     * 
     * @return An array that contains your <code>HomeRegionControl</code> objects.
     */

    public java.util.List<HomeRegionControl> getHomeRegionControls() {
        return homeRegionControls;
    }

    /**
     * <p>
     * An array that contains your <code>HomeRegionControl</code> objects.
     * </p>
     * 
     * @param homeRegionControls
     *        An array that contains your <code>HomeRegionControl</code> objects.
     */

    public void setHomeRegionControls(java.util.Collection<HomeRegionControl> homeRegionControls) {
        if (homeRegionControls == null) {
            this.homeRegionControls = null;
            return;
        }

        this.homeRegionControls = new java.util.ArrayList<HomeRegionControl>(homeRegionControls);
    }

    /**
     * <p>
     * An array that contains your <code>HomeRegionControl</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHomeRegionControls(java.util.Collection)} or {@link #withHomeRegionControls(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param homeRegionControls
     *        An array that contains your <code>HomeRegionControl</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHomeRegionControlsResult withHomeRegionControls(HomeRegionControl... homeRegionControls) {
        if (this.homeRegionControls == null) {
            setHomeRegionControls(new java.util.ArrayList<HomeRegionControl>(homeRegionControls.length));
        }
        for (HomeRegionControl ele : homeRegionControls) {
            this.homeRegionControls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains your <code>HomeRegionControl</code> objects.
     * </p>
     * 
     * @param homeRegionControls
     *        An array that contains your <code>HomeRegionControl</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHomeRegionControlsResult withHomeRegionControls(java.util.Collection<HomeRegionControl> homeRegionControls) {
        setHomeRegionControls(homeRegionControls);
        return this;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, more results are available. To retrieve the next
     * page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @param nextToken
     *        If a <code>NextToken</code> was returned by a previous call, more results are available. To retrieve the
     *        next page of results, make the call again using the returned token in <code>NextToken</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, more results are available. To retrieve the next
     * page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @return If a <code>NextToken</code> was returned by a previous call, more results are available. To retrieve the
     *         next page of results, make the call again using the returned token in <code>NextToken</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, more results are available. To retrieve the next
     * page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @param nextToken
     *        If a <code>NextToken</code> was returned by a previous call, more results are available. To retrieve the
     *        next page of results, make the call again using the returned token in <code>NextToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHomeRegionControlsResult withNextToken(String nextToken) {
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
        if (getHomeRegionControls() != null)
            sb.append("HomeRegionControls: ").append(getHomeRegionControls()).append(",");
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

        if (obj instanceof DescribeHomeRegionControlsResult == false)
            return false;
        DescribeHomeRegionControlsResult other = (DescribeHomeRegionControlsResult) obj;
        if (other.getHomeRegionControls() == null ^ this.getHomeRegionControls() == null)
            return false;
        if (other.getHomeRegionControls() != null && other.getHomeRegionControls().equals(this.getHomeRegionControls()) == false)
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

        hashCode = prime * hashCode + ((getHomeRegionControls() == null) ? 0 : getHomeRegionControls().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHomeRegionControlsResult clone() {
        try {
            return (DescribeHomeRegionControlsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
