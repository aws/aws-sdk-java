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
 * One or more filters. Use a filter to return a more specific list of results.
 * </p>
 * <note>
 * <p>
 * The <code>Name</code> and <code>Tier</code> filter keys can't be used with the <a>GetParametersByPath</a> API action.
 * Also, the <code>Label</code> filter key can't be used with the <a>DescribeParameters</a> API action.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ParameterStringFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterStringFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter.
     * </p>
     */
    private String key;
    /**
     * <p>
     * Valid options are Equals and BeginsWith. For Path filter, valid options are Recursive and OneLevel.
     * </p>
     */
    private String option;
    /**
     * <p>
     * The value you want to search for.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param key
     *        The name of the filter.
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
     */

    public ParameterStringFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Valid options are Equals and BeginsWith. For Path filter, valid options are Recursive and OneLevel.
     * </p>
     * 
     * @param option
     *        Valid options are Equals and BeginsWith. For Path filter, valid options are Recursive and OneLevel.
     */

    public void setOption(String option) {
        this.option = option;
    }

    /**
     * <p>
     * Valid options are Equals and BeginsWith. For Path filter, valid options are Recursive and OneLevel.
     * </p>
     * 
     * @return Valid options are Equals and BeginsWith. For Path filter, valid options are Recursive and OneLevel.
     */

    public String getOption() {
        return this.option;
    }

    /**
     * <p>
     * Valid options are Equals and BeginsWith. For Path filter, valid options are Recursive and OneLevel.
     * </p>
     * 
     * @param option
     *        Valid options are Equals and BeginsWith. For Path filter, valid options are Recursive and OneLevel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterStringFilter withOption(String option) {
        setOption(option);
        return this;
    }

    /**
     * <p>
     * The value you want to search for.
     * </p>
     * 
     * @return The value you want to search for.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * The value you want to search for.
     * </p>
     * 
     * @param values
     *        The value you want to search for.
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
     * The value you want to search for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value you want to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterStringFilter withValues(String... values) {
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
     * The value you want to search for.
     * </p>
     * 
     * @param values
     *        The value you want to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterStringFilter withValues(java.util.Collection<String> values) {
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
        if (getOption() != null)
            sb.append("Option: ").append(getOption()).append(",");
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

        if (obj instanceof ParameterStringFilter == false)
            return false;
        ParameterStringFilter other = (ParameterStringFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getOption() == null ^ this.getOption() == null)
            return false;
        if (other.getOption() != null && other.getOption().equals(this.getOption()) == false)
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
        hashCode = prime * hashCode + ((getOption() == null) ? 0 : getOption().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public ParameterStringFilter clone() {
        try {
            return (ParameterStringFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ParameterStringFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
