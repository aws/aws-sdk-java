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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/AssociateResourceShare" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateResourceShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the resource share that you want to add principals or resources to.
     * </p>
     */
    private String resourceShareArn;
    /**
     * <p>
     * Specifies a list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of the resources that you want to share. This can be <code>null</code> if you want to
     * add only principals.
     * </p>
     */
    private java.util.List<String> resourceArns;
    /**
     * <p>
     * Specifies a list of principals to whom you want to the resource share. This can be <code>null</code> if you want
     * to add only resources.
     * </p>
     * <p>
     * What the principals can do with the resources in the share is determined by the RAM permissions that you
     * associate with the resource share. See <a>AssociateResourceSharePermission</a>.
     * </p>
     * <p>
     * You can include the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Web Services account ID, for example: <code>123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of an organization in Organizations, for example:
     * <code>organizations::123456789012:organization/o-exampleorgid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An ARN of an organizational unit (OU) in Organizations, for example:
     * <code>organizations::123456789012:ou/o-exampleorgid/ou-examplerootid-exampleouid123</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An ARN of an IAM role, for example: <code>iam::123456789012:role/rolename</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An ARN of an IAM user, for example: <code>iam::123456789012user/username</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Not all resource types can be shared with IAM roles and users. For more information, see <a href=
     * "https://docs.aws.amazon.com/ram/latest/userguide/permissions.html#permissions-rbp-supported-resource-types"
     * >Sharing with IAM roles and users</a> in the <i>Resource Access Manager User Guide</i>.
     * </p>
     * </note>
     */
    private java.util.List<String> principals;
    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the resource share that you want to add principals or resources to.
     * </p>
     * 
     * @param resourceShareArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resoure Name (ARN)</a> of the resource share that you want to add principals or resources to.
     */

    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the resource share that you want to add principals or resources to.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resoure Name (ARN)</a> of the resource share that you want to add principals or resources to.
     */

    public String getResourceShareArn() {
        return this.resourceShareArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the resource share that you want to add principals or resources to.
     * </p>
     * 
     * @param resourceShareArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resoure Name (ARN)</a> of the resource share that you want to add principals or resources to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceShareRequest withResourceShareArn(String resourceShareArn) {
        setResourceShareArn(resourceShareArn);
        return this;
    }

    /**
     * <p>
     * Specifies a list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of the resources that you want to share. This can be <code>null</code> if you want to
     * add only principals.
     * </p>
     * 
     * @return Specifies a list of <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> of the resources that you want to share. This can be <code>null</code> if you want to add only
     *         principals.
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * Specifies a list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of the resources that you want to share. This can be <code>null</code> if you want to
     * add only principals.
     * </p>
     * 
     * @param resourceArns
     *        Specifies a list of <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> of the resources that you want to share. This can be <code>null</code> if you want to add only
     *        principals.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * Specifies a list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of the resources that you want to share. This can be <code>null</code> if you want to
     * add only principals.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        Specifies a list of <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> of the resources that you want to share. This can be <code>null</code> if you want to add only
     *        principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceShareRequest withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new java.util.ArrayList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a list of <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of the resources that you want to share. This can be <code>null</code> if you want to
     * add only principals.
     * </p>
     * 
     * @param resourceArns
     *        Specifies a list of <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> of the resources that you want to share. This can be <code>null</code> if you want to add only
     *        principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceShareRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * Specifies a list of principals to whom you want to the resource share. This can be <code>null</code> if you want
     * to add only resources.
     * </p>
     * <p>
     * What the principals can do with the resources in the share is determined by the RAM permissions that you
     * associate with the resource share. See <a>AssociateResourceSharePermission</a>.
     * </p>
     * <p>
     * You can include the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Web Services account ID, for example: <code>123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of an organization in Organizations, for example:
     * <code>organizations::123456789012:organization/o-exampleorgid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An ARN of an organizational unit (OU) in Organizations, for example:
     * <code>organizations::123456789012:ou/o-exampleorgid/ou-examplerootid-exampleouid123</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An ARN of an IAM role, for example: <code>iam::123456789012:role/rolename</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An ARN of an IAM user, for example: <code>iam::123456789012user/username</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Not all resource types can be shared with IAM roles and users. For more information, see <a href=
     * "https://docs.aws.amazon.com/ram/latest/userguide/permissions.html#permissions-rbp-supported-resource-types"
     * >Sharing with IAM roles and users</a> in the <i>Resource Access Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @return Specifies a list of principals to whom you want to the resource share. This can be <code>null</code> if
     *         you want to add only resources.</p>
     *         <p>
     *         What the principals can do with the resources in the share is determined by the RAM permissions that you
     *         associate with the resource share. See <a>AssociateResourceSharePermission</a>.
     *         </p>
     *         <p>
     *         You can include the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         An Amazon Web Services account ID, for example: <code>123456789012</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *         Name (ARN)</a> of an organization in Organizations, for example:
     *         <code>organizations::123456789012:organization/o-exampleorgid</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An ARN of an organizational unit (OU) in Organizations, for example:
     *         <code>organizations::123456789012:ou/o-exampleorgid/ou-examplerootid-exampleouid123</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An ARN of an IAM role, for example: <code>iam::123456789012:role/rolename</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         An ARN of an IAM user, for example: <code>iam::123456789012user/username</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Not all resource types can be shared with IAM roles and users. For more information, see <a href=
     *         "https://docs.aws.amazon.com/ram/latest/userguide/permissions.html#permissions-rbp-supported-resource-types"
     *         >Sharing with IAM roles and users</a> in the <i>Resource Access Manager User Guide</i>.
     *         </p>
     */

    public java.util.List<String> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * Specifies a list of principals to whom you want to the resource share. This can be <code>null</code> if you want
     * to add only resources.
     * </p>
     * <p>
     * What the principals can do with the resources in the share is determined by the RAM permissions that you
     * associate with the resource share. See <a>AssociateResourceSharePermission</a>.
     * </p>
     * <p>
     * You can include the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Web Services account ID, for example: <code>123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of an organization in Organizations, for example:
     * <code>organizations::123456789012:organization/o-exampleorgid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An ARN of an organizational unit (OU) in Organizations, for example:
     * <code>organizations::123456789012:ou/o-exampleorgid/ou-examplerootid-exampleouid123</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An ARN of an IAM role, for example: <code>iam::123456789012:role/rolename</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An ARN of an IAM user, for example: <code>iam::123456789012user/username</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Not all resource types can be shared with IAM roles and users. For more information, see <a href=
     * "https://docs.aws.amazon.com/ram/latest/userguide/permissions.html#permissions-rbp-supported-resource-types"
     * >Sharing with IAM roles and users</a> in the <i>Resource Access Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @param principals
     *        Specifies a list of principals to whom you want to the resource share. This can be <code>null</code> if
     *        you want to add only resources.</p>
     *        <p>
     *        What the principals can do with the resources in the share is determined by the RAM permissions that you
     *        associate with the resource share. See <a>AssociateResourceSharePermission</a>.
     *        </p>
     *        <p>
     *        You can include the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An Amazon Web Services account ID, for example: <code>123456789012</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of an organization in Organizations, for example:
     *        <code>organizations::123456789012:organization/o-exampleorgid</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An ARN of an organizational unit (OU) in Organizations, for example:
     *        <code>organizations::123456789012:ou/o-exampleorgid/ou-examplerootid-exampleouid123</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An ARN of an IAM role, for example: <code>iam::123456789012:role/rolename</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An ARN of an IAM user, for example: <code>iam::123456789012user/username</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Not all resource types can be shared with IAM roles and users. For more information, see <a href=
     *        "https://docs.aws.amazon.com/ram/latest/userguide/permissions.html#permissions-rbp-supported-resource-types"
     *        >Sharing with IAM roles and users</a> in the <i>Resource Access Manager User Guide</i>.
     *        </p>
     */

    public void setPrincipals(java.util.Collection<String> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<String>(principals);
    }

    /**
     * <p>
     * Specifies a list of principals to whom you want to the resource share. This can be <code>null</code> if you want
     * to add only resources.
     * </p>
     * <p>
     * What the principals can do with the resources in the share is determined by the RAM permissions that you
     * associate with the resource share. See <a>AssociateResourceSharePermission</a>.
     * </p>
     * <p>
     * You can include the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Web Services account ID, for example: <code>123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of an organization in Organizations, for example:
     * <code>organizations::123456789012:organization/o-exampleorgid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An ARN of an organizational unit (OU) in Organizations, for example:
     * <code>organizations::123456789012:ou/o-exampleorgid/ou-examplerootid-exampleouid123</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An ARN of an IAM role, for example: <code>iam::123456789012:role/rolename</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An ARN of an IAM user, for example: <code>iam::123456789012user/username</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Not all resource types can be shared with IAM roles and users. For more information, see <a href=
     * "https://docs.aws.amazon.com/ram/latest/userguide/permissions.html#permissions-rbp-supported-resource-types"
     * >Sharing with IAM roles and users</a> in the <i>Resource Access Manager User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        Specifies a list of principals to whom you want to the resource share. This can be <code>null</code> if
     *        you want to add only resources.</p>
     *        <p>
     *        What the principals can do with the resources in the share is determined by the RAM permissions that you
     *        associate with the resource share. See <a>AssociateResourceSharePermission</a>.
     *        </p>
     *        <p>
     *        You can include the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An Amazon Web Services account ID, for example: <code>123456789012</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of an organization in Organizations, for example:
     *        <code>organizations::123456789012:organization/o-exampleorgid</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An ARN of an organizational unit (OU) in Organizations, for example:
     *        <code>organizations::123456789012:ou/o-exampleorgid/ou-examplerootid-exampleouid123</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An ARN of an IAM role, for example: <code>iam::123456789012:role/rolename</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An ARN of an IAM user, for example: <code>iam::123456789012user/username</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Not all resource types can be shared with IAM roles and users. For more information, see <a href=
     *        "https://docs.aws.amazon.com/ram/latest/userguide/permissions.html#permissions-rbp-supported-resource-types"
     *        >Sharing with IAM roles and users</a> in the <i>Resource Access Manager User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceShareRequest withPrincipals(String... principals) {
        if (this.principals == null) {
            setPrincipals(new java.util.ArrayList<String>(principals.length));
        }
        for (String ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a list of principals to whom you want to the resource share. This can be <code>null</code> if you want
     * to add only resources.
     * </p>
     * <p>
     * What the principals can do with the resources in the share is determined by the RAM permissions that you
     * associate with the resource share. See <a>AssociateResourceSharePermission</a>.
     * </p>
     * <p>
     * You can include the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Web Services account ID, for example: <code>123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     * (ARN)</a> of an organization in Organizations, for example:
     * <code>organizations::123456789012:organization/o-exampleorgid</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An ARN of an organizational unit (OU) in Organizations, for example:
     * <code>organizations::123456789012:ou/o-exampleorgid/ou-examplerootid-exampleouid123</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An ARN of an IAM role, for example: <code>iam::123456789012:role/rolename</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * An ARN of an IAM user, for example: <code>iam::123456789012user/username</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Not all resource types can be shared with IAM roles and users. For more information, see <a href=
     * "https://docs.aws.amazon.com/ram/latest/userguide/permissions.html#permissions-rbp-supported-resource-types"
     * >Sharing with IAM roles and users</a> in the <i>Resource Access Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @param principals
     *        Specifies a list of principals to whom you want to the resource share. This can be <code>null</code> if
     *        you want to add only resources.</p>
     *        <p>
     *        What the principals can do with the resources in the share is determined by the RAM permissions that you
     *        associate with the resource share. See <a>AssociateResourceSharePermission</a>.
     *        </p>
     *        <p>
     *        You can include the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An Amazon Web Services account ID, for example: <code>123456789012</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     *        Name (ARN)</a> of an organization in Organizations, for example:
     *        <code>organizations::123456789012:organization/o-exampleorgid</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An ARN of an organizational unit (OU) in Organizations, for example:
     *        <code>organizations::123456789012:ou/o-exampleorgid/ou-examplerootid-exampleouid123</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An ARN of an IAM role, for example: <code>iam::123456789012:role/rolename</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        An ARN of an IAM user, for example: <code>iam::123456789012user/username</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Not all resource types can be shared with IAM roles and users. For more information, see <a href=
     *        "https://docs.aws.amazon.com/ram/latest/userguide/permissions.html#permissions-rbp-supported-resource-types"
     *        >Sharing with IAM roles and users</a> in the <i>Resource Access Manager User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceShareRequest withPrincipals(java.util.Collection<String> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *        This lets you safely retry the request without accidentally performing the same operation a second time.
     *        Passing the same value to a later call to an operation requires that you also pass the same value for all
     *        other parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * 
     * @return Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *         This lets you safely retry the request without accidentally performing the same operation a second time.
     *         Passing the same value to a later call to an operation requires that you also pass the same value for all
     *         other parameters. We recommend that you use a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *         <p>
     *         If you don't provide this value, then Amazon Web Services generates a random one for you.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value.</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *        This lets you safely retry the request without accidentally performing the same operation a second time.
     *        Passing the same value to a later call to an operation requires that you also pass the same value for all
     *        other parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value.</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateResourceShareRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getResourceShareArn() != null)
            sb.append("ResourceShareArn: ").append(getResourceShareArn()).append(",");
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateResourceShareRequest == false)
            return false;
        AssociateResourceShareRequest other = (AssociateResourceShareRequest) obj;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public AssociateResourceShareRequest clone() {
        return (AssociateResourceShareRequest) super.clone();
    }

}
