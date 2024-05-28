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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connector-specific profile properties required when using Salesforce Pardot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/PardotConnectorProfileProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PardotConnectorProfileProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location of the Salesforce Pardot resource.
     * </p>
     */
    private String instanceUrl;
    /**
     * <p>
     * Indicates whether the connector profile applies to a sandbox or production environment.
     * </p>
     */
    private Boolean isSandboxEnvironment;
    /**
     * <p>
     * The business unit id of Salesforce Pardot instance.
     * </p>
     */
    private String businessUnitId;

    /**
     * <p>
     * The location of the Salesforce Pardot resource.
     * </p>
     * 
     * @param instanceUrl
     *        The location of the Salesforce Pardot resource.
     */

    public void setInstanceUrl(String instanceUrl) {
        this.instanceUrl = instanceUrl;
    }

    /**
     * <p>
     * The location of the Salesforce Pardot resource.
     * </p>
     * 
     * @return The location of the Salesforce Pardot resource.
     */

    public String getInstanceUrl() {
        return this.instanceUrl;
    }

    /**
     * <p>
     * The location of the Salesforce Pardot resource.
     * </p>
     * 
     * @param instanceUrl
     *        The location of the Salesforce Pardot resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PardotConnectorProfileProperties withInstanceUrl(String instanceUrl) {
        setInstanceUrl(instanceUrl);
        return this;
    }

    /**
     * <p>
     * Indicates whether the connector profile applies to a sandbox or production environment.
     * </p>
     * 
     * @param isSandboxEnvironment
     *        Indicates whether the connector profile applies to a sandbox or production environment.
     */

    public void setIsSandboxEnvironment(Boolean isSandboxEnvironment) {
        this.isSandboxEnvironment = isSandboxEnvironment;
    }

    /**
     * <p>
     * Indicates whether the connector profile applies to a sandbox or production environment.
     * </p>
     * 
     * @return Indicates whether the connector profile applies to a sandbox or production environment.
     */

    public Boolean getIsSandboxEnvironment() {
        return this.isSandboxEnvironment;
    }

    /**
     * <p>
     * Indicates whether the connector profile applies to a sandbox or production environment.
     * </p>
     * 
     * @param isSandboxEnvironment
     *        Indicates whether the connector profile applies to a sandbox or production environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PardotConnectorProfileProperties withIsSandboxEnvironment(Boolean isSandboxEnvironment) {
        setIsSandboxEnvironment(isSandboxEnvironment);
        return this;
    }

    /**
     * <p>
     * Indicates whether the connector profile applies to a sandbox or production environment.
     * </p>
     * 
     * @return Indicates whether the connector profile applies to a sandbox or production environment.
     */

    public Boolean isSandboxEnvironment() {
        return this.isSandboxEnvironment;
    }

    /**
     * <p>
     * The business unit id of Salesforce Pardot instance.
     * </p>
     * 
     * @param businessUnitId
     *        The business unit id of Salesforce Pardot instance.
     */

    public void setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    /**
     * <p>
     * The business unit id of Salesforce Pardot instance.
     * </p>
     * 
     * @return The business unit id of Salesforce Pardot instance.
     */

    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    /**
     * <p>
     * The business unit id of Salesforce Pardot instance.
     * </p>
     * 
     * @param businessUnitId
     *        The business unit id of Salesforce Pardot instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PardotConnectorProfileProperties withBusinessUnitId(String businessUnitId) {
        setBusinessUnitId(businessUnitId);
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
        if (getInstanceUrl() != null)
            sb.append("InstanceUrl: ").append(getInstanceUrl()).append(",");
        if (getIsSandboxEnvironment() != null)
            sb.append("IsSandboxEnvironment: ").append(getIsSandboxEnvironment()).append(",");
        if (getBusinessUnitId() != null)
            sb.append("BusinessUnitId: ").append(getBusinessUnitId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PardotConnectorProfileProperties == false)
            return false;
        PardotConnectorProfileProperties other = (PardotConnectorProfileProperties) obj;
        if (other.getInstanceUrl() == null ^ this.getInstanceUrl() == null)
            return false;
        if (other.getInstanceUrl() != null && other.getInstanceUrl().equals(this.getInstanceUrl()) == false)
            return false;
        if (other.getIsSandboxEnvironment() == null ^ this.getIsSandboxEnvironment() == null)
            return false;
        if (other.getIsSandboxEnvironment() != null && other.getIsSandboxEnvironment().equals(this.getIsSandboxEnvironment()) == false)
            return false;
        if (other.getBusinessUnitId() == null ^ this.getBusinessUnitId() == null)
            return false;
        if (other.getBusinessUnitId() != null && other.getBusinessUnitId().equals(this.getBusinessUnitId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceUrl() == null) ? 0 : getInstanceUrl().hashCode());
        hashCode = prime * hashCode + ((getIsSandboxEnvironment() == null) ? 0 : getIsSandboxEnvironment().hashCode());
        hashCode = prime * hashCode + ((getBusinessUnitId() == null) ? 0 : getBusinessUnitId().hashCode());
        return hashCode;
    }

    @Override
    public PardotConnectorProfileProperties clone() {
        try {
            return (PardotConnectorProfileProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.PardotConnectorProfilePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
