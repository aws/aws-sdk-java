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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The definition of <code>tagQuery</code>. Specifies which resources are associated with an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/TagQueryConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagQueryConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Condition in the IAM policy that associates resources to an application.
     * </p>
     */
    private String tagKey;

    /**
     * <p>
     * Condition in the IAM policy that associates resources to an application.
     * </p>
     * 
     * @param tagKey
     *        Condition in the IAM policy that associates resources to an application.
     */

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * Condition in the IAM policy that associates resources to an application.
     * </p>
     * 
     * @return Condition in the IAM policy that associates resources to an application.
     */

    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * <p>
     * Condition in the IAM policy that associates resources to an application.
     * </p>
     * 
     * @param tagKey
     *        Condition in the IAM policy that associates resources to an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagQueryConfiguration withTagKey(String tagKey) {
        setTagKey(tagKey);
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
        if (getTagKey() != null)
            sb.append("TagKey: ").append(getTagKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagQueryConfiguration == false)
            return false;
        TagQueryConfiguration other = (TagQueryConfiguration) obj;
        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        return hashCode;
    }

    @Override
    public TagQueryConfiguration clone() {
        try {
            return (TagQueryConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appregistry.model.transform.TagQueryConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
