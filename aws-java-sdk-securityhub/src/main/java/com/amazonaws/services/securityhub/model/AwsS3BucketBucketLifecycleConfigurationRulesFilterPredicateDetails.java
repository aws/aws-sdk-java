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
 * The configuration for the filter.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The values to use for the filter.
     * </p>
     */
    private java.util.List<AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails> operands;
    /**
     * <p>
     * A prefix filter.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * A tag filter.
     * </p>
     */
    private AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateTagDetails tag;
    /**
     * <p>
     * Whether to use <code>AND</code> or <code>OR</code> to join the operands.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The values to use for the filter.
     * </p>
     * 
     * @return The values to use for the filter.
     */

    public java.util.List<AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails> getOperands() {
        return operands;
    }

    /**
     * <p>
     * The values to use for the filter.
     * </p>
     * 
     * @param operands
     *        The values to use for the filter.
     */

    public void setOperands(java.util.Collection<AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails> operands) {
        if (operands == null) {
            this.operands = null;
            return;
        }

        this.operands = new java.util.ArrayList<AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails>(operands);
    }

    /**
     * <p>
     * The values to use for the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperands(java.util.Collection)} or {@link #withOperands(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param operands
     *        The values to use for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails withOperands(
            AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails... operands) {
        if (this.operands == null) {
            setOperands(new java.util.ArrayList<AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails>(operands.length));
        }
        for (AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails ele : operands) {
            this.operands.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values to use for the filter.
     * </p>
     * 
     * @param operands
     *        The values to use for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails withOperands(
            java.util.Collection<AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateOperandsDetails> operands) {
        setOperands(operands);
        return this;
    }

    /**
     * <p>
     * A prefix filter.
     * </p>
     * 
     * @param prefix
     *        A prefix filter.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * A prefix filter.
     * </p>
     * 
     * @return A prefix filter.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * A prefix filter.
     * </p>
     * 
     * @param prefix
     *        A prefix filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * A tag filter.
     * </p>
     * 
     * @param tag
     *        A tag filter.
     */

    public void setTag(AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateTagDetails tag) {
        this.tag = tag;
    }

    /**
     * <p>
     * A tag filter.
     * </p>
     * 
     * @return A tag filter.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateTagDetails getTag() {
        return this.tag;
    }

    /**
     * <p>
     * A tag filter.
     * </p>
     * 
     * @param tag
     *        A tag filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails withTag(AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateTagDetails tag) {
        setTag(tag);
        return this;
    }

    /**
     * <p>
     * Whether to use <code>AND</code> or <code>OR</code> to join the operands.
     * </p>
     * 
     * @param type
     *        Whether to use <code>AND</code> or <code>OR</code> to join the operands.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Whether to use <code>AND</code> or <code>OR</code> to join the operands.
     * </p>
     * 
     * @return Whether to use <code>AND</code> or <code>OR</code> to join the operands.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Whether to use <code>AND</code> or <code>OR</code> to join the operands.
     * </p>
     * 
     * @param type
     *        Whether to use <code>AND</code> or <code>OR</code> to join the operands.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails withType(String type) {
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
        if (getOperands() != null)
            sb.append("Operands: ").append(getOperands()).append(",");
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

        if (obj instanceof AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails == false)
            return false;
        AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails other = (AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails) obj;
        if (other.getOperands() == null ^ this.getOperands() == null)
            return false;
        if (other.getOperands() != null && other.getOperands().equals(this.getOperands()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getOperands() == null) ? 0 : getOperands().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getTag() == null) ? 0 : getTag().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails clone() {
        try {
            return (AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketBucketLifecycleConfigurationRulesFilterPredicateDetailsMarshaller.getInstance().marshall(
                this, protocolMarshaller);
    }
}
