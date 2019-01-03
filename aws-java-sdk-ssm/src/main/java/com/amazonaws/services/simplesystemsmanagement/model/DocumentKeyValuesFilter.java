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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * One or more filters. Use a filter to return a more specific list of documents.
 * </p>
 * <p>
 * For keys, you can specify one or more tags that have been applied to a document.
 * </p>
 * <p>
 * Other valid values include Owner, Name, PlatformTypes, and DocumentType.
 * </p>
 * <p>
 * Note that only one Owner can be specified in a request. For example: <code>Key=Owner,Values=Self</code>.
 * </p>
 * <p>
 * If you use Name as a key, you can use a name prefix to return a list of documents. For example, in the AWS CLI, to
 * return a list of all documents that begin with <code>Te</code>, run the following command:
 * </p>
 * <p>
 * <code>aws ssm list-documents --filters Key=Name,Values=Te</code>
 * </p>
 * <p>
 * If you specify more than two keys, only documents that are identified by all the tags are returned in the results. If
 * you specify more than two values for a key, documents that are identified by any of the values are returned in the
 * results.
 * </p>
 * <p>
 * To specify a custom key and value pair, use the format <code>Key=tag:[tagName],Values=[valueName]</code>.
 * </p>
 * <p>
 * For example, if you created a Key called region and are using the AWS CLI to call the <code>list-documents</code>
 * command:
 * </p>
 * <p>
 * <code>aws ssm list-documents --filters Key=tag:region,Values=east,west Key=Owner,Values=Self</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DocumentKeyValuesFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentKeyValuesFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value for the filter key.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * The name of the filter key.
     * </p>
     * 
     * @param key
     *        The name of the filter key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the filter key.
     * </p>
     * 
     * @return The name of the filter key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the filter key.
     * </p>
     * 
     * @param key
     *        The name of the filter key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentKeyValuesFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * 
     * @return The value for the filter key.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * 
     * @param values
     *        The value for the filter key.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value for the filter key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentKeyValuesFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * 
     * @param values
     *        The value for the filter key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentKeyValuesFilter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentKeyValuesFilter == false)
            return false;
        DocumentKeyValuesFilter other = (DocumentKeyValuesFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public DocumentKeyValuesFilter clone() {
        try {
            return (DocumentKeyValuesFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.DocumentKeyValuesFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
