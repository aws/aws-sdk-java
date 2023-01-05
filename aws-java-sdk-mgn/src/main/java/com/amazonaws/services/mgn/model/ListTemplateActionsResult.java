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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListTemplateActions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTemplateActionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of template post migration custom actions.
     * </p>
     */
    private java.util.List<TemplateActionDocument> items;
    /**
     * <p>
     * Next token returned when listing template post migration custom actions.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of template post migration custom actions.
     * </p>
     * 
     * @return List of template post migration custom actions.
     */

    public java.util.List<TemplateActionDocument> getItems() {
        return items;
    }

    /**
     * <p>
     * List of template post migration custom actions.
     * </p>
     * 
     * @param items
     *        List of template post migration custom actions.
     */

    public void setItems(java.util.Collection<TemplateActionDocument> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<TemplateActionDocument>(items);
    }

    /**
     * <p>
     * List of template post migration custom actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        List of template post migration custom actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateActionsResult withItems(TemplateActionDocument... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<TemplateActionDocument>(items.length));
        }
        for (TemplateActionDocument ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of template post migration custom actions.
     * </p>
     * 
     * @param items
     *        List of template post migration custom actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateActionsResult withItems(java.util.Collection<TemplateActionDocument> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * Next token returned when listing template post migration custom actions.
     * </p>
     * 
     * @param nextToken
     *        Next token returned when listing template post migration custom actions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token returned when listing template post migration custom actions.
     * </p>
     * 
     * @return Next token returned when listing template post migration custom actions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token returned when listing template post migration custom actions.
     * </p>
     * 
     * @param nextToken
     *        Next token returned when listing template post migration custom actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTemplateActionsResult withNextToken(String nextToken) {
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
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
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

        if (obj instanceof ListTemplateActionsResult == false)
            return false;
        ListTemplateActionsResult other = (ListTemplateActionsResult) obj;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
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

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTemplateActionsResult clone() {
        try {
            return (ListTemplateActionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
