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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An application version summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/VersionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VersionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application Amazon Resource Name (ARN).
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The date and time this resource was created.
     * </p>
     */
    private String creationTime;
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
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     */
    private String sourceCodeUrl;

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

    public VersionSummary withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The date and time this resource was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time this resource was created.
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time this resource was created.
     * </p>
     * 
     * @return The date and time this resource was created.
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time this resource was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time this resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionSummary withCreationTime(String creationTime) {
        setCreationTime(creationTime);
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

    public VersionSummary withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
        return this;
    }

    /**
     * <p>
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     * 
     * @param sourceCodeUrl
     *        A link to a public repository for the source code of your application, for example the URL of a specific
     *        GitHub commit.
     */

    public void setSourceCodeUrl(String sourceCodeUrl) {
        this.sourceCodeUrl = sourceCodeUrl;
    }

    /**
     * <p>
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     * 
     * @return A link to a public repository for the source code of your application, for example the URL of a specific
     *         GitHub commit.
     */

    public String getSourceCodeUrl() {
        return this.sourceCodeUrl;
    }

    /**
     * <p>
     * A link to a public repository for the source code of your application, for example the URL of a specific GitHub
     * commit.
     * </p>
     * 
     * @param sourceCodeUrl
     *        A link to a public repository for the source code of your application, for example the URL of a specific
     *        GitHub commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionSummary withSourceCodeUrl(String sourceCodeUrl) {
        setSourceCodeUrl(sourceCodeUrl);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getSemanticVersion() != null)
            sb.append("SemanticVersion: ").append(getSemanticVersion()).append(",");
        if (getSourceCodeUrl() != null)
            sb.append("SourceCodeUrl: ").append(getSourceCodeUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VersionSummary == false)
            return false;
        VersionSummary other = (VersionSummary) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
            return false;
        if (other.getSourceCodeUrl() == null ^ this.getSourceCodeUrl() == null)
            return false;
        if (other.getSourceCodeUrl() != null && other.getSourceCodeUrl().equals(this.getSourceCodeUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        hashCode = prime * hashCode + ((getSourceCodeUrl() == null) ? 0 : getSourceCodeUrl().hashCode());
        return hashCode;
    }

    @Override
    public VersionSummary clone() {
        try {
            return (VersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.serverlessapplicationrepository.model.transform.VersionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
