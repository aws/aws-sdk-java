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
package com.amazonaws.services.paymentcryptographydata;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.paymentcryptographydata.model.*;

/**
 * Interface for accessing Payment Cryptography Data Plane.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.paymentcryptographydata.AbstractAWSPaymentCryptographyData} instead.
 * </p>
 * <p>
 * <p>
 * You use the Amazon Web Services Payment Cryptography Data Plane to manage how encryption keys are used for
 * payment-related transaction processing and associated cryptographic operations. You can encrypt, decrypt, generate,
 * verify, and translate payment-related cryptographic operations in Amazon Web Services Payment Cryptography. For more
 * information, see <a
 * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/data-operations.html">Data operations</a> in
 * the <i>Amazon Web Services Payment Cryptography User Guide</i>.
 * </p>
 * <p>
 * To manage your encryption keys, you use the <a
 * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/Welcome.html">Amazon Web Services Payment
 * Cryptography Control Plane</a>. You can create, import, export, share, manage, and delete keys. You can also manage
 * Identity and Access Management (IAM) policies for keys.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSPaymentCryptographyData {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "dataplane.payment-cryptography";

    /**
     * <p>
     * Decrypts ciphertext data to plaintext using a symmetric (TDES, AES), asymmetric (RSA), or derived (DUKPT or EMV)
     * encryption key scheme. For more information, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/decrypt-data.html">Decrypt data</a> in
     * the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * You can use an encryption key generated within Amazon Web Services Payment Cryptography, or you can import your
     * own encryption key by calling <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_ImportKey.html">ImportKey</a>. For
     * this operation, the key must have <code>KeyModesOfUse</code> set to <code>Decrypt</code>. In asymmetric
     * decryption, Amazon Web Services Payment Cryptography decrypts the ciphertext using the private component of the
     * asymmetric encryption key pair. For data encryption outside of Amazon Web Services Payment Cryptography, you can
     * export the public component of the asymmetric key pair by calling <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_GetPublicKeyCertificate.html"
     * >GetPublicCertificate</a>.
     * </p>
     * <p>
     * For symmetric and DUKPT decryption, Amazon Web Services Payment Cryptography supports <code>TDES</code> and
     * <code>AES</code> algorithms. For EMV decryption, Amazon Web Services Payment Cryptography supports
     * <code>TDES</code> algorithms. For asymmetric decryption, Amazon Web Services Payment Cryptography supports
     * <code>RSA</code>.
     * </p>
     * <p>
     * When you use TDES or TDES DUKPT, the ciphertext data length must be a multiple of 8 bytes. For AES or AES DUKPT,
     * the ciphertext data length must be a multiple of 16 bytes. For RSA, it sould be equal to the key size unless
     * padding is enabled.
     * </p>
     * <p>
     * For information about valid keys for this operation, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-validattributes.html">Understanding
     * key attributes</a> and <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/crypto-ops-validkeys-ops.html">Key types
     * for specific data operations</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>EncryptData</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_GetPublicKeyCertificate.html">
     * GetPublicCertificate</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_ImportKey.html">ImportKey</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param decryptDataRequest
     * @return Result of the DecryptData operation returned by the service.
     * @throws ValidationException
     *         The request was denied due to an invalid request error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request was denied due to an invalid resource error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSPaymentCryptographyData.DecryptData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/DecryptData"
     *      target="_top">AWS API Documentation</a>
     */
    DecryptDataResult decryptData(DecryptDataRequest decryptDataRequest);

    /**
     * <p>
     * Encrypts plaintext data to ciphertext using a symmetric (TDES, AES), asymmetric (RSA), or derived (DUKPT or EMV)
     * encryption key scheme. For more information, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/encrypt-data.html">Encrypt data</a> in
     * the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * You can generate an encryption key within Amazon Web Services Payment Cryptography by calling <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_CreateKey.html">CreateKey</a>. You
     * can import your own encryption key by calling <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_ImportKey.html">ImportKey</a>. For
     * this operation, the key must have <code>KeyModesOfUse</code> set to <code>Encrypt</code>. In asymmetric
     * encryption, plaintext is encrypted using public component. You can import the public component of an asymmetric
     * key pair created outside Amazon Web Services Payment Cryptography by calling <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_ImportKey.html">ImportKey</a>.
     * </p>
     * <p>
     * For symmetric and DUKPT encryption, Amazon Web Services Payment Cryptography supports <code>TDES</code> and
     * <code>AES</code> algorithms. For EMV encryption, Amazon Web Services Payment Cryptography supports
     * <code>TDES</code> algorithms.For asymmetric encryption, Amazon Web Services Payment Cryptography supports
     * <code>RSA</code>.
     * </p>
     * <p>
     * When you use TDES or TDES DUKPT, the plaintext data length must be a multiple of 8 bytes. For AES or AES DUKPT,
     * the plaintext data length must be a multiple of 16 bytes. For RSA, it sould be equal to the key size unless
     * padding is enabled.
     * </p>
     * <p>
     * To encrypt using DUKPT, you must already have a BDK (Base Derivation Key) key in your account with
     * <code>KeyModesOfUse</code> set to <code>DeriveKey</code>, or you can generate a new DUKPT key by calling <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_CreateKey.html">CreateKey</a>. To
     * encrypt using EMV, you must already have an IMK (Issuer Master Key) key in your account with
     * <code>KeyModesOfUse</code> set to <code>DeriveKey</code>.
     * </p>
     * <p>
     * For information about valid keys for this operation, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-validattributes.html">Understanding
     * key attributes</a> and <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/crypto-ops-validkeys-ops.html">Key types
     * for specific data operations</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DecryptData</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_GetPublicKeyCertificate.html">
     * GetPublicCertificate</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_ImportKey.html">ImportKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ReEncryptData</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptDataRequest
     * @return Result of the EncryptData operation returned by the service.
     * @throws ValidationException
     *         The request was denied due to an invalid request error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request was denied due to an invalid resource error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSPaymentCryptographyData.EncryptData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/EncryptData"
     *      target="_top">AWS API Documentation</a>
     */
    EncryptDataResult encryptData(EncryptDataRequest encryptDataRequest);

    /**
     * <p>
     * Generates card-related validation data using algorithms such as Card Verification Values (CVV/CVV2), Dynamic Card
     * Verification Values (dCVV/dCVV2), or Card Security Codes (CSC). For more information, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/generate-card-data.html">Generate card
     * data</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * This operation generates a CVV or CSC value that is printed on a payment credit or debit card during card
     * production. The CVV or CSC, PAN (Primary Account Number) and expiration date of the card are required to check
     * its validity during transaction processing. To begin this operation, a CVK (Card Verification Key) encryption key
     * is required. You can use <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_CreateKey.html">CreateKey</a> or
     * <a href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_ImportKey.html">ImportKey</a>
     * to establish a CVK within Amazon Web Services Payment Cryptography. The <code>KeyModesOfUse</code> should be set
     * to <code>Generate</code> and <code>Verify</code> for a CVK encryption key.
     * </p>
     * <p>
     * For information about valid keys for this operation, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-validattributes.html">Understanding
     * key attributes</a> and <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/crypto-ops-validkeys-ops.html">Key types
     * for specific data operations</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_ImportKey.html">ImportKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>VerifyCardValidationData</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param generateCardValidationDataRequest
     * @return Result of the GenerateCardValidationData operation returned by the service.
     * @throws ValidationException
     *         The request was denied due to an invalid request error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request was denied due to an invalid resource error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSPaymentCryptographyData.GenerateCardValidationData
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/GenerateCardValidationData"
     *      target="_top">AWS API Documentation</a>
     */
    GenerateCardValidationDataResult generateCardValidationData(GenerateCardValidationDataRequest generateCardValidationDataRequest);

    /**
     * <p>
     * Generates a Message Authentication Code (MAC) cryptogram within Amazon Web Services Payment Cryptography.
     * </p>
     * <p>
     * You can use this operation to authenticate card-related data by using known data values to generate MAC for data
     * validation between the sending and receiving parties. This operation uses message data, a secret encryption key
     * and MAC algorithm to generate a unique MAC value for transmission. The receiving party of the MAC must use the
     * same message data, secret encryption key and MAC algorithm to reproduce another MAC value for comparision.
     * </p>
     * <p>
     * You can use this operation to generate a DUPKT, CMAC, HMAC or EMV MAC by setting generation attributes and
     * algorithm to the associated values. The MAC generation encryption key must have valid values for
     * <code>KeyUsage</code> such as <code>TR31_M7_HMAC_KEY</code> for HMAC generation, and they key must have
     * <code>KeyModesOfUse</code> set to <code>Generate</code> and <code>Verify</code>.
     * </p>
     * <p>
     * For information about valid keys for this operation, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-validattributes.html">Understanding
     * key attributes</a> and <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/crypto-ops-validkeys-ops.html">Key types
     * for specific data operations</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>VerifyMac</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param generateMacRequest
     * @return Result of the GenerateMac operation returned by the service.
     * @throws ValidationException
     *         The request was denied due to an invalid request error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request was denied due to an invalid resource error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSPaymentCryptographyData.GenerateMac
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/GenerateMac"
     *      target="_top">AWS API Documentation</a>
     */
    GenerateMacResult generateMac(GenerateMacRequest generateMacRequest);

    /**
     * <p>
     * Generates pin-related data such as PIN, PIN Verification Value (PVV), PIN Block, and PIN Offset during new card
     * issuance or reissuance. For more information, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/generate-pin-data.html">Generate PIN
     * data</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * PIN data is never transmitted in clear to or from Amazon Web Services Payment Cryptography. This operation
     * generates PIN, PVV, or PIN Offset and then encrypts it using Pin Encryption Key (PEK) to create an
     * <code>EncryptedPinBlock</code> for transmission from Amazon Web Services Payment Cryptography. This operation
     * uses a separate Pin Verification Key (PVK) for VISA PVV generation.
     * </p>
     * <p>
     * For information about valid keys for this operation, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-validattributes.html">Understanding
     * key attributes</a> and <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/crypto-ops-validkeys-ops.html">Key types
     * for specific data operations</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GenerateCardValidationData</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>TranslatePinData</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>VerifyPinData</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param generatePinDataRequest
     * @return Result of the GeneratePinData operation returned by the service.
     * @throws ValidationException
     *         The request was denied due to an invalid request error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request was denied due to an invalid resource error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSPaymentCryptographyData.GeneratePinData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/GeneratePinData"
     *      target="_top">AWS API Documentation</a>
     */
    GeneratePinDataResult generatePinData(GeneratePinDataRequest generatePinDataRequest);

    /**
     * <p>
     * Re-encrypt ciphertext using DUKPT, Symmetric and Asymmetric Data Encryption Keys.
     * </p>
     * <p>
     * You can either generate an encryption key within Amazon Web Services Payment Cryptography by calling <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_CreateKey.html">CreateKey</a> or
     * import your own encryption key by calling <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_ImportKey.html">ImportKey</a>. The
     * <code>KeyArn</code> for use with this operation must be in a compatible key state with <code>KeyModesOfUse</code>
     * set to <code>Encrypt</code>. In asymmetric encryption, ciphertext is encrypted using public component (imported
     * by calling <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_ImportKey.html">ImportKey</a>) of
     * the asymmetric key pair created outside of Amazon Web Services Payment Cryptography.
     * </p>
     * <p>
     * For symmetric and DUKPT encryption, Amazon Web Services Payment Cryptography supports <code>TDES</code> and
     * <code>AES</code> algorithms. For asymmetric encryption, Amazon Web Services Payment Cryptography supports
     * <code>RSA</code>. To encrypt using DUKPT, a DUKPT key must already exist within your account with
     * <code>KeyModesOfUse</code> set to <code>DeriveKey</code> or a new DUKPT can be generated by calling <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_CreateKey.html">CreateKey</a>.
     * </p>
     * <p>
     * For information about valid keys for this operation, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-validattributes.html">Understanding
     * key attributes</a> and <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/crypto-ops-validkeys-ops.html">Key types
     * for specific data operations</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DecryptData</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>EncryptData</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_GetPublicKeyCertificate.html">
     * GetPublicCertificate</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_ImportKey.html">ImportKey</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param reEncryptDataRequest
     * @return Result of the ReEncryptData operation returned by the service.
     * @throws ValidationException
     *         The request was denied due to an invalid request error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request was denied due to an invalid resource error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSPaymentCryptographyData.ReEncryptData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/ReEncryptData"
     *      target="_top">AWS API Documentation</a>
     */
    ReEncryptDataResult reEncryptData(ReEncryptDataRequest reEncryptDataRequest);

    /**
     * <p>
     * Translates encrypted PIN block from and to ISO 9564 formats 0,1,3,4. For more information, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/translate-pin-data.html">Translate PIN
     * data</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * PIN block translation involves changing the encrytion of PIN block from one encryption key to another encryption
     * key and changing PIN block format from one to another without PIN block data leaving Amazon Web Services Payment
     * Cryptography. The encryption key transformation can be from PEK (Pin Encryption Key) to BDK (Base Derivation Key)
     * for DUKPT or from BDK for DUKPT to PEK. Amazon Web Services Payment Cryptography supports <code>TDES</code> and
     * <code>AES</code> key derivation type for DUKPT translations.
     * </p>
     * <p>
     * The allowed combinations of PIN block format translations are guided by PCI. It is important to note that not all
     * encrypted PIN block formats (example, format 1) require PAN (Primary Account Number) as input. And as such, PIN
     * block format that requires PAN (example, formats 0,3,4) cannot be translated to a format (format 1) that does not
     * require a PAN for generation.
     * </p>
     * <p>
     * For information about valid keys for this operation, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-validattributes.html">Understanding
     * key attributes</a> and <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/crypto-ops-validkeys-ops.html">Key types
     * for specific data operations</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services Payment Cryptography currently supports ISO PIN block 4 translation for PIN block built using
     * legacy PAN length. That is, PAN is the right most 12 digits excluding the check digits.
     * </p>
     * </note>
     * <p>
     * <b>Cross-account use</b>: This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GeneratePinData</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>VerifyPinData</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param translatePinDataRequest
     * @return Result of the TranslatePinData operation returned by the service.
     * @throws ValidationException
     *         The request was denied due to an invalid request error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request was denied due to an invalid resource error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSPaymentCryptographyData.TranslatePinData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/TranslatePinData"
     *      target="_top">AWS API Documentation</a>
     */
    TranslatePinDataResult translatePinData(TranslatePinDataRequest translatePinDataRequest);

    /**
     * <p>
     * Verifies Authorization Request Cryptogram (ARQC) for a EMV chip payment card authorization. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/payment-cryptography/latest/userguide/data-operations.verifyauthrequestcryptogram.html"
     * >Verify auth request cryptogram</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * ARQC generation is done outside of Amazon Web Services Payment Cryptography and is typically generated on a point
     * of sale terminal for an EMV chip card to obtain payment authorization during transaction time. For ARQC
     * verification, you must first import the ARQC generated outside of Amazon Web Services Payment Cryptography by
     * calling <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_ImportKey.html">ImportKey</a>.
     * This operation uses the imported ARQC and an major encryption key (DUKPT) created by calling <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/APIReference/API_CreateKey.html">CreateKey</a> to
     * either provide a boolean ARQC verification result or provide an APRC (Authorization Response Cryptogram) response
     * using Method 1 or Method 2. The <code>ARPC_METHOD_1</code> uses <code>AuthResponseCode</code> to generate ARPC
     * and <code>ARPC_METHOD_2</code> uses <code>CardStatusUpdate</code> to generate ARPC.
     * </p>
     * <p>
     * For information about valid keys for this operation, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-validattributes.html">Understanding
     * key attributes</a> and <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/crypto-ops-validkeys-ops.html">Key types
     * for specific data operations</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>VerifyCardValidationData</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>VerifyPinData</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param verifyAuthRequestCryptogramRequest
     * @return Result of the VerifyAuthRequestCryptogram operation returned by the service.
     * @throws ValidationException
     *         The request was denied due to an invalid request error.
     * @throws VerificationFailedException
     *         This request failed verification.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request was denied due to an invalid resource error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSPaymentCryptographyData.VerifyAuthRequestCryptogram
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/VerifyAuthRequestCryptogram"
     *      target="_top">AWS API Documentation</a>
     */
    VerifyAuthRequestCryptogramResult verifyAuthRequestCryptogram(VerifyAuthRequestCryptogramRequest verifyAuthRequestCryptogramRequest);

    /**
     * <p>
     * Verifies card-related validation data using algorithms such as Card Verification Values (CVV/CVV2), Dynamic Card
     * Verification Values (dCVV/dCVV2) and Card Security Codes (CSC). For more information, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/verify-card-data.html">Verify card
     * data</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * This operation validates the CVV or CSC codes that is printed on a payment credit or debit card during card
     * payment transaction. The input values are typically provided as part of an inbound transaction to an issuer or
     * supporting platform partner. Amazon Web Services Payment Cryptography uses CVV or CSC, PAN (Primary Account
     * Number) and expiration date of the card to check its validity during transaction processing. In this operation,
     * the CVK (Card Verification Key) encryption key for use with card data verification is same as the one in used for
     * <a>GenerateCardValidationData</a>.
     * </p>
     * <p>
     * For information about valid keys for this operation, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-validattributes.html">Understanding
     * key attributes</a> and <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/crypto-ops-validkeys-ops.html">Key types
     * for specific data operations</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GenerateCardValidationData</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>VerifyAuthRequestCryptogram</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>VerifyPinData</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param verifyCardValidationDataRequest
     * @return Result of the VerifyCardValidationData operation returned by the service.
     * @throws ValidationException
     *         The request was denied due to an invalid request error.
     * @throws VerificationFailedException
     *         This request failed verification.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request was denied due to an invalid resource error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSPaymentCryptographyData.VerifyCardValidationData
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/VerifyCardValidationData"
     *      target="_top">AWS API Documentation</a>
     */
    VerifyCardValidationDataResult verifyCardValidationData(VerifyCardValidationDataRequest verifyCardValidationDataRequest);

    /**
     * <p>
     * Verifies a Message Authentication Code (MAC).
     * </p>
     * <p>
     * You can use this operation to verify MAC for message data authentication such as . In this operation, you must
     * use the same message data, secret encryption key and MAC algorithm that was used to generate MAC. You can use
     * this operation to verify a DUPKT, CMAC, HMAC or EMV MAC by setting generation attributes and algorithm to the
     * associated values.
     * </p>
     * <p>
     * For information about valid keys for this operation, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-validattributes.html">Understanding
     * key attributes</a> and <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/crypto-ops-validkeys-ops.html">Key types
     * for specific data operations</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GenerateMac</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param verifyMacRequest
     * @return Result of the VerifyMac operation returned by the service.
     * @throws ValidationException
     *         The request was denied due to an invalid request error.
     * @throws VerificationFailedException
     *         This request failed verification.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request was denied due to an invalid resource error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSPaymentCryptographyData.VerifyMac
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/VerifyMac"
     *      target="_top">AWS API Documentation</a>
     */
    VerifyMacResult verifyMac(VerifyMacRequest verifyMacRequest);

    /**
     * <p>
     * Verifies pin-related data such as PIN and PIN Offset using algorithms including VISA PVV and IBM3624. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/verify-pin-data.html">Verify PIN data</a>
     * in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * This operation verifies PIN data for user payment card. A card holder PIN data is never transmitted in clear to
     * or from Amazon Web Services Payment Cryptography. This operation uses PIN Verification Key (PVK) for PIN or PIN
     * Offset generation and then encrypts it using PIN Encryption Key (PEK) to create an <code>EncryptedPinBlock</code>
     * for transmission from Amazon Web Services Payment Cryptography.
     * </p>
     * <p>
     * For information about valid keys for this operation, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-validattributes.html">Understanding
     * key attributes</a> and <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/crypto-ops-validkeys-ops.html">Key types
     * for specific data operations</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GeneratePinData</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>TranslatePinData</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param verifyPinDataRequest
     * @return Result of the VerifyPinData operation returned by the service.
     * @throws ValidationException
     *         The request was denied due to an invalid request error.
     * @throws VerificationFailedException
     *         This request failed verification.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The request was denied due to an invalid resource error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception, or failure.
     * @sample AWSPaymentCryptographyData.VerifyPinData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/VerifyPinData"
     *      target="_top">AWS API Documentation</a>
     */
    VerifyPinDataResult verifyPinData(VerifyPinDataRequest verifyPinDataRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
