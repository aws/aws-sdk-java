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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/PutLifecycleConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutLifecycleConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of lifecycle management policies. Currently, EFS supports a maximum of one policy per file system.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LifecyclePolicy> lifecyclePolicies;

    /**
     * <p>
     * An array of lifecycle management policies. Currently, EFS supports a maximum of one policy per file system.
     * </p>
     * 
     * @return An array of lifecycle management policies. Currently, EFS supports a maximum of one policy per file
     *         system.
     */

    public java.util.List<LifecyclePolicy> getLifecyclePolicies() {
        if (lifecyclePolicies == null) {
            lifecyclePolicies = new com.amazonaws.internal.SdkInternalList<LifecyclePolicy>();
        }
        return lifecyclePolicies;
    }

    /**
     * <p>
     * An array of lifecycle management policies. Currently, EFS supports a maximum of one policy per file system.
     * </p>
     * 
     * @param lifecyclePolicies
     *        An array of lifecycle management policies. Currently, EFS supports a maximum of one policy per file
     *        system.
     */

    public void setLifecyclePolicies(java.util.Collection<LifecyclePolicy> lifecyclePolicies) {
        if (lifecyclePolicies == null) {
            this.lifecyclePolicies = null;
            return;
        }

        this.lifecyclePolicies = new com.amazonaws.internal.SdkInternalList<LifecyclePolicy>(lifecyclePolicies);
    }

    /**
     * <p>
     * An array of lifecycle management policies. Currently, EFS supports a maximum of one policy per file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifecyclePolicies(java.util.Collection)} or {@link #withLifecyclePolicies(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param lifecyclePolicies
     *        An array of lifecycle management policies. Currently, EFS supports a maximum of one policy per file
     *        system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleConfigurationResult withLifecyclePolicies(LifecyclePolicy... lifecyclePolicies) {
        if (this.lifecyclePolicies == null) {
            setLifecyclePolicies(new com.amazonaws.internal.SdkInternalList<LifecyclePolicy>(lifecyclePolicies.length));
        }
        for (LifecyclePolicy ele : lifecyclePolicies) {
            this.lifecyclePolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of lifecycle management policies. Currently, EFS supports a maximum of one policy per file system.
     * </p>
     * 
     * @param lifecyclePolicies
     *        An array of lifecycle management policies. Currently, EFS supports a maximum of one policy per file
     *        system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLifecycleConfigurationResult withLifecyclePolicies(java.util.Collection<LifecyclePolicy> lifecyclePolicies) {
        setLifecyclePolicies(lifecyclePolicies);
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
        if (getLifecyclePolicies() != null)
            sb.append("LifecyclePolicies: ").append(getLifecyclePolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLifecycleConfigurationResult == false)
            return false;
        PutLifecycleConfigurationResult other = (PutLifecycleConfigurationResult) obj;
        if (other.getLifecyclePolicies() == null ^ this.getLifecyclePolicies() == null)
            return false;
        if (other.getLifecyclePolicies() != null && other.getLifecyclePolicies().equals(this.getLifecyclePolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecyclePolicies() == null) ? 0 : getLifecyclePolicies().hashCode());
        return hashCode;
    }

    @Override
    public PutLifecycleConfigurationResult clone() {
        try {
            return (PutLifecycleConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
