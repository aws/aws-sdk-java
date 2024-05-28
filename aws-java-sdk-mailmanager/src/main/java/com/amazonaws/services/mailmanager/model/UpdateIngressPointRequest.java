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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateIngressPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIngressPointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If you choose an Authenticated ingress endpoint, you must configure either an SMTP password or a secret ARN.
     * </p>
     */
    private IngressPointConfiguration ingressPointConfiguration;
    /**
     * <p>
     * The identifier for the ingress endpoint you want to update.
     * </p>
     */
    private String ingressPointId;
    /**
     * <p>
     * A user friendly name for the ingress endpoint resource.
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
     * The update status of an ingress endpoint.
     * </p>
     */
    private String statusToUpdate;
    /**
     * <p>
     * The identifier of an existing traffic policy that you attach to an ingress endpoint resource.
     * </p>
     */
    private String trafficPolicyId;

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

    public UpdateIngressPointRequest withIngressPointConfiguration(IngressPointConfiguration ingressPointConfiguration) {
        setIngressPointConfiguration(ingressPointConfiguration);
        return this;
    }

    /**
     * <p>
     * The identifier for the ingress endpoint you want to update.
     * </p>
     * 
     * @param ingressPointId
     *        The identifier for the ingress endpoint you want to update.
     */

    public void setIngressPointId(String ingressPointId) {
        this.ingressPointId = ingressPointId;
    }

    /**
     * <p>
     * The identifier for the ingress endpoint you want to update.
     * </p>
     * 
     * @return The identifier for the ingress endpoint you want to update.
     */

    public String getIngressPointId() {
        return this.ingressPointId;
    }

    /**
     * <p>
     * The identifier for the ingress endpoint you want to update.
     * </p>
     * 
     * @param ingressPointId
     *        The identifier for the ingress endpoint you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIngressPointRequest withIngressPointId(String ingressPointId) {
        setIngressPointId(ingressPointId);
        return this;
    }

    /**
     * <p>
     * A user friendly name for the ingress endpoint resource.
     * </p>
     * 
     * @param ingressPointName
     *        A user friendly name for the ingress endpoint resource.
     */

    public void setIngressPointName(String ingressPointName) {
        this.ingressPointName = ingressPointName;
    }

    /**
     * <p>
     * A user friendly name for the ingress endpoint resource.
     * </p>
     * 
     * @return A user friendly name for the ingress endpoint resource.
     */

    public String getIngressPointName() {
        return this.ingressPointName;
    }

    /**
     * <p>
     * A user friendly name for the ingress endpoint resource.
     * </p>
     * 
     * @param ingressPointName
     *        A user friendly name for the ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIngressPointRequest withIngressPointName(String ingressPointName) {
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

    public UpdateIngressPointRequest withRuleSetId(String ruleSetId) {
        setRuleSetId(ruleSetId);
        return this;
    }

    /**
     * <p>
     * The update status of an ingress endpoint.
     * </p>
     * 
     * @param statusToUpdate
     *        The update status of an ingress endpoint.
     * @see IngressPointStatusToUpdate
     */

    public void setStatusToUpdate(String statusToUpdate) {
        this.statusToUpdate = statusToUpdate;
    }

    /**
     * <p>
     * The update status of an ingress endpoint.
     * </p>
     * 
     * @return The update status of an ingress endpoint.
     * @see IngressPointStatusToUpdate
     */

    public String getStatusToUpdate() {
        return this.statusToUpdate;
    }

    /**
     * <p>
     * The update status of an ingress endpoint.
     * </p>
     * 
     * @param statusToUpdate
     *        The update status of an ingress endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressPointStatusToUpdate
     */

    public UpdateIngressPointRequest withStatusToUpdate(String statusToUpdate) {
        setStatusToUpdate(statusToUpdate);
        return this;
    }

    /**
     * <p>
     * The update status of an ingress endpoint.
     * </p>
     * 
     * @param statusToUpdate
     *        The update status of an ingress endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressPointStatusToUpdate
     */

    public UpdateIngressPointRequest withStatusToUpdate(IngressPointStatusToUpdate statusToUpdate) {
        this.statusToUpdate = statusToUpdate.toString();
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

    public UpdateIngressPointRequest withTrafficPolicyId(String trafficPolicyId) {
        setTrafficPolicyId(trafficPolicyId);
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
        if (getIngressPointConfiguration() != null)
            sb.append("IngressPointConfiguration: ").append(getIngressPointConfiguration()).append(",");
        if (getIngressPointId() != null)
            sb.append("IngressPointId: ").append(getIngressPointId()).append(",");
        if (getIngressPointName() != null)
            sb.append("IngressPointName: ").append(getIngressPointName()).append(",");
        if (getRuleSetId() != null)
            sb.append("RuleSetId: ").append(getRuleSetId()).append(",");
        if (getStatusToUpdate() != null)
            sb.append("StatusToUpdate: ").append(getStatusToUpdate()).append(",");
        if (getTrafficPolicyId() != null)
            sb.append("TrafficPolicyId: ").append(getTrafficPolicyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIngressPointRequest == false)
            return false;
        UpdateIngressPointRequest other = (UpdateIngressPointRequest) obj;
        if (other.getIngressPointConfiguration() == null ^ this.getIngressPointConfiguration() == null)
            return false;
        if (other.getIngressPointConfiguration() != null && other.getIngressPointConfiguration().equals(this.getIngressPointConfiguration()) == false)
            return false;
        if (other.getIngressPointId() == null ^ this.getIngressPointId() == null)
            return false;
        if (other.getIngressPointId() != null && other.getIngressPointId().equals(this.getIngressPointId()) == false)
            return false;
        if (other.getIngressPointName() == null ^ this.getIngressPointName() == null)
            return false;
        if (other.getIngressPointName() != null && other.getIngressPointName().equals(this.getIngressPointName()) == false)
            return false;
        if (other.getRuleSetId() == null ^ this.getRuleSetId() == null)
            return false;
        if (other.getRuleSetId() != null && other.getRuleSetId().equals(this.getRuleSetId()) == false)
            return false;
        if (other.getStatusToUpdate() == null ^ this.getStatusToUpdate() == null)
            return false;
        if (other.getStatusToUpdate() != null && other.getStatusToUpdate().equals(this.getStatusToUpdate()) == false)
            return false;
        if (other.getTrafficPolicyId() == null ^ this.getTrafficPolicyId() == null)
            return false;
        if (other.getTrafficPolicyId() != null && other.getTrafficPolicyId().equals(this.getTrafficPolicyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIngressPointConfiguration() == null) ? 0 : getIngressPointConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIngressPointId() == null) ? 0 : getIngressPointId().hashCode());
        hashCode = prime * hashCode + ((getIngressPointName() == null) ? 0 : getIngressPointName().hashCode());
        hashCode = prime * hashCode + ((getRuleSetId() == null) ? 0 : getRuleSetId().hashCode());
        hashCode = prime * hashCode + ((getStatusToUpdate() == null) ? 0 : getStatusToUpdate().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyId() == null) ? 0 : getTrafficPolicyId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIngressPointRequest clone() {
        return (UpdateIngressPointRequest) super.clone();
    }

}
