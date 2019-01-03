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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/BatchGetAggregateResourceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAggregateResourceConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list that contains the current configuration of one or more resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BaseConfigurationItem> baseConfigurationItems;
    /**
     * <p>
     * A list of resource identifiers that were not processed with current scope. The list is empty if all the resources
     * are processed.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AggregateResourceIdentifier> unprocessedResourceIdentifiers;

    /**
     * <p>
     * A list that contains the current configuration of one or more resources.
     * </p>
     * 
     * @return A list that contains the current configuration of one or more resources.
     */

    public java.util.List<BaseConfigurationItem> getBaseConfigurationItems() {
        if (baseConfigurationItems == null) {
            baseConfigurationItems = new com.amazonaws.internal.SdkInternalList<BaseConfigurationItem>();
        }
        return baseConfigurationItems;
    }

    /**
     * <p>
     * A list that contains the current configuration of one or more resources.
     * </p>
     * 
     * @param baseConfigurationItems
     *        A list that contains the current configuration of one or more resources.
     */

    public void setBaseConfigurationItems(java.util.Collection<BaseConfigurationItem> baseConfigurationItems) {
        if (baseConfigurationItems == null) {
            this.baseConfigurationItems = null;
            return;
        }

        this.baseConfigurationItems = new com.amazonaws.internal.SdkInternalList<BaseConfigurationItem>(baseConfigurationItems);
    }

    /**
     * <p>
     * A list that contains the current configuration of one or more resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBaseConfigurationItems(java.util.Collection)} or
     * {@link #withBaseConfigurationItems(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param baseConfigurationItems
     *        A list that contains the current configuration of one or more resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAggregateResourceConfigResult withBaseConfigurationItems(BaseConfigurationItem... baseConfigurationItems) {
        if (this.baseConfigurationItems == null) {
            setBaseConfigurationItems(new com.amazonaws.internal.SdkInternalList<BaseConfigurationItem>(baseConfigurationItems.length));
        }
        for (BaseConfigurationItem ele : baseConfigurationItems) {
            this.baseConfigurationItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains the current configuration of one or more resources.
     * </p>
     * 
     * @param baseConfigurationItems
     *        A list that contains the current configuration of one or more resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAggregateResourceConfigResult withBaseConfigurationItems(java.util.Collection<BaseConfigurationItem> baseConfigurationItems) {
        setBaseConfigurationItems(baseConfigurationItems);
        return this;
    }

    /**
     * <p>
     * A list of resource identifiers that were not processed with current scope. The list is empty if all the resources
     * are processed.
     * </p>
     * 
     * @return A list of resource identifiers that were not processed with current scope. The list is empty if all the
     *         resources are processed.
     */

    public java.util.List<AggregateResourceIdentifier> getUnprocessedResourceIdentifiers() {
        if (unprocessedResourceIdentifiers == null) {
            unprocessedResourceIdentifiers = new com.amazonaws.internal.SdkInternalList<AggregateResourceIdentifier>();
        }
        return unprocessedResourceIdentifiers;
    }

    /**
     * <p>
     * A list of resource identifiers that were not processed with current scope. The list is empty if all the resources
     * are processed.
     * </p>
     * 
     * @param unprocessedResourceIdentifiers
     *        A list of resource identifiers that were not processed with current scope. The list is empty if all the
     *        resources are processed.
     */

    public void setUnprocessedResourceIdentifiers(java.util.Collection<AggregateResourceIdentifier> unprocessedResourceIdentifiers) {
        if (unprocessedResourceIdentifiers == null) {
            this.unprocessedResourceIdentifiers = null;
            return;
        }

        this.unprocessedResourceIdentifiers = new com.amazonaws.internal.SdkInternalList<AggregateResourceIdentifier>(unprocessedResourceIdentifiers);
    }

    /**
     * <p>
     * A list of resource identifiers that were not processed with current scope. The list is empty if all the resources
     * are processed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedResourceIdentifiers(java.util.Collection)} or
     * {@link #withUnprocessedResourceIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedResourceIdentifiers
     *        A list of resource identifiers that were not processed with current scope. The list is empty if all the
     *        resources are processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAggregateResourceConfigResult withUnprocessedResourceIdentifiers(AggregateResourceIdentifier... unprocessedResourceIdentifiers) {
        if (this.unprocessedResourceIdentifiers == null) {
            setUnprocessedResourceIdentifiers(new com.amazonaws.internal.SdkInternalList<AggregateResourceIdentifier>(unprocessedResourceIdentifiers.length));
        }
        for (AggregateResourceIdentifier ele : unprocessedResourceIdentifiers) {
            this.unprocessedResourceIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource identifiers that were not processed with current scope. The list is empty if all the resources
     * are processed.
     * </p>
     * 
     * @param unprocessedResourceIdentifiers
     *        A list of resource identifiers that were not processed with current scope. The list is empty if all the
     *        resources are processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetAggregateResourceConfigResult withUnprocessedResourceIdentifiers(
            java.util.Collection<AggregateResourceIdentifier> unprocessedResourceIdentifiers) {
        setUnprocessedResourceIdentifiers(unprocessedResourceIdentifiers);
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
        if (getBaseConfigurationItems() != null)
            sb.append("BaseConfigurationItems: ").append(getBaseConfigurationItems()).append(",");
        if (getUnprocessedResourceIdentifiers() != null)
            sb.append("UnprocessedResourceIdentifiers: ").append(getUnprocessedResourceIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetAggregateResourceConfigResult == false)
            return false;
        BatchGetAggregateResourceConfigResult other = (BatchGetAggregateResourceConfigResult) obj;
        if (other.getBaseConfigurationItems() == null ^ this.getBaseConfigurationItems() == null)
            return false;
        if (other.getBaseConfigurationItems() != null && other.getBaseConfigurationItems().equals(this.getBaseConfigurationItems()) == false)
            return false;
        if (other.getUnprocessedResourceIdentifiers() == null ^ this.getUnprocessedResourceIdentifiers() == null)
            return false;
        if (other.getUnprocessedResourceIdentifiers() != null
                && other.getUnprocessedResourceIdentifiers().equals(this.getUnprocessedResourceIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseConfigurationItems() == null) ? 0 : getBaseConfigurationItems().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedResourceIdentifiers() == null) ? 0 : getUnprocessedResourceIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetAggregateResourceConfigResult clone() {
        try {
            return (BatchGetAggregateResourceConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
