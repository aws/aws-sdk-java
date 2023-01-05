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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single EarthObservationJob output band.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/OutputBand" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputBand implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the band.
     * </p>
     */
    private String bandName;
    /**
     * <p>
     * The datatype of the output band.
     * </p>
     */
    private String outputDataType;

    /**
     * <p>
     * The name of the band.
     * </p>
     * 
     * @param bandName
     *        The name of the band.
     */

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    /**
     * <p>
     * The name of the band.
     * </p>
     * 
     * @return The name of the band.
     */

    public String getBandName() {
        return this.bandName;
    }

    /**
     * <p>
     * The name of the band.
     * </p>
     * 
     * @param bandName
     *        The name of the band.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputBand withBandName(String bandName) {
        setBandName(bandName);
        return this;
    }

    /**
     * <p>
     * The datatype of the output band.
     * </p>
     * 
     * @param outputDataType
     *        The datatype of the output band.
     * @see OutputType
     */

    public void setOutputDataType(String outputDataType) {
        this.outputDataType = outputDataType;
    }

    /**
     * <p>
     * The datatype of the output band.
     * </p>
     * 
     * @return The datatype of the output band.
     * @see OutputType
     */

    public String getOutputDataType() {
        return this.outputDataType;
    }

    /**
     * <p>
     * The datatype of the output band.
     * </p>
     * 
     * @param outputDataType
     *        The datatype of the output band.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputType
     */

    public OutputBand withOutputDataType(String outputDataType) {
        setOutputDataType(outputDataType);
        return this;
    }

    /**
     * <p>
     * The datatype of the output band.
     * </p>
     * 
     * @param outputDataType
     *        The datatype of the output band.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputType
     */

    public OutputBand withOutputDataType(OutputType outputDataType) {
        this.outputDataType = outputDataType.toString();
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
        if (getBandName() != null)
            sb.append("BandName: ").append(getBandName()).append(",");
        if (getOutputDataType() != null)
            sb.append("OutputDataType: ").append(getOutputDataType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputBand == false)
            return false;
        OutputBand other = (OutputBand) obj;
        if (other.getBandName() == null ^ this.getBandName() == null)
            return false;
        if (other.getBandName() != null && other.getBandName().equals(this.getBandName()) == false)
            return false;
        if (other.getOutputDataType() == null ^ this.getOutputDataType() == null)
            return false;
        if (other.getOutputDataType() != null && other.getOutputDataType().equals(this.getOutputDataType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBandName() == null) ? 0 : getBandName().hashCode());
        hashCode = prime * hashCode + ((getOutputDataType() == null) ? 0 : getOutputDataType().hashCode());
        return hashCode;
    }

    @Override
    public OutputBand clone() {
        try {
            return (OutputBand) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.OutputBandMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
