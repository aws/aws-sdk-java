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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code>DescribeIndexFields</code> request. Contains the index fields configured for the domain
 * specified in the request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIndexFieldsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The index fields configured for the domain.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IndexFieldStatus> indexFields;

    /**
     * <p>
     * The index fields configured for the domain.
     * </p>
     * 
     * @return The index fields configured for the domain.
     */

    public java.util.List<IndexFieldStatus> getIndexFields() {
        if (indexFields == null) {
            indexFields = new com.amazonaws.internal.SdkInternalList<IndexFieldStatus>();
        }
        return indexFields;
    }

    /**
     * <p>
     * The index fields configured for the domain.
     * </p>
     * 
     * @param indexFields
     *        The index fields configured for the domain.
     */

    public void setIndexFields(java.util.Collection<IndexFieldStatus> indexFields) {
        if (indexFields == null) {
            this.indexFields = null;
            return;
        }

        this.indexFields = new com.amazonaws.internal.SdkInternalList<IndexFieldStatus>(indexFields);
    }

    /**
     * <p>
     * The index fields configured for the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIndexFields(java.util.Collection)} or {@link #withIndexFields(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param indexFields
     *        The index fields configured for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIndexFieldsResult withIndexFields(IndexFieldStatus... indexFields) {
        if (this.indexFields == null) {
            setIndexFields(new com.amazonaws.internal.SdkInternalList<IndexFieldStatus>(indexFields.length));
        }
        for (IndexFieldStatus ele : indexFields) {
            this.indexFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The index fields configured for the domain.
     * </p>
     * 
     * @param indexFields
     *        The index fields configured for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIndexFieldsResult withIndexFields(java.util.Collection<IndexFieldStatus> indexFields) {
        setIndexFields(indexFields);
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
        if (getIndexFields() != null)
            sb.append("IndexFields: ").append(getIndexFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIndexFieldsResult == false)
            return false;
        DescribeIndexFieldsResult other = (DescribeIndexFieldsResult) obj;
        if (other.getIndexFields() == null ^ this.getIndexFields() == null)
            return false;
        if (other.getIndexFields() != null && other.getIndexFields().equals(this.getIndexFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexFields() == null) ? 0 : getIndexFields().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIndexFieldsResult clone() {
        try {
            return (DescribeIndexFieldsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
