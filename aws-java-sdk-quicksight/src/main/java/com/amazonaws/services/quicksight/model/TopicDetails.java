/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes the details of a topic, such as its name, description, and associated data sets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopicDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the topic.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the topic.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The user experience version of a topic.
     * </p>
     */
    private String userExperienceVersion;
    /**
     * <p>
     * The data sets that the topic is associated with.
     * </p>
     */
    private java.util.List<DatasetMetadata> dataSets;

    /**
     * <p>
     * The name of the topic.
     * </p>
     * 
     * @param name
     *        The name of the topic.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the topic.
     * </p>
     * 
     * @return The name of the topic.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the topic.
     * </p>
     * 
     * @param name
     *        The name of the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the topic.
     * </p>
     * 
     * @param description
     *        The description of the topic.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the topic.
     * </p>
     * 
     * @return The description of the topic.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the topic.
     * </p>
     * 
     * @param description
     *        The description of the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The user experience version of a topic.
     * </p>
     * 
     * @param userExperienceVersion
     *        The user experience version of a topic.
     * @see TopicUserExperienceVersion
     */

    public void setUserExperienceVersion(String userExperienceVersion) {
        this.userExperienceVersion = userExperienceVersion;
    }

    /**
     * <p>
     * The user experience version of a topic.
     * </p>
     * 
     * @return The user experience version of a topic.
     * @see TopicUserExperienceVersion
     */

    public String getUserExperienceVersion() {
        return this.userExperienceVersion;
    }

    /**
     * <p>
     * The user experience version of a topic.
     * </p>
     * 
     * @param userExperienceVersion
     *        The user experience version of a topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicUserExperienceVersion
     */

    public TopicDetails withUserExperienceVersion(String userExperienceVersion) {
        setUserExperienceVersion(userExperienceVersion);
        return this;
    }

    /**
     * <p>
     * The user experience version of a topic.
     * </p>
     * 
     * @param userExperienceVersion
     *        The user experience version of a topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicUserExperienceVersion
     */

    public TopicDetails withUserExperienceVersion(TopicUserExperienceVersion userExperienceVersion) {
        this.userExperienceVersion = userExperienceVersion.toString();
        return this;
    }

    /**
     * <p>
     * The data sets that the topic is associated with.
     * </p>
     * 
     * @return The data sets that the topic is associated with.
     */

    public java.util.List<DatasetMetadata> getDataSets() {
        return dataSets;
    }

    /**
     * <p>
     * The data sets that the topic is associated with.
     * </p>
     * 
     * @param dataSets
     *        The data sets that the topic is associated with.
     */

    public void setDataSets(java.util.Collection<DatasetMetadata> dataSets) {
        if (dataSets == null) {
            this.dataSets = null;
            return;
        }

        this.dataSets = new java.util.ArrayList<DatasetMetadata>(dataSets);
    }

    /**
     * <p>
     * The data sets that the topic is associated with.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSets(java.util.Collection)} or {@link #withDataSets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param dataSets
     *        The data sets that the topic is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicDetails withDataSets(DatasetMetadata... dataSets) {
        if (this.dataSets == null) {
            setDataSets(new java.util.ArrayList<DatasetMetadata>(dataSets.length));
        }
        for (DatasetMetadata ele : dataSets) {
            this.dataSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data sets that the topic is associated with.
     * </p>
     * 
     * @param dataSets
     *        The data sets that the topic is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicDetails withDataSets(java.util.Collection<DatasetMetadata> dataSets) {
        setDataSets(dataSets);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getUserExperienceVersion() != null)
            sb.append("UserExperienceVersion: ").append(getUserExperienceVersion()).append(",");
        if (getDataSets() != null)
            sb.append("DataSets: ").append(getDataSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicDetails == false)
            return false;
        TopicDetails other = (TopicDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUserExperienceVersion() == null ^ this.getUserExperienceVersion() == null)
            return false;
        if (other.getUserExperienceVersion() != null && other.getUserExperienceVersion().equals(this.getUserExperienceVersion()) == false)
            return false;
        if (other.getDataSets() == null ^ this.getDataSets() == null)
            return false;
        if (other.getDataSets() != null && other.getDataSets().equals(this.getDataSets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUserExperienceVersion() == null) ? 0 : getUserExperienceVersion().hashCode());
        hashCode = prime * hashCode + ((getDataSets() == null) ? 0 : getDataSets().hashCode());
        return hashCode;
    }

    @Override
    public TopicDetails clone() {
        try {
            return (TopicDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopicDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
