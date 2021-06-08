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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/UpdateDatabase" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDatabaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The identifier of the new KMS key (<code>KmsKeyId</code>) to be used to encrypt the data stored in the database.
     * If the <code>KmsKeyId</code> currently registered with the database is the same as the <code>KmsKeyId</code> in
     * the request, there will not be any update.
     * </p>
     * <p>
     * You can specify the <code>KmsKeyId</code> using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-1:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @param databaseName
     *        The name of the database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @return The name of the database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @param databaseName
     *        The name of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatabaseRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The identifier of the new KMS key (<code>KmsKeyId</code>) to be used to encrypt the data stored in the database.
     * If the <code>KmsKeyId</code> currently registered with the database is the same as the <code>KmsKeyId</code> in
     * the request, there will not be any update.
     * </p>
     * <p>
     * You can specify the <code>KmsKeyId</code> using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-1:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The identifier of the new KMS key (<code>KmsKeyId</code>) to be used to encrypt the data stored in the
     *        database. If the <code>KmsKeyId</code> currently registered with the database is the same as the
     *        <code>KmsKeyId</code> in the request, there will not be any update. </p>
     *        <p>
     *        You can specify the <code>KmsKeyId</code> using any of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name: <code>alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN: <code>arn:aws:kms:us-east-1:111122223333:alias/ExampleAlias</code>
     *        </p>
     *        </li>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the new KMS key (<code>KmsKeyId</code>) to be used to encrypt the data stored in the database.
     * If the <code>KmsKeyId</code> currently registered with the database is the same as the <code>KmsKeyId</code> in
     * the request, there will not be any update.
     * </p>
     * <p>
     * You can specify the <code>KmsKeyId</code> using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-1:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the new KMS key (<code>KmsKeyId</code>) to be used to encrypt the data stored in the
     *         database. If the <code>KmsKeyId</code> currently registered with the database is the same as the
     *         <code>KmsKeyId</code> in the request, there will not be any update. </p>
     *         <p>
     *         You can specify the <code>KmsKeyId</code> using any of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN: <code>arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name: <code>alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN: <code>arn:aws:kms:us-east-1:111122223333:alias/ExampleAlias</code>
     *         </p>
     *         </li>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the new KMS key (<code>KmsKeyId</code>) to be used to encrypt the data stored in the database.
     * If the <code>KmsKeyId</code> currently registered with the database is the same as the <code>KmsKeyId</code> in
     * the request, there will not be any update.
     * </p>
     * <p>
     * You can specify the <code>KmsKeyId</code> using any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-1:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The identifier of the new KMS key (<code>KmsKeyId</code>) to be used to encrypt the data stored in the
     *        database. If the <code>KmsKeyId</code> currently registered with the database is the same as the
     *        <code>KmsKeyId</code> in the request, there will not be any update. </p>
     *        <p>
     *        You can specify the <code>KmsKeyId</code> using any of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name: <code>alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN: <code>arn:aws:kms:us-east-1:111122223333:alias/ExampleAlias</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatabaseRequest withKmsKeyId(String kmsKeyId) {
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
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

        if (obj instanceof UpdateDatabaseRequest == false)
            return false;
        UpdateDatabaseRequest other = (UpdateDatabaseRequest) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
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

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDatabaseRequest clone() {
        return (UpdateDatabaseRequest) super.clone();
    }

}
