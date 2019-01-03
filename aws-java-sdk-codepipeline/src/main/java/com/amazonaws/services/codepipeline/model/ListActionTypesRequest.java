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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a ListActionTypes action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListActionTypes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListActionTypesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters the list of action types to those created by a specified entity.
     * </p>
     */
    private String actionOwnerFilter;
    /**
     * <p>
     * An identifier that was returned from the previous list action types call, which can be used to return the next
     * set of action types in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Filters the list of action types to those created by a specified entity.
     * </p>
     * 
     * @param actionOwnerFilter
     *        Filters the list of action types to those created by a specified entity.
     * @see ActionOwner
     */

    public void setActionOwnerFilter(String actionOwnerFilter) {
        this.actionOwnerFilter = actionOwnerFilter;
    }

    /**
     * <p>
     * Filters the list of action types to those created by a specified entity.
     * </p>
     * 
     * @return Filters the list of action types to those created by a specified entity.
     * @see ActionOwner
     */

    public String getActionOwnerFilter() {
        return this.actionOwnerFilter;
    }

    /**
     * <p>
     * Filters the list of action types to those created by a specified entity.
     * </p>
     * 
     * @param actionOwnerFilter
     *        Filters the list of action types to those created by a specified entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionOwner
     */

    public ListActionTypesRequest withActionOwnerFilter(String actionOwnerFilter) {
        setActionOwnerFilter(actionOwnerFilter);
        return this;
    }

    /**
     * <p>
     * Filters the list of action types to those created by a specified entity.
     * </p>
     * 
     * @param actionOwnerFilter
     *        Filters the list of action types to those created by a specified entity.
     * @see ActionOwner
     */

    public void setActionOwnerFilter(ActionOwner actionOwnerFilter) {
        withActionOwnerFilter(actionOwnerFilter);
    }

    /**
     * <p>
     * Filters the list of action types to those created by a specified entity.
     * </p>
     * 
     * @param actionOwnerFilter
     *        Filters the list of action types to those created by a specified entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionOwner
     */

    public ListActionTypesRequest withActionOwnerFilter(ActionOwner actionOwnerFilter) {
        this.actionOwnerFilter = actionOwnerFilter.toString();
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous list action types call, which can be used to return the next
     * set of action types in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous list action types call, which can be used to return the
     *        next set of action types in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous list action types call, which can be used to return the next
     * set of action types in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous list action types call, which can be used to return the
     *         next set of action types in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous list action types call, which can be used to return the next
     * set of action types in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous list action types call, which can be used to return the
     *        next set of action types in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListActionTypesRequest withNextToken(String nextToken) {
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
        if (getActionOwnerFilter() != null)
            sb.append("ActionOwnerFilter: ").append(getActionOwnerFilter()).append(",");
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

        if (obj instanceof ListActionTypesRequest == false)
            return false;
        ListActionTypesRequest other = (ListActionTypesRequest) obj;
        if (other.getActionOwnerFilter() == null ^ this.getActionOwnerFilter() == null)
            return false;
        if (other.getActionOwnerFilter() != null && other.getActionOwnerFilter().equals(this.getActionOwnerFilter()) == false)
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

        hashCode = prime * hashCode + ((getActionOwnerFilter() == null) ? 0 : getActionOwnerFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListActionTypesRequest clone() {
        return (ListActionTypesRequest) super.clone();
    }

}
