/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a condition context key. It includes the
 * name of the key and specifies the value (or values, if the context key
 * supports multiple values) to use in the simulation. This information
 * is used when evaluating the <code>Condition</code> elements of the
 * input policies.
 * </p>
 * <p>
 * This data type is used as an input parameter to <code> SimulatePolicy
 * </code> .
 * </p>
 */
public class ContextEntry implements Serializable, Cloneable {

    /**
     * The full name of a condition context key, including the service
     * prefix. For example, <code>aws:SourceIp</code> or
     * <code>s3:VersionId</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 256<br/>
     */
    private String contextKeyName;

    /**
     * The value (or values, if the condition context key supports multiple
     * values) to provide to the simulation for use when the key is
     * referenced by a <code>Condition</code> element in an input policy.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> contextKeyValues;

    /**
     * The data type of the value (or values) specified in the
     * <code>ContextKeyValues</code> parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string, stringList, numeric, numericList, boolean, booleanList, ip, ipList, binary, binaryList, date, dateList
     */
    private String contextKeyType;

    /**
     * The full name of a condition context key, including the service
     * prefix. For example, <code>aws:SourceIp</code> or
     * <code>s3:VersionId</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 256<br/>
     *
     * @return The full name of a condition context key, including the service
     *         prefix. For example, <code>aws:SourceIp</code> or
     *         <code>s3:VersionId</code>.
     */
    public String getContextKeyName() {
        return contextKeyName;
    }
    
    /**
     * The full name of a condition context key, including the service
     * prefix. For example, <code>aws:SourceIp</code> or
     * <code>s3:VersionId</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 256<br/>
     *
     * @param contextKeyName The full name of a condition context key, including the service
     *         prefix. For example, <code>aws:SourceIp</code> or
     *         <code>s3:VersionId</code>.
     */
    public void setContextKeyName(String contextKeyName) {
        this.contextKeyName = contextKeyName;
    }
    
    /**
     * The full name of a condition context key, including the service
     * prefix. For example, <code>aws:SourceIp</code> or
     * <code>s3:VersionId</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 256<br/>
     *
     * @param contextKeyName The full name of a condition context key, including the service
     *         prefix. For example, <code>aws:SourceIp</code> or
     *         <code>s3:VersionId</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContextEntry withContextKeyName(String contextKeyName) {
        this.contextKeyName = contextKeyName;
        return this;
    }

    /**
     * The value (or values, if the condition context key supports multiple
     * values) to provide to the simulation for use when the key is
     * referenced by a <code>Condition</code> element in an input policy.
     *
     * @return The value (or values, if the condition context key supports multiple
     *         values) to provide to the simulation for use when the key is
     *         referenced by a <code>Condition</code> element in an input policy.
     */
    public java.util.List<String> getContextKeyValues() {
        if (contextKeyValues == null) {
              contextKeyValues = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              contextKeyValues.setAutoConstruct(true);
        }
        return contextKeyValues;
    }
    
