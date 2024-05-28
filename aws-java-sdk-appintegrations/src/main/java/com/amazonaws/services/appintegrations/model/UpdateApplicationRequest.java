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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/UpdateApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The configuration for where the application should be loaded from.
     * </p>
     */
    private ApplicationSourceConfig applicationSourceConfig;
    /**
     * <p>
     * The events that the application subscribes.
     * </p>
     */
    @Deprecated
    private java.util.List<Subscription> subscriptions;
    /**
     * <p>
     * The events that the application publishes.
     * </p>
     */
    @Deprecated
    private java.util.List<Publication> publications;
    /**
     * <p>
     * The configuration of events or requests that the application has access to.
     * </p>
     */
    private java.util.List<String> permissions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Application.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Application.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Application.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the Application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param name
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @return The description of the application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The configuration for where the application should be loaded from.
     * </p>
     * 
     * @param applicationSourceConfig
     *        The configuration for where the application should be loaded from.
     */

    public void setApplicationSourceConfig(ApplicationSourceConfig applicationSourceConfig) {
        this.applicationSourceConfig = applicationSourceConfig;
    }

    /**
     * <p>
     * The configuration for where the application should be loaded from.
     * </p>
     * 
     * @return The configuration for where the application should be loaded from.
     */

    public ApplicationSourceConfig getApplicationSourceConfig() {
        return this.applicationSourceConfig;
    }

    /**
     * <p>
     * The configuration for where the application should be loaded from.
     * </p>
     * 
     * @param applicationSourceConfig
     *        The configuration for where the application should be loaded from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationSourceConfig(ApplicationSourceConfig applicationSourceConfig) {
        setApplicationSourceConfig(applicationSourceConfig);
        return this;
    }

    /**
     * <p>
     * The events that the application subscribes.
     * </p>
     * 
     * @return The events that the application subscribes.
     */
    @Deprecated
    public java.util.List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    /**
     * <p>
     * The events that the application subscribes.
     * </p>
     * 
     * @param subscriptions
     *        The events that the application subscribes.
     */
    @Deprecated
    public void setSubscriptions(java.util.Collection<Subscription> subscriptions) {
        if (subscriptions == null) {
            this.subscriptions = null;
            return;
        }

        this.subscriptions = new java.util.ArrayList<Subscription>(subscriptions);
    }

    /**
     * <p>
     * The events that the application subscribes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscriptions(java.util.Collection)} or {@link #withSubscriptions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param subscriptions
     *        The events that the application subscribes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public UpdateApplicationRequest withSubscriptions(Subscription... subscriptions) {
        if (this.subscriptions == null) {
            setSubscriptions(new java.util.ArrayList<Subscription>(subscriptions.length));
        }
        for (Subscription ele : subscriptions) {
            this.subscriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The events that the application subscribes.
     * </p>
     * 
     * @param subscriptions
     *        The events that the application subscribes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public UpdateApplicationRequest withSubscriptions(java.util.Collection<Subscription> subscriptions) {
        setSubscriptions(subscriptions);
        return this;
    }

    /**
     * <p>
     * The events that the application publishes.
     * </p>
     * 
     * @return The events that the application publishes.
     */
    @Deprecated
    public java.util.List<Publication> getPublications() {
        return publications;
    }

    /**
     * <p>
     * The events that the application publishes.
     * </p>
     * 
     * @param publications
     *        The events that the application publishes.
     */
    @Deprecated
    public void setPublications(java.util.Collection<Publication> publications) {
        if (publications == null) {
            this.publications = null;
            return;
        }

        this.publications = new java.util.ArrayList<Publication>(publications);
    }

    /**
     * <p>
     * The events that the application publishes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPublications(java.util.Collection)} or {@link #withPublications(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param publications
     *        The events that the application publishes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public UpdateApplicationRequest withPublications(Publication... publications) {
        if (this.publications == null) {
            setPublications(new java.util.ArrayList<Publication>(publications.length));
        }
        for (Publication ele : publications) {
            this.publications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The events that the application publishes.
     * </p>
     * 
     * @param publications
     *        The events that the application publishes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public UpdateApplicationRequest withPublications(java.util.Collection<Publication> publications) {
        setPublications(publications);
        return this;
    }

    /**
     * <p>
     * The configuration of events or requests that the application has access to.
     * </p>
     * 
     * @return The configuration of events or requests that the application has access to.
     */

    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * The configuration of events or requests that the application has access to.
     * </p>
     * 
     * @param permissions
     *        The configuration of events or requests that the application has access to.
     */

    public void setPermissions(java.util.Collection<String> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<String>(permissions);
    }

    /**
     * <p>
     * The configuration of events or requests that the application has access to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        The configuration of events or requests that the application has access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withPermissions(String... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<String>(permissions.length));
        }
        for (String ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration of events or requests that the application has access to.
     * </p>
     * 
     * @param permissions
     *        The configuration of events or requests that the application has access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getApplicationSourceConfig() != null)
            sb.append("ApplicationSourceConfig: ").append(getApplicationSourceConfig()).append(",");
        if (getSubscriptions() != null)
            sb.append("Subscriptions: ").append(getSubscriptions()).append(",");
        if (getPublications() != null)
            sb.append("Publications: ").append(getPublications()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationRequest == false)
            return false;
        UpdateApplicationRequest other = (UpdateApplicationRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getApplicationSourceConfig() == null ^ this.getApplicationSourceConfig() == null)
            return false;
        if (other.getApplicationSourceConfig() != null && other.getApplicationSourceConfig().equals(this.getApplicationSourceConfig()) == false)
            return false;
        if (other.getSubscriptions() == null ^ this.getSubscriptions() == null)
            return false;
        if (other.getSubscriptions() != null && other.getSubscriptions().equals(this.getSubscriptions()) == false)
            return false;
        if (other.getPublications() == null ^ this.getPublications() == null)
            return false;
        if (other.getPublications() != null && other.getPublications().equals(this.getPublications()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getApplicationSourceConfig() == null) ? 0 : getApplicationSourceConfig().hashCode());
        hashCode = prime * hashCode + ((getSubscriptions() == null) ? 0 : getSubscriptions().hashCode());
        hashCode = prime * hashCode + ((getPublications() == null) ? 0 : getPublications().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationRequest clone() {
        return (UpdateApplicationRequest) super.clone();
    }

}
