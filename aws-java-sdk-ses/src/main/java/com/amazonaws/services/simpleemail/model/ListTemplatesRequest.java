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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/ListTemplates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTemplatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A token returned from a previous call to <code>ListTemplates</code> to indicate the position in the list of email
     * templates.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of templates to return. This value must be at least 1 and less than or equal to 10. If you do
     * not specify a value, or if you specify a value less than 1 or greater than 10, the operation will return up to 10
     * results.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * A token returned from a previous call to <code>ListTemplates</code> to indicate the position in the list of email
     * templates.
     * </p>
     * 
     * @param nextToken
     *        A token returned from a previous call to <code>ListTemplates</code> to indicate the position in the list
     *        of email templates.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListTemplates</code> to indicate the position in the list of email
     * templates.
     * </p>
     * 
     * @return A token returned from a previous call to <code>ListTemplates</code> to indicate the position in the list
     *         of email templates.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListTemplates</code> to indicate the position in the list of email
     * templates.
     * </p>
     * 
     * @param nextToken
     *        A token returned from a previous call to <code>ListTemplates</code> to indicate the position in the list
     *        of email templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of templates to return. This value must be at least 1 and less than or equal to 10. If you do
     * not specify a value, or if you specify a value less than 1 or greater than 10, the operation will return up to 10
     * results.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of templates to return. This value must be at least 1 and less than or equal to 10. If
     *        you do not specify a value, or if you specify a value less than 1 or greater than 10, the operation will
     *        return up to 10 results.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of templates to return. This value must be at least 1 and less than or equal to 10. If you do
     * not specify a value, or if you specify a value less than 1 or greater than 10, the operation will return up to 10
     * results.
     * </p>
     * 
     * @return The maximum number of templates to return. This value must be at least 1 and less than or equal to 10. If
     *         you do not specify a value, or if you specify a value less than 1 or greater than 10, the operation will
     *         return up to 10 results.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of templates to return. This value must be at least 1 and less than or equal to 10. If you do
     * not specify a value, or if you specify a value less than 1 or greater than 10, the operation will return up to 10
     * results.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of templates to return. This value must be at least 1 and less than or equal to 10. If
     *        you do not specify a value, or if you specify a value less than 1 or greater than 10, the operation will
     *        return up to 10 results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplatesRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTemplatesRequest == false)
            return false;
        ListTemplatesRequest other = (ListTemplatesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListTemplatesRequest clone() {
        return (ListTemplatesRequest) super.clone();
    }

}