    /**
     * The value (or values, if the condition context key supports multiple
     * values) to provide to the simulation for use when the key is
     * referenced by a <code>Condition</code> element in an input policy.
     *
     * @param contextKeyValues The value (or values, if the condition context key supports multiple
     *         values) to provide to the simulation for use when the key is
     *         referenced by a <code>Condition</code> element in an input policy.
     */
    public void setContextKeyValues(java.util.Collection<String> contextKeyValues) {
        if (contextKeyValues == null) {
            this.contextKeyValues = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> contextKeyValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(contextKeyValues.size());
        contextKeyValuesCopy.addAll(contextKeyValues);
        this.contextKeyValues = contextKeyValuesCopy;
    }
    
    /**
     * The value (or values, if the condition context key supports multiple
     * values) to provide to the simulation for use when the key is
     * referenced by a <code>Condition</code> element in an input policy.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setContextKeyValues(java.util.Collection)} or {@link
     * #withContextKeyValues(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param contextKeyValues The value (or values, if the condition context key supports multiple
     *         values) to provide to the simulation for use when the key is
     *         referenced by a <code>Condition</code> element in an input policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContextEntry withContextKeyValues(String... contextKeyValues) {
        if (getContextKeyValues() == null) setContextKeyValues(new java.util.ArrayList<String>(contextKeyValues.length));
        for (String value : contextKeyValues) {
            getContextKeyValues().add(value);
        }
        return this;
    }
    
    /**
     * The value (or values, if the condition context key supports multiple
     * values) to provide to the simulation for use when the key is
     * referenced by a <code>Condition</code> element in an input policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param contextKeyValues The value (or values, if the condition context key supports multiple
     *         values) to provide to the simulation for use when the key is
     *         referenced by a <code>Condition</code> element in an input policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ContextEntry withContextKeyValues(java.util.Collection<String> contextKeyValues) {
        if (contextKeyValues == null) {
            this.contextKeyValues = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> contextKeyValuesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(contextKeyValues.size());
            contextKeyValuesCopy.addAll(contextKeyValues);
            this.contextKeyValues = contextKeyValuesCopy;
        }

        return this;
    }

    /**
     * The data type of the value (or values) specified in the
     * <code>ContextKeyValues</code> parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string, stringList, numeric, numericList, boolean, booleanList, ip, ipList, binary, binaryList, date, dateList
     *
     * @return The data type of the value (or values) specified in the
     *         <code>ContextKeyValues</code> parameter.
     *
     * @see ContextKeyTypeEnum
     */
    public String getContextKeyType() {
        return contextKeyType;
    }
    
    /**
     * The data type of the value (or values) specified in the
     * <code>ContextKeyValues</code> parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string, stringList, numeric, numericList, boolean, booleanList, ip, ipList, binary, binaryList, date, dateList
     *
     * @param contextKeyType The data type of the value (or values) specified in the
     *         <code>ContextKeyValues</code> parameter.
     *
     * @see ContextKeyTypeEnum
     */
    public void setContextKeyType(String contextKeyType) {
        this.contextKeyType = contextKeyType;
    }
    
    /**
     * The data type of the value (or values) specified in the
     * <code>ContextKeyValues</code> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string, stringList, numeric, numericList, boolean, booleanList, ip, ipList, binary, binaryList, date, dateList
     *
     * @param contextKeyType The data type of the value (or values) specified in the
     *         <code>ContextKeyValues</code> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ContextKeyTypeEnum
     */
    public ContextEntry withContextKeyType(String contextKeyType) {
        this.contextKeyType = contextKeyType;
        return this;
    }

    /**
     * The data type of the value (or values) specified in the
     * <code>ContextKeyValues</code> parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string, stringList, numeric, numericList, boolean, booleanList, ip, ipList, binary, binaryList, date, dateList
     *
     * @param contextKeyType The data type of the value (or values) specified in the
     *         <code>ContextKeyValues</code> parameter.
     *
     * @see ContextKeyTypeEnum
     */
    public void setContextKeyType(ContextKeyTypeEnum contextKeyType) {
        this.contextKeyType = contextKeyType.toString();
    }
    
    /**
     * The data type of the value (or values) specified in the
     * <code>ContextKeyValues</code> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>string, stringList, numeric, numericList, boolean, booleanList, ip, ipList, binary, binaryList, date, dateList
     *
     * @param contextKeyType The data type of the value (or values) specified in the
     *         <code>ContextKeyValues</code> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ContextKeyTypeEnum
     */
    public ContextEntry withContextKeyType(ContextKeyTypeEnum contextKeyType) {
        this.contextKeyType = contextKeyType.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContextKeyName() != null) sb.append("ContextKeyName: " + getContextKeyName() + ",");
        if (getContextKeyValues() != null) sb.append("ContextKeyValues: " + getContextKeyValues() + ",");
        if (getContextKeyType() != null) sb.append("ContextKeyType: " + getContextKeyType() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ContextEntry == false) return false;
        ContextEntry other = (ContextEntry)obj;
        
        if (other.getContextKeyName() == null ^ this.getContextKeyName() == null) return false;
        if (other.getContextKeyName() != null && other.getContextKeyName().equals(this.getContextKeyName()) == false) return false; 
        if (other.getContextKeyValues() == null ^ this.getContextKeyValues() == null) return false;
        if (other.getContextKeyValues() != null && other.getContextKeyValues().equals(this.getContextKeyValues()) == false) return false; 
        if (other.getContextKeyType() == null ^ this.getContextKeyType() == null) return false;
        if (other.getContextKeyType() != null && other.getContextKeyType().equals(this.getContextKeyType()) == false) return false; 
        return true;
    }
    
    @Override
    public ContextEntry clone() {
        try {
            return (ContextEntry) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    