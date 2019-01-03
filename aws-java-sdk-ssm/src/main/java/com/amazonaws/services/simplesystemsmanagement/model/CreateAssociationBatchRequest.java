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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateAssociationBatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssociationBatchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more associations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CreateAssociationBatchRequestEntry> entries;

    /**
     * <p>
     * One or more associations.
     * </p>
     * 
     * @return One or more associations.
     */

    public java.util.List<CreateAssociationBatchRequestEntry> getEntries() {
        if (entries == null) {
            entries = new com.amazonaws.internal.SdkInternalList<CreateAssociationBatchRequestEntry>();
        }
        return entries;
    }

    /**
     * <p>
     * One or more associations.
     * </p>
     * 
     * @param entries
     *        One or more associations.
     */

    public void setEntries(java.util.Collection<CreateAssociationBatchRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new com.amazonaws.internal.SdkInternalList<CreateAssociationBatchRequestEntry>(entries);
    }

    /**
     * <p>
     * One or more associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        One or more associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationBatchRequest withEntries(CreateAssociationBatchRequestEntry... entries) {
        if (this.entries == null) {
            setEntries(new com.amazonaws.internal.SdkInternalList<CreateAssociationBatchRequestEntry>(entries.length));
        }
        for (CreateAssociationBatchRequestEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more associations.
     * </p>
     * 
     * @param entries
     *        One or more associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssociationBatchRequest withEntries(java.util.Collection<CreateAssociationBatchRequestEntry> entries) {
        setEntries(entries);
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
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssociationBatchRequest == false)
            return false;
        CreateAssociationBatchRequest other = (CreateAssociationBatchRequest) obj;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssociationBatchRequest clone() {
        return (CreateAssociationBatchRequest) super.clone();
    }

}
