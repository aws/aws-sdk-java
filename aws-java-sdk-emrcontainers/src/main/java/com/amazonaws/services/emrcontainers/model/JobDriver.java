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
 * Specify the driver that the job runs on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/JobDriver" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobDriver implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The job driver parameters specified for spark submit.
     * </p>
     */
    private SparkSubmitJobDriver sparkSubmitJobDriver;

    /**
     * <p>
     * The job driver parameters specified for spark submit.
     * </p>
     * 
     * @param sparkSubmitJobDriver
     *        The job driver parameters specified for spark submit.
     */

    public void setSparkSubmitJobDriver(SparkSubmitJobDriver sparkSubmitJobDriver) {
        this.sparkSubmitJobDriver = sparkSubmitJobDriver;
    }

    /**
     * <p>
     * The job driver parameters specified for spark submit.
     * </p>
     * 
     * @return The job driver parameters specified for spark submit.
     */

    public SparkSubmitJobDriver getSparkSubmitJobDriver() {
        return this.sparkSubmitJobDriver;
    }

    /**
     * <p>
     * The job driver parameters specified for spark submit.
     * </p>
     * 
     * @param sparkSubmitJobDriver
     *        The job driver parameters specified for spark submit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDriver withSparkSubmitJobDriver(SparkSubmitJobDriver sparkSubmitJobDriver) {
        setSparkSubmitJobDriver(sparkSubmitJobDriver);
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
        if (getSparkSubmitJobDriver() != null)
            sb.append("SparkSubmitJobDriver: ").append(getSparkSubmitJobDriver());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobDriver == false)
            return false;
        JobDriver other = (JobDriver) obj;
        if (other.getSparkSubmitJobDriver() == null ^ this.getSparkSubmitJobDriver() == null)
            return false;
        if (other.getSparkSubmitJobDriver() != null && other.getSparkSubmitJobDriver().equals(this.getSparkSubmitJobDriver()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSparkSubmitJobDriver() == null) ? 0 : getSparkSubmitJobDriver().hashCode());
        return hashCode;
    }

    @Override
    public JobDriver clone() {
        try {
            return (JobDriver) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.JobDriverMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
