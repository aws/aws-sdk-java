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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/CreateResourceShare" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResourceShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the name of the resource share.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies a list of one or more ARNs of the resources to associate with the resource share.
     * </p>
     */
    private java.util.List<String> resourceArns;
    /**
     * <p>
     * Specifies a list of one or more principals to associate with the resource share.
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
     * Specifies one or more tags to attach to the resource share itself. It doesn't attach the tags to the resources
     * associated with the resource share.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Specifies whether principals outside your organization in Organizations can be associated with a resource share.
     * A value of <code>true</code> lets you share with individual Amazon Web Services accounts that are <i>not</i> in
     * your organization. A value of <code>false</code> only has meaning if your account is a member of an Amazon Web
     * Services Organization. The default value is <code>true</code>.
     * </p>
     */
    private Boolean allowExternalPrincipals;
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
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of the RAM permission to associate with the resource share. If you do not specify an
     * ARN for the permission, RAM automatically attaches the default version of the permission for each resource type.
     * You can associate only one permission with each resource type included in the resource share.
     * </p>
     */
    private java.util.List<String> permissionArns;

    /**
     * <p>
     * Specifies the name of the resource share.
     * </p>
     * 
     * @param name
     *        Specifies the name of the resource share.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name of the resource share.
     * </p>
     * 
     * @return Specifies the name of the resource share.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name of the resource share.
     * </p>
     * 
     * @param name
     *        Specifies the name of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies a list of one or more ARNs of the resources to associate with the resource share.
     * </p>
     * 
     * @return Specifies a list of one or more ARNs of the resources to associate with the resource share.
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * Specifies a list of one or more ARNs of the resources to associate with the resource share.
     * </p>
     * 
     * @param resourceArns
     *        Specifies a list of one or more ARNs of the resources to associate with the resource share.
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
     * Specifies a list of one or more ARNs of the resources to associate with the resource share.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        Specifies a list of one or more ARNs of the resources to associate with the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withResourceArns(String... resourceArns) {
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
     * Specifies a list of one or more ARNs of the resources to associate with the resource share.
     * </p>
     * 
     * @param resourceArns
     *        Specifies a list of one or more ARNs of the resources to associate with the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * Specifies a list of one or more principals to associate with the resource share.
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
     * @return Specifies a list of one or more principals to associate with the resource share.</p>
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
     * Specifies a list of one or more principals to associate with the resource share.
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
     *        Specifies a list of one or more principals to associate with the resource share.</p>
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
     * Specifies a list of one or more principals to associate with the resource share.
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
     *        Specifies a list of one or more principals to associate with the resource share.</p>
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

    public CreateResourceShareRequest withPrincipals(String... principals) {
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
     * Specifies a list of one or more principals to associate with the resource share.
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
     *        Specifies a list of one or more principals to associate with the resource share.</p>
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

    public CreateResourceShareRequest withPrincipals(java.util.Collection<String> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * Specifies one or more tags to attach to the resource share itself. It doesn't attach the tags to the resources
     * associated with the resource share.
     * </p>
     * 
     * @return Specifies one or more tags to attach to the resource share itself. It doesn't attach the tags to the
     *         resources associated with the resource share.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies one or more tags to attach to the resource share itself. It doesn't attach the tags to the resources
     * associated with the resource share.
     * </p>
     * 
     * @param tags
     *        Specifies one or more tags to attach to the resource share itself. It doesn't attach the tags to the
     *        resources associated with the resource share.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Specifies one or more tags to attach to the resource share itself. It doesn't attach the tags to the resources
     * associated with the resource share.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies one or more tags to attach to the resource share itself. It doesn't attach the tags to the
     *        resources associated with the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies one or more tags to attach to the resource share itself. It doesn't attach the tags to the resources
     * associated with the resource share.
     * </p>
     * 
     * @param tags
     *        Specifies one or more tags to attach to the resource share itself. It doesn't attach the tags to the
     *        resources associated with the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies whether principals outside your organization in Organizations can be associated with a resource share.
     * A value of <code>true</code> lets you share with individual Amazon Web Services accounts that are <i>not</i> in
     * your organization. A value of <code>false</code> only has meaning if your account is a member of an Amazon Web
     * Services Organization. The default value is <code>true</code>.
     * </p>
     * 
     * @param allowExternalPrincipals
     *        Specifies whether principals outside your organization in Organizations can be associated with a resource
     *        share. A value of <code>true</code> lets you share with individual Amazon Web Services accounts that are
     *        <i>not</i> in your organization. A value of <code>false</code> only has meaning if your account is a
     *        member of an Amazon Web Services Organization. The default value is <code>true</code>.
     */

    public void setAllowExternalPrincipals(Boolean allowExternalPrincipals) {
        this.allowExternalPrincipals = allowExternalPrincipals;
    }

    /**
     * <p>
     * Specifies whether principals outside your organization in Organizations can be associated with a resource share.
     * A value of <code>true</code> lets you share with individual Amazon Web Services accounts that are <i>not</i> in
     * your organization. A value of <code>false</code> only has meaning if your account is a member of an Amazon Web
     * Services Organization. The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether principals outside your organization in Organizations can be associated with a resource
     *         share. A value of <code>true</code> lets you share with individual Amazon Web Services accounts that are
     *         <i>not</i> in your organization. A value of <code>false</code> only has meaning if your account is a
     *         member of an Amazon Web Services Organization. The default value is <code>true</code>.
     */

    public Boolean getAllowExternalPrincipals() {
        return this.allowExternalPrincipals;
    }

    /**
     * <p>
     * Specifies whether principals outside your organization in Organizations can be associated with a resource share.
     * A value of <code>true</code> lets you share with individual Amazon Web Services accounts that are <i>not</i> in
     * your organization. A value of <code>false</code> only has meaning if your account is a member of an Amazon Web
     * Services Organization. The default value is <code>true</code>.
     * </p>
     * 
     * @param allowExternalPrincipals
     *        Specifies whether principals outside your organization in Organizations can be associated with a resource
     *        share. A value of <code>true</code> lets you share with individual Amazon Web Services accounts that are
     *        <i>not</i> in your organization. A value of <code>false</code> only has meaning if your account is a
     *        member of an Amazon Web Services Organization. The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withAllowExternalPrincipals(Boolean allowExternalPrincipals) {
        setAllowExternalPrincipals(allowExternalPrincipals);
        return this;
    }

    /**
     * <p>
     * Specifies whether principals outside your organization in Organizations can be associated with a resource share.
     * A value of <code>true</code> lets you share with individual Amazon Web Services accounts that are <i>not</i> in
     * your organization. A value of <code>false</code> only has meaning if your account is a member of an Amazon Web
     * Services Organization. The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies whether principals outside your organization in Organizations can be associated with a resource
     *         share. A value of <code>true</code> lets you share with individual Amazon Web Services accounts that are
     *         <i>not</i> in your organization. A value of <code>false</code> only has meaning if your account is a
     *         member of an Amazon Web Services Organization. The default value is <code>true</code>.
     */

    public Boolean isAllowExternalPrincipals() {
        return this.allowExternalPrincipals;
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

    public CreateResourceShareRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of the RAM permission to associate with the resource share. If you do not specify an
     * ARN for the permission, RAM automatically attaches the default version of the permission for each resource type.
     * You can associate only one permission with each resource type included in the resource share.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs)</a> of the RAM permission to associate with the resource share. If you do not
     *         specify an ARN for the permission, RAM automatically attaches the default version of the permission for
     *         each resource type. You can associate only one permission with each resource type included in the
     *         resource share.
     */

    public java.util.List<String> getPermissionArns() {
        return permissionArns;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of the RAM permission to associate with the resource share. If you do not specify an
     * ARN for the permission, RAM automatically attaches the default version of the permission for each resource type.
     * You can associate only one permission with each resource type included in the resource share.
     * </p>
     * 
     * @param permissionArns
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Names (ARNs)</a> of the RAM permission to associate with the resource share. If you do not
     *        specify an ARN for the permission, RAM automatically attaches the default version of the permission for
     *        each resource type. You can associate only one permission with each resource type included in the resource
     *        share.
     */

    public void setPermissionArns(java.util.Collection<String> permissionArns) {
        if (permissionArns == null) {
            this.permissionArns = null;
            return;
        }

        this.permissionArns = new java.util.ArrayList<String>(permissionArns);
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of the RAM permission to associate with the resource share. If you do not specify an
     * ARN for the permission, RAM automatically attaches the default version of the permission for each resource type.
     * You can associate only one permission with each resource type included in the resource share.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissionArns(java.util.Collection)} or {@link #withPermissionArns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param permissionArns
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Names (ARNs)</a> of the RAM permission to associate with the resource share. If you do not
     *        specify an ARN for the permission, RAM automatically attaches the default version of the permission for
     *        each resource type. You can associate only one permission with each resource type included in the resource
     *        share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withPermissionArns(String... permissionArns) {
        if (this.permissionArns == null) {
            setPermissionArns(new java.util.ArrayList<String>(permissionArns.length));
        }
        for (String ele : permissionArns) {
            this.permissionArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs)</a> of the RAM permission to associate with the resource share. If you do not specify an
     * ARN for the permission, RAM automatically attaches the default version of the permission for each resource type.
     * You can associate only one permission with each resource type included in the resource share.
     * </p>
     * 
     * @param permissionArns
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Names (ARNs)</a> of the RAM permission to associate with the resource share. If you do not
     *        specify an ARN for the permission, RAM automatically attaches the default version of the permission for
     *        each resource type. You can associate only one permission with each resource type included in the resource
     *        share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceShareRequest withPermissionArns(java.util.Collection<String> permissionArns) {
        setPermissionArns(permissionArns);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAllowExternalPrincipals() != null)
            sb.append("AllowExternalPrincipals: ").append(getAllowExternalPrincipals()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getPermissionArns() != null)
            sb.append("PermissionArns: ").append(getPermissionArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourceShareRequest == false)
            return false;
        CreateResourceShareRequest other = (CreateResourceShareRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAllowExternalPrincipals() == null ^ this.getAllowExternalPrincipals() == null)
            return false;
        if (other.getAllowExternalPrincipals() != null && other.getAllowExternalPrincipals().equals(this.getAllowExternalPrincipals()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getPermissionArns() == null ^ this.getPermissionArns() == null)
            return false;
        if (other.getPermissionArns() != null && other.getPermissionArns().equals(this.getPermissionArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAllowExternalPrincipals() == null) ? 0 : getAllowExternalPrincipals().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getPermissionArns() == null) ? 0 : getPermissionArns().hashCode());
        return hashCode;
    }

    @Override
    public CreateResourceShareRequest clone() {
        return (CreateResourceShareRequest) super.clone();
    }

}
