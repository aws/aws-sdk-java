/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class PutConfigRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private ConfigRule configRule;

    /**
     * @param configRule
     */

    public void setConfigRule(ConfigRule configRule) {
        this.configRule = configRule;
    }

    /**
     * @return
     */

    public ConfigRule getConfigRule() {
        return this.configRule;
    }

    /**
     * @param configRule
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigRuleRequest withConfigRule(ConfigRule configRule) {
        setConfigRule(configRule);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConfigRule() != null)
            sb.append("ConfigRule: " + getConfigRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConfigRuleRequest == false)
            return false;
        PutConfigRuleRequest other = (PutConfigRuleRequest) obj;
        if (other.getConfigRule() == null ^ this.getConfigRule() == null)
            return false;
        if (other.getConfigRule() != null && other.getConfigRule().equals(this.getConfigRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigRule() == null) ? 0 : getConfigRule().hashCode());
        return hashCode;
    }

    @Override
    public PutConfigRuleRequest clone() {
        return (PutConfigRuleRequest) super.clone();
    }
}
