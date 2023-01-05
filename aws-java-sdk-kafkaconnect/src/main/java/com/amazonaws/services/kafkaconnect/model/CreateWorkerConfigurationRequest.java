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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/CreateWorkerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkerConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A summary description of the worker configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the worker configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Base64 encoded contents of connect-distributed.properties file.
     * </p>
     */
    private String propertiesFileContent;

    /**
     * <p>
     * A summary description of the worker configuration.
     * </p>
     * 
     * @param description
     *        A summary description of the worker configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A summary description of the worker configuration.
     * </p>
     * 
     * @return A summary description of the worker configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A summary description of the worker configuration.
     * </p>
     * 
     * @param description
     *        A summary description of the worker configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkerConfigurationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the worker configuration.
     * </p>
     * 
     * @param name
     *        The name of the worker configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the worker configuration.
     * </p>
     * 
     * @return The name of the worker configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the worker configuration.
     * </p>
     * 
     * @param name
     *        The name of the worker configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkerConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Base64 encoded contents of connect-distributed.properties file.
     * </p>
     * 
     * @param propertiesFileContent
     *        Base64 encoded contents of connect-distributed.properties file.
     */

    public void setPropertiesFileContent(String propertiesFileContent) {
        this.propertiesFileContent = propertiesFileContent;
    }

    /**
     * <p>
     * Base64 encoded contents of connect-distributed.properties file.
     * </p>
     * 
     * @return Base64 encoded contents of connect-distributed.properties file.
     */

    public String getPropertiesFileContent() {
        return this.propertiesFileContent;
    }

    /**
     * <p>
     * Base64 encoded contents of connect-distributed.properties file.
     * </p>
     * 
     * @param propertiesFileContent
     *        Base64 encoded contents of connect-distributed.properties file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkerConfigurationRequest withPropertiesFileContent(String propertiesFileContent) {
        setPropertiesFileContent(propertiesFileContent);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPropertiesFileContent() != null)
            sb.append("PropertiesFileContent: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkerConfigurationRequest == false)
            return false;
        CreateWorkerConfigurationRequest other = (CreateWorkerConfigurationRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPropertiesFileContent() == null ^ this.getPropertiesFileContent() == null)
            return false;
        if (other.getPropertiesFileContent() != null && other.getPropertiesFileContent().equals(this.getPropertiesFileContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPropertiesFileContent() == null) ? 0 : getPropertiesFileContent().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkerConfigurationRequest clone() {
        return (CreateWorkerConfigurationRequest) super.clone();
    }

}
