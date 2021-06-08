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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The response of <a href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
 * <code>ConfigureAgent</code> </a> that specifies if an agent profiles or not and for how long to return profiling
 * data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/AgentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parameters used by the profiler. The valid parameters are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MaxStackDepth</code> - The maximum depth of the stacks in the code that is represented in the profile. For
     * example, if CodeGuru Profiler finds a method <code>A</code>, which calls method <code>B</code>, which calls
     * method <code>C</code>, which calls method <code>D</code>, then the depth is 4. If the <code>maxDepth</code> is
     * set to 2, then the profiler evaluates <code>A</code> and <code>B</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MemoryUsageLimitPercent</code> - The percentage of memory that is used by the profiler.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MinimumTimeForReportingInMilliseconds</code> - The minimum time in milliseconds between sending reports.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReportingIntervalInMilliseconds</code> - The reporting interval in milliseconds used to report profiles.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SamplingIntervalInMilliseconds</code> - The sampling interval in milliseconds that is used to profile
     * samples.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> agentParameters;
    /**
     * <p>
     * How long a profiling agent should send profiling data using <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
     * <code>ConfigureAgent</code> </a>. For example, if this is set to 300, the profiling agent calls <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
     * <code>ConfigureAgent</code> </a> every 5 minutes to submit the profiled data collected during that period.
     * </p>
     */
    private Integer periodInSeconds;
    /**
     * <p>
     * A <code>Boolean</code> that specifies whether the profiling agent collects profiling data or not. Set to
     * <code>true</code> to enable profiling.
     * </p>
     */
    private Boolean shouldProfile;

    /**
     * <p>
     * Parameters used by the profiler. The valid parameters are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MaxStackDepth</code> - The maximum depth of the stacks in the code that is represented in the profile. For
     * example, if CodeGuru Profiler finds a method <code>A</code>, which calls method <code>B</code>, which calls
     * method <code>C</code>, which calls method <code>D</code>, then the depth is 4. If the <code>maxDepth</code> is
     * set to 2, then the profiler evaluates <code>A</code> and <code>B</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MemoryUsageLimitPercent</code> - The percentage of memory that is used by the profiler.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MinimumTimeForReportingInMilliseconds</code> - The minimum time in milliseconds between sending reports.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReportingIntervalInMilliseconds</code> - The reporting interval in milliseconds used to report profiles.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SamplingIntervalInMilliseconds</code> - The sampling interval in milliseconds that is used to profile
     * samples.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Parameters used by the profiler. The valid parameters are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MaxStackDepth</code> - The maximum depth of the stacks in the code that is represented in the
     *         profile. For example, if CodeGuru Profiler finds a method <code>A</code>, which calls method
     *         <code>B</code>, which calls method <code>C</code>, which calls method <code>D</code>, then the depth is
     *         4. If the <code>maxDepth</code> is set to 2, then the profiler evaluates <code>A</code> and
     *         <code>B</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MemoryUsageLimitPercent</code> - The percentage of memory that is used by the profiler.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MinimumTimeForReportingInMilliseconds</code> - The minimum time in milliseconds between sending
     *         reports.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReportingIntervalInMilliseconds</code> - The reporting interval in milliseconds used to report
     *         profiles.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SamplingIntervalInMilliseconds</code> - The sampling interval in milliseconds that is used to
     *         profile samples.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getAgentParameters() {
        return agentParameters;
    }

    /**
     * <p>
     * Parameters used by the profiler. The valid parameters are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MaxStackDepth</code> - The maximum depth of the stacks in the code that is represented in the profile. For
     * example, if CodeGuru Profiler finds a method <code>A</code>, which calls method <code>B</code>, which calls
     * method <code>C</code>, which calls method <code>D</code>, then the depth is 4. If the <code>maxDepth</code> is
     * set to 2, then the profiler evaluates <code>A</code> and <code>B</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MemoryUsageLimitPercent</code> - The percentage of memory that is used by the profiler.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MinimumTimeForReportingInMilliseconds</code> - The minimum time in milliseconds between sending reports.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReportingIntervalInMilliseconds</code> - The reporting interval in milliseconds used to report profiles.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SamplingIntervalInMilliseconds</code> - The sampling interval in milliseconds that is used to profile
     * samples.
     * </p>
     * </li>
     * </ul>
     * 
     * @param agentParameters
     *        Parameters used by the profiler. The valid parameters are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MaxStackDepth</code> - The maximum depth of the stacks in the code that is represented in the
     *        profile. For example, if CodeGuru Profiler finds a method <code>A</code>, which calls method
     *        <code>B</code>, which calls method <code>C</code>, which calls method <code>D</code>, then the depth is 4.
     *        If the <code>maxDepth</code> is set to 2, then the profiler evaluates <code>A</code> and <code>B</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MemoryUsageLimitPercent</code> - The percentage of memory that is used by the profiler.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MinimumTimeForReportingInMilliseconds</code> - The minimum time in milliseconds between sending
     *        reports.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReportingIntervalInMilliseconds</code> - The reporting interval in milliseconds used to report
     *        profiles.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SamplingIntervalInMilliseconds</code> - The sampling interval in milliseconds that is used to
     *        profile samples.
     *        </p>
     *        </li>
     */

    public void setAgentParameters(java.util.Map<String, String> agentParameters) {
        this.agentParameters = agentParameters;
    }

    /**
     * <p>
     * Parameters used by the profiler. The valid parameters are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MaxStackDepth</code> - The maximum depth of the stacks in the code that is represented in the profile. For
     * example, if CodeGuru Profiler finds a method <code>A</code>, which calls method <code>B</code>, which calls
     * method <code>C</code>, which calls method <code>D</code>, then the depth is 4. If the <code>maxDepth</code> is
     * set to 2, then the profiler evaluates <code>A</code> and <code>B</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MemoryUsageLimitPercent</code> - The percentage of memory that is used by the profiler.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MinimumTimeForReportingInMilliseconds</code> - The minimum time in milliseconds between sending reports.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReportingIntervalInMilliseconds</code> - The reporting interval in milliseconds used to report profiles.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SamplingIntervalInMilliseconds</code> - The sampling interval in milliseconds that is used to profile
     * samples.
     * </p>
     * </li>
     * </ul>
     * 
     * @param agentParameters
     *        Parameters used by the profiler. The valid parameters are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MaxStackDepth</code> - The maximum depth of the stacks in the code that is represented in the
     *        profile. For example, if CodeGuru Profiler finds a method <code>A</code>, which calls method
     *        <code>B</code>, which calls method <code>C</code>, which calls method <code>D</code>, then the depth is 4.
     *        If the <code>maxDepth</code> is set to 2, then the profiler evaluates <code>A</code> and <code>B</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MemoryUsageLimitPercent</code> - The percentage of memory that is used by the profiler.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MinimumTimeForReportingInMilliseconds</code> - The minimum time in milliseconds between sending
     *        reports.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReportingIntervalInMilliseconds</code> - The reporting interval in milliseconds used to report
     *        profiles.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SamplingIntervalInMilliseconds</code> - The sampling interval in milliseconds that is used to
     *        profile samples.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentConfiguration withAgentParameters(java.util.Map<String, String> agentParameters) {
        setAgentParameters(agentParameters);
        return this;
    }

    /**
     * Add a single AgentParameters entry
     *
     * @see AgentConfiguration#withAgentParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AgentConfiguration addAgentParametersEntry(String key, String value) {
        if (null == this.agentParameters) {
            this.agentParameters = new java.util.HashMap<String, String>();
        }
        if (this.agentParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.agentParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AgentParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentConfiguration clearAgentParametersEntries() {
        this.agentParameters = null;
        return this;
    }

    /**
     * <p>
     * How long a profiling agent should send profiling data using <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
     * <code>ConfigureAgent</code> </a>. For example, if this is set to 300, the profiling agent calls <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
     * <code>ConfigureAgent</code> </a> every 5 minutes to submit the profiled data collected during that period.
     * </p>
     * 
     * @param periodInSeconds
     *        How long a profiling agent should send profiling data using <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
     *        <code>ConfigureAgent</code> </a>. For example, if this is set to 300, the profiling agent calls <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
     *        <code>ConfigureAgent</code> </a> every 5 minutes to submit the profiled data collected during that period.
     */

    public void setPeriodInSeconds(Integer periodInSeconds) {
        this.periodInSeconds = periodInSeconds;
    }

    /**
     * <p>
     * How long a profiling agent should send profiling data using <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
     * <code>ConfigureAgent</code> </a>. For example, if this is set to 300, the profiling agent calls <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
     * <code>ConfigureAgent</code> </a> every 5 minutes to submit the profiled data collected during that period.
     * </p>
     * 
     * @return How long a profiling agent should send profiling data using <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
     *         <code>ConfigureAgent</code> </a>. For example, if this is set to 300, the profiling agent calls <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
     *         <code>ConfigureAgent</code> </a> every 5 minutes to submit the profiled data collected during that
     *         period.
     */

    public Integer getPeriodInSeconds() {
        return this.periodInSeconds;
    }

    /**
     * <p>
     * How long a profiling agent should send profiling data using <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
     * <code>ConfigureAgent</code> </a>. For example, if this is set to 300, the profiling agent calls <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
     * <code>ConfigureAgent</code> </a> every 5 minutes to submit the profiled data collected during that period.
     * </p>
     * 
     * @param periodInSeconds
     *        How long a profiling agent should send profiling data using <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
     *        <code>ConfigureAgent</code> </a>. For example, if this is set to 300, the profiling agent calls <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_ConfigureAgent.html">
     *        <code>ConfigureAgent</code> </a> every 5 minutes to submit the profiled data collected during that period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentConfiguration withPeriodInSeconds(Integer periodInSeconds) {
        setPeriodInSeconds(periodInSeconds);
        return this;
    }

    /**
     * <p>
     * A <code>Boolean</code> that specifies whether the profiling agent collects profiling data or not. Set to
     * <code>true</code> to enable profiling.
     * </p>
     * 
     * @param shouldProfile
     *        A <code>Boolean</code> that specifies whether the profiling agent collects profiling data or not. Set to
     *        <code>true</code> to enable profiling.
     */

    public void setShouldProfile(Boolean shouldProfile) {
        this.shouldProfile = shouldProfile;
    }

    /**
     * <p>
     * A <code>Boolean</code> that specifies whether the profiling agent collects profiling data or not. Set to
     * <code>true</code> to enable profiling.
     * </p>
     * 
     * @return A <code>Boolean</code> that specifies whether the profiling agent collects profiling data or not. Set to
     *         <code>true</code> to enable profiling.
     */

    public Boolean getShouldProfile() {
        return this.shouldProfile;
    }

    /**
     * <p>
     * A <code>Boolean</code> that specifies whether the profiling agent collects profiling data or not. Set to
     * <code>true</code> to enable profiling.
     * </p>
     * 
     * @param shouldProfile
     *        A <code>Boolean</code> that specifies whether the profiling agent collects profiling data or not. Set to
     *        <code>true</code> to enable profiling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentConfiguration withShouldProfile(Boolean shouldProfile) {
        setShouldProfile(shouldProfile);
        return this;
    }

    /**
     * <p>
     * A <code>Boolean</code> that specifies whether the profiling agent collects profiling data or not. Set to
     * <code>true</code> to enable profiling.
     * </p>
     * 
     * @return A <code>Boolean</code> that specifies whether the profiling agent collects profiling data or not. Set to
     *         <code>true</code> to enable profiling.
     */

    public Boolean isShouldProfile() {
        return this.shouldProfile;
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
        if (getAgentParameters() != null)
            sb.append("AgentParameters: ").append(getAgentParameters()).append(",");
        if (getPeriodInSeconds() != null)
            sb.append("PeriodInSeconds: ").append(getPeriodInSeconds()).append(",");
        if (getShouldProfile() != null)
            sb.append("ShouldProfile: ").append(getShouldProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentConfiguration == false)
            return false;
        AgentConfiguration other = (AgentConfiguration) obj;
        if (other.getAgentParameters() == null ^ this.getAgentParameters() == null)
            return false;
        if (other.getAgentParameters() != null && other.getAgentParameters().equals(this.getAgentParameters()) == false)
            return false;
        if (other.getPeriodInSeconds() == null ^ this.getPeriodInSeconds() == null)
            return false;
        if (other.getPeriodInSeconds() != null && other.getPeriodInSeconds().equals(this.getPeriodInSeconds()) == false)
            return false;
        if (other.getShouldProfile() == null ^ this.getShouldProfile() == null)
            return false;
        if (other.getShouldProfile() != null && other.getShouldProfile().equals(this.getShouldProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentParameters() == null) ? 0 : getAgentParameters().hashCode());
        hashCode = prime * hashCode + ((getPeriodInSeconds() == null) ? 0 : getPeriodInSeconds().hashCode());
        hashCode = prime * hashCode + ((getShouldProfile() == null) ? 0 : getShouldProfile().hashCode());
        return hashCode;
    }

    @Override
    public AgentConfiguration clone() {
        try {
            return (AgentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.AgentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
