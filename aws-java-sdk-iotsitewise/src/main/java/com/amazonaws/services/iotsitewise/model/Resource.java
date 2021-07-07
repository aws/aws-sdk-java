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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains an IoT SiteWise Monitor resource ID for a portal or project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/Resource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A portal resource.
     * </p>
     */
    private PortalResource portal;
    /**
     * <p>
     * A project resource.
     * </p>
     */
    private ProjectResource project;

    /**
     * <p>
     * A portal resource.
     * </p>
     * 
     * @param portal
     *        A portal resource.
     */

    public void setPortal(PortalResource portal) {
        this.portal = portal;
    }

    /**
     * <p>
     * A portal resource.
     * </p>
     * 
     * @return A portal resource.
     */

    public PortalResource getPortal() {
        return this.portal;
    }

    /**
     * <p>
     * A portal resource.
     * </p>
     * 
     * @param portal
     *        A portal resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withPortal(PortalResource portal) {
        setPortal(portal);
        return this;
    }

    /**
     * <p>
     * A project resource.
     * </p>
     * 
     * @param project
     *        A project resource.
     */

    public void setProject(ProjectResource project) {
        this.project = project;
    }

    /**
     * <p>
     * A project resource.
     * </p>
     * 
     * @return A project resource.
     */

    public ProjectResource getProject() {
        return this.project;
    }

    /**
     * <p>
     * A project resource.
     * </p>
     * 
     * @param project
     *        A project resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withProject(ProjectResource project) {
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
        if (getPortal() != null)
            sb.append("Portal: ").append(getPortal()).append(",");
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

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getPortal() == null ^ this.getPortal() == null)
            return false;
        if (other.getPortal() != null && other.getPortal().equals(this.getPortal()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getPortal() == null) ? 0 : getPortal().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
