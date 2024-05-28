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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubscriberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon S3 or Lake Formation access type.
     * </p>
     */
    private java.util.List<String> accessTypes;
    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and event
     * collection for natively supported Amazon Web Services.
     * </p>
     */
    private java.util.List<LogSourceResource> sources;
    /**
     * <p>
     * The description for your subscriber account in Security Lake.
     * </p>
     */
    private String subscriberDescription;
    /**
     * <p>
     * The AWS identity used to access your data.
     * </p>
     */
    private AwsIdentity subscriberIdentity;
    /**
     * <p>
     * The name of your Security Lake subscriber account.
     * </p>
     */
    private String subscriberName;
    /**
     * <p>
     * An array of objects, one for each tag to associate with the subscriber. For each tag, you must specify both a tag
     * key and a tag value. A tag value cannot be null, but it can be an empty string.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon S3 or Lake Formation access type.
     * </p>
     * 
     * @return The Amazon S3 or Lake Formation access type.
     * @see AccessType
     */

    public java.util.List<String> getAccessTypes() {
        return accessTypes;
    }

    /**
     * <p>
     * The Amazon S3 or Lake Formation access type.
     * </p>
     * 
     * @param accessTypes
     *        The Amazon S3 or Lake Formation access type.
     * @see AccessType
     */

    public void setAccessTypes(java.util.Collection<String> accessTypes) {
        if (accessTypes == null) {
            this.accessTypes = null;
            return;
        }

        this.accessTypes = new java.util.ArrayList<String>(accessTypes);
    }

    /**
     * <p>
     * The Amazon S3 or Lake Formation access type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccessTypes(java.util.Collection)} or {@link #withAccessTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accessTypes
     *        The Amazon S3 or Lake Formation access type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public CreateSubscriberRequest withAccessTypes(String... accessTypes) {
        if (this.accessTypes == null) {
            setAccessTypes(new java.util.ArrayList<String>(accessTypes.length));
        }
        for (String ele : accessTypes) {
            this.accessTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon S3 or Lake Formation access type.
     * </p>
     * 
     * @param accessTypes
     *        The Amazon S3 or Lake Formation access type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public CreateSubscriberRequest withAccessTypes(java.util.Collection<String> accessTypes) {
        setAccessTypes(accessTypes);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 or Lake Formation access type.
     * </p>
     * 
     * @param accessTypes
     *        The Amazon S3 or Lake Formation access type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public CreateSubscriberRequest withAccessTypes(AccessType... accessTypes) {
        java.util.ArrayList<String> accessTypesCopy = new java.util.ArrayList<String>(accessTypes.length);
        for (AccessType value : accessTypes) {
            accessTypesCopy.add(value.toString());
        }
        if (getAccessTypes() == null) {
            setAccessTypes(accessTypesCopy);
        } else {
            getAccessTypes().addAll(accessTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and event
     * collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @return The supported Amazon Web Services from which logs and events are collected. Security Lake supports log
     *         and event collection for natively supported Amazon Web Services.
     */

    public java.util.List<LogSourceResource> getSources() {
        return sources;
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and event
     * collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @param sources
     *        The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and
     *        event collection for natively supported Amazon Web Services.
     */

    public void setSources(java.util.Collection<LogSourceResource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<LogSourceResource>(sources);
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and event
     * collection for natively supported Amazon Web Services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and
     *        event collection for natively supported Amazon Web Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withSources(LogSourceResource... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<LogSourceResource>(sources.length));
        }
        for (LogSourceResource ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and event
     * collection for natively supported Amazon Web Services.
     * </p>
     * 
     * @param sources
     *        The supported Amazon Web Services from which logs and events are collected. Security Lake supports log and
     *        event collection for natively supported Amazon Web Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withSources(java.util.Collection<LogSourceResource> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * The description for your subscriber account in Security Lake.
     * </p>
     * 
     * @param subscriberDescription
     *        The description for your subscriber account in Security Lake.
     */

    public void setSubscriberDescription(String subscriberDescription) {
        this.subscriberDescription = subscriberDescription;
    }

    /**
     * <p>
     * The description for your subscriber account in Security Lake.
     * </p>
     * 
     * @return The description for your subscriber account in Security Lake.
     */

    public String getSubscriberDescription() {
        return this.subscriberDescription;
    }

    /**
     * <p>
     * The description for your subscriber account in Security Lake.
     * </p>
     * 
     * @param subscriberDescription
     *        The description for your subscriber account in Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withSubscriberDescription(String subscriberDescription) {
        setSubscriberDescription(subscriberDescription);
        return this;
    }

    /**
     * <p>
     * The AWS identity used to access your data.
     * </p>
     * 
     * @param subscriberIdentity
     *        The AWS identity used to access your data.
     */

    public void setSubscriberIdentity(AwsIdentity subscriberIdentity) {
        this.subscriberIdentity = subscriberIdentity;
    }

    /**
     * <p>
     * The AWS identity used to access your data.
     * </p>
     * 
     * @return The AWS identity used to access your data.
     */

    public AwsIdentity getSubscriberIdentity() {
        return this.subscriberIdentity;
    }

    /**
     * <p>
     * The AWS identity used to access your data.
     * </p>
     * 
     * @param subscriberIdentity
     *        The AWS identity used to access your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withSubscriberIdentity(AwsIdentity subscriberIdentity) {
        setSubscriberIdentity(subscriberIdentity);
        return this;
    }

    /**
     * <p>
     * The name of your Security Lake subscriber account.
     * </p>
     * 
     * @param subscriberName
     *        The name of your Security Lake subscriber account.
     */

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    /**
     * <p>
     * The name of your Security Lake subscriber account.
     * </p>
     * 
     * @return The name of your Security Lake subscriber account.
     */

    public String getSubscriberName() {
        return this.subscriberName;
    }

    /**
     * <p>
     * The name of your Security Lake subscriber account.
     * </p>
     * 
     * @param subscriberName
     *        The name of your Security Lake subscriber account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withSubscriberName(String subscriberName) {
        setSubscriberName(subscriberName);
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each tag to associate with the subscriber. For each tag, you must specify both a tag
     * key and a tag value. A tag value cannot be null, but it can be an empty string.
     * </p>
     * 
     * @return An array of objects, one for each tag to associate with the subscriber. For each tag, you must specify
     *         both a tag key and a tag value. A tag value cannot be null, but it can be an empty string.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of objects, one for each tag to associate with the subscriber. For each tag, you must specify both a tag
     * key and a tag value. A tag value cannot be null, but it can be an empty string.
     * </p>
     * 
     * @param tags
     *        An array of objects, one for each tag to associate with the subscriber. For each tag, you must specify
     *        both a tag key and a tag value. A tag value cannot be null, but it can be an empty string.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of objects, one for each tag to associate with the subscriber. For each tag, you must specify both a tag
     * key and a tag value. A tag value cannot be null, but it can be an empty string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of objects, one for each tag to associate with the subscriber. For each tag, you must specify
     *        both a tag key and a tag value. A tag value cannot be null, but it can be an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each tag to associate with the subscriber. For each tag, you must specify both a tag
     * key and a tag value. A tag value cannot be null, but it can be an empty string.
     * </p>
     * 
     * @param tags
     *        An array of objects, one for each tag to associate with the subscriber. For each tag, you must specify
     *        both a tag key and a tag value. A tag value cannot be null, but it can be an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriberRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getAccessTypes() != null)
            sb.append("AccessTypes: ").append(getAccessTypes()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getSubscriberDescription() != null)
            sb.append("SubscriberDescription: ").append(getSubscriberDescription()).append(",");
        if (getSubscriberIdentity() != null)
            sb.append("SubscriberIdentity: ").append(getSubscriberIdentity()).append(",");
        if (getSubscriberName() != null)
            sb.append("SubscriberName: ").append(getSubscriberName()).append(",");
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

        if (obj instanceof CreateSubscriberRequest == false)
            return false;
        CreateSubscriberRequest other = (CreateSubscriberRequest) obj;
        if (other.getAccessTypes() == null ^ this.getAccessTypes() == null)
            return false;
        if (other.getAccessTypes() != null && other.getAccessTypes().equals(this.getAccessTypes()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getSubscriberDescription() == null ^ this.getSubscriberDescription() == null)
            return false;
        if (other.getSubscriberDescription() != null && other.getSubscriberDescription().equals(this.getSubscriberDescription()) == false)
            return false;
        if (other.getSubscriberIdentity() == null ^ this.getSubscriberIdentity() == null)
            return false;
        if (other.getSubscriberIdentity() != null && other.getSubscriberIdentity().equals(this.getSubscriberIdentity()) == false)
            return false;
        if (other.getSubscriberName() == null ^ this.getSubscriberName() == null)
            return false;
        if (other.getSubscriberName() != null && other.getSubscriberName().equals(this.getSubscriberName()) == false)
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

        hashCode = prime * hashCode + ((getAccessTypes() == null) ? 0 : getAccessTypes().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getSubscriberDescription() == null) ? 0 : getSubscriberDescription().hashCode());
        hashCode = prime * hashCode + ((getSubscriberIdentity() == null) ? 0 : getSubscriberIdentity().hashCode());
        hashCode = prime * hashCode + ((getSubscriberName() == null) ? 0 : getSubscriberName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubscriberRequest clone() {
        return (CreateSubscriberRequest) super.clone();
    }

}
