/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the PagerDuty incident associated with an incident created by an Incident Manager response plan.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/PagerDutyIncidentDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PagerDutyIncidentDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether to resolve the PagerDuty incident when you resolve the associated Incident Manager incident.
     * </p>
     */
    private Boolean autoResolve;
    /**
     * <p>
     * The ID of the incident associated with the PagerDuty service for the response plan.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General Access
     * REST API Key or User Token REST API Key, and other user credentials.
     * </p>
     */
    private String secretId;

    /**
     * <p>
     * Indicates whether to resolve the PagerDuty incident when you resolve the associated Incident Manager incident.
     * </p>
     * 
     * @param autoResolve
     *        Indicates whether to resolve the PagerDuty incident when you resolve the associated Incident Manager
     *        incident.
     */

    public void setAutoResolve(Boolean autoResolve) {
        this.autoResolve = autoResolve;
    }

    /**
     * <p>
     * Indicates whether to resolve the PagerDuty incident when you resolve the associated Incident Manager incident.
     * </p>
     * 
     * @return Indicates whether to resolve the PagerDuty incident when you resolve the associated Incident Manager
     *         incident.
     */

    public Boolean getAutoResolve() {
        return this.autoResolve;
    }

    /**
     * <p>
     * Indicates whether to resolve the PagerDuty incident when you resolve the associated Incident Manager incident.
     * </p>
     * 
     * @param autoResolve
     *        Indicates whether to resolve the PagerDuty incident when you resolve the associated Incident Manager
     *        incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PagerDutyIncidentDetail withAutoResolve(Boolean autoResolve) {
        setAutoResolve(autoResolve);
        return this;
    }

    /**
     * <p>
     * Indicates whether to resolve the PagerDuty incident when you resolve the associated Incident Manager incident.
     * </p>
     * 
     * @return Indicates whether to resolve the PagerDuty incident when you resolve the associated Incident Manager
     *         incident.
     */

    public Boolean isAutoResolve() {
        return this.autoResolve;
    }

    /**
     * <p>
     * The ID of the incident associated with the PagerDuty service for the response plan.
     * </p>
     * 
     * @param id
     *        The ID of the incident associated with the PagerDuty service for the response plan.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the incident associated with the PagerDuty service for the response plan.
     * </p>
     * 
     * @return The ID of the incident associated with the PagerDuty service for the response plan.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the incident associated with the PagerDuty service for the response plan.
     * </p>
     * 
     * @param id
     *        The ID of the incident associated with the PagerDuty service for the response plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PagerDutyIncidentDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General Access
     * REST API Key or User Token REST API Key, and other user credentials.
     * </p>
     * 
     * @param secretId
     *        The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General
     *        Access REST API Key or User Token REST API Key, and other user credentials.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General Access
     * REST API Key or User Token REST API Key, and other user credentials.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General
     *         Access REST API Key or User Token REST API Key, and other user credentials.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General Access
     * REST API Key or User Token REST API Key, and other user credentials.
     * </p>
     * 
     * @param secretId
     *        The ID of the Amazon Web Services Secrets Manager secret that stores your PagerDuty key, either a General
     *        Access REST API Key or User Token REST API Key, and other user credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PagerDutyIncidentDetail withSecretId(String secretId) {
        setSecretId(secretId);
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
        if (getAutoResolve() != null)
            sb.append("AutoResolve: ").append(getAutoResolve()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSecretId() != null)
            sb.append("SecretId: ").append(getSecretId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PagerDutyIncidentDetail == false)
            return false;
        PagerDutyIncidentDetail other = (PagerDutyIncidentDetail) obj;
        if (other.getAutoResolve() == null ^ this.getAutoResolve() == null)
            return false;
        if (other.getAutoResolve() != null && other.getAutoResolve().equals(this.getAutoResolve()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoResolve() == null) ? 0 : getAutoResolve().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        return hashCode;
    }

    @Override
    public PagerDutyIncidentDetail clone() {
        try {
            return (PagerDutyIncidentDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.PagerDutyIncidentDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
