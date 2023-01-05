/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/UpdateRunGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRunGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The group's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The maximum number of CPUs to use.
     * </p>
     */
    private Integer maxCpus;
    /**
     * <p>
     * The maximum amount of time to run.
     * </p>
     */
    private Integer maxDuration;
    /**
     * <p>
     * The maximum number of concurrent runs for the group.
     * </p>
     */
    private Integer maxRuns;
    /**
     * <p>
     * A name for the group.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The group's ID.
     * </p>
     * 
     * @param id
     *        The group's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The group's ID.
     * </p>
     * 
     * @return The group's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The group's ID.
     * </p>
     * 
     * @param id
     *        The group's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRunGroupRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The maximum number of CPUs to use.
     * </p>
     * 
     * @param maxCpus
     *        The maximum number of CPUs to use.
     */

    public void setMaxCpus(Integer maxCpus) {
        this.maxCpus = maxCpus;
    }

    /**
     * <p>
     * The maximum number of CPUs to use.
     * </p>
     * 
     * @return The maximum number of CPUs to use.
     */

    public Integer getMaxCpus() {
        return this.maxCpus;
    }

    /**
     * <p>
     * The maximum number of CPUs to use.
     * </p>
     * 
     * @param maxCpus
     *        The maximum number of CPUs to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRunGroupRequest withMaxCpus(Integer maxCpus) {
        setMaxCpus(maxCpus);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time to run.
     * </p>
     * 
     * @param maxDuration
     *        The maximum amount of time to run.
     */

    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * <p>
     * The maximum amount of time to run.
     * </p>
     * 
     * @return The maximum amount of time to run.
     */

    public Integer getMaxDuration() {
        return this.maxDuration;
    }

    /**
     * <p>
     * The maximum amount of time to run.
     * </p>
     * 
     * @param maxDuration
     *        The maximum amount of time to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRunGroupRequest withMaxDuration(Integer maxDuration) {
        setMaxDuration(maxDuration);
        return this;
    }

    /**
     * <p>
     * The maximum number of concurrent runs for the group.
     * </p>
     * 
     * @param maxRuns
     *        The maximum number of concurrent runs for the group.
     */

    public void setMaxRuns(Integer maxRuns) {
        this.maxRuns = maxRuns;
    }

    /**
     * <p>
     * The maximum number of concurrent runs for the group.
     * </p>
     * 
     * @return The maximum number of concurrent runs for the group.
     */

    public Integer getMaxRuns() {
        return this.maxRuns;
    }

    /**
     * <p>
     * The maximum number of concurrent runs for the group.
     * </p>
     * 
     * @param maxRuns
     *        The maximum number of concurrent runs for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRunGroupRequest withMaxRuns(Integer maxRuns) {
        setMaxRuns(maxRuns);
        return this;
    }

    /**
     * <p>
     * A name for the group.
     * </p>
     * 
     * @param name
     *        A name for the group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the group.
     * </p>
     * 
     * @return A name for the group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the group.
     * </p>
     * 
     * @param name
     *        A name for the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRunGroupRequest withName(String name) {
        setName(name);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMaxCpus() != null)
            sb.append("MaxCpus: ").append(getMaxCpus()).append(",");
        if (getMaxDuration() != null)
            sb.append("MaxDuration: ").append(getMaxDuration()).append(",");
        if (getMaxRuns() != null)
            sb.append("MaxRuns: ").append(getMaxRuns()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRunGroupRequest == false)
            return false;
        UpdateRunGroupRequest other = (UpdateRunGroupRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMaxCpus() == null ^ this.getMaxCpus() == null)
            return false;
        if (other.getMaxCpus() != null && other.getMaxCpus().equals(this.getMaxCpus()) == false)
            return false;
        if (other.getMaxDuration() == null ^ this.getMaxDuration() == null)
            return false;
        if (other.getMaxDuration() != null && other.getMaxDuration().equals(this.getMaxDuration()) == false)
            return false;
        if (other.getMaxRuns() == null ^ this.getMaxRuns() == null)
            return false;
        if (other.getMaxRuns() != null && other.getMaxRuns().equals(this.getMaxRuns()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMaxCpus() == null) ? 0 : getMaxCpus().hashCode());
        hashCode = prime * hashCode + ((getMaxDuration() == null) ? 0 : getMaxDuration().hashCode());
        hashCode = prime * hashCode + ((getMaxRuns() == null) ? 0 : getMaxRuns().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRunGroupRequest clone() {
        return (UpdateRunGroupRequest) super.clone();
    }

}
