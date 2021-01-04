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
 * The container for the Outposts bucket lifecycle rule and operator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/LifecycleRuleAndOperator" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecycleRuleAndOperator implements Serializable, Cloneable {

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * All of these tags must exist in the object's tag set in order for the rule to apply.
     * </p>
     */
    private java.util.List<S3Tag> tags;

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     * 
     * @param prefix
     *        Prefix identifying one or more objects to which the rule applies.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     * 
     * @return Prefix identifying one or more objects to which the rule applies.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies.
     * </p>
     * 
     * @param prefix
     *        Prefix identifying one or more objects to which the rule applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleRuleAndOperator withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * All of these tags must exist in the object's tag set in order for the rule to apply.
     * </p>
     * 
     * @return All of these tags must exist in the object's tag set in order for the rule to apply.
     */

    public java.util.List<S3Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * All of these tags must exist in the object's tag set in order for the rule to apply.
     * </p>
     * 
     * @param tags
     *        All of these tags must exist in the object's tag set in order for the rule to apply.
     */

    public void setTags(java.util.Collection<S3Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<S3Tag>(tags);
    }

    /**
     * <p>
     * All of these tags must exist in the object's tag set in order for the rule to apply.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        All of these tags must exist in the object's tag set in order for the rule to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleRuleAndOperator withTags(S3Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<S3Tag>(tags.length));
        }
        for (S3Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * All of these tags must exist in the object's tag set in order for the rule to apply.
     * </p>
     * 
     * @param tags
     *        All of these tags must exist in the object's tag set in order for the rule to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleRuleAndOperator withTags(java.util.Collection<S3Tag> tags) {
        setTags(tags);
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecycleRuleAndOperator == false)
            return false;
        LifecycleRuleAndOperator other = (LifecycleRuleAndOperator) obj;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public LifecycleRuleAndOperator clone() {
        try {
            return (LifecycleRuleAndOperator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
