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
 * The information about job driver for Spark submit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/SparkSubmitJobDriver"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SparkSubmitJobDriver implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The entry point of job application.
     * </p>
     */
    private String entryPoint;
    /**
     * <p>
     * The arguments for job application.
     * </p>
     */
    private java.util.List<String> entryPointArguments;
    /**
     * <p>
     * The Spark submit parameters that are used for job runs.
     * </p>
     */
    private String sparkSubmitParameters;

    /**
     * <p>
     * The entry point of job application.
     * </p>
     * 
     * @param entryPoint
     *        The entry point of job application.
     */

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    /**
     * <p>
     * The entry point of job application.
     * </p>
     * 
     * @return The entry point of job application.
     */

    public String getEntryPoint() {
        return this.entryPoint;
    }

    /**
     * <p>
     * The entry point of job application.
     * </p>
     * 
     * @param entryPoint
     *        The entry point of job application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSubmitJobDriver withEntryPoint(String entryPoint) {
        setEntryPoint(entryPoint);
        return this;
    }

    /**
     * <p>
     * The arguments for job application.
     * </p>
     * 
     * @return The arguments for job application.
     */

    public java.util.List<String> getEntryPointArguments() {
        return entryPointArguments;
    }

    /**
     * <p>
     * The arguments for job application.
     * </p>
     * 
     * @param entryPointArguments
     *        The arguments for job application.
     */

    public void setEntryPointArguments(java.util.Collection<String> entryPointArguments) {
        if (entryPointArguments == null) {
            this.entryPointArguments = null;
            return;
        }

        this.entryPointArguments = new java.util.ArrayList<String>(entryPointArguments);
    }

    /**
     * <p>
     * The arguments for job application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntryPointArguments(java.util.Collection)} or {@link #withEntryPointArguments(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param entryPointArguments
     *        The arguments for job application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSubmitJobDriver withEntryPointArguments(String... entryPointArguments) {
        if (this.entryPointArguments == null) {
            setEntryPointArguments(new java.util.ArrayList<String>(entryPointArguments.length));
        }
        for (String ele : entryPointArguments) {
            this.entryPointArguments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The arguments for job application.
     * </p>
     * 
     * @param entryPointArguments
     *        The arguments for job application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSubmitJobDriver withEntryPointArguments(java.util.Collection<String> entryPointArguments) {
        setEntryPointArguments(entryPointArguments);
        return this;
    }

    /**
     * <p>
     * The Spark submit parameters that are used for job runs.
     * </p>
     * 
     * @param sparkSubmitParameters
     *        The Spark submit parameters that are used for job runs.
     */

    public void setSparkSubmitParameters(String sparkSubmitParameters) {
        this.sparkSubmitParameters = sparkSubmitParameters;
    }

    /**
     * <p>
     * The Spark submit parameters that are used for job runs.
     * </p>
     * 
     * @return The Spark submit parameters that are used for job runs.
     */

    public String getSparkSubmitParameters() {
        return this.sparkSubmitParameters;
    }

    /**
     * <p>
     * The Spark submit parameters that are used for job runs.
     * </p>
     * 
     * @param sparkSubmitParameters
     *        The Spark submit parameters that are used for job runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSubmitJobDriver withSparkSubmitParameters(String sparkSubmitParameters) {
        setSparkSubmitParameters(sparkSubmitParameters);
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
        if (getEntryPointArguments() != null)
            sb.append("EntryPointArguments: ").append("***Sensitive Data Redacted***").append(",");
        if (getSparkSubmitParameters() != null)
            sb.append("SparkSubmitParameters: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SparkSubmitJobDriver == false)
            return false;
        SparkSubmitJobDriver other = (SparkSubmitJobDriver) obj;
        if (other.getEntryPoint() == null ^ this.getEntryPoint() == null)
            return false;
        if (other.getEntryPoint() != null && other.getEntryPoint().equals(this.getEntryPoint()) == false)
            return false;
        if (other.getEntryPointArguments() == null ^ this.getEntryPointArguments() == null)
            return false;
        if (other.getEntryPointArguments() != null && other.getEntryPointArguments().equals(this.getEntryPointArguments()) == false)
            return false;
        if (other.getSparkSubmitParameters() == null ^ this.getSparkSubmitParameters() == null)
            return false;
        if (other.getSparkSubmitParameters() != null && other.getSparkSubmitParameters().equals(this.getSparkSubmitParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryPoint() == null) ? 0 : getEntryPoint().hashCode());
        hashCode = prime * hashCode + ((getEntryPointArguments() == null) ? 0 : getEntryPointArguments().hashCode());
        hashCode = prime * hashCode + ((getSparkSubmitParameters() == null) ? 0 : getSparkSubmitParameters().hashCode());
        return hashCode;
    }

    @Override
    public SparkSubmitJobDriver clone() {
        try {
            return (SparkSubmitJobDriver) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.SparkSubmitJobDriverMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
