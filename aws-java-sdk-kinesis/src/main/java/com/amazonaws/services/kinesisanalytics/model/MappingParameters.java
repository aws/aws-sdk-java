/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * When configuring application input at the time of creating or updating an application, provides additional mapping
 * information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the
 * streaming source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/MappingParameters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MappingParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides additional mapping information when JSON is the record format on the streaming source.
     * </p>
     */
    private JSONMappingParameters jSONMappingParameters;
    /**
     * <p>
     * Provides additional mapping information when the record format uses delimiters (for example, CSV).
     * </p>
     */
    private CSVMappingParameters cSVMappingParameters;

    /**
     * <p>
     * Provides additional mapping information when JSON is the record format on the streaming source.
     * </p>
     * 
     * @param jSONMappingParameters
     *        Provides additional mapping information when JSON is the record format on the streaming source.
     */

    public void setJSONMappingParameters(JSONMappingParameters jSONMappingParameters) {
        this.jSONMappingParameters = jSONMappingParameters;
    }

    /**
     * <p>
     * Provides additional mapping information when JSON is the record format on the streaming source.
     * </p>
     * 
     * @return Provides additional mapping information when JSON is the record format on the streaming source.
     */

    public JSONMappingParameters getJSONMappingParameters() {
        return this.jSONMappingParameters;
    }

    /**
     * <p>
     * Provides additional mapping information when JSON is the record format on the streaming source.
     * </p>
     * 
     * @param jSONMappingParameters
     *        Provides additional mapping information when JSON is the record format on the streaming source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MappingParameters withJSONMappingParameters(JSONMappingParameters jSONMappingParameters) {
        setJSONMappingParameters(jSONMappingParameters);
        return this;
    }

    /**
     * <p>
     * Provides additional mapping information when the record format uses delimiters (for example, CSV).
     * </p>
     * 
     * @param cSVMappingParameters
     *        Provides additional mapping information when the record format uses delimiters (for example, CSV).
     */

    public void setCSVMappingParameters(CSVMappingParameters cSVMappingParameters) {
        this.cSVMappingParameters = cSVMappingParameters;
    }

    /**
     * <p>
     * Provides additional mapping information when the record format uses delimiters (for example, CSV).
     * </p>
     * 
     * @return Provides additional mapping information when the record format uses delimiters (for example, CSV).
     */

    public CSVMappingParameters getCSVMappingParameters() {
        return this.cSVMappingParameters;
    }

    /**
     * <p>
     * Provides additional mapping information when the record format uses delimiters (for example, CSV).
     * </p>
     * 
     * @param cSVMappingParameters
     *        Provides additional mapping information when the record format uses delimiters (for example, CSV).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MappingParameters withCSVMappingParameters(CSVMappingParameters cSVMappingParameters) {
        setCSVMappingParameters(cSVMappingParameters);
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
        if (getJSONMappingParameters() != null)
            sb.append("JSONMappingParameters: ").append(getJSONMappingParameters()).append(",");
        if (getCSVMappingParameters() != null)
            sb.append("CSVMappingParameters: ").append(getCSVMappingParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MappingParameters == false)
            return false;
        MappingParameters other = (MappingParameters) obj;
        if (other.getJSONMappingParameters() == null ^ this.getJSONMappingParameters() == null)
            return false;
        if (other.getJSONMappingParameters() != null && other.getJSONMappingParameters().equals(this.getJSONMappingParameters()) == false)
            return false;
        if (other.getCSVMappingParameters() == null ^ this.getCSVMappingParameters() == null)
            return false;
        if (other.getCSVMappingParameters() != null && other.getCSVMappingParameters().equals(this.getCSVMappingParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJSONMappingParameters() == null) ? 0 : getJSONMappingParameters().hashCode());
        hashCode = prime * hashCode + ((getCSVMappingParameters() == null) ? 0 : getCSVMappingParameters().hashCode());
        return hashCode;
    }

    @Override
    public MappingParameters clone() {
        try {
            return (MappingParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.MappingParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
