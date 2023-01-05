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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an additional detail for a path analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AdditionalDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdditionalDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The information type.
     * </p>
     */
    private String additionalDetailType;
    /**
     * <p>
     * The path component.
     * </p>
     */
    private AnalysisComponent component;

    /**
     * <p>
     * The information type.
     * </p>
     * 
     * @param additionalDetailType
     *        The information type.
     */

    public void setAdditionalDetailType(String additionalDetailType) {
        this.additionalDetailType = additionalDetailType;
    }

    /**
     * <p>
     * The information type.
     * </p>
     * 
     * @return The information type.
     */

    public String getAdditionalDetailType() {
        return this.additionalDetailType;
    }

    /**
     * <p>
     * The information type.
     * </p>
     * 
     * @param additionalDetailType
     *        The information type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalDetail withAdditionalDetailType(String additionalDetailType) {
        setAdditionalDetailType(additionalDetailType);
        return this;
    }

    /**
     * <p>
     * The path component.
     * </p>
     * 
     * @param component
     *        The path component.
     */

    public void setComponent(AnalysisComponent component) {
        this.component = component;
    }

    /**
     * <p>
     * The path component.
     * </p>
     * 
     * @return The path component.
     */

    public AnalysisComponent getComponent() {
        return this.component;
    }

    /**
     * <p>
     * The path component.
     * </p>
     * 
     * @param component
     *        The path component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalDetail withComponent(AnalysisComponent component) {
        setComponent(component);
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
        if (getAdditionalDetailType() != null)
            sb.append("AdditionalDetailType: ").append(getAdditionalDetailType()).append(",");
        if (getComponent() != null)
            sb.append("Component: ").append(getComponent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdditionalDetail == false)
            return false;
        AdditionalDetail other = (AdditionalDetail) obj;
        if (other.getAdditionalDetailType() == null ^ this.getAdditionalDetailType() == null)
            return false;
        if (other.getAdditionalDetailType() != null && other.getAdditionalDetailType().equals(this.getAdditionalDetailType()) == false)
            return false;
        if (other.getComponent() == null ^ this.getComponent() == null)
            return false;
        if (other.getComponent() != null && other.getComponent().equals(this.getComponent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalDetailType() == null) ? 0 : getAdditionalDetailType().hashCode());
        hashCode = prime * hashCode + ((getComponent() == null) ? 0 : getComponent().hashCode());
        return hashCode;
    }

    @Override
    public AdditionalDetail clone() {
        try {
            return (AdditionalDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
