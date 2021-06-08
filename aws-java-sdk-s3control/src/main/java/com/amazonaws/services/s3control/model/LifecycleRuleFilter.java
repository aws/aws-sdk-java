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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The container for the filter of the lifecycle rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/LifecycleRuleFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecycleRuleFilter implements Serializable, Cloneable {

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     * <important>
     * <p>
     * Replacement must be made for object keys containing special characters (such as carriage returns) when using XML
     * requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"> XML
     * related object key constraints</a>.
     * </p>
     * </important>
     */
    private String prefix;

    private S3Tag tag;
    /**
     * <p>
     * The container for the <code>AND</code> condition for the lifecycle rule.
     * </p>
     */
    private LifecycleRuleAndOperator and;

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     * <important>
     * <p>
     * Replacement must be made for object keys containing special characters (such as carriage returns) when using XML
     * requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"> XML
     * related object key constraints</a>.
     * </p>
     * </important>
     * 
     * @param prefix
     *        Prefix identifying one or more objects to which the rule applies.</p> <important>
     *        <p>
     *        Replacement must be made for object keys containing special characters (such as carriage returns) when
     *        using XML requests. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *        > XML related object key constraints</a>.
     *        </p>
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     * <important>
     * <p>
     * Replacement must be made for object keys containing special characters (such as carriage returns) when using XML
     * requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"> XML
     * related object key constraints</a>.
     * </p>
     * </important>
     * 
     * @return Prefix identifying one or more objects to which the rule applies.</p> <important>
     *         <p>
     *         Replacement must be made for object keys containing special characters (such as carriage returns) when
     *         using XML requests. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *         > XML related object key constraints</a>.
     *         </p>
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     * <important>
     * <p>
     * Replacement must be made for object keys containing special characters (such as carriage returns) when using XML
     * requests. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"> XML
     * related object key constraints</a>.
     * </p>
     * </important>
     * 
     * @param prefix
     *        Prefix identifying one or more objects to which the rule applies.</p> <important>
     *        <p>
     *        Replacement must be made for object keys containing special characters (such as carriage returns) when
     *        using XML requests. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *        > XML related object key constraints</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleRuleFilter withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * @param tag
     */

    public void setTag(S3Tag tag) {
        this.tag = tag;
    }

    /**
     * @return
     */

    public S3Tag getTag() {
        return this.tag;
    }

    /**
     * @param tag
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleRuleFilter withTag(S3Tag tag) {
        setTag(tag);
        return this;
    }

    /**
     * <p>
     * The container for the <code>AND</code> condition for the lifecycle rule.
     * </p>
     * 
     * @param and
     *        The container for the <code>AND</code> condition for the lifecycle rule.
     */

    public void setAnd(LifecycleRuleAndOperator and) {
        this.and = and;
    }

    /**
     * <p>
     * The container for the <code>AND</code> condition for the lifecycle rule.
     * </p>
     * 
     * @return The container for the <code>AND</code> condition for the lifecycle rule.
     */

    public LifecycleRuleAndOperator getAnd() {
        return this.and;
    }

    /**
     * <p>
     * The container for the <code>AND</code> condition for the lifecycle rule.
     * </p>
     * 
     * @param and
     *        The container for the <code>AND</code> condition for the lifecycle rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleRuleFilter withAnd(LifecycleRuleAndOperator and) {
        setAnd(and);
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
        if (getAnd() != null)
            sb.append("And: ").append(getAnd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecycleRuleFilter == false)
            return false;
        LifecycleRuleFilter other = (LifecycleRuleFilter) obj;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getTag() == null ^ this.getTag() == null)
            return false;
        if (other.getTag() != null && other.getTag().equals(this.getTag()) == false)
            return false;
        if (other.getAnd() == null ^ this.getAnd() == null)
            return false;
        if (other.getAnd() != null && other.getAnd().equals(this.getAnd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getTag() == null) ? 0 : getTag().hashCode());
        hashCode = prime * hashCode + ((getAnd() == null) ? 0 : getAnd().hashCode());
        return hashCode;
    }

    @Override
    public LifecycleRuleFilter clone() {
        try {
            return (LifecycleRuleFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
