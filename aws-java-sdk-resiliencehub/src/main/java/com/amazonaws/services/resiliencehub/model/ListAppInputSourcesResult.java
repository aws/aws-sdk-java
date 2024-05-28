/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ListAppInputSources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAppInputSourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of Resilience Hub application input sources.
     * </p>
     */
    private java.util.List<AppInputSource> appInputSources;
    /**
     * <p>
     * Token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of Resilience Hub application input sources.
     * </p>
     * 
     * @return The list of Resilience Hub application input sources.
     */

    public java.util.List<AppInputSource> getAppInputSources() {
        return appInputSources;
    }

    /**
     * <p>
     * The list of Resilience Hub application input sources.
     * </p>
     * 
     * @param appInputSources
     *        The list of Resilience Hub application input sources.
     */

    public void setAppInputSources(java.util.Collection<AppInputSource> appInputSources) {
        if (appInputSources == null) {
            this.appInputSources = null;
            return;
        }

        this.appInputSources = new java.util.ArrayList<AppInputSource>(appInputSources);
    }

    /**
     * <p>
     * The list of Resilience Hub application input sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAppInputSources(java.util.Collection)} or {@link #withAppInputSources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param appInputSources
     *        The list of Resilience Hub application input sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInputSourcesResult withAppInputSources(AppInputSource... appInputSources) {
        if (this.appInputSources == null) {
            setAppInputSources(new java.util.ArrayList<AppInputSource>(appInputSources.length));
        }
        for (AppInputSource ele : appInputSources) {
            this.appInputSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Resilience Hub application input sources.
     * </p>
     * 
     * @param appInputSources
     *        The list of Resilience Hub application input sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInputSourcesResult withAppInputSources(java.util.Collection<AppInputSource> appInputSources) {
        setAppInputSources(appInputSources);
        return this;
    }

    /**
     * <p>
     * Token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return Token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAppInputSourcesResult withNextToken(String nextToken) {
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
        if (getAppInputSources() != null)
            sb.append("AppInputSources: ").append(getAppInputSources()).append(",");
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

        if (obj instanceof ListAppInputSourcesResult == false)
            return false;
        ListAppInputSourcesResult other = (ListAppInputSourcesResult) obj;
        if (other.getAppInputSources() == null ^ this.getAppInputSources() == null)
            return false;
        if (other.getAppInputSources() != null && other.getAppInputSources().equals(this.getAppInputSources()) == false)
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

        hashCode = prime * hashCode + ((getAppInputSources() == null) ? 0 : getAppInputSources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAppInputSourcesResult clone() {
        try {
            return (ListAppInputSourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
