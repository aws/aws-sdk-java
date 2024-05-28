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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A filter that identifies the subset of objects to which the replication rule applies. A <code>Filter</code> element
 * must specify exactly one <code>Prefix</code>, <code>Tag</code>, or <code>And</code> child element.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ReplicationRuleFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationRuleFilter implements Serializable, Cloneable {

    /**
     * <p>
     * An object key name prefix that identifies the subset of objects that the rule applies to.
     * </p>
     * <important>
     * <p>
     * When you're using XML requests, you must replace special characters (such as carriage returns) in object keys
     * with their equivalent XML entity codes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
     * XML-related object key constraints</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     */
    private String prefix;

    private S3Tag tag;
    /**
     * <p>
     * A container for specifying rule filters. The filters determine the subset of objects that the rule applies to.
     * This element is required only if you specify more than one filter. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
     * <code>And</code> element.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code>
     * element.
     * </p>
     * </li>
     * </ul>
     */
    private ReplicationRuleAndOperator and;

    /**
     * <p>
     * An object key name prefix that identifies the subset of objects that the rule applies to.
     * </p>
     * <important>
     * <p>
     * When you're using XML requests, you must replace special characters (such as carriage returns) in object keys
     * with their equivalent XML entity codes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
     * XML-related object key constraints</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     * 
     * @param prefix
     *        An object key name prefix that identifies the subset of objects that the rule applies to.</p> <important>
     *        <p>
     *        When you're using XML requests, you must replace special characters (such as carriage returns) in object
     *        keys with their equivalent XML entity codes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *        > XML-related object key constraints</a> in the <i>Amazon S3 User Guide</i>.
     *        </p>
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * An object key name prefix that identifies the subset of objects that the rule applies to.
     * </p>
     * <important>
     * <p>
     * When you're using XML requests, you must replace special characters (such as carriage returns) in object keys
     * with their equivalent XML entity codes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
     * XML-related object key constraints</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     * 
     * @return An object key name prefix that identifies the subset of objects that the rule applies to.</p> <important>
     *         <p>
     *         When you're using XML requests, you must replace special characters (such as carriage returns) in object
     *         keys with their equivalent XML entity codes. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *         > XML-related object key constraints</a> in the <i>Amazon S3 User Guide</i>.
     *         </p>
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * An object key name prefix that identifies the subset of objects that the rule applies to.
     * </p>
     * <important>
     * <p>
     * When you're using XML requests, you must replace special characters (such as carriage returns) in object keys
     * with their equivalent XML entity codes. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
     * XML-related object key constraints</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </important>
     * 
     * @param prefix
     *        An object key name prefix that identifies the subset of objects that the rule applies to.</p> <important>
     *        <p>
     *        When you're using XML requests, you must replace special characters (such as carriage returns) in object
     *        keys with their equivalent XML entity codes. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints"
     *        > XML-related object key constraints</a> in the <i>Amazon S3 User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRuleFilter withPrefix(String prefix) {
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

    public ReplicationRuleFilter withTag(S3Tag tag) {
        setTag(tag);
        return this;
    }

    /**
     * <p>
     * A container for specifying rule filters. The filters determine the subset of objects that the rule applies to.
     * This element is required only if you specify more than one filter. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
     * <code>And</code> element.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code>
     * element.
     * </p>
     * </li>
     * </ul>
     * 
     * @param and
     *        A container for specifying rule filters. The filters determine the subset of objects that the rule applies
     *        to. This element is required only if you specify more than one filter. For example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
     *        <code>And</code> element.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code>
     *        element.
     *        </p>
     *        </li>
     */

    public void setAnd(ReplicationRuleAndOperator and) {
        this.and = and;
    }

    /**
     * <p>
     * A container for specifying rule filters. The filters determine the subset of objects that the rule applies to.
     * This element is required only if you specify more than one filter. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
     * <code>And</code> element.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code>
     * element.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A container for specifying rule filters. The filters determine the subset of objects that the rule
     *         applies to. This element is required only if you specify more than one filter. For example: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
     *         <code>And</code> element.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code>
     *         element.
     *         </p>
     *         </li>
     */

    public ReplicationRuleAndOperator getAnd() {
        return this.and;
    }

    /**
     * <p>
     * A container for specifying rule filters. The filters determine the subset of objects that the rule applies to.
     * This element is required only if you specify more than one filter. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
     * <code>And</code> element.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code>
     * element.
     * </p>
     * </li>
     * </ul>
     * 
     * @param and
     *        A container for specifying rule filters. The filters determine the subset of objects that the rule applies
     *        to. This element is required only if you specify more than one filter. For example: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify both a <code>Prefix</code> and a <code>Tag</code> filter, wrap these filters in an
     *        <code>And</code> element.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a filter based on multiple tags, wrap the <code>Tag</code> elements in an <code>And</code>
     *        element.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRuleFilter withAnd(ReplicationRuleAndOperator and) {
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

        if (obj instanceof ReplicationRuleFilter == false)
            return false;
        ReplicationRuleFilter other = (ReplicationRuleFilter) obj;
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
    public ReplicationRuleFilter clone() {
        try {
            return (ReplicationRuleFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
