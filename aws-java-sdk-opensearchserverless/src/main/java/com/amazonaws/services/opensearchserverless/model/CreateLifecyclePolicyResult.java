/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateLifecyclePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLifecyclePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the created lifecycle policy.
     * </p>
     */
    private LifecyclePolicyDetail lifecyclePolicyDetail;

    /**
     * <p>
     * Details about the created lifecycle policy.
     * </p>
     * 
     * @param lifecyclePolicyDetail
     *        Details about the created lifecycle policy.
     */

    public void setLifecyclePolicyDetail(LifecyclePolicyDetail lifecyclePolicyDetail) {
        this.lifecyclePolicyDetail = lifecyclePolicyDetail;
    }

    /**
     * <p>
     * Details about the created lifecycle policy.
     * </p>
     * 
     * @return Details about the created lifecycle policy.
     */

    public LifecyclePolicyDetail getLifecyclePolicyDetail() {
        return this.lifecyclePolicyDetail;
    }

    /**
     * <p>
     * Details about the created lifecycle policy.
     * </p>
     * 
     * @param lifecyclePolicyDetail
     *        Details about the created lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLifecyclePolicyResult withLifecyclePolicyDetail(LifecyclePolicyDetail lifecyclePolicyDetail) {
        setLifecyclePolicyDetail(lifecyclePolicyDetail);
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
        if (getLifecyclePolicyDetail() != null)
            sb.append("LifecyclePolicyDetail: ").append(getLifecyclePolicyDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLifecyclePolicyResult == false)
            return false;
        CreateLifecyclePolicyResult other = (CreateLifecyclePolicyResult) obj;
        if (other.getLifecyclePolicyDetail() == null ^ this.getLifecyclePolicyDetail() == null)
            return false;
        if (other.getLifecyclePolicyDetail() != null && other.getLifecyclePolicyDetail().equals(this.getLifecyclePolicyDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecyclePolicyDetail() == null) ? 0 : getLifecyclePolicyDetail().hashCode());
        return hashCode;
    }

    @Override
    public CreateLifecyclePolicyResult clone() {
        try {
            return (CreateLifecyclePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
