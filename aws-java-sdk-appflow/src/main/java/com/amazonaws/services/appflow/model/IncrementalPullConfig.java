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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration used when importing incremental records from the source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/IncrementalPullConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncrementalPullConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A field that specifies the date time or timestamp field as the criteria to use when importing incremental records
     * from the source.
     * </p>
     */
    private String datetimeTypeFieldName;

    /**
     * <p>
     * A field that specifies the date time or timestamp field as the criteria to use when importing incremental records
     * from the source.
     * </p>
     * 
     * @param datetimeTypeFieldName
     *        A field that specifies the date time or timestamp field as the criteria to use when importing incremental
     *        records from the source.
     */

    public void setDatetimeTypeFieldName(String datetimeTypeFieldName) {
        this.datetimeTypeFieldName = datetimeTypeFieldName;
    }

    /**
     * <p>
     * A field that specifies the date time or timestamp field as the criteria to use when importing incremental records
     * from the source.
     * </p>
     * 
     * @return A field that specifies the date time or timestamp field as the criteria to use when importing incremental
     *         records from the source.
     */

    public String getDatetimeTypeFieldName() {
        return this.datetimeTypeFieldName;
    }

    /**
     * <p>
     * A field that specifies the date time or timestamp field as the criteria to use when importing incremental records
     * from the source.
     * </p>
     * 
     * @param datetimeTypeFieldName
     *        A field that specifies the date time or timestamp field as the criteria to use when importing incremental
     *        records from the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncrementalPullConfig withDatetimeTypeFieldName(String datetimeTypeFieldName) {
        setDatetimeTypeFieldName(datetimeTypeFieldName);
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
        if (getDatetimeTypeFieldName() != null)
            sb.append("DatetimeTypeFieldName: ").append(getDatetimeTypeFieldName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IncrementalPullConfig == false)
            return false;
        IncrementalPullConfig other = (IncrementalPullConfig) obj;
        if (other.getDatetimeTypeFieldName() == null ^ this.getDatetimeTypeFieldName() == null)
            return false;
        if (other.getDatetimeTypeFieldName() != null && other.getDatetimeTypeFieldName().equals(this.getDatetimeTypeFieldName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatetimeTypeFieldName() == null) ? 0 : getDatetimeTypeFieldName().hashCode());
        return hashCode;
    }

    @Override
    public IncrementalPullConfig clone() {
        try {
            return (IncrementalPullConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.IncrementalPullConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
