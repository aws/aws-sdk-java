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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/UpdateDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A brief description of the domain.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the domain to be updated.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side encryption of
     * your data. Changing the domain's associated KMS key immediately triggers an asynchronous process to remove
     * dependency on the old KMS key, such that the domain's data can only be accessed using the new KMS key. The
     * domain's <code>ServerSideEncryptionUpdateDetails</code> contains the details for this process.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;

    /**
     * <p>
     * A brief description of the domain.
     * </p>
     * 
     * @param description
     *        A brief description of the domain.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the domain.
     * </p>
     * 
     * @return A brief description of the domain.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the domain.
     * </p>
     * 
     * @param description
     *        A brief description of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the domain to be updated.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain to be updated.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the domain to be updated.
     * </p>
     * 
     * @return The identifier of the domain to be updated.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the domain to be updated.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param name
     *        The name of the domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param name
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side encryption of
     * your data. Changing the domain's associated KMS key immediately triggers an asynchronous process to remove
     * dependency on the old KMS key, such that the domain's data can only be accessed using the new KMS key. The
     * domain's <code>ServerSideEncryptionUpdateDetails</code> contains the details for this process.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side
     *        encryption of your data. Changing the domain's associated KMS key immediately triggers an asynchronous
     *        process to remove dependency on the old KMS key, such that the domain's data can only be accessed using
     *        the new KMS key. The domain's <code>ServerSideEncryptionUpdateDetails</code> contains the details for this
     *        process.
     */

    public void setServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side encryption of
     * your data. Changing the domain's associated KMS key immediately triggers an asynchronous process to remove
     * dependency on the old KMS key, such that the domain's data can only be accessed using the new KMS key. The
     * domain's <code>ServerSideEncryptionUpdateDetails</code> contains the details for this process.
     * </p>
     * 
     * @return The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side
     *         encryption of your data. Changing the domain's associated KMS key immediately triggers an asynchronous
     *         process to remove dependency on the old KMS key, such that the domain's data can only be accessed using
     *         the new KMS key. The domain's <code>ServerSideEncryptionUpdateDetails</code> contains the details for
     *         this process.
     */

    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side encryption of
     * your data. Changing the domain's associated KMS key immediately triggers an asynchronous process to remove
     * dependency on the old KMS key, such that the domain's data can only be accessed using the new KMS key. The
     * domain's <code>ServerSideEncryptionUpdateDetails</code> contains the details for this process.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side
     *        encryption of your data. Changing the domain's associated KMS key immediately triggers an asynchronous
     *        process to remove dependency on the old KMS key, such that the domain's data can only be accessed using
     *        the new KMS key. The domain's <code>ServerSideEncryptionUpdateDetails</code> contains the details for this
     *        process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainRequest withServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        setServerSideEncryptionConfiguration(serverSideEncryptionConfiguration);
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
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: ").append(getServerSideEncryptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainRequest == false)
            return false;
        UpdateDomainRequest other = (UpdateDomainRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(this.getServerSideEncryptionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 : getServerSideEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainRequest clone() {
        return (UpdateDomainRequest) super.clone();
    }

}
