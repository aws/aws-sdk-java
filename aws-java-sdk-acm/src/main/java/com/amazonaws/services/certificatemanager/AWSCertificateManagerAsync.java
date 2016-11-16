/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <fullname>AWS Certificate Manager</fullname>
 * <p>
 * Welcome to the AWS Certificate Manager (ACM) API documentation.
 * </p>
 * <p>
 * You can use ACM to manage SSL/TLS certificates for your AWS-based websites and applications. For general information
 * about using ACM, see the <a href="http://docs.aws.amazon.com/acm/latest/userguide/"> <i>AWS Certificate Manager User
 * Guide</i> </a>.
 * </p>
 */
public interface AWSCertificateManagerAsync extends AWSCertificateManager {

    /**
     * <p>
     * Adds one or more tags to an ACM Certificate. Tags are labels that you can use to identify and organize your AWS
     * resources. Each tag consists of a <code>key</code> and an optional <code>value</code>. You specify the
     * certificate on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value pair.
     * </p>
     * <p>
     * You can apply a tag to just one certificate if you want to identify a specific characteristic of that
     * certificate, or you can apply the same tag to multiple certificates if you want to filter for a common
     * relationship among those certificates. Similarly, you can apply the same tag to multiple resources if you want to
     * specify a relationship among those resources. For example, you can add the same tag to an ACM Certificate and an
     * Elastic Load Balancing load balancer to indicate that they are both used by the same website. For more
     * information, see <a href="http://docs.aws.amazon.com/acm/latest/userguide/tags.html">Tagging ACM
     * Certificates</a>.
     * </p>
     * <p>
     * To remove one or more tags, use the <a>RemoveTagsFromCertificate</a> action. To view all of the tags that have
     * been applied to the certificate, use the <a>ListTagsForCertificate</a> action.
     * </p>
     * 
     * @param addTagsToCertificateRequest
     * @return A Java Future containing the result of the AddTagsToCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.AddTagsToCertificate
     */
    java.util.concurrent.Future<AddTagsToCertificateResult> addTagsToCertificateAsync(AddTagsToCertificateRequest addTagsToCertificateRequest);

    /**
     * <p>
     * Adds one or more tags to an ACM Certificate. Tags are labels that you can use to identify and organize your AWS
     * resources. Each tag consists of a <code>key</code> and an optional <code>value</code>. You specify the
     * certificate on input by its Amazon Resource Name (ARN). You specify the tag by using a key-value pair.
     * </p>
     * <p>
     * You can apply a tag to just one certificate if you want to identify a specific characteristic of that
     * certificate, or you can apply the same tag to multiple certificates if you want to filter for a common
     * relationship among those certificates. Similarly, you can apply the same tag to multiple resources if you want to
     * specify a relationship among those resources. For example, you can add the same tag to an ACM Certificate and an
     * Elastic Load Balancing load balancer to indicate that they are both used by the same website. For more
     * information, see <a href="http://docs.aws.amazon.com/acm/latest/userguide/tags.html">Tagging ACM
     * Certificates</a>.
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
     */
    java.util.concurrent.Future<AddTagsToCertificateResult> addTagsToCertificateAsync(AddTagsToCertificateRequest addTagsToCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToCertificateRequest, AddTagsToCertificateResult> asyncHandler);

