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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the SAP application registered with AWS Systems Manager for SAP.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ApplicationSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The status of the latest discovery.
     * </p>
     */
    private String discoveryStatus;
    /**
     * <p>
     * The type of the application.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The tags on the application.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param id
     *        The ID of the application.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param id
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The status of the latest discovery.
     * </p>
     * 
     * @param discoveryStatus
     *        The status of the latest discovery.
     * @see ApplicationDiscoveryStatus
     */

    public void setDiscoveryStatus(String discoveryStatus) {
        this.discoveryStatus = discoveryStatus;
    }

    /**
     * <p>
     * The status of the latest discovery.
     * </p>
     * 
     * @return The status of the latest discovery.
     * @see ApplicationDiscoveryStatus
     */

    public String getDiscoveryStatus() {
        return this.discoveryStatus;
    }

    /**
     * <p>
     * The status of the latest discovery.
     * </p>
     * 
     * @param discoveryStatus
     *        The status of the latest discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationDiscoveryStatus
     */

    public ApplicationSummary withDiscoveryStatus(String discoveryStatus) {
        setDiscoveryStatus(discoveryStatus);
        return this;
    }

    /**
     * <p>
     * The status of the latest discovery.
     * </p>
     * 
     * @param discoveryStatus
     *        The status of the latest discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationDiscoveryStatus
     */

    public ApplicationSummary withDiscoveryStatus(ApplicationDiscoveryStatus discoveryStatus) {
        this.discoveryStatus = discoveryStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of the application.
     * </p>
     * 
     * @param type
     *        The type of the application.
     * @see ApplicationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the application.
     * </p>
     * 
     * @return The type of the application.
     * @see ApplicationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the application.
     * </p>
     * 
     * @param type
     *        The type of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationType
     */

    public ApplicationSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the application.
     * </p>
     * 
     * @param type
     *        The type of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationType
     */

    public ApplicationSummary withType(ApplicationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the application.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The tags on the application.
     * </p>
     * 
     * @return The tags on the application.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags on the application.
     * </p>
     * 
     * @param tags
     *        The tags on the application.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags on the application.
     * </p>
     * 
     * @param tags
     *        The tags on the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ApplicationSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSummary addTagsEntry(String key, String value) {
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

    public ApplicationSummary clearTagsEntries() {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDiscoveryStatus() != null)
            sb.append("DiscoveryStatus: ").append(getDiscoveryStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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

        if (obj instanceof ApplicationSummary == false)
            return false;
        ApplicationSummary other = (ApplicationSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDiscoveryStatus() == null ^ this.getDiscoveryStatus() == null)
            return false;
        if (other.getDiscoveryStatus() != null && other.getDiscoveryStatus().equals(this.getDiscoveryStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDiscoveryStatus() == null) ? 0 : getDiscoveryStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationSummary clone() {
        try {
            return (ApplicationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.ApplicationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
