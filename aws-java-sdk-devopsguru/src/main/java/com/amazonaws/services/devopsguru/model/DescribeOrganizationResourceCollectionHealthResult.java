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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeOrganizationResourceCollectionHealth"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationResourceCollectionHealthResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The returned <code>CloudFormationHealthOverview</code> object that contains an <code>InsightHealthOverview</code>
     * object with the requested system health information.
     * </p>
     */
    private java.util.List<CloudFormationHealth> cloudFormation;
    /**
     * <p>
     * An array of <code>ServiceHealth</code> objects that describes the health of the Amazon Web Services services
     * associated with the resources in the collection.
     * </p>
     */
    private java.util.List<ServiceHealth> service;
    /**
     * <p>
     * The name of the organization's account.
     * </p>
     */
    private java.util.List<AccountHealth> account;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;
    /**
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
    private java.util.List<TagHealth> tags;

    /**
     * <p>
     * The returned <code>CloudFormationHealthOverview</code> object that contains an <code>InsightHealthOverview</code>
     * object with the requested system health information.
     * </p>
     * 
     * @return The returned <code>CloudFormationHealthOverview</code> object that contains an
     *         <code>InsightHealthOverview</code> object with the requested system health information.
     */

    public java.util.List<CloudFormationHealth> getCloudFormation() {
        return cloudFormation;
    }

    /**
     * <p>
     * The returned <code>CloudFormationHealthOverview</code> object that contains an <code>InsightHealthOverview</code>
     * object with the requested system health information.
     * </p>
     * 
     * @param cloudFormation
     *        The returned <code>CloudFormationHealthOverview</code> object that contains an
     *        <code>InsightHealthOverview</code> object with the requested system health information.
     */

    public void setCloudFormation(java.util.Collection<CloudFormationHealth> cloudFormation) {
        if (cloudFormation == null) {
            this.cloudFormation = null;
            return;
        }

        this.cloudFormation = new java.util.ArrayList<CloudFormationHealth>(cloudFormation);
    }

    /**
     * <p>
     * The returned <code>CloudFormationHealthOverview</code> object that contains an <code>InsightHealthOverview</code>
     * object with the requested system health information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCloudFormation(java.util.Collection)} or {@link #withCloudFormation(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param cloudFormation
     *        The returned <code>CloudFormationHealthOverview</code> object that contains an
     *        <code>InsightHealthOverview</code> object with the requested system health information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResourceCollectionHealthResult withCloudFormation(CloudFormationHealth... cloudFormation) {
        if (this.cloudFormation == null) {
            setCloudFormation(new java.util.ArrayList<CloudFormationHealth>(cloudFormation.length));
        }
        for (CloudFormationHealth ele : cloudFormation) {
            this.cloudFormation.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The returned <code>CloudFormationHealthOverview</code> object that contains an <code>InsightHealthOverview</code>
     * object with the requested system health information.
     * </p>
     * 
     * @param cloudFormation
     *        The returned <code>CloudFormationHealthOverview</code> object that contains an
     *        <code>InsightHealthOverview</code> object with the requested system health information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResourceCollectionHealthResult withCloudFormation(java.util.Collection<CloudFormationHealth> cloudFormation) {
        setCloudFormation(cloudFormation);
        return this;
    }

    /**
     * <p>
     * An array of <code>ServiceHealth</code> objects that describes the health of the Amazon Web Services services
     * associated with the resources in the collection.
     * </p>
     * 
     * @return An array of <code>ServiceHealth</code> objects that describes the health of the Amazon Web Services
     *         services associated with the resources in the collection.
     */

    public java.util.List<ServiceHealth> getService() {
        return service;
    }

    /**
     * <p>
     * An array of <code>ServiceHealth</code> objects that describes the health of the Amazon Web Services services
     * associated with the resources in the collection.
     * </p>
     * 
     * @param service
     *        An array of <code>ServiceHealth</code> objects that describes the health of the Amazon Web Services
     *        services associated with the resources in the collection.
     */

    public void setService(java.util.Collection<ServiceHealth> service) {
        if (service == null) {
            this.service = null;
            return;
        }

        this.service = new java.util.ArrayList<ServiceHealth>(service);
    }

    /**
     * <p>
     * An array of <code>ServiceHealth</code> objects that describes the health of the Amazon Web Services services
     * associated with the resources in the collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setService(java.util.Collection)} or {@link #withService(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param service
     *        An array of <code>ServiceHealth</code> objects that describes the health of the Amazon Web Services
     *        services associated with the resources in the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResourceCollectionHealthResult withService(ServiceHealth... service) {
        if (this.service == null) {
            setService(new java.util.ArrayList<ServiceHealth>(service.length));
        }
        for (ServiceHealth ele : service) {
            this.service.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ServiceHealth</code> objects that describes the health of the Amazon Web Services services
     * associated with the resources in the collection.
     * </p>
     * 
     * @param service
     *        An array of <code>ServiceHealth</code> objects that describes the health of the Amazon Web Services
     *        services associated with the resources in the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResourceCollectionHealthResult withService(java.util.Collection<ServiceHealth> service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The name of the organization's account.
     * </p>
     * 
     * @return The name of the organization's account.
     */

    public java.util.List<AccountHealth> getAccount() {
        return account;
    }

    /**
     * <p>
     * The name of the organization's account.
     * </p>
     * 
     * @param account
     *        The name of the organization's account.
     */

    public void setAccount(java.util.Collection<AccountHealth> account) {
        if (account == null) {
            this.account = null;
            return;
        }

        this.account = new java.util.ArrayList<AccountHealth>(account);
    }

    /**
     * <p>
     * The name of the organization's account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccount(java.util.Collection)} or {@link #withAccount(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param account
     *        The name of the organization's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResourceCollectionHealthResult withAccount(AccountHealth... account) {
        if (this.account == null) {
            setAccount(new java.util.ArrayList<AccountHealth>(account.length));
        }
        for (AccountHealth ele : account) {
            this.account.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the organization's account.
     * </p>
     * 
     * @param account
     *        The name of the organization's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResourceCollectionHealthResult withAccount(java.util.Collection<AccountHealth> account) {
        setAccount(account);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResourceCollectionHealthResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
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
     * @return Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services
     *         support tagging, so you can assign the same tag to resources from different services to indicate that the
     *         resources are related. For example, you can assign the same tag to an Amazon DynamoDB table resource that
     *         you assign to an Lambda function. For more information about using tags, see the <a
     *         href="https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf">Tagging best practices</a>
     *         whitepaper. </p>
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

    public java.util.List<TagHealth> getTags() {
        return tags;
    }

    /**
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
     *        Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services
     *        support tagging, so you can assign the same tag to resources from different services to indicate that the
     *        resources are related. For example, you can assign the same tag to an Amazon DynamoDB table resource that
     *        you assign to an Lambda function. For more information about using tags, see the <a
     *        href="https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf">Tagging best practices</a>
     *        whitepaper. </p>
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

    public void setTags(java.util.Collection<TagHealth> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagHealth>(tags);
    }

    /**
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
     *        Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services
     *        support tagging, so you can assign the same tag to resources from different services to indicate that the
     *        resources are related. For example, you can assign the same tag to an Amazon DynamoDB table resource that
     *        you assign to an Lambda function. For more information about using tags, see the <a
     *        href="https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf">Tagging best practices</a>
     *        whitepaper. </p>
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

    public DescribeOrganizationResourceCollectionHealthResult withTags(TagHealth... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagHealth>(tags.length));
        }
        for (TagHealth ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
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
     *        Tags help you identify and organize your Amazon Web Services resources. Many Amazon Web Services services
     *        support tagging, so you can assign the same tag to resources from different services to indicate that the
     *        resources are related. For example, you can assign the same tag to an Amazon DynamoDB table resource that
     *        you assign to an Lambda function. For more information about using tags, see the <a
     *        href="https://d1.awsstatic.com/whitepapers/aws-tagging-best-practices.pdf">Tagging best practices</a>
     *        whitepaper. </p>
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

    public DescribeOrganizationResourceCollectionHealthResult withTags(java.util.Collection<TagHealth> tags) {
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
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof DescribeOrganizationResourceCollectionHealthResult == false)
            return false;
        DescribeOrganizationResourceCollectionHealthResult other = (DescribeOrganizationResourceCollectionHealthResult) obj;
        if (other.getCloudFormation() == null ^ this.getCloudFormation() == null)
            return false;
        if (other.getCloudFormation() != null && other.getCloudFormation().equals(this.getCloudFormation()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationResourceCollectionHealthResult clone() {
        try {
            return (DescribeOrganizationResourceCollectionHealthResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
