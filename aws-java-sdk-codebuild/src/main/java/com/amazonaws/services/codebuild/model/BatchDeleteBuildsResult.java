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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchDeleteBuilds" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteBuildsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the builds that were successfully deleted.
     * </p>
     */
    private java.util.List<String> buildsDeleted;
    /**
     * <p>
     * Information about any builds that could not be successfully deleted.
     * </p>
     */
    private java.util.List<BuildNotDeleted> buildsNotDeleted;

    /**
     * <p>
     * The IDs of the builds that were successfully deleted.
     * </p>
     * 
     * @return The IDs of the builds that were successfully deleted.
     */

    public java.util.List<String> getBuildsDeleted() {
        return buildsDeleted;
    }

    /**
     * <p>
     * The IDs of the builds that were successfully deleted.
     * </p>
     * 
     * @param buildsDeleted
     *        The IDs of the builds that were successfully deleted.
     */

    public void setBuildsDeleted(java.util.Collection<String> buildsDeleted) {
        if (buildsDeleted == null) {
            this.buildsDeleted = null;
            return;
        }

        this.buildsDeleted = new java.util.ArrayList<String>(buildsDeleted);
    }

    /**
     * <p>
     * The IDs of the builds that were successfully deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBuildsDeleted(java.util.Collection)} or {@link #withBuildsDeleted(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param buildsDeleted
     *        The IDs of the builds that were successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteBuildsResult withBuildsDeleted(String... buildsDeleted) {
        if (this.buildsDeleted == null) {
            setBuildsDeleted(new java.util.ArrayList<String>(buildsDeleted.length));
        }
        for (String ele : buildsDeleted) {
            this.buildsDeleted.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the builds that were successfully deleted.
     * </p>
     * 
     * @param buildsDeleted
     *        The IDs of the builds that were successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteBuildsResult withBuildsDeleted(java.util.Collection<String> buildsDeleted) {
        setBuildsDeleted(buildsDeleted);
        return this;
    }

    /**
     * <p>
     * Information about any builds that could not be successfully deleted.
     * </p>
     * 
     * @return Information about any builds that could not be successfully deleted.
     */

    public java.util.List<BuildNotDeleted> getBuildsNotDeleted() {
        return buildsNotDeleted;
    }

    /**
     * <p>
     * Information about any builds that could not be successfully deleted.
     * </p>
     * 
     * @param buildsNotDeleted
     *        Information about any builds that could not be successfully deleted.
     */

    public void setBuildsNotDeleted(java.util.Collection<BuildNotDeleted> buildsNotDeleted) {
        if (buildsNotDeleted == null) {
            this.buildsNotDeleted = null;
            return;
        }

        this.buildsNotDeleted = new java.util.ArrayList<BuildNotDeleted>(buildsNotDeleted);
    }

    /**
     * <p>
     * Information about any builds that could not be successfully deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBuildsNotDeleted(java.util.Collection)} or {@link #withBuildsNotDeleted(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param buildsNotDeleted
     *        Information about any builds that could not be successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteBuildsResult withBuildsNotDeleted(BuildNotDeleted... buildsNotDeleted) {
        if (this.buildsNotDeleted == null) {
            setBuildsNotDeleted(new java.util.ArrayList<BuildNotDeleted>(buildsNotDeleted.length));
        }
        for (BuildNotDeleted ele : buildsNotDeleted) {
            this.buildsNotDeleted.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about any builds that could not be successfully deleted.
     * </p>
     * 
     * @param buildsNotDeleted
     *        Information about any builds that could not be successfully deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteBuildsResult withBuildsNotDeleted(java.util.Collection<BuildNotDeleted> buildsNotDeleted) {
        setBuildsNotDeleted(buildsNotDeleted);
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
        if (getBuildsDeleted() != null)
            sb.append("BuildsDeleted: ").append(getBuildsDeleted()).append(",");
        if (getBuildsNotDeleted() != null)
            sb.append("BuildsNotDeleted: ").append(getBuildsNotDeleted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteBuildsResult == false)
            return false;
        BatchDeleteBuildsResult other = (BatchDeleteBuildsResult) obj;
        if (other.getBuildsDeleted() == null ^ this.getBuildsDeleted() == null)
            return false;
        if (other.getBuildsDeleted() != null && other.getBuildsDeleted().equals(this.getBuildsDeleted()) == false)
            return false;
        if (other.getBuildsNotDeleted() == null ^ this.getBuildsNotDeleted() == null)
            return false;
        if (other.getBuildsNotDeleted() != null && other.getBuildsNotDeleted().equals(this.getBuildsNotDeleted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuildsDeleted() == null) ? 0 : getBuildsDeleted().hashCode());
        hashCode = prime * hashCode + ((getBuildsNotDeleted() == null) ? 0 : getBuildsNotDeleted().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteBuildsResult clone() {
        try {
            return (BatchDeleteBuildsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
