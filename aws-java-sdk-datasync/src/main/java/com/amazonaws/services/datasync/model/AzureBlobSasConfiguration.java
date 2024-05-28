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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The shared access signature (SAS) configuration that allows DataSync to access your Microsoft Azure Blob Storage.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/datasync/latest/userguide/creating-azure-blob-location.html#azure-blob-sas-tokens">SAS
 * tokens</a> for accessing your Azure Blob Storage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/AzureBlobSasConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AzureBlobSasConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies a SAS token that provides permissions to access your Azure Blob Storage.
     * </p>
     * <p>
     * The token is part of the SAS URI string that comes after the storage resource URI and a question mark. A token
     * looks something like this:
     * </p>
     * <p>
     * <code>sp=r&amp;st=2023-12-20T14:54:52Z&amp;se=2023-12-20T22:54:52Z&amp;spr=https&amp;sv=2021-06-08&amp;sr=c&amp;sig=aBBKDWQvyuVcTPH9EBp%2FXTI9E%2F%2Fmq171%2BZU178wcwqU%3D</code>
     * </p>
     */
    private String token;

    /**
     * <p>
     * Specifies a SAS token that provides permissions to access your Azure Blob Storage.
     * </p>
     * <p>
     * The token is part of the SAS URI string that comes after the storage resource URI and a question mark. A token
     * looks something like this:
     * </p>
     * <p>
     * <code>sp=r&amp;st=2023-12-20T14:54:52Z&amp;se=2023-12-20T22:54:52Z&amp;spr=https&amp;sv=2021-06-08&amp;sr=c&amp;sig=aBBKDWQvyuVcTPH9EBp%2FXTI9E%2F%2Fmq171%2BZU178wcwqU%3D</code>
     * </p>
     * 
     * @param token
     *        Specifies a SAS token that provides permissions to access your Azure Blob Storage.</p>
     *        <p>
     *        The token is part of the SAS URI string that comes after the storage resource URI and a question mark. A
     *        token looks something like this:
     *        </p>
     *        <p>
     *        <code>sp=r&amp;st=2023-12-20T14:54:52Z&amp;se=2023-12-20T22:54:52Z&amp;spr=https&amp;sv=2021-06-08&amp;sr=c&amp;sig=aBBKDWQvyuVcTPH9EBp%2FXTI9E%2F%2Fmq171%2BZU178wcwqU%3D</code>
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * Specifies a SAS token that provides permissions to access your Azure Blob Storage.
     * </p>
     * <p>
     * The token is part of the SAS URI string that comes after the storage resource URI and a question mark. A token
     * looks something like this:
     * </p>
     * <p>
     * <code>sp=r&amp;st=2023-12-20T14:54:52Z&amp;se=2023-12-20T22:54:52Z&amp;spr=https&amp;sv=2021-06-08&amp;sr=c&amp;sig=aBBKDWQvyuVcTPH9EBp%2FXTI9E%2F%2Fmq171%2BZU178wcwqU%3D</code>
     * </p>
     * 
     * @return Specifies a SAS token that provides permissions to access your Azure Blob Storage.</p>
     *         <p>
     *         The token is part of the SAS URI string that comes after the storage resource URI and a question mark. A
     *         token looks something like this:
     *         </p>
     *         <p>
     *         <code>sp=r&amp;st=2023-12-20T14:54:52Z&amp;se=2023-12-20T22:54:52Z&amp;spr=https&amp;sv=2021-06-08&amp;sr=c&amp;sig=aBBKDWQvyuVcTPH9EBp%2FXTI9E%2F%2Fmq171%2BZU178wcwqU%3D</code>
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * Specifies a SAS token that provides permissions to access your Azure Blob Storage.
     * </p>
     * <p>
     * The token is part of the SAS URI string that comes after the storage resource URI and a question mark. A token
     * looks something like this:
     * </p>
     * <p>
     * <code>sp=r&amp;st=2023-12-20T14:54:52Z&amp;se=2023-12-20T22:54:52Z&amp;spr=https&amp;sv=2021-06-08&amp;sr=c&amp;sig=aBBKDWQvyuVcTPH9EBp%2FXTI9E%2F%2Fmq171%2BZU178wcwqU%3D</code>
     * </p>
     * 
     * @param token
     *        Specifies a SAS token that provides permissions to access your Azure Blob Storage.</p>
     *        <p>
     *        The token is part of the SAS URI string that comes after the storage resource URI and a question mark. A
     *        token looks something like this:
     *        </p>
     *        <p>
     *        <code>sp=r&amp;st=2023-12-20T14:54:52Z&amp;se=2023-12-20T22:54:52Z&amp;spr=https&amp;sv=2021-06-08&amp;sr=c&amp;sig=aBBKDWQvyuVcTPH9EBp%2FXTI9E%2F%2Fmq171%2BZU178wcwqU%3D</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AzureBlobSasConfiguration withToken(String token) {
        setToken(token);
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
        if (getToken() != null)
            sb.append("Token: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AzureBlobSasConfiguration == false)
            return false;
        AzureBlobSasConfiguration other = (AzureBlobSasConfiguration) obj;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        return hashCode;
    }

    @Override
    public AzureBlobSasConfiguration clone() {
        try {
            return (AzureBlobSasConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.AzureBlobSasConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
