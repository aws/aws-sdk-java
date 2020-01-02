/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListFaqs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFaqsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>ListFaqs</code> operation returns a page of FAQs at a time. The maximum size of the page is set by the
     * <code>MaxResults</code> parameter. If there are more jobs in the list than the page size, Amazon Kendra returns
     * the <code>NextPage</code> token. Include the token in the next request to the <code>ListFaqs</code> operation to
     * return the next page of FAQs.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * information about the FAQs associated with the specified index.
     * </p>
     */
    private java.util.List<FaqSummary> faqSummaryItems;

    /**
     * <p>
     * The <code>ListFaqs</code> operation returns a page of FAQs at a time. The maximum size of the page is set by the
     * <code>MaxResults</code> parameter. If there are more jobs in the list than the page size, Amazon Kendra returns
     * the <code>NextPage</code> token. Include the token in the next request to the <code>ListFaqs</code> operation to
     * return the next page of FAQs.
     * </p>
     * 
     * @param nextToken
     *        The <code>ListFaqs</code> operation returns a page of FAQs at a time. The maximum size of the page is set
     *        by the <code>MaxResults</code> parameter. If there are more jobs in the list than the page size, Amazon
     *        Kendra returns the <code>NextPage</code> token. Include the token in the next request to the
     *        <code>ListFaqs</code> operation to return the next page of FAQs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>ListFaqs</code> operation returns a page of FAQs at a time. The maximum size of the page is set by the
     * <code>MaxResults</code> parameter. If there are more jobs in the list than the page size, Amazon Kendra returns
     * the <code>NextPage</code> token. Include the token in the next request to the <code>ListFaqs</code> operation to
     * return the next page of FAQs.
     * </p>
     * 
     * @return The <code>ListFaqs</code> operation returns a page of FAQs at a time. The maximum size of the page is set
     *         by the <code>MaxResults</code> parameter. If there are more jobs in the list than the page size, Amazon
     *         Kendra returns the <code>NextPage</code> token. Include the token in the next request to the
     *         <code>ListFaqs</code> operation to return the next page of FAQs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>ListFaqs</code> operation returns a page of FAQs at a time. The maximum size of the page is set by the
     * <code>MaxResults</code> parameter. If there are more jobs in the list than the page size, Amazon Kendra returns
     * the <code>NextPage</code> token. Include the token in the next request to the <code>ListFaqs</code> operation to
     * return the next page of FAQs.
     * </p>
     * 
     * @param nextToken
     *        The <code>ListFaqs</code> operation returns a page of FAQs at a time. The maximum size of the page is set
     *        by the <code>MaxResults</code> parameter. If there are more jobs in the list than the page size, Amazon
     *        Kendra returns the <code>NextPage</code> token. Include the token in the next request to the
     *        <code>ListFaqs</code> operation to return the next page of FAQs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFaqsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * information about the FAQs associated with the specified index.
     * </p>
     * 
     * @return information about the FAQs associated with the specified index.
     */

    public java.util.List<FaqSummary> getFaqSummaryItems() {
        return faqSummaryItems;
    }

    /**
     * <p>
     * information about the FAQs associated with the specified index.
     * </p>
     * 
     * @param faqSummaryItems
     *        information about the FAQs associated with the specified index.
     */

    public void setFaqSummaryItems(java.util.Collection<FaqSummary> faqSummaryItems) {
        if (faqSummaryItems == null) {
            this.faqSummaryItems = null;
            return;
        }

        this.faqSummaryItems = new java.util.ArrayList<FaqSummary>(faqSummaryItems);
    }

    /**
     * <p>
     * information about the FAQs associated with the specified index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFaqSummaryItems(java.util.Collection)} or {@link #withFaqSummaryItems(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param faqSummaryItems
     *        information about the FAQs associated with the specified index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFaqsResult withFaqSummaryItems(FaqSummary... faqSummaryItems) {
        if (this.faqSummaryItems == null) {
            setFaqSummaryItems(new java.util.ArrayList<FaqSummary>(faqSummaryItems.length));
        }
        for (FaqSummary ele : faqSummaryItems) {
            this.faqSummaryItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * information about the FAQs associated with the specified index.
     * </p>
     * 
     * @param faqSummaryItems
     *        information about the FAQs associated with the specified index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFaqsResult withFaqSummaryItems(java.util.Collection<FaqSummary> faqSummaryItems) {
        setFaqSummaryItems(faqSummaryItems);
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
        if (getFaqSummaryItems() != null)
            sb.append("FaqSummaryItems: ").append(getFaqSummaryItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFaqsResult == false)
            return false;
        ListFaqsResult other = (ListFaqsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFaqSummaryItems() == null ^ this.getFaqSummaryItems() == null)
            return false;
        if (other.getFaqSummaryItems() != null && other.getFaqSummaryItems().equals(this.getFaqSummaryItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFaqSummaryItems() == null) ? 0 : getFaqSummaryItems().hashCode());
        return hashCode;
    }

    @Override
    public ListFaqsResult clone() {
        try {
            return (ListFaqsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
