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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon S3 configuration for monitoring log publishing. You can configure your jobs to send log information to Amazon
 * S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/S3MonitoringConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3MonitoringConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon S3 destination URI for log publishing.
     * </p>
     */
    private String logUri;

    /**
     * <p>
     * Amazon S3 destination URI for log publishing.
     * </p>
     * 
     * @param logUri
     *        Amazon S3 destination URI for log publishing.
     */

    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }

    /**
     * <p>
     * Amazon S3 destination URI for log publishing.
     * </p>
     * 
     * @return Amazon S3 destination URI for log publishing.
     */

    public String getLogUri() {
        return this.logUri;
    }

    /**
     * <p>
     * Amazon S3 destination URI for log publishing.
     * </p>
     * 
     * @param logUri
     *        Amazon S3 destination URI for log publishing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3MonitoringConfiguration withLogUri(String logUri) {
        setLogUri(logUri);
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
        if (getLogUri() != null)
            sb.append("LogUri: ").append(getLogUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3MonitoringConfiguration == false)
            return false;
        S3MonitoringConfiguration other = (S3MonitoringConfiguration) obj;
        if (other.getLogUri() == null ^ this.getLogUri() == null)
            return false;
        if (other.getLogUri() != null && other.getLogUri().equals(this.getLogUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogUri() == null) ? 0 : getLogUri().hashCode());
        return hashCode;
    }

    @Override
    public S3MonitoringConfiguration clone() {
        try {
            return (S3MonitoringConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.S3MonitoringConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
