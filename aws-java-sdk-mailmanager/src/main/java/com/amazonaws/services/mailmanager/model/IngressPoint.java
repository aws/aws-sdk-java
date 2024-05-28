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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure of an ingress endpoint resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/IngressPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngressPoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The DNS A Record that identifies your ingress endpoint. Configure your DNS Mail Exchange (MX) record with this
     * value to route emails to Mail Manager.
     * </p>
     */
    private String aRecord;
    /**
     * <p>
     * The identifier of the ingress endpoint resource.
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
     * The status of the ingress endpoint resource.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of ingress endpoint resource.
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

    public IngressPoint withARecord(String aRecord) {
        setARecord(aRecord);
        return this;
    }

    /**
     * <p>
     * The identifier of the ingress endpoint resource.
     * </p>
     * 
     * @param ingressPointId
     *        The identifier of the ingress endpoint resource.
     */

    public void setIngressPointId(String ingressPointId) {
        this.ingressPointId = ingressPointId;
    }

    /**
     * <p>
     * The identifier of the ingress endpoint resource.
     * </p>
     * 
     * @return The identifier of the ingress endpoint resource.
     */

    public String getIngressPointId() {
        return this.ingressPointId;
    }

    /**
     * <p>
     * The identifier of the ingress endpoint resource.
     * </p>
     * 
     * @param ingressPointId
     *        The identifier of the ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngressPoint withIngressPointId(String ingressPointId) {
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

    public IngressPoint withIngressPointName(String ingressPointName) {
        setIngressPointName(ingressPointName);
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

    public IngressPoint withStatus(String status) {
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

    public IngressPoint withStatus(IngressPointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of ingress endpoint resource.
     * </p>
     * 
     * @param type
     *        The type of ingress endpoint resource.
     * @see IngressPointType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of ingress endpoint resource.
     * </p>
     * 
     * @return The type of ingress endpoint resource.
     * @see IngressPointType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of ingress endpoint resource.
     * </p>
     * 
     * @param type
     *        The type of ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressPointType
     */

    public IngressPoint withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of ingress endpoint resource.
     * </p>
     * 
     * @param type
     *        The type of ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressPointType
     */

    public IngressPoint withType(IngressPointType type) {
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
        if (getIngressPointId() != null)
            sb.append("IngressPointId: ").append(getIngressPointId()).append(",");
        if (getIngressPointName() != null)
            sb.append("IngressPointName: ").append(getIngressPointName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof IngressPoint == false)
            return false;
        IngressPoint other = (IngressPoint) obj;
        if (other.getARecord() == null ^ this.getARecord() == null)
            return false;
        if (other.getARecord() != null && other.getARecord().equals(this.getARecord()) == false)
            return false;
        if (other.getIngressPointId() == null ^ this.getIngressPointId() == null)
            return false;
        if (other.getIngressPointId() != null && other.getIngressPointId().equals(this.getIngressPointId()) == false)
            return false;
        if (other.getIngressPointName() == null ^ this.getIngressPointName() == null)
            return false;
        if (other.getIngressPointName() != null && other.getIngressPointName().equals(this.getIngressPointName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getIngressPointId() == null) ? 0 : getIngressPointId().hashCode());
        hashCode = prime * hashCode + ((getIngressPointName() == null) ? 0 : getIngressPointName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public IngressPoint clone() {
        try {
            return (IngressPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.IngressPointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
