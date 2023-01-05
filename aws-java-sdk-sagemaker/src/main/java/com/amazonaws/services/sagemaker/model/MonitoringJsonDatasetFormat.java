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
 * Represents the JSON dataset format used when running a monitoring job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringJsonDatasetFormat"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringJsonDatasetFormat implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates if the file should be read as a json object per line.
     * </p>
     */
    private Boolean line;

    /**
     * <p>
     * Indicates if the file should be read as a json object per line.
     * </p>
     * 
     * @param line
     *        Indicates if the file should be read as a json object per line.
     */

    public void setLine(Boolean line) {
        this.line = line;
    }

    /**
     * <p>
     * Indicates if the file should be read as a json object per line.
     * </p>
     * 
     * @return Indicates if the file should be read as a json object per line.
     */

    public Boolean getLine() {
        return this.line;
    }

    /**
     * <p>
     * Indicates if the file should be read as a json object per line.
     * </p>
     * 
     * @param line
     *        Indicates if the file should be read as a json object per line.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringJsonDatasetFormat withLine(Boolean line) {
        setLine(line);
        return this;
    }

    /**
     * <p>
     * Indicates if the file should be read as a json object per line.
     * </p>
     * 
     * @return Indicates if the file should be read as a json object per line.
     */

    public Boolean isLine() {
        return this.line;
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
        if (getLine() != null)
            sb.append("Line: ").append(getLine());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringJsonDatasetFormat == false)
            return false;
        MonitoringJsonDatasetFormat other = (MonitoringJsonDatasetFormat) obj;
        if (other.getLine() == null ^ this.getLine() == null)
            return false;
        if (other.getLine() != null && other.getLine().equals(this.getLine()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLine() == null) ? 0 : getLine().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringJsonDatasetFormat clone() {
        try {
            return (MonitoringJsonDatasetFormat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringJsonDatasetFormatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
