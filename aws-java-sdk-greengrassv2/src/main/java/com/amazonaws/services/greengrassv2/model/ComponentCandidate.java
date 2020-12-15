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
 * Contains information about a component that is a candidate to deploy to a AWS IoT Greengrass core device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ComponentCandidate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentCandidate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the component.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * The version of the component.
     * </p>
     */
    private String componentVersion;
    /**
     * <p>
     * The version requirements for the component's dependencies. AWS IoT Greengrass core devices get the version
     * requirements from component recipes.
     * </p>
     * <p>
     * AWS IoT Greengrass V2 uses semantic version constraints. For more information, see <a
     * href="https://semver.org/">Semantic Versioning</a>.
     * </p>
     */
    private java.util.Map<String, String> versionRequirements;

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @return The name of the component.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentCandidate withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * 
     * @param componentVersion
     *        The version of the component.
     */

    public void setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * 
     * @return The version of the component.
     */

    public String getComponentVersion() {
        return this.componentVersion;
    }

    /**
     * <p>
     * The version of the component.
     * </p>
     * 
     * @param componentVersion
     *        The version of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentCandidate withComponentVersion(String componentVersion) {
        setComponentVersion(componentVersion);
        return this;
    }

    /**
     * <p>
     * The version requirements for the component's dependencies. AWS IoT Greengrass core devices get the version
     * requirements from component recipes.
     * </p>
     * <p>
     * AWS IoT Greengrass V2 uses semantic version constraints. For more information, see <a
     * href="https://semver.org/">Semantic Versioning</a>.
     * </p>
     * 
     * @return The version requirements for the component's dependencies. AWS IoT Greengrass core devices get the
     *         version requirements from component recipes.</p>
     *         <p>
     *         AWS IoT Greengrass V2 uses semantic version constraints. For more information, see <a
     *         href="https://semver.org/">Semantic Versioning</a>.
     */

    public java.util.Map<String, String> getVersionRequirements() {
        return versionRequirements;
    }

    /**
     * <p>
     * The version requirements for the component's dependencies. AWS IoT Greengrass core devices get the version
     * requirements from component recipes.
     * </p>
     * <p>
     * AWS IoT Greengrass V2 uses semantic version constraints. For more information, see <a
     * href="https://semver.org/">Semantic Versioning</a>.
     * </p>
     * 
     * @param versionRequirements
     *        The version requirements for the component's dependencies. AWS IoT Greengrass core devices get the version
     *        requirements from component recipes.</p>
     *        <p>
     *        AWS IoT Greengrass V2 uses semantic version constraints. For more information, see <a
     *        href="https://semver.org/">Semantic Versioning</a>.
     */

    public void setVersionRequirements(java.util.Map<String, String> versionRequirements) {
        this.versionRequirements = versionRequirements;
    }

    /**
     * <p>
     * The version requirements for the component's dependencies. AWS IoT Greengrass core devices get the version
     * requirements from component recipes.
     * </p>
     * <p>
     * AWS IoT Greengrass V2 uses semantic version constraints. For more information, see <a
     * href="https://semver.org/">Semantic Versioning</a>.
     * </p>
     * 
     * @param versionRequirements
     *        The version requirements for the component's dependencies. AWS IoT Greengrass core devices get the version
     *        requirements from component recipes.</p>
     *        <p>
     *        AWS IoT Greengrass V2 uses semantic version constraints. For more information, see <a
     *        href="https://semver.org/">Semantic Versioning</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentCandidate withVersionRequirements(java.util.Map<String, String> versionRequirements) {
        setVersionRequirements(versionRequirements);
        return this;
    }

    /**
     * Add a single VersionRequirements entry
     *
     * @see ComponentCandidate#withVersionRequirements
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComponentCandidate addVersionRequirementsEntry(String key, String value) {
        if (null == this.versionRequirements) {
            this.versionRequirements = new java.util.HashMap<String, String>();
        }
        if (this.versionRequirements.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.versionRequirements.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into VersionRequirements.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentCandidate clearVersionRequirementsEntries() {
        this.versionRequirements = null;
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
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getComponentVersion() != null)
            sb.append("ComponentVersion: ").append(getComponentVersion()).append(",");
        if (getVersionRequirements() != null)
            sb.append("VersionRequirements: ").append(getVersionRequirements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentCandidate == false)
            return false;
        ComponentCandidate other = (ComponentCandidate) obj;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getComponentVersion() == null ^ this.getComponentVersion() == null)
            return false;
        if (other.getComponentVersion() != null && other.getComponentVersion().equals(this.getComponentVersion()) == false)
            return false;
        if (other.getVersionRequirements() == null ^ this.getVersionRequirements() == null)
            return false;
        if (other.getVersionRequirements() != null && other.getVersionRequirements().equals(this.getVersionRequirements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getComponentVersion() == null) ? 0 : getComponentVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionRequirements() == null) ? 0 : getVersionRequirements().hashCode());
        return hashCode;
    }

    @Override
    public ComponentCandidate clone() {
        try {
            return (ComponentCandidate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.ComponentCandidateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
