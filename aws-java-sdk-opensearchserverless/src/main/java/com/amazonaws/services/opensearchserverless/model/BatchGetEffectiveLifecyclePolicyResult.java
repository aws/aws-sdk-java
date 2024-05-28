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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/BatchGetEffectiveLifecyclePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetEffectiveLifecyclePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of lifecycle policies applied to the OpenSearch Serverless indexes.
     * </p>
     */
    private java.util.List<EffectiveLifecyclePolicyDetail> effectiveLifecyclePolicyDetails;
    /**
     * <p>
     * A list of resources for which retrieval failed.
     * </p>
     */
    private java.util.List<EffectiveLifecyclePolicyErrorDetail> effectiveLifecyclePolicyErrorDetails;

    /**
     * <p>
     * A list of lifecycle policies applied to the OpenSearch Serverless indexes.
     * </p>
     * 
     * @return A list of lifecycle policies applied to the OpenSearch Serverless indexes.
     */

    public java.util.List<EffectiveLifecyclePolicyDetail> getEffectiveLifecyclePolicyDetails() {
        return effectiveLifecyclePolicyDetails;
    }

    /**
     * <p>
     * A list of lifecycle policies applied to the OpenSearch Serverless indexes.
     * </p>
     * 
     * @param effectiveLifecyclePolicyDetails
     *        A list of lifecycle policies applied to the OpenSearch Serverless indexes.
     */

    public void setEffectiveLifecyclePolicyDetails(java.util.Collection<EffectiveLifecyclePolicyDetail> effectiveLifecyclePolicyDetails) {
        if (effectiveLifecyclePolicyDetails == null) {
            this.effectiveLifecyclePolicyDetails = null;
            return;
        }

        this.effectiveLifecyclePolicyDetails = new java.util.ArrayList<EffectiveLifecyclePolicyDetail>(effectiveLifecyclePolicyDetails);
    }

    /**
     * <p>
     * A list of lifecycle policies applied to the OpenSearch Serverless indexes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEffectiveLifecyclePolicyDetails(java.util.Collection)} or
     * {@link #withEffectiveLifecyclePolicyDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param effectiveLifecyclePolicyDetails
     *        A list of lifecycle policies applied to the OpenSearch Serverless indexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetEffectiveLifecyclePolicyResult withEffectiveLifecyclePolicyDetails(EffectiveLifecyclePolicyDetail... effectiveLifecyclePolicyDetails) {
        if (this.effectiveLifecyclePolicyDetails == null) {
            setEffectiveLifecyclePolicyDetails(new java.util.ArrayList<EffectiveLifecyclePolicyDetail>(effectiveLifecyclePolicyDetails.length));
        }
        for (EffectiveLifecyclePolicyDetail ele : effectiveLifecyclePolicyDetails) {
            this.effectiveLifecyclePolicyDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of lifecycle policies applied to the OpenSearch Serverless indexes.
     * </p>
     * 
     * @param effectiveLifecyclePolicyDetails
     *        A list of lifecycle policies applied to the OpenSearch Serverless indexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetEffectiveLifecyclePolicyResult withEffectiveLifecyclePolicyDetails(
            java.util.Collection<EffectiveLifecyclePolicyDetail> effectiveLifecyclePolicyDetails) {
        setEffectiveLifecyclePolicyDetails(effectiveLifecyclePolicyDetails);
        return this;
    }

    /**
     * <p>
     * A list of resources for which retrieval failed.
     * </p>
     * 
     * @return A list of resources for which retrieval failed.
     */

    public java.util.List<EffectiveLifecyclePolicyErrorDetail> getEffectiveLifecyclePolicyErrorDetails() {
        return effectiveLifecyclePolicyErrorDetails;
    }

    /**
     * <p>
     * A list of resources for which retrieval failed.
     * </p>
     * 
     * @param effectiveLifecyclePolicyErrorDetails
     *        A list of resources for which retrieval failed.
     */

    public void setEffectiveLifecyclePolicyErrorDetails(java.util.Collection<EffectiveLifecyclePolicyErrorDetail> effectiveLifecyclePolicyErrorDetails) {
        if (effectiveLifecyclePolicyErrorDetails == null) {
            this.effectiveLifecyclePolicyErrorDetails = null;
            return;
        }

        this.effectiveLifecyclePolicyErrorDetails = new java.util.ArrayList<EffectiveLifecyclePolicyErrorDetail>(effectiveLifecyclePolicyErrorDetails);
    }

    /**
     * <p>
     * A list of resources for which retrieval failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEffectiveLifecyclePolicyErrorDetails(java.util.Collection)} or
     * {@link #withEffectiveLifecyclePolicyErrorDetails(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param effectiveLifecyclePolicyErrorDetails
     *        A list of resources for which retrieval failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetEffectiveLifecyclePolicyResult withEffectiveLifecyclePolicyErrorDetails(
            EffectiveLifecyclePolicyErrorDetail... effectiveLifecyclePolicyErrorDetails) {
        if (this.effectiveLifecyclePolicyErrorDetails == null) {
            setEffectiveLifecyclePolicyErrorDetails(new java.util.ArrayList<EffectiveLifecyclePolicyErrorDetail>(effectiveLifecyclePolicyErrorDetails.length));
        }
        for (EffectiveLifecyclePolicyErrorDetail ele : effectiveLifecyclePolicyErrorDetails) {
            this.effectiveLifecyclePolicyErrorDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resources for which retrieval failed.
     * </p>
     * 
     * @param effectiveLifecyclePolicyErrorDetails
     *        A list of resources for which retrieval failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetEffectiveLifecyclePolicyResult withEffectiveLifecyclePolicyErrorDetails(
            java.util.Collection<EffectiveLifecyclePolicyErrorDetail> effectiveLifecyclePolicyErrorDetails) {
        setEffectiveLifecyclePolicyErrorDetails(effectiveLifecyclePolicyErrorDetails);
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
        if (getEffectiveLifecyclePolicyDetails() != null)
            sb.append("EffectiveLifecyclePolicyDetails: ").append(getEffectiveLifecyclePolicyDetails()).append(",");
        if (getEffectiveLifecyclePolicyErrorDetails() != null)
            sb.append("EffectiveLifecyclePolicyErrorDetails: ").append(getEffectiveLifecyclePolicyErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetEffectiveLifecyclePolicyResult == false)
            return false;
        BatchGetEffectiveLifecyclePolicyResult other = (BatchGetEffectiveLifecyclePolicyResult) obj;
        if (other.getEffectiveLifecyclePolicyDetails() == null ^ this.getEffectiveLifecyclePolicyDetails() == null)
            return false;
        if (other.getEffectiveLifecyclePolicyDetails() != null
                && other.getEffectiveLifecyclePolicyDetails().equals(this.getEffectiveLifecyclePolicyDetails()) == false)
            return false;
        if (other.getEffectiveLifecyclePolicyErrorDetails() == null ^ this.getEffectiveLifecyclePolicyErrorDetails() == null)
            return false;
        if (other.getEffectiveLifecyclePolicyErrorDetails() != null
                && other.getEffectiveLifecyclePolicyErrorDetails().equals(this.getEffectiveLifecyclePolicyErrorDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEffectiveLifecyclePolicyDetails() == null) ? 0 : getEffectiveLifecyclePolicyDetails().hashCode());
        hashCode = prime * hashCode + ((getEffectiveLifecyclePolicyErrorDetails() == null) ? 0 : getEffectiveLifecyclePolicyErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetEffectiveLifecyclePolicyResult clone() {
        try {
            return (BatchGetEffectiveLifecyclePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
