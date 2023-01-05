/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The driver that the job runs on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/JobDriver" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobDriver implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The job driver parameters specified for Spark.
     * </p>
     */
    private SparkSubmit sparkSubmit;
    /**
     * <p>
     * The job driver parameters specified for Hive.
     * </p>
     */
    private Hive hive;

    /**
     * <p>
     * The job driver parameters specified for Spark.
     * </p>
     * 
     * @param sparkSubmit
     *        The job driver parameters specified for Spark.
     */

    public void setSparkSubmit(SparkSubmit sparkSubmit) {
        this.sparkSubmit = sparkSubmit;
    }

    /**
     * <p>
     * The job driver parameters specified for Spark.
     * </p>
     * 
     * @return The job driver parameters specified for Spark.
     */

    public SparkSubmit getSparkSubmit() {
        return this.sparkSubmit;
    }

    /**
     * <p>
     * The job driver parameters specified for Spark.
     * </p>
     * 
     * @param sparkSubmit
     *        The job driver parameters specified for Spark.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDriver withSparkSubmit(SparkSubmit sparkSubmit) {
        setSparkSubmit(sparkSubmit);
        return this;
    }

    /**
     * <p>
     * The job driver parameters specified for Hive.
     * </p>
     * 
     * @param hive
     *        The job driver parameters specified for Hive.
     */

    public void setHive(Hive hive) {
        this.hive = hive;
    }

    /**
     * <p>
     * The job driver parameters specified for Hive.
     * </p>
     * 
     * @return The job driver parameters specified for Hive.
     */

    public Hive getHive() {
        return this.hive;
    }

    /**
     * <p>
     * The job driver parameters specified for Hive.
     * </p>
     * 
     * @param hive
     *        The job driver parameters specified for Hive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDriver withHive(Hive hive) {
        setHive(hive);
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
        if (getSparkSubmit() != null)
            sb.append("SparkSubmit: ").append(getSparkSubmit()).append(",");
        if (getHive() != null)
            sb.append("Hive: ").append(getHive());
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
        if (other.getSparkSubmit() == null ^ this.getSparkSubmit() == null)
            return false;
        if (other.getSparkSubmit() != null && other.getSparkSubmit().equals(this.getSparkSubmit()) == false)
            return false;
        if (other.getHive() == null ^ this.getHive() == null)
            return false;
        if (other.getHive() != null && other.getHive().equals(this.getHive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSparkSubmit() == null) ? 0 : getSparkSubmit().hashCode());
        hashCode = prime * hashCode + ((getHive() == null) ? 0 : getHive().hashCode());
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
        com.amazonaws.services.emrserverless.model.transform.JobDriverMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
