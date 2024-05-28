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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateRevealConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRevealConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The KMS key to use to encrypt the sensitive data, and the status of the configuration for the Amazon Macie
     * account.
     * </p>
     */
    private RevealConfiguration configuration;
    /**
     * <p>
     * The access method and settings to use when retrieving the sensitive data.
     * </p>
     */
    private RetrievalConfiguration retrievalConfiguration;

    /**
     * <p>
     * The KMS key to use to encrypt the sensitive data, and the status of the configuration for the Amazon Macie
     * account.
     * </p>
     * 
     * @param configuration
     *        The KMS key to use to encrypt the sensitive data, and the status of the configuration for the Amazon Macie
     *        account.
     */

    public void setConfiguration(RevealConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The KMS key to use to encrypt the sensitive data, and the status of the configuration for the Amazon Macie
     * account.
     * </p>
     * 
     * @return The KMS key to use to encrypt the sensitive data, and the status of the configuration for the Amazon
     *         Macie account.
     */

    public RevealConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The KMS key to use to encrypt the sensitive data, and the status of the configuration for the Amazon Macie
     * account.
     * </p>
     * 
     * @param configuration
     *        The KMS key to use to encrypt the sensitive data, and the status of the configuration for the Amazon Macie
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRevealConfigurationResult withConfiguration(RevealConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The access method and settings to use when retrieving the sensitive data.
     * </p>
     * 
     * @param retrievalConfiguration
     *        The access method and settings to use when retrieving the sensitive data.
     */

    public void setRetrievalConfiguration(RetrievalConfiguration retrievalConfiguration) {
        this.retrievalConfiguration = retrievalConfiguration;
    }

    /**
     * <p>
     * The access method and settings to use when retrieving the sensitive data.
     * </p>
     * 
     * @return The access method and settings to use when retrieving the sensitive data.
     */

    public RetrievalConfiguration getRetrievalConfiguration() {
        return this.retrievalConfiguration;
    }

    /**
     * <p>
     * The access method and settings to use when retrieving the sensitive data.
     * </p>
     * 
     * @param retrievalConfiguration
     *        The access method and settings to use when retrieving the sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRevealConfigurationResult withRetrievalConfiguration(RetrievalConfiguration retrievalConfiguration) {
        setRetrievalConfiguration(retrievalConfiguration);
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getRetrievalConfiguration() != null)
            sb.append("RetrievalConfiguration: ").append(getRetrievalConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRevealConfigurationResult == false)
            return false;
        UpdateRevealConfigurationResult other = (UpdateRevealConfigurationResult) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getRetrievalConfiguration() == null ^ this.getRetrievalConfiguration() == null)
            return false;
        if (other.getRetrievalConfiguration() != null && other.getRetrievalConfiguration().equals(this.getRetrievalConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRetrievalConfiguration() == null) ? 0 : getRetrievalConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRevealConfigurationResult clone() {
        try {
            return (UpdateRevealConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
