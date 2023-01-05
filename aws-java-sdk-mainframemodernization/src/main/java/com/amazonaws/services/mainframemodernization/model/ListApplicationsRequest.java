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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/ListApplications" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the runtime environment where the applications are deployed.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The maximum number of applications to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The names of the applications.
     * </p>
     */
    private java.util.List<String> names;
    /**
     * <p>
     * A pagination token to control the number of applications displayed in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier of the runtime environment where the applications are deployed.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the runtime environment where the applications are deployed.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The unique identifier of the runtime environment where the applications are deployed.
     * </p>
     * 
     * @return The unique identifier of the runtime environment where the applications are deployed.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The unique identifier of the runtime environment where the applications are deployed.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the runtime environment where the applications are deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The maximum number of applications to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of applications to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of applications to return.
     * </p>
     * 
     * @return The maximum number of applications to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of applications to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of applications to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The names of the applications.
     * </p>
     * 
     * @return The names of the applications.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * The names of the applications.
     * </p>
     * 
     * @param names
     *        The names of the applications.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * The names of the applications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        The names of the applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequest withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the applications.
     * </p>
     * 
     * @param names
     *        The names of the applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequest withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * <p>
     * A pagination token to control the number of applications displayed in the list.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to control the number of applications displayed in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token to control the number of applications displayed in the list.
     * </p>
     * 
     * @return A pagination token to control the number of applications displayed in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token to control the number of applications displayed in the list.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to control the number of applications displayed in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequest withNextToken(String nextToken) {
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNames() != null)
            sb.append("Names: ").append(getNames()).append(",");
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

        if (obj instanceof ListApplicationsRequest == false)
            return false;
        ListApplicationsRequest other = (ListApplicationsRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
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

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationsRequest clone() {
        return (ListApplicationsRequest) super.clone();
    }

}
