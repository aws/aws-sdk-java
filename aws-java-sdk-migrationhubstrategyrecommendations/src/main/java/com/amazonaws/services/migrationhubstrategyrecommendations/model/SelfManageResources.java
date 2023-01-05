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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Self-managed resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/SelfManageResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelfManageResources implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Self-managed resources target destination.
     * </p>
     */
    private java.util.List<String> targetDestination;

    /**
     * <p>
     * Self-managed resources target destination.
     * </p>
     * 
     * @return Self-managed resources target destination.
     * @see SelfManageTargetDestination
     */

    public java.util.List<String> getTargetDestination() {
        return targetDestination;
    }

    /**
     * <p>
     * Self-managed resources target destination.
     * </p>
     * 
     * @param targetDestination
     *        Self-managed resources target destination.
     * @see SelfManageTargetDestination
     */

    public void setTargetDestination(java.util.Collection<String> targetDestination) {
        if (targetDestination == null) {
            this.targetDestination = null;
            return;
        }

        this.targetDestination = new java.util.ArrayList<String>(targetDestination);
    }

    /**
     * <p>
     * Self-managed resources target destination.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetDestination(java.util.Collection)} or {@link #withTargetDestination(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param targetDestination
     *        Self-managed resources target destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelfManageTargetDestination
     */

    public SelfManageResources withTargetDestination(String... targetDestination) {
        if (this.targetDestination == null) {
            setTargetDestination(new java.util.ArrayList<String>(targetDestination.length));
        }
        for (String ele : targetDestination) {
            this.targetDestination.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Self-managed resources target destination.
     * </p>
     * 
     * @param targetDestination
     *        Self-managed resources target destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelfManageTargetDestination
     */

    public SelfManageResources withTargetDestination(java.util.Collection<String> targetDestination) {
        setTargetDestination(targetDestination);
        return this;
    }

    /**
     * <p>
     * Self-managed resources target destination.
     * </p>
     * 
     * @param targetDestination
     *        Self-managed resources target destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelfManageTargetDestination
     */

    public SelfManageResources withTargetDestination(SelfManageTargetDestination... targetDestination) {
        java.util.ArrayList<String> targetDestinationCopy = new java.util.ArrayList<String>(targetDestination.length);
        for (SelfManageTargetDestination value : targetDestination) {
            targetDestinationCopy.add(value.toString());
        }
        if (getTargetDestination() == null) {
            setTargetDestination(targetDestinationCopy);
        } else {
            getTargetDestination().addAll(targetDestinationCopy);
        }
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
        if (getTargetDestination() != null)
            sb.append("TargetDestination: ").append(getTargetDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelfManageResources == false)
            return false;
        SelfManageResources other = (SelfManageResources) obj;
        if (other.getTargetDestination() == null ^ this.getTargetDestination() == null)
            return false;
        if (other.getTargetDestination() != null && other.getTargetDestination().equals(this.getTargetDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetDestination() == null) ? 0 : getTargetDestination().hashCode());
        return hashCode;
    }

    @Override
    public SelfManageResources clone() {
        try {
            return (SelfManageResources) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.SelfManageResourcesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
