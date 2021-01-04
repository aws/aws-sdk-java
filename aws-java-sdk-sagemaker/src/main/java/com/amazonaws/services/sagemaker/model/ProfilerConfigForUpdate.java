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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for updating the Debugger profile parameters, system and framework metrics configurations,
 * and storage paths.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProfilerConfigForUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfilerConfigForUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Path to Amazon S3 storage location for system and framework metrics.
     * </p>
     */
    private String s3OutputPath;
    /**
     * <p>
     * A time interval for capturing system metrics in milliseconds. Available values are 100, 200, 500, 1000 (1
     * second), 5000 (5 seconds), and 60000 (1 minute) milliseconds. The default value is 500 milliseconds.
     * </p>
     */
    private Long profilingIntervalInMilliseconds;
    /**
     * <p>
     * Configuration information for capturing framework metrics. Available key strings for different profiling options
     * are <code>DetailedProfilingConfig</code>, <code>PythonProfilingConfig</code>, and
     * <code>DataLoaderProfilingConfig</code>. The following codes are configuration structures for the
     * <code>ProfilingParameters</code> parameter. To learn more about how to configure the
     * <code>ProfilingParameters</code> parameter, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/debugger-createtrainingjob-api.html">Use the SageMaker and
     * Debugger Configuration API Operations to Create, Update, and Debug Your Training Job</a>.
     * </p>
     */
    private java.util.Map<String, String> profilingParameters;
    /**
     * <p>
     * To disable Debugger monitoring and profiling, set to <code>True</code>.
     * </p>
     */
    private Boolean disableProfiler;

    /**
     * <p>
     * Path to Amazon S3 storage location for system and framework metrics.
     * </p>
     * 
     * @param s3OutputPath
     *        Path to Amazon S3 storage location for system and framework metrics.
     */

    public void setS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for system and framework metrics.
     * </p>
     * 
     * @return Path to Amazon S3 storage location for system and framework metrics.
     */

    public String getS3OutputPath() {
        return this.s3OutputPath;
    }

    /**
     * <p>
     * Path to Amazon S3 storage location for system and framework metrics.
     * </p>
     * 
     * @param s3OutputPath
     *        Path to Amazon S3 storage location for system and framework metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilerConfigForUpdate withS3OutputPath(String s3OutputPath) {
        setS3OutputPath(s3OutputPath);
        return this;
    }

    /**
     * <p>
     * A time interval for capturing system metrics in milliseconds. Available values are 100, 200, 500, 1000 (1
     * second), 5000 (5 seconds), and 60000 (1 minute) milliseconds. The default value is 500 milliseconds.
     * </p>
     * 
     * @param profilingIntervalInMilliseconds
     *        A time interval for capturing system metrics in milliseconds. Available values are 100, 200, 500, 1000 (1
     *        second), 5000 (5 seconds), and 60000 (1 minute) milliseconds. The default value is 500 milliseconds.
     */

    public void setProfilingIntervalInMilliseconds(Long profilingIntervalInMilliseconds) {
        this.profilingIntervalInMilliseconds = profilingIntervalInMilliseconds;
    }

    /**
     * <p>
     * A time interval for capturing system metrics in milliseconds. Available values are 100, 200, 500, 1000 (1
     * second), 5000 (5 seconds), and 60000 (1 minute) milliseconds. The default value is 500 milliseconds.
     * </p>
     * 
     * @return A time interval for capturing system metrics in milliseconds. Available values are 100, 200, 500, 1000 (1
     *         second), 5000 (5 seconds), and 60000 (1 minute) milliseconds. The default value is 500 milliseconds.
     */

    public Long getProfilingIntervalInMilliseconds() {
        return this.profilingIntervalInMilliseconds;
    }

    /**
     * <p>
     * A time interval for capturing system metrics in milliseconds. Available values are 100, 200, 500, 1000 (1
     * second), 5000 (5 seconds), and 60000 (1 minute) milliseconds. The default value is 500 milliseconds.
     * </p>
     * 
     * @param profilingIntervalInMilliseconds
     *        A time interval for capturing system metrics in milliseconds. Available values are 100, 200, 500, 1000 (1
     *        second), 5000 (5 seconds), and 60000 (1 minute) milliseconds. The default value is 500 milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilerConfigForUpdate withProfilingIntervalInMilliseconds(Long profilingIntervalInMilliseconds) {
        setProfilingIntervalInMilliseconds(profilingIntervalInMilliseconds);
        return this;
    }

    /**
     * <p>
     * Configuration information for capturing framework metrics. Available key strings for different profiling options
     * are <code>DetailedProfilingConfig</code>, <code>PythonProfilingConfig</code>, and
     * <code>DataLoaderProfilingConfig</code>. The following codes are configuration structures for the
     * <code>ProfilingParameters</code> parameter. To learn more about how to configure the
     * <code>ProfilingParameters</code> parameter, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/debugger-createtrainingjob-api.html">Use the SageMaker and
     * Debugger Configuration API Operations to Create, Update, and Debug Your Training Job</a>.
     * </p>
     * 
     * @return Configuration information for capturing framework metrics. Available key strings for different profiling
     *         options are <code>DetailedProfilingConfig</code>, <code>PythonProfilingConfig</code>, and
     *         <code>DataLoaderProfilingConfig</code>. The following codes are configuration structures for the
     *         <code>ProfilingParameters</code> parameter. To learn more about how to configure the
     *         <code>ProfilingParameters</code> parameter, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/debugger-createtrainingjob-api.html">Use the
     *         SageMaker and Debugger Configuration API Operations to Create, Update, and Debug Your Training Job</a>.
     */

    public java.util.Map<String, String> getProfilingParameters() {
        return profilingParameters;
    }

    /**
     * <p>
     * Configuration information for capturing framework metrics. Available key strings for different profiling options
     * are <code>DetailedProfilingConfig</code>, <code>PythonProfilingConfig</code>, and
     * <code>DataLoaderProfilingConfig</code>. The following codes are configuration structures for the
     * <code>ProfilingParameters</code> parameter. To learn more about how to configure the
     * <code>ProfilingParameters</code> parameter, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/debugger-createtrainingjob-api.html">Use the SageMaker and
     * Debugger Configuration API Operations to Create, Update, and Debug Your Training Job</a>.
     * </p>
     * 
     * @param profilingParameters
     *        Configuration information for capturing framework metrics. Available key strings for different profiling
     *        options are <code>DetailedProfilingConfig</code>, <code>PythonProfilingConfig</code>, and
     *        <code>DataLoaderProfilingConfig</code>. The following codes are configuration structures for the
     *        <code>ProfilingParameters</code> parameter. To learn more about how to configure the
     *        <code>ProfilingParameters</code> parameter, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/debugger-createtrainingjob-api.html">Use the
     *        SageMaker and Debugger Configuration API Operations to Create, Update, and Debug Your Training Job</a>.
     */

    public void setProfilingParameters(java.util.Map<String, String> profilingParameters) {
        this.profilingParameters = profilingParameters;
    }

    /**
     * <p>
     * Configuration information for capturing framework metrics. Available key strings for different profiling options
     * are <code>DetailedProfilingConfig</code>, <code>PythonProfilingConfig</code>, and
     * <code>DataLoaderProfilingConfig</code>. The following codes are configuration structures for the
     * <code>ProfilingParameters</code> parameter. To learn more about how to configure the
     * <code>ProfilingParameters</code> parameter, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/debugger-createtrainingjob-api.html">Use the SageMaker and
     * Debugger Configuration API Operations to Create, Update, and Debug Your Training Job</a>.
     * </p>
     * 
     * @param profilingParameters
     *        Configuration information for capturing framework metrics. Available key strings for different profiling
     *        options are <code>DetailedProfilingConfig</code>, <code>PythonProfilingConfig</code>, and
     *        <code>DataLoaderProfilingConfig</code>. The following codes are configuration structures for the
     *        <code>ProfilingParameters</code> parameter. To learn more about how to configure the
     *        <code>ProfilingParameters</code> parameter, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/debugger-createtrainingjob-api.html">Use the
     *        SageMaker and Debugger Configuration API Operations to Create, Update, and Debug Your Training Job</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilerConfigForUpdate withProfilingParameters(java.util.Map<String, String> profilingParameters) {
        setProfilingParameters(profilingParameters);
        return this;
    }

    /**
     * Add a single ProfilingParameters entry
     *
     * @see ProfilerConfigForUpdate#withProfilingParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ProfilerConfigForUpdate addProfilingParametersEntry(String key, String value) {
        if (null == this.profilingParameters) {
            this.profilingParameters = new java.util.HashMap<String, String>();
        }
        if (this.profilingParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.profilingParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProfilingParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilerConfigForUpdate clearProfilingParametersEntries() {
        this.profilingParameters = null;
        return this;
    }

    /**
     * <p>
     * To disable Debugger monitoring and profiling, set to <code>True</code>.
     * </p>
     * 
     * @param disableProfiler
     *        To disable Debugger monitoring and profiling, set to <code>True</code>.
     */

    public void setDisableProfiler(Boolean disableProfiler) {
        this.disableProfiler = disableProfiler;
    }

    /**
     * <p>
     * To disable Debugger monitoring and profiling, set to <code>True</code>.
     * </p>
     * 
     * @return To disable Debugger monitoring and profiling, set to <code>True</code>.
     */

    public Boolean getDisableProfiler() {
        return this.disableProfiler;
    }

    /**
     * <p>
     * To disable Debugger monitoring and profiling, set to <code>True</code>.
     * </p>
     * 
     * @param disableProfiler
     *        To disable Debugger monitoring and profiling, set to <code>True</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilerConfigForUpdate withDisableProfiler(Boolean disableProfiler) {
        setDisableProfiler(disableProfiler);
        return this;
    }

    /**
     * <p>
     * To disable Debugger monitoring and profiling, set to <code>True</code>.
     * </p>
     * 
     * @return To disable Debugger monitoring and profiling, set to <code>True</code>.
     */

    public Boolean isDisableProfiler() {
        return this.disableProfiler;
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
        if (getS3OutputPath() != null)
            sb.append("S3OutputPath: ").append(getS3OutputPath()).append(",");
        if (getProfilingIntervalInMilliseconds() != null)
            sb.append("ProfilingIntervalInMilliseconds: ").append(getProfilingIntervalInMilliseconds()).append(",");
        if (getProfilingParameters() != null)
            sb.append("ProfilingParameters: ").append(getProfilingParameters()).append(",");
        if (getDisableProfiler() != null)
            sb.append("DisableProfiler: ").append(getDisableProfiler());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProfilerConfigForUpdate == false)
            return false;
        ProfilerConfigForUpdate other = (ProfilerConfigForUpdate) obj;
        if (other.getS3OutputPath() == null ^ this.getS3OutputPath() == null)
            return false;
        if (other.getS3OutputPath() != null && other.getS3OutputPath().equals(this.getS3OutputPath()) == false)
            return false;
        if (other.getProfilingIntervalInMilliseconds() == null ^ this.getProfilingIntervalInMilliseconds() == null)
            return false;
        if (other.getProfilingIntervalInMilliseconds() != null
                && other.getProfilingIntervalInMilliseconds().equals(this.getProfilingIntervalInMilliseconds()) == false)
            return false;
        if (other.getProfilingParameters() == null ^ this.getProfilingParameters() == null)
            return false;
        if (other.getProfilingParameters() != null && other.getProfilingParameters().equals(this.getProfilingParameters()) == false)
            return false;
        if (other.getDisableProfiler() == null ^ this.getDisableProfiler() == null)
            return false;
        if (other.getDisableProfiler() != null && other.getDisableProfiler().equals(this.getDisableProfiler()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3OutputPath() == null) ? 0 : getS3OutputPath().hashCode());
        hashCode = prime * hashCode + ((getProfilingIntervalInMilliseconds() == null) ? 0 : getProfilingIntervalInMilliseconds().hashCode());
        hashCode = prime * hashCode + ((getProfilingParameters() == null) ? 0 : getProfilingParameters().hashCode());
        hashCode = prime * hashCode + ((getDisableProfiler() == null) ? 0 : getDisableProfiler().hashCode());
        return hashCode;
    }

    @Override
    public ProfilerConfigForUpdate clone() {
        try {
            return (ProfilerConfigForUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProfilerConfigForUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
