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
package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An Amazon Lex V2 chat bot created under an <code>AppInstance</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/AppInstanceBot" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppInstanceBot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the AppInstanceBot.
     * </p>
     */
    private String appInstanceBotArn;
    /**
     * <p>
     * The name of the AppInstanceBot.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data processing instructions for an AppInstanceBot.
     * </p>
     */
    private Configuration configuration;
    /**
     * <p>
     * The time at which the <code>AppInstanceBot</code> was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which the <code>AppInstanceBot</code> was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;
    /**
     * <p>
     * The metadata for an AppInstanceBot.
     * </p>
     */
    private String metadata;

    /**
     * <p>
     * The ARN of the AppInstanceBot.
     * </p>
     * 
     * @param appInstanceBotArn
     *        The ARN of the AppInstanceBot.
     */

    public void setAppInstanceBotArn(String appInstanceBotArn) {
        this.appInstanceBotArn = appInstanceBotArn;
    }

    /**
     * <p>
     * The ARN of the AppInstanceBot.
     * </p>
     * 
     * @return The ARN of the AppInstanceBot.
     */

    public String getAppInstanceBotArn() {
        return this.appInstanceBotArn;
    }

    /**
     * <p>
     * The ARN of the AppInstanceBot.
     * </p>
     * 
     * @param appInstanceBotArn
     *        The ARN of the AppInstanceBot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceBot withAppInstanceBotArn(String appInstanceBotArn) {
        setAppInstanceBotArn(appInstanceBotArn);
        return this;
    }

    /**
     * <p>
     * The name of the AppInstanceBot.
     * </p>
     * 
     * @param name
     *        The name of the AppInstanceBot.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the AppInstanceBot.
     * </p>
     * 
     * @return The name of the AppInstanceBot.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the AppInstanceBot.
     * </p>
     * 
     * @param name
     *        The name of the AppInstanceBot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceBot withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data processing instructions for an AppInstanceBot.
     * </p>
     * 
     * @param configuration
     *        The data processing instructions for an AppInstanceBot.
     */

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The data processing instructions for an AppInstanceBot.
     * </p>
     * 
     * @return The data processing instructions for an AppInstanceBot.
     */

    public Configuration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The data processing instructions for an AppInstanceBot.
     * </p>
     * 
     * @param configuration
     *        The data processing instructions for an AppInstanceBot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceBot withConfiguration(Configuration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The time at which the <code>AppInstanceBot</code> was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the <code>AppInstanceBot</code> was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the <code>AppInstanceBot</code> was created.
     * </p>
     * 
     * @return The time at which the <code>AppInstanceBot</code> was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which the <code>AppInstanceBot</code> was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the <code>AppInstanceBot</code> was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceBot withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which the <code>AppInstanceBot</code> was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The time at which the <code>AppInstanceBot</code> was last updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which the <code>AppInstanceBot</code> was last updated.
     * </p>
     * 
     * @return The time at which the <code>AppInstanceBot</code> was last updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which the <code>AppInstanceBot</code> was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The time at which the <code>AppInstanceBot</code> was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceBot withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The metadata for an AppInstanceBot.
     * </p>
     * 
     * @param metadata
     *        The metadata for an AppInstanceBot.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata for an AppInstanceBot.
     * </p>
     * 
     * @return The metadata for an AppInstanceBot.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The metadata for an AppInstanceBot.
     * </p>
     * 
     * @param metadata
     *        The metadata for an AppInstanceBot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceBot withMetadata(String metadata) {
        setMetadata(metadata);
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
        if (getAppInstanceBotArn() != null)
            sb.append("AppInstanceBotArn: ").append(getAppInstanceBotArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppInstanceBot == false)
            return false;
        AppInstanceBot other = (AppInstanceBot) obj;
        if (other.getAppInstanceBotArn() == null ^ this.getAppInstanceBotArn() == null)
            return false;
        if (other.getAppInstanceBotArn() != null && other.getAppInstanceBotArn().equals(this.getAppInstanceBotArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceBotArn() == null) ? 0 : getAppInstanceBotArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public AppInstanceBot clone() {
        try {
            return (AppInstanceBot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkidentity.model.transform.AppInstanceBotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
