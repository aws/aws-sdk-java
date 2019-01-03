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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to list the receipt rule sets that exist under your AWS account. You use receipt rule sets to
 * receive email with Amazon SES. For more information, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-concepts.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListReceiptRuleSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReceiptRuleSetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token returned from a previous call to <code>ListReceiptRuleSets</code> to indicate the position in the receipt
     * rule set list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A token returned from a previous call to <code>ListReceiptRuleSets</code> to indicate the position in the receipt
     * rule set list.
     * </p>
     * 
     * @param nextToken
     *        A token returned from a previous call to <code>ListReceiptRuleSets</code> to indicate the position in the
     *        receipt rule set list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListReceiptRuleSets</code> to indicate the position in the receipt
     * rule set list.
     * </p>
     * 
     * @return A token returned from a previous call to <code>ListReceiptRuleSets</code> to indicate the position in the
     *         receipt rule set list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListReceiptRuleSets</code> to indicate the position in the receipt
     * rule set list.
     * </p>
     * 
     * @param nextToken
     *        A token returned from a previous call to <code>ListReceiptRuleSets</code> to indicate the position in the
     *        receipt rule set list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReceiptRuleSetsRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListReceiptRuleSetsRequest == false)
            return false;
        ListReceiptRuleSetsRequest other = (ListReceiptRuleSetsRequest) obj;
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListReceiptRuleSetsRequest clone() {
        return (ListReceiptRuleSetsRequest) super.clone();
    }

}
