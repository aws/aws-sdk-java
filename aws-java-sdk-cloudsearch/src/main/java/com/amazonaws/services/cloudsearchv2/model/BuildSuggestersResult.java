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
 * The result of a <code>BuildSuggester</code> request. Contains a list of the fields used for suggestions.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildSuggestersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private com.amazonaws.internal.SdkInternalList<String> fieldNames;

    /**
     * @return
     */

    public java.util.List<String> getFieldNames() {
        if (fieldNames == null) {
            fieldNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return fieldNames;
    }

    /**
     * @param fieldNames
     */

    public void setFieldNames(java.util.Collection<String> fieldNames) {
        if (fieldNames == null) {
            this.fieldNames = null;
            return;
        }

        this.fieldNames = new com.amazonaws.internal.SdkInternalList<String>(fieldNames);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldNames(java.util.Collection)} or {@link #withFieldNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fieldNames
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildSuggestersResult withFieldNames(String... fieldNames) {
        if (this.fieldNames == null) {
            setFieldNames(new com.amazonaws.internal.SdkInternalList<String>(fieldNames.length));
        }
        for (String ele : fieldNames) {
            this.fieldNames.add(ele);
        }
        return this;
    }

    /**
     * @param fieldNames
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildSuggestersResult withFieldNames(java.util.Collection<String> fieldNames) {
        setFieldNames(fieldNames);
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
        if (getFieldNames() != null)
            sb.append("FieldNames: ").append(getFieldNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuildSuggestersResult == false)
            return false;
        BuildSuggestersResult other = (BuildSuggestersResult) obj;
        if (other.getFieldNames() == null ^ this.getFieldNames() == null)
            return false;
        if (other.getFieldNames() != null && other.getFieldNames().equals(this.getFieldNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldNames() == null) ? 0 : getFieldNames().hashCode());
        return hashCode;
    }

    @Override
    public BuildSuggestersResult clone() {
        try {
            return (BuildSuggestersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
