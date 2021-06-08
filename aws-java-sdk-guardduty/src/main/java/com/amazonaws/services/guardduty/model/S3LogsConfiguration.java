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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes whether S3 data event logs will be enabled as a data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/S3LogsConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3LogsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of S3 data event logs as a data source.
     * </p>
     */
    private Boolean enable;

    /**
     * <p>
     * The status of S3 data event logs as a data source.
     * </p>
     * 
     * @param enable
     *        The status of S3 data event logs as a data source.
     */

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * <p>
     * The status of S3 data event logs as a data source.
     * </p>
     * 
     * @return The status of S3 data event logs as a data source.
     */

    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * <p>
     * The status of S3 data event logs as a data source.
     * </p>
     * 
     * @param enable
     *        The status of S3 data event logs as a data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3LogsConfiguration withEnable(Boolean enable) {
        setEnable(enable);
        return this;
    }

    /**
     * <p>
     * The status of S3 data event logs as a data source.
     * </p>
     * 
     * @return The status of S3 data event logs as a data source.
     */

    public Boolean isEnable() {
        return this.enable;
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
        if (getEnable() != null)
            sb.append("Enable: ").append(getEnable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3LogsConfiguration == false)
            return false;
        S3LogsConfiguration other = (S3LogsConfiguration) obj;
        if (other.getEnable() == null ^ this.getEnable() == null)
            return false;
        if (other.getEnable() != null && other.getEnable().equals(this.getEnable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnable() == null) ? 0 : getEnable().hashCode());
        return hashCode;
    }

    @Override
    public S3LogsConfiguration clone() {
        try {
            return (S3LogsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.S3LogsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
