/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.elasticmapreduce.model.BootstrapActionConfig;
import com.amazonaws.services.elasticmapreduce.model.ScriptBootstrapActionConfig;
import com.amazonaws.util.StringUtils;

/**
 * Class that provides helper methods for constructing predefined bootstrap actions.
 *
 * <pre class="brush: java">
 * AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
 * AmazonElasticMapReduce emr = new AmazonElasticMapReduceClient(credentials);
 *
 * BootstrapActions bootstrapActions = new BootstrapActions();
 *
 * RunJobFlowRequest request = new RunJobFlowRequest()
 *       .withName("Job Flow With Bootstrap Actions")
 *       .withBootstrapActions(
 *             bootstrapActions.newRunIf(
 *                 "instance.isMaster=true",
 *                 bootstrapActions.newConfigureDaemons()
 *                     .withHeapSize(Daemon.JobTracker, 2048)
 *                     .build()))
 *       .withLogUri("s3://log-bucket/")
 *       .withInstances(new JobFlowInstancesConfig()
 *            .withEc2KeyName("keypair")
 *            .withHadoopVersion("0.20")
 *            .withInstanceCount(5)
 *            .withKeepJobFlowAliveWhenNoSteps(true)
 *            .withMasterInstanceType("m1.small")
 *            .withSlaveInstanceType("m1.small"));
 *
 * RunJobFlowResult result = emr.runJobFlow(request);
 * </pre>
 */
public class BootstrapActions {
  private final String bucket;

  /**
   * Creates a new default BootstrapActions for us in us-east-1.
   */
  public BootstrapActions() {
    this("us-east-1.elasticmapreduce");
  }

  /**
   * Creates a new BootstrapActions.
   * @param bucket the bucket from which to download the bootstrap actions.
   */
  public BootstrapActions(String bucket) {
    this.bucket = bucket;
  }

  /**
   * Create a new run-if bootstrap action which lets you conditionally run bootstrap actions.
   * @param condition The condition to evaluate, if true the bootstrap action executes.
   * @param config The bootstrap action to execute in case of successful evaluation.
   * @return A BootstrapActionConfig to be provided when running a job flow.
   */
  public BootstrapActionConfig newRunIf(String condition, BootstrapActionConfig config) {
    List<String> args = config.getScriptBootstrapAction().getArgs();
    args.add(0, condition);
    args.add(1, config.getScriptBootstrapAction().getPath());

    return new BootstrapActionConfig()
      .withName("Run If, " + config.getName())
      .withScriptBootstrapAction(new ScriptBootstrapActionConfig()
        .withPath("s3://" + bucket + "/bootstrap-actions/run-if")
        .withArgs(args));
  }

  /**
   * Enum specifying all valid config files.
   */
  public enum ConfigFile {
    Site,
    Default,
    Core,
    Hdfs,
    Mapred
  }

  /**
   * Create a new bootstrap action which lets you configure Hadoop's XML files.
   *
   * ConfigureHadoop is deprecated. Use {@link com.amazonaws.services
   * .elasticmapreduce.model.RunJobFlowRequest#setConfigurations} instead.
   * For more information see,
   * @link http://docs.aws.amazon.com/ElasticMapReduce/latest/ReleaseGuide/emr
   * -configure-apps.html
   *
   * @Deprecated
   */
  public ConfigureHadoop newConfigureHadoop() {
    return new ConfigureHadoop();
  }

  /**
   * ConfigureHadoop is deprecated. Use {@link com.amazonaws.services
   * .elasticmapreduce.model.RunJobFlowRequest#setConfigurations} instead.
   * For more information see,
   * @link http://docs.aws.amazon.com/ElasticMapReduce/latest/ReleaseGuide/emr
   * -configure-apps.html
   *
   * @Deprecated
   */
  @Deprecated
  public class ConfigureHadoop {
    List<String> args = new ArrayList<String>();

    private ConfigureHadoop() {
    }

    /**
     * Specify an XML file in S3 to merge with Hadoop's default configuration.
     * @param file The config file to merge with.
     * @param xmlPath The path in S3 of the XML file.
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigureHadoop withXml(ConfigFile file, String xmlPath) {
      String arg = "";

      switch (file) {
      case Site: arg = "-S"; break;
      case Default: arg = "-D"; break;
      case Core: arg = "-C"; break;
      case Hdfs: arg = "-H"; break;
      case Mapred: arg = "-M"; break;
      }

      args.add(arg);
      args.add(xmlPath);
      return this;
    }

    /**
     * Specify a key-value pair to merge with Hadoop's default configuration.
     * @param file The config file to merge with.
     * @param key The config key.
     * @param value The config value.
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigureHadoop withKeyValue(ConfigFile file, String key, String value) {
      String arg = "";

      switch (file) {
      case Site: arg = "-s"; break;
      case Default: arg = "-d"; break;
      case Core: arg = "-c"; break;
      case Hdfs: arg = "-h"; break;
      case Mapred: arg = "-m"; break;
      }

      args.add(arg);
      args.add(key + "=" + value);
      return this;
    }

    /**
     * Returns an object which can be used in a RunJobflow call.
     * @return an object which can be used in a RunJobflow call.
     */
    public BootstrapActionConfig build() {
      return new BootstrapActionConfig()
        .withName("Configure Hadoop")
        .withScriptBootstrapAction(new ScriptBootstrapActionConfig()
          .withPath("s3://" + bucket + "/bootstrap-actions/configure-hadoop")
          .withArgs(args));
    }
  }

  /**
   * List of Hadoop daemons which can be configured.
   */
  public enum Daemon {
    NameNode,
    DataNode,
    JobTracker,
    TaskTracker,
    Client;
  }

  /**
   * Create a new bootstrap action which lets you configure Hadoop's daemons. The options
   * are written to the hadoop-user-env.sh file.
   */
  public ConfigureDaemons newConfigureDaemons() {
    return new ConfigureDaemons();
  }

  public class ConfigureDaemons {
    List<String> args = new ArrayList<String>();
    boolean replace = false;

    private ConfigureDaemons() {
    }

    /**
     * Set the heap size of a daemon.
     * @param daemon The deamon to configure.
     * @param megabytes The requested heap size of the daemon.
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigureDaemons withHeapSize(Daemon daemon, int megabytes) {
      args.add("--" + StringUtils.lowerCase(daemon.name()) + "-heap-size=" + megabytes);
      return this;
    }

    /**
     * Specify additional Java opts to be included when the daemon starts.
     * @param daemon The daemon to add opts to.
     * @param opts Additional Java command line arguments.
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigureDaemons withOpts(Daemon daemon, String opts) {
      args.add("--" + StringUtils.lowerCase(daemon.name()) + "-opts=\"" + opts + "\"");
      return this;
    }

    /**
     * Replace the existing hadoop-user-env.sh file if it exists.
     * @param replace whether the file should be replaced.
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigureDaemons withReplace(boolean replace) {
      this.replace = replace;
      return this;
    }

    /**
     * Returns an object which can be used in a RunJobflow call.
     * @return an object which can be used in a RunJobflow call.
     */
    public BootstrapActionConfig build() {
      if (replace) {
        args.add("--replace");
      }

      return new BootstrapActionConfig()
        .withName("Configure Daemons")
        .withScriptBootstrapAction(new ScriptBootstrapActionConfig()
          .withPath("s3://" + bucket + "/bootstrap-actions/configure-daemons")
          .withArgs(args));
    }
  }
}
