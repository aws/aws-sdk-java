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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ListParallelData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListParallelDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The properties of the parallel data resources returned by this request.
     * </p>
     */
    private java.util.List<ParallelDataProperties> parallelDataPropertiesList;
    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The properties of the parallel data resources returned by this request.
     * </p>
     * 
     * @return The properties of the parallel data resources returned by this request.
     */

    public java.util.List<ParallelDataProperties> getParallelDataPropertiesList() {
        return parallelDataPropertiesList;
    }

    /**
     * <p>
     * The properties of the parallel data resources returned by this request.
     * </p>
     * 
     * @param parallelDataPropertiesList
     *        The properties of the parallel data resources returned by this request.
     */

    public void setParallelDataPropertiesList(java.util.Collection<ParallelDataProperties> parallelDataPropertiesList) {
        if (parallelDataPropertiesList == null) {
            this.parallelDataPropertiesList = null;
            return;
        }

        this.parallelDataPropertiesList = new java.util.ArrayList<ParallelDataProperties>(parallelDataPropertiesList);
    }

    /**
     * <p>
     * The properties of the parallel data resources returned by this request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParallelDataPropertiesList(java.util.Collection)} or
     * {@link #withParallelDataPropertiesList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param parallelDataPropertiesList
     *        The properties of the parallel data resources returned by this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListParallelDataResult withParallelDataPropertiesList(ParallelDataProperties... parallelDataPropertiesList) {
        if (this.parallelDataPropertiesList == null) {
            setParallelDataPropertiesList(new java.util.ArrayList<ParallelDataProperties>(parallelDataPropertiesList.length));
        }
        for (ParallelDataProperties ele : parallelDataPropertiesList) {
            this.parallelDataPropertiesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The properties of the parallel data resources returned by this request.
     * </p>
     * 
     * @param parallelDataPropertiesList
     *        The properties of the parallel data resources returned by this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListParallelDataResult withParallelDataPropertiesList(java.util.Collection<ParallelDataProperties> parallelDataPropertiesList) {
        setParallelDataPropertiesList(parallelDataPropertiesList);
        return this;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @return The string to use in a subsequent request to get the next page of results in a paginated response. This
     *         value is null if there are no additional pages.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListParallelDataResult withNextToken(String nextToken) {
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
        if (getParallelDataPropertiesList() != null)
            sb.append("ParallelDataPropertiesList: ").append(getParallelDataPropertiesList()).append(",");
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

        if (obj instanceof ListParallelDataResult == false)
            return false;
        ListParallelDataResult other = (ListParallelDataResult) obj;
        if (other.getParallelDataPropertiesList() == null ^ this.getParallelDataPropertiesList() == null)
            return false;
        if (other.getParallelDataPropertiesList() != null && other.getParallelDataPropertiesList().equals(this.getParallelDataPropertiesList()) == false)
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

        hashCode = prime * hashCode + ((getParallelDataPropertiesList() == null) ? 0 : getParallelDataPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListParallelDataResult clone() {
        try {
            return (ListParallelDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
