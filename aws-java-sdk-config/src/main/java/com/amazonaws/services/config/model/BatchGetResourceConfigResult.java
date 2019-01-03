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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/BatchGetResourceConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetResourceConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that contains the current configuration of one or more resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BaseConfigurationItem> baseConfigurationItems;
    /**
     * <p>
     * A list of resource keys that were not processed with the current response. The unprocessesResourceKeys value is
     * in the same form as ResourceKeys, so the value can be directly provided to a subsequent BatchGetResourceConfig
     * operation. If there are no unprocessed resource keys, the response contains an empty unprocessedResourceKeys
     * list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceKey> unprocessedResourceKeys;

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

    public BatchGetResourceConfigResult withBaseConfigurationItems(BaseConfigurationItem... baseConfigurationItems) {
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

    public BatchGetResourceConfigResult withBaseConfigurationItems(java.util.Collection<BaseConfigurationItem> baseConfigurationItems) {
        setBaseConfigurationItems(baseConfigurationItems);
        return this;
    }

    /**
     * <p>
     * A list of resource keys that were not processed with the current response. The unprocessesResourceKeys value is
     * in the same form as ResourceKeys, so the value can be directly provided to a subsequent BatchGetResourceConfig
     * operation. If there are no unprocessed resource keys, the response contains an empty unprocessedResourceKeys
     * list.
     * </p>
     * 
     * @return A list of resource keys that were not processed with the current response. The unprocessesResourceKeys
     *         value is in the same form as ResourceKeys, so the value can be directly provided to a subsequent
     *         BatchGetResourceConfig operation. If there are no unprocessed resource keys, the response contains an
     *         empty unprocessedResourceKeys list.
     */

    public java.util.List<ResourceKey> getUnprocessedResourceKeys() {
        if (unprocessedResourceKeys == null) {
            unprocessedResourceKeys = new com.amazonaws.internal.SdkInternalList<ResourceKey>();
        }
        return unprocessedResourceKeys;
    }

    /**
     * <p>
     * A list of resource keys that were not processed with the current response. The unprocessesResourceKeys value is
     * in the same form as ResourceKeys, so the value can be directly provided to a subsequent BatchGetResourceConfig
     * operation. If there are no unprocessed resource keys, the response contains an empty unprocessedResourceKeys
     * list.
     * </p>
     * 
     * @param unprocessedResourceKeys
     *        A list of resource keys that were not processed with the current response. The unprocessesResourceKeys
     *        value is in the same form as ResourceKeys, so the value can be directly provided to a subsequent
     *        BatchGetResourceConfig operation. If there are no unprocessed resource keys, the response contains an
     *        empty unprocessedResourceKeys list.
     */

    public void setUnprocessedResourceKeys(java.util.Collection<ResourceKey> unprocessedResourceKeys) {
        if (unprocessedResourceKeys == null) {
            this.unprocessedResourceKeys = null;
            return;
        }

        this.unprocessedResourceKeys = new com.amazonaws.internal.SdkInternalList<ResourceKey>(unprocessedResourceKeys);
    }

    /**
     * <p>
     * A list of resource keys that were not processed with the current response. The unprocessesResourceKeys value is
     * in the same form as ResourceKeys, so the value can be directly provided to a subsequent BatchGetResourceConfig
     * operation. If there are no unprocessed resource keys, the response contains an empty unprocessedResourceKeys
     * list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedResourceKeys(java.util.Collection)} or
     * {@link #withUnprocessedResourceKeys(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedResourceKeys
     *        A list of resource keys that were not processed with the current response. The unprocessesResourceKeys
     *        value is in the same form as ResourceKeys, so the value can be directly provided to a subsequent
     *        BatchGetResourceConfig operation. If there are no unprocessed resource keys, the response contains an
     *        empty unprocessedResourceKeys list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetResourceConfigResult withUnprocessedResourceKeys(ResourceKey... unprocessedResourceKeys) {
        if (this.unprocessedResourceKeys == null) {
            setUnprocessedResourceKeys(new com.amazonaws.internal.SdkInternalList<ResourceKey>(unprocessedResourceKeys.length));
        }
        for (ResourceKey ele : unprocessedResourceKeys) {
            this.unprocessedResourceKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource keys that were not processed with the current response. The unprocessesResourceKeys value is
     * in the same form as ResourceKeys, so the value can be directly provided to a subsequent BatchGetResourceConfig
     * operation. If there are no unprocessed resource keys, the response contains an empty unprocessedResourceKeys
     * list.
     * </p>
     * 
     * @param unprocessedResourceKeys
     *        A list of resource keys that were not processed with the current response. The unprocessesResourceKeys
     *        value is in the same form as ResourceKeys, so the value can be directly provided to a subsequent
     *        BatchGetResourceConfig operation. If there are no unprocessed resource keys, the response contains an
     *        empty unprocessedResourceKeys list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetResourceConfigResult withUnprocessedResourceKeys(java.util.Collection<ResourceKey> unprocessedResourceKeys) {
        setUnprocessedResourceKeys(unprocessedResourceKeys);
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
        if (getUnprocessedResourceKeys() != null)
            sb.append("UnprocessedResourceKeys: ").append(getUnprocessedResourceKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetResourceConfigResult == false)
            return false;
        BatchGetResourceConfigResult other = (BatchGetResourceConfigResult) obj;
        if (other.getBaseConfigurationItems() == null ^ this.getBaseConfigurationItems() == null)
            return false;
        if (other.getBaseConfigurationItems() != null && other.getBaseConfigurationItems().equals(this.getBaseConfigurationItems()) == false)
            return false;
        if (other.getUnprocessedResourceKeys() == null ^ this.getUnprocessedResourceKeys() == null)
            return false;
        if (other.getUnprocessedResourceKeys() != null && other.getUnprocessedResourceKeys().equals(this.getUnprocessedResourceKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseConfigurationItems() == null) ? 0 : getBaseConfigurationItems().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedResourceKeys() == null) ? 0 : getUnprocessedResourceKeys().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetResourceConfigResult clone() {
        try {
            return (BatchGetResourceConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
