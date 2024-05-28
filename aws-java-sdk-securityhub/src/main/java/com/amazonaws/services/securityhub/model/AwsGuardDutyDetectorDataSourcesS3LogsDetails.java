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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information on the status of S3 data event logs as a data source for the detector.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsGuardDutyDetectorDataSourcesS3LogsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsGuardDutyDetectorDataSourcesS3LogsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value that describes whether S3 data event logs are automatically enabled for new members of an organization.
     * </p>
     */
    private String status;

    /**
     * <p>
     * A value that describes whether S3 data event logs are automatically enabled for new members of an organization.
     * </p>
     * 
     * @param status
     *        A value that describes whether S3 data event logs are automatically enabled for new members of an
     *        organization.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A value that describes whether S3 data event logs are automatically enabled for new members of an organization.
     * </p>
     * 
     * @return A value that describes whether S3 data event logs are automatically enabled for new members of an
     *         organization.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A value that describes whether S3 data event logs are automatically enabled for new members of an organization.
     * </p>
     * 
     * @param status
     *        A value that describes whether S3 data event logs are automatically enabled for new members of an
     *        organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGuardDutyDetectorDataSourcesS3LogsDetails withStatus(String status) {
        setStatus(status);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsGuardDutyDetectorDataSourcesS3LogsDetails == false)
            return false;
        AwsGuardDutyDetectorDataSourcesS3LogsDetails other = (AwsGuardDutyDetectorDataSourcesS3LogsDetails) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsGuardDutyDetectorDataSourcesS3LogsDetails clone() {
        try {
            return (AwsGuardDutyDetectorDataSourcesS3LogsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsGuardDutyDetectorDataSourcesS3LogsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
