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
 * A value to use for the filter.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Prefix text for matching objects.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * A tag that is assigned to matching objects.
     * </p>
     */
    private AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails tag;
    /**
     * <p>
     * The type of filter value.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Prefix text for matching objects.
     * </p>
     * 
     * @param prefix
     *        Prefix text for matching objects.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Prefix text for matching objects.
     * </p>
     * 
     * @return Prefix text for matching objects.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * Prefix text for matching objects.
     * </p>
     * 
     * @param prefix
     *        Prefix text for matching objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * A tag that is assigned to matching objects.
     * </p>
     * 
     * @param tag
     *        A tag that is assigned to matching objects.
     */

    public void setTag(AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails tag) {
        this.tag = tag;
    }

    /**
     * <p>
     * A tag that is assigned to matching objects.
     * </p>
     * 
     * @return A tag that is assigned to matching objects.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails getTag() {
        return this.tag;
    }

    /**
     * <p>
     * A tag that is assigned to matching objects.
     * </p>
     * 
     * @param tag
     *        A tag that is assigned to matching objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails withTag(
            AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsTagDetails tag) {
        setTag(tag);
        return this;
    }

    /**
     * <p>
     * The type of filter value.
     * </p>
     * 
     * @param type
     *        The type of filter value.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of filter value.
     * </p>
     * 
     * @return The type of filter value.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of filter value.
     * </p>
     * 
     * @param type
     *        The type of filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails withType(String type) {
        setType(type);
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
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getTag() != null)
            sb.append("Tag: ").append(getTag()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails == false)
            return false;
        AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails other = (AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails) obj;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getTag() == null ^ this.getTag() == null)
            return false;
        if (other.getTag() != null && other.getTag().equals(this.getTag()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getTag() == null) ? 0 : getTag().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails clone() {
        try {
            return (AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetailsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
