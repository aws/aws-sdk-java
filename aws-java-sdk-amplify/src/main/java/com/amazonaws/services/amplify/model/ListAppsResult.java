/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Result structure for an Amplify App list request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/ListApps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of Amplify Apps.
     * </p>
     */
    private java.util.List<App> apps;
    /**
     * <p>
     * Pagination token. Set to null to start listing Apps from start. If non-null pagination token is returned in a
     * result, then pass its value in here to list more projects.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of Amplify Apps.
     * </p>
     * 
     * @return List of Amplify Apps.
     */

    public java.util.List<App> getApps() {
        return apps;
    }

    /**
     * <p>
     * List of Amplify Apps.
     * </p>
     * 
     * @param apps
     *        List of Amplify Apps.
     */

    public void setApps(java.util.Collection<App> apps) {
        if (apps == null) {
            this.apps = null;
            return;
        }

        this.apps = new java.util.ArrayList<App>(apps);
    }

    /**
     * <p>
     * List of Amplify Apps.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApps(java.util.Collection)} or {@link #withApps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param apps
     *        List of Amplify Apps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsResult withApps(App... apps) {
        if (this.apps == null) {
            setApps(new java.util.ArrayList<App>(apps.length));
        }
        for (App ele : apps) {
            this.apps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of Amplify Apps.
     * </p>
     * 
     * @param apps
     *        List of Amplify Apps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppsResult withApps(java.util.Collection<App> apps) {
        setApps(apps);
        return this;
    }

    /**
     * <p>
     * Pagination token. Set to null to start listing Apps from start. If non-null pagination token is returned in a
     * result, then pass its value in here to list more projects.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. Set to null to start listing Apps from start. If non-null pagination token is returned
     *        in a result, then pass its value in here to list more projects.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token. Set to null to start listing Apps from start. If non-null pagination token is returned in a
     * result, then pass its value in here to list more projects.
     * </p>
     * 
     * @return Pagination token. Set to null to start listing Apps from start. If non-null pagination token is returned
     *         in a result, then pass its value in here to list more projects.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token. Set to null to start listing Apps from start. If non-null pagination token is returned in a
     * result, then pass its value in here to list more projects.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. Set to null to start listing Apps from start. If non-null pagination token is returned
     *        in a result, then pass its value in here to list more projects.
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
