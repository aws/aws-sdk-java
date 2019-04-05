/*
 * Copyright 2013-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.regions;


/**
 * Abbreviations for looking up information about a specific service. Used in
 * {@link Region#getServiceEndpoint(String)} and related methods.
 *
 * @deprecated use the constant ENDPOINT_PREFIX from the specific service client
 *             interface instead for retrieving the specific service abbreviation,
 *             e.g. AmazonEC2.ENDPOINT_PREFIX.
 */

@Deprecated
public final class ServiceAbbreviations {
    public static final String Autoscaling = "autoscaling";
    public static final String CloudFormation = "cloudformation";
    public static final String CloudFront = "cloudfront";
    public static final String CloudHSM = "cloudhsm";
    public static final String CloudSearch = "cloudsearch";
    public static final String CloudTrail = "cloudtrail";
    public static final String CloudWatch = "monitoring";
    public static final String CloudWatchLogs = "logs";
    public static final String CodeDeploy = "codedeploy";
    public static final String CodeCommit = "codecommit";
    public static final String CodePipeline = "codepipeline";
    public static final String CognitoIdentity = "cognito-identity";
    public static final String CognitoIdentityProvider = "cognito-idp";
    public static final String CognitoSync = "cognito-sync";
    public static final String Config = "config";
    public static final String DeviceFarm = "devicefarm";
    public static final String DataPipeline = "datapipeline";
    public static final String DirectConnect = "directconnect";
    public static final String Directory = "ds";
    public static final String DMS = "dms";
    public static final String Dynamodb = "dynamodb";
    public static final String DynamodbStreams = "streams.dynamodb";
    public static final String EC2 = "ec2";
    public static final String EC2ContainerService = "ecs";
    public static final String EC2SimpleSystemsManager = "ssm";
    public static final String Elasticache = "elasticache";
    public static final String ElasticBeanstalk = "elasticbeanstalk";
    public static final String ElasticFileSystem = "elasticfilesystem";
    public static final String ElasticLoadbalancing = "elasticloadbalancing";
    public static final String ElasticMapReduce = "elasticmapreduce";
    public static final String ElasticTranscoder = "elastictranscoder";
    public static final String Email = "email";
    public static final String GameLift = "gamelift";
    public static final String Glacier = "glacier";
    public static final String IAM = "iam";
    public static final String IoT = "iot";
    public static final String IoTData = "data.iot";
    public static final String ImportExport = "importexport";
    public static final String KeyManagementService = "kms";
    public static final String Kinesis = "kinesis";
    public static final String Lambda = "lambda";
    public static final String MachineLearning = "machinelearning";
    public static final String Opsworks = "opsworks";
    public static final String RDS = "rds";
    public static final String RedShift = "redshift";
    public static final String Route53 = "route53";
    public static final String Route53Domains = "route53domains";
    public static final String S3 = "s3";
    public static final String SimpleDB = "sdb";
    public static final String SimpleWorkflow = "swf";
    public static final String SNS = "sns";
    public static final String SQS = "sqs";
    public static final String StorageGateway = "storagegateway";
    public static final String STS = "sts";
    public static final String Support = "support";
    public static final String WAF = "waf";
    public static final String Workspaces = "workspaces";
}