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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure holding all <code>APPFLOW_INTEGRATION</code> specific workflow attributes.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/AppflowIntegrationWorkflowAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppflowIntegrationWorkflowAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the source connector type, such as Salesforce, ServiceNow, and Marketo. Indicates source of ingestion.
     * </p>
     */
    private String sourceConnectorType;
    /**
     * <p>
     * The name of the AppFlow connector profile used for ingestion.
     * </p>
     */
    private String connectorProfileName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources on your
     * behalf as part of workflow execution.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Specifies the source connector type, such as Salesforce, ServiceNow, and Marketo. Indicates source of ingestion.
     * </p>
     * 
     * @param sourceConnectorType
     *        Specifies the source connector type, such as Salesforce, ServiceNow, and Marketo. Indicates source of
     *        ingestion.
     * @see SourceConnectorType
     */

    public void setSourceConnectorType(String sourceConnectorType) {
        this.sourceConnectorType = sourceConnectorType;
    }

    /**
     * <p>
     * Specifies the source connector type, such as Salesforce, ServiceNow, and Marketo. Indicates source of ingestion.
     * </p>
     * 
     * @return Specifies the source connector type, such as Salesforce, ServiceNow, and Marketo. Indicates source of
     *         ingestion.
     * @see SourceConnectorType
     */

    public String getSourceConnectorType() {
        return this.sourceConnectorType;
    }

    /**
     * <p>
     * Specifies the source connector type, such as Salesforce, ServiceNow, and Marketo. Indicates source of ingestion.
     * </p>
     * 
     * @param sourceConnectorType
     *        Specifies the source connector type, such as Salesforce, ServiceNow, and Marketo. Indicates source of
     *        ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceConnectorType
     */

    public AppflowIntegrationWorkflowAttributes withSourceConnectorType(String sourceConnectorType) {
        setSourceConnectorType(sourceConnectorType);
        return this;
    }

    /**
     * <p>
     * Specifies the source connector type, such as Salesforce, ServiceNow, and Marketo. Indicates source of ingestion.
     * </p>
     * 
     * @param sourceConnectorType
     *        Specifies the source connector type, such as Salesforce, ServiceNow, and Marketo. Indicates source of
     *        ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceConnectorType
     */

    public AppflowIntegrationWorkflowAttributes withSourceConnectorType(SourceConnectorType sourceConnectorType) {
        this.sourceConnectorType = sourceConnectorType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the AppFlow connector profile used for ingestion.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the AppFlow connector profile used for ingestion.
     */

    public void setConnectorProfileName(String connectorProfileName) {
        this.connectorProfileName = connectorProfileName;
    }

    /**
     * <p>
     * The name of the AppFlow connector profile used for ingestion.
     * </p>
     * 
     * @return The name of the AppFlow connector profile used for ingestion.
     */

    public String getConnectorProfileName() {
        return this.connectorProfileName;
    }

    /**
     * <p>
     * The name of the AppFlow connector profile used for ingestion.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the AppFlow connector profile used for ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppflowIntegrationWorkflowAttributes withConnectorProfileName(String connectorProfileName) {
        setConnectorProfileName(connectorProfileName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources on your
     * behalf as part of workflow execution.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources on
     *        your behalf as part of workflow execution.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources on your
     * behalf as part of workflow execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources
     *         on your behalf as part of workflow execution.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources on your
     * behalf as part of workflow execution.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources on
     *        your behalf as part of workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppflowIntegrationWorkflowAttributes withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getSourceConnectorType() != null)
            sb.append("SourceConnectorType: ").append(getSourceConnectorType()).append(",");
        if (getConnectorProfileName() != null)
            sb.append("ConnectorProfileName: ").append(getConnectorProfileName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppflowIntegrationWorkflowAttributes == false)
            return false;
        AppflowIntegrationWorkflowAttributes other = (AppflowIntegrationWorkflowAttributes) obj;
        if (other.getSourceConnectorType() == null ^ this.getSourceConnectorType() == null)
            return false;
        if (other.getSourceConnectorType() != null && other.getSourceConnectorType().equals(this.getSourceConnectorType()) == false)
            return false;
        if (other.getConnectorProfileName() == null ^ this.getConnectorProfileName() == null)
            return false;
        if (other.getConnectorProfileName() != null && other.getConnectorProfileName().equals(this.getConnectorProfileName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceConnectorType() == null) ? 0 : getSourceConnectorType().hashCode());
        hashCode = prime * hashCode + ((getConnectorProfileName() == null) ? 0 : getConnectorProfileName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public AppflowIntegrationWorkflowAttributes clone() {
        try {
            return (AppflowIntegrationWorkflowAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.AppflowIntegrationWorkflowAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
