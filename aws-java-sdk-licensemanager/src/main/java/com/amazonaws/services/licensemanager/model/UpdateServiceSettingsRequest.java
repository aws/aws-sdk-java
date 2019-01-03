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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/UpdateServiceSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN of the Amazon S3 bucket where License Manager information is stored.
     * </p>
     */
    private String s3BucketArn;
    /**
     * <p>
     * ARN of the Amazon SNS topic used for License Manager alerts.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * Integrates AWS Organizations with License Manager for cross-account discovery.
     * </p>
     */
    private OrganizationConfiguration organizationConfiguration;
    /**
     * <p>
     * Activates cross-account discovery.
     * </p>
     */
    private Boolean enableCrossAccountsDiscovery;

    /**
     * <p>
     * ARN of the Amazon S3 bucket where License Manager information is stored.
     * </p>
     * 
     * @param s3BucketArn
     *        ARN of the Amazon S3 bucket where License Manager information is stored.
     */

    public void setS3BucketArn(String s3BucketArn) {
        this.s3BucketArn = s3BucketArn;
    }

    /**
     * <p>
     * ARN of the Amazon S3 bucket where License Manager information is stored.
     * </p>
     * 
     * @return ARN of the Amazon S3 bucket where License Manager information is stored.
     */

    public String getS3BucketArn() {
        return this.s3BucketArn;
    }

    /**
     * <p>
     * ARN of the Amazon S3 bucket where License Manager information is stored.
     * </p>
     * 
     * @param s3BucketArn
     *        ARN of the Amazon S3 bucket where License Manager information is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceSettingsRequest withS3BucketArn(String s3BucketArn) {
        setS3BucketArn(s3BucketArn);
        return this;
    }

    /**
     * <p>
     * ARN of the Amazon SNS topic used for License Manager alerts.
     * </p>
     * 
     * @param snsTopicArn
     *        ARN of the Amazon SNS topic used for License Manager alerts.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * ARN of the Amazon SNS topic used for License Manager alerts.
     * </p>
     * 
     * @return ARN of the Amazon SNS topic used for License Manager alerts.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * ARN of the Amazon SNS topic used for License Manager alerts.
     * </p>
     * 
     * @param snsTopicArn
     *        ARN of the Amazon SNS topic used for License Manager alerts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceSettingsRequest withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * Integrates AWS Organizations with License Manager for cross-account discovery.
     * </p>
     * 
     * @param organizationConfiguration
     *        Integrates AWS Organizations with License Manager for cross-account discovery.
     */

    public void setOrganizationConfiguration(OrganizationConfiguration organizationConfiguration) {
        this.organizationConfiguration = organizationConfiguration;
    }

    /**
     * <p>
     * Integrates AWS Organizations with License Manager for cross-account discovery.
     * </p>
     * 
     * @return Integrates AWS Organizations with License Manager for cross-account discovery.
     */

    public OrganizationConfiguration getOrganizationConfiguration() {
        return this.organizationConfiguration;
    }

    /**
     * <p>
     * Integrates AWS Organizations with License Manager for cross-account discovery.
     * </p>
     * 
     * @param organizationConfiguration
     *        Integrates AWS Organizations with License Manager for cross-account discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceSettingsRequest withOrganizationConfiguration(OrganizationConfiguration organizationConfiguration) {
        setOrganizationConfiguration(organizationConfiguration);
        return this;
    }

    /**
     * <p>
     * Activates cross-account discovery.
     * </p>
     * 
     * @param enableCrossAccountsDiscovery
     *        Activates cross-account discovery.
     */

    public void setEnableCrossAccountsDiscovery(Boolean enableCrossAccountsDiscovery) {
        this.enableCrossAccountsDiscovery = enableCrossAccountsDiscovery;
    }

    /**
     * <p>
     * Activates cross-account discovery.
     * </p>
     * 
     * @return Activates cross-account discovery.
     */

    public Boolean getEnableCrossAccountsDiscovery() {
        return this.enableCrossAccountsDiscovery;
    }

    /**
     * <p>
     * Activates cross-account discovery.
     * </p>
     * 
     * @param enableCrossAccountsDiscovery
     *        Activates cross-account discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceSettingsRequest withEnableCrossAccountsDiscovery(Boolean enableCrossAccountsDiscovery) {
        setEnableCrossAccountsDiscovery(enableCrossAccountsDiscovery);
        return this;
    }

    /**
     * <p>
     * Activates cross-account discovery.
     * </p>
     * 
     * @return Activates cross-account discovery.
     */

    public Boolean isEnableCrossAccountsDiscovery() {
        return this.enableCrossAccountsDiscovery;
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
        if (getS3BucketArn() != null)
            sb.append("S3BucketArn: ").append(getS3BucketArn()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getOrganizationConfiguration() != null)
            sb.append("OrganizationConfiguration: ").append(getOrganizationConfiguration()).append(",");
        if (getEnableCrossAccountsDiscovery() != null)
            sb.append("EnableCrossAccountsDiscovery: ").append(getEnableCrossAccountsDiscovery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceSettingsRequest == false)
            return false;
        UpdateServiceSettingsRequest other = (UpdateServiceSettingsRequest) obj;
        if (other.getS3BucketArn() == null ^ this.getS3BucketArn() == null)
            return false;
        if (other.getS3BucketArn() != null && other.getS3BucketArn().equals(this.getS3BucketArn()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getOrganizationConfiguration() == null ^ this.getOrganizationConfiguration() == null)
            return false;
        if (other.getOrganizationConfiguration() != null && other.getOrganizationConfiguration().equals(this.getOrganizationConfiguration()) == false)
            return false;
        if (other.getEnableCrossAccountsDiscovery() == null ^ this.getEnableCrossAccountsDiscovery() == null)
            return false;
        if (other.getEnableCrossAccountsDiscovery() != null && other.getEnableCrossAccountsDiscovery().equals(this.getEnableCrossAccountsDiscovery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3BucketArn() == null) ? 0 : getS3BucketArn().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getOrganizationConfiguration() == null) ? 0 : getOrganizationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEnableCrossAccountsDiscovery() == null) ? 0 : getEnableCrossAccountsDiscovery().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceSettingsRequest clone() {
        return (UpdateServiceSettingsRequest) super.clone();
    }

}
