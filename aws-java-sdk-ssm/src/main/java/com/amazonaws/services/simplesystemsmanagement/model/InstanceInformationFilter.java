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
 * Describes a filter for a specific list of instances. You can filter instances information by using tags. You specify
 * tags by using a key-value mapping.
 * </p>
 * <p>
 * Use this action instead of the <a>DescribeInstanceInformationRequest$InstanceInformationFilterList</a> method. The
 * <code>InstanceInformationFilterList</code> method is a legacy method and does not support tags.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/InstanceInformationFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceInformationFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The filter values.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> valueSet;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param key
     *        The name of the filter.
     * @see InstanceInformationFilterKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @return The name of the filter.
     * @see InstanceInformationFilterKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param key
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceInformationFilterKey
     */

    public InstanceInformationFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param key
     *        The name of the filter.
     * @see InstanceInformationFilterKey
     */

    public void setKey(InstanceInformationFilterKey key) {
        withKey(key);
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param key
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceInformationFilterKey
     */

    public InstanceInformationFilter withKey(InstanceInformationFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The filter values.
     * </p>
     * 
     * @return The filter values.
     */

    public java.util.List<String> getValueSet() {
        if (valueSet == null) {
            valueSet = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return valueSet;
    }

    /**
     * <p>
     * The filter values.
     * </p>
     * 
     * @param valueSet
     *        The filter values.
     */

    public void setValueSet(java.util.Collection<String> valueSet) {
        if (valueSet == null) {
            this.valueSet = null;
            return;
        }

        this.valueSet = new com.amazonaws.internal.SdkInternalList<String>(valueSet);
    }

    /**
     * <p>
     * The filter values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValueSet(java.util.Collection)} or {@link #withValueSet(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param valueSet
     *        The filter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceInformationFilter withValueSet(String... valueSet) {
        if (this.valueSet == null) {
            setValueSet(new com.amazonaws.internal.SdkInternalList<String>(valueSet.length));
        }
        for (String ele : valueSet) {
            this.valueSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filter values.
     * </p>
     * 
     * @param valueSet
     *        The filter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceInformationFilter withValueSet(java.util.Collection<String> valueSet) {
        setValueSet(valueSet);
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
        if (getValueSet() != null)
            sb.append("ValueSet: ").append(getValueSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceInformationFilter == false)
            return false;
        InstanceInformationFilter other = (InstanceInformationFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValueSet() == null ^ this.getValueSet() == null)
            return false;
        if (other.getValueSet() != null && other.getValueSet().equals(this.getValueSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValueSet() == null) ? 0 : getValueSet().hashCode());
        return hashCode;
    }

    @Override
    public InstanceInformationFilter clone() {
        try {
            return (InstanceInformationFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.InstanceInformationFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
