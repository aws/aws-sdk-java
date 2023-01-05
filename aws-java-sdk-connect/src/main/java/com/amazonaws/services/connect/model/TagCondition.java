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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A leaf node condition which can be used to specify a tag condition, for example, <code>HAVE BPO = 123</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TagCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tag key in the tag condition.
     * </p>
     */
    private String tagKey;
    /**
     * <p>
     * The tag value in the tag condition.
     * </p>
     */
    private String tagValue;

    /**
     * <p>
     * The tag key in the tag condition.
     * </p>
     * 
     * @param tagKey
     *        The tag key in the tag condition.
     */

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * The tag key in the tag condition.
     * </p>
     * 
     * @return The tag key in the tag condition.
     */

    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * <p>
     * The tag key in the tag condition.
     * </p>
     * 
     * @param tagKey
     *        The tag key in the tag condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagCondition withTagKey(String tagKey) {
        setTagKey(tagKey);
        return this;
    }

    /**
     * <p>
     * The tag value in the tag condition.
     * </p>
     * 
     * @param tagValue
     *        The tag value in the tag condition.
     */

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    /**
     * <p>
     * The tag value in the tag condition.
     * </p>
     * 
     * @return The tag value in the tag condition.
     */

    public String getTagValue() {
        return this.tagValue;
    }

    /**
     * <p>
     * The tag value in the tag condition.
     * </p>
     * 
     * @param tagValue
     *        The tag value in the tag condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagCondition withTagValue(String tagValue) {
        setTagValue(tagValue);
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
            sb.append("TagKey: ").append(getTagKey()).append(",");
        if (getTagValue() != null)
            sb.append("TagValue: ").append(getTagValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagCondition == false)
            return false;
        TagCondition other = (TagCondition) obj;
        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        if (other.getTagValue() == null ^ this.getTagValue() == null)
            return false;
        if (other.getTagValue() != null && other.getTagValue().equals(this.getTagValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getTagValue() == null) ? 0 : getTagValue().hashCode());
        return hashCode;
    }

    @Override
    public TagCondition clone() {
        try {
            return (TagCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.TagConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
