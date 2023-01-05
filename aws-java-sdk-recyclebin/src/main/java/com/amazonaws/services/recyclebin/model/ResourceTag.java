/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.recyclebin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the resource tags used to identify resources that are retained by the retention rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/ResourceTag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceTag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tag key.
     * </p>
     */
    private String resourceTagKey;
    /**
     * <p>
     * The tag value.
     * </p>
     */
    private String resourceTagValue;

    /**
     * <p>
     * The tag key.
     * </p>
     * 
     * @param resourceTagKey
     *        The tag key.
     */

    public void setResourceTagKey(String resourceTagKey) {
        this.resourceTagKey = resourceTagKey;
    }

    /**
     * <p>
     * The tag key.
     * </p>
     * 
     * @return The tag key.
     */

    public String getResourceTagKey() {
        return this.resourceTagKey;
    }

    /**
     * <p>
     * The tag key.
     * </p>
     * 
     * @param resourceTagKey
     *        The tag key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceTag withResourceTagKey(String resourceTagKey) {
        setResourceTagKey(resourceTagKey);
        return this;
    }

    /**
     * <p>
     * The tag value.
     * </p>
     * 
     * @param resourceTagValue
     *        The tag value.
     */

    public void setResourceTagValue(String resourceTagValue) {
        this.resourceTagValue = resourceTagValue;
    }

    /**
     * <p>
     * The tag value.
     * </p>
     * 
     * @return The tag value.
     */

    public String getResourceTagValue() {
        return this.resourceTagValue;
    }

    /**
     * <p>
     * The tag value.
     * </p>
     * 
     * @param resourceTagValue
     *        The tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceTag withResourceTagValue(String resourceTagValue) {
        setResourceTagValue(resourceTagValue);
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
        if (getResourceTagKey() != null)
            sb.append("ResourceTagKey: ").append(getResourceTagKey()).append(",");
        if (getResourceTagValue() != null)
            sb.append("ResourceTagValue: ").append(getResourceTagValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceTag == false)
            return false;
        ResourceTag other = (ResourceTag) obj;
        if (other.getResourceTagKey() == null ^ this.getResourceTagKey() == null)
            return false;
        if (other.getResourceTagKey() != null && other.getResourceTagKey().equals(this.getResourceTagKey()) == false)
            return false;
        if (other.getResourceTagValue() == null ^ this.getResourceTagValue() == null)
            return false;
        if (other.getResourceTagValue() != null && other.getResourceTagValue().equals(this.getResourceTagValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceTagKey() == null) ? 0 : getResourceTagKey().hashCode());
        hashCode = prime * hashCode + ((getResourceTagValue() == null) ? 0 : getResourceTagValue().hashCode());
        return hashCode;
    }

    @Override
    public ResourceTag clone() {
        try {
            return (ResourceTag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.recyclebin.model.transform.ResourceTagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
