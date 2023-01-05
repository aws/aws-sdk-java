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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/ListApps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of apps for the given simulation and domain.
     * </p>
     */
    private java.util.List<SimulationAppMetadata> apps;
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
     * The list of apps for the given simulation and domain.
     * </p>
     * 
     * @return The list of apps for the given simulation and domain.
     */

    public java.util.List<SimulationAppMetadata> getApps() {
        return apps;
    }

    /**
     * <p>
     * The list of apps for the given simulation and domain.
     * </p>
     * 
     * @param apps
     *        The list of apps for the given simulation and domain.
     */

    public void setApps(java.util.Collection<SimulationAppMetadata> apps) {
        if (apps == null) {
            this.apps = null;
            return;
        }

        this.apps = new java.util.ArrayList<SimulationAppMetadata>(apps);
    }

    /**
     * <p>
     * The list of apps for the given simulation and domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApps(java.util.Collection)} or {@link #withApps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param apps
     *        The list of apps for the given simulation and domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsResult withApps(SimulationAppMetadata... apps) {
        if (this.apps == null) {
            setApps(new java.util.ArrayList<SimulationAppMetadata>(apps.length));
        }
        for (SimulationAppMetadata ele : apps) {
            this.apps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of apps for the given simulation and domain.
     * </p>
     * 
     * @param apps
     *        The list of apps for the given simulation and domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsResult withApps(java.util.Collection<SimulationAppMetadata> apps) {
        setApps(apps);
        return this;
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

    public ListAppsResult withNextToken(String nextToken) {
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
        if (getApps() != null)
            sb.append("Apps: ").append(getApps()).append(",");
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

        if (obj instanceof ListAppsResult == false)
            return false;
        ListAppsResult other = (ListAppsResult) obj;
        if (other.getApps() == null ^ this.getApps() == null)
            return false;
        if (other.getApps() != null && other.getApps().equals(this.getApps()) == false)
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

        hashCode = prime * hashCode + ((getApps() == null) ? 0 : getApps().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppsResult clone() {
        try {
            return (ListAppsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
