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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListSpaces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSpacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of spaces.
     * </p>
     */
    private java.util.List<SpaceDetails> spaces;
    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of spaces.
     * </p>
     * 
     * @return The list of spaces.
     */

    public java.util.List<SpaceDetails> getSpaces() {
        return spaces;
    }

    /**
     * <p>
     * The list of spaces.
     * </p>
     * 
     * @param spaces
     *        The list of spaces.
     */

    public void setSpaces(java.util.Collection<SpaceDetails> spaces) {
        if (spaces == null) {
            this.spaces = null;
            return;
        }

        this.spaces = new java.util.ArrayList<SpaceDetails>(spaces);
    }

    /**
     * <p>
     * The list of spaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpaces(java.util.Collection)} or {@link #withSpaces(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param spaces
     *        The list of spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSpacesResult withSpaces(SpaceDetails... spaces) {
        if (this.spaces == null) {
            setSpaces(new java.util.ArrayList<SpaceDetails>(spaces.length));
        }
        for (SpaceDetails ele : spaces) {
            this.spaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of spaces.
     * </p>
     * 
     * @param spaces
     *        The list of spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSpacesResult withSpaces(java.util.Collection<SpaceDetails> spaces) {
        setSpaces(spaces);
        return this;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you will receive this token. Use it in your next request to
     *        receive the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     * 
     * @return If the previous response was truncated, you will receive this token. Use it in your next request to
     *         receive the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you will receive this token. Use it in your next request to
     *        receive the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSpacesResult withNextToken(String nextToken) {
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
        if (getSpaces() != null)
            sb.append("Spaces: ").append(getSpaces()).append(",");
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

        if (obj instanceof ListSpacesResult == false)
            return false;
        ListSpacesResult other = (ListSpacesResult) obj;
        if (other.getSpaces() == null ^ this.getSpaces() == null)
            return false;
        if (other.getSpaces() != null && other.getSpaces().equals(this.getSpaces()) == false)
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

        hashCode = prime * hashCode + ((getSpaces() == null) ? 0 : getSpaces().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSpacesResult clone() {
        try {
            return (ListSpacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
