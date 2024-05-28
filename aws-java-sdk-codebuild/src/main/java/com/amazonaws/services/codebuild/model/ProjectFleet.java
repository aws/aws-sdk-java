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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the compute fleet of the build project. For more information, see <a
 * href="https://docs.aws.amazon.com/codebuild/latest/userguide/fleets.html">Working with reserved capacity in
 * CodeBuild</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ProjectFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectFleet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the compute fleet ARN for the build project.
     * </p>
     */
    private String fleetArn;

    /**
     * <p>
     * Specifies the compute fleet ARN for the build project.
     * </p>
     * 
     * @param fleetArn
     *        Specifies the compute fleet ARN for the build project.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * Specifies the compute fleet ARN for the build project.
     * </p>
     * 
     * @return Specifies the compute fleet ARN for the build project.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * Specifies the compute fleet ARN for the build project.
     * </p>
     * 
     * @param fleetArn
     *        Specifies the compute fleet ARN for the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectFleet withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
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
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectFleet == false)
            return false;
        ProjectFleet other = (ProjectFleet) obj;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        return hashCode;
    }

    @Override
    public ProjectFleet clone() {
        try {
            return (ProjectFleet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ProjectFleetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
