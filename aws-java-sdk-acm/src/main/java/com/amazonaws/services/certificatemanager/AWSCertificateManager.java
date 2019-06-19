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
package com.amazonaws.services.certificatemanager;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.certificatemanager.model.*;
import com.amazonaws.services.certificatemanager.waiters.AWSCertificateManagerWaiters;

/**
 * Interface for accessing ACM.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.certificatemanager.AbstractAWSCertificateManager} instead.
 * </p>
 * <p>
 * <fullname>AWS Certificate Manager</fullname>
 * <p>
 * Welcome to the AWS Certificate Manager (ACM) API documentation.
 * </p>
 * <p>
 * You can use ACM to manage SSL/TLS certificates for your AWS-based websites and applications. For general information
 * about using ACM, see the <a href="https://docs.aws.amazon.com/acm/latest/userguide/"> <i>AWS Certificate Manager User
 * Guide</i> </a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCertificateManager {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "acm";

    /**
     * Overrides the default endpoint for this client ("https://acm.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "acm.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://acm.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from
     * this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "acm.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://acm.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate
     *        with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSCertificateManager#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Adds one or more tags to an ACM certificate. Tags are labels that you can use to identify and organize your AWS
     * resources. Each tag consists of a <code>key</code> and an optional <code>value</code>. You specify the
     * certificate on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value pair.
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
     * @return Result of the AddTagsToCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidTagException
     *         One or both of the values that make up the key-value pair is not valid. For example, you cannot specify a
     *         tag value that begins with <code>aws:</code>.
     * @throws TooManyTagsException
     *         The request contains too many tags. Try the request again with fewer tags.
     * @sample AWSCertificateManager.AddTagsToCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/AddTagsToCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    AddTagsToCertificateResult addTagsToCertificate(AddTagsToCertificateRequest addTagsToCertificateRequest);

    /**
     * <p>
     * Deletes a certificate and its associated private key. If this action succeeds, the certificate no longer appears
     * in the list that can be displayed by calling the <a>ListCertificates</a> action or be retrieved by calling the
     * <a>GetCertificate</a> action. The certificate will not be available for use by AWS services integrated with ACM.
     * </p>
     * <note>
     * <p>
     * You cannot delete an ACM certificate that is being used by another AWS service. To delete a certificate that is
     * in use, the certificate association must first be removed.
     * </p>
     * </note>
     * 
     * @param deleteCertificateRequest
     * @return Result of the DeleteCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws ResourceInUseException
     *         The certificate is in use by another AWS service in the caller's account. Remove the association and try
     *         again.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.DeleteCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/DeleteCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteCertificateResult deleteCertificate(DeleteCertificateRequest deleteCertificateRequest);

    /**
     * <p>
     * Returns detailed metadata about the specified ACM certificate.
     * </p>
     * 
     * @param describeCertificateRequest
     * @return Result of the DescribeCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.DescribeCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/DescribeCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeCertificateResult describeCertificate(DescribeCertificateRequest describeCertificateRequest);

    /**
     * <p>
     * Exports a private certificate issued by a private certificate authority (CA) for use anywhere. You can export the
     * certificate, the certificate chain, and the encrypted private key associated with the public key embedded in the
     * certificate. You must store the private key securely. The private key is a 2048 bit RSA key. You must provide a
     * passphrase for the private key when exporting it. You can use the following OpenSSL command to decrypt it later.
     * Provide the passphrase when prompted.
     * </p>
     * <p>
     * <code>openssl rsa -in encrypted_key.pem -out decrypted_key.pem</code>
     * </p>
     * 
     * @param exportCertificateRequest
     * @return Result of the ExportCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws RequestInProgressException
     *         The certificate request is in process and the certificate in your account has not yet been issued.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.ExportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ExportCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    ExportCertificateResult exportCertificate(ExportCertificateRequest exportCertificateRequest);

    /**
     * <p>
     * Retrieves a certificate specified by an ARN and its certificate chain . The chain is an ordered list of
     * certificates that contains the end entity certificate, intermediate certificates of subordinate CAs, and the root
     * certificate in that order. The certificate and certificate chain are base64 encoded. If you want to decode the
     * certificate to see the individual fields, you can use OpenSSL.
     * </p>
     * 
     * @param getCertificateRequest
     * @return Result of the GetCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws RequestInProgressException
     *         The certificate request is in process and the certificate in your account has not yet been issued.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.GetCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/GetCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    GetCertificateResult getCertificate(GetCertificateRequest getCertificateRequest);

    /**
     * <p>
     * Imports a certificate into AWS Certificate Manager (ACM) to use with services that are integrated with ACM. Note
     * that <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-services.html">integrated services</a> allow
     * only certificate types and keys they support to be associated with their resources. Further, their support
     * differs depending on whether the certificate is imported into IAM or into ACM. For more information, see the
     * documentation for each service. For more information about importing certificates into ACM, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a> in the
     * <i>AWS Certificate Manager User Guide</i>.
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
     * private key by their file names preceded by <code>file://</code>. For example, you can specify a certificate
     * saved in the <code>C:\temp</code> folder as <code>file://C:\temp\certificate_to_import.pem</code>. If you are
     * making an HTTP or HTTPS Query request, include these arguments as BLOBs.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you import a certificate by using an SDK, you must specify the certificate, the certificate chain, and the
     * private key files in the manner required by the programming language you're using.
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
     * @return Result of the ImportCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws LimitExceededException
     *         An ACM limit has been exceeded.
     * @sample AWSCertificateManager.ImportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ImportCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    ImportCertificateResult importCertificate(ImportCertificateRequest importCertificateRequest);

    /**
     * <p>
     * Retrieves a list of certificate ARNs and domain names. You can request that only certificates that match a
     * specific status be listed. You can also filter by specific attributes of the certificate.
     * </p>
     * 
     * @param listCertificatesRequest
     * @return Result of the ListCertificates operation returned by the service.
     * @throws InvalidArgsException
     *         One or more of of request parameters specified is not valid.
     * @sample AWSCertificateManager.ListCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ListCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    ListCertificatesResult listCertificates(ListCertificatesRequest listCertificatesRequest);

    /**
     * <p>
     * Lists the tags that have been applied to the ACM certificate. Use the certificate's Amazon Resource Name (ARN) to
     * specify the certificate. To add a tag to an ACM certificate, use the <a>AddTagsToCertificate</a> action. To
     * delete a tag, use the <a>RemoveTagsFromCertificate</a> action.
     * </p>
     * 
     * @param listTagsForCertificateRequest
     * @return Result of the ListTagsForCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.ListTagsForCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ListTagsForCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForCertificateResult listTagsForCertificate(ListTagsForCertificateRequest listTagsForCertificateRequest);

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
     * @return Result of the RemoveTagsFromCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidTagException
     *         One or both of the values that make up the key-value pair is not valid. For example, you cannot specify a
     *         tag value that begins with <code>aws:</code>.
     * @sample AWSCertificateManager.RemoveTagsFromCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/RemoveTagsFromCertificate" target="_top">AWS
     *      API Documentation</a>
     */
    RemoveTagsFromCertificateResult removeTagsFromCertificate(RemoveTagsFromCertificateRequest removeTagsFromCertificateRequest);

    /**
     * <p>
     * Renews an eligable ACM certificate. At this time, only exported private certificates can be renewed with this
     * operation. In order to renew your ACM PCA certificates with ACM, you must first <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaPermissions.html">grant the ACM service principal
     * permission to do so</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/manual-renewal.html">Testing Managed Renewal</a> in the
     * ACM User Guide.
     * </p>
     * 
     * @param renewCertificateRequest
     * @return Result of the RenewCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.RenewCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/RenewCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    RenewCertificateResult renewCertificate(RenewCertificateRequest renewCertificateRequest);

    /**
     * <p>
     * Requests an ACM certificate for use with other AWS services. To request an ACM certificate, you must specify a
     * fully qualified domain name (FQDN) in the <code>DomainName</code> parameter. You can also specify additional
     * FQDNs in the <code>SubjectAlternativeNames</code> parameter.
     * </p>
     * <p>
     * If you are requesting a private certificate, domain validation is not required. If you are requesting a public
     * certificate, each domain name that you specify must be validated to verify that you own or control the domain.
     * You can use <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html">DNS
     * validation</a> or <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html">email
     * validation</a>. We recommend that you use DNS validation. ACM issues public certificates after receiving approval
     * from the domain owner.
     * </p>
     * 
     * @param requestCertificateRequest
     * @return Result of the RequestCertificate operation returned by the service.
     * @throws LimitExceededException
     *         An ACM limit has been exceeded.
     * @throws InvalidDomainValidationOptionsException
     *         One or more values in the <a>DomainValidationOption</a> structure is incorrect.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.RequestCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/RequestCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    RequestCertificateResult requestCertificate(RequestCertificateRequest requestCertificateRequest);

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
     * @return Result of the ResendValidationEmail operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws InvalidStateException
     *         Processing has reached an invalid state.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @throws InvalidDomainValidationOptionsException
     *         One or more values in the <a>DomainValidationOption</a> structure is incorrect.
     * @sample AWSCertificateManager.ResendValidationEmail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ResendValidationEmail" target="_top">AWS API
     *      Documentation</a>
     */
    ResendValidationEmailResult resendValidationEmail(ResendValidationEmailRequest resendValidationEmailRequest);

    /**
     * <p>
     * Updates a certificate. Currently, you can use this function to specify whether to opt in to or out of recording
     * your certificate in a certificate transparency log. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency">
     * Opting Out of Certificate Transparency Logging</a>.
     * </p>
     * 
     * @param updateCertificateOptionsRequest
     * @return Result of the UpdateCertificateOptions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's account or the caller's account cannot be
     *         found.
     * @throws LimitExceededException
     *         An ACM limit has been exceeded.
     * @throws InvalidStateException
     *         Processing has reached an invalid state.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an existing resource.
     * @sample AWSCertificateManager.UpdateCertificateOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/UpdateCertificateOptions" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateCertificateOptionsResult updateCertificateOptions(UpdateCertificateOptionsRequest updateCertificateOptionsRequest);

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

    AWSCertificateManagerWaiters waiters();

}
