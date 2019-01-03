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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the properties of an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ApplicationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * User-defined description of the application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date when the application was created.
     * </p>
     */
    private java.util.Date dateCreated;
    /**
     * <p>
     * The date when the application was last modified.
     * </p>
     */
    private java.util.Date dateUpdated;
    /**
     * <p>
     * The names of the versions for this application.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> versions;
    /**
     * <p>
     * The names of the configuration templates associated with this application.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> configurationTemplates;
    /**
     * <p>
     * The lifecycle settings for the application.
     * </p>
     */
    private ApplicationResourceLifecycleConfig resourceLifecycleConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the application.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDescription withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDescription withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * User-defined description of the application.
     * </p>
     * 
     * @param description
     *        User-defined description of the application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * User-defined description of the application.
     * </p>
     * 
     * @return User-defined description of the application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * User-defined description of the application.
     * </p>
     * 
     * @param description
     *        User-defined description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date when the application was created.
     * </p>
     * 
     * @param dateCreated
     *        The date when the application was created.
     */

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date when the application was created.
     * </p>
     * 
     * @return The date when the application was created.
     */

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date when the application was created.
     * </p>
     * 
     * @param dateCreated
     *        The date when the application was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDescription withDateCreated(java.util.Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The date when the application was last modified.
     * </p>
     * 
     * @param dateUpdated
     *        The date when the application was last modified.
     */

    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The date when the application was last modified.
     * </p>
     * 
     * @return The date when the application was last modified.
     */

    public java.util.Date getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * <p>
     * The date when the application was last modified.
     * </p>
     * 
     * @param dateUpdated
     *        The date when the application was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDescription withDateUpdated(java.util.Date dateUpdated) {
        setDateUpdated(dateUpdated);
        return this;
    }

    /**
     * <p>
     * The names of the versions for this application.
     * </p>
     * 
     * @return The names of the versions for this application.
     */

    public java.util.List<String> getVersions() {
        if (versions == null) {
            versions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return versions;
    }

    /**
     * <p>
     * The names of the versions for this application.
     * </p>
     * 
     * @param versions
     *        The names of the versions for this application.
     */

    public void setVersions(java.util.Collection<String> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new com.amazonaws.internal.SdkInternalList<String>(versions);
    }

    /**
     * <p>
     * The names of the versions for this application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersions(java.util.Collection)} or {@link #withVersions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param versions
     *        The names of the versions for this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDescription withVersions(String... versions) {
        if (this.versions == null) {
            setVersions(new com.amazonaws.internal.SdkInternalList<String>(versions.length));
        }
        for (String ele : versions) {
            this.versions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the versions for this application.
     * </p>
     * 
     * @param versions
     *        The names of the versions for this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDescription withVersions(java.util.Collection<String> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p>
     * The names of the configuration templates associated with this application.
     * </p>
     * 
     * @return The names of the configuration templates associated with this application.
     */

    public java.util.List<String> getConfigurationTemplates() {
        if (configurationTemplates == null) {
            configurationTemplates = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return configurationTemplates;
    }

    /**
     * <p>
     * The names of the configuration templates associated with this application.
     * </p>
     * 
     * @param configurationTemplates
     *        The names of the configuration templates associated with this application.
     */

    public void setConfigurationTemplates(java.util.Collection<String> configurationTemplates) {
        if (configurationTemplates == null) {
            this.configurationTemplates = null;
            return;
        }

        this.configurationTemplates = new com.amazonaws.internal.SdkInternalList<String>(configurationTemplates);
    }

    /**
     * <p>
     * The names of the configuration templates associated with this application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationTemplates(java.util.Collection)} or
     * {@link #withConfigurationTemplates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configurationTemplates
     *        The names of the configuration templates associated with this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDescription withConfigurationTemplates(String... configurationTemplates) {
        if (this.configurationTemplates == null) {
            setConfigurationTemplates(new com.amazonaws.internal.SdkInternalList<String>(configurationTemplates.length));
        }
        for (String ele : configurationTemplates) {
            this.configurationTemplates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the configuration templates associated with this application.
     * </p>
     * 
     * @param configurationTemplates
     *        The names of the configuration templates associated with this application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDescription withConfigurationTemplates(java.util.Collection<String> configurationTemplates) {
        setConfigurationTemplates(configurationTemplates);
        return this;
    }

    /**
     * <p>
     * The lifecycle settings for the application.
     * </p>
     * 
     * @param resourceLifecycleConfig
     *        The lifecycle settings for the application.
     */

    public void setResourceLifecycleConfig(ApplicationResourceLifecycleConfig resourceLifecycleConfig) {
        this.resourceLifecycleConfig = resourceLifecycleConfig;
    }

    /**
     * <p>
     * The lifecycle settings for the application.
     * </p>
     * 
     * @return The lifecycle settings for the application.
     */

    public ApplicationResourceLifecycleConfig getResourceLifecycleConfig() {
        return this.resourceLifecycleConfig;
    }

    /**
     * <p>
     * The lifecycle settings for the application.
     * </p>
     * 
     * @param resourceLifecycleConfig
     *        The lifecycle settings for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDescription withResourceLifecycleConfig(ApplicationResourceLifecycleConfig resourceLifecycleConfig) {
        setResourceLifecycleConfig(resourceLifecycleConfig);
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
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: ").append(getDateUpdated()).append(",");
        if (getVersions() != null)
            sb.append("Versions: ").append(getVersions()).append(",");
        if (getConfigurationTemplates() != null)
            sb.append("ConfigurationTemplates: ").append(getConfigurationTemplates()).append(",");
        if (getResourceLifecycleConfig() != null)
            sb.append("ResourceLifecycleConfig: ").append(getResourceLifecycleConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationDescription == false)
            return false;
        ApplicationDescription other = (ApplicationDescription) obj;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null)
            return false;
        if (other.getDateUpdated() != null && other.getDateUpdated().equals(this.getDateUpdated()) == false)
            return false;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        if (other.getConfigurationTemplates() == null ^ this.getConfigurationTemplates() == null)
            return false;
        if (other.getConfigurationTemplates() != null && other.getConfigurationTemplates().equals(this.getConfigurationTemplates()) == false)
            return false;
        if (other.getResourceLifecycleConfig() == null ^ this.getResourceLifecycleConfig() == null)
            return false;
        if (other.getResourceLifecycleConfig() != null && other.getResourceLifecycleConfig().equals(this.getResourceLifecycleConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode + ((getConfigurationTemplates() == null) ? 0 : getConfigurationTemplates().hashCode());
        hashCode = prime * hashCode + ((getResourceLifecycleConfig() == null) ? 0 : getResourceLifecycleConfig().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationDescription clone() {
        try {
            return (ApplicationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
