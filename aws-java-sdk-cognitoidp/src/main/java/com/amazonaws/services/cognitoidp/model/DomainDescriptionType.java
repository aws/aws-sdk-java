/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A container for information about a domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DomainDescriptionType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainDescriptionType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user pool ID.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The AWS account ID for the user pool owner.
     * </p>
     */
    private String aWSAccountId;
    /**
     * <p>
     * The domain string.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The S3 bucket where the static files for this domain are stored.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The ARN of the CloudFront distribution.
     * </p>
     */
    private String cloudFrontDistribution;
    /**
     * <p>
     * The app version.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The domain status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
     * </p>
     */
    private CustomDomainConfigType customDomainConfig;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @return The user pool ID.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDescriptionType withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID for the user pool owner.
     * </p>
     * 
     * @param aWSAccountId
     *        The AWS account ID for the user pool owner.
     */

    public void setAWSAccountId(String aWSAccountId) {
        this.aWSAccountId = aWSAccountId;
    }

    /**
     * <p>
     * The AWS account ID for the user pool owner.
     * </p>
     * 
     * @return The AWS account ID for the user pool owner.
     */

    public String getAWSAccountId() {
        return this.aWSAccountId;
    }

    /**
     * <p>
     * The AWS account ID for the user pool owner.
     * </p>
     * 
     * @param aWSAccountId
     *        The AWS account ID for the user pool owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDescriptionType withAWSAccountId(String aWSAccountId) {
        setAWSAccountId(aWSAccountId);
        return this;
    }

    /**
     * <p>
     * The domain string.
     * </p>
     * 
     * @param domain
     *        The domain string.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain string.
     * </p>
     * 
     * @return The domain string.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain string.
     * </p>
     * 
     * @param domain
     *        The domain string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDescriptionType withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The S3 bucket where the static files for this domain are stored.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket where the static files for this domain are stored.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket where the static files for this domain are stored.
     * </p>
     * 
     * @return The S3 bucket where the static files for this domain are stored.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket where the static files for this domain are stored.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket where the static files for this domain are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDescriptionType withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The ARN of the CloudFront distribution.
     * </p>
     * 
     * @param cloudFrontDistribution
     *        The ARN of the CloudFront distribution.
     */

    public void setCloudFrontDistribution(String cloudFrontDistribution) {
        this.cloudFrontDistribution = cloudFrontDistribution;
    }

    /**
     * <p>
     * The ARN of the CloudFront distribution.
     * </p>
     * 
     * @return The ARN of the CloudFront distribution.
     */

    public String getCloudFrontDistribution() {
        return this.cloudFrontDistribution;
    }

    /**
     * <p>
     * The ARN of the CloudFront distribution.
     * </p>
     * 
     * @param cloudFrontDistribution
     *        The ARN of the CloudFront distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDescriptionType withCloudFrontDistribution(String cloudFrontDistribution) {
        setCloudFrontDistribution(cloudFrontDistribution);
        return this;
    }

    /**
     * <p>
     * The app version.
     * </p>
     * 
     * @param version
     *        The app version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The app version.
     * </p>
     * 
     * @return The app version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The app version.
     * </p>
     * 
     * @param version
     *        The app version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDescriptionType withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The domain status.
     * </p>
     * 
     * @param status
     *        The domain status.
     * @see DomainStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The domain status.
     * </p>
     * 
     * @return The domain status.
     * @see DomainStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The domain status.
     * </p>
     * 
     * @param status
     *        The domain status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatusType
     */

    public DomainDescriptionType withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The domain status.
     * </p>
     * 
     * @param status
     *        The domain status.
     * @see DomainStatusType
     */

    public void setStatus(DomainStatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * The domain status.
     * </p>
     * 
     * @param status
     *        The domain status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainStatusType
     */

    public DomainDescriptionType withStatus(DomainStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
     * </p>
     * 
     * @param customDomainConfig
     *        The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
     */

    public void setCustomDomainConfig(CustomDomainConfigType customDomainConfig) {
        this.customDomainConfig = customDomainConfig;
    }

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
     * </p>
     * 
     * @return The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
     */

    public CustomDomainConfigType getCustomDomainConfig() {
        return this.customDomainConfig;
    }

    /**
     * <p>
     * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
     * </p>
     * 
     * @param customDomainConfig
     *        The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainDescriptionType withCustomDomainConfig(CustomDomainConfigType customDomainConfig) {
        setCustomDomainConfig(customDomainConfig);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getAWSAccountId() != null)
            sb.append("AWSAccountId: ").append(getAWSAccountId()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getCloudFrontDistribution() != null)
            sb.append("CloudFrontDistribution: ").append(getCloudFrontDistribution()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCustomDomainConfig() != null)
            sb.append("CustomDomainConfig: ").append(getCustomDomainConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainDescriptionType == false)
            return false;
        DomainDescriptionType other = (DomainDescriptionType) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getAWSAccountId() == null ^ this.getAWSAccountId() == null)
            return false;
        if (other.getAWSAccountId() != null && other.getAWSAccountId().equals(this.getAWSAccountId()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getCloudFrontDistribution() == null ^ this.getCloudFrontDistribution() == null)
            return false;
        if (other.getCloudFrontDistribution() != null && other.getCloudFrontDistribution().equals(this.getCloudFrontDistribution()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCustomDomainConfig() == null ^ this.getCustomDomainConfig() == null)
            return false;
        if (other.getCustomDomainConfig() != null && other.getCustomDomainConfig().equals(this.getCustomDomainConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getAWSAccountId() == null) ? 0 : getAWSAccountId().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getCloudFrontDistribution() == null) ? 0 : getCloudFrontDistribution().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCustomDomainConfig() == null) ? 0 : getCustomDomainConfig().hashCode());
        return hashCode;
    }

    @Override
    public DomainDescriptionType clone() {
        try {
            return (DomainDescriptionType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.DomainDescriptionTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
