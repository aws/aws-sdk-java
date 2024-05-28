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
 * The override parameters for a single dataset that is being imported.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportJobDataSetOverrideParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobDataSetOverrideParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the dataset to apply overrides to.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * A new name for the dataset.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ID of the dataset to apply overrides to.
     * </p>
     * 
     * @param dataSetId
     *        The ID of the dataset to apply overrides to.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The ID of the dataset to apply overrides to.
     * </p>
     * 
     * @return The ID of the dataset to apply overrides to.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The ID of the dataset to apply overrides to.
     * </p>
     * 
     * @param dataSetId
     *        The ID of the dataset to apply overrides to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDataSetOverrideParameters withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * A new name for the dataset.
     * </p>
     * 
     * @param name
     *        A new name for the dataset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A new name for the dataset.
     * </p>
     * 
     * @return A new name for the dataset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A new name for the dataset.
     * </p>
     * 
     * @param name
     *        A new name for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobDataSetOverrideParameters withName(String name) {
        setName(name);
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
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleImportJobDataSetOverrideParameters == false)
            return false;
        AssetBundleImportJobDataSetOverrideParameters other = (AssetBundleImportJobDataSetOverrideParameters) obj;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportJobDataSetOverrideParameters clone() {
        try {
            return (AssetBundleImportJobDataSetOverrideParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportJobDataSetOverrideParametersMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
