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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional rules to specify resources that should be exempt from ad-hoc lifecycle actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ResourceStateUpdateExclusionRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceStateUpdateExclusionRules implements Serializable, Cloneable, StructuredPojo {

    private LifecyclePolicyDetailExclusionRulesAmis amis;

    /**
     * @param amis
     */

    public void setAmis(LifecyclePolicyDetailExclusionRulesAmis amis) {
        this.amis = amis;
    }

    /**
     * @return
     */

    public LifecyclePolicyDetailExclusionRulesAmis getAmis() {
        return this.amis;
    }

    /**
     * @param amis
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceStateUpdateExclusionRules withAmis(LifecyclePolicyDetailExclusionRulesAmis amis) {
        setAmis(amis);
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
        if (getAmis() != null)
            sb.append("Amis: ").append(getAmis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceStateUpdateExclusionRules == false)
            return false;
        ResourceStateUpdateExclusionRules other = (ResourceStateUpdateExclusionRules) obj;
        if (other.getAmis() == null ^ this.getAmis() == null)
            return false;
        if (other.getAmis() != null && other.getAmis().equals(this.getAmis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmis() == null) ? 0 : getAmis().hashCode());
        return hashCode;
    }

    @Override
    public ResourceStateUpdateExclusionRules clone() {
        try {
            return (ResourceStateUpdateExclusionRules) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ResourceStateUpdateExclusionRulesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
