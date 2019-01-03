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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobotApplicationVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRobotApplicationVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot application.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the robot application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the robot application.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The sources of the robot application.
     * </p>
     */
    private java.util.List<Source> sources;
    /**
     * <p>
     * The robot software suite used by the robot application.
     * </p>
     */
    private RobotSoftwareSuite robotSoftwareSuite;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the robot application was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The revision id of the robot application.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot application.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the robot application.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the robot application.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot application.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRobotApplicationVersionResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the robot application.
     * </p>
     * 
     * @param name
     *        The name of the robot application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the robot application.
     * </p>
     * 
     * @return The name of the robot application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the robot application.
     * </p>
     * 
     * @param name
     *        The name of the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRobotApplicationVersionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the robot application.
     * </p>
     * 
     * @param version
     *        The version of the robot application.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the robot application.
     * </p>
     * 
     * @return The version of the robot application.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the robot application.
     * </p>
     * 
     * @param version
     *        The version of the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRobotApplicationVersionResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The sources of the robot application.
     * </p>
     * 
     * @return The sources of the robot application.
     */

    public java.util.List<Source> getSources() {
        return sources;
    }

    /**
     * <p>
     * The sources of the robot application.
     * </p>
     * 
     * @param sources
     *        The sources of the robot application.
     */

    public void setSources(java.util.Collection<Source> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<Source>(sources);
    }

    /**
     * <p>
     * The sources of the robot application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The sources of the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRobotApplicationVersionResult withSources(Source... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<Source>(sources.length));
        }
        for (Source ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sources of the robot application.
     * </p>
     * 
     * @param sources
     *        The sources of the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRobotApplicationVersionResult withSources(java.util.Collection<Source> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * The robot software suite used by the robot application.
     * </p>
     * 
     * @param robotSoftwareSuite
     *        The robot software suite used by the robot application.
     */

    public void setRobotSoftwareSuite(RobotSoftwareSuite robotSoftwareSuite) {
        this.robotSoftwareSuite = robotSoftwareSuite;
    }

    /**
     * <p>
     * The robot software suite used by the robot application.
     * </p>
     * 
     * @return The robot software suite used by the robot application.
     */

    public RobotSoftwareSuite getRobotSoftwareSuite() {
        return this.robotSoftwareSuite;
    }

    /**
     * <p>
     * The robot software suite used by the robot application.
     * </p>
     * 
     * @param robotSoftwareSuite
     *        The robot software suite used by the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRobotApplicationVersionResult withRobotSoftwareSuite(RobotSoftwareSuite robotSoftwareSuite) {
        setRobotSoftwareSuite(robotSoftwareSuite);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the robot application was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the robot application was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the robot application was last updated.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the robot application was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the robot application was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the robot application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRobotApplicationVersionResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The revision id of the robot application.
     * </p>
     * 
     * @param revisionId
     *        The revision id of the robot application.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The revision id of the robot application.
     * </p>
     * 
     * @return The revision id of the robot application.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The revision id of the robot application.
     * </p>
     * 
     * @param revisionId
     *        The revision id of the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRobotApplicationVersionResult withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getRobotSoftwareSuite() != null)
            sb.append("RobotSoftwareSuite: ").append(getRobotSoftwareSuite()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRobotApplicationVersionResult == false)
            return false;
        CreateRobotApplicationVersionResult other = (CreateRobotApplicationVersionResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getRobotSoftwareSuite() == null ^ this.getRobotSoftwareSuite() == null)
            return false;
        if (other.getRobotSoftwareSuite() != null && other.getRobotSoftwareSuite().equals(this.getRobotSoftwareSuite()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getRobotSoftwareSuite() == null) ? 0 : getRobotSoftwareSuite().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateRobotApplicationVersionResult clone() {
        try {
            return (CreateRobotApplicationVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
