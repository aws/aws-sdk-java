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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the location of an application revision.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RevisionLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevisionLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
     * </p>
     * </li>
     * <li>
     * <p>
     * String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments only).
     * </p>
     * </li>
     * </ul>
     */
    private String revisionType;
    /**
     * <p>
     * Information about the location of a revision stored in Amazon S3.
     * </p>
     */
    private S3Location s3Location;
    /**
     * <p>
     * Information about the location of application artifacts stored in GitHub.
     * </p>
     */
    private GitHubLocation gitHubLocation;
    /**
     * <p>
     * Information about the location of an AWS Lambda deployment revision stored as a RawString.
     * </p>
     */
    private RawString string;
    /**
     * <p>
     * The content of an AppSpec file for an AWS Lambda or Amazon ECS deployment. The content is formatted as JSON or
     * YAML and stored as a RawString.
     * </p>
     */
    private AppSpecContent appSpecContent;

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
     * </p>
     * </li>
     * <li>
     * <p>
     * String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments only).
     * </p>
     * </li>
     * </ul>
     * 
     * @param revisionType
     *        The type of application revision:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        S3: An application revision stored in Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments only).
     *        </p>
     *        </li>
     * @see RevisionLocationType
     */

    public void setRevisionType(String revisionType) {
        this.revisionType = revisionType;
    }

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
     * </p>
     * </li>
     * <li>
     * <p>
     * String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments only).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of application revision:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         S3: An application revision stored in Amazon S3.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments only).
     *         </p>
     *         </li>
     * @see RevisionLocationType
     */

    public String getRevisionType() {
        return this.revisionType;
    }

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
     * </p>
     * </li>
     * <li>
     * <p>
     * String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments only).
     * </p>
     * </li>
     * </ul>
     * 
     * @param revisionType
     *        The type of application revision:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        S3: An application revision stored in Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments only).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevisionLocationType
     */

    public RevisionLocation withRevisionType(String revisionType) {
        setRevisionType(revisionType);
        return this;
    }

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
     * </p>
     * </li>
     * <li>
     * <p>
     * String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments only).
     * </p>
     * </li>
     * </ul>
     * 
     * @param revisionType
     *        The type of application revision:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        S3: An application revision stored in Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments only).
     *        </p>
     *        </li>
     * @see RevisionLocationType
     */

    public void setRevisionType(RevisionLocationType revisionType) {
        withRevisionType(revisionType);
    }

    /**
     * <p>
     * The type of application revision:
     * </p>
     * <ul>
     * <li>
     * <p>
     * S3: An application revision stored in Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
     * </p>
     * </li>
     * <li>
     * <p>
     * String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments only).
     * </p>
     * </li>
     * </ul>
     * 
     * @param revisionType
     *        The type of application revision:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        S3: An application revision stored in Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments only).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevisionLocationType
     */

    public RevisionLocation withRevisionType(RevisionLocationType revisionType) {
        this.revisionType = revisionType.toString();
        return this;
    }

    /**
     * <p>
     * Information about the location of a revision stored in Amazon S3.
     * </p>
     * 
     * @param s3Location
     *        Information about the location of a revision stored in Amazon S3.
     */

    public void setS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * Information about the location of a revision stored in Amazon S3.
     * </p>
     * 
     * @return Information about the location of a revision stored in Amazon S3.
     */

    public S3Location getS3Location() {
        return this.s3Location;
    }

    /**
     * <p>
     * Information about the location of a revision stored in Amazon S3.
     * </p>
     * 
     * @param s3Location
     *        Information about the location of a revision stored in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevisionLocation withS3Location(S3Location s3Location) {
        setS3Location(s3Location);
        return this;
    }

    /**
     * <p>
     * Information about the location of application artifacts stored in GitHub.
     * </p>
     * 
     * @param gitHubLocation
     *        Information about the location of application artifacts stored in GitHub.
     */

    public void setGitHubLocation(GitHubLocation gitHubLocation) {
        this.gitHubLocation = gitHubLocation;
    }

    /**
     * <p>
     * Information about the location of application artifacts stored in GitHub.
     * </p>
     * 
     * @return Information about the location of application artifacts stored in GitHub.
     */

    public GitHubLocation getGitHubLocation() {
        return this.gitHubLocation;
    }

    /**
     * <p>
     * Information about the location of application artifacts stored in GitHub.
     * </p>
     * 
     * @param gitHubLocation
     *        Information about the location of application artifacts stored in GitHub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevisionLocation withGitHubLocation(GitHubLocation gitHubLocation) {
        setGitHubLocation(gitHubLocation);
        return this;
    }

    /**
     * <p>
     * Information about the location of an AWS Lambda deployment revision stored as a RawString.
     * </p>
     * 
     * @param string
     *        Information about the location of an AWS Lambda deployment revision stored as a RawString.
     */
    @Deprecated
    public void setString(RawString string) {
        this.string = string;
    }

    /**
     * <p>
     * Information about the location of an AWS Lambda deployment revision stored as a RawString.
     * </p>
     * 
     * @return Information about the location of an AWS Lambda deployment revision stored as a RawString.
     */
    @Deprecated
    public RawString getString() {
        return this.string;
    }

    /**
     * <p>
     * Information about the location of an AWS Lambda deployment revision stored as a RawString.
     * </p>
     * 
     * @param string
     *        Information about the location of an AWS Lambda deployment revision stored as a RawString.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public RevisionLocation withString(RawString string) {
        setString(string);
        return this;
    }

    /**
     * <p>
     * The content of an AppSpec file for an AWS Lambda or Amazon ECS deployment. The content is formatted as JSON or
     * YAML and stored as a RawString.
     * </p>
     * 
     * @param appSpecContent
     *        The content of an AppSpec file for an AWS Lambda or Amazon ECS deployment. The content is formatted as
     *        JSON or YAML and stored as a RawString.
     */

    public void setAppSpecContent(AppSpecContent appSpecContent) {
        this.appSpecContent = appSpecContent;
    }

    /**
     * <p>
     * The content of an AppSpec file for an AWS Lambda or Amazon ECS deployment. The content is formatted as JSON or
     * YAML and stored as a RawString.
     * </p>
     * 
     * @return The content of an AppSpec file for an AWS Lambda or Amazon ECS deployment. The content is formatted as
     *         JSON or YAML and stored as a RawString.
     */

    public AppSpecContent getAppSpecContent() {
        return this.appSpecContent;
    }

    /**
     * <p>
     * The content of an AppSpec file for an AWS Lambda or Amazon ECS deployment. The content is formatted as JSON or
     * YAML and stored as a RawString.
     * </p>
     * 
     * @param appSpecContent
     *        The content of an AppSpec file for an AWS Lambda or Amazon ECS deployment. The content is formatted as
     *        JSON or YAML and stored as a RawString.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevisionLocation withAppSpecContent(AppSpecContent appSpecContent) {
        setAppSpecContent(appSpecContent);
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
        if (getRevisionType() != null)
            sb.append("RevisionType: ").append(getRevisionType()).append(",");
        if (getS3Location() != null)
            sb.append("S3Location: ").append(getS3Location()).append(",");
        if (getGitHubLocation() != null)
            sb.append("GitHubLocation: ").append(getGitHubLocation()).append(",");
        if (getString() != null)
            sb.append("String: ").append(getString()).append(",");
        if (getAppSpecContent() != null)
            sb.append("AppSpecContent: ").append(getAppSpecContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevisionLocation == false)
            return false;
        RevisionLocation other = (RevisionLocation) obj;
        if (other.getRevisionType() == null ^ this.getRevisionType() == null)
            return false;
        if (other.getRevisionType() != null && other.getRevisionType().equals(this.getRevisionType()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        if (other.getGitHubLocation() == null ^ this.getGitHubLocation() == null)
            return false;
        if (other.getGitHubLocation() != null && other.getGitHubLocation().equals(this.getGitHubLocation()) == false)
            return false;
        if (other.getString() == null ^ this.getString() == null)
            return false;
        if (other.getString() != null && other.getString().equals(this.getString()) == false)
            return false;
        if (other.getAppSpecContent() == null ^ this.getAppSpecContent() == null)
            return false;
        if (other.getAppSpecContent() != null && other.getAppSpecContent().equals(this.getAppSpecContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevisionType() == null) ? 0 : getRevisionType().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        hashCode = prime * hashCode + ((getGitHubLocation() == null) ? 0 : getGitHubLocation().hashCode());
        hashCode = prime * hashCode + ((getString() == null) ? 0 : getString().hashCode());
        hashCode = prime * hashCode + ((getAppSpecContent() == null) ? 0 : getAppSpecContent().hashCode());
        return hashCode;
    }

    @Override
    public RevisionLocation clone() {
        try {
            return (RevisionLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.RevisionLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
