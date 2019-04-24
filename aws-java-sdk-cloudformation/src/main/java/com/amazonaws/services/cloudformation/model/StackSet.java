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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A structure that contains information about a stack set. A stack set enables you to provision stacks into AWS
 * accounts and across regions by using a single CloudFormation template. In the stack set, you specify the template to
 * use, as well as any parameters and capabilities that the template requires.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackSet implements Serializable, Cloneable {

    /**
     * <p>
     * The name that's associated with the stack set.
     * </p>
     */
    private String stackSetName;
    /**
     * <p>
     * The ID of the stack set.
     * </p>
     */
    private String stackSetId;
    /**
     * <p>
     * A description of the stack set that you specify when the stack set is created or updated.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the stack set.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The structure that contains the body of the template that was used to create or update the stack set.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * A list of input parameters for a stack set.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Parameter> parameters;
    /**
     * <p>
     * The capabilities that are allowed in the stack set. Some stack set templates might include resources that can
     * affect permissions in your AWS account—for example, by creating new AWS Identity and Access Management (IAM)
     * users. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> capabilities;
    /**
     * <p>
     * A list of tags that specify information about the stack set. A maximum number of 50 tags can be specified.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the stack set.
     * </p>
     */
    private String stackSetARN;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role used to create or update the stack set.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can manage specific stack sets within the
     * same administrator account. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Prerequisites:
     * Granting Permissions for Stack Set Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     */
    private String administrationRoleARN;
    /**
     * <p>
     * The name of the IAM execution role used to create or update the stack set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and groups can include in their stack sets.
     * </p>
     */
    private String executionRoleName;

    /**
     * <p>
     * The name that's associated with the stack set.
     * </p>
     * 
     * @param stackSetName
     *        The name that's associated with the stack set.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name that's associated with the stack set.
     * </p>
     * 
     * @return The name that's associated with the stack set.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name that's associated with the stack set.
     * </p>
     * 
     * @param stackSetName
     *        The name that's associated with the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSet withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     * 
     * @param stackSetId
     *        The ID of the stack set.
     */

    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     * 
     * @return The ID of the stack set.
     */

    public String getStackSetId() {
        return this.stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     * 
     * @param stackSetId
     *        The ID of the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSet withStackSetId(String stackSetId) {
        setStackSetId(stackSetId);
        return this;
    }

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is created or updated.
     * </p>
     * 
     * @param description
     *        A description of the stack set that you specify when the stack set is created or updated.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is created or updated.
     * </p>
     * 
     * @return A description of the stack set that you specify when the stack set is created or updated.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is created or updated.
     * </p>
     * 
     * @param description
     *        A description of the stack set that you specify when the stack set is created or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSet withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * 
     * @param status
     *        The status of the stack set.
     * @see StackSetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * 
     * @return The status of the stack set.
     * @see StackSetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * 
     * @param status
     *        The status of the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetStatus
     */

    public StackSet withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * 
     * @param status
     *        The status of the stack set.
     * @see StackSetStatus
     */

    public void setStatus(StackSetStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * 
     * @param status
     *        The status of the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetStatus
     */

    public StackSet withStatus(StackSetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The structure that contains the body of the template that was used to create or update the stack set.
     * </p>
     * 
     * @param templateBody
     *        The structure that contains the body of the template that was used to create or update the stack set.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The structure that contains the body of the template that was used to create or update the stack set.
     * </p>
     * 
     * @return The structure that contains the body of the template that was used to create or update the stack set.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * The structure that contains the body of the template that was used to create or update the stack set.
     * </p>
     * 
     * @param templateBody
     *        The structure that contains the body of the template that was used to create or update the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSet withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * A list of input parameters for a stack set.
     * </p>
     * 
     * @return A list of input parameters for a stack set.
     */

    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<Parameter>();
        }
        return parameters;
    }

    /**
     * <p>
     * A list of input parameters for a stack set.
     * </p>
     * 
     * @param parameters
     *        A list of input parameters for a stack set.
     */

    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new com.amazonaws.internal.SdkInternalList<Parameter>(parameters);
    }

    /**
     * <p>
     * A list of input parameters for a stack set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        A list of input parameters for a stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSet withParameters(Parameter... parameters) {
        if (this.parameters == null) {
            setParameters(new com.amazonaws.internal.SdkInternalList<Parameter>(parameters.length));
        }
        for (Parameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of input parameters for a stack set.
     * </p>
     * 
     * @param parameters
     *        A list of input parameters for a stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSet withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The capabilities that are allowed in the stack set. Some stack set templates might include resources that can
     * affect permissions in your AWS account—for example, by creating new AWS Identity and Access Management (IAM)
     * users. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     * 
     * @return The capabilities that are allowed in the stack set. Some stack set templates might include resources that
     *         can affect permissions in your AWS account—for example, by creating new AWS Identity and Access
     *         Management (IAM) users. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *         >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * @see Capability
     */

    public java.util.List<String> getCapabilities() {
        if (capabilities == null) {
            capabilities = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return capabilities;
    }

    /**
     * <p>
     * The capabilities that are allowed in the stack set. Some stack set templates might include resources that can
     * affect permissions in your AWS account—for example, by creating new AWS Identity and Access Management (IAM)
     * users. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     * 
     * @param capabilities
     *        The capabilities that are allowed in the stack set. Some stack set templates might include resources that
     *        can affect permissions in your AWS account—for example, by creating new AWS Identity and Access Management
     *        (IAM) users. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * @see Capability
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new com.amazonaws.internal.SdkInternalList<String>(capabilities);
    }

    /**
     * <p>
     * The capabilities that are allowed in the stack set. Some stack set templates might include resources that can
     * affect permissions in your AWS account—for example, by creating new AWS Identity and Access Management (IAM)
     * users. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        The capabilities that are allowed in the stack set. Some stack set templates might include resources that
     *        can affect permissions in your AWS account—for example, by creating new AWS Identity and Access Management
     *        (IAM) users. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public StackSet withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new com.amazonaws.internal.SdkInternalList<String>(capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The capabilities that are allowed in the stack set. Some stack set templates might include resources that can
     * affect permissions in your AWS account—for example, by creating new AWS Identity and Access Management (IAM)
     * users. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     * 
     * @param capabilities
     *        The capabilities that are allowed in the stack set. Some stack set templates might include resources that
     *        can affect permissions in your AWS account—for example, by creating new AWS Identity and Access Management
     *        (IAM) users. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public StackSet withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The capabilities that are allowed in the stack set. Some stack set templates might include resources that can
     * affect permissions in your AWS account—for example, by creating new AWS Identity and Access Management (IAM)
     * users. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     * >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * </p>
     * 
     * @param capabilities
     *        The capabilities that are allowed in the stack set. Some stack set templates might include resources that
     *        can affect permissions in your AWS account—for example, by creating new AWS Identity and Access Management
     *        (IAM) users. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities"
     *        >Acknowledging IAM Resources in AWS CloudFormation Templates.</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public StackSet withCapabilities(Capability... capabilities) {
        com.amazonaws.internal.SdkInternalList<String> capabilitiesCopy = new com.amazonaws.internal.SdkInternalList<String>(capabilities.length);
        for (Capability value : capabilities) {
            capabilitiesCopy.add(value.toString());
        }
        if (getCapabilities() == null) {
            setCapabilities(capabilitiesCopy);
        } else {
            getCapabilities().addAll(capabilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags that specify information about the stack set. A maximum number of 50 tags can be specified.
     * </p>
     * 
     * @return A list of tags that specify information about the stack set. A maximum number of 50 tags can be
     *         specified.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags that specify information about the stack set. A maximum number of 50 tags can be specified.
     * </p>
     * 
     * @param tags
     *        A list of tags that specify information about the stack set. A maximum number of 50 tags can be specified.
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
     * A list of tags that specify information about the stack set. A maximum number of 50 tags can be specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags that specify information about the stack set. A maximum number of 50 tags can be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSet withTags(Tag... tags) {
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
     * A list of tags that specify information about the stack set. A maximum number of 50 tags can be specified.
     * </p>
     * 
     * @param tags
     *        A list of tags that specify information about the stack set. A maximum number of 50 tags can be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSet withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the stack set.
     * </p>
     * 
     * @param stackSetARN
     *        The Amazon Resource Number (ARN) of the stack set.
     */

    public void setStackSetARN(String stackSetARN) {
        this.stackSetARN = stackSetARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the stack set.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the stack set.
     */

    public String getStackSetARN() {
        return this.stackSetARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the stack set.
     * </p>
     * 
     * @param stackSetARN
     *        The Amazon Resource Number (ARN) of the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSet withStackSetARN(String stackSetARN) {
        setStackSetARN(stackSetARN);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role used to create or update the stack set.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can manage specific stack sets within the
     * same administrator account. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Prerequisites:
     * Granting Permissions for Stack Set Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param administrationRoleARN
     *        The Amazon Resource Number (ARN) of the IAM role used to create or update the stack set.</p>
     *        <p>
     *        Use customized administrator roles to control which users or groups can manage specific stack sets within
     *        the same administrator account. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Prerequisites:
     *        Granting Permissions for Stack Set Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public void setAdministrationRoleARN(String administrationRoleARN) {
        this.administrationRoleARN = administrationRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role used to create or update the stack set.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can manage specific stack sets within the
     * same administrator account. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Prerequisites:
     * Granting Permissions for Stack Set Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the IAM role used to create or update the stack set.</p>
     *         <p>
     *         Use customized administrator roles to control which users or groups can manage specific stack sets within
     *         the same administrator account. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html"
     *         >Prerequisites: Granting Permissions for Stack Set Operations</a> in the <i>AWS CloudFormation User
     *         Guide</i>.
     */

    public String getAdministrationRoleARN() {
        return this.administrationRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role used to create or update the stack set.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can manage specific stack sets within the
     * same administrator account. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Prerequisites:
     * Granting Permissions for Stack Set Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param administrationRoleARN
     *        The Amazon Resource Number (ARN) of the IAM role used to create or update the stack set.</p>
     *        <p>
     *        Use customized administrator roles to control which users or groups can manage specific stack sets within
     *        the same administrator account. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Prerequisites:
     *        Granting Permissions for Stack Set Operations</a> in the <i>AWS CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSet withAdministrationRoleARN(String administrationRoleARN) {
        setAdministrationRoleARN(administrationRoleARN);
        return this;
    }

    /**
     * <p>
     * The name of the IAM execution role used to create or update the stack set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and groups can include in their stack sets.
     * </p>
     * 
     * @param executionRoleName
     *        The name of the IAM execution role used to create or update the stack set. </p>
     *        <p>
     *        Use customized execution roles to control which stack resources users and groups can include in their
     *        stack sets.
     */

    public void setExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
    }

    /**
     * <p>
     * The name of the IAM execution role used to create or update the stack set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and groups can include in their stack sets.
     * </p>
     * 
     * @return The name of the IAM execution role used to create or update the stack set. </p>
     *         <p>
     *         Use customized execution roles to control which stack resources users and groups can include in their
     *         stack sets.
     */

    public String getExecutionRoleName() {
        return this.executionRoleName;
    }

    /**
     * <p>
     * The name of the IAM execution role used to create or update the stack set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and groups can include in their stack sets.
     * </p>
     * 
     * @param executionRoleName
     *        The name of the IAM execution role used to create or update the stack set. </p>
     *        <p>
     *        Use customized execution roles to control which stack resources users and groups can include in their
     *        stack sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSet withExecutionRoleName(String executionRoleName) {
        setExecutionRoleName(executionRoleName);
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
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName()).append(",");
        if (getStackSetId() != null)
            sb.append("StackSetId: ").append(getStackSetId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getStackSetARN() != null)
            sb.append("StackSetARN: ").append(getStackSetARN()).append(",");
        if (getAdministrationRoleARN() != null)
            sb.append("AdministrationRoleARN: ").append(getAdministrationRoleARN()).append(",");
        if (getExecutionRoleName() != null)
            sb.append("ExecutionRoleName: ").append(getExecutionRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSet == false)
            return false;
        StackSet other = (StackSet) obj;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getStackSetId() == null ^ this.getStackSetId() == null)
            return false;
        if (other.getStackSetId() != null && other.getStackSetId().equals(this.getStackSetId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStackSetARN() == null ^ this.getStackSetARN() == null)
            return false;
        if (other.getStackSetARN() != null && other.getStackSetARN().equals(this.getStackSetARN()) == false)
            return false;
        if (other.getAdministrationRoleARN() == null ^ this.getAdministrationRoleARN() == null)
            return false;
        if (other.getAdministrationRoleARN() != null && other.getAdministrationRoleARN().equals(this.getAdministrationRoleARN()) == false)
            return false;
        if (other.getExecutionRoleName() == null ^ this.getExecutionRoleName() == null)
            return false;
        if (other.getExecutionRoleName() != null && other.getExecutionRoleName().equals(this.getExecutionRoleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getStackSetId() == null) ? 0 : getStackSetId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getStackSetARN() == null) ? 0 : getStackSetARN().hashCode());
        hashCode = prime * hashCode + ((getAdministrationRoleARN() == null) ? 0 : getAdministrationRoleARN().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleName() == null) ? 0 : getExecutionRoleName().hashCode());
        return hashCode;
    }

    @Override
    public StackSet clone() {
        try {
            return (StackSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
