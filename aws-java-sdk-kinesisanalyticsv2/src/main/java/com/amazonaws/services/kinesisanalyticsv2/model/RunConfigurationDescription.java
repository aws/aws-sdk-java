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
 * Describes the starting properties for a Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/RunConfigurationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunConfigurationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the restore behavior of a restarting application.
     * </p>
     */
    private ApplicationRestoreConfiguration applicationRestoreConfigurationDescription;

    /**
     * <p>
     * Describes the restore behavior of a restarting application.
     * </p>
     * 
     * @param applicationRestoreConfigurationDescription
     *        Describes the restore behavior of a restarting application.
     */

    public void setApplicationRestoreConfigurationDescription(ApplicationRestoreConfiguration applicationRestoreConfigurationDescription) {
        this.applicationRestoreConfigurationDescription = applicationRestoreConfigurationDescription;
    }

    /**
     * <p>
     * Describes the restore behavior of a restarting application.
     * </p>
     * 
     * @return Describes the restore behavior of a restarting application.
     */

    public ApplicationRestoreConfiguration getApplicationRestoreConfigurationDescription() {
        return this.applicationRestoreConfigurationDescription;
    }

    /**
     * <p>
     * Describes the restore behavior of a restarting application.
     * </p>
     * 
     * @param applicationRestoreConfigurationDescription
     *        Describes the restore behavior of a restarting application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunConfigurationDescription withApplicationRestoreConfigurationDescription(ApplicationRestoreConfiguration applicationRestoreConfigurationDescription) {
        setApplicationRestoreConfigurationDescription(applicationRestoreConfigurationDescription);
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
        if (getApplicationRestoreConfigurationDescription() != null)
            sb.append("ApplicationRestoreConfigurationDescription: ").append(getApplicationRestoreConfigurationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunConfigurationDescription == false)
            return false;
        RunConfigurationDescription other = (RunConfigurationDescription) obj;
        if (other.getApplicationRestoreConfigurationDescription() == null ^ this.getApplicationRestoreConfigurationDescription() == null)
            return false;
        if (other.getApplicationRestoreConfigurationDescription() != null
                && other.getApplicationRestoreConfigurationDescription().equals(this.getApplicationRestoreConfigurationDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationRestoreConfigurationDescription() == null) ? 0 : getApplicationRestoreConfigurationDescription().hashCode());
        return hashCode;
    }

    @Override
    public RunConfigurationDescription clone() {
        try {
            return (RunConfigurationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.RunConfigurationDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
