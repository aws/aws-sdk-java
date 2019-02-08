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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRobotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the robot.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The target architecture of the robot.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The Greengrass group id.
     * </p>
     */
    private String greengrassGroupId;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the robot.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name for the robot.
     * </p>
     * 
     * @param name
     *        The name for the robot.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the robot.
     * </p>
     * 
     * @return The name for the robot.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the robot.
     * </p>
     * 
     * @param name
     *        The name for the robot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRobotRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The target architecture of the robot.
     * </p>
     * 
     * @param architecture
     *        The target architecture of the robot.
     * @see Architecture
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The target architecture of the robot.
     * </p>
     * 
     * @return The target architecture of the robot.
     * @see Architecture
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The target architecture of the robot.
     * </p>
     * 
     * @param architecture
     *        The target architecture of the robot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public CreateRobotRequest withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The target architecture of the robot.
     * </p>
     * 
     * @param architecture
     *        The target architecture of the robot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public CreateRobotRequest withArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * <p>
     * The Greengrass group id.
     * </p>
     * 
     * @param greengrassGroupId
     *        The Greengrass group id.
     */

    public void setGreengrassGroupId(String greengrassGroupId) {
        this.greengrassGroupId = greengrassGroupId;
    }

    /**
     * <p>
     * The Greengrass group id.
     * </p>
     * 
     * @return The Greengrass group id.
     */

    public String getGreengrassGroupId() {
        return this.greengrassGroupId;
    }

    /**
     * <p>
     * The Greengrass group id.
     * </p>
     * 
     * @param greengrassGroupId
     *        The Greengrass group id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRobotRequest withGreengrassGroupId(String greengrassGroupId) {
        setGreengrassGroupId(greengrassGroupId);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the robot.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to the robot.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the robot.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the robot.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the robot.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the robot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRobotRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateRobotRequest addTagsEntry(String key, String value) {
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

    public CreateRobotRequest clearTagsEntries() {
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
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getGreengrassGroupId() != null)
            sb.append("GreengrassGroupId: ").append(getGreengrassGroupId()).append(",");
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

        if (obj instanceof CreateRobotRequest == false)
            return false;
        CreateRobotRequest other = (CreateRobotRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getGreengrassGroupId() == null ^ this.getGreengrassGroupId() == null)
            return false;
        if (other.getGreengrassGroupId() != null && other.getGreengrassGroupId().equals(this.getGreengrassGroupId()) == false)
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
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getGreengrassGroupId() == null) ? 0 : getGreengrassGroupId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRobotRequest clone() {
        return (CreateRobotRequest) super.clone();
    }

}
