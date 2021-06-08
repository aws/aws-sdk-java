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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetSipRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSipRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The SIP rule details.
     * </p>
     */
    private SipRule sipRule;

    /**
     * <p>
     * The SIP rule details.
     * </p>
     * 
     * @param sipRule
     *        The SIP rule details.
     */

    public void setSipRule(SipRule sipRule) {
        this.sipRule = sipRule;
    }

    /**
     * <p>
     * The SIP rule details.
     * </p>
     * 
     * @return The SIP rule details.
     */

    public SipRule getSipRule() {
        return this.sipRule;
    }

    /**
     * <p>
     * The SIP rule details.
     * </p>
     * 
     * @param sipRule
     *        The SIP rule details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSipRuleResult withSipRule(SipRule sipRule) {
        setSipRule(sipRule);
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
        if (getSipRule() != null)
            sb.append("SipRule: ").append(getSipRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSipRuleResult == false)
            return false;
        GetSipRuleResult other = (GetSipRuleResult) obj;
        if (other.getSipRule() == null ^ this.getSipRule() == null)
            return false;
        if (other.getSipRule() != null && other.getSipRule().equals(this.getSipRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSipRule() == null) ? 0 : getSipRule().hashCode());
        return hashCode;
    }

    @Override
    public GetSipRuleResult clone() {
        try {
            return (GetSipRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
