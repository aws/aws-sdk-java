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
package com.amazonaws.services.oam.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/CreateLink" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLinkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify a friendly human-readable name to use to identify this source account when you are viewing data from it
     * in the monitoring account.
     * </p>
     * <p>
     * You can use a custom label or use the following variables:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>$AccountName</code> is the name of the account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>$AccountEmail</code> is the globally unique email address of the account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>$AccountEmailNoDomain</code> is the email address of the account without the domain name
     * </p>
     * </li>
     * </ul>
     */
    private String labelTemplate;
    /**
     * <p>
     * An array of strings that define which types of data that the source account shares with the monitoring account.
     * </p>
     */
    private java.util.List<String> resourceTypes;
    /**
     * <p>
     * The ARN of the sink to use to create this link. You can use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html">ListSinks</a> to find the ARNs of
     * sinks.
     * </p>
     * <p>
     * For more information about sinks, see <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_CreateSink.html">CreateSink</a>.
     * </p>
     */
    private String sinkIdentifier;
    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the link.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * For more information about using tags to control access, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Controlling access to Amazon Web
     * Services resources using tags</a>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Specify a friendly human-readable name to use to identify this source account when you are viewing data from it
     * in the monitoring account.
     * </p>
     * <p>
     * You can use a custom label or use the following variables:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>$AccountName</code> is the name of the account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>$AccountEmail</code> is the globally unique email address of the account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>$AccountEmailNoDomain</code> is the email address of the account without the domain name
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelTemplate
     *        Specify a friendly human-readable name to use to identify this source account when you are viewing data
     *        from it in the monitoring account.</p>
     *        <p>
     *        You can use a custom label or use the following variables:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>$AccountName</code> is the name of the account
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>$AccountEmail</code> is the globally unique email address of the account
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>$AccountEmailNoDomain</code> is the email address of the account without the domain name
     *        </p>
     *        </li>
     */

    public void setLabelTemplate(String labelTemplate) {
        this.labelTemplate = labelTemplate;
    }

    /**
     * <p>
     * Specify a friendly human-readable name to use to identify this source account when you are viewing data from it
     * in the monitoring account.
     * </p>
     * <p>
     * You can use a custom label or use the following variables:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>$AccountName</code> is the name of the account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>$AccountEmail</code> is the globally unique email address of the account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>$AccountEmailNoDomain</code> is the email address of the account without the domain name
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify a friendly human-readable name to use to identify this source account when you are viewing data
     *         from it in the monitoring account.</p>
     *         <p>
     *         You can use a custom label or use the following variables:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>$AccountName</code> is the name of the account
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>$AccountEmail</code> is the globally unique email address of the account
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>$AccountEmailNoDomain</code> is the email address of the account without the domain name
     *         </p>
     *         </li>
     */

    public String getLabelTemplate() {
        return this.labelTemplate;
    }

    /**
     * <p>
     * Specify a friendly human-readable name to use to identify this source account when you are viewing data from it
     * in the monitoring account.
     * </p>
     * <p>
     * You can use a custom label or use the following variables:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>$AccountName</code> is the name of the account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>$AccountEmail</code> is the globally unique email address of the account
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>$AccountEmailNoDomain</code> is the email address of the account without the domain name
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelTemplate
     *        Specify a friendly human-readable name to use to identify this source account when you are viewing data
     *        from it in the monitoring account.</p>
     *        <p>
     *        You can use a custom label or use the following variables:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>$AccountName</code> is the name of the account
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>$AccountEmail</code> is the globally unique email address of the account
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>$AccountEmailNoDomain</code> is the email address of the account without the domain name
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLinkRequest withLabelTemplate(String labelTemplate) {
        setLabelTemplate(labelTemplate);
        return this;
    }

    /**
     * <p>
     * An array of strings that define which types of data that the source account shares with the monitoring account.
     * </p>
     * 
     * @return An array of strings that define which types of data that the source account shares with the monitoring
     *         account.
     * @see ResourceType
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * An array of strings that define which types of data that the source account shares with the monitoring account.
     * </p>
     * 
     * @param resourceTypes
     *        An array of strings that define which types of data that the source account shares with the monitoring
     *        account.
     * @see ResourceType
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * An array of strings that define which types of data that the source account shares with the monitoring account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        An array of strings that define which types of data that the source account shares with the monitoring
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public CreateLinkRequest withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that define which types of data that the source account shares with the monitoring account.
     * </p>
     * 
     * @param resourceTypes
     *        An array of strings that define which types of data that the source account shares with the monitoring
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public CreateLinkRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * An array of strings that define which types of data that the source account shares with the monitoring account.
     * </p>
     * 
     * @param resourceTypes
     *        An array of strings that define which types of data that the source account shares with the monitoring
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public CreateLinkRequest withResourceTypes(ResourceType... resourceTypes) {
        java.util.ArrayList<String> resourceTypesCopy = new java.util.ArrayList<String>(resourceTypes.length);
        for (ResourceType value : resourceTypes) {
            resourceTypesCopy.add(value.toString());
        }
        if (getResourceTypes() == null) {
            setResourceTypes(resourceTypesCopy);
        } else {
            getResourceTypes().addAll(resourceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The ARN of the sink to use to create this link. You can use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html">ListSinks</a> to find the ARNs of
     * sinks.
     * </p>
     * <p>
     * For more information about sinks, see <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_CreateSink.html">CreateSink</a>.
     * </p>
     * 
     * @param sinkIdentifier
     *        The ARN of the sink to use to create this link. You can use <a
     *        href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html">ListSinks</a> to find the
     *        ARNs of sinks.</p>
     *        <p>
     *        For more information about sinks, see <a
     *        href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_CreateSink.html">CreateSink</a>.
     */

    public void setSinkIdentifier(String sinkIdentifier) {
        this.sinkIdentifier = sinkIdentifier;
    }

    /**
     * <p>
     * The ARN of the sink to use to create this link. You can use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html">ListSinks</a> to find the ARNs of
     * sinks.
     * </p>
     * <p>
     * For more information about sinks, see <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_CreateSink.html">CreateSink</a>.
     * </p>
     * 
     * @return The ARN of the sink to use to create this link. You can use <a
     *         href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html">ListSinks</a> to find the
     *         ARNs of sinks.</p>
     *         <p>
     *         For more information about sinks, see <a
     *         href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_CreateSink.html">CreateSink</a>.
     */

    public String getSinkIdentifier() {
        return this.sinkIdentifier;
    }

    /**
     * <p>
     * The ARN of the sink to use to create this link. You can use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html">ListSinks</a> to find the ARNs of
     * sinks.
     * </p>
     * <p>
     * For more information about sinks, see <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_CreateSink.html">CreateSink</a>.
     * </p>
     * 
     * @param sinkIdentifier
     *        The ARN of the sink to use to create this link. You can use <a
     *        href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html">ListSinks</a> to find the
     *        ARNs of sinks.</p>
     *        <p>
     *        For more information about sinks, see <a
     *        href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_CreateSink.html">CreateSink</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLinkRequest withSinkIdentifier(String sinkIdentifier) {
        setSinkIdentifier(sinkIdentifier);
        return this;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the link.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * For more information about using tags to control access, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Controlling access to Amazon Web
     * Services resources using tags</a>.
     * </p>
     * 
     * @return Assigns one or more tags (key-value pairs) to the link. </p>
     *         <p>
     *         Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *         by granting a user permission to access or change only resources with certain tag values.
     *         </p>
     *         <p>
     *         For more information about using tags to control access, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Controlling access to Amazon Web
     *         Services resources using tags</a>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the link.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * For more information about using tags to control access, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Controlling access to Amazon Web
     * Services resources using tags</a>.
     * </p>
     * 
     * @param tags
     *        Assigns one or more tags (key-value pairs) to the link. </p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     *        </p>
     *        <p>
     *        For more information about using tags to control access, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Controlling access to Amazon Web
     *        Services resources using tags</a>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the link.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * For more information about using tags to control access, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Controlling access to Amazon Web
     * Services resources using tags</a>.
     * </p>
     * 
     * @param tags
     *        Assigns one or more tags (key-value pairs) to the link. </p>
     *        <p>
     *        Tags can help you organize and categorize your resources. You can also use them to scope user permissions
     *        by granting a user permission to access or change only resources with certain tag values.
     *        </p>
     *        <p>
     *        For more information about using tags to control access, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Controlling access to Amazon Web
     *        Services resources using tags</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLinkRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateLinkRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateLinkRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLinkRequest clearTagsEntries() {
        this.tags = null;
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
        if (getLabelTemplate() != null)
            sb.append("LabelTemplate: ").append(getLabelTemplate()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getSinkIdentifier() != null)
            sb.append("SinkIdentifier: ").append(getSinkIdentifier()).append(",");
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

        if (obj instanceof CreateLinkRequest == false)
            return false;
        CreateLinkRequest other = (CreateLinkRequest) obj;
        if (other.getLabelTemplate() == null ^ this.getLabelTemplate() == null)
            return false;
        if (other.getLabelTemplate() != null && other.getLabelTemplate().equals(this.getLabelTemplate()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getSinkIdentifier() == null ^ this.getSinkIdentifier() == null)
            return false;
        if (other.getSinkIdentifier() != null && other.getSinkIdentifier().equals(this.getSinkIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getLabelTemplate() == null) ? 0 : getLabelTemplate().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getSinkIdentifier() == null) ? 0 : getSinkIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLinkRequest clone() {
        return (CreateLinkRequest) super.clone();
    }

}
