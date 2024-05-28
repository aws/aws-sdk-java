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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The search criteria to be used to return tags.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TagSearchCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagSearchCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tag key used in the tag search condition.
     * </p>
     */
    private String tagKey;
    /**
     * <p>
     * The tag value used in the tag search condition.
     * </p>
     */
    private String tagValue;
    /**
     * <p>
     * The type of comparison to be made when evaluating the tag key in tag search condition.
     * </p>
     */
    private String tagKeyComparisonType;
    /**
     * <p>
     * The type of comparison to be made when evaluating the tag value in tag search condition.
     * </p>
     */
    private String tagValueComparisonType;

    /**
     * <p>
     * The tag key used in the tag search condition.
     * </p>
     * 
     * @param tagKey
     *        The tag key used in the tag search condition.
     */

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * The tag key used in the tag search condition.
     * </p>
     * 
     * @return The tag key used in the tag search condition.
     */

    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * <p>
     * The tag key used in the tag search condition.
     * </p>
     * 
     * @param tagKey
     *        The tag key used in the tag search condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagSearchCondition withTagKey(String tagKey) {
        setTagKey(tagKey);
        return this;
    }

    /**
     * <p>
     * The tag value used in the tag search condition.
     * </p>
     * 
     * @param tagValue
     *        The tag value used in the tag search condition.
     */

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    /**
     * <p>
     * The tag value used in the tag search condition.
     * </p>
     * 
     * @return The tag value used in the tag search condition.
     */

    public String getTagValue() {
        return this.tagValue;
    }

    /**
     * <p>
     * The tag value used in the tag search condition.
     * </p>
     * 
     * @param tagValue
     *        The tag value used in the tag search condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagSearchCondition withTagValue(String tagValue) {
        setTagValue(tagValue);
        return this;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag key in tag search condition.
     * </p>
     * 
     * @param tagKeyComparisonType
     *        The type of comparison to be made when evaluating the tag key in tag search condition.
     * @see StringComparisonType
     */

    public void setTagKeyComparisonType(String tagKeyComparisonType) {
        this.tagKeyComparisonType = tagKeyComparisonType;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag key in tag search condition.
     * </p>
     * 
     * @return The type of comparison to be made when evaluating the tag key in tag search condition.
     * @see StringComparisonType
     */

    public String getTagKeyComparisonType() {
        return this.tagKeyComparisonType;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag key in tag search condition.
     * </p>
     * 
     * @param tagKeyComparisonType
     *        The type of comparison to be made when evaluating the tag key in tag search condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StringComparisonType
     */

    public TagSearchCondition withTagKeyComparisonType(String tagKeyComparisonType) {
        setTagKeyComparisonType(tagKeyComparisonType);
        return this;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag key in tag search condition.
     * </p>
     * 
     * @param tagKeyComparisonType
     *        The type of comparison to be made when evaluating the tag key in tag search condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StringComparisonType
     */

    public TagSearchCondition withTagKeyComparisonType(StringComparisonType tagKeyComparisonType) {
        this.tagKeyComparisonType = tagKeyComparisonType.toString();
        return this;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag value in tag search condition.
     * </p>
     * 
     * @param tagValueComparisonType
     *        The type of comparison to be made when evaluating the tag value in tag search condition.
     * @see StringComparisonType
     */

    public void setTagValueComparisonType(String tagValueComparisonType) {
        this.tagValueComparisonType = tagValueComparisonType;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag value in tag search condition.
     * </p>
     * 
     * @return The type of comparison to be made when evaluating the tag value in tag search condition.
     * @see StringComparisonType
     */

    public String getTagValueComparisonType() {
        return this.tagValueComparisonType;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag value in tag search condition.
     * </p>
     * 
     * @param tagValueComparisonType
     *        The type of comparison to be made when evaluating the tag value in tag search condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StringComparisonType
     */

    public TagSearchCondition withTagValueComparisonType(String tagValueComparisonType) {
        setTagValueComparisonType(tagValueComparisonType);
        return this;
    }

    /**
     * <p>
     * The type of comparison to be made when evaluating the tag value in tag search condition.
     * </p>
     * 
     * @param tagValueComparisonType
     *        The type of comparison to be made when evaluating the tag value in tag search condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StringComparisonType
     */

    public TagSearchCondition withTagValueComparisonType(StringComparisonType tagValueComparisonType) {
        this.tagValueComparisonType = tagValueComparisonType.toString();
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
            sb.append("TagValue: ").append(getTagValue()).append(",");
        if (getTagKeyComparisonType() != null)
            sb.append("TagKeyComparisonType: ").append(getTagKeyComparisonType()).append(",");
        if (getTagValueComparisonType() != null)
            sb.append("TagValueComparisonType: ").append(getTagValueComparisonType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagSearchCondition == false)
            return false;
        TagSearchCondition other = (TagSearchCondition) obj;
        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        if (other.getTagValue() == null ^ this.getTagValue() == null)
            return false;
        if (other.getTagValue() != null && other.getTagValue().equals(this.getTagValue()) == false)
            return false;
        if (other.getTagKeyComparisonType() == null ^ this.getTagKeyComparisonType() == null)
            return false;
        if (other.getTagKeyComparisonType() != null && other.getTagKeyComparisonType().equals(this.getTagKeyComparisonType()) == false)
            return false;
        if (other.getTagValueComparisonType() == null ^ this.getTagValueComparisonType() == null)
            return false;
        if (other.getTagValueComparisonType() != null && other.getTagValueComparisonType().equals(this.getTagValueComparisonType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getTagValue() == null) ? 0 : getTagValue().hashCode());
        hashCode = prime * hashCode + ((getTagKeyComparisonType() == null) ? 0 : getTagKeyComparisonType().hashCode());
        hashCode = prime * hashCode + ((getTagValueComparisonType() == null) ? 0 : getTagValueComparisonType().hashCode());
        return hashCode;
    }

    @Override
    public TagSearchCondition clone() {
        try {
            return (TagSearchCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.TagSearchConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
