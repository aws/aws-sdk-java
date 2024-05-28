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
 * A dataset parameter that is mapped to an analysis parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/MappedDataSetParameter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MappedDataSetParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique name that identifies a dataset within the analysis or dashboard.
     * </p>
     */
    private String dataSetIdentifier;
    /**
     * <p>
     * The name of the dataset parameter.
     * </p>
     */
    private String dataSetParameterName;

    /**
     * <p>
     * A unique name that identifies a dataset within the analysis or dashboard.
     * </p>
     * 
     * @param dataSetIdentifier
     *        A unique name that identifies a dataset within the analysis or dashboard.
     */

    public void setDataSetIdentifier(String dataSetIdentifier) {
        this.dataSetIdentifier = dataSetIdentifier;
    }

    /**
     * <p>
     * A unique name that identifies a dataset within the analysis or dashboard.
     * </p>
     * 
     * @return A unique name that identifies a dataset within the analysis or dashboard.
     */

    public String getDataSetIdentifier() {
        return this.dataSetIdentifier;
    }

    /**
     * <p>
     * A unique name that identifies a dataset within the analysis or dashboard.
     * </p>
     * 
     * @param dataSetIdentifier
     *        A unique name that identifies a dataset within the analysis or dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MappedDataSetParameter withDataSetIdentifier(String dataSetIdentifier) {
        setDataSetIdentifier(dataSetIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the dataset parameter.
     * </p>
     * 
     * @param dataSetParameterName
     *        The name of the dataset parameter.
     */

    public void setDataSetParameterName(String dataSetParameterName) {
        this.dataSetParameterName = dataSetParameterName;
    }

    /**
     * <p>
     * The name of the dataset parameter.
     * </p>
     * 
     * @return The name of the dataset parameter.
     */

    public String getDataSetParameterName() {
        return this.dataSetParameterName;
    }

    /**
     * <p>
     * The name of the dataset parameter.
     * </p>
     * 
     * @param dataSetParameterName
     *        The name of the dataset parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MappedDataSetParameter withDataSetParameterName(String dataSetParameterName) {
        setDataSetParameterName(dataSetParameterName);
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
        if (getDataSetIdentifier() != null)
            sb.append("DataSetIdentifier: ").append(getDataSetIdentifier()).append(",");
        if (getDataSetParameterName() != null)
            sb.append("DataSetParameterName: ").append(getDataSetParameterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MappedDataSetParameter == false)
            return false;
        MappedDataSetParameter other = (MappedDataSetParameter) obj;
        if (other.getDataSetIdentifier() == null ^ this.getDataSetIdentifier() == null)
            return false;
        if (other.getDataSetIdentifier() != null && other.getDataSetIdentifier().equals(this.getDataSetIdentifier()) == false)
            return false;
        if (other.getDataSetParameterName() == null ^ this.getDataSetParameterName() == null)
            return false;
        if (other.getDataSetParameterName() != null && other.getDataSetParameterName().equals(this.getDataSetParameterName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetIdentifier() == null) ? 0 : getDataSetIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDataSetParameterName() == null) ? 0 : getDataSetParameterName().hashCode());
        return hashCode;
    }

    @Override
    public MappedDataSetParameter clone() {
        try {
            return (MappedDataSetParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.MappedDataSetParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
