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
 * An optional structure that configures resource ID overrides for the export job.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleExportJobResourceIdOverrideConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleExportJobResourceIdOverrideConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An option to request a CloudFormation variable for a prefix to be prepended to each resource's ID before import.
     * The prefix is only added to the asset IDs and does not change the name of the asset.
     * </p>
     */
    private Boolean prefixForAllResources;

    /**
     * <p>
     * An option to request a CloudFormation variable for a prefix to be prepended to each resource's ID before import.
     * The prefix is only added to the asset IDs and does not change the name of the asset.
     * </p>
     * 
     * @param prefixForAllResources
     *        An option to request a CloudFormation variable for a prefix to be prepended to each resource's ID before
     *        import. The prefix is only added to the asset IDs and does not change the name of the asset.
     */

    public void setPrefixForAllResources(Boolean prefixForAllResources) {
        this.prefixForAllResources = prefixForAllResources;
    }

    /**
     * <p>
     * An option to request a CloudFormation variable for a prefix to be prepended to each resource's ID before import.
     * The prefix is only added to the asset IDs and does not change the name of the asset.
     * </p>
     * 
     * @return An option to request a CloudFormation variable for a prefix to be prepended to each resource's ID before
     *         import. The prefix is only added to the asset IDs and does not change the name of the asset.
     */

    public Boolean getPrefixForAllResources() {
        return this.prefixForAllResources;
    }

    /**
     * <p>
     * An option to request a CloudFormation variable for a prefix to be prepended to each resource's ID before import.
     * The prefix is only added to the asset IDs and does not change the name of the asset.
     * </p>
     * 
     * @param prefixForAllResources
     *        An option to request a CloudFormation variable for a prefix to be prepended to each resource's ID before
     *        import. The prefix is only added to the asset IDs and does not change the name of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleExportJobResourceIdOverrideConfiguration withPrefixForAllResources(Boolean prefixForAllResources) {
        setPrefixForAllResources(prefixForAllResources);
        return this;
    }

    /**
     * <p>
     * An option to request a CloudFormation variable for a prefix to be prepended to each resource's ID before import.
     * The prefix is only added to the asset IDs and does not change the name of the asset.
     * </p>
     * 
     * @return An option to request a CloudFormation variable for a prefix to be prepended to each resource's ID before
     *         import. The prefix is only added to the asset IDs and does not change the name of the asset.
     */

    public Boolean isPrefixForAllResources() {
        return this.prefixForAllResources;
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
        if (getPrefixForAllResources() != null)
            sb.append("PrefixForAllResources: ").append(getPrefixForAllResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleExportJobResourceIdOverrideConfiguration == false)
            return false;
        AssetBundleExportJobResourceIdOverrideConfiguration other = (AssetBundleExportJobResourceIdOverrideConfiguration) obj;
        if (other.getPrefixForAllResources() == null ^ this.getPrefixForAllResources() == null)
            return false;
        if (other.getPrefixForAllResources() != null && other.getPrefixForAllResources().equals(this.getPrefixForAllResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefixForAllResources() == null) ? 0 : getPrefixForAllResources().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleExportJobResourceIdOverrideConfiguration clone() {
        try {
            return (AssetBundleExportJobResourceIdOverrideConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleExportJobResourceIdOverrideConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
