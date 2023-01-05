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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPrincipals" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPrincipalsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies that you want to list information for only resource shares that match the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>SELF</code> </b> – principals that your account is sharing resources with
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER-ACCOUNTS</code> </b> – principals that are sharing resources with your account
     * </p>
     * </li>
     * </ul>
     */
    private String resourceOwner;
    /**
     * <p>
     * Specifies that you want to list principal information for the resource share with the specified <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name (ARN)</a>.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Specifies that you want to list information for only the listed principals.
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
     * Specifies that you want to list information for only principals associated with resource shares that include the
     * specified resource type.
     * </p>
     * <p>
     * For a list of valid values, query the <a>ListResourceTypes</a> operation.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Specifies that you want to list information for only principals associated with the resource shares specified by
     * a list the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     * Names (ARNs)</a>.
     * </p>
     */
    private java.util.List<String> resourceShareArns;
    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Specifies that you want to list information for only resource shares that match the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>SELF</code> </b> – principals that your account is sharing resources with
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER-ACCOUNTS</code> </b> – principals that are sharing resources with your account
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceOwner
     *        Specifies that you want to list information for only resource shares that match the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>SELF</code> </b> – principals that your account is sharing resources with
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>OTHER-ACCOUNTS</code> </b> – principals that are sharing resources with your account
     *        </p>
     *        </li>
     * @see ResourceOwner
     */

    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * Specifies that you want to list information for only resource shares that match the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>SELF</code> </b> – principals that your account is sharing resources with
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER-ACCOUNTS</code> </b> – principals that are sharing resources with your account
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies that you want to list information for only resource shares that match the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>SELF</code> </b> – principals that your account is sharing resources with
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>OTHER-ACCOUNTS</code> </b> – principals that are sharing resources with your account
     *         </p>
     *         </li>
     * @see ResourceOwner
     */

    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * <p>
     * Specifies that you want to list information for only resource shares that match the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>SELF</code> </b> – principals that your account is sharing resources with
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER-ACCOUNTS</code> </b> – principals that are sharing resources with your account
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceOwner
     *        Specifies that you want to list information for only resource shares that match the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>SELF</code> </b> – principals that your account is sharing resources with
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>OTHER-ACCOUNTS</code> </b> – principals that are sharing resources with your account
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceOwner
     */

    public ListPrincipalsRequest withResourceOwner(String resourceOwner) {
        setResourceOwner(resourceOwner);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list information for only resource shares that match the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>SELF</code> </b> – principals that your account is sharing resources with
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER-ACCOUNTS</code> </b> – principals that are sharing resources with your account
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceOwner
     *        Specifies that you want to list information for only resource shares that match the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>SELF</code> </b> – principals that your account is sharing resources with
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>OTHER-ACCOUNTS</code> </b> – principals that are sharing resources with your account
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceOwner
     */

    public ListPrincipalsRequest withResourceOwner(ResourceOwner resourceOwner) {
        this.resourceOwner = resourceOwner.toString();
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list principal information for the resource share with the specified <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name (ARN)</a>.
     * </p>
     * 
     * @param resourceArn
     *        Specifies that you want to list principal information for the resource share with the specified <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     *        (ARN)</a>.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * Specifies that you want to list principal information for the resource share with the specified <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name (ARN)</a>.
     * </p>
     * 
     * @return Specifies that you want to list principal information for the resource share with the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     *         (ARN)</a>.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * Specifies that you want to list principal information for the resource share with the specified <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name (ARN)</a>.
     * </p>
     * 
     * @param resourceArn
     *        Specifies that you want to list principal information for the resource share with the specified <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure Name
     *        (ARN)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrincipalsRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list information for only the listed principals.
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
     * @return Specifies that you want to list information for only the listed principals.</p>
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
     * Specifies that you want to list information for only the listed principals.
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
     *        Specifies that you want to list information for only the listed principals.</p>
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
     * Specifies that you want to list information for only the listed principals.
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
     *        Specifies that you want to list information for only the listed principals.</p>
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

    public ListPrincipalsRequest withPrincipals(String... principals) {
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
     * Specifies that you want to list information for only the listed principals.
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
     *        Specifies that you want to list information for only the listed principals.</p>
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

    public ListPrincipalsRequest withPrincipals(java.util.Collection<String> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list information for only principals associated with resource shares that include the
     * specified resource type.
     * </p>
     * <p>
     * For a list of valid values, query the <a>ListResourceTypes</a> operation.
     * </p>
     * 
     * @param resourceType
     *        Specifies that you want to list information for only principals associated with resource shares that
     *        include the specified resource type.</p>
     *        <p>
     *        For a list of valid values, query the <a>ListResourceTypes</a> operation.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Specifies that you want to list information for only principals associated with resource shares that include the
     * specified resource type.
     * </p>
     * <p>
     * For a list of valid values, query the <a>ListResourceTypes</a> operation.
     * </p>
     * 
     * @return Specifies that you want to list information for only principals associated with resource shares that
     *         include the specified resource type.</p>
     *         <p>
     *         For a list of valid values, query the <a>ListResourceTypes</a> operation.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Specifies that you want to list information for only principals associated with resource shares that include the
     * specified resource type.
     * </p>
     * <p>
     * For a list of valid values, query the <a>ListResourceTypes</a> operation.
     * </p>
     * 
     * @param resourceType
     *        Specifies that you want to list information for only principals associated with resource shares that
     *        include the specified resource type.</p>
     *        <p>
     *        For a list of valid values, query the <a>ListResourceTypes</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrincipalsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list information for only principals associated with the resource shares specified by
     * a list the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     * Names (ARNs)</a>.
     * </p>
     * 
     * @return Specifies that you want to list information for only principals associated with the resource shares
     *         specified by a list the <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a>.
     */

    public java.util.List<String> getResourceShareArns() {
        return resourceShareArns;
    }

    /**
     * <p>
     * Specifies that you want to list information for only principals associated with the resource shares specified by
     * a list the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     * Names (ARNs)</a>.
     * </p>
     * 
     * @param resourceShareArns
     *        Specifies that you want to list information for only principals associated with the resource shares
     *        specified by a list the <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a>.
     */

    public void setResourceShareArns(java.util.Collection<String> resourceShareArns) {
        if (resourceShareArns == null) {
            this.resourceShareArns = null;
            return;
        }

        this.resourceShareArns = new java.util.ArrayList<String>(resourceShareArns);
    }

    /**
     * <p>
     * Specifies that you want to list information for only principals associated with the resource shares specified by
     * a list the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     * Names (ARNs)</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceShareArns(java.util.Collection)} or {@link #withResourceShareArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceShareArns
     *        Specifies that you want to list information for only principals associated with the resource shares
     *        specified by a list the <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrincipalsRequest withResourceShareArns(String... resourceShareArns) {
        if (this.resourceShareArns == null) {
            setResourceShareArns(new java.util.ArrayList<String>(resourceShareArns.length));
        }
        for (String ele : resourceShareArns) {
            this.resourceShareArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list information for only principals associated with the resource shares specified by
     * a list the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource
     * Names (ARNs)</a>.
     * </p>
     * 
     * @param resourceShareArns
     *        Specifies that you want to list information for only principals associated with the resource shares
     *        specified by a list the <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrincipalsRequest withResourceShareArns(java.util.Collection<String> resourceShareArns) {
        setResourceShareArns(resourceShareArns);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies that you want to receive the next page of results. Valid only if you received a
     *        <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *        available. Set this parameter to the value provided by the previous call's <code>NextToken</code> response
     *        to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @return Specifies that you want to receive the next page of results. Valid only if you received a
     *         <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *         available. Set this parameter to the value provided by the previous call's <code>NextToken</code>
     *         response to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies that you want to receive the next page of results. Valid only if you received a
     *        <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *        available. Set this parameter to the value provided by the previous call's <code>NextToken</code> response
     *        to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrincipalsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @param maxResults
     *        Specifies the total number of results that you want included on each page of the response. If you do not
     *        include this parameter, it defaults to a value that is specific to the operation. If additional items
     *        exist beyond the number you specify, the <code>NextToken</code> response element is returned with a value
     *        (not null). Include the specified value as the <code>NextToken</code> request parameter in the next call
     *        to the operation to get the next part of the results. Note that the service might return fewer results
     *        than the maximum even when there are more results available. You should check <code>NextToken</code> after
     *        every operation to ensure that you receive all of the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @return Specifies the total number of results that you want included on each page of the response. If you do not
     *         include this parameter, it defaults to a value that is specific to the operation. If additional items
     *         exist beyond the number you specify, the <code>NextToken</code> response element is returned with a value
     *         (not null). Include the specified value as the <code>NextToken</code> request parameter in the next call
     *         to the operation to get the next part of the results. Note that the service might return fewer results
     *         than the maximum even when there are more results available. You should check <code>NextToken</code>
     *         after every operation to ensure that you receive all of the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @param maxResults
     *        Specifies the total number of results that you want included on each page of the response. If you do not
     *        include this parameter, it defaults to a value that is specific to the operation. If additional items
     *        exist beyond the number you specify, the <code>NextToken</code> response element is returned with a value
     *        (not null). Include the specified value as the <code>NextToken</code> request parameter in the next call
     *        to the operation to get the next part of the results. Note that the service might return fewer results
     *        than the maximum even when there are more results available. You should check <code>NextToken</code> after
     *        every operation to ensure that you receive all of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPrincipalsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getResourceOwner() != null)
            sb.append("ResourceOwner: ").append(getResourceOwner()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceShareArns() != null)
            sb.append("ResourceShareArns: ").append(getResourceShareArns()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPrincipalsRequest == false)
            return false;
        ListPrincipalsRequest other = (ListPrincipalsRequest) obj;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceShareArns() == null ^ this.getResourceShareArns() == null)
            return false;
        if (other.getResourceShareArns() != null && other.getResourceShareArns().equals(this.getResourceShareArns()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceShareArns() == null) ? 0 : getResourceShareArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListPrincipalsRequest clone() {
        return (ListPrincipalsRequest) super.clone();
    }

}
