/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about caching for the distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCloudFrontDistributionCacheBehaviors"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFrontDistributionCacheBehaviors implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cache behaviors for the distribution.
     * </p>
     */
    private java.util.List<AwsCloudFrontDistributionCacheBehavior> items;

    /**
     * <p>
     * The cache behaviors for the distribution.
     * </p>
     * 
     * @return The cache behaviors for the distribution.
     */

    public java.util.List<AwsCloudFrontDistributionCacheBehavior> getItems() {
        return items;
    }

    /**
     * <p>
     * The cache behaviors for the distribution.
     * </p>
     * 
     * @param items
     *        The cache behaviors for the distribution.
     */

    public void setItems(java.util.Collection<AwsCloudFrontDistributionCacheBehavior> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<AwsCloudFrontDistributionCacheBehavior>(items);
    }

    /**
     * <p>
     * The cache behaviors for the distribution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The cache behaviors for the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionCacheBehaviors withItems(AwsCloudFrontDistributionCacheBehavior... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<AwsCloudFrontDistributionCacheBehavior>(items.length));
        }
        for (AwsCloudFrontDistributionCacheBehavior ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The cache behaviors for the distribution.
     * </p>
     * 
     * @param items
     *        The cache behaviors for the distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionCacheBehaviors withItems(java.util.Collection<AwsCloudFrontDistributionCacheBehavior> items) {
        setItems(items);
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
        if (getItems() != null)
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFrontDistributionCacheBehaviors == false)
            return false;
        AwsCloudFrontDistributionCacheBehaviors other = (AwsCloudFrontDistributionCacheBehaviors) obj;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudFrontDistributionCacheBehaviors clone() {
        try {
            return (AwsCloudFrontDistributionCacheBehaviors) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCloudFrontDistributionCacheBehaviorsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
