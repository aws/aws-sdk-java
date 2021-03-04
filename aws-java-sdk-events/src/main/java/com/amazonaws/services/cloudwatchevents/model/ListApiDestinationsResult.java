/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListApiDestinations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApiDestinationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>ApiDestination</code> objects that include information about an API destination.
     * </p>
     */
    private java.util.List<ApiDestination> apiDestinations;
    /**
     * <p>
     * A token you can use in a subsequent request to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>ApiDestination</code> objects that include information about an API destination.
     * </p>
     * 
     * @return An array of <code>ApiDestination</code> objects that include information about an API destination.
     */

    public java.util.List<ApiDestination> getApiDestinations() {
        return apiDestinations;
    }

    /**
     * <p>
     * An array of <code>ApiDestination</code> objects that include information about an API destination.
     * </p>
     * 
     * @param apiDestinations
     *        An array of <code>ApiDestination</code> objects that include information about an API destination.
     */

    public void setApiDestinations(java.util.Collection<ApiDestination> apiDestinations) {
        if (apiDestinations == null) {
            this.apiDestinations = null;
            return;
        }

        this.apiDestinations = new java.util.ArrayList<ApiDestination>(apiDestinations);
    }

    /**
     * <p>
     * An array of <code>ApiDestination</code> objects that include information about an API destination.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApiDestinations(java.util.Collection)} or {@link #withApiDestinations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param apiDestinations
     *        An array of <code>ApiDestination</code> objects that include information about an API destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApiDestinationsResult withApiDestinations(ApiDestination... apiDestinations) {
        if (this.apiDestinations == null) {
            setApiDestinations(new java.util.ArrayList<ApiDestination>(apiDestinations.length));
        }
        for (ApiDestination ele : apiDestinations) {
            this.apiDestinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ApiDestination</code> objects that include information about an API destination.
     * </p>
     * 
     * @param apiDestinations
     *        An array of <code>ApiDestination</code> objects that include information about an API destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApiDestinationsResult withApiDestinations(java.util.Collection<ApiDestination> apiDestinations) {
        setApiDestinations(apiDestinations);
        return this;
    }

    /**
     * <p>
     * A token you can use in a subsequent request to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use in a subsequent request to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token you can use in a subsequent request to retrieve the next set of results.
     * </p>
     * 
     * @return A token you can use in a subsequent request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token you can use in a subsequent request to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use in a subsequent request to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApiDestinationsResult withNextToken(String nextToken) {
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
        if (getApiDestinations() != null)
            sb.append("ApiDestinations: ").append(getApiDestinations()).append(",");
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

        if (obj instanceof ListApiDestinationsResult == false)
            return false;
        ListApiDestinationsResult other = (ListApiDestinationsResult) obj;
        if (other.getApiDestinations() == null ^ this.getApiDestinations() == null)
            return false;
        if (other.getApiDestinations() != null && other.getApiDestinations().equals(this.getApiDestinations()) == false)
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

        hashCode = prime * hashCode + ((getApiDestinations() == null) ? 0 : getApiDestinations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApiDestinationsResult clone() {
        try {
            return (ListApiDestinationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
