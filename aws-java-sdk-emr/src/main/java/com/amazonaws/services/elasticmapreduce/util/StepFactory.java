/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.Arrays;
import java.util.List;

import com.amazonaws.services.elasticmapreduce.model.HadoopJarStepConfig;
import com.amazonaws.util.StringUtils;

/**
 * This class provides helper methods for creating common Elastic MapReduce step
 * types. To use StepFactory, you should construct it with the appropriate
 * bucket for your region. The official bucket format is
 * "&lt;region&gt;.elasticmapreduce", so us-east-1 would use the bucket
 * "us-east-1.elasticmapreduce".
 * <p>
 * Example usage, create an interactive Hive job flow with debugging enabled:
 * <pre class="brush: java">
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
     *  The available Hive versions.  These are only available on Hadoop 0.20
     *  Hive_0_5 Hive 0.5
     *  Hive_0_7 Hive 0.7
     *  Hive_0_7_1 Hive 0.7.1
     */
    public static enum HiveVersion {
        Hive_0_5("0.5"),
        Hive_0_7("0.7"),
        Hive_0_7_1("0.7.1"),
        Hive_0_8_1("0.8.1"),
        Hive_0_8_1_1("0.8.1.1"),
        Hive_0_8_1_2("0.8.1.2"),
        Hive_0_8_1_3("0.8.1.3"),
        Hive_0_8_1_4("0.8.1.4"),
        Hive_0_8_1_5("0.8.1.5"),
        Hive_0_8_1_6("0.8.1.6"),
        Hive_0_8_1_7("0.8.1.7"),
        Hive_0_8_1_8("0.8.1.8"),
        Hive_0_11_0("0.11.0"),
        Hive_Latest("latest");

      private String stringVal;

      HiveVersion(String str) {
        stringVal = str;
      }

        @Override
        public String toString() {
            return stringVal;
        }
    }

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
     * Step that installs the specified versions of Hive on your job flow.
     *
     * @param hiveVersions the versions of Hive to install
     * @return HadoopJarStepConfig that can be passed to your job flow.
     */
    public HadoopJarStepConfig newInstallHiveStep(HiveVersion... hiveVersions) {
        if (hiveVersions.length > 0) {
            String[] versionStrings = new String[hiveVersions.length];
            for (int i = 0; i < hiveVersions.length; i++) {
                versionStrings[i] = hiveVersions[i].toString();
            }
            return newInstallHiveStep(versionStrings);
        }
        return newHivePigStep("hive", "--install-hive", "--hive-versions", "latest");
    }

    /**
     * Step that installs the specified versions of Hive on your job flow.
     *
     * @param hiveVersions the versions of Hive to install
     * @return HadoopJarStepConfig that can be passed to your job flow.
     */
    public HadoopJarStepConfig newInstallHiveStep(String... hiveVersions) {
      if (hiveVersions.length > 0) {
        return newHivePigStep("hive", "--install-hive", "--hive-versions",
                StringUtils.join(",", hiveVersions));
      }
      return newHivePigStep("hive", "--install-hive", "--hive-versions", "latest");
    }

    /**
     * Step that installs the default version of Hive on your job flow.  This is
     * 0.4 for Hadoop 0.18 and 0.5 for Hadoop 0.20.
     *
     * @return HadoopJarStepConfig that can be passed to your job flow.
     */
    public HadoopJarStepConfig newInstallHiveStep() {
      return newInstallHiveStep(new HiveVersion[0]);
    }

    /**
     * Step that runs a Hive script on your job flow using the specified Hive version.
     *
     * @param script
     *            The script to run.
     * @param hiveVersion
     *            The Hive version to use.
     * @param scriptArgs
     *            Arguments that get passed to the script.
     * @return HadoopJarStepConfig that can be passed to your job flow.
     */
    public HadoopJarStepConfig newRunHiveScriptStepVersioned(String script,
        String hiveVersion, String... scriptArgs) {
        List<String> hiveArgs = new ArrayList<String>();
        hiveArgs.add("--hive-versions");
        hiveArgs.add(hiveVersion);
        hiveArgs.add("--run-hive-script");
        hiveArgs.add("--args");
        hiveArgs.add("-f");
        hiveArgs.add(script);
        hiveArgs.addAll(Arrays.asList(scriptArgs));
        return newHivePigStep("hive", hiveArgs.toArray(new String[0]));
    }

    /**
     * Step that runs a Hive script on your job flow using the default Hive version.
     *
     * @param script
     *            The script to run.
     * @param args
     *            Arguments that get passed to the script.
     * @return HadoopJarStepConfig that can be passed to your job flow.
     */
    public HadoopJarStepConfig newRunHiveScriptStep(String script, String... args) {
        return newRunHiveScriptStepVersioned(script, "latest", args);
    }

    /**
     * Step that installs the default version of Pig on your job flow.
     *
     * @return HadoopJarStepConfig that can be passed to your job flow.
     */
    public HadoopJarStepConfig newInstallPigStep() {
        return newInstallPigStep(new String[0]);
    }

    /**
     * Step that installs Pig on your job flow.
     *
     * @param pigVersions the versions of Pig to install.
     *
     * @return HadoopJarStepConfig that can be passed to your job flow.
     */
    public HadoopJarStepConfig newInstallPigStep(String... pigVersions) {
        if (pigVersions != null && pigVersions.length > 0) {
            return newHivePigStep("pig", "--install-pig", "--pig-versions",
                    StringUtils.join(",", pigVersions));
        }
        return newHivePigStep("pig", "--install-pig", "--pig-versions", "latest");
    }

    /**
     * Step that runs a Pig script on your job flow using the specified Pig version.
     *
     * @param script
     *            The script to run.
     * @param pigVersion
     *            The Pig version to use.
     * @param scriptArgs
     *            Arguments that get passed to the script.
     * @return HadoopJarStepConfig that can be passed to your job flow.
     */
    public HadoopJarStepConfig newRunPigScriptStep(String script,
        String pigVersion, String... scriptArgs) {
        List<String> pigArgs = new ArrayList<String>();
        pigArgs.add("--pig-versions");
        pigArgs.add(pigVersion);
        pigArgs.add("--run-pig-script");
        pigArgs.add("--args");
        pigArgs.add("-f");
        pigArgs.add(script);
        pigArgs.addAll(Arrays.asList(scriptArgs));
        return newHivePigStep("pig", pigArgs.toArray(new String[0]));
    }

    /**
     * Step that runs a Pig script on your job flow using the default Pig version.
     *
     * @param script
     *            The script to run.
     * @param scriptArgs
     *            Arguments that get passed to the script.
     * @return HadoopJarStepConfig that can be passed to your job flow.
     */
    public HadoopJarStepConfig newRunPigScriptStep(String script, String... scriptArgs) {
        return newRunPigScriptStep(script, "latest", scriptArgs);
    }

    private HadoopJarStepConfig newHivePigStep(String type, String... args) {
        List<String> appArgs = new ArrayList<String>();
        appArgs.add("--base-path");
        appArgs.add("s3://" + bucket + "/libs/" + type + "/");
        appArgs.addAll(Arrays.asList(args));
        return newScriptRunnerStep("s3://" + bucket + "/libs/" + type + "/" + type + "-script", appArgs.toArray(new String[0]));
    }

}
