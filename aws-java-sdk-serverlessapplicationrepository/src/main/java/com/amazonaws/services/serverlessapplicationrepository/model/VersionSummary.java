/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Application version summary.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/VersionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VersionSummary implements Serializable, Cloneable, StructuredPojo {

    /** The application Amazon Resource Name (ARN). */
    private String applicationId;
    /** The date/time this resource was created. */
    private String creationTime;
    /** The semantic version of the application:\n\n https://semver.org/ */
    private String semanticVersion;
    /** A link to a public repository for the source code of your application. */
    private String sourceCodeUrl;

    /**
     * The application Amazon Resource Name (ARN).
     * 
     * @param applicationId
     *        The application Amazon Resource Name (ARN).
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The application Amazon Resource Name (ARN).
     * 
     * @return The application Amazon Resource Name (ARN).
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The application Amazon Resource Name (ARN).
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
     * The date/time this resource was created.
     * 
     * @param creationTime
     *        The date/time this resource was created.
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * The date/time this resource was created.
     * 
     * @return The date/time this resource was created.
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * The date/time this resource was created.
     * 
     * @param creationTime
     *        The date/time this resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionSummary withCreationTime(String creationTime) {
        setCreationTime(creationTime);
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

    public VersionSummary withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
        return this;
    }

    /**
     * A link to a public repository for the source code of your application.
     * 
     * @param sourceCodeUrl
     *        A link to a public repository for the source code of your application.
     */

    public void setSourceCodeUrl(String sourceCodeUrl) {
        this.sourceCodeUrl = sourceCodeUrl;
    }

    /**
     * A link to a public repository for the source code of your application.
     * 
     * @return A link to a public repository for the source code of your application.
     */

    public String getSourceCodeUrl() {
        return this.sourceCodeUrl;
    }

    /**
     * A link to a public repository for the source code of your application.
     * 
     * @param sourceCodeUrl
     *        A link to a public repository for the source code of your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VersionSummary withSourceCodeUrl(String sourceCodeUrl) {
        setSourceCodeUrl(sourceCodeUrl);
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
