/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the updates to the starting parameters for a Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/RunConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes updates to the restore behavior of a restarting application.
     * </p>
     */
    private ApplicationRestoreConfiguration applicationRestoreConfiguration;

    /**
     * <p>
     * Describes updates to the restore behavior of a restarting application.
     * </p>
     * 
     * @param applicationRestoreConfiguration
     *        Describes updates to the restore behavior of a restarting application.
     */

    public void setApplicationRestoreConfiguration(ApplicationRestoreConfiguration applicationRestoreConfiguration) {
        this.applicationRestoreConfiguration = applicationRestoreConfiguration;
    }

    /**
     * <p>
     * Describes updates to the restore behavior of a restarting application.
     * </p>
     * 
     * @return Describes updates to the restore behavior of a restarting application.
     */

    public ApplicationRestoreConfiguration getApplicationRestoreConfiguration() {
        return this.applicationRestoreConfiguration;
    }

    /**
     * <p>
     * Describes updates to the restore behavior of a restarting application.
     * </p>
     * 
     * @param applicationRestoreConfiguration
     *        Describes updates to the restore behavior of a restarting application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunConfigurationUpdate withApplicationRestoreConfiguration(ApplicationRestoreConfiguration applicationRestoreConfiguration) {
        setApplicationRestoreConfiguration(applicationRestoreConfiguration);
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
        if (getApplicationRestoreConfiguration() != null)
            sb.append("ApplicationRestoreConfiguration: ").append(getApplicationRestoreConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunConfigurationUpdate == false)
            return false;
        RunConfigurationUpdate other = (RunConfigurationUpdate) obj;
        if (other.getApplicationRestoreConfiguration() == null ^ this.getApplicationRestoreConfiguration() == null)
            return false;
        if (other.getApplicationRestoreConfiguration() != null
                && other.getApplicationRestoreConfiguration().equals(this.getApplicationRestoreConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationRestoreConfiguration() == null) ? 0 : getApplicationRestoreConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public RunConfigurationUpdate clone() {
        try {
            return (RunConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.RunConfigurationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
