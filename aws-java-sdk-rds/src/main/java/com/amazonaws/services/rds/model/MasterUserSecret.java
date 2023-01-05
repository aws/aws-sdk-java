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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the secret managed by RDS in Amazon Web Services Secrets Manager for the master user password.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password management with
 * Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide</i> and <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html">Password management with
 * Amazon Web Services Secrets Manager</a> in the <i>Amazon Aurora User Guide.</i>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/MasterUserSecret" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MasterUserSecret implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * The status of the secret.
     * </p>
     * <p>
     * The possible status values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>creating</code> - The secret is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>active</code> - The secret is available for normal use and rotation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rotating</code> - The secret is being rotated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>impaired</code> - The secret can be used to access database credentials, but it can't be rotated. A secret
     * might have this status if, for example, permissions are changed so that RDS can no longer access either the
     * secret or the KMS key for the secret.
     * </p>
     * <p>
     * When a secret has this status, you can correct the condition that caused the status. Alternatively, modify the DB
     * instance to turn off automatic management of database credentials, and then modify the DB instance again to turn
     * on automatic management of database credentials.
     * </p>
     * </li>
     * </ul>
     */
    private String secretStatus;
    /**
     * <p>
     * The Amazon Web Services KMS key identifier that is used to encrypt the secret.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of the secret.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the secret.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the secret.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MasterUserSecret withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * The status of the secret.
     * </p>
     * <p>
     * The possible status values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>creating</code> - The secret is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>active</code> - The secret is available for normal use and rotation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rotating</code> - The secret is being rotated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>impaired</code> - The secret can be used to access database credentials, but it can't be rotated. A secret
     * might have this status if, for example, permissions are changed so that RDS can no longer access either the
     * secret or the KMS key for the secret.
     * </p>
     * <p>
     * When a secret has this status, you can correct the condition that caused the status. Alternatively, modify the DB
     * instance to turn off automatic management of database credentials, and then modify the DB instance again to turn
     * on automatic management of database credentials.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretStatus
     *        The status of the secret.</p>
     *        <p>
     *        The possible status values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>creating</code> - The secret is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>active</code> - The secret is available for normal use and rotation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rotating</code> - The secret is being rotated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>impaired</code> - The secret can be used to access database credentials, but it can't be rotated. A
     *        secret might have this status if, for example, permissions are changed so that RDS can no longer access
     *        either the secret or the KMS key for the secret.
     *        </p>
     *        <p>
     *        When a secret has this status, you can correct the condition that caused the status. Alternatively, modify
     *        the DB instance to turn off automatic management of database credentials, and then modify the DB instance
     *        again to turn on automatic management of database credentials.
     *        </p>
     *        </li>
     */

    public void setSecretStatus(String secretStatus) {
        this.secretStatus = secretStatus;
    }

    /**
     * <p>
     * The status of the secret.
     * </p>
     * <p>
     * The possible status values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>creating</code> - The secret is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>active</code> - The secret is available for normal use and rotation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rotating</code> - The secret is being rotated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>impaired</code> - The secret can be used to access database credentials, but it can't be rotated. A secret
     * might have this status if, for example, permissions are changed so that RDS can no longer access either the
     * secret or the KMS key for the secret.
     * </p>
     * <p>
     * When a secret has this status, you can correct the condition that caused the status. Alternatively, modify the DB
     * instance to turn off automatic management of database credentials, and then modify the DB instance again to turn
     * on automatic management of database credentials.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the secret.</p>
     *         <p>
     *         The possible status values include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>creating</code> - The secret is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>active</code> - The secret is available for normal use and rotation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rotating</code> - The secret is being rotated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>impaired</code> - The secret can be used to access database credentials, but it can't be rotated. A
     *         secret might have this status if, for example, permissions are changed so that RDS can no longer access
     *         either the secret or the KMS key for the secret.
     *         </p>
     *         <p>
     *         When a secret has this status, you can correct the condition that caused the status. Alternatively,
     *         modify the DB instance to turn off automatic management of database credentials, and then modify the DB
     *         instance again to turn on automatic management of database credentials.
     *         </p>
     *         </li>
     */

    public String getSecretStatus() {
        return this.secretStatus;
    }

    /**
     * <p>
     * The status of the secret.
     * </p>
     * <p>
     * The possible status values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>creating</code> - The secret is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>active</code> - The secret is available for normal use and rotation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rotating</code> - The secret is being rotated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>impaired</code> - The secret can be used to access database credentials, but it can't be rotated. A secret
     * might have this status if, for example, permissions are changed so that RDS can no longer access either the
     * secret or the KMS key for the secret.
     * </p>
     * <p>
     * When a secret has this status, you can correct the condition that caused the status. Alternatively, modify the DB
     * instance to turn off automatic management of database credentials, and then modify the DB instance again to turn
     * on automatic management of database credentials.
     * </p>
     * </li>
     * </ul>
     * 
     * @param secretStatus
     *        The status of the secret.</p>
     *        <p>
     *        The possible status values include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>creating</code> - The secret is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>active</code> - The secret is available for normal use and rotation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rotating</code> - The secret is being rotated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>impaired</code> - The secret can be used to access database credentials, but it can't be rotated. A
     *        secret might have this status if, for example, permissions are changed so that RDS can no longer access
     *        either the secret or the KMS key for the secret.
     *        </p>
     *        <p>
     *        When a secret has this status, you can correct the condition that caused the status. Alternatively, modify
     *        the DB instance to turn off automatic management of database credentials, and then modify the DB instance
     *        again to turn on automatic management of database credentials.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MasterUserSecret withSecretStatus(String secretStatus) {
        setSecretStatus(secretStatus);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier that is used to encrypt the secret.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier that is used to encrypt the secret.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier that is used to encrypt the secret.
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier that is used to encrypt the secret.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier that is used to encrypt the secret.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier that is used to encrypt the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MasterUserSecret withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getSecretStatus() != null)
            sb.append("SecretStatus: ").append(getSecretStatus()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MasterUserSecret == false)
            return false;
        MasterUserSecret other = (MasterUserSecret) obj;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getSecretStatus() == null ^ this.getSecretStatus() == null)
            return false;
        if (other.getSecretStatus() != null && other.getSecretStatus().equals(this.getSecretStatus()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getSecretStatus() == null) ? 0 : getSecretStatus().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public MasterUserSecret clone() {
        try {
            return (MasterUserSecret) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
