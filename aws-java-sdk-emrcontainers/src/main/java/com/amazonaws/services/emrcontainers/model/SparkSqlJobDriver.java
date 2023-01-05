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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The job driver for job type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/SparkSqlJobDriver" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SparkSqlJobDriver implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SQL file to be executed.
     * </p>
     */
    private String entryPoint;
    /**
     * <p>
     * The Spark parameters to be included in the Spark SQL command.
     * </p>
     */
    private String sparkSqlParameters;

    /**
     * <p>
     * The SQL file to be executed.
     * </p>
     * 
     * @param entryPoint
     *        The SQL file to be executed.
     */

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    /**
     * <p>
     * The SQL file to be executed.
     * </p>
     * 
     * @return The SQL file to be executed.
     */

    public String getEntryPoint() {
        return this.entryPoint;
    }

    /**
     * <p>
     * The SQL file to be executed.
     * </p>
     * 
     * @param entryPoint
     *        The SQL file to be executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSqlJobDriver withEntryPoint(String entryPoint) {
        setEntryPoint(entryPoint);
        return this;
    }

    /**
     * <p>
     * The Spark parameters to be included in the Spark SQL command.
     * </p>
     * 
     * @param sparkSqlParameters
     *        The Spark parameters to be included in the Spark SQL command.
     */

    public void setSparkSqlParameters(String sparkSqlParameters) {
        this.sparkSqlParameters = sparkSqlParameters;
    }

    /**
     * <p>
     * The Spark parameters to be included in the Spark SQL command.
     * </p>
     * 
     * @return The Spark parameters to be included in the Spark SQL command.
     */

    public String getSparkSqlParameters() {
        return this.sparkSqlParameters;
    }

    /**
     * <p>
     * The Spark parameters to be included in the Spark SQL command.
     * </p>
     * 
     * @param sparkSqlParameters
     *        The Spark parameters to be included in the Spark SQL command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSqlJobDriver withSparkSqlParameters(String sparkSqlParameters) {
        setSparkSqlParameters(sparkSqlParameters);
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
        if (getEntryPoint() != null)
            sb.append("EntryPoint: ").append("***Sensitive Data Redacted***").append(",");
        if (getSparkSqlParameters() != null)
            sb.append("SparkSqlParameters: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SparkSqlJobDriver == false)
            return false;
        SparkSqlJobDriver other = (SparkSqlJobDriver) obj;
        if (other.getEntryPoint() == null ^ this.getEntryPoint() == null)
            return false;
        if (other.getEntryPoint() != null && other.getEntryPoint().equals(this.getEntryPoint()) == false)
            return false;
        if (other.getSparkSqlParameters() == null ^ this.getSparkSqlParameters() == null)
            return false;
        if (other.getSparkSqlParameters() != null && other.getSparkSqlParameters().equals(this.getSparkSqlParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryPoint() == null) ? 0 : getEntryPoint().hashCode());
        hashCode = prime * hashCode + ((getSparkSqlParameters() == null) ? 0 : getSparkSqlParameters().hashCode());
        return hashCode;
    }

    @Override
    public SparkSqlJobDriver clone() {
        try {
            return (SparkSqlJobDriver) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.SparkSqlJobDriverMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
