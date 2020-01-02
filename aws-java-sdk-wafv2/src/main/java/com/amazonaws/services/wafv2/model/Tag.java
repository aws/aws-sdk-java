/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * A collection of key:value pairs associated with an AWS resource. The key:value pair can be anything you define.
 * Typically, the tag key represents a category (such as "environment") and the tag value represents a specific value
 * within that category (such as "test," "development," or "production"). You can add up to 50 tags to each AWS
 * resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/Tag" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Part of the key:value pair that defines a tag. You can use a tag key to describe a category of information, such
     * as "customer." Tag keys are case-sensitive.
     * </p>
     */
    private String key;
    /**
     * <p>
     * Part of the key:value pair that defines a tag. You can use a tag value to describe a specific value within a
     * category, such as "companyA" or "companyB." Tag values are case-sensitive.
     * </p>
     */
    private String value;

    /**
     * <p>
     * Part of the key:value pair that defines a tag. You can use a tag key to describe a category of information, such
     * as "customer." Tag keys are case-sensitive.
     * </p>
     * 
     * @param key
     *        Part of the key:value pair that defines a tag. You can use a tag key to describe a category of
     *        information, such as "customer." Tag keys are case-sensitive.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Part of the key:value pair that defines a tag. You can use a tag key to describe a category of information, such
     * as "customer." Tag keys are case-sensitive.
     * </p>
     * 
     * @return Part of the key:value pair that defines a tag. You can use a tag key to describe a category of
     *         information, such as "customer." Tag keys are case-sensitive.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * Part of the key:value pair that defines a tag. You can use a tag key to describe a category of information, such
     * as "customer." Tag keys are case-sensitive.
     * </p>
     * 
     * @param key
     *        Part of the key:value pair that defines a tag. You can use a tag key to describe a category of
     *        information, such as "customer." Tag keys are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Part of the key:value pair that defines a tag. You can use a tag value to describe a specific value within a
     * category, such as "companyA" or "companyB." Tag values are case-sensitive.
     * </p>
     * 
     * @param value
     *        Part of the key:value pair that defines a tag. You can use a tag value to describe a specific value within
     *        a category, such as "companyA" or "companyB." Tag values are case-sensitive.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Part of the key:value pair that defines a tag. You can use a tag value to describe a specific value within a
     * category, such as "companyA" or "companyB." Tag values are case-sensitive.
     * </p>
     * 
     * @return Part of the key:value pair that defines a tag. You can use a tag value to describe a specific value
     *         within a category, such as "companyA" or "companyB." Tag values are case-sensitive.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Part of the key:value pair that defines a tag. You can use a tag value to describe a specific value within a
     * category, such as "companyA" or "companyB." Tag values are case-sensitive.
     * </p>
     * 
     * @param value
     *        Part of the key:value pair that defines a tag. You can use a tag value to describe a specific value within
     *        a category, such as "companyA" or "companyB." Tag values are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withValue(String value) {
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

        if (obj instanceof Tag == false)
            return false;
        Tag other = (Tag) obj;
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
    public Tag clone() {
        try {
            return (Tag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.TagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
