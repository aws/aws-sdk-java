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
 * The action to use to override the rule's <code>Action</code> setting. You can use no override action, in which case
 * the rule action is in effect, or count, in which case, if the rule matches a web request, it only counts the match.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/OverrideAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OverrideAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Override the rule action setting to count.
     * </p>
     */
    private CountAction count;
    /**
     * <p>
     * Don't override the rule action setting.
     * </p>
     */
    private NoneAction none;

    /**
     * <p>
     * Override the rule action setting to count.
     * </p>
     * 
     * @param count
     *        Override the rule action setting to count.
     */

    public void setCount(CountAction count) {
        this.count = count;
    }

    /**
     * <p>
     * Override the rule action setting to count.
     * </p>
     * 
     * @return Override the rule action setting to count.
     */

    public CountAction getCount() {
        return this.count;
    }

    /**
     * <p>
     * Override the rule action setting to count.
     * </p>
     * 
     * @param count
     *        Override the rule action setting to count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverrideAction withCount(CountAction count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * Don't override the rule action setting.
     * </p>
     * 
     * @param none
     *        Don't override the rule action setting.
     */

    public void setNone(NoneAction none) {
        this.none = none;
    }

    /**
     * <p>
     * Don't override the rule action setting.
     * </p>
     * 
     * @return Don't override the rule action setting.
     */

    public NoneAction getNone() {
        return this.none;
    }

    /**
     * <p>
     * Don't override the rule action setting.
     * </p>
     * 
     * @param none
     *        Don't override the rule action setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OverrideAction withNone(NoneAction none) {
        setNone(none);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getNone() != null)
            sb.append("None: ").append(getNone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OverrideAction == false)
            return false;
        OverrideAction other = (OverrideAction) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getNone() == null ^ this.getNone() == null)
            return false;
        if (other.getNone() != null && other.getNone().equals(this.getNone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getNone() == null) ? 0 : getNone().hashCode());
        return hashCode;
    }

    @Override
    public OverrideAction clone() {
        try {
            return (OverrideAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.OverrideActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
