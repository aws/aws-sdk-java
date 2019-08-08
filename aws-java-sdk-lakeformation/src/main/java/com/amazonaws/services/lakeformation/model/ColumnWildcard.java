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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A wildcard object, consisting of an optional list of excluded column names or indexes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ColumnWildcard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnWildcard implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Excludes column names. Any column with this name will be excluded.
     * </p>
     */
    private java.util.List<String> excludedColumnNames;

    /**
     * <p>
     * Excludes column names. Any column with this name will be excluded.
     * </p>
     * 
     * @return Excludes column names. Any column with this name will be excluded.
     */

    public java.util.List<String> getExcludedColumnNames() {
        return excludedColumnNames;
    }

    /**
     * <p>
     * Excludes column names. Any column with this name will be excluded.
     * </p>
     * 
     * @param excludedColumnNames
     *        Excludes column names. Any column with this name will be excluded.
     */

    public void setExcludedColumnNames(java.util.Collection<String> excludedColumnNames) {
        if (excludedColumnNames == null) {
            this.excludedColumnNames = null;
            return;
        }

        this.excludedColumnNames = new java.util.ArrayList<String>(excludedColumnNames);
    }

    /**
     * <p>
     * Excludes column names. Any column with this name will be excluded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedColumnNames(java.util.Collection)} or {@link #withExcludedColumnNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param excludedColumnNames
     *        Excludes column names. Any column with this name will be excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnWildcard withExcludedColumnNames(String... excludedColumnNames) {
        if (this.excludedColumnNames == null) {
            setExcludedColumnNames(new java.util.ArrayList<String>(excludedColumnNames.length));
        }
        for (String ele : excludedColumnNames) {
            this.excludedColumnNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Excludes column names. Any column with this name will be excluded.
     * </p>
     * 
     * @param excludedColumnNames
     *        Excludes column names. Any column with this name will be excluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnWildcard withExcludedColumnNames(java.util.Collection<String> excludedColumnNames) {
        setExcludedColumnNames(excludedColumnNames);
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
        if (getExcludedColumnNames() != null)
            sb.append("ExcludedColumnNames: ").append(getExcludedColumnNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnWildcard == false)
            return false;
        ColumnWildcard other = (ColumnWildcard) obj;
        if (other.getExcludedColumnNames() == null ^ this.getExcludedColumnNames() == null)
            return false;
        if (other.getExcludedColumnNames() != null && other.getExcludedColumnNames().equals(this.getExcludedColumnNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExcludedColumnNames() == null) ? 0 : getExcludedColumnNames().hashCode());
        return hashCode;
    }

    @Override
    public ColumnWildcard clone() {
        try {
            return (ColumnWildcard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.ColumnWildcardMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
