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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/PutIntegration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutIntegrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     */
    private String uri;
    /**
     * <p>
     * The name of the profile object type.
     * </p>
     */
    private String objectTypeName;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The configuration that controls how Customer Profiles retrieves data from the source.
     * </p>
     */
    private FlowDefinition flowDefinition;

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     * 
     * @param uri
     *        The URI of the S3 bucket or any other type of data source.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     * 
     * @return The URI of the S3 bucket or any other type of data source.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * The URI of the S3 bucket or any other type of data source.
     * </p>
     * 
     * @param uri
     *        The URI of the S3 bucket or any other type of data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @param objectTypeName
     *        The name of the profile object type.
     */

    public void setObjectTypeName(String objectTypeName) {
        this.objectTypeName = objectTypeName;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @return The name of the profile object type.
     */

    public String getObjectTypeName() {
        return this.objectTypeName;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @param objectTypeName
     *        The name of the profile object type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withObjectTypeName(String objectTypeName) {
        setObjectTypeName(objectTypeName);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see PutIntegrationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest addTagsEntry(String key, String value) {
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

    public PutIntegrationRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The configuration that controls how Customer Profiles retrieves data from the source.
     * </p>
     * 
     * @param flowDefinition
     *        The configuration that controls how Customer Profiles retrieves data from the source.
     */

    public void setFlowDefinition(FlowDefinition flowDefinition) {
        this.flowDefinition = flowDefinition;
    }

    /**
     * <p>
     * The configuration that controls how Customer Profiles retrieves data from the source.
     * </p>
     * 
     * @return The configuration that controls how Customer Profiles retrieves data from the source.
     */

    public FlowDefinition getFlowDefinition() {
        return this.flowDefinition;
    }

    /**
     * <p>
     * The configuration that controls how Customer Profiles retrieves data from the source.
     * </p>
     * 
     * @param flowDefinition
     *        The configuration that controls how Customer Profiles retrieves data from the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withFlowDefinition(FlowDefinition flowDefinition) {
        setFlowDefinition(flowDefinition);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
        if (getObjectTypeName() != null)
            sb.append("ObjectTypeName: ").append(getObjectTypeName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getFlowDefinition() != null)
            sb.append("FlowDefinition: ").append(getFlowDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutIntegrationRequest == false)
            return false;
        PutIntegrationRequest other = (PutIntegrationRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getObjectTypeName() == null ^ this.getObjectTypeName() == null)
            return false;
        if (other.getObjectTypeName() != null && other.getObjectTypeName().equals(this.getObjectTypeName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getFlowDefinition() == null ^ this.getFlowDefinition() == null)
            return false;
        if (other.getFlowDefinition() != null && other.getFlowDefinition().equals(this.getFlowDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getObjectTypeName() == null) ? 0 : getObjectTypeName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getFlowDefinition() == null) ? 0 : getFlowDefinition().hashCode());
        return hashCode;
    }

    @Override
    public PutIntegrationRequest clone() {
        return (PutIntegrationRequest) super.clone();
    }

}
