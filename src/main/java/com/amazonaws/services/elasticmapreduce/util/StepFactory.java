/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.util;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.elasticmapreduce.model.HadoopJarStepConfig;

/**
 * This class provides helper methods for creating common Elastic MapReduce step
 * types. To use StepFactory, you should construct it with the appropriate
 * bucket for your region. The official bucket format is
 * "&lt;region&gt;.elasticmapreduce", so us-east-1 would use the bucket
 * "us-east-1.elasticmapreduce".
 * <p>
 * Example usage, create an interactive Hive job flow with debugging enabled:
 * <pre>
 *   AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
 *   AmazonElasticMapReduce emr = new AmazonElasticMapReduceClient(credentials);
 *
 *   StepFactory stepFactory = new StepFactory();
 *
 *   StepConfig enableDebugging = new StepConfig()
 *       .withName("Enable Debugging")
 *       .withActionOnFailure("TERMINATE_JOB_FLOW")
 *       .withHadoopJarStep(stepFactory.newEnableDebuggingStep());
 *
 *   StepConfig installHive = new StepConfig()
 *       .withName("Install Hive")
 *       .withActionOnFailure("TERMINATE_JOB_FLOW")
 *       .withHadoopJarStep(stepFactory.newInstallHiveStep());
 *
 *   RunJobFlowRequest request = new RunJobFlowRequest()
 *       .withName("Hive Interactive")
 *       .withSteps(enableDebugging, installHive)
 *       .withLogUri("s3://log-bucket/")
 *       .withInstances(new JobFlowInstancesConfig()
 *           .withEc2KeyName("keypair")
 *           .withHadoopVersion("0.20")
 *           .withInstanceCount(5)
 *           .withKeepJobFlowAliveWhenNoSteps(true)
 *           .withMasterInstanceType("m1.small")
 *           .withSlaveInstanceType("m1.small"));
 *
 *   RunJobFlowResult result = emr.runJobFlow(request);
 * </pre>
 */
public class StepFactory {
    private final String bucket;

    /**
     * Creates a new StepFactory using the default Elastic Map Reduce bucket
     * (us-east-1.elasticmapreduce) for the default (us-east-1) region.
     */
    public StepFactory() {
        this("us-east-1.elasticmapreduce");
    }

    /**
     * Creates a new StepFactory using the specified Amazon S3 bucket to load
     * resources.
     * <p>
     * The official bucket format is "&lt;region&gt;.elasticmapreduce", so if
     * you're using the us-east-1 region, you should use the bucket
     * "us-east-1.elasticmapreduce".
     *
     * @param bucket
     *            The Amazon S3 bucket from which to load resources.
     */
    public StepFactory(String bucket) {
        this.bucket = bucket;
    }

    /**
     * Runs a specified script on the master node of your cluster.
     *
     * @param script
     *            The script to run.
     * @param args
     *            Arguments that get passed to the script.
     * @return HadoopJarStepConfig that can be passed to your job flow.
     */
    public HadoopJarStepConfig newScriptRunnerStep(String script, String... args) {
        List<String> argsList = new ArrayList<String>();
        argsList.add(script);
        for (String arg : args) {
            argsList.add(arg);
        }
        return new HadoopJarStepConfig()
            .withJar("s3://" + bucket + "/libs/script-runner/script-runner.jar")
            .withArgs(argsList);
    }

    /**
     * When ran as the first step in your job flow, enables the Hadoop debugging
     * UI in the AWS Management Console.
     *
     * @return HadoopJarStepConfig that can be passed to your job flow.
     */
    public HadoopJarStepConfig newEnableDebuggingStep() {
        return newScriptRunnerStep("s3://" + bucket + "/libs/state-pusher/0.1/fetch");
    }

    /**
     * Step that installs Hive on your job flow.
     *
     * @return HadoopJarStepConfig that can be passed to your job flow.
     */
    public HadoopJarStepConfig newInstallHiveStep() {
        return newHivePigStep("hive", "--install-hive");
    }

    /**
     * Step that runs a Hive script on your job flow.
     *
     * @param script
     *            The script to run.
     * @param args
     *            Arguments that get passed to the script.
     * @return HadoopJarStepConfig that can be passed to your job flow.
     */
    public HadoopJarStepConfig newRunHiveScriptStep(String script, String... args) {
        String[] argsArray = new String[args.length + 4];
        argsArray[0] = "--run-hive-script";
        argsArray[1] = "--args";
        argsArray[2] = "-f";
        argsArray[3] = script;
        System.arraycopy(args, 0, argsArray, 4, args.length);
        return newHivePigStep("hive", argsArray);
    }

    /**
     * Step that installs Pig on your job flow.
     *
     * @return HadoopJarStepConfig that can be passed to your job flow.
     */
    public HadoopJarStepConfig newInstallPigStep() {
        return newHivePigStep("pig", "--install-pig");
    }

    /**
     * Step that runs a Pig script on your job flow.
     *
     * @param script
     *            The script to run.
     * @param args
     *            Arguments that get passed to the script.
     * @return HadoopJarStepConfig that can be passed to your job flow.
     */
    public HadoopJarStepConfig newRunPigScriptStep(String script, String... args) {
        String[] argsArray = new String[args.length + 4];
        argsArray[0] = "--run-pig-script";
        argsArray[1] = "--args";
        argsArray[2] = "-f";
        argsArray[3] = script;
        System.arraycopy(args, 0, argsArray, 4, args.length);
        return newHivePigStep("pig", argsArray);
    }

    private HadoopJarStepConfig newHivePigStep(String type, String... args) {
        String[] argsArray = new String[args.length + 2];
        argsArray[0] = "--base-path";
        argsArray[1] = "s3://" + bucket + "/libs/" + type + "/";
        System.arraycopy(args, 0, argsArray, 2, args.length);
        return newScriptRunnerStep("s3://" + bucket + "/libs/" + type + "/" + type + "-script", argsArray);
    }

}