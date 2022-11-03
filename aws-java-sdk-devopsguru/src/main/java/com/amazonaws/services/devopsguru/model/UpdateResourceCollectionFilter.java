/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information used to update a collection of Amazon Web Services resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateResourceCollectionFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResourceCollectionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A collection of Amazon Web Services CloudFormation stacks. You can specify up to 500 Amazon Web Services
     * CloudFormation stacks.
     * </p>
     */
    private UpdateCloudFormationCollectionFilter cloudFormation;
    /**
     * <p>
     * The updated Amazon Web Services tags used to filter the resources in the resource collection.
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
    private java.util.List<UpdateTagCollectionFilter> tags;

    /**
     * <p>
     * A collection of Amazon Web Services CloudFormation stacks. You can specify up to 500 Amazon Web Services
     * CloudFormation stacks.
     * </p>
     * 
     * @param cloudFormation
     *        A collection of Amazon Web Services CloudFormation stacks. You can specify up to 500 Amazon Web Services
     *        CloudFormation stacks.
     */

    public void setCloudFormation(UpdateCloudFormationCollectionFilter cloudFormation) {
        this.cloudFormation = cloudFormation;
    }

    /**
     * <p>
     * A collection of Amazon Web Services CloudFormation stacks. You can specify up to 500 Amazon Web Services
     * CloudFormation stacks.
     * </p>
     * 
     * @return A collection of Amazon Web Services CloudFormation stacks. You can specify up to 500 Amazon Web Services
     *         CloudFormation stacks.
     */

    public UpdateCloudFormationCollectionFilter getCloudFormation() {
        return this.cloudFormation;
    }

    /**
     * <p>
     * A collection of Amazon Web Services CloudFormation stacks. You can specify up to 500 Amazon Web Services
     * CloudFormation stacks.
     * </p>
     * 
     * @param cloudFormation
     *        A collection of Amazon Web Services CloudFormation stacks. You can specify up to 500 Amazon Web Services
     *        CloudFormation stacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceCollectionFilter withCloudFormation(UpdateCloudFormationCollectionFilter cloudFormation) {
        setCloudFormation(cloudFormation);
        return this;
    }

    /**
     * <p>
     * The updated Amazon Web Services tags used to filter the resources in the resource collection.
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
     * @return The updated Amazon Web Services tags used to filter the resources in the resource collection.</p>
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

    public java.util.List<UpdateTagCollectionFilter> getTags() {
        return tags;
    }

    /**
     * <p>
     * The updated Amazon Web Services tags used to filter the resources in the resource collection.
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
     *        The updated Amazon Web Services tags used to filter the resources in the resource collection.</p>
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

    public void setTags(java.util.Collection<UpdateTagCollectionFilter> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<UpdateTagCollectionFilter>(tags);
    }

    /**
     * <p>
     * The updated Amazon Web Services tags used to filter the resources in the resource collection.
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
     *        The updated Amazon Web Services tags used to filter the resources in the resource collection.</p>
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

    public UpdateResourceCollectionFilter withTags(UpdateTagCollectionFilter... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<UpdateTagCollectionFilter>(tags.length));
        }
        for (UpdateTagCollectionFilter ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The updated Amazon Web Services tags used to filter the resources in the resource collection.
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
     *        The updated Amazon Web Services tags used to filter the resources in the resource collection.</p>
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

    public UpdateResourceCollectionFilter withTags(java.util.Collection<UpdateTagCollectionFilter> tags) {
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

        if (obj instanceof UpdateResourceCollectionFilter == false)
            return false;
        UpdateResourceCollectionFilter other = (UpdateResourceCollectionFilter) obj;
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
    public UpdateResourceCollectionFilter clone() {
        try {
            return (UpdateResourceCollectionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.UpdateResourceCollectionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
