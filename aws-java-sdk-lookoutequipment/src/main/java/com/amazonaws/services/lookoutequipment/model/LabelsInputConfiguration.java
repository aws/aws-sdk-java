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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the configuration information for the S3 location being used to hold label data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/LabelsInputConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelsInputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains location information for the S3 location being used for label data.
     * </p>
     */
    private LabelsS3InputConfiguration s3InputConfiguration;

    /**
     * <p>
     * Contains location information for the S3 location being used for label data.
     * </p>
     * 
     * @param s3InputConfiguration
     *        Contains location information for the S3 location being used for label data.
     */

    public void setS3InputConfiguration(LabelsS3InputConfiguration s3InputConfiguration) {
        this.s3InputConfiguration = s3InputConfiguration;
    }

    /**
     * <p>
     * Contains location information for the S3 location being used for label data.
     * </p>
     * 
     * @return Contains location information for the S3 location being used for label data.
     */

    public LabelsS3InputConfiguration getS3InputConfiguration() {
        return this.s3InputConfiguration;
    }

    /**
     * <p>
     * Contains location information for the S3 location being used for label data.
     * </p>
     * 
     * @param s3InputConfiguration
     *        Contains location information for the S3 location being used for label data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelsInputConfiguration withS3InputConfiguration(LabelsS3InputConfiguration s3InputConfiguration) {
        setS3InputConfiguration(s3InputConfiguration);
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
        if (getS3InputConfiguration() != null)
            sb.append("S3InputConfiguration: ").append(getS3InputConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelsInputConfiguration == false)
            return false;
        LabelsInputConfiguration other = (LabelsInputConfiguration) obj;
        if (other.getS3InputConfiguration() == null ^ this.getS3InputConfiguration() == null)
            return false;
        if (other.getS3InputConfiguration() != null && other.getS3InputConfiguration().equals(this.getS3InputConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3InputConfiguration() == null) ? 0 : getS3InputConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public LabelsInputConfiguration clone() {
        try {
            return (LabelsInputConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.LabelsInputConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
