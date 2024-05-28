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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An optional parameter that overrides the validation strategy for all analyses and dashboards before the resource is
 * imported.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportJobOverrideValidationStrategy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobOverrideValidationStrategy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean value that indicates whether to import all analyses and dashboards under strict or lenient mode.
     * </p>
     */
    private Boolean strictModeForAllResources;

    /**
     * <p>
     * A Boolean value that indicates whether to import all analyses and dashboards under strict or lenient mode.
     * </p>
     * 
     * @param strictModeForAllResources
     *        A Boolean value that indicates whether to import all analyses and dashboards under strict or lenient mode.
     */

    public void setStrictModeForAllResources(Boolean strictModeForAllResources) {
        this.strictModeForAllResources = strictModeForAllResources;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to import all analyses and dashboards under strict or lenient mode.
     * </p>
     * 
     * @return A Boolean value that indicates whether to import all analyses and dashboards under strict or lenient
     *         mode.
     */

    public Boolean getStrictModeForAllResources() {
        return this.strictModeForAllResources;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to import all analyses and dashboards under strict or lenient mode.
     * </p>
     * 
     * @param strictModeForAllResources
     *        A Boolean value that indicates whether to import all analyses and dashboards under strict or lenient mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobOverrideValidationStrategy withStrictModeForAllResources(Boolean strictModeForAllResources) {
        setStrictModeForAllResources(strictModeForAllResources);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to import all analyses and dashboards under strict or lenient mode.
     * </p>
     * 
     * @return A Boolean value that indicates whether to import all analyses and dashboards under strict or lenient
     *         mode.
     */

    public Boolean isStrictModeForAllResources() {
        return this.strictModeForAllResources;
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
        if (getStrictModeForAllResources() != null)
            sb.append("StrictModeForAllResources: ").append(getStrictModeForAllResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleImportJobOverrideValidationStrategy == false)
            return false;
        AssetBundleImportJobOverrideValidationStrategy other = (AssetBundleImportJobOverrideValidationStrategy) obj;
        if (other.getStrictModeForAllResources() == null ^ this.getStrictModeForAllResources() == null)
            return false;
        if (other.getStrictModeForAllResources() != null && other.getStrictModeForAllResources().equals(this.getStrictModeForAllResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStrictModeForAllResources() == null) ? 0 : getStrictModeForAllResources().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportJobOverrideValidationStrategy clone() {
        try {
            return (AssetBundleImportJobOverrideValidationStrategy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportJobOverrideValidationStrategyMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
