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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobotApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRobotApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the robot application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The sources of the robot application.
     * </p>
     */
    private java.util.List<SourceConfig> sources;
    /**
     * <p>
     * The robot software suite used by the robot application.
     * </p>
     */
    private RobotSoftwareSuite robotSoftwareSuite;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the robot application.
     * </p>
     */
    private java.util.Map<String, String> tags;

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

    public CreateRobotApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The sources of the robot application.
     * </p>
     * 
     * @return The sources of the robot application.
     */

    public java.util.List<SourceConfig> getSources() {
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

    public void setSources(java.util.Collection<SourceConfig> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<SourceConfig>(sources);
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

    public CreateRobotApplicationRequest withSources(SourceConfig... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<SourceConfig>(sources.length));
        }
        for (SourceConfig ele : sources) {
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

    public CreateRobotApplicationRequest withSources(java.util.Collection<SourceConfig> sources) {
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

    public CreateRobotApplicationRequest withRobotSoftwareSuite(RobotSoftwareSuite robotSoftwareSuite) {
        setRobotSoftwareSuite(robotSoftwareSuite);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the robot application.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to the robot application.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the robot application.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the robot application.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the robot application.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the robot application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRobotApplicationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateRobotApplicationRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRobotApplicationRequest clearTagsEntries() {
        this.tags = null;
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
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getRobotSoftwareSuite() != null)
            sb.append("RobotSoftwareSuite: ").append(getRobotSoftwareSuite()).append(",");
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

        if (obj instanceof CreateRobotApplicationRequest == false)
            return false;
        CreateRobotApplicationRequest other = (CreateRobotApplicationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getRobotSoftwareSuite() == null ^ this.getRobotSoftwareSuite() == null)
            return false;
        if (other.getRobotSoftwareSuite() != null && other.getRobotSoftwareSuite().equals(this.getRobotSoftwareSuite()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getRobotSoftwareSuite() == null) ? 0 : getRobotSoftwareSuite().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRobotApplicationRequest clone() {
        return (CreateRobotApplicationRequest) super.clone();
    }

}
