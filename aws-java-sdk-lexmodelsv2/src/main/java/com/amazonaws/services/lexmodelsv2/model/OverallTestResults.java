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
 * Information about the overall test results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/OverallTestResults" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OverallTestResults implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the overall test results.
     * </p>
     */
    private java.util.List<OverallTestResultItem> items;

    /**
     * <p>
     * A list of the overall test results.
     * </p>
     * 
     * @return A list of the overall test results.
     */

    public java.util.List<OverallTestResultItem> getItems() {
        return items;
    }

    /**
     * <p>
     * A list of the overall test results.
     * </p>
     * 
     * @param items
     *        A list of the overall test results.
     */

    public void setItems(java.util.Collection<OverallTestResultItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<OverallTestResultItem>(items);
    }

    /**
     * <p>
     * A list of the overall test results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A list of the overall test results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverallTestResults withItems(OverallTestResultItem... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<OverallTestResultItem>(items.length));
        }
        for (OverallTestResultItem ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the overall test results.
     * </p>
     * 
     * @param items
     *        A list of the overall test results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverallTestResults withItems(java.util.Collection<OverallTestResultItem> items) {
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

        if (obj instanceof OverallTestResults == false)
            return false;
        OverallTestResults other = (OverallTestResults) obj;
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
    public OverallTestResults clone() {
        try {
            return (OverallTestResults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.OverallTestResultsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
