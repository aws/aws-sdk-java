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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The resource tags that AWS Firewall Manager uses to determine if a particular resource should be included or excluded
 * from protection by the AWS Firewall Manager policy. Tags enable you to categorize your AWS resources in different
 * ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
 * you define. Tags are combined with an "OR." That is, if you add more than one tag, if any of the tags matches, the
 * resource is considered a match for the include or exclude. <a
 * href="https://docs.aws.amazon.com/awsconsolehelpdocs/latest/gsg/tag-editor.html">Working with Tag Editor</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ResourceTag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceTag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource tag key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The resource tag value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The resource tag key.
     * </p>
     * 
     * @param key
     *        The resource tag key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The resource tag key.
     * </p>
     * 
     * @return The resource tag key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The resource tag key.
     * </p>
     * 
     * @param key
     *        The resource tag key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceTag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The resource tag value.
     * </p>
     * 
     * @param value
     *        The resource tag value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The resource tag value.
     * </p>
     * 
     * @return The resource tag value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The resource tag value.
     * </p>
     * 
     * @param value
     *        The resource tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceTag withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
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
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
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
        com.amazonaws.services.fms.model.transform.ResourceTagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
