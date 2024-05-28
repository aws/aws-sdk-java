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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKxEnvironmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the kdb environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the kdb environment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * A description for the kdb environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN identifier of the environment.
     * </p>
     */
    private String environmentArn;
    /**
     * <p>
     * The KMS key ID to encrypt your data in the FinSpace environment.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The timestamp at which the kdb environment was created in FinSpace.
     * </p>
     */
    private java.util.Date creationTimestamp;

    /**
     * <p>
     * The name of the kdb environment.
     * </p>
     * 
     * @param name
     *        The name of the kdb environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the kdb environment.
     * </p>
     * 
     * @return The name of the kdb environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the kdb environment.
     * </p>
     * 
     * @param name
     *        The name of the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxEnvironmentResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the kdb environment.
     * </p>
     * 
     * @param status
     *        The status of the kdb environment.
     * @see EnvironmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the kdb environment.
     * </p>
     * 
     * @return The status of the kdb environment.
     * @see EnvironmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the kdb environment.
     * </p>
     * 
     * @param status
     *        The status of the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public CreateKxEnvironmentResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the kdb environment.
     * </p>
     * 
     * @param status
     *        The status of the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public CreateKxEnvironmentResult withStatus(EnvironmentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @return A unique identifier for the kdb environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxEnvironmentResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * A description for the kdb environment.
     * </p>
     * 
     * @param description
     *        A description for the kdb environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the kdb environment.
     * </p>
     * 
     * @return A description for the kdb environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the kdb environment.
     * </p>
     * 
     * @param description
     *        A description for the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxEnvironmentResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN identifier of the environment.
     * </p>
     * 
     * @param environmentArn
     *        The ARN identifier of the environment.
     */

    public void setEnvironmentArn(String environmentArn) {
        this.environmentArn = environmentArn;
    }

    /**
     * <p>
     * The ARN identifier of the environment.
     * </p>
     * 
     * @return The ARN identifier of the environment.
     */

    public String getEnvironmentArn() {
        return this.environmentArn;
    }

    /**
     * <p>
     * The ARN identifier of the environment.
     * </p>
     * 
     * @param environmentArn
     *        The ARN identifier of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxEnvironmentResult withEnvironmentArn(String environmentArn) {
        setEnvironmentArn(environmentArn);
        return this;
    }

    /**
     * <p>
     * The KMS key ID to encrypt your data in the FinSpace environment.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key ID to encrypt your data in the FinSpace environment.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key ID to encrypt your data in the FinSpace environment.
     * </p>
     * 
     * @return The KMS key ID to encrypt your data in the FinSpace environment.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key ID to encrypt your data in the FinSpace environment.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key ID to encrypt your data in the FinSpace environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxEnvironmentResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the kdb environment was created in FinSpace.
     * </p>
     * 
     * @param creationTimestamp
     *        The timestamp at which the kdb environment was created in FinSpace.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the kdb environment was created in FinSpace.
     * </p>
     * 
     * @return The timestamp at which the kdb environment was created in FinSpace.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the kdb environment was created in FinSpace.
     * </p>
     * 
     * @param creationTimestamp
     *        The timestamp at which the kdb environment was created in FinSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxEnvironmentResult withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnvironmentArn() != null)
            sb.append("EnvironmentArn: ").append(getEnvironmentArn()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKxEnvironmentResult == false)
            return false;
        CreateKxEnvironmentResult other = (CreateKxEnvironmentResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnvironmentArn() == null ^ this.getEnvironmentArn() == null)
            return false;
        if (other.getEnvironmentArn() != null && other.getEnvironmentArn().equals(this.getEnvironmentArn()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentArn() == null) ? 0 : getEnvironmentArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public CreateKxEnvironmentResult clone() {
        try {
            return (CreateKxEnvironmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
