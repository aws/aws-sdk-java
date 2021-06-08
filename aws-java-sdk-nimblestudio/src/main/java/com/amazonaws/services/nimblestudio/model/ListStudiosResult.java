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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStudios" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStudiosResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A collection of studios.
     * </p>
     */
    private java.util.List<Studio> studios;

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudiosResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A collection of studios.
     * </p>
     * 
     * @return A collection of studios.
     */

    public java.util.List<Studio> getStudios() {
        return studios;
    }

    /**
     * <p>
     * A collection of studios.
     * </p>
     * 
     * @param studios
     *        A collection of studios.
     */

    public void setStudios(java.util.Collection<Studio> studios) {
        if (studios == null) {
            this.studios = null;
            return;
        }

        this.studios = new java.util.ArrayList<Studio>(studios);
    }

    /**
     * <p>
     * A collection of studios.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStudios(java.util.Collection)} or {@link #withStudios(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param studios
     *        A collection of studios.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudiosResult withStudios(Studio... studios) {
        if (this.studios == null) {
            setStudios(new java.util.ArrayList<Studio>(studios.length));
        }
        for (Studio ele : studios) {
            this.studios.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of studios.
     * </p>
     * 
     * @param studios
     *        A collection of studios.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStudiosResult withStudios(java.util.Collection<Studio> studios) {
        setStudios(studios);
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
        if (getStudios() != null)
            sb.append("Studios: ").append(getStudios());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStudiosResult == false)
            return false;
        ListStudiosResult other = (ListStudiosResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStudios() == null ^ this.getStudios() == null)
            return false;
        if (other.getStudios() != null && other.getStudios().equals(this.getStudios()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStudios() == null) ? 0 : getStudios().hashCode());
        return hashCode;
    }

    @Override
    public ListStudiosResult clone() {
        try {
            return (ListStudiosResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
