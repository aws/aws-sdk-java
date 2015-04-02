
/**
 * Synchronous and asynchronous client classes for accessing AmazonCodeDeploy.
 *
 * AWS CodeDeploy <b>Overview</b> <p>
 * This is the AWS CodeDeploy API Reference. This guide provides
 * descriptions of the AWS CodeDeploy APIs. For additional information,
 * see the
 * <a href="http://docs.aws.amazon.com/codedeploy/latest/userguide"> AWS CodeDeploy User Guide </a>
 * .
 * </p>
 * <b>Using the APIs</b> <p>
 * You can use the AWS CodeDeploy APIs to work with the following items:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * Applications are unique identifiers that AWS CodeDeploy uses to ensure
 * that the correct combinations of revisions, deployment configurations,
 * and deployment groups are being referenced during deployments.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, list, and
 * update applications.
 * </p>
 * </li>
 * <li> <p>
 * Deployment configurations are sets of deployment rules and deployment
 * success and failure conditions that AWS CodeDeploy uses during
 * deployments.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, and list
 * deployment configurations.
 * </p>
 * </li>
 * <li> <p>
 * Deployment groups are groups of instances to which application
 * revisions can be deployed.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, delete, get, list, and
 * update deployment groups.
 * </p>
 * </li>
 * <li> <p>
 * Instances represent Amazon EC2 instances to which application
 * revisions are deployed. Instances are identified by their Amazon EC2
 * tags or Auto Scaling group names. Instances belong to deployment
 * groups.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to get and list instances.
 * </p>
 * </li>
 * <li> <p>
 * Deployments represent the process of deploying revisions to instances.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to create, get, list, and stop
 * deployments.
 * </p>
 * </li>
 * <li> <p>
 * Application revisions are archive files that are stored in Amazon S3
 * buckets or GitHub repositories. These revisions contain source content
 * (such as source code, web pages, executable files, any deployment
 * scripts, and similar) along with an Application Specification file
 * (AppSpec file). (The AppSpec file is unique to AWS CodeDeploy; it
 * defines a series of deployment actions that you want AWS CodeDeploy to
 * execute.) An application revision is uniquely identified by its Amazon
 * S3 object key and its ETag, version, or both (for application
 * revisions that are stored in Amazon S3 buckets) or by its repository
 * name and commit ID (for applications revisions that are stored in
 * GitHub repositories). Application revisions are deployed through
 * deployment groups.
 * </p>
 * <p>
 * You can use the AWS CodeDeploy APIs to get, list, and register
 * application revisions.
 * </p>
 * </li>
 * 
 * </ul>
 */
 package com.amazonaws.services.codedeploy;
        