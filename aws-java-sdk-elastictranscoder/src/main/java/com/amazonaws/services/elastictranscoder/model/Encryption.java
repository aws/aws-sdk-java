/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;

/**
 * <p>
 * The encryption settings, if any, that are used for decrypting your
 * input files or encrypting your output files. If your input file is
 * encrypted, you must specify the mode that Elastic Transcoder will use
 * to decrypt your file, otherwise you must specify the mode you want
 * Elastic Transcoder to use to encrypt your output files.
 * </p>
 */
public class Encryption implements Serializable {

    /**
     * The specific server-side encryption mode that you want Elastic
     * Transcoder to use when decrypting your input files or encrypting your
     * output files. Elastic Transcoder supports the following options: <ul>
     * <li><p><b>S3:</b> Amazon S3 creates and manages the keys used for
     * encrypting your files.</li> <li><p><b>S3-AWS-KMS:</b> Amazon S3 calls
     * the Amazon Key Management Service, which creates and manages the keys
     * that are used for encrypting your files. If you specify
     * <code>S3-AWS-KMS</code> and you don't want to use the default key, you
     * must add the AWS-KMS key that you want to use to your pipeline.</li>
     * <li><p><b>AES-CBC-PKCS7:</b> A padded cipher-block mode of operation
     * originally used for HLS files.</li> <li><p><b>AES-CTR:</b> AES Counter
     * Mode.</li> <li><p><b>AES-GCM:</b> AES Galois Counter Mode, a mode of
     * operation that is an authenticated encryption format, meaning that a
     * file, key, or initialization vector that has been tampered with will
     * fail the decryption process.</li> </ul> <p>For all three AES options,
     * you must provide the following settings, which must be base64-encoded:
     * <ul> <li><p><b>Key</b></li> <li><p><b>Key MD5</b></li>
     * <li><p><b>Initialization Vector</b></li> </ul> <important><p>For the
     * AES modes, your private encryption keys and your unencrypted data are
     * never stored by AWS; therefore, it is important that you safely manage
     * your encryption keys. If you lose them, you won't be able to unencrypt
     * your data.</important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^s3$)|(^s3-aws-kms$)|(^aes-cbc-pkcs7$)|(^aes-ctr$)|(^aes-gcm$)<br/>
     */
    private String mode;

    /**
     * The data encryption key that you want Elastic Transcoder to use to
     * encrypt your output file, or that was used to encrypt your input file.
     * The key must be base64-encoded and it must be one of the following bit
     * lengths before being base64-encoded: <p><code>128</code>,
     * <code>192</code>, or <code>256</code>. <p>The key must also be
     * encrypted by using the Amazon Key Management Service.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$<br/>
     */
    private String key;

    /**
     * The MD5 digest of the key that you used to encrypt your input file, or
     * that you want Elastic Transcoder to use to encrypt your output file.
     * Elastic Transcoder uses the key digest as a checksum to make sure your
     * key was not corrupted in transit. The key MD5 must be base64-encoded,
     * and it must be exactly 16 bytes long before being base64-encoded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$<br/>
     */
    private String keyMd5;

