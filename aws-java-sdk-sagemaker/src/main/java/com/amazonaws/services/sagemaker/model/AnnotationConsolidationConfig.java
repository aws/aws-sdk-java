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
 * Configures how labels are consolidated across human workers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AnnotationConsolidationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnnotationConsolidationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function implements the logic for annotation consolidation.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic segmentation, and text classification task types,
     * Amazon SageMaker Ground Truth provides the following Lambda functions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Bounding box</i> - Finds the most similar boxes from different workers based on the Jaccard index of the
     * boxes.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Image classification</i> - Uses a variant of the Expectation Maximization approach to estimate the true class
     * of an image based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation</i> - Treats each pixel in an image as a multi-class classification and treats pixel
     * annotations from workers as "votes" for the correct label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i> - Uses a variant of the Expectation Maximization approach to estimate the true class
     * of text based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html">Annotation
     * Consolidation</a>.
     * </p>
     */
    private String annotationConsolidationLambdaArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function implements the logic for annotation consolidation.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic segmentation, and text classification task types,
     * Amazon SageMaker Ground Truth provides the following Lambda functions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Bounding box</i> - Finds the most similar boxes from different workers based on the Jaccard index of the
     * boxes.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Image classification</i> - Uses a variant of the Expectation Maximization approach to estimate the true class
     * of an image based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation</i> - Treats each pixel in an image as a multi-class classification and treats pixel
     * annotations from workers as "votes" for the correct label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i> - Uses a variant of the Expectation Maximization approach to estimate the true class
     * of text based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html">Annotation
     * Consolidation</a>.
     * </p>
     * 
     * @param annotationConsolidationLambdaArn
     *        The Amazon Resource Name (ARN) of a Lambda function implements the logic for annotation consolidation.</p>
     *        <p>
     *        For the built-in bounding box, image classification, semantic segmentation, and text classification task
     *        types, Amazon SageMaker Ground Truth provides the following Lambda functions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Bounding box</i> - Finds the most similar boxes from different workers based on the Jaccard index of
     *        the boxes.
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-BoundingBox</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-BoundingBox</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-BoundingBox</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-BoundingBox</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-BoundingBox</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Image classification</i> - Uses a variant of the Expectation Maximization approach to estimate the true
     *        class of an image based on annotations from individual workers.
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClass</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Semantic segmentation</i> - Treats each pixel in an image as a multi-class classification and treats
     *        pixel annotations from workers as "votes" for the correct label.
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-SemanticSegmentation</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-SemanticSegmentation</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-SemanticSegmentation</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-SemanticSegmentation</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-SemanticSegmentation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Text classification</i> - Uses a variant of the Expectation Maximization approach to estimate the true
     *        class of text based on annotations from individual workers.
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClass</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html">Annotation
     *        Consolidation</a>.
     */

    public void setAnnotationConsolidationLambdaArn(String annotationConsolidationLambdaArn) {
        this.annotationConsolidationLambdaArn = annotationConsolidationLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function implements the logic for annotation consolidation.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic segmentation, and text classification task types,
     * Amazon SageMaker Ground Truth provides the following Lambda functions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Bounding box</i> - Finds the most similar boxes from different workers based on the Jaccard index of the
     * boxes.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Image classification</i> - Uses a variant of the Expectation Maximization approach to estimate the true class
     * of an image based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation</i> - Treats each pixel in an image as a multi-class classification and treats pixel
     * annotations from workers as "votes" for the correct label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i> - Uses a variant of the Expectation Maximization approach to estimate the true class
     * of text based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html">Annotation
     * Consolidation</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a Lambda function implements the logic for annotation
     *         consolidation.</p>
     *         <p>
     *         For the built-in bounding box, image classification, semantic segmentation, and text classification task
     *         types, Amazon SageMaker Ground Truth provides the following Lambda functions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Bounding box</i> - Finds the most similar boxes from different workers based on the Jaccard index of
     *         the boxes.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-BoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-BoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-BoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-BoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Image classification</i> - Uses a variant of the Expectation Maximization approach to estimate the
     *         true class of an image based on annotations from individual workers.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Semantic segmentation</i> - Treats each pixel in an image as a multi-class classification and treats
     *         pixel annotations from workers as "votes" for the correct label.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Text classification</i> - Uses a variant of the Expectation Maximization approach to estimate the true
     *         class of text based on annotations from individual workers.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClass</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html">Annotation
     *         Consolidation</a>.
     */

    public String getAnnotationConsolidationLambdaArn() {
        return this.annotationConsolidationLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function implements the logic for annotation consolidation.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic segmentation, and text classification task types,
     * Amazon SageMaker Ground Truth provides the following Lambda functions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Bounding box</i> - Finds the most similar boxes from different workers based on the Jaccard index of the
     * boxes.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Image classification</i> - Uses a variant of the Expectation Maximization approach to estimate the true class
     * of an image based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation</i> - Treats each pixel in an image as a multi-class classification and treats pixel
     * annotations from workers as "votes" for the correct label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i> - Uses a variant of the Expectation Maximization approach to estimate the true class
     * of text based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClass</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html">Annotation
     * Consolidation</a>.
     * </p>
     * 
     * @param annotationConsolidationLambdaArn
     *        The Amazon Resource Name (ARN) of a Lambda function implements the logic for annotation consolidation.</p>
     *        <p>
     *        For the built-in bounding box, image classification, semantic segmentation, and text classification task
     *        types, Amazon SageMaker Ground Truth provides the following Lambda functions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>Bounding box</i> - Finds the most similar boxes from different workers based on the Jaccard index of
     *        the boxes.
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-BoundingBox</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-BoundingBox</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-BoundingBox</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-BoundingBox</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-BoundingBox</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Image classification</i> - Uses a variant of the Expectation Maximization approach to estimate the true
     *        class of an image based on annotations from individual workers.
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClass</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Semantic segmentation</i> - Treats each pixel in an image as a multi-class classification and treats
     *        pixel annotations from workers as "votes" for the correct label.
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-SemanticSegmentation</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-SemanticSegmentation</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-SemanticSegmentation</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-SemanticSegmentation</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-SemanticSegmentation</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Text classification</i> - Uses a variant of the Expectation Maximization approach to estimate the true
     *        class of text based on annotations from individual workers.
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClass</code>
     *        </p>
     *        <p>
     *        <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClass</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html">Annotation
     *        Consolidation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnnotationConsolidationConfig withAnnotationConsolidationLambdaArn(String annotationConsolidationLambdaArn) {
        setAnnotationConsolidationLambdaArn(annotationConsolidationLambdaArn);
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
        if (getAnnotationConsolidationLambdaArn() != null)
            sb.append("AnnotationConsolidationLambdaArn: ").append(getAnnotationConsolidationLambdaArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnnotationConsolidationConfig == false)
            return false;
        AnnotationConsolidationConfig other = (AnnotationConsolidationConfig) obj;
        if (other.getAnnotationConsolidationLambdaArn() == null ^ this.getAnnotationConsolidationLambdaArn() == null)
            return false;
        if (other.getAnnotationConsolidationLambdaArn() != null
                && other.getAnnotationConsolidationLambdaArn().equals(this.getAnnotationConsolidationLambdaArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnnotationConsolidationLambdaArn() == null) ? 0 : getAnnotationConsolidationLambdaArn().hashCode());
        return hashCode;
    }

    @Override
    public AnnotationConsolidationConfig clone() {
        try {
            return (AnnotationConsolidationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AnnotationConsolidationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
