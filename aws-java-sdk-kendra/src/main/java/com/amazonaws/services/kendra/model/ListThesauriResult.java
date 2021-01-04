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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListThesauri" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListThesauriResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of thesauri.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of summary information for one or more thesauruses.
     * </p>
     */
    private java.util.List<ThesaurusSummary> thesaurusSummaryItems;

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of thesauri.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request
     *        to retrieve the next set of thesauri.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of thesauri.
     * </p>
     * 
     * @return If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request
     *         to retrieve the next set of thesauri.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to
     * retrieve the next set of thesauri.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request
     *        to retrieve the next set of thesauri.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThesauriResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of summary information for one or more thesauruses.
     * </p>
     * 
     * @return An array of summary information for one or more thesauruses.
     */

    public java.util.List<ThesaurusSummary> getThesaurusSummaryItems() {
        return thesaurusSummaryItems;
    }

    /**
     * <p>
     * An array of summary information for one or more thesauruses.
     * </p>
     * 
     * @param thesaurusSummaryItems
     *        An array of summary information for one or more thesauruses.
     */

    public void setThesaurusSummaryItems(java.util.Collection<ThesaurusSummary> thesaurusSummaryItems) {
        if (thesaurusSummaryItems == null) {
            this.thesaurusSummaryItems = null;
            return;
        }

        this.thesaurusSummaryItems = new java.util.ArrayList<ThesaurusSummary>(thesaurusSummaryItems);
    }

    /**
     * <p>
     * An array of summary information for one or more thesauruses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThesaurusSummaryItems(java.util.Collection)} or
     * {@link #withThesaurusSummaryItems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param thesaurusSummaryItems
     *        An array of summary information for one or more thesauruses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThesauriResult withThesaurusSummaryItems(ThesaurusSummary... thesaurusSummaryItems) {
        if (this.thesaurusSummaryItems == null) {
            setThesaurusSummaryItems(new java.util.ArrayList<ThesaurusSummary>(thesaurusSummaryItems.length));
        }
        for (ThesaurusSummary ele : thesaurusSummaryItems) {
            this.thesaurusSummaryItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of summary information for one or more thesauruses.
     * </p>
     * 
     * @param thesaurusSummaryItems
     *        An array of summary information for one or more thesauruses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThesauriResult withThesaurusSummaryItems(java.util.Collection<ThesaurusSummary> thesaurusSummaryItems) {
        setThesaurusSummaryItems(thesaurusSummaryItems);
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
        if (getThesaurusSummaryItems() != null)
            sb.append("ThesaurusSummaryItems: ").append(getThesaurusSummaryItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListThesauriResult == false)
            return false;
        ListThesauriResult other = (ListThesauriResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getThesaurusSummaryItems() == null ^ this.getThesaurusSummaryItems() == null)
            return false;
        if (other.getThesaurusSummaryItems() != null && other.getThesaurusSummaryItems().equals(this.getThesaurusSummaryItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getThesaurusSummaryItems() == null) ? 0 : getThesaurusSummaryItems().hashCode());
        return hashCode;
    }

    @Override
    public ListThesauriResult clone() {
        try {
            return (ListThesauriResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