    /**
     * <p>
     * Deletes an ACM Certificate and its associated private key. If this action succeeds, the certificate no longer
     * appears in the list of ACM Certificates that can be displayed by calling the <a>ListCertificates</a> action or be
     * retrieved by calling the <a>GetCertificate</a> action. The certificate will not be available for use by other AWS
     * services.
     * </p>
     * <note>
     * <p>
     * You cannot delete an ACM Certificate that is being used by another AWS service. To delete a certificate that is
     * in use, the certificate association must first be removed.
     * </p>
     * </note>
     * 
     * @param deleteCertificateRequest
     * @return A Java Future containing the result of the DeleteCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.DeleteCertificate
     */
    java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest deleteCertificateRequest);

    /**
     * <p>
     * Deletes an ACM Certificate and its associated private key. If this action succeeds, the certificate no longer
     * appears in the list of ACM Certificates that can be displayed by calling the <a>ListCertificates</a> action or be
     * retrieved by calling the <a>GetCertificate</a> action. The certificate will not be available for use by other AWS
     * services.
     * </p>
     * <note>
     * <p>
     * You cannot delete an ACM Certificate that is being used by another AWS service. To delete a certificate that is
     * in use, the certificate association must first be removed.
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
     */
    java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest deleteCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, DeleteCertificateResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the fields contained in the specified ACM Certificate. For example, this action returns the
     * certificate status, a flag that indicates whether the certificate is associated with any other AWS service, and
     * the date at which the certificate request was created. You specify the ACM Certificate on input by its Amazon
     * Resource Name (ARN).
     * </p>
     * 
     * @param describeCertificateRequest
     * @return A Java Future containing the result of the DescribeCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.DescribeCertificate
     */
    java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(DescribeCertificateRequest describeCertificateRequest);

    /**
     * <p>
     * Returns a list of the fields contained in the specified ACM Certificate. For example, this action returns the
     * certificate status, a flag that indicates whether the certificate is associated with any other AWS service, and
     * the date at which the certificate request was created. You specify the ACM Certificate on input by its Amazon
     * Resource Name (ARN).
     * </p>
     * 
     * @param describeCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.DescribeCertificate
     */
    java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(DescribeCertificateRequest describeCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCertificateRequest, DescribeCertificateResult> asyncHandler);

    /**
     * <p>
     * Retrieves an ACM Certificate and certificate chain for the certificate specified by an ARN. The chain is an
     * ordered list of certificates that contains the root certificate, intermediate certificates of subordinate CAs,
     * and the ACM Certificate. The certificate and certificate chain are base64 encoded. If you want to decode the
     * certificate chain to see the individual certificate fields, you can use OpenSSL.
     * </p>
     * <note>
     * <p>
     * Currently, ACM Certificates can be used only with Elastic Load Balancing and Amazon CloudFront.
     * </p>
     * </note>
     * 
     * @param getCertificateRequest
     * @return A Java Future containing the result of the GetCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.GetCertificate
     */
    java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(GetCertificateRequest getCertificateRequest);

    /**
     * <p>
     * Retrieves an ACM Certificate and certificate chain for the certificate specified by an ARN. The chain is an
     * ordered list of certificates that contains the root certificate, intermediate certificates of subordinate CAs,
     * and the ACM Certificate. The certificate and certificate chain are base64 encoded. If you want to decode the
     * certificate chain to see the individual certificate fields, you can use OpenSSL.
     * </p>
     * <note>
     * <p>
     * Currently, ACM Certificates can be used only with Elastic Load Balancing and Amazon CloudFront.
     * </p>
     * </note>
     * 
     * @param getCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.GetCertificate
     */
    java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(GetCertificateRequest getCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<GetCertificateRequest, GetCertificateResult> asyncHandler);

    /**
     * <p>
     * Imports an SSL/TLS certificate into AWS Certificate Manager (ACM) to use with <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-services.html">ACM's integrated AWS services</a>.
     * </p>
     * <note>
     * <p>
     * ACM does not provide <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     * renewal</a> for certificates that you import.
     * </p>
     * </note>
     * <p>
     * For more information about importing certificates into ACM, including the differences between certificates that
     * you import and those that ACM provides, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a> in the
     * <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * To import a certificate, you must provide the certificate and the matching private key. When the certificate is
     * not self-signed, you must also provide a certificate chain. You can omit the certificate chain when importing a
     * self-signed certificate.
     * </p>
     * <p>
     * The certificate, private key, and certificate chain must be PEM-encoded. For more information about converting
     * these items to PEM format, see <a href=
     * "http://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html#import-certificate-troubleshooting"
     * >Importing Certificates Troubleshooting</a> in the <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * To import a new certificate, omit the <code>CertificateArn</code> field. Include this field only when you want to
     * replace a previously imported certificate.
     * </p>
     * <p>
     * This operation returns the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a>
     * of the imported certificate.
     * </p>
     * 
     * @param importCertificateRequest
     * @return A Java Future containing the result of the ImportCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.ImportCertificate
     */
    java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(ImportCertificateRequest importCertificateRequest);

    /**
     * <p>
     * Imports an SSL/TLS certificate into AWS Certificate Manager (ACM) to use with <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-services.html">ACM's integrated AWS services</a>.
     * </p>
     * <note>
     * <p>
     * ACM does not provide <a href="http://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     * renewal</a> for certificates that you import.
     * </p>
     * </note>
     * <p>
     * For more information about importing certificates into ACM, including the differences between certificates that
     * you import and those that ACM provides, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a> in the
     * <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * To import a certificate, you must provide the certificate and the matching private key. When the certificate is
     * not self-signed, you must also provide a certificate chain. You can omit the certificate chain when importing a
     * self-signed certificate.
     * </p>
     * <p>
     * The certificate, private key, and certificate chain must be PEM-encoded. For more information about converting
     * these items to PEM format, see <a href=
     * "http://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html#import-certificate-troubleshooting"
     * >Importing Certificates Troubleshooting</a> in the <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * <p>
     * To import a new certificate, omit the <code>CertificateArn</code> field. Include this field only when you want to
     * replace a previously imported certificate.
     * </p>
     * <p>
     * This operation returns the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a>
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
     */
    java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(ImportCertificateRequest importCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<ImportCertificateRequest, ImportCertificateResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of ACM Certificates and the domain name for each. You can optionally filter the list to return
     * only the certificates that match the specified status.
     * </p>
     * 
     * @param listCertificatesRequest
     * @return A Java Future containing the result of the ListCertificates operation returned by the service.
     * @sample AWSCertificateManagerAsync.ListCertificates
     */
    java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(ListCertificatesRequest listCertificatesRequest);

    /**
     * <p>
     * Retrieves a list of ACM Certificates and the domain name for each. You can optionally filter the list to return
     * only the certificates that match the specified status.
     * </p>
     * 
     * @param listCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCertificates operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.ListCertificates
     */
    java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(ListCertificatesRequest listCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCertificatesRequest, ListCertificatesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags that have been applied to the ACM Certificate. Use the certificate ARN to specify the certificate.
     * To add a tag to an ACM Certificate, use the <a>AddTagsToCertificate</a> action. To delete a tag, use the
     * <a>RemoveTagsFromCertificate</a> action.
     * </p>
     * 
     * @param listTagsForCertificateRequest
     * @return A Java Future containing the result of the ListTagsForCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.ListTagsForCertificate
     */
    java.util.concurrent.Future<ListTagsForCertificateResult> listTagsForCertificateAsync(ListTagsForCertificateRequest listTagsForCertificateRequest);

    /**
     * <p>
     * Lists the tags that have been applied to the ACM Certificate. Use the certificate ARN to specify the certificate.
     * To add a tag to an ACM Certificate, use the <a>AddTagsToCertificate</a> action. To delete a tag, use the
     * <a>RemoveTagsFromCertificate</a> action.
     * </p>
     * 
     * @param listTagsForCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.ListTagsForCertificate
     */
    java.util.concurrent.Future<ListTagsForCertificateResult> listTagsForCertificateAsync(ListTagsForCertificateRequest listTagsForCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForCertificateRequest, ListTagsForCertificateResult> asyncHandler);

    /**
     * <p>
     * Remove one or more tags from an ACM Certificate. A tag consists of a key-value pair. If you do not specify the
     * value portion of the tag when calling this function, the tag will be removed regardless of value. If you specify
     * a value, the tag is removed only if it is associated with the specified value.
     * </p>
     * <p>
     * To add tags to a certificate, use the <a>AddTagsToCertificate</a> action. To view all of the tags that have been
     * applied to a specific ACM Certificate, use the <a>ListTagsForCertificate</a> action.
     * </p>
     * 
     * @param removeTagsFromCertificateRequest
     * @return A Java Future containing the result of the RemoveTagsFromCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.RemoveTagsFromCertificate
     */
    java.util.concurrent.Future<RemoveTagsFromCertificateResult> removeTagsFromCertificateAsync(
            RemoveTagsFromCertificateRequest removeTagsFromCertificateRequest);

    /**
     * <p>
     * Remove one or more tags from an ACM Certificate. A tag consists of a key-value pair. If you do not specify the
     * value portion of the tag when calling this function, the tag will be removed regardless of value. If you specify
     * a value, the tag is removed only if it is associated with the specified value.
     * </p>
     * <p>
     * To add tags to a certificate, use the <a>AddTagsToCertificate</a> action. To view all of the tags that have been
     * applied to a specific ACM Certificate, use the <a>ListTagsForCertificate</a> action.
     * </p>
     * 
     * @param removeTagsFromCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.RemoveTagsFromCertificate
     */
    java.util.concurrent.Future<RemoveTagsFromCertificateResult> removeTagsFromCertificateAsync(
            RemoveTagsFromCertificateRequest removeTagsFromCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromCertificateRequest, RemoveTagsFromCertificateResult> asyncHandler);

    /**
     * <p>
     * Requests an ACM Certificate for use with other AWS services. To request an ACM Certificate, you must specify the
     * fully qualified domain name (FQDN) for your site. You can also specify additional FQDNs if users can reach your
     * site by using other names. For each domain name you specify, email is sent to the domain owner to request
     * approval to issue the certificate. After receiving approval from the domain owner, the ACM Certificate is issued.
     * For more information, see the <a href="http://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager
     * User Guide</a>.
     * </p>
     * 
     * @param requestCertificateRequest
     * @return A Java Future containing the result of the RequestCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsync.RequestCertificate
     */
    java.util.concurrent.Future<RequestCertificateResult> requestCertificateAsync(RequestCertificateRequest requestCertificateRequest);

    /**
     * <p>
     * Requests an ACM Certificate for use with other AWS services. To request an ACM Certificate, you must specify the
     * fully qualified domain name (FQDN) for your site. You can also specify additional FQDNs if users can reach your
     * site by using other names. For each domain name you specify, email is sent to the domain owner to request
     * approval to issue the certificate. After receiving approval from the domain owner, the ACM Certificate is issued.
     * For more information, see the <a href="http://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager
     * User Guide</a>.
     * </p>
     * 
     * @param requestCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RequestCertificate operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.RequestCertificate
     */
    java.util.concurrent.Future<RequestCertificateResult> requestCertificateAsync(RequestCertificateRequest requestCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<RequestCertificateRequest, RequestCertificateResult> asyncHandler);

    /**
     * <p>
     * Resends the email that requests domain ownership validation. The domain owner or an authorized representative
     * must approve the ACM Certificate before it can be issued. The certificate can be approved by clicking a link in
     * the mail to navigate to the Amazon certificate approval website and then clicking <b>I Approve</b>. However, the
     * validation email can be blocked by spam filters. Therefore, if you do not receive the original mail, you can
     * request that the mail be resent within 72 hours of requesting the ACM Certificate. If more than 72 hours have
     * elapsed since your original request or since your last attempt to resend validation mail, you must request a new
     * certificate.
     * </p>
     * 
     * @param resendValidationEmailRequest
     * @return A Java Future containing the result of the ResendValidationEmail operation returned by the service.
     * @sample AWSCertificateManagerAsync.ResendValidationEmail
     */
    java.util.concurrent.Future<ResendValidationEmailResult> resendValidationEmailAsync(ResendValidationEmailRequest resendValidationEmailRequest);

    /**
     * <p>
     * Resends the email that requests domain ownership validation. The domain owner or an authorized representative
     * must approve the ACM Certificate before it can be issued. The certificate can be approved by clicking a link in
     * the mail to navigate to the Amazon certificate approval website and then clicking <b>I Approve</b>. However, the
     * validation email can be blocked by spam filters. Therefore, if you do not receive the original mail, you can
     * request that the mail be resent within 72 hours of requesting the ACM Certificate. If more than 72 hours have
     * elapsed since your original request or since your last attempt to resend validation mail, you must request a new
     * certificate.
     * </p>
     * 
     * @param resendValidationEmailRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResendValidationEmail operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.ResendValidationEmail
     */
    java.util.concurrent.Future<ResendValidationEmailResult> resendValidationEmailAsync(ResendValidationEmailRequest resendValidationEmailRequest,
            com.amazonaws.handlers.AsyncHandler<ResendValidationEmailRequest, ResendValidationEmailResult> asyncHandler);

}
