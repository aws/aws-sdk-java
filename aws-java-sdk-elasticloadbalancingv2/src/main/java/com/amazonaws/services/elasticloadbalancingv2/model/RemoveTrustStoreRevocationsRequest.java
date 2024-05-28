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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/RemoveTrustStoreRevocations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveTrustStoreRevocationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     */
    private String trustStoreArn;
    /**
     * <p>
     * The revocation IDs of the revocation files you want to remove.
     * </p>
     */
    private java.util.List<Long> revocationIds;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The Amazon Resource Name (ARN) of the trust store.
     */

    public void setTrustStoreArn(String trustStoreArn) {
        this.trustStoreArn = trustStoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the trust store.
     */

    public String getTrustStoreArn() {
        return this.trustStoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The Amazon Resource Name (ARN) of the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTrustStoreRevocationsRequest withTrustStoreArn(String trustStoreArn) {
        setTrustStoreArn(trustStoreArn);
        return this;
    }

    /**
     * <p>
     * The revocation IDs of the revocation files you want to remove.
     * </p>
     * 
     * @return The revocation IDs of the revocation files you want to remove.
     */

    public java.util.List<Long> getRevocationIds() {
        return revocationIds;
    }

    /**
     * <p>
     * The revocation IDs of the revocation files you want to remove.
     * </p>
     * 
     * @param revocationIds
     *        The revocation IDs of the revocation files you want to remove.
     */

    public void setRevocationIds(java.util.Collection<Long> revocationIds) {
        if (revocationIds == null) {
            this.revocationIds = null;
            return;
        }

        this.revocationIds = new java.util.ArrayList<Long>(revocationIds);
    }

    /**
     * <p>
     * The revocation IDs of the revocation files you want to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRevocationIds(java.util.Collection)} or {@link #withRevocationIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param revocationIds
     *        The revocation IDs of the revocation files you want to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTrustStoreRevocationsRequest withRevocationIds(Long... revocationIds) {
        if (this.revocationIds == null) {
            setRevocationIds(new java.util.ArrayList<Long>(revocationIds.length));
        }
        for (Long ele : revocationIds) {
            this.revocationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The revocation IDs of the revocation files you want to remove.
     * </p>
     * 
     * @param revocationIds
     *        The revocation IDs of the revocation files you want to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTrustStoreRevocationsRequest withRevocationIds(java.util.Collection<Long> revocationIds) {
        setRevocationIds(revocationIds);
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
        if (getTrustStoreArn() != null)
            sb.append("TrustStoreArn: ").append(getTrustStoreArn()).append(",");
        if (getRevocationIds() != null)
            sb.append("RevocationIds: ").append(getRevocationIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTrustStoreRevocationsRequest == false)
            return false;
        RemoveTrustStoreRevocationsRequest other = (RemoveTrustStoreRevocationsRequest) obj;
        if (other.getTrustStoreArn() == null ^ this.getTrustStoreArn() == null)
            return false;
        if (other.getTrustStoreArn() != null && other.getTrustStoreArn().equals(this.getTrustStoreArn()) == false)
            return false;
        if (other.getRevocationIds() == null ^ this.getRevocationIds() == null)
            return false;
        if (other.getRevocationIds() != null && other.getRevocationIds().equals(this.getRevocationIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrustStoreArn() == null) ? 0 : getTrustStoreArn().hashCode());
        hashCode = prime * hashCode + ((getRevocationIds() == null) ? 0 : getRevocationIds().hashCode());
        return hashCode;
    }

    @Override
    public RemoveTrustStoreRevocationsRequest clone() {
        return (RemoveTrustStoreRevocationsRequest) super.clone();
    }

}
