/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A filter to limit the number of OpsMetadata objects displayed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/OpsMetadataFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsMetadataFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A filter key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * A filter value.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * A filter key.
     * </p>
     * 
     * @param key
     *        A filter key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * A filter key.
     * </p>
     * 
     * @return A filter key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * A filter key.
     * </p>
     * 
     * @param key
     *        A filter key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsMetadataFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * A filter value.
     * </p>
     * 
     * @return A filter value.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * A filter value.
     * </p>
     * 
     * @param values
     *        A filter value.
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
     * A filter value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        A filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsMetadataFilter withValues(String... values) {
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
     * A filter value.
     * </p>
     * 
     * @param values
     *        A filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsMetadataFilter withValues(java.util.Collection<String> values) {
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

        if (obj instanceof OpsMetadataFilter == false)
            return false;
        OpsMetadataFilter other = (OpsMetadataFilter) obj;
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
    public OpsMetadataFilter clone() {
        try {
            return (OpsMetadataFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.OpsMetadataFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
