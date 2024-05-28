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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines where the training dataset is located, what type of data it contains, and how to access the data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/Dataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Dataset implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A DatasetInputConfig object that defines the data source and schema mapping.
     * </p>
     */
    private DatasetInputConfig inputConfig;
    /**
     * <p>
     * What type of information is found in the dataset.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A DatasetInputConfig object that defines the data source and schema mapping.
     * </p>
     * 
     * @param inputConfig
     *        A DatasetInputConfig object that defines the data source and schema mapping.
     */

    public void setInputConfig(DatasetInputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * A DatasetInputConfig object that defines the data source and schema mapping.
     * </p>
     * 
     * @return A DatasetInputConfig object that defines the data source and schema mapping.
     */

    public DatasetInputConfig getInputConfig() {
        return this.inputConfig;
    }

    /**
     * <p>
     * A DatasetInputConfig object that defines the data source and schema mapping.
     * </p>
     * 
     * @param inputConfig
     *        A DatasetInputConfig object that defines the data source and schema mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Dataset withInputConfig(DatasetInputConfig inputConfig) {
        setInputConfig(inputConfig);
        return this;
    }

    /**
     * <p>
     * What type of information is found in the dataset.
     * </p>
     * 
     * @param type
     *        What type of information is found in the dataset.
     * @see DatasetType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * What type of information is found in the dataset.
     * </p>
     * 
     * @return What type of information is found in the dataset.
     * @see DatasetType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * What type of information is found in the dataset.
     * </p>
     * 
     * @param type
     *        What type of information is found in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public Dataset withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * What type of information is found in the dataset.
     * </p>
     * 
     * @param type
     *        What type of information is found in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public Dataset withType(DatasetType type) {
        this.type = type.toString();
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
        if (getInputConfig() != null)
            sb.append("InputConfig: ").append(getInputConfig()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Dataset == false)
            return false;
        Dataset other = (Dataset) obj;
        if (other.getInputConfig() == null ^ this.getInputConfig() == null)
            return false;
        if (other.getInputConfig() != null && other.getInputConfig().equals(this.getInputConfig()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Dataset clone() {
        try {
            return (Dataset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanroomsml.model.transform.DatasetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
