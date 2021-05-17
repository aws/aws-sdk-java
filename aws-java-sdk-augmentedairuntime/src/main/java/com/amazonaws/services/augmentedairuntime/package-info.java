/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon Augmented AI (Amazon A2I) adds the benefit of human judgment to any machine learning application. When an AI
 * application can't evaluate data with a high degree of confidence, human reviewers can take over. This human review is
 * called a human review workflow. To create and start a human review workflow, you need three resources: a <i>worker
 * task template</i>, a <i>flow definition</i>, and a <i>human loop</i>.
 * </p>
 * <p>
 * For information about these resources and prerequisites for using Amazon A2I, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-getting-started.html">Get Started with Amazon Augmented
 * AI</a> in the Amazon SageMaker Developer Guide.
 * </p>
 * <p>
 * This API reference includes information about API actions and data types that you can use to interact with Amazon A2I
 * programmatically. Use this guide to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Start a human loop with the <code>StartHumanLoop</code> operation when using Amazon A2I with a <i>custom task
 * type</i>. To learn more about the difference between custom and built-in task types, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-task-types-general.html">Use Task Types </a>. To learn how
 * to start a human loop using this API, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-start-human-loop.html#a2i-instructions-starthumanloop"
 * >Create and Start a Human Loop for a Custom Task Type </a> in the Amazon SageMaker Developer Guide.
 * </p>
 * </li>
 * <li>
 * <p>
 * Manage your human loops. You can list all human loops that you have created, describe individual human loops, and
 * stop and delete human loops. To learn more, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-monitor-humanloop-results.html">Monitor and Manage Your
 * Human Loop </a> in the Amazon SageMaker Developer Guide.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Amazon A2I integrates APIs from various AWS services to create and start human review workflows for those services.
 * To learn how Amazon A2I uses these APIs, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-api-references.html">Use APIs in Amazon A2I</a> in the
 * Amazon SageMaker Developer Guide.
 * </p>
 */
package com.amazonaws.services.augmentedairuntime;

