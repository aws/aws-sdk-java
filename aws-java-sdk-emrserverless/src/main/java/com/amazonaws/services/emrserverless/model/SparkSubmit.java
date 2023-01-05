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
 * The configurations for the Spark submit job driver.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/SparkSubmit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SparkSubmit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The entry point for the Spark submit job run.
     * </p>
     */
    private String entryPoint;
    /**
     * <p>
     * The arguments for the Spark submit job run.
     * </p>
     */
    private java.util.List<String> entryPointArguments;
    /**
     * <p>
     * The parameters for the Spark submit job run.
     * </p>
     */
    private String sparkSubmitParameters;

    /**
     * <p>
     * The entry point for the Spark submit job run.
     * </p>
     * 
     * @param entryPoint
     *        The entry point for the Spark submit job run.
     */

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    /**
     * <p>
     * The entry point for the Spark submit job run.
     * </p>
     * 
     * @return The entry point for the Spark submit job run.
     */

    public String getEntryPoint() {
        return this.entryPoint;
    }

    /**
     * <p>
     * The entry point for the Spark submit job run.
     * </p>
     * 
     * @param entryPoint
     *        The entry point for the Spark submit job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSubmit withEntryPoint(String entryPoint) {
        setEntryPoint(entryPoint);
        return this;
    }

    /**
     * <p>
     * The arguments for the Spark submit job run.
     * </p>
     * 
     * @return The arguments for the Spark submit job run.
     */

    public java.util.List<String> getEntryPointArguments() {
        return entryPointArguments;
    }

    /**
     * <p>
     * The arguments for the Spark submit job run.
     * </p>
     * 
     * @param entryPointArguments
     *        The arguments for the Spark submit job run.
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
     * The arguments for the Spark submit job run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntryPointArguments(java.util.Collection)} or {@link #withEntryPointArguments(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param entryPointArguments
     *        The arguments for the Spark submit job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSubmit withEntryPointArguments(String... entryPointArguments) {
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
     * The arguments for the Spark submit job run.
     * </p>
     * 
     * @param entryPointArguments
     *        The arguments for the Spark submit job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSubmit withEntryPointArguments(java.util.Collection<String> entryPointArguments) {
        setEntryPointArguments(entryPointArguments);
        return this;
    }

    /**
     * <p>
     * The parameters for the Spark submit job run.
     * </p>
     * 
     * @param sparkSubmitParameters
     *        The parameters for the Spark submit job run.
     */

    public void setSparkSubmitParameters(String sparkSubmitParameters) {
        this.sparkSubmitParameters = sparkSubmitParameters;
    }

    /**
     * <p>
     * The parameters for the Spark submit job run.
     * </p>
     * 
     * @return The parameters for the Spark submit job run.
     */

    public String getSparkSubmitParameters() {
        return this.sparkSubmitParameters;
    }

    /**
     * <p>
     * The parameters for the Spark submit job run.
     * </p>
     * 
     * @param sparkSubmitParameters
     *        The parameters for the Spark submit job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SparkSubmit withSparkSubmitParameters(String sparkSubmitParameters) {
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

        if (obj instanceof SparkSubmit == false)
            return false;
        SparkSubmit other = (SparkSubmit) obj;
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
    public SparkSubmit clone() {
        try {
            return (SparkSubmit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.SparkSubmitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
