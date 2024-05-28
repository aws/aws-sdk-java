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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides configuration information about a rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/RuleConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A rule for configuring how Amazon Q Business responds when it encounters a a blocked topic.
     * </p>
     */
    private ContentBlockerRule contentBlockerRule;

    private ContentRetrievalRule contentRetrievalRule;

    /**
     * <p>
     * A rule for configuring how Amazon Q Business responds when it encounters a a blocked topic.
     * </p>
     * 
     * @param contentBlockerRule
     *        A rule for configuring how Amazon Q Business responds when it encounters a a blocked topic.
     */

    public void setContentBlockerRule(ContentBlockerRule contentBlockerRule) {
        this.contentBlockerRule = contentBlockerRule;
    }

    /**
     * <p>
     * A rule for configuring how Amazon Q Business responds when it encounters a a blocked topic.
     * </p>
     * 
     * @return A rule for configuring how Amazon Q Business responds when it encounters a a blocked topic.
     */

    public ContentBlockerRule getContentBlockerRule() {
        return this.contentBlockerRule;
    }

    /**
     * <p>
     * A rule for configuring how Amazon Q Business responds when it encounters a a blocked topic.
     * </p>
     * 
     * @param contentBlockerRule
     *        A rule for configuring how Amazon Q Business responds when it encounters a a blocked topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleConfiguration withContentBlockerRule(ContentBlockerRule contentBlockerRule) {
        setContentBlockerRule(contentBlockerRule);
        return this;
    }

    /**
     * @param contentRetrievalRule
     */

    public void setContentRetrievalRule(ContentRetrievalRule contentRetrievalRule) {
        this.contentRetrievalRule = contentRetrievalRule;
    }

    /**
     * @return
     */

    public ContentRetrievalRule getContentRetrievalRule() {
        return this.contentRetrievalRule;
    }

    /**
     * @param contentRetrievalRule
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleConfiguration withContentRetrievalRule(ContentRetrievalRule contentRetrievalRule) {
        setContentRetrievalRule(contentRetrievalRule);
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
        if (getContentBlockerRule() != null)
            sb.append("ContentBlockerRule: ").append(getContentBlockerRule()).append(",");
        if (getContentRetrievalRule() != null)
            sb.append("ContentRetrievalRule: ").append(getContentRetrievalRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleConfiguration == false)
            return false;
        RuleConfiguration other = (RuleConfiguration) obj;
        if (other.getContentBlockerRule() == null ^ this.getContentBlockerRule() == null)
            return false;
        if (other.getContentBlockerRule() != null && other.getContentBlockerRule().equals(this.getContentBlockerRule()) == false)
            return false;
        if (other.getContentRetrievalRule() == null ^ this.getContentRetrievalRule() == null)
            return false;
        if (other.getContentRetrievalRule() != null && other.getContentRetrievalRule().equals(this.getContentRetrievalRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentBlockerRule() == null) ? 0 : getContentBlockerRule().hashCode());
        hashCode = prime * hashCode + ((getContentRetrievalRule() == null) ? 0 : getContentRetrievalRule().hashCode());
        return hashCode;
    }

    @Override
    public RuleConfiguration clone() {
        try {
            return (RuleConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.RuleConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
