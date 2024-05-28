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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/UpdateAppInstanceBot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAppInstanceBotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the <code>AppInstanceBot</code>.
     * </p>
     */
    private String appInstanceBotArn;
    /**
     * <p>
     * The name of the <code>AppInstanceBot</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The metadata of the <code>AppInstanceBot</code>.
     * </p>
     */
    private String metadata;
    /**
     * <p>
     * The configuration for the bot update.
     * </p>
     */
    private Configuration configuration;

    /**
     * <p>
     * The ARN of the <code>AppInstanceBot</code>.
     * </p>
     * 
     * @param appInstanceBotArn
     *        The ARN of the <code>AppInstanceBot</code>.
     */

    public void setAppInstanceBotArn(String appInstanceBotArn) {
        this.appInstanceBotArn = appInstanceBotArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceBot</code>.
     * </p>
     * 
     * @return The ARN of the <code>AppInstanceBot</code>.
     */

    public String getAppInstanceBotArn() {
        return this.appInstanceBotArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceBot</code>.
     * </p>
     * 
     * @param appInstanceBotArn
     *        The ARN of the <code>AppInstanceBot</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppInstanceBotRequest withAppInstanceBotArn(String appInstanceBotArn) {
        setAppInstanceBotArn(appInstanceBotArn);
        return this;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceBot</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>AppInstanceBot</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceBot</code>.
     * </p>
     * 
     * @return The name of the <code>AppInstanceBot</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceBot</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>AppInstanceBot</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppInstanceBotRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The metadata of the <code>AppInstanceBot</code>.
     * </p>
     * 
     * @param metadata
     *        The metadata of the <code>AppInstanceBot</code>.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata of the <code>AppInstanceBot</code>.
     * </p>
     * 
     * @return The metadata of the <code>AppInstanceBot</code>.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The metadata of the <code>AppInstanceBot</code>.
     * </p>
     * 
     * @param metadata
     *        The metadata of the <code>AppInstanceBot</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppInstanceBotRequest withMetadata(String metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The configuration for the bot update.
     * </p>
     * 
     * @param configuration
     *        The configuration for the bot update.
     */

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration for the bot update.
     * </p>
     * 
     * @return The configuration for the bot update.
     */

    public Configuration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration for the bot update.
     * </p>
     * 
     * @param configuration
     *        The configuration for the bot update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppInstanceBotRequest withConfiguration(Configuration configuration) {
        setConfiguration(configuration);
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
        if (getMetadata() != null)
            sb.append("Metadata: ").append("***Sensitive Data Redacted***").append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAppInstanceBotRequest == false)
            return false;
        UpdateAppInstanceBotRequest other = (UpdateAppInstanceBotRequest) obj;
        if (other.getAppInstanceBotArn() == null ^ this.getAppInstanceBotArn() == null)
            return false;
        if (other.getAppInstanceBotArn() != null && other.getAppInstanceBotArn().equals(this.getAppInstanceBotArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceBotArn() == null) ? 0 : getAppInstanceBotArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAppInstanceBotRequest clone() {
        return (UpdateAppInstanceBotRequest) super.clone();
    }

}
