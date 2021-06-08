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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data source credentials. This is a variant type structure. For this structure to be valid, only one of the attributes
 * can be non-null.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataSourceCredentials" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Credential pair. For more information, see <a>CredentialPair</a>.
     * </p>
     */
    private CredentialPair credentialPair;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use. When
     * <code>CopySourceArn</code> is not null, the credential pair from the data source in the ARN is used as the
     * credentials for the <code>DataSourceCredentials</code> structure.
     * </p>
     */
    private String copySourceArn;

    /**
     * <p>
     * Credential pair. For more information, see <a>CredentialPair</a>.
     * </p>
     * 
     * @param credentialPair
     *        Credential pair. For more information, see <a>CredentialPair</a>.
     */

    public void setCredentialPair(CredentialPair credentialPair) {
        this.credentialPair = credentialPair;
    }

    /**
     * <p>
     * Credential pair. For more information, see <a>CredentialPair</a>.
     * </p>
     * 
     * @return Credential pair. For more information, see <a>CredentialPair</a>.
     */

    public CredentialPair getCredentialPair() {
        return this.credentialPair;
    }

    /**
     * <p>
     * Credential pair. For more information, see <a>CredentialPair</a>.
     * </p>
     * 
     * @param credentialPair
     *        Credential pair. For more information, see <a>CredentialPair</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceCredentials withCredentialPair(CredentialPair credentialPair) {
        setCredentialPair(credentialPair);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use. When
     * <code>CopySourceArn</code> is not null, the credential pair from the data source in the ARN is used as the
     * credentials for the <code>DataSourceCredentials</code> structure.
     * </p>
     * 
     * @param copySourceArn
     *        The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use. When
     *        <code>CopySourceArn</code> is not null, the credential pair from the data source in the ARN is used as the
     *        credentials for the <code>DataSourceCredentials</code> structure.
     */

    public void setCopySourceArn(String copySourceArn) {
        this.copySourceArn = copySourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use. When
     * <code>CopySourceArn</code> is not null, the credential pair from the data source in the ARN is used as the
     * credentials for the <code>DataSourceCredentials</code> structure.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use. When
     *         <code>CopySourceArn</code> is not null, the credential pair from the data source in the ARN is used as
     *         the credentials for the <code>DataSourceCredentials</code> structure.
     */

    public String getCopySourceArn() {
        return this.copySourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use. When
     * <code>CopySourceArn</code> is not null, the credential pair from the data source in the ARN is used as the
     * credentials for the <code>DataSourceCredentials</code> structure.
     * </p>
     * 
     * @param copySourceArn
     *        The Amazon Resource Name (ARN) of a data source that has the credential pair that you want to use. When
     *        <code>CopySourceArn</code> is not null, the credential pair from the data source in the ARN is used as the
     *        credentials for the <code>DataSourceCredentials</code> structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceCredentials withCopySourceArn(String copySourceArn) {
        setCopySourceArn(copySourceArn);
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
        if (getCredentialPair() != null)
            sb.append("CredentialPair: ").append(getCredentialPair()).append(",");
        if (getCopySourceArn() != null)
            sb.append("CopySourceArn: ").append(getCopySourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceCredentials == false)
            return false;
        DataSourceCredentials other = (DataSourceCredentials) obj;
        if (other.getCredentialPair() == null ^ this.getCredentialPair() == null)
            return false;
        if (other.getCredentialPair() != null && other.getCredentialPair().equals(this.getCredentialPair()) == false)
            return false;
        if (other.getCopySourceArn() == null ^ this.getCopySourceArn() == null)
            return false;
        if (other.getCopySourceArn() != null && other.getCopySourceArn().equals(this.getCopySourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCredentialPair() == null) ? 0 : getCredentialPair().hashCode());
        hashCode = prime * hashCode + ((getCopySourceArn() == null) ? 0 : getCopySourceArn().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceCredentials clone() {
        try {
            return (DataSourceCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataSourceCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
