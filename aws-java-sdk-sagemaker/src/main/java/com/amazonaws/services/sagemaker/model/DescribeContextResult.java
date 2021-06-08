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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeContextResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the context.
     * </p>
     */
    private String contextName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the context.
     * </p>
     */
    private String contextArn;
    /**
     * <p>
     * The source of the context.
     * </p>
     */
    private ContextSource source;
    /**
     * <p>
     * The type of the context.
     * </p>
     */
    private String contextType;
    /**
     * <p>
     * The description of the context.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of the context's properties.
     * </p>
     */
    private java.util.Map<String, String> properties;
    /**
     * <p>
     * When the context was created.
     * </p>
     */
    private java.util.Date creationTime;

    private UserContext createdBy;
    /**
     * <p>
     * When the context was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    private UserContext lastModifiedBy;

    /**
     * <p>
     * The name of the context.
     * </p>
     * 
     * @param contextName
     *        The name of the context.
     */

    public void setContextName(String contextName) {
        this.contextName = contextName;
    }

    /**
     * <p>
     * The name of the context.
     * </p>
     * 
     * @return The name of the context.
     */

    public String getContextName() {
        return this.contextName;
    }

    /**
     * <p>
     * The name of the context.
     * </p>
     * 
     * @param contextName
     *        The name of the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContextResult withContextName(String contextName) {
        setContextName(contextName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the context.
     * </p>
     * 
     * @param contextArn
     *        The Amazon Resource Name (ARN) of the context.
     */

    public void setContextArn(String contextArn) {
        this.contextArn = contextArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the context.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the context.
     */

    public String getContextArn() {
        return this.contextArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the context.
     * </p>
     * 
     * @param contextArn
     *        The Amazon Resource Name (ARN) of the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContextResult withContextArn(String contextArn) {
        setContextArn(contextArn);
        return this;
    }

    /**
     * <p>
     * The source of the context.
     * </p>
     * 
     * @param source
     *        The source of the context.
     */

    public void setSource(ContextSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The source of the context.
     * </p>
     * 
     * @return The source of the context.
     */

    public ContextSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source of the context.
     * </p>
     * 
     * @param source
     *        The source of the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContextResult withSource(ContextSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The type of the context.
     * </p>
     * 
     * @param contextType
     *        The type of the context.
     */

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    /**
     * <p>
     * The type of the context.
     * </p>
     * 
     * @return The type of the context.
     */

    public String getContextType() {
        return this.contextType;
    }

    /**
     * <p>
     * The type of the context.
     * </p>
     * 
     * @param contextType
     *        The type of the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContextResult withContextType(String contextType) {
        setContextType(contextType);
        return this;
    }

    /**
     * <p>
     * The description of the context.
     * </p>
     * 
     * @param description
     *        The description of the context.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the context.
     * </p>
     * 
     * @return The description of the context.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the context.
     * </p>
     * 
     * @param description
     *        The description of the context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContextResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of the context's properties.
     * </p>
     * 
     * @return A list of the context's properties.
     */

    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    /**
     * <p>
     * A list of the context's properties.
     * </p>
     * 
     * @param properties
     *        A list of the context's properties.
     */

    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * A list of the context's properties.
     * </p>
     * 
     * @param properties
     *        A list of the context's properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContextResult withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see DescribeContextResult#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContextResult addPropertiesEntry(String key, String value) {
        if (null == this.properties) {
            this.properties = new java.util.HashMap<String, String>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContextResult clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * <p>
     * When the context was created.
     * </p>
     * 
     * @param creationTime
     *        When the context was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the context was created.
     * </p>
     * 
     * @return When the context was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the context was created.
     * </p>
     * 
     * @param creationTime
     *        When the context was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContextResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param createdBy
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @param createdBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContextResult withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * When the context was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the context was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the context was last modified.
     * </p>
     * 
     * @return When the context was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the context was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the context was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContextResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * @param lastModifiedBy
     */

    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * @return
     */

    public UserContext getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * @param lastModifiedBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeContextResult withLastModifiedBy(UserContext lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
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
        if (getContextName() != null)
            sb.append("ContextName: ").append(getContextName()).append(",");
        if (getContextArn() != null)
            sb.append("ContextArn: ").append(getContextArn()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getContextType() != null)
            sb.append("ContextType: ").append(getContextType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeContextResult == false)
            return false;
        DescribeContextResult other = (DescribeContextResult) obj;
        if (other.getContextName() == null ^ this.getContextName() == null)
            return false;
        if (other.getContextName() != null && other.getContextName().equals(this.getContextName()) == false)
            return false;
        if (other.getContextArn() == null ^ this.getContextArn() == null)
            return false;
        if (other.getContextArn() != null && other.getContextArn().equals(this.getContextArn()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getContextType() == null ^ this.getContextType() == null)
            return false;
        if (other.getContextType() != null && other.getContextType().equals(this.getContextType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContextName() == null) ? 0 : getContextName().hashCode());
        hashCode = prime * hashCode + ((getContextArn() == null) ? 0 : getContextArn().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getContextType() == null) ? 0 : getContextType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        return hashCode;
    }

    @Override
    public DescribeContextResult clone() {
        try {
            return (DescribeContextResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
