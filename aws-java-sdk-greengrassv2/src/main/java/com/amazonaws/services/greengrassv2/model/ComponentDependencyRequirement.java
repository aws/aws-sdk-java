/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a component dependency for a Lambda function component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ComponentDependencyRequirement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentDependencyRequirement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The component version requirement for the component dependency.
     * </p>
     * <p>
     * AWS IoT Greengrass V2 uses semantic version constraints. For more information, see <a
     * href="https://semver.org/">Semantic Versioning</a>.
     * </p>
     */
    private String versionRequirement;
    /**
     * <p>
     * The type of this dependency. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SOFT</code> – The component doesn't restart if the dependency changes state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HARD</code> – The component restarts if the dependency changes state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>HARD</code>
     * </p>
     */
    private String dependencyType;

    /**
     * <p>
     * The component version requirement for the component dependency.
     * </p>
     * <p>
     * AWS IoT Greengrass V2 uses semantic version constraints. For more information, see <a
     * href="https://semver.org/">Semantic Versioning</a>.
     * </p>
     * 
     * @param versionRequirement
     *        The component version requirement for the component dependency.</p>
     *        <p>
     *        AWS IoT Greengrass V2 uses semantic version constraints. For more information, see <a
     *        href="https://semver.org/">Semantic Versioning</a>.
     */

    public void setVersionRequirement(String versionRequirement) {
        this.versionRequirement = versionRequirement;
    }

    /**
     * <p>
     * The component version requirement for the component dependency.
     * </p>
     * <p>
     * AWS IoT Greengrass V2 uses semantic version constraints. For more information, see <a
     * href="https://semver.org/">Semantic Versioning</a>.
     * </p>
     * 
     * @return The component version requirement for the component dependency.</p>
     *         <p>
     *         AWS IoT Greengrass V2 uses semantic version constraints. For more information, see <a
     *         href="https://semver.org/">Semantic Versioning</a>.
     */

    public String getVersionRequirement() {
        return this.versionRequirement;
    }

    /**
     * <p>
     * The component version requirement for the component dependency.
     * </p>
     * <p>
     * AWS IoT Greengrass V2 uses semantic version constraints. For more information, see <a
     * href="https://semver.org/">Semantic Versioning</a>.
     * </p>
     * 
     * @param versionRequirement
     *        The component version requirement for the component dependency.</p>
     *        <p>
     *        AWS IoT Greengrass V2 uses semantic version constraints. For more information, see <a
     *        href="https://semver.org/">Semantic Versioning</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentDependencyRequirement withVersionRequirement(String versionRequirement) {
        setVersionRequirement(versionRequirement);
        return this;
    }

    /**
     * <p>
     * The type of this dependency. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SOFT</code> – The component doesn't restart if the dependency changes state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HARD</code> – The component restarts if the dependency changes state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>HARD</code>
     * </p>
     * 
     * @param dependencyType
     *        The type of this dependency. Choose from the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SOFT</code> – The component doesn't restart if the dependency changes state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HARD</code> – The component restarts if the dependency changes state.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>HARD</code>
     * @see ComponentDependencyType
     */

    public void setDependencyType(String dependencyType) {
        this.dependencyType = dependencyType;
    }

    /**
     * <p>
     * The type of this dependency. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SOFT</code> – The component doesn't restart if the dependency changes state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HARD</code> – The component restarts if the dependency changes state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>HARD</code>
     * </p>
     * 
     * @return The type of this dependency. Choose from the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SOFT</code> – The component doesn't restart if the dependency changes state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HARD</code> – The component restarts if the dependency changes state.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>HARD</code>
     * @see ComponentDependencyType
     */

    public String getDependencyType() {
        return this.dependencyType;
    }

    /**
     * <p>
     * The type of this dependency. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SOFT</code> – The component doesn't restart if the dependency changes state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HARD</code> – The component restarts if the dependency changes state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>HARD</code>
     * </p>
     * 
     * @param dependencyType
     *        The type of this dependency. Choose from the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SOFT</code> – The component doesn't restart if the dependency changes state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HARD</code> – The component restarts if the dependency changes state.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>HARD</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentDependencyType
     */

    public ComponentDependencyRequirement withDependencyType(String dependencyType) {
        setDependencyType(dependencyType);
        return this;
    }

    /**
     * <p>
     * The type of this dependency. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SOFT</code> – The component doesn't restart if the dependency changes state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HARD</code> – The component restarts if the dependency changes state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>HARD</code>
     * </p>
     * 
     * @param dependencyType
     *        The type of this dependency. Choose from the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SOFT</code> – The component doesn't restart if the dependency changes state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HARD</code> – The component restarts if the dependency changes state.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>HARD</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentDependencyType
     */

    public ComponentDependencyRequirement withDependencyType(ComponentDependencyType dependencyType) {
        this.dependencyType = dependencyType.toString();
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
        if (getVersionRequirement() != null)
            sb.append("VersionRequirement: ").append(getVersionRequirement()).append(",");
        if (getDependencyType() != null)
            sb.append("DependencyType: ").append(getDependencyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentDependencyRequirement == false)
            return false;
        ComponentDependencyRequirement other = (ComponentDependencyRequirement) obj;
        if (other.getVersionRequirement() == null ^ this.getVersionRequirement() == null)
            return false;
        if (other.getVersionRequirement() != null && other.getVersionRequirement().equals(this.getVersionRequirement()) == false)
            return false;
        if (other.getDependencyType() == null ^ this.getDependencyType() == null)
            return false;
        if (other.getDependencyType() != null && other.getDependencyType().equals(this.getDependencyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersionRequirement() == null) ? 0 : getVersionRequirement().hashCode());
        hashCode = prime * hashCode + ((getDependencyType() == null) ? 0 : getDependencyType().hashCode());
        return hashCode;
    }

    @Override
    public ComponentDependencyRequirement clone() {
        try {
            return (ComponentDependencyRequirement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.ComponentDependencyRequirementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
