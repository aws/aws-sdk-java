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
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.services.elasticmapreduce.model.HadoopJarStepConfig;

/**
 * Class that makes it easy to define Hadoop Streaming steps.
 * <p>
 * See also: <a href="http://hadoop.apache.org/common/docs/r0.20.2/streaming.html">Hadoop Streaming</a>
 *
 * <pre class="brush: java">
 * AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
 * AmazonElasticMapReduce emr = new AmazonElasticMapReduceClient(credentials);
 *
 * HadoopJarStepConfig config = new StreamingStep()
 *     .withInputs("s3://elasticmapreduce/samples/wordcount/input")
 *     .withOutput("s3://my-bucket/output/")
 *     .withMapper("s3://elasticmapreduce/samples/wordcount/wordSplitter.py")
 *     .withReducer("aggregate")
 *     .toHadoopJarStepConfig();
 *
 * StepConfig wordCount = new StepConfig()
 *     .withName("Word Count")
 *     .withActionOnFailure("TERMINATE_JOB_FLOW")
 *     .withHadoopJarStep(config);
 *
 * RunJobFlowRequest request = new RunJobFlowRequest()
 *     .withName("Word Count")
 *     .withSteps(wordCount)
 *     .withLogUri("s3://log-bucket/")
 *     .withInstances(new JobFlowInstancesConfig()
 *         .withEc2KeyName("keypairt")
 *         .withHadoopVersion("0.20")
 *         .withInstanceCount(5)
 *         .withKeepJobFlowAliveWhenNoSteps(true)
 *         .withMasterInstanceType("m1.small")
 *         .withSlaveInstanceType("m1.small"));
 *
 * RunJobFlowResult result = emr.runJobFlow(request);
 * </pre>
 */
public class StreamingStep {
  private List<String> inputs = new ArrayList<String>();
  private String output;
  private String mapper;
  private String reducer;
  private Map<String, String> hadoopConfig = new HashMap<String, String>();


  /**
   * Creates a new default StreamingStep.
   */
  public StreamingStep() {
  }


  /**
   * Get list of step input paths.
   * @return List of step inputs
   */
  public List<String> getInputs() {
    return inputs;
  }

  /**
   * Set the list of step input paths.
   * @param inputs List of step inputs.
   */
  public void setInputs(Collection<String> inputs) {
    List<String> newInputs = new ArrayList<String>();
    if (inputs != null) {
      newInputs.addAll(inputs);
    }
    this.inputs = newInputs;
  }

  /**
   * Add more input paths to this step.
   * @param inputs A list of inputs to this step.
   * @return A reference to this updated object so that method calls can be chained
   *         together.
   */
  public StreamingStep withInputs(String ... inputs) {
    for (String input : inputs) {
      this.inputs.add(input);
    }
    return this;
  }


  /**
   * Get output path.
   * @return Output path.
   */
  public String getOutput() {
    return output;
  }

  /**
   * Set the output path for this step.
   * @param output Output path.
   */
  public void setOutput(String output) {
    this.output = output;
  }

  /**
   * Set the output path for this step.
   * @param output Output path
   * @return A reference to this updated object so that method calls can be chained
   *         together.
   */
  public StreamingStep withOutput(String output) {
    this.output = output;
    return this;
  }


  /**
   * Get the mapper.
   * @return Mapper.
   */
  public String getMapper() {
    return mapper;
  }

  /**
   * Set the mapper.
   * @param mapper Mapper
   */
  public void setMapper(String mapper) {
    this.mapper = mapper;
  }

  /**
   * Set the mapper
   * @param mapper Mapper
   * @return A reference to this updated object so that method calls can be chained
   *         together.
   */
  public StreamingStep withMapper(String mapper) {
    this.mapper = mapper;
    return this;
  }


  /**
   * Get the reducer
   * @return Reducer
   */
  public String getReducer() {
    return reducer;
  }

  /**
   * Set the reducer
   * @param reducer Reducer
   */
  public void setReducer(String reducer) {
    this.reducer = reducer;
  }

  /**
   * Set the reducer
   * @param reducer Reducer
   * @return A reference to this updated object so that method calls can be chained
   *         together.
   */
  public StreamingStep withReducer(String reducer) {
    this.reducer = reducer;
    return this;
  }


  /**
   * Get the Hadoop config overrides (-D values).
   * @return Hadoop config.
   */
  public Map<String, String> getHadoopConfig() {
    return hadoopConfig;
  }

  /**
   * Set the Hadoop config overrides (-D values).
   * @param hadoopConfig Hadoop config.
   */
  public void setHadoopConfig(Map<String, String> hadoopConfig) {
    this.hadoopConfig = hadoopConfig;
  }

  /**
   * Add a Hadoop config override (-D value).
   * @param key Hadoop configuration key.
   * @param value Configuration value.
   * @return A reference to this updated object so that method calls can be chained
   *         together.
   */
  public StreamingStep withHadoopConfig(String key, String value) {
    hadoopConfig.put(key, value);
    return this;
  }


  /**
   * Creates the final HadoopJarStepConfig once you are done configuring the step. You can use
   * this as you would any other HadoopJarStepConfig.
   * @return HadoopJarStepConfig representing this streaming step.
   */
  public HadoopJarStepConfig toHadoopJarStepConfig() {
    List<String> args = new ArrayList<String>();

    if (reducer == null) {
      hadoopConfig.put("mapred.reduce.tasks", "0");
    }

    for (Map.Entry<String, String> entry : hadoopConfig.entrySet()) {
      args.add("-D");
      args.add(entry.getKey() + "=" + entry.getValue());
    }

    for (String input : inputs) {
      args.add("-input");
      args.add(input);
    }

    if (output != null) {
      args.add("-output");
      args.add(output);
    }

    if (mapper != null) {
      args.add("-mapper");
      args.add(mapper);
    }

    if (reducer != null) {
      args.add("-reducer");
      args.add(reducer);
    }

    return new HadoopJarStepConfig()
      .withJar("/home/hadoop/contrib/streaming/hadoop-streaming.jar")
      .withArgs(args);
  }
}

