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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the Git submodules configuration for an AWS CodeBuild build project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/GitSubmodulesConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GitSubmodulesConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Set to true to fetch Git submodules for your AWS CodeBuild build project.
     * </p>
     */
    private Boolean fetchSubmodules;

    /**
     * <p>
     * Set to true to fetch Git submodules for your AWS CodeBuild build project.
     * </p>
     * 
     * @param fetchSubmodules
     *        Set to true to fetch Git submodules for your AWS CodeBuild build project.
     */

    public void setFetchSubmodules(Boolean fetchSubmodules) {
        this.fetchSubmodules = fetchSubmodules;
    }

    /**
     * <p>
     * Set to true to fetch Git submodules for your AWS CodeBuild build project.
     * </p>
     * 
     * @return Set to true to fetch Git submodules for your AWS CodeBuild build project.
     */

    public Boolean getFetchSubmodules() {
        return this.fetchSubmodules;
    }

    /**
     * <p>
     * Set to true to fetch Git submodules for your AWS CodeBuild build project.
     * </p>
     * 
     * @param fetchSubmodules
     *        Set to true to fetch Git submodules for your AWS CodeBuild build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitSubmodulesConfig withFetchSubmodules(Boolean fetchSubmodules) {
        setFetchSubmodules(fetchSubmodules);
        return this;
    }

    /**
     * <p>
     * Set to true to fetch Git submodules for your AWS CodeBuild build project.
     * </p>
     * 
     * @return Set to true to fetch Git submodules for your AWS CodeBuild build project.
     */

    public Boolean isFetchSubmodules() {
        return this.fetchSubmodules;
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
        if (getFetchSubmodules() != null)
            sb.append("FetchSubmodules: ").append(getFetchSubmodules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GitSubmodulesConfig == false)
            return false;
        GitSubmodulesConfig other = (GitSubmodulesConfig) obj;
        if (other.getFetchSubmodules() == null ^ this.getFetchSubmodules() == null)
            return false;
        if (other.getFetchSubmodules() != null && other.getFetchSubmodules().equals(this.getFetchSubmodules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFetchSubmodules() == null) ? 0 : getFetchSubmodules().hashCode());
        return hashCode;
    }

    @Override
    public GitSubmodulesConfig clone() {
        try {
            return (GitSubmodulesConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.GitSubmodulesConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
