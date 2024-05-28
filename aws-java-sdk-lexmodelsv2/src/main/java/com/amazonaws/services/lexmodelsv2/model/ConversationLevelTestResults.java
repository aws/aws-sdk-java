/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The test set results data at the conversation level.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ConversationLevelTestResults"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConversationLevelTestResults implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The item list in the test set results data at the conversation level.
     * </p>
     */
    private java.util.List<ConversationLevelTestResultItem> items;

    /**
     * <p>
     * The item list in the test set results data at the conversation level.
     * </p>
     * 
     * @return The item list in the test set results data at the conversation level.
     */

    public java.util.List<ConversationLevelTestResultItem> getItems() {
        return items;
    }

    /**
     * <p>
     * The item list in the test set results data at the conversation level.
     * </p>
     * 
     * @param items
     *        The item list in the test set results data at the conversation level.
     */

    public void setItems(java.util.Collection<ConversationLevelTestResultItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<ConversationLevelTestResultItem>(items);
    }

    /**
     * <p>
     * The item list in the test set results data at the conversation level.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The item list in the test set results data at the conversation level.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLevelTestResults withItems(ConversationLevelTestResultItem... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<ConversationLevelTestResultItem>(items.length));
        }
        for (ConversationLevelTestResultItem ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The item list in the test set results data at the conversation level.
     * </p>
     * 
     * @param items
     *        The item list in the test set results data at the conversation level.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLevelTestResults withItems(java.util.Collection<ConversationLevelTestResultItem> items) {
        setItems(items);
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
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConversationLevelTestResults == false)
            return false;
        ConversationLevelTestResults other = (ConversationLevelTestResults) obj;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public ConversationLevelTestResults clone() {
        try {
            return (ConversationLevelTestResults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.ConversationLevelTestResultsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
