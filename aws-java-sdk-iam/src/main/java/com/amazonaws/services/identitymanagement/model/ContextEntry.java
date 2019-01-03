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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about a condition context key. It includes the name of the key and specifies the value (or
 * values, if the context key supports multiple values) to use in the simulation. This information is used when
 * evaluating the <code>Condition</code> elements of the input policies.
 * </p>
 * <p>
 * This data type is used as an input parameter to <code> <a>SimulateCustomPolicy</a> </code> and
 * <code> <a>SimulateCustomPolicy</a> </code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ContextEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContextEntry implements Serializable, Cloneable {

    /**
     * <p>
     * The full name of a condition context key, including the service prefix. For example, <code>aws:SourceIp</code> or
     * <code>s3:VersionId</code>.
     * </p>
     */
    private String contextKeyName;
    /**
     * <p>
     * The value (or values, if the condition context key supports multiple values) to provide to the simulation when
     * the key is referenced by a <code>Condition</code> element in an input policy.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> contextKeyValues;
    /**
     * <p>
     * The data type of the value (or values) specified in the <code>ContextKeyValues</code> parameter.
     * </p>
     */
    private String contextKeyType;

    /**
     * <p>
     * The full name of a condition context key, including the service prefix. For example, <code>aws:SourceIp</code> or
     * <code>s3:VersionId</code>.
     * </p>
     * 
     * @param contextKeyName
     *        The full name of a condition context key, including the service prefix. For example,
     *        <code>aws:SourceIp</code> or <code>s3:VersionId</code>.
     */

    public void setContextKeyName(String contextKeyName) {
        this.contextKeyName = contextKeyName;
    }

    /**
     * <p>
     * The full name of a condition context key, including the service prefix. For example, <code>aws:SourceIp</code> or
     * <code>s3:VersionId</code>.
     * </p>
     * 
     * @return The full name of a condition context key, including the service prefix. For example,
     *         <code>aws:SourceIp</code> or <code>s3:VersionId</code>.
     */

    public String getContextKeyName() {
        return this.contextKeyName;
    }

    /**
     * <p>
     * The full name of a condition context key, including the service prefix. For example, <code>aws:SourceIp</code> or
     * <code>s3:VersionId</code>.
     * </p>
     * 
     * @param contextKeyName
     *        The full name of a condition context key, including the service prefix. For example,
     *        <code>aws:SourceIp</code> or <code>s3:VersionId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextEntry withContextKeyName(String contextKeyName) {
        setContextKeyName(contextKeyName);
        return this;
    }

    /**
     * <p>
     * The value (or values, if the condition context key supports multiple values) to provide to the simulation when
     * the key is referenced by a <code>Condition</code> element in an input policy.
     * </p>
     * 
     * @return The value (or values, if the condition context key supports multiple values) to provide to the simulation
     *         when the key is referenced by a <code>Condition</code> element in an input policy.
     */

    public java.util.List<String> getContextKeyValues() {
        if (contextKeyValues == null) {
            contextKeyValues = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return contextKeyValues;
    }

    /**
     * <p>
     * The value (or values, if the condition context key supports multiple values) to provide to the simulation when
     * the key is referenced by a <code>Condition</code> element in an input policy.
     * </p>
     * 
     * @param contextKeyValues
     *        The value (or values, if the condition context key supports multiple values) to provide to the simulation
     *        when the key is referenced by a <code>Condition</code> element in an input policy.
     */

    public void setContextKeyValues(java.util.Collection<String> contextKeyValues) {
        if (contextKeyValues == null) {
            this.contextKeyValues = null;
            return;
        }

        this.contextKeyValues = new com.amazonaws.internal.SdkInternalList<String>(contextKeyValues);
    }

    /**
     * <p>
     * The value (or values, if the condition context key supports multiple values) to provide to the simulation when
     * the key is referenced by a <code>Condition</code> element in an input policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContextKeyValues(java.util.Collection)} or {@link #withContextKeyValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param contextKeyValues
     *        The value (or values, if the condition context key supports multiple values) to provide to the simulation
     *        when the key is referenced by a <code>Condition</code> element in an input policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextEntry withContextKeyValues(String... contextKeyValues) {
        if (this.contextKeyValues == null) {
            setContextKeyValues(new com.amazonaws.internal.SdkInternalList<String>(contextKeyValues.length));
        }
        for (String ele : contextKeyValues) {
            this.contextKeyValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value (or values, if the condition context key supports multiple values) to provide to the simulation when
     * the key is referenced by a <code>Condition</code> element in an input policy.
     * </p>
     * 
     * @param contextKeyValues
     *        The value (or values, if the condition context key supports multiple values) to provide to the simulation
     *        when the key is referenced by a <code>Condition</code> element in an input policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContextEntry withContextKeyValues(java.util.Collection<String> contextKeyValues) {
        setContextKeyValues(contextKeyValues);
        return this;
    }

    /**
     * <p>
     * The data type of the value (or values) specified in the <code>ContextKeyValues</code> parameter.
     * </p>
     * 
     * @param contextKeyType
     *        The data type of the value (or values) specified in the <code>ContextKeyValues</code> parameter.
     * @see ContextKeyTypeEnum
     */

    public void setContextKeyType(String contextKeyType) {
        this.contextKeyType = contextKeyType;
    }

    /**
     * <p>
     * The data type of the value (or values) specified in the <code>ContextKeyValues</code> parameter.
     * </p>
     * 
     * @return The data type of the value (or values) specified in the <code>ContextKeyValues</code> parameter.
     * @see ContextKeyTypeEnum
     */

    public String getContextKeyType() {
        return this.contextKeyType;
    }

    /**
     * <p>
     * The data type of the value (or values) specified in the <code>ContextKeyValues</code> parameter.
     * </p>
     * 
     * @param contextKeyType
     *        The data type of the value (or values) specified in the <code>ContextKeyValues</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContextKeyTypeEnum
     */

    public ContextEntry withContextKeyType(String contextKeyType) {
        setContextKeyType(contextKeyType);
        return this;
    }

    /**
     * <p>
     * The data type of the value (or values) specified in the <code>ContextKeyValues</code> parameter.
     * </p>
     * 
     * @param contextKeyType
     *        The data type of the value (or values) specified in the <code>ContextKeyValues</code> parameter.
     * @see ContextKeyTypeEnum
     */

    public void setContextKeyType(ContextKeyTypeEnum contextKeyType) {
        withContextKeyType(contextKeyType);
    }

    /**
     * <p>
     * The data type of the value (or values) specified in the <code>ContextKeyValues</code> parameter.
     * </p>
     * 
     * @param contextKeyType
     *        The data type of the value (or values) specified in the <code>ContextKeyValues</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContextKeyTypeEnum
     */

    public ContextEntry withContextKeyType(ContextKeyTypeEnum contextKeyType) {
        this.contextKeyType = contextKeyType.toString();
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
        if (getContextKeyName() != null)
            sb.append("ContextKeyName: ").append(getContextKeyName()).append(",");
        if (getContextKeyValues() != null)
            sb.append("ContextKeyValues: ").append(getContextKeyValues()).append(",");
        if (getContextKeyType() != null)
            sb.append("ContextKeyType: ").append(getContextKeyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContextEntry == false)
            return false;
        ContextEntry other = (ContextEntry) obj;
        if (other.getContextKeyName() == null ^ this.getContextKeyName() == null)
            return false;
        if (other.getContextKeyName() != null && other.getContextKeyName().equals(this.getContextKeyName()) == false)
            return false;
        if (other.getContextKeyValues() == null ^ this.getContextKeyValues() == null)
            return false;
        if (other.getContextKeyValues() != null && other.getContextKeyValues().equals(this.getContextKeyValues()) == false)
            return false;
        if (other.getContextKeyType() == null ^ this.getContextKeyType() == null)
            return false;
        if (other.getContextKeyType() != null && other.getContextKeyType().equals(this.getContextKeyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContextKeyName() == null) ? 0 : getContextKeyName().hashCode());
        hashCode = prime * hashCode + ((getContextKeyValues() == null) ? 0 : getContextKeyValues().hashCode());
        hashCode = prime * hashCode + ((getContextKeyType() == null) ? 0 : getContextKeyType().hashCode());
        return hashCode;
    }

    @Override
    public ContextEntry clone() {
        try {
            return (ContextEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
