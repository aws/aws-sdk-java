/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetSecretValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSecretValueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource
     * Name (ARN) or the friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     */
    private String secretId;
    /**
     * <p>
     * Specifies the unique identifier of the version of the secret that you want to retrieve. If you specify this
     * parameter then don't specify <code>VersionStage</code>. If you don't specify either a <code>VersionStage</code>
     * or <code>VersionId</code> then the default is to perform the operation on the version with the
     * <code>VersionStage</code> value of <code>AWSCURRENT</code>.
     * </p>
     * <p>
     * This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value
     * with 32 hexadecimal digits.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * Specifies the secret version that you want to retrieve by the staging label attached to the version.
     * </p>
     * <p>
     * Staging labels are used to keep track of different versions during the rotation process. If you use this
     * parameter then don't specify <code>VersionId</code>. If you don't specify either a <code>VersionStage</code> or
     * <code>VersionId</code>, then the default is to perform the operation on the version with the
     * <code>VersionStage</code> value of <code>AWSCURRENT</code>.
     * </p>
     */
    private String versionStage;

    /**
     * <p>
     * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource
     * Name (ARN) or the friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     * 
     * @param secretId
     *        Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon
     *        Resource Name (ARN) or the friendly name of the secret.</p> <note>
     *        <p>
     *        If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial
     *        ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager
     *        adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it
     *        uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six
     *        characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that
     *        as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete
     *        ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t
     *        create secret names that end with a hyphen followed by six characters.
     *        </p>
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource
     * Name (ARN) or the friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     * 
     * @return Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon
     *         Resource Name (ARN) or the friendly name of the secret.</p> <note>
     *         <p>
     *         If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial
     *         ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager
     *         adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it
     *         uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by
     *         six characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use
     *         that as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a
     *         complete ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you
     *         don’t create secret names that end with a hyphen followed by six characters.
     *         </p>
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource
     * Name (ARN) or the friendly name of the secret.
     * </p>
     * <note>
     * <p>
     * If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial ARN
     * too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager adds at the
     * end of the ARN when you created the secret. A partial ARN match can work as long as it uniquely matches only one
     * secret. However, if your secret has a name that ends in a hyphen followed by six characters (before Secrets
     * Manager adds the hyphen and six characters to the ARN) and you try to use that as a partial ARN, then those
     * characters cause Secrets Manager to assume that you’re specifying a complete ARN. This confusion can cause
     * unexpected results. To avoid this situation, we recommend that you don’t create secret names that end with a
     * hyphen followed by six characters.
     * </p>
     * </note>
     * 
     * @param secretId
     *        Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon
     *        Resource Name (ARN) or the friendly name of the secret.</p> <note>
     *        <p>
     *        If you specify an ARN, we generally recommend that you specify a complete ARN. You can specify a partial
     *        ARN too—for example, if you don’t include the final hyphen and six random characters that Secrets Manager
     *        adds at the end of the ARN when you created the secret. A partial ARN match can work as long as it
     *        uniquely matches only one secret. However, if your secret has a name that ends in a hyphen followed by six
     *        characters (before Secrets Manager adds the hyphen and six characters to the ARN) and you try to use that
     *        as a partial ARN, then those characters cause Secrets Manager to assume that you’re specifying a complete
     *        ARN. This confusion can cause unexpected results. To avoid this situation, we recommend that you don’t
     *        create secret names that end with a hyphen followed by six characters.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecretValueRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * Specifies the unique identifier of the version of the secret that you want to retrieve. If you specify this
     * parameter then don't specify <code>VersionStage</code>. If you don't specify either a <code>VersionStage</code>
     * or <code>VersionId</code> then the default is to perform the operation on the version with the
     * <code>VersionStage</code> value of <code>AWSCURRENT</code>.
     * </p>
     * <p>
     * This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value
     * with 32 hexadecimal digits.
     * </p>
     * 
     * @param versionId
     *        Specifies the unique identifier of the version of the secret that you want to retrieve. If you specify
     *        this parameter then don't specify <code>VersionStage</code>. If you don't specify either a
     *        <code>VersionStage</code> or <code>VersionId</code> then the default is to perform the operation on the
     *        version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p>
     *        <p>
     *        This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a>
     *        value with 32 hexadecimal digits.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Specifies the unique identifier of the version of the secret that you want to retrieve. If you specify this
     * parameter then don't specify <code>VersionStage</code>. If you don't specify either a <code>VersionStage</code>
     * or <code>VersionId</code> then the default is to perform the operation on the version with the
     * <code>VersionStage</code> value of <code>AWSCURRENT</code>.
     * </p>
     * <p>
     * This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value
     * with 32 hexadecimal digits.
     * </p>
     * 
     * @return Specifies the unique identifier of the version of the secret that you want to retrieve. If you specify
     *         this parameter then don't specify <code>VersionStage</code>. If you don't specify either a
     *         <code>VersionStage</code> or <code>VersionId</code> then the default is to perform the operation on the
     *         version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p>
     *         <p>
     *         This value is typically a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value with 32 hexadecimal
     *         digits.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * Specifies the unique identifier of the version of the secret that you want to retrieve. If you specify this
     * parameter then don't specify <code>VersionStage</code>. If you don't specify either a <code>VersionStage</code>
     * or <code>VersionId</code> then the default is to perform the operation on the version with the
     * <code>VersionStage</code> value of <code>AWSCURRENT</code>.
     * </p>
     * <p>
     * This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a> value
     * with 32 hexadecimal digits.
     * </p>
     * 
     * @param versionId
     *        Specifies the unique identifier of the version of the secret that you want to retrieve. If you specify
     *        this parameter then don't specify <code>VersionStage</code>. If you don't specify either a
     *        <code>VersionStage</code> or <code>VersionId</code> then the default is to perform the operation on the
     *        version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.</p>
     *        <p>
     *        This value is typically a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID-type</a>
     *        value with 32 hexadecimal digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecretValueRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * Specifies the secret version that you want to retrieve by the staging label attached to the version.
     * </p>
     * <p>
     * Staging labels are used to keep track of different versions during the rotation process. If you use this
     * parameter then don't specify <code>VersionId</code>. If you don't specify either a <code>VersionStage</code> or
     * <code>VersionId</code>, then the default is to perform the operation on the version with the
     * <code>VersionStage</code> value of <code>AWSCURRENT</code>.
     * </p>
     * 
     * @param versionStage
     *        Specifies the secret version that you want to retrieve by the staging label attached to the version.</p>
     *        <p>
     *        Staging labels are used to keep track of different versions during the rotation process. If you use this
     *        parameter then don't specify <code>VersionId</code>. If you don't specify either a
     *        <code>VersionStage</code> or <code>VersionId</code>, then the default is to perform the operation on the
     *        version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.
     */

    public void setVersionStage(String versionStage) {
        this.versionStage = versionStage;
    }

    /**
     * <p>
     * Specifies the secret version that you want to retrieve by the staging label attached to the version.
     * </p>
     * <p>
     * Staging labels are used to keep track of different versions during the rotation process. If you use this
     * parameter then don't specify <code>VersionId</code>. If you don't specify either a <code>VersionStage</code> or
     * <code>VersionId</code>, then the default is to perform the operation on the version with the
     * <code>VersionStage</code> value of <code>AWSCURRENT</code>.
     * </p>
     * 
     * @return Specifies the secret version that you want to retrieve by the staging label attached to the version.</p>
     *         <p>
     *         Staging labels are used to keep track of different versions during the rotation process. If you use this
     *         parameter then don't specify <code>VersionId</code>. If you don't specify either a
     *         <code>VersionStage</code> or <code>VersionId</code>, then the default is to perform the operation on the
     *         version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.
     */

    public String getVersionStage() {
        return this.versionStage;
    }

    /**
     * <p>
     * Specifies the secret version that you want to retrieve by the staging label attached to the version.
     * </p>
     * <p>
     * Staging labels are used to keep track of different versions during the rotation process. If you use this
     * parameter then don't specify <code>VersionId</code>. If you don't specify either a <code>VersionStage</code> or
     * <code>VersionId</code>, then the default is to perform the operation on the version with the
     * <code>VersionStage</code> value of <code>AWSCURRENT</code>.
     * </p>
     * 
     * @param versionStage
     *        Specifies the secret version that you want to retrieve by the staging label attached to the version.</p>
     *        <p>
     *        Staging labels are used to keep track of different versions during the rotation process. If you use this
     *        parameter then don't specify <code>VersionId</code>. If you don't specify either a
     *        <code>VersionStage</code> or <code>VersionId</code>, then the default is to perform the operation on the
     *        version with the <code>VersionStage</code> value of <code>AWSCURRENT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecretValueRequest withVersionStage(String versionStage) {
        setVersionStage(versionStage);
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
        if (getSecretId() != null)
            sb.append("SecretId: ").append(getSecretId()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getVersionStage() != null)
            sb.append("VersionStage: ").append(getVersionStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSecretValueRequest == false)
            return false;
        GetSecretValueRequest other = (GetSecretValueRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getVersionStage() == null ^ this.getVersionStage() == null)
            return false;
        if (other.getVersionStage() != null && other.getVersionStage().equals(this.getVersionStage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getVersionStage() == null) ? 0 : getVersionStage().hashCode());
        return hashCode;
    }

    @Override
    public GetSecretValueRequest clone() {
        return (GetSecretValueRequest) super.clone();
    }

}
