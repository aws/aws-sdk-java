/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.serverlessapplicationrepository.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Create application ChangeSet request
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateCloudFormationChangeSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCloudFormationChangeSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The id of the application to create the ChangeSet for */
    private String applicationId;
    /** A list of parameter values for the parameters of the application. */
    private java.util.List<ParameterValue> parameterOverrides;
    /** The semantic version of the application:\n\n https://semver.org/ */
    private String semanticVersion;
    /**
     * The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation generates\n
     * the change set by comparing this stack's information with the information that you submit, such as a modified\n
     * template or different parameter input values. \nConstraints: Minimum length of 1.\nPattern:
     * ([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)
     */
    private String stackName;

    /**
     * The id of the application to create the ChangeSet for
     * 
     * @param applicationId
     *        The id of the application to create the ChangeSet for
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The id of the application to create the ChangeSet for
     * 
     * @return The id of the application to create the ChangeSet for
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The id of the application to create the ChangeSet for
     * 
     * @param applicationId
     *        The id of the application to create the ChangeSet for
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * A list of parameter values for the parameters of the application.
     * 
     * @return A list of parameter values for the parameters of the application.
     */

    public java.util.List<ParameterValue> getParameterOverrides() {
        return parameterOverrides;
    }

    /**
     * A list of parameter values for the parameters of the application.
     * 
     * @param parameterOverrides
     *        A list of parameter values for the parameters of the application.
     */

    public void setParameterOverrides(java.util.Collection<ParameterValue> parameterOverrides) {
        if (parameterOverrides == null) {
            this.parameterOverrides = null;
            return;
        }

        this.parameterOverrides = new java.util.ArrayList<ParameterValue>(parameterOverrides);
    }

    /**
     * A list of parameter values for the parameters of the application.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterOverrides(java.util.Collection)} or {@link #withParameterOverrides(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param parameterOverrides
     *        A list of parameter values for the parameters of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withParameterOverrides(ParameterValue... parameterOverrides) {
        if (this.parameterOverrides == null) {
            setParameterOverrides(new java.util.ArrayList<ParameterValue>(parameterOverrides.length));
        }
        for (ParameterValue ele : parameterOverrides) {
            this.parameterOverrides.add(ele);
        }
        return this;
    }

    /**
     * A list of parameter values for the parameters of the application.
     * 
     * @param parameterOverrides
     *        A list of parameter values for the parameters of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withParameterOverrides(java.util.Collection<ParameterValue> parameterOverrides) {
        setParameterOverrides(parameterOverrides);
        return this;
    }

    /**
     * The semantic version of the application:\n\n https://semver.org/
     * 
     * @param semanticVersion
     *        The semantic version of the application:\n\n https://semver.org/
     */

    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * The semantic version of the application:\n\n https://semver.org/
     * 
     * @return The semantic version of the application:\n\n https://semver.org/
     */

    public String getSemanticVersion() {
        return this.semanticVersion;
    }

    /**
     * The semantic version of the application:\n\n https://semver.org/
     * 
     * @param semanticVersion
     *        The semantic version of the application:\n\n https://semver.org/
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
        return this;
    }

    /**
     * The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation generates\n
     * the change set by comparing this stack's information with the information that you submit, such as a modified\n
     * template or different parameter input values. \nConstraints: Minimum length of 1.\nPattern:
     * ([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)
     * 
     * @param stackName
     *        The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation
     *        generates\n the change set by comparing this stack's information with the information that you submit,
     *        such as a modified\n template or different parameter input values. \nConstraints: Minimum length of
     *        1.\nPattern: ([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation generates\n
     * the change set by comparing this stack's information with the information that you submit, such as a modified\n
     * template or different parameter input values. \nConstraints: Minimum length of 1.\nPattern:
     * ([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)
     * 
     * @return The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation
     *         generates\n the change set by comparing this stack's information with the information that you submit,
     *         such as a modified\n template or different parameter input values. \nConstraints: Minimum length of
     *         1.\nPattern: ([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation generates\n
     * the change set by comparing this stack's information with the information that you submit, such as a modified\n
     * template or different parameter input values. \nConstraints: Minimum length of 1.\nPattern:
     * ([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)
     * 
     * @param stackName
     *        The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation
     *        generates\n the change set by comparing this stack's information with the information that you submit,
     *        such as a modified\n template or different parameter input values. \nConstraints: Minimum length of
     *        1.\nPattern: ([a-zA-Z][-a-zA-Z0-9]*)|(arn:\b(aws|aws-us-gov|aws-cn)\b:[-a-zA-Z0-9:/._+]*)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getParameterOverrides() != null)
            sb.append("ParameterOverrides: ").append(getParameterOverrides()).append(",");
        if (getSemanticVersion() != null)
            sb.append("SemanticVersion: ").append(getSemanticVersion()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCloudFormationChangeSetRequest == false)
            return false;
        CreateCloudFormationChangeSetRequest other = (CreateCloudFormationChangeSetRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getParameterOverrides() == null ^ this.getParameterOverrides() == null)
            return false;
        if (other.getParameterOverrides() != null && other.getParameterOverrides().equals(this.getParameterOverrides()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getParameterOverrides() == null) ? 0 : getParameterOverrides().hashCode());
        hashCode = prime * hashCode + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        return hashCode;
    }

    @Override
    public CreateCloudFormationChangeSetRequest clone() {
        return (CreateCloudFormationChangeSetRequest) super.clone();
    }

}
