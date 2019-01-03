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
import java.util.List;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.elasticmapreduce.model.HadoopJarStepConfig;

/**
 * This class provides some helper methods for creating a Resize Job Flow step
 * as part of your job flow. The resize step can be used to automatically
 * adjust the composition of your cluster while it is running. For example, if
 * you have a large workflow with different compute requirements, you can use
 * this step to automatically add a task instance group before your most compute
 * intensive step.
 *
 * <pre class="brush: java">
 * AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
 * AmazonElasticMapReduce emr = new AmazonElasticMapReduceClient(credentials);
 *
 * HadoopJarStepConfig config = new ResizeJobFlowStep()
 *     .withResizeAction(new ModifyInstanceGroup()
 *         .withInstanceGroup("core")
 *         .withInstanceCount(10))
 *     .withResizeAction(new AddInstanceGroup()
 *         .withInstanceGroup("task")
 *         .withInstanceCount(10)
 *         .withInstanceType("m1.small"))
 *     .withOnArrested(OnArrested.Continue)
 *     .withOnFailure(OnFailure.Continue)
 *     .toHadoopJarStepConfig();
 *
 * StepConfig resizeJobFlow = new StepConfig()
 *     .withName("Resize job flow")
 *     .withActionOnFailure("TERMINATE_JOB_FLOW")
 *     .withHadoopJarStep(config);
 *
 * RunJobFlowRequest request = new RunJobFlowRequest()
 *     .withName("Resize job flow")
 *     .withSteps(resizeJobFlow)
 *     .withLogUri("s3://log-bucket/")
 *     .withInstances(new JobFlowInstancesConfig()
 *         .withEc2KeyName("keypair")
 *         .withHadoopVersion("0.20")
 *         .withInstanceCount(5)
 *         .withKeepJobFlowAliveWhenNoSteps(true)
 *         .withMasterInstanceType("m1.small")
 *         .withSlaveInstanceType("m1.small"));
 *
 * RunJobFlowResult result = emr.runJobFlow(request);
 * </pre>
 */
public class ResizeJobFlowStep {

  /**
   * The action to take if your step is waiting for the instance group to start
   * and it enters the Arrested state.
   *
   * Fail - Fail the step.
   * Wait - Continue waiting until the instance group is no longer arrested (requires
   *        manual intervention).
   * Continue - Proceed onto the next step.
   */
  public static enum OnArrested {
    Fail,
    Wait,
    Continue;
  }

  /**
   * Action to take if there is a failure modifying your cluster composition.
   * Fail - Fail the step.
   * Continue - Proceed on to the next step.
   */
  public static enum OnFailure {
    Fail,
    Continue;
  }

  private String bucket;
  private List<String> args = new ArrayList<String>();
  private boolean wait = true;
  private OnArrested onArrested = null;
  private OnFailure onFailure = null;


  /**
   * Creates a new ResizeJobFlowStep using the default Elastic Map Reduce
   * bucket (us-east-1.elasticmapreduce) for the default (us-east-1) region.
   */
  public ResizeJobFlowStep() {
    this("us-east-1.elasticmapreduce");
  }

  /**
   * Creates a new ResizeJobFlowStep using the specified Amazon S3 bucket to
   * load resources.
   * <p>
   * The official bucket format is "&lt;region&gt;.elasticmapreduce", so if
   * you're using the us-east-1 region, you should use the bucket
   * "us-east-1.elasticmapreduce".
   *
   * @param bucket
   *            The Amazon S3 bucket from which to load resources.
   */
  public ResizeJobFlowStep(String bucket) {
    this.bucket = bucket;
  }


  /**
   * Add a new action for this step to perform. These actions can be to modify
   * or add instance groups. This step supports multiple actions, but requires
   * at least one be specified.
   *
   * @param resizeAction An instance of ResizeAction defining the change.
   * @return A reference to this updated object so that method calls can be chained
   *         together.
   */
  public ResizeJobFlowStep withResizeAction(ResizeAction resizeAction) {
    this.args.addAll(resizeAction.getArgs());
    return this;
  }

  /**
   * Specifies whether the step should wait for the modification to complete
   * or if it should just continue onto the next step once the modification
   * request is received. Defaults to true.
   * @param wait Whether this step should wait for the modification to complete.
   * @return A reference to this updated object so that method calls can be chained
   *         together.
   */
  public ResizeJobFlowStep withWait(boolean wait) {
    this.wait = wait;
    return this;
  }

