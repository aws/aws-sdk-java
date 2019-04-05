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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateRole" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRoleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character (\u007F),
     * including most punctuation characters, digits, and upper and lowercased letters.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The name of the role to create.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * <p>
     * Role names are not distinguished by case. For example, you cannot create roles named both "PRODROLE" and
     * "prodrole".
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The trust relationship policy document that grants an entity permission to assume the role.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     */
    private String assumeRolePolicyDocument;
    /**
     * <p>
     * A description of the role.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a
     * value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to
     * 12 hours.
     * </p>
     * <p>
     * Anyone who assumes the role from the AWS CLI or API can use the <code>DurationSeconds</code> API parameter or the
     * <code>duration-seconds</code> CLI parameter to request a longer session. The <code>MaxSessionDuration</code>
     * setting determines the maximum duration that can be requested using the <code>DurationSeconds</code> parameter.
     * If users don't specify a value for the <code>DurationSeconds</code> parameter, their security credentials are
     * valid for one hour by default. This applies when you use the <code>AssumeRole*</code> API operations or the
     * <code>assume-role*</code> CLI operations but does not apply when you use those operations to create a console
     * URL. For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using
     * IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private Integer maxSessionDuration;
    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for the role.
     * </p>
     */
    private String permissionsBoundary;
    /**
     * <p>
     * A list of tags that you want to attach to the newly created role. Each tag consists of a key name and an
     * associated value. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of tags per role, then the entire request
     * fails and the role is not created.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character (\u007F),
     * including most punctuation characters, digits, and upper and lowercased letters.
     * </p>
     * 
     * @param path
     *        The path to the role. For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to a slash (/).
     *        </p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *        forward slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL
     *        character (\u007F), including most punctuation characters, digits, and upper and lowercased letters.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character (\u007F),
     * including most punctuation characters, digits, and upper and lowercased letters.
     * </p>
     * 
     * @return The path to the role. For more information about paths, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *         <i>IAM User Guide</i>.</p>
     *         <p>
     *         This parameter is optional. If it is not included, it defaults to a slash (/).
     *         </p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *         forward slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL
     *         character (\u007F), including most punctuation characters, digits, and upper and lowercased letters.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the role. For more information about paths, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward
     * slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL character (\u007F),
     * including most punctuation characters, digits, and upper and lowercased letters.
     * </p>
     * 
     * @param path
     *        The path to the role. For more information about paths, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">IAM Identifiers</a> in the
     *        <i>IAM User Guide</i>.</p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to a slash (/).
     *        </p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of either a forward slash (/) by itself or a string that must begin and end with
     *        forward slashes. In addition, it can contain any ASCII character from the ! (\u0021) through the DEL
     *        character (\u007F), including most punctuation characters, digits, and upper and lowercased letters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleRequest withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The name of the role to create.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * <p>
     * Role names are not distinguished by case. For example, you cannot create roles named both "PRODROLE" and
     * "prodrole".
     * </p>
     * 
     * @param roleName
     *        The name of the role to create.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     *        </p>
     *        <p>
     *        Role names are not distinguished by case. For example, you cannot create roles named both "PRODROLE" and
     *        "prodrole".
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the role to create.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * <p>
     * Role names are not distinguished by case. For example, you cannot create roles named both "PRODROLE" and
     * "prodrole".
     * </p>
     * 
     * @return The name of the role to create.</p>
     *         <p>
     *         This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *         of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *         include any of the following characters: _+=,.@-
     *         </p>
     *         <p>
     *         Role names are not distinguished by case. For example, you cannot create roles named both "PRODROLE" and
     *         "prodrole".
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the role to create.
     * </p>
     * <p>
     * This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of
     * the following characters: _+=,.@-
     * </p>
     * <p>
     * Role names are not distinguished by case. For example, you cannot create roles named both "PRODROLE" and
     * "prodrole".
     * </p>
     * 
     * @param roleName
     *        The name of the role to create.</p>
     *        <p>
     *        This parameter allows (through its <a href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string
     *        of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also
     *        include any of the following characters: _+=,.@-
     *        </p>
     *        <p>
     *        Role names are not distinguished by case. For example, you cannot create roles named both "PRODROLE" and
     *        "prodrole".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The trust relationship policy document that grants an entity permission to assume the role.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @param assumeRolePolicyDocument
     *        The trust relationship policy document that grants an entity permission to assume the role.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     */

    public void setAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        this.assumeRolePolicyDocument = assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The trust relationship policy document that grants an entity permission to assume the role.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @return The trust relationship policy document that grants an entity permission to assume the role.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *         string of characters consisting of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *         range
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The special characters tab ( ), line feed ( ), and carriage return ( )
     *         </p>
     *         </li>
     */

    public String getAssumeRolePolicyDocument() {
        return this.assumeRolePolicyDocument;
    }

    /**
     * <p>
     * The trust relationship policy document that grants an entity permission to assume the role.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a string of
     * characters consisting of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character range
     * </p>
     * </li>
     * <li>
     * <p>
     * The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     * </p>
     * </li>
     * <li>
     * <p>
     * The special characters tab ( ), line feed ( ), and carriage return ( )
     * </p>
     * </li>
     * </ul>
     * 
     * @param assumeRolePolicyDocument
     *        The trust relationship policy document that grants an entity permission to assume the role.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> used to validate this parameter is a
     *        string of characters consisting of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any printable ASCII character ranging from the space character ( ) through the end of the ASCII character
     *        range
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The printable characters in the Basic Latin and Latin-1 Supplement character set (through \u00FF)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The special characters tab ( ), line feed ( ), and carriage return ( )
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleRequest withAssumeRolePolicyDocument(String assumeRolePolicyDocument) {
        setAssumeRolePolicyDocument(assumeRolePolicyDocument);
        return this;
    }

    /**
     * <p>
     * A description of the role.
     * </p>
     * 
     * @param description
     *        A description of the role.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the role.
     * </p>
     * 
     * @return A description of the role.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the role.
     * </p>
     * 
     * @param description
     *        A description of the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a
     * value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to
     * 12 hours.
     * </p>
     * <p>
     * Anyone who assumes the role from the AWS CLI or API can use the <code>DurationSeconds</code> API parameter or the
     * <code>duration-seconds</code> CLI parameter to request a longer session. The <code>MaxSessionDuration</code>
     * setting determines the maximum duration that can be requested using the <code>DurationSeconds</code> parameter.
     * If users don't specify a value for the <code>DurationSeconds</code> parameter, their security credentials are
     * valid for one hour by default. This applies when you use the <code>AssumeRole*</code> API operations or the
     * <code>assume-role*</code> CLI operations but does not apply when you use those operations to create a console
     * URL. For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using
     * IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param maxSessionDuration
     *        The maximum session duration (in seconds) that you want to set for the specified role. If you do not
     *        specify a value for this setting, the default maximum of one hour is applied. This setting can have a
     *        value from 1 hour to 12 hours.</p>
     *        <p>
     *        Anyone who assumes the role from the AWS CLI or API can use the <code>DurationSeconds</code> API parameter
     *        or the <code>duration-seconds</code> CLI parameter to request a longer session. The
     *        <code>MaxSessionDuration</code> setting determines the maximum duration that can be requested using the
     *        <code>DurationSeconds</code> parameter. If users don't specify a value for the
     *        <code>DurationSeconds</code> parameter, their security credentials are valid for one hour by default. This
     *        applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
     *        operations but does not apply when you use those operations to create a console URL. For more information,
     *        see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM Roles</a> in
     *        the <i>IAM User Guide</i>.
     */

    public void setMaxSessionDuration(Integer maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a
     * value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to
     * 12 hours.
     * </p>
     * <p>
     * Anyone who assumes the role from the AWS CLI or API can use the <code>DurationSeconds</code> API parameter or the
     * <code>duration-seconds</code> CLI parameter to request a longer session. The <code>MaxSessionDuration</code>
     * setting determines the maximum duration that can be requested using the <code>DurationSeconds</code> parameter.
     * If users don't specify a value for the <code>DurationSeconds</code> parameter, their security credentials are
     * valid for one hour by default. This applies when you use the <code>AssumeRole*</code> API operations or the
     * <code>assume-role*</code> CLI operations but does not apply when you use those operations to create a console
     * URL. For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using
     * IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The maximum session duration (in seconds) that you want to set for the specified role. If you do not
     *         specify a value for this setting, the default maximum of one hour is applied. This setting can have a
     *         value from 1 hour to 12 hours.</p>
     *         <p>
     *         Anyone who assumes the role from the AWS CLI or API can use the <code>DurationSeconds</code> API
     *         parameter or the <code>duration-seconds</code> CLI parameter to request a longer session. The
     *         <code>MaxSessionDuration</code> setting determines the maximum duration that can be requested using the
     *         <code>DurationSeconds</code> parameter. If users don't specify a value for the
     *         <code>DurationSeconds</code> parameter, their security credentials are valid for one hour by default.
     *         This applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code>
     *         CLI operations but does not apply when you use those operations to create a console URL. For more
     *         information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM
     *         Roles</a> in the <i>IAM User Guide</i>.
     */

    public Integer getMaxSessionDuration() {
        return this.maxSessionDuration;
    }

    /**
     * <p>
     * The maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a
     * value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to
     * 12 hours.
     * </p>
     * <p>
     * Anyone who assumes the role from the AWS CLI or API can use the <code>DurationSeconds</code> API parameter or the
     * <code>duration-seconds</code> CLI parameter to request a longer session. The <code>MaxSessionDuration</code>
     * setting determines the maximum duration that can be requested using the <code>DurationSeconds</code> parameter.
     * If users don't specify a value for the <code>DurationSeconds</code> parameter, their security credentials are
     * valid for one hour by default. This applies when you use the <code>AssumeRole*</code> API operations or the
     * <code>assume-role*</code> CLI operations but does not apply when you use those operations to create a console
     * URL. For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using
     * IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param maxSessionDuration
     *        The maximum session duration (in seconds) that you want to set for the specified role. If you do not
     *        specify a value for this setting, the default maximum of one hour is applied. This setting can have a
     *        value from 1 hour to 12 hours.</p>
     *        <p>
     *        Anyone who assumes the role from the AWS CLI or API can use the <code>DurationSeconds</code> API parameter
     *        or the <code>duration-seconds</code> CLI parameter to request a longer session. The
     *        <code>MaxSessionDuration</code> setting determines the maximum duration that can be requested using the
     *        <code>DurationSeconds</code> parameter. If users don't specify a value for the
     *        <code>DurationSeconds</code> parameter, their security credentials are valid for one hour by default. This
     *        applies when you use the <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
     *        operations but does not apply when you use those operations to create a console URL. For more information,
     *        see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">Using IAM Roles</a> in
     *        the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleRequest withMaxSessionDuration(Integer maxSessionDuration) {
        setMaxSessionDuration(maxSessionDuration);
        return this;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for the role.
     * </p>
     * 
     * @param permissionsBoundary
     *        The ARN of the policy that is used to set the permissions boundary for the role.
     */

    public void setPermissionsBoundary(String permissionsBoundary) {
        this.permissionsBoundary = permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for the role.
     * </p>
     * 
     * @return The ARN of the policy that is used to set the permissions boundary for the role.
     */

    public String getPermissionsBoundary() {
        return this.permissionsBoundary;
    }

    /**
     * <p>
     * The ARN of the policy that is used to set the permissions boundary for the role.
     * </p>
     * 
     * @param permissionsBoundary
     *        The ARN of the policy that is used to set the permissions boundary for the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleRequest withPermissionsBoundary(String permissionsBoundary) {
        setPermissionsBoundary(permissionsBoundary);
        return this;
    }

    /**
     * <p>
     * A list of tags that you want to attach to the newly created role. Each tag consists of a key name and an
     * associated value. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of tags per role, then the entire request
     * fails and the role is not created.
     * </p>
     * </note>
     * 
     * @return A list of tags that you want to attach to the newly created role. Each tag consists of a key name and an
     *         associated value. For more information about tagging, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the
     *         <i>IAM User Guide</i>.</p> <note>
     *         <p>
     *         If any one of the tags is invalid or if you exceed the allowed number of tags per role, then the entire
     *         request fails and the role is not created.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags that you want to attach to the newly created role. Each tag consists of a key name and an
     * associated value. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of tags per role, then the entire request
     * fails and the role is not created.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of tags that you want to attach to the newly created role. Each tag consists of a key name and an
     *        associated value. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the
     *        <i>IAM User Guide</i>.</p> <note>
     *        <p>
     *        If any one of the tags is invalid or if you exceed the allowed number of tags per role, then the entire
     *        request fails and the role is not created.
     *        </p>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags that you want to attach to the newly created role. Each tag consists of a key name and an
     * associated value. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of tags per role, then the entire request
     * fails and the role is not created.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags that you want to attach to the newly created role. Each tag consists of a key name and an
     *        associated value. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the
     *        <i>IAM User Guide</i>.</p> <note>
     *        <p>
     *        If any one of the tags is invalid or if you exceed the allowed number of tags per role, then the entire
     *        request fails and the role is not created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags that you want to attach to the newly created role. Each tag consists of a key name and an
     * associated value. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of tags per role, then the entire request
     * fails and the role is not created.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of tags that you want to attach to the newly created role. Each tag consists of a key name and an
     *        associated value. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM Identities</a> in the
     *        <i>IAM User Guide</i>.</p> <note>
     *        <p>
     *        If any one of the tags is invalid or if you exceed the allowed number of tags per role, then the entire
     *        request fails and the role is not created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRoleRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getAssumeRolePolicyDocument() != null)
            sb.append("AssumeRolePolicyDocument: ").append(getAssumeRolePolicyDocument()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getMaxSessionDuration() != null)
            sb.append("MaxSessionDuration: ").append(getMaxSessionDuration()).append(",");
        if (getPermissionsBoundary() != null)
            sb.append("PermissionsBoundary: ").append(getPermissionsBoundary()).append(",");
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

        if (obj instanceof CreateRoleRequest == false)
            return false;
        CreateRoleRequest other = (CreateRoleRequest) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getAssumeRolePolicyDocument() == null ^ this.getAssumeRolePolicyDocument() == null)
            return false;
        if (other.getAssumeRolePolicyDocument() != null && other.getAssumeRolePolicyDocument().equals(this.getAssumeRolePolicyDocument()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMaxSessionDuration() == null ^ this.getMaxSessionDuration() == null)
            return false;
        if (other.getMaxSessionDuration() != null && other.getMaxSessionDuration().equals(this.getMaxSessionDuration()) == false)
            return false;
        if (other.getPermissionsBoundary() == null ^ this.getPermissionsBoundary() == null)
            return false;
        if (other.getPermissionsBoundary() != null && other.getPermissionsBoundary().equals(this.getPermissionsBoundary()) == false)
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

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getAssumeRolePolicyDocument() == null) ? 0 : getAssumeRolePolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getMaxSessionDuration() == null) ? 0 : getMaxSessionDuration().hashCode());
        hashCode = prime * hashCode + ((getPermissionsBoundary() == null) ? 0 : getPermissionsBoundary().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRoleRequest clone() {
        return (CreateRoleRequest) super.clone();
    }

}
