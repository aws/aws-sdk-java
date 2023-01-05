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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeAccountAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountAttributesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of AccountAttributes objects.
     * </p>
     */
    private java.util.List<AccountAttribute> accountAttributes;
    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of AccountAttributes objects.
     * </p>
     * 
     * @return An array of AccountAttributes objects.
     */

    public java.util.List<AccountAttribute> getAccountAttributes() {
        return accountAttributes;
    }

    /**
     * <p>
     * An array of AccountAttributes objects.
     * </p>
     * 
     * @param accountAttributes
     *        An array of AccountAttributes objects.
     */

    public void setAccountAttributes(java.util.Collection<AccountAttribute> accountAttributes) {
        if (accountAttributes == null) {
            this.accountAttributes = null;
            return;
        }

        this.accountAttributes = new java.util.ArrayList<AccountAttribute>(accountAttributes);
    }

    /**
     * <p>
     * An array of AccountAttributes objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountAttributes(java.util.Collection)} or {@link #withAccountAttributes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param accountAttributes
     *        An array of AccountAttributes objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountAttributesResult withAccountAttributes(AccountAttribute... accountAttributes) {
        if (this.accountAttributes == null) {
            setAccountAttributes(new java.util.ArrayList<AccountAttribute>(accountAttributes.length));
        }
        for (AccountAttribute ele : accountAttributes) {
            this.accountAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of AccountAttributes objects.
     * </p>
     * 
     * @param accountAttributes
     *        An array of AccountAttributes objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountAttributesResult withAccountAttributes(java.util.Collection<AccountAttribute> accountAttributes) {
        setAccountAttributes(accountAttributes);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. If this field is empty then there are no more
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results. If this field is empty then there are no more
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. If this field is empty then there are no more
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountAttributesResult withNextToken(String nextToken) {
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
        if (getAccountAttributes() != null)
            sb.append("AccountAttributes: ").append(getAccountAttributes()).append(",");
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

        if (obj instanceof DescribeAccountAttributesResult == false)
            return false;
        DescribeAccountAttributesResult other = (DescribeAccountAttributesResult) obj;
        if (other.getAccountAttributes() == null ^ this.getAccountAttributes() == null)
            return false;
        if (other.getAccountAttributes() != null && other.getAccountAttributes().equals(this.getAccountAttributes()) == false)
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

        hashCode = prime * hashCode + ((getAccountAttributes() == null) ? 0 : getAccountAttributes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccountAttributesResult clone() {
        try {
            return (DescribeAccountAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
