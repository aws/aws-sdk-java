/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Amazon Augmented AI (Augmented AI) (Preview) is a service that adds human judgment to any machine learning
 * application. Human reviewers can take over when an AI application can't evaluate data with a high degree of
 * confidence.
 * </p>
 * <p>
 * From fraudulent bank transaction identification to document processing to image analysis, machine learning models can
 * be trained to make decisions as well as or better than a human. Nevertheless, some decisions require contextual
 * interpretation, such as when you need to decide whether an image is appropriate for a given audience. Content
 * moderation guidelines are nuanced and highly dependent on context, and they vary between countries. When trying to
 * apply AI in these situations, you can be forced to choose between "ML only" systems with unacceptably high error
 * rates or "human only" systems that are expensive and difficult to scale, and that slow down decision making.
 * </p>
 * <p>
 * This API reference includes information about API actions and data types you can use to interact with Augmented AI
 * programmatically.
 * </p>
 * <p>
 * You can create a flow definition against the Augmented AI API. Provide the Amazon Resource Name (ARN) of a flow
 * definition to integrate AI service APIs, such as <code>Textract.AnalyzeDocument</code> and
 * <code>Rekognition.DetectModerationLabels</code>. These AI services, in turn, invoke the <a>StartHumanLoop</a> API,
 * which evaluates conditions under which humans will be invoked. If humans are required, Augmented AI creates a human
 * loop. Results of human work are available asynchronously in Amazon Simple Storage Service (Amazon S3). You can use
 * Amazon CloudWatch Events to detect human work results.
 * </p>
 * <p>
 * You can find additional Augmented AI API documentation in the following reference guides: <a
 * href="https://docs.aws.amazon.com/rekognition/latest/dg/API_Reference.html">Amazon Rekognition</a>, <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_Reference.html">Amazon SageMaker</a>, and <a
 * href="https://docs.aws.amazon.com/textract/latest/dg/API_Reference.html">Amazon Textract</a>.
 * </p>
 */
package com.amazonaws.services.augmentedairuntime;

