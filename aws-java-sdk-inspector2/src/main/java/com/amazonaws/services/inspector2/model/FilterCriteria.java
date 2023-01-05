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
 * Details on the criteria used to define the filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/FilterCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details of the Amazon Web Services account IDs used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> awsAccountId;
    /**
     * <p>
     * Details of the component IDs used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> componentId;
    /**
     * <p>
     * Details of the component types used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> componentType;
    /**
     * <p>
     * Details of the Amazon EC2 instance image IDs used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> ec2InstanceImageId;
    /**
     * <p>
     * Details of the Amazon EC2 instance subnet IDs used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> ec2InstanceSubnetId;
    /**
     * <p>
     * Details of the Amazon EC2 instance VPC IDs used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> ec2InstanceVpcId;
    /**
     * <p>
     * Details of the Amazon ECR image architecture types used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> ecrImageArchitecture;
    /**
     * <p>
     * Details of the Amazon ECR image hashes used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> ecrImageHash;
    /**
     * <p>
     * Details on the Amazon ECR image push date and time used to filter findings.
     * </p>
     */
    private java.util.List<DateFilter> ecrImagePushedAt;
    /**
     * <p>
     * Details on the Amazon ECR registry used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> ecrImageRegistry;
    /**
     * <p>
     * Details on the name of the Amazon ECR repository used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> ecrImageRepositoryName;
    /**
     * <p>
     * The tags attached to the Amazon ECR container image.
     * </p>
     */
    private java.util.List<StringFilter> ecrImageTags;
    /**
     * <p>
     * Filters the list of AWS Lambda findings by the availability of exploits.
     * </p>
     */
    private java.util.List<StringFilter> exploitAvailable;
    /**
     * <p>
     * Details on the finding ARNs used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> findingArn;
    /**
     * <p>
     * Details on the finding status types used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> findingStatus;
    /**
     * <p>
     * Details on the finding types used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> findingType;
    /**
     * <p>
     * Details on the date and time a finding was first seen used to filter findings.
     * </p>
     */
    private java.util.List<DateFilter> firstObservedAt;
    /**
     * <p>
     * Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     * <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     * packages identified in the finding have fixes available through updated versions.
     * </p>
     */
    private java.util.List<StringFilter> fixAvailable;
    /**
     * <p>
     * The Amazon Inspector score to filter on.
     * </p>
     */
    private java.util.List<NumberFilter> inspectorScore;
    /**
     * <p>
     * Filters the list of AWS Lambda functions by execution role.
     * </p>
     */
    private java.util.List<StringFilter> lambdaFunctionExecutionRoleArn;
    /**
     * <p>
     * Filters the list of AWS Lambda functions by the date and time that a user last updated the configuration, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     * </p>
     */
    private java.util.List<DateFilter> lambdaFunctionLastModifiedAt;
    /**
     * <p>
     * Filters the list of AWS Lambda functions by the function's <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>. A Lambda function can
     * have up to five layers.
     * </p>
     */
    private java.util.List<StringFilter> lambdaFunctionLayers;
    /**
     * <p>
     * Filters the list of AWS Lambda functions by the name of the function.
     * </p>
     */
    private java.util.List<StringFilter> lambdaFunctionName;
    /**
     * <p>
     * Filters the list of AWS Lambda functions by the runtime environment for the Lambda function.
     * </p>
     */
    private java.util.List<StringFilter> lambdaFunctionRuntime;
    /**
     * <p>
     * Details on the date and time a finding was last seen used to filter findings.
     * </p>
     */
    private java.util.List<DateFilter> lastObservedAt;
    /**
     * <p>
     * Details on the ingress source addresses used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> networkProtocol;
    /**
     * <p>
     * Details on the port ranges used to filter findings.
     * </p>
     */
    private java.util.List<PortRangeFilter> portRange;
    /**
     * <p>
     * Details on the related vulnerabilities used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> relatedVulnerabilities;
    /**
     * <p>
     * Details on the resource IDs used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> resourceId;
    /**
     * <p>
     * Details on the resource tags used to filter findings.
     * </p>
     */
    private java.util.List<MapFilter> resourceTags;
    /**
     * <p>
     * Details on the resource types used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> resourceType;
    /**
     * <p>
     * Details on the severity used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> severity;
    /**
     * <p>
     * Details on the finding title used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> title;
    /**
     * <p>
     * Details on the date and time a finding was last updated at used to filter findings.
     * </p>
     */
    private java.util.List<DateFilter> updatedAt;
    /**
     * <p>
     * Details on the vendor severity used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> vendorSeverity;
    /**
     * <p>
     * Details on the vulnerability ID used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> vulnerabilityId;
    /**
     * <p>
     * Details on the vulnerability type used to filter findings.
     * </p>
     */
    private java.util.List<StringFilter> vulnerabilitySource;
    /**
     * <p>
     * Details on the vulnerable packages used to filter findings.
     * </p>
     */
    private java.util.List<PackageFilter> vulnerablePackages;

    /**
     * <p>
     * Details of the Amazon Web Services account IDs used to filter findings.
     * </p>
     * 
     * @return Details of the Amazon Web Services account IDs used to filter findings.
     */

    public java.util.List<StringFilter> getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * Details of the Amazon Web Services account IDs used to filter findings.
     * </p>
     * 
     * @param awsAccountId
     *        Details of the Amazon Web Services account IDs used to filter findings.
     */

    public void setAwsAccountId(java.util.Collection<StringFilter> awsAccountId) {
        if (awsAccountId == null) {
            this.awsAccountId = null;
            return;
        }

        this.awsAccountId = new java.util.ArrayList<StringFilter>(awsAccountId);
    }

    /**
     * <p>
     * Details of the Amazon Web Services account IDs used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAwsAccountId(java.util.Collection)} or {@link #withAwsAccountId(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param awsAccountId
     *        Details of the Amazon Web Services account IDs used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withAwsAccountId(StringFilter... awsAccountId) {
        if (this.awsAccountId == null) {
            setAwsAccountId(new java.util.ArrayList<StringFilter>(awsAccountId.length));
        }
        for (StringFilter ele : awsAccountId) {
            this.awsAccountId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of the Amazon Web Services account IDs used to filter findings.
     * </p>
     * 
     * @param awsAccountId
     *        Details of the Amazon Web Services account IDs used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withAwsAccountId(java.util.Collection<StringFilter> awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * Details of the component IDs used to filter findings.
     * </p>
     * 
     * @return Details of the component IDs used to filter findings.
     */

    public java.util.List<StringFilter> getComponentId() {
        return componentId;
    }

    /**
     * <p>
     * Details of the component IDs used to filter findings.
     * </p>
     * 
     * @param componentId
     *        Details of the component IDs used to filter findings.
     */

    public void setComponentId(java.util.Collection<StringFilter> componentId) {
        if (componentId == null) {
            this.componentId = null;
            return;
        }

        this.componentId = new java.util.ArrayList<StringFilter>(componentId);
    }

    /**
     * <p>
     * Details of the component IDs used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponentId(java.util.Collection)} or {@link #withComponentId(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param componentId
     *        Details of the component IDs used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withComponentId(StringFilter... componentId) {
        if (this.componentId == null) {
            setComponentId(new java.util.ArrayList<StringFilter>(componentId.length));
        }
        for (StringFilter ele : componentId) {
            this.componentId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of the component IDs used to filter findings.
     * </p>
     * 
     * @param componentId
     *        Details of the component IDs used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withComponentId(java.util.Collection<StringFilter> componentId) {
        setComponentId(componentId);
        return this;
    }

    /**
     * <p>
     * Details of the component types used to filter findings.
     * </p>
     * 
     * @return Details of the component types used to filter findings.
     */

    public java.util.List<StringFilter> getComponentType() {
        return componentType;
    }

    /**
     * <p>
     * Details of the component types used to filter findings.
     * </p>
     * 
     * @param componentType
     *        Details of the component types used to filter findings.
     */

    public void setComponentType(java.util.Collection<StringFilter> componentType) {
        if (componentType == null) {
            this.componentType = null;
            return;
        }

        this.componentType = new java.util.ArrayList<StringFilter>(componentType);
    }

    /**
     * <p>
     * Details of the component types used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponentType(java.util.Collection)} or {@link #withComponentType(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param componentType
     *        Details of the component types used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withComponentType(StringFilter... componentType) {
        if (this.componentType == null) {
            setComponentType(new java.util.ArrayList<StringFilter>(componentType.length));
        }
        for (StringFilter ele : componentType) {
            this.componentType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of the component types used to filter findings.
     * </p>
     * 
     * @param componentType
     *        Details of the component types used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withComponentType(java.util.Collection<StringFilter> componentType) {
        setComponentType(componentType);
        return this;
    }

    /**
     * <p>
     * Details of the Amazon EC2 instance image IDs used to filter findings.
     * </p>
     * 
     * @return Details of the Amazon EC2 instance image IDs used to filter findings.
     */

    public java.util.List<StringFilter> getEc2InstanceImageId() {
        return ec2InstanceImageId;
    }

    /**
     * <p>
     * Details of the Amazon EC2 instance image IDs used to filter findings.
     * </p>
     * 
     * @param ec2InstanceImageId
     *        Details of the Amazon EC2 instance image IDs used to filter findings.
     */

    public void setEc2InstanceImageId(java.util.Collection<StringFilter> ec2InstanceImageId) {
        if (ec2InstanceImageId == null) {
            this.ec2InstanceImageId = null;
            return;
        }

        this.ec2InstanceImageId = new java.util.ArrayList<StringFilter>(ec2InstanceImageId);
    }

    /**
     * <p>
     * Details of the Amazon EC2 instance image IDs used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2InstanceImageId(java.util.Collection)} or {@link #withEc2InstanceImageId(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param ec2InstanceImageId
     *        Details of the Amazon EC2 instance image IDs used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEc2InstanceImageId(StringFilter... ec2InstanceImageId) {
        if (this.ec2InstanceImageId == null) {
            setEc2InstanceImageId(new java.util.ArrayList<StringFilter>(ec2InstanceImageId.length));
        }
        for (StringFilter ele : ec2InstanceImageId) {
            this.ec2InstanceImageId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of the Amazon EC2 instance image IDs used to filter findings.
     * </p>
     * 
     * @param ec2InstanceImageId
     *        Details of the Amazon EC2 instance image IDs used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEc2InstanceImageId(java.util.Collection<StringFilter> ec2InstanceImageId) {
        setEc2InstanceImageId(ec2InstanceImageId);
        return this;
    }

    /**
     * <p>
     * Details of the Amazon EC2 instance subnet IDs used to filter findings.
     * </p>
     * 
     * @return Details of the Amazon EC2 instance subnet IDs used to filter findings.
     */

    public java.util.List<StringFilter> getEc2InstanceSubnetId() {
        return ec2InstanceSubnetId;
    }

    /**
     * <p>
     * Details of the Amazon EC2 instance subnet IDs used to filter findings.
     * </p>
     * 
     * @param ec2InstanceSubnetId
     *        Details of the Amazon EC2 instance subnet IDs used to filter findings.
     */

    public void setEc2InstanceSubnetId(java.util.Collection<StringFilter> ec2InstanceSubnetId) {
        if (ec2InstanceSubnetId == null) {
            this.ec2InstanceSubnetId = null;
            return;
        }

        this.ec2InstanceSubnetId = new java.util.ArrayList<StringFilter>(ec2InstanceSubnetId);
    }

    /**
     * <p>
     * Details of the Amazon EC2 instance subnet IDs used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2InstanceSubnetId(java.util.Collection)} or {@link #withEc2InstanceSubnetId(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param ec2InstanceSubnetId
     *        Details of the Amazon EC2 instance subnet IDs used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEc2InstanceSubnetId(StringFilter... ec2InstanceSubnetId) {
        if (this.ec2InstanceSubnetId == null) {
            setEc2InstanceSubnetId(new java.util.ArrayList<StringFilter>(ec2InstanceSubnetId.length));
        }
        for (StringFilter ele : ec2InstanceSubnetId) {
            this.ec2InstanceSubnetId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of the Amazon EC2 instance subnet IDs used to filter findings.
     * </p>
     * 
     * @param ec2InstanceSubnetId
     *        Details of the Amazon EC2 instance subnet IDs used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEc2InstanceSubnetId(java.util.Collection<StringFilter> ec2InstanceSubnetId) {
        setEc2InstanceSubnetId(ec2InstanceSubnetId);
        return this;
    }

    /**
     * <p>
     * Details of the Amazon EC2 instance VPC IDs used to filter findings.
     * </p>
     * 
     * @return Details of the Amazon EC2 instance VPC IDs used to filter findings.
     */

    public java.util.List<StringFilter> getEc2InstanceVpcId() {
        return ec2InstanceVpcId;
    }

    /**
     * <p>
     * Details of the Amazon EC2 instance VPC IDs used to filter findings.
     * </p>
     * 
     * @param ec2InstanceVpcId
     *        Details of the Amazon EC2 instance VPC IDs used to filter findings.
     */

    public void setEc2InstanceVpcId(java.util.Collection<StringFilter> ec2InstanceVpcId) {
        if (ec2InstanceVpcId == null) {
            this.ec2InstanceVpcId = null;
            return;
        }

        this.ec2InstanceVpcId = new java.util.ArrayList<StringFilter>(ec2InstanceVpcId);
    }

    /**
     * <p>
     * Details of the Amazon EC2 instance VPC IDs used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2InstanceVpcId(java.util.Collection)} or {@link #withEc2InstanceVpcId(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ec2InstanceVpcId
     *        Details of the Amazon EC2 instance VPC IDs used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEc2InstanceVpcId(StringFilter... ec2InstanceVpcId) {
        if (this.ec2InstanceVpcId == null) {
            setEc2InstanceVpcId(new java.util.ArrayList<StringFilter>(ec2InstanceVpcId.length));
        }
        for (StringFilter ele : ec2InstanceVpcId) {
            this.ec2InstanceVpcId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of the Amazon EC2 instance VPC IDs used to filter findings.
     * </p>
     * 
     * @param ec2InstanceVpcId
     *        Details of the Amazon EC2 instance VPC IDs used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEc2InstanceVpcId(java.util.Collection<StringFilter> ec2InstanceVpcId) {
        setEc2InstanceVpcId(ec2InstanceVpcId);
        return this;
    }

    /**
     * <p>
     * Details of the Amazon ECR image architecture types used to filter findings.
     * </p>
     * 
     * @return Details of the Amazon ECR image architecture types used to filter findings.
     */

    public java.util.List<StringFilter> getEcrImageArchitecture() {
        return ecrImageArchitecture;
    }

    /**
     * <p>
     * Details of the Amazon ECR image architecture types used to filter findings.
     * </p>
     * 
     * @param ecrImageArchitecture
     *        Details of the Amazon ECR image architecture types used to filter findings.
     */

    public void setEcrImageArchitecture(java.util.Collection<StringFilter> ecrImageArchitecture) {
        if (ecrImageArchitecture == null) {
            this.ecrImageArchitecture = null;
            return;
        }

        this.ecrImageArchitecture = new java.util.ArrayList<StringFilter>(ecrImageArchitecture);
    }

    /**
     * <p>
     * Details of the Amazon ECR image architecture types used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEcrImageArchitecture(java.util.Collection)} or {@link #withEcrImageArchitecture(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param ecrImageArchitecture
     *        Details of the Amazon ECR image architecture types used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEcrImageArchitecture(StringFilter... ecrImageArchitecture) {
        if (this.ecrImageArchitecture == null) {
            setEcrImageArchitecture(new java.util.ArrayList<StringFilter>(ecrImageArchitecture.length));
        }
        for (StringFilter ele : ecrImageArchitecture) {
            this.ecrImageArchitecture.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of the Amazon ECR image architecture types used to filter findings.
     * </p>
     * 
     * @param ecrImageArchitecture
     *        Details of the Amazon ECR image architecture types used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEcrImageArchitecture(java.util.Collection<StringFilter> ecrImageArchitecture) {
        setEcrImageArchitecture(ecrImageArchitecture);
        return this;
    }

    /**
     * <p>
     * Details of the Amazon ECR image hashes used to filter findings.
     * </p>
     * 
     * @return Details of the Amazon ECR image hashes used to filter findings.
     */

    public java.util.List<StringFilter> getEcrImageHash() {
        return ecrImageHash;
    }

    /**
     * <p>
     * Details of the Amazon ECR image hashes used to filter findings.
     * </p>
     * 
     * @param ecrImageHash
     *        Details of the Amazon ECR image hashes used to filter findings.
     */

    public void setEcrImageHash(java.util.Collection<StringFilter> ecrImageHash) {
        if (ecrImageHash == null) {
            this.ecrImageHash = null;
            return;
        }

        this.ecrImageHash = new java.util.ArrayList<StringFilter>(ecrImageHash);
    }

    /**
     * <p>
     * Details of the Amazon ECR image hashes used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEcrImageHash(java.util.Collection)} or {@link #withEcrImageHash(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ecrImageHash
     *        Details of the Amazon ECR image hashes used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEcrImageHash(StringFilter... ecrImageHash) {
        if (this.ecrImageHash == null) {
            setEcrImageHash(new java.util.ArrayList<StringFilter>(ecrImageHash.length));
        }
        for (StringFilter ele : ecrImageHash) {
            this.ecrImageHash.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of the Amazon ECR image hashes used to filter findings.
     * </p>
     * 
     * @param ecrImageHash
     *        Details of the Amazon ECR image hashes used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEcrImageHash(java.util.Collection<StringFilter> ecrImageHash) {
        setEcrImageHash(ecrImageHash);
        return this;
    }

    /**
     * <p>
     * Details on the Amazon ECR image push date and time used to filter findings.
     * </p>
     * 
     * @return Details on the Amazon ECR image push date and time used to filter findings.
     */

    public java.util.List<DateFilter> getEcrImagePushedAt() {
        return ecrImagePushedAt;
    }

    /**
     * <p>
     * Details on the Amazon ECR image push date and time used to filter findings.
     * </p>
     * 
     * @param ecrImagePushedAt
     *        Details on the Amazon ECR image push date and time used to filter findings.
     */

    public void setEcrImagePushedAt(java.util.Collection<DateFilter> ecrImagePushedAt) {
        if (ecrImagePushedAt == null) {
            this.ecrImagePushedAt = null;
            return;
        }

        this.ecrImagePushedAt = new java.util.ArrayList<DateFilter>(ecrImagePushedAt);
    }

    /**
     * <p>
     * Details on the Amazon ECR image push date and time used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEcrImagePushedAt(java.util.Collection)} or {@link #withEcrImagePushedAt(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ecrImagePushedAt
     *        Details on the Amazon ECR image push date and time used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEcrImagePushedAt(DateFilter... ecrImagePushedAt) {
        if (this.ecrImagePushedAt == null) {
            setEcrImagePushedAt(new java.util.ArrayList<DateFilter>(ecrImagePushedAt.length));
        }
        for (DateFilter ele : ecrImagePushedAt) {
            this.ecrImagePushedAt.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the Amazon ECR image push date and time used to filter findings.
     * </p>
     * 
     * @param ecrImagePushedAt
     *        Details on the Amazon ECR image push date and time used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEcrImagePushedAt(java.util.Collection<DateFilter> ecrImagePushedAt) {
        setEcrImagePushedAt(ecrImagePushedAt);
        return this;
    }

    /**
     * <p>
     * Details on the Amazon ECR registry used to filter findings.
     * </p>
     * 
     * @return Details on the Amazon ECR registry used to filter findings.
     */

    public java.util.List<StringFilter> getEcrImageRegistry() {
        return ecrImageRegistry;
    }

    /**
     * <p>
     * Details on the Amazon ECR registry used to filter findings.
     * </p>
     * 
     * @param ecrImageRegistry
     *        Details on the Amazon ECR registry used to filter findings.
     */

    public void setEcrImageRegistry(java.util.Collection<StringFilter> ecrImageRegistry) {
        if (ecrImageRegistry == null) {
            this.ecrImageRegistry = null;
            return;
        }

        this.ecrImageRegistry = new java.util.ArrayList<StringFilter>(ecrImageRegistry);
    }

    /**
     * <p>
     * Details on the Amazon ECR registry used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEcrImageRegistry(java.util.Collection)} or {@link #withEcrImageRegistry(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ecrImageRegistry
     *        Details on the Amazon ECR registry used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEcrImageRegistry(StringFilter... ecrImageRegistry) {
        if (this.ecrImageRegistry == null) {
            setEcrImageRegistry(new java.util.ArrayList<StringFilter>(ecrImageRegistry.length));
        }
        for (StringFilter ele : ecrImageRegistry) {
            this.ecrImageRegistry.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the Amazon ECR registry used to filter findings.
     * </p>
     * 
     * @param ecrImageRegistry
     *        Details on the Amazon ECR registry used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEcrImageRegistry(java.util.Collection<StringFilter> ecrImageRegistry) {
        setEcrImageRegistry(ecrImageRegistry);
        return this;
    }

    /**
     * <p>
     * Details on the name of the Amazon ECR repository used to filter findings.
     * </p>
     * 
     * @return Details on the name of the Amazon ECR repository used to filter findings.
     */

    public java.util.List<StringFilter> getEcrImageRepositoryName() {
        return ecrImageRepositoryName;
    }

    /**
     * <p>
     * Details on the name of the Amazon ECR repository used to filter findings.
     * </p>
     * 
     * @param ecrImageRepositoryName
     *        Details on the name of the Amazon ECR repository used to filter findings.
     */

    public void setEcrImageRepositoryName(java.util.Collection<StringFilter> ecrImageRepositoryName) {
        if (ecrImageRepositoryName == null) {
            this.ecrImageRepositoryName = null;
            return;
        }

        this.ecrImageRepositoryName = new java.util.ArrayList<StringFilter>(ecrImageRepositoryName);
    }

    /**
     * <p>
     * Details on the name of the Amazon ECR repository used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEcrImageRepositoryName(java.util.Collection)} or
     * {@link #withEcrImageRepositoryName(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param ecrImageRepositoryName
     *        Details on the name of the Amazon ECR repository used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEcrImageRepositoryName(StringFilter... ecrImageRepositoryName) {
        if (this.ecrImageRepositoryName == null) {
            setEcrImageRepositoryName(new java.util.ArrayList<StringFilter>(ecrImageRepositoryName.length));
        }
        for (StringFilter ele : ecrImageRepositoryName) {
            this.ecrImageRepositoryName.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the name of the Amazon ECR repository used to filter findings.
     * </p>
     * 
     * @param ecrImageRepositoryName
     *        Details on the name of the Amazon ECR repository used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEcrImageRepositoryName(java.util.Collection<StringFilter> ecrImageRepositoryName) {
        setEcrImageRepositoryName(ecrImageRepositoryName);
        return this;
    }

    /**
     * <p>
     * The tags attached to the Amazon ECR container image.
     * </p>
     * 
     * @return The tags attached to the Amazon ECR container image.
     */

    public java.util.List<StringFilter> getEcrImageTags() {
        return ecrImageTags;
    }

    /**
     * <p>
     * The tags attached to the Amazon ECR container image.
     * </p>
     * 
     * @param ecrImageTags
     *        The tags attached to the Amazon ECR container image.
     */

    public void setEcrImageTags(java.util.Collection<StringFilter> ecrImageTags) {
        if (ecrImageTags == null) {
            this.ecrImageTags = null;
            return;
        }

        this.ecrImageTags = new java.util.ArrayList<StringFilter>(ecrImageTags);
    }

    /**
     * <p>
     * The tags attached to the Amazon ECR container image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEcrImageTags(java.util.Collection)} or {@link #withEcrImageTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ecrImageTags
     *        The tags attached to the Amazon ECR container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEcrImageTags(StringFilter... ecrImageTags) {
        if (this.ecrImageTags == null) {
            setEcrImageTags(new java.util.ArrayList<StringFilter>(ecrImageTags.length));
        }
        for (StringFilter ele : ecrImageTags) {
            this.ecrImageTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags attached to the Amazon ECR container image.
     * </p>
     * 
     * @param ecrImageTags
     *        The tags attached to the Amazon ECR container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withEcrImageTags(java.util.Collection<StringFilter> ecrImageTags) {
        setEcrImageTags(ecrImageTags);
        return this;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda findings by the availability of exploits.
     * </p>
     * 
     * @return Filters the list of AWS Lambda findings by the availability of exploits.
     */

    public java.util.List<StringFilter> getExploitAvailable() {
        return exploitAvailable;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda findings by the availability of exploits.
     * </p>
     * 
     * @param exploitAvailable
     *        Filters the list of AWS Lambda findings by the availability of exploits.
     */

    public void setExploitAvailable(java.util.Collection<StringFilter> exploitAvailable) {
        if (exploitAvailable == null) {
            this.exploitAvailable = null;
            return;
        }

        this.exploitAvailable = new java.util.ArrayList<StringFilter>(exploitAvailable);
    }

    /**
     * <p>
     * Filters the list of AWS Lambda findings by the availability of exploits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExploitAvailable(java.util.Collection)} or {@link #withExploitAvailable(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param exploitAvailable
     *        Filters the list of AWS Lambda findings by the availability of exploits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withExploitAvailable(StringFilter... exploitAvailable) {
        if (this.exploitAvailable == null) {
            setExploitAvailable(new java.util.ArrayList<StringFilter>(exploitAvailable.length));
        }
        for (StringFilter ele : exploitAvailable) {
            this.exploitAvailable.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda findings by the availability of exploits.
     * </p>
     * 
     * @param exploitAvailable
     *        Filters the list of AWS Lambda findings by the availability of exploits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withExploitAvailable(java.util.Collection<StringFilter> exploitAvailable) {
        setExploitAvailable(exploitAvailable);
        return this;
    }

    /**
     * <p>
     * Details on the finding ARNs used to filter findings.
     * </p>
     * 
     * @return Details on the finding ARNs used to filter findings.
     */

    public java.util.List<StringFilter> getFindingArn() {
        return findingArn;
    }

    /**
     * <p>
     * Details on the finding ARNs used to filter findings.
     * </p>
     * 
     * @param findingArn
     *        Details on the finding ARNs used to filter findings.
     */

    public void setFindingArn(java.util.Collection<StringFilter> findingArn) {
        if (findingArn == null) {
            this.findingArn = null;
            return;
        }

        this.findingArn = new java.util.ArrayList<StringFilter>(findingArn);
    }

    /**
     * <p>
     * Details on the finding ARNs used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingArn(java.util.Collection)} or {@link #withFindingArn(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param findingArn
     *        Details on the finding ARNs used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withFindingArn(StringFilter... findingArn) {
        if (this.findingArn == null) {
            setFindingArn(new java.util.ArrayList<StringFilter>(findingArn.length));
        }
        for (StringFilter ele : findingArn) {
            this.findingArn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the finding ARNs used to filter findings.
     * </p>
     * 
     * @param findingArn
     *        Details on the finding ARNs used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withFindingArn(java.util.Collection<StringFilter> findingArn) {
        setFindingArn(findingArn);
        return this;
    }

    /**
     * <p>
     * Details on the finding status types used to filter findings.
     * </p>
     * 
     * @return Details on the finding status types used to filter findings.
     */

    public java.util.List<StringFilter> getFindingStatus() {
        return findingStatus;
    }

    /**
     * <p>
     * Details on the finding status types used to filter findings.
     * </p>
     * 
     * @param findingStatus
     *        Details on the finding status types used to filter findings.
     */

    public void setFindingStatus(java.util.Collection<StringFilter> findingStatus) {
        if (findingStatus == null) {
            this.findingStatus = null;
            return;
        }

        this.findingStatus = new java.util.ArrayList<StringFilter>(findingStatus);
    }

    /**
     * <p>
     * Details on the finding status types used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingStatus(java.util.Collection)} or {@link #withFindingStatus(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param findingStatus
     *        Details on the finding status types used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withFindingStatus(StringFilter... findingStatus) {
        if (this.findingStatus == null) {
            setFindingStatus(new java.util.ArrayList<StringFilter>(findingStatus.length));
        }
        for (StringFilter ele : findingStatus) {
            this.findingStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the finding status types used to filter findings.
     * </p>
     * 
     * @param findingStatus
     *        Details on the finding status types used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withFindingStatus(java.util.Collection<StringFilter> findingStatus) {
        setFindingStatus(findingStatus);
        return this;
    }

    /**
     * <p>
     * Details on the finding types used to filter findings.
     * </p>
     * 
     * @return Details on the finding types used to filter findings.
     */

    public java.util.List<StringFilter> getFindingType() {
        return findingType;
    }

    /**
     * <p>
     * Details on the finding types used to filter findings.
     * </p>
     * 
     * @param findingType
     *        Details on the finding types used to filter findings.
     */

    public void setFindingType(java.util.Collection<StringFilter> findingType) {
        if (findingType == null) {
            this.findingType = null;
            return;
        }

        this.findingType = new java.util.ArrayList<StringFilter>(findingType);
    }

    /**
     * <p>
     * Details on the finding types used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingType(java.util.Collection)} or {@link #withFindingType(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param findingType
     *        Details on the finding types used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withFindingType(StringFilter... findingType) {
        if (this.findingType == null) {
            setFindingType(new java.util.ArrayList<StringFilter>(findingType.length));
        }
        for (StringFilter ele : findingType) {
            this.findingType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the finding types used to filter findings.
     * </p>
     * 
     * @param findingType
     *        Details on the finding types used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withFindingType(java.util.Collection<StringFilter> findingType) {
        setFindingType(findingType);
        return this;
    }

    /**
     * <p>
     * Details on the date and time a finding was first seen used to filter findings.
     * </p>
     * 
     * @return Details on the date and time a finding was first seen used to filter findings.
     */

    public java.util.List<DateFilter> getFirstObservedAt() {
        return firstObservedAt;
    }

    /**
     * <p>
     * Details on the date and time a finding was first seen used to filter findings.
     * </p>
     * 
     * @param firstObservedAt
     *        Details on the date and time a finding was first seen used to filter findings.
     */

    public void setFirstObservedAt(java.util.Collection<DateFilter> firstObservedAt) {
        if (firstObservedAt == null) {
            this.firstObservedAt = null;
            return;
        }

        this.firstObservedAt = new java.util.ArrayList<DateFilter>(firstObservedAt);
    }

    /**
     * <p>
     * Details on the date and time a finding was first seen used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFirstObservedAt(java.util.Collection)} or {@link #withFirstObservedAt(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param firstObservedAt
     *        Details on the date and time a finding was first seen used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withFirstObservedAt(DateFilter... firstObservedAt) {
        if (this.firstObservedAt == null) {
            setFirstObservedAt(new java.util.ArrayList<DateFilter>(firstObservedAt.length));
        }
        for (DateFilter ele : firstObservedAt) {
            this.firstObservedAt.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the date and time a finding was first seen used to filter findings.
     * </p>
     * 
     * @param firstObservedAt
     *        Details on the date and time a finding was first seen used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withFirstObservedAt(java.util.Collection<DateFilter> firstObservedAt) {
        setFirstObservedAt(firstObservedAt);
        return this;
    }

    /**
     * <p>
     * Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     * <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     * packages identified in the finding have fixes available through updated versions.
     * </p>
     * 
     * @return Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     *         <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     *         packages identified in the finding have fixes available through updated versions.
     */

    public java.util.List<StringFilter> getFixAvailable() {
        return fixAvailable;
    }

    /**
     * <p>
     * Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     * <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     * packages identified in the finding have fixes available through updated versions.
     * </p>
     * 
     * @param fixAvailable
     *        Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     *        <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     *        packages identified in the finding have fixes available through updated versions.
     */

    public void setFixAvailable(java.util.Collection<StringFilter> fixAvailable) {
        if (fixAvailable == null) {
            this.fixAvailable = null;
            return;
        }

        this.fixAvailable = new java.util.ArrayList<StringFilter>(fixAvailable);
    }

    /**
     * <p>
     * Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     * <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     * packages identified in the finding have fixes available through updated versions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFixAvailable(java.util.Collection)} or {@link #withFixAvailable(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fixAvailable
     *        Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     *        <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     *        packages identified in the finding have fixes available through updated versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withFixAvailable(StringFilter... fixAvailable) {
        if (this.fixAvailable == null) {
            setFixAvailable(new java.util.ArrayList<StringFilter>(fixAvailable.length));
        }
        for (StringFilter ele : fixAvailable) {
            this.fixAvailable.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     * <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     * packages identified in the finding have fixes available through updated versions.
     * </p>
     * 
     * @param fixAvailable
     *        Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     *        <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     *        packages identified in the finding have fixes available through updated versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withFixAvailable(java.util.Collection<StringFilter> fixAvailable) {
        setFixAvailable(fixAvailable);
        return this;
    }

    /**
     * <p>
     * The Amazon Inspector score to filter on.
     * </p>
     * 
     * @return The Amazon Inspector score to filter on.
     */

    public java.util.List<NumberFilter> getInspectorScore() {
        return inspectorScore;
    }

    /**
     * <p>
     * The Amazon Inspector score to filter on.
     * </p>
     * 
     * @param inspectorScore
     *        The Amazon Inspector score to filter on.
     */

    public void setInspectorScore(java.util.Collection<NumberFilter> inspectorScore) {
        if (inspectorScore == null) {
            this.inspectorScore = null;
            return;
        }

        this.inspectorScore = new java.util.ArrayList<NumberFilter>(inspectorScore);
    }

    /**
     * <p>
     * The Amazon Inspector score to filter on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInspectorScore(java.util.Collection)} or {@link #withInspectorScore(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inspectorScore
     *        The Amazon Inspector score to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withInspectorScore(NumberFilter... inspectorScore) {
        if (this.inspectorScore == null) {
            setInspectorScore(new java.util.ArrayList<NumberFilter>(inspectorScore.length));
        }
        for (NumberFilter ele : inspectorScore) {
            this.inspectorScore.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Inspector score to filter on.
     * </p>
     * 
     * @param inspectorScore
     *        The Amazon Inspector score to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withInspectorScore(java.util.Collection<NumberFilter> inspectorScore) {
        setInspectorScore(inspectorScore);
        return this;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by execution role.
     * </p>
     * 
     * @return Filters the list of AWS Lambda functions by execution role.
     */

    public java.util.List<StringFilter> getLambdaFunctionExecutionRoleArn() {
        return lambdaFunctionExecutionRoleArn;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by execution role.
     * </p>
     * 
     * @param lambdaFunctionExecutionRoleArn
     *        Filters the list of AWS Lambda functions by execution role.
     */

    public void setLambdaFunctionExecutionRoleArn(java.util.Collection<StringFilter> lambdaFunctionExecutionRoleArn) {
        if (lambdaFunctionExecutionRoleArn == null) {
            this.lambdaFunctionExecutionRoleArn = null;
            return;
        }

        this.lambdaFunctionExecutionRoleArn = new java.util.ArrayList<StringFilter>(lambdaFunctionExecutionRoleArn);
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by execution role.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLambdaFunctionExecutionRoleArn(java.util.Collection)} or
     * {@link #withLambdaFunctionExecutionRoleArn(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lambdaFunctionExecutionRoleArn
     *        Filters the list of AWS Lambda functions by execution role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withLambdaFunctionExecutionRoleArn(StringFilter... lambdaFunctionExecutionRoleArn) {
        if (this.lambdaFunctionExecutionRoleArn == null) {
            setLambdaFunctionExecutionRoleArn(new java.util.ArrayList<StringFilter>(lambdaFunctionExecutionRoleArn.length));
        }
        for (StringFilter ele : lambdaFunctionExecutionRoleArn) {
            this.lambdaFunctionExecutionRoleArn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by execution role.
     * </p>
     * 
     * @param lambdaFunctionExecutionRoleArn
     *        Filters the list of AWS Lambda functions by execution role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withLambdaFunctionExecutionRoleArn(java.util.Collection<StringFilter> lambdaFunctionExecutionRoleArn) {
        setLambdaFunctionExecutionRoleArn(lambdaFunctionExecutionRoleArn);
        return this;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the date and time that a user last updated the configuration, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     * </p>
     * 
     * @return Filters the list of AWS Lambda functions by the date and time that a user last updated the configuration,
     *         in <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     */

    public java.util.List<DateFilter> getLambdaFunctionLastModifiedAt() {
        return lambdaFunctionLastModifiedAt;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the date and time that a user last updated the configuration, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     * </p>
     * 
     * @param lambdaFunctionLastModifiedAt
     *        Filters the list of AWS Lambda functions by the date and time that a user last updated the configuration,
     *        in <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     */

    public void setLambdaFunctionLastModifiedAt(java.util.Collection<DateFilter> lambdaFunctionLastModifiedAt) {
        if (lambdaFunctionLastModifiedAt == null) {
            this.lambdaFunctionLastModifiedAt = null;
            return;
        }

        this.lambdaFunctionLastModifiedAt = new java.util.ArrayList<DateFilter>(lambdaFunctionLastModifiedAt);
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the date and time that a user last updated the configuration, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLambdaFunctionLastModifiedAt(java.util.Collection)} or
     * {@link #withLambdaFunctionLastModifiedAt(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lambdaFunctionLastModifiedAt
     *        Filters the list of AWS Lambda functions by the date and time that a user last updated the configuration,
     *        in <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withLambdaFunctionLastModifiedAt(DateFilter... lambdaFunctionLastModifiedAt) {
        if (this.lambdaFunctionLastModifiedAt == null) {
            setLambdaFunctionLastModifiedAt(new java.util.ArrayList<DateFilter>(lambdaFunctionLastModifiedAt.length));
        }
        for (DateFilter ele : lambdaFunctionLastModifiedAt) {
            this.lambdaFunctionLastModifiedAt.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the date and time that a user last updated the configuration, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     * </p>
     * 
     * @param lambdaFunctionLastModifiedAt
     *        Filters the list of AWS Lambda functions by the date and time that a user last updated the configuration,
     *        in <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601 format</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withLambdaFunctionLastModifiedAt(java.util.Collection<DateFilter> lambdaFunctionLastModifiedAt) {
        setLambdaFunctionLastModifiedAt(lambdaFunctionLastModifiedAt);
        return this;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the function's <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>. A Lambda function can
     * have up to five layers.
     * </p>
     * 
     * @return Filters the list of AWS Lambda functions by the function's <a
     *         href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>. A Lambda
     *         function can have up to five layers.
     */

    public java.util.List<StringFilter> getLambdaFunctionLayers() {
        return lambdaFunctionLayers;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the function's <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>. A Lambda function can
     * have up to five layers.
     * </p>
     * 
     * @param lambdaFunctionLayers
     *        Filters the list of AWS Lambda functions by the function's <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>. A Lambda
     *        function can have up to five layers.
     */

    public void setLambdaFunctionLayers(java.util.Collection<StringFilter> lambdaFunctionLayers) {
        if (lambdaFunctionLayers == null) {
            this.lambdaFunctionLayers = null;
            return;
        }

        this.lambdaFunctionLayers = new java.util.ArrayList<StringFilter>(lambdaFunctionLayers);
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the function's <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>. A Lambda function can
     * have up to five layers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLambdaFunctionLayers(java.util.Collection)} or {@link #withLambdaFunctionLayers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param lambdaFunctionLayers
     *        Filters the list of AWS Lambda functions by the function's <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>. A Lambda
     *        function can have up to five layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withLambdaFunctionLayers(StringFilter... lambdaFunctionLayers) {
        if (this.lambdaFunctionLayers == null) {
            setLambdaFunctionLayers(new java.util.ArrayList<StringFilter>(lambdaFunctionLayers.length));
        }
        for (StringFilter ele : lambdaFunctionLayers) {
            this.lambdaFunctionLayers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the function's <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>. A Lambda function can
     * have up to five layers.
     * </p>
     * 
     * @param lambdaFunctionLayers
     *        Filters the list of AWS Lambda functions by the function's <a
     *        href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html"> layers</a>. A Lambda
     *        function can have up to five layers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withLambdaFunctionLayers(java.util.Collection<StringFilter> lambdaFunctionLayers) {
        setLambdaFunctionLayers(lambdaFunctionLayers);
        return this;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the name of the function.
     * </p>
     * 
     * @return Filters the list of AWS Lambda functions by the name of the function.
     */

    public java.util.List<StringFilter> getLambdaFunctionName() {
        return lambdaFunctionName;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the name of the function.
     * </p>
     * 
     * @param lambdaFunctionName
     *        Filters the list of AWS Lambda functions by the name of the function.
     */

    public void setLambdaFunctionName(java.util.Collection<StringFilter> lambdaFunctionName) {
        if (lambdaFunctionName == null) {
            this.lambdaFunctionName = null;
            return;
        }

        this.lambdaFunctionName = new java.util.ArrayList<StringFilter>(lambdaFunctionName);
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the name of the function.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLambdaFunctionName(java.util.Collection)} or {@link #withLambdaFunctionName(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param lambdaFunctionName
     *        Filters the list of AWS Lambda functions by the name of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withLambdaFunctionName(StringFilter... lambdaFunctionName) {
        if (this.lambdaFunctionName == null) {
            setLambdaFunctionName(new java.util.ArrayList<StringFilter>(lambdaFunctionName.length));
        }
        for (StringFilter ele : lambdaFunctionName) {
            this.lambdaFunctionName.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the name of the function.
     * </p>
     * 
     * @param lambdaFunctionName
     *        Filters the list of AWS Lambda functions by the name of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withLambdaFunctionName(java.util.Collection<StringFilter> lambdaFunctionName) {
        setLambdaFunctionName(lambdaFunctionName);
        return this;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the runtime environment for the Lambda function.
     * </p>
     * 
     * @return Filters the list of AWS Lambda functions by the runtime environment for the Lambda function.
     */

    public java.util.List<StringFilter> getLambdaFunctionRuntime() {
        return lambdaFunctionRuntime;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the runtime environment for the Lambda function.
     * </p>
     * 
     * @param lambdaFunctionRuntime
     *        Filters the list of AWS Lambda functions by the runtime environment for the Lambda function.
     */

    public void setLambdaFunctionRuntime(java.util.Collection<StringFilter> lambdaFunctionRuntime) {
        if (lambdaFunctionRuntime == null) {
            this.lambdaFunctionRuntime = null;
            return;
        }

        this.lambdaFunctionRuntime = new java.util.ArrayList<StringFilter>(lambdaFunctionRuntime);
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the runtime environment for the Lambda function.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLambdaFunctionRuntime(java.util.Collection)} or
     * {@link #withLambdaFunctionRuntime(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param lambdaFunctionRuntime
     *        Filters the list of AWS Lambda functions by the runtime environment for the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withLambdaFunctionRuntime(StringFilter... lambdaFunctionRuntime) {
        if (this.lambdaFunctionRuntime == null) {
            setLambdaFunctionRuntime(new java.util.ArrayList<StringFilter>(lambdaFunctionRuntime.length));
        }
        for (StringFilter ele : lambdaFunctionRuntime) {
            this.lambdaFunctionRuntime.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the list of AWS Lambda functions by the runtime environment for the Lambda function.
     * </p>
     * 
     * @param lambdaFunctionRuntime
     *        Filters the list of AWS Lambda functions by the runtime environment for the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withLambdaFunctionRuntime(java.util.Collection<StringFilter> lambdaFunctionRuntime) {
        setLambdaFunctionRuntime(lambdaFunctionRuntime);
        return this;
    }

    /**
     * <p>
     * Details on the date and time a finding was last seen used to filter findings.
     * </p>
     * 
     * @return Details on the date and time a finding was last seen used to filter findings.
     */

    public java.util.List<DateFilter> getLastObservedAt() {
        return lastObservedAt;
    }

    /**
     * <p>
     * Details on the date and time a finding was last seen used to filter findings.
     * </p>
     * 
     * @param lastObservedAt
     *        Details on the date and time a finding was last seen used to filter findings.
     */

    public void setLastObservedAt(java.util.Collection<DateFilter> lastObservedAt) {
        if (lastObservedAt == null) {
            this.lastObservedAt = null;
            return;
        }

        this.lastObservedAt = new java.util.ArrayList<DateFilter>(lastObservedAt);
    }

    /**
     * <p>
     * Details on the date and time a finding was last seen used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLastObservedAt(java.util.Collection)} or {@link #withLastObservedAt(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param lastObservedAt
     *        Details on the date and time a finding was last seen used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withLastObservedAt(DateFilter... lastObservedAt) {
        if (this.lastObservedAt == null) {
            setLastObservedAt(new java.util.ArrayList<DateFilter>(lastObservedAt.length));
        }
        for (DateFilter ele : lastObservedAt) {
            this.lastObservedAt.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the date and time a finding was last seen used to filter findings.
     * </p>
     * 
     * @param lastObservedAt
     *        Details on the date and time a finding was last seen used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withLastObservedAt(java.util.Collection<DateFilter> lastObservedAt) {
        setLastObservedAt(lastObservedAt);
        return this;
    }

    /**
     * <p>
     * Details on the ingress source addresses used to filter findings.
     * </p>
     * 
     * @return Details on the ingress source addresses used to filter findings.
     */

    public java.util.List<StringFilter> getNetworkProtocol() {
        return networkProtocol;
    }

    /**
     * <p>
     * Details on the ingress source addresses used to filter findings.
     * </p>
     * 
     * @param networkProtocol
     *        Details on the ingress source addresses used to filter findings.
     */

    public void setNetworkProtocol(java.util.Collection<StringFilter> networkProtocol) {
        if (networkProtocol == null) {
            this.networkProtocol = null;
            return;
        }

        this.networkProtocol = new java.util.ArrayList<StringFilter>(networkProtocol);
    }

    /**
     * <p>
     * Details on the ingress source addresses used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkProtocol(java.util.Collection)} or {@link #withNetworkProtocol(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param networkProtocol
     *        Details on the ingress source addresses used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withNetworkProtocol(StringFilter... networkProtocol) {
        if (this.networkProtocol == null) {
            setNetworkProtocol(new java.util.ArrayList<StringFilter>(networkProtocol.length));
        }
        for (StringFilter ele : networkProtocol) {
            this.networkProtocol.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the ingress source addresses used to filter findings.
     * </p>
     * 
     * @param networkProtocol
     *        Details on the ingress source addresses used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withNetworkProtocol(java.util.Collection<StringFilter> networkProtocol) {
        setNetworkProtocol(networkProtocol);
        return this;
    }

    /**
     * <p>
     * Details on the port ranges used to filter findings.
     * </p>
     * 
     * @return Details on the port ranges used to filter findings.
     */

    public java.util.List<PortRangeFilter> getPortRange() {
        return portRange;
    }

    /**
     * <p>
     * Details on the port ranges used to filter findings.
     * </p>
     * 
     * @param portRange
     *        Details on the port ranges used to filter findings.
     */

    public void setPortRange(java.util.Collection<PortRangeFilter> portRange) {
        if (portRange == null) {
            this.portRange = null;
            return;
        }

        this.portRange = new java.util.ArrayList<PortRangeFilter>(portRange);
    }

    /**
     * <p>
     * Details on the port ranges used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPortRange(java.util.Collection)} or {@link #withPortRange(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param portRange
     *        Details on the port ranges used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withPortRange(PortRangeFilter... portRange) {
        if (this.portRange == null) {
            setPortRange(new java.util.ArrayList<PortRangeFilter>(portRange.length));
        }
        for (PortRangeFilter ele : portRange) {
            this.portRange.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the port ranges used to filter findings.
     * </p>
     * 
     * @param portRange
     *        Details on the port ranges used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withPortRange(java.util.Collection<PortRangeFilter> portRange) {
        setPortRange(portRange);
        return this;
    }

    /**
     * <p>
     * Details on the related vulnerabilities used to filter findings.
     * </p>
     * 
     * @return Details on the related vulnerabilities used to filter findings.
     */

    public java.util.List<StringFilter> getRelatedVulnerabilities() {
        return relatedVulnerabilities;
    }

    /**
     * <p>
     * Details on the related vulnerabilities used to filter findings.
     * </p>
     * 
     * @param relatedVulnerabilities
     *        Details on the related vulnerabilities used to filter findings.
     */

    public void setRelatedVulnerabilities(java.util.Collection<StringFilter> relatedVulnerabilities) {
        if (relatedVulnerabilities == null) {
            this.relatedVulnerabilities = null;
            return;
        }

        this.relatedVulnerabilities = new java.util.ArrayList<StringFilter>(relatedVulnerabilities);
    }

    /**
     * <p>
     * Details on the related vulnerabilities used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedVulnerabilities(java.util.Collection)} or
     * {@link #withRelatedVulnerabilities(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param relatedVulnerabilities
     *        Details on the related vulnerabilities used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withRelatedVulnerabilities(StringFilter... relatedVulnerabilities) {
        if (this.relatedVulnerabilities == null) {
            setRelatedVulnerabilities(new java.util.ArrayList<StringFilter>(relatedVulnerabilities.length));
        }
        for (StringFilter ele : relatedVulnerabilities) {
            this.relatedVulnerabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the related vulnerabilities used to filter findings.
     * </p>
     * 
     * @param relatedVulnerabilities
     *        Details on the related vulnerabilities used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withRelatedVulnerabilities(java.util.Collection<StringFilter> relatedVulnerabilities) {
        setRelatedVulnerabilities(relatedVulnerabilities);
        return this;
    }

    /**
     * <p>
     * Details on the resource IDs used to filter findings.
     * </p>
     * 
     * @return Details on the resource IDs used to filter findings.
     */

    public java.util.List<StringFilter> getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * Details on the resource IDs used to filter findings.
     * </p>
     * 
     * @param resourceId
     *        Details on the resource IDs used to filter findings.
     */

    public void setResourceId(java.util.Collection<StringFilter> resourceId) {
        if (resourceId == null) {
            this.resourceId = null;
            return;
        }

        this.resourceId = new java.util.ArrayList<StringFilter>(resourceId);
    }

    /**
     * <p>
     * Details on the resource IDs used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceId(java.util.Collection)} or {@link #withResourceId(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceId
     *        Details on the resource IDs used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withResourceId(StringFilter... resourceId) {
        if (this.resourceId == null) {
            setResourceId(new java.util.ArrayList<StringFilter>(resourceId.length));
        }
        for (StringFilter ele : resourceId) {
            this.resourceId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the resource IDs used to filter findings.
     * </p>
     * 
     * @param resourceId
     *        Details on the resource IDs used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withResourceId(java.util.Collection<StringFilter> resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Details on the resource tags used to filter findings.
     * </p>
     * 
     * @return Details on the resource tags used to filter findings.
     */

    public java.util.List<MapFilter> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * Details on the resource tags used to filter findings.
     * </p>
     * 
     * @param resourceTags
     *        Details on the resource tags used to filter findings.
     */

    public void setResourceTags(java.util.Collection<MapFilter> resourceTags) {
        if (resourceTags == null) {
            this.resourceTags = null;
            return;
        }

        this.resourceTags = new java.util.ArrayList<MapFilter>(resourceTags);
    }

    /**
     * <p>
     * Details on the resource tags used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        Details on the resource tags used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withResourceTags(MapFilter... resourceTags) {
        if (this.resourceTags == null) {
            setResourceTags(new java.util.ArrayList<MapFilter>(resourceTags.length));
        }
        for (MapFilter ele : resourceTags) {
            this.resourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the resource tags used to filter findings.
     * </p>
     * 
     * @param resourceTags
     *        Details on the resource tags used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withResourceTags(java.util.Collection<MapFilter> resourceTags) {
        setResourceTags(resourceTags);
        return this;
    }

    /**
     * <p>
     * Details on the resource types used to filter findings.
     * </p>
     * 
     * @return Details on the resource types used to filter findings.
     */

    public java.util.List<StringFilter> getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * Details on the resource types used to filter findings.
     * </p>
     * 
     * @param resourceType
     *        Details on the resource types used to filter findings.
     */

    public void setResourceType(java.util.Collection<StringFilter> resourceType) {
        if (resourceType == null) {
            this.resourceType = null;
            return;
        }

        this.resourceType = new java.util.ArrayList<StringFilter>(resourceType);
    }

    /**
     * <p>
     * Details on the resource types used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceType(java.util.Collection)} or {@link #withResourceType(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceType
     *        Details on the resource types used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withResourceType(StringFilter... resourceType) {
        if (this.resourceType == null) {
            setResourceType(new java.util.ArrayList<StringFilter>(resourceType.length));
        }
        for (StringFilter ele : resourceType) {
            this.resourceType.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the resource types used to filter findings.
     * </p>
     * 
     * @param resourceType
     *        Details on the resource types used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withResourceType(java.util.Collection<StringFilter> resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Details on the severity used to filter findings.
     * </p>
     * 
     * @return Details on the severity used to filter findings.
     */

    public java.util.List<StringFilter> getSeverity() {
        return severity;
    }

    /**
     * <p>
     * Details on the severity used to filter findings.
     * </p>
     * 
     * @param severity
     *        Details on the severity used to filter findings.
     */

    public void setSeverity(java.util.Collection<StringFilter> severity) {
        if (severity == null) {
            this.severity = null;
            return;
        }

        this.severity = new java.util.ArrayList<StringFilter>(severity);
    }

    /**
     * <p>
     * Details on the severity used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSeverity(java.util.Collection)} or {@link #withSeverity(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param severity
     *        Details on the severity used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withSeverity(StringFilter... severity) {
        if (this.severity == null) {
            setSeverity(new java.util.ArrayList<StringFilter>(severity.length));
        }
        for (StringFilter ele : severity) {
            this.severity.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the severity used to filter findings.
     * </p>
     * 
     * @param severity
     *        Details on the severity used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withSeverity(java.util.Collection<StringFilter> severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * Details on the finding title used to filter findings.
     * </p>
     * 
     * @return Details on the finding title used to filter findings.
     */

    public java.util.List<StringFilter> getTitle() {
        return title;
    }

    /**
     * <p>
     * Details on the finding title used to filter findings.
     * </p>
     * 
     * @param title
     *        Details on the finding title used to filter findings.
     */

    public void setTitle(java.util.Collection<StringFilter> title) {
        if (title == null) {
            this.title = null;
            return;
        }

        this.title = new java.util.ArrayList<StringFilter>(title);
    }

    /**
     * <p>
     * Details on the finding title used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTitle(java.util.Collection)} or {@link #withTitle(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param title
     *        Details on the finding title used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withTitle(StringFilter... title) {
        if (this.title == null) {
            setTitle(new java.util.ArrayList<StringFilter>(title.length));
        }
        for (StringFilter ele : title) {
            this.title.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the finding title used to filter findings.
     * </p>
     * 
     * @param title
     *        Details on the finding title used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withTitle(java.util.Collection<StringFilter> title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * Details on the date and time a finding was last updated at used to filter findings.
     * </p>
     * 
     * @return Details on the date and time a finding was last updated at used to filter findings.
     */

    public java.util.List<DateFilter> getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * Details on the date and time a finding was last updated at used to filter findings.
     * </p>
     * 
     * @param updatedAt
     *        Details on the date and time a finding was last updated at used to filter findings.
     */

    public void setUpdatedAt(java.util.Collection<DateFilter> updatedAt) {
        if (updatedAt == null) {
            this.updatedAt = null;
            return;
        }

        this.updatedAt = new java.util.ArrayList<DateFilter>(updatedAt);
    }

    /**
     * <p>
     * Details on the date and time a finding was last updated at used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdatedAt(java.util.Collection)} or {@link #withUpdatedAt(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param updatedAt
     *        Details on the date and time a finding was last updated at used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withUpdatedAt(DateFilter... updatedAt) {
        if (this.updatedAt == null) {
            setUpdatedAt(new java.util.ArrayList<DateFilter>(updatedAt.length));
        }
        for (DateFilter ele : updatedAt) {
            this.updatedAt.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the date and time a finding was last updated at used to filter findings.
     * </p>
     * 
     * @param updatedAt
     *        Details on the date and time a finding was last updated at used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withUpdatedAt(java.util.Collection<DateFilter> updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * Details on the vendor severity used to filter findings.
     * </p>
     * 
     * @return Details on the vendor severity used to filter findings.
     */

    public java.util.List<StringFilter> getVendorSeverity() {
        return vendorSeverity;
    }

    /**
     * <p>
     * Details on the vendor severity used to filter findings.
     * </p>
     * 
     * @param vendorSeverity
     *        Details on the vendor severity used to filter findings.
     */

    public void setVendorSeverity(java.util.Collection<StringFilter> vendorSeverity) {
        if (vendorSeverity == null) {
            this.vendorSeverity = null;
            return;
        }

        this.vendorSeverity = new java.util.ArrayList<StringFilter>(vendorSeverity);
    }

    /**
     * <p>
     * Details on the vendor severity used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVendorSeverity(java.util.Collection)} or {@link #withVendorSeverity(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param vendorSeverity
     *        Details on the vendor severity used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withVendorSeverity(StringFilter... vendorSeverity) {
        if (this.vendorSeverity == null) {
            setVendorSeverity(new java.util.ArrayList<StringFilter>(vendorSeverity.length));
        }
        for (StringFilter ele : vendorSeverity) {
            this.vendorSeverity.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the vendor severity used to filter findings.
     * </p>
     * 
     * @param vendorSeverity
     *        Details on the vendor severity used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withVendorSeverity(java.util.Collection<StringFilter> vendorSeverity) {
        setVendorSeverity(vendorSeverity);
        return this;
    }

    /**
     * <p>
     * Details on the vulnerability ID used to filter findings.
     * </p>
     * 
     * @return Details on the vulnerability ID used to filter findings.
     */

    public java.util.List<StringFilter> getVulnerabilityId() {
        return vulnerabilityId;
    }

    /**
     * <p>
     * Details on the vulnerability ID used to filter findings.
     * </p>
     * 
     * @param vulnerabilityId
     *        Details on the vulnerability ID used to filter findings.
     */

    public void setVulnerabilityId(java.util.Collection<StringFilter> vulnerabilityId) {
        if (vulnerabilityId == null) {
            this.vulnerabilityId = null;
            return;
        }

        this.vulnerabilityId = new java.util.ArrayList<StringFilter>(vulnerabilityId);
    }

    /**
     * <p>
     * Details on the vulnerability ID used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVulnerabilityId(java.util.Collection)} or {@link #withVulnerabilityId(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param vulnerabilityId
     *        Details on the vulnerability ID used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withVulnerabilityId(StringFilter... vulnerabilityId) {
        if (this.vulnerabilityId == null) {
            setVulnerabilityId(new java.util.ArrayList<StringFilter>(vulnerabilityId.length));
        }
        for (StringFilter ele : vulnerabilityId) {
            this.vulnerabilityId.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the vulnerability ID used to filter findings.
     * </p>
     * 
     * @param vulnerabilityId
     *        Details on the vulnerability ID used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withVulnerabilityId(java.util.Collection<StringFilter> vulnerabilityId) {
        setVulnerabilityId(vulnerabilityId);
        return this;
    }

    /**
     * <p>
     * Details on the vulnerability type used to filter findings.
     * </p>
     * 
     * @return Details on the vulnerability type used to filter findings.
     */

    public java.util.List<StringFilter> getVulnerabilitySource() {
        return vulnerabilitySource;
    }

    /**
     * <p>
     * Details on the vulnerability type used to filter findings.
     * </p>
     * 
     * @param vulnerabilitySource
     *        Details on the vulnerability type used to filter findings.
     */

    public void setVulnerabilitySource(java.util.Collection<StringFilter> vulnerabilitySource) {
        if (vulnerabilitySource == null) {
            this.vulnerabilitySource = null;
            return;
        }

        this.vulnerabilitySource = new java.util.ArrayList<StringFilter>(vulnerabilitySource);
    }

    /**
     * <p>
     * Details on the vulnerability type used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVulnerabilitySource(java.util.Collection)} or {@link #withVulnerabilitySource(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vulnerabilitySource
     *        Details on the vulnerability type used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withVulnerabilitySource(StringFilter... vulnerabilitySource) {
        if (this.vulnerabilitySource == null) {
            setVulnerabilitySource(new java.util.ArrayList<StringFilter>(vulnerabilitySource.length));
        }
        for (StringFilter ele : vulnerabilitySource) {
            this.vulnerabilitySource.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the vulnerability type used to filter findings.
     * </p>
     * 
     * @param vulnerabilitySource
     *        Details on the vulnerability type used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withVulnerabilitySource(java.util.Collection<StringFilter> vulnerabilitySource) {
        setVulnerabilitySource(vulnerabilitySource);
        return this;
    }

    /**
     * <p>
     * Details on the vulnerable packages used to filter findings.
     * </p>
     * 
     * @return Details on the vulnerable packages used to filter findings.
     */

    public java.util.List<PackageFilter> getVulnerablePackages() {
        return vulnerablePackages;
    }

    /**
     * <p>
     * Details on the vulnerable packages used to filter findings.
     * </p>
     * 
     * @param vulnerablePackages
     *        Details on the vulnerable packages used to filter findings.
     */

    public void setVulnerablePackages(java.util.Collection<PackageFilter> vulnerablePackages) {
        if (vulnerablePackages == null) {
            this.vulnerablePackages = null;
            return;
        }

        this.vulnerablePackages = new java.util.ArrayList<PackageFilter>(vulnerablePackages);
    }

    /**
     * <p>
     * Details on the vulnerable packages used to filter findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVulnerablePackages(java.util.Collection)} or {@link #withVulnerablePackages(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param vulnerablePackages
     *        Details on the vulnerable packages used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withVulnerablePackages(PackageFilter... vulnerablePackages) {
        if (this.vulnerablePackages == null) {
            setVulnerablePackages(new java.util.ArrayList<PackageFilter>(vulnerablePackages.length));
        }
        for (PackageFilter ele : vulnerablePackages) {
            this.vulnerablePackages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the vulnerable packages used to filter findings.
     * </p>
     * 
     * @param vulnerablePackages
     *        Details on the vulnerable packages used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCriteria withVulnerablePackages(java.util.Collection<PackageFilter> vulnerablePackages) {
        setVulnerablePackages(vulnerablePackages);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getComponentId() != null)
            sb.append("ComponentId: ").append(getComponentId()).append(",");
        if (getComponentType() != null)
            sb.append("ComponentType: ").append(getComponentType()).append(",");
        if (getEc2InstanceImageId() != null)
            sb.append("Ec2InstanceImageId: ").append(getEc2InstanceImageId()).append(",");
        if (getEc2InstanceSubnetId() != null)
            sb.append("Ec2InstanceSubnetId: ").append(getEc2InstanceSubnetId()).append(",");
        if (getEc2InstanceVpcId() != null)
            sb.append("Ec2InstanceVpcId: ").append(getEc2InstanceVpcId()).append(",");
        if (getEcrImageArchitecture() != null)
            sb.append("EcrImageArchitecture: ").append(getEcrImageArchitecture()).append(",");
        if (getEcrImageHash() != null)
            sb.append("EcrImageHash: ").append(getEcrImageHash()).append(",");
        if (getEcrImagePushedAt() != null)
            sb.append("EcrImagePushedAt: ").append(getEcrImagePushedAt()).append(",");
        if (getEcrImageRegistry() != null)
            sb.append("EcrImageRegistry: ").append(getEcrImageRegistry()).append(",");
        if (getEcrImageRepositoryName() != null)
            sb.append("EcrImageRepositoryName: ").append(getEcrImageRepositoryName()).append(",");
        if (getEcrImageTags() != null)
            sb.append("EcrImageTags: ").append(getEcrImageTags()).append(",");
        if (getExploitAvailable() != null)
            sb.append("ExploitAvailable: ").append(getExploitAvailable()).append(",");
        if (getFindingArn() != null)
            sb.append("FindingArn: ").append(getFindingArn()).append(",");
        if (getFindingStatus() != null)
            sb.append("FindingStatus: ").append(getFindingStatus()).append(",");
        if (getFindingType() != null)
            sb.append("FindingType: ").append(getFindingType()).append(",");
        if (getFirstObservedAt() != null)
            sb.append("FirstObservedAt: ").append(getFirstObservedAt()).append(",");
        if (getFixAvailable() != null)
            sb.append("FixAvailable: ").append(getFixAvailable()).append(",");
        if (getInspectorScore() != null)
            sb.append("InspectorScore: ").append(getInspectorScore()).append(",");
        if (getLambdaFunctionExecutionRoleArn() != null)
            sb.append("LambdaFunctionExecutionRoleArn: ").append(getLambdaFunctionExecutionRoleArn()).append(",");
        if (getLambdaFunctionLastModifiedAt() != null)
            sb.append("LambdaFunctionLastModifiedAt: ").append(getLambdaFunctionLastModifiedAt()).append(",");
        if (getLambdaFunctionLayers() != null)
            sb.append("LambdaFunctionLayers: ").append(getLambdaFunctionLayers()).append(",");
        if (getLambdaFunctionName() != null)
            sb.append("LambdaFunctionName: ").append(getLambdaFunctionName()).append(",");
        if (getLambdaFunctionRuntime() != null)
            sb.append("LambdaFunctionRuntime: ").append(getLambdaFunctionRuntime()).append(",");
        if (getLastObservedAt() != null)
            sb.append("LastObservedAt: ").append(getLastObservedAt()).append(",");
        if (getNetworkProtocol() != null)
            sb.append("NetworkProtocol: ").append(getNetworkProtocol()).append(",");
        if (getPortRange() != null)
            sb.append("PortRange: ").append(getPortRange()).append(",");
        if (getRelatedVulnerabilities() != null)
            sb.append("RelatedVulnerabilities: ").append(getRelatedVulnerabilities()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getVendorSeverity() != null)
            sb.append("VendorSeverity: ").append(getVendorSeverity()).append(",");
        if (getVulnerabilityId() != null)
            sb.append("VulnerabilityId: ").append(getVulnerabilityId()).append(",");
        if (getVulnerabilitySource() != null)
            sb.append("VulnerabilitySource: ").append(getVulnerabilitySource()).append(",");
        if (getVulnerablePackages() != null)
            sb.append("VulnerablePackages: ").append(getVulnerablePackages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterCriteria == false)
            return false;
        FilterCriteria other = (FilterCriteria) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getComponentId() == null ^ this.getComponentId() == null)
            return false;
        if (other.getComponentId() != null && other.getComponentId().equals(this.getComponentId()) == false)
            return false;
        if (other.getComponentType() == null ^ this.getComponentType() == null)
            return false;
        if (other.getComponentType() != null && other.getComponentType().equals(this.getComponentType()) == false)
            return false;
        if (other.getEc2InstanceImageId() == null ^ this.getEc2InstanceImageId() == null)
            return false;
        if (other.getEc2InstanceImageId() != null && other.getEc2InstanceImageId().equals(this.getEc2InstanceImageId()) == false)
            return false;
        if (other.getEc2InstanceSubnetId() == null ^ this.getEc2InstanceSubnetId() == null)
            return false;
        if (other.getEc2InstanceSubnetId() != null && other.getEc2InstanceSubnetId().equals(this.getEc2InstanceSubnetId()) == false)
            return false;
        if (other.getEc2InstanceVpcId() == null ^ this.getEc2InstanceVpcId() == null)
            return false;
        if (other.getEc2InstanceVpcId() != null && other.getEc2InstanceVpcId().equals(this.getEc2InstanceVpcId()) == false)
            return false;
        if (other.getEcrImageArchitecture() == null ^ this.getEcrImageArchitecture() == null)
            return false;
        if (other.getEcrImageArchitecture() != null && other.getEcrImageArchitecture().equals(this.getEcrImageArchitecture()) == false)
            return false;
        if (other.getEcrImageHash() == null ^ this.getEcrImageHash() == null)
            return false;
        if (other.getEcrImageHash() != null && other.getEcrImageHash().equals(this.getEcrImageHash()) == false)
            return false;
        if (other.getEcrImagePushedAt() == null ^ this.getEcrImagePushedAt() == null)
            return false;
        if (other.getEcrImagePushedAt() != null && other.getEcrImagePushedAt().equals(this.getEcrImagePushedAt()) == false)
            return false;
        if (other.getEcrImageRegistry() == null ^ this.getEcrImageRegistry() == null)
            return false;
        if (other.getEcrImageRegistry() != null && other.getEcrImageRegistry().equals(this.getEcrImageRegistry()) == false)
            return false;
        if (other.getEcrImageRepositoryName() == null ^ this.getEcrImageRepositoryName() == null)
            return false;
        if (other.getEcrImageRepositoryName() != null && other.getEcrImageRepositoryName().equals(this.getEcrImageRepositoryName()) == false)
            return false;
        if (other.getEcrImageTags() == null ^ this.getEcrImageTags() == null)
            return false;
        if (other.getEcrImageTags() != null && other.getEcrImageTags().equals(this.getEcrImageTags()) == false)
            return false;
        if (other.getExploitAvailable() == null ^ this.getExploitAvailable() == null)
            return false;
        if (other.getExploitAvailable() != null && other.getExploitAvailable().equals(this.getExploitAvailable()) == false)
            return false;
        if (other.getFindingArn() == null ^ this.getFindingArn() == null)
            return false;
        if (other.getFindingArn() != null && other.getFindingArn().equals(this.getFindingArn()) == false)
            return false;
        if (other.getFindingStatus() == null ^ this.getFindingStatus() == null)
            return false;
        if (other.getFindingStatus() != null && other.getFindingStatus().equals(this.getFindingStatus()) == false)
            return false;
        if (other.getFindingType() == null ^ this.getFindingType() == null)
            return false;
        if (other.getFindingType() != null && other.getFindingType().equals(this.getFindingType()) == false)
            return false;
        if (other.getFirstObservedAt() == null ^ this.getFirstObservedAt() == null)
            return false;
        if (other.getFirstObservedAt() != null && other.getFirstObservedAt().equals(this.getFirstObservedAt()) == false)
            return false;
        if (other.getFixAvailable() == null ^ this.getFixAvailable() == null)
            return false;
        if (other.getFixAvailable() != null && other.getFixAvailable().equals(this.getFixAvailable()) == false)
            return false;
        if (other.getInspectorScore() == null ^ this.getInspectorScore() == null)
            return false;
        if (other.getInspectorScore() != null && other.getInspectorScore().equals(this.getInspectorScore()) == false)
            return false;
        if (other.getLambdaFunctionExecutionRoleArn() == null ^ this.getLambdaFunctionExecutionRoleArn() == null)
            return false;
        if (other.getLambdaFunctionExecutionRoleArn() != null
                && other.getLambdaFunctionExecutionRoleArn().equals(this.getLambdaFunctionExecutionRoleArn()) == false)
            return false;
        if (other.getLambdaFunctionLastModifiedAt() == null ^ this.getLambdaFunctionLastModifiedAt() == null)
            return false;
        if (other.getLambdaFunctionLastModifiedAt() != null && other.getLambdaFunctionLastModifiedAt().equals(this.getLambdaFunctionLastModifiedAt()) == false)
            return false;
        if (other.getLambdaFunctionLayers() == null ^ this.getLambdaFunctionLayers() == null)
            return false;
        if (other.getLambdaFunctionLayers() != null && other.getLambdaFunctionLayers().equals(this.getLambdaFunctionLayers()) == false)
            return false;
        if (other.getLambdaFunctionName() == null ^ this.getLambdaFunctionName() == null)
            return false;
        if (other.getLambdaFunctionName() != null && other.getLambdaFunctionName().equals(this.getLambdaFunctionName()) == false)
            return false;
        if (other.getLambdaFunctionRuntime() == null ^ this.getLambdaFunctionRuntime() == null)
            return false;
        if (other.getLambdaFunctionRuntime() != null && other.getLambdaFunctionRuntime().equals(this.getLambdaFunctionRuntime()) == false)
            return false;
        if (other.getLastObservedAt() == null ^ this.getLastObservedAt() == null)
            return false;
        if (other.getLastObservedAt() != null && other.getLastObservedAt().equals(this.getLastObservedAt()) == false)
            return false;
        if (other.getNetworkProtocol() == null ^ this.getNetworkProtocol() == null)
            return false;
        if (other.getNetworkProtocol() != null && other.getNetworkProtocol().equals(this.getNetworkProtocol()) == false)
            return false;
        if (other.getPortRange() == null ^ this.getPortRange() == null)
            return false;
        if (other.getPortRange() != null && other.getPortRange().equals(this.getPortRange()) == false)
            return false;
        if (other.getRelatedVulnerabilities() == null ^ this.getRelatedVulnerabilities() == null)
            return false;
        if (other.getRelatedVulnerabilities() != null && other.getRelatedVulnerabilities().equals(this.getRelatedVulnerabilities()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getVendorSeverity() == null ^ this.getVendorSeverity() == null)
            return false;
        if (other.getVendorSeverity() != null && other.getVendorSeverity().equals(this.getVendorSeverity()) == false)
            return false;
        if (other.getVulnerabilityId() == null ^ this.getVulnerabilityId() == null)
            return false;
        if (other.getVulnerabilityId() != null && other.getVulnerabilityId().equals(this.getVulnerabilityId()) == false)
            return false;
        if (other.getVulnerabilitySource() == null ^ this.getVulnerabilitySource() == null)
            return false;
        if (other.getVulnerabilitySource() != null && other.getVulnerabilitySource().equals(this.getVulnerabilitySource()) == false)
            return false;
        if (other.getVulnerablePackages() == null ^ this.getVulnerablePackages() == null)
            return false;
        if (other.getVulnerablePackages() != null && other.getVulnerablePackages().equals(this.getVulnerablePackages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getComponentId() == null) ? 0 : getComponentId().hashCode());
        hashCode = prime * hashCode + ((getComponentType() == null) ? 0 : getComponentType().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceImageId() == null) ? 0 : getEc2InstanceImageId().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceSubnetId() == null) ? 0 : getEc2InstanceSubnetId().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceVpcId() == null) ? 0 : getEc2InstanceVpcId().hashCode());
        hashCode = prime * hashCode + ((getEcrImageArchitecture() == null) ? 0 : getEcrImageArchitecture().hashCode());
        hashCode = prime * hashCode + ((getEcrImageHash() == null) ? 0 : getEcrImageHash().hashCode());
        hashCode = prime * hashCode + ((getEcrImagePushedAt() == null) ? 0 : getEcrImagePushedAt().hashCode());
        hashCode = prime * hashCode + ((getEcrImageRegistry() == null) ? 0 : getEcrImageRegistry().hashCode());
        hashCode = prime * hashCode + ((getEcrImageRepositoryName() == null) ? 0 : getEcrImageRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getEcrImageTags() == null) ? 0 : getEcrImageTags().hashCode());
        hashCode = prime * hashCode + ((getExploitAvailable() == null) ? 0 : getExploitAvailable().hashCode());
        hashCode = prime * hashCode + ((getFindingArn() == null) ? 0 : getFindingArn().hashCode());
        hashCode = prime * hashCode + ((getFindingStatus() == null) ? 0 : getFindingStatus().hashCode());
        hashCode = prime * hashCode + ((getFindingType() == null) ? 0 : getFindingType().hashCode());
        hashCode = prime * hashCode + ((getFirstObservedAt() == null) ? 0 : getFirstObservedAt().hashCode());
        hashCode = prime * hashCode + ((getFixAvailable() == null) ? 0 : getFixAvailable().hashCode());
        hashCode = prime * hashCode + ((getInspectorScore() == null) ? 0 : getInspectorScore().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionExecutionRoleArn() == null) ? 0 : getLambdaFunctionExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionLastModifiedAt() == null) ? 0 : getLambdaFunctionLastModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionLayers() == null) ? 0 : getLambdaFunctionLayers().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionName() == null) ? 0 : getLambdaFunctionName().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionRuntime() == null) ? 0 : getLambdaFunctionRuntime().hashCode());
        hashCode = prime * hashCode + ((getLastObservedAt() == null) ? 0 : getLastObservedAt().hashCode());
        hashCode = prime * hashCode + ((getNetworkProtocol() == null) ? 0 : getNetworkProtocol().hashCode());
        hashCode = prime * hashCode + ((getPortRange() == null) ? 0 : getPortRange().hashCode());
        hashCode = prime * hashCode + ((getRelatedVulnerabilities() == null) ? 0 : getRelatedVulnerabilities().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getVendorSeverity() == null) ? 0 : getVendorSeverity().hashCode());
        hashCode = prime * hashCode + ((getVulnerabilityId() == null) ? 0 : getVulnerabilityId().hashCode());
        hashCode = prime * hashCode + ((getVulnerabilitySource() == null) ? 0 : getVulnerabilitySource().hashCode());
        hashCode = prime * hashCode + ((getVulnerablePackages() == null) ? 0 : getVulnerablePackages().hashCode());
        return hashCode;
    }

    @Override
    public FilterCriteria clone() {
        try {
            return (FilterCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.FilterCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
