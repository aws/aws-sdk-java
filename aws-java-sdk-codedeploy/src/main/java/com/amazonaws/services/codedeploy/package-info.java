
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
 * <i>Applications</i> , which are unique identifiers that AWS
 * CodeDeploy uses to ensure that the correct combinations of revisions,
 * deployment configurations, and deployment groups are being referenced
 * during deployments.
 * </p>
 * <p>
 * You can work with applications by calling CreateApplication,
 * DeleteApplication, GetApplication, ListApplications,
 * BatchGetApplications, and UpdateApplication to create, delete, and get
 * information about applications, and to change information about an
 * application, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployment configurations</i> , which are sets of deployment rules
 * and deployment success and failure conditions that AWS CodeDeploy uses
 * during deployments.
 * </p>
 * <p>
 * You can work with deployment configurations by calling
 * CreateDeploymentConfig, DeleteDeploymentConfig, GetDeploymentConfig,
 * and ListDeploymentConfigs to create, delete, and get information about
 * deployment configurations, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployment groups</i> , which represent groups of Amazon EC2
 * instances to which application revisions can be deployed.
 * </p>
 * <p>
 * You can work with deployment groups by calling CreateDeploymentGroup,
 * DeleteDeploymentGroup, GetDeploymentGroup, ListDeploymentGroups, and
 * UpdateDeploymentGroup to create, delete, and get information about
 * single and multiple deployment groups, and to change information about
 * a deployment group, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployment instances</i> (also known simply as <i>instances</i> ),
 * which represent Amazon EC2 instances to which application revisions
 * are deployed. Deployment instances are identified by their Amazon EC2
 * tags or Auto Scaling group names. Deployment instances belong to
 * deployment groups.
 * </p>
 * <p>
 * You can work with deployment instances by calling
 * GetDeploymentInstance and ListDeploymentInstances to get information
 * about single and multiple deployment instances, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Deployments</i> , which represent the process of deploying
 * revisions to deployment groups.
 * </p>
 * <p>
 * You can work with deployments by calling CreateDeployment,
 * GetDeployment, ListDeployments, BatchGetDeployments, and
 * StopDeployment to create and get information about deployments, and to
 * stop a deployment, respectively.
 * </p>
 * </li>
 * <li> <p>
 * <i>Application revisions</i> (also known simply as <i>revisions</i>
 * ), which are archive files that are stored in Amazon S3 buckets or
 * GitHub repositories. These revisions contain source content (such as
 * source code, web pages, executable files, any deployment scripts, and
 * similar) along with an Application Specification file (AppSpec file).
 * (The AppSpec file is unique to AWS CodeDeploy; it defines a series of
 * deployment actions that you want AWS CodeDeploy to execute.) An
 * application revision is uniquely identified by its Amazon S3 object
 * key and its ETag, version, or both. Application revisions are deployed
 * to deployment groups.
 * </p>
 * <p>
 * You can work with application revisions by calling
 * GetApplicationRevision, ListApplicationRevisions, and
 * RegisterApplicationRevision to get information about application
 * revisions and to inform AWS CodeDeploy about an application revision,
 * respectively.
 * </p>
 * </li>
 * 
 * </ul>
 */
 package com.amazonaws.services.codedeploy;
        