    /**
     * The series of random bits created by a random bit generator, unique
     * for every encryption operation, that you used to encrypt your input
     * files or that you want Elastic Transcoder to use to encrypt your
     * output files. The initialization vector must be base64-encoded, and it
     * must be exactly 16 bytes long before being base64-encoded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String initializationVector;

    /**
     * The specific server-side encryption mode that you want Elastic
     * Transcoder to use when decrypting your input files or encrypting your
     * output files. Elastic Transcoder supports the following options: <ul>
     * <li><p><b>S3:</b> Amazon S3 creates and manages the keys used for
     * encrypting your files.</li> <li><p><b>S3-AWS-KMS:</b> Amazon S3 calls
     * the Amazon Key Management Service, which creates and manages the keys
     * that are used for encrypting your files. If you specify
     * <code>S3-AWS-KMS</code> and you don't want to use the default key, you
     * must add the AWS-KMS key that you want to use to your pipeline.</li>
     * <li><p><b>AES-CBC-PKCS7:</b> A padded cipher-block mode of operation
     * originally used for HLS files.</li> <li><p><b>AES-CTR:</b> AES Counter
     * Mode.</li> <li><p><b>AES-GCM:</b> AES Galois Counter Mode, a mode of
     * operation that is an authenticated encryption format, meaning that a
     * file, key, or initialization vector that has been tampered with will
     * fail the decryption process.</li> </ul> <p>For all three AES options,
     * you must provide the following settings, which must be base64-encoded:
     * <ul> <li><p><b>Key</b></li> <li><p><b>Key MD5</b></li>
     * <li><p><b>Initialization Vector</b></li> </ul> <important><p>For the
     * AES modes, your private encryption keys and your unencrypted data are
     * never stored by AWS; therefore, it is important that you safely manage
     * your encryption keys. If you lose them, you won't be able to unencrypt
     * your data.</important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^s3$)|(^s3-aws-kms$)|(^aes-cbc-pkcs7$)|(^aes-ctr$)|(^aes-gcm$)<br/>
     *
     * @return The specific server-side encryption mode that you want Elastic
     *         Transcoder to use when decrypting your input files or encrypting your
     *         output files. Elastic Transcoder supports the following options: <ul>
     *         <li><p><b>S3:</b> Amazon S3 creates and manages the keys used for
     *         encrypting your files.</li> <li><p><b>S3-AWS-KMS:</b> Amazon S3 calls
     *         the Amazon Key Management Service, which creates and manages the keys
     *         that are used for encrypting your files. If you specify
     *         <code>S3-AWS-KMS</code> and you don't want to use the default key, you
     *         must add the AWS-KMS key that you want to use to your pipeline.</li>
     *         <li><p><b>AES-CBC-PKCS7:</b> A padded cipher-block mode of operation
     *         originally used for HLS files.</li> <li><p><b>AES-CTR:</b> AES Counter
     *         Mode.</li> <li><p><b>AES-GCM:</b> AES Galois Counter Mode, a mode of
     *         operation that is an authenticated encryption format, meaning that a
     *         file, key, or initialization vector that has been tampered with will
     *         fail the decryption process.</li> </ul> <p>For all three AES options,
     *         you must provide the following settings, which must be base64-encoded:
     *         <ul> <li><p><b>Key</b></li> <li><p><b>Key MD5</b></li>
     *         <li><p><b>Initialization Vector</b></li> </ul> <important><p>For the
     *         AES modes, your private encryption keys and your unencrypted data are
     *         never stored by AWS; therefore, it is important that you safely manage
     *         your encryption keys. If you lose them, you won't be able to unencrypt
     *         your data.</important>
     */
    public String getMode() {
        return mode;
    }
    
    /**
     * The specific server-side encryption mode that you want Elastic
     * Transcoder to use when decrypting your input files or encrypting your
     * output files. Elastic Transcoder supports the following options: <ul>
     * <li><p><b>S3:</b> Amazon S3 creates and manages the keys used for
     * encrypting your files.</li> <li><p><b>S3-AWS-KMS:</b> Amazon S3 calls
     * the Amazon Key Management Service, which creates and manages the keys
     * that are used for encrypting your files. If you specify
     * <code>S3-AWS-KMS</code> and you don't want to use the default key, you
     * must add the AWS-KMS key that you want to use to your pipeline.</li>
     * <li><p><b>AES-CBC-PKCS7:</b> A padded cipher-block mode of operation
     * originally used for HLS files.</li> <li><p><b>AES-CTR:</b> AES Counter
     * Mode.</li> <li><p><b>AES-GCM:</b> AES Galois Counter Mode, a mode of
     * operation that is an authenticated encryption format, meaning that a
     * file, key, or initialization vector that has been tampered with will
     * fail the decryption process.</li> </ul> <p>For all three AES options,
     * you must provide the following settings, which must be base64-encoded:
     * <ul> <li><p><b>Key</b></li> <li><p><b>Key MD5</b></li>
     * <li><p><b>Initialization Vector</b></li> </ul> <important><p>For the
     * AES modes, your private encryption keys and your unencrypted data are
     * never stored by AWS; therefore, it is important that you safely manage
     * your encryption keys. If you lose them, you won't be able to unencrypt
     * your data.</important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^s3$)|(^s3-aws-kms$)|(^aes-cbc-pkcs7$)|(^aes-ctr$)|(^aes-gcm$)<br/>
     *
     * @param mode The specific server-side encryption mode that you want Elastic
     *         Transcoder to use when decrypting your input files or encrypting your
     *         output files. Elastic Transcoder supports the following options: <ul>
     *         <li><p><b>S3:</b> Amazon S3 creates and manages the keys used for
     *         encrypting your files.</li> <li><p><b>S3-AWS-KMS:</b> Amazon S3 calls
     *         the Amazon Key Management Service, which creates and manages the keys
     *         that are used for encrypting your files. If you specify
     *         <code>S3-AWS-KMS</code> and you don't want to use the default key, you
     *         must add the AWS-KMS key that you want to use to your pipeline.</li>
     *         <li><p><b>AES-CBC-PKCS7:</b> A padded cipher-block mode of operation
     *         originally used for HLS files.</li> <li><p><b>AES-CTR:</b> AES Counter
     *         Mode.</li> <li><p><b>AES-GCM:</b> AES Galois Counter Mode, a mode of
     *         operation that is an authenticated encryption format, meaning that a
     *         file, key, or initialization vector that has been tampered with will
     *         fail the decryption process.</li> </ul> <p>For all three AES options,
     *         you must provide the following settings, which must be base64-encoded:
     *         <ul> <li><p><b>Key</b></li> <li><p><b>Key MD5</b></li>
     *         <li><p><b>Initialization Vector</b></li> </ul> <important><p>For the
     *         AES modes, your private encryption keys and your unencrypted data are
     *         never stored by AWS; therefore, it is important that you safely manage
     *         your encryption keys. If you lose them, you won't be able to unencrypt
     *         your data.</important>
     */
    public void setMode(String mode) {
        this.mode = mode;
    }
    
