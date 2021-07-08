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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListProtocolsLists" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProtocolsListsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>ProtocolsListDataSummary</code> objects.
     * </p>
     */
    private java.util.List<ProtocolsListDataSummary> protocolsLists;
    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than the
     * maximum, Firewall Manager returns this token in the response. You can use this token in subsequent requests to
     * retrieve the next batch of objects.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>ProtocolsListDataSummary</code> objects.
     * </p>
     * 
     * @return An array of <code>ProtocolsListDataSummary</code> objects.
     */

    public java.util.List<ProtocolsListDataSummary> getProtocolsLists() {
        return protocolsLists;
    }

    /**
     * <p>
     * An array of <code>ProtocolsListDataSummary</code> objects.
     * </p>
     * 
     * @param protocolsLists
     *        An array of <code>ProtocolsListDataSummary</code> objects.
     */

    public void setProtocolsLists(java.util.Collection<ProtocolsListDataSummary> protocolsLists) {
        if (protocolsLists == null) {
            this.protocolsLists = null;
            return;
        }

        this.protocolsLists = new java.util.ArrayList<ProtocolsListDataSummary>(protocolsLists);
    }

    /**
     * <p>
     * An array of <code>ProtocolsListDataSummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocolsLists(java.util.Collection)} or {@link #withProtocolsLists(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param protocolsLists
     *        An array of <code>ProtocolsListDataSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtocolsListsResult withProtocolsLists(ProtocolsListDataSummary... protocolsLists) {
        if (this.protocolsLists == null) {
            setProtocolsLists(new java.util.ArrayList<ProtocolsListDataSummary>(protocolsLists.length));
        }
        for (ProtocolsListDataSummary ele : protocolsLists) {
            this.protocolsLists.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ProtocolsListDataSummary</code> objects.
     * </p>
     * 
     * @param protocolsLists
     *        An array of <code>ProtocolsListDataSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtocolsListsResult withProtocolsLists(java.util.Collection<ProtocolsListDataSummary> protocolsLists) {
        setProtocolsLists(protocolsLists);
        return this;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than the
     * maximum, Firewall Manager returns this token in the response. You can use this token in subsequent requests to
     * retrieve the next batch of objects.
     * </p>
     * 
     * @param nextToken
     *        If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than
     *        the maximum, Firewall Manager returns this token in the response. You can use this token in subsequent
     *        requests to retrieve the next batch of objects.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than the
     * maximum, Firewall Manager returns this token in the response. You can use this token in subsequent requests to
     * retrieve the next batch of objects.
     * </p>
     * 
     * @return If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than
     *         the maximum, Firewall Manager returns this token in the response. You can use this token in subsequent
     *         requests to retrieve the next batch of objects.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than the
     * maximum, Firewall Manager returns this token in the response. You can use this token in subsequent requests to
     * retrieve the next batch of objects.
     * </p>
     * 
     * @param nextToken
     *        If you specify a value for <code>MaxResults</code> in your list request, and you have more objects than
     *        the maximum, Firewall Manager returns this token in the response. You can use this token in subsequent
     *        requests to retrieve the next batch of objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProtocolsListsResult withNextToken(String nextToken) {
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
        if (getProtocolsLists() != null)
            sb.append("ProtocolsLists: ").append(getProtocolsLists()).append(",");
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

        if (obj instanceof ListProtocolsListsResult == false)
            return false;
        ListProtocolsListsResult other = (ListProtocolsListsResult) obj;
        if (other.getProtocolsLists() == null ^ this.getProtocolsLists() == null)
            return false;
        if (other.getProtocolsLists() != null && other.getProtocolsLists().equals(this.getProtocolsLists()) == false)
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

        hashCode = prime * hashCode + ((getProtocolsLists() == null) ? 0 : getProtocolsLists().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListProtocolsListsResult clone() {
        try {
            return (ListProtocolsListsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
