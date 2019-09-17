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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ListTerminologies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTerminologiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The properties list of the custom terminologies returned on the list request.
     * </p>
     */
    private java.util.List<TerminologyProperties> terminologyPropertiesList;
    /**
     * <p>
     * If the response to the ListTerminologies was truncated, the NextToken fetches the next group of custom
     * terminologies.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The properties list of the custom terminologies returned on the list request.
     * </p>
     * 
     * @return The properties list of the custom terminologies returned on the list request.
     */

    public java.util.List<TerminologyProperties> getTerminologyPropertiesList() {
        return terminologyPropertiesList;
    }

    /**
     * <p>
     * The properties list of the custom terminologies returned on the list request.
     * </p>
     * 
     * @param terminologyPropertiesList
     *        The properties list of the custom terminologies returned on the list request.
     */

    public void setTerminologyPropertiesList(java.util.Collection<TerminologyProperties> terminologyPropertiesList) {
        if (terminologyPropertiesList == null) {
            this.terminologyPropertiesList = null;
            return;
        }

        this.terminologyPropertiesList = new java.util.ArrayList<TerminologyProperties>(terminologyPropertiesList);
    }

    /**
     * <p>
     * The properties list of the custom terminologies returned on the list request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTerminologyPropertiesList(java.util.Collection)} or
     * {@link #withTerminologyPropertiesList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param terminologyPropertiesList
     *        The properties list of the custom terminologies returned on the list request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTerminologiesResult withTerminologyPropertiesList(TerminologyProperties... terminologyPropertiesList) {
        if (this.terminologyPropertiesList == null) {
            setTerminologyPropertiesList(new java.util.ArrayList<TerminologyProperties>(terminologyPropertiesList.length));
        }
        for (TerminologyProperties ele : terminologyPropertiesList) {
            this.terminologyPropertiesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The properties list of the custom terminologies returned on the list request.
     * </p>
     * 
     * @param terminologyPropertiesList
     *        The properties list of the custom terminologies returned on the list request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTerminologiesResult withTerminologyPropertiesList(java.util.Collection<TerminologyProperties> terminologyPropertiesList) {
        setTerminologyPropertiesList(terminologyPropertiesList);
        return this;
    }

    /**
     * <p>
     * If the response to the ListTerminologies was truncated, the NextToken fetches the next group of custom
     * terminologies.
     * </p>
     * 
     * @param nextToken
     *        If the response to the ListTerminologies was truncated, the NextToken fetches the next group of custom
     *        terminologies.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response to the ListTerminologies was truncated, the NextToken fetches the next group of custom
     * terminologies.
     * </p>
     * 
     * @return If the response to the ListTerminologies was truncated, the NextToken fetches the next group of custom
     *         terminologies.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response to the ListTerminologies was truncated, the NextToken fetches the next group of custom
     * terminologies.
     * </p>
     * 
     * @param nextToken
     *        If the response to the ListTerminologies was truncated, the NextToken fetches the next group of custom
     *        terminologies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTerminologiesResult withNextToken(String nextToken) {
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
        if (getTerminologyPropertiesList() != null)
            sb.append("TerminologyPropertiesList: ").append(getTerminologyPropertiesList()).append(",");
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

        if (obj instanceof ListTerminologiesResult == false)
            return false;
        ListTerminologiesResult other = (ListTerminologiesResult) obj;
        if (other.getTerminologyPropertiesList() == null ^ this.getTerminologyPropertiesList() == null)
            return false;
        if (other.getTerminologyPropertiesList() != null && other.getTerminologyPropertiesList().equals(this.getTerminologyPropertiesList()) == false)
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

        hashCode = prime * hashCode + ((getTerminologyPropertiesList() == null) ? 0 : getTerminologyPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTerminologiesResult clone() {
        try {
            return (ListTerminologiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
