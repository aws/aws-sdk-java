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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeLifecycleHookTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLifecycleHookTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The lifecycle hook types.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> lifecycleHookTypes;

    /**
     * <p>
     * The lifecycle hook types.
     * </p>
     * 
     * @return The lifecycle hook types.
     */

    public java.util.List<String> getLifecycleHookTypes() {
        if (lifecycleHookTypes == null) {
            lifecycleHookTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return lifecycleHookTypes;
    }

    /**
     * <p>
     * The lifecycle hook types.
     * </p>
     * 
     * @param lifecycleHookTypes
     *        The lifecycle hook types.
     */

    public void setLifecycleHookTypes(java.util.Collection<String> lifecycleHookTypes) {
        if (lifecycleHookTypes == null) {
            this.lifecycleHookTypes = null;
            return;
        }

        this.lifecycleHookTypes = new com.amazonaws.internal.SdkInternalList<String>(lifecycleHookTypes);
    }

    /**
     * <p>
     * The lifecycle hook types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifecycleHookTypes(java.util.Collection)} or {@link #withLifecycleHookTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param lifecycleHookTypes
     *        The lifecycle hook types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLifecycleHookTypesResult withLifecycleHookTypes(String... lifecycleHookTypes) {
        if (this.lifecycleHookTypes == null) {
            setLifecycleHookTypes(new com.amazonaws.internal.SdkInternalList<String>(lifecycleHookTypes.length));
        }
        for (String ele : lifecycleHookTypes) {
            this.lifecycleHookTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The lifecycle hook types.
     * </p>
     * 
     * @param lifecycleHookTypes
     *        The lifecycle hook types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLifecycleHookTypesResult withLifecycleHookTypes(java.util.Collection<String> lifecycleHookTypes) {
        setLifecycleHookTypes(lifecycleHookTypes);
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
        if (getLifecycleHookTypes() != null)
            sb.append("LifecycleHookTypes: ").append(getLifecycleHookTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLifecycleHookTypesResult == false)
            return false;
        DescribeLifecycleHookTypesResult other = (DescribeLifecycleHookTypesResult) obj;
        if (other.getLifecycleHookTypes() == null ^ this.getLifecycleHookTypes() == null)
            return false;
        if (other.getLifecycleHookTypes() != null && other.getLifecycleHookTypes().equals(this.getLifecycleHookTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecycleHookTypes() == null) ? 0 : getLifecycleHookTypes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLifecycleHookTypesResult clone() {
        try {
            return (DescribeLifecycleHookTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
