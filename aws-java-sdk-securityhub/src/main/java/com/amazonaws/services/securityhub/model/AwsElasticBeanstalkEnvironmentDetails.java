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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about an Elastic Beanstalk environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElasticBeanstalkEnvironmentDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElasticBeanstalkEnvironmentDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the application that is associated with the environment.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The URL to the CNAME for this environment.
     * </p>
     */
    private String cname;
    /**
     * <p>
     * The creation date for this environment.
     * </p>
     */
    private String dateCreated;
    /**
     * <p>
     * The date when this environment was last modified.
     * </p>
     */
    private String dateUpdated;
    /**
     * <p>
     * A description of the environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * For load-balanced, autoscaling environments, the URL to the load balancer. For single-instance environments, the
     * IP address of the instance.
     * </p>
     */
    private String endpointUrl;
    /**
     * <p>
     * The ARN of the environment.
     * </p>
     */
    private String environmentArn;
    /**
     * <p>
     * The identifier of the environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * Links to other environments in the same group.
     * </p>
     */
    private java.util.List<AwsElasticBeanstalkEnvironmentEnvironmentLink> environmentLinks;
    /**
     * <p>
     * The name of the environment.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The configuration setting for the environment.
     * </p>
     */
    private java.util.List<AwsElasticBeanstalkEnvironmentOptionSetting> optionSettings;
    /**
     * <p>
     * The ARN of the platform version for the environment.
     * </p>
     */
    private String platformArn;
    /**
     * <p>
     * The name of the solution stack that is deployed with the environment.
     * </p>
     */
    private String solutionStackName;
    /**
     * <p>
     * The current operational status of the environment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tier of the environment.
     * </p>
     */
    private AwsElasticBeanstalkEnvironmentTier tier;
    /**
     * <p>
     * The application version of the environment.
     * </p>
     */
    private String versionLabel;

    /**
     * <p>
     * The name of the application that is associated with the environment.
     * </p>
     * 
     * @param applicationName
     *        The name of the application that is associated with the environment.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application that is associated with the environment.
     * </p>
     * 
     * @return The name of the application that is associated with the environment.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application that is associated with the environment.
     * </p>
     * 
     * @param applicationName
     *        The name of the application that is associated with the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The URL to the CNAME for this environment.
     * </p>
     * 
     * @param cname
     *        The URL to the CNAME for this environment.
     */

    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * <p>
     * The URL to the CNAME for this environment.
     * </p>
     * 
     * @return The URL to the CNAME for this environment.
     */

    public String getCname() {
        return this.cname;
    }

    /**
     * <p>
     * The URL to the CNAME for this environment.
     * </p>
     * 
     * @param cname
     *        The URL to the CNAME for this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withCname(String cname) {
        setCname(cname);
        return this;
    }

    /**
     * <p>
     * The creation date for this environment.
     * </p>
     * 
     * @param dateCreated
     *        The creation date for this environment.
     */

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The creation date for this environment.
     * </p>
     * 
     * @return The creation date for this environment.
     */

    public String getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The creation date for this environment.
     * </p>
     * 
     * @param dateCreated
     *        The creation date for this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withDateCreated(String dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The date when this environment was last modified.
     * </p>
     * 
     * @param dateUpdated
     *        The date when this environment was last modified.
     */

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The date when this environment was last modified.
     * </p>
     * 
     * @return The date when this environment was last modified.
     */

    public String getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * <p>
     * The date when this environment was last modified.
     * </p>
     * 
     * @param dateUpdated
     *        The date when this environment was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withDateUpdated(String dateUpdated) {
        setDateUpdated(dateUpdated);
        return this;
    }

    /**
     * <p>
     * A description of the environment.
     * </p>
     * 
     * @param description
     *        A description of the environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the environment.
     * </p>
     * 
     * @return A description of the environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the environment.
     * </p>
     * 
     * @param description
     *        A description of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * For load-balanced, autoscaling environments, the URL to the load balancer. For single-instance environments, the
     * IP address of the instance.
     * </p>
     * 
     * @param endpointUrl
     *        For load-balanced, autoscaling environments, the URL to the load balancer. For single-instance
     *        environments, the IP address of the instance.
     */

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    /**
     * <p>
     * For load-balanced, autoscaling environments, the URL to the load balancer. For single-instance environments, the
     * IP address of the instance.
     * </p>
     * 
     * @return For load-balanced, autoscaling environments, the URL to the load balancer. For single-instance
     *         environments, the IP address of the instance.
     */

    public String getEndpointUrl() {
        return this.endpointUrl;
    }

    /**
     * <p>
     * For load-balanced, autoscaling environments, the URL to the load balancer. For single-instance environments, the
     * IP address of the instance.
     * </p>
     * 
     * @param endpointUrl
     *        For load-balanced, autoscaling environments, the URL to the load balancer. For single-instance
     *        environments, the IP address of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withEndpointUrl(String endpointUrl) {
        setEndpointUrl(endpointUrl);
        return this;
    }

    /**
     * <p>
     * The ARN of the environment.
     * </p>
     * 
     * @param environmentArn
     *        The ARN of the environment.
     */

    public void setEnvironmentArn(String environmentArn) {
        this.environmentArn = environmentArn;
    }

    /**
     * <p>
     * The ARN of the environment.
     * </p>
     * 
     * @return The ARN of the environment.
     */

    public String getEnvironmentArn() {
        return this.environmentArn;
    }

    /**
     * <p>
     * The ARN of the environment.
     * </p>
     * 
     * @param environmentArn
     *        The ARN of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withEnvironmentArn(String environmentArn) {
        setEnvironmentArn(environmentArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the environment.
     * </p>
     * 
     * @param environmentId
     *        The identifier of the environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The identifier of the environment.
     * </p>
     * 
     * @return The identifier of the environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The identifier of the environment.
     * </p>
     * 
     * @param environmentId
     *        The identifier of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * Links to other environments in the same group.
     * </p>
     * 
     * @return Links to other environments in the same group.
     */

    public java.util.List<AwsElasticBeanstalkEnvironmentEnvironmentLink> getEnvironmentLinks() {
        return environmentLinks;
    }

    /**
     * <p>
     * Links to other environments in the same group.
     * </p>
     * 
     * @param environmentLinks
     *        Links to other environments in the same group.
     */

    public void setEnvironmentLinks(java.util.Collection<AwsElasticBeanstalkEnvironmentEnvironmentLink> environmentLinks) {
        if (environmentLinks == null) {
            this.environmentLinks = null;
            return;
        }

        this.environmentLinks = new java.util.ArrayList<AwsElasticBeanstalkEnvironmentEnvironmentLink>(environmentLinks);
    }

    /**
     * <p>
     * Links to other environments in the same group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentLinks(java.util.Collection)} or {@link #withEnvironmentLinks(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param environmentLinks
     *        Links to other environments in the same group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withEnvironmentLinks(AwsElasticBeanstalkEnvironmentEnvironmentLink... environmentLinks) {
        if (this.environmentLinks == null) {
            setEnvironmentLinks(new java.util.ArrayList<AwsElasticBeanstalkEnvironmentEnvironmentLink>(environmentLinks.length));
        }
        for (AwsElasticBeanstalkEnvironmentEnvironmentLink ele : environmentLinks) {
            this.environmentLinks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Links to other environments in the same group.
     * </p>
     * 
     * @param environmentLinks
     *        Links to other environments in the same group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withEnvironmentLinks(java.util.Collection<AwsElasticBeanstalkEnvironmentEnvironmentLink> environmentLinks) {
        setEnvironmentLinks(environmentLinks);
        return this;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @return The name of the environment.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The configuration setting for the environment.
     * </p>
     * 
     * @return The configuration setting for the environment.
     */

    public java.util.List<AwsElasticBeanstalkEnvironmentOptionSetting> getOptionSettings() {
        return optionSettings;
    }

    /**
     * <p>
     * The configuration setting for the environment.
     * </p>
     * 
     * @param optionSettings
     *        The configuration setting for the environment.
     */

    public void setOptionSettings(java.util.Collection<AwsElasticBeanstalkEnvironmentOptionSetting> optionSettings) {
        if (optionSettings == null) {
            this.optionSettings = null;
            return;
        }

        this.optionSettings = new java.util.ArrayList<AwsElasticBeanstalkEnvironmentOptionSetting>(optionSettings);
    }

    /**
     * <p>
     * The configuration setting for the environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionSettings(java.util.Collection)} or {@link #withOptionSettings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param optionSettings
     *        The configuration setting for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withOptionSettings(AwsElasticBeanstalkEnvironmentOptionSetting... optionSettings) {
        if (this.optionSettings == null) {
            setOptionSettings(new java.util.ArrayList<AwsElasticBeanstalkEnvironmentOptionSetting>(optionSettings.length));
        }
        for (AwsElasticBeanstalkEnvironmentOptionSetting ele : optionSettings) {
            this.optionSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration setting for the environment.
     * </p>
     * 
     * @param optionSettings
     *        The configuration setting for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withOptionSettings(java.util.Collection<AwsElasticBeanstalkEnvironmentOptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
        return this;
    }

    /**
     * <p>
     * The ARN of the platform version for the environment.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the platform version for the environment.
     */

    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The ARN of the platform version for the environment.
     * </p>
     * 
     * @return The ARN of the platform version for the environment.
     */

    public String getPlatformArn() {
        return this.platformArn;
    }

    /**
     * <p>
     * The ARN of the platform version for the environment.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the platform version for the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withPlatformArn(String platformArn) {
        setPlatformArn(platformArn);
        return this;
    }

    /**
     * <p>
     * The name of the solution stack that is deployed with the environment.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the solution stack that is deployed with the environment.
     */

    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack that is deployed with the environment.
     * </p>
     * 
     * @return The name of the solution stack that is deployed with the environment.
     */

    public String getSolutionStackName() {
        return this.solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack that is deployed with the environment.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the solution stack that is deployed with the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withSolutionStackName(String solutionStackName) {
        setSolutionStackName(solutionStackName);
        return this;
    }

    /**
     * <p>
     * The current operational status of the environment.
     * </p>
     * 
     * @param status
     *        The current operational status of the environment.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current operational status of the environment.
     * </p>
     * 
     * @return The current operational status of the environment.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current operational status of the environment.
     * </p>
     * 
     * @param status
     *        The current operational status of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The tier of the environment.
     * </p>
     * 
     * @param tier
     *        The tier of the environment.
     */

    public void setTier(AwsElasticBeanstalkEnvironmentTier tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The tier of the environment.
     * </p>
     * 
     * @return The tier of the environment.
     */

    public AwsElasticBeanstalkEnvironmentTier getTier() {
        return this.tier;
    }

    /**
     * <p>
     * The tier of the environment.
     * </p>
     * 
     * @param tier
     *        The tier of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withTier(AwsElasticBeanstalkEnvironmentTier tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * The application version of the environment.
     * </p>
     * 
     * @param versionLabel
     *        The application version of the environment.
     */

    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * The application version of the environment.
     * </p>
     * 
     * @return The application version of the environment.
     */

    public String getVersionLabel() {
        return this.versionLabel;
    }

    /**
     * <p>
     * The application version of the environment.
     * </p>
     * 
     * @param versionLabel
     *        The application version of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticBeanstalkEnvironmentDetails withVersionLabel(String versionLabel) {
        setVersionLabel(versionLabel);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getCname() != null)
            sb.append("Cname: ").append(getCname()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: ").append(getDateUpdated()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEndpointUrl() != null)
            sb.append("EndpointUrl: ").append(getEndpointUrl()).append(",");
        if (getEnvironmentArn() != null)
            sb.append("EnvironmentArn: ").append(getEnvironmentArn()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getEnvironmentLinks() != null)
            sb.append("EnvironmentLinks: ").append(getEnvironmentLinks()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: ").append(getOptionSettings()).append(",");
        if (getPlatformArn() != null)
            sb.append("PlatformArn: ").append(getPlatformArn()).append(",");
        if (getSolutionStackName() != null)
            sb.append("SolutionStackName: ").append(getSolutionStackName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier()).append(",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: ").append(getVersionLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElasticBeanstalkEnvironmentDetails == false)
            return false;
        AwsElasticBeanstalkEnvironmentDetails other = (AwsElasticBeanstalkEnvironmentDetails) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCname() == null ^ this.getCname() == null)
            return false;
        if (other.getCname() != null && other.getCname().equals(this.getCname()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null)
            return false;
        if (other.getDateUpdated() != null && other.getDateUpdated().equals(this.getDateUpdated()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEndpointUrl() == null ^ this.getEndpointUrl() == null)
            return false;
        if (other.getEndpointUrl() != null && other.getEndpointUrl().equals(this.getEndpointUrl()) == false)
            return false;
        if (other.getEnvironmentArn() == null ^ this.getEnvironmentArn() == null)
            return false;
        if (other.getEnvironmentArn() != null && other.getEnvironmentArn().equals(this.getEnvironmentArn()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getEnvironmentLinks() == null ^ this.getEnvironmentLinks() == null)
            return false;
        if (other.getEnvironmentLinks() != null && other.getEnvironmentLinks().equals(this.getEnvironmentLinks()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null)
            return false;
        if (other.getOptionSettings() != null && other.getOptionSettings().equals(this.getOptionSettings()) == false)
            return false;
        if (other.getPlatformArn() == null ^ this.getPlatformArn() == null)
            return false;
        if (other.getPlatformArn() != null && other.getPlatformArn().equals(this.getPlatformArn()) == false)
            return false;
        if (other.getSolutionStackName() == null ^ this.getSolutionStackName() == null)
            return false;
        if (other.getSolutionStackName() != null && other.getSolutionStackName().equals(this.getSolutionStackName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCname() == null) ? 0 : getCname().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEndpointUrl() == null) ? 0 : getEndpointUrl().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentArn() == null) ? 0 : getEnvironmentArn().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentLinks() == null) ? 0 : getEnvironmentLinks().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        hashCode = prime * hashCode + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        return hashCode;
    }

    @Override
    public AwsElasticBeanstalkEnvironmentDetails clone() {
        try {
            return (AwsElasticBeanstalkEnvironmentDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElasticBeanstalkEnvironmentDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
