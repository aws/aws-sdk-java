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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details for the external events data used for model version training.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ExternalEventsDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExternalEventsDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket location for the data.
     * </p>
     */
    private String dataLocation;
    /**
     * <p>
     * The ARN of the role that provides Amazon Fraud Detector access to the data location.
     * </p>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * The Amazon S3 bucket location for the data.
     * </p>
     * 
     * @param dataLocation
     *        The Amazon S3 bucket location for the data.
     */

    public void setDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
    }

    /**
     * <p>
     * The Amazon S3 bucket location for the data.
     * </p>
     * 
     * @return The Amazon S3 bucket location for the data.
     */

    public String getDataLocation() {
        return this.dataLocation;
    }

    /**
     * <p>
     * The Amazon S3 bucket location for the data.
     * </p>
     * 
     * @param dataLocation
     *        The Amazon S3 bucket location for the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalEventsDetail withDataLocation(String dataLocation) {
        setDataLocation(dataLocation);
        return this;
    }

    /**
     * <p>
     * The ARN of the role that provides Amazon Fraud Detector access to the data location.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The ARN of the role that provides Amazon Fraud Detector access to the data location.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the role that provides Amazon Fraud Detector access to the data location.
     * </p>
     * 
     * @return The ARN of the role that provides Amazon Fraud Detector access to the data location.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the role that provides Amazon Fraud Detector access to the data location.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The ARN of the role that provides Amazon Fraud Detector access to the data location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalEventsDetail withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
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
        if (getDataLocation() != null)
            sb.append("DataLocation: ").append(getDataLocation()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExternalEventsDetail == false)
            return false;
        ExternalEventsDetail other = (ExternalEventsDetail) obj;
        if (other.getDataLocation() == null ^ this.getDataLocation() == null)
            return false;
        if (other.getDataLocation() != null && other.getDataLocation().equals(this.getDataLocation()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataLocation() == null) ? 0 : getDataLocation().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public ExternalEventsDetail clone() {
        try {
            return (ExternalEventsDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.ExternalEventsDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
