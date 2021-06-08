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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html">AWS WAF Classic</a> in the
 * developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>. With the
 * latest version, AWS WAF has a single set of endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * A tag associated with an AWS resource. Tags are key:value pairs that you can use to categorize and manage your
 * resources, for purposes like billing. For example, you might set the tag key to "customer" and the value to the
 * customer name or ID. You can specify one or more tags to add to each AWS resource, up to 50 tags for a resource.
 * </p>
 * <p>
 * Tagging is only available through the API, SDKs, and CLI. You can't manage or view tags through the AWS WAF Classic
 * console. You can tag the AWS resources that you manage through AWS WAF Classic: web ACLs, rule groups, and rules.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/Tag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String key;
    /** <p/> */
    private String value;

    /**
     * <p/>
     * 
     * @param key
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p/>
     * 
     * @param key
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p/>
     * 
     * @param value
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p/>
     * 
     * @param value
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
        com.amazonaws.services.waf.model.waf_regional.transform.TagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
