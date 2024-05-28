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
 * The configuration details for a lifecycle policy resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/LifecyclePolicyDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicyDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration details for the policy action.
     * </p>
     */
    private LifecyclePolicyDetailAction action;
    /**
     * <p>
     * Specifies the resources that the lifecycle policy applies to.
     * </p>
     */
    private LifecyclePolicyDetailFilter filter;
    /**
     * <p>
     * Additional rules to specify resources that should be exempt from policy actions.
     * </p>
     */
    private LifecyclePolicyDetailExclusionRules exclusionRules;

    /**
     * <p>
     * Configuration details for the policy action.
     * </p>
     * 
     * @param action
     *        Configuration details for the policy action.
     */

    public void setAction(LifecyclePolicyDetailAction action) {
        this.action = action;
    }

    /**
     * <p>
     * Configuration details for the policy action.
     * </p>
     * 
     * @return Configuration details for the policy action.
     */

    public LifecyclePolicyDetailAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * Configuration details for the policy action.
     * </p>
     * 
     * @param action
     *        Configuration details for the policy action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetail withAction(LifecyclePolicyDetailAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies the resources that the lifecycle policy applies to.
     * </p>
     * 
     * @param filter
     *        Specifies the resources that the lifecycle policy applies to.
     */

    public void setFilter(LifecyclePolicyDetailFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Specifies the resources that the lifecycle policy applies to.
     * </p>
     * 
     * @return Specifies the resources that the lifecycle policy applies to.
     */

    public LifecyclePolicyDetailFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Specifies the resources that the lifecycle policy applies to.
     * </p>
     * 
     * @param filter
     *        Specifies the resources that the lifecycle policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetail withFilter(LifecyclePolicyDetailFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Additional rules to specify resources that should be exempt from policy actions.
     * </p>
     * 
     * @param exclusionRules
     *        Additional rules to specify resources that should be exempt from policy actions.
     */

    public void setExclusionRules(LifecyclePolicyDetailExclusionRules exclusionRules) {
        this.exclusionRules = exclusionRules;
    }

    /**
     * <p>
     * Additional rules to specify resources that should be exempt from policy actions.
     * </p>
     * 
     * @return Additional rules to specify resources that should be exempt from policy actions.
     */

    public LifecyclePolicyDetailExclusionRules getExclusionRules() {
        return this.exclusionRules;
    }

    /**
     * <p>
     * Additional rules to specify resources that should be exempt from policy actions.
     * </p>
     * 
     * @param exclusionRules
     *        Additional rules to specify resources that should be exempt from policy actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetail withExclusionRules(LifecyclePolicyDetailExclusionRules exclusionRules) {
        setExclusionRules(exclusionRules);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getExclusionRules() != null)
            sb.append("ExclusionRules: ").append(getExclusionRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicyDetail == false)
            return false;
        LifecyclePolicyDetail other = (LifecyclePolicyDetail) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getExclusionRules() == null ^ this.getExclusionRules() == null)
            return false;
        if (other.getExclusionRules() != null && other.getExclusionRules().equals(this.getExclusionRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getExclusionRules() == null) ? 0 : getExclusionRules().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicyDetail clone() {
        try {
            return (LifecyclePolicyDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LifecyclePolicyDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
