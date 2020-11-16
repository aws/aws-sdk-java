/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains input information for a canary run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CanaryRunConfigInput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CanaryRunConfigInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How long the canary is allowed to run before it must stop. You can't set this time to be longer than the
     * frequency of the runs of this canary.
     * </p>
     * <p>
     * If you omit this field, the frequency of the canary is used as this value, up to a maximum of 14 minutes.
     * </p>
     */
    private Integer timeoutInSeconds;
    /**
     * <p>
     * The maximum amount of memory available to the canary while it is running, in MB. This value must be a multiple of
     * 64.
     * </p>
     */
    private Integer memoryInMB;
    /**
     * <p>
     * Specifies whether this canary is to use active AWS X-Ray tracing when it runs. Active tracing enables this canary
     * run to be displayed in the ServiceLens and X-Ray service maps even if the canary does not hit an endpoint that
     * has X-ray tracing enabled. Using X-Ray tracing incurs charges. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html">
     * Canaries and X-Ray tracing</a>.
     * </p>
     * <p>
     * You can enable active tracing only for canaries that use version <code>syn-nodejs-2.0</code> or later for their
     * canary runtime.
     * </p>
     */
    private Boolean activeTracing;
    /**
     * <p>
     * Specifies the keys and values to use for any environment variables used in the canary script. Use the following
     * format:
     * </p>
     * <p>
     * { "key1" : "value1", "key2" : "value2", ...}
     * </p>
     * <p>
     * Keys must start with a letter and be at least two characters. The total size of your environment variables cannot
     * exceed 4 KB. You can't specify any Lambda reserved environment variables as the keys for your environment
     * variables. For more information about reserved keys, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-runtime">
     * Runtime environment variables</a>.
     * </p>
     */
    private java.util.Map<String, String> environmentVariables;

    /**
     * <p>
     * How long the canary is allowed to run before it must stop. You can't set this time to be longer than the
     * frequency of the runs of this canary.
     * </p>
     * <p>
     * If you omit this field, the frequency of the canary is used as this value, up to a maximum of 14 minutes.
     * </p>
     * 
     * @param timeoutInSeconds
     *        How long the canary is allowed to run before it must stop. You can't set this time to be longer than the
     *        frequency of the runs of this canary.</p>
     *        <p>
     *        If you omit this field, the frequency of the canary is used as this value, up to a maximum of 14 minutes.
     */

    public void setTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * How long the canary is allowed to run before it must stop. You can't set this time to be longer than the
     * frequency of the runs of this canary.
     * </p>
     * <p>
     * If you omit this field, the frequency of the canary is used as this value, up to a maximum of 14 minutes.
     * </p>
     * 
     * @return How long the canary is allowed to run before it must stop. You can't set this time to be longer than the
     *         frequency of the runs of this canary.</p>
     *         <p>
     *         If you omit this field, the frequency of the canary is used as this value, up to a maximum of 14 minutes.
     */

    public Integer getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * How long the canary is allowed to run before it must stop. You can't set this time to be longer than the
     * frequency of the runs of this canary.
     * </p>
     * <p>
     * If you omit this field, the frequency of the canary is used as this value, up to a maximum of 14 minutes.
     * </p>
     * 
     * @param timeoutInSeconds
     *        How long the canary is allowed to run before it must stop. You can't set this time to be longer than the
     *        frequency of the runs of this canary.</p>
     *        <p>
     *        If you omit this field, the frequency of the canary is used as this value, up to a maximum of 14 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryRunConfigInput withTimeoutInSeconds(Integer timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * The maximum amount of memory available to the canary while it is running, in MB. This value must be a multiple of
     * 64.
     * </p>
     * 
     * @param memoryInMB
     *        The maximum amount of memory available to the canary while it is running, in MB. This value must be a
     *        multiple of 64.
     */

    public void setMemoryInMB(Integer memoryInMB) {
        this.memoryInMB = memoryInMB;
    }

    /**
     * <p>
     * The maximum amount of memory available to the canary while it is running, in MB. This value must be a multiple of
     * 64.
     * </p>
     * 
     * @return The maximum amount of memory available to the canary while it is running, in MB. This value must be a
     *         multiple of 64.
     */

    public Integer getMemoryInMB() {
        return this.memoryInMB;
    }

    /**
     * <p>
     * The maximum amount of memory available to the canary while it is running, in MB. This value must be a multiple of
     * 64.
     * </p>
     * 
     * @param memoryInMB
     *        The maximum amount of memory available to the canary while it is running, in MB. This value must be a
     *        multiple of 64.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryRunConfigInput withMemoryInMB(Integer memoryInMB) {
        setMemoryInMB(memoryInMB);
        return this;
    }

    /**
     * <p>
     * Specifies whether this canary is to use active AWS X-Ray tracing when it runs. Active tracing enables this canary
     * run to be displayed in the ServiceLens and X-Ray service maps even if the canary does not hit an endpoint that
     * has X-ray tracing enabled. Using X-Ray tracing incurs charges. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html">
     * Canaries and X-Ray tracing</a>.
     * </p>
     * <p>
     * You can enable active tracing only for canaries that use version <code>syn-nodejs-2.0</code> or later for their
     * canary runtime.
     * </p>
     * 
     * @param activeTracing
     *        Specifies whether this canary is to use active AWS X-Ray tracing when it runs. Active tracing enables this
     *        canary run to be displayed in the ServiceLens and X-Ray service maps even if the canary does not hit an
     *        endpoint that has X-ray tracing enabled. Using X-Ray tracing incurs charges. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html"
     *        > Canaries and X-Ray tracing</a>.</p>
     *        <p>
     *        You can enable active tracing only for canaries that use version <code>syn-nodejs-2.0</code> or later for
     *        their canary runtime.
     */

    public void setActiveTracing(Boolean activeTracing) {
        this.activeTracing = activeTracing;
    }

    /**
     * <p>
     * Specifies whether this canary is to use active AWS X-Ray tracing when it runs. Active tracing enables this canary
     * run to be displayed in the ServiceLens and X-Ray service maps even if the canary does not hit an endpoint that
     * has X-ray tracing enabled. Using X-Ray tracing incurs charges. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html">
     * Canaries and X-Ray tracing</a>.
     * </p>
     * <p>
     * You can enable active tracing only for canaries that use version <code>syn-nodejs-2.0</code> or later for their
     * canary runtime.
     * </p>
     * 
     * @return Specifies whether this canary is to use active AWS X-Ray tracing when it runs. Active tracing enables
     *         this canary run to be displayed in the ServiceLens and X-Ray service maps even if the canary does not hit
     *         an endpoint that has X-ray tracing enabled. Using X-Ray tracing incurs charges. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html"
     *         > Canaries and X-Ray tracing</a>.</p>
     *         <p>
     *         You can enable active tracing only for canaries that use version <code>syn-nodejs-2.0</code> or later for
     *         their canary runtime.
     */

    public Boolean getActiveTracing() {
        return this.activeTracing;
    }

    /**
     * <p>
     * Specifies whether this canary is to use active AWS X-Ray tracing when it runs. Active tracing enables this canary
     * run to be displayed in the ServiceLens and X-Ray service maps even if the canary does not hit an endpoint that
     * has X-ray tracing enabled. Using X-Ray tracing incurs charges. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html">
     * Canaries and X-Ray tracing</a>.
     * </p>
     * <p>
     * You can enable active tracing only for canaries that use version <code>syn-nodejs-2.0</code> or later for their
     * canary runtime.
     * </p>
     * 
     * @param activeTracing
     *        Specifies whether this canary is to use active AWS X-Ray tracing when it runs. Active tracing enables this
     *        canary run to be displayed in the ServiceLens and X-Ray service maps even if the canary does not hit an
     *        endpoint that has X-ray tracing enabled. Using X-Ray tracing incurs charges. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html"
     *        > Canaries and X-Ray tracing</a>.</p>
     *        <p>
     *        You can enable active tracing only for canaries that use version <code>syn-nodejs-2.0</code> or later for
     *        their canary runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryRunConfigInput withActiveTracing(Boolean activeTracing) {
        setActiveTracing(activeTracing);
        return this;
    }

    /**
     * <p>
     * Specifies whether this canary is to use active AWS X-Ray tracing when it runs. Active tracing enables this canary
     * run to be displayed in the ServiceLens and X-Ray service maps even if the canary does not hit an endpoint that
     * has X-ray tracing enabled. Using X-Ray tracing incurs charges. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html">
     * Canaries and X-Ray tracing</a>.
     * </p>
     * <p>
     * You can enable active tracing only for canaries that use version <code>syn-nodejs-2.0</code> or later for their
     * canary runtime.
     * </p>
     * 
     * @return Specifies whether this canary is to use active AWS X-Ray tracing when it runs. Active tracing enables
     *         this canary run to be displayed in the ServiceLens and X-Ray service maps even if the canary does not hit
     *         an endpoint that has X-ray tracing enabled. Using X-Ray tracing incurs charges. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_tracing.html"
     *         > Canaries and X-Ray tracing</a>.</p>
     *         <p>
     *         You can enable active tracing only for canaries that use version <code>syn-nodejs-2.0</code> or later for
     *         their canary runtime.
     */

    public Boolean isActiveTracing() {
        return this.activeTracing;
    }

    /**
     * <p>
     * Specifies the keys and values to use for any environment variables used in the canary script. Use the following
     * format:
     * </p>
     * <p>
     * { "key1" : "value1", "key2" : "value2", ...}
     * </p>
     * <p>
     * Keys must start with a letter and be at least two characters. The total size of your environment variables cannot
     * exceed 4 KB. You can't specify any Lambda reserved environment variables as the keys for your environment
     * variables. For more information about reserved keys, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-runtime">
     * Runtime environment variables</a>.
     * </p>
     * 
     * @return Specifies the keys and values to use for any environment variables used in the canary script. Use the
     *         following format:</p>
     *         <p>
     *         { "key1" : "value1", "key2" : "value2", ...}
     *         </p>
     *         <p>
     *         Keys must start with a letter and be at least two characters. The total size of your environment
     *         variables cannot exceed 4 KB. You can't specify any Lambda reserved environment variables as the keys for
     *         your environment variables. For more information about reserved keys, see <a href=
     *         "https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-runtime">
     *         Runtime environment variables</a>.
     */

    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * <p>
     * Specifies the keys and values to use for any environment variables used in the canary script. Use the following
     * format:
     * </p>
     * <p>
     * { "key1" : "value1", "key2" : "value2", ...}
     * </p>
     * <p>
     * Keys must start with a letter and be at least two characters. The total size of your environment variables cannot
     * exceed 4 KB. You can't specify any Lambda reserved environment variables as the keys for your environment
     * variables. For more information about reserved keys, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-runtime">
     * Runtime environment variables</a>.
     * </p>
     * 
     * @param environmentVariables
     *        Specifies the keys and values to use for any environment variables used in the canary script. Use the
     *        following format:</p>
     *        <p>
     *        { "key1" : "value1", "key2" : "value2", ...}
     *        </p>
     *        <p>
     *        Keys must start with a letter and be at least two characters. The total size of your environment variables
     *        cannot exceed 4 KB. You can't specify any Lambda reserved environment variables as the keys for your
     *        environment variables. For more information about reserved keys, see <a href=
     *        "https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-runtime">
     *        Runtime environment variables</a>.
     */

    public void setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * <p>
     * Specifies the keys and values to use for any environment variables used in the canary script. Use the following
     * format:
     * </p>
     * <p>
     * { "key1" : "value1", "key2" : "value2", ...}
     * </p>
     * <p>
     * Keys must start with a letter and be at least two characters. The total size of your environment variables cannot
     * exceed 4 KB. You can't specify any Lambda reserved environment variables as the keys for your environment
     * variables. For more information about reserved keys, see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-runtime">
     * Runtime environment variables</a>.
     * </p>
     * 
     * @param environmentVariables
     *        Specifies the keys and values to use for any environment variables used in the canary script. Use the
     *        following format:</p>
     *        <p>
     *        { "key1" : "value1", "key2" : "value2", ...}
     *        </p>
     *        <p>
     *        Keys must start with a letter and be at least two characters. The total size of your environment variables
     *        cannot exceed 4 KB. You can't specify any Lambda reserved environment variables as the keys for your
     *        environment variables. For more information about reserved keys, see <a href=
     *        "https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html#configuration-envvars-runtime">
     *        Runtime environment variables</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryRunConfigInput withEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
        setEnvironmentVariables(environmentVariables);
        return this;
    }

    /**
     * Add a single EnvironmentVariables entry
     *
     * @see CanaryRunConfigInput#withEnvironmentVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CanaryRunConfigInput addEnvironmentVariablesEntry(String key, String value) {
        if (null == this.environmentVariables) {
            this.environmentVariables = new java.util.HashMap<String, String>();
        }
        if (this.environmentVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environmentVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EnvironmentVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryRunConfigInput clearEnvironmentVariablesEntries() {
        this.environmentVariables = null;
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
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: ").append(getTimeoutInSeconds()).append(",");
        if (getMemoryInMB() != null)
            sb.append("MemoryInMB: ").append(getMemoryInMB()).append(",");
        if (getActiveTracing() != null)
            sb.append("ActiveTracing: ").append(getActiveTracing()).append(",");
        if (getEnvironmentVariables() != null)
            sb.append("EnvironmentVariables: ").append(getEnvironmentVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryRunConfigInput == false)
            return false;
        CanaryRunConfigInput other = (CanaryRunConfigInput) obj;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        if (other.getMemoryInMB() == null ^ this.getMemoryInMB() == null)
            return false;
        if (other.getMemoryInMB() != null && other.getMemoryInMB().equals(this.getMemoryInMB()) == false)
            return false;
        if (other.getActiveTracing() == null ^ this.getActiveTracing() == null)
            return false;
        if (other.getActiveTracing() != null && other.getActiveTracing().equals(this.getActiveTracing()) == false)
            return false;
        if (other.getEnvironmentVariables() == null ^ this.getEnvironmentVariables() == null)
            return false;
        if (other.getEnvironmentVariables() != null && other.getEnvironmentVariables().equals(this.getEnvironmentVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getMemoryInMB() == null) ? 0 : getMemoryInMB().hashCode());
        hashCode = prime * hashCode + ((getActiveTracing() == null) ? 0 : getActiveTracing().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentVariables() == null) ? 0 : getEnvironmentVariables().hashCode());
        return hashCode;
    }

    @Override
    public CanaryRunConfigInput clone() {
        try {
            return (CanaryRunConfigInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.CanaryRunConfigInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
