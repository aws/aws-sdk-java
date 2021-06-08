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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an FinSpace environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/Environment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Environment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the FinSpace environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the FinSpace environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The ID of the AWS account in which the FinSpace environment is created.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The current status of creation of the FinSpace environment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The sign-in url for the web application of your FinSpace environment.
     * </p>
     */
    private String environmentUrl;
    /**
     * <p>
     * The description of the FinSpace environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of your FinSpace environment.
     * </p>
     */
    private String environmentArn;
    /**
     * <p>
     * The url of the integrated FinSpace notebook environment in your web application.
     * </p>
     */
    private String sageMakerStudioDomainUrl;
    /**
     * <p>
     * The KMS key id used to encrypt in the FinSpace environment.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The AWS account ID of the dedicated service account associated with your FinSpace environment.
     * </p>
     */
    private String dedicatedServiceAccountId;
    /**
     * <p>
     * The authentication mode for the environment.
     * </p>
     */
    private String federationMode;
    /**
     * <p>
     * Configuration information when authentication mode is FEDERATED.
     * </p>
     */
    private FederationParameters federationParameters;

    /**
     * <p>
     * The name of the FinSpace environment.
     * </p>
     * 
     * @param name
     *        The name of the FinSpace environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the FinSpace environment.
     * </p>
     * 
     * @return The name of the FinSpace environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the FinSpace environment.
     * </p>
     * 
     * @param name
     *        The name of the FinSpace environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the FinSpace environment.
     * </p>
     * 
     * @param environmentId
     *        The identifier of the FinSpace environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The identifier of the FinSpace environment.
     * </p>
     * 
     * @return The identifier of the FinSpace environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The identifier of the FinSpace environment.
     * </p>
     * 
     * @param environmentId
     *        The identifier of the FinSpace environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account in which the FinSpace environment is created.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account in which the FinSpace environment is created.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account in which the FinSpace environment is created.
     * </p>
     * 
     * @return The ID of the AWS account in which the FinSpace environment is created.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account in which the FinSpace environment is created.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account in which the FinSpace environment is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The current status of creation of the FinSpace environment.
     * </p>
     * 
     * @param status
     *        The current status of creation of the FinSpace environment.
     * @see EnvironmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of creation of the FinSpace environment.
     * </p>
     * 
     * @return The current status of creation of the FinSpace environment.
     * @see EnvironmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of creation of the FinSpace environment.
     * </p>
     * 
     * @param status
     *        The current status of creation of the FinSpace environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public Environment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of creation of the FinSpace environment.
     * </p>
     * 
     * @param status
     *        The current status of creation of the FinSpace environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public Environment withStatus(EnvironmentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The sign-in url for the web application of your FinSpace environment.
     * </p>
     * 
     * @param environmentUrl
     *        The sign-in url for the web application of your FinSpace environment.
     */

    public void setEnvironmentUrl(String environmentUrl) {
        this.environmentUrl = environmentUrl;
    }

    /**
     * <p>
     * The sign-in url for the web application of your FinSpace environment.
     * </p>
     * 
     * @return The sign-in url for the web application of your FinSpace environment.
     */

    public String getEnvironmentUrl() {
        return this.environmentUrl;
    }

    /**
     * <p>
     * The sign-in url for the web application of your FinSpace environment.
     * </p>
     * 
     * @param environmentUrl
     *        The sign-in url for the web application of your FinSpace environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withEnvironmentUrl(String environmentUrl) {
        setEnvironmentUrl(environmentUrl);
        return this;
    }

    /**
     * <p>
     * The description of the FinSpace environment.
     * </p>
     * 
     * @param description
     *        The description of the FinSpace environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the FinSpace environment.
     * </p>
     * 
     * @return The description of the FinSpace environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the FinSpace environment.
     * </p>
     * 
     * @param description
     *        The description of the FinSpace environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your FinSpace environment.
     * </p>
     * 
     * @param environmentArn
     *        The Amazon Resource Name (ARN) of your FinSpace environment.
     */

    public void setEnvironmentArn(String environmentArn) {
        this.environmentArn = environmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your FinSpace environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of your FinSpace environment.
     */

    public String getEnvironmentArn() {
        return this.environmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of your FinSpace environment.
     * </p>
     * 
     * @param environmentArn
     *        The Amazon Resource Name (ARN) of your FinSpace environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withEnvironmentArn(String environmentArn) {
        setEnvironmentArn(environmentArn);
        return this;
    }

    /**
     * <p>
     * The url of the integrated FinSpace notebook environment in your web application.
     * </p>
     * 
     * @param sageMakerStudioDomainUrl
     *        The url of the integrated FinSpace notebook environment in your web application.
     */

    public void setSageMakerStudioDomainUrl(String sageMakerStudioDomainUrl) {
        this.sageMakerStudioDomainUrl = sageMakerStudioDomainUrl;
    }

    /**
     * <p>
     * The url of the integrated FinSpace notebook environment in your web application.
     * </p>
     * 
     * @return The url of the integrated FinSpace notebook environment in your web application.
     */

    public String getSageMakerStudioDomainUrl() {
        return this.sageMakerStudioDomainUrl;
    }

    /**
     * <p>
     * The url of the integrated FinSpace notebook environment in your web application.
     * </p>
     * 
     * @param sageMakerStudioDomainUrl
     *        The url of the integrated FinSpace notebook environment in your web application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withSageMakerStudioDomainUrl(String sageMakerStudioDomainUrl) {
        setSageMakerStudioDomainUrl(sageMakerStudioDomainUrl);
        return this;
    }

    /**
     * <p>
     * The KMS key id used to encrypt in the FinSpace environment.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key id used to encrypt in the FinSpace environment.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key id used to encrypt in the FinSpace environment.
     * </p>
     * 
     * @return The KMS key id used to encrypt in the FinSpace environment.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key id used to encrypt in the FinSpace environment.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key id used to encrypt in the FinSpace environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the dedicated service account associated with your FinSpace environment.
     * </p>
     * 
     * @param dedicatedServiceAccountId
     *        The AWS account ID of the dedicated service account associated with your FinSpace environment.
     */

    public void setDedicatedServiceAccountId(String dedicatedServiceAccountId) {
        this.dedicatedServiceAccountId = dedicatedServiceAccountId;
    }

    /**
     * <p>
     * The AWS account ID of the dedicated service account associated with your FinSpace environment.
     * </p>
     * 
     * @return The AWS account ID of the dedicated service account associated with your FinSpace environment.
     */

    public String getDedicatedServiceAccountId() {
        return this.dedicatedServiceAccountId;
    }

    /**
     * <p>
     * The AWS account ID of the dedicated service account associated with your FinSpace environment.
     * </p>
     * 
     * @param dedicatedServiceAccountId
     *        The AWS account ID of the dedicated service account associated with your FinSpace environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withDedicatedServiceAccountId(String dedicatedServiceAccountId) {
        setDedicatedServiceAccountId(dedicatedServiceAccountId);
        return this;
    }

    /**
     * <p>
     * The authentication mode for the environment.
     * </p>
     * 
     * @param federationMode
     *        The authentication mode for the environment.
     * @see FederationMode
     */

    public void setFederationMode(String federationMode) {
        this.federationMode = federationMode;
    }

    /**
     * <p>
     * The authentication mode for the environment.
     * </p>
     * 
     * @return The authentication mode for the environment.
     * @see FederationMode
     */

    public String getFederationMode() {
        return this.federationMode;
    }

    /**
     * <p>
     * The authentication mode for the environment.
     * </p>
     * 
     * @param federationMode
     *        The authentication mode for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FederationMode
     */

    public Environment withFederationMode(String federationMode) {
        setFederationMode(federationMode);
        return this;
    }

    /**
     * <p>
     * The authentication mode for the environment.
     * </p>
     * 
     * @param federationMode
     *        The authentication mode for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FederationMode
     */

    public Environment withFederationMode(FederationMode federationMode) {
        this.federationMode = federationMode.toString();
        return this;
    }

    /**
     * <p>
     * Configuration information when authentication mode is FEDERATED.
     * </p>
     * 
     * @param federationParameters
     *        Configuration information when authentication mode is FEDERATED.
     */

    public void setFederationParameters(FederationParameters federationParameters) {
        this.federationParameters = federationParameters;
    }

    /**
     * <p>
     * Configuration information when authentication mode is FEDERATED.
     * </p>
     * 
     * @return Configuration information when authentication mode is FEDERATED.
     */

    public FederationParameters getFederationParameters() {
        return this.federationParameters;
    }

    /**
     * <p>
     * Configuration information when authentication mode is FEDERATED.
     * </p>
     * 
     * @param federationParameters
     *        Configuration information when authentication mode is FEDERATED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withFederationParameters(FederationParameters federationParameters) {
        setFederationParameters(federationParameters);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEnvironmentUrl() != null)
            sb.append("EnvironmentUrl: ").append(getEnvironmentUrl()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnvironmentArn() != null)
            sb.append("EnvironmentArn: ").append(getEnvironmentArn()).append(",");
        if (getSageMakerStudioDomainUrl() != null)
            sb.append("SageMakerStudioDomainUrl: ").append(getSageMakerStudioDomainUrl()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getDedicatedServiceAccountId() != null)
            sb.append("DedicatedServiceAccountId: ").append(getDedicatedServiceAccountId()).append(",");
        if (getFederationMode() != null)
            sb.append("FederationMode: ").append(getFederationMode()).append(",");
        if (getFederationParameters() != null)
            sb.append("FederationParameters: ").append(getFederationParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Environment == false)
            return false;
        Environment other = (Environment) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEnvironmentUrl() == null ^ this.getEnvironmentUrl() == null)
            return false;
        if (other.getEnvironmentUrl() != null && other.getEnvironmentUrl().equals(this.getEnvironmentUrl()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnvironmentArn() == null ^ this.getEnvironmentArn() == null)
            return false;
        if (other.getEnvironmentArn() != null && other.getEnvironmentArn().equals(this.getEnvironmentArn()) == false)
            return false;
        if (other.getSageMakerStudioDomainUrl() == null ^ this.getSageMakerStudioDomainUrl() == null)
            return false;
        if (other.getSageMakerStudioDomainUrl() != null && other.getSageMakerStudioDomainUrl().equals(this.getSageMakerStudioDomainUrl()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDedicatedServiceAccountId() == null ^ this.getDedicatedServiceAccountId() == null)
            return false;
        if (other.getDedicatedServiceAccountId() != null && other.getDedicatedServiceAccountId().equals(this.getDedicatedServiceAccountId()) == false)
            return false;
        if (other.getFederationMode() == null ^ this.getFederationMode() == null)
            return false;
        if (other.getFederationMode() != null && other.getFederationMode().equals(this.getFederationMode()) == false)
            return false;
        if (other.getFederationParameters() == null ^ this.getFederationParameters() == null)
            return false;
        if (other.getFederationParameters() != null && other.getFederationParameters().equals(this.getFederationParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentUrl() == null) ? 0 : getEnvironmentUrl().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentArn() == null) ? 0 : getEnvironmentArn().hashCode());
        hashCode = prime * hashCode + ((getSageMakerStudioDomainUrl() == null) ? 0 : getSageMakerStudioDomainUrl().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDedicatedServiceAccountId() == null) ? 0 : getDedicatedServiceAccountId().hashCode());
        hashCode = prime * hashCode + ((getFederationMode() == null) ? 0 : getFederationMode().hashCode());
        hashCode = prime * hashCode + ((getFederationParameters() == null) ? 0 : getFederationParameters().hashCode());
        return hashCode;
    }

    @Override
    public Environment clone() {
        try {
            return (Environment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.EnvironmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
