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
 * The information required to deploy a Kinesis Data Analytics Studio notebook as an application with durable state..
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeployAsApplicationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeployAsApplicationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of an Amazon S3 object that contains the Amazon Data Analytics application, including the Amazon
     * Resource Name (ARN) of the S3 bucket, the name of the Amazon S3 object that contains the data, and the version
     * number of the Amazon S3 object that contains the data.
     * </p>
     */
    private S3ContentBaseLocation s3ContentLocation;

    /**
     * <p>
     * The description of an Amazon S3 object that contains the Amazon Data Analytics application, including the Amazon
     * Resource Name (ARN) of the S3 bucket, the name of the Amazon S3 object that contains the data, and the version
     * number of the Amazon S3 object that contains the data.
     * </p>
     * 
     * @param s3ContentLocation
     *        The description of an Amazon S3 object that contains the Amazon Data Analytics application, including the
     *        Amazon Resource Name (ARN) of the S3 bucket, the name of the Amazon S3 object that contains the data, and
     *        the version number of the Amazon S3 object that contains the data.
     */

    public void setS3ContentLocation(S3ContentBaseLocation s3ContentLocation) {
        this.s3ContentLocation = s3ContentLocation;
    }

    /**
     * <p>
     * The description of an Amazon S3 object that contains the Amazon Data Analytics application, including the Amazon
     * Resource Name (ARN) of the S3 bucket, the name of the Amazon S3 object that contains the data, and the version
     * number of the Amazon S3 object that contains the data.
     * </p>
     * 
     * @return The description of an Amazon S3 object that contains the Amazon Data Analytics application, including the
     *         Amazon Resource Name (ARN) of the S3 bucket, the name of the Amazon S3 object that contains the data, and
     *         the version number of the Amazon S3 object that contains the data.
     */

    public S3ContentBaseLocation getS3ContentLocation() {
        return this.s3ContentLocation;
    }

    /**
     * <p>
     * The description of an Amazon S3 object that contains the Amazon Data Analytics application, including the Amazon
     * Resource Name (ARN) of the S3 bucket, the name of the Amazon S3 object that contains the data, and the version
     * number of the Amazon S3 object that contains the data.
     * </p>
     * 
     * @param s3ContentLocation
     *        The description of an Amazon S3 object that contains the Amazon Data Analytics application, including the
     *        Amazon Resource Name (ARN) of the S3 bucket, the name of the Amazon S3 object that contains the data, and
     *        the version number of the Amazon S3 object that contains the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeployAsApplicationConfiguration withS3ContentLocation(S3ContentBaseLocation s3ContentLocation) {
        setS3ContentLocation(s3ContentLocation);
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
        if (getS3ContentLocation() != null)
            sb.append("S3ContentLocation: ").append(getS3ContentLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeployAsApplicationConfiguration == false)
            return false;
        DeployAsApplicationConfiguration other = (DeployAsApplicationConfiguration) obj;
        if (other.getS3ContentLocation() == null ^ this.getS3ContentLocation() == null)
            return false;
        if (other.getS3ContentLocation() != null && other.getS3ContentLocation().equals(this.getS3ContentLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3ContentLocation() == null) ? 0 : getS3ContentLocation().hashCode());
        return hashCode;
    }

    @Override
    public DeployAsApplicationConfiguration clone() {
        try {
            return (DeployAsApplicationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.DeployAsApplicationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
