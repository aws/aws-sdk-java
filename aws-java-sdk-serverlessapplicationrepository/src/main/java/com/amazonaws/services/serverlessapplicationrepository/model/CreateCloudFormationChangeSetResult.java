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
package com.amazonaws.services.serverlessapplicationrepository.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/CreateCloudFormationChangeSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCloudFormationChangeSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the change set.
     * </p>
     * <p>
     * Length constraints: Minimum length of 1.
     * </p>
     * <p>
     * Pattern: ARN:[-a-zA-Z0-9:/]*
     * </p>
     */
    private String changeSetId;
    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     */
    private String semanticVersion;
    /**
     * <p>
     * The unique ID of the stack.
     * </p>
     */
    private String stackId;

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     * 
     * @param applicationId
     *        The application Amazon Resource Name (ARN).
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The application Amazon Resource Name (ARN).
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     * 
     * @param applicationId
     *        The application Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the change set.
     * </p>
     * <p>
     * Length constraints: Minimum length of 1.
     * </p>
     * <p>
     * Pattern: ARN:[-a-zA-Z0-9:/]*
     * </p>
     * 
     * @param changeSetId
     *        The Amazon Resource Name (ARN) of the change set.</p>
     *        <p>
     *        Length constraints: Minimum length of 1.
     *        </p>
     *        <p>
     *        Pattern: ARN:[-a-zA-Z0-9:/]
     **/

    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the change set.
     * </p>
     * <p>
     * Length constraints: Minimum length of 1.
     * </p>
     * <p>
     * Pattern: ARN:[-a-zA-Z0-9:/]*
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the change set.</p>
     *         <p>
     *         Length constraints: Minimum length of 1.
     *         </p>
     *         <p>
     *         Pattern: ARN:[-a-zA-Z0-9:/]
     **/

    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the change set.
     * </p>
     * <p>
     * Length constraints: Minimum length of 1.
     * </p>
     * <p>
     * Pattern: ARN:[-a-zA-Z0-9:/]*
     * </p>
     * 
     * @param changeSetId
     *        The Amazon Resource Name (ARN) of the change set.</p>
     *        <p>
     *        Length constraints: Minimum length of 1.
     *        </p>
     *        <p>
     *        Pattern: ARN:[-a-zA-Z0-9:/]*
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetResult withChangeSetId(String changeSetId) {
        setChangeSetId(changeSetId);
        return this;
    }

    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the application:</p>
     *        <p>
     *        <a href="https://semver.org/">https://semver.org/</a>
     */

    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     * 
     * @return The semantic version of the application:</p>
     *         <p>
     *         <a href="https://semver.org/">https://semver.org/</a>
     */

    public String getSemanticVersion() {
        return this.semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the application:
     * </p>
     * <p>
     * <a href="https://semver.org/">https://semver.org/</a>
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the application:</p>
     *        <p>
     *        <a href="https://semver.org/">https://semver.org/</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetResult withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
        return this;
    }

    /**
     * <p>
     * The unique ID of the stack.
     * </p>
     * 
     * @param stackId
     *        The unique ID of the stack.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The unique ID of the stack.
     * </p>
     * 
     * @return The unique ID of the stack.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The unique ID of the stack.
     * </p>
     * 
     * @param stackId
     *        The unique ID of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCloudFormationChangeSetResult withStackId(String stackId) {
        setStackId(stackId);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getChangeSetId() != null)
            sb.append("ChangeSetId: ").append(getChangeSetId()).append(",");
        if (getSemanticVersion() != null)
            sb.append("SemanticVersion: ").append(getSemanticVersion()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCloudFormationChangeSetResult == false)
            return false;
        CreateCloudFormationChangeSetResult other = (CreateCloudFormationChangeSetResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getChangeSetId() == null ^ this.getChangeSetId() == null)
            return false;
        if (other.getChangeSetId() != null && other.getChangeSetId().equals(this.getChangeSetId()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getChangeSetId() == null) ? 0 : getChangeSetId().hashCode());
        hashCode = prime * hashCode + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        return hashCode;
    }

    @Override
    public CreateCloudFormationChangeSetResult clone() {
        try {
            return (CreateCloudFormationChangeSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
