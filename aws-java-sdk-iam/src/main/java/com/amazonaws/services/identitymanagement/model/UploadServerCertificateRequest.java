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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UploadServerCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadServerCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The path for the server certificate. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its
     * <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters consisting of either a
     * forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (\u0021) through the DEL character (\u007F), including most punctuation
     * characters, digits, and upper and lowercased letters.
     * </p>
     * <note>
     * <p>
     * If you are uploading a server certificate specifically for use with Amazon CloudFront distributions, you must
     * specify a path using the <code>path</code> parameter. The path must begin with <code>/cloudfront</code> and must
     * include a trailing slash (for example, <code>/cloudfront/test/</code>).
     * </p>
     * </note>
     */
    private String path;
    /**
     * <p>
     * The name for the server certificate. Do not include the path in this value. The name of the certificate cannot
     * contain any spaces.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     */
    private String serverCertificateName;
    /**
     * <p>
     * The contents of the public key certificate in PEM-encoded format.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     */
    private String certificateBody;
    /**
     * <p>
     * The contents of the private key in PEM-encoded format.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     */
    private String privateKey;
    /**
     * <p>
     * The contents of the certificate chain. This is typically a concatenation of the PEM-encoded public key
     * certificates of the chain.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     */
    private String certificateChain;

    /**
     * Default constructor for UploadServerCertificateRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public UploadServerCertificateRequest() {
    }

    /**
     * Constructs a new UploadServerCertificateRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param serverCertificateName
     *        The name for the server certificate. Do not include the path in this value. The name of the certificate
     *        cannot contain any spaces.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @param certificateBody
     *        The contents of the public key certificate in PEM-encoded format.
     *        </p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     * @param privateKey
     *        The contents of the private key in PEM-encoded format.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     */
    public UploadServerCertificateRequest(String serverCertificateName, String certificateBody, String privateKey) {
        setServerCertificateName(serverCertificateName);
        setCertificateBody(certificateBody);
        setPrivateKey(privateKey);
    }

    /**
     * <p>
     * The path for the server certificate. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its
     * <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters consisting of either a
     * forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (\u0021) through the DEL character (\u007F), including most punctuation
     * characters, digits, and upper and lowercased letters.
     * </p>
     * <note>
     * <p>
     * If you are uploading a server certificate specifically for use with Amazon CloudFront distributions, you must
     * specify a path using the <code>path</code> parameter. The path must begin with <code>/cloudfront</code> and must
     * include a trailing slash (for example, <code>/cloudfront/test/</code>).
     * </p>
     * </note>
     * 
     * @param path
     *        The path for the server certificate. For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows
     *        (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters
     *        consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     *        slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character
     *        (\u007F), including most punctuation characters, digits, and upper and lowercased letters.
     *        </p>
     *        <note>
     *        <p>
     *        If you are uploading a server certificate specifically for use with Amazon CloudFront distributions, you
     *        must specify a path using the <code>path</code> parameter. The path must begin with
     *        <code>/cloudfront</code> and must include a trailing slash (for example, <code>/cloudfront/test/</code>).
     *        </p>
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path for the server certificate. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its
     * <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters consisting of either a
     * forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (\u0021) through the DEL character (\u007F), including most punctuation
     * characters, digits, and upper and lowercased letters.
     * </p>
     * <note>
     * <p>
     * If you are uploading a server certificate specifically for use with Amazon CloudFront distributions, you must
     * specify a path using the <code>path</code> parameter. The path must begin with <code>/cloudfront</code> and must
     * include a trailing slash (for example, <code>/cloudfront/test/</code>).
     * </p>
     * </note>
     * 
     * @return The path for the server certificate. For more information about paths, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>IAM User Guide</i>.</p>
     *         <p>
     *         This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows
     *         (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters
     *         consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     *         slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character
     *         (\u007F), including most punctuation characters, digits, and upper and lowercased letters.
     *         </p>
     *         <note>
     *         <p>
     *         If you are uploading a server certificate specifically for use with Amazon CloudFront distributions, you
     *         must specify a path using the <code>path</code> parameter. The path must begin with
     *         <code>/cloudfront</code> and must include a trailing slash (for example, <code>/cloudfront/test/</code>).
     *         </p>
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path for the server certificate. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its
     * <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters consisting of either a
     * forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain
     * any ASCII character from the ! (\u0021) through the DEL character (\u007F), including most punctuation
     * characters, digits, and upper and lowercased letters.
     * </p>
     * <note>
     * <p>
     * If you are uploading a server certificate specifically for use with Amazon CloudFront distributions, you must
     * specify a path using the <code>path</code> parameter. The path must begin with <code>/cloudfront</code> and must
     * include a trailing slash (for example, <code>/cloudfront/test/</code>).
     * </p>
     * </note>
     * 
     * @param path
     *        The path for the server certificate. For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows
     *        (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters
     *        consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     *        slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character
     *        (\u007F), including most punctuation characters, digits, and upper and lowercased letters.
     *        </p>
     *        <note>
     *        <p>
     *        If you are uploading a server certificate specifically for use with Amazon CloudFront distributions, you
     *        must specify a path using the <code>path</code> parameter. The path must begin with
     *        <code>/cloudfront</code> and must include a trailing slash (for example, <code>/cloudfront/test/</code>).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadServerCertificateRequest withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The name for the server certificate. Do not include the path in this value. The name of the certificate cannot
     * contain any spaces.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param serverCertificateName
     *        The name for the server certificate. Do not include the path in this value. The name of the certificate
     *        cannot contain any spaces.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     */

    public void setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
    }

    /**
     * <p>
     * The name for the server certificate. Do not include the path in this value. The name of the certificate cannot
     * contain any spaces.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @return The name for the server certificate. Do not include the path in this value. The name of the certificate
     *         cannot contain any spaces.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *         include any of the following characters: _+=,.@-
     */

    public String getServerCertificateName() {
        return this.serverCertificateName;
    }

    /**
     * <p>
     * The name for the server certificate. Do not include the path in this value. The name of the certificate cannot
     * contain any spaces.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * 
     * @param serverCertificateName
     *        The name for the server certificate. Do not include the path in this value. The name of the certificate
     *        cannot contain any spaces.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadServerCertificateRequest withServerCertificateName(String serverCertificateName) {
        setServerCertificateName(serverCertificateName);
        return this;
    }

    /**
     * <p>
     * The contents of the public key certificate in PEM-encoded format.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateBody
     *        The contents of the public key certificate in PEM-encoded format.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     */

    public void setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
    }

    /**
     * <p>
     * The contents of the public key certificate in PEM-encoded format.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @return The contents of the public key certificate in PEM-encoded format.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *         string of characters consisting of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *         range
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The special characters tab ( ), line feed ( ), and carriage return ( )
     *         </p>
     *         </li>
     */

    public String getCertificateBody() {
        return this.certificateBody;
    }

    /**
     * <p>
     * The contents of the public key certificate in PEM-encoded format.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateBody
     *        The contents of the public key certificate in PEM-encoded format.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadServerCertificateRequest withCertificateBody(String certificateBody) {
        setCertificateBody(certificateBody);
        return this;
    }

    /**
     * <p>
     * The contents of the private key in PEM-encoded format.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @param privateKey
     *        The contents of the private key in PEM-encoded format.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     */

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>
     * The contents of the private key in PEM-encoded format.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @return The contents of the private key in PEM-encoded format.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *         string of characters consisting of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *         range
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The special characters tab ( ), line feed ( ), and carriage return ( )
     *         </p>
     *         </li>
     */

    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * <p>
     * The contents of the private key in PEM-encoded format.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @param privateKey
     *        The contents of the private key in PEM-encoded format.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadServerCertificateRequest withPrivateKey(String privateKey) {
        setPrivateKey(privateKey);
        return this;
    }

    /**
     * <p>
     * The contents of the certificate chain. This is typically a concatenation of the PEM-encoded public key
     * certificates of the chain.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateChain
     *        The contents of the certificate chain. This is typically a concatenation of the PEM-encoded public key
     *        certificates of the chain.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     */

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * The contents of the certificate chain. This is typically a concatenation of the PEM-encoded public key
     * certificates of the chain.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @return The contents of the certificate chain. This is typically a concatenation of the PEM-encoded public key
     *         certificates of the chain.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *         string of characters consisting of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *         range
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The special characters tab ( ), line feed ( ), and carriage return ( )
     *         </p>
     *         </li>
     */

    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * The contents of the certificate chain. This is typically a concatenation of the PEM-encoded public key
     * certificates of the chain.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @param certificateChain
     *        The contents of the certificate chain. This is typically a concatenation of the PEM-encoded public key
     *        certificates of the chain.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadServerCertificateRequest withCertificateChain(String certificateChain) {
        setCertificateChain(certificateChain);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getServerCertificateName() != null)
            sb.append("ServerCertificateName: ").append(getServerCertificateName()).append(",");
        if (getCertificateBody() != null)
            sb.append("CertificateBody: ").append(getCertificateBody()).append(",");
        if (getPrivateKey() != null)
            sb.append("PrivateKey: ").append("***Sensitive Data Redacted***").append(",");
        if (getCertificateChain() != null)
            sb.append("CertificateChain: ").append(getCertificateChain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadServerCertificateRequest == false)
            return false;
        UploadServerCertificateRequest other = (UploadServerCertificateRequest) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getServerCertificateName() == null ^ this.getServerCertificateName() == null)
            return false;
        if (other.getServerCertificateName() != null && other.getServerCertificateName().equals(this.getServerCertificateName()) == false)
            return false;
        if (other.getCertificateBody() == null ^ this.getCertificateBody() == null)
            return false;
        if (other.getCertificateBody() != null && other.getCertificateBody().equals(this.getCertificateBody()) == false)
            return false;
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null)
            return false;
        if (other.getPrivateKey() != null && other.getPrivateKey().equals(this.getPrivateKey()) == false)
            return false;
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getServerCertificateName() == null) ? 0 : getServerCertificateName().hashCode());
        hashCode = prime * hashCode + ((getCertificateBody() == null) ? 0 : getCertificateBody().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        return hashCode;
    }

    @Override
    public UploadServerCertificateRequest clone() {
        return (UploadServerCertificateRequest) super.clone();
    }

}
