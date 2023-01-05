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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Any dependencies related to hub content, such as scripts, model artifacts, datasets, or notebooks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HubContentDependency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HubContentDependency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The hub content dependency origin path.
     * </p>
     */
    private String dependencyOriginPath;
    /**
     * <p>
     * The hub content dependency copy path.
     * </p>
     */
    private String dependencyCopyPath;

    /**
     * <p>
     * The hub content dependency origin path.
     * </p>
     * 
     * @param dependencyOriginPath
     *        The hub content dependency origin path.
     */

    public void setDependencyOriginPath(String dependencyOriginPath) {
        this.dependencyOriginPath = dependencyOriginPath;
    }

    /**
     * <p>
     * The hub content dependency origin path.
     * </p>
     * 
     * @return The hub content dependency origin path.
     */

    public String getDependencyOriginPath() {
        return this.dependencyOriginPath;
    }

    /**
     * <p>
     * The hub content dependency origin path.
     * </p>
     * 
     * @param dependencyOriginPath
     *        The hub content dependency origin path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HubContentDependency withDependencyOriginPath(String dependencyOriginPath) {
        setDependencyOriginPath(dependencyOriginPath);
        return this;
    }

    /**
     * <p>
     * The hub content dependency copy path.
     * </p>
     * 
     * @param dependencyCopyPath
     *        The hub content dependency copy path.
     */

    public void setDependencyCopyPath(String dependencyCopyPath) {
        this.dependencyCopyPath = dependencyCopyPath;
    }

    /**
     * <p>
     * The hub content dependency copy path.
     * </p>
     * 
     * @return The hub content dependency copy path.
     */

    public String getDependencyCopyPath() {
        return this.dependencyCopyPath;
    }

    /**
     * <p>
     * The hub content dependency copy path.
     * </p>
     * 
     * @param dependencyCopyPath
     *        The hub content dependency copy path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HubContentDependency withDependencyCopyPath(String dependencyCopyPath) {
        setDependencyCopyPath(dependencyCopyPath);
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
        if (getDependencyOriginPath() != null)
            sb.append("DependencyOriginPath: ").append(getDependencyOriginPath()).append(",");
        if (getDependencyCopyPath() != null)
            sb.append("DependencyCopyPath: ").append(getDependencyCopyPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HubContentDependency == false)
            return false;
        HubContentDependency other = (HubContentDependency) obj;
        if (other.getDependencyOriginPath() == null ^ this.getDependencyOriginPath() == null)
            return false;
        if (other.getDependencyOriginPath() != null && other.getDependencyOriginPath().equals(this.getDependencyOriginPath()) == false)
            return false;
        if (other.getDependencyCopyPath() == null ^ this.getDependencyCopyPath() == null)
            return false;
        if (other.getDependencyCopyPath() != null && other.getDependencyCopyPath().equals(this.getDependencyCopyPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDependencyOriginPath() == null) ? 0 : getDependencyOriginPath().hashCode());
        hashCode = prime * hashCode + ((getDependencyCopyPath() == null) ? 0 : getDependencyCopyPath().hashCode());
        return hashCode;
    }

    @Override
    public HubContentDependency clone() {
        try {
            return (HubContentDependency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HubContentDependencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
