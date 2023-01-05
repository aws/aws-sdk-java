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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information for your Amazon Kendra experience. You can create an Amazon Kendra experience such as a search
 * application. For more information on creating a search application experience, see <a
 * href="https://docs.aws.amazon.com/kendra/latest/dg/deploying-search-experience-no-code.html">Building a search
 * experience with no code</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ExperiencesSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperiencesSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of your Amazon Kendra experience.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of your Amazon Kendra experience.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date-time your Amazon Kendra experience was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The processing status of your Amazon Kendra experience.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web
     * Services.
     * </p>
     */
    private java.util.List<ExperienceEndpoint> endpoints;

    /**
     * <p>
     * The name of your Amazon Kendra experience.
     * </p>
     * 
     * @param name
     *        The name of your Amazon Kendra experience.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of your Amazon Kendra experience.
     * </p>
     * 
     * @return The name of your Amazon Kendra experience.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of your Amazon Kendra experience.
     * </p>
     * 
     * @param name
     *        The name of your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperiencesSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of your Amazon Kendra experience.
     * </p>
     * 
     * @param id
     *        The identifier of your Amazon Kendra experience.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of your Amazon Kendra experience.
     * </p>
     * 
     * @return The identifier of your Amazon Kendra experience.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of your Amazon Kendra experience.
     * </p>
     * 
     * @param id
     *        The identifier of your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperiencesSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date-time your Amazon Kendra experience was created.
     * </p>
     * 
     * @param createdAt
     *        The date-time your Amazon Kendra experience was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date-time your Amazon Kendra experience was created.
     * </p>
     * 
     * @return The date-time your Amazon Kendra experience was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date-time your Amazon Kendra experience was created.
     * </p>
     * 
     * @param createdAt
     *        The date-time your Amazon Kendra experience was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperiencesSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The processing status of your Amazon Kendra experience.
     * </p>
     * 
     * @param status
     *        The processing status of your Amazon Kendra experience.
     * @see ExperienceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The processing status of your Amazon Kendra experience.
     * </p>
     * 
     * @return The processing status of your Amazon Kendra experience.
     * @see ExperienceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The processing status of your Amazon Kendra experience.
     * </p>
     * 
     * @param status
     *        The processing status of your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperienceStatus
     */

    public ExperiencesSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The processing status of your Amazon Kendra experience.
     * </p>
     * 
     * @param status
     *        The processing status of your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperienceStatus
     */

    public ExperiencesSummary withStatus(ExperienceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web
     * Services.
     * </p>
     * 
     * @return The endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web
     *         Services.
     */

    public java.util.List<ExperienceEndpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * The endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web
     * Services.
     * </p>
     * 
     * @param endpoints
     *        The endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web
     *        Services.
     */

    public void setEndpoints(java.util.Collection<ExperienceEndpoint> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<ExperienceEndpoint>(endpoints);
    }

    /**
     * <p>
     * The endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web
     * Services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpoints(java.util.Collection)} or {@link #withEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpoints
     *        The endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web
     *        Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperiencesSummary withEndpoints(ExperienceEndpoint... endpoints) {
        if (this.endpoints == null) {
            setEndpoints(new java.util.ArrayList<ExperienceEndpoint>(endpoints.length));
        }
        for (ExperienceEndpoint ele : endpoints) {
            this.endpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web
     * Services.
     * </p>
     * 
     * @param endpoints
     *        The endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web
     *        Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperiencesSummary withEndpoints(java.util.Collection<ExperienceEndpoint> endpoints) {
        setEndpoints(endpoints);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExperiencesSummary == false)
            return false;
        ExperiencesSummary other = (ExperiencesSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public ExperiencesSummary clone() {
        try {
            return (ExperiencesSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ExperiencesSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
