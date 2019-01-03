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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * For an SQL-based Amazon Kinesis Data Analytics application, provides additional mapping information when JSON is the
 * record format on the streaming source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/JSONMappingParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JSONMappingParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path to the top-level parent that contains the records.
     * </p>
     */
    private String recordRowPath;

    /**
     * <p>
     * The path to the top-level parent that contains the records.
     * </p>
     * 
     * @param recordRowPath
     *        The path to the top-level parent that contains the records.
     */

    public void setRecordRowPath(String recordRowPath) {
        this.recordRowPath = recordRowPath;
    }

    /**
     * <p>
     * The path to the top-level parent that contains the records.
     * </p>
     * 
     * @return The path to the top-level parent that contains the records.
     */

    public String getRecordRowPath() {
        return this.recordRowPath;
    }

    /**
     * <p>
     * The path to the top-level parent that contains the records.
     * </p>
     * 
     * @param recordRowPath
     *        The path to the top-level parent that contains the records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JSONMappingParameters withRecordRowPath(String recordRowPath) {
        setRecordRowPath(recordRowPath);
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
        if (getRecordRowPath() != null)
            sb.append("RecordRowPath: ").append(getRecordRowPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JSONMappingParameters == false)
            return false;
        JSONMappingParameters other = (JSONMappingParameters) obj;
        if (other.getRecordRowPath() == null ^ this.getRecordRowPath() == null)
            return false;
        if (other.getRecordRowPath() != null && other.getRecordRowPath().equals(this.getRecordRowPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordRowPath() == null) ? 0 : getRecordRowPath().hashCode());
        return hashCode;
    }

    @Override
    public JSONMappingParameters clone() {
        try {
            return (JSONMappingParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.JSONMappingParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
