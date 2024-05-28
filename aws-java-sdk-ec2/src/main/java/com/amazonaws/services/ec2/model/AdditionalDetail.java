/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an additional detail for a path analysis. For more information, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/reachability/additional-detail-codes.html">Reachability Analyzer
 * additional detail codes</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AdditionalDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdditionalDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The additional detail code.
     * </p>
     */
    private String additionalDetailType;
    /**
     * <p>
     * The path component.
     * </p>
     */
    private AnalysisComponent component;
    /**
     * <p>
     * The VPC endpoint service.
     * </p>
     */
    private AnalysisComponent vpcEndpointService;
    /**
     * <p>
     * The rule options.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RuleOption> ruleOptions;
    /**
     * <p>
     * The rule group type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RuleGroupTypePair> ruleGroupTypePairs;
    /**
     * <p>
     * The rule options.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RuleGroupRuleOptionsPair> ruleGroupRuleOptionsPairs;
    /**
     * <p>
     * The name of the VPC endpoint service.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The load balancers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AnalysisComponent> loadBalancers;

    /**
     * <p>
     * The additional detail code.
     * </p>
     * 
     * @param additionalDetailType
     *        The additional detail code.
     */

    public void setAdditionalDetailType(String additionalDetailType) {
        this.additionalDetailType = additionalDetailType;
    }

    /**
     * <p>
     * The additional detail code.
     * </p>
     * 
     * @return The additional detail code.
     */

    public String getAdditionalDetailType() {
        return this.additionalDetailType;
    }

    /**
     * <p>
     * The additional detail code.
     * </p>
     * 
     * @param additionalDetailType
     *        The additional detail code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalDetail withAdditionalDetailType(String additionalDetailType) {
        setAdditionalDetailType(additionalDetailType);
        return this;
    }

    /**
     * <p>
     * The path component.
     * </p>
     * 
     * @param component
     *        The path component.
     */

    public void setComponent(AnalysisComponent component) {
        this.component = component;
    }

    /**
     * <p>
     * The path component.
     * </p>
     * 
     * @return The path component.
     */

    public AnalysisComponent getComponent() {
        return this.component;
    }

    /**
     * <p>
     * The path component.
     * </p>
     * 
     * @param component
     *        The path component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalDetail withComponent(AnalysisComponent component) {
        setComponent(component);
        return this;
    }

    /**
     * <p>
     * The VPC endpoint service.
     * </p>
     * 
     * @param vpcEndpointService
     *        The VPC endpoint service.
     */

    public void setVpcEndpointService(AnalysisComponent vpcEndpointService) {
        this.vpcEndpointService = vpcEndpointService;
    }

    /**
     * <p>
     * The VPC endpoint service.
     * </p>
     * 
     * @return The VPC endpoint service.
     */

    public AnalysisComponent getVpcEndpointService() {
        return this.vpcEndpointService;
    }

    /**
     * <p>
     * The VPC endpoint service.
     * </p>
     * 
     * @param vpcEndpointService
     *        The VPC endpoint service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalDetail withVpcEndpointService(AnalysisComponent vpcEndpointService) {
        setVpcEndpointService(vpcEndpointService);
        return this;
    }

    /**
     * <p>
     * The rule options.
     * </p>
     * 
     * @return The rule options.
     */

    public java.util.List<RuleOption> getRuleOptions() {
        if (ruleOptions == null) {
            ruleOptions = new com.amazonaws.internal.SdkInternalList<RuleOption>();
        }
        return ruleOptions;
    }

    /**
     * <p>
     * The rule options.
     * </p>
     * 
     * @param ruleOptions
     *        The rule options.
     */

    public void setRuleOptions(java.util.Collection<RuleOption> ruleOptions) {
        if (ruleOptions == null) {
            this.ruleOptions = null;
            return;
        }

        this.ruleOptions = new com.amazonaws.internal.SdkInternalList<RuleOption>(ruleOptions);
    }

    /**
     * <p>
     * The rule options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleOptions(java.util.Collection)} or {@link #withRuleOptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ruleOptions
     *        The rule options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalDetail withRuleOptions(RuleOption... ruleOptions) {
        if (this.ruleOptions == null) {
            setRuleOptions(new com.amazonaws.internal.SdkInternalList<RuleOption>(ruleOptions.length));
        }
        for (RuleOption ele : ruleOptions) {
            this.ruleOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rule options.
     * </p>
     * 
     * @param ruleOptions
     *        The rule options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalDetail withRuleOptions(java.util.Collection<RuleOption> ruleOptions) {
        setRuleOptions(ruleOptions);
        return this;
    }

    /**
     * <p>
     * The rule group type.
     * </p>
     * 
     * @return The rule group type.
     */

    public java.util.List<RuleGroupTypePair> getRuleGroupTypePairs() {
        if (ruleGroupTypePairs == null) {
            ruleGroupTypePairs = new com.amazonaws.internal.SdkInternalList<RuleGroupTypePair>();
        }
        return ruleGroupTypePairs;
    }

    /**
     * <p>
     * The rule group type.
     * </p>
     * 
     * @param ruleGroupTypePairs
     *        The rule group type.
     */

    public void setRuleGroupTypePairs(java.util.Collection<RuleGroupTypePair> ruleGroupTypePairs) {
        if (ruleGroupTypePairs == null) {
            this.ruleGroupTypePairs = null;
            return;
        }

        this.ruleGroupTypePairs = new com.amazonaws.internal.SdkInternalList<RuleGroupTypePair>(ruleGroupTypePairs);
    }

    /**
     * <p>
     * The rule group type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleGroupTypePairs(java.util.Collection)} or {@link #withRuleGroupTypePairs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param ruleGroupTypePairs
     *        The rule group type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalDetail withRuleGroupTypePairs(RuleGroupTypePair... ruleGroupTypePairs) {
        if (this.ruleGroupTypePairs == null) {
            setRuleGroupTypePairs(new com.amazonaws.internal.SdkInternalList<RuleGroupTypePair>(ruleGroupTypePairs.length));
        }
        for (RuleGroupTypePair ele : ruleGroupTypePairs) {
            this.ruleGroupTypePairs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rule group type.
     * </p>
     * 
     * @param ruleGroupTypePairs
     *        The rule group type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalDetail withRuleGroupTypePairs(java.util.Collection<RuleGroupTypePair> ruleGroupTypePairs) {
        setRuleGroupTypePairs(ruleGroupTypePairs);
        return this;
    }

    /**
     * <p>
     * The rule options.
     * </p>
     * 
     * @return The rule options.
     */

    public java.util.List<RuleGroupRuleOptionsPair> getRuleGroupRuleOptionsPairs() {
        if (ruleGroupRuleOptionsPairs == null) {
            ruleGroupRuleOptionsPairs = new com.amazonaws.internal.SdkInternalList<RuleGroupRuleOptionsPair>();
        }
        return ruleGroupRuleOptionsPairs;
    }

    /**
     * <p>
     * The rule options.
     * </p>
     * 
     * @param ruleGroupRuleOptionsPairs
     *        The rule options.
     */

    public void setRuleGroupRuleOptionsPairs(java.util.Collection<RuleGroupRuleOptionsPair> ruleGroupRuleOptionsPairs) {
        if (ruleGroupRuleOptionsPairs == null) {
            this.ruleGroupRuleOptionsPairs = null;
            return;
        }

        this.ruleGroupRuleOptionsPairs = new com.amazonaws.internal.SdkInternalList<RuleGroupRuleOptionsPair>(ruleGroupRuleOptionsPairs);
    }

    /**
     * <p>
     * The rule options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleGroupRuleOptionsPairs(java.util.Collection)} or
     * {@link #withRuleGroupRuleOptionsPairs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param ruleGroupRuleOptionsPairs
     *        The rule options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalDetail withRuleGroupRuleOptionsPairs(RuleGroupRuleOptionsPair... ruleGroupRuleOptionsPairs) {
        if (this.ruleGroupRuleOptionsPairs == null) {
            setRuleGroupRuleOptionsPairs(new com.amazonaws.internal.SdkInternalList<RuleGroupRuleOptionsPair>(ruleGroupRuleOptionsPairs.length));
        }
        for (RuleGroupRuleOptionsPair ele : ruleGroupRuleOptionsPairs) {
            this.ruleGroupRuleOptionsPairs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rule options.
     * </p>
     * 
     * @param ruleGroupRuleOptionsPairs
     *        The rule options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalDetail withRuleGroupRuleOptionsPairs(java.util.Collection<RuleGroupRuleOptionsPair> ruleGroupRuleOptionsPairs) {
        setRuleGroupRuleOptionsPairs(ruleGroupRuleOptionsPairs);
        return this;
    }

    /**
     * <p>
     * The name of the VPC endpoint service.
     * </p>
     * 
     * @param serviceName
     *        The name of the VPC endpoint service.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the VPC endpoint service.
     * </p>
     * 
     * @return The name of the VPC endpoint service.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the VPC endpoint service.
     * </p>
     * 
     * @param serviceName
     *        The name of the VPC endpoint service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalDetail withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The load balancers.
     * </p>
     * 
     * @return The load balancers.
     */

    public java.util.List<AnalysisComponent> getLoadBalancers() {
        if (loadBalancers == null) {
            loadBalancers = new com.amazonaws.internal.SdkInternalList<AnalysisComponent>();
        }
        return loadBalancers;
    }

    /**
     * <p>
     * The load balancers.
     * </p>
     * 
     * @param loadBalancers
     *        The load balancers.
     */

    public void setLoadBalancers(java.util.Collection<AnalysisComponent> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
            return;
        }

        this.loadBalancers = new com.amazonaws.internal.SdkInternalList<AnalysisComponent>(loadBalancers);
    }

    /**
     * <p>
     * The load balancers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancers(java.util.Collection)} or {@link #withLoadBalancers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param loadBalancers
     *        The load balancers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalDetail withLoadBalancers(AnalysisComponent... loadBalancers) {
        if (this.loadBalancers == null) {
            setLoadBalancers(new com.amazonaws.internal.SdkInternalList<AnalysisComponent>(loadBalancers.length));
        }
        for (AnalysisComponent ele : loadBalancers) {
            this.loadBalancers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The load balancers.
     * </p>
     * 
     * @param loadBalancers
     *        The load balancers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalDetail withLoadBalancers(java.util.Collection<AnalysisComponent> loadBalancers) {
        setLoadBalancers(loadBalancers);
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
        if (getAdditionalDetailType() != null)
            sb.append("AdditionalDetailType: ").append(getAdditionalDetailType()).append(",");
        if (getComponent() != null)
            sb.append("Component: ").append(getComponent()).append(",");
        if (getVpcEndpointService() != null)
            sb.append("VpcEndpointService: ").append(getVpcEndpointService()).append(",");
        if (getRuleOptions() != null)
            sb.append("RuleOptions: ").append(getRuleOptions()).append(",");
        if (getRuleGroupTypePairs() != null)
            sb.append("RuleGroupTypePairs: ").append(getRuleGroupTypePairs()).append(",");
        if (getRuleGroupRuleOptionsPairs() != null)
            sb.append("RuleGroupRuleOptionsPairs: ").append(getRuleGroupRuleOptionsPairs()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getLoadBalancers() != null)
            sb.append("LoadBalancers: ").append(getLoadBalancers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdditionalDetail == false)
            return false;
        AdditionalDetail other = (AdditionalDetail) obj;
        if (other.getAdditionalDetailType() == null ^ this.getAdditionalDetailType() == null)
            return false;
        if (other.getAdditionalDetailType() != null && other.getAdditionalDetailType().equals(this.getAdditionalDetailType()) == false)
            return false;
        if (other.getComponent() == null ^ this.getComponent() == null)
            return false;
        if (other.getComponent() != null && other.getComponent().equals(this.getComponent()) == false)
            return false;
        if (other.getVpcEndpointService() == null ^ this.getVpcEndpointService() == null)
            return false;
        if (other.getVpcEndpointService() != null && other.getVpcEndpointService().equals(this.getVpcEndpointService()) == false)
            return false;
        if (other.getRuleOptions() == null ^ this.getRuleOptions() == null)
            return false;
        if (other.getRuleOptions() != null && other.getRuleOptions().equals(this.getRuleOptions()) == false)
            return false;
        if (other.getRuleGroupTypePairs() == null ^ this.getRuleGroupTypePairs() == null)
            return false;
        if (other.getRuleGroupTypePairs() != null && other.getRuleGroupTypePairs().equals(this.getRuleGroupTypePairs()) == false)
            return false;
        if (other.getRuleGroupRuleOptionsPairs() == null ^ this.getRuleGroupRuleOptionsPairs() == null)
            return false;
        if (other.getRuleGroupRuleOptionsPairs() != null && other.getRuleGroupRuleOptionsPairs().equals(this.getRuleGroupRuleOptionsPairs()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null)
            return false;
        if (other.getLoadBalancers() != null && other.getLoadBalancers().equals(this.getLoadBalancers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalDetailType() == null) ? 0 : getAdditionalDetailType().hashCode());
        hashCode = prime * hashCode + ((getComponent() == null) ? 0 : getComponent().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointService() == null) ? 0 : getVpcEndpointService().hashCode());
        hashCode = prime * hashCode + ((getRuleOptions() == null) ? 0 : getRuleOptions().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupTypePairs() == null) ? 0 : getRuleGroupTypePairs().hashCode());
        hashCode = prime * hashCode + ((getRuleGroupRuleOptionsPairs() == null) ? 0 : getRuleGroupRuleOptionsPairs().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode());
        return hashCode;
    }

    @Override
    public AdditionalDetail clone() {
        try {
            return (AdditionalDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
