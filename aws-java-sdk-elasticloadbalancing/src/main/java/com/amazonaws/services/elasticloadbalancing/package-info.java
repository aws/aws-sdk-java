
/**
 * Synchronous and asynchronous client classes for accessing AmazonElasticLoadBalancing.
 *
 * Elastic Load Balancing <p>
 * Elastic Load Balancing is a way to automatically distribute incoming
 * web traffic across applications that run on multiple Amazon Elastic
 * Compute Cloud (Amazon EC2) instances.
 * </p>
 * <p>
 * You can create, access, and manage Elastic Load Balancing using the
 * AWS Management Console, the AWS Command Line Interface (AWS CLI), the
 * Query API, or the AWS SDKs. For more information about Elastic Load
 * Balancing interfaces, see
 * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/SvcIntro_Interfaces.html"> Accessing Elastic Load Balancing </a>
 * .
 * </p>
 * <p>
 * This reference guide contains documentation for the Query API and the
 * AWS CLI commands, to manage Elastic Load Balancing.
 * </p>
 * <p>
 * For detailed information about Elastic Load Balancing features and
 * their associated actions or commands, go to
 * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/UserScenarios.html"> Managing Load Balancers </a>
 * in the <i>Elastic Load Balancing Developer Guide</i> .
 * </p>
 * <p>
 * This reference guide is based on the current WSDL, which is available
 * at:
 * <a href="http://ec2-downloads.s3.amazonaws.com/ElasticLoadBalancing.wsdl"> </a>
 * .
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * The examples in this guide assume that your load balancers are created
 * in the US East (Northern Virginia) region and use us-east-1 as the
 * endpoint.
 * </p>
 * <p>
 * You can create your load balancers in other AWS regions. For
 * information about regions and endpoints supported by Elastic Load
 * Balancing, see
 * <a href="http://docs.aws.amazon.com/general/latest/gr/index.html?rande.html"> Regions and Endpoints </a>
 * in the Amazon Web Services General Reference.
 * </p>
 * <p>
 * <b>Idempotency</b>
 * </p>
 * <p>
 * All Elastic Load Balancing Query API actions and AWS CLI commands are
 * designed to be idempotent. An <i>idempotent</i> action or command
 * completes no more than one time. If you repeat a request or a command
 * using the same values the action will succeed with a 200 OK response
 * code.
 * </p>
 */
 package com.amazonaws.services.elasticloadbalancing;
        