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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The action engine, or executor, related to the supported integration model used to create and update the action type.
 * The available executor types are <code>Lambda</code> and <code>JobWorker</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ExecutorConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutorConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the <code>Lambda</code> executor of the action type.
     * </p>
     */
    private LambdaExecutorConfiguration lambdaExecutorConfiguration;
    /**
     * <p>
     * Details about the <code>JobWorker</code> executor of the action type.
     * </p>
     */
    private JobWorkerExecutorConfiguration jobWorkerExecutorConfiguration;

    /**
     * <p>
     * Details about the <code>Lambda</code> executor of the action type.
     * </p>
     * 
     * @param lambdaExecutorConfiguration
     *        Details about the <code>Lambda</code> executor of the action type.
     */

    public void setLambdaExecutorConfiguration(LambdaExecutorConfiguration lambdaExecutorConfiguration) {
        this.lambdaExecutorConfiguration = lambdaExecutorConfiguration;
    }

    /**
     * <p>
     * Details about the <code>Lambda</code> executor of the action type.
     * </p>
     * 
     * @return Details about the <code>Lambda</code> executor of the action type.
     */

    public LambdaExecutorConfiguration getLambdaExecutorConfiguration() {
        return this.lambdaExecutorConfiguration;
    }

    /**
     * <p>
     * Details about the <code>Lambda</code> executor of the action type.
     * </p>
     * 
     * @param lambdaExecutorConfiguration
     *        Details about the <code>Lambda</code> executor of the action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutorConfiguration withLambdaExecutorConfiguration(LambdaExecutorConfiguration lambdaExecutorConfiguration) {
        setLambdaExecutorConfiguration(lambdaExecutorConfiguration);
        return this;
    }

    /**
     * <p>
     * Details about the <code>JobWorker</code> executor of the action type.
     * </p>
     * 
     * @param jobWorkerExecutorConfiguration
     *        Details about the <code>JobWorker</code> executor of the action type.
     */

    public void setJobWorkerExecutorConfiguration(JobWorkerExecutorConfiguration jobWorkerExecutorConfiguration) {
        this.jobWorkerExecutorConfiguration = jobWorkerExecutorConfiguration;
    }

    /**
     * <p>
     * Details about the <code>JobWorker</code> executor of the action type.
     * </p>
     * 
     * @return Details about the <code>JobWorker</code> executor of the action type.
     */

    public JobWorkerExecutorConfiguration getJobWorkerExecutorConfiguration() {
        return this.jobWorkerExecutorConfiguration;
    }

    /**
     * <p>
     * Details about the <code>JobWorker</code> executor of the action type.
     * </p>
     * 
     * @param jobWorkerExecutorConfiguration
     *        Details about the <code>JobWorker</code> executor of the action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutorConfiguration withJobWorkerExecutorConfiguration(JobWorkerExecutorConfiguration jobWorkerExecutorConfiguration) {
        setJobWorkerExecutorConfiguration(jobWorkerExecutorConfiguration);
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
        if (getLambdaExecutorConfiguration() != null)
            sb.append("LambdaExecutorConfiguration: ").append(getLambdaExecutorConfiguration()).append(",");
        if (getJobWorkerExecutorConfiguration() != null)
            sb.append("JobWorkerExecutorConfiguration: ").append(getJobWorkerExecutorConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutorConfiguration == false)
            return false;
        ExecutorConfiguration other = (ExecutorConfiguration) obj;
        if (other.getLambdaExecutorConfiguration() == null ^ this.getLambdaExecutorConfiguration() == null)
            return false;
        if (other.getLambdaExecutorConfiguration() != null && other.getLambdaExecutorConfiguration().equals(this.getLambdaExecutorConfiguration()) == false)
            return false;
        if (other.getJobWorkerExecutorConfiguration() == null ^ this.getJobWorkerExecutorConfiguration() == null)
            return false;
        if (other.getJobWorkerExecutorConfiguration() != null
                && other.getJobWorkerExecutorConfiguration().equals(this.getJobWorkerExecutorConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaExecutorConfiguration() == null) ? 0 : getLambdaExecutorConfiguration().hashCode());
        hashCode = prime * hashCode + ((getJobWorkerExecutorConfiguration() == null) ? 0 : getJobWorkerExecutorConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ExecutorConfiguration clone() {
        try {
            return (ExecutorConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ExecutorConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
