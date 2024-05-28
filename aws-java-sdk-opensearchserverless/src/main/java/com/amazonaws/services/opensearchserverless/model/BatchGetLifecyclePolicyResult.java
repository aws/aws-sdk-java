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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/BatchGetLifecyclePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetLifecyclePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of lifecycle policies matched to the input policy name and policy type.
     * </p>
     */
    private java.util.List<LifecyclePolicyDetail> lifecyclePolicyDetails;
    /**
     * <p>
     * A list of lifecycle policy names and policy types for which retrieval failed.
     * </p>
     */
    private java.util.List<LifecyclePolicyErrorDetail> lifecyclePolicyErrorDetails;

    /**
     * <p>
     * A list of lifecycle policies matched to the input policy name and policy type.
     * </p>
     * 
     * @return A list of lifecycle policies matched to the input policy name and policy type.
     */

    public java.util.List<LifecyclePolicyDetail> getLifecyclePolicyDetails() {
        return lifecyclePolicyDetails;
    }

    /**
     * <p>
     * A list of lifecycle policies matched to the input policy name and policy type.
     * </p>
     * 
     * @param lifecyclePolicyDetails
     *        A list of lifecycle policies matched to the input policy name and policy type.
     */

    public void setLifecyclePolicyDetails(java.util.Collection<LifecyclePolicyDetail> lifecyclePolicyDetails) {
        if (lifecyclePolicyDetails == null) {
            this.lifecyclePolicyDetails = null;
            return;
        }

        this.lifecyclePolicyDetails = new java.util.ArrayList<LifecyclePolicyDetail>(lifecyclePolicyDetails);
    }

    /**
     * <p>
     * A list of lifecycle policies matched to the input policy name and policy type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifecyclePolicyDetails(java.util.Collection)} or
     * {@link #withLifecyclePolicyDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lifecyclePolicyDetails
     *        A list of lifecycle policies matched to the input policy name and policy type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetLifecyclePolicyResult withLifecyclePolicyDetails(LifecyclePolicyDetail... lifecyclePolicyDetails) {
        if (this.lifecyclePolicyDetails == null) {
            setLifecyclePolicyDetails(new java.util.ArrayList<LifecyclePolicyDetail>(lifecyclePolicyDetails.length));
        }
        for (LifecyclePolicyDetail ele : lifecyclePolicyDetails) {
            this.lifecyclePolicyDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of lifecycle policies matched to the input policy name and policy type.
     * </p>
     * 
     * @param lifecyclePolicyDetails
     *        A list of lifecycle policies matched to the input policy name and policy type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetLifecyclePolicyResult withLifecyclePolicyDetails(java.util.Collection<LifecyclePolicyDetail> lifecyclePolicyDetails) {
        setLifecyclePolicyDetails(lifecyclePolicyDetails);
        return this;
    }

    /**
     * <p>
     * A list of lifecycle policy names and policy types for which retrieval failed.
     * </p>
     * 
     * @return A list of lifecycle policy names and policy types for which retrieval failed.
     */

    public java.util.List<LifecyclePolicyErrorDetail> getLifecyclePolicyErrorDetails() {
        return lifecyclePolicyErrorDetails;
    }

    /**
     * <p>
     * A list of lifecycle policy names and policy types for which retrieval failed.
     * </p>
     * 
     * @param lifecyclePolicyErrorDetails
     *        A list of lifecycle policy names and policy types for which retrieval failed.
     */

    public void setLifecyclePolicyErrorDetails(java.util.Collection<LifecyclePolicyErrorDetail> lifecyclePolicyErrorDetails) {
        if (lifecyclePolicyErrorDetails == null) {
            this.lifecyclePolicyErrorDetails = null;
            return;
        }

        this.lifecyclePolicyErrorDetails = new java.util.ArrayList<LifecyclePolicyErrorDetail>(lifecyclePolicyErrorDetails);
    }

    /**
     * <p>
     * A list of lifecycle policy names and policy types for which retrieval failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifecyclePolicyErrorDetails(java.util.Collection)} or
     * {@link #withLifecyclePolicyErrorDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lifecyclePolicyErrorDetails
     *        A list of lifecycle policy names and policy types for which retrieval failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetLifecyclePolicyResult withLifecyclePolicyErrorDetails(LifecyclePolicyErrorDetail... lifecyclePolicyErrorDetails) {
        if (this.lifecyclePolicyErrorDetails == null) {
            setLifecyclePolicyErrorDetails(new java.util.ArrayList<LifecyclePolicyErrorDetail>(lifecyclePolicyErrorDetails.length));
        }
        for (LifecyclePolicyErrorDetail ele : lifecyclePolicyErrorDetails) {
            this.lifecyclePolicyErrorDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of lifecycle policy names and policy types for which retrieval failed.
     * </p>
     * 
     * @param lifecyclePolicyErrorDetails
     *        A list of lifecycle policy names and policy types for which retrieval failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetLifecyclePolicyResult withLifecyclePolicyErrorDetails(java.util.Collection<LifecyclePolicyErrorDetail> lifecyclePolicyErrorDetails) {
        setLifecyclePolicyErrorDetails(lifecyclePolicyErrorDetails);
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
        if (getLifecyclePolicyDetails() != null)
            sb.append("LifecyclePolicyDetails: ").append(getLifecyclePolicyDetails()).append(",");
        if (getLifecyclePolicyErrorDetails() != null)
            sb.append("LifecyclePolicyErrorDetails: ").append(getLifecyclePolicyErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetLifecyclePolicyResult == false)
            return false;
        BatchGetLifecyclePolicyResult other = (BatchGetLifecyclePolicyResult) obj;
        if (other.getLifecyclePolicyDetails() == null ^ this.getLifecyclePolicyDetails() == null)
            return false;
        if (other.getLifecyclePolicyDetails() != null && other.getLifecyclePolicyDetails().equals(this.getLifecyclePolicyDetails()) == false)
            return false;
        if (other.getLifecyclePolicyErrorDetails() == null ^ this.getLifecyclePolicyErrorDetails() == null)
            return false;
        if (other.getLifecyclePolicyErrorDetails() != null && other.getLifecyclePolicyErrorDetails().equals(this.getLifecyclePolicyErrorDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLifecyclePolicyDetails() == null) ? 0 : getLifecyclePolicyDetails().hashCode());
        hashCode = prime * hashCode + ((getLifecyclePolicyErrorDetails() == null) ? 0 : getLifecyclePolicyErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetLifecyclePolicyResult clone() {
        try {
            return (BatchGetLifecyclePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
