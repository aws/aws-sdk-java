/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListProvisionedConcurrencyConfigs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListProvisionedConcurrencyConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of provisioned concurrency configurations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProvisionedConcurrencyConfigListItem> provisionedConcurrencyConfigs;
    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * A list of provisioned concurrency configurations.
     * </p>
     * 
     * @return A list of provisioned concurrency configurations.
     */

    public java.util.List<ProvisionedConcurrencyConfigListItem> getProvisionedConcurrencyConfigs() {
        if (provisionedConcurrencyConfigs == null) {
            provisionedConcurrencyConfigs = new com.amazonaws.internal.SdkInternalList<ProvisionedConcurrencyConfigListItem>();
        }
        return provisionedConcurrencyConfigs;
    }

    /**
     * <p>
     * A list of provisioned concurrency configurations.
     * </p>
     * 
     * @param provisionedConcurrencyConfigs
     *        A list of provisioned concurrency configurations.
     */

    public void setProvisionedConcurrencyConfigs(java.util.Collection<ProvisionedConcurrencyConfigListItem> provisionedConcurrencyConfigs) {
        if (provisionedConcurrencyConfigs == null) {
            this.provisionedConcurrencyConfigs = null;
            return;
        }

        this.provisionedConcurrencyConfigs = new com.amazonaws.internal.SdkInternalList<ProvisionedConcurrencyConfigListItem>(provisionedConcurrencyConfigs);
    }

    /**
     * <p>
     * A list of provisioned concurrency configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisionedConcurrencyConfigs(java.util.Collection)} or
     * {@link #withProvisionedConcurrencyConfigs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param provisionedConcurrencyConfigs
     *        A list of provisioned concurrency configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisionedConcurrencyConfigsResult withProvisionedConcurrencyConfigs(ProvisionedConcurrencyConfigListItem... provisionedConcurrencyConfigs) {
        if (this.provisionedConcurrencyConfigs == null) {
            setProvisionedConcurrencyConfigs(new com.amazonaws.internal.SdkInternalList<ProvisionedConcurrencyConfigListItem>(
                    provisionedConcurrencyConfigs.length));
        }
        for (ProvisionedConcurrencyConfigListItem ele : provisionedConcurrencyConfigs) {
            this.provisionedConcurrencyConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of provisioned concurrency configurations.
     * </p>
     * 
     * @param provisionedConcurrencyConfigs
     *        A list of provisioned concurrency configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisionedConcurrencyConfigsResult withProvisionedConcurrencyConfigs(
            java.util.Collection<ProvisionedConcurrencyConfigListItem> provisionedConcurrencyConfigs) {
        setProvisionedConcurrencyConfigs(provisionedConcurrencyConfigs);
        return this;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextMarker
     *        The pagination token that's included if more results are available.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @return The pagination token that's included if more results are available.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextMarker
     *        The pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListProvisionedConcurrencyConfigsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
        if (getProvisionedConcurrencyConfigs() != null)
            sb.append("ProvisionedConcurrencyConfigs: ").append(getProvisionedConcurrencyConfigs()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProvisionedConcurrencyConfigsResult == false)
            return false;
        ListProvisionedConcurrencyConfigsResult other = (ListProvisionedConcurrencyConfigsResult) obj;
        if (other.getProvisionedConcurrencyConfigs() == null ^ this.getProvisionedConcurrencyConfigs() == null)
            return false;
        if (other.getProvisionedConcurrencyConfigs() != null
                && other.getProvisionedConcurrencyConfigs().equals(this.getProvisionedConcurrencyConfigs()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisionedConcurrencyConfigs() == null) ? 0 : getProvisionedConcurrencyConfigs().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListProvisionedConcurrencyConfigsResult clone() {
        try {
            return (ListProvisionedConcurrencyConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
