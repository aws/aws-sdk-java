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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateIngressPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIngressPointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * If you choose an Authenticated ingress endpoint, you must configure either an SMTP password or a secret ARN.
     * </p>
     */
    private IngressPointConfiguration ingressPointConfiguration;
    /**
     * <p>
     * A user friendly name for an ingress endpoint resource.
     * </p>
     */
    private String ingressPointName;
    /**
     * <p>
     * The identifier of an existing rule set that you attach to an ingress endpoint resource.
     * </p>
     */
    private String ruleSetId;
    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The identifier of an existing traffic policy that you attach to an ingress endpoint resource.
     * </p>
     */
    private String trafficPolicyId;
    /**
     * <p>
     * The type of the ingress endpoint to create.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     * 
     * @return A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIngressPointRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * If you choose an Authenticated ingress endpoint, you must configure either an SMTP password or a secret ARN.
     * </p>
     * 
     * @param ingressPointConfiguration
     *        If you choose an Authenticated ingress endpoint, you must configure either an SMTP password or a secret
     *        ARN.
     */

    public void setIngressPointConfiguration(IngressPointConfiguration ingressPointConfiguration) {
        this.ingressPointConfiguration = ingressPointConfiguration;
    }

    /**
     * <p>
     * If you choose an Authenticated ingress endpoint, you must configure either an SMTP password or a secret ARN.
     * </p>
     * 
     * @return If you choose an Authenticated ingress endpoint, you must configure either an SMTP password or a secret
     *         ARN.
     */

    public IngressPointConfiguration getIngressPointConfiguration() {
        return this.ingressPointConfiguration;
    }

    /**
     * <p>
     * If you choose an Authenticated ingress endpoint, you must configure either an SMTP password or a secret ARN.
     * </p>
     * 
     * @param ingressPointConfiguration
     *        If you choose an Authenticated ingress endpoint, you must configure either an SMTP password or a secret
     *        ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIngressPointRequest withIngressPointConfiguration(IngressPointConfiguration ingressPointConfiguration) {
        setIngressPointConfiguration(ingressPointConfiguration);
        return this;
    }

    /**
     * <p>
     * A user friendly name for an ingress endpoint resource.
     * </p>
     * 
     * @param ingressPointName
     *        A user friendly name for an ingress endpoint resource.
     */

    public void setIngressPointName(String ingressPointName) {
        this.ingressPointName = ingressPointName;
    }

    /**
     * <p>
     * A user friendly name for an ingress endpoint resource.
     * </p>
     * 
     * @return A user friendly name for an ingress endpoint resource.
     */

    public String getIngressPointName() {
        return this.ingressPointName;
    }

    /**
     * <p>
     * A user friendly name for an ingress endpoint resource.
     * </p>
     * 
     * @param ingressPointName
     *        A user friendly name for an ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIngressPointRequest withIngressPointName(String ingressPointName) {
        setIngressPointName(ingressPointName);
        return this;
    }

    /**
     * <p>
     * The identifier of an existing rule set that you attach to an ingress endpoint resource.
     * </p>
     * 
     * @param ruleSetId
     *        The identifier of an existing rule set that you attach to an ingress endpoint resource.
     */

    public void setRuleSetId(String ruleSetId) {
        this.ruleSetId = ruleSetId;
    }

    /**
     * <p>
     * The identifier of an existing rule set that you attach to an ingress endpoint resource.
     * </p>
     * 
     * @return The identifier of an existing rule set that you attach to an ingress endpoint resource.
     */

    public String getRuleSetId() {
        return this.ruleSetId;
    }

    /**
     * <p>
     * The identifier of an existing rule set that you attach to an ingress endpoint resource.
     * </p>
     * 
     * @param ruleSetId
     *        The identifier of an existing rule set that you attach to an ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIngressPointRequest withRuleSetId(String ruleSetId) {
        setRuleSetId(ruleSetId);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for the resource. For example, { "tags":
     *         {"key1":"value1", "key2":"value2"} }.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for the resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for the resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIngressPointRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for the resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIngressPointRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The identifier of an existing traffic policy that you attach to an ingress endpoint resource.
     * </p>
     * 
     * @param trafficPolicyId
     *        The identifier of an existing traffic policy that you attach to an ingress endpoint resource.
     */

    public void setTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
    }

    /**
     * <p>
     * The identifier of an existing traffic policy that you attach to an ingress endpoint resource.
     * </p>
     * 
     * @return The identifier of an existing traffic policy that you attach to an ingress endpoint resource.
     */

    public String getTrafficPolicyId() {
        return this.trafficPolicyId;
    }

    /**
     * <p>
     * The identifier of an existing traffic policy that you attach to an ingress endpoint resource.
     * </p>
     * 
     * @param trafficPolicyId
     *        The identifier of an existing traffic policy that you attach to an ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIngressPointRequest withTrafficPolicyId(String trafficPolicyId) {
        setTrafficPolicyId(trafficPolicyId);
        return this;
    }

    /**
     * <p>
     * The type of the ingress endpoint to create.
     * </p>
     * 
     * @param type
     *        The type of the ingress endpoint to create.
     * @see IngressPointType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the ingress endpoint to create.
     * </p>
     * 
     * @return The type of the ingress endpoint to create.
     * @see IngressPointType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the ingress endpoint to create.
     * </p>
     * 
     * @param type
     *        The type of the ingress endpoint to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressPointType
     */

    public CreateIngressPointRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the ingress endpoint to create.
     * </p>
     * 
     * @param type
     *        The type of the ingress endpoint to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressPointType
     */

    public CreateIngressPointRequest withType(IngressPointType type) {
        this.type = type.toString();
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getIngressPointConfiguration() != null)
            sb.append("IngressPointConfiguration: ").append(getIngressPointConfiguration()).append(",");
        if (getIngressPointName() != null)
            sb.append("IngressPointName: ").append(getIngressPointName()).append(",");
        if (getRuleSetId() != null)
            sb.append("RuleSetId: ").append(getRuleSetId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTrafficPolicyId() != null)
            sb.append("TrafficPolicyId: ").append(getTrafficPolicyId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIngressPointRequest == false)
            return false;
        CreateIngressPointRequest other = (CreateIngressPointRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getIngressPointConfiguration() == null ^ this.getIngressPointConfiguration() == null)
            return false;
        if (other.getIngressPointConfiguration() != null && other.getIngressPointConfiguration().equals(this.getIngressPointConfiguration()) == false)
            return false;
        if (other.getIngressPointName() == null ^ this.getIngressPointName() == null)
            return false;
        if (other.getIngressPointName() != null && other.getIngressPointName().equals(this.getIngressPointName()) == false)
            return false;
        if (other.getRuleSetId() == null ^ this.getRuleSetId() == null)
            return false;
        if (other.getRuleSetId() != null && other.getRuleSetId().equals(this.getRuleSetId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTrafficPolicyId() == null ^ this.getTrafficPolicyId() == null)
            return false;
        if (other.getTrafficPolicyId() != null && other.getTrafficPolicyId().equals(this.getTrafficPolicyId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getIngressPointConfiguration() == null) ? 0 : getIngressPointConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIngressPointName() == null) ? 0 : getIngressPointName().hashCode());
        hashCode = prime * hashCode + ((getRuleSetId() == null) ? 0 : getRuleSetId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyId() == null) ? 0 : getTrafficPolicyId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateIngressPointRequest clone() {
        return (CreateIngressPointRequest) super.clone();
    }

}
