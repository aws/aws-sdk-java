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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that identifies filter criteria for <code>GetCoverageStatistics</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CoverageFilterCriteria" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoverageFilterCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of Amazon Web Services account IDs to return coverage statistics for.
     * </p>
     */
    private java.util.List<CoverageStringFilter> accountId;
    /**
     * <p>
     * The Amazon EC2 instance tags to filter on.
     * </p>
     */
    private java.util.List<CoverageMapFilter> ec2InstanceTags;
    /**
     * <p>
     * The Amazon ECR image tags to filter on.
     * </p>
     */
    private java.util.List<CoverageStringFilter> ecrImageTags;
    /**
     * <p>
     * The Amazon ECR repository name to filter on.
     * </p>
     */
    private java.util.List<CoverageStringFilter> ecrRepositoryName;
    /**
     * <p>
     * Returns coverage statistics for AWS Lambda functions filtered by function names.
     * </p>
     */
    private java.util.List<CoverageStringFilter> lambdaFunctionName;
    /**
     * <p>
     * Returns coverage statistics for AWS Lambda functions filtered by runtime.
     * </p>
     */
    private java.util.List<CoverageStringFilter> lambdaFunctionRuntime;
    /**
     * <p>
     * Returns coverage statistics for AWS Lambda functions filtered by tag.
     * </p>
     */
    private java.util.List<CoverageMapFilter> lambdaFunctionTags;
    /**
     * <p>
     * An array of Amazon Web Services resource IDs to return coverage statistics for.
     * </p>
     */
    private java.util.List<CoverageStringFilter> resourceId;
    /**
     * <p>
     * An array of Amazon Web Services resource types to return coverage statistics for. The values can be
     * <code>AWS_EC2_INSTANCE</code> or <code>AWS_ECR_REPOSITORY</code>.
     * </p>
     */
    private java.util.List<CoverageStringFilter> resourceType;
    /**
     * <p>
     * The scan status code to filter on.
     * </p>
     */
    private java.util.List<CoverageStringFilter> scanStatusCode;
    /**
     * <p>
     * The scan status reason to filter on.
     * </p>
     */
    private java.util.List<CoverageStringFilter> scanStatusReason;
    /**
     * <p>
     * An array of Amazon Inspector scan types to return coverage statistics for.
     * </p>
     */
    private java.util.List<CoverageStringFilter> scanType;

    /**
     * <p>
     * An array of Amazon Web Services account IDs to return coverage statistics for.
     * </p>
     * 
     * @return An array of Amazon Web Services account IDs to return coverage statistics for.
     */

    public java.util.List<CoverageStringFilter> getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * An array of Amazon Web Services account IDs to return coverage statistics for.
     * </p>
     * 
     * @param accountId
     *        An array of Amazon Web Services account IDs to return coverage statistics for.
     */

    public void setAccountId(java.util.Collection<CoverageStringFilter> accountId) {
        if (accountId == null) {
            this.accountId = null;
            return;
        }

        this.accountId = new java.util.ArrayList<CoverageStringFilter>(accountId);
    }

    /**
     * <p>
     * An array of Amazon Web Services account IDs to return coverage statistics for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountId(java.util.Collection)} or {@link #withAccountId(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountId
     *        An array of Amazon Web Services account IDs to return coverage statistics for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withAccountId(CoverageStringFilter... accountId) {
        if (this.accountId == null) {
            setAccountId(new java.util.ArrayList<CoverageStringFilter>(accountId.length));
        }
        for (CoverageStringFilter ele : accountId) {
            this.accountId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon Web Services account IDs to return coverage statistics for.
     * </p>
     * 
     * @param accountId
     *        An array of Amazon Web Services account IDs to return coverage statistics for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withAccountId(java.util.Collection<CoverageStringFilter> accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance tags to filter on.
     * </p>
     * 
     * @return The Amazon EC2 instance tags to filter on.
     */

    public java.util.List<CoverageMapFilter> getEc2InstanceTags() {
        return ec2InstanceTags;
    }

    /**
     * <p>
     * The Amazon EC2 instance tags to filter on.
     * </p>
     * 
     * @param ec2InstanceTags
     *        The Amazon EC2 instance tags to filter on.
     */

    public void setEc2InstanceTags(java.util.Collection<CoverageMapFilter> ec2InstanceTags) {
        if (ec2InstanceTags == null) {
            this.ec2InstanceTags = null;
            return;
        }

        this.ec2InstanceTags = new java.util.ArrayList<CoverageMapFilter>(ec2InstanceTags);
    }

    /**
     * <p>
     * The Amazon EC2 instance tags to filter on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2InstanceTags(java.util.Collection)} or {@link #withEc2InstanceTags(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ec2InstanceTags
     *        The Amazon EC2 instance tags to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withEc2InstanceTags(CoverageMapFilter... ec2InstanceTags) {
        if (this.ec2InstanceTags == null) {
            setEc2InstanceTags(new java.util.ArrayList<CoverageMapFilter>(ec2InstanceTags.length));
        }
        for (CoverageMapFilter ele : ec2InstanceTags) {
            this.ec2InstanceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance tags to filter on.
     * </p>
     * 
     * @param ec2InstanceTags
     *        The Amazon EC2 instance tags to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withEc2InstanceTags(java.util.Collection<CoverageMapFilter> ec2InstanceTags) {
        setEc2InstanceTags(ec2InstanceTags);
        return this;
    }

    /**
     * <p>
     * The Amazon ECR image tags to filter on.
     * </p>
     * 
     * @return The Amazon ECR image tags to filter on.
     */

    public java.util.List<CoverageStringFilter> getEcrImageTags() {
        return ecrImageTags;
    }

    /**
     * <p>
     * The Amazon ECR image tags to filter on.
     * </p>
     * 
     * @param ecrImageTags
     *        The Amazon ECR image tags to filter on.
     */

    public void setEcrImageTags(java.util.Collection<CoverageStringFilter> ecrImageTags) {
        if (ecrImageTags == null) {
            this.ecrImageTags = null;
            return;
        }

        this.ecrImageTags = new java.util.ArrayList<CoverageStringFilter>(ecrImageTags);
    }

    /**
     * <p>
     * The Amazon ECR image tags to filter on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEcrImageTags(java.util.Collection)} or {@link #withEcrImageTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ecrImageTags
     *        The Amazon ECR image tags to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withEcrImageTags(CoverageStringFilter... ecrImageTags) {
        if (this.ecrImageTags == null) {
            setEcrImageTags(new java.util.ArrayList<CoverageStringFilter>(ecrImageTags.length));
        }
        for (CoverageStringFilter ele : ecrImageTags) {
            this.ecrImageTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon ECR image tags to filter on.
     * </p>
     * 
     * @param ecrImageTags
     *        The Amazon ECR image tags to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withEcrImageTags(java.util.Collection<CoverageStringFilter> ecrImageTags) {
        setEcrImageTags(ecrImageTags);
        return this;
    }

    /**
     * <p>
     * The Amazon ECR repository name to filter on.
     * </p>
     * 
     * @return The Amazon ECR repository name to filter on.
     */

    public java.util.List<CoverageStringFilter> getEcrRepositoryName() {
        return ecrRepositoryName;
    }

    /**
     * <p>
     * The Amazon ECR repository name to filter on.
     * </p>
     * 
     * @param ecrRepositoryName
     *        The Amazon ECR repository name to filter on.
     */

    public void setEcrRepositoryName(java.util.Collection<CoverageStringFilter> ecrRepositoryName) {
        if (ecrRepositoryName == null) {
            this.ecrRepositoryName = null;
            return;
        }

        this.ecrRepositoryName = new java.util.ArrayList<CoverageStringFilter>(ecrRepositoryName);
    }

    /**
     * <p>
     * The Amazon ECR repository name to filter on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEcrRepositoryName(java.util.Collection)} or {@link #withEcrRepositoryName(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param ecrRepositoryName
     *        The Amazon ECR repository name to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withEcrRepositoryName(CoverageStringFilter... ecrRepositoryName) {
        if (this.ecrRepositoryName == null) {
            setEcrRepositoryName(new java.util.ArrayList<CoverageStringFilter>(ecrRepositoryName.length));
        }
        for (CoverageStringFilter ele : ecrRepositoryName) {
            this.ecrRepositoryName.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon ECR repository name to filter on.
     * </p>
     * 
     * @param ecrRepositoryName
     *        The Amazon ECR repository name to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withEcrRepositoryName(java.util.Collection<CoverageStringFilter> ecrRepositoryName) {
        setEcrRepositoryName(ecrRepositoryName);
        return this;
    }

    /**
     * <p>
     * Returns coverage statistics for AWS Lambda functions filtered by function names.
     * </p>
     * 
     * @return Returns coverage statistics for AWS Lambda functions filtered by function names.
     */

    public java.util.List<CoverageStringFilter> getLambdaFunctionName() {
        return lambdaFunctionName;
    }

    /**
     * <p>
     * Returns coverage statistics for AWS Lambda functions filtered by function names.
     * </p>
     * 
     * @param lambdaFunctionName
     *        Returns coverage statistics for AWS Lambda functions filtered by function names.
     */

    public void setLambdaFunctionName(java.util.Collection<CoverageStringFilter> lambdaFunctionName) {
        if (lambdaFunctionName == null) {
            this.lambdaFunctionName = null;
            return;
        }

        this.lambdaFunctionName = new java.util.ArrayList<CoverageStringFilter>(lambdaFunctionName);
    }

    /**
     * <p>
     * Returns coverage statistics for AWS Lambda functions filtered by function names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLambdaFunctionName(java.util.Collection)} or {@link #withLambdaFunctionName(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param lambdaFunctionName
     *        Returns coverage statistics for AWS Lambda functions filtered by function names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withLambdaFunctionName(CoverageStringFilter... lambdaFunctionName) {
        if (this.lambdaFunctionName == null) {
            setLambdaFunctionName(new java.util.ArrayList<CoverageStringFilter>(lambdaFunctionName.length));
        }
        for (CoverageStringFilter ele : lambdaFunctionName) {
            this.lambdaFunctionName.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns coverage statistics for AWS Lambda functions filtered by function names.
     * </p>
     * 
     * @param lambdaFunctionName
     *        Returns coverage statistics for AWS Lambda functions filtered by function names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withLambdaFunctionName(java.util.Collection<CoverageStringFilter> lambdaFunctionName) {
        setLambdaFunctionName(lambdaFunctionName);
        return this;
    }

    /**
     * <p>
     * Returns coverage statistics for AWS Lambda functions filtered by runtime.
     * </p>
     * 
     * @return Returns coverage statistics for AWS Lambda functions filtered by runtime.
     */

    public java.util.List<CoverageStringFilter> getLambdaFunctionRuntime() {
        return lambdaFunctionRuntime;
    }

    /**
     * <p>
     * Returns coverage statistics for AWS Lambda functions filtered by runtime.
     * </p>
     * 
     * @param lambdaFunctionRuntime
     *        Returns coverage statistics for AWS Lambda functions filtered by runtime.
     */

    public void setLambdaFunctionRuntime(java.util.Collection<CoverageStringFilter> lambdaFunctionRuntime) {
        if (lambdaFunctionRuntime == null) {
            this.lambdaFunctionRuntime = null;
            return;
        }

        this.lambdaFunctionRuntime = new java.util.ArrayList<CoverageStringFilter>(lambdaFunctionRuntime);
    }

    /**
     * <p>
     * Returns coverage statistics for AWS Lambda functions filtered by runtime.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLambdaFunctionRuntime(java.util.Collection)} or
     * {@link #withLambdaFunctionRuntime(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lambdaFunctionRuntime
     *        Returns coverage statistics for AWS Lambda functions filtered by runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withLambdaFunctionRuntime(CoverageStringFilter... lambdaFunctionRuntime) {
        if (this.lambdaFunctionRuntime == null) {
            setLambdaFunctionRuntime(new java.util.ArrayList<CoverageStringFilter>(lambdaFunctionRuntime.length));
        }
        for (CoverageStringFilter ele : lambdaFunctionRuntime) {
            this.lambdaFunctionRuntime.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns coverage statistics for AWS Lambda functions filtered by runtime.
     * </p>
     * 
     * @param lambdaFunctionRuntime
     *        Returns coverage statistics for AWS Lambda functions filtered by runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withLambdaFunctionRuntime(java.util.Collection<CoverageStringFilter> lambdaFunctionRuntime) {
        setLambdaFunctionRuntime(lambdaFunctionRuntime);
        return this;
    }

    /**
     * <p>
     * Returns coverage statistics for AWS Lambda functions filtered by tag.
     * </p>
     * 
     * @return Returns coverage statistics for AWS Lambda functions filtered by tag.
     */

    public java.util.List<CoverageMapFilter> getLambdaFunctionTags() {
        return lambdaFunctionTags;
    }

    /**
     * <p>
     * Returns coverage statistics for AWS Lambda functions filtered by tag.
     * </p>
     * 
     * @param lambdaFunctionTags
     *        Returns coverage statistics for AWS Lambda functions filtered by tag.
     */

    public void setLambdaFunctionTags(java.util.Collection<CoverageMapFilter> lambdaFunctionTags) {
        if (lambdaFunctionTags == null) {
            this.lambdaFunctionTags = null;
            return;
        }

        this.lambdaFunctionTags = new java.util.ArrayList<CoverageMapFilter>(lambdaFunctionTags);
    }

    /**
     * <p>
     * Returns coverage statistics for AWS Lambda functions filtered by tag.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLambdaFunctionTags(java.util.Collection)} or {@link #withLambdaFunctionTags(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param lambdaFunctionTags
     *        Returns coverage statistics for AWS Lambda functions filtered by tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withLambdaFunctionTags(CoverageMapFilter... lambdaFunctionTags) {
        if (this.lambdaFunctionTags == null) {
            setLambdaFunctionTags(new java.util.ArrayList<CoverageMapFilter>(lambdaFunctionTags.length));
        }
        for (CoverageMapFilter ele : lambdaFunctionTags) {
            this.lambdaFunctionTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns coverage statistics for AWS Lambda functions filtered by tag.
     * </p>
     * 
     * @param lambdaFunctionTags
     *        Returns coverage statistics for AWS Lambda functions filtered by tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withLambdaFunctionTags(java.util.Collection<CoverageMapFilter> lambdaFunctionTags) {
        setLambdaFunctionTags(lambdaFunctionTags);
        return this;
    }

    /**
     * <p>
     * An array of Amazon Web Services resource IDs to return coverage statistics for.
     * </p>
     * 
     * @return An array of Amazon Web Services resource IDs to return coverage statistics for.
     */

    public java.util.List<CoverageStringFilter> getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * An array of Amazon Web Services resource IDs to return coverage statistics for.
     * </p>
     * 
     * @param resourceId
     *        An array of Amazon Web Services resource IDs to return coverage statistics for.
     */

    public void setResourceId(java.util.Collection<CoverageStringFilter> resourceId) {
        if (resourceId == null) {
            this.resourceId = null;
            return;
        }

        this.resourceId = new java.util.ArrayList<CoverageStringFilter>(resourceId);
    }

    /**
     * <p>
     * An array of Amazon Web Services resource IDs to return coverage statistics for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceId(java.util.Collection)} or {@link #withResourceId(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceId
     *        An array of Amazon Web Services resource IDs to return coverage statistics for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withResourceId(CoverageStringFilter... resourceId) {
        if (this.resourceId == null) {
            setResourceId(new java.util.ArrayList<CoverageStringFilter>(resourceId.length));
        }
        for (CoverageStringFilter ele : resourceId) {
            this.resourceId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon Web Services resource IDs to return coverage statistics for.
     * </p>
     * 
     * @param resourceId
     *        An array of Amazon Web Services resource IDs to return coverage statistics for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withResourceId(java.util.Collection<CoverageStringFilter> resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * An array of Amazon Web Services resource types to return coverage statistics for. The values can be
     * <code>AWS_EC2_INSTANCE</code> or <code>AWS_ECR_REPOSITORY</code>.
     * </p>
     * 
     * @return An array of Amazon Web Services resource types to return coverage statistics for. The values can be
     *         <code>AWS_EC2_INSTANCE</code> or <code>AWS_ECR_REPOSITORY</code>.
     */

    public java.util.List<CoverageStringFilter> getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * An array of Amazon Web Services resource types to return coverage statistics for. The values can be
     * <code>AWS_EC2_INSTANCE</code> or <code>AWS_ECR_REPOSITORY</code>.
     * </p>
     * 
     * @param resourceType
     *        An array of Amazon Web Services resource types to return coverage statistics for. The values can be
     *        <code>AWS_EC2_INSTANCE</code> or <code>AWS_ECR_REPOSITORY</code>.
     */

    public void setResourceType(java.util.Collection<CoverageStringFilter> resourceType) {
        if (resourceType == null) {
            this.resourceType = null;
            return;
        }

        this.resourceType = new java.util.ArrayList<CoverageStringFilter>(resourceType);
    }

    /**
     * <p>
     * An array of Amazon Web Services resource types to return coverage statistics for. The values can be
     * <code>AWS_EC2_INSTANCE</code> or <code>AWS_ECR_REPOSITORY</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceType(java.util.Collection)} or {@link #withResourceType(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceType
     *        An array of Amazon Web Services resource types to return coverage statistics for. The values can be
     *        <code>AWS_EC2_INSTANCE</code> or <code>AWS_ECR_REPOSITORY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withResourceType(CoverageStringFilter... resourceType) {
        if (this.resourceType == null) {
            setResourceType(new java.util.ArrayList<CoverageStringFilter>(resourceType.length));
        }
        for (CoverageStringFilter ele : resourceType) {
            this.resourceType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon Web Services resource types to return coverage statistics for. The values can be
     * <code>AWS_EC2_INSTANCE</code> or <code>AWS_ECR_REPOSITORY</code>.
     * </p>
     * 
     * @param resourceType
     *        An array of Amazon Web Services resource types to return coverage statistics for. The values can be
     *        <code>AWS_EC2_INSTANCE</code> or <code>AWS_ECR_REPOSITORY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withResourceType(java.util.Collection<CoverageStringFilter> resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The scan status code to filter on.
     * </p>
     * 
     * @return The scan status code to filter on.
     */

    public java.util.List<CoverageStringFilter> getScanStatusCode() {
        return scanStatusCode;
    }

    /**
     * <p>
     * The scan status code to filter on.
     * </p>
     * 
     * @param scanStatusCode
     *        The scan status code to filter on.
     */

    public void setScanStatusCode(java.util.Collection<CoverageStringFilter> scanStatusCode) {
        if (scanStatusCode == null) {
            this.scanStatusCode = null;
            return;
        }

        this.scanStatusCode = new java.util.ArrayList<CoverageStringFilter>(scanStatusCode);
    }

    /**
     * <p>
     * The scan status code to filter on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScanStatusCode(java.util.Collection)} or {@link #withScanStatusCode(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param scanStatusCode
     *        The scan status code to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withScanStatusCode(CoverageStringFilter... scanStatusCode) {
        if (this.scanStatusCode == null) {
            setScanStatusCode(new java.util.ArrayList<CoverageStringFilter>(scanStatusCode.length));
        }
        for (CoverageStringFilter ele : scanStatusCode) {
            this.scanStatusCode.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The scan status code to filter on.
     * </p>
     * 
     * @param scanStatusCode
     *        The scan status code to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withScanStatusCode(java.util.Collection<CoverageStringFilter> scanStatusCode) {
        setScanStatusCode(scanStatusCode);
        return this;
    }

    /**
     * <p>
     * The scan status reason to filter on.
     * </p>
     * 
     * @return The scan status reason to filter on.
     */

    public java.util.List<CoverageStringFilter> getScanStatusReason() {
        return scanStatusReason;
    }

    /**
     * <p>
     * The scan status reason to filter on.
     * </p>
     * 
     * @param scanStatusReason
     *        The scan status reason to filter on.
     */

    public void setScanStatusReason(java.util.Collection<CoverageStringFilter> scanStatusReason) {
        if (scanStatusReason == null) {
            this.scanStatusReason = null;
            return;
        }

        this.scanStatusReason = new java.util.ArrayList<CoverageStringFilter>(scanStatusReason);
    }

    /**
     * <p>
     * The scan status reason to filter on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScanStatusReason(java.util.Collection)} or {@link #withScanStatusReason(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scanStatusReason
     *        The scan status reason to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withScanStatusReason(CoverageStringFilter... scanStatusReason) {
        if (this.scanStatusReason == null) {
            setScanStatusReason(new java.util.ArrayList<CoverageStringFilter>(scanStatusReason.length));
        }
        for (CoverageStringFilter ele : scanStatusReason) {
            this.scanStatusReason.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The scan status reason to filter on.
     * </p>
     * 
     * @param scanStatusReason
     *        The scan status reason to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withScanStatusReason(java.util.Collection<CoverageStringFilter> scanStatusReason) {
        setScanStatusReason(scanStatusReason);
        return this;
    }

    /**
     * <p>
     * An array of Amazon Inspector scan types to return coverage statistics for.
     * </p>
     * 
     * @return An array of Amazon Inspector scan types to return coverage statistics for.
     */

    public java.util.List<CoverageStringFilter> getScanType() {
        return scanType;
    }

    /**
     * <p>
     * An array of Amazon Inspector scan types to return coverage statistics for.
     * </p>
     * 
     * @param scanType
     *        An array of Amazon Inspector scan types to return coverage statistics for.
     */

    public void setScanType(java.util.Collection<CoverageStringFilter> scanType) {
        if (scanType == null) {
            this.scanType = null;
            return;
        }

        this.scanType = new java.util.ArrayList<CoverageStringFilter>(scanType);
    }

    /**
     * <p>
     * An array of Amazon Inspector scan types to return coverage statistics for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScanType(java.util.Collection)} or {@link #withScanType(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param scanType
     *        An array of Amazon Inspector scan types to return coverage statistics for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withScanType(CoverageStringFilter... scanType) {
        if (this.scanType == null) {
            setScanType(new java.util.ArrayList<CoverageStringFilter>(scanType.length));
        }
        for (CoverageStringFilter ele : scanType) {
            this.scanType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon Inspector scan types to return coverage statistics for.
     * </p>
     * 
     * @param scanType
     *        An array of Amazon Inspector scan types to return coverage statistics for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriteria withScanType(java.util.Collection<CoverageStringFilter> scanType) {
        setScanType(scanType);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getEc2InstanceTags() != null)
            sb.append("Ec2InstanceTags: ").append(getEc2InstanceTags()).append(",");
        if (getEcrImageTags() != null)
            sb.append("EcrImageTags: ").append(getEcrImageTags()).append(",");
        if (getEcrRepositoryName() != null)
            sb.append("EcrRepositoryName: ").append(getEcrRepositoryName()).append(",");
        if (getLambdaFunctionName() != null)
            sb.append("LambdaFunctionName: ").append(getLambdaFunctionName()).append(",");
        if (getLambdaFunctionRuntime() != null)
            sb.append("LambdaFunctionRuntime: ").append(getLambdaFunctionRuntime()).append(",");
        if (getLambdaFunctionTags() != null)
            sb.append("LambdaFunctionTags: ").append(getLambdaFunctionTags()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getScanStatusCode() != null)
            sb.append("ScanStatusCode: ").append(getScanStatusCode()).append(",");
        if (getScanStatusReason() != null)
            sb.append("ScanStatusReason: ").append(getScanStatusReason()).append(",");
        if (getScanType() != null)
            sb.append("ScanType: ").append(getScanType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoverageFilterCriteria == false)
            return false;
        CoverageFilterCriteria other = (CoverageFilterCriteria) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getEc2InstanceTags() == null ^ this.getEc2InstanceTags() == null)
            return false;
        if (other.getEc2InstanceTags() != null && other.getEc2InstanceTags().equals(this.getEc2InstanceTags()) == false)
            return false;
        if (other.getEcrImageTags() == null ^ this.getEcrImageTags() == null)
            return false;
        if (other.getEcrImageTags() != null && other.getEcrImageTags().equals(this.getEcrImageTags()) == false)
            return false;
        if (other.getEcrRepositoryName() == null ^ this.getEcrRepositoryName() == null)
            return false;
        if (other.getEcrRepositoryName() != null && other.getEcrRepositoryName().equals(this.getEcrRepositoryName()) == false)
            return false;
        if (other.getLambdaFunctionName() == null ^ this.getLambdaFunctionName() == null)
            return false;
        if (other.getLambdaFunctionName() != null && other.getLambdaFunctionName().equals(this.getLambdaFunctionName()) == false)
            return false;
        if (other.getLambdaFunctionRuntime() == null ^ this.getLambdaFunctionRuntime() == null)
            return false;
        if (other.getLambdaFunctionRuntime() != null && other.getLambdaFunctionRuntime().equals(this.getLambdaFunctionRuntime()) == false)
            return false;
        if (other.getLambdaFunctionTags() == null ^ this.getLambdaFunctionTags() == null)
            return false;
        if (other.getLambdaFunctionTags() != null && other.getLambdaFunctionTags().equals(this.getLambdaFunctionTags()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getScanStatusCode() == null ^ this.getScanStatusCode() == null)
            return false;
        if (other.getScanStatusCode() != null && other.getScanStatusCode().equals(this.getScanStatusCode()) == false)
            return false;
        if (other.getScanStatusReason() == null ^ this.getScanStatusReason() == null)
            return false;
        if (other.getScanStatusReason() != null && other.getScanStatusReason().equals(this.getScanStatusReason()) == false)
            return false;
        if (other.getScanType() == null ^ this.getScanType() == null)
            return false;
        if (other.getScanType() != null && other.getScanType().equals(this.getScanType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceTags() == null) ? 0 : getEc2InstanceTags().hashCode());
        hashCode = prime * hashCode + ((getEcrImageTags() == null) ? 0 : getEcrImageTags().hashCode());
        hashCode = prime * hashCode + ((getEcrRepositoryName() == null) ? 0 : getEcrRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionName() == null) ? 0 : getLambdaFunctionName().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionRuntime() == null) ? 0 : getLambdaFunctionRuntime().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionTags() == null) ? 0 : getLambdaFunctionTags().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getScanStatusCode() == null) ? 0 : getScanStatusCode().hashCode());
        hashCode = prime * hashCode + ((getScanStatusReason() == null) ? 0 : getScanStatusReason().hashCode());
        hashCode = prime * hashCode + ((getScanType() == null) ? 0 : getScanType().hashCode());
        return hashCode;
    }

    @Override
    public CoverageFilterCriteria clone() {
        try {
            return (CoverageFilterCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CoverageFilterCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
