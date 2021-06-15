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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains summary information about the associated AppIntegrations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/IntegrationAssociationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntegrationAssociationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the AppIntegration association.
     * </p>
     */
    private String integrationAssociationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration association.
     * </p>
     */
    private String integrationAssociationArn;
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The integration type.
     * </p>
     */
    private String integrationType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration.
     * </p>
     */
    private String integrationArn;
    /**
     * <p>
     * The URL for the external application.
     * </p>
     */
    private String sourceApplicationUrl;
    /**
     * <p>
     * The user-provided, friendly name for the external application.
     * </p>
     */
    private String sourceApplicationName;
    /**
     * <p>
     * The name of the source.
     * </p>
     */
    private String sourceType;

    /**
     * <p>
     * The identifier for the AppIntegration association.
     * </p>
     * 
     * @param integrationAssociationId
     *        The identifier for the AppIntegration association.
     */

    public void setIntegrationAssociationId(String integrationAssociationId) {
        this.integrationAssociationId = integrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the AppIntegration association.
     * </p>
     * 
     * @return The identifier for the AppIntegration association.
     */

    public String getIntegrationAssociationId() {
        return this.integrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the AppIntegration association.
     * </p>
     * 
     * @param integrationAssociationId
     *        The identifier for the AppIntegration association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegrationAssociationSummary withIntegrationAssociationId(String integrationAssociationId) {
        setIntegrationAssociationId(integrationAssociationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration association.
     * </p>
     * 
     * @param integrationAssociationArn
     *        The Amazon Resource Name (ARN) for the AppIntegration association.
     */

    public void setIntegrationAssociationArn(String integrationAssociationArn) {
        this.integrationAssociationArn = integrationAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the AppIntegration association.
     */

    public String getIntegrationAssociationArn() {
        return this.integrationAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration association.
     * </p>
     * 
     * @param integrationAssociationArn
     *        The Amazon Resource Name (ARN) for the AppIntegration association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegrationAssociationSummary withIntegrationAssociationArn(String integrationAssociationArn) {
        setIntegrationAssociationArn(integrationAssociationArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegrationAssociationSummary withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The integration type.
     * </p>
     * 
     * @param integrationType
     *        The integration type.
     * @see IntegrationType
     */

    public void setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
    }

    /**
     * <p>
     * The integration type.
     * </p>
     * 
     * @return The integration type.
     * @see IntegrationType
     */

    public String getIntegrationType() {
        return this.integrationType;
    }

    /**
     * <p>
     * The integration type.
     * </p>
     * 
     * @param integrationType
     *        The integration type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationType
     */

    public IntegrationAssociationSummary withIntegrationType(String integrationType) {
        setIntegrationType(integrationType);
        return this;
    }

    /**
     * <p>
     * The integration type.
     * </p>
     * 
     * @param integrationType
     *        The integration type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationType
     */

    public IntegrationAssociationSummary withIntegrationType(IntegrationType integrationType) {
        this.integrationType = integrationType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration.
     * </p>
     * 
     * @param integrationArn
     *        The Amazon Resource Name (ARN) for the AppIntegration.
     */

    public void setIntegrationArn(String integrationArn) {
        this.integrationArn = integrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the AppIntegration.
     */

    public String getIntegrationArn() {
        return this.integrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the AppIntegration.
     * </p>
     * 
     * @param integrationArn
     *        The Amazon Resource Name (ARN) for the AppIntegration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegrationAssociationSummary withIntegrationArn(String integrationArn) {
        setIntegrationArn(integrationArn);
        return this;
    }

    /**
     * <p>
     * The URL for the external application.
     * </p>
     * 
     * @param sourceApplicationUrl
     *        The URL for the external application.
     */

    public void setSourceApplicationUrl(String sourceApplicationUrl) {
        this.sourceApplicationUrl = sourceApplicationUrl;
    }

    /**
     * <p>
     * The URL for the external application.
     * </p>
     * 
     * @return The URL for the external application.
     */

    public String getSourceApplicationUrl() {
        return this.sourceApplicationUrl;
    }

    /**
     * <p>
     * The URL for the external application.
     * </p>
     * 
     * @param sourceApplicationUrl
     *        The URL for the external application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegrationAssociationSummary withSourceApplicationUrl(String sourceApplicationUrl) {
        setSourceApplicationUrl(sourceApplicationUrl);
        return this;
    }

    /**
     * <p>
     * The user-provided, friendly name for the external application.
     * </p>
     * 
     * @param sourceApplicationName
     *        The user-provided, friendly name for the external application.
     */

    public void setSourceApplicationName(String sourceApplicationName) {
        this.sourceApplicationName = sourceApplicationName;
    }

    /**
     * <p>
     * The user-provided, friendly name for the external application.
     * </p>
     * 
     * @return The user-provided, friendly name for the external application.
     */

    public String getSourceApplicationName() {
        return this.sourceApplicationName;
    }

    /**
     * <p>
     * The user-provided, friendly name for the external application.
     * </p>
     * 
     * @param sourceApplicationName
     *        The user-provided, friendly name for the external application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntegrationAssociationSummary withSourceApplicationName(String sourceApplicationName) {
        setSourceApplicationName(sourceApplicationName);
        return this;
    }

    /**
     * <p>
     * The name of the source.
     * </p>
     * 
     * @param sourceType
     *        The name of the source.
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The name of the source.
     * </p>
     * 
     * @return The name of the source.
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The name of the source.
     * </p>
     * 
     * @param sourceType
     *        The name of the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public IntegrationAssociationSummary withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The name of the source.
     * </p>
     * 
     * @param sourceType
     *        The name of the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public IntegrationAssociationSummary withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
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
        if (getIntegrationAssociationId() != null)
            sb.append("IntegrationAssociationId: ").append(getIntegrationAssociationId()).append(",");
        if (getIntegrationAssociationArn() != null)
            sb.append("IntegrationAssociationArn: ").append(getIntegrationAssociationArn()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getIntegrationType() != null)
            sb.append("IntegrationType: ").append(getIntegrationType()).append(",");
        if (getIntegrationArn() != null)
            sb.append("IntegrationArn: ").append(getIntegrationArn()).append(",");
        if (getSourceApplicationUrl() != null)
            sb.append("SourceApplicationUrl: ").append(getSourceApplicationUrl()).append(",");
        if (getSourceApplicationName() != null)
            sb.append("SourceApplicationName: ").append(getSourceApplicationName()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntegrationAssociationSummary == false)
            return false;
        IntegrationAssociationSummary other = (IntegrationAssociationSummary) obj;
        if (other.getIntegrationAssociationId() == null ^ this.getIntegrationAssociationId() == null)
            return false;
        if (other.getIntegrationAssociationId() != null && other.getIntegrationAssociationId().equals(this.getIntegrationAssociationId()) == false)
            return false;
        if (other.getIntegrationAssociationArn() == null ^ this.getIntegrationAssociationArn() == null)
            return false;
        if (other.getIntegrationAssociationArn() != null && other.getIntegrationAssociationArn().equals(this.getIntegrationAssociationArn()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getIntegrationType() == null ^ this.getIntegrationType() == null)
            return false;
        if (other.getIntegrationType() != null && other.getIntegrationType().equals(this.getIntegrationType()) == false)
            return false;
        if (other.getIntegrationArn() == null ^ this.getIntegrationArn() == null)
            return false;
        if (other.getIntegrationArn() != null && other.getIntegrationArn().equals(this.getIntegrationArn()) == false)
            return false;
        if (other.getSourceApplicationUrl() == null ^ this.getSourceApplicationUrl() == null)
            return false;
        if (other.getSourceApplicationUrl() != null && other.getSourceApplicationUrl().equals(this.getSourceApplicationUrl()) == false)
            return false;
        if (other.getSourceApplicationName() == null ^ this.getSourceApplicationName() == null)
            return false;
        if (other.getSourceApplicationName() != null && other.getSourceApplicationName().equals(this.getSourceApplicationName()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntegrationAssociationId() == null) ? 0 : getIntegrationAssociationId().hashCode());
        hashCode = prime * hashCode + ((getIntegrationAssociationArn() == null) ? 0 : getIntegrationAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getIntegrationType() == null) ? 0 : getIntegrationType().hashCode());
        hashCode = prime * hashCode + ((getIntegrationArn() == null) ? 0 : getIntegrationArn().hashCode());
        hashCode = prime * hashCode + ((getSourceApplicationUrl() == null) ? 0 : getSourceApplicationUrl().hashCode());
        hashCode = prime * hashCode + ((getSourceApplicationName() == null) ? 0 : getSourceApplicationName().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        return hashCode;
    }

    @Override
    public IntegrationAssociationSummary clone() {
        try {
            return (IntegrationAssociationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.IntegrationAssociationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