  /**
   * What action this step should take if any of the instance group modifications result
   * in the instance group entering Arrested state. This can happen when the bootstrap
   * actions on the newly launched instances are continuously failing.
   * @param onArrested Enum specifying which action to take.
   * @return A reference to this updated object so that method calls can be chained
   *         together.
   */
  public ResizeJobFlowStep withOnArrested(OnArrested onArrested) {
    this.onArrested = onArrested;
    return this;
  }

  /**
   * What action this step should take if the modification fails. This can happen when
   * you request to perform an invalid action, such as shrink a core instance group.
   * @param onFailure Enum specifying which action to take.
   * @return A reference to this updated object so that method calls can be chained
   *         together.
   */
  public ResizeJobFlowStep withOnFailure(OnFailure onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  /**
   * Creates the final HadoopJarStepConfig once you are done configuring the step. You can use
   * this as you would any other HadoopJarStepConfig.
   * @return HadoopJarStepConfig configured to perform the specified actions.
   */
  public HadoopJarStepConfig toHadoopJarStepConfig() {
    if (args.size() == 0) {
      throw new AmazonServiceException("Cannot create a ResizeJobFlowStep with no resize actions.");
    }

    if (wait == false) {
      args.add("--no-wait");
    }

    if (onArrested != null) {
      args.add("--on-arrested");
      args.add(onArrested.toString());
    }

    if (onFailure != null) {
      args.add("--on-failure");
      args.add(onFailure.toString());
    }

    return new HadoopJarStepConfig()
      .withJar("s3://" + bucket + "/libs/resize-job-flow/0.1/resize-job-flow.jar")
      .withArgs(args);
  }


  public static interface ResizeAction {
    public List<String> getArgs();
  }


  /**
   * Class representing a change to an existing instance group.
   */
  public static class ModifyInstanceGroup implements ResizeAction {
    private String instanceGroup;
    private Integer instanceCount;

    /**
     * Set the identification for the instance group to modify. You can specify either
     * core or task if there is only one instance group of that role. Otherwise you can
     * specify the instance group ID (such as ig-ABABABABABAB).
     * @param instanceGroup Identifier for the instance group.
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyInstanceGroup withInstanceGroup(String instanceGroup) {
      this.instanceGroup = instanceGroup;
      return this;
    }

    /**
     * Specify the new size of the instance group.
     * @param instanceCount Target size of the instance group.
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyInstanceGroup withInstanceCount(Integer instanceCount) {
      this.instanceCount = instanceCount;
      return this;
    }

    public List<String> getArgs() {
      if (instanceGroup == null) {
        throw new AmazonServiceException("InstanceGroup must not be null.");
      }
      if (instanceCount == null) {
        throw new AmazonServiceException("InstanceCount must not be null.");
      }

      List<String> args = new ArrayList<String>();
      args.add("--modify-instance-group");
      args.add(instanceGroup);
      args.add("--instance-count");
      args.add(Integer.toString(instanceCount));
      return args;
    }
  }


  /**
   * Class representing creating a new instance group.
   */
  public static class AddInstanceGroup implements ResizeAction {
    private String instanceGroup;
    private Integer instanceCount;
    private String instanceType;

    /**
     * Specify the role of the new instance group (core, task).
     * @param instanceGroup New instance group's role.
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddInstanceGroup withInstanceGroup(String instanceGroup) {
      this.instanceGroup = instanceGroup;
      return this;
    }

    /**
     * Specify the count of the new instance group.
     * @param instanceCount Target instance group size.
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddInstanceGroup withInstanceCount(int instanceCount) {
      this.instanceCount = instanceCount;
      return this;
    }

    /**
     * Specify the instance type to use for this instance group.
     * @param instanceType Instance type.
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddInstanceGroup withInstanceType(String instanceType) {
      this.instanceType = instanceType;
      return this;
    }

    public List<String> getArgs() {
      if (instanceGroup == null) {
        throw new AmazonServiceException("InstanceGroup must not be null.");
      }
      if (instanceCount == null) {
        throw new AmazonServiceException("InstanceCount must not be null.");
      }
      if (instanceType == null) {
        throw new AmazonServiceException("InstanceType must not be null.");
      }

      List<String> args = new ArrayList<String>();
      args.add("--add-instance-group");
      args.add(instanceGroup);
      args.add("--instance-count");
      args.add(Integer.toString(instanceCount));
      args.add("--instance-type");
      args.add(instanceType);
      return args;
    }
  }
}
