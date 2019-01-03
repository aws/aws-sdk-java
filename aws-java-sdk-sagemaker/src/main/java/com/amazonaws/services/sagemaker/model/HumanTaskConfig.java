/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information required for human workers to complete a labeling task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HumanTaskConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanTaskConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to complete the tasks.
     * </p>
     */
    private String workteamArn;
    /**
     * <p>
     * Information about the user interface that workers use to complete the labeling task.
     * </p>
     */
    private UiConfig uiConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function that is run before a data object is sent to a human worker.
     * Use this function to provide input to a custom labeling job.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic segmentation, and text classification task types,
     * Amazon SageMaker Ground Truth provides the following Lambda functions:
     * </p>
     * <p>
     * <b>US East (Northern Virginia) (us-east-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US East (Ohio) (us-east-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US West (Oregon) (us-west-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU (Ireland) (eu-west-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Tokyo (ap-northeast-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     */
    private String preHumanTaskLambdaArn;
    /**
     * <p>
     * Keywords used to describe the task so that workers on Amazon Mechanical Turk can discover the task.
     * </p>
     */
    private java.util.List<String> taskKeywords;
    /**
     * <p>
     * A title for the task for your human workers.
     * </p>
     */
    private String taskTitle;
    /**
     * <p>
     * A description of the task for your human workers.
     * </p>
     */
    private String taskDescription;
    /**
     * <p>
     * The number of human workers that will label an object.
     * </p>
     */
    private Integer numberOfHumanWorkersPerDataObject;
    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     */
    private Integer taskTimeLimitInSeconds;
    /**
     * <p>
     * The length of time that a task remains available for labelling by human workers.
     * </p>
     */
    private Integer taskAvailabilityLifetimeInSeconds;
    /**
     * <p>
     * Defines the maximum number of data objects that can be labeled by human workers at the same time. Each object may
     * have more than one worker at one time.
     * </p>
     */
    private Integer maxConcurrentTaskCount;
    /**
     * <p>
     * Configures how labels are consolidated across human workers.
     * </p>
     */
    private AnnotationConsolidationConfig annotationConsolidationConfig;
    /**
     * <p>
     * The price that you pay for each task performed by a public worker.
     * </p>
     */
    private PublicWorkforceTaskPrice publicWorkforceTaskPrice;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to complete the tasks.
     * </p>
     * 
     * @param workteamArn
     *        The Amazon Resource Name (ARN) of the work team assigned to complete the tasks.
     */

    public void setWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to complete the tasks.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the work team assigned to complete the tasks.
     */

    public String getWorkteamArn() {
        return this.workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to complete the tasks.
     * </p>
     * 
     * @param workteamArn
     *        The Amazon Resource Name (ARN) of the work team assigned to complete the tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanTaskConfig withWorkteamArn(String workteamArn) {
        setWorkteamArn(workteamArn);
        return this;
    }

    /**
     * <p>
     * Information about the user interface that workers use to complete the labeling task.
     * </p>
     * 
     * @param uiConfig
     *        Information about the user interface that workers use to complete the labeling task.
     */

    public void setUiConfig(UiConfig uiConfig) {
        this.uiConfig = uiConfig;
    }

    /**
     * <p>
     * Information about the user interface that workers use to complete the labeling task.
     * </p>
     * 
     * @return Information about the user interface that workers use to complete the labeling task.
     */

    public UiConfig getUiConfig() {
        return this.uiConfig;
    }

    /**
     * <p>
     * Information about the user interface that workers use to complete the labeling task.
     * </p>
     * 
     * @param uiConfig
     *        Information about the user interface that workers use to complete the labeling task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanTaskConfig withUiConfig(UiConfig uiConfig) {
        setUiConfig(uiConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function that is run before a data object is sent to a human worker.
     * Use this function to provide input to a custom labeling job.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic segmentation, and text classification task types,
     * Amazon SageMaker Ground Truth provides the following Lambda functions:
     * </p>
     * <p>
     * <b>US East (Northern Virginia) (us-east-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US East (Ohio) (us-east-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US West (Oregon) (us-west-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU (Ireland) (eu-west-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Tokyo (ap-northeast-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param preHumanTaskLambdaArn
     *        The Amazon Resource Name (ARN) of a Lambda function that is run before a data object is sent to a human
     *        worker. Use this function to provide input to a custom labeling job.</p>
     *        <p>
     *        For the built-in bounding box, image classification, semantic segmentation, and text classification task
     *        types, Amazon SageMaker Ground Truth provides the following Lambda functions:
     *        </p>
     *        <p>
     *        <b>US East (Northern Virginia) (us-east-1):</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>US East (Ohio) (us-east-2):</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>US West (Oregon) (us-west-2):</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>EU (Ireland) (eu-west-1):</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Asia Pacific (Tokyo (ap-northeast-1):</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass</code>
     *        </p>
     *        </li>
     */

    public void setPreHumanTaskLambdaArn(String preHumanTaskLambdaArn) {
        this.preHumanTaskLambdaArn = preHumanTaskLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function that is run before a data object is sent to a human worker.
     * Use this function to provide input to a custom labeling job.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic segmentation, and text classification task types,
     * Amazon SageMaker Ground Truth provides the following Lambda functions:
     * </p>
     * <p>
     * <b>US East (Northern Virginia) (us-east-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US East (Ohio) (us-east-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US West (Oregon) (us-west-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU (Ireland) (eu-west-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Tokyo (ap-northeast-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of a Lambda function that is run before a data object is sent to a human
     *         worker. Use this function to provide input to a custom labeling job.</p>
     *         <p>
     *         For the built-in bounding box, image classification, semantic segmentation, and text classification task
     *         types, Amazon SageMaker Ground Truth provides the following Lambda functions:
     *         </p>
     *         <p>
     *         <b>US East (Northern Virginia) (us-east-1):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>US East (Ohio) (us-east-2):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>US West (Oregon) (us-west-2):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>EU (Ireland) (eu-west-1):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Asia Pacific (Tokyo (ap-northeast-1):</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass</code>
     *         </p>
     *         </li>
     */

    public String getPreHumanTaskLambdaArn() {
        return this.preHumanTaskLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function that is run before a data object is sent to a human worker.
     * Use this function to provide input to a custom labeling job.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic segmentation, and text classification task types,
     * Amazon SageMaker Ground Truth provides the following Lambda functions:
     * </p>
     * <p>
     * <b>US East (Northern Virginia) (us-east-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US East (Ohio) (us-east-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>US West (Oregon) (us-west-2):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>EU (Ireland) (eu-west-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Asia Pacific (Tokyo (ap-northeast-1):</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param preHumanTaskLambdaArn
     *        The Amazon Resource Name (ARN) of a Lambda function that is run before a data object is sent to a human
     *        worker. Use this function to provide input to a custom labeling job.</p>
     *        <p>
     *        For the built-in bounding box, image classification, semantic segmentation, and text classification task
     *        types, Amazon SageMaker Ground Truth provides the following Lambda functions:
     *        </p>
     *        <p>
     *        <b>US East (Northern Virginia) (us-east-1):</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-BoundingBox</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-ImageMultiClass</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-SemanticSegmentation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:PRE-TextMultiClass</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>US East (Ohio) (us-east-2):</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-BoundingBox</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-ImageMultiClass</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-SemanticSegmentation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:PRE-TextMultiClass</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>US West (Oregon) (us-west-2):</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-BoundingBox</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-ImageMultiClass</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-SemanticSegmentation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:PRE-TextMultiClass</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>EU (Ireland) (eu-west-1):</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-BoundingBox</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-ImageMultiClass</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-SemanticSegmentation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:PRE-TextMultiClass</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Asia Pacific (Tokyo (ap-northeast-1):</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-BoundingBox</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-ImageMultiClass</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-SemanticSegmentation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:PRE-TextMultiClass</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanTaskConfig withPreHumanTaskLambdaArn(String preHumanTaskLambdaArn) {
        setPreHumanTaskLambdaArn(preHumanTaskLambdaArn);
        return this;
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers on Amazon Mechanical Turk can discover the task.
     * </p>
     * 
     * @return Keywords used to describe the task so that workers on Amazon Mechanical Turk can discover the task.
     */

    public java.util.List<String> getTaskKeywords() {
        return taskKeywords;
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers on Amazon Mechanical Turk can discover the task.
     * </p>
     * 
     * @param taskKeywords
     *        Keywords used to describe the task so that workers on Amazon Mechanical Turk can discover the task.
     */

    public void setTaskKeywords(java.util.Collection<String> taskKeywords) {
        if (taskKeywords == null) {
            this.taskKeywords = null;
            return;
        }

        this.taskKeywords = new java.util.ArrayList<String>(taskKeywords);
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers on Amazon Mechanical Turk can discover the task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskKeywords(java.util.Collection)} or {@link #withTaskKeywords(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param taskKeywords
     *        Keywords used to describe the task so that workers on Amazon Mechanical Turk can discover the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanTaskConfig withTaskKeywords(String... taskKeywords) {
        if (this.taskKeywords == null) {
            setTaskKeywords(new java.util.ArrayList<String>(taskKeywords.length));
        }
        for (String ele : taskKeywords) {
            this.taskKeywords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Keywords used to describe the task so that workers on Amazon Mechanical Turk can discover the task.
     * </p>
     * 
     * @param taskKeywords
     *        Keywords used to describe the task so that workers on Amazon Mechanical Turk can discover the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanTaskConfig withTaskKeywords(java.util.Collection<String> taskKeywords) {
        setTaskKeywords(taskKeywords);
        return this;
    }

    /**
     * <p>
     * A title for the task for your human workers.
     * </p>
     * 
     * @param taskTitle
     *        A title for the task for your human workers.
     */

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    /**
     * <p>
     * A title for the task for your human workers.
     * </p>
     * 
     * @return A title for the task for your human workers.
     */

    public String getTaskTitle() {
        return this.taskTitle;
    }

    /**
     * <p>
     * A title for the task for your human workers.
     * </p>
     * 
     * @param taskTitle
     *        A title for the task for your human workers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanTaskConfig withTaskTitle(String taskTitle) {
        setTaskTitle(taskTitle);
        return this;
    }

    /**
     * <p>
     * A description of the task for your human workers.
     * </p>
     * 
     * @param taskDescription
     *        A description of the task for your human workers.
     */

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * <p>
     * A description of the task for your human workers.
     * </p>
     * 
     * @return A description of the task for your human workers.
     */

    public String getTaskDescription() {
        return this.taskDescription;
    }

    /**
     * <p>
     * A description of the task for your human workers.
     * </p>
     * 
     * @param taskDescription
     *        A description of the task for your human workers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanTaskConfig withTaskDescription(String taskDescription) {
        setTaskDescription(taskDescription);
        return this;
    }

    /**
     * <p>
     * The number of human workers that will label an object.
     * </p>
     * 
     * @param numberOfHumanWorkersPerDataObject
     *        The number of human workers that will label an object.
     */

    public void setNumberOfHumanWorkersPerDataObject(Integer numberOfHumanWorkersPerDataObject) {
        this.numberOfHumanWorkersPerDataObject = numberOfHumanWorkersPerDataObject;
    }

    /**
     * <p>
     * The number of human workers that will label an object.
     * </p>
     * 
     * @return The number of human workers that will label an object.
     */

    public Integer getNumberOfHumanWorkersPerDataObject() {
        return this.numberOfHumanWorkersPerDataObject;
    }

    /**
     * <p>
     * The number of human workers that will label an object.
     * </p>
     * 
     * @param numberOfHumanWorkersPerDataObject
     *        The number of human workers that will label an object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanTaskConfig withNumberOfHumanWorkersPerDataObject(Integer numberOfHumanWorkersPerDataObject) {
        setNumberOfHumanWorkersPerDataObject(numberOfHumanWorkersPerDataObject);
        return this;
    }

    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     * 
     * @param taskTimeLimitInSeconds
     *        The amount of time that a worker has to complete a task.
     */

    public void setTaskTimeLimitInSeconds(Integer taskTimeLimitInSeconds) {
        this.taskTimeLimitInSeconds = taskTimeLimitInSeconds;
    }

    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     * 
     * @return The amount of time that a worker has to complete a task.
     */

    public Integer getTaskTimeLimitInSeconds() {
        return this.taskTimeLimitInSeconds;
    }

    /**
     * <p>
     * The amount of time that a worker has to complete a task.
     * </p>
     * 
     * @param taskTimeLimitInSeconds
     *        The amount of time that a worker has to complete a task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanTaskConfig withTaskTimeLimitInSeconds(Integer taskTimeLimitInSeconds) {
        setTaskTimeLimitInSeconds(taskTimeLimitInSeconds);
        return this;
    }

    /**
     * <p>
     * The length of time that a task remains available for labelling by human workers.
     * </p>
     * 
     * @param taskAvailabilityLifetimeInSeconds
     *        The length of time that a task remains available for labelling by human workers.
     */

    public void setTaskAvailabilityLifetimeInSeconds(Integer taskAvailabilityLifetimeInSeconds) {
        this.taskAvailabilityLifetimeInSeconds = taskAvailabilityLifetimeInSeconds;
    }

    /**
     * <p>
     * The length of time that a task remains available for labelling by human workers.
     * </p>
     * 
     * @return The length of time that a task remains available for labelling by human workers.
     */

    public Integer getTaskAvailabilityLifetimeInSeconds() {
        return this.taskAvailabilityLifetimeInSeconds;
    }

    /**
     * <p>
     * The length of time that a task remains available for labelling by human workers.
     * </p>
     * 
     * @param taskAvailabilityLifetimeInSeconds
     *        The length of time that a task remains available for labelling by human workers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanTaskConfig withTaskAvailabilityLifetimeInSeconds(Integer taskAvailabilityLifetimeInSeconds) {
        setTaskAvailabilityLifetimeInSeconds(taskAvailabilityLifetimeInSeconds);
        return this;
    }

    /**
     * <p>
     * Defines the maximum number of data objects that can be labeled by human workers at the same time. Each object may
     * have more than one worker at one time.
     * </p>
     * 
     * @param maxConcurrentTaskCount
     *        Defines the maximum number of data objects that can be labeled by human workers at the same time. Each
     *        object may have more than one worker at one time.
     */

    public void setMaxConcurrentTaskCount(Integer maxConcurrentTaskCount) {
        this.maxConcurrentTaskCount = maxConcurrentTaskCount;
    }

    /**
     * <p>
     * Defines the maximum number of data objects that can be labeled by human workers at the same time. Each object may
     * have more than one worker at one time.
     * </p>
     * 
     * @return Defines the maximum number of data objects that can be labeled by human workers at the same time. Each
     *         object may have more than one worker at one time.
     */

    public Integer getMaxConcurrentTaskCount() {
        return this.maxConcurrentTaskCount;
    }

    /**
     * <p>
     * Defines the maximum number of data objects that can be labeled by human workers at the same time. Each object may
     * have more than one worker at one time.
     * </p>
     * 
     * @param maxConcurrentTaskCount
     *        Defines the maximum number of data objects that can be labeled by human workers at the same time. Each
     *        object may have more than one worker at one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanTaskConfig withMaxConcurrentTaskCount(Integer maxConcurrentTaskCount) {
        setMaxConcurrentTaskCount(maxConcurrentTaskCount);
        return this;
    }

    /**
     * <p>
     * Configures how labels are consolidated across human workers.
     * </p>
     * 
     * @param annotationConsolidationConfig
     *        Configures how labels are consolidated across human workers.
     */

    public void setAnnotationConsolidationConfig(AnnotationConsolidationConfig annotationConsolidationConfig) {
        this.annotationConsolidationConfig = annotationConsolidationConfig;
    }

    /**
     * <p>
     * Configures how labels are consolidated across human workers.
     * </p>
     * 
     * @return Configures how labels are consolidated across human workers.
     */

    public AnnotationConsolidationConfig getAnnotationConsolidationConfig() {
        return this.annotationConsolidationConfig;
    }

    /**
     * <p>
     * Configures how labels are consolidated across human workers.
     * </p>
     * 
     * @param annotationConsolidationConfig
     *        Configures how labels are consolidated across human workers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanTaskConfig withAnnotationConsolidationConfig(AnnotationConsolidationConfig annotationConsolidationConfig) {
        setAnnotationConsolidationConfig(annotationConsolidationConfig);
        return this;
    }

    /**
     * <p>
     * The price that you pay for each task performed by a public worker.
     * </p>
     * 
     * @param publicWorkforceTaskPrice
     *        The price that you pay for each task performed by a public worker.
     */

    public void setPublicWorkforceTaskPrice(PublicWorkforceTaskPrice publicWorkforceTaskPrice) {
        this.publicWorkforceTaskPrice = publicWorkforceTaskPrice;
    }

    /**
     * <p>
     * The price that you pay for each task performed by a public worker.
     * </p>
     * 
     * @return The price that you pay for each task performed by a public worker.
     */

    public PublicWorkforceTaskPrice getPublicWorkforceTaskPrice() {
        return this.publicWorkforceTaskPrice;
    }

    /**
     * <p>
     * The price that you pay for each task performed by a public worker.
     * </p>
     * 
     * @param publicWorkforceTaskPrice
     *        The price that you pay for each task performed by a public worker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanTaskConfig withPublicWorkforceTaskPrice(PublicWorkforceTaskPrice publicWorkforceTaskPrice) {
        setPublicWorkforceTaskPrice(publicWorkforceTaskPrice);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkteamArn() != null)
            sb.append("WorkteamArn: ").append(getWorkteamArn()).append(",");
        if (getUiConfig() != null)
            sb.append("UiConfig: ").append(getUiConfig()).append(",");
        if (getPreHumanTaskLambdaArn() != null)
            sb.append("PreHumanTaskLambdaArn: ").append(getPreHumanTaskLambdaArn()).append(",");
        if (getTaskKeywords() != null)
            sb.append("TaskKeywords: ").append(getTaskKeywords()).append(",");
        if (getTaskTitle() != null)
            sb.append("TaskTitle: ").append(getTaskTitle()).append(",");
        if (getTaskDescription() != null)
            sb.append("TaskDescription: ").append(getTaskDescription()).append(",");
        if (getNumberOfHumanWorkersPerDataObject() != null)
            sb.append("NumberOfHumanWorkersPerDataObject: ").append(getNumberOfHumanWorkersPerDataObject()).append(",");
        if (getTaskTimeLimitInSeconds() != null)
            sb.append("TaskTimeLimitInSeconds: ").append(getTaskTimeLimitInSeconds()).append(",");
        if (getTaskAvailabilityLifetimeInSeconds() != null)
            sb.append("TaskAvailabilityLifetimeInSeconds: ").append(getTaskAvailabilityLifetimeInSeconds()).append(",");
        if (getMaxConcurrentTaskCount() != null)
            sb.append("MaxConcurrentTaskCount: ").append(getMaxConcurrentTaskCount()).append(",");
        if (getAnnotationConsolidationConfig() != null)
            sb.append("AnnotationConsolidationConfig: ").append(getAnnotationConsolidationConfig()).append(",");
        if (getPublicWorkforceTaskPrice() != null)
            sb.append("PublicWorkforceTaskPrice: ").append(getPublicWorkforceTaskPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanTaskConfig == false)
            return false;
        HumanTaskConfig other = (HumanTaskConfig) obj;
        if (other.getWorkteamArn() == null ^ this.getWorkteamArn() == null)
            return false;
        if (other.getWorkteamArn() != null && other.getWorkteamArn().equals(this.getWorkteamArn()) == false)
            return false;
        if (other.getUiConfig() == null ^ this.getUiConfig() == null)
            return false;
        if (other.getUiConfig() != null && other.getUiConfig().equals(this.getUiConfig()) == false)
            return false;
        if (other.getPreHumanTaskLambdaArn() == null ^ this.getPreHumanTaskLambdaArn() == null)
            return false;
        if (other.getPreHumanTaskLambdaArn() != null && other.getPreHumanTaskLambdaArn().equals(this.getPreHumanTaskLambdaArn()) == false)
            return false;
        if (other.getTaskKeywords() == null ^ this.getTaskKeywords() == null)
            return false;
        if (other.getTaskKeywords() != null && other.getTaskKeywords().equals(this.getTaskKeywords()) == false)
            return false;
        if (other.getTaskTitle() == null ^ this.getTaskTitle() == null)
            return false;
        if (other.getTaskTitle() != null && other.getTaskTitle().equals(this.getTaskTitle()) == false)
            return false;
        if (other.getTaskDescription() == null ^ this.getTaskDescription() == null)
            return false;
        if (other.getTaskDescription() != null && other.getTaskDescription().equals(this.getTaskDescription()) == false)
            return false;
        if (other.getNumberOfHumanWorkersPerDataObject() == null ^ this.getNumberOfHumanWorkersPerDataObject() == null)
            return false;
        if (other.getNumberOfHumanWorkersPerDataObject() != null
                && other.getNumberOfHumanWorkersPerDataObject().equals(this.getNumberOfHumanWorkersPerDataObject()) == false)
            return false;
        if (other.getTaskTimeLimitInSeconds() == null ^ this.getTaskTimeLimitInSeconds() == null)
            return false;
        if (other.getTaskTimeLimitInSeconds() != null && other.getTaskTimeLimitInSeconds().equals(this.getTaskTimeLimitInSeconds()) == false)
            return false;
        if (other.getTaskAvailabilityLifetimeInSeconds() == null ^ this.getTaskAvailabilityLifetimeInSeconds() == null)
            return false;
        if (other.getTaskAvailabilityLifetimeInSeconds() != null
                && other.getTaskAvailabilityLifetimeInSeconds().equals(this.getTaskAvailabilityLifetimeInSeconds()) == false)
            return false;
        if (other.getMaxConcurrentTaskCount() == null ^ this.getMaxConcurrentTaskCount() == null)
            return false;
        if (other.getMaxConcurrentTaskCount() != null && other.getMaxConcurrentTaskCount().equals(this.getMaxConcurrentTaskCount()) == false)
            return false;
        if (other.getAnnotationConsolidationConfig() == null ^ this.getAnnotationConsolidationConfig() == null)
            return false;
        if (other.getAnnotationConsolidationConfig() != null
                && other.getAnnotationConsolidationConfig().equals(this.getAnnotationConsolidationConfig()) == false)
            return false;
        if (other.getPublicWorkforceTaskPrice() == null ^ this.getPublicWorkforceTaskPrice() == null)
            return false;
        if (other.getPublicWorkforceTaskPrice() != null && other.getPublicWorkforceTaskPrice().equals(this.getPublicWorkforceTaskPrice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkteamArn() == null) ? 0 : getWorkteamArn().hashCode());
        hashCode = prime * hashCode + ((getUiConfig() == null) ? 0 : getUiConfig().hashCode());
        hashCode = prime * hashCode + ((getPreHumanTaskLambdaArn() == null) ? 0 : getPreHumanTaskLambdaArn().hashCode());
        hashCode = prime * hashCode + ((getTaskKeywords() == null) ? 0 : getTaskKeywords().hashCode());
        hashCode = prime * hashCode + ((getTaskTitle() == null) ? 0 : getTaskTitle().hashCode());
        hashCode = prime * hashCode + ((getTaskDescription() == null) ? 0 : getTaskDescription().hashCode());
        hashCode = prime * hashCode + ((getNumberOfHumanWorkersPerDataObject() == null) ? 0 : getNumberOfHumanWorkersPerDataObject().hashCode());
        hashCode = prime * hashCode + ((getTaskTimeLimitInSeconds() == null) ? 0 : getTaskTimeLimitInSeconds().hashCode());
        hashCode = prime * hashCode + ((getTaskAvailabilityLifetimeInSeconds() == null) ? 0 : getTaskAvailabilityLifetimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrentTaskCount() == null) ? 0 : getMaxConcurrentTaskCount().hashCode());
        hashCode = prime * hashCode + ((getAnnotationConsolidationConfig() == null) ? 0 : getAnnotationConsolidationConfig().hashCode());
        hashCode = prime * hashCode + ((getPublicWorkforceTaskPrice() == null) ? 0 : getPublicWorkforceTaskPrice().hashCode());
        return hashCode;
    }

    @Override
    public HumanTaskConfig clone() {
        try {
            return (HumanTaskConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HumanTaskConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
