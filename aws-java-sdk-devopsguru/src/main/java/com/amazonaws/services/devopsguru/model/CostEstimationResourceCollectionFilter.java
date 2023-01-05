/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a filter used to specify which Amazon Web Services resources are analyzed to create a monthly
 * DevOps Guru cost estimate. For more information, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html">Estimate your Amazon DevOps Guru
 * costs</a> and <a href="http://aws.amazon.com/devops-guru/pricing/">Amazon DevOps Guru pricing</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/CostEstimationResourceCollectionFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostEstimationResourceCollectionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that specifies the CloudFormation stack that defines the Amazon Web Services resources used to create a
     * monthly estimate for DevOps Guru.
     * </p>
     */
    private CloudFormationCostEstimationResourceCollectionFilter cloudFormation;
    /**
     * <p>
     * The Amazon Web Services tags used to filter the resource collection that is used for a cost estimate.
     * </p>
     * <p>
     * Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services support
     * tagging, so you can assign the same tag to resources from different services to indicate that the resources are
     * related. For example, you can assign the same tag to an Amazon DynamoDB table resource that you assign to an
     * Lambda function. For more information about using tags, see the <a
     * href="https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf">Tagging best practices</a> whitepaper.
     * </p>
     * <p>
     * Each Amazon Web Services tag has two parts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A tag <i>key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>, or
     * <code>Secret</code>). Tag <i>keys</i> are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * An optional field known as a tag <i>value</i> (for example, <code>111122223333</code>, <code>Production</code>,
     * or a team name). Omitting the tag <i>value</i> is the same as using an empty string. Like tag <i>keys</i>, tag
     * <i>values</i> are case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Together these are known as <i>key</i>-<i>value</i> pairs.
     * </p>
     * <important>
     * <p>
     * The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with the
     * prefix <code>Devops-guru-</code>. The tag <i>key</i> might be <code>DevOps-Guru-deployment-application</code> or
     * <code>devops-guru-rds-application</code>. When you create a <i>key</i>, the case of characters in the <i>key</i>
     * can be whatever you choose. After you create a <i>key</i>, it is case-sensitive. For example, DevOps Guru works
     * with a <i>key</i> named <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and
     * these act as two different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     * <code>Devops-Guru-production-application/RDS</code> or <code>Devops-Guru-production-application/containers</code>
     * .
     * </p>
     * </important>
     */
    private java.util.List<TagCostEstimationResourceCollectionFilter> tags;

    /**
     * <p>
     * An object that specifies the CloudFormation stack that defines the Amazon Web Services resources used to create a
     * monthly estimate for DevOps Guru.
     * </p>
     * 
     * @param cloudFormation
     *        An object that specifies the CloudFormation stack that defines the Amazon Web Services resources used to
     *        create a monthly estimate for DevOps Guru.
     */

    public void setCloudFormation(CloudFormationCostEstimationResourceCollectionFilter cloudFormation) {
        this.cloudFormation = cloudFormation;
    }

    /**
     * <p>
     * An object that specifies the CloudFormation stack that defines the Amazon Web Services resources used to create a
     * monthly estimate for DevOps Guru.
     * </p>
     * 
     * @return An object that specifies the CloudFormation stack that defines the Amazon Web Services resources used to
     *         create a monthly estimate for DevOps Guru.
     */

    public CloudFormationCostEstimationResourceCollectionFilter getCloudFormation() {
        return this.cloudFormation;
    }

    /**
     * <p>
     * An object that specifies the CloudFormation stack that defines the Amazon Web Services resources used to create a
     * monthly estimate for DevOps Guru.
     * </p>
     * 
     * @param cloudFormation
     *        An object that specifies the CloudFormation stack that defines the Amazon Web Services resources used to
     *        create a monthly estimate for DevOps Guru.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostEstimationResourceCollectionFilter withCloudFormation(CloudFormationCostEstimationResourceCollectionFilter cloudFormation) {
        setCloudFormation(cloudFormation);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services tags used to filter the resource collection that is used for a cost estimate.
     * </p>
     * <p>
     * Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services support
     * tagging, so you can assign the same tag to resources from different services to indicate that the resources are
     * related. For example, you can assign the same tag to an Amazon DynamoDB table resource that you assign to an
     * Lambda function. For more information about using tags, see the <a
     * href="https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf">Tagging best practices</a> whitepaper.
     * </p>
     * <p>
     * Each Amazon Web Services tag has two parts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A tag <i>key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>, or
     * <code>Secret</code>). Tag <i>keys</i> are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * An optional field known as a tag <i>value</i> (for example, <code>111122223333</code>, <code>Production</code>,
     * or a team name). Omitting the tag <i>value</i> is the same as using an empty string. Like tag <i>keys</i>, tag
     * <i>values</i> are case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Together these are known as <i>key</i>-<i>value</i> pairs.
     * </p>
     * <important>
     * <p>
     * The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with the
     * prefix <code>Devops-guru-</code>. The tag <i>key</i> might be <code>DevOps-Guru-deployment-application</code> or
     * <code>devops-guru-rds-application</code>. When you create a <i>key</i>, the case of characters in the <i>key</i>
     * can be whatever you choose. After you create a <i>key</i>, it is case-sensitive. For example, DevOps Guru works
     * with a <i>key</i> named <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and
     * these act as two different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     * <code>Devops-Guru-production-application/RDS</code> or <code>Devops-Guru-production-application/containers</code>
     * .
     * </p>
     * </important>
     * 
     * @return The Amazon Web Services tags used to filter the resource collection that is used for a cost estimate.</p>
     *         <p>
     *         Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services
     *         support tagging, so you can assign the same tag to resources from different services to indicate that the
     *         resources are related. For example, you can assign the same tag to an Amazon DynamoDB table resource that
     *         you assign to an Lambda function. For more information about using tags, see the <a
     *         href="https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf">Tagging best practices</a>
     *         whitepaper.
     *         </p>
     *         <p>
     *         Each Amazon Web Services tag has two parts.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A tag <i>key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>,
     *         or <code>Secret</code>). Tag <i>keys</i> are case-sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An optional field known as a tag <i>value</i> (for example, <code>111122223333</code>,
     *         <code>Production</code>, or a team name). Omitting the tag <i>value</i> is the same as using an empty
     *         string. Like tag <i>keys</i>, tag <i>values</i> are case-sensitive.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Together these are known as <i>key</i>-<i>value</i> pairs.
     *         </p>
     *         <important>
     *         <p>
     *         The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with
     *         the prefix <code>Devops-guru-</code>. The tag <i>key</i> might be
     *         <code>DevOps-Guru-deployment-application</code> or <code>devops-guru-rds-application</code>. When you
     *         create a <i>key</i>, the case of characters in the <i>key</i> can be whatever you choose. After you
     *         create a <i>key</i>, it is case-sensitive. For example, DevOps Guru works with a <i>key</i> named
     *         <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and these act as two
     *         different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     *         <code>Devops-Guru-production-application/RDS</code> or
     *         <code>Devops-Guru-production-application/containers</code>.
     *         </p>
     */

    public java.util.List<TagCostEstimationResourceCollectionFilter> getTags() {
        return tags;
    }

    /**
     * <p>
     * The Amazon Web Services tags used to filter the resource collection that is used for a cost estimate.
     * </p>
     * <p>
     * Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services support
     * tagging, so you can assign the same tag to resources from different services to indicate that the resources are
     * related. For example, you can assign the same tag to an Amazon DynamoDB table resource that you assign to an
     * Lambda function. For more information about using tags, see the <a
     * href="https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf">Tagging best practices</a> whitepaper.
     * </p>
     * <p>
     * Each Amazon Web Services tag has two parts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A tag <i>key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>, or
     * <code>Secret</code>). Tag <i>keys</i> are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * An optional field known as a tag <i>value</i> (for example, <code>111122223333</code>, <code>Production</code>,
     * or a team name). Omitting the tag <i>value</i> is the same as using an empty string. Like tag <i>keys</i>, tag
     * <i>values</i> are case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Together these are known as <i>key</i>-<i>value</i> pairs.
     * </p>
     * <important>
     * <p>
     * The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with the
     * prefix <code>Devops-guru-</code>. The tag <i>key</i> might be <code>DevOps-Guru-deployment-application</code> or
     * <code>devops-guru-rds-application</code>. When you create a <i>key</i>, the case of characters in the <i>key</i>
     * can be whatever you choose. After you create a <i>key</i>, it is case-sensitive. For example, DevOps Guru works
     * with a <i>key</i> named <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and
     * these act as two different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     * <code>Devops-Guru-production-application/RDS</code> or <code>Devops-Guru-production-application/containers</code>
     * .
     * </p>
     * </important>
     * 
     * @param tags
     *        The Amazon Web Services tags used to filter the resource collection that is used for a cost estimate.</p>
     *        <p>
     *        Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services
     *        support tagging, so you can assign the same tag to resources from different services to indicate that the
     *        resources are related. For example, you can assign the same tag to an Amazon DynamoDB table resource that
     *        you assign to an Lambda function. For more information about using tags, see the <a
     *        href="https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf">Tagging best practices</a>
     *        whitepaper.
     *        </p>
     *        <p>
     *        Each Amazon Web Services tag has two parts.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A tag <i>key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>, or
     *        <code>Secret</code>). Tag <i>keys</i> are case-sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An optional field known as a tag <i>value</i> (for example, <code>111122223333</code>,
     *        <code>Production</code>, or a team name). Omitting the tag <i>value</i> is the same as using an empty
     *        string. Like tag <i>keys</i>, tag <i>values</i> are case-sensitive.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Together these are known as <i>key</i>-<i>value</i> pairs.
     *        </p>
     *        <important>
     *        <p>
     *        The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with
     *        the prefix <code>Devops-guru-</code>. The tag <i>key</i> might be
     *        <code>DevOps-Guru-deployment-application</code> or <code>devops-guru-rds-application</code>. When you
     *        create a <i>key</i>, the case of characters in the <i>key</i> can be whatever you choose. After you create
     *        a <i>key</i>, it is case-sensitive. For example, DevOps Guru works with a <i>key</i> named
     *        <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and these act as two
     *        different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     *        <code>Devops-Guru-production-application/RDS</code> or
     *        <code>Devops-Guru-production-application/containers</code>.
     *        </p>
     */

    public void setTags(java.util.Collection<TagCostEstimationResourceCollectionFilter> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagCostEstimationResourceCollectionFilter>(tags);
    }

    /**
     * <p>
     * The Amazon Web Services tags used to filter the resource collection that is used for a cost estimate.
     * </p>
     * <p>
     * Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services support
     * tagging, so you can assign the same tag to resources from different services to indicate that the resources are
     * related. For example, you can assign the same tag to an Amazon DynamoDB table resource that you assign to an
     * Lambda function. For more information about using tags, see the <a
     * href="https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf">Tagging best practices</a> whitepaper.
     * </p>
     * <p>
     * Each Amazon Web Services tag has two parts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A tag <i>key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>, or
     * <code>Secret</code>). Tag <i>keys</i> are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * An optional field known as a tag <i>value</i> (for example, <code>111122223333</code>, <code>Production</code>,
     * or a team name). Omitting the tag <i>value</i> is the same as using an empty string. Like tag <i>keys</i>, tag
     * <i>values</i> are case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Together these are known as <i>key</i>-<i>value</i> pairs.
     * </p>
     * <important>
     * <p>
     * The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with the
     * prefix <code>Devops-guru-</code>. The tag <i>key</i> might be <code>DevOps-Guru-deployment-application</code> or
     * <code>devops-guru-rds-application</code>. When you create a <i>key</i>, the case of characters in the <i>key</i>
     * can be whatever you choose. After you create a <i>key</i>, it is case-sensitive. For example, DevOps Guru works
     * with a <i>key</i> named <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and
     * these act as two different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     * <code>Devops-Guru-production-application/RDS</code> or <code>Devops-Guru-production-application/containers</code>
     * .
     * </p>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The Amazon Web Services tags used to filter the resource collection that is used for a cost estimate.</p>
     *        <p>
     *        Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services
     *        support tagging, so you can assign the same tag to resources from different services to indicate that the
     *        resources are related. For example, you can assign the same tag to an Amazon DynamoDB table resource that
     *        you assign to an Lambda function. For more information about using tags, see the <a
     *        href="https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf">Tagging best practices</a>
     *        whitepaper.
     *        </p>
     *        <p>
     *        Each Amazon Web Services tag has two parts.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A tag <i>key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>, or
     *        <code>Secret</code>). Tag <i>keys</i> are case-sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An optional field known as a tag <i>value</i> (for example, <code>111122223333</code>,
     *        <code>Production</code>, or a team name). Omitting the tag <i>value</i> is the same as using an empty
     *        string. Like tag <i>keys</i>, tag <i>values</i> are case-sensitive.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Together these are known as <i>key</i>-<i>value</i> pairs.
     *        </p>
     *        <important>
     *        <p>
     *        The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with
     *        the prefix <code>Devops-guru-</code>. The tag <i>key</i> might be
     *        <code>DevOps-Guru-deployment-application</code> or <code>devops-guru-rds-application</code>. When you
     *        create a <i>key</i>, the case of characters in the <i>key</i> can be whatever you choose. After you create
     *        a <i>key</i>, it is case-sensitive. For example, DevOps Guru works with a <i>key</i> named
     *        <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and these act as two
     *        different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     *        <code>Devops-Guru-production-application/RDS</code> or
     *        <code>Devops-Guru-production-application/containers</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostEstimationResourceCollectionFilter withTags(TagCostEstimationResourceCollectionFilter... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagCostEstimationResourceCollectionFilter>(tags.length));
        }
        for (TagCostEstimationResourceCollectionFilter ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services tags used to filter the resource collection that is used for a cost estimate.
     * </p>
     * <p>
     * Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services support
     * tagging, so you can assign the same tag to resources from different services to indicate that the resources are
     * related. For example, you can assign the same tag to an Amazon DynamoDB table resource that you assign to an
     * Lambda function. For more information about using tags, see the <a
     * href="https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf">Tagging best practices</a> whitepaper.
     * </p>
     * <p>
     * Each Amazon Web Services tag has two parts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A tag <i>key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>, or
     * <code>Secret</code>). Tag <i>keys</i> are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * An optional field known as a tag <i>value</i> (for example, <code>111122223333</code>, <code>Production</code>,
     * or a team name). Omitting the tag <i>value</i> is the same as using an empty string. Like tag <i>keys</i>, tag
     * <i>values</i> are case-sensitive.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Together these are known as <i>key</i>-<i>value</i> pairs.
     * </p>
     * <important>
     * <p>
     * The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with the
     * prefix <code>Devops-guru-</code>. The tag <i>key</i> might be <code>DevOps-Guru-deployment-application</code> or
     * <code>devops-guru-rds-application</code>. When you create a <i>key</i>, the case of characters in the <i>key</i>
     * can be whatever you choose. After you create a <i>key</i>, it is case-sensitive. For example, DevOps Guru works
     * with a <i>key</i> named <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and
     * these act as two different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     * <code>Devops-Guru-production-application/RDS</code> or <code>Devops-Guru-production-application/containers</code>
     * .
     * </p>
     * </important>
     * 
     * @param tags
     *        The Amazon Web Services tags used to filter the resource collection that is used for a cost estimate.</p>
     *        <p>
     *        Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services
     *        support tagging, so you can assign the same tag to resources from different services to indicate that the
     *        resources are related. For example, you can assign the same tag to an Amazon DynamoDB table resource that
     *        you assign to an Lambda function. For more information about using tags, see the <a
     *        href="https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf">Tagging best practices</a>
     *        whitepaper.
     *        </p>
     *        <p>
     *        Each Amazon Web Services tag has two parts.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A tag <i>key</i> (for example, <code>CostCenter</code>, <code>Environment</code>, <code>Project</code>, or
     *        <code>Secret</code>). Tag <i>keys</i> are case-sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An optional field known as a tag <i>value</i> (for example, <code>111122223333</code>,
     *        <code>Production</code>, or a team name). Omitting the tag <i>value</i> is the same as using an empty
     *        string. Like tag <i>keys</i>, tag <i>values</i> are case-sensitive.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Together these are known as <i>key</i>-<i>value</i> pairs.
     *        </p>
     *        <important>
     *        <p>
     *        The string used for a <i>key</i> in a tag that you use to define your resource coverage must begin with
     *        the prefix <code>Devops-guru-</code>. The tag <i>key</i> might be
     *        <code>DevOps-Guru-deployment-application</code> or <code>devops-guru-rds-application</code>. When you
     *        create a <i>key</i>, the case of characters in the <i>key</i> can be whatever you choose. After you create
     *        a <i>key</i>, it is case-sensitive. For example, DevOps Guru works with a <i>key</i> named
     *        <code>devops-guru-rds</code> and a <i>key</i> named <code>DevOps-Guru-RDS</code>, and these act as two
     *        different <i>keys</i>. Possible <i>key</i>/<i>value</i> pairs in your application might be
     *        <code>Devops-Guru-production-application/RDS</code> or
     *        <code>Devops-Guru-production-application/containers</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostEstimationResourceCollectionFilter withTags(java.util.Collection<TagCostEstimationResourceCollectionFilter> tags) {
        setTags(tags);
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
        if (getCloudFormation() != null)
            sb.append("CloudFormation: ").append(getCloudFormation()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostEstimationResourceCollectionFilter == false)
            return false;
        CostEstimationResourceCollectionFilter other = (CostEstimationResourceCollectionFilter) obj;
        if (other.getCloudFormation() == null ^ this.getCloudFormation() == null)
            return false;
        if (other.getCloudFormation() != null && other.getCloudFormation().equals(this.getCloudFormation()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudFormation() == null) ? 0 : getCloudFormation().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CostEstimationResourceCollectionFilter clone() {
        try {
            return (CostEstimationResourceCollectionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.CostEstimationResourceCollectionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