    /**
     * The specific server-side encryption mode that you want Elastic
     * Transcoder to use when decrypting your input files or encrypting your
     * output files. Elastic Transcoder supports the following options: <ul>
     * <li><p><b>S3:</b> Amazon S3 creates and manages the keys used for
     * encrypting your files.</li> <li><p><b>S3-AWS-KMS:</b> Amazon S3 calls
     * the Amazon Key Management Service, which creates and manages the keys
     * that are used for encrypting your files. If you specify
     * <code>S3-AWS-KMS</code> and you don't want to use the default key, you
     * must add the AWS-KMS key that you want to use to your pipeline.</li>
     * <li><p><b>AES-CBC-PKCS7:</b> A padded cipher-block mode of operation
     * originally used for HLS files.</li> <li><p><b>AES-CTR:</b> AES Counter
     * Mode.</li> <li><p><b>AES-GCM:</b> AES Galois Counter Mode, a mode of
     * operation that is an authenticated encryption format, meaning that a
     * file, key, or initialization vector that has been tampered with will
     * fail the decryption process.</li> </ul> <p>For all three AES options,
     * you must provide the following settings, which must be base64-encoded:
     * <ul> <li><p><b>Key</b></li> <li><p><b>Key MD5</b></li>
     * <li><p><b>Initialization Vector</b></li> </ul> <important><p>For the
     * AES modes, your private encryption keys and your unencrypted data are
     * never stored by AWS; therefore, it is important that you safely manage
     * your encryption keys. If you lose them, you won't be able to unencrypt
     * your data.</important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^s3$)|(^s3-aws-kms$)|(^aes-cbc-pkcs7$)|(^aes-ctr$)|(^aes-gcm$)<br/>
     *
     * @param mode The specific server-side encryption mode that you want Elastic
     *         Transcoder to use when decrypting your input files or encrypting your
     *         output files. Elastic Transcoder supports the following options: <ul>
     *         <li><p><b>S3:</b> Amazon S3 creates and manages the keys used for
     *         encrypting your files.</li> <li><p><b>S3-AWS-KMS:</b> Amazon S3 calls
     *         the Amazon Key Management Service, which creates and manages the keys
     *         that are used for encrypting your files. If you specify
     *         <code>S3-AWS-KMS</code> and you don't want to use the default key, you
     *         must add the AWS-KMS key that you want to use to your pipeline.</li>
     *         <li><p><b>AES-CBC-PKCS7:</b> A padded cipher-block mode of operation
     *         originally used for HLS files.</li> <li><p><b>AES-CTR:</b> AES Counter
     *         Mode.</li> <li><p><b>AES-GCM:</b> AES Galois Counter Mode, a mode of
     *         operation that is an authenticated encryption format, meaning that a
     *         file, key, or initialization vector that has been tampered with will
     *         fail the decryption process.</li> </ul> <p>For all three AES options,
     *         you must provide the following settings, which must be base64-encoded:
     *         <ul> <li><p><b>Key</b></li> <li><p><b>Key MD5</b></li>
     *         <li><p><b>Initialization Vector</b></li> </ul> <important><p>For the
     *         AES modes, your private encryption keys and your unencrypted data are
     *         never stored by AWS; therefore, it is important that you safely manage
     *         your encryption keys. If you lose them, you won't be able to unencrypt
     *         your data.</important>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Encryption withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * The data encryption key that you want Elastic Transcoder to use to
     * encrypt your output file, or that was used to encrypt your input file.
     * The key must be base64-encoded and it must be one of the following bit
     * lengths before being base64-encoded: <p><code>128</code>,
     * <code>192</code>, or <code>256</code>. <p>The key must also be
     * encrypted by using the Amazon Key Management Service.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$<br/>
     *
     * @return The data encryption key that you want Elastic Transcoder to use to
     *         encrypt your output file, or that was used to encrypt your input file.
     *         The key must be base64-encoded and it must be one of the following bit
     *         lengths before being base64-encoded: <p><code>128</code>,
     *         <code>192</code>, or <code>256</code>. <p>The key must also be
     *         encrypted by using the Amazon Key Management Service.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The data encryption key that you want Elastic Transcoder to use to
     * encrypt your output file, or that was used to encrypt your input file.
     * The key must be base64-encoded and it must be one of the following bit
     * lengths before being base64-encoded: <p><code>128</code>,
     * <code>192</code>, or <code>256</code>. <p>The key must also be
     * encrypted by using the Amazon Key Management Service.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$<br/>
     *
     * @param key The data encryption key that you want Elastic Transcoder to use to
     *         encrypt your output file, or that was used to encrypt your input file.
     *         The key must be base64-encoded and it must be one of the following bit
     *         lengths before being base64-encoded: <p><code>128</code>,
     *         <code>192</code>, or <code>256</code>. <p>The key must also be
     *         encrypted by using the Amazon Key Management Service.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The data encryption key that you want Elastic Transcoder to use to
     * encrypt your output file, or that was used to encrypt your input file.
     * The key must be base64-encoded and it must be one of the following bit
     * lengths before being base64-encoded: <p><code>128</code>,
     * <code>192</code>, or <code>256</code>. <p>The key must also be
     * encrypted by using the Amazon Key Management Service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$<br/>
     *
     * @param key The data encryption key that you want Elastic Transcoder to use to
     *         encrypt your output file, or that was used to encrypt your input file.
     *         The key must be base64-encoded and it must be one of the following bit
     *         lengths before being base64-encoded: <p><code>128</code>,
     *         <code>192</code>, or <code>256</code>. <p>The key must also be
     *         encrypted by using the Amazon Key Management Service.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Encryption withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * The MD5 digest of the key that you used to encrypt your input file, or
     * that you want Elastic Transcoder to use to encrypt your output file.
     * Elastic Transcoder uses the key digest as a checksum to make sure your
     * key was not corrupted in transit. The key MD5 must be base64-encoded,
     * and it must be exactly 16 bytes long before being base64-encoded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$<br/>
     *
     * @return The MD5 digest of the key that you used to encrypt your input file, or
     *         that you want Elastic Transcoder to use to encrypt your output file.
     *         Elastic Transcoder uses the key digest as a checksum to make sure your
     *         key was not corrupted in transit. The key MD5 must be base64-encoded,
     *         and it must be exactly 16 bytes long before being base64-encoded.
     */
    public String getKeyMd5() {
        return keyMd5;
    }
    
