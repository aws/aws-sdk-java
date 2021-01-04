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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/CreateProtectionGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProtectionGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the protection group. You use this to identify the protection group in lists and to manage the
     * protection group, for example to update, delete, or describe it.
     * </p>
     */
    private String protectionGroupId;
    /**
     * <p>
     * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sum - Use the total traffic across the group. This is a good choice for most cases. Examples include Elastic IP
     * addresses for EC2 instances that scale manually or automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * Mean - Use the average of the traffic across the group. This is a good choice for resources that share traffic
     * uniformly. Examples include accelerators and load balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Max - Use the highest traffic from each resource. This is useful for resources that don't share traffic and for
     * resources that share that traffic in a non-uniform way. Examples include CloudFront distributions and origin
     * resources for CloudFront distributions.
     * </p>
     * </li>
     * </ul>
     */
    private String aggregation;
    /**
     * <p>
     * The criteria to use to choose the protected resources for inclusion in the group. You can include all resources
     * that have protections, provide a list of resource Amazon Resource Names (ARNs), or include all resources of a
     * specified resource type.
     * </p>
     */
    private String pattern;
    /**
     * <p>
     * The resource type to include in the protection group. All protected resources of this type are included in the
     * protection group. Newly protected resources of this type are automatically added to the group. You must set this
     * when you set <code>Pattern</code> to <code>BY_RESOURCE_TYPE</code> and you must not set it for any other
     * <code>Pattern</code> setting.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you
     * set <code>Pattern</code> to <code>ARBITRARY</code> and you must not set it for any other <code>Pattern</code>
     * setting.
     * </p>
     */
    private java.util.List<String> members;

    /**
     * <p>
     * The name of the protection group. You use this to identify the protection group in lists and to manage the
     * protection group, for example to update, delete, or describe it.
     * </p>
     * 
     * @param protectionGroupId
     *        The name of the protection group. You use this to identify the protection group in lists and to manage the
     *        protection group, for example to update, delete, or describe it.
     */

    public void setProtectionGroupId(String protectionGroupId) {
        this.protectionGroupId = protectionGroupId;
    }

    /**
     * <p>
     * The name of the protection group. You use this to identify the protection group in lists and to manage the
     * protection group, for example to update, delete, or describe it.
     * </p>
     * 
     * @return The name of the protection group. You use this to identify the protection group in lists and to manage
     *         the protection group, for example to update, delete, or describe it.
     */

    public String getProtectionGroupId() {
        return this.protectionGroupId;
    }

    /**
     * <p>
     * The name of the protection group. You use this to identify the protection group in lists and to manage the
     * protection group, for example to update, delete, or describe it.
     * </p>
     * 
     * @param protectionGroupId
     *        The name of the protection group. You use this to identify the protection group in lists and to manage the
     *        protection group, for example to update, delete, or describe it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProtectionGroupRequest withProtectionGroupId(String protectionGroupId) {
        setProtectionGroupId(protectionGroupId);
        return this;
    }

    /**
     * <p>
     * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sum - Use the total traffic across the group. This is a good choice for most cases. Examples include Elastic IP
     * addresses for EC2 instances that scale manually or automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * Mean - Use the average of the traffic across the group. This is a good choice for resources that share traffic
     * uniformly. Examples include accelerators and load balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Max - Use the highest traffic from each resource. This is useful for resources that don't share traffic and for
     * resources that share that traffic in a non-uniform way. Examples include CloudFront distributions and origin
     * resources for CloudFront distributions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aggregation
     *        Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report
     *        events.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Sum - Use the total traffic across the group. This is a good choice for most cases. Examples include
     *        Elastic IP addresses for EC2 instances that scale manually or automatically.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Mean - Use the average of the traffic across the group. This is a good choice for resources that share
     *        traffic uniformly. Examples include accelerators and load balancers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Max - Use the highest traffic from each resource. This is useful for resources that don't share traffic
     *        and for resources that share that traffic in a non-uniform way. Examples include CloudFront distributions
     *        and origin resources for CloudFront distributions.
     *        </p>
     *        </li>
     * @see ProtectionGroupAggregation
     */

    public void setAggregation(String aggregation) {
        this.aggregation = aggregation;
    }

    /**
     * <p>
     * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sum - Use the total traffic across the group. This is a good choice for most cases. Examples include Elastic IP
     * addresses for EC2 instances that scale manually or automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * Mean - Use the average of the traffic across the group. This is a good choice for resources that share traffic
     * uniformly. Examples include accelerators and load balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Max - Use the highest traffic from each resource. This is useful for resources that don't share traffic and for
     * resources that share that traffic in a non-uniform way. Examples include CloudFront distributions and origin
     * resources for CloudFront distributions.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report
     *         events.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Sum - Use the total traffic across the group. This is a good choice for most cases. Examples include
     *         Elastic IP addresses for EC2 instances that scale manually or automatically.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Mean - Use the average of the traffic across the group. This is a good choice for resources that share
     *         traffic uniformly. Examples include accelerators and load balancers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Max - Use the highest traffic from each resource. This is useful for resources that don't share traffic
     *         and for resources that share that traffic in a non-uniform way. Examples include CloudFront distributions
     *         and origin resources for CloudFront distributions.
     *         </p>
     *         </li>
     * @see ProtectionGroupAggregation
     */

    public String getAggregation() {
        return this.aggregation;
    }

    /**
     * <p>
     * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sum - Use the total traffic across the group. This is a good choice for most cases. Examples include Elastic IP
     * addresses for EC2 instances that scale manually or automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * Mean - Use the average of the traffic across the group. This is a good choice for resources that share traffic
     * uniformly. Examples include accelerators and load balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Max - Use the highest traffic from each resource. This is useful for resources that don't share traffic and for
     * resources that share that traffic in a non-uniform way. Examples include CloudFront distributions and origin
     * resources for CloudFront distributions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aggregation
     *        Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report
     *        events.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Sum - Use the total traffic across the group. This is a good choice for most cases. Examples include
     *        Elastic IP addresses for EC2 instances that scale manually or automatically.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Mean - Use the average of the traffic across the group. This is a good choice for resources that share
     *        traffic uniformly. Examples include accelerators and load balancers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Max - Use the highest traffic from each resource. This is useful for resources that don't share traffic
     *        and for resources that share that traffic in a non-uniform way. Examples include CloudFront distributions
     *        and origin resources for CloudFront distributions.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionGroupAggregation
     */

    public CreateProtectionGroupRequest withAggregation(String aggregation) {
        setAggregation(aggregation);
        return this;
    }

    /**
     * <p>
     * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Sum - Use the total traffic across the group. This is a good choice for most cases. Examples include Elastic IP
     * addresses for EC2 instances that scale manually or automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * Mean - Use the average of the traffic across the group. This is a good choice for resources that share traffic
     * uniformly. Examples include accelerators and load balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Max - Use the highest traffic from each resource. This is useful for resources that don't share traffic and for
     * resources that share that traffic in a non-uniform way. Examples include CloudFront distributions and origin
     * resources for CloudFront distributions.
     * </p>
     * </li>
     * </ul>
     * 
     * @param aggregation
     *        Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report
     *        events.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Sum - Use the total traffic across the group. This is a good choice for most cases. Examples include
     *        Elastic IP addresses for EC2 instances that scale manually or automatically.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Mean - Use the average of the traffic across the group. This is a good choice for resources that share
     *        traffic uniformly. Examples include accelerators and load balancers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Max - Use the highest traffic from each resource. This is useful for resources that don't share traffic
     *        and for resources that share that traffic in a non-uniform way. Examples include CloudFront distributions
     *        and origin resources for CloudFront distributions.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionGroupAggregation
     */

    public CreateProtectionGroupRequest withAggregation(ProtectionGroupAggregation aggregation) {
        this.aggregation = aggregation.toString();
        return this;
    }

    /**
     * <p>
     * The criteria to use to choose the protected resources for inclusion in the group. You can include all resources
     * that have protections, provide a list of resource Amazon Resource Names (ARNs), or include all resources of a
     * specified resource type.
     * </p>
     * 
     * @param pattern
     *        The criteria to use to choose the protected resources for inclusion in the group. You can include all
     *        resources that have protections, provide a list of resource Amazon Resource Names (ARNs), or include all
     *        resources of a specified resource type.
     * @see ProtectionGroupPattern
     */

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * The criteria to use to choose the protected resources for inclusion in the group. You can include all resources
     * that have protections, provide a list of resource Amazon Resource Names (ARNs), or include all resources of a
     * specified resource type.
     * </p>
     * 
     * @return The criteria to use to choose the protected resources for inclusion in the group. You can include all
     *         resources that have protections, provide a list of resource Amazon Resource Names (ARNs), or include all
     *         resources of a specified resource type.
     * @see ProtectionGroupPattern
     */

    public String getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * The criteria to use to choose the protected resources for inclusion in the group. You can include all resources
     * that have protections, provide a list of resource Amazon Resource Names (ARNs), or include all resources of a
     * specified resource type.
     * </p>
     * 
     * @param pattern
     *        The criteria to use to choose the protected resources for inclusion in the group. You can include all
     *        resources that have protections, provide a list of resource Amazon Resource Names (ARNs), or include all
     *        resources of a specified resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionGroupPattern
     */

    public CreateProtectionGroupRequest withPattern(String pattern) {
        setPattern(pattern);
        return this;
    }

    /**
     * <p>
     * The criteria to use to choose the protected resources for inclusion in the group. You can include all resources
     * that have protections, provide a list of resource Amazon Resource Names (ARNs), or include all resources of a
     * specified resource type.
     * </p>
     * 
     * @param pattern
     *        The criteria to use to choose the protected resources for inclusion in the group. You can include all
     *        resources that have protections, provide a list of resource Amazon Resource Names (ARNs), or include all
     *        resources of a specified resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionGroupPattern
     */

    public CreateProtectionGroupRequest withPattern(ProtectionGroupPattern pattern) {
        this.pattern = pattern.toString();
        return this;
    }

    /**
     * <p>
     * The resource type to include in the protection group. All protected resources of this type are included in the
     * protection group. Newly protected resources of this type are automatically added to the group. You must set this
     * when you set <code>Pattern</code> to <code>BY_RESOURCE_TYPE</code> and you must not set it for any other
     * <code>Pattern</code> setting.
     * </p>
     * 
     * @param resourceType
     *        The resource type to include in the protection group. All protected resources of this type are included in
     *        the protection group. Newly protected resources of this type are automatically added to the group. You
     *        must set this when you set <code>Pattern</code> to <code>BY_RESOURCE_TYPE</code> and you must not set it
     *        for any other <code>Pattern</code> setting.
     * @see ProtectedResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type to include in the protection group. All protected resources of this type are included in the
     * protection group. Newly protected resources of this type are automatically added to the group. You must set this
     * when you set <code>Pattern</code> to <code>BY_RESOURCE_TYPE</code> and you must not set it for any other
     * <code>Pattern</code> setting.
     * </p>
     * 
     * @return The resource type to include in the protection group. All protected resources of this type are included
     *         in the protection group. Newly protected resources of this type are automatically added to the group. You
     *         must set this when you set <code>Pattern</code> to <code>BY_RESOURCE_TYPE</code> and you must not set it
     *         for any other <code>Pattern</code> setting.
     * @see ProtectedResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type to include in the protection group. All protected resources of this type are included in the
     * protection group. Newly protected resources of this type are automatically added to the group. You must set this
     * when you set <code>Pattern</code> to <code>BY_RESOURCE_TYPE</code> and you must not set it for any other
     * <code>Pattern</code> setting.
     * </p>
     * 
     * @param resourceType
     *        The resource type to include in the protection group. All protected resources of this type are included in
     *        the protection group. Newly protected resources of this type are automatically added to the group. You
     *        must set this when you set <code>Pattern</code> to <code>BY_RESOURCE_TYPE</code> and you must not set it
     *        for any other <code>Pattern</code> setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedResourceType
     */

    public CreateProtectionGroupRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type to include in the protection group. All protected resources of this type are included in the
     * protection group. Newly protected resources of this type are automatically added to the group. You must set this
     * when you set <code>Pattern</code> to <code>BY_RESOURCE_TYPE</code> and you must not set it for any other
     * <code>Pattern</code> setting.
     * </p>
     * 
     * @param resourceType
     *        The resource type to include in the protection group. All protected resources of this type are included in
     *        the protection group. Newly protected resources of this type are automatically added to the group. You
     *        must set this when you set <code>Pattern</code> to <code>BY_RESOURCE_TYPE</code> and you must not set it
     *        for any other <code>Pattern</code> setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedResourceType
     */

    public CreateProtectionGroupRequest withResourceType(ProtectedResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you
     * set <code>Pattern</code> to <code>ARBITRARY</code> and you must not set it for any other <code>Pattern</code>
     * setting.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this
     *         when you set <code>Pattern</code> to <code>ARBITRARY</code> and you must not set it for any other
     *         <code>Pattern</code> setting.
     */

    public java.util.List<String> getMembers() {
        return members;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you
     * set <code>Pattern</code> to <code>ARBITRARY</code> and you must not set it for any other <code>Pattern</code>
     * setting.
     * </p>
     * 
     * @param members
     *        The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this
     *        when you set <code>Pattern</code> to <code>ARBITRARY</code> and you must not set it for any other
     *        <code>Pattern</code> setting.
     */

    public void setMembers(java.util.Collection<String> members) {
        if (members == null) {
            this.members = null;
            return;
        }

        this.members = new java.util.ArrayList<String>(members);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you
     * set <code>Pattern</code> to <code>ARBITRARY</code> and you must not set it for any other <code>Pattern</code>
     * setting.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMembers(java.util.Collection)} or {@link #withMembers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param members
     *        The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this
     *        when you set <code>Pattern</code> to <code>ARBITRARY</code> and you must not set it for any other
     *        <code>Pattern</code> setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProtectionGroupRequest withMembers(String... members) {
        if (this.members == null) {
            setMembers(new java.util.ArrayList<String>(members.length));
        }
        for (String ele : members) {
            this.members.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you
     * set <code>Pattern</code> to <code>ARBITRARY</code> and you must not set it for any other <code>Pattern</code>
     * setting.
     * </p>
     * 
     * @param members
     *        The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this
     *        when you set <code>Pattern</code> to <code>ARBITRARY</code> and you must not set it for any other
     *        <code>Pattern</code> setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProtectionGroupRequest withMembers(java.util.Collection<String> members) {
        setMembers(members);
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
        if (getProtectionGroupId() != null)
            sb.append("ProtectionGroupId: ").append(getProtectionGroupId()).append(",");
        if (getAggregation() != null)
            sb.append("Aggregation: ").append(getAggregation()).append(",");
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getMembers() != null)
            sb.append("Members: ").append(getMembers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProtectionGroupRequest == false)
            return false;
        CreateProtectionGroupRequest other = (CreateProtectionGroupRequest) obj;
        if (other.getProtectionGroupId() == null ^ this.getProtectionGroupId() == null)
            return false;
        if (other.getProtectionGroupId() != null && other.getProtectionGroupId().equals(this.getProtectionGroupId()) == false)
            return false;
        if (other.getAggregation() == null ^ this.getAggregation() == null)
            return false;
        if (other.getAggregation() != null && other.getAggregation().equals(this.getAggregation()) == false)
            return false;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getMembers() == null ^ this.getMembers() == null)
            return false;
        if (other.getMembers() != null && other.getMembers().equals(this.getMembers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectionGroupId() == null) ? 0 : getProtectionGroupId().hashCode());
        hashCode = prime * hashCode + ((getAggregation() == null) ? 0 : getAggregation().hashCode());
        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getMembers() == null) ? 0 : getMembers().hashCode());
        return hashCode;
    }

    @Override
    public CreateProtectionGroupRequest clone() {
        return (CreateProtectionGroupRequest) super.clone();
    }

}
