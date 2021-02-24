/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information that you can use to locate the field in your detector model that the analysis result references.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/AnalysisResultLocation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisResultLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <a href="https://github.com/json-path/JsonPath">JsonPath</a> expression that identifies the error field in your
     * detector model.
     * </p>
     */
    private String path;

    /**
     * <p>
     * A <a href="https://github.com/json-path/JsonPath">JsonPath</a> expression that identifies the error field in your
     * detector model.
     * </p>
     * 
     * @param path
     *        A <a href="https://github.com/json-path/JsonPath">JsonPath</a> expression that identifies the error field
     *        in your detector model.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * A <a href="https://github.com/json-path/JsonPath">JsonPath</a> expression that identifies the error field in your
     * detector model.
     * </p>
     * 
     * @return A <a href="https://github.com/json-path/JsonPath">JsonPath</a> expression that identifies the error field
     *         in your detector model.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * A <a href="https://github.com/json-path/JsonPath">JsonPath</a> expression that identifies the error field in your
     * detector model.
     * </p>
     * 
     * @param path
     *        A <a href="https://github.com/json-path/JsonPath">JsonPath</a> expression that identifies the error field
     *        in your detector model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisResultLocation withPath(String path) {
        setPath(path);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisResultLocation == false)
            return false;
        AnalysisResultLocation other = (AnalysisResultLocation) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisResultLocation clone() {
        try {
            return (AnalysisResultLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.AnalysisResultLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
