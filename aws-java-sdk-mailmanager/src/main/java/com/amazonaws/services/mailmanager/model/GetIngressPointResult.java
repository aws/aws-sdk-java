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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetIngressPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIngressPointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The DNS A Record that identifies your ingress endpoint. Configure your DNS Mail Exchange (MX) record with this
     * value to route emails to Mail Manager.
     * </p>
     */
    private String aRecord;
    /**
     * <p>
     * The timestamp of when the ingress endpoint was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingress endpoint resource.
     * </p>
     */
    private String ingressPointArn;
    /**
     * <p>
     * The authentication configuration of the ingress endpoint resource.
     * </p>
     */
    private IngressPointAuthConfiguration ingressPointAuthConfiguration;
    /**
     * <p>
     * The identifier of an ingress endpoint resource.
     * </p>
     */
    private String ingressPointId;
    /**
     * <p>
     * A user friendly name for the ingress endpoint.
     * </p>
     */
    private String ingressPointName;
    /**
     * <p>
     * The timestamp of when the ingress endpoint was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;
    /**
     * <p>
     * The identifier of a rule set resource associated with the ingress endpoint.
     * </p>
     */
    private String ruleSetId;
    /**
     * <p>
     * The status of the ingress endpoint resource.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The identifier of the traffic policy resource associated with the ingress endpoint.
     * </p>
     */
    private String trafficPolicyId;
    /**
     * <p>
     * The type of ingress endpoint.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The DNS A Record that identifies your ingress endpoint. Configure your DNS Mail Exchange (MX) record with this
     * value to route emails to Mail Manager.
     * </p>
     * 
     * @param aRecord
     *        The DNS A Record that identifies your ingress endpoint. Configure your DNS Mail Exchange (MX) record with
     *        this value to route emails to Mail Manager.
     */

    public void setARecord(String aRecord) {
        this.aRecord = aRecord;
    }

    /**
     * <p>
     * The DNS A Record that identifies your ingress endpoint. Configure your DNS Mail Exchange (MX) record with this
     * value to route emails to Mail Manager.
     * </p>
     * 
     * @return The DNS A Record that identifies your ingress endpoint. Configure your DNS Mail Exchange (MX) record with
     *         this value to route emails to Mail Manager.
     */

    public String getARecord() {
        return this.aRecord;
    }

    /**
     * <p>
     * The DNS A Record that identifies your ingress endpoint. Configure your DNS Mail Exchange (MX) record with this
     * value to route emails to Mail Manager.
     * </p>
     * 
     * @param aRecord
     *        The DNS A Record that identifies your ingress endpoint. Configure your DNS Mail Exchange (MX) record with
     *        this value to route emails to Mail Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIngressPointResult withARecord(String aRecord) {
        setARecord(aRecord);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the ingress endpoint was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp of when the ingress endpoint was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the ingress endpoint was created.
     * </p>
     * 
     * @return The timestamp of when the ingress endpoint was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the ingress endpoint was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp of when the ingress endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIngressPointResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingress endpoint resource.
     * </p>
     * 
     * @param ingressPointArn
     *        The Amazon Resource Name (ARN) of the ingress endpoint resource.
     */

    public void setIngressPointArn(String ingressPointArn) {
        this.ingressPointArn = ingressPointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingress endpoint resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the ingress endpoint resource.
     */

    public String getIngressPointArn() {
        return this.ingressPointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ingress endpoint resource.
     * </p>
     * 
     * @param ingressPointArn
     *        The Amazon Resource Name (ARN) of the ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIngressPointResult withIngressPointArn(String ingressPointArn) {
        setIngressPointArn(ingressPointArn);
        return this;
    }

    /**
     * <p>
     * The authentication configuration of the ingress endpoint resource.
     * </p>
     * 
     * @param ingressPointAuthConfiguration
     *        The authentication configuration of the ingress endpoint resource.
     */

    public void setIngressPointAuthConfiguration(IngressPointAuthConfiguration ingressPointAuthConfiguration) {
        this.ingressPointAuthConfiguration = ingressPointAuthConfiguration;
    }

    /**
     * <p>
     * The authentication configuration of the ingress endpoint resource.
     * </p>
     * 
     * @return The authentication configuration of the ingress endpoint resource.
     */

    public IngressPointAuthConfiguration getIngressPointAuthConfiguration() {
        return this.ingressPointAuthConfiguration;
    }

    /**
     * <p>
     * The authentication configuration of the ingress endpoint resource.
     * </p>
     * 
     * @param ingressPointAuthConfiguration
     *        The authentication configuration of the ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIngressPointResult withIngressPointAuthConfiguration(IngressPointAuthConfiguration ingressPointAuthConfiguration) {
        setIngressPointAuthConfiguration(ingressPointAuthConfiguration);
        return this;
    }

    /**
     * <p>
     * The identifier of an ingress endpoint resource.
     * </p>
     * 
     * @param ingressPointId
     *        The identifier of an ingress endpoint resource.
     */

    public void setIngressPointId(String ingressPointId) {
        this.ingressPointId = ingressPointId;
    }

    /**
     * <p>
     * The identifier of an ingress endpoint resource.
     * </p>
     * 
     * @return The identifier of an ingress endpoint resource.
     */

    public String getIngressPointId() {
        return this.ingressPointId;
    }

    /**
     * <p>
     * The identifier of an ingress endpoint resource.
     * </p>
     * 
     * @param ingressPointId
     *        The identifier of an ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIngressPointResult withIngressPointId(String ingressPointId) {
        setIngressPointId(ingressPointId);
        return this;
    }

    /**
     * <p>
     * A user friendly name for the ingress endpoint.
     * </p>
     * 
     * @param ingressPointName
     *        A user friendly name for the ingress endpoint.
     */

    public void setIngressPointName(String ingressPointName) {
        this.ingressPointName = ingressPointName;
    }

    /**
     * <p>
     * A user friendly name for the ingress endpoint.
     * </p>
     * 
     * @return A user friendly name for the ingress endpoint.
     */

    public String getIngressPointName() {
        return this.ingressPointName;
    }

    /**
     * <p>
     * A user friendly name for the ingress endpoint.
     * </p>
     * 
     * @param ingressPointName
     *        A user friendly name for the ingress endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIngressPointResult withIngressPointName(String ingressPointName) {
        setIngressPointName(ingressPointName);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the ingress endpoint was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The timestamp of when the ingress endpoint was last updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the ingress endpoint was last updated.
     * </p>
     * 
     * @return The timestamp of when the ingress endpoint was last updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the ingress endpoint was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The timestamp of when the ingress endpoint was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIngressPointResult withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The identifier of a rule set resource associated with the ingress endpoint.
     * </p>
     * 
     * @param ruleSetId
     *        The identifier of a rule set resource associated with the ingress endpoint.
     */

    public void setRuleSetId(String ruleSetId) {
        this.ruleSetId = ruleSetId;
    }

    /**
     * <p>
     * The identifier of a rule set resource associated with the ingress endpoint.
     * </p>
     * 
     * @return The identifier of a rule set resource associated with the ingress endpoint.
     */

    public String getRuleSetId() {
        return this.ruleSetId;
    }

    /**
     * <p>
     * The identifier of a rule set resource associated with the ingress endpoint.
     * </p>
     * 
     * @param ruleSetId
     *        The identifier of a rule set resource associated with the ingress endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIngressPointResult withRuleSetId(String ruleSetId) {
        setRuleSetId(ruleSetId);
        return this;
    }

    /**
     * <p>
     * The status of the ingress endpoint resource.
     * </p>
     * 
     * @param status
     *        The status of the ingress endpoint resource.
     * @see IngressPointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the ingress endpoint resource.
     * </p>
     * 
     * @return The status of the ingress endpoint resource.
     * @see IngressPointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the ingress endpoint resource.
     * </p>
     * 
     * @param status
     *        The status of the ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressPointStatus
     */

    public GetIngressPointResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the ingress endpoint resource.
     * </p>
     * 
     * @param status
     *        The status of the ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressPointStatus
     */

    public GetIngressPointResult withStatus(IngressPointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the traffic policy resource associated with the ingress endpoint.
     * </p>
     * 
     * @param trafficPolicyId
     *        The identifier of the traffic policy resource associated with the ingress endpoint.
     */

    public void setTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
    }

    /**
     * <p>
     * The identifier of the traffic policy resource associated with the ingress endpoint.
     * </p>
     * 
     * @return The identifier of the traffic policy resource associated with the ingress endpoint.
     */

    public String getTrafficPolicyId() {
        return this.trafficPolicyId;
    }

    /**
     * <p>
     * The identifier of the traffic policy resource associated with the ingress endpoint.
     * </p>
     * 
     * @param trafficPolicyId
     *        The identifier of the traffic policy resource associated with the ingress endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIngressPointResult withTrafficPolicyId(String trafficPolicyId) {
        setTrafficPolicyId(trafficPolicyId);
        return this;
    }

    /**
     * <p>
     * The type of ingress endpoint.
     * </p>
     * 
     * @param type
     *        The type of ingress endpoint.
     * @see IngressPointType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of ingress endpoint.
     * </p>
     * 
     * @return The type of ingress endpoint.
     * @see IngressPointType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of ingress endpoint.
     * </p>
     * 
     * @param type
     *        The type of ingress endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressPointType
     */

    public GetIngressPointResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of ingress endpoint.
     * </p>
     * 
     * @param type
     *        The type of ingress endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressPointType
     */

    public GetIngressPointResult withType(IngressPointType type) {
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
        if (getARecord() != null)
            sb.append("ARecord: ").append(getARecord()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getIngressPointArn() != null)
            sb.append("IngressPointArn: ").append(getIngressPointArn()).append(",");
        if (getIngressPointAuthConfiguration() != null)
            sb.append("IngressPointAuthConfiguration: ").append(getIngressPointAuthConfiguration()).append(",");
        if (getIngressPointId() != null)
            sb.append("IngressPointId: ").append(getIngressPointId()).append(",");
        if (getIngressPointName() != null)
            sb.append("IngressPointName: ").append(getIngressPointName()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getRuleSetId() != null)
            sb.append("RuleSetId: ").append(getRuleSetId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof GetIngressPointResult == false)
            return false;
        GetIngressPointResult other = (GetIngressPointResult) obj;
        if (other.getARecord() == null ^ this.getARecord() == null)
            return false;
        if (other.getARecord() != null && other.getARecord().equals(this.getARecord()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getIngressPointArn() == null ^ this.getIngressPointArn() == null)
            return false;
        if (other.getIngressPointArn() != null && other.getIngressPointArn().equals(this.getIngressPointArn()) == false)
            return false;
        if (other.getIngressPointAuthConfiguration() == null ^ this.getIngressPointAuthConfiguration() == null)
            return false;
        if (other.getIngressPointAuthConfiguration() != null
                && other.getIngressPointAuthConfiguration().equals(this.getIngressPointAuthConfiguration()) == false)
            return false;
        if (other.getIngressPointId() == null ^ this.getIngressPointId() == null)
            return false;
        if (other.getIngressPointId() != null && other.getIngressPointId().equals(this.getIngressPointId()) == false)
            return false;
        if (other.getIngressPointName() == null ^ this.getIngressPointName() == null)
            return false;
        if (other.getIngressPointName() != null && other.getIngressPointName().equals(this.getIngressPointName()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getRuleSetId() == null ^ this.getRuleSetId() == null)
            return false;
        if (other.getRuleSetId() != null && other.getRuleSetId().equals(this.getRuleSetId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getARecord() == null) ? 0 : getARecord().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getIngressPointArn() == null) ? 0 : getIngressPointArn().hashCode());
        hashCode = prime * hashCode + ((getIngressPointAuthConfiguration() == null) ? 0 : getIngressPointAuthConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIngressPointId() == null) ? 0 : getIngressPointId().hashCode());
        hashCode = prime * hashCode + ((getIngressPointName() == null) ? 0 : getIngressPointName().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getRuleSetId() == null) ? 0 : getRuleSetId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyId() == null) ? 0 : getTrafficPolicyId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public GetIngressPointResult clone() {
        try {
            return (GetIngressPointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
