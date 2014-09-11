
/**
 * Synchronous and asynchronous client classes for accessing AWSSecurityTokenService.
 *
 * AWS Security Token Service <p>
 * The AWS Security Token Service (STS) is a web service that enables you
 * to request temporary, limited-privilege credentials for AWS Identity
 * and Access Management (IAM) users or for users that you authenticate
 * (federated users). This guide provides descriptions of the STS API.
 * For more detailed information about using this service, go to
 * <a href="http://docs.aws.amazon.com/IAM/latest/UsingSTS/Welcome.html"> Using Temporary Security Credentials </a>
 * .
 * </p>
 * <p>
 * <b>NOTE:</b> As an alternative to using the API, you can use one of
 * the AWS SDKs, which consist of libraries and sample code for various
 * programming languages and platforms (Java, Ruby, .NET, iOS, Android,
 * etc.). The SDKs provide a convenient way to create programmatic access
 * to STS. For example, the SDKs take care of cryptographically signing
 * requests, managing errors, and retrying requests automatically. For
 * information about the AWS SDKs, including how to download and install
 * them, see the Tools for Amazon Web Services page.
 * </p>
 * <p>
 * For information about setting up signatures and authorization through
 * the API, go to
 * <a href="http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"> Signing AWS API Requests </a> in the <i>AWS General Reference</i> . For general information about the Query API, go to <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"> Making Query Requests </a> in <i>Using IAM</i> . For information about using security tokens with other AWS products, go to <a href="http://docs.aws.amazon.com/IAM/latest/UsingSTS/UsingTokens.html"> Using Temporary Security Credentials to Access AWS </a>
 * in <i>Using Temporary Security Credentials</i> .
 * </p>
 * <p>
 * If you're new to AWS and need additional technical information about a
 * specific AWS product, you can find the product's technical
 * documentation at
 * <a href="http://aws.amazon.com/documentation/"> http://aws.amazon.com/documentation/ </a>
 * .
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * For information about STS endpoints, see
 * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sts_region"> Regions and Endpoints </a>
 * in the <i>AWS General Reference</i> .
 * </p>
 * <p>
 * <b>Recording API requests</b>
 * </p>
 * <p>
 * STS supports AWS CloudTrail, which is a service that records AWS calls
 * for your AWS account and delivers log files to an Amazon S3 bucket. By
 * using information collected by CloudTrail, you can determine what
 * requests were successfully made to STS, who made the request, when it
 * was made, and so on. To learn more about CloudTrail, including how to
 * turn it on and find your log files, see the
 * <a href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/whatisawscloudtrail.html"> AWS CloudTrail User Guide </a>
 * .
 * </p>
 */
 package com.amazonaws.services.securitytoken;
        