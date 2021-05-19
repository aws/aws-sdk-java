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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Updates to the configuration information required to deploy an Amazon Data Analytics Studio notebook as an
 * application with durable state..
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeployAsApplicationConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeployAsApplicationConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Updates to the location that holds the data required to specify an Amazon Data Analytics application.
     * </p>
     */
    private S3ContentBaseLocationUpdate s3ContentLocationUpdate;

    /**
     * <p>
     * Updates to the location that holds the data required to specify an Amazon Data Analytics application.
     * </p>
     * 
     * @param s3ContentLocationUpdate
     *        Updates to the location that holds the data required to specify an Amazon Data Analytics application.
     */

    public void setS3ContentLocationUpdate(S3ContentBaseLocationUpdate s3ContentLocationUpdate) {
        this.s3ContentLocationUpdate = s3ContentLocationUpdate;
    }

    /**
     * <p>
     * Updates to the location that holds the data required to specify an Amazon Data Analytics application.
     * </p>
     * 
     * @return Updates to the location that holds the data required to specify an Amazon Data Analytics application.
     */

    public S3ContentBaseLocationUpdate getS3ContentLocationUpdate() {
        return this.s3ContentLocationUpdate;
    }

    /**
     * <p>
     * Updates to the location that holds the data required to specify an Amazon Data Analytics application.
     * </p>
     * 
     * @param s3ContentLocationUpdate
     *        Updates to the location that holds the data required to specify an Amazon Data Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeployAsApplicationConfigurationUpdate withS3ContentLocationUpdate(S3ContentBaseLocationUpdate s3ContentLocationUpdate) {
        setS3ContentLocationUpdate(s3ContentLocationUpdate);
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
        if (getS3ContentLocationUpdate() != null)
            sb.append("S3ContentLocationUpdate: ").append(getS3ContentLocationUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeployAsApplicationConfigurationUpdate == false)
            return false;
        DeployAsApplicationConfigurationUpdate other = (DeployAsApplicationConfigurationUpdate) obj;
        if (other.getS3ContentLocationUpdate() == null ^ this.getS3ContentLocationUpdate() == null)
            return false;
        if (other.getS3ContentLocationUpdate() != null && other.getS3ContentLocationUpdate().equals(this.getS3ContentLocationUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3ContentLocationUpdate() == null) ? 0 : getS3ContentLocationUpdate().hashCode());
        return hashCode;
    }

    @Override
    public DeployAsApplicationConfigurationUpdate clone() {
        try {
            return (DeployAsApplicationConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.DeployAsApplicationConfigurationUpdateMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
