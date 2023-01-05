/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A rule option for a stateful rule.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/RuleGroupSourceStatefulRulesOptionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupSourceStatefulRulesOptionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A keyword to look for.
     * </p>
     */
    private String keyword;
    /**
     * <p>
     * A list of settings.
     * </p>
     */
    private java.util.List<String> settings;

    /**
     * <p>
     * A keyword to look for.
     * </p>
     * 
     * @param keyword
     *        A keyword to look for.
     */

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * <p>
     * A keyword to look for.
     * </p>
     * 
     * @return A keyword to look for.
     */

    public String getKeyword() {
        return this.keyword;
    }

    /**
     * <p>
     * A keyword to look for.
     * </p>
     * 
     * @param keyword
     *        A keyword to look for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatefulRulesOptionsDetails withKeyword(String keyword) {
        setKeyword(keyword);
        return this;
    }

    /**
     * <p>
     * A list of settings.
     * </p>
     * 
     * @return A list of settings.
     */

    public java.util.List<String> getSettings() {
        return settings;
    }

    /**
     * <p>
     * A list of settings.
     * </p>
     * 
     * @param settings
     *        A list of settings.
     */

    public void setSettings(java.util.Collection<String> settings) {
        if (settings == null) {
            this.settings = null;
            return;
        }

        this.settings = new java.util.ArrayList<String>(settings);
    }

    /**
     * <p>
     * A list of settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSettings(java.util.Collection)} or {@link #withSettings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param settings
     *        A list of settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatefulRulesOptionsDetails withSettings(String... settings) {
        if (this.settings == null) {
            setSettings(new java.util.ArrayList<String>(settings.length));
        }
        for (String ele : settings) {
            this.settings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of settings.
     * </p>
     * 
     * @param settings
     *        A list of settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupSourceStatefulRulesOptionsDetails withSettings(java.util.Collection<String> settings) {
        setSettings(settings);
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
        if (getKeyword() != null)
            sb.append("Keyword: ").append(getKeyword()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleGroupSourceStatefulRulesOptionsDetails == false)
            return false;
        RuleGroupSourceStatefulRulesOptionsDetails other = (RuleGroupSourceStatefulRulesOptionsDetails) obj;
        if (other.getKeyword() == null ^ this.getKeyword() == null)
            return false;
        if (other.getKeyword() != null && other.getKeyword().equals(this.getKeyword()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupSourceStatefulRulesOptionsDetails clone() {
        try {
            return (RuleGroupSourceStatefulRulesOptionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.RuleGroupSourceStatefulRulesOptionsDetailsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
