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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Output data configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EntityRecognizerOutputDataConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityRecognizerOutputDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 prefix for the data lake location of the flywheel statistics.
     * </p>
     */
    private String flywheelStatsS3Prefix;

    /**
     * <p>
     * The Amazon S3 prefix for the data lake location of the flywheel statistics.
     * </p>
     * 
     * @param flywheelStatsS3Prefix
     *        The Amazon S3 prefix for the data lake location of the flywheel statistics.
     */

    public void setFlywheelStatsS3Prefix(String flywheelStatsS3Prefix) {
        this.flywheelStatsS3Prefix = flywheelStatsS3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 prefix for the data lake location of the flywheel statistics.
     * </p>
     * 
     * @return The Amazon S3 prefix for the data lake location of the flywheel statistics.
     */

    public String getFlywheelStatsS3Prefix() {
        return this.flywheelStatsS3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 prefix for the data lake location of the flywheel statistics.
     * </p>
     * 
     * @param flywheelStatsS3Prefix
     *        The Amazon S3 prefix for the data lake location of the flywheel statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerOutputDataConfig withFlywheelStatsS3Prefix(String flywheelStatsS3Prefix) {
        setFlywheelStatsS3Prefix(flywheelStatsS3Prefix);
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
        if (getFlywheelStatsS3Prefix() != null)
            sb.append("FlywheelStatsS3Prefix: ").append(getFlywheelStatsS3Prefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerOutputDataConfig == false)
            return false;
        EntityRecognizerOutputDataConfig other = (EntityRecognizerOutputDataConfig) obj;
        if (other.getFlywheelStatsS3Prefix() == null ^ this.getFlywheelStatsS3Prefix() == null)
            return false;
        if (other.getFlywheelStatsS3Prefix() != null && other.getFlywheelStatsS3Prefix().equals(this.getFlywheelStatsS3Prefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlywheelStatsS3Prefix() == null) ? 0 : getFlywheelStatsS3Prefix().hashCode());
        return hashCode;
    }

    @Override
    public EntityRecognizerOutputDataConfig clone() {
        try {
            return (EntityRecognizerOutputDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EntityRecognizerOutputDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