    /**
     * The MD5 digest of the key that you used to encrypt your input file, or
     * that you want Elastic Transcoder to use to encrypt your output file.
     * Elastic Transcoder uses the key digest as a checksum to make sure your
     * key was not corrupted in transit. The key MD5 must be base64-encoded,
     * and it must be exactly 16 bytes long before being base64-encoded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$<br/>
     *
     * @param keyMd5 The MD5 digest of the key that you used to encrypt your input file, or
     *         that you want Elastic Transcoder to use to encrypt your output file.
     *         Elastic Transcoder uses the key digest as a checksum to make sure your
     *         key was not corrupted in transit. The key MD5 must be base64-encoded,
     *         and it must be exactly 16 bytes long before being base64-encoded.
     */
    public void setKeyMd5(String keyMd5) {
        this.keyMd5 = keyMd5;
    }
    
    /**
     * The MD5 digest of the key that you used to encrypt your input file, or
     * that you want Elastic Transcoder to use to encrypt your output file.
     * Elastic Transcoder uses the key digest as a checksum to make sure your
     * key was not corrupted in transit. The key MD5 must be base64-encoded,
     * and it must be exactly 16 bytes long before being base64-encoded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(?:[A-Za-z0-9\+/]{4})*(?:[A-Za-z0-9\+/]{2}==|[A-Za-z0-9\+/]{3}=)?$<br/>
     *
     * @param keyMd5 The MD5 digest of the key that you used to encrypt your input file, or
     *         that you want Elastic Transcoder to use to encrypt your output file.
     *         Elastic Transcoder uses the key digest as a checksum to make sure your
     *         key was not corrupted in transit. The key MD5 must be base64-encoded,
     *         and it must be exactly 16 bytes long before being base64-encoded.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Encryption withKeyMd5(String keyMd5) {
        this.keyMd5 = keyMd5;
        return this;
    }

    /**
     * The series of random bits created by a random bit generator, unique
     * for every encryption operation, that you used to encrypt your input
     * files or that you want Elastic Transcoder to use to encrypt your
     * output files. The initialization vector must be base64-encoded, and it
     * must be exactly 16 bytes long before being base64-encoded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The series of random bits created by a random bit generator, unique
     *         for every encryption operation, that you used to encrypt your input
     *         files or that you want Elastic Transcoder to use to encrypt your
     *         output files. The initialization vector must be base64-encoded, and it
     *         must be exactly 16 bytes long before being base64-encoded.
     */
    public String getInitializationVector() {
        return initializationVector;
    }
    
