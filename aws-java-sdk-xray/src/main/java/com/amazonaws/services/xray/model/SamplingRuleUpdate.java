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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A document specifying changes to a sampling rule's configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/SamplingRuleUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SamplingRuleUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     */
    private String ruleARN;
    /**
     * <p>
     * Matches the ARN of the AWS resource on which the service runs.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * The priority of the sampling rule.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     * </p>
     */
    private Double fixedRate;
    /**
     * <p>
     * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is
     * not used directly by services, but applies to all services using the rule collectively.
     * </p>
     */
    private Integer reservoirSize;
    /**
     * <p>
     * Matches the hostname from a request URL.
     * </p>
     */
    private String host;
    /**
     * <p>
     * Matches the <code>name</code> that the service uses to identify itself in segments.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * Matches the <code>origin</code> that the service uses to identify its type in segments.
     * </p>
     */
    private String serviceType;
    /**
     * <p>
     * Matches the HTTP method of a request.
     * </p>
     */
    private String hTTPMethod;
    /**
     * <p>
     * Matches the path from a request URL.
     * </p>
     */
    private String uRLPath;
    /**
     * <p>
     * Matches attributes derived from the request.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     * 
     * @param ruleName
     *        The name of the sampling rule. Specify a rule by either name or ARN, but not both.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     * 
     * @return The name of the sampling rule. Specify a rule by either name or ARN, but not both.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     * 
     * @param ruleName
     *        The name of the sampling rule. Specify a rule by either name or ARN, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleUpdate withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     * 
     * @param ruleARN
     *        The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
     */

    public void setRuleARN(String ruleARN) {
        this.ruleARN = ruleARN;
    }

    /**
     * <p>
     * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     * 
     * @return The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
     */

    public String getRuleARN() {
        return this.ruleARN;
    }

    /**
     * <p>
     * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
     * </p>
     * 
     * @param ruleARN
     *        The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleUpdate withRuleARN(String ruleARN) {
        setRuleARN(ruleARN);
        return this;
    }

    /**
     * <p>
     * Matches the ARN of the AWS resource on which the service runs.
     * </p>
     * 
     * @param resourceARN
     *        Matches the ARN of the AWS resource on which the service runs.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * Matches the ARN of the AWS resource on which the service runs.
     * </p>
     * 
     * @return Matches the ARN of the AWS resource on which the service runs.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * Matches the ARN of the AWS resource on which the service runs.
     * </p>
     * 
     * @param resourceARN
     *        Matches the ARN of the AWS resource on which the service runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleUpdate withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * The priority of the sampling rule.
     * </p>
     * 
     * @param priority
     *        The priority of the sampling rule.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the sampling rule.
     * </p>
     * 
     * @return The priority of the sampling rule.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority of the sampling rule.
     * </p>
     * 
     * @param priority
     *        The priority of the sampling rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleUpdate withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     * </p>
     * 
     * @param fixedRate
     *        The percentage of matching requests to instrument, after the reservoir is exhausted.
     */

    public void setFixedRate(Double fixedRate) {
        this.fixedRate = fixedRate;
    }

    /**
     * <p>
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     * </p>
     * 
     * @return The percentage of matching requests to instrument, after the reservoir is exhausted.
     */

    public Double getFixedRate() {
        return this.fixedRate;
    }

    /**
     * <p>
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     * </p>
     * 
     * @param fixedRate
     *        The percentage of matching requests to instrument, after the reservoir is exhausted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleUpdate withFixedRate(Double fixedRate) {
        setFixedRate(fixedRate);
        return this;
    }

    /**
     * <p>
     * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is
     * not used directly by services, but applies to all services using the rule collectively.
     * </p>
     * 
     * @param reservoirSize
     *        A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The
     *        reservoir is not used directly by services, but applies to all services using the rule collectively.
     */

    public void setReservoirSize(Integer reservoirSize) {
        this.reservoirSize = reservoirSize;
    }

    /**
     * <p>
     * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is
     * not used directly by services, but applies to all services using the rule collectively.
     * </p>
     * 
     * @return A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The
     *         reservoir is not used directly by services, but applies to all services using the rule collectively.
     */

    public Integer getReservoirSize() {
        return this.reservoirSize;
    }

    /**
     * <p>
     * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is
     * not used directly by services, but applies to all services using the rule collectively.
     * </p>
     * 
     * @param reservoirSize
     *        A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The
     *        reservoir is not used directly by services, but applies to all services using the rule collectively.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleUpdate withReservoirSize(Integer reservoirSize) {
        setReservoirSize(reservoirSize);
        return this;
    }

    /**
     * <p>
     * Matches the hostname from a request URL.
     * </p>
     * 
     * @param host
     *        Matches the hostname from a request URL.
     */

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>
     * Matches the hostname from a request URL.
     * </p>
     * 
     * @return Matches the hostname from a request URL.
     */

    public String getHost() {
        return this.host;
    }

    /**
     * <p>
     * Matches the hostname from a request URL.
     * </p>
     * 
     * @param host
     *        Matches the hostname from a request URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleUpdate withHost(String host) {
        setHost(host);
        return this;
    }

    /**
     * <p>
     * Matches the <code>name</code> that the service uses to identify itself in segments.
     * </p>
     * 
     * @param serviceName
     *        Matches the <code>name</code> that the service uses to identify itself in segments.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * Matches the <code>name</code> that the service uses to identify itself in segments.
     * </p>
     * 
     * @return Matches the <code>name</code> that the service uses to identify itself in segments.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * Matches the <code>name</code> that the service uses to identify itself in segments.
     * </p>
     * 
     * @param serviceName
     *        Matches the <code>name</code> that the service uses to identify itself in segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleUpdate withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * Matches the <code>origin</code> that the service uses to identify its type in segments.
     * </p>
     * 
     * @param serviceType
     *        Matches the <code>origin</code> that the service uses to identify its type in segments.
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * Matches the <code>origin</code> that the service uses to identify its type in segments.
     * </p>
     * 
     * @return Matches the <code>origin</code> that the service uses to identify its type in segments.
     */

    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * <p>
     * Matches the <code>origin</code> that the service uses to identify its type in segments.
     * </p>
     * 
     * @param serviceType
     *        Matches the <code>origin</code> that the service uses to identify its type in segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleUpdate withServiceType(String serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * Matches the HTTP method of a request.
     * </p>
     * 
     * @param hTTPMethod
     *        Matches the HTTP method of a request.
     */

    public void setHTTPMethod(String hTTPMethod) {
        this.hTTPMethod = hTTPMethod;
    }

    /**
     * <p>
     * Matches the HTTP method of a request.
     * </p>
     * 
     * @return Matches the HTTP method of a request.
     */

    public String getHTTPMethod() {
        return this.hTTPMethod;
    }

    /**
     * <p>
     * Matches the HTTP method of a request.
     * </p>
     * 
     * @param hTTPMethod
     *        Matches the HTTP method of a request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleUpdate withHTTPMethod(String hTTPMethod) {
        setHTTPMethod(hTTPMethod);
        return this;
    }

    /**
     * <p>
     * Matches the path from a request URL.
     * </p>
     * 
     * @param uRLPath
     *        Matches the path from a request URL.
     */

    public void setURLPath(String uRLPath) {
        this.uRLPath = uRLPath;
    }

    /**
     * <p>
     * Matches the path from a request URL.
     * </p>
     * 
     * @return Matches the path from a request URL.
     */

    public String getURLPath() {
        return this.uRLPath;
    }

    /**
     * <p>
     * Matches the path from a request URL.
     * </p>
     * 
     * @param uRLPath
     *        Matches the path from a request URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleUpdate withURLPath(String uRLPath) {
        setURLPath(uRLPath);
        return this;
    }

    /**
     * <p>
     * Matches attributes derived from the request.
     * </p>
     * 
     * @return Matches attributes derived from the request.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * Matches attributes derived from the request.
     * </p>
     * 
     * @param attributes
     *        Matches attributes derived from the request.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Matches attributes derived from the request.
     * </p>
     * 
     * @param attributes
     *        Matches attributes derived from the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleUpdate withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public SamplingRuleUpdate addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamplingRuleUpdate clearAttributesEntries() {
        this.attributes = null;
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
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getRuleARN() != null)
            sb.append("RuleARN: ").append(getRuleARN()).append(",");
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getFixedRate() != null)
            sb.append("FixedRate: ").append(getFixedRate()).append(",");
        if (getReservoirSize() != null)
            sb.append("ReservoirSize: ").append(getReservoirSize()).append(",");
        if (getHost() != null)
            sb.append("Host: ").append(getHost()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType()).append(",");
        if (getHTTPMethod() != null)
            sb.append("HTTPMethod: ").append(getHTTPMethod()).append(",");
        if (getURLPath() != null)
            sb.append("URLPath: ").append(getURLPath()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SamplingRuleUpdate == false)
            return false;
        SamplingRuleUpdate other = (SamplingRuleUpdate) obj;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getRuleARN() == null ^ this.getRuleARN() == null)
            return false;
        if (other.getRuleARN() != null && other.getRuleARN().equals(this.getRuleARN()) == false)
            return false;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getFixedRate() == null ^ this.getFixedRate() == null)
            return false;
        if (other.getFixedRate() != null && other.getFixedRate().equals(this.getFixedRate()) == false)
            return false;
        if (other.getReservoirSize() == null ^ this.getReservoirSize() == null)
            return false;
        if (other.getReservoirSize() != null && other.getReservoirSize().equals(this.getReservoirSize()) == false)
            return false;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getHTTPMethod() == null ^ this.getHTTPMethod() == null)
            return false;
        if (other.getHTTPMethod() != null && other.getHTTPMethod().equals(this.getHTTPMethod()) == false)
            return false;
        if (other.getURLPath() == null ^ this.getURLPath() == null)
            return false;
        if (other.getURLPath() != null && other.getURLPath().equals(this.getURLPath()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getRuleARN() == null) ? 0 : getRuleARN().hashCode());
        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getFixedRate() == null) ? 0 : getFixedRate().hashCode());
        hashCode = prime * hashCode + ((getReservoirSize() == null) ? 0 : getReservoirSize().hashCode());
        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getHTTPMethod() == null) ? 0 : getHTTPMethod().hashCode());
        hashCode = prime * hashCode + ((getURLPath() == null) ? 0 : getURLPath().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public SamplingRuleUpdate clone() {
        try {
            return (SamplingRuleUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.SamplingRuleUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
