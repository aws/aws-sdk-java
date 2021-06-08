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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional settings for a stateful rule. This is part of the <a>StatefulRule</a> configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/RuleOption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleOption implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String keyword;
    /** <p/> */
    private java.util.List<String> settings;

    /**
     * <p/>
     * 
     * @param keyword
     */

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getKeyword() {
        return this.keyword;
    }

    /**
     * <p/>
     * 
     * @param keyword
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleOption withKeyword(String keyword) {
        setKeyword(keyword);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<String> getSettings() {
        return settings;
    }

    /**
     * <p/>
     * 
     * @param settings
     */

    public void setSettings(java.util.Collection<String> settings) {
        if (settings == null) {
            this.settings = null;
            return;
        }

        this.settings = new java.util.ArrayList<String>(settings);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSettings(java.util.Collection)} or {@link #withSettings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleOption withSettings(String... settings) {
        if (this.settings == null) {
            setSettings(new java.util.ArrayList<String>(settings.length));
        }
        for (String ele : settings) {
            this.settings.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleOption withSettings(java.util.Collection<String> settings) {
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

        if (obj instanceof RuleOption == false)
            return false;
        RuleOption other = (RuleOption) obj;
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
    public RuleOption clone() {
        try {
            return (RuleOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.RuleOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
