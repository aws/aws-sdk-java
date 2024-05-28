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
 * Contains selection criteria for the lifecycle policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/LifecyclePolicyDetailAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicyDetailAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the lifecycle action to take.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Specifies the resources that the lifecycle policy applies to.
     * </p>
     */
    private LifecyclePolicyDetailActionIncludeResources includeResources;

    /**
     * <p>
     * Specifies the lifecycle action to take.
     * </p>
     * 
     * @param type
     *        Specifies the lifecycle action to take.
     * @see LifecyclePolicyDetailActionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the lifecycle action to take.
     * </p>
     * 
     * @return Specifies the lifecycle action to take.
     * @see LifecyclePolicyDetailActionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the lifecycle action to take.
     * </p>
     * 
     * @param type
     *        Specifies the lifecycle action to take.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyDetailActionType
     */

    public LifecyclePolicyDetailAction withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the lifecycle action to take.
     * </p>
     * 
     * @param type
     *        Specifies the lifecycle action to take.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifecyclePolicyDetailActionType
     */

    public LifecyclePolicyDetailAction withType(LifecyclePolicyDetailActionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the resources that the lifecycle policy applies to.
     * </p>
     * 
     * @param includeResources
     *        Specifies the resources that the lifecycle policy applies to.
     */

    public void setIncludeResources(LifecyclePolicyDetailActionIncludeResources includeResources) {
        this.includeResources = includeResources;
    }

    /**
     * <p>
     * Specifies the resources that the lifecycle policy applies to.
     * </p>
     * 
     * @return Specifies the resources that the lifecycle policy applies to.
     */

    public LifecyclePolicyDetailActionIncludeResources getIncludeResources() {
        return this.includeResources;
    }

    /**
     * <p>
     * Specifies the resources that the lifecycle policy applies to.
     * </p>
     * 
     * @param includeResources
     *        Specifies the resources that the lifecycle policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyDetailAction withIncludeResources(LifecyclePolicyDetailActionIncludeResources includeResources) {
        setIncludeResources(includeResources);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getIncludeResources() != null)
            sb.append("IncludeResources: ").append(getIncludeResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicyDetailAction == false)
            return false;
        LifecyclePolicyDetailAction other = (LifecyclePolicyDetailAction) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getIncludeResources() == null ^ this.getIncludeResources() == null)
            return false;
        if (other.getIncludeResources() != null && other.getIncludeResources().equals(this.getIncludeResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getIncludeResources() == null) ? 0 : getIncludeResources().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicyDetailAction clone() {
        try {
            return (LifecyclePolicyDetailAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LifecyclePolicyDetailActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
