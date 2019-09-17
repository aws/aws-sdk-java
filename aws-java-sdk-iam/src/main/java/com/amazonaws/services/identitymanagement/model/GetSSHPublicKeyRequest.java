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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetSSHPublicKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSSHPublicKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     */
    private String sSHPublicKeyId;
    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format,
     * use <code>SSH</code>. To retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     */
    private String encoding;

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the IAM user associated with the SSH public key.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @return The name of the IAM user associated with the SSH public key.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *         include any of the following characters: _+=,.@-
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param userName
     *        The name of the IAM user associated with the SSH public key.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSSHPublicKeyRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * 
     * @param sSHPublicKeyId
     *        The unique identifier for the SSH public key.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     */

    public void setSSHPublicKeyId(String sSHPublicKeyId) {
        this.sSHPublicKeyId = sSHPublicKeyId;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * 
     * @return The unique identifier for the SSH public key.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters that can consist of any upper or lowercased letter or digit.
     */

    public String getSSHPublicKeyId() {
        return this.sSHPublicKeyId;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters that can consist of any upper or lowercased letter or digit.
     * </p>
     * 
     * @param sSHPublicKeyId
     *        The unique identifier for the SSH public key.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters that can consist of any upper or lowercased letter or digit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSSHPublicKeyRequest withSSHPublicKeyId(String sSHPublicKeyId) {
        setSSHPublicKeyId(sSHPublicKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format,
     * use <code>SSH</code>. To retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * 
     * @param encoding
     *        Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa
     *        format, use <code>SSH</code>. To retrieve the public key in PEM format, use <code>PEM</code>.
     * @see EncodingType
     */

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format,
     * use <code>SSH</code>. To retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * 
     * @return Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa
     *         format, use <code>SSH</code>. To retrieve the public key in PEM format, use <code>PEM</code>.
     * @see EncodingType
     */

    public String getEncoding() {
        return this.encoding;
    }

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format,
     * use <code>SSH</code>. To retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * 
     * @param encoding
     *        Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa
     *        format, use <code>SSH</code>. To retrieve the public key in PEM format, use <code>PEM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncodingType
     */

    public GetSSHPublicKeyRequest withEncoding(String encoding) {
        setEncoding(encoding);
        return this;
    }

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format,
     * use <code>SSH</code>. To retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * 
     * @param encoding
     *        Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa
     *        format, use <code>SSH</code>. To retrieve the public key in PEM format, use <code>PEM</code>.
     * @see EncodingType
     */

    public void setEncoding(EncodingType encoding) {
        withEncoding(encoding);
    }

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format,
     * use <code>SSH</code>. To retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * 
     * @param encoding
     *        Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa
     *        format, use <code>SSH</code>. To retrieve the public key in PEM format, use <code>PEM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncodingType
     */

    public GetSSHPublicKeyRequest withEncoding(EncodingType encoding) {
        this.encoding = encoding.toString();
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getSSHPublicKeyId() != null)
            sb.append("SSHPublicKeyId: ").append(getSSHPublicKeyId()).append(",");
        if (getEncoding() != null)
            sb.append("Encoding: ").append(getEncoding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSSHPublicKeyRequest == false)
            return false;
        GetSSHPublicKeyRequest other = (GetSSHPublicKeyRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getSSHPublicKeyId() == null ^ this.getSSHPublicKeyId() == null)
            return false;
        if (other.getSSHPublicKeyId() != null && other.getSSHPublicKeyId().equals(this.getSSHPublicKeyId()) == false)
            return false;
        if (other.getEncoding() == null ^ this.getEncoding() == null)
            return false;
        if (other.getEncoding() != null && other.getEncoding().equals(this.getEncoding()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getSSHPublicKeyId() == null) ? 0 : getSSHPublicKeyId().hashCode());
        hashCode = prime * hashCode + ((getEncoding() == null) ? 0 : getEncoding().hashCode());
        return hashCode;
    }

    @Override
    public GetSSHPublicKeyRequest clone() {
        return (GetSSHPublicKeyRequest) super.clone();
    }

}
