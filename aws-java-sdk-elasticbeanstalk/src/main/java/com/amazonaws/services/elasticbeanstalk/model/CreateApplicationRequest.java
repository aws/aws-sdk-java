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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to create an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreateApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Constraint: This name must be unique within your account. If the specified name already exists, the action
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Describes the application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specify an application resource lifecycle configuration to prevent your application from accumulating too many
     * versions.
     * </p>
     */
    private ApplicationResourceLifecycleConfig resourceLifecycleConfig;
    /**
     * <p>
     * Specifies the tags applied to the application.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application. Environments that you create in the application
     * don't inherit the tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * Default constructor for CreateApplicationRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateApplicationRequest() {
    }

    /**
     * Constructs a new CreateApplicationRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param applicationName
     *        The name of the application.</p>
     *        <p>
     *        Constraint: This name must be unique within your account. If the specified name already exists, the action
     *        returns an <code>InvalidParameterValue</code> error.
     */
    public CreateApplicationRequest(String applicationName) {
        setApplicationName(applicationName);
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Constraint: This name must be unique within your account. If the specified name already exists, the action
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.</p>
     *        <p>
     *        Constraint: This name must be unique within your account. If the specified name already exists, the action
     *        returns an <code>InvalidParameterValue</code> error.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Constraint: This name must be unique within your account. If the specified name already exists, the action
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @return The name of the application.</p>
     *         <p>
     *         Constraint: This name must be unique within your account. If the specified name already exists, the
     *         action returns an <code>InvalidParameterValue</code> error.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Constraint: This name must be unique within your account. If the specified name already exists, the action
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.</p>
     *        <p>
     *        Constraint: This name must be unique within your account. If the specified name already exists, the action
     *        returns an <code>InvalidParameterValue</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Describes the application.
     * </p>
     * 
     * @param description
     *        Describes the application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes the application.
     * </p>
     * 
     * @return Describes the application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Describes the application.
     * </p>
     * 
     * @param description
     *        Describes the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specify an application resource lifecycle configuration to prevent your application from accumulating too many
     * versions.
     * </p>
     * 
     * @param resourceLifecycleConfig
     *        Specify an application resource lifecycle configuration to prevent your application from accumulating too
     *        many versions.
     */

    public void setResourceLifecycleConfig(ApplicationResourceLifecycleConfig resourceLifecycleConfig) {
        this.resourceLifecycleConfig = resourceLifecycleConfig;
    }

    /**
     * <p>
     * Specify an application resource lifecycle configuration to prevent your application from accumulating too many
     * versions.
     * </p>
     * 
     * @return Specify an application resource lifecycle configuration to prevent your application from accumulating too
     *         many versions.
     */

    public ApplicationResourceLifecycleConfig getResourceLifecycleConfig() {
        return this.resourceLifecycleConfig;
    }

    /**
     * <p>
     * Specify an application resource lifecycle configuration to prevent your application from accumulating too many
     * versions.
     * </p>
     * 
     * @param resourceLifecycleConfig
     *        Specify an application resource lifecycle configuration to prevent your application from accumulating too
     *        many versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withResourceLifecycleConfig(ApplicationResourceLifecycleConfig resourceLifecycleConfig) {
        setResourceLifecycleConfig(resourceLifecycleConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the tags applied to the application.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application. Environments that you create in the application
     * don't inherit the tags.
     * </p>
     * 
     * @return Specifies the tags applied to the application.</p>
     *         <p>
     *         Elastic Beanstalk applies these tags only to the application. Environments that you create in the
     *         application don't inherit the tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Specifies the tags applied to the application.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application. Environments that you create in the application
     * don't inherit the tags.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to the application.</p>
     *        <p>
     *        Elastic Beanstalk applies these tags only to the application. Environments that you create in the
     *        application don't inherit the tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Specifies the tags applied to the application.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application. Environments that you create in the application
     * don't inherit the tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to the application.</p>
     *        <p>
     *        Elastic Beanstalk applies these tags only to the application. Environments that you create in the
     *        application don't inherit the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the tags applied to the application.
     * </p>
     * <p>
     * Elastic Beanstalk applies these tags only to the application. Environments that you create in the application
     * don't inherit the tags.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to the application.</p>
     *        <p>
     *        Elastic Beanstalk applies these tags only to the application. Environments that you create in the
     *        application don't inherit the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getResourceLifecycleConfig() != null)
            sb.append("ResourceLifecycleConfig: ").append(getResourceLifecycleConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getResourceLifecycleConfig() == null ^ this.getResourceLifecycleConfig() == null)
            return false;
        if (other.getResourceLifecycleConfig() != null && other.getResourceLifecycleConfig().equals(this.getResourceLifecycleConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getResourceLifecycleConfig() == null) ? 0 : getResourceLifecycleConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }

}
