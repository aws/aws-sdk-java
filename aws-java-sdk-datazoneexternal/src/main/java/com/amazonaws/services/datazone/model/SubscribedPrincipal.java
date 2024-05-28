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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The principal that has the subscription grant for the asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/SubscribedPrincipal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscribedPrincipal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The project that has the subscription grant.
     * </p>
     */
    private SubscribedProject project;

    /**
     * <p>
     * The project that has the subscription grant.
     * </p>
     * 
     * @param project
     *        The project that has the subscription grant.
     */

    public void setProject(SubscribedProject project) {
        this.project = project;
    }

    /**
     * <p>
     * The project that has the subscription grant.
     * </p>
     * 
     * @return The project that has the subscription grant.
     */

    public SubscribedProject getProject() {
        return this.project;
    }

    /**
     * <p>
     * The project that has the subscription grant.
     * </p>
     * 
     * @param project
     *        The project that has the subscription grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubscribedPrincipal withProject(SubscribedProject project) {
        setProject(project);
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
        if (getProject() != null)
            sb.append("Project: ").append(getProject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscribedPrincipal == false)
            return false;
        SubscribedPrincipal other = (SubscribedPrincipal) obj;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        return hashCode;
    }

    @Override
    public SubscribedPrincipal clone() {
        try {
            return (SubscribedPrincipal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.SubscribedPrincipalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