    /**
     * The series of random bits created by a random bit generator, unique
     * for every encryption operation, that you used to encrypt your input
     * files or that you want Elastic Transcoder to use to encrypt your
     * output files. The initialization vector must be base64-encoded, and it
     * must be exactly 16 bytes long before being base64-encoded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param initializationVector The series of random bits created by a random bit generator, unique
     *         for every encryption operation, that you used to encrypt your input
     *         files or that you want Elastic Transcoder to use to encrypt your
     *         output files. The initialization vector must be base64-encoded, and it
     *         must be exactly 16 bytes long before being base64-encoded.
     */
    public void setInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
    }
    
    /**
     * The series of random bits created by a random bit generator, unique
     * for every encryption operation, that you used to encrypt your input
     * files or that you want Elastic Transcoder to use to encrypt your
     * output files. The initialization vector must be base64-encoded, and it
     * must be exactly 16 bytes long before being base64-encoded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param initializationVector The series of random bits created by a random bit generator, unique
     *         for every encryption operation, that you used to encrypt your input
     *         files or that you want Elastic Transcoder to use to encrypt your
     *         output files. The initialization vector must be base64-encoded, and it
     *         must be exactly 16 bytes long before being base64-encoded.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Encryption withInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMode() != null) sb.append("Mode: " + getMode() + ",");
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getKeyMd5() != null) sb.append("KeyMd5: " + getKeyMd5() + ",");
        if (getInitializationVector() != null) sb.append("InitializationVector: " + getInitializationVector() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Encryption == false) return false;
        Encryption other = (Encryption)obj;
        
        if (other.getMode() == null ^ this.getMode() == null) return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false) return false; 
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getKeyMd5() == null ^ this.getKeyMd5() == null) return false;
        if (other.getKeyMd5() != null && other.getKeyMd5().equals(this.getKeyMd5()) == false) return false; 
        if (other.getInitializationVector() == null ^ this.getInitializationVector() == null) return false;
        if (other.getInitializationVector() != null && other.getInitializationVector().equals(this.getInitializationVector()) == false) return false; 
        return true;
    }
    
}
    