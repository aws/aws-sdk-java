/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/PutDraftAppVersionTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDraftAppVersionTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     */
    private String appArn;
    /**
     * <p>
     * A JSON string that provides information about your application structure. To learn more about the
     * <code>appTemplateBody</code> template, see the sample template provided in the <i>Examples</i> section.
     * </p>
     * <p>
     * The <code>appTemplateBody</code> JSON string has the following structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>resources</code> </b>
     * </p>
     * <p>
     * The list of logical resources that must be included in the Resilience Hub application.
     * </p>
     * <p>
     * Type: Array
     * </p>
     * <note>
     * <p>
     * Don't add the resources that you want to exclude.
     * </p>
     * </note>
     * <p>
     * Each <code>resources</code> array item includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>logicalResourceId</code> </i>
     * </p>
     * <p>
     * Logical identifier of the resource.
     * </p>
     * <p>
     * Type: Object
     * </p>
     * <p>
     * Each <code>logicalResourceId</code> object includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>identifier</code>
     * </p>
     * <p>
     * Identifier of the resource.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logicalStackName</code>
     * </p>
     * <p>
     * The name of the CloudFormation stack this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceGroupName</code>
     * </p>
     * <p>
     * The name of the resource group this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terraformSourceName</code>
     * </p>
     * <p>
     * The name of the Terraform S3 state file this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eksSourceName</code>
     * </p>
     * <p>
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
     * </p>
     * <note>
     * <p>
     * This parameter accepts values in "eks-cluster/namespace" format.
     * </p>
     * </note>
     * <p>
     * Type: String
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i> <code>type</code> </i>
     * </p>
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * Type: string
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>name</code> </i>
     * </p>
     * <p>
     * The name of the resource.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>additionalInfo</code>
     * </p>
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>appComponents</code> </b>
     * </p>
     * <p>
     * List of Application Components that this resource belongs to. If an Application Component is not part of the
     * Resilience Hub application, it will be added.
     * </p>
     * <p>
     * Type: Array
     * </p>
     * <p>
     * Each <code>appComponents</code> array item includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>name</code>
     * </p>
     * <p>
     * Name of the Application Component.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code>
     * </p>
     * <p>
     * Type of Application Component. For more information about the types of Application Component, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/AppComponent.grouping.html">Grouping resources
     * in an AppComponent</a>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceNames</code>
     * </p>
     * <p>
     * The list of included resources that are assigned to the Application Component.
     * </p>
     * <p>
     * Type: Array of strings
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>additionalInfo</code>
     * </p>
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>excludedResources</code> </b>
     * </p>
     * <p>
     * The list of logical resource identifiers to be excluded from the application.
     * </p>
     * <p>
     * Type: Array
     * </p>
     * <note>
     * <p>
     * Don't add the resources that you want to include.
     * </p>
     * </note>
     * <p>
     * Each <code>excludedResources</code> array item includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>logicalResourceIds</code> </i>
     * </p>
     * <p>
     * Logical identifier of the resource.
     * </p>
     * <p>
     * Type: Object
     * </p>
     * <note>
     * <p>
     * You can configure only one of the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>logicalStackName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceGroupName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terraformSourceName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eksSourceName</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * Each <code>logicalResourceIds</code> object includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>identifier</code>
     * </p>
     * <p>
     * Identifier of the resource.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logicalStackName</code>
     * </p>
     * <p>
     * The name of the CloudFormation stack this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceGroupName</code>
     * </p>
     * <p>
     * The name of the resource group this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terraformSourceName</code>
     * </p>
     * <p>
     * The name of the Terraform S3 state file this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eksSourceName</code>
     * </p>
     * <p>
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
     * </p>
     * <note>
     * <p>
     * This parameter accepts values in "eks-cluster/namespace" format.
     * </p>
     * </note>
     * <p>
     * Type: String
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>version</code> </b>
     * </p>
     * <p>
     * Resilience Hub application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>additionalInfo</code>
     * </p>
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note></li>
     * </ul>
     */
    private String appTemplateBody;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For
     *        more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public void setAppArn(String appArn) {
        this.appArn = appArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *         <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>.
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public String getAppArn() {
        return this.appArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     * <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param appArn
     *        Amazon Resource Name (ARN) of the Resilience Hub application. The format for this ARN is: arn:
     *        <code>partition</code>:resiliencehub:<code>region</code>:<code>account</code>:app/<code>app-id</code>. For
     *        more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDraftAppVersionTemplateRequest withAppArn(String appArn) {
        setAppArn(appArn);
        return this;
    }

    /**
     * <p>
     * A JSON string that provides information about your application structure. To learn more about the
     * <code>appTemplateBody</code> template, see the sample template provided in the <i>Examples</i> section.
     * </p>
     * <p>
     * The <code>appTemplateBody</code> JSON string has the following structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>resources</code> </b>
     * </p>
     * <p>
     * The list of logical resources that must be included in the Resilience Hub application.
     * </p>
     * <p>
     * Type: Array
     * </p>
     * <note>
     * <p>
     * Don't add the resources that you want to exclude.
     * </p>
     * </note>
     * <p>
     * Each <code>resources</code> array item includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>logicalResourceId</code> </i>
     * </p>
     * <p>
     * Logical identifier of the resource.
     * </p>
     * <p>
     * Type: Object
     * </p>
     * <p>
     * Each <code>logicalResourceId</code> object includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>identifier</code>
     * </p>
     * <p>
     * Identifier of the resource.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logicalStackName</code>
     * </p>
     * <p>
     * The name of the CloudFormation stack this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceGroupName</code>
     * </p>
     * <p>
     * The name of the resource group this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terraformSourceName</code>
     * </p>
     * <p>
     * The name of the Terraform S3 state file this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eksSourceName</code>
     * </p>
     * <p>
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
     * </p>
     * <note>
     * <p>
     * This parameter accepts values in "eks-cluster/namespace" format.
     * </p>
     * </note>
     * <p>
     * Type: String
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i> <code>type</code> </i>
     * </p>
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * Type: string
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>name</code> </i>
     * </p>
     * <p>
     * The name of the resource.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>additionalInfo</code>
     * </p>
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>appComponents</code> </b>
     * </p>
     * <p>
     * List of Application Components that this resource belongs to. If an Application Component is not part of the
     * Resilience Hub application, it will be added.
     * </p>
     * <p>
     * Type: Array
     * </p>
     * <p>
     * Each <code>appComponents</code> array item includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>name</code>
     * </p>
     * <p>
     * Name of the Application Component.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code>
     * </p>
     * <p>
     * Type of Application Component. For more information about the types of Application Component, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/AppComponent.grouping.html">Grouping resources
     * in an AppComponent</a>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceNames</code>
     * </p>
     * <p>
     * The list of included resources that are assigned to the Application Component.
     * </p>
     * <p>
     * Type: Array of strings
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>additionalInfo</code>
     * </p>
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>excludedResources</code> </b>
     * </p>
     * <p>
     * The list of logical resource identifiers to be excluded from the application.
     * </p>
     * <p>
     * Type: Array
     * </p>
     * <note>
     * <p>
     * Don't add the resources that you want to include.
     * </p>
     * </note>
     * <p>
     * Each <code>excludedResources</code> array item includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>logicalResourceIds</code> </i>
     * </p>
     * <p>
     * Logical identifier of the resource.
     * </p>
     * <p>
     * Type: Object
     * </p>
     * <note>
     * <p>
     * You can configure only one of the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>logicalStackName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceGroupName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terraformSourceName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eksSourceName</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * Each <code>logicalResourceIds</code> object includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>identifier</code>
     * </p>
     * <p>
     * Identifier of the resource.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logicalStackName</code>
     * </p>
     * <p>
     * The name of the CloudFormation stack this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceGroupName</code>
     * </p>
     * <p>
     * The name of the resource group this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terraformSourceName</code>
     * </p>
     * <p>
     * The name of the Terraform S3 state file this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eksSourceName</code>
     * </p>
     * <p>
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
     * </p>
     * <note>
     * <p>
     * This parameter accepts values in "eks-cluster/namespace" format.
     * </p>
     * </note>
     * <p>
     * Type: String
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>version</code> </b>
     * </p>
     * <p>
     * Resilience Hub application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>additionalInfo</code>
     * </p>
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param appTemplateBody
     *        A JSON string that provides information about your application structure. To learn more about the
     *        <code>appTemplateBody</code> template, see the sample template provided in the <i>Examples</i>
     *        section.</p>
     *        <p>
     *        The <code>appTemplateBody</code> JSON string has the following structure:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>resources</code> </b>
     *        </p>
     *        <p>
     *        The list of logical resources that must be included in the Resilience Hub application.
     *        </p>
     *        <p>
     *        Type: Array
     *        </p>
     *        <note>
     *        <p>
     *        Don't add the resources that you want to exclude.
     *        </p>
     *        </note>
     *        <p>
     *        Each <code>resources</code> array item includes the following fields:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i> <code>logicalResourceId</code> </i>
     *        </p>
     *        <p>
     *        Logical identifier of the resource.
     *        </p>
     *        <p>
     *        Type: Object
     *        </p>
     *        <p>
     *        Each <code>logicalResourceId</code> object includes the following fields:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>identifier</code>
     *        </p>
     *        <p>
     *        Identifier of the resource.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>logicalStackName</code>
     *        </p>
     *        <p>
     *        The name of the CloudFormation stack this resource belongs to.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resourceGroupName</code>
     *        </p>
     *        <p>
     *        The name of the resource group this resource belongs to.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terraformSourceName</code>
     *        </p>
     *        <p>
     *        The name of the Terraform S3 state file this resource belongs to.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>eksSourceName</code>
     *        </p>
     *        <p>
     *        Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter accepts values in "eks-cluster/namespace" format.
     *        </p>
     *        </note>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>type</code> </i>
     *        </p>
     *        <p>
     *        The type of resource.
     *        </p>
     *        <p>
     *        Type: string
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>name</code> </i>
     *        </p>
     *        <p>
     *        The name of the resource.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>additionalInfo</code>
     *        </p>
     *        <p>
     *        Additional configuration parameters for an Resilience Hub application. If you want to implement
     *        <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *        href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *        application configuration parameters</a>.
     *        </p>
     *        <note>
     *        <p>
     *        Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and
     *        one associated account.
     *        </p>
     *        <p>
     *        Key: <code>"failover-regions"</code>
     *        </p>
     *        <p>
     *        Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     *        </p>
     *        </note></li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>appComponents</code> </b>
     *        </p>
     *        <p>
     *        List of Application Components that this resource belongs to. If an Application Component is not part of
     *        the Resilience Hub application, it will be added.
     *        </p>
     *        <p>
     *        Type: Array
     *        </p>
     *        <p>
     *        Each <code>appComponents</code> array item includes the following fields:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>name</code>
     *        </p>
     *        <p>
     *        Name of the Application Component.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code>
     *        </p>
     *        <p>
     *        Type of Application Component. For more information about the types of Application Component, see <a
     *        href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/AppComponent.grouping.html">Grouping
     *        resources in an AppComponent</a>.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resourceNames</code>
     *        </p>
     *        <p>
     *        The list of included resources that are assigned to the Application Component.
     *        </p>
     *        <p>
     *        Type: Array of strings
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>additionalInfo</code>
     *        </p>
     *        <p>
     *        Additional configuration parameters for an Resilience Hub application. If you want to implement
     *        <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *        href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *        application configuration parameters</a>.
     *        </p>
     *        <note>
     *        <p>
     *        Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and
     *        one associated account.
     *        </p>
     *        <p>
     *        Key: <code>"failover-regions"</code>
     *        </p>
     *        <p>
     *        Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     *        </p>
     *        </note></li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>excludedResources</code> </b>
     *        </p>
     *        <p>
     *        The list of logical resource identifiers to be excluded from the application.
     *        </p>
     *        <p>
     *        Type: Array
     *        </p>
     *        <note>
     *        <p>
     *        Don't add the resources that you want to include.
     *        </p>
     *        </note>
     *        <p>
     *        Each <code>excludedResources</code> array item includes the following fields:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i> <code>logicalResourceIds</code> </i>
     *        </p>
     *        <p>
     *        Logical identifier of the resource.
     *        </p>
     *        <p>
     *        Type: Object
     *        </p>
     *        <note>
     *        <p>
     *        You can configure only one of the following fields:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>logicalStackName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resourceGroupName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terraformSourceName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>eksSourceName</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </note>
     *        <p>
     *        Each <code>logicalResourceIds</code> object includes the following fields:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>identifier</code>
     *        </p>
     *        <p>
     *        Identifier of the resource.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>logicalStackName</code>
     *        </p>
     *        <p>
     *        The name of the CloudFormation stack this resource belongs to.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resourceGroupName</code>
     *        </p>
     *        <p>
     *        The name of the resource group this resource belongs to.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terraformSourceName</code>
     *        </p>
     *        <p>
     *        The name of the Terraform S3 state file this resource belongs to.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>eksSourceName</code>
     *        </p>
     *        <p>
     *        Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter accepts values in "eks-cluster/namespace" format.
     *        </p>
     *        </note>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>version</code> </b>
     *        </p>
     *        <p>
     *        Resilience Hub application version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>additionalInfo</code>
     *        </p>
     *        <p>
     *        Additional configuration parameters for an Resilience Hub application. If you want to implement
     *        <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *        href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *        application configuration parameters</a>.
     *        </p>
     *        <note>
     *        <p>
     *        Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and
     *        one associated account.
     *        </p>
     *        <p>
     *        Key: <code>"failover-regions"</code>
     *        </p>
     *        <p>
     *        Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     *        </p>
     *        </note></li>
     */

    public void setAppTemplateBody(String appTemplateBody) {
        this.appTemplateBody = appTemplateBody;
    }

    /**
     * <p>
     * A JSON string that provides information about your application structure. To learn more about the
     * <code>appTemplateBody</code> template, see the sample template provided in the <i>Examples</i> section.
     * </p>
     * <p>
     * The <code>appTemplateBody</code> JSON string has the following structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>resources</code> </b>
     * </p>
     * <p>
     * The list of logical resources that must be included in the Resilience Hub application.
     * </p>
     * <p>
     * Type: Array
     * </p>
     * <note>
     * <p>
     * Don't add the resources that you want to exclude.
     * </p>
     * </note>
     * <p>
     * Each <code>resources</code> array item includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>logicalResourceId</code> </i>
     * </p>
     * <p>
     * Logical identifier of the resource.
     * </p>
     * <p>
     * Type: Object
     * </p>
     * <p>
     * Each <code>logicalResourceId</code> object includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>identifier</code>
     * </p>
     * <p>
     * Identifier of the resource.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logicalStackName</code>
     * </p>
     * <p>
     * The name of the CloudFormation stack this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceGroupName</code>
     * </p>
     * <p>
     * The name of the resource group this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terraformSourceName</code>
     * </p>
     * <p>
     * The name of the Terraform S3 state file this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eksSourceName</code>
     * </p>
     * <p>
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
     * </p>
     * <note>
     * <p>
     * This parameter accepts values in "eks-cluster/namespace" format.
     * </p>
     * </note>
     * <p>
     * Type: String
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i> <code>type</code> </i>
     * </p>
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * Type: string
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>name</code> </i>
     * </p>
     * <p>
     * The name of the resource.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>additionalInfo</code>
     * </p>
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>appComponents</code> </b>
     * </p>
     * <p>
     * List of Application Components that this resource belongs to. If an Application Component is not part of the
     * Resilience Hub application, it will be added.
     * </p>
     * <p>
     * Type: Array
     * </p>
     * <p>
     * Each <code>appComponents</code> array item includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>name</code>
     * </p>
     * <p>
     * Name of the Application Component.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code>
     * </p>
     * <p>
     * Type of Application Component. For more information about the types of Application Component, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/AppComponent.grouping.html">Grouping resources
     * in an AppComponent</a>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceNames</code>
     * </p>
     * <p>
     * The list of included resources that are assigned to the Application Component.
     * </p>
     * <p>
     * Type: Array of strings
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>additionalInfo</code>
     * </p>
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>excludedResources</code> </b>
     * </p>
     * <p>
     * The list of logical resource identifiers to be excluded from the application.
     * </p>
     * <p>
     * Type: Array
     * </p>
     * <note>
     * <p>
     * Don't add the resources that you want to include.
     * </p>
     * </note>
     * <p>
     * Each <code>excludedResources</code> array item includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>logicalResourceIds</code> </i>
     * </p>
     * <p>
     * Logical identifier of the resource.
     * </p>
     * <p>
     * Type: Object
     * </p>
     * <note>
     * <p>
     * You can configure only one of the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>logicalStackName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceGroupName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terraformSourceName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eksSourceName</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * Each <code>logicalResourceIds</code> object includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>identifier</code>
     * </p>
     * <p>
     * Identifier of the resource.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logicalStackName</code>
     * </p>
     * <p>
     * The name of the CloudFormation stack this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceGroupName</code>
     * </p>
     * <p>
     * The name of the resource group this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terraformSourceName</code>
     * </p>
     * <p>
     * The name of the Terraform S3 state file this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eksSourceName</code>
     * </p>
     * <p>
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
     * </p>
     * <note>
     * <p>
     * This parameter accepts values in "eks-cluster/namespace" format.
     * </p>
     * </note>
     * <p>
     * Type: String
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>version</code> </b>
     * </p>
     * <p>
     * Resilience Hub application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>additionalInfo</code>
     * </p>
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note></li>
     * </ul>
     * 
     * @return A JSON string that provides information about your application structure. To learn more about the
     *         <code>appTemplateBody</code> template, see the sample template provided in the <i>Examples</i>
     *         section.</p>
     *         <p>
     *         The <code>appTemplateBody</code> JSON string has the following structure:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>resources</code> </b>
     *         </p>
     *         <p>
     *         The list of logical resources that must be included in the Resilience Hub application.
     *         </p>
     *         <p>
     *         Type: Array
     *         </p>
     *         <note>
     *         <p>
     *         Don't add the resources that you want to exclude.
     *         </p>
     *         </note>
     *         <p>
     *         Each <code>resources</code> array item includes the following fields:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i> <code>logicalResourceId</code> </i>
     *         </p>
     *         <p>
     *         Logical identifier of the resource.
     *         </p>
     *         <p>
     *         Type: Object
     *         </p>
     *         <p>
     *         Each <code>logicalResourceId</code> object includes the following fields:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>identifier</code>
     *         </p>
     *         <p>
     *         Identifier of the resource.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>logicalStackName</code>
     *         </p>
     *         <p>
     *         The name of the CloudFormation stack this resource belongs to.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resourceGroupName</code>
     *         </p>
     *         <p>
     *         The name of the resource group this resource belongs to.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>terraformSourceName</code>
     *         </p>
     *         <p>
     *         The name of the Terraform S3 state file this resource belongs to.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>eksSourceName</code>
     *         </p>
     *         <p>
     *         Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter accepts values in "eks-cluster/namespace" format.
     *         </p>
     *         </note>
     *         <p>
     *         Type: String
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <i> <code>type</code> </i>
     *         </p>
     *         <p>
     *         The type of resource.
     *         </p>
     *         <p>
     *         Type: string
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i> <code>name</code> </i>
     *         </p>
     *         <p>
     *         The name of the resource.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>additionalInfo</code>
     *         </p>
     *         <p>
     *         Additional configuration parameters for an Resilience Hub application. If you want to implement
     *         <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *         href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *         application configuration parameters</a>.
     *         </p>
     *         <note>
     *         <p>
     *         Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region
     *         and one associated account.
     *         </p>
     *         <p>
     *         Key: <code>"failover-regions"</code>
     *         </p>
     *         <p>
     *         Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     *         </p>
     *         </note></li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>appComponents</code> </b>
     *         </p>
     *         <p>
     *         List of Application Components that this resource belongs to. If an Application Component is not part of
     *         the Resilience Hub application, it will be added.
     *         </p>
     *         <p>
     *         Type: Array
     *         </p>
     *         <p>
     *         Each <code>appComponents</code> array item includes the following fields:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>name</code>
     *         </p>
     *         <p>
     *         Name of the Application Component.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>type</code>
     *         </p>
     *         <p>
     *         Type of Application Component. For more information about the types of Application Component, see <a
     *         href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/AppComponent.grouping.html">Grouping
     *         resources in an AppComponent</a>.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resourceNames</code>
     *         </p>
     *         <p>
     *         The list of included resources that are assigned to the Application Component.
     *         </p>
     *         <p>
     *         Type: Array of strings
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>additionalInfo</code>
     *         </p>
     *         <p>
     *         Additional configuration parameters for an Resilience Hub application. If you want to implement
     *         <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *         href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *         application configuration parameters</a>.
     *         </p>
     *         <note>
     *         <p>
     *         Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region
     *         and one associated account.
     *         </p>
     *         <p>
     *         Key: <code>"failover-regions"</code>
     *         </p>
     *         <p>
     *         Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     *         </p>
     *         </note></li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>excludedResources</code> </b>
     *         </p>
     *         <p>
     *         The list of logical resource identifiers to be excluded from the application.
     *         </p>
     *         <p>
     *         Type: Array
     *         </p>
     *         <note>
     *         <p>
     *         Don't add the resources that you want to include.
     *         </p>
     *         </note>
     *         <p>
     *         Each <code>excludedResources</code> array item includes the following fields:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i> <code>logicalResourceIds</code> </i>
     *         </p>
     *         <p>
     *         Logical identifier of the resource.
     *         </p>
     *         <p>
     *         Type: Object
     *         </p>
     *         <note>
     *         <p>
     *         You can configure only one of the following fields:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>logicalStackName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resourceGroupName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>terraformSourceName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>eksSourceName</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </note>
     *         <p>
     *         Each <code>logicalResourceIds</code> object includes the following fields:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>identifier</code>
     *         </p>
     *         <p>
     *         Identifier of the resource.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>logicalStackName</code>
     *         </p>
     *         <p>
     *         The name of the CloudFormation stack this resource belongs to.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resourceGroupName</code>
     *         </p>
     *         <p>
     *         The name of the resource group this resource belongs to.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>terraformSourceName</code>
     *         </p>
     *         <p>
     *         The name of the Terraform S3 state file this resource belongs to.
     *         </p>
     *         <p>
     *         Type: String
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>eksSourceName</code>
     *         </p>
     *         <p>
     *         Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
     *         </p>
     *         <note>
     *         <p>
     *         This parameter accepts values in "eks-cluster/namespace" format.
     *         </p>
     *         </note>
     *         <p>
     *         Type: String
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>version</code> </b>
     *         </p>
     *         <p>
     *         Resilience Hub application version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>additionalInfo</code>
     *         </p>
     *         <p>
     *         Additional configuration parameters for an Resilience Hub application. If you want to implement
     *         <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *         href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *         application configuration parameters</a>.
     *         </p>
     *         <note>
     *         <p>
     *         Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region
     *         and one associated account.
     *         </p>
     *         <p>
     *         Key: <code>"failover-regions"</code>
     *         </p>
     *         <p>
     *         Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     *         </p>
     *         </note></li>
     */

    public String getAppTemplateBody() {
        return this.appTemplateBody;
    }

    /**
     * <p>
     * A JSON string that provides information about your application structure. To learn more about the
     * <code>appTemplateBody</code> template, see the sample template provided in the <i>Examples</i> section.
     * </p>
     * <p>
     * The <code>appTemplateBody</code> JSON string has the following structure:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>resources</code> </b>
     * </p>
     * <p>
     * The list of logical resources that must be included in the Resilience Hub application.
     * </p>
     * <p>
     * Type: Array
     * </p>
     * <note>
     * <p>
     * Don't add the resources that you want to exclude.
     * </p>
     * </note>
     * <p>
     * Each <code>resources</code> array item includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>logicalResourceId</code> </i>
     * </p>
     * <p>
     * Logical identifier of the resource.
     * </p>
     * <p>
     * Type: Object
     * </p>
     * <p>
     * Each <code>logicalResourceId</code> object includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>identifier</code>
     * </p>
     * <p>
     * Identifier of the resource.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logicalStackName</code>
     * </p>
     * <p>
     * The name of the CloudFormation stack this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceGroupName</code>
     * </p>
     * <p>
     * The name of the resource group this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terraformSourceName</code>
     * </p>
     * <p>
     * The name of the Terraform S3 state file this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eksSourceName</code>
     * </p>
     * <p>
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
     * </p>
     * <note>
     * <p>
     * This parameter accepts values in "eks-cluster/namespace" format.
     * </p>
     * </note>
     * <p>
     * Type: String
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <i> <code>type</code> </i>
     * </p>
     * <p>
     * The type of resource.
     * </p>
     * <p>
     * Type: string
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>name</code> </i>
     * </p>
     * <p>
     * The name of the resource.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>additionalInfo</code>
     * </p>
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>appComponents</code> </b>
     * </p>
     * <p>
     * List of Application Components that this resource belongs to. If an Application Component is not part of the
     * Resilience Hub application, it will be added.
     * </p>
     * <p>
     * Type: Array
     * </p>
     * <p>
     * Each <code>appComponents</code> array item includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>name</code>
     * </p>
     * <p>
     * Name of the Application Component.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code>
     * </p>
     * <p>
     * Type of Application Component. For more information about the types of Application Component, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/AppComponent.grouping.html">Grouping resources
     * in an AppComponent</a>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceNames</code>
     * </p>
     * <p>
     * The list of included resources that are assigned to the Application Component.
     * </p>
     * <p>
     * Type: Array of strings
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>additionalInfo</code>
     * </p>
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note></li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>excludedResources</code> </b>
     * </p>
     * <p>
     * The list of logical resource identifiers to be excluded from the application.
     * </p>
     * <p>
     * Type: Array
     * </p>
     * <note>
     * <p>
     * Don't add the resources that you want to include.
     * </p>
     * </note>
     * <p>
     * Each <code>excludedResources</code> array item includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>logicalResourceIds</code> </i>
     * </p>
     * <p>
     * Logical identifier of the resource.
     * </p>
     * <p>
     * Type: Object
     * </p>
     * <note>
     * <p>
     * You can configure only one of the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>logicalStackName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceGroupName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terraformSourceName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eksSourceName</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * Each <code>logicalResourceIds</code> object includes the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>identifier</code>
     * </p>
     * <p>
     * Identifier of the resource.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>logicalStackName</code>
     * </p>
     * <p>
     * The name of the CloudFormation stack this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resourceGroupName</code>
     * </p>
     * <p>
     * The name of the resource group this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>terraformSourceName</code>
     * </p>
     * <p>
     * The name of the Terraform S3 state file this resource belongs to.
     * </p>
     * <p>
     * Type: String
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eksSourceName</code>
     * </p>
     * <p>
     * Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
     * </p>
     * <note>
     * <p>
     * This parameter accepts values in "eks-cluster/namespace" format.
     * </p>
     * </note>
     * <p>
     * Type: String
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>version</code> </b>
     * </p>
     * <p>
     * Resilience Hub application version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>additionalInfo</code>
     * </p>
     * <p>
     * Additional configuration parameters for an Resilience Hub application. If you want to implement
     * <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     * href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     * application configuration parameters</a>.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one
     * associated account.
     * </p>
     * <p>
     * Key: <code>"failover-regions"</code>
     * </p>
     * <p>
     * Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param appTemplateBody
     *        A JSON string that provides information about your application structure. To learn more about the
     *        <code>appTemplateBody</code> template, see the sample template provided in the <i>Examples</i>
     *        section.</p>
     *        <p>
     *        The <code>appTemplateBody</code> JSON string has the following structure:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>resources</code> </b>
     *        </p>
     *        <p>
     *        The list of logical resources that must be included in the Resilience Hub application.
     *        </p>
     *        <p>
     *        Type: Array
     *        </p>
     *        <note>
     *        <p>
     *        Don't add the resources that you want to exclude.
     *        </p>
     *        </note>
     *        <p>
     *        Each <code>resources</code> array item includes the following fields:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i> <code>logicalResourceId</code> </i>
     *        </p>
     *        <p>
     *        Logical identifier of the resource.
     *        </p>
     *        <p>
     *        Type: Object
     *        </p>
     *        <p>
     *        Each <code>logicalResourceId</code> object includes the following fields:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>identifier</code>
     *        </p>
     *        <p>
     *        Identifier of the resource.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>logicalStackName</code>
     *        </p>
     *        <p>
     *        The name of the CloudFormation stack this resource belongs to.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resourceGroupName</code>
     *        </p>
     *        <p>
     *        The name of the resource group this resource belongs to.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terraformSourceName</code>
     *        </p>
     *        <p>
     *        The name of the Terraform S3 state file this resource belongs to.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>eksSourceName</code>
     *        </p>
     *        <p>
     *        Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter accepts values in "eks-cluster/namespace" format.
     *        </p>
     *        </note>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>type</code> </i>
     *        </p>
     *        <p>
     *        The type of resource.
     *        </p>
     *        <p>
     *        Type: string
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>name</code> </i>
     *        </p>
     *        <p>
     *        The name of the resource.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>additionalInfo</code>
     *        </p>
     *        <p>
     *        Additional configuration parameters for an Resilience Hub application. If you want to implement
     *        <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *        href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *        application configuration parameters</a>.
     *        </p>
     *        <note>
     *        <p>
     *        Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and
     *        one associated account.
     *        </p>
     *        <p>
     *        Key: <code>"failover-regions"</code>
     *        </p>
     *        <p>
     *        Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     *        </p>
     *        </note></li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>appComponents</code> </b>
     *        </p>
     *        <p>
     *        List of Application Components that this resource belongs to. If an Application Component is not part of
     *        the Resilience Hub application, it will be added.
     *        </p>
     *        <p>
     *        Type: Array
     *        </p>
     *        <p>
     *        Each <code>appComponents</code> array item includes the following fields:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>name</code>
     *        </p>
     *        <p>
     *        Name of the Application Component.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code>
     *        </p>
     *        <p>
     *        Type of Application Component. For more information about the types of Application Component, see <a
     *        href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/AppComponent.grouping.html">Grouping
     *        resources in an AppComponent</a>.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resourceNames</code>
     *        </p>
     *        <p>
     *        The list of included resources that are assigned to the Application Component.
     *        </p>
     *        <p>
     *        Type: Array of strings
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>additionalInfo</code>
     *        </p>
     *        <p>
     *        Additional configuration parameters for an Resilience Hub application. If you want to implement
     *        <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *        href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *        application configuration parameters</a>.
     *        </p>
     *        <note>
     *        <p>
     *        Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and
     *        one associated account.
     *        </p>
     *        <p>
     *        Key: <code>"failover-regions"</code>
     *        </p>
     *        <p>
     *        Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     *        </p>
     *        </note></li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>excludedResources</code> </b>
     *        </p>
     *        <p>
     *        The list of logical resource identifiers to be excluded from the application.
     *        </p>
     *        <p>
     *        Type: Array
     *        </p>
     *        <note>
     *        <p>
     *        Don't add the resources that you want to include.
     *        </p>
     *        </note>
     *        <p>
     *        Each <code>excludedResources</code> array item includes the following fields:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i> <code>logicalResourceIds</code> </i>
     *        </p>
     *        <p>
     *        Logical identifier of the resource.
     *        </p>
     *        <p>
     *        Type: Object
     *        </p>
     *        <note>
     *        <p>
     *        You can configure only one of the following fields:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>logicalStackName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resourceGroupName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terraformSourceName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>eksSourceName</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </note>
     *        <p>
     *        Each <code>logicalResourceIds</code> object includes the following fields:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>identifier</code>
     *        </p>
     *        <p>
     *        Identifier of the resource.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>logicalStackName</code>
     *        </p>
     *        <p>
     *        The name of the CloudFormation stack this resource belongs to.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resourceGroupName</code>
     *        </p>
     *        <p>
     *        The name of the resource group this resource belongs to.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>terraformSourceName</code>
     *        </p>
     *        <p>
     *        The name of the Terraform S3 state file this resource belongs to.
     *        </p>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>eksSourceName</code>
     *        </p>
     *        <p>
     *        Name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.
     *        </p>
     *        <note>
     *        <p>
     *        This parameter accepts values in "eks-cluster/namespace" format.
     *        </p>
     *        </note>
     *        <p>
     *        Type: String
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>version</code> </b>
     *        </p>
     *        <p>
     *        Resilience Hub application version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>additionalInfo</code>
     *        </p>
     *        <p>
     *        Additional configuration parameters for an Resilience Hub application. If you want to implement
     *        <code>additionalInfo</code> through the Resilience Hub console rather than using an API call, see <a
     *        href="https://docs.aws.amazon.com/resilience-hub/latest/userguide/app-config-param.html">Configure the
     *        application configuration parameters</a>.
     *        </p>
     *        <note>
     *        <p>
     *        Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and
     *        one associated account.
     *        </p>
     *        <p>
     *        Key: <code>"failover-regions"</code>
     *        </p>
     *        <p>
     *        Value: <code>"[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"</code>
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDraftAppVersionTemplateRequest withAppTemplateBody(String appTemplateBody) {
        setAppTemplateBody(appTemplateBody);
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
        if (getAppArn() != null)
            sb.append("AppArn: ").append(getAppArn()).append(",");
        if (getAppTemplateBody() != null)
            sb.append("AppTemplateBody: ").append(getAppTemplateBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDraftAppVersionTemplateRequest == false)
            return false;
        PutDraftAppVersionTemplateRequest other = (PutDraftAppVersionTemplateRequest) obj;
        if (other.getAppArn() == null ^ this.getAppArn() == null)
            return false;
        if (other.getAppArn() != null && other.getAppArn().equals(this.getAppArn()) == false)
            return false;
        if (other.getAppTemplateBody() == null ^ this.getAppTemplateBody() == null)
            return false;
        if (other.getAppTemplateBody() != null && other.getAppTemplateBody().equals(this.getAppTemplateBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppArn() == null) ? 0 : getAppArn().hashCode());
        hashCode = prime * hashCode + ((getAppTemplateBody() == null) ? 0 : getAppTemplateBody().hashCode());
        return hashCode;
    }

    @Override
    public PutDraftAppVersionTemplateRequest clone() {
        return (PutDraftAppVersionTemplateRequest) super.clone();
    }

}
