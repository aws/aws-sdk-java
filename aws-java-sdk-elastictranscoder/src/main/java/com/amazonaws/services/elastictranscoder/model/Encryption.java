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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The encryption settings, if any, that are used for decrypting your input files or encrypting your output files. If
 * your input file is encrypted, you must specify the mode that Elastic Transcoder uses to decrypt your file, otherwise
 * you must specify the mode you want Elastic Transcoder to use to encrypt your output files.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Encryption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The specific server-side encryption mode that you want Elastic Transcoder to use when decrypting your input files
     * or encrypting your output files. Elastic Transcoder supports the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>s3:</b> Amazon S3 creates and manages the keys used for encrypting your files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>s3-aws-kms:</b> Amazon S3 calls the Amazon Key Management Service, which creates and manages the keys that are
     * used for encrypting your files. If you specify <code>s3-aws-kms</code> and you don't want to use the default key,
     * you must add the AWS-KMS key that you want to use to your pipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aes-cbc-pkcs7:</b> A padded cipher-block mode of operation originally used for HLS files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aes-ctr:</b> AES Counter Mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aes-gcm:</b> AES Galois Counter Mode, a mode of operation that is an authenticated encryption format, meaning
     * that a file, key, or initialization vector that has been tampered with fails the decryption process.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all three AES options, you must provide the following settings, which must be base64-encoded:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Key</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Key MD5</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Initialization Vector</b>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * For the AES modes, your private encryption keys and your unencrypted data are never stored by AWS; therefore, it
     * is important that you safely manage your encryption keys. If you lose them, you won't be able to unencrypt your
     * data.
     * </p>
     * </important>
     */
    private String mode;
    /**
     * <p>
     * The data encryption key that you want Elastic Transcoder to use to encrypt your output file, or that was used to
     * encrypt your input file. The key must be base64-encoded and it must be one of the following bit lengths before
     * being base64-encoded:
     * </p>
     * <p>
     * <code>128</code>, <code>192</code>, or <code>256</code>.
     * </p>
     * <p>
     * The key must also be encrypted by using the Amazon Key Management Service.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The MD5 digest of the key that you used to encrypt your input file, or that you want Elastic Transcoder to use to
     * encrypt your output file. Elastic Transcoder uses the key digest as a checksum to make sure your key was not
     * corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16 bytes long before being
     * base64-encoded.
     * </p>
     */
    private String keyMd5;
    /**
     * <p>
     * The series of random bits created by a random bit generator, unique for every encryption operation, that you used
     * to encrypt your input files or that you want Elastic Transcoder to use to encrypt your output files. The
     * initialization vector must be base64-encoded, and it must be exactly 16 bytes long before being base64-encoded.
     * </p>
     */
    private String initializationVector;

    /**
     * <p>
     * The specific server-side encryption mode that you want Elastic Transcoder to use when decrypting your input files
     * or encrypting your output files. Elastic Transcoder supports the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>s3:</b> Amazon S3 creates and manages the keys used for encrypting your files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>s3-aws-kms:</b> Amazon S3 calls the Amazon Key Management Service, which creates and manages the keys that are
     * used for encrypting your files. If you specify <code>s3-aws-kms</code> and you don't want to use the default key,
     * you must add the AWS-KMS key that you want to use to your pipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aes-cbc-pkcs7:</b> A padded cipher-block mode of operation originally used for HLS files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aes-ctr:</b> AES Counter Mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aes-gcm:</b> AES Galois Counter Mode, a mode of operation that is an authenticated encryption format, meaning
     * that a file, key, or initialization vector that has been tampered with fails the decryption process.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all three AES options, you must provide the following settings, which must be base64-encoded:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Key</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Key MD5</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Initialization Vector</b>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * For the AES modes, your private encryption keys and your unencrypted data are never stored by AWS; therefore, it
     * is important that you safely manage your encryption keys. If you lose them, you won't be able to unencrypt your
     * data.
     * </p>
     * </important>
     * 
     * @param mode
     *        The specific server-side encryption mode that you want Elastic Transcoder to use when decrypting your
     *        input files or encrypting your output files. Elastic Transcoder supports the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>s3:</b> Amazon S3 creates and manages the keys used for encrypting your files.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>s3-aws-kms:</b> Amazon S3 calls the Amazon Key Management Service, which creates and manages the keys
     *        that are used for encrypting your files. If you specify <code>s3-aws-kms</code> and you don't want to use
     *        the default key, you must add the AWS-KMS key that you want to use to your pipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>aes-cbc-pkcs7:</b> A padded cipher-block mode of operation originally used for HLS files.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>aes-ctr:</b> AES Counter Mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>aes-gcm:</b> AES Galois Counter Mode, a mode of operation that is an authenticated encryption format,
     *        meaning that a file, key, or initialization vector that has been tampered with fails the decryption
     *        process.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For all three AES options, you must provide the following settings, which must be base64-encoded:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Key</b>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Key MD5</b>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Initialization Vector</b>
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        For the AES modes, your private encryption keys and your unencrypted data are never stored by AWS;
     *        therefore, it is important that you safely manage your encryption keys. If you lose them, you won't be
     *        able to unencrypt your data.
     *        </p>
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The specific server-side encryption mode that you want Elastic Transcoder to use when decrypting your input files
     * or encrypting your output files. Elastic Transcoder supports the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>s3:</b> Amazon S3 creates and manages the keys used for encrypting your files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>s3-aws-kms:</b> Amazon S3 calls the Amazon Key Management Service, which creates and manages the keys that are
     * used for encrypting your files. If you specify <code>s3-aws-kms</code> and you don't want to use the default key,
     * you must add the AWS-KMS key that you want to use to your pipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aes-cbc-pkcs7:</b> A padded cipher-block mode of operation originally used for HLS files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aes-ctr:</b> AES Counter Mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aes-gcm:</b> AES Galois Counter Mode, a mode of operation that is an authenticated encryption format, meaning
     * that a file, key, or initialization vector that has been tampered with fails the decryption process.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all three AES options, you must provide the following settings, which must be base64-encoded:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Key</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Key MD5</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Initialization Vector</b>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * For the AES modes, your private encryption keys and your unencrypted data are never stored by AWS; therefore, it
     * is important that you safely manage your encryption keys. If you lose them, you won't be able to unencrypt your
     * data.
     * </p>
     * </important>
     * 
     * @return The specific server-side encryption mode that you want Elastic Transcoder to use when decrypting your
     *         input files or encrypting your output files. Elastic Transcoder supports the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>s3:</b> Amazon S3 creates and manages the keys used for encrypting your files.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>s3-aws-kms:</b> Amazon S3 calls the Amazon Key Management Service, which creates and manages the keys
     *         that are used for encrypting your files. If you specify <code>s3-aws-kms</code> and you don't want to use
     *         the default key, you must add the AWS-KMS key that you want to use to your pipeline.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>aes-cbc-pkcs7:</b> A padded cipher-block mode of operation originally used for HLS files.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>aes-ctr:</b> AES Counter Mode.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>aes-gcm:</b> AES Galois Counter Mode, a mode of operation that is an authenticated encryption format,
     *         meaning that a file, key, or initialization vector that has been tampered with fails the decryption
     *         process.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all three AES options, you must provide the following settings, which must be base64-encoded:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Key</b>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Key MD5</b>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Initialization Vector</b>
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         For the AES modes, your private encryption keys and your unencrypted data are never stored by AWS;
     *         therefore, it is important that you safely manage your encryption keys. If you lose them, you won't be
     *         able to unencrypt your data.
     *         </p>
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The specific server-side encryption mode that you want Elastic Transcoder to use when decrypting your input files
     * or encrypting your output files. Elastic Transcoder supports the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>s3:</b> Amazon S3 creates and manages the keys used for encrypting your files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>s3-aws-kms:</b> Amazon S3 calls the Amazon Key Management Service, which creates and manages the keys that are
     * used for encrypting your files. If you specify <code>s3-aws-kms</code> and you don't want to use the default key,
     * you must add the AWS-KMS key that you want to use to your pipeline.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aes-cbc-pkcs7:</b> A padded cipher-block mode of operation originally used for HLS files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aes-ctr:</b> AES Counter Mode.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>aes-gcm:</b> AES Galois Counter Mode, a mode of operation that is an authenticated encryption format, meaning
     * that a file, key, or initialization vector that has been tampered with fails the decryption process.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all three AES options, you must provide the following settings, which must be base64-encoded:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Key</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Key MD5</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Initialization Vector</b>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * For the AES modes, your private encryption keys and your unencrypted data are never stored by AWS; therefore, it
     * is important that you safely manage your encryption keys. If you lose them, you won't be able to unencrypt your
     * data.
     * </p>
     * </important>
     * 
     * @param mode
     *        The specific server-side encryption mode that you want Elastic Transcoder to use when decrypting your
     *        input files or encrypting your output files. Elastic Transcoder supports the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>s3:</b> Amazon S3 creates and manages the keys used for encrypting your files.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>s3-aws-kms:</b> Amazon S3 calls the Amazon Key Management Service, which creates and manages the keys
     *        that are used for encrypting your files. If you specify <code>s3-aws-kms</code> and you don't want to use
     *        the default key, you must add the AWS-KMS key that you want to use to your pipeline.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>aes-cbc-pkcs7:</b> A padded cipher-block mode of operation originally used for HLS files.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>aes-ctr:</b> AES Counter Mode.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>aes-gcm:</b> AES Galois Counter Mode, a mode of operation that is an authenticated encryption format,
     *        meaning that a file, key, or initialization vector that has been tampered with fails the decryption
     *        process.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For all three AES options, you must provide the following settings, which must be base64-encoded:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Key</b>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Key MD5</b>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Initialization Vector</b>
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        For the AES modes, your private encryption keys and your unencrypted data are never stored by AWS;
     *        therefore, it is important that you safely manage your encryption keys. If you lose them, you won't be
     *        able to unencrypt your data.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Encryption withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The data encryption key that you want Elastic Transcoder to use to encrypt your output file, or that was used to
     * encrypt your input file. The key must be base64-encoded and it must be one of the following bit lengths before
     * being base64-encoded:
     * </p>
     * <p>
     * <code>128</code>, <code>192</code>, or <code>256</code>.
     * </p>
     * <p>
     * The key must also be encrypted by using the Amazon Key Management Service.
     * </p>
     * 
     * @param key
     *        The data encryption key that you want Elastic Transcoder to use to encrypt your output file, or that was
     *        used to encrypt your input file. The key must be base64-encoded and it must be one of the following bit
     *        lengths before being base64-encoded:</p>
     *        <p>
     *        <code>128</code>, <code>192</code>, or <code>256</code>.
     *        </p>
     *        <p>
     *        The key must also be encrypted by using the Amazon Key Management Service.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The data encryption key that you want Elastic Transcoder to use to encrypt your output file, or that was used to
     * encrypt your input file. The key must be base64-encoded and it must be one of the following bit lengths before
     * being base64-encoded:
     * </p>
     * <p>
     * <code>128</code>, <code>192</code>, or <code>256</code>.
     * </p>
     * <p>
     * The key must also be encrypted by using the Amazon Key Management Service.
     * </p>
     * 
     * @return The data encryption key that you want Elastic Transcoder to use to encrypt your output file, or that was
     *         used to encrypt your input file. The key must be base64-encoded and it must be one of the following bit
     *         lengths before being base64-encoded:</p>
     *         <p>
     *         <code>128</code>, <code>192</code>, or <code>256</code>.
     *         </p>
     *         <p>
     *         The key must also be encrypted by using the Amazon Key Management Service.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The data encryption key that you want Elastic Transcoder to use to encrypt your output file, or that was used to
     * encrypt your input file. The key must be base64-encoded and it must be one of the following bit lengths before
     * being base64-encoded:
     * </p>
     * <p>
     * <code>128</code>, <code>192</code>, or <code>256</code>.
     * </p>
     * <p>
     * The key must also be encrypted by using the Amazon Key Management Service.
     * </p>
     * 
     * @param key
     *        The data encryption key that you want Elastic Transcoder to use to encrypt your output file, or that was
     *        used to encrypt your input file. The key must be base64-encoded and it must be one of the following bit
     *        lengths before being base64-encoded:</p>
     *        <p>
     *        <code>128</code>, <code>192</code>, or <code>256</code>.
     *        </p>
     *        <p>
     *        The key must also be encrypted by using the Amazon Key Management Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Encryption withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The MD5 digest of the key that you used to encrypt your input file, or that you want Elastic Transcoder to use to
     * encrypt your output file. Elastic Transcoder uses the key digest as a checksum to make sure your key was not
     * corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16 bytes long before being
     * base64-encoded.
     * </p>
     * 
     * @param keyMd5
     *        The MD5 digest of the key that you used to encrypt your input file, or that you want Elastic Transcoder to
     *        use to encrypt your output file. Elastic Transcoder uses the key digest as a checksum to make sure your
     *        key was not corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16 bytes long
     *        before being base64-encoded.
     */

    public void setKeyMd5(String keyMd5) {
        this.keyMd5 = keyMd5;
    }

    /**
     * <p>
     * The MD5 digest of the key that you used to encrypt your input file, or that you want Elastic Transcoder to use to
     * encrypt your output file. Elastic Transcoder uses the key digest as a checksum to make sure your key was not
     * corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16 bytes long before being
     * base64-encoded.
     * </p>
     * 
     * @return The MD5 digest of the key that you used to encrypt your input file, or that you want Elastic Transcoder
     *         to use to encrypt your output file. Elastic Transcoder uses the key digest as a checksum to make sure
     *         your key was not corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16
     *         bytes long before being base64-encoded.
     */

    public String getKeyMd5() {
        return this.keyMd5;
    }

    /**
     * <p>
     * The MD5 digest of the key that you used to encrypt your input file, or that you want Elastic Transcoder to use to
     * encrypt your output file. Elastic Transcoder uses the key digest as a checksum to make sure your key was not
     * corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16 bytes long before being
     * base64-encoded.
     * </p>
     * 
     * @param keyMd5
     *        The MD5 digest of the key that you used to encrypt your input file, or that you want Elastic Transcoder to
     *        use to encrypt your output file. Elastic Transcoder uses the key digest as a checksum to make sure your
     *        key was not corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16 bytes long
     *        before being base64-encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Encryption withKeyMd5(String keyMd5) {
        setKeyMd5(keyMd5);
        return this;
    }

    /**
     * <p>
     * The series of random bits created by a random bit generator, unique for every encryption operation, that you used
     * to encrypt your input files or that you want Elastic Transcoder to use to encrypt your output files. The
     * initialization vector must be base64-encoded, and it must be exactly 16 bytes long before being base64-encoded.
     * </p>
     * 
     * @param initializationVector
     *        The series of random bits created by a random bit generator, unique for every encryption operation, that
     *        you used to encrypt your input files or that you want Elastic Transcoder to use to encrypt your output
     *        files. The initialization vector must be base64-encoded, and it must be exactly 16 bytes long before being
     *        base64-encoded.
     */

    public void setInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
    }

    /**
     * <p>
     * The series of random bits created by a random bit generator, unique for every encryption operation, that you used
     * to encrypt your input files or that you want Elastic Transcoder to use to encrypt your output files. The
     * initialization vector must be base64-encoded, and it must be exactly 16 bytes long before being base64-encoded.
     * </p>
     * 
     * @return The series of random bits created by a random bit generator, unique for every encryption operation, that
     *         you used to encrypt your input files or that you want Elastic Transcoder to use to encrypt your output
     *         files. The initialization vector must be base64-encoded, and it must be exactly 16 bytes long before
     *         being base64-encoded.
     */

    public String getInitializationVector() {
        return this.initializationVector;
    }

    /**
     * <p>
     * The series of random bits created by a random bit generator, unique for every encryption operation, that you used
     * to encrypt your input files or that you want Elastic Transcoder to use to encrypt your output files. The
     * initialization vector must be base64-encoded, and it must be exactly 16 bytes long before being base64-encoded.
     * </p>
     * 
     * @param initializationVector
     *        The series of random bits created by a random bit generator, unique for every encryption operation, that
     *        you used to encrypt your input files or that you want Elastic Transcoder to use to encrypt your output
     *        files. The initialization vector must be base64-encoded, and it must be exactly 16 bytes long before being
     *        base64-encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Encryption withInitializationVector(String initializationVector) {
        setInitializationVector(initializationVector);
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getKeyMd5() != null)
            sb.append("KeyMd5: ").append(getKeyMd5()).append(",");
        if (getInitializationVector() != null)
            sb.append("InitializationVector: ").append(getInitializationVector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Encryption == false)
            return false;
        Encryption other = (Encryption) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getKeyMd5() == null ^ this.getKeyMd5() == null)
            return false;
        if (other.getKeyMd5() != null && other.getKeyMd5().equals(this.getKeyMd5()) == false)
            return false;
        if (other.getInitializationVector() == null ^ this.getInitializationVector() == null)
            return false;
        if (other.getInitializationVector() != null && other.getInitializationVector().equals(this.getInitializationVector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getKeyMd5() == null) ? 0 : getKeyMd5().hashCode());
        hashCode = prime * hashCode + ((getInitializationVector() == null) ? 0 : getInitializationVector().hashCode());
        return hashCode;
    }

    @Override
    public Encryption clone() {
        try {
            return (Encryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.EncryptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
