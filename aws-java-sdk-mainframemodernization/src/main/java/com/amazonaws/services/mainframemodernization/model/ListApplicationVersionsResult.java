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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListApplicationVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of application versions.
     * </p>
     */
    private java.util.List<ApplicationVersionSummary> applicationVersions;
    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to
     * retrieve the next set of items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of application versions.
     * </p>
     * 
     * @return The list of application versions.
     */

    public java.util.List<ApplicationVersionSummary> getApplicationVersions() {
        return applicationVersions;
    }

    /**
     * <p>
     * The list of application versions.
     * </p>
     * 
     * @param applicationVersions
     *        The list of application versions.
     */

    public void setApplicationVersions(java.util.Collection<ApplicationVersionSummary> applicationVersions) {
        if (applicationVersions == null) {
            this.applicationVersions = null;
            return;
        }

        this.applicationVersions = new java.util.ArrayList<ApplicationVersionSummary>(applicationVersions);
    }

    /**
     * <p>
     * The list of application versions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationVersions(java.util.Collection)} or {@link #withApplicationVersions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param applicationVersions
     *        The list of application versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationVersionsResult withApplicationVersions(ApplicationVersionSummary... applicationVersions) {
        if (this.applicationVersions == null) {
            setApplicationVersions(new java.util.ArrayList<ApplicationVersionSummary>(applicationVersions.length));
        }
        for (ApplicationVersionSummary ele : applicationVersions) {
            this.applicationVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of application versions.
     * </p>
     * 
     * @param applicationVersions
     *        The list of application versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationVersionsResult withApplicationVersions(java.util.Collection<ApplicationVersionSummary> applicationVersions) {
        setApplicationVersions(applicationVersions);
        return this;
    }

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to
     * retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If there are more items to return, this contains a token that is passed to a subsequent call to this
     *        operation to retrieve the next set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to
     * retrieve the next set of items.
     * </p>
     * 
     * @return If there are more items to return, this contains a token that is passed to a subsequent call to this
     *         operation to retrieve the next set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to
     * retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If there are more items to return, this contains a token that is passed to a subsequent call to this
     *        operation to retrieve the next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationVersionsResult withNextToken(String nextToken) {
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
        if (getApplicationVersions() != null)
            sb.append("ApplicationVersions: ").append(getApplicationVersions()).append(",");
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

        if (obj instanceof ListApplicationVersionsResult == false)
            return false;
        ListApplicationVersionsResult other = (ListApplicationVersionsResult) obj;
        if (other.getApplicationVersions() == null ^ this.getApplicationVersions() == null)
            return false;
        if (other.getApplicationVersions() != null && other.getApplicationVersions().equals(this.getApplicationVersions()) == false)
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

        hashCode = prime * hashCode + ((getApplicationVersions() == null) ? 0 : getApplicationVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationVersionsResult clone() {
        try {
            return (ListApplicationVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
