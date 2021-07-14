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
package com.amazonaws.services.certificatemanager;

import javax.annotation.Generated;

import com.amazonaws.services.certificatemanager.model.*;

/**
 * Interface for accessing ACM asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.certificatemanager.AbstractAWSCertificateManagerAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Web Services Certificate Manager</fullname>
 * <p>
 * You can use Amazon Web Services Certificate Manager (ACM) to manage SSL/TLS certificates for your Amazon Web
 * Services-based websites and applications. For more information about using ACM, see the <a
 * href="https://docs.aws.amazon.com/acm/latest/userguide/">Amazon Web Services Certificate Manager User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCertificateManagerAsync extends AWSCertificateManager {

    /**
     * <p>
     * Adds one or more tags to an ACM certificate. Tags are labels that you can use to identify and organize your
     * Amazon Web Services resources. Each tag consists of a <code>key</code> and an optional <code>value</code>. You
     * specify the certificate on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value
     * pair.
     * </p>
     * <p>
     * You can apply a tag to just one certificate if you want to identify a specific characteristic of that
     * certificate, or you can apply the same tag to multiple certificates if you want to filter for a common
     * relationship among those certificates. Similarly, you can apply the same tag to multiple resources if you want to
     * specify a relationship among those resources. For example, you can add the same tag to an ACM certificate and an
     * Elastic Load Balancing load balancer to indicate that they are both used by the same website. For more
     * information, see <a href="https://docs.aws.amazon.com/acm/latest/userguide/tags.html">Tagging ACM
     * certificates</a>.
     * </p>
     * <p>
     * To remove one or more tags, use the <a>RemoveTagsFromCertificate</a> action. To view all of the tags that have
     * been applied to the certificate, use the <a>ListTagsForCertificate</a> action.
     * </p>
     * 
     * @param addTagsToCertificateRequest
     * @return A Java Future containing the result of the AddTagsToCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.AddTagsToCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/AddTagsToCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToCertificateResult> addTagsToCertificateAsync(AddTagsToCertificateRequest addTagsToCertificateRequest);

    /**
     * <p>
     * Adds one or more tags to an ACM certificate. Tags are labels that you can use to identify and organize your
     * Amazon Web Services resources. Each tag consists of a <code>key</code> and an optional <code>value</code>. You
     * specify the certificate on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value
     * pair.
     * </p>
     * <p>
     * You can apply a tag to just one certificate if you want to identify a specific characteristic of that
     * certificate, or you can apply the same tag to multiple certificates if you want to filter for a common
     * relationship among those certificates. Similarly, you can apply the same tag to multiple resources if you want to
     * specify a relationship among those resources. For example, you can add the same tag to an ACM certificate and an
     * Elastic Load Balancing load balancer to indicate that they are both used by the same website. For more
     * information, see <a href="https://docs.aws.amazon.com/acm/latest/userguide/tags.html">Tagging ACM
     * certificates</a>.
     * </p>
     * <p>
     * To remove one or more tags, use the <a>RemoveTagsFromCertificate</a> action. To view all of the tags that have
     * been applied to the certificate, use the <a>ListTagsForCertificate</a> action.
     * </p>
     * 
     * @param addTagsToCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.AddTagsToCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/AddTagsToCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToCertificateResult> addTagsToCertificateAsync(AddTagsToCertificateRequest addTagsToCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToCertificateRequest, AddTagsToCertificateResult> asyncHandler);

    /**
     * <p>
     * Deletes a certificate and its associated private key. If this action succeeds, the certificate no longer appears
     * in the list that can be displayed by calling the <a>ListCertificates</a> action or be retrieved by calling the
     * <a>GetCertificate</a> action. The certificate will not be available for use by Amazon Web Services services
     * integrated with ACM.
     * </p>
     * <note>
     * <p>
     * You cannot delete an ACM certificate that is being used by another Amazon Web Services service. To delete a
     * certificate that is in use, the certificate association must first be removed.
     * </p>
     * </note>
     * 
     * @param deleteCertificateRequest
     * @return A Java Future containing the result of the DeleteCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.DeleteCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/DeleteCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest deleteCertificateRequest);

    /**
     * <p>
     * Deletes a certificate and its associated private key. If this action succeeds, the certificate no longer appears
     * in the list that can be displayed by calling the <a>ListCertificates</a> action or be retrieved by calling the
     * <a>GetCertificate</a> action. The certificate will not be available for use by Amazon Web Services services
     * integrated with ACM.
     * </p>
     * <note>
     * <p>
     * You cannot delete an ACM certificate that is being used by another Amazon Web Services service. To delete a
     * certificate that is in use, the certificate association must first be removed.
     * </p>
     * </note>
     * 
     * @param deleteCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.DeleteCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/DeleteCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest deleteCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, DeleteCertificateResult> asyncHandler);

    /**
     * <p>
     * Returns detailed metadata about the specified ACM certificate.
     * </p>
     * 
     * @param describeCertificateRequest
     * @return A Java Future containing the result of the DescribeCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.DescribeCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/DescribeCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(DescribeCertificateRequest describeCertificateRequest);

    /**
     * <p>
     * Returns detailed metadata about the specified ACM certificate.
     * </p>
     * 
     * @param describeCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.DescribeCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/DescribeCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(DescribeCertificateRequest describeCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCertificateRequest, DescribeCertificateResult> asyncHandler);

    /**
     * <p>
     * Exports a private certificate issued by a private certificate authority (CA) for use anywhere. The exported file
     * contains the certificate, the certificate chain, and the encrypted private 2048-bit RSA key associated with the
     * public key that is embedded in the certificate. For security, you must assign a passphrase for the private key
     * when exporting it.
     * </p>
     * <p>
     * For information about exporting and formatting a certificate using the ACM console or CLI, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-export-private.html">Export a Private
     * Certificate</a>.
     * </p>
     * 
     * @param exportCertificateRequest
     * @return A Java Future containing the result of the ExportCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.ExportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ExportCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportCertificateResult> exportCertificateAsync(ExportCertificateRequest exportCertificateRequest);

    /**
     * <p>
     * Exports a private certificate issued by a private certificate authority (CA) for use anywhere. The exported file
     * contains the certificate, the certificate chain, and the encrypted private 2048-bit RSA key associated with the
     * public key that is embedded in the certificate. For security, you must assign a passphrase for the private key
     * when exporting it.
     * </p>
     * <p>
     * For information about exporting and formatting a certificate using the ACM console or CLI, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-export-private.html">Export a Private
     * Certificate</a>.
     * </p>
     * 
     * @param exportCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.ExportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ExportCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportCertificateResult> exportCertificateAsync(ExportCertificateRequest exportCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<ExportCertificateRequest, ExportCertificateResult> asyncHandler);

    /**
     * <p>
     * Returns the account configuration options associated with an Amazon Web Services account.
     * </p>
     * 
     * @param getAccountConfigurationRequest
     * @return A Java Future containing the result of the GetAccountConfiguration operation returned by the service.
     * @sample AWSCertificateManagerAsync.GetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/GetAccountConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountConfigurationResult> getAccountConfigurationAsync(GetAccountConfigurationRequest getAccountConfigurationRequest);

    /**
     * <p>
     * Returns the account configuration options associated with an Amazon Web Services account.
     * </p>
     * 
     * @param getAccountConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountConfiguration operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.GetAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/GetAccountConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccountConfigurationResult> getAccountConfigurationAsync(GetAccountConfigurationRequest getAccountConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountConfigurationRequest, GetAccountConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves an Amazon-issued certificate and its certificate chain. The chain consists of the certificate of the
     * issuing CA and the intermediate certificates of any other subordinate CAs. All of the certificates are base64
     * encoded. You can use <a href="https://wiki.openssl.org/index.php/Command_Line_Utilities">OpenSSL</a> to decode
     * the certificates and inspect individual fields.
     * </p>
     * 
     * @param getCertificateRequest
     * @return A Java Future containing the result of the GetCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.GetCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/GetCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(GetCertificateRequest getCertificateRequest);

    /**
     * <p>
     * Retrieves an Amazon-issued certificate and its certificate chain. The chain consists of the certificate of the
     * issuing CA and the intermediate certificates of any other subordinate CAs. All of the certificates are base64
     * encoded. You can use <a href="https://wiki.openssl.org/index.php/Command_Line_Utilities">OpenSSL</a> to decode
     * the certificates and inspect individual fields.
     * </p>
     * 
     * @param getCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.GetCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/GetCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(GetCertificateRequest getCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<GetCertificateRequest, GetCertificateResult> asyncHandler);

    /**
     * <p>
     * Imports a certificate into Amazon Web Services Certificate Manager (ACM) to use with services that are integrated
     * with ACM. Note that <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-services.html">integrated
     * services</a> allow only certificate types and keys they support to be associated with their resources. Further,
     * their support differs depending on whether the certificate is imported into IAM or into ACM. For more
     * information, see the documentation for each service. For more information about importing certificates into ACM,
     * see <a href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a>
     * in the <i>Amazon Web Services Certificate Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * ACM does not provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     * renewal</a> for certificates that you import.
     * </p>
     * </note>
     * <p>
     * Note the following guidelines when importing third party certificates:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must enter the private key that matches the certificate you are importing.
     * </p>
     * </li>
     * <li>
     * <p>
     * The private key must be unencrypted. You cannot import a private key that is protected by a password or a
     * passphrase.
     * </p>
     * </li>
     * <li>
     * <p>
     * The private key must be no larger than 5 KB (5,120 bytes).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the certificate you are importing is not self-signed, you must enter its certificate chain.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a certificate chain is included, the issuer must be the subject of one of the certificates in the chain.
     * </p>
     * </li>
     * <li>
     * <p>
     * The certificate, private key, and certificate chain must be PEM-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time must be between the <code>Not Before</code> and <code>Not After</code> certificate fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Issuer</code> field must not be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The OCSP authority URL, if present, must not exceed 1000 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * To import a new certificate, omit the <code>CertificateArn</code> argument. Include this argument only when you
     * want to replace a previously imported certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you import a certificate by using the CLI, you must specify the certificate, the certificate chain, and the
     * private key by their file names preceded by <code>fileb://</code>. For example, you can specify a certificate
     * saved in the <code>C:\temp</code> folder as <code>fileb://C:\temp\certificate_to_import.pem</code>. If you are
     * making an HTTP or HTTPS Query request, include these arguments as BLOBs.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you import a certificate by using an SDK, you must specify the certificate, the certificate chain, and the
     * private key files in the manner required by the programming language you're using.
     * </p>
     * </li>
     * <li>
     * <p>
     * The cryptographic algorithm of an imported certificate must match the algorithm of the signing CA. For example,
     * if the signing CA key type is RSA, then the certificate key type must also be RSA.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation returns the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a>
     * of the imported certificate.
     * </p>
     * 
     * @param importCertificateRequest
     * @return A Java Future containing the result of the ImportCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.ImportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ImportCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(ImportCertificateRequest importCertificateRequest);

    /**
     * <p>
     * Imports a certificate into Amazon Web Services Certificate Manager (ACM) to use with services that are integrated
     * with ACM. Note that <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-services.html">integrated
     * services</a> allow only certificate types and keys they support to be associated with their resources. Further,
     * their support differs depending on whether the certificate is imported into IAM or into ACM. For more
     * information, see the documentation for each service. For more information about importing certificates into ACM,
     * see <a href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a>
     * in the <i>Amazon Web Services Certificate Manager User Guide</i>.
     * </p>
     * <note>
     * <p>
     * ACM does not provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     * renewal</a> for certificates that you import.
     * </p>
     * </note>
     * <p>
     * Note the following guidelines when importing third party certificates:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must enter the private key that matches the certificate you are importing.
     * </p>
     * </li>
     * <li>
     * <p>
     * The private key must be unencrypted. You cannot import a private key that is protected by a password or a
     * passphrase.
     * </p>
     * </li>
     * <li>
     * <p>
     * The private key must be no larger than 5 KB (5,120 bytes).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the certificate you are importing is not self-signed, you must enter its certificate chain.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a certificate chain is included, the issuer must be the subject of one of the certificates in the chain.
     * </p>
     * </li>
     * <li>
     * <p>
     * The certificate, private key, and certificate chain must be PEM-encoded.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time must be between the <code>Not Before</code> and <code>Not After</code> certificate fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Issuer</code> field must not be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * The OCSP authority URL, if present, must not exceed 1000 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * To import a new certificate, omit the <code>CertificateArn</code> argument. Include this argument only when you
     * want to replace a previously imported certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you import a certificate by using the CLI, you must specify the certificate, the certificate chain, and the
     * private key by their file names preceded by <code>fileb://</code>. For example, you can specify a certificate
     * saved in the <code>C:\temp</code> folder as <code>fileb://C:\temp\certificate_to_import.pem</code>. If you are
     * making an HTTP or HTTPS Query request, include these arguments as BLOBs.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you import a certificate by using an SDK, you must specify the certificate, the certificate chain, and the
     * private key files in the manner required by the programming language you're using.
     * </p>
     * </li>
     * <li>
     * <p>
     * The cryptographic algorithm of an imported certificate must match the algorithm of the signing CA. For example,
     * if the signing CA key type is RSA, then the certificate key type must also be RSA.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation returns the <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a>
     * of the imported certificate.
     * </p>
     * 
     * @param importCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.ImportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ImportCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(ImportCertificateRequest importCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<ImportCertificateRequest, ImportCertificateResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of certificate ARNs and domain names. You can request that only certificates that match a
     * specific status be listed. You can also filter by specific attributes of the certificate. Default filtering
     * returns only <code>RSA_2048</code> certificates. For more information, see <a>Filters</a>.
     * </p>
     * 
     * @param listCertificatesRequest
     * @return A Java Future containing the result of the ListCertificates operation returned by the service.
     * @sample AWSCertificateManagerAsync.ListCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ListCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(ListCertificatesRequest listCertificatesRequest);

    /**
     * <p>
     * Retrieves a list of certificate ARNs and domain names. You can request that only certificates that match a
     * specific status be listed. You can also filter by specific attributes of the certificate. Default filtering
     * returns only <code>RSA_2048</code> certificates. For more information, see <a>Filters</a>.
     * </p>
     * 
     * @param listCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCertificates operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.ListCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ListCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(ListCertificatesRequest listCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCertificatesRequest, ListCertificatesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags that have been applied to the ACM certificate. Use the certificate's Amazon Resource Name (ARN) to
     * specify the certificate. To add a tag to an ACM certificate, use the <a>AddTagsToCertificate</a> action. To
     * delete a tag, use the <a>RemoveTagsFromCertificate</a> action.
     * </p>
     * 
     * @param listTagsForCertificateRequest
     * @return A Java Future containing the result of the ListTagsForCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.ListTagsForCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ListTagsForCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForCertificateResult> listTagsForCertificateAsync(ListTagsForCertificateRequest listTagsForCertificateRequest);

    /**
     * <p>
     * Lists the tags that have been applied to the ACM certificate. Use the certificate's Amazon Resource Name (ARN) to
     * specify the certificate. To add a tag to an ACM certificate, use the <a>AddTagsToCertificate</a> action. To
     * delete a tag, use the <a>RemoveTagsFromCertificate</a> action.
     * </p>
     * 
     * @param listTagsForCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.ListTagsForCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ListTagsForCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForCertificateResult> listTagsForCertificateAsync(ListTagsForCertificateRequest listTagsForCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForCertificateRequest, ListTagsForCertificateResult> asyncHandler);

    /**
     * <p>
     * Adds or modifies account-level configurations in ACM.
     * </p>
     * <p>
     * The supported configuration option is <code>DaysBeforeExpiry</code>. This option specifies the number of days
     * prior to certificate expiration when ACM starts generating <code>EventBridge</code> events. ACM sends one event
     * per day per certificate until the certificate expires. By default, accounts receive events starting 45 days
     * before certificate expiration.
     * </p>
     * 
     * @param putAccountConfigurationRequest
     * @return A Java Future containing the result of the PutAccountConfiguration operation returned by the service.
     * @sample AWSCertificateManagerAsync.PutAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/PutAccountConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAccountConfigurationResult> putAccountConfigurationAsync(PutAccountConfigurationRequest putAccountConfigurationRequest);

    /**
     * <p>
     * Adds or modifies account-level configurations in ACM.
     * </p>
     * <p>
     * The supported configuration option is <code>DaysBeforeExpiry</code>. This option specifies the number of days
     * prior to certificate expiration when ACM starts generating <code>EventBridge</code> events. ACM sends one event
     * per day per certificate until the certificate expires. By default, accounts receive events starting 45 days
     * before certificate expiration.
     * </p>
     * 
     * @param putAccountConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAccountConfiguration operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.PutAccountConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/PutAccountConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAccountConfigurationResult> putAccountConfigurationAsync(PutAccountConfigurationRequest putAccountConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutAccountConfigurationRequest, PutAccountConfigurationResult> asyncHandler);

    /**
     * <p>
     * Remove one or more tags from an ACM certificate. A tag consists of a key-value pair. If you do not specify the
     * value portion of the tag when calling this function, the tag will be removed regardless of value. If you specify
     * a value, the tag is removed only if it is associated with the specified value.
     * </p>
     * <p>
     * To add tags to a certificate, use the <a>AddTagsToCertificate</a> action. To view all of the tags that have been
     * applied to a specific ACM certificate, use the <a>ListTagsForCertificate</a> action.
     * </p>
     * 
     * @param removeTagsFromCertificateRequest
     * @return A Java Future containing the result of the RemoveTagsFromCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.RemoveTagsFromCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/RemoveTagsFromCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromCertificateResult> removeTagsFromCertificateAsync(
            RemoveTagsFromCertificateRequest removeTagsFromCertificateRequest);

    /**
     * <p>
     * Remove one or more tags from an ACM certificate. A tag consists of a key-value pair. If you do not specify the
     * value portion of the tag when calling this function, the tag will be removed regardless of value. If you specify
     * a value, the tag is removed only if it is associated with the specified value.
     * </p>
     * <p>
     * To add tags to a certificate, use the <a>AddTagsToCertificate</a> action. To view all of the tags that have been
     * applied to a specific ACM certificate, use the <a>ListTagsForCertificate</a> action.
     * </p>
     * 
     * @param removeTagsFromCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.RemoveTagsFromCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/RemoveTagsFromCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromCertificateResult> removeTagsFromCertificateAsync(
            RemoveTagsFromCertificateRequest removeTagsFromCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromCertificateRequest, RemoveTagsFromCertificateResult> asyncHandler);

    /**
     * <p>
     * Renews an eligible ACM certificate. At this time, only exported private certificates can be renewed with this
     * operation. In order to renew your ACM PCA certificates with ACM, you must first <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaPermissions.html">grant the ACM service principal
     * permission to do so</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/manual-renewal.html">Testing Managed Renewal</a> in the
     * ACM User Guide.
     * </p>
     * 
     * @param renewCertificateRequest
     * @return A Java Future containing the result of the RenewCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.RenewCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/RenewCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RenewCertificateResult> renewCertificateAsync(RenewCertificateRequest renewCertificateRequest);

    /**
     * <p>
     * Renews an eligible ACM certificate. At this time, only exported private certificates can be renewed with this
     * operation. In order to renew your ACM PCA certificates with ACM, you must first <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaPermissions.html">grant the ACM service principal
     * permission to do so</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/manual-renewal.html">Testing Managed Renewal</a> in the
     * ACM User Guide.
     * </p>
     * 
     * @param renewCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RenewCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.RenewCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/RenewCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RenewCertificateResult> renewCertificateAsync(RenewCertificateRequest renewCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<RenewCertificateRequest, RenewCertificateResult> asyncHandler);

    /**
     * <p>
     * Requests an ACM certificate for use with other Amazon Web Services services. To request an ACM certificate, you
     * must specify a fully qualified domain name (FQDN) in the <code>DomainName</code> parameter. You can also specify
     * additional FQDNs in the <code>SubjectAlternativeNames</code> parameter.
     * </p>
     * <p>
     * If you are requesting a private certificate, domain validation is not required. If you are requesting a public
     * certificate, each domain name that you specify must be validated to verify that you own or control the domain.
     * You can use <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html">DNS
     * validation</a> or <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html">email
     * validation</a>. We recommend that you use DNS validation. ACM issues public certificates after receiving approval
     * from the domain owner.
     * </p>
     * <note>
     * <p>
     * ACM behavior differs from the <a
     * href="https://tools.ietf.org/html/rfc6125#appendix-B.2">https://tools.ietf.org/html/rfc6125#appendix-B.2</a>RFC
     * 6125 specification of the certificate validation process. first checks for a subject alternative name, and, if it
     * finds one, ignores the common name (CN)
     * </p>
     * </note>
     * 
     * @param requestCertificateRequest
     * @return A Java Future containing the result of the RequestCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.RequestCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/RequestCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RequestCertificateResult> requestCertificateAsync(RequestCertificateRequest requestCertificateRequest);

    /**
     * <p>
     * Requests an ACM certificate for use with other Amazon Web Services services. To request an ACM certificate, you
     * must specify a fully qualified domain name (FQDN) in the <code>DomainName</code> parameter. You can also specify
     * additional FQDNs in the <code>SubjectAlternativeNames</code> parameter.
     * </p>
     * <p>
     * If you are requesting a private certificate, domain validation is not required. If you are requesting a public
     * certificate, each domain name that you specify must be validated to verify that you own or control the domain.
     * You can use <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html">DNS
     * validation</a> or <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html">email
     * validation</a>. We recommend that you use DNS validation. ACM issues public certificates after receiving approval
     * from the domain owner.
     * </p>
     * <note>
     * <p>
     * ACM behavior differs from the <a
     * href="https://tools.ietf.org/html/rfc6125#appendix-B.2">https://tools.ietf.org/html/rfc6125#appendix-B.2</a>RFC
     * 6125 specification of the certificate validation process. first checks for a subject alternative name, and, if it
     * finds one, ignores the common name (CN)
     * </p>
     * </note>
     * 
     * @param requestCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RequestCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.RequestCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/RequestCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RequestCertificateResult> requestCertificateAsync(RequestCertificateRequest requestCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<RequestCertificateRequest, RequestCertificateResult> asyncHandler);

    /**
     * <p>
     * Resends the email that requests domain ownership validation. The domain owner or an authorized representative
     * must approve the ACM certificate before it can be issued. The certificate can be approved by clicking a link in
     * the mail to navigate to the Amazon certificate approval website and then clicking <b>I Approve</b>. However, the
     * validation email can be blocked by spam filters. Therefore, if you do not receive the original mail, you can
     * request that the mail be resent within 72 hours of requesting the ACM certificate. If more than 72 hours have
     * elapsed since your original request or since your last attempt to resend validation mail, you must request a new
     * certificate. For more information about setting up your contact email addresses, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/setup-email.html">Configure Email for your Domain</a>.
     * </p>
     * 
     * @param resendValidationEmailRequest
     * @return A Java Future containing the result of the ResendValidationEmail operation returned by the service.
     * @sample AWSCertificateManagerAsync.ResendValidationEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ResendValidationEmail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResendValidationEmailResult> resendValidationEmailAsync(ResendValidationEmailRequest resendValidationEmailRequest);

    /**
     * <p>
     * Resends the email that requests domain ownership validation. The domain owner or an authorized representative
     * must approve the ACM certificate before it can be issued. The certificate can be approved by clicking a link in
     * the mail to navigate to the Amazon certificate approval website and then clicking <b>I Approve</b>. However, the
     * validation email can be blocked by spam filters. Therefore, if you do not receive the original mail, you can
     * request that the mail be resent within 72 hours of requesting the ACM certificate. If more than 72 hours have
     * elapsed since your original request or since your last attempt to resend validation mail, you must request a new
     * certificate. For more information about setting up your contact email addresses, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/setup-email.html">Configure Email for your Domain</a>.
     * </p>
     * 
     * @param resendValidationEmailRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResendValidationEmail operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.ResendValidationEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ResendValidationEmail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResendValidationEmailResult> resendValidationEmailAsync(ResendValidationEmailRequest resendValidationEmailRequest,
            com.amazonaws.handlers.AsyncHandler<ResendValidationEmailRequest, ResendValidationEmailResult> asyncHandler);

    /**
     * <p>
     * Updates a certificate. Currently, you can use this function to specify whether to opt in to or out of recording
     * your certificate in a certificate transparency log. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency">
     * Opting Out of Certificate Transparency Logging</a>.
     * </p>
     * 
     * @param updateCertificateOptionsRequest
     * @return A Java Future containing the result of the UpdateCertificateOptions operation returned by the service.
     * @sample AWSCertificateManagerAsync.UpdateCertificateOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/UpdateCertificateOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCertificateOptionsResult> updateCertificateOptionsAsync(UpdateCertificateOptionsRequest updateCertificateOptionsRequest);

    /**
     * <p>
     * Updates a certificate. Currently, you can use this function to specify whether to opt in to or out of recording
     * your certificate in a certificate transparency log. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency">
     * Opting Out of Certificate Transparency Logging</a>.
     * </p>
     * 
     * @param updateCertificateOptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCertificateOptions operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.UpdateCertificateOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/UpdateCertificateOptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCertificateOptionsResult> updateCertificateOptionsAsync(UpdateCertificateOptionsRequest updateCertificateOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCertificateOptionsRequest, UpdateCertificateOptionsResult> asyncHandler);

}
